package com.swmansion.reanimated;

import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class DevMenuUtils {
    public static void addDevMenuOption(ReactApplicationContext reactApplicationContext, DevOptionHandler devOptionHandler) {
        if (reactApplicationContext.getApplicationContext() instanceof ReactApplication) {
            DevSupportManager devSupportManager = ((ReactApplication) reactApplicationContext.getApplicationContext()).getReactHost().getDevSupportManager();
            if (devSupportManager == null) {
                throw new RuntimeException("[Reanimated] DevSupportManager is not available");
            }
            devSupportManager.addCustomDevOption("Toggle slow animations (Reanimated)", devOptionHandler);
        }
    }
}
