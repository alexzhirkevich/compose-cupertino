/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package icons

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoAlertDialog
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoIconButton
import io.github.alexzhirkevich.cupertino.CupertinoNavigateBackButton
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControl
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControlTab
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveWidget
import io.github.alexzhirkevich.cupertino.default
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.filled.Airtag
import io.github.alexzhirkevich.cupertino.icons.filled.Alarm
import io.github.alexzhirkevich.cupertino.icons.filled.Appletv
import io.github.alexzhirkevich.cupertino.icons.filled.Archivebox
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowClockwiseCircle
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowCounterclockwiseCircle
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowCounterclockwiseIcloud
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowDownCircle
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowDownDoc
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowTriangle2CirclepathCamera
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowTriangle2CirclepathCircle
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowTurnUpForwardIphone
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowUpDoc
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowshapeTurnUpLeft
import io.github.alexzhirkevich.cupertino.icons.filled.ArrowshapeTurnUpLeft2
import io.github.alexzhirkevich.cupertino.icons.filled.Backward
import io.github.alexzhirkevich.cupertino.icons.filled.BackwardEnd
import io.github.alexzhirkevich.cupertino.icons.filled.Bag
import io.github.alexzhirkevich.cupertino.icons.filled.BagBadgeMinus
import io.github.alexzhirkevich.cupertino.icons.filled.BagBadgePlus
import io.github.alexzhirkevich.cupertino.icons.filled.Balloon
import io.github.alexzhirkevich.cupertino.icons.filled.Bandage
import io.github.alexzhirkevich.cupertino.icons.filled.Banknote
import io.github.alexzhirkevich.cupertino.icons.filled.Baseball
import io.github.alexzhirkevich.cupertino.icons.filled.Basket
import io.github.alexzhirkevich.cupertino.icons.filled.Basketball
import io.github.alexzhirkevich.cupertino.icons.filled.BedDouble
import io.github.alexzhirkevich.cupertino.icons.filled.Bell
import io.github.alexzhirkevich.cupertino.icons.filled.BellAndWavesLeftAndRight
import io.github.alexzhirkevich.cupertino.icons.filled.BellBadge
import io.github.alexzhirkevich.cupertino.icons.filled.BellCircle
import io.github.alexzhirkevich.cupertino.icons.filled.BellSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Binoculars
import io.github.alexzhirkevich.cupertino.icons.filled.BirthdayCake
import io.github.alexzhirkevich.cupertino.icons.filled.Bolt
import io.github.alexzhirkevich.cupertino.icons.filled.BoltHorizontal
import io.github.alexzhirkevich.cupertino.icons.filled.BoltSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Book
import io.github.alexzhirkevich.cupertino.icons.filled.BookCircle
import io.github.alexzhirkevich.cupertino.icons.filled.BookClosed
import io.github.alexzhirkevich.cupertino.icons.filled.Bookmark
import io.github.alexzhirkevich.cupertino.icons.filled.BookmarkSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Briefcase
import io.github.alexzhirkevich.cupertino.icons.filled.BubbleLeft
import io.github.alexzhirkevich.cupertino.icons.filled.BubbleRight
import io.github.alexzhirkevich.cupertino.icons.filled.Building
import io.github.alexzhirkevich.cupertino.icons.filled.Building2
import io.github.alexzhirkevich.cupertino.icons.filled.Burst
import io.github.alexzhirkevich.cupertino.icons.filled.Camera
import io.github.alexzhirkevich.cupertino.icons.filled.CameraCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Capslock
import io.github.alexzhirkevich.cupertino.icons.filled.Car
import io.github.alexzhirkevich.cupertino.icons.filled.Cart
import io.github.alexzhirkevich.cupertino.icons.filled.CartBadgeMinus
import io.github.alexzhirkevich.cupertino.icons.filled.CartBadgePlus
import io.github.alexzhirkevich.cupertino.icons.filled.Case
import io.github.alexzhirkevich.cupertino.icons.filled.ChartBar
import io.github.alexzhirkevich.cupertino.icons.filled.CheckmarkCircle
import io.github.alexzhirkevich.cupertino.icons.filled.CheckmarkIcloud
import io.github.alexzhirkevich.cupertino.icons.filled.CheckmarkMessage
import io.github.alexzhirkevich.cupertino.icons.filled.CheckmarkSeal
import io.github.alexzhirkevich.cupertino.icons.filled.CheckmarkShield
import io.github.alexzhirkevich.cupertino.icons.filled.CheckmarkSquare
import io.github.alexzhirkevich.cupertino.icons.filled.CircleLefthalfed
import io.github.alexzhirkevich.cupertino.icons.filled.CircleRighthalfed
import io.github.alexzhirkevich.cupertino.icons.filled.Clear
import io.github.alexzhirkevich.cupertino.icons.filled.Clipboard
import io.github.alexzhirkevich.cupertino.icons.filled.Clock
import io.github.alexzhirkevich.cupertino.icons.filled.Cloud
import io.github.alexzhirkevich.cupertino.icons.filled.Cone
import io.github.alexzhirkevich.cupertino.icons.filled.Cpu
import io.github.alexzhirkevich.cupertino.icons.filled.Creditcard
import io.github.alexzhirkevich.cupertino.icons.filled.Cross
import io.github.alexzhirkevich.cupertino.icons.filled.CrossCircle
import io.github.alexzhirkevich.cupertino.icons.filled.CrossVial
import io.github.alexzhirkevich.cupertino.icons.filled.Crown
import io.github.alexzhirkevich.cupertino.icons.filled.Cube
import io.github.alexzhirkevich.cupertino.icons.filled.CupAndSaucer
import io.github.alexzhirkevich.cupertino.icons.filled.DeleteLeft
import io.github.alexzhirkevich.cupertino.icons.filled.DeleteRight
import io.github.alexzhirkevich.cupertino.icons.filled.Dice
import io.github.alexzhirkevich.cupertino.icons.filled.Doc
import io.github.alexzhirkevich.cupertino.icons.filled.DocBadgeArrowUp
import io.github.alexzhirkevich.cupertino.icons.filled.DocBadgePlus
import io.github.alexzhirkevich.cupertino.icons.filled.DocOnDoc
import io.github.alexzhirkevich.cupertino.icons.filled.DocPlaintext
import io.github.alexzhirkevich.cupertino.icons.filled.DocText
import io.github.alexzhirkevich.cupertino.icons.filled.Drop
import io.github.alexzhirkevich.cupertino.icons.filled.Ear
import io.github.alexzhirkevich.cupertino.icons.filled.EllipsisBubble
import io.github.alexzhirkevich.cupertino.icons.filled.EllipsisCircle
import io.github.alexzhirkevich.cupertino.icons.filled.EllipsisMessage
import io.github.alexzhirkevich.cupertino.icons.filled.Envelope
import io.github.alexzhirkevich.cupertino.icons.filled.EnvelopeBadge
import io.github.alexzhirkevich.cupertino.icons.filled.EnvelopeCircle
import io.github.alexzhirkevich.cupertino.icons.filled.EnvelopeOpen
import io.github.alexzhirkevich.cupertino.icons.filled.Eraser
import io.github.alexzhirkevich.cupertino.icons.filled.ExclamationmarkCircle
import io.github.alexzhirkevich.cupertino.icons.filled.ExclamationmarkIcloud
import io.github.alexzhirkevich.cupertino.icons.filled.ExclamationmarkSquare
import io.github.alexzhirkevich.cupertino.icons.filled.ExclamationmarkTriangle
import io.github.alexzhirkevich.cupertino.icons.filled.Externaldrive
import io.github.alexzhirkevich.cupertino.icons.filled.Eye
import io.github.alexzhirkevich.cupertino.icons.filled.EyeSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Facemask
import io.github.alexzhirkevich.cupertino.icons.filled.Fanblades
import io.github.alexzhirkevich.cupertino.icons.filled.FanbladesSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Film
import io.github.alexzhirkevich.cupertino.icons.filled.Flag
import io.github.alexzhirkevich.cupertino.icons.filled.Flag2Crossed
import io.github.alexzhirkevich.cupertino.icons.filled.FlagSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Flame
import io.github.alexzhirkevich.cupertino.icons.filled.Folder
import io.github.alexzhirkevich.cupertino.icons.filled.FolderBadgePlus
import io.github.alexzhirkevich.cupertino.icons.filled.Football
import io.github.alexzhirkevich.cupertino.icons.filled.ForkKnifeCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Forward
import io.github.alexzhirkevich.cupertino.icons.filled.ForwardEnd
import io.github.alexzhirkevich.cupertino.icons.filled.Fuelpump
import io.github.alexzhirkevich.cupertino.icons.filled.Gamecontroller
import io.github.alexzhirkevich.cupertino.icons.filled.Gearshape
import io.github.alexzhirkevich.cupertino.icons.filled.Gearshape2
import io.github.alexzhirkevich.cupertino.icons.filled.Gift
import io.github.alexzhirkevich.cupertino.icons.filled.Giftcard
import io.github.alexzhirkevich.cupertino.icons.filled.GlobeDesk
import io.github.alexzhirkevich.cupertino.icons.filled.Graduationcap
import io.github.alexzhirkevich.cupertino.icons.filled.Hammer
import io.github.alexzhirkevich.cupertino.icons.filled.HandDraw
import io.github.alexzhirkevich.cupertino.icons.filled.HandPointUp
import io.github.alexzhirkevich.cupertino.icons.filled.HandPointUpLeft
import io.github.alexzhirkevich.cupertino.icons.filled.HandRaised
import io.github.alexzhirkevich.cupertino.icons.filled.HandRaisedSlash
import io.github.alexzhirkevich.cupertino.icons.filled.HandTap
import io.github.alexzhirkevich.cupertino.icons.filled.HandThumbsdown
import io.github.alexzhirkevich.cupertino.icons.filled.HandThumbsup
import io.github.alexzhirkevich.cupertino.icons.filled.HandWave
import io.github.alexzhirkevich.cupertino.icons.filled.HandsSparkles
import io.github.alexzhirkevich.cupertino.icons.filled.HeadphonesCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Heart
import io.github.alexzhirkevich.cupertino.icons.filled.HeartCircle
import io.github.alexzhirkevich.cupertino.icons.filled.HeartSlash
import io.github.alexzhirkevich.cupertino.icons.filled.HeartTextSquare
import io.github.alexzhirkevich.cupertino.icons.filled.Hifispeaker
import io.github.alexzhirkevich.cupertino.icons.filled.Homepod
import io.github.alexzhirkevich.cupertino.icons.filled.Homepodmini
import io.github.alexzhirkevich.cupertino.icons.filled.House
import io.github.alexzhirkevich.cupertino.icons.filled.Icloud
import io.github.alexzhirkevich.cupertino.icons.filled.IcloudAndArrowDown
import io.github.alexzhirkevich.cupertino.icons.filled.IcloudAndArrowUp
import io.github.alexzhirkevich.cupertino.icons.filled.InfoBubble
import io.github.alexzhirkevich.cupertino.icons.filled.InfoCircle
import io.github.alexzhirkevich.cupertino.icons.filled.InfoSquare
import io.github.alexzhirkevich.cupertino.icons.filled.Key
import io.github.alexzhirkevich.cupertino.icons.filled.KeyIcloud
import io.github.alexzhirkevich.cupertino.icons.filled.Keyboard
import io.github.alexzhirkevich.cupertino.icons.filled.Lanyardcard
import io.github.alexzhirkevich.cupertino.icons.filled.Leaf
import io.github.alexzhirkevich.cupertino.icons.filled.Level
import io.github.alexzhirkevich.cupertino.icons.filled.Lifepreserver
import io.github.alexzhirkevich.cupertino.icons.filled.LightBeaconMax
import io.github.alexzhirkevich.cupertino.icons.filled.Lightbulb
import io.github.alexzhirkevich.cupertino.icons.filled.LightbulbSlash
import io.github.alexzhirkevich.cupertino.icons.filled.LinkCircle
import io.github.alexzhirkevich.cupertino.icons.filled.ListBulletCircle
import io.github.alexzhirkevich.cupertino.icons.filled.ListBulletClipboard
import io.github.alexzhirkevich.cupertino.icons.filled.ListClipboard
import io.github.alexzhirkevich.cupertino.icons.filled.Location
import io.github.alexzhirkevich.cupertino.icons.filled.Lock
import io.github.alexzhirkevich.cupertino.icons.filled.LockCircle
import io.github.alexzhirkevich.cupertino.icons.filled.LockOpen
import io.github.alexzhirkevich.cupertino.icons.filled.LockSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Magazine
import io.github.alexzhirkevich.cupertino.icons.filled.Mail
import io.github.alexzhirkevich.cupertino.icons.filled.MailStack
import io.github.alexzhirkevich.cupertino.icons.filled.Map
import io.github.alexzhirkevich.cupertino.icons.filled.Medal
import io.github.alexzhirkevich.cupertino.icons.filled.Megaphone
import io.github.alexzhirkevich.cupertino.icons.filled.Menucard
import io.github.alexzhirkevich.cupertino.icons.filled.Message
import io.github.alexzhirkevich.cupertino.icons.filled.MessageBadgeed
import io.github.alexzhirkevich.cupertino.icons.filled.Mic
import io.github.alexzhirkevich.cupertino.icons.filled.MicSlash
import io.github.alexzhirkevich.cupertino.icons.filled.MinusCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Moon
import io.github.alexzhirkevich.cupertino.icons.filled.MoonStars
import io.github.alexzhirkevich.cupertino.icons.filled.Mount
import io.github.alexzhirkevich.cupertino.icons.filled.Newspaper
import io.github.alexzhirkevich.cupertino.icons.filled.Opticaldisc
import io.github.alexzhirkevich.cupertino.icons.filled.Paintbrush
import io.github.alexzhirkevich.cupertino.icons.filled.PaintbrushPointed
import io.github.alexzhirkevich.cupertino.icons.filled.Paintpalette
import io.github.alexzhirkevich.cupertino.icons.filled.PaperclipCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Paperplane
import io.github.alexzhirkevich.cupertino.icons.filled.PartyPopper
import io.github.alexzhirkevich.cupertino.icons.filled.Pause
import io.github.alexzhirkevich.cupertino.icons.filled.PauseCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Pawprint
import io.github.alexzhirkevich.cupertino.icons.filled.PencilCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Person
import io.github.alexzhirkevich.cupertino.icons.filled.Person2
import io.github.alexzhirkevich.cupertino.icons.filled.PersonCircle
import io.github.alexzhirkevich.cupertino.icons.filled.PersonCropCircle
import io.github.alexzhirkevich.cupertino.icons.filled.PersonCropCircleBadgeMinus
import io.github.alexzhirkevich.cupertino.icons.filled.PersonCropCircleBadgePlus
import io.github.alexzhirkevich.cupertino.icons.filled.PersonCropSquare
import io.github.alexzhirkevich.cupertino.icons.filled.PersonIcloud
import io.github.alexzhirkevich.cupertino.icons.filled.PersonTextRectangle
import io.github.alexzhirkevich.cupertino.icons.filled.PersonViewfinder
import io.github.alexzhirkevich.cupertino.icons.filled.PersonWave2
import io.github.alexzhirkevich.cupertino.icons.filled.Phone
import io.github.alexzhirkevich.cupertino.icons.filled.PhoneAndWaveform
import io.github.alexzhirkevich.cupertino.icons.filled.PhoneArrowDownLeft
import io.github.alexzhirkevich.cupertino.icons.filled.PhoneArrowUpRight
import io.github.alexzhirkevich.cupertino.icons.filled.PhoneBadgePlus
import io.github.alexzhirkevich.cupertino.icons.filled.PhoneCircle
import io.github.alexzhirkevich.cupertino.icons.filled.PhoneConnection
import io.github.alexzhirkevich.cupertino.icons.filled.Photo
import io.github.alexzhirkevich.cupertino.icons.filled.PhotoStack
import io.github.alexzhirkevich.cupertino.icons.filled.Pill
import io.github.alexzhirkevich.cupertino.icons.filled.Pin
import io.github.alexzhirkevich.cupertino.icons.filled.PinCircle
import io.github.alexzhirkevich.cupertino.icons.filled.PinSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Pip
import io.github.alexzhirkevich.cupertino.icons.filled.Play
import io.github.alexzhirkevich.cupertino.icons.filled.PlayCircle
import io.github.alexzhirkevich.cupertino.icons.filled.PlusApp
import io.github.alexzhirkevich.cupertino.icons.filled.PlusBubble
import io.github.alexzhirkevich.cupertino.icons.filled.PlusCircle
import io.github.alexzhirkevich.cupertino.icons.filled.PlusMessage
import io.github.alexzhirkevich.cupertino.icons.filled.PlusSquare
import io.github.alexzhirkevich.cupertino.icons.filled.Popcorn
import io.github.alexzhirkevich.cupertino.icons.filled.PowerCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Printer
import io.github.alexzhirkevich.cupertino.icons.filled.Puzzlepiece
import io.github.alexzhirkevich.cupertino.icons.filled.PuzzlepieceExtension
import io.github.alexzhirkevich.cupertino.icons.filled.QuestionmarkApp
import io.github.alexzhirkevich.cupertino.icons.filled.QuestionmarkCircle
import io.github.alexzhirkevich.cupertino.icons.filled.QuestionmarkFolder
import io.github.alexzhirkevich.cupertino.icons.filled.QuestionmarkSquare
import io.github.alexzhirkevich.cupertino.icons.filled.RecordCircle
import io.github.alexzhirkevich.cupertino.icons.filled.RectanglePortraitAndArrowForward
import io.github.alexzhirkevich.cupertino.icons.filled.RectangleStack
import io.github.alexzhirkevich.cupertino.icons.filled.RotateLeft
import io.github.alexzhirkevich.cupertino.icons.filled.RotateRight
import io.github.alexzhirkevich.cupertino.icons.filled.Ruler
import io.github.alexzhirkevich.cupertino.icons.filled.Safari
import io.github.alexzhirkevich.cupertino.icons.filled.Scalemass
import io.github.alexzhirkevich.cupertino.icons.filled.Scroll
import io.github.alexzhirkevich.cupertino.icons.filled.ShazamLogo
import io.github.alexzhirkevich.cupertino.icons.filled.Shield
import io.github.alexzhirkevich.cupertino.icons.filled.ShieldLefthalfed
import io.github.alexzhirkevich.cupertino.icons.filled.ShieldRighthalfed
import io.github.alexzhirkevich.cupertino.icons.filled.ShieldSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Shippingbox
import io.github.alexzhirkevich.cupertino.icons.filled.Shoeprints
import io.github.alexzhirkevich.cupertino.icons.filled.Simcard
import io.github.alexzhirkevich.cupertino.icons.filled.SmallcircleedCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Speaker
import io.github.alexzhirkevich.cupertino.icons.filled.SpeakerMinus
import io.github.alexzhirkevich.cupertino.icons.filled.SpeakerPlus
import io.github.alexzhirkevich.cupertino.icons.filled.SpeakerSlash
import io.github.alexzhirkevich.cupertino.icons.filled.SpeakerWave2
import io.github.alexzhirkevich.cupertino.icons.filled.SquareAndArrowUp
import io.github.alexzhirkevich.cupertino.icons.filled.SquareBottomthirdInseted
import io.github.alexzhirkevich.cupertino.icons.filled.SquareOnSquare
import io.github.alexzhirkevich.cupertino.icons.filled.SquareSplit1x2
import io.github.alexzhirkevich.cupertino.icons.filled.SquareSplit2x1
import io.github.alexzhirkevich.cupertino.icons.filled.SquareStack
import io.github.alexzhirkevich.cupertino.icons.filled.SquareStack3dUp
import io.github.alexzhirkevich.cupertino.icons.filled.SquareTopthirdInseted
import io.github.alexzhirkevich.cupertino.icons.filled.Star
import io.github.alexzhirkevich.cupertino.icons.filled.StarLeadinghalfed
import io.github.alexzhirkevich.cupertino.icons.filled.StarSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Staroflife
import io.github.alexzhirkevich.cupertino.icons.filled.Stop
import io.github.alexzhirkevich.cupertino.icons.filled.StopCircle
import io.github.alexzhirkevich.cupertino.icons.filled.Suitcase
import io.github.alexzhirkevich.cupertino.icons.filled.SunMax
import io.github.alexzhirkevich.cupertino.icons.filled.Tag
import io.github.alexzhirkevich.cupertino.icons.filled.Terminal
import io.github.alexzhirkevich.cupertino.icons.filled.TextBubble
import io.github.alexzhirkevich.cupertino.icons.filled.Theatermasks
import io.github.alexzhirkevich.cupertino.icons.filled.Trash
import io.github.alexzhirkevich.cupertino.icons.filled.TrashSlash
import io.github.alexzhirkevich.cupertino.icons.filled.TrayAndArrowDown
import io.github.alexzhirkevich.cupertino.icons.filled.TrayAndArrowUp
import io.github.alexzhirkevich.cupertino.icons.filled.Trophy
import io.github.alexzhirkevich.cupertino.icons.filled.Tshirt
import io.github.alexzhirkevich.cupertino.icons.filled.Tv
import io.github.alexzhirkevich.cupertino.icons.filled.TvAndHifispeaker
import io.github.alexzhirkevich.cupertino.icons.filled.Umbrella
import io.github.alexzhirkevich.cupertino.icons.filled.Video
import io.github.alexzhirkevich.cupertino.icons.filled.VideoCircle
import io.github.alexzhirkevich.cupertino.icons.filled.VideoSlash
import io.github.alexzhirkevich.cupertino.icons.filled.Volleyball
import io.github.alexzhirkevich.cupertino.icons.filled.WalletPass
import io.github.alexzhirkevich.cupertino.icons.filled.WebCamera
import io.github.alexzhirkevich.cupertino.icons.filled.WifiRouter
import io.github.alexzhirkevich.cupertino.icons.filled.Wineglass
import io.github.alexzhirkevich.cupertino.icons.filled.XmarkApp
import io.github.alexzhirkevich.cupertino.icons.filled.XmarkBin
import io.github.alexzhirkevich.cupertino.icons.filled.XmarkCircle
import io.github.alexzhirkevich.cupertino.icons.filled.XmarkIcloud
import io.github.alexzhirkevich.cupertino.icons.filled.XmarkSeal
import io.github.alexzhirkevich.cupertino.icons.filled.XmarkShield
import io.github.alexzhirkevich.cupertino.icons.filled._4kTv
import io.github.alexzhirkevich.cupertino.icons.outlined.Airplane
import io.github.alexzhirkevich.cupertino.icons.outlined.AirplaneArrival
import io.github.alexzhirkevich.cupertino.icons.outlined.AirplaneDeparture
import io.github.alexzhirkevich.cupertino.icons.outlined.Airplayaudio
import io.github.alexzhirkevich.cupertino.icons.outlined.Airpods
import io.github.alexzhirkevich.cupertino.icons.outlined.AirpodsGen3
import io.github.alexzhirkevich.cupertino.icons.outlined.Airpodsmax
import io.github.alexzhirkevich.cupertino.icons.outlined.Airpodspro
import io.github.alexzhirkevich.cupertino.icons.outlined.Airtag
import io.github.alexzhirkevich.cupertino.icons.outlined.Alarm
import io.github.alexzhirkevich.cupertino.icons.outlined.Alt
import io.github.alexzhirkevich.cupertino.icons.outlined.Angle
import io.github.alexzhirkevich.cupertino.icons.outlined.AntennaRadiowavesLeftAndRight
import io.github.alexzhirkevich.cupertino.icons.outlined.AntennaRadiowavesLeftAndRightSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.AppleLogo
import io.github.alexzhirkevich.cupertino.icons.outlined.Applepencil
import io.github.alexzhirkevich.cupertino.icons.outlined.Appletv
import io.github.alexzhirkevich.cupertino.icons.outlined.Applewatch
import io.github.alexzhirkevich.cupertino.icons.outlined.ApplewatchRadiowavesLeftAndRight
import io.github.alexzhirkevich.cupertino.icons.outlined.ApplewatchWatchface
import io.github.alexzhirkevich.cupertino.icons.outlined.Archivebox
import io.github.alexzhirkevich.cupertino.icons.outlined.Arrow3Trianglepath
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowClockwise
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowCounterclockwise
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowCounterclockwiseIcloud
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowDown
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowDownAndLineHorizontalAndArrowUp
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowDownCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowDownDoc
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowDownRightAndArrowUpLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowDownToLine
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowLeftAndRight
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowLeftArrowRight
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTriangle2Circlepath
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTriangle2CirclepathCamera
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTriangleBranch
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTurnDownLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTurnDownRight
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTurnRightUp
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTurnUpForwardIphone
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTurnUpLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowTurnUpRight
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowUpAndDown
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowUpArrowDown
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowUpDoc
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowUpLeftAndArrowDownRight
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowUturnLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowUturnRight
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowshapeTurnUpLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.ArrowshapeTurnUpLeft2
import io.github.alexzhirkevich.cupertino.icons.outlined.At
import io.github.alexzhirkevich.cupertino.icons.outlined.Backward
import io.github.alexzhirkevich.cupertino.icons.outlined.BackwardEnd
import io.github.alexzhirkevich.cupertino.icons.outlined.Bag
import io.github.alexzhirkevich.cupertino.icons.outlined.BagBadgeMinus
import io.github.alexzhirkevich.cupertino.icons.outlined.BagBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.Balloon
import io.github.alexzhirkevich.cupertino.icons.outlined.Bandage
import io.github.alexzhirkevich.cupertino.icons.outlined.Banknote
import io.github.alexzhirkevich.cupertino.icons.outlined.Barcode
import io.github.alexzhirkevich.cupertino.icons.outlined.BarcodeViewfinder
import io.github.alexzhirkevich.cupertino.icons.outlined.Baseball
import io.github.alexzhirkevich.cupertino.icons.outlined.Basket
import io.github.alexzhirkevich.cupertino.icons.outlined.Basketball
import io.github.alexzhirkevich.cupertino.icons.outlined.Battery100
import io.github.alexzhirkevich.cupertino.icons.outlined.BedDouble
import io.github.alexzhirkevich.cupertino.icons.outlined.Bell
import io.github.alexzhirkevich.cupertino.icons.outlined.BellAndWavesLeftAndRight
import io.github.alexzhirkevich.cupertino.icons.outlined.BellBadge
import io.github.alexzhirkevich.cupertino.icons.outlined.BellCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.BellSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Bicycle
import io.github.alexzhirkevich.cupertino.icons.outlined.Binoculars
import io.github.alexzhirkevich.cupertino.icons.outlined.BirthdayCake
import io.github.alexzhirkevich.cupertino.icons.outlined.Bitcoinsign
import io.github.alexzhirkevich.cupertino.icons.outlined.Bolt
import io.github.alexzhirkevich.cupertino.icons.outlined.BoltHorizontal
import io.github.alexzhirkevich.cupertino.icons.outlined.BoltSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Book
import io.github.alexzhirkevich.cupertino.icons.outlined.BookCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.BookClosed
import io.github.alexzhirkevich.cupertino.icons.outlined.Bookmark
import io.github.alexzhirkevich.cupertino.icons.outlined.BookmarkSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Brain
import io.github.alexzhirkevich.cupertino.icons.outlined.BrainHeadProfile
import io.github.alexzhirkevich.cupertino.icons.outlined.Briefcase
import io.github.alexzhirkevich.cupertino.icons.outlined.BubbleLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.BubbleRight
import io.github.alexzhirkevich.cupertino.icons.outlined.Building
import io.github.alexzhirkevich.cupertino.icons.outlined.Building2
import io.github.alexzhirkevich.cupertino.icons.outlined.Burn
import io.github.alexzhirkevich.cupertino.icons.outlined.Burst
import io.github.alexzhirkevich.cupertino.icons.outlined.CableConnector
import io.github.alexzhirkevich.cupertino.icons.outlined.CableConnectorHorizontal
import io.github.alexzhirkevich.cupertino.icons.outlined.Calendar
import io.github.alexzhirkevich.cupertino.icons.outlined.CalendarBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.Camera
import io.github.alexzhirkevich.cupertino.icons.outlined.CameraCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.CameraFilters
import io.github.alexzhirkevich.cupertino.icons.outlined.CameraViewfinder
import io.github.alexzhirkevich.cupertino.icons.outlined.Candybarphone
import io.github.alexzhirkevich.cupertino.icons.outlined.Capslock
import io.github.alexzhirkevich.cupertino.icons.outlined.Car
import io.github.alexzhirkevich.cupertino.icons.outlined.Cart
import io.github.alexzhirkevich.cupertino.icons.outlined.CartBadgeMinus
import io.github.alexzhirkevich.cupertino.icons.outlined.CartBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.Case
import io.github.alexzhirkevich.cupertino.icons.outlined.Centsign
import io.github.alexzhirkevich.cupertino.icons.outlined.Character
import io.github.alexzhirkevich.cupertino.icons.outlined.ChartBar
import io.github.alexzhirkevich.cupertino.icons.outlined.ChartLineDowntrendXyaxis
import io.github.alexzhirkevich.cupertino.icons.outlined.ChartLineUptrendXyaxis
import io.github.alexzhirkevich.cupertino.icons.outlined.CheckerboardShield
import io.github.alexzhirkevich.cupertino.icons.outlined.Checklist
import io.github.alexzhirkevich.cupertino.icons.outlined.ChecklistChecked
import io.github.alexzhirkevich.cupertino.icons.outlined.ChecklistUnchecked
import io.github.alexzhirkevich.cupertino.icons.outlined.Checkmark
import io.github.alexzhirkevich.cupertino.icons.outlined.CheckmarkCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.CheckmarkIcloud
import io.github.alexzhirkevich.cupertino.icons.outlined.CheckmarkMessage
import io.github.alexzhirkevich.cupertino.icons.outlined.CheckmarkSeal
import io.github.alexzhirkevich.cupertino.icons.outlined.CheckmarkShield
import io.github.alexzhirkevich.cupertino.icons.outlined.CheckmarkSquare
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronBackward
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronDown
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronForward
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronLeftForwardslashChevronRight
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronUp
import io.github.alexzhirkevich.cupertino.icons.outlined.Clear
import io.github.alexzhirkevich.cupertino.icons.outlined.Clipboard
import io.github.alexzhirkevich.cupertino.icons.outlined.Clock
import io.github.alexzhirkevich.cupertino.icons.outlined.ClockArrowCirclepath
import io.github.alexzhirkevich.cupertino.icons.outlined.Cloud
import io.github.alexzhirkevich.cupertino.icons.outlined.Command
import io.github.alexzhirkevich.cupertino.icons.outlined.CompassDrawing
import io.github.alexzhirkevich.cupertino.icons.outlined.Cone
import io.github.alexzhirkevich.cupertino.icons.outlined.Cpu
import io.github.alexzhirkevich.cupertino.icons.outlined.Creditcard
import io.github.alexzhirkevich.cupertino.icons.outlined.CreditcardTrianglebadgeExclamationmark
import io.github.alexzhirkevich.cupertino.icons.outlined.Crop
import io.github.alexzhirkevich.cupertino.icons.outlined.CropRotate
import io.github.alexzhirkevich.cupertino.icons.outlined.Cross
import io.github.alexzhirkevich.cupertino.icons.outlined.CrossCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.CrossVial
import io.github.alexzhirkevich.cupertino.icons.outlined.Crown
import io.github.alexzhirkevich.cupertino.icons.outlined.Cube
import io.github.alexzhirkevich.cupertino.icons.outlined.CupAndSaucer
import io.github.alexzhirkevich.cupertino.icons.outlined.Curlybraces
import io.github.alexzhirkevich.cupertino.icons.outlined.CursorarrowRays
import io.github.alexzhirkevich.cupertino.icons.outlined.DeleteLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.DeleteRight
import io.github.alexzhirkevich.cupertino.icons.outlined.Desktopcomputer
import io.github.alexzhirkevich.cupertino.icons.outlined.Dice
import io.github.alexzhirkevich.cupertino.icons.outlined.Display
import io.github.alexzhirkevich.cupertino.icons.outlined.Divide
import io.github.alexzhirkevich.cupertino.icons.outlined.Doc
import io.github.alexzhirkevich.cupertino.icons.outlined.DocBadgeArrowUp
import io.github.alexzhirkevich.cupertino.icons.outlined.DocBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.DocOnDoc
import io.github.alexzhirkevich.cupertino.icons.outlined.DocPlaintext
import io.github.alexzhirkevich.cupertino.icons.outlined.DocText
import io.github.alexzhirkevich.cupertino.icons.outlined.DocTextMagnifyingglass
import io.github.alexzhirkevich.cupertino.icons.outlined.Dollarsign
import io.github.alexzhirkevich.cupertino.icons.outlined.DollarsignArrowCirclepath
import io.github.alexzhirkevich.cupertino.icons.outlined.DoorLeftHandClosed
import io.github.alexzhirkevich.cupertino.icons.outlined.DoorLeftHandOpen
import io.github.alexzhirkevich.cupertino.icons.outlined.DotRadiowavesLeftAndRight
import io.github.alexzhirkevich.cupertino.icons.outlined.DotRadiowavesUpForward
import io.github.alexzhirkevich.cupertino.icons.outlined.Drop
import io.github.alexzhirkevich.cupertino.icons.outlined.Ear
import io.github.alexzhirkevich.cupertino.icons.outlined.Earpods
import io.github.alexzhirkevich.cupertino.icons.outlined.Ellipsis
import io.github.alexzhirkevich.cupertino.icons.outlined.EllipsisBubble
import io.github.alexzhirkevich.cupertino.icons.outlined.EllipsisCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.EllipsisCurlybraces
import io.github.alexzhirkevich.cupertino.icons.outlined.EllipsisMessage
import io.github.alexzhirkevich.cupertino.icons.outlined.Envelope
import io.github.alexzhirkevich.cupertino.icons.outlined.EnvelopeBadge
import io.github.alexzhirkevich.cupertino.icons.outlined.EnvelopeCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.EnvelopeOpen
import io.github.alexzhirkevich.cupertino.icons.outlined.Eraser
import io.github.alexzhirkevich.cupertino.icons.outlined.Eurosign
import io.github.alexzhirkevich.cupertino.icons.outlined.Exclamationmark
import io.github.alexzhirkevich.cupertino.icons.outlined.Exclamationmark2
import io.github.alexzhirkevich.cupertino.icons.outlined.Exclamationmark3
import io.github.alexzhirkevich.cupertino.icons.outlined.ExclamationmarkArrowTriangle2Circlepath
import io.github.alexzhirkevich.cupertino.icons.outlined.ExclamationmarkCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.ExclamationmarkIcloud
import io.github.alexzhirkevich.cupertino.icons.outlined.ExclamationmarkSquare
import io.github.alexzhirkevich.cupertino.icons.outlined.ExclamationmarkTriangle
import io.github.alexzhirkevich.cupertino.icons.outlined.Externaldrive
import io.github.alexzhirkevich.cupertino.icons.outlined.Eye
import io.github.alexzhirkevich.cupertino.icons.outlined.EyeSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Eyebrow
import io.github.alexzhirkevich.cupertino.icons.outlined.Eyedropper
import io.github.alexzhirkevich.cupertino.icons.outlined.Eyeglasses
import io.github.alexzhirkevich.cupertino.icons.outlined.Eyes
import io.github.alexzhirkevich.cupertino.icons.outlined.FaceSmiling
import io.github.alexzhirkevich.cupertino.icons.outlined.FaceSmilingInverse
import io.github.alexzhirkevich.cupertino.icons.outlined.Faceid
import io.github.alexzhirkevich.cupertino.icons.outlined.Facemask
import io.github.alexzhirkevich.cupertino.icons.outlined.Fanblades
import io.github.alexzhirkevich.cupertino.icons.outlined.FanbladesSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Fibrechannel
import io.github.alexzhirkevich.cupertino.icons.outlined.FigureStand
import io.github.alexzhirkevich.cupertino.icons.outlined.FigureWalk
import io.github.alexzhirkevich.cupertino.icons.outlined.Film
import io.github.alexzhirkevich.cupertino.icons.outlined.Flag
import io.github.alexzhirkevich.cupertino.icons.outlined.Flag2Crossed
import io.github.alexzhirkevich.cupertino.icons.outlined.FlagCheckered2Crossed
import io.github.alexzhirkevich.cupertino.icons.outlined.FlagSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Flame
import io.github.alexzhirkevich.cupertino.icons.outlined.Flowchart
import io.github.alexzhirkevich.cupertino.icons.outlined.Folder
import io.github.alexzhirkevich.cupertino.icons.outlined.FolderBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.Football
import io.github.alexzhirkevich.cupertino.icons.outlined.ForkKnife
import io.github.alexzhirkevich.cupertino.icons.outlined.ForkKnifeCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Forward
import io.github.alexzhirkevich.cupertino.icons.outlined.ForwardEnd
import io.github.alexzhirkevich.cupertino.icons.outlined.Francsign
import io.github.alexzhirkevich.cupertino.icons.outlined.Fuelpump
import io.github.alexzhirkevich.cupertino.icons.outlined.Gamecontroller
import io.github.alexzhirkevich.cupertino.icons.outlined.Gear
import io.github.alexzhirkevich.cupertino.icons.outlined.Gearshape
import io.github.alexzhirkevich.cupertino.icons.outlined.Gearshape2
import io.github.alexzhirkevich.cupertino.icons.outlined.Gift
import io.github.alexzhirkevich.cupertino.icons.outlined.Giftcard
import io.github.alexzhirkevich.cupertino.icons.outlined.GlobeDesk
import io.github.alexzhirkevich.cupertino.icons.outlined.Gobackward
import io.github.alexzhirkevich.cupertino.icons.outlined.Goforward
import io.github.alexzhirkevich.cupertino.icons.outlined.Graduationcap
import io.github.alexzhirkevich.cupertino.icons.outlined.Grid
import io.github.alexzhirkevich.cupertino.icons.outlined.Hammer
import io.github.alexzhirkevich.cupertino.icons.outlined.HandDraw
import io.github.alexzhirkevich.cupertino.icons.outlined.HandPointUp
import io.github.alexzhirkevich.cupertino.icons.outlined.HandPointUpLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.HandRaised
import io.github.alexzhirkevich.cupertino.icons.outlined.HandRaisedSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.HandTap
import io.github.alexzhirkevich.cupertino.icons.outlined.HandThumbsdown
import io.github.alexzhirkevich.cupertino.icons.outlined.HandThumbsup
import io.github.alexzhirkevich.cupertino.icons.outlined.HandWave
import io.github.alexzhirkevich.cupertino.icons.outlined.HandsSparkles
import io.github.alexzhirkevich.cupertino.icons.outlined.Headphones
import io.github.alexzhirkevich.cupertino.icons.outlined.HeadphonesCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Heart
import io.github.alexzhirkevich.cupertino.icons.outlined.HeartCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.HeartSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.HeartTextSquare
import io.github.alexzhirkevich.cupertino.icons.outlined.Hifispeaker
import io.github.alexzhirkevich.cupertino.icons.outlined.Highlighter
import io.github.alexzhirkevich.cupertino.icons.outlined.Homekit
import io.github.alexzhirkevich.cupertino.icons.outlined.Homepod
import io.github.alexzhirkevich.cupertino.icons.outlined.Homepodmini
import io.github.alexzhirkevich.cupertino.icons.outlined.Hourglass
import io.github.alexzhirkevich.cupertino.icons.outlined.House
import io.github.alexzhirkevich.cupertino.icons.outlined.Hryvniasign
import io.github.alexzhirkevich.cupertino.icons.outlined.Icloud
import io.github.alexzhirkevich.cupertino.icons.outlined.IcloudAndArrowDown
import io.github.alexzhirkevich.cupertino.icons.outlined.IcloudAndArrowUp
import io.github.alexzhirkevich.cupertino.icons.outlined.Infinity
import io.github.alexzhirkevich.cupertino.icons.outlined.Info
import io.github.alexzhirkevich.cupertino.icons.outlined.InfoBubble
import io.github.alexzhirkevich.cupertino.icons.outlined.InfoCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.InfoSquare
import io.github.alexzhirkevich.cupertino.icons.outlined.Ipad
import io.github.alexzhirkevich.cupertino.icons.outlined.IpadAndIphone
import io.github.alexzhirkevich.cupertino.icons.outlined.IpadHomebutton
import io.github.alexzhirkevich.cupertino.icons.outlined.Iphone
import io.github.alexzhirkevich.cupertino.icons.outlined.IphoneBadgePlay
import io.github.alexzhirkevich.cupertino.icons.outlined.IphoneHomebutton
import io.github.alexzhirkevich.cupertino.icons.outlined.IphoneHomebuttonRadiowavesLeftAndRight
import io.github.alexzhirkevich.cupertino.icons.outlined.IphoneRadiowavesLeftAndRight
import io.github.alexzhirkevich.cupertino.icons.outlined.Key
import io.github.alexzhirkevich.cupertino.icons.outlined.KeyIcloud
import io.github.alexzhirkevich.cupertino.icons.outlined.Keyboard
import io.github.alexzhirkevich.cupertino.icons.outlined.Lanyardcard
import io.github.alexzhirkevich.cupertino.icons.outlined.Laptopcomputer
import io.github.alexzhirkevich.cupertino.icons.outlined.LaptopcomputerAndIpad
import io.github.alexzhirkevich.cupertino.icons.outlined.LaptopcomputerAndIphone
import io.github.alexzhirkevich.cupertino.icons.outlined.Leaf
import io.github.alexzhirkevich.cupertino.icons.outlined.Level
import io.github.alexzhirkevich.cupertino.icons.outlined.Lifepreserver
import io.github.alexzhirkevich.cupertino.icons.outlined.LightBeaconMax
import io.github.alexzhirkevich.cupertino.icons.outlined.LightMax
import io.github.alexzhirkevich.cupertino.icons.outlined.LightMin
import io.github.alexzhirkevich.cupertino.icons.outlined.Lightbulb
import io.github.alexzhirkevich.cupertino.icons.outlined.LightbulbSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Link
import io.github.alexzhirkevich.cupertino.icons.outlined.LinkBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.LinkCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Lirasign
import io.github.alexzhirkevich.cupertino.icons.outlined.ListBullet
import io.github.alexzhirkevich.cupertino.icons.outlined.ListBulletCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.ListBulletClipboard
import io.github.alexzhirkevich.cupertino.icons.outlined.ListBulletIndent
import io.github.alexzhirkevich.cupertino.icons.outlined.ListClipboard
import io.github.alexzhirkevich.cupertino.icons.outlined.ListNumber
import io.github.alexzhirkevich.cupertino.icons.outlined.Livephoto
import io.github.alexzhirkevich.cupertino.icons.outlined.Location
import io.github.alexzhirkevich.cupertino.icons.outlined.Lock
import io.github.alexzhirkevich.cupertino.icons.outlined.LockCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.LockOpen
import io.github.alexzhirkevich.cupertino.icons.outlined.LockSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Macwindow
import io.github.alexzhirkevich.cupertino.icons.outlined.MacwindowBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.Magazine
import io.github.alexzhirkevich.cupertino.icons.outlined.Mail
import io.github.alexzhirkevich.cupertino.icons.outlined.MailStack
import io.github.alexzhirkevich.cupertino.icons.outlined.Map
import io.github.alexzhirkevich.cupertino.icons.outlined.Mappin
import io.github.alexzhirkevich.cupertino.icons.outlined.MappinAndEllipse
import io.github.alexzhirkevich.cupertino.icons.outlined.MappinSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Medal
import io.github.alexzhirkevich.cupertino.icons.outlined.Megaphone
import io.github.alexzhirkevich.cupertino.icons.outlined.Memories
import io.github.alexzhirkevich.cupertino.icons.outlined.MenubarRectangle
import io.github.alexzhirkevich.cupertino.icons.outlined.Menucard
import io.github.alexzhirkevich.cupertino.icons.outlined.Message
import io.github.alexzhirkevich.cupertino.icons.outlined.MessageBadge
import io.github.alexzhirkevich.cupertino.icons.outlined.Mic
import io.github.alexzhirkevich.cupertino.icons.outlined.MicSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Minus
import io.github.alexzhirkevich.cupertino.icons.outlined.MinusCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.MinusMagnifyingglass
import io.github.alexzhirkevich.cupertino.icons.outlined.Moon
import io.github.alexzhirkevich.cupertino.icons.outlined.MoonStars
import io.github.alexzhirkevich.cupertino.icons.outlined.Mount
import io.github.alexzhirkevich.cupertino.icons.outlined.Multiply
import io.github.alexzhirkevich.cupertino.icons.outlined.MusicMic
import io.github.alexzhirkevich.cupertino.icons.outlined.MusicNote
import io.github.alexzhirkevich.cupertino.icons.outlined.MusicNoteList
import io.github.alexzhirkevich.cupertino.icons.outlined.MusicQuarternote3
import io.github.alexzhirkevich.cupertino.icons.outlined.Network
import io.github.alexzhirkevich.cupertino.icons.outlined.Newspaper
import io.github.alexzhirkevich.cupertino.icons.outlined.Nosign
import io.github.alexzhirkevich.cupertino.icons.outlined.NoteText
import io.github.alexzhirkevich.cupertino.icons.outlined.NoteTextBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.Number
import io.github.alexzhirkevich.cupertino.icons.outlined.Opticaldisc
import io.github.alexzhirkevich.cupertino.icons.outlined.Option
import io.github.alexzhirkevich.cupertino.icons.outlined.Paintbrush
import io.github.alexzhirkevich.cupertino.icons.outlined.PaintbrushPointed
import io.github.alexzhirkevich.cupertino.icons.outlined.Paintpalette
import io.github.alexzhirkevich.cupertino.icons.outlined.Paperclip
import io.github.alexzhirkevich.cupertino.icons.outlined.PaperclipBadgeEllipsis
import io.github.alexzhirkevich.cupertino.icons.outlined.PaperclipCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Paperplane
import io.github.alexzhirkevich.cupertino.icons.outlined.Paragraphsign
import io.github.alexzhirkevich.cupertino.icons.outlined.PartyPopper
import io.github.alexzhirkevich.cupertino.icons.outlined.Pause
import io.github.alexzhirkevich.cupertino.icons.outlined.PauseCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Pawprint
import io.github.alexzhirkevich.cupertino.icons.outlined.Pencil
import io.github.alexzhirkevich.cupertino.icons.outlined.PencilCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.PencilTipCropCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Percent
import io.github.alexzhirkevich.cupertino.icons.outlined.Person
import io.github.alexzhirkevich.cupertino.icons.outlined.Person2
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonAndBackgroundDotted
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonCropCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonCropCircleBadgeMinus
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonCropCircleBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonCropSquare
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonIcloud
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonTextRectangle
import io.github.alexzhirkevich.cupertino.icons.outlined.PersonWave2
import io.github.alexzhirkevich.cupertino.icons.outlined.Personalhotspot
import io.github.alexzhirkevich.cupertino.icons.outlined.Phone
import io.github.alexzhirkevich.cupertino.icons.outlined.PhoneAndWaveform
import io.github.alexzhirkevich.cupertino.icons.outlined.PhoneArrowDownLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.PhoneArrowUpRight
import io.github.alexzhirkevich.cupertino.icons.outlined.PhoneBadgePlus
import io.github.alexzhirkevich.cupertino.icons.outlined.PhoneCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.PhoneConnection
import io.github.alexzhirkevich.cupertino.icons.outlined.Photo
import io.github.alexzhirkevich.cupertino.icons.outlined.PhotoStack
import io.github.alexzhirkevich.cupertino.icons.outlined.PhotoTv
import io.github.alexzhirkevich.cupertino.icons.outlined.Pill
import io.github.alexzhirkevich.cupertino.icons.outlined.Pin
import io.github.alexzhirkevich.cupertino.icons.outlined.PinCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.PinSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Pip
import io.github.alexzhirkevich.cupertino.icons.outlined.PipEnter
import io.github.alexzhirkevich.cupertino.icons.outlined.PipExit
import io.github.alexzhirkevich.cupertino.icons.outlined.Play
import io.github.alexzhirkevich.cupertino.icons.outlined.PlayCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.PlayDisplay
import io.github.alexzhirkevich.cupertino.icons.outlined.Plus
import io.github.alexzhirkevich.cupertino.icons.outlined.PlusApp
import io.github.alexzhirkevich.cupertino.icons.outlined.PlusBubble
import io.github.alexzhirkevich.cupertino.icons.outlined.PlusCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.PlusMagnifyingglass
import io.github.alexzhirkevich.cupertino.icons.outlined.PlusMessage
import io.github.alexzhirkevich.cupertino.icons.outlined.PlusSquare
import io.github.alexzhirkevich.cupertino.icons.outlined.PlusViewfinder
import io.github.alexzhirkevich.cupertino.icons.outlined.Popcorn
import io.github.alexzhirkevich.cupertino.icons.outlined.Power
import io.github.alexzhirkevich.cupertino.icons.outlined.PowerCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Printer
import io.github.alexzhirkevich.cupertino.icons.outlined.Puzzlepiece
import io.github.alexzhirkevich.cupertino.icons.outlined.PuzzlepieceExtension
import io.github.alexzhirkevich.cupertino.icons.outlined.Qrcode
import io.github.alexzhirkevich.cupertino.icons.outlined.QrcodeViewfinder
import io.github.alexzhirkevich.cupertino.icons.outlined.Questionmark
import io.github.alexzhirkevich.cupertino.icons.outlined.QuestionmarkApp
import io.github.alexzhirkevich.cupertino.icons.outlined.QuestionmarkCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.QuestionmarkFolder
import io.github.alexzhirkevich.cupertino.icons.outlined.QuestionmarkSquare
import io.github.alexzhirkevich.cupertino.icons.outlined.QuoteClosing
import io.github.alexzhirkevich.cupertino.icons.outlined.QuoteOpening
import io.github.alexzhirkevich.cupertino.icons.outlined.Rays
import io.github.alexzhirkevich.cupertino.icons.outlined.RecordCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Recordingtape
import io.github.alexzhirkevich.cupertino.icons.outlined.RectangleArrowtriangle2Outward
import io.github.alexzhirkevich.cupertino.icons.outlined.RectangleConnectedToLineBelow
import io.github.alexzhirkevich.cupertino.icons.outlined.RectanglePortraitAndArrowForward
import io.github.alexzhirkevich.cupertino.icons.outlined.RectanglePortraitArrowtriangle2Outward
import io.github.alexzhirkevich.cupertino.icons.outlined.RectangleStack
import io.github.alexzhirkevich.cupertino.icons.outlined.Repeat
import io.github.alexzhirkevich.cupertino.icons.outlined.Rosette
import io.github.alexzhirkevich.cupertino.icons.outlined.Rotate3d
import io.github.alexzhirkevich.cupertino.icons.outlined.RotateLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.RotateRight
import io.github.alexzhirkevich.cupertino.icons.outlined.Rublesign
import io.github.alexzhirkevich.cupertino.icons.outlined.Ruler
import io.github.alexzhirkevich.cupertino.icons.outlined.Safari
import io.github.alexzhirkevich.cupertino.icons.outlined.Scalemass
import io.github.alexzhirkevich.cupertino.icons.outlined.Scissors
import io.github.alexzhirkevich.cupertino.icons.outlined.Scope
import io.github.alexzhirkevich.cupertino.icons.outlined.Scribble
import io.github.alexzhirkevich.cupertino.icons.outlined.ScribbleVariable
import io.github.alexzhirkevich.cupertino.icons.outlined.Scroll
import io.github.alexzhirkevich.cupertino.icons.outlined.ServerRack
import io.github.alexzhirkevich.cupertino.icons.outlined.Shareplay
import io.github.alexzhirkevich.cupertino.icons.outlined.ShareplaySlash
import io.github.alexzhirkevich.cupertino.icons.outlined.ShazamLogo
import io.github.alexzhirkevich.cupertino.icons.outlined.Shield
import io.github.alexzhirkevich.cupertino.icons.outlined.ShieldSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Shippingbox
import io.github.alexzhirkevich.cupertino.icons.outlined.Shuffle
import io.github.alexzhirkevich.cupertino.icons.outlined.SidebarLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.SidebarRight
import io.github.alexzhirkevich.cupertino.icons.outlined.Simcard
import io.github.alexzhirkevich.cupertino.icons.outlined.Skew
import io.github.alexzhirkevich.cupertino.icons.outlined.SliderHorizontal3
import io.github.alexzhirkevich.cupertino.icons.outlined.SliderVertical3
import io.github.alexzhirkevich.cupertino.icons.outlined.Snowflake
import io.github.alexzhirkevich.cupertino.icons.outlined.Soccerball
import io.github.alexzhirkevich.cupertino.icons.outlined.Space
import io.github.alexzhirkevich.cupertino.icons.outlined.Sparkle
import io.github.alexzhirkevich.cupertino.icons.outlined.Sparkles
import io.github.alexzhirkevich.cupertino.icons.outlined.Speaker
import io.github.alexzhirkevich.cupertino.icons.outlined.SpeakerMinus
import io.github.alexzhirkevich.cupertino.icons.outlined.SpeakerPlus
import io.github.alexzhirkevich.cupertino.icons.outlined.SpeakerSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.SpeakerWave2
import io.github.alexzhirkevich.cupertino.icons.outlined.Speedometer
import io.github.alexzhirkevich.cupertino.icons.outlined.Square3Layers3dDownLeft
import io.github.alexzhirkevich.cupertino.icons.outlined.Square3Layers3dDownRight
import io.github.alexzhirkevich.cupertino.icons.outlined.SquareAndArrowUp
import io.github.alexzhirkevich.cupertino.icons.outlined.SquareAndPencil
import io.github.alexzhirkevich.cupertino.icons.outlined.SquareOnSquare
import io.github.alexzhirkevich.cupertino.icons.outlined.SquareSplit1x2
import io.github.alexzhirkevich.cupertino.icons.outlined.SquareSplit2x1
import io.github.alexzhirkevich.cupertino.icons.outlined.SquareStack
import io.github.alexzhirkevich.cupertino.icons.outlined.SquareStack3dUp
import io.github.alexzhirkevich.cupertino.icons.outlined.Star
import io.github.alexzhirkevich.cupertino.icons.outlined.StarSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Staroflife
import io.github.alexzhirkevich.cupertino.icons.outlined.Sterlingsign
import io.github.alexzhirkevich.cupertino.icons.outlined.Stethoscope
import io.github.alexzhirkevich.cupertino.icons.outlined.Stop
import io.github.alexzhirkevich.cupertino.icons.outlined.StopCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.Suitcase
import io.github.alexzhirkevich.cupertino.icons.outlined.Sum
import io.github.alexzhirkevich.cupertino.icons.outlined.SunMax
import io.github.alexzhirkevich.cupertino.icons.outlined.Swift
import io.github.alexzhirkevich.cupertino.icons.outlined.Tag
import io.github.alexzhirkevich.cupertino.icons.outlined.Target
import io.github.alexzhirkevich.cupertino.icons.outlined.TennisRacket
import io.github.alexzhirkevich.cupertino.icons.outlined.Terminal
import io.github.alexzhirkevich.cupertino.icons.outlined.TextBubble
import io.github.alexzhirkevich.cupertino.icons.outlined.TextMagnifyingglass
import io.github.alexzhirkevich.cupertino.icons.outlined.Theatermasks
import io.github.alexzhirkevich.cupertino.icons.outlined.Timer
import io.github.alexzhirkevich.cupertino.icons.outlined.Touchid
import io.github.alexzhirkevich.cupertino.icons.outlined.Trash
import io.github.alexzhirkevich.cupertino.icons.outlined.TrashSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.TrayAndArrowDown
import io.github.alexzhirkevich.cupertino.icons.outlined.TrayAndArrowUp
import io.github.alexzhirkevich.cupertino.icons.outlined.Trophy
import io.github.alexzhirkevich.cupertino.icons.outlined.Tshirt
import io.github.alexzhirkevich.cupertino.icons.outlined.Tv
import io.github.alexzhirkevich.cupertino.icons.outlined.Umbrella
import io.github.alexzhirkevich.cupertino.icons.outlined.Video
import io.github.alexzhirkevich.cupertino.icons.outlined.VideoCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.VideoSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Volleyball
import io.github.alexzhirkevich.cupertino.icons.outlined.WalletPass
import io.github.alexzhirkevich.cupertino.icons.outlined.WandAndStars
import io.github.alexzhirkevich.cupertino.icons.outlined.WandAndStarsInverse
import io.github.alexzhirkevich.cupertino.icons.outlined.Waveform
import io.github.alexzhirkevich.cupertino.icons.outlined.WaveformAndMagnifyingglass
import io.github.alexzhirkevich.cupertino.icons.outlined.WaveformAndMic
import io.github.alexzhirkevich.cupertino.icons.outlined.WaveformPathEcg
import io.github.alexzhirkevich.cupertino.icons.outlined.WebCamera
import io.github.alexzhirkevich.cupertino.icons.outlined.Wifi
import io.github.alexzhirkevich.cupertino.icons.outlined.WifiExclamationmark
import io.github.alexzhirkevich.cupertino.icons.outlined.WifiRouter
import io.github.alexzhirkevich.cupertino.icons.outlined.WifiSlash
import io.github.alexzhirkevich.cupertino.icons.outlined.Wind
import io.github.alexzhirkevich.cupertino.icons.outlined.Wineglass
import io.github.alexzhirkevich.cupertino.icons.outlined.WrenchAndScrewdriver
import io.github.alexzhirkevich.cupertino.icons.outlined.Xmark
import io.github.alexzhirkevich.cupertino.icons.outlined.XmarkApp
import io.github.alexzhirkevich.cupertino.icons.outlined.XmarkBin
import io.github.alexzhirkevich.cupertino.icons.outlined.XmarkCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.XmarkIcloud
import io.github.alexzhirkevich.cupertino.icons.outlined.XmarkSeal
import io.github.alexzhirkevich.cupertino.icons.outlined.XmarkShield
import io.github.alexzhirkevich.cupertino.icons.outlined.Yensign
import io.github.alexzhirkevich.cupertino.icons.outlined.Zzz
import io.github.alexzhirkevich.cupertino.icons.outlined._4kTv

