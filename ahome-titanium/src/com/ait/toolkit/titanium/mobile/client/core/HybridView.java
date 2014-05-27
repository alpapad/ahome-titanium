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
package com.ait.toolkit.titanium.mobile.client.core;

import com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.UIEventHandler;
import com.ait.toolkit.titanium.mobile.client.ui.WebView;
import com.ait.toolkit.titanium.mobile.client.ui.Window;

public class HybridView {

	private static HybridView INSTANCE;
	private WebView view;

	private static HybridView _get() {
		if (INSTANCE == null) {
			INSTANCE = new HybridView();
		}
		return INSTANCE;
	}

	public static HybridView getDefault() {
		return _get().setHostPage("index.html");
	}

	public static HybridView get(String url) {
		return _get().setHostPage(url);
	}

	private HybridView() {
		view = new WebView();
	}

	private HybridView setHostPage(String url) {
		assert url != null;
		view.setUrl(url);
		return this;
	}

	public HybridView setContainer(final Window parent) {
		assert parent != null;
		parent.addOpenHandler(new UIEventHandler() {
			@Override
			public void onEvent(UIEvent event) {
				parent.add(view);
			}
		});
		return this;
	}
}
