package Y2;

import android.content.Context;
import b3.C1803b;
import c3.InterfaceC1844a;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.q0;
import d2.AbstractC2325a;
import j3.C2768b;
import java.util.Set;
import m3.C2896a;
import m3.C2897b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Class f12916p = y.class;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static y f12917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static C1533t f12918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f12919s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f12920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1535v f12921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1515a f12922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c2.n f12923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private W2.n f12924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private W2.u f12925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private W2.n f12926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private W2.u f12927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b3.c f12928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k3.d f12929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C f12930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private W f12931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private V2.d f12932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h3.d f12933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private S2.a f12934o;

    public y(InterfaceC1535v interfaceC1535v) {
        if (C2768b.d()) {
            C2768b.a("ImagePipelineConfig()");
        }
        InterfaceC1535v interfaceC1535v2 = (InterfaceC1535v) c2.k.g(interfaceC1535v);
        this.f12921b = interfaceC1535v2;
        this.f12920a = interfaceC1535v2.F().G() ? new com.facebook.imagepipeline.producers.B(interfaceC1535v.H().b()) : new q0(interfaceC1535v.H().b());
        this.f12922c = new C1515a(interfaceC1535v.e());
        if (C2768b.d()) {
            C2768b.b();
        }
        this.f12923d = interfaceC1535v2.d();
        if (interfaceC1535v2.F().A()) {
            Q2.e.e().g(true);
        }
    }

    private C1533t a() {
        W wP = p();
        Set setJ = this.f12921b.j();
        Set setB = this.f12921b.b();
        c2.n nVarU = this.f12921b.u();
        W2.u uVarE = e();
        W2.u uVarH = h();
        c2.n nVar = this.f12923d;
        W2.k kVarL = this.f12921b.l();
        p0 p0Var = this.f12920a;
        c2.n nVarT = this.f12921b.F().t();
        c2.n nVarI = this.f12921b.F().I();
        this.f12921b.C();
        return new C1533t(wP, setJ, setB, nVarU, uVarE, uVarH, nVar, kVarL, p0Var, nVarT, nVarI, null, this.f12921b);
    }

    private S2.a c() {
        if (this.f12934o == null) {
            this.f12934o = S2.b.a(m(), this.f12921b.H(), d(), this.f12921b.F().j(), this.f12921b.F().v(), this.f12921b.F().c(), this.f12921b.F().d(), this.f12921b.v());
        }
        return this.f12934o;
    }

    private b3.c i() {
        b3.c cVarB;
        b3.c cVarC;
        if (this.f12928i == null) {
            if (this.f12921b.E() != null) {
                this.f12928i = this.f12921b.E();
            } else {
                S2.a aVarC = c();
                if (aVarC != null) {
                    cVarB = aVarC.b();
                    cVarC = aVarC.c();
                } else {
                    cVarB = null;
                    cVarC = null;
                }
                b3.c cVarR = r();
                this.f12921b.z();
                this.f12928i = new C1803b(cVarB, cVarC, cVarR, n());
            }
        }
        return this.f12928i;
    }

    private k3.d k() {
        if (this.f12929j == null) {
            if (this.f12921b.x() == null && this.f12921b.w() == null && this.f12921b.F().J()) {
                this.f12929j = new k3.h(this.f12921b.F().m());
            } else {
                this.f12929j = new k3.f(this.f12921b.F().m(), this.f12921b.F().x(), this.f12921b.x(), this.f12921b.w(), this.f12921b.F().F());
            }
        }
        return this.f12929j;
    }

    public static y l() {
        return (y) c2.k.h(f12917q, "ImagePipelineFactory was not initialized!");
    }

    private C o() {
        if (this.f12930k == null) {
            this.f12930k = this.f12921b.F().p().a(this.f12921b.getContext(), this.f12921b.a().k(), i(), this.f12921b.p(), this.f12921b.B(), this.f12921b.m(), this.f12921b.F().B(), this.f12921b.H(), this.f12921b.a().i(this.f12921b.c()), this.f12921b.a().j(), e(), h(), this.f12923d, this.f12921b.l(), m(), this.f12921b.F().g(), this.f12921b.F().f(), this.f12921b.F().e(), this.f12921b.F().m(), f(), this.f12921b.F().l(), this.f12921b.F().u());
        }
        return this.f12930k;
    }

    private W p() {
        boolean zW = this.f12921b.F().w();
        if (this.f12931l == null) {
            this.f12931l = new W(this.f12921b.getContext().getApplicationContext().getContentResolver(), o(), this.f12921b.g(), this.f12921b.m(), this.f12921b.F().L(), this.f12920a, this.f12921b.B(), zW, this.f12921b.F().K(), this.f12921b.A(), k(), this.f12921b.F().E(), this.f12921b.F().C(), this.f12921b.F().a(), this.f12921b.o());
        }
        return this.f12931l;
    }

    public static synchronized void s(InterfaceC1535v interfaceC1535v) {
        if (f12917q != null) {
            AbstractC2325a.E(f12916p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (f12919s) {
                return;
            }
        }
        f12917q = new y(interfaceC1535v);
    }

    public static synchronized void t(Context context) {
        try {
            if (C2768b.d()) {
                C2768b.a("ImagePipelineFactory#initialize");
            }
            s(C1534u.K(context).a());
            if (C2768b.d()) {
                C2768b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public InterfaceC1844a b(Context context) {
        S2.a aVarC = c();
        if (aVarC == null) {
            return null;
        }
        return aVarC.a(context);
    }

    public W2.n d() {
        if (this.f12924e == null) {
            this.f12924e = this.f12921b.f().a(this.f12921b.D(), this.f12921b.y(), this.f12921b.n(), this.f12921b.F().r(), this.f12921b.F().q(), this.f12921b.t());
        }
        return this.f12924e;
    }

    public W2.u e() {
        if (this.f12925f == null) {
            this.f12925f = W2.v.a(d(), this.f12921b.s());
        }
        return this.f12925f;
    }

    public C1515a f() {
        return this.f12922c;
    }

    public W2.n g() {
        if (this.f12926g == null) {
            this.f12926g = W2.r.a(this.f12921b.G(), this.f12921b.y(), this.f12921b.k());
        }
        return this.f12926g;
    }

    public W2.u h() {
        if (this.f12927h == null) {
            this.f12927h = W2.s.a(this.f12921b.h() != null ? this.f12921b.h() : g(), this.f12921b.s());
        }
        return this.f12927h;
    }

    public C1533t j() {
        if (f12918r == null) {
            f12918r = a();
        }
        return f12918r;
    }

    public V2.d m() {
        if (this.f12932m == null) {
            this.f12932m = V2.e.a(this.f12921b.a(), n(), f());
        }
        return this.f12932m;
    }

    public h3.d n() {
        if (this.f12933n == null) {
            this.f12933n = h3.e.a(this.f12921b.a(), this.f12921b.F().H(), this.f12921b.F().s(), this.f12921b.F().o());
        }
        return this.f12933n;
    }

    public InterfaceC1844a q() {
        if (this.f12921b.F().A()) {
            return new C2896a();
        }
        return null;
    }

    public b3.c r() {
        if (this.f12921b.F().A()) {
            return new C2897b(this.f12921b.getContext().getApplicationContext().getResources());
        }
        return null;
    }
}
