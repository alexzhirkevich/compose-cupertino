# What is Compose Cupertino

Compose Cupertino is a Kotlin Multiplatform library for the [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform) UI framework.
It provides various UI components for making native-looking iOS applications, including
- `cupertino` - pure Compose implementation of iOS-like Cupertino theme and widgets, based on `compose.foundation`. Inspired by `compose.material3` and SwiftUI APIs;
- `cupertino-native` - UIKit native wrappers for Cupertino Widgets. Allows to seamlessly use some UIKit widgets for iOS and their equivalents from cupertino for other platforms;
- `cupertino-adaptive` - adaptive theme and wrappers for Cupertino and Material3 widgets. Allows to seamlessly use both widgets from shared code with correct content color and font style;
- `cupertino-icons-extended` - more than 800 most popular monochrome [Apple SF Symbols](https://developer.apple.com/sf-symbols/) as Compose `ImageVector`s. 
A couple of icons is provided in `cupertino` module. These symbols are copyrighted. Please read licence agreement first. 
If you don't need these icons for platform other than iOS you can take a look at native converter `CupertinoIcons.named()` in `cupertino-native` iosMain that allows to use iOS bundled icons by theirs system names.
- `cupertino-decompose` - iOS-like swipe-back animation for the 'predictive back' navigation feature of the [Decompose](https://github.com/arkivanov/Decompose) library. 
Provides native-looking page transitions and native-feeling swipe gestures.

## Add as a dependency

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.alexzhirkevich/cupertino/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.alexzhirkevich/cupertino)

| Module                     | Dependency                                               |
|----------------------------|----------------------------------------------------------|
| `cupertino`                | `io.github.alexzhirkevich:cupertino:<version>`           |
| `cupertino-native`         | `io.github.alexzhirkevich:cupertino-native:<version>`    |
| `cupertino-adaptive`       | `io.github.alexzhirkevich:cupertino-adaptive:<version>`  |
| `cupertino-decompose`      | `io.github.alexzhirkevich:cupertino-decompose:<version>` |
| `cupertino-icons-extended` | `io.github.alexzhirkevich:cupertino-decompose:<version>` |