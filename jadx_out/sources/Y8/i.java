package Y8;

import R8.S;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class i extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f13135i;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f13135i = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13135i.run();
    }

    public String toString() {
        return "Task[" + S.a(this.f13135i) + '@' + S.b(this.f13135i) + ", " + this.f13133g + ", " + j.c(this.f13134h) + ']';
    }
}
