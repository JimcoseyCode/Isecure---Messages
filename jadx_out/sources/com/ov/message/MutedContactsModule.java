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
public class MutedContactsModule extends ReactContextBaseJavaModule {
    private static final String KEY_MUTED = "muted_contacts";
    private static final String PREFS_NAME = "OVMessagePrefs";

    public MutedContactsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getMutedContacts(Promise promise) {
        try {
            promise.resolve(getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).getString(KEY_MUTED, "[]"));
        } catch (Exception e10) {
            promise.reject("GET_MUTED_ERROR", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MutedContacts";
    }

    @ReactMethod
    public void setMutedContacts(ReadableArray readableArray, Promise promise) {
        try {
            SharedPreferences.Editor editorEdit = getReactApplicationContext().getSharedPreferences(PREFS_NAME, 0).edit();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                jSONArray.put(readableArray.getString(i10));
            }
            editorEdit.putString(KEY_MUTED, jSONArray.toString());
            editorEdit.apply();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("SET_MUTED_ERROR", e10);
        }
    }
}
