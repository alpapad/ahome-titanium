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
package com.ait.toolkit.titanium.mobile2.client.core;

import com.ait.toolkit.titanium.mobile2.client.events.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Peer class for {@link EventDispatcher}
 */
public class NativePeer extends JavaScriptObject {

    protected NativePeer() {

    }

    public final native void addEventListener(String event, JavaScriptObject listener) /*-{
		this.addEventListener(event, listener);
    }-*/;

    public final native void removeEventListener(String event, JavaScriptObject listener) /*-{
		this.removeEventListener(event, listener);
    }-*/;

    public final native void addEventHandler(String event, EventHandler handler)/*-{
		Ti.API.info('Inside eventHandler');
		Ti.API.info(this + "");
		Ti.API.info('Done :' + event);
		this.addEventListener(event, function(e) {
			Ti.API.info('Called eventHandler');
			//handler.@com.ait.toolkit.titanium.mobile2.client.events.EventHandler::onEvent()();
		});
    }-*/;

}
