package Y8;

import R8.AbstractC1430q0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends AbstractC1430q0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f13128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f13129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f13130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f13131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f13132n = O0();

    public f(int i10, int i11, long j10, String str) {
        this.f13128j = i10;
        this.f13129k = i11;
        this.f13130l = j10;
        this.f13131m = str;
    }

    private final a O0() {
        return new a(this.f13128j, this.f13129k, this.f13130l, this.f13131m);
    }

    @Override // R8.J
    public void J0(n7.j jVar, Runnable runnable) {
        a.B(this.f13132n, runnable, false, false, 6, null);
    }

    @Override // R8.J
    public void K0(n7.j jVar, Runnable runnable) {
        a.B(this.f13132n, runnable, false, true, 2, null);
    }

    public final void P0(Runnable runnable, boolean z10, boolean z11) {
        this.f13132n.A(runnable, z10, z11);
    }
}
