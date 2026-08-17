package e2;

import P8.q;
import i7.t;
import j7.K;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: e2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2393a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2393a f25819a = new C2393a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f25820b = K.l(t.a("mkv", "video/x-matroska"), t.a("glb", "model/gltf-binary"));

    private C2393a() {
    }

    private final String a(String str) {
        int iI0 = q.i0(str, '.', 0, false, 6, null);
        if (iI0 < 0 || iI0 == str.length() - 1) {
            return null;
        }
        String strSubstring = str.substring(iI0 + 1);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String b(String path) {
        AbstractC2855l.g(path, "path");
        String strA = f25819a.a(path);
        if (strA == null) {
            return null;
        }
        Locale US = Locale.US;
        AbstractC2855l.f(US, "US");
        String lowerCase = strA.toLowerCase(US);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return null;
        }
        String strA2 = AbstractC2394b.a(lowerCase);
        return strA2 == null ? (String) f25820b.get(lowerCase) : strA2;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return q.K(str, "video/", false, 2, null);
        }
        return false;
    }
}
