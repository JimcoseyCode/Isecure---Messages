package com.ov.message;

import android.app.IntentService;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class HeadlessSmsSendService extends IntentService {
    private static final String ACTION_SMS_DELIVERED = "com.ov.message.SMS_DELIVERED_HEADLESS";
    private static final String ACTION_SMS_SENT = "com.ov.message.SMS_SENT_HEADLESS";
    private static final String TAG = "HeadlessSmsSendService";

    public HeadlessSmsSendService() {
        super(HeadlessSmsSendService.class.getName());
        setIntentRedelivery(true);
    }

    private String getRecipients(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int iIndexOf = schemeSpecificPart.indexOf(63);
        return iIndexOf == -1 ? schemeSpecificPart : schemeSpecificPart.substring(0, iIndexOf);
    }

    private void sendAndStoreTextMessage(ContentResolver contentResolver, String[] strArr, String str) {
        try {
            SmsManager smsManager = SmsManager.getDefault();
            Uri uri = Uri.parse("content://sms/sent");
            for (String str2 : strArr) {
                ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str);
                if (arrayListDivideMessage.size() == 1) {
                    sendSinglePartMessage(smsManager, str2, str);
                } else {
                    sendMultipartMessage(smsManager, str2, arrayListDivideMessage);
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("address", str2);
                contentValues.put(ExpoNotificationBuilder.EXTRAS_BODY_KEY, str);
                contentValues.put(NotificationsService.EVENT_TYPE_KEY, (Integer) 2);
                Objects.toString(contentResolver.insert(uri, contentValues));
            }
        } catch (Exception unused) {
        }
    }

    private void sendMultipartMessage(SmsManager smsManager, String str, ArrayList<String> arrayList) {
        try {
            int size = arrayList.size();
            ArrayList<PendingIntent> arrayList2 = new ArrayList<>();
            ArrayList<PendingIntent> arrayList3 = new ArrayList<>();
            for (int i10 = 0; i10 < size; i10++) {
                Intent intent = new Intent(ACTION_SMS_SENT);
                intent.putExtra("destination", str);
                intent.putExtra("part", i10);
                intent.putExtra("total", size);
                arrayList2.add(PendingIntent.getBroadcast(this, ((int) System.currentTimeMillis()) + i10, intent, 201326592));
                Intent intent2 = new Intent(ACTION_SMS_DELIVERED);
                intent2.putExtra("destination", str);
                intent2.putExtra("part", i10);
                intent2.putExtra("total", size);
                arrayList3.add(PendingIntent.getBroadcast(this, ((int) System.currentTimeMillis()) + size + i10, intent2, 201326592));
            }
            smsManager.sendMultipartTextMessage(str, null, arrayList, arrayList2, arrayList3);
        } catch (Exception unused) {
        }
    }

    private void sendSinglePartMessage(SmsManager smsManager, String str, String str2) {
        try {
            Intent intent = new Intent(ACTION_SMS_SENT);
            intent.putExtra("destination", str);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, (int) System.currentTimeMillis(), intent, 201326592);
            Intent intent2 = new Intent(ACTION_SMS_DELIVERED);
            intent2.putExtra("destination", str);
            smsManager.sendTextMessage(str, null, str2, broadcast, PendingIntent.getBroadcast(this, ((int) System.currentTimeMillis()) + 1, intent2, 201326592));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        Bundle extras;
        if ("android.intent.action.RESPOND_VIA_MESSAGE".equals(intent.getAction()) && (extras = intent.getExtras()) != null) {
            String string = extras.getString("android.intent.extra.TEXT");
            String recipients = getRecipients(intent.getData());
            if (string != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string.length());
                sb.append(" chars");
            }
            if (TextUtils.isEmpty(recipients) || TextUtils.isEmpty(string)) {
                return;
            }
            sendAndStoreTextMessage(getContentResolver(), TextUtils.split(recipients, ";"), string);
        }
    }
}
