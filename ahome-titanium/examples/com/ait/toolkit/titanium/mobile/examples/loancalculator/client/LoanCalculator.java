package com.ait.toolkit.titanium.mobile.examples.loancalculator.client;

import com.ait.toolkit.titanium.mobile.examples.mobile.client.core.TiEntryPoint;
import com.ait.toolkit.titanium.mobile.examples.mobile.client.ui.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class LoanCalculator extends TiEntryPoint {

    @Override
    public void onStart() {

        Window w = new Window();
        w.setBackgroundColor(com.ait.toolkit.titanium.mobile.examples.core.client.Color.WHITE.getValue());
        HelloUiBinder h = new HelloUiBinder();
        w.add(h);
        w.open();

    }

}