@OptIn(ExperimentalCupertinoApi::class)
@Composable
fun IconsScreen(
    component: IconsComponent
) {

    var isOutlined by remember {
        mutableStateOf(true)
    }

    val pagerState = rememberPagerState(
        pageCount = { 2 }
    )

    LaunchedEffect(isOutlined) {
        pagerState.animateScrollToPage(if (isOutlined) 0 else 1)
    }

    CupertinoScaffold(
        topBar = {
            CupertinoTopAppBar(
                navigationIcon = {

                    AdaptiveWidget(
                        cupertino = {
                            CupertinoNavigateBackButton(
                                onClick = component::onNavigateBack,
                            ) {
                                CupertinoText("Back")
                            }
                        },
                        material = {
                            IconButton(
                                onClick = component::onNavigateBack
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Back"
                                )
                            }
                        }
                    )
                },
                title = {
                    CupertinoSegmentedControl(
                        modifier = Modifier
                            .width(200.dp),
                        selectedTabIndex = if (isOutlined) 0 else 1
                    ) {
                        CupertinoSegmentedControlTab(
                            isSelected = isOutlined,
                            onClick = {
                                isOutlined = true
                            }
                        ) {
                            CupertinoText("Outlined")
                        }
                        CupertinoSegmentedControlTab(
                            isSelected = !isOutlined,
                            onClick = {
                                isOutlined = false

                            }
                        ) {
                            CupertinoText("Filled")
                        }
                    }
                }
            )
        }
    ) { pv ->

        var selectedIcon by remember {
            mutableStateOf<ImageVector?>(null)
        }
        if (selectedIcon != null) {
            CupertinoAlertDialog(
                title = {
                    CupertinoIcon(
                        imageVector = selectedIcon!!,
                        contentDescription = null
                    )
                },
                message = {
                    CupertinoText(
                        selectedIcon!!.name
                    )
                },
                onDismissRequest = {
                    selectedIcon = null
                }
            ) {
                default(onClick = {
                    selectedIcon = null
                }) {
                    CupertinoText("Close")
                }
            }
        }

        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false
        ) { page ->
            LazyVerticalGrid(
                modifier = Modifier.fillMaxSize(),
                columns = GridCells.Adaptive(48.dp),
                contentPadding = pv
            ) {
                items(if (page == 0) Outlined else Filled) {
                    CupertinoIconButton(
                        onClick = {
                            selectedIcon = it
                        }
                    ) {
                        CupertinoIcon(
                            imageVector = it,
                            contentDescription = it.name
                        )
                    }
                }
            }
        }
    }
}

