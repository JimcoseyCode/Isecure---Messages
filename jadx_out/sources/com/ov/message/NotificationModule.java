package com.ov.message;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.l;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import expo.modules.notifications.service.NotificationsService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class NotificationModule extends ReactContextBaseJavaModule {
    private static final String TAG = "NotificationModule";
    private final ReactApplicationContext reactContext;

    public NotificationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void cancelNotification(String str, Promise promise) {
        try {
            if (str == null) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            NotificationManager notificationManager = (NotificationManager) this.reactContext.getSystemService(NotificationsService.NOTIFICATION_KEY);
            if (notificationManager == null) {
                promise.resolve(Boolean.FALSE);
            } else {
                notificationManager.cancel(str.hashCode());
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e10) {
            promise.reject("ERROR", e10.getMessage());
        }
    }

    @ReactMethod
    public void clearAllNotifications(Promise promise) {
        try {
            NotificationManager notificationManager = (NotificationManager) this.reactContext.getSystemService(NotificationsService.NOTIFICATION_KEY);
            if (notificationManager == null) {
                promise.reject("ERROR", "NotificationManager non disponible");
            } else {
                notificationManager.cancelAll();
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la suppression des notifications: " + e10.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void sendSmsNotification(String str, String str2, Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = this.reactContext;
            NotificationManager notificationManager = (NotificationManager) reactApplicationContext.getSystemService(NotificationsService.NOTIFICATION_KEY);
            if (notificationManager == null) {
                promise.reject("ERROR", "NotificationManager non disponible");
                return;
            }
            if (Build.VERSION.SDK_INT >= 26 && notificationManager.getNotificationChannel("sms_channel") == null) {
                d.a();
                NotificationChannel notificationChannelA = n4.f.a("sms_channel", "Messages", 4);
                notificationChannelA.enableLights(true);
                notificationChannelA.setLightColor(-16776961);
                notificationManager.createNotificationChannel(notificationChannelA);
            }
            if (SmsDeliverReceiver.isInCurrentConversationStatic(str)) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            boolean zIsContactMutedStatic = SmsDeliverReceiver.isContactMutedStatic(reactApplicationContext, str);
            Intent intent = new Intent(reactApplicationContext, (Class<?>) MainActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.putExtra("openChatScreen", true);
            intent.putExtra("contactPhone", str);
            intent.addFlags(335544320);
            l.e eVarR = new l.e(reactApplicationContext, "sms_channel").l(reactApplicationContext.getString(R.string.notification_new_message)).k("...").y(R.drawable.notification_icon).v(1).g(true).j(PendingIntent.getActivity(reactApplicationContext, (int) System.currentTimeMillis(), intent, 201326592)).r(-16776961, ProgressBarContainerView.MAX_PROGRESS, ProgressBarContainerView.MAX_PROGRESS);
            if (zIsContactMutedStatic) {
                eVarR.z(null);
                eVarR.D(new long[]{0});
            }
            notificationManager.notify(str2 != null ? str2.hashCode() : (int) System.currentTimeMillis(), eVarR.d());
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("ERROR", e10.getMessage());
        }
    }

    @ReactMethod
    public void updateCurrentConversation(String str, Promise promise) {
        try {
            SmsDeliverReceiver.updateCurrentConversation(str);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la mise à jour de la conversation: " + e10.getMessage());
        }
    }
}
