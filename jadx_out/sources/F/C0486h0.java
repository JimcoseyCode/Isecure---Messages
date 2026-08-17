package F;

import F.InterfaceC0490j0;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: F.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0486h0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1472i = InterfaceC0490j0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1473j = InterfaceC0490j0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final InterfaceC0490j0.a f1474k = InterfaceC0490j0.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f1475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC0490j0 f1476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f1477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f1478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List f1479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u1 f1481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B f1482h;

    /* JADX INFO: renamed from: F.h0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(D1 d12, a aVar);
    }

    C0486h0(List list, InterfaceC0490j0 interfaceC0490j0, int i10, boolean z10, List list2, boolean z11, u1 u1Var, B b10) {
        this.f1475a = list;
        this.f1476b = interfaceC0490j0;
        this.f1477c = i10;
        this.f1479e = Collections.unmodifiableList(list2);
        this.f1480f = z11;
        this.f1481g = u1Var;
        this.f1482h = b10;
        this.f1478d = z10;
    }

    public static C0486h0 b() {
        return new a().h();
    }

    public List c() {
        return this.f1479e;
    }

    public B d() {
        return this.f1482h;
    }

    public Range e() {
        Range range = (Range) this.f1476b.f(f1474k, o1.f1588a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object objD = this.f1481g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    public InterfaceC0490j0 g() {
        return this.f1476b;
    }

    public int h() {
        Integer num = (Integer) this.f1476b.f(D1.f1304H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List i() {
        return Collections.unmodifiableList(this.f1475a);
    }

    public u1 j() {
        return this.f1481g;
    }

    public int k() {
        return this.f1477c;
    }

    public int l() {
        Integer num = (Integer) this.f1476b.f(D1.f1305I, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f1480f;
    }

    /* JADX INFO: renamed from: F.h0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f1483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private R0 f1484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f1487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private U0 f1489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private B f1490h;

        public a() {
            this.f1483a = new HashSet();
            this.f1484b = S0.i0();
            this.f1485c = -1;
            this.f1486d = false;
            this.f1487e = new ArrayList();
            this.f1488f = false;
            this.f1489g = U0.g();
        }

        public static a j(D1 d12) {
            b bVarE0 = d12.e0(null);
            if (bVarE0 != null) {
                a aVar = new a();
                bVarE0.a(d12, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + d12.C(d12.toString()));
        }

        public static a k(C0486h0 c0486h0) {
            return new a(c0486h0);
        }

        public void a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c((r) it.next());
            }
        }

        public void b(u1 u1Var) {
            this.f1489g.f(u1Var);
        }

        public void c(r rVar) {
            if (this.f1487e.contains(rVar)) {
                return;
            }
            this.f1487e.add(rVar);
        }

        public void d(InterfaceC0490j0.a aVar, Object obj) {
            this.f1484b.X(aVar, obj);
        }

        public void e(InterfaceC0490j0 interfaceC0490j0) {
            for (InterfaceC0490j0.a aVar : interfaceC0490j0.a()) {
                this.f1484b.f(aVar, null);
                this.f1484b.t(aVar, interfaceC0490j0.c(aVar), interfaceC0490j0.d(aVar));
            }
        }

        public void f(AbstractC0504q0 abstractC0504q0) {
            this.f1483a.add(abstractC0504q0);
        }

        public void g(String str, Object obj) {
            this.f1489g.i(str, obj);
        }

        public C0486h0 h() {
            return new C0486h0(new ArrayList(this.f1483a), X0.h0(this.f1484b), this.f1485c, this.f1486d, new ArrayList(this.f1487e), this.f1488f, u1.c(this.f1489g), this.f1490h);
        }

        public void i() {
            this.f1483a.clear();
        }

        public Range l() {
            return (Range) this.f1484b.f(C0486h0.f1474k, o1.f1588a);
        }

        public Set m() {
            return this.f1483a;
        }

        public int n() {
            return this.f1485c;
        }

        public boolean o(r rVar) {
            return this.f1487e.remove(rVar);
        }

        public void p(B b10) {
            this.f1490h = b10;
        }

        public void q(Range range) {
            d(C0486h0.f1474k, range);
        }

        public void r(int i10) {
            this.f1489g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        public void s(InterfaceC0490j0 interfaceC0490j0) {
            this.f1484b = S0.j0(interfaceC0490j0);
        }

        public void t(boolean z10) {
            this.f1486d = z10;
        }

        public void u(int i10) {
            if (i10 != 0) {
                d(D1.f1304H, Integer.valueOf(i10));
            }
        }

        public void v(int i10) {
            this.f1485c = i10;
        }

        public void w(boolean z10) {
            this.f1488f = z10;
        }

        public void x(int i10) {
            if (i10 != 0) {
                d(D1.f1305I, Integer.valueOf(i10));
            }
        }

        private a(C0486h0 c0486h0) {
            HashSet hashSet = new HashSet();
            this.f1483a = hashSet;
            this.f1484b = S0.i0();
            this.f1485c = -1;
            this.f1486d = false;
            this.f1487e = new ArrayList();
            this.f1488f = false;
            this.f1489g = U0.g();
            hashSet.addAll(c0486h0.f1475a);
            this.f1484b = S0.j0(c0486h0.f1476b);
            this.f1485c = c0486h0.f1477c;
            this.f1487e.addAll(c0486h0.c());
            this.f1488f = c0486h0.m();
            this.f1489g = U0.h(c0486h0.j());
            this.f1486d = c0486h0.f1478d;
        }
    }
}