private val Outlined = listOf(
    CupertinoIcons.Outlined.Airplane,
    CupertinoIcons.Outlined.AirplaneArrival,
    CupertinoIcons.Outlined.AirplaneDeparture,
    CupertinoIcons.Outlined.Airplayaudio,
    CupertinoIcons.Outlined.Airpods,
    CupertinoIcons.Outlined.AirpodsGen3,
    CupertinoIcons.Outlined.Airpodsmax,
    CupertinoIcons.Outlined.Airpodspro,
    CupertinoIcons.Outlined.Airtag,
    CupertinoIcons.Outlined.Alarm,
    CupertinoIcons.Outlined.Alt,
    CupertinoIcons.Outlined.Angle,
    CupertinoIcons.Outlined.AntennaRadiowavesLeftAndRight,
    CupertinoIcons.Outlined.AntennaRadiowavesLeftAndRightSlash,
    CupertinoIcons.Outlined.AppleLogo,
    CupertinoIcons.Outlined.Applepencil,
    CupertinoIcons.Outlined.Appletv,
    CupertinoIcons.Outlined.Applewatch,
    CupertinoIcons.Outlined.ApplewatchRadiowavesLeftAndRight,
    CupertinoIcons.Outlined.ApplewatchWatchface,
    CupertinoIcons.Outlined.Archivebox,
    CupertinoIcons.Outlined.Arrow3Trianglepath,
    CupertinoIcons.Outlined.ArrowClockwise,
    CupertinoIcons.Outlined.ArrowCounterclockwise,
    CupertinoIcons.Outlined.ArrowCounterclockwiseIcloud,
    CupertinoIcons.Outlined.ArrowDown,
    CupertinoIcons.Outlined.ArrowDownAndLineHorizontalAndArrowUp,
    CupertinoIcons.Outlined.ArrowDownCircle,
    CupertinoIcons.Outlined.ArrowDownDoc,
    CupertinoIcons.Outlined.ArrowDownRightAndArrowUpLeft,
    CupertinoIcons.Outlined.ArrowDownToLine,
    CupertinoIcons.Outlined.ArrowLeftAndRight,
    CupertinoIcons.Outlined.ArrowLeftArrowRight,
    CupertinoIcons.Outlined.ArrowTriangle2Circlepath,
    CupertinoIcons.Outlined.ArrowTriangle2CirclepathCamera,
    CupertinoIcons.Outlined.ArrowTriangleBranch,
    CupertinoIcons.Outlined.ArrowTurnDownLeft,
    CupertinoIcons.Outlined.ArrowTurnDownRight,
    CupertinoIcons.Outlined.ArrowTurnRightUp,
    CupertinoIcons.Outlined.ArrowTurnUpForwardIphone,
    CupertinoIcons.Outlined.ArrowTurnUpLeft,
    CupertinoIcons.Outlined.ArrowTurnUpRight,
    CupertinoIcons.Outlined.ArrowUpAndDown,
    CupertinoIcons.Outlined.ArrowUpArrowDown,
    CupertinoIcons.Outlined.ArrowUpDoc,
    CupertinoIcons.Outlined.ArrowUpLeftAndArrowDownRight,
    CupertinoIcons.Outlined.ArrowUturnLeft,
    CupertinoIcons.Outlined.ArrowUturnRight,
    CupertinoIcons.Outlined.ArrowshapeTurnUpLeft,
    CupertinoIcons.Outlined.ArrowshapeTurnUpLeft2,
    CupertinoIcons.Outlined.At,
    CupertinoIcons.Outlined.Backward,
    CupertinoIcons.Outlined.BackwardEnd,
    CupertinoIcons.Outlined.Bag,
    CupertinoIcons.Outlined.BagBadgeMinus,
    CupertinoIcons.Outlined.BagBadgePlus,
    CupertinoIcons.Outlined.Balloon,
    CupertinoIcons.Outlined.Bandage,
    CupertinoIcons.Outlined.Banknote,
    CupertinoIcons.Outlined.Barcode,
    CupertinoIcons.Outlined.BarcodeViewfinder,
    CupertinoIcons.Outlined.Baseball,
    CupertinoIcons.Outlined.Basket,
    CupertinoIcons.Outlined.Basketball,
    CupertinoIcons.Outlined.Battery100,
    CupertinoIcons.Outlined.BedDouble,
    CupertinoIcons.Outlined.Bell,
    CupertinoIcons.Outlined.BellAndWavesLeftAndRight,
    CupertinoIcons.Outlined.BellBadge,
    CupertinoIcons.Outlined.BellCircle,
    CupertinoIcons.Outlined.BellSlash,
    CupertinoIcons.Outlined.Bicycle,
    CupertinoIcons.Outlined.Binoculars,
    CupertinoIcons.Outlined.BirthdayCake,
    CupertinoIcons.Outlined.Bitcoinsign,
    CupertinoIcons.Outlined.Bolt,
    CupertinoIcons.Outlined.BoltHorizontal,
    CupertinoIcons.Outlined.BoltSlash,
    CupertinoIcons.Outlined.Book,
    CupertinoIcons.Outlined.BookCircle,
    CupertinoIcons.Outlined.BookClosed,
    CupertinoIcons.Outlined.Bookmark,
    CupertinoIcons.Outlined.BookmarkSlash,
    CupertinoIcons.Outlined.Brain,
    CupertinoIcons.Outlined.BrainHeadProfile,
    CupertinoIcons.Outlined.Briefcase,
    CupertinoIcons.Outlined.BubbleLeft,
    CupertinoIcons.Outlined.BubbleRight,
    CupertinoIcons.Outlined.Building,
    CupertinoIcons.Outlined.Building2,
    CupertinoIcons.Outlined.Burn,
    CupertinoIcons.Outlined.Burst,
    CupertinoIcons.Outlined.CableConnector,
    CupertinoIcons.Outlined.CableConnectorHorizontal,
    CupertinoIcons.Outlined.Calendar,
    CupertinoIcons.Outlined.CalendarBadgePlus,
    CupertinoIcons.Outlined.Camera,
    CupertinoIcons.Outlined.CameraCircle,
    CupertinoIcons.Outlined.CameraFilters,
    CupertinoIcons.Outlined.CameraViewfinder,
    CupertinoIcons.Outlined.Candybarphone,
    CupertinoIcons.Outlined.Capslock,
    CupertinoIcons.Outlined.Car,
    CupertinoIcons.Outlined.Cart,
    CupertinoIcons.Outlined.CartBadgeMinus,
    CupertinoIcons.Outlined.CartBadgePlus,
    CupertinoIcons.Outlined.Case,
    CupertinoIcons.Outlined.Centsign,
    CupertinoIcons.Outlined.Character,
    CupertinoIcons.Outlined.ChartBar,
    CupertinoIcons.Outlined.ChartLineDowntrendXyaxis,
    CupertinoIcons.Outlined.ChartLineUptrendXyaxis,
    CupertinoIcons.Outlined.CheckerboardShield,
    CupertinoIcons.Outlined.Checklist,
    CupertinoIcons.Outlined.ChecklistChecked,
    CupertinoIcons.Outlined.ChecklistUnchecked,
    CupertinoIcons.Outlined.Checkmark,
    CupertinoIcons.Outlined.CheckmarkCircle,
    CupertinoIcons.Outlined.CheckmarkIcloud,
    CupertinoIcons.Outlined.CheckmarkMessage,
    CupertinoIcons.Outlined.CheckmarkSeal,
    CupertinoIcons.Outlined.CheckmarkShield,
    CupertinoIcons.Outlined.CheckmarkSquare,
    CupertinoIcons.Outlined.ChevronBackward,
    CupertinoIcons.Outlined.ChevronDown,
    CupertinoIcons.Outlined.ChevronForward,
    CupertinoIcons.Outlined.ChevronLeftForwardslashChevronRight,
    CupertinoIcons.Outlined.ChevronUp,
    CupertinoIcons.Outlined.Clear,
    CupertinoIcons.Outlined.Clipboard,
    CupertinoIcons.Outlined.Clock,
    CupertinoIcons.Outlined.ClockArrowCirclepath,
    CupertinoIcons.Outlined.Cloud,
    CupertinoIcons.Outlined.Command,
    CupertinoIcons.Outlined.CompassDrawing,
    CupertinoIcons.Outlined.Cone,
    CupertinoIcons.Outlined.Cpu,
    CupertinoIcons.Outlined.Creditcard,
    CupertinoIcons.Outlined.CreditcardTrianglebadgeExclamationmark,
    CupertinoIcons.Outlined.Crop,
    CupertinoIcons.Outlined.CropRotate,
    CupertinoIcons.Outlined.Cross,
    CupertinoIcons.Outlined.CrossCircle,
    CupertinoIcons.Outlined.CrossVial,
    CupertinoIcons.Outlined.Crown,
    CupertinoIcons.Outlined.Cube,
    CupertinoIcons.Outlined.CupAndSaucer,
    CupertinoIcons.Outlined.Curlybraces,
    CupertinoIcons.Outlined.CursorarrowRays,
    CupertinoIcons.Outlined.DeleteLeft,
    CupertinoIcons.Outlined.DeleteRight,
    CupertinoIcons.Outlined.Desktopcomputer,
    CupertinoIcons.Outlined.Dice,
    CupertinoIcons.Outlined.Display,
    CupertinoIcons.Outlined.Divide,
    CupertinoIcons.Outlined.Doc,
    CupertinoIcons.Outlined.DocBadgeArrowUp,
    CupertinoIcons.Outlined.DocBadgePlus,
    CupertinoIcons.Outlined.DocOnDoc,
    CupertinoIcons.Outlined.DocPlaintext,
    CupertinoIcons.Outlined.DocText,
    CupertinoIcons.Outlined.DocTextMagnifyingglass,
    CupertinoIcons.Outlined.Dollarsign,
    CupertinoIcons.Outlined.DollarsignArrowCirclepath,
    CupertinoIcons.Outlined.DoorLeftHandClosed,
    CupertinoIcons.Outlined.DoorLeftHandOpen,
    CupertinoIcons.Outlined.DotRadiowavesLeftAndRight,
    CupertinoIcons.Outlined.DotRadiowavesUpForward,
    CupertinoIcons.Outlined.Drop,
    CupertinoIcons.Outlined.Ear,
    CupertinoIcons.Outlined.Earpods,
    CupertinoIcons.Outlined.Ellipsis,
    CupertinoIcons.Outlined.EllipsisBubble,
    CupertinoIcons.Outlined.EllipsisCircle,
    CupertinoIcons.Outlined.EllipsisCurlybraces,
    CupertinoIcons.Outlined.EllipsisMessage,
    CupertinoIcons.Outlined.Envelope,
    CupertinoIcons.Outlined.EnvelopeBadge,
    CupertinoIcons.Outlined.EnvelopeCircle,
    CupertinoIcons.Outlined.EnvelopeOpen,
    CupertinoIcons.Outlined.Eraser,
    CupertinoIcons.Outlined.Eurosign,
    CupertinoIcons.Outlined.Exclamationmark,
    CupertinoIcons.Outlined.Exclamationmark2,
    CupertinoIcons.Outlined.Exclamationmark3,
    CupertinoIcons.Outlined.ExclamationmarkArrowTriangle2Circlepath,
    CupertinoIcons.Outlined.ExclamationmarkCircle,
    CupertinoIcons.Outlined.ExclamationmarkIcloud,
    CupertinoIcons.Outlined.ExclamationmarkSquare,
    CupertinoIcons.Outlined.ExclamationmarkTriangle,
    CupertinoIcons.Outlined.Externaldrive,
    CupertinoIcons.Outlined.Eye,
    CupertinoIcons.Outlined.EyeSlash,
    CupertinoIcons.Outlined.Eyebrow,
    CupertinoIcons.Outlined.Eyedropper,
    CupertinoIcons.Outlined.Eyeglasses,
    CupertinoIcons.Outlined.Eyes,
    CupertinoIcons.Outlined.FaceSmiling,
    CupertinoIcons.Outlined.FaceSmilingInverse,
    CupertinoIcons.Outlined.Faceid,
    CupertinoIcons.Outlined.Facemask,
    CupertinoIcons.Outlined.Fanblades,
    CupertinoIcons.Outlined.FanbladesSlash,
    CupertinoIcons.Outlined.Fibrechannel,
    CupertinoIcons.Outlined.FigureStand,
    CupertinoIcons.Outlined.FigureWalk,
    CupertinoIcons.Outlined.Film,
    CupertinoIcons.Outlined.Flag,
    CupertinoIcons.Outlined.Flag2Crossed,
    CupertinoIcons.Outlined.FlagCheckered2Crossed,
    CupertinoIcons.Outlined.FlagSlash,
    CupertinoIcons.Outlined.Flame,
    CupertinoIcons.Outlined.Flowchart,
    CupertinoIcons.Outlined.Folder,
    CupertinoIcons.Outlined.FolderBadgePlus,
    CupertinoIcons.Outlined.Football,
    CupertinoIcons.Outlined.ForkKnife,
    CupertinoIcons.Outlined.ForkKnifeCircle,
    CupertinoIcons.Outlined.Forward,
    CupertinoIcons.Outlined.ForwardEnd,
    CupertinoIcons.Outlined.Francsign,
    CupertinoIcons.Outlined.Fuelpump,
    CupertinoIcons.Outlined.Gamecontroller,
    CupertinoIcons.Outlined.Gear,
    CupertinoIcons.Outlined.Gearshape,
    CupertinoIcons.Outlined.Gearshape2,
    CupertinoIcons.Outlined.Gift,
    CupertinoIcons.Outlined.Giftcard,
    CupertinoIcons.Outlined.GlobeDesk,
    CupertinoIcons.Outlined.Gobackward,
    CupertinoIcons.Outlined.Goforward,
    CupertinoIcons.Outlined.Graduationcap,
    CupertinoIcons.Outlined.Grid,
    CupertinoIcons.Outlined.Hammer,
    CupertinoIcons.Outlined.HandDraw,
    CupertinoIcons.Outlined.HandPointUp,
    CupertinoIcons.Outlined.HandPointUpLeft,
    CupertinoIcons.Outlined.HandRaised,
    CupertinoIcons.Outlined.HandRaisedSlash,
    CupertinoIcons.Outlined.HandTap,
    CupertinoIcons.Outlined.HandThumbsdown,
    CupertinoIcons.Outlined.HandThumbsup,
    CupertinoIcons.Outlined.HandWave,
    CupertinoIcons.Outlined.HandsSparkles,
    CupertinoIcons.Outlined.Headphones,
    CupertinoIcons.Outlined.HeadphonesCircle,
    CupertinoIcons.Outlined.Heart,
    CupertinoIcons.Outlined.HeartCircle,
    CupertinoIcons.Outlined.HeartSlash,
    CupertinoIcons.Outlined.HeartTextSquare,
    CupertinoIcons.Outlined.Hifispeaker,
    CupertinoIcons.Outlined.Highlighter,
    CupertinoIcons.Outlined.Homekit,
    CupertinoIcons.Outlined.Homepod,
    CupertinoIcons.Outlined.Homepodmini,
    CupertinoIcons.Outlined.Hourglass,
    CupertinoIcons.Outlined.House,
    CupertinoIcons.Outlined.Hryvniasign,
    CupertinoIcons.Outlined.Icloud,
    CupertinoIcons.Outlined.IcloudAndArrowDown,
    CupertinoIcons.Outlined.IcloudAndArrowUp,
    CupertinoIcons.Outlined.Infinity,
    CupertinoIcons.Outlined.Info,
    CupertinoIcons.Outlined.InfoBubble,
    CupertinoIcons.Outlined.InfoCircle,
    CupertinoIcons.Outlined.InfoSquare,
    CupertinoIcons.Outlined.Ipad,
    CupertinoIcons.Outlined.IpadAndIphone,
    CupertinoIcons.Outlined.IpadHomebutton,
    CupertinoIcons.Outlined.Iphone,
    CupertinoIcons.Outlined.IphoneBadgePlay,
    CupertinoIcons.Outlined.IphoneHomebutton,
    CupertinoIcons.Outlined.IphoneHomebuttonRadiowavesLeftAndRight,
    CupertinoIcons.Outlined.IphoneRadiowavesLeftAndRight,
    CupertinoIcons.Outlined.Key,
    CupertinoIcons.Outlined.KeyIcloud,
    CupertinoIcons.Outlined.Keyboard,
    CupertinoIcons.Outlined.Lanyardcard,
    CupertinoIcons.Outlined.Laptopcomputer,
    CupertinoIcons.Outlined.LaptopcomputerAndIpad,
    CupertinoIcons.Outlined.LaptopcomputerAndIphone,
    CupertinoIcons.Outlined.Leaf,
    CupertinoIcons.Outlined.Level,
    CupertinoIcons.Outlined.Lifepreserver,
    CupertinoIcons.Outlined.LightBeaconMax,
    CupertinoIcons.Outlined.LightMax,
    CupertinoIcons.Outlined.LightMin,
    CupertinoIcons.Outlined.Lightbulb,
    CupertinoIcons.Outlined.LightbulbSlash,
    CupertinoIcons.Outlined.Link,
    CupertinoIcons.Outlined.LinkBadgePlus,
    CupertinoIcons.Outlined.LinkCircle,
    CupertinoIcons.Outlined.Lirasign,
    CupertinoIcons.Outlined.ListBullet,
    CupertinoIcons.Outlined.ListBulletCircle,
    CupertinoIcons.Outlined.ListBulletClipboard,
    CupertinoIcons.Outlined.ListBulletIndent,
    CupertinoIcons.Outlined.ListClipboard,
    CupertinoIcons.Outlined.ListNumber,
    CupertinoIcons.Outlined.Livephoto,
    CupertinoIcons.Outlined.Location,
    CupertinoIcons.Outlined.Lock,
    CupertinoIcons.Outlined.LockCircle,
    CupertinoIcons.Outlined.LockOpen,
    CupertinoIcons.Outlined.LockSlash,
    CupertinoIcons.Outlined.Macwindow,
    CupertinoIcons.Outlined.MacwindowBadgePlus,
    CupertinoIcons.Outlined.Magazine,
    CupertinoIcons.Outlined.Mail,
    CupertinoIcons.Outlined.MailStack,
    CupertinoIcons.Outlined.Map,
    CupertinoIcons.Outlined.Mappin,
    CupertinoIcons.Outlined.MappinAndEllipse,
    CupertinoIcons.Outlined.MappinSlash,
    CupertinoIcons.Outlined.Medal,
    CupertinoIcons.Outlined.Megaphone,
    CupertinoIcons.Outlined.Memories,
    CupertinoIcons.Outlined.MenubarRectangle,
    CupertinoIcons.Outlined.Menucard,
    CupertinoIcons.Outlined.Message,
    CupertinoIcons.Outlined.MessageBadge,
    CupertinoIcons.Outlined.Mic,
    CupertinoIcons.Outlined.MicSlash,
    CupertinoIcons.Outlined.Minus,
    CupertinoIcons.Outlined.MinusCircle,
    CupertinoIcons.Outlined.MinusMagnifyingglass,
    CupertinoIcons.Outlined.Moon,
    CupertinoIcons.Outlined.MoonStars,
    CupertinoIcons.Outlined.Mount,
    CupertinoIcons.Outlined.Multiply,
    CupertinoIcons.Outlined.MusicMic,
    CupertinoIcons.Outlined.MusicNote,
    CupertinoIcons.Outlined.MusicNoteList,
    CupertinoIcons.Outlined.MusicQuarternote3,
    CupertinoIcons.Outlined.Network,
    CupertinoIcons.Outlined.Newspaper,
    CupertinoIcons.Outlined.Nosign,
    CupertinoIcons.Outlined.NoteText,
    CupertinoIcons.Outlined.NoteTextBadgePlus,
    CupertinoIcons.Outlined.Number,
    CupertinoIcons.Outlined.Opticaldisc,
    CupertinoIcons.Outlined.Option,
    CupertinoIcons.Outlined.Paintbrush,
    CupertinoIcons.Outlined.PaintbrushPointed,
    CupertinoIcons.Outlined.Paintpalette,
    CupertinoIcons.Outlined.Paperclip,
    CupertinoIcons.Outlined.PaperclipBadgeEllipsis,
    CupertinoIcons.Outlined.PaperclipCircle,
    CupertinoIcons.Outlined.Paperplane,
    CupertinoIcons.Outlined.Paragraphsign,
    CupertinoIcons.Outlined.PartyPopper,
    CupertinoIcons.Outlined.Pause,
    CupertinoIcons.Outlined.PauseCircle,
    CupertinoIcons.Outlined.Pawprint,
    CupertinoIcons.Outlined.Pencil,
    CupertinoIcons.Outlined.PencilCircle,
    CupertinoIcons.Outlined.PencilTipCropCircle,
    CupertinoIcons.Outlined.Percent,
    CupertinoIcons.Outlined.Person,
    CupertinoIcons.Outlined.Person2,
    CupertinoIcons.Outlined.PersonAndBackgroundDotted,
    CupertinoIcons.Outlined.PersonCircle,
    CupertinoIcons.Outlined.PersonCropCircle,
    CupertinoIcons.Outlined.PersonCropCircleBadgeMinus,
    CupertinoIcons.Outlined.PersonCropCircleBadgePlus,
    CupertinoIcons.Outlined.PersonCropSquare,
    CupertinoIcons.Outlined.PersonIcloud,
    CupertinoIcons.Outlined.PersonTextRectangle,
    CupertinoIcons.Outlined.PersonWave2,
    CupertinoIcons.Outlined.Personalhotspot,
    CupertinoIcons.Outlined.Phone,
    CupertinoIcons.Outlined.PhoneAndWaveform,
    CupertinoIcons.Outlined.PhoneArrowDownLeft,
    CupertinoIcons.Outlined.PhoneArrowUpRight,
    CupertinoIcons.Outlined.PhoneBadgePlus,
    CupertinoIcons.Outlined.PhoneCircle,
    CupertinoIcons.Outlined.PhoneConnection,
    CupertinoIcons.Outlined.Photo,
    CupertinoIcons.Outlined.PhotoStack,
    CupertinoIcons.Outlined.PhotoTv,
    CupertinoIcons.Outlined.Pill,
    CupertinoIcons.Outlined.Pin,
    CupertinoIcons.Outlined.PinCircle,
    CupertinoIcons.Outlined.PinSlash,
    CupertinoIcons.Outlined.Pip,
    CupertinoIcons.Outlined.PipEnter,
    CupertinoIcons.Outlined.PipExit,
    CupertinoIcons.Outlined.Play,
    CupertinoIcons.Outlined.PlayCircle,
    CupertinoIcons.Outlined.PlayDisplay,
    CupertinoIcons.Outlined.Plus,
    CupertinoIcons.Outlined.PlusApp,
    CupertinoIcons.Outlined.PlusBubble,
    CupertinoIcons.Outlined.PlusCircle,
    CupertinoIcons.Outlined.PlusMagnifyingglass,
    CupertinoIcons.Outlined.PlusMessage,
    CupertinoIcons.Outlined.PlusSquare,
    CupertinoIcons.Outlined.PlusViewfinder,
    CupertinoIcons.Outlined.Popcorn,
    CupertinoIcons.Outlined.Power,
    CupertinoIcons.Outlined.PowerCircle,
    CupertinoIcons.Outlined.Printer,
    CupertinoIcons.Outlined.Puzzlepiece,
    CupertinoIcons.Outlined.PuzzlepieceExtension,
    CupertinoIcons.Outlined.Qrcode,
    CupertinoIcons.Outlined.QrcodeViewfinder,
    CupertinoIcons.Outlined.Questionmark,
    CupertinoIcons.Outlined.QuestionmarkApp,
    CupertinoIcons.Outlined.QuestionmarkCircle,
    CupertinoIcons.Outlined.QuestionmarkFolder,
    CupertinoIcons.Outlined.QuestionmarkSquare,
    CupertinoIcons.Outlined.QuoteClosing,
    CupertinoIcons.Outlined.QuoteOpening,
    CupertinoIcons.Outlined.Rays,
    CupertinoIcons.Outlined.RecordCircle,
    CupertinoIcons.Outlined.Recordingtape,
    CupertinoIcons.Outlined.RectangleArrowtriangle2Outward,
    CupertinoIcons.Outlined.RectangleConnectedToLineBelow,
    CupertinoIcons.Outlined.RectanglePortraitAndArrowForward,
    CupertinoIcons.Outlined.RectanglePortraitArrowtriangle2Outward,
    CupertinoIcons.Outlined.RectangleStack,
    CupertinoIcons.Outlined.Repeat,
    CupertinoIcons.Outlined.Rosette,
    CupertinoIcons.Outlined.Rotate3d,
    CupertinoIcons.Outlined.RotateLeft,
    CupertinoIcons.Outlined.RotateRight,
    CupertinoIcons.Outlined.Rublesign,
    CupertinoIcons.Outlined.Ruler,
    CupertinoIcons.Outlined.Safari,
    CupertinoIcons.Outlined.Scalemass,
    CupertinoIcons.Outlined.Scissors,
    CupertinoIcons.Outlined.Scope,
    CupertinoIcons.Outlined.Scribble,
    CupertinoIcons.Outlined.ScribbleVariable,
    CupertinoIcons.Outlined.Scroll,
    CupertinoIcons.Outlined.ServerRack,
    CupertinoIcons.Outlined.Shareplay,
    CupertinoIcons.Outlined.ShareplaySlash,
    CupertinoIcons.Outlined.ShazamLogo,
    CupertinoIcons.Outlined.Shield,
    CupertinoIcons.Outlined.ShieldSlash,
    CupertinoIcons.Outlined.Shippingbox,
    CupertinoIcons.Outlined.Shuffle,
    CupertinoIcons.Outlined.SidebarLeft,
    CupertinoIcons.Outlined.SidebarRight,
    CupertinoIcons.Outlined.Simcard,
    CupertinoIcons.Outlined.Skew,
    CupertinoIcons.Outlined.SliderHorizontal3,
    CupertinoIcons.Outlined.SliderVertical3,
    CupertinoIcons.Outlined.Snowflake,
    CupertinoIcons.Outlined.Soccerball,
    CupertinoIcons.Outlined.Space,
    CupertinoIcons.Outlined.Sparkle,
    CupertinoIcons.Outlined.Sparkles,
    CupertinoIcons.Outlined.Speaker,
    CupertinoIcons.Outlined.SpeakerMinus,
    CupertinoIcons.Outlined.SpeakerPlus,
    CupertinoIcons.Outlined.SpeakerSlash,
    CupertinoIcons.Outlined.SpeakerWave2,
    CupertinoIcons.Outlined.Speedometer,
    CupertinoIcons.Outlined.Square3Layers3dDownLeft,
    CupertinoIcons.Outlined.Square3Layers3dDownRight,
    CupertinoIcons.Outlined.SquareAndArrowUp,
    CupertinoIcons.Outlined.SquareAndPencil,
    CupertinoIcons.Outlined.SquareOnSquare,
    CupertinoIcons.Outlined.SquareSplit1x2,
    CupertinoIcons.Outlined.SquareSplit2x1,
    CupertinoIcons.Outlined.SquareStack,
    CupertinoIcons.Outlined.SquareStack3dUp,
    CupertinoIcons.Outlined.Star,
    CupertinoIcons.Outlined.StarSlash,
    CupertinoIcons.Outlined.Staroflife,
    CupertinoIcons.Outlined.Sterlingsign,
    CupertinoIcons.Outlined.Stethoscope,
    CupertinoIcons.Outlined.Stop,
    CupertinoIcons.Outlined.StopCircle,
    CupertinoIcons.Outlined.Suitcase,
    CupertinoIcons.Outlined.Sum,
    CupertinoIcons.Outlined.SunMax,
    CupertinoIcons.Outlined.Swift,
    CupertinoIcons.Outlined.Tag,
    CupertinoIcons.Outlined.Target,
    CupertinoIcons.Outlined.TennisRacket,
    CupertinoIcons.Outlined.Terminal,
    CupertinoIcons.Outlined.TextBubble,
    CupertinoIcons.Outlined.TextMagnifyingglass,
    CupertinoIcons.Outlined.Theatermasks,
    CupertinoIcons.Outlined.Timer,
    CupertinoIcons.Outlined.Touchid,
    CupertinoIcons.Outlined.Trash,
    CupertinoIcons.Outlined.TrashSlash,
    CupertinoIcons.Outlined.TrayAndArrowDown,
    CupertinoIcons.Outlined.TrayAndArrowUp,
    CupertinoIcons.Outlined.Trophy,
    CupertinoIcons.Outlined.Tshirt,
    CupertinoIcons.Outlined.Tv,
    CupertinoIcons.Outlined.Umbrella,
    CupertinoIcons.Outlined.Video,
    CupertinoIcons.Outlined.VideoCircle,
    CupertinoIcons.Outlined.VideoSlash,
    CupertinoIcons.Outlined.Volleyball,
    CupertinoIcons.Outlined.WalletPass,
    CupertinoIcons.Outlined.WandAndStars,
    CupertinoIcons.Outlined.WandAndStarsInverse,
    CupertinoIcons.Outlined.Waveform,
    CupertinoIcons.Outlined.WaveformAndMagnifyingglass,
    CupertinoIcons.Outlined.WaveformAndMic,
    CupertinoIcons.Outlined.WaveformPathEcg,
    CupertinoIcons.Outlined.WebCamera,
    CupertinoIcons.Outlined.Wifi,
    CupertinoIcons.Outlined.WifiExclamationmark,
    CupertinoIcons.Outlined.WifiRouter,
    CupertinoIcons.Outlined.WifiSlash,
    CupertinoIcons.Outlined.Wind,
    CupertinoIcons.Outlined.Wineglass,
    CupertinoIcons.Outlined.WrenchAndScrewdriver,
    CupertinoIcons.Outlined.Xmark,
    CupertinoIcons.Outlined.XmarkApp,
    CupertinoIcons.Outlined.XmarkBin,
    CupertinoIcons.Outlined.XmarkCircle,
    CupertinoIcons.Outlined.XmarkIcloud,
    CupertinoIcons.Outlined.XmarkSeal,
    CupertinoIcons.Outlined.XmarkShield,
    CupertinoIcons.Outlined.Yensign,
    CupertinoIcons.Outlined.Zzz,
    CupertinoIcons.Outlined._4kTv,
)

