package r4;

import android.util.Log;

/* JADX INFO: renamed from: r4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3263d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31924b;

    public C3263d(String str, String str2) {
        AbstractC3268i.l(str, "log tag cannot be null");
        AbstractC3268i.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f31923a = str;
        this.f31924b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String g(String str) {
        String str2 = this.f31924b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f31923a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            g(str2);
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            g(str2);
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(6)) {
            g(str2);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            g(str2);
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            g(str2);
        }
    }
}
