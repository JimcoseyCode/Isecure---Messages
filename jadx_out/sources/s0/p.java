package s0;

import r0.C3241d;
import r0.C3242e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements InterfaceC3315d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C3242e f32168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f32169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C3242e.b f32170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f32171e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32172f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f32173g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f32174h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f32175i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f32176j = b.NONE;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32177a;

        static {
            int[] iArr = new int[C3241d.b.values().length];
            f32177a = iArr;
            try {
                iArr[C3241d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32177a[C3241d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32177a[C3241d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32177a[C3241d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32177a[C3241d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(C3242e c3242e) {
        this.f32168b = c3242e;
    }

    private void l(int i10, int i11) {
        int i12 = this.f32167a;
        if (i12 == 0) {
            this.f32171e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f32171e.d(Math.min(g(this.f32171e.f32135m, i10), i11));
            return;
        }
        if (i12 == 2) {
            C3242e c3242eK = this.f32168b.K();
            if (c3242eK != null) {
                if ((i10 == 0 ? c3242eK.f31678e : c3242eK.f31680f).f32171e.f32123j) {
                    C3242e c3242e = this.f32168b;
                    this.f32171e.d(g((int) ((r9.f32120g * (i10 == 0 ? c3242e.f31636A : c3242e.f31642D)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        C3242e c3242e2 = this.f32168b;
        p pVar = c3242e2.f31678e;
        C3242e.b bVar = pVar.f32170d;
        C3242e.b bVar2 = C3242e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f32167a == 3) {
            n nVar = c3242e2.f31680f;
            if (nVar.f32170d == bVar2 && nVar.f32167a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = c3242e2.f31680f;
        }
        if (pVar.f32171e.f32123j) {
            float fV = c3242e2.v();
            this.f32171e.d(i10 == 1 ? (int) ((pVar.f32171e.f32120g / fV) + 0.5f) : (int) ((fV * pVar.f32171e.f32120g) + 0.5f));
        }
    }

    @Override // s0.InterfaceC3315d
    public abstract void a(InterfaceC3315d interfaceC3315d);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f32125l.add(fVar2);
        fVar.f32119f = i10;
        fVar2.f32124k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f32125l.add(fVar2);
        fVar.f32125l.add(this.f32171e);
        fVar.f32121h = i10;
        fVar.f32122i = gVar;
        fVar2.f32124k.add(fVar);
        gVar.f32124k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            C3242e c3242e = this.f32168b;
            int i12 = c3242e.f31720z;
            int iMax = Math.max(c3242e.f31718y, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            C3242e c3242e2 = this.f32168b;
            int i13 = c3242e2.f31640C;
            int iMax2 = Math.max(c3242e2.f31638B, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(C3241d c3241d) {
        C3241d c3241d2 = c3241d.f31620f;
        if (c3241d2 == null) {
            return null;
        }
        C3242e c3242e = c3241d2.f31618d;
        int i10 = a.f32177a[c3241d2.f31619e.ordinal()];
        if (i10 == 1) {
            return c3242e.f31678e.f32174h;
        }
        if (i10 == 2) {
            return c3242e.f31678e.f32175i;
        }
        if (i10 == 3) {
            return c3242e.f31680f.f32174h;
        }
        if (i10 == 4) {
            return c3242e.f31680f.f32149k;
        }
        if (i10 != 5) {
            return null;
        }
        return c3242e.f31680f.f32175i;
    }

    protected final f i(C3241d c3241d, int i10) {
        C3241d c3241d2 = c3241d.f31620f;
        if (c3241d2 == null) {
            return null;
        }
        C3242e c3242e = c3241d2.f31618d;
        p pVar = i10 == 0 ? c3242e.f31678e : c3242e.f31680f;
        int i11 = a.f32177a[c3241d2.f31619e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f32175i;
        }
        return pVar.f32174h;
    }

    public long j() {
        if (this.f32171e.f32123j) {
            return r0.f32120g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f32173g;
    }

    abstract boolean m();

    protected void n(InterfaceC3315d interfaceC3315d, C3241d c3241d, C3241d c3241d2, int i10) {
        f fVarH = h(c3241d);
        f fVarH2 = h(c3241d2);
        if (fVarH.f32123j && fVarH2.f32123j) {
            int iF = fVarH.f32120g + c3241d.f();
            int iF2 = fVarH2.f32120g - c3241d2.f();
            int i11 = iF2 - iF;
            if (!this.f32171e.f32123j && this.f32170d == C3242e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f32171e;
            if (gVar.f32123j) {
                if (gVar.f32120g == i11) {
                    this.f32174h.d(iF);
                    this.f32175i.d(iF2);
                    return;
                }
                C3242e c3242e = this.f32168b;
                float fY = i10 == 0 ? c3242e.y() : c3242e.O();
                if (fVarH == fVarH2) {
                    iF = fVarH.f32120g;
                    iF2 = fVarH2.f32120g;
                    fY = 0.5f;
                }
                this.f32174h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f32171e.f32120g) * fY)));
                this.f32175i.d(this.f32174h.f32120g + this.f32171e.f32120g);
            }
        }
    }

    protected void o(InterfaceC3315d interfaceC3315d) {
    }

    protected void p(InterfaceC3315d interfaceC3315d) {
    }
}
