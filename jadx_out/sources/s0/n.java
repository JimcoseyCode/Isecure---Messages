package s0;

import r0.C3241d;
import r0.C3242e;
import r0.InterfaceC3246i;
import s0.f;
import s0.p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f32149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f32150l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32151a;

        static {
            int[] iArr = new int[p.b.values().length];
            f32151a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32151a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32151a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(C3242e c3242e) {
        super(c3242e);
        f fVar = new f(this);
        this.f32149k = fVar;
        this.f32150l = null;
        this.f32174h.f32118e = f.a.TOP;
        this.f32175i.f32118e = f.a.BOTTOM;
        fVar.f32118e = f.a.BASELINE;
        this.f32172f = 1;
    }

    @Override // s0.p, s0.InterfaceC3315d
    public void a(InterfaceC3315d interfaceC3315d) {
        float f10;
        float fV;
        float fV2;
        int i10;
        int i11 = a.f32151a[this.f32176j.ordinal()];
        if (i11 == 1) {
            p(interfaceC3315d);
        } else if (i11 == 2) {
            o(interfaceC3315d);
        } else if (i11 == 3) {
            C3242e c3242e = this.f32168b;
            n(interfaceC3315d, c3242e.f31658O, c3242e.f31660Q, 1);
            return;
        }
        g gVar = this.f32171e;
        if (gVar.f32116c && !gVar.f32123j && this.f32170d == C3242e.b.MATCH_CONSTRAINT) {
            C3242e c3242e2 = this.f32168b;
            int i12 = c3242e2.f31714w;
            if (i12 == 2) {
                C3242e c3242eK = c3242e2.K();
                if (c3242eK != null) {
                    if (c3242eK.f31680f.f32171e.f32123j) {
                        this.f32171e.d((int) ((r7.f32120g * this.f32168b.f31642D) + 0.5f));
                    }
                }
            } else if (i12 == 3 && c3242e2.f31678e.f32171e.f32123j) {
                int iW = c3242e2.w();
                if (iW == -1) {
                    C3242e c3242e3 = this.f32168b;
                    f10 = c3242e3.f31678e.f32171e.f32120g;
                    fV = c3242e3.v();
                } else if (iW == 0) {
                    fV2 = r7.f31678e.f32171e.f32120g * this.f32168b.v();
                    i10 = (int) (fV2 + 0.5f);
                    this.f32171e.d(i10);
                } else if (iW != 1) {
                    i10 = 0;
                    this.f32171e.d(i10);
                } else {
                    C3242e c3242e4 = this.f32168b;
                    f10 = c3242e4.f31678e.f32171e.f32120g;
                    fV = c3242e4.v();
                }
                fV2 = f10 / fV;
                i10 = (int) (fV2 + 0.5f);
                this.f32171e.d(i10);
            }
        }
        f fVar = this.f32174h;
        if (fVar.f32116c) {
            f fVar2 = this.f32175i;
            if (fVar2.f32116c) {
                if (fVar.f32123j && fVar2.f32123j && this.f32171e.f32123j) {
                    return;
                }
                if (!this.f32171e.f32123j && this.f32170d == C3242e.b.MATCH_CONSTRAINT) {
                    C3242e c3242e5 = this.f32168b;
                    if (c3242e5.f31712v == 0 && !c3242e5.h0()) {
                        f fVar3 = (f) this.f32174h.f32125l.get(0);
                        f fVar4 = (f) this.f32175i.f32125l.get(0);
                        int i13 = fVar3.f32120g;
                        f fVar5 = this.f32174h;
                        int i14 = i13 + fVar5.f32119f;
                        int i15 = fVar4.f32120g + this.f32175i.f32119f;
                        fVar5.d(i14);
                        this.f32175i.d(i15);
                        this.f32171e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f32171e.f32123j && this.f32170d == C3242e.b.MATCH_CONSTRAINT && this.f32167a == 1 && this.f32174h.f32125l.size() > 0 && this.f32175i.f32125l.size() > 0) {
                    f fVar6 = (f) this.f32174h.f32125l.get(0);
                    int i16 = (((f) this.f32175i.f32125l.get(0)).f32120g + this.f32175i.f32119f) - (fVar6.f32120g + this.f32174h.f32119f);
                    g gVar2 = this.f32171e;
                    int i17 = gVar2.f32135m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f32171e.f32123j && this.f32174h.f32125l.size() > 0 && this.f32175i.f32125l.size() > 0) {
                    f fVar7 = (f) this.f32174h.f32125l.get(0);
                    f fVar8 = (f) this.f32175i.f32125l.get(0);
                    int i18 = fVar7.f32120g + this.f32174h.f32119f;
                    int i19 = fVar8.f32120g + this.f32175i.f32119f;
                    float fO = this.f32168b.O();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f32120g;
                        i19 = fVar8.f32120g;
                        fO = 0.5f;
                    }
                    this.f32174h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f32171e.f32120g) * fO)));
                    this.f32175i.d(this.f32174h.f32120g + this.f32171e.f32120g);
                }
            }
        }
    }

    @Override // s0.p
    void d() {
        C3242e c3242eK;
        C3242e c3242eK2;
        C3242e c3242e = this.f32168b;
        if (c3242e.f31670a) {
            this.f32171e.d(c3242e.x());
        }
        if (!this.f32171e.f32123j) {
            this.f32170d = this.f32168b.Q();
            if (this.f32168b.W()) {
                this.f32150l = new C3312a(this);
            }
            C3242e.b bVar = this.f32170d;
            if (bVar != C3242e.b.MATCH_CONSTRAINT) {
                if (bVar == C3242e.b.MATCH_PARENT && (c3242eK2 = this.f32168b.K()) != null && c3242eK2.Q() == C3242e.b.FIXED) {
                    int iX = (c3242eK2.x() - this.f32168b.f31658O.f()) - this.f32168b.f31660Q.f();
                    b(this.f32174h, c3242eK2.f31680f.f32174h, this.f32168b.f31658O.f());
                    b(this.f32175i, c3242eK2.f31680f.f32175i, -this.f32168b.f31660Q.f());
                    this.f32171e.d(iX);
                    return;
                }
                if (this.f32170d == C3242e.b.FIXED) {
                    this.f32171e.d(this.f32168b.x());
                }
            }
        } else if (this.f32170d == C3242e.b.MATCH_PARENT && (c3242eK = this.f32168b.K()) != null && c3242eK.Q() == C3242e.b.FIXED) {
            b(this.f32174h, c3242eK.f31680f.f32174h, this.f32168b.f31658O.f());
            b(this.f32175i, c3242eK.f31680f.f32175i, -this.f32168b.f31660Q.f());
            return;
        }
        g gVar = this.f32171e;
        boolean z10 = gVar.f32123j;
        if (z10) {
            C3242e c3242e2 = this.f32168b;
            if (c3242e2.f31670a) {
                C3241d[] c3241dArr = c3242e2.f31665V;
                C3241d c3241d = c3241dArr[2];
                C3241d c3241d2 = c3241d.f31620f;
                if (c3241d2 != null && c3241dArr[3].f31620f != null) {
                    if (c3242e2.h0()) {
                        this.f32174h.f32119f = this.f32168b.f31665V[2].f();
                        this.f32175i.f32119f = -this.f32168b.f31665V[3].f();
                    } else {
                        f fVarH = h(this.f32168b.f31665V[2]);
                        if (fVarH != null) {
                            b(this.f32174h, fVarH, this.f32168b.f31665V[2].f());
                        }
                        f fVarH2 = h(this.f32168b.f31665V[3]);
                        if (fVarH2 != null) {
                            b(this.f32175i, fVarH2, -this.f32168b.f31665V[3].f());
                        }
                        this.f32174h.f32115b = true;
                        this.f32175i.f32115b = true;
                    }
                    if (this.f32168b.W()) {
                        b(this.f32149k, this.f32174h, this.f32168b.p());
                        return;
                    }
                    return;
                }
                if (c3241d2 != null) {
                    f fVarH3 = h(c3241d);
                    if (fVarH3 != null) {
                        b(this.f32174h, fVarH3, this.f32168b.f31665V[2].f());
                        b(this.f32175i, this.f32174h, this.f32171e.f32120g);
                        if (this.f32168b.W()) {
                            b(this.f32149k, this.f32174h, this.f32168b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C3241d c3241d3 = c3241dArr[3];
                if (c3241d3.f31620f != null) {
                    f fVarH4 = h(c3241d3);
                    if (fVarH4 != null) {
                        b(this.f32175i, fVarH4, -this.f32168b.f31665V[3].f());
                        b(this.f32174h, this.f32175i, -this.f32171e.f32120g);
                    }
                    if (this.f32168b.W()) {
                        b(this.f32149k, this.f32174h, this.f32168b.p());
                        return;
                    }
                    return;
                }
                C3241d c3241d4 = c3241dArr[4];
                if (c3241d4.f31620f != null) {
                    f fVarH5 = h(c3241d4);
                    if (fVarH5 != null) {
                        b(this.f32149k, fVarH5, 0);
                        b(this.f32174h, this.f32149k, -this.f32168b.p());
                        b(this.f32175i, this.f32174h, this.f32171e.f32120g);
                        return;
                    }
                    return;
                }
                if ((c3242e2 instanceof InterfaceC3246i) || c3242e2.K() == null || this.f32168b.o(C3241d.b.CENTER).f31620f != null) {
                    return;
                }
                b(this.f32174h, this.f32168b.K().f31680f.f32174h, this.f32168b.V());
                b(this.f32175i, this.f32174h, this.f32171e.f32120g);
                if (this.f32168b.W()) {
                    b(this.f32149k, this.f32174h, this.f32168b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f32170d != C3242e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            C3242e c3242e3 = this.f32168b;
            int i10 = c3242e3.f31714w;
            if (i10 == 2) {
                C3242e c3242eK3 = c3242e3.K();
                if (c3242eK3 != null) {
                    g gVar2 = c3242eK3.f31680f.f32171e;
                    this.f32171e.f32125l.add(gVar2);
                    gVar2.f32124k.add(this.f32171e);
                    g gVar3 = this.f32171e;
                    gVar3.f32115b = true;
                    gVar3.f32124k.add(this.f32174h);
                    this.f32171e.f32124k.add(this.f32175i);
                }
            } else if (i10 == 3 && !c3242e3.h0()) {
                C3242e c3242e4 = this.f32168b;
                if (c3242e4.f31712v != 3) {
                    g gVar4 = c3242e4.f31678e.f32171e;
                    this.f32171e.f32125l.add(gVar4);
                    gVar4.f32124k.add(this.f32171e);
                    g gVar5 = this.f32171e;
                    gVar5.f32115b = true;
                    gVar5.f32124k.add(this.f32174h);
                    this.f32171e.f32124k.add(this.f32175i);
                }
            }
        }
        C3242e c3242e5 = this.f32168b;
        C3241d[] c3241dArr2 = c3242e5.f31665V;
        C3241d c3241d5 = c3241dArr2[2];
        C3241d c3241d6 = c3241d5.f31620f;
        if (c3241d6 != null && c3241dArr2[3].f31620f != null) {
            if (c3242e5.h0()) {
                this.f32174h.f32119f = this.f32168b.f31665V[2].f();
                this.f32175i.f32119f = -this.f32168b.f31665V[3].f();
            } else {
                f fVarH6 = h(this.f32168b.f31665V[2]);
                f fVarH7 = h(this.f32168b.f31665V[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f32176j = p.b.CENTER;
            }
            if (this.f32168b.W()) {
                c(this.f32149k, this.f32174h, 1, this.f32150l);
            }
        } else if (c3241d6 != null) {
            f fVarH8 = h(c3241d5);
            if (fVarH8 != null) {
                b(this.f32174h, fVarH8, this.f32168b.f31665V[2].f());
                c(this.f32175i, this.f32174h, 1, this.f32171e);
                if (this.f32168b.W()) {
                    c(this.f32149k, this.f32174h, 1, this.f32150l);
                }
                C3242e.b bVar2 = this.f32170d;
                C3242e.b bVar3 = C3242e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f32168b.v() > 0.0f) {
                    l lVar = this.f32168b.f31678e;
                    if (lVar.f32170d == bVar3) {
                        lVar.f32171e.f32124k.add(this.f32171e);
                        this.f32171e.f32125l.add(this.f32168b.f31678e.f32171e);
                        this.f32171e.f32114a = this;
                    }
                }
            }
        } else {
            C3241d c3241d7 = c3241dArr2[3];
            if (c3241d7.f31620f != null) {
                f fVarH9 = h(c3241d7);
                if (fVarH9 != null) {
                    b(this.f32175i, fVarH9, -this.f32168b.f31665V[3].f());
                    c(this.f32174h, this.f32175i, -1, this.f32171e);
                    if (this.f32168b.W()) {
                        c(this.f32149k, this.f32174h, 1, this.f32150l);
                    }
                }
            } else {
                C3241d c3241d8 = c3241dArr2[4];
                if (c3241d8.f31620f != null) {
                    f fVarH10 = h(c3241d8);
                    if (fVarH10 != null) {
                        b(this.f32149k, fVarH10, 0);
                        c(this.f32174h, this.f32149k, -1, this.f32150l);
                        c(this.f32175i, this.f32174h, 1, this.f32171e);
                    }
                } else if (!(c3242e5 instanceof InterfaceC3246i) && c3242e5.K() != null) {
                    b(this.f32174h, this.f32168b.K().f31680f.f32174h, this.f32168b.V());
                    c(this.f32175i, this.f32174h, 1, this.f32171e);
                    if (this.f32168b.W()) {
                        c(this.f32149k, this.f32174h, 1, this.f32150l);
                    }
                    C3242e.b bVar4 = this.f32170d;
                    C3242e.b bVar5 = C3242e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f32168b.v() > 0.0f) {
                        l lVar2 = this.f32168b.f31678e;
                        if (lVar2.f32170d == bVar5) {
                            lVar2.f32171e.f32124k.add(this.f32171e);
                            this.f32171e.f32125l.add(this.f32168b.f31678e.f32171e);
                            this.f32171e.f32114a = this;
                        }
                    }
                }
            }
        }
        if (this.f32171e.f32125l.size() == 0) {
            this.f32171e.f32116c = true;
        }
    }

    @Override // s0.p
    public void e() {
        f fVar = this.f32174h;
        if (fVar.f32123j) {
            this.f32168b.h1(fVar.f32120g);
        }
    }

    @Override // s0.p
    void f() {
        this.f32169c = null;
        this.f32174h.c();
        this.f32175i.c();
        this.f32149k.c();
        this.f32171e.c();
        this.f32173g = false;
    }

    @Override // s0.p
    boolean m() {
        return this.f32170d != C3242e.b.MATCH_CONSTRAINT || this.f32168b.f31714w == 0;
    }

    void q() {
        this.f32173g = false;
        this.f32174h.c();
        this.f32174h.f32123j = false;
        this.f32175i.c();
        this.f32175i.f32123j = false;
        this.f32149k.c();
        this.f32149k.f32123j = false;
        this.f32171e.f32123j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f32168b.t();
    }
}
