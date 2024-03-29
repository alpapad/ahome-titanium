/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui.interfaces;

import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DoubleTapHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SingleTapHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TwoFingerTapHandler;

public interface HasTapHandlers {

    public CallbackRegistration addDoubleTapHandler(DoubleTapHandler handler);

    public CallbackRegistration addSingleTapHandler(SingleTapHandler handler);

    public CallbackRegistration addTwoFingerTapHandler(TwoFingerTapHandler handler);

}