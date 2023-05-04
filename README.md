# Compose Look And Feel


<div style="display:flex">
<img width="400" alt="Screenshot 2023-05-04 at 22 06 06" src="https://user-images.githubusercontent.com/63979218/236322966-3243ae58-3d73-4882-95f1-9e5901368b96.png">
<img width="400" alt="Screenshot 2023-05-04 at 22 07 36" src="https://user-images.githubusercontent.com/63979218/236323004-58b62ebb-af1f-43f1-81b3-4340f3268cdf.png">
</div>

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

# Insets

Some of `WindowInsets` such as `navigationBars`, `statusBars`, `ime`, ... are implemented in common code. Paddings can be easily added with corresponding modifiers: `navigationBarsPadding`, ...

Keyboard (`ime`) padding for iOS is implemented with animation and precicely syncronized with software keyboard.

Adaptive components such as scaffolds, navigation and top bars are already respect both iOS and Android insets. 
