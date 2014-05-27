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
package com.ait.toolkit.titanium.mobile.client.cloud.keyvalues;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * Provides methods for accessing ACS Key-Values storage.
 * 
 */
public class KeyValues extends TiModule {

    private static final KeyValues INSTANCE = new KeyValues();

    public static KeyValues get() {
        return INSTANCE;
    }

    private KeyValues() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeKeyValues();
    }

}
