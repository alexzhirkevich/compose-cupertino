package moe.tlaster.precompose.navigation

data class QueryString(
    private val rawInput: String,
) {
    val map by lazy {
        rawInput
            .split("?")
            .lastOrNull()
            .let {
                it ?: ""
            }
            .split("&")
            .asSequence()
            .map { it.split("=") }
            .filter { !it.firstOrNull().isNullOrEmpty() }
            .filter { it.size in 1..2 }
            .map { it[0] to it.elementAtOrNull(1) }
            .groupBy { it.first }
            .map { it.key to it.value.mapNotNull { it.second.takeIf { !it.isNullOrEmpty() } } }
            .toList()
            .toMap()
    }
}

inline fun <reified T> QueryString.query(name: String, default: T? = null): T? {
    val value = map[name]?.firstOrNull() ?: return default
    return convertValue(value)
}

inline fun <reified T> QueryString.queryList(name: String): List<T> {
    val value = map[name] ?: return emptyList()
    return value.mapNotNull { convertValue(it) }
}
