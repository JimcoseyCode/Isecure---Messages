package com.ov.message;

import T5.e;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsDeleteModule extends ReactContextBaseJavaModule {
    private static final String TAG = "SmsDeleteModule";
    private final ReactApplicationContext reactContext;

    public SmsDeleteModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private static String digitsOnly(String str) {
        if (str == null) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private String extractNumericId(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    if (str.matches("^\\d+$")) {
                        return str;
                    }
                    if (str.contains("deliver_")) {
                        String[] strArrSplit = str.replaceFirst("^android_", PointerEventHelper.POINTER_TYPE_UNKNOWN).split("_");
                        if (strArrSplit.length >= 2 && strArrSplit[0].equals("deliver")) {
                            String str2 = strArrSplit[1];
                            if (str2.matches("^\\d+$")) {
                                return str2;
                            }
                        }
                    }
                    String[] strArrSplit2 = str.split("_");
                    if (strArrSplit2.length >= 2) {
                        for (String str3 : strArrSplit2) {
                            if (str3.matches("^\\d+$")) {
                                return str3;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private static boolean matchPhoneDigits(String str, String str2) {
        e.b bVarH;
        if (str != null && str2 != null && !str.isEmpty() && !str2.isEmpty()) {
            if (str.equals(str2)) {
                return true;
            }
            try {
                bVarH = T5.e.t().H(str, str2);
            } catch (Exception unused) {
            }
            if (bVarH != e.b.EXACT_MATCH && bVarH != e.b.NSN_MATCH && bVarH != e.b.SHORT_NSN_MATCH) {
                if (bVarH == e.b.NO_MATCH) {
                    return false;
                }
                String strDigitsOnly = digitsOnly(str);
                String strDigitsOnly2 = digitsOnly(str2);
                if (strDigitsOnly.equals(strDigitsOnly2)) {
                    return true;
                }
                if (strDigitsOnly.length() >= 8 && strDigitsOnly2.length() >= 8) {
                    return strDigitsOnly.substring(strDigitsOnly.length() - 8).equals(strDigitsOnly2.substring(strDigitsOnly2.length() - 8));
                }
            }
            return true;
        }
        return false;
    }

    @ReactMethod
    public void deleteAllMms(Promise promise) {
        try {
            promise.resolve(Integer.valueOf(this.reactContext.getContentResolver().delete(Uri.parse("content://mms"), null, null)));
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la suppression de tous les MMS", e10);
        }
    }

    @ReactMethod
    public void deleteAllSms(Promise promise) {
        try {
            promise.resolve(Integer.valueOf(this.reactContext.getContentResolver().delete(Uri.parse("content://sms"), null, null)));
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la suppression de tous les SMS", e10);
        }
    }

    @ReactMethod
    public void deleteMultipleSms(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        try {
            readableArray.size();
            ContentResolver contentResolver = this.reactContext.getContentResolver();
            Uri uri = Uri.parse("content://sms");
            int i10 = 0;
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                readableArray.getString(i11);
                int iDelete = contentResolver.delete(uri, "body = ?", new String[]{readableArray2.getString(i11)});
                if (iDelete > 0) {
                    i10 += iDelete;
                }
                Thread.sleep(100L);
            }
            promise.resolve(Integer.valueOf(i10));
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la suppression multiple par contenu", e10);
        }
    }

    @ReactMethod
    public void deleteSmsByAddressBodyDate(String str, String str2, Double d10, Promise promise) {
        int iDelete = 0;
        if (d10 == null) {
            if (str != null) {
            }
            promise.resolve(0);
            return;
        }
        try {
            d10.longValue();
            try {
                if (str != null || str2 == null || d10 == null) {
                    promise.resolve(0);
                    return;
                }
                ContentResolver contentResolver = this.reactContext.getContentResolver();
                Uri uri = Uri.parse("content://sms");
                long jLongValue = d10.longValue();
                String[] strArr = {str2, String.valueOf(jLongValue - 60000), String.valueOf(jLongValue + 60000)};
                String strDigitsOnly = digitsOnly(str);
                ArrayList arrayList = new ArrayList();
                Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id", "address", "date"}, "body = ? AND date >= ? AND date <= ?", strArr, null);
                if (cursorQuery != null) {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        int columnIndex2 = cursorQuery.getColumnIndex("address");
                        int columnIndex3 = cursorQuery.getColumnIndex("date");
                        while (cursorQuery.moveToNext()) {
                            long j10 = columnIndex >= 0 ? cursorQuery.getLong(columnIndex) : -1L;
                            String string = columnIndex2 >= 0 ? cursorQuery.getString(columnIndex2) : null;
                            if (columnIndex3 >= 0) {
                                cursorQuery.getLong(columnIndex3);
                            }
                            if (matchPhoneDigits(strDigitsOnly, digitsOnly(string))) {
                                arrayList.add(Long.valueOf(j10));
                            }
                        }
                        cursorQuery.close();
                    } finally {
                        cursorQuery.close();
                    }
                }
                arrayList.size();
                if (arrayList.isEmpty()) {
                    promise.resolve(0);
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iDelete += contentResolver.delete(Uri.parse("content://sms/" + ((Long) it.next())), null, null);
                }
                promise.resolve(Integer.valueOf(iDelete));
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        promise.reject("ERROR", "Erreur lors de la suppression par ADDRESS+BODY+DATE", e);
    }

    @ReactMethod
    public void deleteSmsByContact(String str, Promise promise) {
        try {
            promise.resolve(Integer.valueOf(this.reactContext.getContentResolver().delete(Uri.parse("content://sms"), "address = ?", new String[]{str})));
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la suppression des SMS", e10);
        }
    }

    @ReactMethod
    public void deleteSmsById(String str, Promise promise) {
        try {
            String strExtractNumericId = extractNumericId(str);
            if (this.reactContext.getContentResolver().delete(Uri.parse("content://sms/" + strExtractNumericId), null, null) > 0) {
                promise.resolve(Boolean.TRUE);
            } else {
                promise.resolve(Boolean.FALSE);
            }
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la suppression du SMS", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void getSmsCountByContact(String str, Promise promise) {
        int count;
        try {
            Cursor cursorQuery = this.reactContext.getContentResolver().query(Uri.parse("content://sms"), null, "address = ?", new String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    count = cursorQuery.getCount();
                } finally {
                }
            } else {
                count = 0;
            }
            promise.resolve(Integer.valueOf(count));
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors du comptage", e10);
        }
    }

    @ReactMethod
    public void getSmsIdsByContact(String str, Promise promise) {
        try {
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = this.reactContext.getContentResolver().query(Uri.parse("content://sms"), new String[]{"_id"}, "address = ?", strArr, "date DESC");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        do {
                            arrayList.add(cursorQuery.getString(columnIndex));
                        } while (cursorQuery.moveToNext());
                    }
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            arrayList.size();
            promise.resolve(arrayList.toArray(new String[0]));
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la récupération des IDs", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void smsExists(String str, Promise promise) {
        boolean z10;
        try {
            String strExtractNumericId = extractNumericId(str);
            Cursor cursorQuery = this.reactContext.getContentResolver().query(Uri.parse("content://sms/" + strExtractNumericId), new String[]{"_id"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    z10 = cursorQuery.moveToFirst();
                } finally {
                }
            }
            promise.resolve(Boolean.valueOf(z10));
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e10) {
            promise.reject("ERROR", "Erreur lors de la vérification", e10);
        }
    }
}
