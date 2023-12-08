#!/bin/sh
#
# Copyright (c) 2023 Compose Cupertino project and open source contributors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

rm -rf .idea
./gradlew clean
rm -rf .gradle
rm -rf build
rm -rf */build
rm -rf iosApp/iosApp.xcworkspace
rm -rf iosApp/Pods
rm -rf iosApp/iosApp.xcodeproj/project.xcworkspace
rm -rf iosApp/iosApp.xcodeproj/xcuserdata 
