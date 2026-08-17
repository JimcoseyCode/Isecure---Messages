package e9;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: e9.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2440h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26135b;

    public C2440h(String scheme, Map authParams) {
        String lowerCase;
        AbstractC2855l.g(scheme, "scheme");
        AbstractC2855l.g(authParams, "authParams");
        this.f26135b = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                AbstractC2855l.f(US, "US");
                lowerCase = str.toLowerCase(US);
                AbstractC2855l.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC2855l.f(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f26134a = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f26134a.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                AbstractC2855l.f(charsetForName, "Charset.forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        AbstractC2855l.f(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.f26134a.get("realm");
    }

    public final String c() {
        return this.f26135b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2440h)) {
            return false;
        }
        C2440h c2440h = (C2440h) obj;
        return AbstractC2855l.b(c2440h.f26135b, this.f26135b) && AbstractC2855l.b(c2440h.f26134a, this.f26134a);
    }

    public int hashCode() {
        return ((899 + this.f26135b.hashCode()) * 31) + this.f26134a.hashCode();
    }

    public String toString() {
        return this.f26135b + " authParams=" + this.f26134a;
    }
}
