# Compose Look And Feel

<div style="display:flex">
<img width="400" alt="Screenshot 2023-05-04 at 22 06 06" src="https://user-images.githubusercontent.com/63979218/236322966-3243ae58-3d73-4882-95f1-9e5901368b96.png">
<img width="400" alt="Screenshot 2023-05-04 at 22 07 36" src="https://user-images.githubusercontent.com/63979218/236323004-58b62ebb-af1f-43f1-81b3-4340f3268cdf.png">
</div>

# Roadmap

What is done (fully or partly):

- ✔️ Cupertino and Material3 look and feels.
- ✔️ Adaptive widgets: navbar, toolbar, icon button, ...
- ✔️ Material [Icons](#icons) / SF symbols usage based on current look and feel.
- ✔️ [Cupertino scroll overflow](#scroll) (currently for drag only) for lazy lists and scrollable composables
- ✔️ [Insets for iOS](#insets).
- ✔️ [Cupertino context menu](#context-menu).
- ✔️ [Adaptive backdrop scaffold](#backdrop-scaffold) like a Modal ViewController (pure Compose) with Cupertino look and feel
- ✔️ Swipe back navigation

Plans:
- More adaptive widgets (TextField, ProgresIndicator with pull refresh and more);
- Native-looking navigation
- More adaptive icons
- Adaptive date, time and other pickers.
- Alert dialogs

# Theme

There are 2 themes: 
- Cupertino `CupertinoApplication`
- Material3 `MaterialApplication`. 

All themes are available on all platforms. No platform widgets used. Theme can be picked automatically using `AdaptiveApplication`

Material3 composables have `CupertinoXXX` analogs. They can be used directly from any place. To pick widget automatically use `AdaptiveXXX` composables.

# Icons

SF Symbols analogs were added for some material icons. They were imported as `ImageVector`s and can be accessed with `SFSymbols` object.
To pick icon according to current theme use `Icons.Default.AdaptiveXXX`.
Names of the `SFSymbols` icons match the original symbols names. Adaptive icons are named in material style (`SFSymbols.Gear` = `Icons.Default.AdaptiveSettings` inside cupertino app)

> **Note**
>All SF Symbols shall be considered to be system-provided images as defined in the [Xcode and Apple SDKs license agreements](https://developer.apple.com/support/terms/) and are subject to the terms and conditions set forth therein. You may not use SF Symbols — or glyphs that are substantially or confusingly similar — in your app icons, logos, or any other trademark-related use. Apple reserves the right to review and, in its sole discretion, require modification or discontinuance of use of any Symbol used in violation of the foregoing restrictions, and you agree to promptly comply with any such request.

# Scroll

Adaptive scroll behavior can be added using `adaptiveVerticalScroll` and `adaptiveHorizontalScroll` modifiers.
For lazy layouts this scroll behavior can be added using `adaptiveScrollOverflow` modifier.

For Cupertino look and feel this modifiers add native-looking scroll overflow (currently only for drag, not fling).

# Insets

Some of `WindowInsets` such as `navigationBars`, `statusBars`, `ime`, ... are implemented in common code. Paddings can be easily added with corresponding modifiers: `navigationBarsPadding`, ...

Keyboard (`ime`) padding for iOS is implemented with animation and precicely syncronized with software keyboard.

Adaptive components such as scaffolds, navigation and top bars are already respect both iOS and Android insets. 

# Context menu 

`AdaptiveContextMenu` can be used to create platform popup menu:

<div style="display:flex">
<img width="365" alt="Screenshot 2023-05-07 at 22 03 58" src="https://user-images.githubusercontent.com/63979218/236697568-1350d536-d825-44b9-95c7-9e9e195f3419.png">
<img width="365" alt="Screenshot 2023-05-07 at 22 04 34" src="https://user-images.githubusercontent.com/63979218/236697574-9458fb0c-3685-494c-bf9f-f869a57a6de4.png">
</div>

For Cueprtino look and feel it is always `CupertinoContextMenu` that is implemented in Compose. 
For Material look and feel is is `DropdownMenu` on Android and still `CupertinoContextMenu` on iOS, cause DropdownMenu is not implemented for iOS target.

# Backdrop Scaffold

<img width="373" alt="Screenshot 2023-05-08 at 19 04 50" src="https://user-images.githubusercontent.com/63979218/236873437-c07577db-e342-4c1b-87f2-4fc8f9efb94d.png">

`CupertinoBackdropScaffold` can be used to display front layer content as iOS Modal ViewController (implemented in pure Compose).

`AdaptiveBackdropScaffold` uses material `BackdropScaffold` with Material look and feel and `CupertinoBackdropScaffold` with Cupertino look and feel.

To allow change status bar appearance to light on iOS  when modal controller appears (like a native bahavior) add this to `Info.plist`:
```
<key>UIViewControllerBasedStatusBarAppearance</key>
<false/>
```
Appearance will be restored when modal controller is dissapeared.

