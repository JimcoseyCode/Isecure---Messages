package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.C2306t;
import com.swmansion.worklets.WorkletsPackage;
import expo.modules.ExpoModulesPackage;
import java.util.ArrayList;
import java.util.Arrays;
import n6.C2980c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new com.reactnativecommunity.asyncstorage.i(), new ExpoModulesPackage(), new Z6.i(), new I6.e(), new A9.a(), new com.reactnativekeyboardcontroller.b(), new C2980c(), new com.reactnativepagerview.c(), new F6.a(), new o6.b(), new ReanimatedPackage(), new G6.c(), new com.th3rdwave.safeareacontext.e(), new C2306t(), new SvgPackage(), new WorkletsPackage()));
    }

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }
}
