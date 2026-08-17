package W8;

import i7.AbstractC2738a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x {
    public static final void a(Function1 function1, Object obj, n7.j jVar) {
        Q qB = b(function1, obj, null);
        if (qB != null) {
            R8.L.a(jVar, qB);
        }
    }

    public static final Q b(Function1 function1, Object obj, Q q10) {
        try {
            function1.invoke(obj);
            return q10;
        } catch (Throwable th) {
            if (q10 != null && q10.getCause() != th) {
                AbstractC2738a.a(q10, th);
                return q10;
            }
            return new Q("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ Q c(Function1 function1, Object obj, Q q10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q10 = null;
        }
        return b(function1, obj, q10);
    }
}
