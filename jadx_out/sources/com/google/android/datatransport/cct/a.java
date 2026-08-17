package com.google.android.datatransport.cct;

import W3.g;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f20901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f20902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f20904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f20905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f20906h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20908b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20901c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f20902d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20903e = strA3;
        f20904f = Collections.unmodifiableSet(new HashSet(Arrays.asList(U3.c.b("proto"), U3.c.b("json"))));
        f20905g = new a(strA, null);
        f20906h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f20907a = str;
        this.f20908b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // W3.g
    public Set a() {
        return f20904f;
    }

    public byte[] b() {
        String str = this.f20908b;
        if (str == null && this.f20907a == null) {
            return null;
        }
        String str2 = this.f20907a;
        if (str == null) {
            str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f20908b;
    }

    public String e() {
        return this.f20907a;
    }

    @Override // W3.f
    public byte[] getExtras() {
        return b();
    }

    @Override // W3.f
    public String getName() {
        return "cct";
    }
}
