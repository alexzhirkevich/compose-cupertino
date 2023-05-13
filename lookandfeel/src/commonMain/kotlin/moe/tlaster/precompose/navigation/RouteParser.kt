package moe.tlaster.precompose.navigation

import moe.tlaster.precompose.navigation.route.Route
import kotlin.math.min

internal class RouteParser {
    data class Segment(
        val nodeType: Int = 0,
        val rexPat: String = "",
        val tail: Char = 0.toChar(),
        val startIndex: Int = 0,
        val endIndex: Int = 0,
    )

    private data class Node(
        var type: Int = 0,
        var prefix: String = "",
        var label: Char = 0.toChar(),
        var tail: Char = 0.toChar(),
        var rex: Regex? = null,
        var paramsKey: String? = null,
        var route: Route? = null,
    ) : Comparable<Node> {

        // subroutes on the leaf node
        // Routes subroutes;
        // child nodes should be stored in-order for iteration,
        // in groups of the node type.
        var children = linkedMapOf<Int, Array<Node>>()
        override operator fun compareTo(other: Node): Int {
            return label - other.label
        }

        fun insertRoute(pattern: String, route: Route): Node {
            var n = this
            var parent: Node
            var search = pattern
            while (true) {
                // Handle key exhaustion
                if (search.isEmpty()) {
                    // Insert or update the node's leaf handler
                    n.applyRoute(route)
                    return n
                }

                // We're going to be searching for a wild node next,
                // in this case, we need to get the tail
                val label = search[0]
                //        char segTail;
                //        int segEndIdx;
                //        int segTyp;
                val seg = if (label == '{' || label == '*') {
                    //          segTyp, _, segRexpat, segTail, _, segEndIdx = patNextSegment(search)
                    patNextSegment(search)
                } else {
                    Segment()
                }
                val prefix = if (seg.nodeType == ntRegexp) {
                    seg.rexPat
                } else {
                    ""
                }

                // Look for the edge to attach to
                parent = n
                n = n.getEdge(seg.nodeType, label, seg.tail, prefix) ?: run {
                    val child = Node(label = label, tail = seg.tail, prefix = search)
                    val hn = parent.addChild(child, search)
                    hn.applyRoute(route)
                    return hn
                }

                // Found an edge to newRuntimeRoute the pattern
                if (n.type > ntStatic) {
                    // We found a param node, trim the param from the search path and continue.
                    // This param/wild pattern segment would already be on the tree from a previous
                    // call to addChild when creating a new node.
                    search = search.substring(seg.endIndex)
                    continue
                }

                // Static nodes fall below here.
                // Determine longest prefix of the search key on newRuntimeRoute.
                val commonPrefix = longestPrefix(search, n.prefix)
                if (commonPrefix == n.prefix.length) {
                    // the common prefix is as long as the current node's prefix we're attempting to insert.
                    // keep the search going.
                    search = search.substring(commonPrefix)
                    continue
                }

                // Split the node
                val child = Node(type = ntStatic, prefix = search.substring(0, commonPrefix))
                parent.replaceChild(search[0], seg.tail, child)

                // Restore the existing node
                n.label = n.prefix[commonPrefix]
                n.prefix = n.prefix.substring(commonPrefix)
                child.addChild(n, n.prefix)

                // If the new key is a subset, set the route on this node and finish.
                search = search.substring(commonPrefix)
                if (search.isEmpty()) {
                    child.applyRoute(route)
                    return child
                }

                // Create a new edge for the node
                val subchild = Node(type = ntStatic, label = search[0], prefix = search)
                val hn = child.addChild(subchild, search)
                hn.applyRoute(route)
                return hn
            }
        }

        // addChild appends the new `child` node to the tree using the `pattern` as the trie key.
        // For a URL router like chi's, we split the static, param, regexp and wildcard segments
        // into different nodes. In addition, addChild will recursively call itself until every
        // pattern segment is added to the url pattern tree as individual nodes, depending on type.
        fun addChild(child: Node, search: String): Node {
            var searchStr = search
            val n = this
            //      String search = prefix.toString();

            // handler leaf node added to the tree is the child.
            // this may be overridden later down the flow
            var hn = child

            // Parse next segment
            //      segTyp, _, segRexpat, segTail, segStartIdx, segEndIdx := patNextSegment(search)
            val seg = patNextSegment(searchStr)
            val segTyp = seg.nodeType
            var segStartIdx = seg.startIndex
            val segEndIdx = seg.endIndex
            when (segTyp) {
                ntStatic -> {
                }
                else -> {
                    // Search prefix contains a param, regexp or wildcard
                    if (segTyp == ntRegexp) {
                        child.prefix = seg.rexPat
                        child.rex = seg.rexPat.toRegex()
                    }
                    if (segStartIdx == 0) {
                        // Route starts with a param
                        child.type = segTyp
                        segStartIdx = if (segTyp == ntCatchAll) {
                            -1
                        } else {
                            segEndIdx
                        }
                        if (segStartIdx < 0) {
                            segStartIdx = searchStr.length
                        }
                        child.tail = seg.tail // for params, we set the tail
                        child.paramsKey = findParamKey(searchStr) // set paramsKey if it has keys
                        if (segStartIdx != searchStr.length) {
                            // add static edge for the remaining part, split the end.
                            // its not possible to have adjacent param nodes, so its certainly
                            // going to be a static node next.
                            searchStr = searchStr.substring(segStartIdx) // advance search position
                            val nn = Node(type = ntStatic, label = searchStr[0], prefix = searchStr)
                            hn = child.addChild(nn, searchStr)
                        }
                    } else if (segStartIdx > 0) {
                        // Route has some param

                        // starts with a static segment
                        child.type = ntStatic
                        child.prefix = searchStr.substring(0, segStartIdx)
                        child.rex = null

                        // add the param edge node
                        searchStr = searchStr.substring(segStartIdx)
                        val nn = Node(type = segTyp, label = searchStr[0], tail = seg.tail, paramsKey = findParamKey(searchStr))
                        hn = child.addChild(nn, searchStr)
                    }
                }
            }
            n.children[child.type] = append(n.children[child.type], child).also {
                tailSort(it)
            }
            return hn
        }

        private fun findParamKey(pattern: String): String? {
            val startChar = "{"
            val endChar = "}"
            val regexStart = ":"
            if (!pattern.startsWith("{") && !pattern.endsWith("}")) return null
            val startIndex = pattern.indexOf(startChar)
            val endIndex = pattern.indexOf(endChar)
            val regexIndex = pattern.indexOf(regexStart).let {
                if (it == -1) pattern.length else it
            }
            return pattern.substring(min(startIndex + 1, pattern.length - 1), min(endIndex, regexIndex))
        }

        fun replaceChild(label: Char, tail: Char, child: Node) {
            val n = this
            val children = n.children[child.type] ?: return
            var i = 0
            while (i < children.size) {
                if (children[i].label == label && children[i].tail == tail) {
                    children[i] = child
                    children[i].label = label
                    children[i].tail = tail
                    return
                }
                i++
            }
            throw IllegalArgumentException("chi: replacing missing child")
        }

        fun getEdge(ntyp: Int, label: Char, tail: Char, prefix: String): Node? {
            val n = this
            val nds = n.children[ntyp] ?: return null
            var i = 0
            while (i < nds.size) {
                if (nds[i].label == label && nds[i].tail == tail) {
                    if (ntyp == ntRegexp && nds[i].prefix != prefix) {
                        i++
                        continue
                    }
                    return nds[i]
                }
                i++
            }
            return null
        }

        fun applyRoute(route: Route?) {
            val n = this
            n.route = route
        }

        // Recursive edge traversal by checking all nodeTyp groups along the way.
        // It's like searching through a multi-dimensional radix trie.
        fun findRoute(rctx: RouteMatch, path: String): Route? {
            for (ntyp in 0 until NODE_SIZE) {
                val nds = children[ntyp]
                if (nds == null) {
                    continue
                }
                var xn: Node? = null
                var xsearch = path
                val label = if (path.isNotEmpty()) path[0] else ZERO_CHAR
                when (ntyp) {
                    ntStatic -> {
                        xn = findEdge(nds, label)
                        if (xn == null || !xsearch.startsWith(xn.prefix)) {
                            continue
                        }
                        xsearch = xsearch.substring(xn.prefix.length)
                    }
                    ntParam, ntRegexp -> {
                        // short-circuit and return no matching route for empty param values
                        if (xsearch.isEmpty()) {
                            continue
                        }
                        // serially loop through each node grouped by the tail delimiter
                        var idx = 0
                        while (idx < nds.size) {
                            xn = nds[idx]
                            if (xn.type != ntStatic) {
                                xn.paramsKey?.let {
                                    rctx.keys.add(it)
                                }
                            }
                            // label for param nodes is the delimiter byte
                            var p = xsearch.indexOf(xn.tail)
                            if (p < 0) {
                                p = if (xn.tail == '/') {
                                    xsearch.length
                                } else {
                                    idx++
                                    continue
                                }
                            }
                            val rex = xn.rex
                            if (ntyp == ntRegexp && rex != null) {
                                if (!rex.matches(xsearch.substring(0, p))) {
                                    idx++
                                    continue
                                }
                            } else if (xsearch.substring(0, p).indexOf('/') != -1) {
                                // avoid a newRuntimeRoute across path segments
                                idx++
                                continue
                            }

                            // rctx.routeParams.Values = append(rctx.routeParams.Values, xsearch[:p])
                            val prevlen: Int = rctx.vars.size
                            rctx.value(xsearch.substring(0, p))
                            xsearch = xsearch.substring(p)
                            if (xsearch.isEmpty()) {
                                if (xn.isLeaf) {
                                    val h = xn.route
                                    if (h != null) {
                                        rctx.key()
                                        return h
                                    }
                                }
                            }

                            // recursively find the next node on this branch
                            val fin = xn.findRoute(rctx, xsearch)
                            if (fin != null) {
                                return fin
                            }

                            // not found on this branch, reset vars
                            rctx.truncate(prevlen)
                            xsearch = path
                            idx++
                        }
                    }
                    else -> {
                        // catch-all nodes
                        // rctx.routeParams.Values = append(rctx.routeParams.Values, search)
                        if (xsearch.isNotEmpty()) {
                            rctx.value(xsearch)
                        }
                        xn = nds[0]
                        xsearch = ""
                    }
                }
                if (xn == null) {
                    continue
                }

                // did we returnType it yet?
                if (xsearch.isEmpty()) {
                    if (xn.isLeaf) {
                        val h = xn.route
                        if (h != null) {
                            // rctx.routeParams.Keys = append(rctx.routeParams.Keys, h.paramKeys...)
                            rctx.key()
                            return h
                        }
                    }
                }

                // recursively returnType the next node..
                val fin = xn.findRoute(rctx, xsearch)
                if (fin != null) {
                    return fin
                }

                // Did not returnType final handler, let's remove the param here if it was set
                if (xn.type > ntStatic) {
                    //          if len(rctx.routeParams.Values) > 0 {
                    //            rctx.routeParams.Values = rctx.routeParams.Values[:len(rctx.routeParams.Values) - 1]
                    //          }
                    rctx.pop()
                }
            }
            return null
        }

        fun findEdge(ns: Array<Node>, label: Char): Node? {
            val num = ns.size
            var idx = 0
            var i = 0
            var j = num - 1
            while (i <= j) {
                idx = i + (j - i) / 2
                when {
                    label > ns[idx].label -> {
                        i = idx + 1
                    }
                    label < ns[idx].label -> {
                        j = idx - 1
                    }
                    else -> {
                        i = num // breaks cond
                    }
                }
            }
            return if (ns[idx].label != label) {
                null
            } else ns[idx]
        }

        val isLeaf: Boolean
            get() = route != null

        // longestPrefix finds the filesize of the shared prefix of two strings
        fun longestPrefix(k1: String, k2: String): Int {
            val len: Int = min(k1.length, k2.length)
            for (i in 0 until len) {
                if (k1[i] != k2[i]) {
                    return i
                }
            }
            return len
        }

        fun tailSort(ns: Array<Node>) {
            if (ns.size > 1) {
                ns.sort()
                for (i in ns.indices.reversed()) {
                    if (ns[i].type > ntStatic && ns[i].tail == '/') {
                        val tmp = ns[i]
                        ns[i] = ns[ns.size - 1]
                        ns[ns.size - 1] = tmp
                        return
                    }
                }
            }
        }

        private fun append(src: Array<Node>?, child: Node): Array<Node> {
            if (src == null) {
                return arrayOf(child)
            }
            val result = src.copyOf()
            return result + child
        }

        // patNextSegment returns the next segment details from a pattern:
        // node type, param key, regexp string, param tail byte, param starting index, param ending index
        fun patNextSegment(pattern: String): Segment {
            val ps = pattern.indexOf('{')
            val ws = pattern.indexOf('*')
            if (ps < 0 && ws < 0) {
                return Segment(
                    ntStatic, "", ZERO_CHAR, 0,
                    pattern.length
                ) // we return the entire thing
            }

            // Sanity check
            require(!(ps >= 0 && ws >= 0 && ws < ps)) { "chi: wildcard '*' must be the last pattern in a route, otherwise use a '{param}'" }
            var tail = '/' // Default endpoint tail to / byte
            if (ps >= 0) {
                // Param/Regexp pattern is next
                var nt = ntParam

                // Read to closing } taking into account opens and closes in curl count (cc)
                var cc = 0
                var pe = ps
                val range = pattern.substring(ps)
                for (i in range.indices) {
                    val c = range[i]
                    if (c == '{') {
                        cc++
                    } else if (c == '}') {
                        cc--
                        if (cc == 0) {
                            pe = ps + i
                            break
                        }
                    }
                }
                require(pe != ps) { "Router: route param closing delimiter '}' is missing" }
                val key = pattern.substring(ps + 1, pe)
                pe++ // set end to next position
                if (pe < pattern.length) {
                    tail = pattern[pe]
                }
                var rexpat = ""
                val idx = key.indexOf(':')
                if (idx >= 0) {
                    nt = ntRegexp
                    rexpat = key.substring(idx + 1)
                    //          key = key.substring(0, idx);
                }
                if (rexpat.isNotEmpty()) {
                    if (rexpat[0] != '^') {
                        rexpat = "^$rexpat"
                    }
                    if (rexpat[rexpat.length - 1] != '$') {
                        rexpat = "$rexpat$"
                    }
                }
                return Segment(nt, rexpat, tail, ps, pe)
            }

            // Wildcard pattern as finale
            // EDIT: should we panic if there is stuff after the * ???
            // We allow naming a wildcard: *path
            // String key = ws == pattern.length() - 1 ? "*" : pattern.substring(ws + 1).toString();
            return Segment(ntCatchAll, "", ZERO_CHAR, ws, pattern.length)
        }
    }

