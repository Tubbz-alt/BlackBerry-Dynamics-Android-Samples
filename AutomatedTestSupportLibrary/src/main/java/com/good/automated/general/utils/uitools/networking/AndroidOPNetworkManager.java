/* Copyright (c) 2017 - 2020 BlackBerry Limited.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/

package com.good.automated.general.utils.uitools.networking;

import androidx.test.uiautomator.UiSelector;
import android.widget.Switch;

/**
 * {@link UiNetworkManager} for Android P (API 28) devices with Android Nougat.
 */
class AndroidOPNetworkManager extends UiNetworkManager {

    private static final int SWITCH_ELEMENT_ORDINAL_NUMBER = 1;

    AndroidOPNetworkManager() {
    }

    /**
     * Method locates the switch for changing the Airplane mode state on the screen.
     * For Samsung devices with Android Nougat installed  screen that contains Airplane mode settings can be opened in the next way:
     * Settings->Connections.
     * <p>
     * This screen contains two elements of a type Switch:
     * 0 - WiFi switch
     * 1 - Flight mode switch
     * <p>
     * This method creates a selector for the second element of a type Switch on the current screen.
     *
     * @return selector for the switch which enables and disables the airplane (flight) mode
     */
    @Override
    protected UiSelector locateSelectorForAirplaneModeSwitch() {
        return new UiSelector().className(Switch.class).instance(SWITCH_ELEMENT_ORDINAL_NUMBER);
    }
}
