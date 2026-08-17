package W2;

import W2.n;
import W2.x;
import f2.InterfaceC2603d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l implements InterfaceC1494a {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements D {
        a() {
        }

        @Override // W2.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(d3.e eVar) {
            return eVar.l();
        }
    }

    @Override // W2.InterfaceC1494a
    public n a(c2.n nVar, InterfaceC2603d interfaceC2603d, x.a aVar, boolean z10, boolean z11, n.b bVar) {
        w wVar = new w(new a(), aVar, nVar, bVar, z10, z11);
        interfaceC2603d.a(wVar);
        return wVar;
    }
}
