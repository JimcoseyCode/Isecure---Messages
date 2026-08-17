package com.ov.message;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class BlockedContactsModule extends ReactContextBaseJavaModule {
    private static final String KEY_BLOCKED = "blocked_contacts";
    private static final String PREFS_NAME = "OVMessagePrefs";

    public BlockedContactsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getBlockedContacts(Promise promise) {
        try {
            promise.resolve(getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).getString(KEY_BLOCKED, "[]"));
        } catch (Exception e10) {
            promise.reject("GET_BLOCKED_ERROR", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BlockedContacts";
    }

    @ReactMethod
    public void setBlockedContacts(ReadableArray readableArray, Promise promise) {
        try {
            SharedPreferences.Editor editorEdit = getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).edit();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                jSONArray.put(readableArray.getString(i10));
            }
            editorEdit.putString(KEY_BLOCKED, jSONArray.toString());
            editorEdit.apply();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("SET_BLOCKED_ERROR", e10);
        }
    }
}
