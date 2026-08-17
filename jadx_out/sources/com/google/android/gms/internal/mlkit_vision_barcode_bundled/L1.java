package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W1 f22284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22285b = 0;

    static {
        int i10 = C2216y1.f22442d;
        f22284a = new Y1();
    }

    public static void A(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.E(i10, list, z10);
    }

    public static void B(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.m(i10, list, z10);
    }

    public static void C(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.z(i10, list, z10);
    }

    public static void D(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.d(i10, list, z10);
    }

    public static void E(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.l(i10, list, z10);
    }

    public static void a(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.r(i10, list, z10);
    }

    public static void b(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.C(i10, list, z10);
    }

    public static void c(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.j(i10, list, z10);
    }

    public static void d(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.v(i10, list, z10);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Q0)) {
            int iB = 0;
            while (i10 < size) {
                iB += AbstractC2207w0.b(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iB;
        }
        Q0 q02 = (Q0) list;
        int iB2 = 0;
        while (i10 < size) {
            iB2 += AbstractC2207w0.b(q02.o(i10));
            i10++;
        }
        return iB2;
    }

    static int g(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2207w0.a(i10 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2207w0.a(i10 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Q0)) {
            int iB = 0;
            while (i10 < size) {
                iB += AbstractC2207w0.b(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iB;
        }
        Q0 q02 = (Q0) list;
        int iB2 = 0;
        while (i10 < size) {
            iB2 += AbstractC2207w0.b(q02.o(i10));
            i10++;
        }
        return iB2;
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iB += AbstractC2207w0.b(((Long) list.get(i10)).longValue());
        }
        return iB;
    }

    static int m(int i10, Object obj, J1 j12) {
        return AbstractC2207w0.a(i10 << 3) + AbstractC2207w0.B((InterfaceC2186r1) obj, j12);
    }

    static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Q0)) {
            int iA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iA += AbstractC2207w0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iA;
        }
        Q0 q02 = (Q0) list;
        int iA2 = 0;
        while (i10 < size) {
            int iO = q02.o(i10);
            iA2 += AbstractC2207w0.a((iO >> 31) ^ (iO + iO));
            i10++;
        }
        return iA2;
    }

    static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iB += AbstractC2207w0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iB;
    }

    static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Q0)) {
            int iA = 0;
            while (i10 < size) {
                iA += AbstractC2207w0.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        Q0 q02 = (Q0) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += AbstractC2207w0.a(q02.o(i10));
            i10++;
        }
        return iA2;
    }

    static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iB += AbstractC2207w0.b(((Long) list.get(i10)).longValue());
        }
        return iB;
    }

    public static W1 r() {
        return f22284a;
    }

    static Object s(Object obj, int i10, int i11, Object obj2, W1 w12) {
        Object obj3 = obj2;
        if (obj2 == null) {
            P0 p02 = (P0) obj;
            X1 x12 = p02.zzc;
            obj3 = x12;
            if (x12 == X1.c()) {
                X1 x1F = X1.f();
                p02.zzc = x1F;
                obj3 = x1F;
            }
        }
        ((X1) obj3).j(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    static void t(B0 b02, Object obj, Object obj2) {
        F0 f02 = ((M0) obj2).zzb;
        if (f02.f21669a.isEmpty()) {
            return;
        }
        ((M0) obj).F().h(f02);
    }

    static void u(W1 w12, Object obj, Object obj2) {
        P0 p02 = (P0) obj;
        X1 x1E = p02.zzc;
        X1 x12 = ((P0) obj2).zzc;
        if (!X1.c().equals(x12)) {
            if (X1.c().equals(x1E)) {
                x1E = X1.e(x1E, x12);
            } else {
                x1E.d(x12);
            }
        }
        p02.zzc = x1E;
    }

    public static void v(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.i(i10, list, z10);
    }

    public static void w(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.D(i10, list, z10);
    }

    public static void x(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.p(i10, list, z10);
    }

    public static void y(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.k(i10, list, z10);
    }

    public static void z(int i10, List list, InterfaceC2163m2 interfaceC2163m2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2163m2.w(i10, list, z10);
    }
}
