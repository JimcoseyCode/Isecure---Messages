package o;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f30300a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CancellationSignal f30301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D0.d f30302c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements c {
        a() {
        }

        @Override // o.h.c
        public D0.d a() {
            return new D0.d();
        }

        @Override // o.h.c
        public CancellationSignal b() {
            return b.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface c {
        D0.d a();

        CancellationSignal b();
    }

    h() {
    }

    void a() {
        CancellationSignal cancellationSignal = this.f30301b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException unused) {
            }
            this.f30301b = null;
        }
        D0.d dVar = this.f30302c;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (NullPointerException unused2) {
            }
            this.f30302c = null;
        }
    }

    CancellationSignal b() {
        if (this.f30301b == null) {
            this.f30301b = this.f30300a.b();
        }
        return this.f30301b;
    }

    D0.d c() {
        if (this.f30302c == null) {
            this.f30302c = this.f30300a.a();
        }
        return this.f30302c;
    }
}
