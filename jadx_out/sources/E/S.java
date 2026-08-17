package E;

import F.InterfaceC0484g0;
import F.InterfaceC0488i0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m5.InterfaceFutureC2904a;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    i0 f892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X f897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final InterfaceFutureC2904a f900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f901k = -1;

    S(InterfaceC0484g0 interfaceC0484g0, i0 i0Var, X x10, InterfaceFutureC2904a interfaceFutureC2904a, int i10) {
        this.f891a = i10;
        this.f892b = i0Var;
        i0Var.m();
        i0Var.o();
        this.f895e = i0Var.k();
        this.f894d = i0Var.n();
        this.f893c = i0Var.i();
        this.f896f = i0Var.p();
        this.f897g = x10;
        this.f898h = String.valueOf(interfaceC0484g0.hashCode());
        this.f899i = new ArrayList();
        List listA = interfaceC0484g0.a();
        Objects.requireNonNull(listA);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            this.f899i.add(Integer.valueOf(((InterfaceC0488i0) it.next()).getId()));
        }
        this.f900j = interfaceFutureC2904a;
    }

    InterfaceFutureC2904a a() {
        return this.f900j;
    }

    Rect b() {
        return this.f893c;
    }

    int c() {
        return this.f895e;
    }

    V.g d() {
        return null;
    }

    public int e() {
        return this.f891a;
    }

    int f() {
        return this.f894d;
    }

    V.g g() {
        return null;
    }

    Matrix h() {
        return this.f896f;
    }

    List i() {
        return this.f899i;
    }

    String j() {
        return this.f898h;
    }

    i0 k() {
        return this.f892b;
    }

    boolean l() {
        return this.f897g.a();
    }

    boolean m() {
        d();
        g();
        return true;
    }

    void n(y.X x10) {
        this.f897g.c(x10);
    }

    void o(int i10) {
        if (this.f901k != i10) {
            this.f901k = i10;
            this.f897g.onCaptureProcessProgressed(i10);
        }
    }

    void p() {
        this.f897g.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(androidx.camera.core.o oVar) {
        this.f897g.h(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(V.h hVar) {
        this.f897g.f(hVar);
    }

    void s() {
        if (this.f901k != -1) {
            o(100);
        }
        this.f897g.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(Bitmap bitmap) {
        this.f897g.e(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(y.X x10) {
        this.f897g.b(x10);
    }
}
