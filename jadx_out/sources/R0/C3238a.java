package r0;

import r0.C3241d;
import r0.C3242e;

/* JADX INFO: renamed from: r0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3238a extends AbstractC3247j {

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f31589L0 = 0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private boolean f31590M0 = true;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f31591N0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    boolean f31592O0 = false;

    @Override // r0.C3242e
    public void g(o0.d dVar, boolean z10) {
        C3241d[] c3241dArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        C3241d[] c3241dArr2 = this.f31665V;
        c3241dArr2[0] = this.f31657N;
        c3241dArr2[2] = this.f31658O;
        c3241dArr2[1] = this.f31659P;
        c3241dArr2[3] = this.f31660Q;
        int i13 = 0;
        while (true) {
            c3241dArr = this.f31665V;
            if (i13 >= c3241dArr.length) {
                break;
            }
            C3241d c3241d = c3241dArr[i13];
            c3241d.f31623i = dVar.q(c3241d);
            i13++;
        }
        int i14 = this.f31589L0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        C3241d c3241d2 = c3241dArr[i14];
        if (!this.f31592O0) {
            n1();
        }
        if (this.f31592O0) {
            this.f31592O0 = false;
            int i15 = this.f31589L0;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.f31657N.f31623i, this.f31679e0);
                dVar.f(this.f31659P.f31623i, this.f31679e0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    dVar.f(this.f31658O.f31623i, this.f31681f0);
                    dVar.f(this.f31660Q.f31623i, this.f31681f0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f31811K0; i16++) {
            C3242e c3242e = this.f31810J0[i16];
            if ((this.f31590M0 || c3242e.h()) && ((((i11 = this.f31589L0) == 0 || i11 == 1) && c3242e.A() == C3242e.b.MATCH_CONSTRAINT && c3242e.f31657N.f31620f != null && c3242e.f31659P.f31620f != null) || (((i12 = this.f31589L0) == 2 || i12 == 3) && c3242e.Q() == C3242e.b.MATCH_CONSTRAINT && c3242e.f31658O.f31620f != null && c3242e.f31660Q.f31620f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f31657N.l() || this.f31659P.l();
        boolean z13 = this.f31658O.l() || this.f31660Q.l();
        int i17 = !(!z11 && (((i10 = this.f31589L0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f31811K0; i18++) {
            C3242e c3242e2 = this.f31810J0[i18];
            if (this.f31590M0 || c3242e2.h()) {
                o0.i iVarQ = dVar.q(c3242e2.f31665V[this.f31589L0]);
                C3241d[] c3241dArr3 = c3242e2.f31665V;
                int i19 = this.f31589L0;
                C3241d c3241d3 = c3241dArr3[i19];
                c3241d3.f31623i = iVarQ;
                C3241d c3241d4 = c3241d3.f31620f;
                int i20 = (c3241d4 == null || c3241d4.f31618d != this) ? 0 : c3241d3.f31621g;
                if (i19 == 0 || i19 == 2) {
                    dVar.i(c3241d2.f31623i, iVarQ, this.f31591N0 - i20, z11);
                } else {
                    dVar.g(c3241d2.f31623i, iVarQ, this.f31591N0 + i20, z11);
                }
                dVar.e(c3241d2.f31623i, iVarQ, this.f31591N0 + i20, i17);
            }
        }
        int i21 = this.f31589L0;
        if (i21 == 0) {
            dVar.e(this.f31659P.f31623i, this.f31657N.f31623i, 0, 8);
            dVar.e(this.f31657N.f31623i, this.f31669Z.f31659P.f31623i, 0, 4);
            dVar.e(this.f31657N.f31623i, this.f31669Z.f31657N.f31623i, 0, 0);
            return;
        }
        if (i21 == 1) {
            dVar.e(this.f31657N.f31623i, this.f31659P.f31623i, 0, 8);
            dVar.e(this.f31657N.f31623i, this.f31669Z.f31657N.f31623i, 0, 4);
            dVar.e(this.f31657N.f31623i, this.f31669Z.f31659P.f31623i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.f31660Q.f31623i, this.f31658O.f31623i, 0, 8);
            dVar.e(this.f31658O.f31623i, this.f31669Z.f31660Q.f31623i, 0, 4);
            dVar.e(this.f31658O.f31623i, this.f31669Z.f31658O.f31623i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.f31658O.f31623i, this.f31660Q.f31623i, 0, 8);
            dVar.e(this.f31658O.f31623i, this.f31669Z.f31658O.f31623i, 0, 4);
            dVar.e(this.f31658O.f31623i, this.f31669Z.f31660Q.f31623i, 0, 0);
        }
    }

    @Override // r0.C3242e
    public boolean h() {
        return true;
    }

    @Override // r0.C3242e
    public boolean k0() {
        return this.f31592O0;
    }

    @Override // r0.C3242e
    public boolean l0() {
        return this.f31592O0;
    }

    public boolean n1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f31811K0;
            if (i13 >= i10) {
                break;
            }
            C3242e c3242e = this.f31810J0[i13];
            if ((this.f31590M0 || c3242e.h()) && ((((i11 = this.f31589L0) == 0 || i11 == 1) && !c3242e.k0()) || (((i12 = this.f31589L0) == 2 || i12 == 3) && !c3242e.l0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f31811K0; i14++) {
            C3242e c3242e2 = this.f31810J0[i14];
            if (this.f31590M0 || c3242e2.h()) {
                if (!z11) {
                    int i15 = this.f31589L0;
                    if (i15 == 0) {
                        iMax = c3242e2.o(C3241d.b.LEFT).e();
                    } else if (i15 == 1) {
                        iMax = c3242e2.o(C3241d.b.RIGHT).e();
                    } else if (i15 == 2) {
                        iMax = c3242e2.o(C3241d.b.TOP).e();
                    } else if (i15 == 3) {
                        iMax = c3242e2.o(C3241d.b.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i16 = this.f31589L0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, c3242e2.o(C3241d.b.LEFT).e());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, c3242e2.o(C3241d.b.RIGHT).e());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, c3242e2.o(C3241d.b.TOP).e());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, c3242e2.o(C3241d.b.BOTTOM).e());
                }
            }
        }
        int i17 = iMax + this.f31591N0;
        int i18 = this.f31589L0;
        if (i18 == 0 || i18 == 1) {
            z0(i17, i17);
        } else {
            C0(i17, i17);
        }
        this.f31592O0 = true;
        return true;
    }

    public boolean o1() {
        return this.f31590M0;
    }

    public int p1() {
        return this.f31589L0;
    }

    public int q1() {
        return this.f31591N0;
    }

    public int r1() {
        int i10 = this.f31589L0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    protected void s1() {
        for (int i10 = 0; i10 < this.f31811K0; i10++) {
            C3242e c3242e = this.f31810J0[i10];
            if (this.f31590M0 || c3242e.h()) {
                int i11 = this.f31589L0;
                if (i11 == 0 || i11 == 1) {
                    c3242e.M0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    c3242e.M0(1, true);
                }
            }
        }
    }

    public void t1(boolean z10) {
        this.f31590M0 = z10;
    }

    @Override // r0.C3242e
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i10 = 0; i10 < this.f31811K0; i10++) {
            C3242e c3242e = this.f31810J0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + c3242e.t();
        }
        return str + "}";
    }

    public void u1(int i10) {
        this.f31589L0 = i10;
    }

    public void v1(int i10) {
        this.f31591N0 = i10;
    }
}
