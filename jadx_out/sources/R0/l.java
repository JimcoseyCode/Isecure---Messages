package r0;

import java.util.HashSet;
import r0.C3242e;
import s0.C3313b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends AbstractC3247j {

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f31813L0 = 0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f31814M0 = 0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f31815N0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f31816O0 = 0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f31817P0 = 0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f31818Q0 = 0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private int f31819R0 = 0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private int f31820S0 = 0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private boolean f31821T0 = false;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private int f31822U0 = 0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private int f31823V0 = 0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    protected C3313b.a f31824W0 = new C3313b.a();

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    C3313b.InterfaceC0354b f31825X0 = null;

    protected void A1(boolean z10) {
        this.f31821T0 = z10;
    }

    public void B1(int i10, int i11) {
        this.f31822U0 = i10;
        this.f31823V0 = i11;
    }

    public void C1(int i10) {
        this.f31815N0 = i10;
        this.f31813L0 = i10;
        this.f31816O0 = i10;
        this.f31814M0 = i10;
        this.f31817P0 = i10;
        this.f31818Q0 = i10;
    }

    public void D1(int i10) {
        this.f31814M0 = i10;
    }

    public void E1(int i10) {
        this.f31818Q0 = i10;
    }

    public void F1(int i10) {
        this.f31815N0 = i10;
        this.f31819R0 = i10;
    }

    public void G1(int i10) {
        this.f31816O0 = i10;
        this.f31820S0 = i10;
    }

    public void H1(int i10) {
        this.f31817P0 = i10;
        this.f31819R0 = i10;
        this.f31820S0 = i10;
    }

    public void I1(int i10) {
        this.f31813L0 = i10;
    }

    @Override // r0.AbstractC3247j, r0.InterfaceC3246i
    public void a(C3243f c3243f) {
        o1();
    }

    public void n1(boolean z10) {
        int i10 = this.f31817P0;
        if (i10 > 0 || this.f31818Q0 > 0) {
            if (z10) {
                this.f31819R0 = this.f31818Q0;
                this.f31820S0 = i10;
            } else {
                this.f31819R0 = i10;
                this.f31820S0 = this.f31818Q0;
            }
        }
    }

    public void o1() {
        for (int i10 = 0; i10 < this.f31811K0; i10++) {
            C3242e c3242e = this.f31810J0[i10];
            if (c3242e != null) {
                c3242e.O0(true);
            }
        }
    }

    public boolean p1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.f31811K0; i10++) {
            if (hashSet.contains(this.f31810J0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int q1() {
        return this.f31823V0;
    }

    public int r1() {
        return this.f31822U0;
    }

    public int s1() {
        return this.f31814M0;
    }

    public int t1() {
        return this.f31819R0;
    }

    public int u1() {
        return this.f31820S0;
    }

    public int v1() {
        return this.f31813L0;
    }

    public abstract void w1(int i10, int i11, int i12, int i13);

    protected void x1(C3242e c3242e, C3242e.b bVar, int i10, C3242e.b bVar2, int i11) {
        while (this.f31825X0 == null && K() != null) {
            this.f31825X0 = ((C3243f) K()).C1();
        }
        C3313b.a aVar = this.f31824W0;
        aVar.f32093a = bVar;
        aVar.f32094b = bVar2;
        aVar.f32095c = i10;
        aVar.f32096d = i11;
        this.f31825X0.a(c3242e, aVar);
        c3242e.e1(this.f31824W0.f32097e);
        c3242e.F0(this.f31824W0.f32098f);
        c3242e.E0(this.f31824W0.f32100h);
        c3242e.u0(this.f31824W0.f32099g);
    }

    protected boolean y1() {
        C3242e c3242e = this.f31669Z;
        C3313b.InterfaceC0354b interfaceC0354bC1 = c3242e != null ? ((C3243f) c3242e).C1() : null;
        if (interfaceC0354bC1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f31811K0; i10++) {
            C3242e c3242e2 = this.f31810J0[i10];
            if (c3242e2 != null && !(c3242e2 instanceof C3245h)) {
                C3242e.b bVarU = c3242e2.u(0);
                C3242e.b bVarU2 = c3242e2.u(1);
                C3242e.b bVar = C3242e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar || c3242e2.f31712v == 1 || bVarU2 != bVar || c3242e2.f31714w == 1) {
                    if (bVarU == bVar) {
                        bVarU = C3242e.b.WRAP_CONTENT;
                    }
                    if (bVarU2 == bVar) {
                        bVarU2 = C3242e.b.WRAP_CONTENT;
                    }
                    C3313b.a aVar = this.f31824W0;
                    aVar.f32093a = bVarU;
                    aVar.f32094b = bVarU2;
                    aVar.f32095c = c3242e2.T();
                    this.f31824W0.f32096d = c3242e2.x();
                    interfaceC0354bC1.a(c3242e2, this.f31824W0);
                    c3242e2.e1(this.f31824W0.f32097e);
                    c3242e2.F0(this.f31824W0.f32098f);
                    c3242e2.u0(this.f31824W0.f32099g);
                }
            }
        }
        return true;
    }

    public boolean z1() {
        return this.f31821T0;
    }
}
