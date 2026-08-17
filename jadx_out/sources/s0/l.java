package s0;

import r0.C3241d;
import r0.C3242e;
import r0.InterfaceC3246i;
import s0.f;
import s0.p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f32139k = new int[2];

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32140a;

        static {
            int[] iArr = new int[p.b.values().length];
            f32140a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32140a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32140a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(C3242e c3242e) {
        super(c3242e);
        this.f32174h.f32118e = f.a.LEFT;
        this.f32175i.f32118e = f.a.RIGHT;
        this.f32172f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca  */
    @Override // s0.p, s0.InterfaceC3315d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(InterfaceC3315d interfaceC3315d) {
        float f10;
        float fV;
        float fV2;
        int i10;
        int i11 = a.f32140a[this.f32176j.ordinal()];
        if (i11 == 1) {
            p(interfaceC3315d);
        } else if (i11 == 2) {
            o(interfaceC3315d);
        } else if (i11 == 3) {
            C3242e c3242e = this.f32168b;
            n(interfaceC3315d, c3242e.f31657N, c3242e.f31659P, 0);
            return;
        }
        if (!this.f32171e.f32123j && this.f32170d == C3242e.b.MATCH_CONSTRAINT) {
            C3242e c3242e2 = this.f32168b;
            int i12 = c3242e2.f31712v;
            if (i12 == 2) {
                C3242e c3242eK = c3242e2.K();
                if (c3242eK != null) {
                    if (c3242eK.f31678e.f32171e.f32123j) {
                        this.f32171e.d((int) ((r1.f32120g * this.f32168b.f31636A) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = c3242e2.f31714w;
                if (i13 == 0 || i13 == 3) {
                    n nVar = c3242e2.f31680f;
                    f fVar = nVar.f32174h;
                    f fVar2 = nVar.f32175i;
                    boolean z10 = c3242e2.f31657N.f31620f != null;
                    boolean z11 = c3242e2.f31658O.f31620f != null;
                    boolean z12 = c3242e2.f31659P.f31620f != null;
                    boolean z13 = c3242e2.f31660Q.f31620f != null;
                    int iW = c3242e2.w();
                    if (z10 && z11 && z12 && z13) {
                        float fV3 = this.f32168b.v();
                        if (fVar.f32123j && fVar2.f32123j) {
                            f fVar3 = this.f32174h;
                            if (fVar3.f32116c && this.f32175i.f32116c) {
                                q(f32139k, this.f32174h.f32119f + ((f) fVar3.f32125l.get(0)).f32120g, ((f) this.f32175i.f32125l.get(0)).f32120g - this.f32175i.f32119f, fVar.f32119f + fVar.f32120g, fVar2.f32120g - fVar2.f32119f, fV3, iW);
                                this.f32171e.d(f32139k[0]);
                                this.f32168b.f31680f.f32171e.d(f32139k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f32174h;
                        if (fVar4.f32123j) {
                            f fVar5 = this.f32175i;
                            if (fVar5.f32123j) {
                                if (!fVar.f32116c || !fVar2.f32116c) {
                                    return;
                                }
                                q(f32139k, fVar4.f32120g + fVar4.f32119f, fVar5.f32120g - fVar5.f32119f, fVar.f32119f + ((f) fVar.f32125l.get(0)).f32120g, ((f) fVar2.f32125l.get(0)).f32120g - fVar2.f32119f, fV3, iW);
                                this.f32171e.d(f32139k[0]);
                                this.f32168b.f31680f.f32171e.d(f32139k[1]);
                            }
                        }
                        f fVar6 = this.f32174h;
                        if (!fVar6.f32116c || !this.f32175i.f32116c || !fVar.f32116c || !fVar2.f32116c) {
                            return;
                        }
                        q(f32139k, this.f32174h.f32119f + ((f) fVar6.f32125l.get(0)).f32120g, ((f) this.f32175i.f32125l.get(0)).f32120g - this.f32175i.f32119f, fVar.f32119f + ((f) fVar.f32125l.get(0)).f32120g, ((f) fVar2.f32125l.get(0)).f32120g - fVar2.f32119f, fV3, iW);
                        this.f32171e.d(f32139k[0]);
                        this.f32168b.f31680f.f32171e.d(f32139k[1]);
                    } else if (z10 && z12) {
                        if (!this.f32174h.f32116c || !this.f32175i.f32116c) {
                            return;
                        }
                        float fV4 = this.f32168b.v();
                        int i14 = ((f) this.f32174h.f32125l.get(0)).f32120g + this.f32174h.f32119f;
                        int i15 = ((f) this.f32175i.f32125l.get(0)).f32120g - this.f32175i.f32119f;
                        if (iW == -1 || iW == 0) {
                            int iG = g(i15 - i14, 0);
                            int i16 = (int) ((iG * fV4) + 0.5f);
                            int iG2 = g(i16, 1);
                            if (i16 != iG2) {
                                iG = (int) ((iG2 / fV4) + 0.5f);
                            }
                            this.f32171e.d(iG);
                            this.f32168b.f31680f.f32171e.d(iG2);
                        } else if (iW == 1) {
                            int iG3 = g(i15 - i14, 0);
                            int i17 = (int) ((iG3 / fV4) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 * fV4) + 0.5f);
                            }
                            this.f32171e.d(iG3);
                            this.f32168b.f31680f.f32171e.d(iG4);
                        }
                    } else if (z11 && z13) {
                        if (!fVar.f32116c || !fVar2.f32116c) {
                            return;
                        }
                        float fV5 = this.f32168b.v();
                        int i18 = ((f) fVar.f32125l.get(0)).f32120g + fVar.f32119f;
                        int i19 = ((f) fVar2.f32125l.get(0)).f32120g - fVar2.f32119f;
                        if (iW == -1) {
                            int iG5 = g(i19 - i18, 1);
                            int i20 = (int) ((iG5 / fV5) + 0.5f);
                            int iG6 = g(i20, 0);
                            if (i20 != iG6) {
                                iG5 = (int) ((iG6 * fV5) + 0.5f);
                            }
                            this.f32171e.d(iG6);
                            this.f32168b.f31680f.f32171e.d(iG5);
                        } else if (iW == 0) {
                            int iG7 = g(i19 - i18, 1);
                            int i21 = (int) ((iG7 * fV5) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / fV5) + 0.5f);
                            }
                            this.f32171e.d(iG8);
                            this.f32168b.f31680f.f32171e.d(iG7);
                        } else if (iW == 1) {
                        }
                    }
                } else {
                    int iW2 = c3242e2.w();
                    if (iW2 == -1) {
                        C3242e c3242e3 = this.f32168b;
                        f10 = c3242e3.f31680f.f32171e.f32120g;
                        fV = c3242e3.v();
                    } else if (iW2 == 0) {
                        fV2 = r1.f31680f.f32171e.f32120g / this.f32168b.v();
                        i10 = (int) (fV2 + 0.5f);
                        this.f32171e.d(i10);
                    } else if (iW2 != 1) {
                        i10 = 0;
                        this.f32171e.d(i10);
                    } else {
                        C3242e c3242e4 = this.f32168b;
                        f10 = c3242e4.f31680f.f32171e.f32120g;
                        fV = c3242e4.v();
                    }
                    fV2 = f10 * fV;
                    i10 = (int) (fV2 + 0.5f);
                    this.f32171e.d(i10);
                }
            }
        }
        f fVar7 = this.f32174h;
        if (fVar7.f32116c) {
            f fVar8 = this.f32175i;
            if (fVar8.f32116c) {
                if (fVar7.f32123j && fVar8.f32123j && this.f32171e.f32123j) {
                    return;
                }
                if (!this.f32171e.f32123j && this.f32170d == C3242e.b.MATCH_CONSTRAINT) {
                    C3242e c3242e5 = this.f32168b;
                    if (c3242e5.f31712v == 0 && !c3242e5.f0()) {
                        f fVar9 = (f) this.f32174h.f32125l.get(0);
                        f fVar10 = (f) this.f32175i.f32125l.get(0);
                        int i22 = fVar9.f32120g;
                        f fVar11 = this.f32174h;
                        int i23 = i22 + fVar11.f32119f;
                        int i24 = fVar10.f32120g + this.f32175i.f32119f;
                        fVar11.d(i23);
                        this.f32175i.d(i24);
                        this.f32171e.d(i24 - i23);
                        return;
                    }
                }
                if (!this.f32171e.f32123j && this.f32170d == C3242e.b.MATCH_CONSTRAINT && this.f32167a == 1 && this.f32174h.f32125l.size() > 0 && this.f32175i.f32125l.size() > 0) {
                    int iMin = Math.min((((f) this.f32175i.f32125l.get(0)).f32120g + this.f32175i.f32119f) - (((f) this.f32174h.f32125l.get(0)).f32120g + this.f32174h.f32119f), this.f32171e.f32135m);
                    C3242e c3242e6 = this.f32168b;
                    int i25 = c3242e6.f31720z;
                    int iMax = Math.max(c3242e6.f31718y, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    this.f32171e.d(iMax);
                }
                if (this.f32171e.f32123j) {
                    f fVar12 = (f) this.f32174h.f32125l.get(0);
                    f fVar13 = (f) this.f32175i.f32125l.get(0);
                    int i26 = fVar12.f32120g + this.f32174h.f32119f;
                    int i27 = fVar13.f32120g + this.f32175i.f32119f;
                    float fY = this.f32168b.y();
                    if (fVar12 == fVar13) {
                        i26 = fVar12.f32120g;
                        i27 = fVar13.f32120g;
                        fY = 0.5f;
                    }
                    this.f32174h.d((int) (i26 + 0.5f + (((i27 - i26) - this.f32171e.f32120g) * fY)));
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
            this.f32171e.d(c3242e.T());
        }
        if (this.f32171e.f32123j) {
            C3242e.b bVar = this.f32170d;
            C3242e.b bVar2 = C3242e.b.MATCH_PARENT;
            if (bVar == bVar2 && (c3242eK = this.f32168b.K()) != null && (c3242eK.A() == C3242e.b.FIXED || c3242eK.A() == bVar2)) {
                b(this.f32174h, c3242eK.f31678e.f32174h, this.f32168b.f31657N.f());
                b(this.f32175i, c3242eK.f31678e.f32175i, -this.f32168b.f31659P.f());
                return;
            }
        } else {
            C3242e.b bVarA = this.f32168b.A();
            this.f32170d = bVarA;
            if (bVarA != C3242e.b.MATCH_CONSTRAINT) {
                C3242e.b bVar3 = C3242e.b.MATCH_PARENT;
                if (bVarA == bVar3 && (c3242eK2 = this.f32168b.K()) != null && (c3242eK2.A() == C3242e.b.FIXED || c3242eK2.A() == bVar3)) {
                    int iT = (c3242eK2.T() - this.f32168b.f31657N.f()) - this.f32168b.f31659P.f();
                    b(this.f32174h, c3242eK2.f31678e.f32174h, this.f32168b.f31657N.f());
                    b(this.f32175i, c3242eK2.f31678e.f32175i, -this.f32168b.f31659P.f());
                    this.f32171e.d(iT);
                    return;
                }
                if (this.f32170d == C3242e.b.FIXED) {
                    this.f32171e.d(this.f32168b.T());
                }
            }
        }
        g gVar = this.f32171e;
        if (gVar.f32123j) {
            C3242e c3242e2 = this.f32168b;
            if (c3242e2.f31670a) {
                C3241d[] c3241dArr = c3242e2.f31665V;
                C3241d c3241d = c3241dArr[0];
                C3241d c3241d2 = c3241d.f31620f;
                if (c3241d2 != null && c3241dArr[1].f31620f != null) {
                    if (c3242e2.f0()) {
                        this.f32174h.f32119f = this.f32168b.f31665V[0].f();
                        this.f32175i.f32119f = -this.f32168b.f31665V[1].f();
                        return;
                    }
                    f fVarH = h(this.f32168b.f31665V[0]);
                    if (fVarH != null) {
                        b(this.f32174h, fVarH, this.f32168b.f31665V[0].f());
                    }
                    f fVarH2 = h(this.f32168b.f31665V[1]);
                    if (fVarH2 != null) {
                        b(this.f32175i, fVarH2, -this.f32168b.f31665V[1].f());
                    }
                    this.f32174h.f32115b = true;
                    this.f32175i.f32115b = true;
                    return;
                }
                if (c3241d2 != null) {
                    f fVarH3 = h(c3241d);
                    if (fVarH3 != null) {
                        b(this.f32174h, fVarH3, this.f32168b.f31665V[0].f());
                        b(this.f32175i, this.f32174h, this.f32171e.f32120g);
                        return;
                    }
                    return;
                }
                C3241d c3241d3 = c3241dArr[1];
                if (c3241d3.f31620f != null) {
                    f fVarH4 = h(c3241d3);
                    if (fVarH4 != null) {
                        b(this.f32175i, fVarH4, -this.f32168b.f31665V[1].f());
                        b(this.f32174h, this.f32175i, -this.f32171e.f32120g);
                        return;
                    }
                    return;
                }
                if ((c3242e2 instanceof InterfaceC3246i) || c3242e2.K() == null || this.f32168b.o(C3241d.b.CENTER).f31620f != null) {
                    return;
                }
                b(this.f32174h, this.f32168b.K().f31678e.f32174h, this.f32168b.U());
                b(this.f32175i, this.f32174h, this.f32171e.f32120g);
                return;
            }
        }
        if (this.f32170d == C3242e.b.MATCH_CONSTRAINT) {
            C3242e c3242e3 = this.f32168b;
            int i10 = c3242e3.f31712v;
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
            } else if (i10 == 3) {
                if (c3242e3.f31714w == 3) {
                    this.f32174h.f32114a = this;
                    this.f32175i.f32114a = this;
                    n nVar = c3242e3.f31680f;
                    nVar.f32174h.f32114a = this;
                    nVar.f32175i.f32114a = this;
                    gVar.f32114a = this;
                    if (c3242e3.h0()) {
                        this.f32171e.f32125l.add(this.f32168b.f31680f.f32171e);
                        this.f32168b.f31680f.f32171e.f32124k.add(this.f32171e);
                        n nVar2 = this.f32168b.f31680f;
                        nVar2.f32171e.f32114a = this;
                        this.f32171e.f32125l.add(nVar2.f32174h);
                        this.f32171e.f32125l.add(this.f32168b.f31680f.f32175i);
                        this.f32168b.f31680f.f32174h.f32124k.add(this.f32171e);
                        this.f32168b.f31680f.f32175i.f32124k.add(this.f32171e);
                    } else if (this.f32168b.f0()) {
                        this.f32168b.f31680f.f32171e.f32125l.add(this.f32171e);
                        this.f32171e.f32124k.add(this.f32168b.f31680f.f32171e);
                    } else {
                        this.f32168b.f31680f.f32171e.f32125l.add(this.f32171e);
                    }
                } else {
                    g gVar4 = c3242e3.f31680f.f32171e;
                    gVar.f32125l.add(gVar4);
                    gVar4.f32124k.add(this.f32171e);
                    this.f32168b.f31680f.f32174h.f32124k.add(this.f32171e);
                    this.f32168b.f31680f.f32175i.f32124k.add(this.f32171e);
                    g gVar5 = this.f32171e;
                    gVar5.f32115b = true;
                    gVar5.f32124k.add(this.f32174h);
                    this.f32171e.f32124k.add(this.f32175i);
                    this.f32174h.f32125l.add(this.f32171e);
                    this.f32175i.f32125l.add(this.f32171e);
                }
            }
        }
        C3242e c3242e4 = this.f32168b;
        C3241d[] c3241dArr2 = c3242e4.f31665V;
        C3241d c3241d4 = c3241dArr2[0];
        C3241d c3241d5 = c3241d4.f31620f;
        if (c3241d5 != null && c3241dArr2[1].f31620f != null) {
            if (c3242e4.f0()) {
                this.f32174h.f32119f = this.f32168b.f31665V[0].f();
                this.f32175i.f32119f = -this.f32168b.f31665V[1].f();
                return;
            }
            f fVarH5 = h(this.f32168b.f31665V[0]);
            f fVarH6 = h(this.f32168b.f31665V[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f32176j = p.b.CENTER;
            return;
        }
        if (c3241d5 != null) {
            f fVarH7 = h(c3241d4);
            if (fVarH7 != null) {
                b(this.f32174h, fVarH7, this.f32168b.f31665V[0].f());
                c(this.f32175i, this.f32174h, 1, this.f32171e);
                return;
            }
            return;
        }
        C3241d c3241d6 = c3241dArr2[1];
        if (c3241d6.f31620f != null) {
            f fVarH8 = h(c3241d6);
            if (fVarH8 != null) {
                b(this.f32175i, fVarH8, -this.f32168b.f31665V[1].f());
                c(this.f32174h, this.f32175i, -1, this.f32171e);
                return;
            }
            return;
        }
        if ((c3242e4 instanceof InterfaceC3246i) || c3242e4.K() == null) {
            return;
        }
        b(this.f32174h, this.f32168b.K().f31678e.f32174h, this.f32168b.U());
        c(this.f32175i, this.f32174h, 1, this.f32171e);
    }

    @Override // s0.p
    public void e() {
        f fVar = this.f32174h;
        if (fVar.f32123j) {
            this.f32168b.g1(fVar.f32120g);
        }
    }

    @Override // s0.p
    void f() {
        this.f32169c = null;
        this.f32174h.c();
        this.f32175i.c();
        this.f32171e.c();
        this.f32173g = false;
    }

    @Override // s0.p
    boolean m() {
        return this.f32170d != C3242e.b.MATCH_CONSTRAINT || this.f32168b.f31712v == 0;
    }

    void r() {
        this.f32173g = false;
        this.f32174h.c();
        this.f32174h.f32123j = false;
        this.f32175i.c();
        this.f32175i.f32123j = false;
        this.f32171e.f32123j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f32168b.t();
    }
}
