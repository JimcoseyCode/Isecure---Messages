package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f24157a;

    public M(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f24157a = new Bundle(bundle);
    }

    private static int d(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(v("gcm.n.e")));
    }

    private static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private String w(String str) {
        if (!this.f24157a.containsKey(str) && str.startsWith("gcm.n.")) {
            String strV = v(str);
            if (this.f24157a.containsKey(strV)) {
                return strV;
            }
        }
        return str;
    }

    private static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String strP = p(str);
        return "1".equals(strP) || Boolean.parseBoolean(strP);
    }

    public Integer b(String str) {
        String strP = p(str);
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strP));
        } catch (NumberFormatException unused) {
            z(str);
            return null;
        }
    }

    public JSONArray c(String str) {
        String strP = p(str);
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        try {
            return new JSONArray(strP);
        } catch (JSONException unused) {
            z(str);
            return null;
        }
    }

    int[] e() {
        JSONArray jSONArrayC = c("gcm.n.light_settings");
        if (jSONArrayC == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayC.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = d(jSONArrayC.optString(0));
            iArr[1] = jSONArrayC.optInt(1);
            iArr[2] = jSONArrayC.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            jSONArrayC.toString();
            e10.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayC.toString();
            return null;
        }
    }

    public Uri f() {
        String strP = p("gcm.n.link_android");
        if (TextUtils.isEmpty(strP)) {
            strP = p("gcm.n.link");
        }
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        return Uri.parse(strP);
    }

    public Object[] g(String str) {
        JSONArray jSONArrayC = c(str + "_loc_args");
        if (jSONArrayC == null) {
            return null;
        }
        int length = jSONArrayC.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayC.optString(i10);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String strH = h(str2);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        int identifier = resources.getIdentifier(strH, "string", str);
        if (identifier == 0) {
            z(str2 + "_loc_key");
            return null;
        }
        Object[] objArrG = g(str2);
        if (objArrG == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrG);
        } catch (MissingFormatArgumentException unused) {
            z(str2);
            Arrays.toString(objArrG);
            return null;
        }
    }

    public Long j(String str) {
        String strP = p(str);
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strP));
        } catch (NumberFormatException unused) {
            z(str);
            return null;
        }
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    Integer l() {
        Integer numB = b("gcm.n.notification_count");
        if (numB != null && numB.intValue() >= 0) {
            return numB;
        }
        return null;
    }

    Integer m() {
        Integer numB = b("gcm.n.notification_priority");
        if (numB != null && numB.intValue() >= -2 && numB.intValue() <= 2) {
            return numB;
        }
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String strP = p(str2);
        return !TextUtils.isEmpty(strP) ? strP : i(resources, str, str2);
    }

    public String o() {
        String strP = p("gcm.n.sound2");
        return TextUtils.isEmpty(strP) ? p("gcm.n.sound") : strP;
    }

    public String p(String str) {
        return this.f24157a.getString(w(str));
    }

    public long[] q() {
        JSONArray jSONArrayC = c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            return null;
        }
        try {
            if (jSONArrayC.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayC.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayC.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayC.toString();
            return null;
        }
    }

    Integer r() {
        Integer numB = b("gcm.n.visibility");
        if (numB != null && numB.intValue() >= -1 && numB.intValue() <= 1) {
            return numB;
        }
        return null;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f24157a);
        for (String str : this.f24157a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f24157a);
        for (String str : this.f24157a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
