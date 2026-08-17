package com.ov.message;

import android.app.Activity;
import android.content.SharedPreferences;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SecureWindowModule extends ReactContextBaseJavaModule {
    private static final String KEY_SECURE_WINDOW = "secure_window_enabled";
    private static final String PREFS_NAME = "OVMessagePrefs";

    public SecureWindowModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static /* synthetic */ void a(boolean z10, Activity activity) {
        if (z10) {
            activity.getWindow().addFlags(8192);
        } else {
            activity.getWindow().clearFlags(8192);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SecureWindow";
    }

    @ReactMethod
    public void isSecureMode(Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).getBoolean(KEY_SECURE_WINDOW, false)));
        } catch (Exception e10) {
            promise.reject("SECURE_WINDOW_ERROR", e10);
        }
    }

    @ReactMethod
    public void setLoginPasswordEnabled(boolean z10, Promise promise) {
        try {
            SharedPreferences.Editor editorEdit = getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).edit();
            editorEdit.putBoolean("login_password_enabled", z10);
            editorEdit.apply();
            promise.resolve(Boolean.valueOf(z10));
        } catch (Exception e10) {
            promise.reject("PREFS_ERROR", e10);
        }
    }

    @ReactMethod
    public void setSecureMode(final boolean z10, Promise promise) {
        try {
            SharedPreferences.Editor editorEdit = getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).edit();
            editorEdit.putBoolean(KEY_SECURE_WINDOW, z10);
            editorEdit.apply();
            final Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.ov.message.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        SecureWindowModule.a(z10, currentActivity);
                    }
                });
            }
            promise.resolve(Boolean.valueOf(z10));
        } catch (Exception e10) {
            promise.reject("SECURE_WINDOW_ERROR", e10);
        }
    }
}
