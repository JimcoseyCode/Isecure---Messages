package T;

import F.I;
import F.L;
import F.M;
import F.V0;
import H.y;
import T.g;
import java.util.Collection;
import m5.InterfaceFutureC2904a;
import y.J0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class j implements M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M f10361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f10362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f10363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final J0.c f10364j;

    j(M m10, J0.c cVar, g.a aVar) {
        this.f10361g = m10;
        this.f10364j = cVar;
        this.f10362h = new p(m10.h(), aVar);
        this.f10363i = new q(m10.r());
    }

    @Override // F.M
    public InterfaceFutureC2904a a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // F.M
    public V0 c() {
        return this.f10361g.c();
    }

    @Override // y.J0.c
    public void e(J0 j02) {
        y.b();
        this.f10364j.e(j02);
    }

    @Override // y.J0.c
    public void g(J0 j02) {
        y.b();
        this.f10364j.g(j02);
    }

    @Override // F.M
    public I h() {
        return this.f10362h;
    }

    @Override // y.J0.c
    public void k(J0 j02) {
        y.b();
        this.f10364j.k(j02);
    }

    @Override // F.M
    public void l(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // F.M
    public void m(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // F.M
    public boolean o() {
        return false;
    }

    @Override // F.M
    public L r() {
        return this.f10363i;
    }

    @Override // y.J0.c
    public void s(J0 j02) {
        y.b();
        this.f10364j.s(j02);
    }

    void t(int i10) {
        this.f10363i.B(i10);
    }
}
