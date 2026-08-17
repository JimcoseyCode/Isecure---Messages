package com.ov.message;

import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class CallModule extends ReactContextBaseJavaModule {
    private static final int CALL_PERMISSION_REQUEST_CODE = 1001;
    private static final String TAG = "CallModule";
    private final ReactApplicationContext reactContext;

    public CallModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void checkCallPermission(Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(androidx.core.content.a.a(this.reactContext, "android.permission.CALL_PHONE") == 0));
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la vérification de la permission", e10);
        }
    }

    @ReactMethod
    public void dialNumber(String str, Promise promise) {
        try {
            if (androidx.core.content.a.a(this.reactContext, "android.permission.CALL_PHONE") != 0) {
                promise.reject("PERMISSION_DENIED", "Permission d'appel non accordée");
                return;
            }
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + str));
            if (intent.resolveActivity(this.reactContext.getPackageManager()) == null) {
                promise.reject("NO_APP", "Aucune application pour composer le numéro");
                return;
            }
            intent.addFlags(268435456);
            this.reactContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la composition", e10);
        }
    }

    @ReactMethod
    public void getDefaultDialerInfo(Promise promise) {
        try {
            promise.resolve(this.reactContext.getPackageManager().resolveActivity(new Intent("android.intent.action.DIAL"), 65536).activityInfo.packageName);
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la récupération des informations", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void makeCall(String str, Promise promise) {
        try {
            if (androidx.core.content.a.a(this.reactContext, "android.permission.CALL_PHONE") != 0) {
                promise.reject("PERMISSION_DENIED", "Permission d'appel non accordée");
                return;
            }
            Intent intent = new Intent("android.intent.action.CALL");
            intent.setData(Uri.parse("tel:" + str));
            if (intent.resolveActivity(this.reactContext.getPackageManager()) == null) {
                promise.reject("NO_APP", "Aucune application pour passer l'appel");
                return;
            }
            intent.addFlags(268435456);
            this.reactContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de l'appel", e10);
        }
    }

    @ReactMethod
    public void requestCallPermission(Promise promise) {
        try {
            if (androidx.core.content.a.a(this.reactContext, "android.permission.CALL_PHONE") == 0) {
                promise.resolve("GRANTED");
            } else {
                androidx.core.app.b.r(getCurrentActivity(), new String[]{"android.permission.CALL_PHONE"}, CALL_PERMISSION_REQUEST_CODE);
                promise.resolve("REQUESTED");
            }
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la demande de permission", e10);
        }
    }
}
