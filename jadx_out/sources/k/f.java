package K;

import F.C0;
import F.C0475d;
import F.C0478e;
import F.D1;
import F.E;
import F.E1;
import F.I;
import F.InterfaceC0490j0;
import F.M;
import F.S0;
import F.k1;
import F.o1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y.AbstractC3583h0;
import y.C3561F;
import y.C3563H;
import y.C3596p;
import y.I0;
import y.InterfaceC3584i;
import y.InterfaceC3586j;
import y.InterfaceC3597q;
import y.J0;
import y.L0;
import y.V;
import y.p0;
import z.InterfaceC3664a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC3584i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final m f6971A;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0478e f6972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0478e f6973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E1 f6974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C3596p f6975j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC3664a f6978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private L0 f6979n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final E f6983r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private J0 f6987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private T.g f6988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final C3561F f6989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final C3561F f6990y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f6976k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f6977l = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f6980o = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f6981p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Range f6982q = o1.f1588a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f6984s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f6985t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC0490j0 f6986u = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final N.e f6991z = new N.e();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        D1 f6992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        D1 f6993b;

        b(D1 d12, D1 d13) {
            this.f6992a = d12;
            this.f6993b = d13;
        }
    }

    public f(M m10, M m11, C0475d c0475d, C0475d c0475d2, C3561F c3561f, C3561F c3561f2, InterfaceC3664a interfaceC3664a, m mVar, E1 e12) {
        this.f6983r = c0475d.B();
        this.f6972g = new C0478e(m10, c0475d);
        if (m11 == null || c0475d2 == null) {
            this.f6973h = null;
        } else {
            this.f6973h = new C0478e(m11, c0475d2);
        }
        this.f6989x = c3561f;
        this.f6990y = c3561f2;
        this.f6978m = interfaceC3664a;
        this.f6974i = e12;
        this.f6975j = C3596p.b(c0475d, c0475d2);
        this.f6971A = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private J0 A(Collection collection, T.g gVar) {
        J0 j0E;
        synchronized (this.f6984s) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (gVar != null) {
                    arrayList.add(gVar);
                    arrayList.removeAll(gVar.s0());
                }
                if (!V()) {
                    j0E = null;
                } else if (X(arrayList)) {
                    j0E = b0(this.f6987v) ? this.f6987v : F();
                } else if (W(arrayList)) {
                    j0E = Z(this.f6987v) ? this.f6987v : E();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j0E;
    }

    private static Matrix B(Rect rect, Size size) {
        H0.g.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private void C(Collection collection) {
        if (P()) {
            if (R(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (S(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f6984s) {
            try {
                if (!this.f6980o.isEmpty() && (T(collection) || S(collection))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    private static void D(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((J0) it.next()).Y(null);
        }
    }

    private V E() {
        return new V.b().r("ImageCapture-Extra").e();
    }

    private p0 F() {
        p0 p0VarE = new p0.a().o("Preview-Extra").e();
        p0VarE.p0(new p0.c() { // from class: K.d
            @Override // y.p0.c
            public final void a(I0 i02) {
                f.e(i02);
            }
        });
        return p0VarE;
    }

    private T.g G(Collection collection, boolean z10) {
        synchronized (this.f6984s) {
            try {
                Set setN = N(collection, z10);
                if (setN.size() >= 2 || (P() && U(setN))) {
                    T.g gVar = this.f6988w;
                    if (gVar == null || !gVar.s0().equals(setN)) {
                        if (!d0(setN)) {
                            return null;
                        }
                        return new T.g(this.f6972g, this.f6973h, this.f6989x, this.f6990y, setN, this.f6974i);
                    }
                    this.f6988w.B0(setN);
                    T.g gVar2 = this.f6988w;
                    Objects.requireNonNull(gVar2);
                    return gVar2;
                }
                return null;
            } finally {
            }
        }
    }

    private static D1 I(E1 e12, T.g gVar) {
        D1 d1M = new p0.a().e().m(false, e12);
        if (d1M == null) {
            return null;
        }
        S0 s0J0 = S0.j0(d1M);
        s0J0.k0(q.f7019N);
        return gVar.D(s0J0).c();
    }

    private int K() {
        synchronized (this.f6984s) {
            try {
                return this.f6978m.c() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Map L(Collection collection, E1 e12, E1 e13, int i10, Range range) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            map.put(j02, new b(T.g.w0(j02) ? I(e12, (T.g) j02) : j02.m(false, e12), v(j02, j02.m(true, e13), i10, range)));
        }
        return map;
    }

    private int M(boolean z10) {
        int i10;
        synchronized (this.f6984s) {
            try {
                Iterator it = this.f6980o.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
                i10 = z10 ? 3 : 0;
            } finally {
            }
        }
        return i10;
    }

    private Set N(Collection collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int iM = M(z10);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            H0.g.b(!T.g.w0(j02), "Only support one level of sharing for now.");
            if (j02.F(iM)) {
                hashSet.add(j02);
            }
        }
        return hashSet;
    }

    private boolean P() {
        synchronized (this.f6984s) {
            this.f6983r.R(null);
        }
        return false;
    }

    private static boolean Q(o1 o1Var, k1 k1Var) {
        InterfaceC0490j0 interfaceC0490j0D = o1Var.d();
        InterfaceC0490j0 interfaceC0490j0G = k1Var.g();
        Objects.requireNonNull(interfaceC0490j0D);
        if (interfaceC0490j0D.a().size() != k1Var.g().a().size()) {
            return true;
        }
        for (InterfaceC0490j0.a aVar : interfaceC0490j0D.a()) {
            if (!interfaceC0490j0G.b(aVar) || !Objects.equals(interfaceC0490j0G.d(aVar), interfaceC0490j0D.d(aVar))) {
                return true;
            }
        }
        return false;
    }

    private static boolean R(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (a0(((J0) it.next()).l().l())) {
                return true;
            }
        }
        return false;
    }

    private static boolean S(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (Z(j02)) {
                D1 d1L = j02.l();
                InterfaceC0490j0.a aVar = C0.f1276U;
                if (d1L.b(aVar) && ((Integer) H0.g.g((Integer) d1L.d(aVar))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean T(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (Z(j02)) {
                D1 d1L = j02.l();
                InterfaceC0490j0.a aVar = C0.f1276U;
                if (d1L.b(aVar) && ((Integer) H0.g.g((Integer) d1L.d(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean U(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (e0((J0) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean V() {
        boolean z10;
        synchronized (this.f6984s) {
            z10 = true;
            if (this.f6983r.D() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    private static boolean W(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (b0(j02) || T.g.w0(j02)) {
                z10 = true;
            } else if (Z(j02)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    private static boolean X(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (b0(j02) || T.g.w0(j02)) {
                z11 = true;
            } else if (Z(j02)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    private static boolean Y(List... listArr) {
        boolean z10 = false;
        for (List list : listArr) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((J0) it.next()).o() != null) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    private static boolean Z(J0 j02) {
        return j02 instanceof V;
    }

    private static boolean a0(C3563H c3563h) {
        return (c3563h.a() == 10) || (c3563h.b() != 1 && c3563h.b() != 0);
    }

    private static boolean b0(J0 j02) {
        return j02 instanceof p0;
    }

    private boolean c0() {
        return (P() || this.f6973h != null || this.f6981p == 1) ? false : true;
    }

    static boolean d0(Collection collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (j02.F(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    public static /* synthetic */ void e(I0 i02) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(i02.q().getWidth(), i02.q().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        i02.w(surface, I.c.b(), new H0.a() { // from class: K.e
            @Override // H0.a
            public final void accept(Object obj) {
                f.g(surface, surfaceTexture, (I0.g) obj);
            }
        });
    }

    public static boolean e0(J0 j02) {
        if (j02 != null) {
            if (j02.l().b(D1.f1303G)) {
                return j02.l().G() == E1.b.VIDEO_CAPTURE;
            }
            j02.toString();
        }
        return false;
    }

    public static /* synthetic */ void g(Surface surface, SurfaceTexture surfaceTexture, I0.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    private static void g0(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((J0) entry.getKey()).Y((Set) entry.getValue());
        }
    }

    private void h0() {
        synchronized (this.f6984s) {
            try {
                if (this.f6986u != null) {
                    this.f6972g.h().j(this.f6986u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List j0(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((J0) it.next()).X(null);
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return arrayList;
    }

    private boolean n0(Collection collection) {
        if (P() && U(collection)) {
            return true;
        }
        return this.f6991z.a(this.f6972g.r().f(), collection);
    }

    static void p0(List list, Collection collection, Collection collection2) {
        List listJ0 = j0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List listJ02 = j0(listJ0, arrayList);
        if (listJ02.isEmpty()) {
            return;
        }
        AbstractC3583h0.l("CameraUseCaseAdapter", "Unused effects: " + listJ02);
    }

    private void q0(Map map, Collection collection) {
        Map map2;
        synchronized (this.f6984s) {
            try {
                if (this.f6979n == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map mapA = s.a(this.f6972g.r().i(), this.f6972g.r().k() == 0, this.f6979n.a(), this.f6972g.r().p(this.f6979n.c()), this.f6979n.d(), this.f6979n.b(), map2);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        J0 j02 = (J0) it.next();
                        j02.b0((Rect) H0.g.g((Rect) mapA.get(j02)));
                    }
                }
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    J0 j03 = (J0) it2.next();
                    j03.Z(B(this.f6972g.r().i(), ((o1) H0.g.g((o1) map2.get(j03))).f()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void s(K.b bVar) {
        q0(bVar.g().b(), bVar.b());
        p0(this.f6980o, bVar.b(), bVar.a());
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            ((J0) it.next()).c0(this.f6972g);
        }
        this.f6972g.m(bVar.d());
        if (this.f6973h != null) {
            for (J0 j02 : bVar.d()) {
                C0478e c0478e = this.f6973h;
                Objects.requireNonNull(c0478e);
                j02.c0(c0478e);
            }
            C0478e c0478e2 = this.f6973h;
            Objects.requireNonNull(c0478e2);
            c0478e2.m(bVar.d());
        }
        if (bVar.d().isEmpty()) {
            for (J0 j03 : bVar.e()) {
                Map mapB = bVar.g().b();
                if (mapB.containsKey(j03)) {
                    o1 o1Var = (o1) mapB.get(j03);
                    Objects.requireNonNull(o1Var);
                    InterfaceC0490j0 interfaceC0490j0D = o1Var.d();
                    if (interfaceC0490j0D != null && Q(o1Var, j03.z())) {
                        j03.f0(interfaceC0490j0D);
                        if (this.f6985t) {
                            this.f6972g.k(j03);
                            C0478e c0478e3 = this.f6973h;
                            if (c0478e3 != null) {
                                Objects.requireNonNull(c0478e3);
                                c0478e3.k(j03);
                            }
                        }
                    }
                }
            }
        }
        for (J0 j04 : bVar.c()) {
            b bVar2 = (b) bVar.j().get(j04);
            Objects.requireNonNull(bVar2);
            C0478e c0478e4 = this.f6973h;
            if (c0478e4 != null) {
                C0478e c0478e5 = this.f6972g;
                Objects.requireNonNull(c0478e4);
                j04.d(c0478e5, c0478e4, bVar2.f6992a, bVar2.f6993b);
                j04.e0((o1) H0.g.g((o1) bVar.g().b().get(j04)), (o1) ((l) H0.g.g(bVar.h())).b().get(j04));
            } else {
                j04.d(this.f6972g, null, bVar2.f6992a, bVar2.f6993b);
                j04.e0((o1) H0.g.g((o1) bVar.g().b().get(j04)), null);
            }
        }
        if (this.f6985t) {
            this.f6972g.l(bVar.c());
            C0478e c0478e6 = this.f6973h;
            if (c0478e6 != null) {
                Objects.requireNonNull(c0478e6);
                c0478e6.l(bVar.c());
            }
        }
        Iterator it2 = bVar.c().iterator();
        while (it2.hasNext()) {
            ((J0) it2.next()).M();
        }
        this.f6976k.clear();
        this.f6976k.addAll(bVar.a());
        this.f6977l.clear();
        this.f6977l.addAll(bVar.b());
        this.f6987v = bVar.f();
        this.f6988w = bVar.i();
    }

    private void t() {
        this.f6972g.q(this.f6983r);
        C0478e c0478e = this.f6973h;
        if (c0478e != null) {
            c0478e.q(this.f6983r);
        }
    }

    private static Map u(Collection collection, B.b bVar) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            map.put(j02, j02.o());
            j02.Y(bVar != null ? bVar.a() : null);
        }
        return map;
    }

    private static D1 v(J0 j02, D1 d12, int i10, Range range) {
        S0 s0J0 = d12 != null ? S0.j0(d12) : S0.i0();
        s0J0.X(D1.f1298B, Integer.valueOf(i10));
        if (!o1.f1588a.equals(range)) {
            s0J0.t(D1.f1299C, InterfaceC0490j0.c.HIGH_PRIORITY_REQUIRED, range);
            s0J0.X(D1.f1300D, Boolean.TRUE);
        }
        return j02.D(s0J0).c();
    }

    private void x() {
        synchronized (this.f6984s) {
            I iH = this.f6972g.h();
            this.f6986u = iH.m();
            iH.n();
        }
    }

    private K.b y(Collection collection, boolean z10, boolean z11) {
        l lVarB;
        l lVarB2;
        boolean z12 = z11;
        C(collection);
        if (!z10 && n0(collection)) {
            return y(collection, true, z12);
        }
        T.g gVarG = G(collection, z10);
        J0 j0A = A(collection, gVarG);
        Collection<?> collectionZ = z(collection, j0A, gVarG);
        ArrayList arrayList = new ArrayList(collectionZ);
        arrayList.removeAll(this.f6977l);
        ArrayList arrayList2 = new ArrayList(collectionZ);
        arrayList2.retainAll(this.f6977l);
        ArrayList arrayList3 = new ArrayList(this.f6977l);
        arrayList3.removeAll(collectionZ);
        Map mapL = L(arrayList, this.f6983r.j(), this.f6974i, this.f6981p, this.f6982q);
        boolean zY = Y(arrayList, arrayList2);
        try {
            lVarB = this.f6971A.b(K(), this.f6972g.r(), arrayList, arrayList2, this.f6983r, this.f6981p, this.f6982q, zY, z12);
        } catch (IllegalArgumentException e10) {
            e = e10;
        }
        try {
            if (this.f6973h != null) {
                m mVar = this.f6971A;
                int iK = K();
                C0478e c0478e = this.f6973h;
                Objects.requireNonNull(c0478e);
                z12 = z11;
                lVarB2 = mVar.b(iK, c0478e.r(), arrayList, arrayList2, this.f6983r, this.f6981p, this.f6982q, zY, z12);
            } else {
                lVarB2 = null;
            }
            return new K.b(collection, collectionZ, arrayList, arrayList2, arrayList3, gVarG, j0A, mapL, lVarB, lVarB2);
        } catch (IllegalArgumentException e11) {
            e = e11;
            z12 = z11;
            if (z10 || !c0()) {
                throw e;
            }
            return y(collection, true, z12);
        }
    }

    static Collection z(Collection collection, J0 j02, T.g gVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (j02 != null) {
            arrayList.add(j02);
        }
        if (gVar != null) {
            arrayList.add(gVar);
            arrayList.removeAll(gVar.s0());
        }
        return arrayList;
    }

    public void H() {
        synchronized (this.f6984s) {
            try {
                if (this.f6985t) {
                    this.f6972g.m(new ArrayList(this.f6977l));
                    C0478e c0478e = this.f6973h;
                    if (c0478e != null) {
                        c0478e.m(new ArrayList(this.f6977l));
                    }
                    x();
                    this.f6985t = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3596p J() {
        return this.f6975j;
    }

    public List O() {
        ArrayList arrayList;
        synchronized (this.f6984s) {
            arrayList = new ArrayList(this.f6976k);
        }
        return arrayList;
    }

    @Override // y.InterfaceC3584i
    public InterfaceC3586j b() {
        return this.f6972g.b();
    }

    @Override // y.InterfaceC3584i
    public InterfaceC3597q d() {
        return this.f6972g.d();
    }

    public void f0(Collection collection) {
        synchronized (this.f6984s) {
            D(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f6976k);
            linkedHashSet.removeAll(collection);
            s(y(linkedHashSet, this.f6973h != null, false));
        }
    }

    public void i0(List list) {
        synchronized (this.f6984s) {
            this.f6980o = list;
        }
    }

    public void j(boolean z10) {
        this.f6972g.j(z10);
    }

    public void k(Collection collection, B.b bVar) {
        AbstractC3583h0.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + bVar);
        synchronized (this.f6984s) {
            try {
                t();
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f6976k);
                linkedHashSet.addAll(collection);
                Map mapU = u(linkedHashSet, bVar);
                try {
                    s(y(linkedHashSet, this.f6973h != null, false));
                } catch (IllegalArgumentException e10) {
                    g0(mapU);
                    throw new a(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k0(Range range) {
        synchronized (this.f6984s) {
            this.f6982q = range;
        }
    }

    public void l0(int i10) {
        synchronized (this.f6984s) {
            this.f6981p = i10;
        }
    }

    public void m0(L0 l02) {
        synchronized (this.f6984s) {
            this.f6979n = l02;
        }
    }

    public K.b o0(Collection collection, B.b bVar, boolean z10) {
        K.b bVarY;
        AbstractC3583h0.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + bVar);
        synchronized (this.f6984s) {
            t();
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f6976k);
            linkedHashSet.addAll(collection);
            Map mapU = u(linkedHashSet, bVar);
            try {
                try {
                    bVarY = y(linkedHashSet, this.f6973h != null, z10);
                } catch (IllegalArgumentException e10) {
                    throw new a(e10);
                }
            } finally {
                g0(mapU);
            }
        }
        return bVarY;
    }

    public void w() {
        synchronized (this.f6984s) {
            try {
                if (!this.f6985t) {
                    if (!this.f6977l.isEmpty()) {
                        this.f6972g.q(this.f6983r);
                        C0478e c0478e = this.f6973h;
                        if (c0478e != null) {
                            c0478e.q(this.f6983r);
                        }
                    }
                    this.f6972g.l(this.f6977l);
                    C0478e c0478e2 = this.f6973h;
                    if (c0478e2 != null) {
                        c0478e2.l(this.f6977l);
                    }
                    h0();
                    Iterator it = this.f6977l.iterator();
                    while (it.hasNext()) {
                        ((J0) it.next()).M();
                    }
                    this.f6985t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
