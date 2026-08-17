package q5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: q5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3119c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f30770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f30771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f30774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f30775g;

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(D d10) {
        return new b(d10, new D[0]);
    }

    public static b f(D d10, D... dArr) {
        return new b(d10, dArr);
    }

    public static C3119c l(final Object obj, Class cls) {
        return m(cls).e(new g() { // from class: q5.b
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return C3119c.b(obj, interfaceC3120d);
            }
        }).d();
    }

    public static b m(Class cls) {
        return c(cls).f();
    }

    public static C3119c q(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).e(new g() { // from class: q5.a
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return C3119c.a(obj, interfaceC3120d);
            }
        }).d();
    }

    public Set g() {
        return this.f30771c;
    }

    public g h() {
        return this.f30774f;
    }

    public String i() {
        return this.f30769a;
    }

    public Set j() {
        return this.f30770b;
    }

    public Set k() {
        return this.f30775g;
    }

    public boolean n() {
        return this.f30772d == 1;
    }

    public boolean o() {
        return this.f30772d == 2;
    }

    public boolean p() {
        return this.f30773e == 0;
    }

    public C3119c r(g gVar) {
        return new C3119c(this.f30769a, this.f30770b, this.f30771c, this.f30772d, this.f30773e, gVar, this.f30775g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f30770b.toArray()) + ">{" + this.f30772d + ", type=" + this.f30773e + ", deps=" + Arrays.toString(this.f30771c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: q5.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f30776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f30777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f30778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f30779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f30780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g f30781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f30782g;

        /* JADX INFO: Access modifiers changed from: private */
        public b f() {
            this.f30780e = 1;
            return this;
        }

        private b h(int i10) {
            AbstractC3116C.d(this.f30779d == 0, "Instantiation type has already been set.");
            this.f30779d = i10;
            return this;
        }

        private void i(D d10) {
            AbstractC3116C.a(!this.f30777b.contains(d10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            AbstractC3116C.c(qVar, "Null dependency");
            i(qVar.b());
            this.f30778c.add(qVar);
            return this;
        }

        public b c() {
            return h(1);
        }

        public C3119c d() {
            AbstractC3116C.d(this.f30781f != null, "Missing required property: factory.");
            return new C3119c(this.f30776a, new HashSet(this.f30777b), new HashSet(this.f30778c), this.f30779d, this.f30780e, this.f30781f, this.f30782g);
        }

        public b e(g gVar) {
            this.f30781f = (g) AbstractC3116C.c(gVar, "Null factory");
            return this;
        }

        public b g(String str) {
            this.f30776a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f30776a = null;
            HashSet hashSet = new HashSet();
            this.f30777b = hashSet;
            this.f30778c = new HashSet();
            this.f30779d = 0;
            this.f30780e = 0;
            this.f30782g = new HashSet();
            AbstractC3116C.c(cls, "Null interface");
            hashSet.add(D.b(cls));
            for (Class cls2 : clsArr) {
                AbstractC3116C.c(cls2, "Null interface");
                this.f30777b.add(D.b(cls2));
            }
        }

        private b(D d10, D... dArr) {
            this.f30776a = null;
            HashSet hashSet = new HashSet();
            this.f30777b = hashSet;
            this.f30778c = new HashSet();
            this.f30779d = 0;
            this.f30780e = 0;
            this.f30782g = new HashSet();
            AbstractC3116C.c(d10, "Null interface");
            hashSet.add(d10);
            for (D d11 : dArr) {
                AbstractC3116C.c(d11, "Null interface");
            }
            Collections.addAll(this.f30777b, dArr);
        }
    }

    private C3119c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f30769a = str;
        this.f30770b = Collections.unmodifiableSet(set);
        this.f30771c = Collections.unmodifiableSet(set2);
        this.f30772d = i10;
        this.f30773e = i11;
        this.f30774f = gVar;
        this.f30775g = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object a(Object obj, InterfaceC3120d interfaceC3120d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC3120d interfaceC3120d) {
        return obj;
    }
}
