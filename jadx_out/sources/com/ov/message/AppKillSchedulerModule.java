package com.ov.message;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class AppKillSchedulerModule extends ReactContextBaseJavaModule {
    private static final int REQUEST_CODE = 57005;

    public AppKillSchedulerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void cancel(Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            AlarmManager alarmManager = (AlarmManager) reactApplicationContext.getSystemService("alarm");
            PendingIntent broadcast = PendingIntent.getBroadcast(reactApplicationContext, REQUEST_CODE, new Intent(reactApplicationContext, (Class<?>) AppKillReceiver.class), 201326592);
            alarmManager.cancel(broadcast);
            broadcast.cancel();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("CANCEL_ERROR", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AppKillScheduler";
    }

    @ReactMethod
    public void schedule(double d10, Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            ((AlarmManager) reactApplicationContext.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + ((long) d10), PendingIntent.getBroadcast(reactApplicationContext, REQUEST_CODE, new Intent(reactApplicationContext, (Class<?>) AppKillReceiver.class), 201326592));
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("SCHEDULE_ERROR", e10);
        }
    }
}
