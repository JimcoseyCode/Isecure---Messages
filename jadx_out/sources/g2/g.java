package g2;

import c2.k;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g extends AbstractC2662a {
    private g(i iVar, AbstractC2662a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    @Override // g2.AbstractC2662a
    /* JADX INFO: renamed from: k */
    public AbstractC2662a clone() {
        k.i(W());
        return new g(this.f28120h, this.f28121i, this.f28122j);
    }

    g(Object obj, h hVar, AbstractC2662a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, false);
    }
}
