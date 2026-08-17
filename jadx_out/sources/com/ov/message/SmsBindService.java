package com.ov.message;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsBindService extends Service {
    private static final String TAG = "SmsBindService";
    private ReactApplicationContext reactContext;

    public SmsBindService() {
    }

    private WritableMap createSmsData(String str, String str2, long j10) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("sender", str);
        writableMapCreateMap.putString("content", str2);
        writableMapCreateMap.putDouble("timestamp", j10);
        writableMapCreateMap.putString("source", "bind_service");
        return writableMapCreateMap;
    }

    private void handleSmsIntent(Intent intent) {
        ReactApplicationContext reactApplicationContext;
        try {
            String stringExtra = intent.getStringExtra("sender");
            String stringExtra2 = intent.getStringExtra("content");
            long longExtra = intent.getLongExtra("timestamp", System.currentTimeMillis());
            if (stringExtra == null || stringExtra2 == null || (reactApplicationContext = this.reactContext) == null) {
                return;
            }
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onSmsReceivedDirect", createSmsData(stringExtra, stringExtra2, longExtra));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent == null) {
            return 1;
        }
        handleSmsIntent(intent);
        return 1;
    }

    public SmsBindService(ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
    }
}
