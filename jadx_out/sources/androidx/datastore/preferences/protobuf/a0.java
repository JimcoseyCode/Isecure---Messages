package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1727u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f16798a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f0 f16799b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f0 f16800c = new h0();

    private static Class A() {
        if (U.f16788d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static f0 B() {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (f0) clsC.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        if (U.f16788d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC1721n abstractC1721n, Object obj, Object obj2) {
        C1724q c1724qC = abstractC1721n.c(obj2);
        if (c1724qC.j()) {
            return;
        }
        abstractC1721n.d(obj).p(c1724qC);
    }

    static void E(E e10, Object obj, Object obj2, long j10) {
        i0.O(obj, j10, e10.a(i0.z(obj, j10), i0.z(obj2, j10)));
    }

    static void F(f0 f0Var, Object obj, Object obj2) {
        f0Var.p(obj, f0Var.k(f0Var.g(obj), f0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC1726t.class.isAssignableFrom(cls) && !U.f16788d && (cls2 = f16798a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static Object I(Object obj, int i10, int i11, Object obj2, f0 f0Var) {
        if (obj2 == null) {
            obj2 = f0Var.f(obj);
        }
        f0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static f0 J() {
        return f16799b;
    }

    public static f0 K() {
        return f16800c;
    }

    public static void L(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.z(i10, list, z10);
    }

    public static void M(int i10, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.L(i10, list);
    }

    public static void N(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.I(i10, list, z10);
    }

    public static void O(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.H(i10, list, z10);
    }

    public static void P(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.x(i10, list, z10);
    }

    public static void Q(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.t(i10, list, z10);
    }

    public static void R(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.a(i10, list, z10);
    }

    public static void S(int i10, List list, l0 l0Var, Y y10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.k(i10, list, y10);
    }

    public static void T(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.n(i10, list, z10);
    }

    public static void U(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.G(i10, list, z10);
    }

    public static void V(int i10, List list, l0 l0Var, Y y10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.i(i10, list, y10);
    }

    public static void W(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.u(i10, list, z10);
    }

    public static void X(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.e(i10, list, z10);
    }

    public static void Y(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.E(i10, list, z10);
    }

    public static void Z(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.B(i10, list, z10);
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(size) : size * AbstractC1716i.c(i10, true);
    }

    public static void a0(int i10, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.j(i10, list);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.A(i10, list, z10);
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = size * AbstractC1716i.O(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iO += AbstractC1716i.g((AbstractC1713f) list.get(i11));
        }
        return iO;
    }

    public static void c0(int i10, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.f(i10, list, z10);
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(iE) : iE + (size * AbstractC1716i.O(i10));
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iK += AbstractC1716i.k(((Integer) list.get(i10)).intValue());
        }
        return iK;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(size * 4) : size * AbstractC1716i.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(size * 8) : size * AbstractC1716i.n(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, Y y10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iR += AbstractC1716i.r(i10, (J) list.get(i11), y10);
        }
        return iR;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(iL) : iL + (size * AbstractC1716i.O(i10));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += AbstractC1716i.v(((Integer) list.get(i10)).intValue());
        }
        return iV;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(iN) : iN + (list.size() * AbstractC1716i.O(i10));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += AbstractC1716i.x(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    static int o(int i10, Object obj, Y y10) {
        return AbstractC1716i.z(i10, (J) obj, y10);
    }

    static int p(int i10, List list, Y y10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC1716i.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iO += AbstractC1716i.B((J) list.get(i11), y10);
        }
        return iO;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(iR) : iR + (size * AbstractC1716i.O(i10));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iJ += AbstractC1716i.J(((Integer) list.get(i10)).intValue());
        }
        return iJ;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(iT) : iT + (size * AbstractC1716i.O(i10));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iL += AbstractC1716i.L(((Long) list.get(i10)).longValue());
        }
        return iL;
    }

    static int u(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC1716i.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iO += obj instanceof AbstractC1713f ? AbstractC1716i.g((AbstractC1713f) obj) : AbstractC1716i.N((String) obj);
        }
        return iO;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(iW) : iW + (size * AbstractC1716i.O(i10));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iQ += AbstractC1716i.Q(((Integer) list.get(i10)).intValue());
        }
        return iQ;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? AbstractC1716i.O(i10) + AbstractC1716i.y(iY) : iY + (size * AbstractC1716i.O(i10));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iS += AbstractC1716i.S(((Long) list.get(i10)).longValue());
        }
        return iS;
    }

    static Object z(Object obj, int i10, List list, AbstractC1727u.a aVar, Object obj2, f0 f0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue)) {
                    obj2 = I(obj, i10, iIntValue, obj2, f0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (aVar.a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = I(obj, i10, iIntValue2, obj2, f0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
