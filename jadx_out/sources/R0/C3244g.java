package r0;

import java.util.ArrayList;
import java.util.Arrays;
import r0.C3242e;

/* JADX INFO: renamed from: r0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3244g extends l {

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private C3242e[] f31782v1;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private int f31759Y0 = -1;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private int f31760Z0 = -1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f31761a1 = -1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f31762b1 = -1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f31763c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f31764d1 = -1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private float f31765e1 = 0.5f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private float f31766f1 = 0.5f;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private float f31767g1 = 0.5f;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private float f31768h1 = 0.5f;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private float f31769i1 = 0.5f;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private float f31770j1 = 0.5f;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f31771k1 = 0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f31772l1 = 0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int f31773m1 = 2;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f31774n1 = 2;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f31775o1 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f31776p1 = -1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private int f31777q1 = 0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private ArrayList f31778r1 = new ArrayList();

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private C3242e[] f31779s1 = null;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private C3242e[] f31780t1 = null;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private int[] f31781u1 = null;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private int f31783w1 = 0;

    /* JADX INFO: renamed from: r0.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31784a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C3241d f31787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private C3241d f31788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C3241d f31789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C3241d f31790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f31791h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f31792i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f31793j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f31794k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f31800q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3242e f31785b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31786c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f31795l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f31796m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f31797n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f31798o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f31799p = 0;

        public a(int i10, C3241d c3241d, C3241d c3241d2, C3241d c3241d3, C3241d c3241d4, int i11) {
            this.f31791h = 0;
            this.f31792i = 0;
            this.f31793j = 0;
            this.f31794k = 0;
            this.f31800q = 0;
            this.f31784a = i10;
            this.f31787d = c3241d;
            this.f31788e = c3241d2;
            this.f31789f = c3241d3;
            this.f31790g = c3241d4;
            this.f31791h = C3244g.this.t1();
            this.f31792i = C3244g.this.v1();
            this.f31793j = C3244g.this.u1();
            this.f31794k = C3244g.this.s1();
            this.f31800q = i11;
        }

        private void h() {
            this.f31795l = 0;
            this.f31796m = 0;
            this.f31785b = null;
            this.f31786c = 0;
            int i10 = this.f31798o;
            for (int i11 = 0; i11 < i10 && this.f31797n + i11 < C3244g.this.f31783w1; i11++) {
                C3242e c3242e = C3244g.this.f31782v1[this.f31797n + i11];
                if (this.f31784a == 0) {
                    int iT = c3242e.T();
                    int i12 = C3244g.this.f31771k1;
                    if (c3242e.S() == 8) {
                        i12 = 0;
                    }
                    this.f31795l += iT + i12;
                    int iE2 = C3244g.this.e2(c3242e, this.f31800q);
                    if (this.f31785b == null || this.f31786c < iE2) {
                        this.f31785b = c3242e;
                        this.f31786c = iE2;
                        this.f31796m = iE2;
                    }
                } else {
                    int iF2 = C3244g.this.f2(c3242e, this.f31800q);
                    int iE22 = C3244g.this.e2(c3242e, this.f31800q);
                    int i13 = C3244g.this.f31772l1;
                    if (c3242e.S() == 8) {
                        i13 = 0;
                    }
                    this.f31796m += iE22 + i13;
                    if (this.f31785b == null || this.f31786c < iF2) {
                        this.f31785b = c3242e;
                        this.f31786c = iF2;
                        this.f31795l = iF2;
                    }
                }
            }
        }

        public void b(C3242e c3242e) {
            if (this.f31784a == 0) {
                int iF2 = C3244g.this.f2(c3242e, this.f31800q);
                if (c3242e.A() == C3242e.b.MATCH_CONSTRAINT) {
                    this.f31799p++;
                    iF2 = 0;
                }
                this.f31795l += iF2 + (c3242e.S() != 8 ? C3244g.this.f31771k1 : 0);
                int iE2 = C3244g.this.e2(c3242e, this.f31800q);
                if (this.f31785b == null || this.f31786c < iE2) {
                    this.f31785b = c3242e;
                    this.f31786c = iE2;
                    this.f31796m = iE2;
                }
            } else {
                int iF22 = C3244g.this.f2(c3242e, this.f31800q);
                int iE22 = C3244g.this.e2(c3242e, this.f31800q);
                if (c3242e.Q() == C3242e.b.MATCH_CONSTRAINT) {
                    this.f31799p++;
                    iE22 = 0;
                }
                this.f31796m += iE22 + (c3242e.S() != 8 ? C3244g.this.f31772l1 : 0);
                if (this.f31785b == null || this.f31786c < iF22) {
                    this.f31785b = c3242e;
                    this.f31786c = iF22;
                    this.f31795l = iF22;
                }
            }
            this.f31798o++;
        }

        public void c() {
            this.f31786c = 0;
            this.f31785b = null;
            this.f31795l = 0;
            this.f31796m = 0;
            this.f31797n = 0;
            this.f31798o = 0;
            this.f31799p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            C3242e c3242e;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f31798o;
            for (int i13 = 0; i13 < i12 && this.f31797n + i13 < C3244g.this.f31783w1; i13++) {
                C3242e c3242e2 = C3244g.this.f31782v1[this.f31797n + i13];
                if (c3242e2 != null) {
                    c3242e2.r0();
                }
            }
            if (i12 == 0 || this.f31785b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f31797n + i17 >= C3244g.this.f31783w1) {
                    break;
                }
                if (C3244g.this.f31782v1[this.f31797n + i17].S() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            C3242e c3242e3 = null;
            if (this.f31784a != 0) {
                C3242e c3242e4 = this.f31785b;
                c3242e4.H0(C3244g.this.f31759Y0);
                int i18 = this.f31791h;
                if (i10 > 0) {
                    i18 += C3244g.this.f31771k1;
                }
                if (z10) {
                    c3242e4.f31659P.a(this.f31789f, i18);
                    if (z11) {
                        c3242e4.f31657N.a(this.f31787d, this.f31793j);
                    }
                    if (i10 > 0) {
                        this.f31789f.f31618d.f31657N.a(c3242e4.f31659P, 0);
                    }
                } else {
                    c3242e4.f31657N.a(this.f31787d, i18);
                    if (z11) {
                        c3242e4.f31659P.a(this.f31789f, this.f31793j);
                    }
                    if (i10 > 0) {
                        this.f31787d.f31618d.f31659P.a(c3242e4.f31657N, 0);
                    }
                }
                int i19 = 0;
                while (i19 < i12 && this.f31797n + i19 < C3244g.this.f31783w1) {
                    C3242e c3242e5 = C3244g.this.f31782v1[this.f31797n + i19];
                    if (i19 == 0) {
                        c3242e5.k(c3242e5.f31658O, this.f31788e, this.f31792i);
                        int i20 = C3244g.this.f31760Z0;
                        float f12 = C3244g.this.f31766f1;
                        if (this.f31797n == 0 && C3244g.this.f31762b1 != -1) {
                            i20 = C3244g.this.f31762b1;
                            f12 = C3244g.this.f31768h1;
                        } else if (z11 && C3244g.this.f31764d1 != -1) {
                            i20 = C3244g.this.f31764d1;
                            f12 = C3244g.this.f31770j1;
                        }
                        c3242e5.Y0(i20);
                        c3242e5.X0(f12);
                    }
                    if (i19 == i12 - 1) {
                        c3242e5.k(c3242e5.f31660Q, this.f31790g, this.f31794k);
                    }
                    if (c3242e3 != null) {
                        c3242e5.f31658O.a(c3242e3.f31660Q, C3244g.this.f31772l1);
                        if (i19 == i14) {
                            c3242e5.f31658O.u(this.f31792i);
                        }
                        c3242e3.f31660Q.a(c3242e5.f31658O, 0);
                        if (i19 == i15 + 1) {
                            c3242e3.f31660Q.u(this.f31794k);
                        }
                    }
                    if (c3242e5 != c3242e4) {
                        if (z10) {
                            int i21 = C3244g.this.f31773m1;
                            if (i21 == 0) {
                                c3242e5.f31659P.a(c3242e4.f31659P, 0);
                            } else if (i21 == 1) {
                                c3242e5.f31657N.a(c3242e4.f31657N, 0);
                            } else if (i21 == 2) {
                                c3242e5.f31657N.a(c3242e4.f31657N, 0);
                                c3242e5.f31659P.a(c3242e4.f31659P, 0);
                            }
                        } else {
                            int i22 = C3244g.this.f31773m1;
                            if (i22 == 0) {
                                c3242e5.f31657N.a(c3242e4.f31657N, 0);
                            } else if (i22 == 1) {
                                c3242e5.f31659P.a(c3242e4.f31659P, 0);
                            } else if (i22 == 2) {
                                if (z12) {
                                    c3242e5.f31657N.a(this.f31787d, this.f31791h);
                                    c3242e5.f31659P.a(this.f31789f, this.f31793j);
                                } else {
                                    c3242e5.f31657N.a(c3242e4.f31657N, 0);
                                    c3242e5.f31659P.a(c3242e4.f31659P, 0);
                                }
                            }
                        }
                    }
                    i19++;
                    c3242e3 = c3242e5;
                }
                return;
            }
            C3242e c3242e6 = this.f31785b;
            c3242e6.Y0(C3244g.this.f31760Z0);
            int i23 = this.f31792i;
            if (i10 > 0) {
                i23 += C3244g.this.f31772l1;
            }
            c3242e6.f31658O.a(this.f31788e, i23);
            if (z11) {
                c3242e6.f31660Q.a(this.f31790g, this.f31794k);
            }
            if (i10 > 0) {
                this.f31788e.f31618d.f31660Q.a(c3242e6.f31658O, 0);
            }
            if (C3244g.this.f31774n1 != 3 || c3242e6.W()) {
                c3242e = c3242e6;
            } else {
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f31797n + i25 >= C3244g.this.f31783w1) {
                        break;
                    }
                    c3242e = C3244g.this.f31782v1[this.f31797n + i25];
                    if (c3242e.W()) {
                        break;
                    }
                }
                c3242e = c3242e6;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f31797n + i27 >= C3244g.this.f31783w1) {
                    return;
                }
                C3242e c3242e7 = C3244g.this.f31782v1[this.f31797n + i27];
                if (i26 == 0) {
                    i11 = 1;
                    c3242e7.k(c3242e7.f31657N, this.f31787d, this.f31791h);
                } else {
                    i11 = 1;
                }
                if (i27 == 0) {
                    int i28 = C3244g.this.f31759Y0;
                    float f13 = C3244g.this.f31765e1;
                    if (z10) {
                        f13 = 1.0f - f13;
                    }
                    if (this.f31797n != 0 || C3244g.this.f31761a1 == -1) {
                        if (z11 && C3244g.this.f31763c1 != -1) {
                            i28 = C3244g.this.f31763c1;
                            if (z10) {
                                f11 = C3244g.this.f31769i1;
                                f10 = 1.0f - f11;
                                f13 = f10;
                            } else {
                                f10 = C3244g.this.f31769i1;
                                f13 = f10;
                            }
                        }
                        c3242e7.H0(i28);
                        c3242e7.G0(f13);
                    } else {
                        i28 = C3244g.this.f31761a1;
                        if (z10) {
                            f11 = C3244g.this.f31767g1;
                            f10 = 1.0f - f11;
                            f13 = f10;
                            c3242e7.H0(i28);
                            c3242e7.G0(f13);
                        } else {
                            f10 = C3244g.this.f31767g1;
                            f13 = f10;
                            c3242e7.H0(i28);
                            c3242e7.G0(f13);
                        }
                    }
                }
                if (i26 == i12 - 1) {
                    c3242e7.k(c3242e7.f31659P, this.f31789f, this.f31793j);
                }
                if (c3242e3 != null) {
                    c3242e7.f31657N.a(c3242e3.f31659P, C3244g.this.f31771k1);
                    if (i26 == i14) {
                        c3242e7.f31657N.u(this.f31791h);
                    }
                    c3242e3.f31659P.a(c3242e7.f31657N, 0);
                    if (i26 == i15 + 1) {
                        c3242e3.f31659P.u(this.f31793j);
                    }
                }
                if (c3242e7 != c3242e6) {
                    c10 = 3;
                    if (C3244g.this.f31774n1 == 3 && c3242e.W() && c3242e7 != c3242e && c3242e7.W()) {
                        c3242e7.f31661R.a(c3242e.f31661R, 0);
                    } else {
                        int i29 = C3244g.this.f31774n1;
                        if (i29 == 0) {
                            c3242e7.f31658O.a(c3242e6.f31658O, 0);
                        } else if (i29 == i11) {
                            c3242e7.f31660Q.a(c3242e6.f31660Q, 0);
                        } else if (z12) {
                            c3242e7.f31658O.a(this.f31788e, this.f31792i);
                            c3242e7.f31660Q.a(this.f31790g, this.f31794k);
                        } else {
                            c3242e7.f31658O.a(c3242e6.f31658O, 0);
                            c3242e7.f31660Q.a(c3242e6.f31660Q, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                i26++;
                c3242e3 = c3242e7;
            }
        }

        public int e() {
            return this.f31784a == 1 ? this.f31796m - C3244g.this.f31772l1 : this.f31796m;
        }

        public int f() {
            return this.f31784a == 0 ? this.f31795l - C3244g.this.f31771k1 : this.f31795l;
        }

        public void g(int i10) {
            int i11 = this.f31799p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f31798o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f31797n + i14 < C3244g.this.f31783w1; i14++) {
                C3242e c3242e = C3244g.this.f31782v1[this.f31797n + i14];
                if (this.f31784a == 0) {
                    if (c3242e != null && c3242e.A() == C3242e.b.MATCH_CONSTRAINT && c3242e.f31712v == 0) {
                        C3244g.this.x1(c3242e, C3242e.b.FIXED, i13, c3242e.Q(), c3242e.x());
                    }
                } else if (c3242e != null && c3242e.Q() == C3242e.b.MATCH_CONSTRAINT && c3242e.f31714w == 0) {
                    int i15 = i13;
                    C3244g.this.x1(c3242e, c3242e.A(), c3242e.T(), C3242e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public void i(int i10) {
            this.f31797n = i10;
        }

        public void j(int i10, C3241d c3241d, C3241d c3241d2, C3241d c3241d3, C3241d c3241d4, int i11, int i12, int i13, int i14, int i15) {
            this.f31784a = i10;
            this.f31787d = c3241d;
            this.f31788e = c3241d2;
            this.f31789f = c3241d3;
            this.f31790g = c3241d4;
            this.f31791h = i11;
            this.f31792i = i12;
            this.f31793j = i13;
            this.f31794k = i14;
            this.f31800q = i15;
        }
    }

    private void d2(boolean z10) {
        C3242e c3242e;
        float f10;
        int i10;
        if (this.f31781u1 == null || this.f31780t1 == null || this.f31779s1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f31783w1; i11++) {
            this.f31782v1[i11].r0();
        }
        int[] iArr = this.f31781u1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f31765e1;
        C3242e c3242e2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f31765e1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            C3242e c3242e3 = this.f31780t1[i10];
            if (c3242e3 != null && c3242e3.S() != 8) {
                if (i14 == 0) {
                    c3242e3.k(c3242e3.f31657N, this.f31657N, t1());
                    c3242e3.H0(this.f31759Y0);
                    c3242e3.G0(f10);
                }
                if (i14 == i12 - 1) {
                    c3242e3.k(c3242e3.f31659P, this.f31659P, u1());
                }
                if (i14 > 0 && c3242e2 != null) {
                    c3242e3.k(c3242e3.f31657N, c3242e2.f31659P, this.f31771k1);
                    c3242e2.k(c3242e2.f31659P, c3242e3.f31657N, 0);
                }
                c3242e2 = c3242e3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            C3242e c3242e4 = this.f31779s1[i15];
            if (c3242e4 != null && c3242e4.S() != 8) {
                if (i15 == 0) {
                    c3242e4.k(c3242e4.f31658O, this.f31658O, v1());
                    c3242e4.Y0(this.f31760Z0);
                    c3242e4.X0(this.f31766f1);
                }
                if (i15 == i13 - 1) {
                    c3242e4.k(c3242e4.f31660Q, this.f31660Q, s1());
                }
                if (i15 > 0 && c3242e2 != null) {
                    c3242e4.k(c3242e4.f31658O, c3242e2.f31660Q, this.f31772l1);
                    c3242e2.k(c3242e2.f31660Q, c3242e4.f31658O, 0);
                }
                c3242e2 = c3242e4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f31777q1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                C3242e[] c3242eArr = this.f31782v1;
                if (i18 < c3242eArr.length && (c3242e = c3242eArr[i18]) != null && c3242e.S() != 8) {
                    C3242e c3242e5 = this.f31780t1[i16];
                    C3242e c3242e6 = this.f31779s1[i17];
                    if (c3242e != c3242e5) {
                        c3242e.k(c3242e.f31657N, c3242e5.f31657N, 0);
                        c3242e.k(c3242e.f31659P, c3242e5.f31659P, 0);
                    }
                    if (c3242e != c3242e6) {
                        c3242e.k(c3242e.f31658O, c3242e6.f31658O, 0);
                        c3242e.k(c3242e.f31660Q, c3242e6.f31660Q, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e2(C3242e c3242e, int i10) {
        C3242e c3242e2;
        if (c3242e == null) {
            return 0;
        }
        if (c3242e.Q() == C3242e.b.MATCH_CONSTRAINT) {
            int i11 = c3242e.f31714w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c3242e.f31642D * i10);
                if (i12 != c3242e.x()) {
                    c3242e.S0(true);
                    x1(c3242e, c3242e.A(), c3242e.T(), C3242e.b.FIXED, i12);
                }
                return i12;
            }
            c3242e2 = c3242e;
            if (i11 == 1) {
                return c3242e2.x();
            }
            if (i11 == 3) {
                return (int) ((c3242e2.T() * c3242e2.f31675c0) + 0.5f);
            }
        } else {
            c3242e2 = c3242e;
        }
        return c3242e2.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f2(C3242e c3242e, int i10) {
        C3242e c3242e2;
        if (c3242e == null) {
            return 0;
        }
        if (c3242e.A() == C3242e.b.MATCH_CONSTRAINT) {
            int i11 = c3242e.f31712v;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c3242e.f31636A * i10);
                if (i12 != c3242e.T()) {
                    c3242e.S0(true);
                    x1(c3242e, C3242e.b.FIXED, i12, c3242e.Q(), c3242e.x());
                }
                return i12;
            }
            c3242e2 = c3242e;
            if (i11 == 1) {
                return c3242e2.T();
            }
            if (i11 == 3) {
                return (int) ((c3242e2.x() * c3242e2.f31675c0) + 0.5f);
            }
        } else {
            c3242e2 = c3242e;
        }
        return c3242e2.T();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void g2(C3242e[] c3242eArr, int i10, int i11, int i12, int[] iArr) {
        int iCeil;
        int iCeil2;
        C3242e c3242e;
        if (i11 == 0) {
            int i13 = this.f31776p1;
            if (i13 <= 0) {
                i13 = 0;
                int iF2 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    if (i14 > 0) {
                        iF2 += this.f31771k1;
                    }
                    C3242e c3242e2 = c3242eArr[i14];
                    if (c3242e2 != null) {
                        iF2 += f2(c3242e2, i12);
                        if (iF2 > i12) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            iCeil2 = i13;
            iCeil = 0;
        } else {
            iCeil = this.f31776p1;
            if (iCeil <= 0) {
                iCeil = 0;
                int iE2 = 0;
                for (int i15 = 0; i15 < i10; i15++) {
                    if (i15 > 0) {
                        iE2 += this.f31772l1;
                    }
                    C3242e c3242e3 = c3242eArr[i15];
                    if (c3242e3 != null) {
                        iE2 += e2(c3242e3, i12);
                        if (iE2 > i12) {
                            break;
                        } else {
                            iCeil++;
                        }
                    }
                }
            }
            iCeil2 = 0;
        }
        if (this.f31781u1 == null) {
            this.f31781u1 = new int[2];
        }
        boolean z10 = (iCeil == 0 && i11 == 1) || (iCeil2 == 0 && i11 == 0);
        while (!z10) {
            if (i11 == 0) {
                iCeil = (int) Math.ceil(i10 / iCeil2);
            } else {
                iCeil2 = (int) Math.ceil(i10 / iCeil);
            }
            C3242e[] c3242eArr2 = this.f31780t1;
            if (c3242eArr2 == null || c3242eArr2.length < iCeil2) {
                this.f31780t1 = new C3242e[iCeil2];
            } else {
                Arrays.fill(c3242eArr2, (Object) null);
            }
            C3242e[] c3242eArr3 = this.f31779s1;
            if (c3242eArr3 == null || c3242eArr3.length < iCeil) {
                this.f31779s1 = new C3242e[iCeil];
            } else {
                Arrays.fill(c3242eArr3, (Object) null);
            }
            for (int i16 = 0; i16 < iCeil2; i16++) {
                for (int i17 = 0; i17 < iCeil; i17++) {
                    int i18 = (i17 * iCeil2) + i16;
                    if (i11 == 1) {
                        i18 = (i16 * iCeil) + i17;
                    }
                    if (i18 < c3242eArr.length && (c3242e = c3242eArr[i18]) != null) {
                        int iF22 = f2(c3242e, i12);
                        C3242e c3242e4 = this.f31780t1[i16];
                        if (c3242e4 == null || c3242e4.T() < iF22) {
                            this.f31780t1[i16] = c3242e;
                        }
                        int iE22 = e2(c3242e, i12);
                        C3242e c3242e5 = this.f31779s1[i17];
                        if (c3242e5 == null || c3242e5.x() < iE22) {
                            this.f31779s1[i17] = c3242e;
                        }
                    }
                }
            }
            int iF23 = 0;
            for (int i19 = 0; i19 < iCeil2; i19++) {
                C3242e c3242e6 = this.f31780t1[i19];
                if (c3242e6 != null) {
                    if (i19 > 0) {
                        iF23 += this.f31771k1;
                    }
                    iF23 += f2(c3242e6, i12);
                }
            }
            int iE23 = 0;
            for (int i20 = 0; i20 < iCeil; i20++) {
                C3242e c3242e7 = this.f31779s1[i20];
                if (c3242e7 != null) {
                    if (i20 > 0) {
                        iE23 += this.f31772l1;
                    }
                    iE23 += e2(c3242e7, i12);
                }
            }
            iArr[0] = iF23;
            iArr[1] = iE23;
            if (i11 != 0) {
                if (iE23 > i12 && iCeil > 1) {
                    iCeil--;
                }
            } else if (iF23 > i12 && iCeil2 > 1) {
                iCeil2--;
            }
            while (!z10) {
            }
        }
        int[] iArr2 = this.f31781u1;
        iArr2[0] = iCeil2;
        iArr2[1] = iCeil;
    }

    private void h2(C3242e[] c3242eArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        C3244g c3244g;
        int i14;
        C3241d c3241d;
        int i15;
        C3244g c3244g2 = this;
        if (i10 == 0) {
            return;
        }
        c3244g2.f31778r1.clear();
        int i16 = i12;
        a aVar = c3244g2.new a(i11, c3244g2.f31657N, c3244g2.f31658O, c3244g2.f31659P, c3244g2.f31660Q, i16);
        c3244g2.f31778r1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                C3242e c3242e = c3242eArr[i18];
                int iF2 = c3244g2.f2(c3242e, i16);
                if (c3242e.A() == C3242e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (c3244g2.f31771k1 + i17) + iF2 > i16) && aVar.f31785b != null;
                if (!z10 && i18 > 0 && (i15 = c3244g2.f31776p1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = c3244g2.new a(i11, c3244g2.f31657N, c3244g2.f31658O, c3244g2.f31659P, c3244g2.f31660Q, i16);
                    aVar.i(i18);
                    c3244g2.f31778r1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += c3244g2.f31771k1 + iF2;
                    }
                    aVar.b(c3242e);
                    i18++;
                    i13 = i19;
                }
                i17 = iF2;
                aVar.b(c3242e);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                C3242e c3242e2 = c3242eArr[i21];
                int iE2 = c3244g2.e2(c3242e2, i16);
                if (c3242e2.Q() == C3242e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (c3244g2.f31772l1 + i20) + iE2 > i16) && aVar.f31785b != null;
                if (!z11 && i21 > 0 && (i14 = c3244g2.f31776p1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = c3244g2.new a(i11, c3244g2.f31657N, c3244g2.f31658O, c3244g2.f31659P, c3244g2.f31660Q, i16);
                    c3244g = c3244g2;
                    aVar.i(i21);
                    c3244g.f31778r1.add(aVar);
                } else {
                    c3244g = c3244g2;
                    if (i21 > 0) {
                        i20 += c3244g.f31772l1 + iE2;
                    }
                    aVar.b(c3242e2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    c3244g2 = c3244g;
                }
                i20 = iE2;
                aVar.b(c3242e2);
                i21++;
                i16 = i12;
                i13 = i22;
                c3244g2 = c3244g;
            }
        }
        C3244g c3244g3 = c3244g2;
        int size = c3244g3.f31778r1.size();
        C3241d c3241d2 = c3244g3.f31657N;
        C3241d c3241d3 = c3244g3.f31658O;
        C3241d c3241d4 = c3244g3.f31659P;
        C3241d c3241d5 = c3244g3.f31660Q;
        int iT1 = c3244g3.t1();
        int iV1 = c3244g3.v1();
        int iU1 = c3244g3.u1();
        int iS1 = c3244g3.s1();
        C3242e.b bVarA = c3244g3.A();
        C3242e.b bVar = C3242e.b.WRAP_CONTENT;
        boolean z12 = bVarA == bVar || c3244g3.Q() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) c3244g3.f31778r1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        C3241d c3241d6 = c3241d2;
        int iS12 = iS1;
        int i24 = 0;
        int iU12 = iU1;
        int i25 = iV1;
        int i26 = iT1;
        C3241d c3241d7 = c3241d5;
        C3241d c3241d8 = c3241d4;
        C3241d c3241d9 = c3241d3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = (a) c3244g3.f31778r1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    c3241d7 = ((a) c3244g3.f31778r1.get(i28 + 1)).f31785b.f31658O;
                    iS12 = 0;
                } else {
                    c3241d7 = c3244g3.f31660Q;
                    iS12 = c3244g3.s1();
                }
                C3241d c3241d10 = aVar3.f31785b.f31660Q;
                int i29 = i27;
                aVar3.j(i11, c3241d6, c3241d9, c3241d8, c3241d7, i26, i25, iU12, iS12, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += c3244g3.f31772l1;
                }
                i27 = iE;
                i24 = iMax;
                c3241d9 = c3241d10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    c3241d = ((a) c3244g3.f31778r1.get(i28 + 1)).f31785b.f31657N;
                    iU12 = 0;
                } else {
                    c3241d = c3244g3.f31659P;
                    iU12 = c3244g3.u1();
                }
                c3241d8 = c3241d;
                C3241d c3241d11 = aVar3.f31785b.f31659P;
                aVar3.j(i11, c3241d6, c3241d9, c3241d8, c3241d7, i26, i25, iU12, iS12, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += c3244g3.f31771k1;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                c3241d6 = c3241d11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    private void i2(C3242e[] c3242eArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f31778r1.size() == 0) {
            aVar = new a(i11, this.f31657N, this.f31658O, this.f31659P, this.f31660Q, i12);
            this.f31778r1.add(aVar);
        } else {
            a aVar2 = (a) this.f31778r1.get(0);
            aVar2.c();
            aVar2.j(i11, this.f31657N, this.f31658O, this.f31659P, this.f31660Q, t1(), v1(), u1(), s1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(c3242eArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(int i10) {
        this.f31760Z0 = i10;
    }

    public void B2(int i10) {
        this.f31775o1 = i10;
    }

    @Override // r0.C3242e
    public void g(o0.d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = K() != null && ((C3243f) K()).J1();
        int i10 = this.f31775o1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f31778r1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f31778r1.get(i11)).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                d2(z11);
            }
        } else if (this.f31778r1.size() > 0) {
            ((a) this.f31778r1.get(0)).d(z11, 0, true);
        }
        A1(false);
    }

    public void j2(float f10) {
        this.f31767g1 = f10;
    }

    public void k2(int i10) {
        this.f31761a1 = i10;
    }

    public void l2(float f10) {
        this.f31768h1 = f10;
    }

    public void m2(int i10) {
        this.f31762b1 = i10;
    }

    public void n2(int i10) {
        this.f31773m1 = i10;
    }

    public void o2(float f10) {
        this.f31765e1 = f10;
    }

    public void p2(int i10) {
        this.f31771k1 = i10;
    }

    public void q2(int i10) {
        this.f31759Y0 = i10;
    }

    public void r2(float f10) {
        this.f31769i1 = f10;
    }

    public void s2(int i10) {
        this.f31763c1 = i10;
    }

    public void t2(float f10) {
        this.f31770j1 = f10;
    }

    public void u2(int i10) {
        this.f31764d1 = i10;
    }

    public void v2(int i10) {
        this.f31776p1 = i10;
    }

    @Override // r0.l
    public void w1(int i10, int i11, int i12, int i13) {
        int i14;
        C3242e[] c3242eArr;
        if (this.f31811K0 > 0 && !y1()) {
            B1(0, 0);
            A1(false);
            return;
        }
        int iT1 = t1();
        int iU1 = u1();
        int iV1 = v1();
        int iS1 = s1();
        int[] iArr = new int[2];
        int i15 = (i11 - iT1) - iU1;
        int i16 = this.f31777q1;
        if (i16 == 1) {
            i15 = (i13 - iV1) - iS1;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f31759Y0 == -1) {
                this.f31759Y0 = 0;
            }
            if (this.f31760Z0 == -1) {
                this.f31760Z0 = 0;
            }
        } else {
            if (this.f31759Y0 == -1) {
                this.f31759Y0 = 0;
            }
            if (this.f31760Z0 == -1) {
                this.f31760Z0 = 0;
            }
        }
        C3242e[] c3242eArr2 = this.f31810J0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.f31811K0;
            if (i18 >= i14) {
                break;
            }
            if (this.f31810J0[i18].S() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            C3242e[] c3242eArr3 = new C3242e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.f31811K0) {
                C3242e c3242e = this.f31810J0[i20];
                C3242e[] c3242eArr4 = c3242eArr3;
                if (c3242e.S() != 8) {
                    c3242eArr4[i14] = c3242e;
                    i14++;
                }
                i20++;
                c3242eArr3 = c3242eArr4;
            }
            c3242eArr = c3242eArr3;
        } else {
            c3242eArr = c3242eArr2;
        }
        int i21 = i14;
        this.f31782v1 = c3242eArr;
        this.f31783w1 = i21;
        int i22 = this.f31775o1;
        if (i22 == 0) {
            i2(c3242eArr, i21, this.f31777q1, i17, iArr);
        } else if (i22 == 1) {
            h2(c3242eArr, i21, this.f31777q1, i17, iArr);
        } else if (i22 == 2) {
            g2(c3242eArr, i21, this.f31777q1, i17, iArr);
        }
        int iMin = iArr[0] + iT1 + iU1;
        int iMin2 = iArr[1] + iV1 + iS1;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        B1(iMin, iMin2);
        e1(iMin);
        F0(iMin2);
        A1(this.f31811K0 > 0);
    }

    public void w2(int i10) {
        this.f31777q1 = i10;
    }

    public void x2(int i10) {
        this.f31774n1 = i10;
    }

    public void y2(float f10) {
        this.f31766f1 = f10;
    }

    public void z2(int i10) {
        this.f31772l1 = i10;
    }
}
