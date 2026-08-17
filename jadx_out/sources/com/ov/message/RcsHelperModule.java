package com.ov.message;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class RcsHelperModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RcsHelperModule";
    private final ReactApplicationContext reactContext;
    private static final String[] RCS_PACKAGES = {"com.google.android.apps.messaging", "com.samsung.android.messaging", "com.huawei.rcs"};
    private static final String[] RCS_LABELS = {"Google Messages", "Samsung Messages", "Huawei RCS"};

    public RcsHelperModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void getInstalledRcsApps(Promise promise) {
        try {
            PackageManager packageManager = this.reactContext.getPackageManager();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            int i10 = 0;
            while (true) {
                String[] strArr = RCS_PACKAGES;
                if (i10 >= strArr.length) {
                    promise.resolve(writableArrayCreateArray);
                    return;
                }
                try {
                    packageManager.getPackageInfo(strArr[i10], 0);
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("packageName", strArr[i10]);
                    String[] strArr2 = RCS_LABELS;
                    writableMapCreateMap.putString("label", strArr2[i10]);
                    writableArrayCreateArray.pushMap(writableMapCreateMap);
                    String str = strArr2[i10];
                } catch (PackageManager.NameNotFoundException unused) {
                }
                i10++;
            }
        } catch (Exception e10) {
            promise.reject("RCS_CHECK_ERROR", e10.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void openRcsAppSettings(String str, Promise promise) {
        try {
            Intent launchIntentForPackage = this.reactContext.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                this.reactContext.startActivity(launchIntentForPackage);
                promise.resolve(Boolean.TRUE);
                return;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + str));
            intent.addFlags(268435456);
            this.reactContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("RCS_OPEN_ERROR", e10.getMessage());
        }
    }
}
