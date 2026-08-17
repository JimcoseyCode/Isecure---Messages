package W8;

import i7.AbstractC2738a;
import java.util.Iterator;

/* JADX INFO: renamed from: W8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1504g {
    public static final void a(n7.j jVar, Throwable th) {
        Iterator it = AbstractC1503f.a().iterator();
        while (it.hasNext()) {
            try {
                ((R8.K) it.next()).W(jVar, th);
            } catch (Throwable th2) {
                AbstractC1503f.b(R8.L.b(th, th2));
            }
        }
        try {
            AbstractC2738a.a(th, new C1505h(jVar));
        } catch (Throwable unused) {
        }
        AbstractC1503f.b(th);
    }
}
