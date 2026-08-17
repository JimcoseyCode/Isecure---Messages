package com.ov.message;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsReadModule extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME = "SmsReadModule";
    private static final String TAG = "SmsReadModule";
    private final ReactApplicationContext reactContext;

    public SmsReadModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SmsReadModule";
    }

    @ReactMethod
    public void isReady(Promise promise) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("ready", true);
        int i10 = Build.VERSION.SDK_INT;
        writableMapCreateMap.putInt("androidVersion", i10);
        writableMapCreateMap.putBoolean("android12Plus", i10 >= 31);
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public void list(String str, Promise promise) throws Throwable {
        Uri uri;
        int i10;
        int i11;
        String str2;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        Promise promise2 = promise;
        String str3 = "date DESC";
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("box", "inbox");
            Cursor cursorQuery = null;
            String strOptString2 = jSONObject.optString("address", null);
            int iOptInt = jSONObject.optInt("maxCount", 50);
            String strOptString3 = jSONObject.optString(Constants.SORT, "date DESC");
            String lowerCase = strOptString.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            String str4 = "sent";
            if (iHashCode == 3526552) {
                uri = lowerCase.equals("sent") ? Uri.parse("content://sms/sent") : Uri.parse("content://sms/inbox");
            } else if (iHashCode != 95844769) {
                if (iHashCode == 100344454) {
                    lowerCase.equals("inbox");
                }
            } else if (lowerCase.equals("draft")) {
                uri = Uri.parse("content://sms/draft");
            }
            Uri uri2 = uri;
            String[] strArr = {"_id", "address", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "date", NotificationsService.EVENT_TYPE_KEY, "read"};
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            if (strOptString2 != null && !strOptString2.trim().isEmpty()) {
                String strNormalizePhoneNumber = PhoneNumberUtils.normalizePhoneNumber(strOptString2, this.reactContext);
                sb.append("(");
                sb.append("address");
                sb.append(" = ? OR ");
                sb.append("address");
                sb.append(" LIKE ?");
                sb.append(")");
                arrayList.add(strNormalizePhoneNumber);
                arrayList.add("%" + strNormalizePhoneNumber + "%");
            }
            String string = sb.length() > 0 ? sb.toString() : null;
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            if (strOptString3 != null && !strOptString3.isEmpty() && strOptString3.toLowerCase().contains("asc")) {
                str3 = "date ASC";
            }
            try {
                try {
                    cursorQuery = this.reactContext.getContentResolver().query(uri2, strArr, string, strArr2, str3);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (SecurityException unused) {
            } catch (Exception e10) {
                e = e10;
            }
            if (cursorQuery == null) {
                promise2.resolve("[]");
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return;
                }
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            int i12 = 0;
            while (cursorQuery.moveToNext() && i12 < iOptInt) {
                try {
                    try {
                        columnIndex = cursorQuery.getColumnIndex("_id");
                        columnIndex2 = cursorQuery.getColumnIndex("address");
                        columnIndex3 = cursorQuery.getColumnIndex(ExpoNotificationBuilder.EXTRAS_BODY_KEY);
                        i10 = i12;
                        try {
                            columnIndex4 = cursorQuery.getColumnIndex("date");
                            i11 = iOptInt;
                        } catch (Exception unused2) {
                            i11 = iOptInt;
                            str2 = str4;
                            i12 = i10;
                            iOptInt = i11;
                            str4 = str2;
                        }
                        try {
                            columnIndex5 = cursorQuery.getColumnIndex(NotificationsService.EVENT_TYPE_KEY);
                            str2 = str4;
                            try {
                                columnIndex6 = cursorQuery.getColumnIndex("read");
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            str2 = str4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                } catch (Exception unused5) {
                    i10 = i12;
                }
                if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1) {
                    i12 = i10;
                } else {
                    String string2 = cursorQuery.getString(columnIndex);
                    String string3 = cursorQuery.getString(columnIndex2);
                    String string4 = cursorQuery.getString(columnIndex3);
                    long j10 = cursorQuery.getLong(columnIndex4);
                    int i13 = cursorQuery.getInt(columnIndex5);
                    int i14 = columnIndex6 != -1 ? cursorQuery.getInt(columnIndex6) : 0;
                    String strNormalizePhoneNumber2 = PhoneNumberUtils.normalizePhoneNumber(string3, this.reactContext);
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("_id", string2);
                    writableMapCreateMap.putString("address", strNormalizePhoneNumber2);
                    if (string4 == null) {
                        string4 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                    }
                    writableMapCreateMap.putString(ExpoNotificationBuilder.EXTRAS_BODY_KEY, string4);
                    writableMapCreateMap.putString("date", String.valueOf(j10));
                    writableMapCreateMap.putString(NotificationsService.EVENT_TYPE_KEY, i13 == 2 ? str2 : "received");
                    writableMapCreateMap.putInt("read", i14);
                    writableArrayCreateArray.pushMap(writableMapCreateMap);
                    i12 = i10 + 1;
                }
                iOptInt = i11;
                str4 = str2;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i15 = 0; i15 < writableArrayCreateArray.size(); i15++) {
                    ReadableMap map = writableArrayCreateArray.getMap(i15);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("_id", map.getString("_id"));
                    jSONObject2.put("address", map.getString("address"));
                    jSONObject2.put(ExpoNotificationBuilder.EXTRAS_BODY_KEY, map.getString(ExpoNotificationBuilder.EXTRAS_BODY_KEY));
                    jSONObject2.put("date", map.getString("date"));
                    jSONObject2.put(NotificationsService.EVENT_TYPE_KEY, map.getString(NotificationsService.EVENT_TYPE_KEY));
                    jSONObject2.put("read", map.getInt("read"));
                    jSONArray.put(jSONObject2);
                }
                promise.resolve(jSONArray.toString());
            } catch (SecurityException unused6) {
                promise2 = promise;
                promise2.reject("PERMISSION_DENIED", "Permission READ_SMS non accordée");
                if (cursorQuery == null) {
                    return;
                }
            } catch (Exception e11) {
                e = e11;
                promise2 = promise;
                promise2.reject("READ_ERROR", "Erreur de lecture: " + e.getMessage());
                if (cursorQuery == null) {
                    return;
                }
            }
            cursorQuery.close();
        } catch (Exception e12) {
            promise2.reject("PARSE_ERROR", "Erreur parsing filtres: " + e12.getMessage());
        }
    }
}
