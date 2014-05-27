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
package com.ait.toolkit.titanium.mobile2.client.ui;

import com.ait.toolkit.titanium.mobile2.client.core.EventDispatcher;
import com.ait.toolkit.titanium.mobile2.client.core.NativePeer;

public class Button extends EventDispatcher {

    private ButtonPeer peer;

    public Button() {
        createPeer();
    }

    public Button(String title) {
        this();
        setTitle(title);
    }

    public void setTitle(String title) {
        peer.setTitle(title);
    }

    public void createPeer() {
        peer = createButton();
    }

    public static native ButtonPeer createButton()/*-{
		return Ti.UI.createButton();
    }-*/;

    @Override
    public NativePeer getPeer() {
        return this.peer;
    }

}
