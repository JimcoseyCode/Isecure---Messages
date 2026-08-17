package g3;

import f2.C2604e;
import f2.InterfaceC2603d;
import j3.C2768b;

/* JADX INFO: renamed from: g3.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2666B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f28130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f28131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f28132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2603d f28133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f28134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F f28135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E f28136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F f28137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f28138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f28139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f28140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f28141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f28142m;

    /* JADX INFO: renamed from: g3.B$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private E f28143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private F f28144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private E f28145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InterfaceC2603d f28146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private E f28147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private F f28148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E f28149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private F f28150h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f28151i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f28152j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f28153k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f28154l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f28155m;

        public C2666B m() {
            return new C2666B(this);
        }

        private a() {
        }
    }

    public static a n() {
        return new a();
    }

    public int a() {
        return this.f28140k;
    }

    public int b() {
        return this.f28139j;
    }

    public E c() {
        return this.f28130a;
    }

    public F d() {
        return this.f28131b;
    }

    public String e() {
        return this.f28138i;
    }

    public E f() {
        return this.f28132c;
    }

    public E g() {
        return this.f28134e;
    }

    public F h() {
        return this.f28135f;
    }

    public InterfaceC2603d i() {
        return this.f28133d;
    }

    public E j() {
        return this.f28136g;
    }

    public F k() {
        return this.f28137h;
    }

    public boolean l() {
        return this.f28142m;
    }

    public boolean m() {
        return this.f28141l;
    }

    private C2666B(a aVar) {
        if (C2768b.d()) {
            C2768b.a("PoolConfig()");
        }
        this.f28130a = aVar.f28143a == null ? n.a() : aVar.f28143a;
        this.f28131b = aVar.f28144b == null ? z.h() : aVar.f28144b;
        this.f28132c = aVar.f28145c == null ? p.b() : aVar.f28145c;
        this.f28133d = aVar.f28146d == null ? C2604e.b() : aVar.f28146d;
        this.f28134e = aVar.f28147e == null ? q.a() : aVar.f28147e;
        this.f28135f = aVar.f28148f == null ? z.h() : aVar.f28148f;
        this.f28136g = aVar.f28149g == null ? o.a() : aVar.f28149g;
        this.f28137h = aVar.f28150h == null ? z.h() : aVar.f28150h;
        this.f28138i = aVar.f28151i == null ? "legacy" : aVar.f28151i;
        this.f28139j = aVar.f28152j;
        this.f28140k = aVar.f28153k > 0 ? aVar.f28153k : 4194304;
        this.f28141l = aVar.f28154l;
        if (C2768b.d()) {
            C2768b.b();
        }
        this.f28142m = aVar.f28155m;
    }
}
