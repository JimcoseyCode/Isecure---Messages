package s0;

import java.util.ArrayList;
import r0.C3238a;
import r0.C3241d;
import r0.C3242e;
import r0.C3243f;
import r0.C3245h;
import s0.C3313b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C3313b.a f32136a = new C3313b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f32137b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f32138c = 0;

    private static boolean a(int i10, C3242e c3242e) {
        C3242e.b bVar;
        C3242e.b bVar2;
        C3242e.b bVarA = c3242e.A();
        C3242e.b bVarQ = c3242e.Q();
        C3243f c3243f = c3242e.K() != null ? (C3243f) c3242e.K() : null;
        if (c3243f != null) {
            c3243f.A();
            C3242e.b bVar3 = C3242e.b.FIXED;
        }
        if (c3243f != null) {
            c3243f.Q();
            C3242e.b bVar4 = C3242e.b.FIXED;
        }
        C3242e.b bVar5 = C3242e.b.FIXED;
        boolean z10 = bVarA == bVar5 || c3242e.k0() || bVarA == C3242e.b.WRAP_CONTENT || (bVarA == (bVar2 = C3242e.b.MATCH_CONSTRAINT) && c3242e.f31712v == 0 && c3242e.f31675c0 == 0.0f && c3242e.X(0)) || (bVarA == bVar2 && c3242e.f31712v == 1 && c3242e.a0(0, c3242e.T()));
        boolean z11 = bVarQ == bVar5 || c3242e.l0() || bVarQ == C3242e.b.WRAP_CONTENT || (bVarQ == (bVar = C3242e.b.MATCH_CONSTRAINT) && c3242e.f31714w == 0 && c3242e.f31675c0 == 0.0f && c3242e.X(1)) || (bVarA == bVar && c3242e.f31714w == 1 && c3242e.a0(1, c3242e.x()));
        if (c3242e.f31675c0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, C3242e c3242e, C3313b.InterfaceC0354b interfaceC0354b, boolean z10) {
        C3241d c3241d;
        C3241d c3241d2;
        C3241d c3241d3;
        C3241d c3241d4;
        C3241d c3241d5;
        if (c3242e.d0()) {
            return;
        }
        f32137b++;
        if (!(c3242e instanceof C3243f) && c3242e.j0()) {
            int i11 = i10 + 1;
            if (a(i11, c3242e)) {
                C3243f.M1(i11, c3242e, interfaceC0354b, new C3313b.a(), C3313b.a.f32090k);
            }
        }
        C3241d c3241dO = c3242e.o(C3241d.b.LEFT);
        C3241d c3241dO2 = c3242e.o(C3241d.b.RIGHT);
        int iE = c3241dO.e();
        int iE2 = c3241dO2.e();
        if (c3241dO.d() != null && c3241dO.n()) {
            for (C3241d c3241d6 : c3241dO.d()) {
                C3242e c3242e2 = c3241d6.f31618d;
                int i12 = i10 + 1;
                boolean zA = a(i12, c3242e2);
                if (c3242e2.j0() && zA) {
                    C3243f.M1(i12, c3242e2, interfaceC0354b, new C3313b.a(), C3313b.a.f32090k);
                }
                C3242e.b bVarA = c3242e2.A();
                C3242e.b bVar = C3242e.b.MATCH_CONSTRAINT;
                if (bVarA != bVar || zA) {
                    if (!c3242e2.j0()) {
                        C3241d c3241d7 = c3242e2.f31657N;
                        if (c3241d6 == c3241d7 && c3242e2.f31659P.f31620f == null) {
                            int iF = c3241d7.f() + iE;
                            c3242e2.z0(iF, c3242e2.T() + iF);
                            b(i12, c3242e2, interfaceC0354b, z10);
                        } else {
                            C3241d c3241d8 = c3242e2.f31659P;
                            if (c3241d6 == c3241d8 && c3241d7.f31620f == null) {
                                int iF2 = iE - c3241d8.f();
                                c3242e2.z0(iF2 - c3242e2.T(), iF2);
                                b(i12, c3242e2, interfaceC0354b, z10);
                            } else if (c3241d6 == c3241d7 && (c3241d3 = c3241d8.f31620f) != null && c3241d3.n() && !c3242e2.f0()) {
                                d(i12, interfaceC0354b, c3242e2, z10);
                            }
                        }
                    }
                } else if (c3242e2.A() == bVar && c3242e2.f31720z >= 0 && c3242e2.f31718y >= 0 && (c3242e2.S() == 8 || (c3242e2.f31712v == 0 && c3242e2.v() == 0.0f))) {
                    if (!c3242e2.f0() && !c3242e2.i0() && ((c3241d6 == c3242e2.f31657N && (c3241d5 = c3242e2.f31659P.f31620f) != null && c3241d5.n()) || (c3241d6 == c3242e2.f31659P && (c3241d4 = c3242e2.f31657N.f31620f) != null && c3241d4.n()))) {
                        if (!c3242e2.f0()) {
                            e(i12, c3242e, interfaceC0354b, c3242e2, z10);
                        }
                    }
                }
            }
        }
        if (c3242e instanceof C3245h) {
            return;
        }
        if (c3241dO2.d() != null && c3241dO2.n()) {
            for (C3241d c3241d9 : c3241dO2.d()) {
                C3242e c3242e3 = c3241d9.f31618d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, c3242e3);
                if (c3242e3.j0() && zA2) {
                    C3243f.M1(i13, c3242e3, interfaceC0354b, new C3313b.a(), C3313b.a.f32090k);
                }
                boolean z11 = (c3241d9 == c3242e3.f31657N && (c3241d2 = c3242e3.f31659P.f31620f) != null && c3241d2.n()) || (c3241d9 == c3242e3.f31659P && (c3241d = c3242e3.f31657N.f31620f) != null && c3241d.n());
                C3242e.b bVarA2 = c3242e3.A();
                C3242e.b bVar2 = C3242e.b.MATCH_CONSTRAINT;
                if (bVarA2 != bVar2 || zA2) {
                    if (!c3242e3.j0()) {
                        C3241d c3241d10 = c3242e3.f31657N;
                        if (c3241d9 == c3241d10 && c3242e3.f31659P.f31620f == null) {
                            int iF3 = c3241d10.f() + iE2;
                            c3242e3.z0(iF3, c3242e3.T() + iF3);
                            b(i13, c3242e3, interfaceC0354b, z10);
                        } else {
                            C3241d c3241d11 = c3242e3.f31659P;
                            if (c3241d9 == c3241d11 && c3241d10.f31620f == null) {
                                int iF4 = iE2 - c3241d11.f();
                                c3242e3.z0(iF4 - c3242e3.T(), iF4);
                                b(i13, c3242e3, interfaceC0354b, z10);
                            } else if (z11 && !c3242e3.f0()) {
                                d(i13, interfaceC0354b, c3242e3, z10);
                            }
                        }
                    }
                } else if (c3242e3.A() == bVar2 && c3242e3.f31720z >= 0 && c3242e3.f31718y >= 0 && (c3242e3.S() == 8 || (c3242e3.f31712v == 0 && c3242e3.v() == 0.0f))) {
                    if (!c3242e3.f0() && !c3242e3.i0() && z11 && !c3242e3.f0()) {
                        e(i13, c3242e, interfaceC0354b, c3242e3, z10);
                    }
                }
            }
        }
        c3242e.n0();
    }

    private static void c(int i10, C3238a c3238a, C3313b.InterfaceC0354b interfaceC0354b, int i11, boolean z10) {
        if (c3238a.n1()) {
            if (i11 == 0) {
                b(i10 + 1, c3238a, interfaceC0354b, z10);
            } else {
                i(i10 + 1, c3238a, interfaceC0354b);
            }
        }
    }

    private static void d(int i10, C3313b.InterfaceC0354b interfaceC0354b, C3242e c3242e, boolean z10) {
        float fY = c3242e.y();
        int iE = c3242e.f31657N.f31620f.e();
        int iE2 = c3242e.f31659P.f31620f.e();
        int iF = c3242e.f31657N.f() + iE;
        int iF2 = iE2 - c3242e.f31659P.f();
        if (iE == iE2) {
            fY = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iT = c3242e.T();
        int i11 = (iE2 - iE) - iT;
        if (iE > iE2) {
            i11 = (iE - iE2) - iT;
        }
        int i12 = ((int) (i11 > 0 ? (fY * i11) + 0.5f : fY * i11)) + iE;
        int i13 = i12 + iT;
        if (iE > iE2) {
            i13 = i12 - iT;
        }
        c3242e.z0(i12, i13);
        b(i10 + 1, c3242e, interfaceC0354b, z10);
    }

    private static void e(int i10, C3242e c3242e, C3313b.InterfaceC0354b interfaceC0354b, C3242e c3242e2, boolean z10) {
        float fY = c3242e2.y();
        int iE = c3242e2.f31657N.f31620f.e() + c3242e2.f31657N.f();
        int iE2 = c3242e2.f31659P.f31620f.e() - c3242e2.f31659P.f();
        if (iE2 >= iE) {
            int iT = c3242e2.T();
            if (c3242e2.S() != 8) {
                int i11 = c3242e2.f31712v;
                if (i11 == 2) {
                    iT = (int) (c3242e2.y() * 0.5f * (c3242e instanceof C3243f ? c3242e.T() : c3242e.K().T()));
                } else if (i11 == 0) {
                    iT = iE2 - iE;
                }
                iT = Math.max(c3242e2.f31718y, iT);
                int i12 = c3242e2.f31720z;
                if (i12 > 0) {
                    iT = Math.min(i12, iT);
                }
            }
            int i13 = iE + ((int) ((fY * ((iE2 - iE) - iT)) + 0.5f));
            c3242e2.z0(i13, iT + i13);
            b(i10 + 1, c3242e2, interfaceC0354b, z10);
        }
    }

    private static void f(int i10, C3313b.InterfaceC0354b interfaceC0354b, C3242e c3242e) {
        float fO = c3242e.O();
        int iE = c3242e.f31658O.f31620f.e();
        int iE2 = c3242e.f31660Q.f31620f.e();
        int iF = c3242e.f31658O.f() + iE;
        int iF2 = iE2 - c3242e.f31660Q.f();
        if (iE == iE2) {
            fO = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iX = c3242e.x();
        int i11 = (iE2 - iE) - iX;
        if (iE > iE2) {
            i11 = (iE - iE2) - iX;
        }
        int i12 = (int) (i11 > 0 ? (fO * i11) + 0.5f : fO * i11);
        int i13 = iE + i12;
        int i14 = i13 + iX;
        if (iE > iE2) {
            i13 = iE - i12;
            i14 = i13 - iX;
        }
        c3242e.C0(i13, i14);
        i(i10 + 1, c3242e, interfaceC0354b);
    }

    private static void g(int i10, C3242e c3242e, C3313b.InterfaceC0354b interfaceC0354b, C3242e c3242e2) {
        float fO = c3242e2.O();
        int iE = c3242e2.f31658O.f31620f.e() + c3242e2.f31658O.f();
        int iE2 = c3242e2.f31660Q.f31620f.e() - c3242e2.f31660Q.f();
        if (iE2 >= iE) {
            int iX = c3242e2.x();
            if (c3242e2.S() != 8) {
                int i11 = c3242e2.f31714w;
                if (i11 == 2) {
                    iX = (int) (fO * 0.5f * (c3242e instanceof C3243f ? c3242e.x() : c3242e.K().x()));
                } else if (i11 == 0) {
                    iX = iE2 - iE;
                }
                iX = Math.max(c3242e2.f31638B, iX);
                int i12 = c3242e2.f31640C;
                if (i12 > 0) {
                    iX = Math.min(i12, iX);
                }
            }
            int i13 = iE + ((int) ((fO * ((iE2 - iE) - iX)) + 0.5f));
            c3242e2.C0(i13, iX + i13);
            i(i10 + 1, c3242e2, interfaceC0354b);
        }
    }

    public static void h(C3243f c3243f, C3313b.InterfaceC0354b interfaceC0354b) {
        C3242e.b bVarA = c3243f.A();
        C3242e.b bVarQ = c3243f.Q();
        f32137b = 0;
        f32138c = 0;
        c3243f.s0();
        ArrayList arrayListL1 = c3243f.l1();
        int size = arrayListL1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C3242e) arrayListL1.get(i10)).s0();
        }
        boolean zJ1 = c3243f.J1();
        if (bVarA == C3242e.b.FIXED) {
            c3243f.z0(0, c3243f.T());
        } else {
            c3243f.A0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C3242e c3242e = (C3242e) arrayListL1.get(i11);
            if (c3242e instanceof C3245h) {
                C3245h c3245h = (C3245h) c3242e;
                if (c3245h.m1() == 1) {
                    if (c3245h.n1() != -1) {
                        c3245h.q1(c3245h.n1());
                    } else if (c3245h.o1() != -1 && c3243f.k0()) {
                        c3245h.q1(c3243f.T() - c3245h.o1());
                    } else if (c3243f.k0()) {
                        c3245h.q1((int) ((c3245h.p1() * c3243f.T()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((c3242e instanceof C3238a) && ((C3238a) c3242e).r1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                C3242e c3242e2 = (C3242e) arrayListL1.get(i12);
                if (c3242e2 instanceof C3245h) {
                    C3245h c3245h2 = (C3245h) c3242e2;
                    if (c3245h2.m1() == 1) {
                        b(0, c3245h2, interfaceC0354b, zJ1);
                    }
                }
            }
        }
        b(0, c3243f, interfaceC0354b, zJ1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                C3242e c3242e3 = (C3242e) arrayListL1.get(i13);
                if (c3242e3 instanceof C3238a) {
                    C3238a c3238a = (C3238a) c3242e3;
                    if (c3238a.r1() == 0) {
                        c(0, c3238a, interfaceC0354b, 0, zJ1);
                    }
                }
            }
        }
        if (bVarQ == C3242e.b.FIXED) {
            c3243f.C0(0, c3243f.x());
        } else {
            c3243f.B0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            C3242e c3242e4 = (C3242e) arrayListL1.get(i14);
            if (c3242e4 instanceof C3245h) {
                C3245h c3245h3 = (C3245h) c3242e4;
                if (c3245h3.m1() == 0) {
                    if (c3245h3.n1() != -1) {
                        c3245h3.q1(c3245h3.n1());
                    } else if (c3245h3.o1() != -1 && c3243f.l0()) {
                        c3245h3.q1(c3243f.x() - c3245h3.o1());
                    } else if (c3243f.l0()) {
                        c3245h3.q1((int) ((c3245h3.p1() * c3243f.x()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((c3242e4 instanceof C3238a) && ((C3238a) c3242e4).r1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                C3242e c3242e5 = (C3242e) arrayListL1.get(i15);
                if (c3242e5 instanceof C3245h) {
                    C3245h c3245h4 = (C3245h) c3242e5;
                    if (c3245h4.m1() == 0) {
                        i(1, c3245h4, interfaceC0354b);
                    }
                }
            }
        }
        i(0, c3243f, interfaceC0354b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                C3242e c3242e6 = (C3242e) arrayListL1.get(i16);
                if (c3242e6 instanceof C3238a) {
                    C3238a c3238a2 = (C3238a) c3242e6;
                    if (c3238a2.r1() == 1) {
                        c(0, c3238a2, interfaceC0354b, 1, zJ1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            C3242e c3242e7 = (C3242e) arrayListL1.get(i17);
            if (c3242e7.j0() && a(0, c3242e7)) {
                C3243f.M1(0, c3242e7, interfaceC0354b, f32136a, C3313b.a.f32090k);
                if (!(c3242e7 instanceof C3245h)) {
                    b(0, c3242e7, interfaceC0354b, zJ1);
                    i(0, c3242e7, interfaceC0354b);
                } else if (((C3245h) c3242e7).m1() == 0) {
                    i(0, c3242e7, interfaceC0354b);
                } else {
                    b(0, c3242e7, interfaceC0354b, zJ1);
                }
            }
        }
    }

    private static void i(int i10, C3242e c3242e, C3313b.InterfaceC0354b interfaceC0354b) {
        C3241d c3241d;
        C3241d c3241d2;
        C3241d c3241d3;
        C3241d c3241d4;
        C3241d c3241d5;
        if (c3242e.m0()) {
            return;
        }
        f32138c++;
        if (!(c3242e instanceof C3243f) && c3242e.j0()) {
            int i11 = i10 + 1;
            if (a(i11, c3242e)) {
                C3243f.M1(i11, c3242e, interfaceC0354b, new C3313b.a(), C3313b.a.f32090k);
            }
        }
        C3241d c3241dO = c3242e.o(C3241d.b.TOP);
        C3241d c3241dO2 = c3242e.o(C3241d.b.BOTTOM);
        int iE = c3241dO.e();
        int iE2 = c3241dO2.e();
        if (c3241dO.d() != null && c3241dO.n()) {
            for (C3241d c3241d6 : c3241dO.d()) {
                C3242e c3242e2 = c3241d6.f31618d;
                int i12 = i10 + 1;
                boolean zA = a(i12, c3242e2);
                if (c3242e2.j0() && zA) {
                    C3243f.M1(i12, c3242e2, interfaceC0354b, new C3313b.a(), C3313b.a.f32090k);
                }
                C3242e.b bVarQ = c3242e2.Q();
                C3242e.b bVar = C3242e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar || zA) {
                    if (!c3242e2.j0()) {
                        C3241d c3241d7 = c3242e2.f31658O;
                        if (c3241d6 == c3241d7 && c3242e2.f31660Q.f31620f == null) {
                            int iF = c3241d7.f() + iE;
                            c3242e2.C0(iF, c3242e2.x() + iF);
                            i(i12, c3242e2, interfaceC0354b);
                        } else {
                            C3241d c3241d8 = c3242e2.f31660Q;
                            if (c3241d6 == c3241d8 && c3241d8.f31620f == null) {
                                int iF2 = iE - c3241d8.f();
                                c3242e2.C0(iF2 - c3242e2.x(), iF2);
                                i(i12, c3242e2, interfaceC0354b);
                            } else if (c3241d6 == c3241d7 && (c3241d3 = c3241d8.f31620f) != null && c3241d3.n()) {
                                f(i12, interfaceC0354b, c3242e2);
                            }
                        }
                    }
                } else if (c3242e2.Q() == bVar && c3242e2.f31640C >= 0 && c3242e2.f31638B >= 0 && (c3242e2.S() == 8 || (c3242e2.f31714w == 0 && c3242e2.v() == 0.0f))) {
                    if (!c3242e2.h0() && !c3242e2.i0() && ((c3241d6 == c3242e2.f31658O && (c3241d5 = c3242e2.f31660Q.f31620f) != null && c3241d5.n()) || (c3241d6 == c3242e2.f31660Q && (c3241d4 = c3242e2.f31658O.f31620f) != null && c3241d4.n()))) {
                        if (!c3242e2.h0()) {
                            g(i12, c3242e, interfaceC0354b, c3242e2);
                        }
                    }
                }
            }
        }
        if (c3242e instanceof C3245h) {
            return;
        }
        if (c3241dO2.d() != null && c3241dO2.n()) {
            for (C3241d c3241d9 : c3241dO2.d()) {
                C3242e c3242e3 = c3241d9.f31618d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, c3242e3);
                if (c3242e3.j0() && zA2) {
                    C3243f.M1(i13, c3242e3, interfaceC0354b, new C3313b.a(), C3313b.a.f32090k);
                }
                boolean z10 = (c3241d9 == c3242e3.f31658O && (c3241d2 = c3242e3.f31660Q.f31620f) != null && c3241d2.n()) || (c3241d9 == c3242e3.f31660Q && (c3241d = c3242e3.f31658O.f31620f) != null && c3241d.n());
                C3242e.b bVarQ2 = c3242e3.Q();
                C3242e.b bVar2 = C3242e.b.MATCH_CONSTRAINT;
                if (bVarQ2 != bVar2 || zA2) {
                    if (!c3242e3.j0()) {
                        C3241d c3241d10 = c3242e3.f31658O;
                        if (c3241d9 == c3241d10 && c3242e3.f31660Q.f31620f == null) {
                            int iF3 = c3241d10.f() + iE2;
                            c3242e3.C0(iF3, c3242e3.x() + iF3);
                            i(i13, c3242e3, interfaceC0354b);
                        } else {
                            C3241d c3241d11 = c3242e3.f31660Q;
                            if (c3241d9 == c3241d11 && c3241d10.f31620f == null) {
                                int iF4 = iE2 - c3241d11.f();
                                c3242e3.C0(iF4 - c3242e3.x(), iF4);
                                i(i13, c3242e3, interfaceC0354b);
                            } else if (z10 && !c3242e3.h0()) {
                                f(i13, interfaceC0354b, c3242e3);
                            }
                        }
                    }
                } else if (c3242e3.Q() == bVar2 && c3242e3.f31640C >= 0 && c3242e3.f31638B >= 0 && (c3242e3.S() == 8 || (c3242e3.f31714w == 0 && c3242e3.v() == 0.0f))) {
                    if (!c3242e3.h0() && !c3242e3.i0() && z10 && !c3242e3.h0()) {
                        g(i13, c3242e, interfaceC0354b, c3242e3);
                    }
                }
            }
        }
        C3241d c3241dO3 = c3242e.o(C3241d.b.BASELINE);
        if (c3241dO3.d() != null && c3241dO3.n()) {
            int iE3 = c3241dO3.e();
            for (C3241d c3241d12 : c3241dO3.d()) {
                C3242e c3242e4 = c3241d12.f31618d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, c3242e4);
                if (c3242e4.j0() && zA3) {
                    C3243f.M1(i14, c3242e4, interfaceC0354b, new C3313b.a(), C3313b.a.f32090k);
                }
                if (c3242e4.Q() != C3242e.b.MATCH_CONSTRAINT || zA3) {
                    if (!c3242e4.j0() && c3241d12 == c3242e4.f31661R) {
                        c3242e4.y0(c3241d12.f() + iE3);
                        i(i14, c3242e4, interfaceC0354b);
                    }
                }
            }
        }
        c3242e.o0();
    }
}
