package com.ov.message;

import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class PhoneNumberModule extends ReactContextBaseJavaModule {
    private static final String TAG = "PhoneNumberModule";
    private final ReactApplicationContext reactContext;

    public PhoneNumberModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void getPhoneNumber(Promise promise) {
        try {
            if (androidx.core.content.a.a(this.reactContext, "android.permission.READ_PHONE_STATE") != 0) {
                promise.reject("PERMISSION_DENIED", "Permission READ_PHONE_STATE non accordée");
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) this.reactContext.getSystemService("phone");
            if (telephonyManager == null) {
                promise.reject("SERVICE_UNAVAILABLE", "Service téléphonie non disponible");
                return;
            }
            String line1Number = telephonyManager.getLine1Number();
            if (line1Number != null && !line1Number.trim().isEmpty()) {
                String strReplaceAll = line1Number.trim().replaceAll("[\\s\\-\\(\\)]", PointerEventHelper.POINTER_TYPE_UNKNOWN);
                if (strReplaceAll.isEmpty()) {
                    promise.resolve(null);
                    return;
                }
                if (strReplaceAll.startsWith("00")) {
                    strReplaceAll = "+" + strReplaceAll.substring(2);
                } else {
                    strReplaceAll.startsWith("+");
                }
                promise.resolve(strReplaceAll);
                return;
            }
            promise.resolve(null);
        } catch (SecurityException e10) {
            promise.reject("SECURITY_ERROR", "Erreur de sécurité lors de la récupération", e10);
        } catch (Exception e11) {
            promise.reject("ERROR", "Erreur lors de la récupération du numéro", e11);
        }
    }
}
