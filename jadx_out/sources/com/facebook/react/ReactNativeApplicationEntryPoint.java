package com.facebook.react;

import android.content.Context;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ReactNativeApplicationEntryPoint {
    public static void loadReactNative(Context context) {
        try {
            SoLoader.l(context, OpenSourceMergedSoMapping.INSTANCE);
            DefaultNewArchitectureEntryPoint.load();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
