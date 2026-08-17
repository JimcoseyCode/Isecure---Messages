package g0;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class n0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f28076a;

    public n0(s0 s0Var) {
        H0.g.a(s0Var.d());
        this.f28076a = s0Var;
    }

    @Override // g0.s0
    public int b() {
        return this.f28076a.g();
    }

    @Override // g0.s0
    public Range c() {
        return this.f28076a.c();
    }

    @Override // g0.s0
    public boolean d() {
        return this.f28076a.d();
    }

    @Override // g0.s0
    public Range e(int i10) {
        return this.f28076a.f(i10);
    }

    @Override // g0.s0
    public Range f(int i10) {
        return this.f28076a.e(i10);
    }

    @Override // g0.s0
    public int g() {
        return this.f28076a.b();
    }

    @Override // g0.s0
    public Range h() {
        return this.f28076a.j();
    }

    @Override // g0.s0
    public boolean i(int i10, int i11) {
        return this.f28076a.i(i11, i10);
    }

    @Override // g0.s0
    public Range j() {
        return this.f28076a.h();
    }
}
