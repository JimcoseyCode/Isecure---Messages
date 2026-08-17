package g2;

import c2.k;
import d2.AbstractC2325a;
import g2.AbstractC2662a;

/* JADX INFO: renamed from: g2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2663b extends AbstractC2662a {
    private C2663b(i iVar, AbstractC2662a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f28119g) {
                    super.finalize();
                    return;
                }
                Object objF = this.f28120h.f();
                AbstractC2325a.K("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f28120h)), objF == null ? null : objF.getClass().getName());
                AbstractC2662a.c cVar = this.f28121i;
                if (cVar != null) {
                    cVar.b(this.f28120h, this.f28122j);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // g2.AbstractC2662a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC2662a clone() {
        k.i(W());
        return new C2663b(this.f28120h, this.f28121i, this.f28122j != null ? new Throwable() : null);
    }

    C2663b(Object obj, h hVar, AbstractC2662a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, true);
    }
}
