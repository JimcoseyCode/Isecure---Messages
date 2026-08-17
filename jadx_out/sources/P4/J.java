package P4;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8810a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f8811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8812c;

    J() {
    }

    public final void a(I i10) {
        synchronized (this.f8810a) {
            try {
                if (this.f8811b == null) {
                    this.f8811b = new ArrayDeque();
                }
                this.f8811b.add(i10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AbstractC1378l abstractC1378l) {
        I i10;
        synchronized (this.f8810a) {
            if (this.f8811b != null && !this.f8812c) {
                this.f8812c = true;
                while (true) {
                    synchronized (this.f8810a) {
                        try {
                            i10 = (I) this.f8811b.poll();
                            if (i10 == null) {
                                this.f8812c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    i10.a(abstractC1378l);
                }
            }
        }
    }
}
