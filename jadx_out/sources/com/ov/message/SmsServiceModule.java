package com.ov.message;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsServiceModule extends ReactContextBaseJavaModule {
    private static final String FORTRESS_MODE_KEY = "fortress_mode_enabled";
    private static final String NOTIFICATION_PREVIEW_KEY = "notification_preview_enabled";
    private static final String PREFS_NAME = "OVMessagePrefs";
    private static final String SMS_SERVICE_ENABLED_KEY = "sms_service_enabled";
    private static final String TAG = "SmsServiceModule";
    private ReactApplicationContext reactContext;

    public SmsServiceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public static boolean isFortressModeEnabled(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean(FORTRESS_MODE_KEY, false);
    }

    public static boolean isNotificationPreviewEnabled(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean(NOTIFICATION_PREVIEW_KEY, true);
    }

    public static boolean isSmsServiceEnabled(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean(SMS_SERVICE_ENABLED_KEY, true);
    }

    @ReactMethod
    public void checkServiceStatus() {
        isSmsServiceEnabled(this.reactContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void setFortressModeEnabled(boolean z10) {
        try {
            this.reactContext.getSharedPreferences(PREFS_NAME, 0).edit().putBoolean(FORTRESS_MODE_KEY, z10).apply();
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public void setNotificationPreviewEnabled(boolean z10) {
        try {
            this.reactContext.getSharedPreferences(PREFS_NAME, 0).edit().putBoolean(NOTIFICATION_PREVIEW_KEY, z10).apply();
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public void setSmsServiceEnabled(boolean z10) {
        try {
            this.reactContext.getSharedPreferences(PREFS_NAME, 0).edit().putBoolean(SMS_SERVICE_ENABLED_KEY, z10).apply();
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public void startBackgroundService() {
        setSmsServiceEnabled(true);
    }

    @ReactMethod
    public void stopBackgroundService() {
        setSmsServiceEnabled(false);
    }
}
