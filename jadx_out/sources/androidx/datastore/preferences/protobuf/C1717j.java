package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1717j implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1716i f16904a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16905a;

        static {
            int[] iArr = new int[k0.b.values().length];
            f16905a = iArr;
            try {
                iArr[k0.b.f16919p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16905a[k0.b.f16918o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16905a[k0.b.f16916m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16905a[k0.b.f16926w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16905a[k0.b.f16928y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16905a[k0.b.f16924u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16905a[k0.b.f16917n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16905a[k0.b.f16914k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16905a[k0.b.f16927x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16905a[k0.b.f16929z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16905a[k0.b.f16915l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16905a[k0.b.f16920q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C1717j(AbstractC1716i abstractC1716i) {
        AbstractC1716i abstractC1716i2 = (AbstractC1716i) AbstractC1727u.b(abstractC1716i, "output");
        this.f16904a = abstractC1716i2;
        abstractC1716i2.f16873a = this;
    }

    public static C1717j N(AbstractC1716i abstractC1716i) {
        C1717j c1717j = abstractC1716i.f16873a;
        return c1717j != null ? c1717j : new C1717j(abstractC1716i);
    }

    private void O(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.a0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD += AbstractC1716i.d(((Boolean) list.get(i12)).booleanValue());
        }
        this.f16904a.O0(iD);
        while (i11 < list.size()) {
            this.f16904a.b0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    private void P(int i10, boolean z10, Object obj, C.a aVar) {
        this.f16904a.M0(i10, 2);
        this.f16904a.O0(C.b(aVar, Boolean.valueOf(z10), obj));
        C.e(this.f16904a, aVar, Boolean.valueOf(z10), obj);
    }

    private void Q(int i10, C.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f16904a.M0(i10, 2);
            this.f16904a.O0(C.b(aVar, Integer.valueOf(i13), obj));
            C.e(this.f16904a, aVar, Integer.valueOf(i13), obj);
        }
    }

    private void R(int i10, C.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f16904a.M0(i10, 2);
            this.f16904a.O0(C.b(aVar, Long.valueOf(j10), obj));
            C.e(this.f16904a, aVar, Long.valueOf(j10), obj);
        }
    }

    private void S(int i10, C.a aVar, Map map) {
        switch (a.f16905a[aVar.f16749a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    P(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    P(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                Q(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                R(i10, aVar, map);
                return;
            case 12:
                T(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f16749a);
        }
    }

    private void T(int i10, C.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f16904a.M0(i10, 2);
            this.f16904a.O0(C.b(aVar, str, obj));
            C.e(this.f16904a, aVar, str, obj);
        }
    }

    private void U(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.g0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1716i.i(((Double) list.get(i13)).doubleValue());
        }
        this.f16904a.O0(i12);
        while (i11 < list.size()) {
            this.f16904a.h0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    private void V(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.i0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += AbstractC1716i.k(((Integer) list.get(i12)).intValue());
        }
        this.f16904a.O0(iK);
        while (i11 < list.size()) {
            this.f16904a.j0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void W(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.k0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += AbstractC1716i.m(((Integer) list.get(i12)).intValue());
        }
        this.f16904a.O0(iM);
        while (i11 < list.size()) {
            this.f16904a.l0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void X(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.m0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += AbstractC1716i.o(((Long) list.get(i12)).longValue());
        }
        this.f16904a.O0(iO);
        while (i11 < list.size()) {
            this.f16904a.n0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void Y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.o0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += AbstractC1716i.q(((Float) list.get(i12)).floatValue());
        }
        this.f16904a.O0(iQ);
        while (i11 < list.size()) {
            this.f16904a.p0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    private void Z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += AbstractC1716i.v(((Integer) list.get(i12)).intValue());
        }
        this.f16904a.O0(iV);
        while (i11 < list.size()) {
            this.f16904a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void a0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += AbstractC1716i.x(((Long) list.get(i12)).longValue());
        }
        this.f16904a.O0(iX);
        while (i11 < list.size()) {
            this.f16904a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void b0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.C0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iF = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF += AbstractC1716i.F(((Integer) list.get(i12)).intValue());
        }
        this.f16904a.O0(iF);
        while (i11 < list.size()) {
            this.f16904a.D0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void c0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.E0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iH = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iH += AbstractC1716i.H(((Long) list.get(i12)).longValue());
        }
        this.f16904a.O0(iH);
        while (i11 < list.size()) {
            this.f16904a.F0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void e0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.I0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += AbstractC1716i.L(((Long) list.get(i12)).longValue());
        }
        this.f16904a.O0(iL);
        while (i11 < list.size()) {
            this.f16904a.J0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void g0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += AbstractC1716i.S(((Long) list.get(i12)).longValue());
        }
        this.f16904a.O0(iS);
        while (i11 < list.size()) {
            this.f16904a.Q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void A(int i10, List list, boolean z10) {
        f0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void B(int i10, List list, boolean z10) {
        e0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void C(int i10, long j10) {
        this.f16904a.I0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void D(int i10) {
        this.f16904a.M0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void E(int i10, List list, boolean z10) {
        d0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void F(int i10, int i11) {
        this.f16904a.i0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void G(int i10, List list, boolean z10) {
        a0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void H(int i10, List list, boolean z10) {
        V(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void I(int i10, List list, boolean z10) {
        U(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void J(int i10, C.a aVar, Map map) {
        if (this.f16904a.X()) {
            S(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f16904a.M0(i10, 2);
            this.f16904a.O0(C.b(aVar, entry.getKey(), entry.getValue()));
            C.e(this.f16904a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void K(int i10, int i11) {
        this.f16904a.G0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void L(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f16904a.e0(i10, (AbstractC1713f) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void M(int i10, Object obj, Y y10) {
        this.f16904a.r0(i10, (J) obj, y10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void a(int i10, List list, boolean z10) {
        Y(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void b(int i10, int i11) {
        this.f16904a.N0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC1713f) {
            this.f16904a.B0(i10, (AbstractC1713f) obj);
        } else {
            this.f16904a.A0(i10, (J) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void d(int i10, int i11) {
        this.f16904a.k0(i10, i11);
    }

    public void d0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.G0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += AbstractC1716i.J(((Integer) list.get(i12)).intValue());
        }
        this.f16904a.O0(iJ);
        while (i11 < list.size()) {
            this.f16904a.H0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void e(int i10, List list, boolean z10) {
        c0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void f(int i10, List list, boolean z10) {
        g0(i10, list, z10);
    }

    public void f0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f16904a.N0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f16904a.M0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += AbstractC1716i.Q(((Integer) list.get(i12)).intValue());
        }
        this.f16904a.O0(iQ);
        while (i11 < list.size()) {
            this.f16904a.O0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void g(int i10, long j10) {
        this.f16904a.m0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public l0.a h() {
        return l0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void i(int i10, List list, Y y10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            y(i10, list.get(i11), y10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void j(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f16904a.K0(i10, (String) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void k(int i10, List list, Y y10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), y10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void l(int i10, String str) {
        this.f16904a.K0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void m(int i10, long j10) {
        this.f16904a.P0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void n(int i10, List list, boolean z10) {
        Z(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void o(int i10, long j10) {
        this.f16904a.w0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void p(int i10, boolean z10) {
        this.f16904a.a0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void q(int i10, int i11) {
        this.f16904a.C0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void r(int i10) {
        this.f16904a.M0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void s(int i10, int i11) {
        this.f16904a.u0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void t(int i10, List list, boolean z10) {
        X(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void u(int i10, List list, boolean z10) {
        b0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void v(int i10, AbstractC1713f abstractC1713f) {
        this.f16904a.e0(i10, abstractC1713f);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void w(int i10, long j10) {
        this.f16904a.E0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeDouble(int i10, double d10) {
        this.f16904a.g0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFloat(int i10, float f10) {
        this.f16904a.o0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void x(int i10, List list, boolean z10) {
        W(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void y(int i10, Object obj, Y y10) {
        this.f16904a.y0(i10, (J) obj, y10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void z(int i10, List list, boolean z10) {
        O(i10, list, z10);
    }
}
