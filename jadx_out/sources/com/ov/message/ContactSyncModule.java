package com.ov.message;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class ContactSyncModule extends ReactContextBaseJavaModule {
    private static final String TAG = "ContactSyncModule";
    private ReactApplicationContext reactContext;

    public ContactSyncModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void getContactsCount(Promise promise) {
        try {
            promise.resolve(Integer.valueOf(this.reactContext.getSharedPreferences("OVMessagePrefs", 0).getString("contacts_data", "[]").split("}").length - 1));
        } catch (Exception e10) {
            promise.reject("COUNT_ERROR", e10.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void syncContacts(String str, Promise promise) {
        try {
            this.reactContext.getSharedPreferences("OVMessagePrefs", 0).edit().putString("contacts_data", str).apply();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("SYNC_ERROR", e10.getMessage());
        }
    }
}
