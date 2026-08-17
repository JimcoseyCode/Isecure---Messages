package X8;

import R8.B;
import R8.H0;
import R8.X0;
import R8.Z;
import W8.A;
import W8.L;
import i7.AbstractC2753p;
import i7.C2742e;
import i7.C2752o;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import n7.f;
import n7.j;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    private static final Void a(A a10, Z z10) throws Throwable {
        a10.i0(new B(z10.getCause(), false, 2, null));
        throw z10.getCause();
    }

    private static final boolean b(A a10, Throwable th) {
        return ((th instanceof X0) && ((X0) th).f10165g == a10) ? false : true;
    }

    public static final void c(Function2 function2, Object obj, f fVar) {
        f fVarA = h.a(fVar);
        try {
            j context = fVarA.getContext();
            Object objI = L.i(context, null);
            try {
                h.b(fVarA);
                Object objD = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC3016b.d(function2, obj, fVarA) : ((Function2) I.e(function2, 2)).invoke(obj, fVarA);
                L.f(context, objI);
                if (objD != AbstractC3016b.e()) {
                    fVarA.resumeWith(C2752o.b(objD));
                }
            } catch (Throwable th) {
                L.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof Z) {
                th = ((Z) th).getCause();
            }
            C2752o.a aVar = C2752o.f28721h;
            fVarA.resumeWith(C2752o.b(AbstractC2753p.a(th)));
        }
    }

    public static final Object d(A a10, Object obj, Function2 function2) {
        return f(a10, true, obj, function2);
    }

    public static final Object e(A a10, Object obj, Function2 function2) {
        return f(a10, false, obj, function2);
    }

    private static final Object f(A a10, boolean z10, Object obj, Function2 function2) throws Throwable {
        Object b10;
        try {
            b10 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC3016b.d(function2, obj, a10) : ((Function2) I.e(function2, 2)).invoke(obj, a10);
        } catch (Z e10) {
            a(a10, e10);
            throw new C2742e();
        } catch (Throwable th) {
            b10 = new B(th, false, 2, null);
        }
        if (b10 == AbstractC3016b.e()) {
            return AbstractC3016b.e();
        }
        Object objJ0 = a10.j0(b10);
        if (objJ0 == H0.f10133b) {
            return AbstractC3016b.e();
        }
        a10.Q0();
        if (!(objJ0 instanceof B)) {
            return H0.h(objJ0);
        }
        if (z10 || b(a10, ((B) objJ0).f10115a)) {
            throw ((B) objJ0).f10115a;
        }
        if (b10 instanceof B) {
            throw ((B) b10).f10115a;
        }
        return b10;
    }
}
