package U7;

import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N {
    public static final List a(k8.f name) {
        AbstractC2855l.g(name, "name");
        String strJ = name.j();
        AbstractC2855l.f(strJ, "asString(...)");
        return H.c(strJ) ? AbstractC2800q.n(b(name)) : H.d(strJ) ? f(name) : C1482j.f11513a.b(name);
    }

    public static final k8.f b(k8.f methodName) {
        AbstractC2855l.g(methodName, "methodName");
        k8.f fVarE = e(methodName, "get", false, null, 12, null);
        return fVarE == null ? e(methodName, "is", false, null, 8, null) : fVarE;
    }

    public static final k8.f c(k8.f methodName, boolean z10) {
        AbstractC2855l.g(methodName, "methodName");
        return e(methodName, "set", false, z10 ? "is" : null, 4, null);
    }

    private static final k8.f d(k8.f fVar, String str, boolean z10, String str2) {
        if (fVar.r()) {
            return null;
        }
        String strM = fVar.m();
        AbstractC2855l.f(strM, "getIdentifier(...)");
        if (!P8.q.K(strM, str, false, 2, null) || strM.length() == str.length()) {
            return null;
        }
        char cCharAt = strM.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return k8.f.q(str2 + P8.q.w0(strM, str));
        }
        if (!z10) {
            return fVar;
        }
        String strC = K8.a.c(P8.q.w0(strM, str), true);
        if (k8.f.s(strC)) {
            return k8.f.q(strC);
        }
        return null;
    }

    static /* synthetic */ k8.f e(k8.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List f(k8.f methodName) {
        AbstractC2855l.g(methodName, "methodName");
        return AbstractC2800q.o(c(methodName, false), c(methodName, true));
    }
}
