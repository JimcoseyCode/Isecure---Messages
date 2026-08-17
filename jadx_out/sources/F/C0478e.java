package F;

import java.util.Collection;
import m5.InterfaceFutureC2904a;
import y.InterfaceC3586j;
import y.InterfaceC3597q;

/* JADX INFO: renamed from: F.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C0478e implements M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M f1455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0475d f1456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0472c f1457i;

    public C0478e(M m10, C0475d c0475d) {
        this.f1455g = m10;
        this.f1456h = c0475d;
        E eB = c0475d.B();
        I iH = m10.h();
        eB.R(null);
        this.f1457i = new C0472c(iH, null);
    }

    @Override // F.M
    public InterfaceFutureC2904a a() {
        return this.f1455g.a();
    }

    @Override // F.M, y.InterfaceC3584i
    public InterfaceC3586j b() {
        return this.f1457i;
    }

    @Override // F.M
    public V0 c() {
        return this.f1455g.c();
    }

    @Override // F.M, y.InterfaceC3584i
    public InterfaceC3597q d() {
        return this.f1456h;
    }

    @Override // y.J0.c
    public void e(y.J0 j02) {
        this.f1455g.e(j02);
    }

    @Override // F.M
    public boolean f() {
        return this.f1455g.f();
    }

    @Override // y.J0.c
    public void g(y.J0 j02) {
        this.f1455g.g(j02);
    }

    @Override // F.M
    public I h() {
        return this.f1457i;
    }

    @Override // F.M
    public E i() {
        return this.f1455g.i();
    }

    @Override // F.M
    public void j(boolean z10) {
        this.f1455g.j(z10);
    }

    @Override // y.J0.c
    public void k(y.J0 j02) {
        this.f1455g.k(j02);
    }

    @Override // F.M
    public void l(Collection collection) {
        this.f1455g.l(collection);
    }

    @Override // F.M
    public void m(Collection collection) {
        this.f1455g.m(collection);
    }

    @Override // F.M
    public boolean o() {
        return this.f1455g.o();
    }

    @Override // F.M
    public void p(boolean z10) {
        this.f1455g.p(z10);
    }

    @Override // F.M
    public void q(E e10) {
        this.f1455g.q(e10);
    }

    @Override // F.M
    public L r() {
        return this.f1456h;
    }

    @Override // y.J0.c
    public void s(y.J0 j02) {
        this.f1455g.s(j02);
    }
}
