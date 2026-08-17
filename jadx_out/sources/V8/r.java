package V8;

import R8.A0;
import W8.A;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static final void b(final o oVar, n7.j jVar) {
        if (((Number) jVar.u0(0, new Function2() { // from class: V8.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(r.c(oVar, ((Integer) obj).intValue(), (j.b) obj2));
            }
        })).intValue() == oVar.f11872i) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + oVar.f11871h + ",\n\t\tbut emission happened in " + jVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(o oVar, int i10, j.b bVar) {
        j.c key = bVar.getKey();
        j.b bVarE = oVar.f11871h.e(key);
        if (key != A0.f10112c) {
            return bVar != bVarE ? androidx.customview.widget.a.INVALID_ID : i10 + 1;
        }
        A0 a02 = (A0) bVarE;
        AbstractC2855l.e(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        A0 a0D = d((A0) bVar, a02);
        if (a0D == a02) {
            return a02 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + a0D + ", expected child of " + a02 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final A0 d(A0 a02, A0 a03) {
        while (a02 != null) {
            if (a02 == a03 || !(a02 instanceof A)) {
                return a02;
            }
            a02 = ((A) a02).T();
        }
        return null;
    }
}
