package com.ov.message;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class PairingAuthModule extends ReactContextBaseJavaModule {
    private static final String KEY_EXPIRES_AT = "pairing_auth_expires_at";
    private static final String PREFS_NAME = "OVMessagePrefs";

    public PairingAuthModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static boolean isAuthorized(Context context) {
        try {
            long j10 = context.getSharedPreferences(PREFS_NAME, 0).getLong(KEY_EXPIRES_AT, 0L);
            if (j10 <= 0) {
                return false;
            }
            if (System.currentTimeMillis() < j10) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @ReactMethod
    public void clear(Promise promise) {
        try {
            getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).edit().remove(KEY_EXPIRES_AT).apply();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("CLEAR_ERROR", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PairingAuth";
    }

    @ReactMethod
    public void setExpiresAt(double d10, Promise promise) {
        try {
            getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).edit().putLong(KEY_EXPIRES_AT, (long) d10).apply();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("SET_ERROR", e10);
        }
    }
}
