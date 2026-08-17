package com.google.firebase.messaging;

import android.text.TextUtils;
import java.util.regex.Pattern;
import r4.AbstractC3267h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f24249d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24252c;

    private e0(String str, String str2) {
        this.f24250a = d(str2, str);
        this.f24251b = str;
        this.f24252c = str + "!" + str2;
    }

    static e0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new e0(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2);
            str = str.substring(8);
        }
        if (str == null || !f24249d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static e0 f(String str) {
        return new e0("S", str);
    }

    public static e0 g(String str) {
        return new e0("U", str);
    }

    public String b() {
        return this.f24251b;
    }

    public String c() {
        return this.f24250a;
    }

    public String e() {
        return this.f24252c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f24250a.equals(e0Var.f24250a) && this.f24251b.equals(e0Var.f24251b);
    }

    public int hashCode() {
        return AbstractC3267h.b(this.f24251b, this.f24250a);
    }
}
