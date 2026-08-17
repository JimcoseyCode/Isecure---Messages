package r0;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import r0.C3242e;
import s0.C3313b;

/* JADX INFO: renamed from: r0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3243f extends m {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f31731M0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    int f31735Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    int f31736R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    int f31737S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    int f31738T0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    C3313b f31729K0 = new C3313b(this);

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public s0.e f31730L0 = new s0.e(this);

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    protected C3313b.InterfaceC0354b f31732N0 = null;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private boolean f31733O0 = false;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    protected o0.d f31734P0 = new o0.d();

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f31739U0 = 0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f31740V0 = 0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    C3240c[] f31741W0 = new C3240c[4];

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    C3240c[] f31742X0 = new C3240c[4];

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public boolean f31743Y0 = false;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f31744Z0 = false;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f31745a1 = false;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f31746b1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f31747c1 = 0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f31748d1 = 257;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f31749e1 = false;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f31750f1 = false;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private boolean f31751g1 = false;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    int f31752h1 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private WeakReference f31753i1 = null;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private WeakReference f31754j1 = null;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private WeakReference f31755k1 = null;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private WeakReference f31756l1 = null;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    HashSet f31757m1 = new HashSet();

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public C3313b.a f31758n1 = new C3313b.a();

    public static boolean M1(int i10, C3242e c3242e, C3313b.InterfaceC0354b interfaceC0354b, C3313b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0354b == null) {
            return false;
        }
        if (c3242e.S() == 8 || (c3242e instanceof C3245h) || (c3242e instanceof C3238a)) {
            aVar.f32097e = 0;
            aVar.f32098f = 0;
            return false;
        }
        aVar.f32093a = c3242e.A();
        aVar.f32094b = c3242e.Q();
        aVar.f32095c = c3242e.T();
        aVar.f32096d = c3242e.x();
        aVar.f32101i = false;
        aVar.f32102j = i11;
        C3242e.b bVar = aVar.f32093a;
        C3242e.b bVar2 = C3242e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f32094b == bVar2;
        boolean z12 = z10 && c3242e.f31675c0 > 0.0f;
        boolean z13 = z11 && c3242e.f31675c0 > 0.0f;
        if (z10 && c3242e.X(0) && c3242e.f31712v == 0 && !z12) {
            aVar.f32093a = C3242e.b.WRAP_CONTENT;
            if (z11 && c3242e.f31714w == 0) {
                aVar.f32093a = C3242e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && c3242e.X(1) && c3242e.f31714w == 0 && !z13) {
            aVar.f32094b = C3242e.b.WRAP_CONTENT;
            if (z10 && c3242e.f31712v == 0) {
                aVar.f32094b = C3242e.b.FIXED;
            }
            z11 = false;
        }
        if (c3242e.k0()) {
            aVar.f32093a = C3242e.b.FIXED;
            z10 = false;
        }
        if (c3242e.l0()) {
            aVar.f32094b = C3242e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (c3242e.f31716x[0] == 4) {
                aVar.f32093a = C3242e.b.FIXED;
            } else if (!z11) {
                C3242e.b bVar3 = aVar.f32094b;
                C3242e.b bVar4 = C3242e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f32096d;
                } else {
                    aVar.f32093a = C3242e.b.WRAP_CONTENT;
                    interfaceC0354b.a(c3242e, aVar);
                    i13 = aVar.f32098f;
                }
                aVar.f32093a = bVar4;
                aVar.f32095c = (int) (c3242e.v() * i13);
            }
        }
        if (z13) {
            if (c3242e.f31716x[1] == 4) {
                aVar.f32094b = C3242e.b.FIXED;
            } else if (!z10) {
                C3242e.b bVar5 = aVar.f32093a;
                C3242e.b bVar6 = C3242e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f32095c;
                } else {
                    aVar.f32094b = C3242e.b.WRAP_CONTENT;
                    interfaceC0354b.a(c3242e, aVar);
                    i12 = aVar.f32097e;
                }
                aVar.f32094b = bVar6;
                if (c3242e.w() == -1) {
                    aVar.f32096d = (int) (i12 / c3242e.v());
                } else {
                    aVar.f32096d = (int) (c3242e.v() * i12);
                }
            }
        }
        interfaceC0354b.a(c3242e, aVar);
        c3242e.e1(aVar.f32097e);
        c3242e.F0(aVar.f32098f);
        c3242e.E0(aVar.f32100h);
        c3242e.u0(aVar.f32099g);
        aVar.f32102j = C3313b.a.f32090k;
        return aVar.f32101i;
    }

    private void O1() {
        this.f31739U0 = 0;
        this.f31740V0 = 0;
    }

    private void r1(C3242e c3242e) {
        int i10 = this.f31739U0 + 1;
        C3240c[] c3240cArr = this.f31742X0;
        if (i10 >= c3240cArr.length) {
            this.f31742X0 = (C3240c[]) Arrays.copyOf(c3240cArr, c3240cArr.length * 2);
        }
        this.f31742X0[this.f31739U0] = new C3240c(c3242e, 0, J1());
        this.f31739U0++;
    }

    private void u1(C3241d c3241d, o0.i iVar) {
        this.f31734P0.h(iVar, this.f31734P0.q(c3241d), 0, 5);
    }

    private void v1(C3241d c3241d, o0.i iVar) {
        this.f31734P0.h(this.f31734P0.q(c3241d), iVar, 0, 5);
    }

    private void w1(C3242e c3242e) {
        int i10 = this.f31740V0 + 1;
        C3240c[] c3240cArr = this.f31741W0;
        if (i10 >= c3240cArr.length) {
            this.f31741W0 = (C3240c[]) Arrays.copyOf(c3240cArr, c3240cArr.length * 2);
        }
        this.f31741W0[this.f31740V0] = new C3240c(c3242e, 1, J1());
        this.f31740V0++;
    }

    public boolean A1(boolean z10) {
        return this.f31730L0.g(z10);
    }

    public boolean B1(boolean z10, int i10) {
        return this.f31730L0.h(z10, i10);
    }

    public C3313b.InterfaceC0354b C1() {
        return this.f31732N0;
    }

    public int D1() {
        return this.f31748d1;
    }

    public o0.d E1() {
        return this.f31734P0;
    }

    public boolean F1() {
        return false;
    }

    public void G1() {
        this.f31730L0.j();
    }

    public void H1() {
        this.f31730L0.k();
    }

    public boolean I1() {
        return this.f31751g1;
    }

    public boolean J1() {
        return this.f31733O0;
    }

    public boolean K1() {
        return this.f31750f1;
    }

    public long L1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f31735Q0 = i17;
        this.f31736R0 = i18;
        return this.f31729K0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean N1(int i10) {
        return (this.f31748d1 & i10) == i10;
    }

    public void P1(C3313b.InterfaceC0354b interfaceC0354b) {
        this.f31732N0 = interfaceC0354b;
        this.f31730L0.n(interfaceC0354b);
    }

    public void Q1(int i10) {
        this.f31748d1 = i10;
        o0.d.f30363r = N1(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
    }

    public void R1(int i10) {
        this.f31731M0 = i10;
    }

    public void S1(boolean z10) {
        this.f31733O0 = z10;
    }

    public boolean T1(o0.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zN1 = N1(64);
        k1(dVar, zN1);
        int size = this.f31826J0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C3242e c3242e = (C3242e) this.f31826J0.get(i10);
            c3242e.k1(dVar, zN1);
            if (c3242e.Z()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void U1() {
        this.f31729K0.e(this);
    }

    @Override // r0.C3242e
    public void j1(boolean z10, boolean z11) {
        super.j1(z10, z11);
        int size = this.f31826J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C3242e) this.f31826J0.get(i10)).j1(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0329 A[PHI: r13 r19
      0x0329: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0330  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // r0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        ?? r18;
        char c10;
        ?? Q12;
        ?? T12;
        ?? r19;
        int iMax;
        int iMax2;
        ?? r13;
        int i13;
        ?? r192;
        ?? r132;
        ?? r62;
        C3242e.b bVar;
        int i14 = 0;
        this.f31679e0 = 0;
        this.f31681f0 = 0;
        this.f31750f1 = false;
        this.f31751g1 = false;
        int size = this.f31826J0.size();
        int iMax3 = Math.max(0, T());
        int iMax4 = Math.max(0, x());
        C3242e.b[] bVarArr = this.f31668Y;
        boolean z11 = true;
        C3242e.b bVar2 = bVarArr[1];
        C3242e.b bVar3 = bVarArr[0];
        if (this.f31731M0 == 0 && k.b(this.f31748d1, 1)) {
            s0.h.h(this, C1());
            for (int i15 = 0; i15 < size; i15++) {
                C3242e c3242e = (C3242e) this.f31826J0.get(i15);
                if (c3242e.j0() && !(c3242e instanceof C3245h) && !(c3242e instanceof C3238a) && !(c3242e instanceof l) && !c3242e.i0()) {
                    C3242e.b bVarU = c3242e.u(0);
                    C3242e.b bVarU2 = c3242e.u(1);
                    C3242e.b bVar4 = C3242e.b.MATCH_CONSTRAINT;
                    if (bVarU != bVar4 || c3242e.f31712v == 1 || bVarU2 != bVar4 || c3242e.f31714w == 1) {
                        M1(0, c3242e, this.f31732N0, new C3313b.a(), C3313b.a.f32090k);
                    }
                }
            }
        }
        char c11 = 2;
        if (size <= 2 || !((bVar3 == (bVar = C3242e.b.WRAP_CONTENT) || bVar2 == bVar) && k.b(this.f31748d1, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) && s0.i.c(this, C1()))) {
            i10 = iMax4;
            i11 = iMax3;
            z10 = false;
        } else {
            if (bVar3 == bVar) {
                if (iMax3 >= T() || iMax3 <= 0) {
                    iMax3 = T();
                } else {
                    e1(iMax3);
                    this.f31750f1 = true;
                }
            }
            if (bVar2 == bVar) {
                if (iMax4 >= x() || iMax4 <= 0) {
                    iMax4 = x();
                } else {
                    F0(iMax4);
                    this.f31751g1 = true;
                }
            }
            i10 = iMax4;
            i11 = iMax3;
            z10 = true;
        }
        boolean z12 = N1(64) || N1(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        o0.d dVar = this.f31734P0;
        dVar.f30378h = false;
        dVar.f30379i = false;
        if (this.f31748d1 != 0 && z12) {
            dVar.f30379i = true;
        }
        ArrayList arrayList = this.f31826J0;
        C3242e.b bVarA = A();
        C3242e.b bVar5 = C3242e.b.WRAP_CONTENT;
        boolean z13 = bVarA == bVar5 || Q() == bVar5;
        O1();
        for (int i16 = 0; i16 < size; i16++) {
            C3242e c3242e2 = (C3242e) this.f31826J0.get(i16);
            if (c3242e2 instanceof m) {
                ((m) c3242e2).m1();
            }
        }
        boolean zN1 = N1(64);
        ?? r133 = z10;
        int i17 = 0;
        ?? r14 = 1;
        while (r14 != 0) {
            int i18 = i17 + 1;
            try {
                this.f31734P0.D();
                O1();
                m(this.f31734P0);
                int i19 = i14;
                while (i19 < size) {
                    i12 = i14;
                    try {
                        c10 = c11;
                    } catch (Exception e10) {
                        e = e10;
                        c10 = c11;
                    }
                    try {
                        ((C3242e) this.f31826J0.get(i19)).m(this.f31734P0);
                        i19++;
                        i14 = i12;
                        c11 = c10;
                    } catch (Exception e11) {
                        e = e11;
                        r18 = z11;
                        Q12 = r14;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                        if (Q12 == 0) {
                        }
                        if (z13) {
                            r19 = T12 == true ? 1 : 0;
                        }
                        iMax = Math.max(this.f31693l0, T());
                        ?? r134 = r133;
                        ?? r193 = r19;
                        if (iMax > T()) {
                        }
                        iMax2 = Math.max(this.f31695m0, x());
                        r13 = r134;
                        ?? r194 = r193;
                        if (iMax2 > x()) {
                        }
                        if (r13 != 0) {
                        }
                        if (i18 <= i13) {
                        }
                        i17 = i18;
                        i14 = i12;
                        c11 = c10;
                        z11 = true;
                        r133 = r132;
                        r14 = ;
                    }
                }
                i12 = i14;
                c10 = c11;
                Q12 = q1(this.f31734P0);
                WeakReference weakReference = this.f31753i1;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z11;
                } else {
                    r18 = z11;
                    try {
                        v1((C3241d) this.f31753i1.get(), this.f31734P0.q(this.f31658O));
                        this.f31753i1 = null;
                        r18 = r18;
                    } catch (Exception e12) {
                        e = e12;
                        Q12 = Q12;
                        r18 = r18;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference weakReference2 = this.f31755k1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    u1((C3241d) this.f31755k1.get(), this.f31734P0.q(this.f31660Q));
                    this.f31755k1 = null;
                }
                WeakReference weakReference3 = this.f31754j1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    v1((C3241d) this.f31754j1.get(), this.f31734P0.q(this.f31657N));
                    this.f31754j1 = null;
                }
                WeakReference weakReference4 = this.f31756l1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    u1((C3241d) this.f31756l1.get(), this.f31734P0.q(this.f31659P));
                    this.f31756l1 = null;
                }
                if (Q12 != 0) {
                    this.f31734P0.z();
                }
            } catch (Exception e13) {
                e = e13;
                i12 = i14;
                r18 = z11;
                c10 = c11;
                Q12 = r14;
            }
            if (Q12 == 0) {
                T12 = T1(this.f31734P0, k.f31812a);
            } else {
                k1(this.f31734P0, zN1);
                for (int i20 = i12; i20 < size; i20++) {
                    ((C3242e) this.f31826J0.get(i20)).k1(this.f31734P0, zN1);
                }
                T12 = i12;
            }
            if (z13 || i18 >= 8 || !k.f31812a[c10]) {
                r19 = T12 == true ? 1 : 0;
            } else {
                int i21 = i12;
                int iMax5 = i21;
                int iMax6 = iMax5;
                ?? r02 = T12;
                while (i21 < size) {
                    C3242e c3242e3 = (C3242e) this.f31826J0.get(i21);
                    iMax5 = Math.max(iMax5, c3242e3.f31679e0 + c3242e3.T());
                    iMax6 = Math.max(iMax6, c3242e3.f31681f0 + c3242e3.x());
                    i21++;
                    r02 = r02 == true ? 1 : 0;
                }
                ?? r195 = r02;
                int iMax7 = Math.max(this.f31693l0, iMax5);
                int iMax8 = Math.max(this.f31695m0, iMax6);
                C3242e.b bVar6 = C3242e.b.WRAP_CONTENT;
                r133 = r133;
                r19 = r195;
                if (bVar3 == bVar6) {
                    r133 = r133;
                    r19 = r195;
                    if (T() < iMax7) {
                        e1(iMax7);
                        this.f31668Y[i12] = bVar6;
                        ?? r135 = r18;
                        r19 = r135 == true ? 1 : 0;
                        r133 = r135;
                    }
                }
                if (bVar2 == bVar6 && x() < iMax8) {
                    F0(iMax8);
                    this.f31668Y[r18] = bVar6;
                    r133 = r18;
                    r19 = r133 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f31693l0, T());
            ?? r1342 = r133;
            ?? r1932 = r19;
            if (iMax > T()) {
                e1(iMax);
                this.f31668Y[i12] = C3242e.b.FIXED;
                ?? r136 = r18;
                r1932 = r136 == true ? 1 : 0;
                r1342 = r136;
            }
            iMax2 = Math.max(this.f31695m0, x());
            r13 = r1342;
            ?? r1942 = r1932;
            if (iMax2 > x()) {
                F0(iMax2);
                this.f31668Y[r18] = C3242e.b.FIXED;
                ?? r137 = r18;
                r1942 = r137 == true ? 1 : 0;
                r13 = r137;
            }
            if (r13 != 0) {
                C3242e.b bVar7 = this.f31668Y[i12];
                C3242e.b bVar8 = C3242e.b.WRAP_CONTENT;
                if (bVar7 != bVar8 || i11 <= 0 || T() <= i11) {
                    r62 = r18;
                    r13 = r13;
                    r1942 = r1942;
                } else {
                    ?? r63 = r18;
                    this.f31750f1 = r63;
                    this.f31668Y[i12] = C3242e.b.FIXED;
                    e1(i11);
                    boolean z14 = r63 == true ? 1 : 0;
                    r1942 = z14 ? 1 : 0;
                    r62 = r63;
                    r13 = z14;
                }
                if (this.f31668Y[r62] != bVar8 || i10 <= 0 || x() <= i10) {
                    i13 = 8;
                    r132 = r13;
                    r192 = r1942;
                } else {
                    this.f31751g1 = r62;
                    this.f31668Y[r62] = C3242e.b.FIXED;
                    F0(i10);
                    i13 = 8;
                    r132 = 1;
                    r192 = 1;
                }
            }
            ?? r142 = i18 <= i13 ? i12 : r192;
            i17 = i18;
            i14 = i12;
            c11 = c10;
            z11 = true;
            r133 = r132;
            r14 = r142;
        }
        int i22 = i14;
        this.f31826J0 = arrayList;
        if (r133 != 0) {
            C3242e.b[] bVarArr2 = this.f31668Y;
            bVarArr2[i22] = bVar3;
            bVarArr2[1] = bVar2;
        }
        t0(this.f31734P0.v());
    }

    void p1(C3242e c3242e, int i10) {
        if (i10 == 0) {
            r1(c3242e);
        } else if (i10 == 1) {
            w1(c3242e);
        }
    }

    @Override // r0.m, r0.C3242e
    public void q0() {
        this.f31734P0.D();
        this.f31735Q0 = 0;
        this.f31737S0 = 0;
        this.f31736R0 = 0;
        this.f31738T0 = 0;
        this.f31749e1 = false;
        super.q0();
    }

    public boolean q1(o0.d dVar) {
        C3243f c3243f;
        o0.d dVar2;
        boolean zN1 = N1(64);
        g(dVar, zN1);
        int size = this.f31826J0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C3242e c3242e = (C3242e) this.f31826J0.get(i10);
            c3242e.M0(0, false);
            c3242e.M0(1, false);
            if (c3242e instanceof C3238a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                C3242e c3242e2 = (C3242e) this.f31826J0.get(i11);
                if (c3242e2 instanceof C3238a) {
                    ((C3238a) c3242e2).s1();
                }
            }
        }
        this.f31757m1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            C3242e c3242e3 = (C3242e) this.f31826J0.get(i12);
            if (c3242e3.f()) {
                if (c3242e3 instanceof l) {
                    this.f31757m1.add(c3242e3);
                } else {
                    c3242e3.g(dVar, zN1);
                }
            }
        }
        while (this.f31757m1.size() > 0) {
            int size2 = this.f31757m1.size();
            Iterator it = this.f31757m1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) ((C3242e) it.next());
                if (lVar.p1(this.f31757m1)) {
                    lVar.g(dVar, zN1);
                    this.f31757m1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f31757m1.size()) {
                Iterator it2 = this.f31757m1.iterator();
                while (it2.hasNext()) {
                    ((C3242e) it2.next()).g(dVar, zN1);
                }
                this.f31757m1.clear();
            }
        }
        if (o0.d.f30363r) {
            HashSet<C3242e> hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                C3242e c3242e4 = (C3242e) this.f31826J0.get(i13);
                if (!c3242e4.f()) {
                    hashSet.add(c3242e4);
                }
            }
            c3243f = this;
            dVar2 = dVar;
            c3243f.e(this, dVar2, hashSet, A() == C3242e.b.WRAP_CONTENT ? 0 : 1, false);
            for (C3242e c3242e5 : hashSet) {
                k.a(this, dVar2, c3242e5);
                c3242e5.g(dVar2, zN1);
            }
        } else {
            c3243f = this;
            dVar2 = dVar;
            for (int i14 = 0; i14 < size; i14++) {
                C3242e c3242e6 = (C3242e) c3243f.f31826J0.get(i14);
                if (c3242e6 instanceof C3243f) {
                    C3242e.b[] bVarArr = c3242e6.f31668Y;
                    C3242e.b bVar = bVarArr[0];
                    C3242e.b bVar2 = bVarArr[1];
                    C3242e.b bVar3 = C3242e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c3242e6.J0(C3242e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c3242e6.a1(C3242e.b.FIXED);
                    }
                    c3242e6.g(dVar2, zN1);
                    if (bVar == bVar3) {
                        c3242e6.J0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c3242e6.a1(bVar2);
                    }
                } else {
                    k.a(this, dVar2, c3242e6);
                    if (!c3242e6.f()) {
                        c3242e6.g(dVar2, zN1);
                    }
                }
            }
        }
        if (c3243f.f31739U0 > 0) {
            AbstractC3239b.b(this, dVar2, null, 0);
        }
        if (c3243f.f31740V0 > 0) {
            AbstractC3239b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public void s1(C3241d c3241d) {
        WeakReference weakReference = this.f31756l1;
        if (weakReference == null || weakReference.get() == null || c3241d.e() > ((C3241d) this.f31756l1.get()).e()) {
            this.f31756l1 = new WeakReference(c3241d);
        }
    }

    public void t1(C3241d c3241d) {
        WeakReference weakReference = this.f31754j1;
        if (weakReference == null || weakReference.get() == null || c3241d.e() > ((C3241d) this.f31754j1.get()).e()) {
            this.f31754j1 = new WeakReference(c3241d);
        }
    }

    void x1(C3241d c3241d) {
        WeakReference weakReference = this.f31755k1;
        if (weakReference == null || weakReference.get() == null || c3241d.e() > ((C3241d) this.f31755k1.get()).e()) {
            this.f31755k1 = new WeakReference(c3241d);
        }
    }

    void y1(C3241d c3241d) {
        WeakReference weakReference = this.f31753i1;
        if (weakReference == null || weakReference.get() == null || c3241d.e() > ((C3241d) this.f31753i1.get()).e()) {
            this.f31753i1 = new WeakReference(c3241d);
        }
    }

    public boolean z1(boolean z10) {
        return this.f31730L0.f(z10);
    }
}
