package com.ov.message;

import android.app.role.RoleManager;
import android.content.Intent;
import android.os.Build;
import android.provider.Telephony;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsRoleHelper extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public SmsRoleHelper(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SmsRoleHelper";
    }

    @ReactMethod
    public void isDefaultSmsApp(Promise promise) {
        boolean zEquals;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                RoleManager roleManagerA = k.a(getReactApplicationContext().getSystemService(ViewProps.ROLE));
                zEquals = roleManagerA.isRoleAvailable("android.app.role.SMS") ? roleManagerA.isRoleHeld("android.app.role.SMS") : false;
            } else {
                zEquals = getReactApplicationContext().getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(getReactApplicationContext()));
            }
            promise.resolve(Boolean.valueOf(zEquals));
        } catch (Exception e10) {
            promise.reject("ERROR", e10.getMessage());
        }
    }

    @ReactMethod
    public void requestSmsRole(Promise promise) {
        try {
            Intent intent = new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
            intent.addFlags(268435456);
            intent.toString();
            if (getCurrentActivity() != null) {
                getCurrentActivity().startActivity(intent);
            } else {
                getReactApplicationContext().startActivity(intent);
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("ERROR", e10.getMessage());
        }
    }

    @ReactMethod
    public void setAsDefaultSmsApp(Promise promise) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(getReactApplicationContext());
                getReactApplicationContext().getPackageName();
                if (getReactApplicationContext().getPackageName().equals(defaultSmsPackage)) {
                    promise.resolve(Boolean.TRUE);
                    return;
                }
                Intent intent = new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
                intent.addFlags(268435456);
                intent.toString();
                if (getCurrentActivity() != null) {
                    getCurrentActivity().startActivity(intent);
                }
                promise.resolve(Boolean.TRUE);
                return;
            }
            RoleManager roleManagerA = k.a(getReactApplicationContext().getSystemService(ViewProps.ROLE));
            if (!roleManagerA.isRoleAvailable("android.app.role.SMS")) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            if (roleManagerA.isRoleHeld("android.app.role.SMS")) {
                promise.resolve(Boolean.TRUE);
                return;
            }
            Intent intentCreateRequestRoleIntent = roleManagerA.createRequestRoleIntent("android.app.role.SMS");
            intentCreateRequestRoleIntent.addFlags(335544320);
            intentCreateRequestRoleIntent.toString();
            if (getCurrentActivity() != null) {
                getCurrentActivity().startActivity(intentCreateRequestRoleIntent);
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("ERROR", e10.getMessage());
        }
    }
}