private val Filled = listOf(
    CupertinoIcons.Filled.Airtag,
    CupertinoIcons.Filled.Alarm,
    CupertinoIcons.Filled.Appletv,
    CupertinoIcons.Filled.Archivebox,
    CupertinoIcons.Filled.ArrowClockwiseCircle,
    CupertinoIcons.Filled.ArrowCounterclockwiseCircle,
    CupertinoIcons.Filled.ArrowCounterclockwiseIcloud,
    CupertinoIcons.Filled.ArrowDownCircle,
    CupertinoIcons.Filled.ArrowDownDoc,
    CupertinoIcons.Filled.ArrowTriangle2CirclepathCamera,
    CupertinoIcons.Filled.ArrowTriangle2CirclepathCircle,
    CupertinoIcons.Filled.ArrowTurnUpForwardIphone,
    CupertinoIcons.Filled.ArrowUpDoc,
    CupertinoIcons.Filled.ArrowshapeTurnUpLeft,
    CupertinoIcons.Filled.ArrowshapeTurnUpLeft2,
    CupertinoIcons.Filled.Backward,
    CupertinoIcons.Filled.BackwardEnd,
    CupertinoIcons.Filled.Bag,
    CupertinoIcons.Filled.BagBadgeMinus,
    CupertinoIcons.Filled.BagBadgePlus,
    CupertinoIcons.Filled.Balloon,
    CupertinoIcons.Filled.Bandage,
    CupertinoIcons.Filled.Banknote,
    CupertinoIcons.Filled.Baseball,
    CupertinoIcons.Filled.Basket,
    CupertinoIcons.Filled.Basketball,
    CupertinoIcons.Filled.BedDouble,
    CupertinoIcons.Filled.Bell,
    CupertinoIcons.Filled.BellAndWavesLeftAndRight,
    CupertinoIcons.Filled.BellBadge,
    CupertinoIcons.Filled.BellCircle,
    CupertinoIcons.Filled.BellSlash,
    CupertinoIcons.Filled.Binoculars,
    CupertinoIcons.Filled.BirthdayCake,
    CupertinoIcons.Filled.Bolt,
    CupertinoIcons.Filled.BoltHorizontal,
    CupertinoIcons.Filled.BoltSlash,
    CupertinoIcons.Filled.Book,
    CupertinoIcons.Filled.BookCircle,
    CupertinoIcons.Filled.BookClosed,
    CupertinoIcons.Filled.Bookmark,
    CupertinoIcons.Filled.BookmarkSlash,
    CupertinoIcons.Filled.Briefcase,
    CupertinoIcons.Filled.BubbleLeft,
    CupertinoIcons.Filled.BubbleRight,
    CupertinoIcons.Filled.Building,
    CupertinoIcons.Filled.Building2,
    CupertinoIcons.Filled.Burst,
    CupertinoIcons.Filled.Camera,
    CupertinoIcons.Filled.CameraCircle,
    CupertinoIcons.Filled.Capslock,
    CupertinoIcons.Filled.Car,
    CupertinoIcons.Filled.Cart,
    CupertinoIcons.Filled.CartBadgeMinus,
    CupertinoIcons.Filled.CartBadgePlus,
    CupertinoIcons.Filled.Case,
    CupertinoIcons.Filled.ChartBar,
    CupertinoIcons.Filled.CheckmarkCircle,
    CupertinoIcons.Filled.CheckmarkIcloud,
    CupertinoIcons.Filled.CheckmarkMessage,
    CupertinoIcons.Filled.CheckmarkSeal,
    CupertinoIcons.Filled.CheckmarkShield,
    CupertinoIcons.Filled.CheckmarkSquare,
    CupertinoIcons.Filled.CircleLefthalfed,
    CupertinoIcons.Filled.CircleRighthalfed,
    CupertinoIcons.Filled.Clear,
    CupertinoIcons.Filled.Clipboard,
    CupertinoIcons.Filled.Clock,
    CupertinoIcons.Filled.Cloud,
    CupertinoIcons.Filled.Cone,
    CupertinoIcons.Filled.Cpu,
    CupertinoIcons.Filled.Creditcard,
    CupertinoIcons.Filled.Cross,
    CupertinoIcons.Filled.CrossCircle,
    CupertinoIcons.Filled.CrossVial,
    CupertinoIcons.Filled.Crown,
    CupertinoIcons.Filled.Cube,
    CupertinoIcons.Filled.CupAndSaucer,
    CupertinoIcons.Filled.DeleteLeft,
    CupertinoIcons.Filled.DeleteRight,
    CupertinoIcons.Filled.Dice,
    CupertinoIcons.Filled.Doc,
    CupertinoIcons.Filled.DocBadgeArrowUp,
    CupertinoIcons.Filled.DocBadgePlus,
    CupertinoIcons.Filled.DocOnDoc,
    CupertinoIcons.Filled.DocPlaintext,
    CupertinoIcons.Filled.DocText,
    CupertinoIcons.Filled.Drop,
    CupertinoIcons.Filled.Ear,
    CupertinoIcons.Filled.EllipsisBubble,
    CupertinoIcons.Filled.EllipsisCircle,
    CupertinoIcons.Filled.EllipsisMessage,
    CupertinoIcons.Filled.Envelope,
    CupertinoIcons.Filled.EnvelopeBadge,
    CupertinoIcons.Filled.EnvelopeCircle,
    CupertinoIcons.Filled.EnvelopeOpen,
    CupertinoIcons.Filled.Eraser,
    CupertinoIcons.Filled.ExclamationmarkCircle,
    CupertinoIcons.Filled.ExclamationmarkIcloud,
    CupertinoIcons.Filled.ExclamationmarkSquare,
    CupertinoIcons.Filled.ExclamationmarkTriangle,
    CupertinoIcons.Filled.Externaldrive,
    CupertinoIcons.Filled.Eye,
    CupertinoIcons.Filled.EyeSlash,
    CupertinoIcons.Filled.Facemask,
    CupertinoIcons.Filled.Fanblades,
    CupertinoIcons.Filled.FanbladesSlash,
    CupertinoIcons.Filled.Film,
    CupertinoIcons.Filled.Flag,
    CupertinoIcons.Filled.Flag2Crossed,
    CupertinoIcons.Filled.FlagSlash,
    CupertinoIcons.Filled.Flame,
    CupertinoIcons.Filled.Folder,
    CupertinoIcons.Filled.FolderBadgePlus,
    CupertinoIcons.Filled.Football,
    CupertinoIcons.Filled.ForkKnifeCircle,
    CupertinoIcons.Filled.Forward,
    CupertinoIcons.Filled.ForwardEnd,
    CupertinoIcons.Filled.Fuelpump,
    CupertinoIcons.Filled.Gamecontroller,
    CupertinoIcons.Filled.Gearshape,
    CupertinoIcons.Filled.Gearshape2,
    CupertinoIcons.Filled.Gift,
    CupertinoIcons.Filled.Giftcard,
    CupertinoIcons.Filled.GlobeDesk,
    CupertinoIcons.Filled.Graduationcap,
    CupertinoIcons.Filled.Hammer,
    CupertinoIcons.Filled.HandDraw,
    CupertinoIcons.Filled.HandPointUp,
    CupertinoIcons.Filled.HandPointUpLeft,
    CupertinoIcons.Filled.HandRaised,
    CupertinoIcons.Filled.HandRaisedSlash,
    CupertinoIcons.Filled.HandTap,
    CupertinoIcons.Filled.HandThumbsdown,
    CupertinoIcons.Filled.HandThumbsup,
    CupertinoIcons.Filled.HandWave,
    CupertinoIcons.Filled.HandsSparkles,
    CupertinoIcons.Filled.HeadphonesCircle,
    CupertinoIcons.Filled.Heart,
    CupertinoIcons.Filled.HeartCircle,
    CupertinoIcons.Filled.HeartSlash,
    CupertinoIcons.Filled.HeartTextSquare,
    CupertinoIcons.Filled.Hifispeaker,
    CupertinoIcons.Filled.Homepod,
    CupertinoIcons.Filled.Homepodmini,
    CupertinoIcons.Filled.House,
    CupertinoIcons.Filled.Icloud,
    CupertinoIcons.Filled.IcloudAndArrowDown,
    CupertinoIcons.Filled.IcloudAndArrowUp,
    CupertinoIcons.Filled.InfoBubble,
    CupertinoIcons.Filled.InfoCircle,
    CupertinoIcons.Filled.InfoSquare,
    CupertinoIcons.Filled.Key,
    CupertinoIcons.Filled.KeyIcloud,
    CupertinoIcons.Filled.Keyboard,
    CupertinoIcons.Filled.Lanyardcard,
    CupertinoIcons.Filled.Leaf,
    CupertinoIcons.Filled.Level,
    CupertinoIcons.Filled.Lifepreserver,
    CupertinoIcons.Filled.LightBeaconMax,
    CupertinoIcons.Filled.Lightbulb,
    CupertinoIcons.Filled.LightbulbSlash,
    CupertinoIcons.Filled.LinkCircle,
    CupertinoIcons.Filled.ListBulletCircle,
    CupertinoIcons.Filled.ListBulletClipboard,
    CupertinoIcons.Filled.ListClipboard,
    CupertinoIcons.Filled.Location,
    CupertinoIcons.Filled.Lock,
    CupertinoIcons.Filled.LockCircle,
    CupertinoIcons.Filled.LockOpen,
    CupertinoIcons.Filled.LockSlash,
    CupertinoIcons.Filled.Magazine,
    CupertinoIcons.Filled.Mail,
    CupertinoIcons.Filled.MailStack,
    CupertinoIcons.Filled.Map,
    CupertinoIcons.Filled.Medal,
    CupertinoIcons.Filled.Megaphone,
    CupertinoIcons.Filled.Menucard,
    CupertinoIcons.Filled.Message,
    CupertinoIcons.Filled.MessageBadgeed,
    CupertinoIcons.Filled.Mic,
    CupertinoIcons.Filled.MicSlash,
    CupertinoIcons.Filled.MinusCircle,
    CupertinoIcons.Filled.Moon,
    CupertinoIcons.Filled.MoonStars,
    CupertinoIcons.Filled.Mount,
    CupertinoIcons.Filled.Newspaper,
    CupertinoIcons.Filled.Opticaldisc,
    CupertinoIcons.Filled.Paintbrush,
    CupertinoIcons.Filled.PaintbrushPointed,
    CupertinoIcons.Filled.Paintpalette,
    CupertinoIcons.Filled.PaperclipCircle,
    CupertinoIcons.Filled.Paperplane,
    CupertinoIcons.Filled.PartyPopper,
    CupertinoIcons.Filled.Pause,
    CupertinoIcons.Filled.PauseCircle,
    CupertinoIcons.Filled.Pawprint,
    CupertinoIcons.Filled.PencilCircle,
    CupertinoIcons.Filled.Person,
    CupertinoIcons.Filled.Person2,
    CupertinoIcons.Filled.PersonCircle,
    CupertinoIcons.Filled.PersonCropCircle,
    CupertinoIcons.Filled.PersonCropCircleBadgeMinus,
    CupertinoIcons.Filled.PersonCropCircleBadgePlus,
    CupertinoIcons.Filled.PersonCropSquare,
    CupertinoIcons.Filled.PersonIcloud,
    CupertinoIcons.Filled.PersonTextRectangle,
    CupertinoIcons.Filled.PersonViewfinder,
    CupertinoIcons.Filled.PersonWave2,
    CupertinoIcons.Filled.Phone,
    CupertinoIcons.Filled.PhoneAndWaveform,
    CupertinoIcons.Filled.PhoneArrowDownLeft,
    CupertinoIcons.Filled.PhoneArrowUpRight,
    CupertinoIcons.Filled.PhoneBadgePlus,
    CupertinoIcons.Filled.PhoneCircle,
    CupertinoIcons.Filled.PhoneConnection,
    CupertinoIcons.Filled.Photo,
    CupertinoIcons.Filled.PhotoStack,
    CupertinoIcons.Filled.Pill,
    CupertinoIcons.Filled.Pin,
    CupertinoIcons.Filled.PinCircle,
    CupertinoIcons.Filled.PinSlash,
    CupertinoIcons.Filled.Pip,
    CupertinoIcons.Filled.Play,
    CupertinoIcons.Filled.PlayCircle,
    CupertinoIcons.Filled.PlusApp,
    CupertinoIcons.Filled.PlusBubble,
    CupertinoIcons.Filled.PlusCircle,
    CupertinoIcons.Filled.PlusMessage,
    CupertinoIcons.Filled.PlusSquare,
    CupertinoIcons.Filled.Popcorn,
    CupertinoIcons.Filled.PowerCircle,
    CupertinoIcons.Filled.Printer,
    CupertinoIcons.Filled.Puzzlepiece,
    CupertinoIcons.Filled.PuzzlepieceExtension,
    CupertinoIcons.Filled.QuestionmarkApp,
    CupertinoIcons.Filled.QuestionmarkCircle,
    CupertinoIcons.Filled.QuestionmarkFolder,
    CupertinoIcons.Filled.QuestionmarkSquare,
    CupertinoIcons.Filled.RecordCircle,
    CupertinoIcons.Filled.RectanglePortraitAndArrowForward,
    CupertinoIcons.Filled.RectangleStack,
    CupertinoIcons.Filled.RotateLeft,
    CupertinoIcons.Filled.RotateRight,
    CupertinoIcons.Filled.Ruler,
    CupertinoIcons.Filled.Safari,
    CupertinoIcons.Filled.Scalemass,
    CupertinoIcons.Filled.Scroll,
    CupertinoIcons.Filled.ShazamLogo,
    CupertinoIcons.Filled.Shield,
    CupertinoIcons.Filled.ShieldLefthalfed,
    CupertinoIcons.Filled.ShieldRighthalfed,
    CupertinoIcons.Filled.ShieldSlash,
    CupertinoIcons.Filled.Shippingbox,
    CupertinoIcons.Filled.Shoeprints,
    CupertinoIcons.Filled.Simcard,
    CupertinoIcons.Filled.SmallcircleedCircle,
    CupertinoIcons.Filled.Speaker,
    CupertinoIcons.Filled.SpeakerMinus,
    CupertinoIcons.Filled.SpeakerPlus,
    CupertinoIcons.Filled.SpeakerSlash,
    CupertinoIcons.Filled.SpeakerWave2,
    CupertinoIcons.Filled.SquareAndArrowUp,
    CupertinoIcons.Filled.SquareBottomthirdInseted,
    CupertinoIcons.Filled.SquareOnSquare,
    CupertinoIcons.Filled.SquareSplit1x2,
    CupertinoIcons.Filled.SquareSplit2x1,
    CupertinoIcons.Filled.SquareStack,
    CupertinoIcons.Filled.SquareStack3dUp,
    CupertinoIcons.Filled.SquareTopthirdInseted,
    CupertinoIcons.Filled.Star,
    CupertinoIcons.Filled.StarLeadinghalfed,
    CupertinoIcons.Filled.StarSlash,
    CupertinoIcons.Filled.Staroflife,
    CupertinoIcons.Filled.Stop,
    CupertinoIcons.Filled.StopCircle,
    CupertinoIcons.Filled.Suitcase,
    CupertinoIcons.Filled.SunMax,
    CupertinoIcons.Filled.Tag,
    CupertinoIcons.Filled.Terminal,
    CupertinoIcons.Filled.TextBubble,
    CupertinoIcons.Filled.Theatermasks,
    CupertinoIcons.Filled.Trash,
    CupertinoIcons.Filled.TrashSlash,
    CupertinoIcons.Filled.TrayAndArrowDown,
    CupertinoIcons.Filled.TrayAndArrowUp,
    CupertinoIcons.Filled.Trophy,
    CupertinoIcons.Filled.Tshirt,
    CupertinoIcons.Filled.Tv,
    CupertinoIcons.Filled.TvAndHifispeaker,
    CupertinoIcons.Filled.Umbrella,
    CupertinoIcons.Filled.Video,
    CupertinoIcons.Filled.VideoCircle,
    CupertinoIcons.Filled.VideoSlash,
    CupertinoIcons.Filled.Volleyball,
    CupertinoIcons.Filled.WalletPass,
    CupertinoIcons.Filled.WebCamera,
    CupertinoIcons.Filled.WifiRouter,
    CupertinoIcons.Filled.Wineglass,
    CupertinoIcons.Filled.XmarkApp,
    CupertinoIcons.Filled.XmarkBin,
    CupertinoIcons.Filled.XmarkCircle,
    CupertinoIcons.Filled.XmarkIcloud,
    CupertinoIcons.Filled.XmarkSeal,
    CupertinoIcons.Filled.XmarkShield,
    CupertinoIcons.Filled._4kTv,
)