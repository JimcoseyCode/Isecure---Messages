package com.ov.message;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import androidx.core.app.l;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import expo.modules.contacts.Columns;
import expo.modules.notifications.service.NotificationsService;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsDeliverReceiver extends BroadcastReceiver {
    private static final int MAX_PENDING_SMS = 100;
    private static final int MAX_TREATED_SMS = 500;
    private static final String PENDING_SMS_KEY = "pending_sms_queue";
    private static final String SMS_CHANNEL_ID = "sms_notifications_channel";
    private static final String TAG = "SmsDeliverReceiver";
    private static final String TREATED_SMS_KEY = "treated_sms_ids";
    private static String currentConversationId;

    public static void cleanTreatedSmsList(Context context, int i10) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("OVMessagePrefs", 0);
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(TREATED_SMS_KEY, "[]"));
            if (jSONArray.length() <= i10) {
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int length = jSONArray.length() - i10; length < jSONArray.length(); length++) {
                jSONArray2.put(jSONArray.getString(length));
            }
            sharedPreferences.edit().putString(TREATED_SMS_KEY, jSONArray2.toString()).apply();
        } catch (Exception unused) {
        }
    }

    public static void clearPendingSms(Context context) {
        try {
            context.getSharedPreferences("OVMessagePrefs", 0).edit().putString(PENDING_SMS_KEY, "[]").apply();
        } catch (Exception unused) {
        }
    }

    private void createNotificationChannel(Context context) {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) context.getSystemService(NotificationsService.NOTIFICATION_KEY)) == null || notificationManager.getNotificationChannel(SMS_CHANNEL_ID) != null) {
            return;
        }
        NotificationChannel notificationChannelA = n4.f.a(SMS_CHANNEL_ID, "Notifications SMS", 4);
        notificationChannelA.setDescription("Notifications pour les nouveaux SMS");
        notificationChannelA.enableLights(true);
        notificationChannelA.setLightColor(-16776961);
        notificationChannelA.setShowBadge(true);
        notificationChannelA.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannelA);
    }

    private void deleteSmsFromProvider(Context context, String str, String str2, long j10) {
        try {
            context.getContentResolver().delete(Uri.parse("content://sms"), "address = ? AND body = ? AND date >= ? AND date <= ?", new String[]{str, str2, String.valueOf(j10 - 5000), String.valueOf(j10 + 5000)});
        } catch (Exception unused) {
        }
    }

    private String generateMessageId(String str, String str2, long j10) {
        long j11 = (j10 / 5000) * 5000;
        int iHashCode = str2 != null ? str2.hashCode() : 0;
        return "sms_" + (str != null ? str.hashCode() : 0) + "_" + str2.length() + "_" + iHashCode + "_" + j11;
    }

    private String getContactName(Context context, String str) {
        try {
            String string = context.getSharedPreferences("OVMessagePrefs", 0).getString("contacts_data", "[]");
            if (string != null && !string.equals("[]")) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    if (PhoneNumberUtils.normalizePhoneNumber(jSONObject.optString("phone", PointerEventHelper.POINTER_TYPE_UNKNOWN), context).equals(str)) {
                        String strOptString = jSONObject.optString("name", PointerEventHelper.POINTER_TYPE_UNKNOWN);
                        if (!strOptString.isEmpty()) {
                            return strOptString;
                        }
                    }
                }
            }
            if (androidx.core.content.a.a(context, "android.permission.READ_CONTACTS") == 0) {
                Cursor cursorQuery = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{Columns.DISPLAY_NAME}, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    String string2 = cursorQuery.getString(0);
                    cursorQuery.close();
                    if (string2 != null && !string2.isEmpty()) {
                        return string2;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static JSONArray getPendingSms(Context context) {
        try {
            return new JSONArray(context.getSharedPreferences("OVMessagePrefs", 0).getString(PENDING_SMS_KEY, "[]"));
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r2.importance != com.ov.message.SmsDeliverReceiver.MAX_PENDING_SMS) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean isAppInForeground(Context context) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.processName.equals(context.getPackageName())) {
                        break;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean isContactBlocked(Context context, String str) {
        try {
            JSONArray jSONArray = new JSONArray(context.getSharedPreferences("OVMessagePrefs", 0).getString("blocked_contacts", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (str != null && str.equals(jSONArray.getString(i10))) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean isContactKnown(Context context, String str) {
        try {
            String string = context.getSharedPreferences("OVMessagePrefs", 0).getString("contacts_data", "[]");
            if (string != null && !string.equals("[]")) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (PhoneNumberUtils.normalizePhoneNumber(jSONArray.getJSONObject(i10).optString("phone", PointerEventHelper.POINTER_TYPE_UNKNOWN), context).equals(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean isContactMuted(Context context, String str) {
        try {
            JSONArray jSONArray = new JSONArray(context.getSharedPreferences("OVMessagePrefs", 0).getString("muted_contacts", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (str != null && str.equals(jSONArray.getString(i10))) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isContactMutedStatic(Context context, String str) {
        try {
            JSONArray jSONArray = new JSONArray(context.getSharedPreferences("OVMessagePrefs", 0).getString("muted_contacts", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (str != null && str.equals(jSONArray.getString(i10))) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean isInCurrentConversation(Context context, String str) {
        String str2 = currentConversationId;
        if (str2 == null) {
            return false;
        }
        try {
            return str.equals(PhoneNumberUtils.normalizePhoneNumber(str2, context));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isInCurrentConversationStatic(String str) {
        String str2 = currentConversationId;
        if (str2 == null || str == null) {
            return false;
        }
        return str.equals(str2);
    }

    private boolean isOwnNumber(Context context, String str) {
        try {
            String string = context.getSharedPreferences("OVMessagePrefs", 0).getString("my_phone_number", PointerEventHelper.POINTER_TYPE_UNKNOWN);
            if (string != null && !string.isEmpty()) {
                return str.equals(PhoneNumberUtils.normalizePhoneNumber(string, context));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isSmsTreated(Context context, String str) {
        try {
            JSONArray jSONArray = new JSONArray(context.getSharedPreferences("OVMessagePrefs", 0).getString(TREATED_SMS_KEY, "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (str.equals(jSONArray.getString(i10))) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void markSmsAsTreated(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("OVMessagePrefs", 0);
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(TREATED_SMS_KEY, "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (str.equals(jSONArray.getString(i10))) {
                    return;
                }
            }
            while (jSONArray.length() >= MAX_TREATED_SMS) {
                jSONArray.remove(0);
            }
            jSONArray.put(str);
            sharedPreferences.edit().putString(TREATED_SMS_KEY, jSONArray.toString()).apply();
        } catch (Exception unused) {
        }
    }

    public static void removePendingSms(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("OVMessagePrefs", 0);
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(PENDING_SMS_KEY, "[]"));
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (!str.equals(jSONObject.optString("messageId"))) {
                    jSONArray2.put(jSONObject);
                }
            }
            sharedPreferences.edit().putString(PENDING_SMS_KEY, jSONArray2.toString()).apply();
        } catch (Exception unused) {
        }
    }

    private void sendNotification(Context context, String str, String str2, String str3) {
        try {
            createNotificationChannel(context);
            if (isAppInForeground(context) && isInCurrentConversation(context, str)) {
                return;
            }
            boolean zIsContactMuted = isContactMuted(context, str);
            String contactName = getContactName(context, str);
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.putExtra("openChatScreen", true);
            intent.putExtra("contactPhone", str);
            intent.addFlags(335544320);
            PendingIntent activity = PendingIntent.getActivity(context, (int) System.currentTimeMillis(), intent, 201326592);
            boolean zIsFortressModeEnabled = SmsServiceModule.isFortressModeEnabled(context);
            l.e eVarL = new l.e(context, SMS_CHANNEL_ID).l(zIsFortressModeEnabled ? context.getString(R.string.notification_new_message) : context.getString(R.string.notification_new_message_from, contactName));
            if (zIsFortressModeEnabled || !SmsServiceModule.isNotificationPreviewEnabled(context)) {
                str2 = "...";
            } else if (str2.length() > 50) {
                str2 = str2.substring(0, 50) + "...";
            }
            l.e eVarR = eVarL.k(str2).y(R.drawable.notification_icon).v(1).g(true).j(activity).r(-16776961, ProgressBarContainerView.MAX_PROGRESS, ProgressBarContainerView.MAX_PROGRESS);
            if (zIsContactMuted) {
                eVarR.z(null);
                eVarR.D(new long[]{0});
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationsService.NOTIFICATION_KEY);
            if (notificationManager != null) {
                notificationManager.notify(str3 != null ? str3.hashCode() : (int) System.currentTimeMillis(), eVarR.d());
            }
        } catch (Exception unused) {
        }
    }

    private void sendPairingNotification(Context context, String str, String str2) {
        try {
            if (PairingAuthModule.isAuthorized(context)) {
                createNotificationChannel(context);
                if (isAppInForeground(context) && isInCurrentConversation(context, str)) {
                    return;
                }
                String contactName = getContactName(context, str);
                Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.putExtra("openChatScreen", true);
                intent.putExtra("contactPhone", str);
                intent.addFlags(335544320);
                l.e eVarJ = new l.e(context, SMS_CHANNEL_ID).l("Demande d'appairage sécurisé").k("De " + contactName).y(R.drawable.notification_icon).v(1).g(true).j(PendingIntent.getActivity(context, (int) System.currentTimeMillis(), intent, 201326592));
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationsService.NOTIFICATION_KEY);
                if (notificationManager != null) {
                    notificationManager.notify(str2 != null ? str2.hashCode() : (int) System.currentTimeMillis(), eVarJ.d());
                }
            }
        } catch (Exception unused) {
        }
    }

    private void storePendingSms(Context context, String str, String str2, long j10, String str3, int i10) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("OVMessagePrefs", 0);
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(PENDING_SMS_KEY, "[]"));
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                if (str3.equals(jSONArray.getJSONObject(i11).optString("messageId"))) {
                    return;
                }
            }
            while (jSONArray.length() >= MAX_PENDING_SMS) {
                jSONArray.remove(0);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sender", str);
            jSONObject.put("content", str2);
            jSONObject.put("timestamp", j10);
            jSONObject.put("messageId", str3);
            jSONObject.put("fragmentCount", i10);
            jSONObject.put("storedAt", System.currentTimeMillis());
            jSONArray.put(jSONObject);
            sharedPreferences.edit().putString(PENDING_SMS_KEY, jSONArray.toString()).apply();
        } catch (Exception unused) {
        }
    }

    public static void updateCurrentConversation(String str) {
        currentConversationId = str;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.provider.Telephony.SMS_DELIVER".equals(intent.getAction()) && SmsServiceModule.isSmsServiceEnabled(context)) {
            try {
                SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
                if (messagesFromIntent == null || messagesFromIntent.length == 0) {
                    return;
                }
                boolean z10 = false;
                String displayOriginatingAddress = messagesFromIntent[0].getDisplayOriginatingAddress();
                long timestampMillis = messagesFromIntent[0].getTimestampMillis();
                String strNormalizePhoneNumber = PhoneNumberUtils.normalizePhoneNumber(displayOriginatingAddress, context);
                StringBuilder sb = new StringBuilder();
                for (SmsMessage smsMessage : messagesFromIntent) {
                    String displayMessageBody = smsMessage.getDisplayMessageBody();
                    if (displayMessageBody != null) {
                        sb.append(displayMessageBody);
                    }
                }
                String string = sb.toString();
                if (!isOwnNumber(context, strNormalizePhoneNumber)) {
                    if (string != null && string.startsWith("OVPK:")) {
                        z10 = true;
                    }
                    String strGenerateMessageId = generateMessageId(strNormalizePhoneNumber, string, timestampMillis);
                    if (!SmsDeduplicationCache.isMessageIdProcessed(strGenerateMessageId)) {
                        SmsDeduplicationCache.markMessageIdAsProcessed(strGenerateMessageId);
                        try {
                            storePendingSms(context, strNormalizePhoneNumber, string, timestampMillis, strGenerateMessageId, messagesFromIntent.length);
                            if (!z10 && SmsServiceModule.isFortressModeEnabled(context) && !isContactKnown(context, strNormalizePhoneNumber)) {
                                deleteSmsFromProvider(context, strNormalizePhoneNumber, string, timestampMillis);
                                return;
                            }
                            Intent intent2 = new Intent("com.ov.message.SMS_RECEIVED");
                            intent2.putExtra("sender", strNormalizePhoneNumber);
                            intent2.putExtra("content", string);
                            intent2.putExtra("timestamp", timestampMillis);
                            intent2.putExtra("messageId", strGenerateMessageId);
                            intent2.putExtra("fragmentCount", messagesFromIntent.length);
                            intent2.setPackage(context.getPackageName());
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.sendBroadcast(intent2, null);
                            } else {
                                context.sendBroadcast(intent2);
                            }
                            if ((!SmsServiceModule.isFortressModeEnabled(context) || z10) && !isContactBlocked(context, strNormalizePhoneNumber)) {
                                if (z10) {
                                    sendPairingNotification(context, strNormalizePhoneNumber, strGenerateMessageId);
                                } else {
                                    sendNotification(context, strNormalizePhoneNumber, string, strGenerateMessageId);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
