package s0;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import r0.C3238a;
import r0.C3241d;
import r0.C3242e;
import r0.C3243f;
import r0.C3245h;
import r0.InterfaceC3246i;

/* JADX INFO: renamed from: s0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3313b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f32087a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f32088b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3243f f32089c;

    /* JADX INFO: renamed from: s0.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f32090k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f32091l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f32092m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C3242e.b f32093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C3242e.b f32094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f32098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f32099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f32100h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f32101i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f32102j;
    }

    /* JADX INFO: renamed from: s0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0354b {
        void a(C3242e c3242e, a aVar);

        void b();
    }

    public C3313b(C3243f c3243f) {
        this.f32089c = c3243f;
    }

    private boolean a(InterfaceC0354b interfaceC0354b, C3242e c3242e, int i10) {
        this.f32088b.f32093a = c3242e.A();
        this.f32088b.f32094b = c3242e.Q();
        this.f32088b.f32095c = c3242e.T();
        this.f32088b.f32096d = c3242e.x();
        a aVar = this.f32088b;
        aVar.f32101i = false;
        aVar.f32102j = i10;
        C3242e.b bVar = aVar.f32093a;
        C3242e.b bVar2 = C3242e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f32094b == bVar2;
        boolean z12 = z10 && c3242e.f31675c0 > 0.0f;
        boolean z13 = z11 && c3242e.f31675c0 > 0.0f;
        if (z12 && c3242e.f31716x[0] == 4) {
            aVar.f32093a = C3242e.b.FIXED;
        }
        if (z13 && c3242e.f31716x[1] == 4) {
            aVar.f32094b = C3242e.b.FIXED;
        }
        interfaceC0354b.a(c3242e, aVar);
        c3242e.e1(this.f32088b.f32097e);
        c3242e.F0(this.f32088b.f32098f);
        c3242e.E0(this.f32088b.f32100h);
        c3242e.u0(this.f32088b.f32099g);
        a aVar2 = this.f32088b;
        aVar2.f32102j = a.f32090k;
        return aVar2.f32101i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(C3243f c3243f) {
        l lVar;
        n nVar;
        int size = c3243f.f31826J0.size();
        boolean zN1 = c3243f.N1(64);
        InterfaceC0354b interfaceC0354bC1 = c3243f.C1();
        for (int i10 = 0; i10 < size; i10++) {
            C3242e c3242e = (C3242e) c3243f.f31826J0.get(i10);
            if (!(c3242e instanceof C3245h) && !(c3242e instanceof C3238a) && !c3242e.i0() && (!zN1 || (lVar = c3242e.f31678e) == null || (nVar = c3242e.f31680f) == null || !lVar.f32171e.f32123j || !nVar.f32171e.f32123j)) {
                C3242e.b bVarU = c3242e.u(0);
                boolean z10 = true;
                C3242e.b bVarU2 = c3242e.u(1);
                C3242e.b bVar = C3242e.b.MATCH_CONSTRAINT;
                boolean z11 = bVarU == bVar && c3242e.f31712v != 1 && bVarU2 == bVar && c3242e.f31714w != 1;
                if (z11 || !c3243f.N1(1) || (c3242e instanceof r0.l)) {
                    z10 = z11;
                    if (z10) {
                        a(interfaceC0354bC1, c3242e, a.f32090k);
                    }
                } else {
                    if (bVarU == bVar && c3242e.f31712v == 0 && bVarU2 != bVar && !c3242e.f0()) {
                        z11 = true;
                    }
                    if (bVarU2 == bVar && c3242e.f31714w == 0 && bVarU != bVar && !c3242e.f0()) {
                        z11 = true;
                    }
                    if ((bVarU != bVar && bVarU2 != bVar) || c3242e.f31675c0 <= 0.0f) {
                    }
                    if (z10) {
                    }
                }
            }
        }
        interfaceC0354bC1.b();
    }

    private void c(C3243f c3243f, String str, int i10, int i11, int i12) {
        int I9 = c3243f.I();
        int iH = c3243f.H();
        c3243f.U0(0);
        c3243f.T0(0);
        c3243f.e1(i11);
        c3243f.F0(i12);
        c3243f.U0(I9);
        c3243f.T0(iH);
        this.f32089c.R1(i10);
        this.f32089c.m1();
    }

    public long d(C3243f c3243f, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zB1;
        int i19;
        int i20;
        int i21;
        C3243f c3243f2;
        long j10;
        int i22;
        int i23;
        boolean z10;
        C3313b c3313b = this;
        InterfaceC0354b interfaceC0354bC1 = c3243f.C1();
        int size = c3243f.f31826J0.size();
        int iT = c3243f.T();
        int iX = c3243f.x();
        boolean zB = r0.k.b(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        boolean z11 = zB || r0.k.b(i10, 64);
        if (z11) {
            for (int i24 = 0; i24 < size; i24++) {
                C3242e c3242e = (C3242e) c3243f.f31826J0.get(i24);
                C3242e.b bVarA = c3242e.A();
                C3242e.b bVar = C3242e.b.MATCH_CONSTRAINT;
                boolean z12 = (bVarA == bVar) && (c3242e.Q() == bVar) && c3242e.v() > 0.0f;
                if ((c3242e.f0() && z12) || ((c3242e.h0() && z12) || (c3242e instanceof r0.l) || c3242e.f0() || c3242e.h0())) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            boolean z13 = o0.d.f30363r;
        }
        boolean z14 = z11 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i25 = 2;
        if (z14) {
            int iMin = Math.min(c3243f.G(), i14);
            int iMin2 = Math.min(c3243f.F(), i16);
            if (i13 == 1073741824 && c3243f.T() != iMin) {
                c3243f.e1(iMin);
                c3243f.G1();
            }
            if (i15 == 1073741824 && c3243f.x() != iMin2) {
                c3243f.F0(iMin2);
                c3243f.G1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zB1 = c3243f.z1(zB);
                i19 = 2;
            } else {
                boolean zA1 = c3243f.A1(zB);
                if (i13 == 1073741824) {
                    zA1 &= c3243f.B1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zB1 = c3243f.B1(zB, 1) & zA1;
                    i19++;
                } else {
                    zB1 = zA1;
                }
            }
            if (zB1) {
                c3243f.j1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zB1 = false;
            i19 = 0;
        }
        long j11 = 0;
        if (zB1 && i19 == 2) {
            return 0L;
        }
        int iD1 = c3243f.D1();
        if (size > 0) {
            b(c3243f);
        }
        e(c3243f);
        int size2 = c3313b.f32087a.size();
        if (size > 0) {
            c3313b.c(c3243f, "First pass", 0, iT, iX);
            i20 = iT;
            i21 = iX;
        } else {
            i20 = iT;
            i21 = iX;
        }
        if (size2 > 0) {
            C3242e.b bVarA2 = c3243f.A();
            C3242e.b bVar2 = C3242e.b.WRAP_CONTENT;
            boolean z15 = bVarA2 == bVar2;
            boolean z16 = c3243f.Q() == bVar2;
            int iMax = Math.max(c3243f.T(), c3313b.f32089c.I());
            int iMax2 = Math.max(c3243f.x(), c3313b.f32089c.H());
            int i26 = 0;
            boolean zZ1 = false;
            while (i26 < size2) {
                long j12 = j11;
                C3242e c3242e2 = (C3242e) c3313b.f32087a.get(i26);
                if (c3242e2 instanceof r0.l) {
                    int iT2 = c3242e2.T();
                    int iX2 = c3242e2.x();
                    boolean zA = zZ1 | c3313b.a(interfaceC0354bC1, c3242e2, a.f32091l);
                    i23 = i20;
                    int iT3 = c3242e2.T();
                    z10 = z14;
                    int iX3 = c3242e2.x();
                    if (iT3 != iT2) {
                        c3242e2.e1(iT3);
                        if (z15 && c3242e2.M() > iMax) {
                            iMax = Math.max(iMax, c3242e2.M() + c3242e2.o(C3241d.b.RIGHT).f());
                        }
                        zA = true;
                    }
                    if (iX3 != iX2) {
                        c3242e2.F0(iX3);
                        if (z16 && c3242e2.r() > iMax2) {
                            iMax2 = Math.max(iMax2, c3242e2.r() + c3242e2.o(C3241d.b.BOTTOM).f());
                        }
                        zA = true;
                    }
                    zZ1 = zA | ((r0.l) c3242e2).z1();
                } else {
                    i23 = i20;
                    z10 = z14;
                }
                i26++;
                i20 = i23;
                j11 = j12;
                z14 = z10;
                i25 = 2;
            }
            int i27 = i20;
            boolean z17 = z14;
            j10 = j11;
            int i28 = i25;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    C3242e c3242e3 = (C3242e) c3313b.f32087a.get(i30);
                    if (((c3242e3 instanceof InterfaceC3246i) && !(c3242e3 instanceof r0.l)) || (c3242e3 instanceof C3245h) || c3242e3.S() == 8 || ((z17 && c3242e3.f31678e.f32171e.f32123j && c3242e3.f31680f.f32171e.f32123j) || (c3242e3 instanceof r0.l))) {
                        i22 = i29;
                    } else {
                        int iT4 = c3242e3.T();
                        int iX4 = c3242e3.x();
                        int iP = c3242e3.p();
                        int i31 = a.f32091l;
                        if (i29 == 1) {
                            i31 = a.f32092m;
                        }
                        boolean zA2 = zZ1 | c3313b.a(interfaceC0354bC1, c3242e3, i31);
                        int iT5 = c3242e3.T();
                        i22 = i29;
                        int iX5 = c3242e3.x();
                        if (iT5 != iT4) {
                            c3242e3.e1(iT5);
                            if (z15 && c3242e3.M() > iMax) {
                                iMax = Math.max(iMax, c3242e3.M() + c3242e3.o(C3241d.b.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iX5 != iX4) {
                            c3242e3.F0(iX5);
                            if (z16 && c3242e3.r() > iMax2) {
                                iMax2 = Math.max(iMax2, c3242e3.r() + c3242e3.o(C3241d.b.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zZ1 = (!c3242e3.W() || iP == c3242e3.p()) ? zA2 : true;
                    }
                    i30++;
                    c3313b = this;
                    i29 = i22;
                }
                int i32 = i29;
                if (!zZ1) {
                    break;
                }
                i29 = i32 + 1;
                c(c3243f, "intermediate pass", i29, i27, i21);
                i28 = 2;
                zZ1 = false;
                c3313b = this;
            }
            c3243f2 = c3243f;
        } else {
            c3243f2 = c3243f;
            j10 = 0;
        }
        c3243f2.Q1(iD1);
        return j10;
    }

    public void e(C3243f c3243f) {
        this.f32087a.clear();
        int size = c3243f.f31826J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3242e c3242e = (C3242e) c3243f.f31826J0.get(i10);
            C3242e.b bVarA = c3242e.A();
            C3242e.b bVar = C3242e.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || c3242e.Q() == bVar) {
                this.f32087a.add(c3242e);
            }
        }
        c3243f.G1();
    }
}
