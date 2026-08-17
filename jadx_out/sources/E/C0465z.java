package E;

import E.C0460u;
import E.Y;
import F.AbstractC0504q0;
import F.C0;
import F.C0486h0;
import F.D0;
import F.InterfaceC0484g0;
import F.InterfaceC0488i0;
import F.k1;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.core.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;
import y.AbstractC3560E;
import y.AbstractC3588k;

/* JADX INFO: renamed from: E.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C0465z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f1006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final N.b f1007g = new N.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f1008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0486h0 f1009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0460u f1010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q f1011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0460u.c f1012e;

    public C0465z(C0 c02, Size size, CameraCharacteristics cameraCharacteristics, AbstractC3588k abstractC3588k, boolean z10, G g10) {
        H.y.b();
        this.f1008a = c02;
        this.f1009b = C0486h0.a.j(c02).h();
        C0460u c0460u = new C0460u();
        this.f1010c = c0460u;
        Executor executorK0 = c02.k0(I.c.d());
        Objects.requireNonNull(executorK0);
        Q q10 = new Q(executorK0, cameraCharacteristics, null);
        this.f1011d = q10;
        ArrayList arrayList = new ArrayList();
        if (c02.J() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            arrayList.add(Integer.valueOf(i()));
        }
        int iR = c02.r();
        c02.j0();
        C0460u.c cVarN = C0460u.c.n(size, iR, arrayList, z10, null, g10);
        this.f1012e = cVarN;
        q10.p(c0460u.s(cVarN));
    }

    private C0451k b(int i10, InterfaceC0484g0 interfaceC0484g0, i0 i0Var, X x10) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(interfaceC0484g0.hashCode());
        List<InterfaceC0488i0> listA = interfaceC0484g0.a();
        Objects.requireNonNull(listA);
        for (InterfaceC0488i0 interfaceC0488i0 : listA) {
            C0486h0.a aVar = new C0486h0.a();
            aVar.v(this.f1009b.k());
            aVar.e(this.f1009b.g());
            aVar.a(i0Var.q());
            aVar.f(this.f1012e.l());
            if (this.f1012e.e().size() > 1 && this.f1012e.j() != null) {
                aVar.f(this.f1012e.j());
            }
            boolean zL = l();
            if (zL) {
                AbstractC0504q0 abstractC0504q0G = this.f1012e.g();
                Objects.requireNonNull(abstractC0504q0G);
                aVar.f(abstractC0504q0G);
            }
            aVar.t(zL);
            if (O.b.i(this.f1012e.d()) || O.b.j(this.f1012e.d())) {
                if (f1007g.a()) {
                    aVar.d(C0486h0.f1472i, Integer.valueOf(i0Var.n()));
                }
                aVar.d(C0486h0.f1473j, Integer.valueOf(g(i0Var)));
            }
            aVar.e(interfaceC0488i0.a().g());
            aVar.g(strValueOf, Integer.valueOf(interfaceC0488i0.getId()));
            aVar.r(i10);
            aVar.c(this.f1012e.a());
            if (this.f1012e.e().size() > 1 && this.f1012e.i() != null) {
                aVar.c(this.f1012e.i());
            }
            arrayList.add(aVar.h());
        }
        return new C0451k(arrayList, x10);
    }

    private InterfaceC0484g0 c() {
        InterfaceC0484g0 interfaceC0484g0F0 = this.f1008a.f0(AbstractC3560E.b());
        Objects.requireNonNull(interfaceC0484g0F0);
        return interfaceC0484g0F0;
    }

    private S d(int i10, InterfaceC0484g0 interfaceC0484g0, i0 i0Var, X x10, InterfaceFutureC2904a interfaceFutureC2904a) {
        return new S(interfaceC0484g0, i0Var, x10, interfaceFutureC2904a, i10);
    }

    private int i() {
        Integer num = (Integer) this.f1008a.f(C0.f1275T, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f1008a.f(D0.f1294j, null);
        if (num2 == null || num2.intValue() != 4101) {
            return (num2 == null || num2.intValue() != 32) ? 256 : 32;
        }
        return 4101;
    }

    private boolean l() {
        return this.f1012e.g() != null;
    }

    public void a() {
        H.y.b();
        this.f1010c.n();
        this.f1011d.n();
    }

    H0.d e(i0 i0Var, X x10, InterfaceFutureC2904a interfaceFutureC2904a) {
        H.y.b();
        InterfaceC0484g0 interfaceC0484g0C = c();
        int i10 = f1006f;
        f1006f = i10 + 1;
        return new H0.d(b(i10, interfaceC0484g0C, i0Var, x10), d(i10, interfaceC0484g0C, i0Var, x10, interfaceFutureC2904a));
    }

    public k1.b f(Size size) {
        k1.b bVarR = k1.b.r(this.f1008a, size);
        bVarR.h(this.f1012e.l());
        if (this.f1012e.e().size() > 1 && this.f1012e.j() != null) {
            bVarR.h(this.f1012e.j());
        }
        if (this.f1012e.g() != null) {
            bVarR.y(this.f1012e.g());
        }
        return bVarR;
    }

    int g(i0 i0Var) {
        i0Var.l();
        H.z.h(i0Var.i(), this.f1012e.k());
        return i0Var.k();
    }

    public int h() {
        H.y.b();
        return this.f1010c.i();
    }

    void j(Y.a aVar) {
        H.y.b();
        this.f1012e.b().accept(aVar);
    }

    public void k(e.a aVar) {
        H.y.b();
        this.f1010c.r(aVar);
    }

    void m(S s10) {
        H.y.b();
        this.f1012e.h().accept(s10);
    }
}
