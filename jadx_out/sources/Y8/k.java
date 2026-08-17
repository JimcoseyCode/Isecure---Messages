package Y8;

import R8.J;
import W8.AbstractC1510m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class k extends J {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f13142i = new k();

    private k() {
    }

    @Override // R8.J
    public void J0(n7.j jVar, Runnable runnable) {
        c.f13126o.P0(runnable, true, false);
    }

    @Override // R8.J
    public void K0(n7.j jVar, Runnable runnable) {
        c.f13126o.P0(runnable, true, true);
    }

    @Override // R8.J
    public J M0(int i10, String str) {
        AbstractC1510m.a(i10);
        return i10 >= j.f13139d ? AbstractC1510m.b(this, str) : super.M0(i10, str);
    }

    @Override // R8.J
    public String toString() {
        return "Dispatchers.IO";
    }
}
