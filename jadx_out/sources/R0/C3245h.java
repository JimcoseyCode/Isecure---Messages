package r0;

import r0.C3241d;
import r0.C3242e;

/* JADX INFO: renamed from: r0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3245h extends C3242e {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    protected float f31802J0 = -1.0f;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    protected int f31803K0 = -1;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    protected int f31804L0 = -1;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private C3241d f31805M0 = this.f31658O;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f31806N0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f31807O0 = 0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private boolean f31808P0;

    /* JADX INFO: renamed from: r0.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31809a;

        static {
            int[] iArr = new int[C3241d.b.values().length];
            f31809a = iArr;
            try {
                iArr[C3241d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31809a[C3241d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31809a[C3241d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31809a[C3241d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31809a[C3241d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31809a[C3241d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31809a[C3241d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31809a[C3241d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31809a[C3241d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C3245h() {
        this.f31666W.clear();
        this.f31666W.add(this.f31805M0);
        int length = this.f31665V.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f31665V[i10] = this.f31805M0;
        }
    }

    @Override // r0.C3242e
    public void g(o0.d dVar, boolean z10) {
        C3243f c3243f = (C3243f) K();
        if (c3243f == null) {
            return;
        }
        C3241d c3241dO = c3243f.o(C3241d.b.LEFT);
        C3241d c3241dO2 = c3243f.o(C3241d.b.RIGHT);
        C3242e c3242e = this.f31669Z;
        boolean z11 = c3242e != null && c3242e.f31668Y[0] == C3242e.b.WRAP_CONTENT;
        if (this.f31806N0 == 0) {
            c3241dO = c3243f.o(C3241d.b.TOP);
            c3241dO2 = c3243f.o(C3241d.b.BOTTOM);
            C3242e c3242e2 = this.f31669Z;
            z11 = c3242e2 != null && c3242e2.f31668Y[1] == C3242e.b.WRAP_CONTENT;
        }
        if (this.f31808P0 && this.f31805M0.n()) {
            o0.i iVarQ = dVar.q(this.f31805M0);
            dVar.f(iVarQ, this.f31805M0.e());
            if (this.f31803K0 != -1) {
                if (z11) {
                    dVar.h(dVar.q(c3241dO2), iVarQ, 0, 5);
                }
            } else if (this.f31804L0 != -1 && z11) {
                o0.i iVarQ2 = dVar.q(c3241dO2);
                dVar.h(iVarQ, dVar.q(c3241dO), 0, 5);
                dVar.h(iVarQ2, iVarQ, 0, 5);
            }
            this.f31808P0 = false;
            return;
        }
        if (this.f31803K0 != -1) {
            o0.i iVarQ3 = dVar.q(this.f31805M0);
            dVar.e(iVarQ3, dVar.q(c3241dO), this.f31803K0, 8);
            if (z11) {
                dVar.h(dVar.q(c3241dO2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.f31804L0 == -1) {
            if (this.f31802J0 != -1.0f) {
                dVar.d(o0.d.s(dVar, dVar.q(this.f31805M0), dVar.q(c3241dO2), this.f31802J0));
                return;
            }
            return;
        }
        o0.i iVarQ4 = dVar.q(this.f31805M0);
        o0.i iVarQ5 = dVar.q(c3241dO2);
        dVar.e(iVarQ4, iVarQ5, -this.f31804L0, 8);
        if (z11) {
            dVar.h(iVarQ4, dVar.q(c3241dO), 0, 5);
            dVar.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override // r0.C3242e
    public boolean h() {
        return true;
    }

    @Override // r0.C3242e
    public boolean k0() {
        return this.f31808P0;
    }

    @Override // r0.C3242e
    public void k1(o0.d dVar, boolean z10) {
        if (K() == null) {
            return;
        }
        int iX = dVar.x(this.f31805M0);
        if (this.f31806N0 == 1) {
            g1(iX);
            h1(0);
            F0(K().x());
            e1(0);
            return;
        }
        g1(0);
        h1(iX);
        e1(K().T());
        F0(0);
    }

    @Override // r0.C3242e
    public boolean l0() {
        return this.f31808P0;
    }

    public C3241d l1() {
        return this.f31805M0;
    }

    public int m1() {
        return this.f31806N0;
    }

    public int n1() {
        return this.f31803K0;
    }

    @Override // r0.C3242e
    public C3241d o(C3241d.b bVar) {
        int i10 = a.f31809a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f31806N0 == 1) {
                return this.f31805M0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f31806N0 == 0) {
            return this.f31805M0;
        }
        return null;
    }

    public int o1() {
        return this.f31804L0;
    }

    public float p1() {
        return this.f31802J0;
    }

    public void q1(int i10) {
        this.f31805M0.t(i10);
        this.f31808P0 = true;
    }

    public void r1(int i10) {
        if (i10 > -1) {
            this.f31802J0 = -1.0f;
            this.f31803K0 = i10;
            this.f31804L0 = -1;
        }
    }

    public void s1(int i10) {
        if (i10 > -1) {
            this.f31802J0 = -1.0f;
            this.f31803K0 = -1;
            this.f31804L0 = i10;
        }
    }

    public void t1(float f10) {
        if (f10 > -1.0f) {
            this.f31802J0 = f10;
            this.f31803K0 = -1;
            this.f31804L0 = -1;
        }
    }

    public void u1(int i10) {
        if (this.f31806N0 == i10) {
            return;
        }
        this.f31806N0 = i10;
        this.f31666W.clear();
        if (this.f31806N0 == 1) {
            this.f31805M0 = this.f31657N;
        } else {
            this.f31805M0 = this.f31658O;
        }
        this.f31666W.add(this.f31805M0);
        int length = this.f31665V.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f31665V[i11] = this.f31805M0;
        }
    }
}
