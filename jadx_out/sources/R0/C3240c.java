package r0;

import java.util.ArrayList;
import r0.C3242e;

/* JADX INFO: renamed from: r0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3240c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected C3242e f31593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C3242e f31594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected C3242e f31595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C3242e f31596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected C3242e f31597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C3242e f31598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected C3242e f31599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f31600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f31601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f31602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f31603k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f31604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f31605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f31606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f31607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f31608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f31609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f31610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f31611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f31612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f31613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f31614v;

    public C3240c(C3242e c3242e, int i10, boolean z10) {
        this.f31593a = c3242e;
        this.f31608p = i10;
        this.f31609q = z10;
    }

    private void b() {
        int i10 = this.f31608p * 2;
        C3242e c3242e = this.f31593a;
        this.f31607o = true;
        C3242e c3242e2 = c3242e;
        boolean z10 = false;
        while (!z10) {
            this.f31601i++;
            C3242e[] c3242eArr = c3242e.f31643D0;
            int i11 = this.f31608p;
            C3242e c3242e3 = null;
            c3242eArr[i11] = null;
            c3242e.f31641C0[i11] = null;
            if (c3242e.S() != 8) {
                this.f31604l++;
                C3242e.b bVarU = c3242e.u(this.f31608p);
                C3242e.b bVar = C3242e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f31605m += c3242e.E(this.f31608p);
                }
                int iF = this.f31605m + c3242e.f31665V[i10].f();
                this.f31605m = iF;
                int i12 = i10 + 1;
                this.f31605m = iF + c3242e.f31665V[i12].f();
                int iF2 = this.f31606n + c3242e.f31665V[i10].f();
                this.f31606n = iF2;
                this.f31606n = iF2 + c3242e.f31665V[i12].f();
                if (this.f31594b == null) {
                    this.f31594b = c3242e;
                }
                this.f31596d = c3242e;
                C3242e.b[] bVarArr = c3242e.f31668Y;
                int i13 = this.f31608p;
                if (bVarArr[i13] == bVar) {
                    int i14 = c3242e.f31716x[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f31602j++;
                        float f10 = c3242e.f31639B0[i13];
                        if (f10 > 0.0f) {
                            this.f31603k += f10;
                        }
                        if (c(c3242e, i13)) {
                            if (f10 < 0.0f) {
                                this.f31610r = true;
                            } else {
                                this.f31611s = true;
                            }
                            if (this.f31600h == null) {
                                this.f31600h = new ArrayList();
                            }
                            this.f31600h.add(c3242e);
                        }
                        if (this.f31598f == null) {
                            this.f31598f = c3242e;
                        }
                        C3242e c3242e4 = this.f31599g;
                        if (c3242e4 != null) {
                            c3242e4.f31641C0[this.f31608p] = c3242e;
                        }
                        this.f31599g = c3242e;
                    }
                    if (this.f31608p == 0) {
                        if (c3242e.f31712v != 0 || c3242e.f31718y != 0 || c3242e.f31720z != 0) {
                            this.f31607o = false;
                        }
                    } else if (c3242e.f31714w != 0 || c3242e.f31638B != 0 || c3242e.f31640C != 0) {
                        this.f31607o = false;
                    }
                    if (c3242e.f31675c0 != 0.0f) {
                        this.f31607o = false;
                        this.f31613u = true;
                    }
                }
            }
            if (c3242e2 != c3242e) {
                c3242e2.f31643D0[this.f31608p] = c3242e;
            }
            C3241d c3241d = c3242e.f31665V[i10 + 1].f31620f;
            if (c3241d != null) {
                C3242e c3242e5 = c3241d.f31618d;
                C3241d c3241d2 = c3242e5.f31665V[i10].f31620f;
                if (c3241d2 != null && c3241d2.f31618d == c3242e) {
                    c3242e3 = c3242e5;
                }
            }
            if (c3242e3 == null) {
                c3242e3 = c3242e;
                z10 = true;
            }
            c3242e2 = c3242e;
            c3242e = c3242e3;
        }
        C3242e c3242e6 = this.f31594b;
        if (c3242e6 != null) {
            this.f31605m -= c3242e6.f31665V[i10].f();
        }
        C3242e c3242e7 = this.f31596d;
        if (c3242e7 != null) {
            this.f31605m -= c3242e7.f31665V[i10 + 1].f();
        }
        this.f31595c = c3242e;
        if (this.f31608p == 0 && this.f31609q) {
            this.f31597e = c3242e;
        } else {
            this.f31597e = this.f31593a;
        }
        this.f31612t = this.f31611s && this.f31610r;
    }

    private static boolean c(C3242e c3242e, int i10) {
        if (c3242e.S() == 8 || c3242e.f31668Y[i10] != C3242e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = c3242e.f31716x[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f31614v) {
            b();
        }
        this.f31614v = true;
    }
}
