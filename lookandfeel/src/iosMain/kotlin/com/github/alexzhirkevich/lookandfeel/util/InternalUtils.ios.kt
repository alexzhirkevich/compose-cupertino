package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.runtime.Composable
import platform.Foundation.NSBundle
import platform.Foundation.NSData
import platform.Foundation.NSDictionary
import platform.Foundation.NSPropertyListImmutable
import platform.Foundation.NSPropertyListSerialization
import platform.Foundation.NSString
import platform.Foundation.dataWithContentsOfFile
import platform.UIKit.UIApplication
import platform.UserNotifications.localizedUserNotificationStringForKey


@Composable
actual fun LocalizedStrings.localized() : String {

    return NSBundle.mainBundle.localizedStringForKey(toString(), null, null)
}