package com.ov.message;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.provider.Telephony;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsBindModule extends ReactContextBaseJavaModule {
    private static final String TAG = "SmsBindModule";
    private boolean isBound;
    private ReactApplicationContext reactContext;
    private ServiceConnection serviceConnection;
    private SmsBindService smsBindService;

    public SmsBindModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.isBound = false;
        this.serviceConnection = new ServiceConnection() { // from class: com.ov.message.SmsBindModule.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                SmsBindModule.this.isBound = true;
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                SmsBindModule.this.isBound = false;
            }
        };
        this.reactContext = reactApplicationContext;
    }

    private boolean hasBindSmsPermission() {
        try {
            return this.reactContext.checkSelfPermission("android.permission.BIND_SMS_SERVICE") == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean isDefaultSmsApp() {
        try {
            return this.reactContext.getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(this.reactContext));
        } catch (Exception unused) {
            return false;
        }
    }

    private void sendEvent(String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void checkBindSmsServiceStatus(Promise promise) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("isBound", this.isBound);
            writableMapCreateMap.putBoolean("isDefaultSmsApp", isDefaultSmsApp());
            writableMapCreateMap.putBoolean("hasBindSmsPermission", hasBindSmsPermission());
            writableMapCreateMap.toString();
            promise.resolve(writableMapCreateMap);
        } catch (Exception e10) {
            promise.reject("STATUS_CHECK_ERROR", e10.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void startBindSmsService(Promise promise) {
        try {
            Intent intent = new Intent(this.reactContext, (Class<?>) SmsBindService.class);
            intent.putExtra("source", "react_native");
            if (this.reactContext.bindService(intent, this.serviceConnection, 1)) {
                promise.resolve(Boolean.TRUE);
            } else {
                promise.reject("SERVICE_START_FAILED", "Impossible de démarrer le service BIND_SMS_SERVICE");
            }
        } catch (Exception e10) {
            promise.reject("SERVICE_ERROR", e10.getMessage());
        }
    }

    @ReactMethod
    public void stopBindSmsService(Promise promise) {
        try {
            if (this.isBound) {
                this.reactContext.unbindService(this.serviceConnection);
                this.isBound = false;
            }
            this.reactContext.stopService(new Intent(this.reactContext, (Class<?>) SmsBindService.class));
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("SERVICE_STOP_ERROR", e10.getMessage());
        }
    }
}
