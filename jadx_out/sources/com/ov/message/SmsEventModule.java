package com.ov.message;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsEventModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final Object LOCK = new Object();
    private static final String TAG = "SmsEventModule";
    private static String pendingContactPhone = null;
    private static boolean pendingConversationEmitted = false;
    private static boolean pendingConversationNavigation = false;
    private final ReactApplicationContext reactContext;
    private BroadcastReceiver smsReceiver;

    public SmsEventModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitEvent(String str, WritableMap writableMap) {
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHostResume$0(String str) {
        synchronized (LOCK) {
            pendingConversationEmitted = true;
        }
        emitNavigateToConversation(str);
    }

    public static void setPendingChatScreenNavigation() {
        synchronized (LOCK) {
            pendingConversationNavigation = true;
            pendingConversationEmitted = false;
            pendingContactPhone = null;
        }
    }

    public static void setPendingConversationNavigation(String str) {
        synchronized (LOCK) {
            pendingConversationNavigation = true;
            pendingConversationEmitted = false;
            pendingContactPhone = str;
        }
    }

    @ReactMethod
    public void cleanTreatedSmsList(int i10, Promise promise) {
        try {
            SmsDeliverReceiver.cleanTreatedSmsList(this.reactContext, i10);
            promise.resolve(Boolean.TRUE);
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void clearPendingSms(Promise promise) {
        try {
            SmsDeliverReceiver.clearPendingSms(this.reactContext);
            promise.resolve(Boolean.TRUE);
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    public void emitNavigateToChatScreen() {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("screen", "chatScreen");
            synchronized (LOCK) {
                pendingConversationNavigation = false;
                pendingContactPhone = null;
                pendingConversationEmitted = true;
            }
            emitEvent("onNavigateToChatScreen", writableMapCreateMap);
        } catch (Exception unused) {
        }
    }

    public void emitNavigateToConversation(String str) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("contactPhone", str);
            synchronized (LOCK) {
                pendingConversationNavigation = false;
                pendingContactPhone = null;
                pendingConversationEmitted = true;
            }
            emitEvent("onNavigateToConversation", writableMapCreateMap);
        } catch (Exception unused) {
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void getUnprocessedSms(Promise promise) {
        try {
            promise.resolve(SmsDeliverReceiver.getPendingSms(this.reactContext).toString());
        } catch (Exception unused) {
            promise.resolve("[]");
        }
    }

    @ReactMethod
    public void isSmsTreated(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(SmsDeliverReceiver.isSmsTreated(this.reactContext, str)));
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void markSmsAsProcessed(String str, String str2, Promise promise) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    SmsDeliverReceiver.removePendingSms(this.reactContext, str);
                }
            } catch (Exception unused) {
                promise.resolve(Boolean.FALSE);
                return;
            }
        }
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void markSmsAsProcessedByContent(String str, String str2, Promise promise) {
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void markSmsAsTreated(String str, Promise promise) {
        try {
            SmsDeliverReceiver.markSmsAsTreated(this.reactContext, str);
            promise.resolve(Boolean.TRUE);
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        BroadcastReceiver broadcastReceiver = this.smsReceiver;
        if (broadcastReceiver != null) {
            try {
                this.reactContext.unregisterReceiver(broadcastReceiver);
                this.smsReceiver = null;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        final String str;
        BroadcastReceiver broadcastReceiver = this.smsReceiver;
        if (broadcastReceiver != null) {
            try {
                this.reactContext.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.smsReceiver = new BroadcastReceiver() { // from class: com.ov.message.SmsEventModule.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (!"com.ov.message.SMS_RECEIVED".equals(action)) {
                    if ("com.ov.message.SMS_SENT".equals(action)) {
                        String strNormalizePhoneNumber = PhoneNumberUtils.normalizePhoneNumber(intent.getStringExtra("sender"), SmsEventModule.this.reactContext);
                        String stringExtra = intent.getStringExtra("content");
                        String stringExtra2 = intent.getStringExtra("messageId");
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("sender", strNormalizePhoneNumber);
                        writableMapCreateMap.putString("content", stringExtra);
                        writableMapCreateMap.putBoolean("isSent", true);
                        if (stringExtra2 != null) {
                            writableMapCreateMap.putString("messageId", stringExtra2);
                        }
                        SmsEventModule.this.emitEvent("onSmsSent", writableMapCreateMap);
                        return;
                    }
                    return;
                }
                String stringExtra3 = intent.getStringExtra("sender");
                String stringExtra4 = intent.getStringExtra("content");
                long longExtra = intent.getLongExtra("timestamp", System.currentTimeMillis());
                String stringExtra5 = intent.getStringExtra("messageId");
                int intExtra = intent.getIntExtra("fragmentCount", 1);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("sender", stringExtra3);
                writableMapCreateMap2.putString("content", stringExtra4);
                writableMapCreateMap2.putDouble("timestamp", longExtra);
                writableMapCreateMap2.putInt("fragmentCount", intExtra);
                if (stringExtra5 != null) {
                    writableMapCreateMap2.putString("messageId", stringExtra5);
                }
                SmsEventModule.this.emitEvent("onSmsReceived", writableMapCreateMap2);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ov.message.SMS_RECEIVED");
        intentFilter.addAction("com.ov.message.SMS_SENT");
        this.reactContext.registerReceiver(this.smsReceiver, intentFilter, 4);
        synchronized (LOCK) {
            try {
                if (pendingConversationNavigation && (str = pendingContactPhone) != null && !pendingConversationEmitted) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ov.message.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24834g.lambda$onHostResume$0(str);
                        }
                    }, 300L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ReactMethod
    public void removePendingSms(String str, Promise promise) {
        try {
            SmsDeliverReceiver.removePendingSms(this.reactContext, str);
            promise.resolve(Boolean.TRUE);
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void shouldNavigateToChatScreen(Promise promise) {
        Intent intent;
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null || (intent = currentActivity.getIntent()) == null || !intent.getBooleanExtra("openChatScreen", false)) {
                promise.resolve(Boolean.FALSE);
            } else {
                intent.removeExtra("openChatScreen");
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e10) {
            promise.reject("error", e10);
        }
    }

    @ReactMethod
    public void shouldNavigateToConversation(Promise promise) {
        Intent intent;
        String str;
        try {
            synchronized (LOCK) {
                try {
                    boolean z10 = true;
                    if (pendingConversationNavigation && (str = pendingContactPhone) != null) {
                        pendingConversationNavigation = false;
                        pendingConversationEmitted = false;
                        pendingContactPhone = null;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("shouldNavigate", true);
                        writableMapCreateMap.putString("contactPhone", str);
                        promise.resolve(writableMapCreateMap);
                        return;
                    }
                    Activity currentActivity = getCurrentActivity();
                    if (currentActivity == null || (intent = currentActivity.getIntent()) == null || !intent.getBooleanExtra("openChatScreen", false)) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putBoolean("shouldNavigate", false);
                        writableMapCreateMap2.putString("contactPhone", PointerEventHelper.POINTER_TYPE_UNKNOWN);
                        promise.resolve(writableMapCreateMap2);
                        return;
                    }
                    String stringExtra = intent.getStringExtra("contactPhone");
                    intent.removeExtra("openChatScreen");
                    intent.removeExtra("contactPhone");
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    if (stringExtra == null) {
                        z10 = false;
                    }
                    writableMapCreateMap3.putBoolean("shouldNavigate", z10);
                    if (stringExtra == null) {
                        stringExtra = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                    }
                    writableMapCreateMap3.putString("contactPhone", stringExtra);
                    promise.resolve(writableMapCreateMap3);
                } finally {
                }
            }
        } catch (Exception e10) {
            promise.reject("error", e10);
        }
    }

    @ReactMethod
    public void storePendingConversationNavigation(String str, Promise promise) {
        try {
            setPendingConversationNavigation(str);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("error", e10);
        }
    }

    @ReactMethod
    public void updateCurrentConversation(String str) {
        SmsDeliverReceiver.updateCurrentConversation(str);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