    private val root = Node()

    private val staticPaths = linkedMapOf<String, Route>()
    fun insert(pattern: String, route: Route) {
        var patternStr = pattern
        val baseCatchAll = baseCatchAll(patternStr)
        if (baseCatchAll.length > 1) {
            // Add route pattern: /static/?* => /static
            insert(baseCatchAll, route)
            val tail = patternStr.substring(baseCatchAll.length + 2)
            patternStr = "$baseCatchAll/$tail"
        }
        if (patternStr == BASE_CATCH_ALL) {
            patternStr = "/*"
        }
        if (pathKeys(patternStr).isEmpty()) {
            staticPaths[patternStr] = route
        }
        root.insertRoute(patternStr, route)
    }

    private fun baseCatchAll(pattern: String): String {
        val i = pattern.indexOf(BASE_CATCH_ALL)
        return if (i > 0) {
            pattern.substring(0, i)
        } else ""
    }

    fun insert(route: Route) {
        insert(route.route, route)
    }

    fun find(path: String): RouteMatchResult? {
        val staticRoute = staticPaths[path]
        return if (staticRoute == null) {
            findInternal(path)
        } else {
            return RouteMatchResult(staticRoute)
        }
    }

    private fun findInternal(path: String): RouteMatchResult? {
        // use radix tree
        val result = RouteMatch()
        val route = root.findRoute(result, path) ?: return null
        return RouteMatchResult(route, result.pathMap)
    }

