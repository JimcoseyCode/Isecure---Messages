package g2;

import d2.AbstractC2325a;
import g2.AbstractC2662a;

/* JADX INFO: renamed from: g2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2664c extends AbstractC2662a {
    C2664c(Object obj, h hVar, AbstractC2662a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, true);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f28119g) {
                    return;
                }
                Object objF = this.f28120h.f();
                AbstractC2325a.K("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f28120h)), objF == null ? null : objF.getClass().getName());
                this.f28120h.d();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // g2.AbstractC2662a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // g2.AbstractC2662a
    /* JADX INFO: renamed from: k */
    public AbstractC2662a clone() {
        return this;
    }
}
