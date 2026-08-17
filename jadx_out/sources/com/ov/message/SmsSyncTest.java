package com.ov.message;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsSyncTest {
    private static final String TAG = "SmsSyncTest";
    private Context context;

    public SmsSyncTest(Context context) {
        this.context = context;
    }

    private String normalizePhoneNumber(String str, Context context) {
        return PhoneNumberUtils.normalizePhoneNumber(str, context);
    }

    public void runAllTests() {
        testPhoneNumberNormalization();
        testHasUnsynchronizedSms();
        testReadUnsynchronizedSms();
    }

    public void testHasUnsynchronizedSms() {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 86400000)};
            Cursor cursorQuery = this.context.getContentResolver().query(Uri.parse("content://sms"), new String[]{"count(*)"}, "type = 1 AND date > ?", strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        cursorQuery.getInt(0);
                    }
                } finally {
                    cursorQuery.close();
                }
            }
        } catch (Exception unused) {
        }
    }

    public void testPhoneNumberNormalization() {
        String[] strArr = {"0123456789", "+33123456789", "06 12 34 56 78", "06.12.34.56.78", "+33 6 12 34 56 78", "123456789", "01234567890"};
        for (int i10 = 0; i10 < 7; i10++) {
            normalizePhoneNumber(strArr[i10], this.context);
        }
    }

    public void testReadUnsynchronizedSms() {
        try {
            Cursor cursorQuery = this.context.getContentResolver().query(Uri.parse("content://sms"), new String[]{"address", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "date", NotificationsService.EVENT_TYPE_KEY}, "type = 1 AND date > ?", new String[]{String.valueOf(System.currentTimeMillis() - 86400000)}, "date DESC");
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("address"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(ExpoNotificationBuilder.EXTRAS_BODY_KEY));
                        cursorQuery.getLong(cursorQuery.getColumnIndex("date"));
                        normalizePhoneNumber(string, this.context);
                        string2.substring(0, Math.min(string2.length(), 50));
                    } finally {
                        cursorQuery.close();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
