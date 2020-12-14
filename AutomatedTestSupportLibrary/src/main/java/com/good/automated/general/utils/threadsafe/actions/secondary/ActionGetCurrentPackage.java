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

package com.good.automated.general.utils.threadsafe.actions.secondary;

import androidx.test.uiautomator.UiDevice;
import android.util.Pair;

import com.good.automated.general.utils.threadsafe.actions.ActionPriority;
import com.good.automated.general.utils.threadsafe.actions.UiDeviceBasedAbstractAction;

public class ActionGetCurrentPackage extends UiDeviceBasedAbstractAction<String> {

    public ActionGetCurrentPackage(UiDevice uiDevice) {
        super(uiDevice);
    }

    @Override
    public Pair<Boolean, String> doAction() {
        String currentPackage = getUiDevice().getCurrentPackageName();
        return Pair.create(true, currentPackage);
    }

    @Override
    public ActionPriority getPriority() {
        return ActionPriority.PRIORITY_SECONDARY;
    }
}
