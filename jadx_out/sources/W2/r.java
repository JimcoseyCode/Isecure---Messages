package W2;

import W2.x;
import f2.InterfaceC2603d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements D {
        a() {
        }

        @Override // W2.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(f2.h hVar) {
            return hVar.size();
        }
    }

    public static n a(c2.n nVar, InterfaceC2603d interfaceC2603d, x.a aVar) {
        w wVar = new w(new a(), aVar, nVar, null, false, false);
        interfaceC2603d.a(wVar);
        return wVar;
    }
}
