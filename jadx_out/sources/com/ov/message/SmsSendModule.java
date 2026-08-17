package com.ov.message;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsSendModule extends ReactContextBaseJavaModule {
    private static final String ACTION_SMS_DELIVERED = "com.ov.message.SMS_DELIVERED_MODULE";
    private static final String ACTION_SMS_SENT = "com.ov.message.SMS_SENT_MODULE";
    private static final String MODULE_NAME = "SmsSendModule";
    private static final String TAG = "SmsSendModule";
    private static final Map<String, String> sendResults = new ConcurrentHashMap();
    private final Map<Long, BroadcastReceiver[]> activeReceivers;
    private final ReactApplicationContext reactContext;

    public SmsSendModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.activeReceivers = new ConcurrentHashMap();
        this.reactContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitEvent(String str, WritableMap writableMap) {
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        } catch (Exception unused) {
        }
    }

    private int getPendingIntentFlags() {
        return Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728;
    }

    private SmsManager getSmsManager(int i10) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (i10 < 0) {
            return SmsManager.getDefault();
        }
        int i11 = Build.VERSION.SDK_INT;
        try {
            SubscriptionManager subscriptionManager = (SubscriptionManager) this.reactContext.getSystemService("telephony_subscription_service");
            if (subscriptionManager != null && (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) != null && i10 < activeSubscriptionInfoList.size()) {
                int subscriptionId = activeSubscriptionInfoList.get(i10).getSubscriptionId();
                return i11 >= 31 ? ((SmsManager) this.reactContext.getSystemService(SmsManager.class)).createForSubscriptionId(subscriptionId) : SmsManager.getSmsManagerForSubscriptionId(subscriptionId);
            }
        } catch (SecurityException | Exception unused) {
        }
        return SmsManager.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSmsInternal$0(long j10, String str) {
        if (this.activeReceivers.containsKey(Long.valueOf(j10))) {
            unregisterReceiversForSession(j10);
            if (str != null) {
                Map<String, String> map = sendResults;
                if (map.containsKey(str)) {
                    return;
                }
                map.put(str, "timeout");
            }
        }
    }

    private void saveToSentBox(String str, String str2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("address", str);
            contentValues.put(ExpoNotificationBuilder.EXTRAS_BODY_KEY, str2);
            contentValues.put(NotificationsService.EVENT_TYPE_KEY, (Integer) 2);
            contentValues.put("date", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("read", (Integer) 1);
            this.reactContext.getContentResolver().insert(Uri.parse("content://sms/sent"), contentValues);
        } catch (Exception unused) {
        }
    }

    private void sendSmsInternal(final String str, String str2, int i10, final String str3, final Promise promise) {
        Promise promise2;
        Promise promise3;
        final long j10;
        final SmsSendModule smsSendModule = this;
        try {
            if (str != null) {
                try {
                    if (!str.trim().isEmpty()) {
                        if (str2 != null) {
                            try {
                                if (!str2.isEmpty()) {
                                    SmsManager smsManager = smsSendModule.getSmsManager(i10);
                                    ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str2);
                                    final int size = arrayListDivideMessage.size();
                                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                                    final AtomicInteger atomicInteger2 = new AtomicInteger(0);
                                    final long jCurrentTimeMillis = System.currentTimeMillis();
                                    String str4 = "com.ov.message.SMS_DELIVERED_MODULE_" + jCurrentTimeMillis;
                                    String str5 = "com.ov.message.SMS_SENT_MODULE_" + jCurrentTimeMillis;
                                    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ov.message.SmsSendModule.1
                                        private void handleSendError(Promise promise4, String str6, String str7, String str8, long j11) {
                                            if (atomicInteger2.incrementAndGet() == 1) {
                                                SmsSendModule.this.unregisterReceiversForSession(j11);
                                                if (str3 != null) {
                                                    SmsSendModule.sendResults.put(str3, "failed");
                                                }
                                                promise4.reject(str6, str7 + " (destinataire: " + str8 + ")");
                                            }
                                        }

                                        @Override // android.content.BroadcastReceiver
                                        public void onReceive(Context context, Intent intent) {
                                            intent.getIntExtra("part", 0);
                                            int resultCode = getResultCode();
                                            if (resultCode == -1) {
                                                if (atomicInteger.incrementAndGet() == size) {
                                                    SmsSendModule.this.unregisterReceiversForSession(jCurrentTimeMillis);
                                                    if (str3 != null) {
                                                        SmsSendModule.sendResults.put(str3, "sent");
                                                    }
                                                    WritableMap writableMapCreateMap = Arguments.createMap();
                                                    writableMapCreateMap.putBoolean("success", true);
                                                    writableMapCreateMap.putString("phoneNumber", str);
                                                    writableMapCreateMap.putInt("parts", size);
                                                    writableMapCreateMap.putDouble("timestamp", jCurrentTimeMillis);
                                                    promise.resolve(writableMapCreateMap);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (resultCode == 1) {
                                                handleSendError(promise, "GENERIC_FAILURE", "Échec générique de l'envoi", str, jCurrentTimeMillis);
                                                return;
                                            }
                                            if (resultCode == 2) {
                                                handleSendError(promise, "RADIO_OFF", "Radio désactivée", str, jCurrentTimeMillis);
                                                return;
                                            }
                                            if (resultCode == 3) {
                                                handleSendError(promise, "NULL_PDU", "PDU null", str, jCurrentTimeMillis);
                                                return;
                                            }
                                            if (resultCode == 4) {
                                                handleSendError(promise, "NO_SERVICE", "Pas de service réseau", str, jCurrentTimeMillis);
                                                return;
                                            }
                                            handleSendError(promise, "UNKNOWN", "Erreur inconnue: " + getResultCode(), str, jCurrentTimeMillis);
                                        }
                                    };
                                    try {
                                        final long j11 = jCurrentTimeMillis;
                                        smsSendModule = this;
                                        BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: com.ov.message.SmsSendModule.2
                                            @Override // android.content.BroadcastReceiver
                                            public void onReceive(Context context, Intent intent) {
                                                int intExtra = intent.getIntExtra("part", 0);
                                                if (getResultCode() == -1) {
                                                    WritableMap writableMapCreateMap = Arguments.createMap();
                                                    writableMapCreateMap.putString("phoneNumber", str);
                                                    writableMapCreateMap.putInt("part", intExtra + 1);
                                                    writableMapCreateMap.putInt("totalParts", size);
                                                    writableMapCreateMap.putDouble("timestamp", j11);
                                                    SmsSendModule.this.emitEvent("onSmsDelivered", writableMapCreateMap);
                                                }
                                            }
                                        };
                                        try {
                                            int i11 = 1;
                                            smsSendModule.activeReceivers.put(Long.valueOf(j11), new BroadcastReceiver[]{broadcastReceiver, broadcastReceiver2});
                                            smsSendModule.reactContext.registerReceiver(broadcastReceiver, new IntentFilter(str5), 2);
                                            smsSendModule.reactContext.registerReceiver(broadcastReceiver2, new IntentFilter(str4), 2);
                                            ArrayList<PendingIntent> arrayList = new ArrayList<>();
                                            ArrayList<PendingIntent> arrayList2 = new ArrayList<>();
                                            int pendingIntentFlags = smsSendModule.getPendingIntentFlags();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Intent intent = new Intent(str5);
                                                intent.putExtra("part", i12);
                                                intent.putExtra("total", size);
                                                intent.putExtra("phone", str);
                                                String str6 = str5;
                                                int i13 = (int) j11;
                                                long j12 = j11;
                                                arrayList.add(PendingIntent.getBroadcast(smsSendModule.reactContext, i13 + i12, intent, pendingIntentFlags));
                                                Intent intent2 = new Intent(str4);
                                                intent2.putExtra("part", i12);
                                                intent2.putExtra("total", size);
                                                intent2.putExtra("phone", str);
                                                arrayList2.add(PendingIntent.getBroadcast(smsSendModule.reactContext, i13 + size + i12, intent2, pendingIntentFlags));
                                                i12++;
                                                str5 = str6;
                                                j11 = j12;
                                                i11 = 1;
                                            }
                                            long j13 = j11;
                                            if (size == i11) {
                                                j10 = j13;
                                                smsManager.sendTextMessage(str, null, str2, arrayList.get(0), arrayList2.get(0));
                                            } else {
                                                j10 = j13;
                                                smsManager.sendMultipartTextMessage(str, null, arrayListDivideMessage, arrayList, arrayList2);
                                            }
                                            saveToSentBox(str, str2);
                                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ov.message.p
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f24836g.lambda$sendSmsInternal$0(j10, str3);
                                                }
                                            }, (((long) Math.max(0, size - 1)) * 6000) + 45000);
                                            return;
                                        } catch (SecurityException unused) {
                                            promise3 = promise;
                                            promise3.reject("PERMISSION_DENIED", "Permission SEND_SMS non accordée");
                                            return;
                                        } catch (Exception e10) {
                                            e = e10;
                                            promise2 = promise;
                                            promise2.reject("SEND_ERROR", "Erreur d'envoi: " + e.getMessage());
                                            return;
                                        }
                                    } catch (SecurityException unused2) {
                                    } catch (Exception e11) {
                                        e = e11;
                                    }
                                }
                            } catch (SecurityException unused3) {
                            } catch (Exception e12) {
                                e = e12;
                            }
                        }
                        promise.reject("INVALID_MESSAGE", "Message vide");
                        return;
                    }
                } catch (SecurityException unused4) {
                    promise3 = promise;
                } catch (Exception e13) {
                    e = e13;
                    promise2 = promise;
                }
            }
            promise.reject("INVALID_PHONE", "Numéro de téléphone invalide");
        } catch (SecurityException unused5) {
        } catch (Exception e14) {
            e = e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterReceiversForSession(long j10) {
        try {
            BroadcastReceiver[] broadcastReceiverArrRemove = this.activeReceivers.remove(Long.valueOf(j10));
            if (broadcastReceiverArrRemove != null) {
                BroadcastReceiver broadcastReceiver = broadcastReceiverArrRemove[0];
                if (broadcastReceiver != null) {
                    this.reactContext.unregisterReceiver(broadcastReceiver);
                }
                BroadcastReceiver broadcastReceiver2 = broadcastReceiverArrRemove[1];
                if (broadcastReceiver2 != null) {
                    this.reactContext.unregisterReceiver(broadcastReceiver2);
                }
            }
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public void clearSendResult(String str, Promise promise) {
        sendResults.remove(str);
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SmsSendModule";
    }

    @ReactMethod
    public void getSendResult(String str, Promise promise) {
        String str2 = sendResults.get(str);
        if (str2 != null) {
            promise.resolve(str2);
        } else {
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void isReady(Promise promise) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("ready", true);
        int i10 = Build.VERSION.SDK_INT;
        writableMapCreateMap.putInt("androidVersion", i10);
        writableMapCreateMap.putBoolean("flagImmutableRequired", i10 >= 31);
        promise.resolve(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Iterator<Long> it = this.activeReceivers.keySet().iterator();
        while (it.hasNext()) {
            unregisterReceiversForSession(it.next().longValue());
        }
        this.activeReceivers.clear();
    }

    @ReactMethod
    public void sendSms(String str, String str2, Promise promise) {
        sendSmsInternal(str, str2, -1, null, promise);
    }

    @ReactMethod
    public void sendSmsWithId(String str, String str2, String str3, Promise promise) {
        sendSmsInternal(str, str2, -1, str3, promise);
    }

    @ReactMethod
    public void sendSmsWithSim(String str, String str2, int i10, Promise promise) {
        sendSmsInternal(str, str2, i10, null, promise);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