    companion object {
        fun pathKeys(
            pattern: String,
            onItem: (key: String, value: String?) -> Unit = { _, _ -> },
        ): List<String> {
            val result = arrayListOf<String>()
            var start = -1
            var end = Int.MAX_VALUE
            val len = pattern.length
            var curly = 0
            var i = 0
            while (i < len) {
                val ch = pattern[i]
                if (ch == '{') {
                    if (curly == 0) {
                        start = i + 1
                        end = Int.MAX_VALUE
                    }
                    curly += 1
                } else if (ch == ':') {
                    end = i
                } else if (ch == '}') {
                    curly -= 1
                    if (curly == 0) {
                        val id = pattern.substring(start, min(i, end))
                        if (end == Int.MAX_VALUE) {
                            null
                        } else {
                            pattern.substring(end + 1, i)
                        }.let {
                            onItem.invoke(id, it)
                        }
                        result.add(id)
                        start = -1
                        end = Int.MAX_VALUE
                    }
                } else if (ch == '*') {
                    val id: String = if (i == len - 1) {
                        "*"
                    } else {
                        pattern.substring(i + 1)
                    }
                    onItem.invoke(id, "\\.*")
                    result.add(id)
                    i = len
                }
                i++
            }
            return result
        }

        fun expandOptionalVariables(pattern: String): List<String> {
            if (pattern.isEmpty() || pattern == "/") {
                return listOf("/")
            }
            val len = pattern.length
            var key = 0
            val paths = linkedMapOf<Int, StringBuilder>()
            val pathAppender = { index: Int, segment: StringBuilder ->
                for (i in index until index - 1) {
                    paths[i]?.append(segment)
                }
                paths.getOrPut(index) {
                    val value = StringBuilder()
                    if (index > 0) {
                        val previous = paths[index - 1]
                        if (previous.toString() != "/") {
                            value.append(previous)
                        }
                    }
                    value
                }.append(segment)
            }
            val segment = StringBuilder()
            var isLastOptional = false
            var i = 0
            while (i < len) {
                val ch = pattern[i]
                if (ch == '/') {
                    if (segment.isNotEmpty()) {
                        pathAppender.invoke(key, segment)
                        segment.setLength(0)
                    }
                    segment.append(ch)
                    i += 1
                } else if (ch == '{') {
                    segment.append(ch)
                    var curly = 1
                    var j = i + 1
                    while (j < len) {
                        val next = pattern[j++]
                        segment.append(next)
                        if (next == '{') {
                            curly += 1
                        } else if (next == '}') {
                            curly -= 1
                            if (curly == 0) {
                                break
                            }
                        }
                    }
                    if (j < len && pattern[j] == '?') {
                        j += 1
                        isLastOptional = true
                        if (paths.isEmpty()) {
                            paths[0] = StringBuilder("/")
                        }
                        pathAppender.invoke(++key, segment)
                    } else {
                        isLastOptional = false
                        pathAppender.invoke(key, segment)
                    }
                    segment.setLength(0)
                    i = j
                } else {
                    segment.append(ch)
                    i += 1
                }
            }
            if (paths.isEmpty()) {
                return listOf(pattern)
            }
            if (segment.isNotEmpty()) {
                pathAppender.invoke(key, segment)
                if (isLastOptional) {
                    paths[++key] = segment
                }
            }
            return paths.values.map { it.toString() }
        }

        private const val ntStatic = 0 // /home
        private const val ntRegexp = 1 // /{id:[0-9]+}
        private const val ntParam = 2 // /{user}
        private const val ntCatchAll = 3 // /api/v1/*
        private const val NODE_SIZE = ntCatchAll + 1
        private const val ZERO_CHAR = 0.toChar()
        private const val BASE_CATCH_ALL = "/?*"
    }
}
