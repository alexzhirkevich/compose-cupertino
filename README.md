# What is Compose Cupertino

Compose Cupertino is a Kotlin Multiplatform library for the [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform) UI framework.
It provides various UI components for making native-looking iOS applications, including
- `cupertino` - pure Compose implementation of iOS-like Cupertino theme and widgets, based on `compose.foundation`. Inspired by `compose.material3` and SwiftUI APIs;
- `cupertino-native` - UIKit native wrappers for Cupertino Widgets. Allows to seamlessly use some UIKit widgets for iOS and their equivalents from cupertino for other platforms;
- `cupertino-adaptive` - adaptive theme and wrappers for Cupertino and Material3 widgets. Allows to seamlessly use both widgets from shared code with correct content color and font style;
- `cupertino-icons-extended` - more than 800 most used monochrome [Apple SF Symbols](https://developer.apple.com/sf-symbols/) as Compose `ImageVector`s.
These symbols are copyrighted. Please read licence agreement first.
If you don't need these icons for platform other than iOS you can take a look at native converter `CupertinoIcons.named()` in `cupertino-native` iosMain that allows to use iOS bundled icons by theirs system names.
- `cupertino-decompose` - iOS-like swipe-back animation for the 'predictive back' navigation feature of the [Decompose](https://github.com/arkivanov/Decompose) library + `NativeChildren` wrapper over `UINavigationController`.
Provides native-feeling or truly native page transitions and swipe gestures.

# Add as a dependency

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.alexzhirkevich/cupertino/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.alexzhirkevich/cupertino)

| Module                     | Dependency                                                    |
|----------------------------|---------------------------------------------------------------|
| `cupertino`                | `io.github.alexzhirkevich:cupertino:<version>`                |
| `cupertino-native`         | `io.github.alexzhirkevich:cupertino-native:<version>`         |
| `cupertino-adaptive`       | `io.github.alexzhirkevich:cupertino-adaptive:<version>`       |
| `cupertino-decompose`      | `io.github.alexzhirkevich:cupertino-decompose:<version>`      |
| `cupertino-icons-extended` | `io.github.alexzhirkevich:cupertino-icons-extended:<version>` |

# Acknowledgements

- [Chris Banes](https://github.com/chrisbanes) for implementing [Haze]((https://github.com/chrisbanes/haze)
effect that is used for widgets with translucent background

- [Arkadii Ivanov](https://github.com/arkivanov) for implementing awesome customizable 
predictive back gesture that is used for swipe back navigation

- And all opensource [contributors](https://github.com/alexzhirkevich/compose-look-and-feel/graphs/contributors)

# Licence 

```
Copyright (c) 2023 Compose Cupertino project and open source contributors.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
    
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```