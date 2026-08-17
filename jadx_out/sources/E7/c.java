package E7;

import C7.g;
import C7.k;
import C7.o;
import C7.v;
import F7.A;
import F7.K0;
import F7.U0;
import F7.j1;
import G7.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final Constructor a(g gVar) {
        h hVarR;
        AbstractC2855l.g(gVar, "<this>");
        A aB = j1.b(gVar);
        Member memberB = (aB == null || (hVarR = aB.R()) == null) ? null : hVarR.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field b(k kVar) {
        AbstractC2855l.g(kVar, "<this>");
        K0 k0D = j1.d(kVar);
        if (k0D != null) {
            return k0D.i0();
        }
        return null;
    }

    public static final Method c(k kVar) {
        AbstractC2855l.g(kVar, "<this>");
        return d(kVar.h0());
    }

    public static final Method d(g gVar) {
        h hVarR;
        AbstractC2855l.g(gVar, "<this>");
        A aB = j1.b(gVar);
        Member memberB = (aB == null || (hVarR = aB.R()) == null) ? null : hVarR.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Method e(C7.h hVar) {
        AbstractC2855l.g(hVar, "<this>");
        return d(hVar.h());
    }

    public static final Type f(o oVar) {
        AbstractC2855l.g(oVar, "<this>");
        Type typeC = ((U0) oVar).c();
        return typeC == null ? v.f(oVar) : typeC;
    }
}
