package F;

import F.C0486h0;
import F.C0497n;
import F.k1;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import y.AbstractC3583h0;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List f1512j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f1514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f1515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f1516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f1517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f1518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0486h0 f1519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InputConfiguration f1521i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d f1527f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        InputConfiguration f1528g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        f f1530i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set f1522a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C0486h0.a f1523b = new C0486h0.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List f1524c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List f1525d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final List f1526e = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1529h = 0;

        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends a {
        public static b r(D1 d12, Size size) {
            e eVarI = d12.I(null);
            if (eVarI != null) {
                b bVar = new b();
                eVarI.a(size, d12, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + d12.C(d12.toString()));
        }

        public b A(int i10) {
            this.f1529h = i10;
            return this;
        }

        public b B(int i10) {
            this.f1523b.v(i10);
            return this;
        }

        public b C(int i10) {
            if (i10 != 0) {
                this.f1523b.x(i10);
            }
            return this;
        }

        public b a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                this.f1523b.c(rVar);
                if (!this.f1526e.contains(rVar)) {
                    this.f1526e.add(rVar);
                }
            }
            return this;
        }

        public b b(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                f((CameraDevice.StateCallback) it.next());
            }
            return this;
        }

        public b c(Collection collection) {
            this.f1523b.a(collection);
            return this;
        }

        public b d(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((CameraCaptureSession.StateCallback) it.next());
            }
            return this;
        }

        public b e(r rVar) {
            this.f1523b.c(rVar);
            if (!this.f1526e.contains(rVar)) {
                this.f1526e.add(rVar);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f1524c.contains(stateCallback)) {
                return this;
            }
            this.f1524c.add(stateCallback);
            return this;
        }

        public b g(InterfaceC0490j0 interfaceC0490j0) {
            this.f1523b.e(interfaceC0490j0);
            return this;
        }

        public b h(AbstractC0504q0 abstractC0504q0) {
            return i(abstractC0504q0, C3563H.f33650d);
        }

        public b i(AbstractC0504q0 abstractC0504q0, C3563H c3563h) {
            this.f1522a.add(f.a(abstractC0504q0).b(c3563h).a());
            return this;
        }

        public b j(r rVar) {
            this.f1523b.c(rVar);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f1525d.contains(stateCallback)) {
                return this;
            }
            this.f1525d.add(stateCallback);
            return this;
        }

        public b l(AbstractC0504q0 abstractC0504q0) {
            return m(abstractC0504q0, C3563H.f33650d);
        }

        public b m(AbstractC0504q0 abstractC0504q0, C3563H c3563h) {
            return n(abstractC0504q0, c3563h, null, -1);
        }

        public b n(AbstractC0504q0 abstractC0504q0, C3563H c3563h, String str, int i10) {
            this.f1522a.add(f.a(abstractC0504q0).d(str).b(c3563h).c(i10).a());
            this.f1523b.f(abstractC0504q0);
            return this;
        }

        public b o(String str, Object obj) {
            this.f1523b.g(str, obj);
            return this;
        }

        public k1 p() {
            return new k1(new ArrayList(this.f1522a), new ArrayList(this.f1524c), new ArrayList(this.f1525d), new ArrayList(this.f1526e), this.f1523b.h(), this.f1527f, this.f1528g, this.f1529h, this.f1530i);
        }

        public b q() {
            this.f1522a.clear();
            this.f1523b.i();
            return this;
        }

        public List s() {
            return Collections.unmodifiableList(this.f1526e);
        }

        public boolean t(r rVar) {
            return this.f1523b.o(rVar) || this.f1526e.remove(rVar);
        }

        public b u(d dVar) {
            this.f1527f = dVar;
            return this;
        }

        public b v(Range range) {
            this.f1523b.q(range);
            return this;
        }

        public b w(InterfaceC0490j0 interfaceC0490j0) {
            this.f1523b.s(interfaceC0490j0);
            return this;
        }

        public b x(InputConfiguration inputConfiguration) {
            this.f1528g = inputConfiguration;
            return this;
        }

        public b y(AbstractC0504q0 abstractC0504q0) {
            this.f1530i = f.a(abstractC0504q0).a();
            return this;
        }

        public b z(int i10) {
            if (i10 != 0) {
                this.f1523b.u(i10);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f1531a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f1532b;

        public c(d dVar) {
            this.f1532b = dVar;
        }

        @Override // F.k1.d
        public void a(k1 k1Var, g gVar) {
            if (this.f1531a.get()) {
                return;
            }
            this.f1532b.a(k1Var, gVar);
        }

        public void b() {
            this.f1531a.set(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
        void a(k1 k1Var, g gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface e {
        void a(Size size, D1 d12, b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class f {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static abstract class a {
            public abstract f a();

            public abstract a b(C3563H c3563h);

            public abstract a c(int i10);

            public abstract a d(String str);

            public abstract a e(List list);

            public abstract a f(int i10);
        }

        public static a a(AbstractC0504q0 abstractC0504q0) {
            return new C0497n.b().g(abstractC0504q0).e(Collections.EMPTY_LIST).d(null).c(-1).f(-1).b(C3563H.f33650d);
        }

        public abstract C3563H b();

        public abstract int c();

        public abstract String d();

        public abstract List e();

        public abstract AbstractC0504q0 f();

        public abstract int g();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class h extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final N.g f1536j = new N.g();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f1537k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private StringBuilder f1538l = new StringBuilder();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f1539m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f1540n = new ArrayList();

        public static /* synthetic */ void a(h hVar, k1 k1Var, g gVar) {
            Iterator it = hVar.f1540n.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(k1Var, gVar);
            }
        }

        private List e() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f1522a) {
                arrayList.add(fVar.f());
                Iterator it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add((AbstractC0504q0) it.next());
                }
            }
            return arrayList;
        }

        private void g(Range range) {
            Range range2 = o1.f1588a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f1523b.l().equals(range2)) {
                this.f1523b.q(range);
                return;
            }
            if (this.f1523b.l().equals(range)) {
                return;
            }
            this.f1537k = false;
            String str = "Different ExpectedFrameRateRange values; current = " + this.f1523b.l() + ", new = " + range;
            AbstractC3583h0.c("ValidatingBuilder", str);
            this.f1538l.append(str);
        }

        private void h(int i10) {
            if (i10 != 0) {
                this.f1523b.u(i10);
            }
        }

        private void i(int i10) {
            if (i10 != 0) {
                this.f1523b.x(i10);
            }
        }

        public void b(k1 k1Var) {
            C0486h0 c0486h0K = k1Var.k();
            if (c0486h0K.k() != -1) {
                this.f1539m = true;
                this.f1523b.v(k1.f(c0486h0K.k(), this.f1523b.n()));
            }
            g(c0486h0K.e());
            h(c0486h0K.h());
            i(c0486h0K.l());
            this.f1523b.b(k1Var.k().j());
            this.f1524c.addAll(k1Var.c());
            this.f1525d.addAll(k1Var.l());
            this.f1523b.a(k1Var.j());
            this.f1526e.addAll(k1Var.n());
            if (k1Var.d() != null) {
                this.f1540n.add(k1Var.d());
            }
            if (k1Var.h() != null) {
                this.f1528g = k1Var.h();
            }
            this.f1522a.addAll(k1Var.i());
            this.f1523b.m().addAll(c0486h0K.i());
            if (!e().containsAll(this.f1523b.m())) {
                AbstractC3583h0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f1537k = false;
                this.f1538l.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            if (k1Var.m() != this.f1529h && k1Var.m() != 0 && this.f1529h != 0) {
                AbstractC3583h0.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f1537k = false;
                this.f1538l.append("Invalid configuration due to that two non-default session types are set");
            } else if (k1Var.m() != 0) {
                this.f1529h = k1Var.m();
            }
            if (k1Var.f1514b != null) {
                if (this.f1530i == k1Var.f1514b || this.f1530i == null) {
                    this.f1530i = k1Var.f1514b;
                } else {
                    AbstractC3583h0.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f1537k = false;
                    this.f1538l.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            this.f1523b.e(c0486h0K.g());
        }

        public k1 c() {
            if (!this.f1537k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f1522a);
            this.f1536j.c(arrayList);
            if (this.f1529h == 1) {
                new K.g().e(arrayList, this.f1523b);
            }
            return new k1(arrayList, new ArrayList(this.f1524c), new ArrayList(this.f1525d), new ArrayList(this.f1526e), this.f1523b.h(), !this.f1540n.isEmpty() ? new d() { // from class: F.l1
                @Override // F.k1.d
                public final void a(k1 k1Var, k1.g gVar) {
                    k1.h.a(this.f1553a, k1Var, gVar);
                }
            } : null, this.f1528g, this.f1529h, this.f1530i);
        }

        public String d() {
            return !this.f1539m ? "Template is not set" : this.f1538l.toString();
        }

        public boolean f() {
            return this.f1539m && this.f1537k;
        }
    }

    k1(List list, List list2, List list3, List list4, C0486h0 c0486h0, d dVar, InputConfiguration inputConfiguration, int i10, f fVar) {
        this.f1513a = list;
        this.f1515c = Collections.unmodifiableList(list2);
        this.f1516d = Collections.unmodifiableList(list3);
        this.f1517e = Collections.unmodifiableList(list4);
        this.f1518f = dVar;
        this.f1519g = c0486h0;
        this.f1521i = inputConfiguration;
        this.f1520h = i10;
        this.f1514b = fVar;
    }

    public static k1 b() {
        return new k1(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C0486h0.a().h(), null, null, 0, null);
    }

    public static int f(int i10, int i11) {
        List list = f1512j;
        return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
    }

    public List c() {
        return this.f1515c;
    }

    public d d() {
        return this.f1518f;
    }

    public Range e() {
        return this.f1519g.e();
    }

    public InterfaceC0490j0 g() {
        return this.f1519g.g();
    }

    public InputConfiguration h() {
        return this.f1521i;
    }

    public List i() {
        return this.f1513a;
    }

    public List j() {
        return this.f1519g.c();
    }

    public C0486h0 k() {
        return this.f1519g;
    }

    public List l() {
        return this.f1516d;
    }

    public int m() {
        return this.f1520h;
    }

    public List n() {
        return this.f1517e;
    }

    public List o() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f1513a) {
            arrayList.add(fVar.f());
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC0504q0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int p() {
        return this.f1519g.k();
    }
}
