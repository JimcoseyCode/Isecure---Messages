package F;

import F.AbstractC0482f0;
import y.AbstractC3583h0;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class W implements j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y.r0 f1400d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements y.r0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f1401d;

        a(long j10) {
            this.f1401d = j10;
        }

        @Override // y.r0
        public r0.c a(r0.b bVar) {
            return bVar.b() == 1 ? r0.c.f33838d : r0.c.f33839e;
        }

        @Override // y.r0
        public long c() {
            return this.f1401d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements j1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y.r0 f1403d;

        public b(long j10) {
            this.f1403d = new W(j10);
        }

        @Override // y.r0
        public r0.c a(r0.b bVar) {
            if (this.f1403d.a(bVar).d()) {
                return r0.c.f33839e;
            }
            Throwable thA = bVar.a();
            if (thA instanceof AbstractC0482f0.b) {
                AbstractC3583h0.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((AbstractC0482f0.b) thA).a() > 0) {
                    return r0.c.f33841g;
                }
            }
            return r0.c.f33838d;
        }

        @Override // y.r0
        public long c() {
            return this.f1403d.c();
        }

        @Override // F.j1
        public y.r0 d(long j10) {
            return new b(j10);
        }
    }

    public W(long j10) {
        this.f1400d = new w1(j10, new a(j10));
    }

    @Override // y.r0
    public r0.c a(r0.b bVar) {
        return this.f1400d.a(bVar);
    }

    @Override // y.r0
    public long c() {
        return this.f1400d.c();
    }

    @Override // F.j1
    public y.r0 d(long j10) {
        return new W(j10);
    }
}
