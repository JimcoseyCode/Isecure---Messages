package Q7;

import P8.q;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(k8.b bVar) {
        String strB = bVar.g().b();
        AbstractC2855l.f(strB, "asString(...)");
        String strD = q.D(strB, '.', '$', false, 4, null);
        if (bVar.f().d()) {
            return strD;
        }
        return bVar.f() + '.' + strD;
    }
}
