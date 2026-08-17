package R8;

import W8.AbstractC1504g;
import i7.AbstractC2738a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L {
    public static final void a(n7.j jVar, Throwable th) {
        if (th instanceof Z) {
            th = ((Z) th).getCause();
        }
        try {
            K k10 = (K) jVar.e(K.f10142b);
            if (k10 != null) {
                k10.W(jVar, th);
            } else {
                AbstractC1504g.a(jVar, th);
            }
        } catch (Throwable th2) {
            AbstractC1504g.a(jVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC2738a.a(runtimeException, th);
        return runtimeException;
    }
}
