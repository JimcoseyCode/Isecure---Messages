package d8;

import A8.M;
import L7.InterfaceC1280e;
import L7.N;
import e8.C2431a;
import j7.AbstractC2800q;
import j7.T;
import j8.C2810e;
import j8.C2811f;
import j8.C2814i;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C2952k;
import v8.InterfaceC3442k;
import y8.C3647i;
import y8.C3652n;
import y8.C3662y;

/* JADX INFO: renamed from: d8.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2366n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25760b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f25761c = T.d(C2431a.EnumC0258a.f25955k);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f25762d = T.h(C2431a.EnumC0258a.f25956l, C2431a.EnumC0258a.f25959o);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2810e f25763e = new C2810e(1, 1, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2810e f25764f = new C2810e(1, 1, 11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C2810e f25765g = new C2810e(1, 1, 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3652n f25766a;

    /* JADX INFO: renamed from: d8.n$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2810e a() {
            return C2366n.f25765g;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d() {
        return AbstractC2800q.j();
    }

    private final A8.r e(InterfaceC2376x interfaceC2376x) {
        return f().g().b() ? A8.r.f186g : interfaceC2376x.a().j() ? A8.r.f187h : A8.r.f186g;
    }

    private final C3662y g(InterfaceC2376x interfaceC2376x) {
        if (i() || interfaceC2376x.a().d().h(h())) {
            return null;
        }
        return new C3662y(interfaceC2376x.a().d(), C2810e.f28943i, h(), h().k(interfaceC2376x.a().d().j()), interfaceC2376x.h(), interfaceC2376x.c());
    }

    private final C2810e h() {
        return M8.c.a(f().g());
    }

    private final boolean i() {
        return f().g().e();
    }

    private final boolean j(InterfaceC2376x interfaceC2376x) {
        return !f().g().c() && interfaceC2376x.a().i() && AbstractC2855l.b(interfaceC2376x.a().d(), f25764f);
    }

    private final boolean k(InterfaceC2376x interfaceC2376x) {
        return (f().g().f() && (interfaceC2376x.a().i() || AbstractC2855l.b(interfaceC2376x.a().d(), f25763e))) || j(interfaceC2376x);
    }

    private final String[] m(InterfaceC2376x interfaceC2376x, Set set) {
        C2431a c2431aA = interfaceC2376x.a();
        String[] strArrA = c2431aA.a();
        if (strArrA == null) {
            strArrA = c2431aA.b();
        }
        if (strArrA == null || !set.contains(c2431aA.c())) {
            return null;
        }
        return strArrA;
    }

    public final InterfaceC3442k c(N descriptor, InterfaceC2376x kotlinClass) {
        Pair pairM;
        AbstractC2855l.g(descriptor, "descriptor");
        AbstractC2855l.g(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f25762d);
        if (strArrM == null) {
            return null;
        }
        String[] strArrG = kotlinClass.a().g();
        try {
            if (strArrG == null) {
                return null;
            }
            try {
                pairM = C2814i.m(strArrM, strArrG);
            } catch (C2952k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.h(), e10);
            }
        } catch (Throwable th) {
            if (i() || kotlinClass.a().d().h(h())) {
                throw th;
            }
            pairM = null;
        }
        if (pairM == null) {
            return null;
        }
        C2811f c2811f = (C2811f) pairM.getFirst();
        f8.l lVar = (f8.l) pairM.getSecond();
        C2370r c2370r = new C2370r(kotlinClass, lVar, c2811f, g(kotlinClass), k(kotlinClass), e(kotlinClass));
        return new M(descriptor, lVar, c2811f, kotlinClass.a().d(), c2370r, f(), "scope for " + c2370r + " in " + descriptor, C2365m.f25759g);
    }

    public final C3652n f() {
        C3652n c3652n = this.f25766a;
        if (c3652n != null) {
            return c3652n;
        }
        AbstractC2855l.y("components");
        return null;
    }

    public final C3647i l(InterfaceC2376x kotlinClass) {
        String[] strArrG;
        Pair pairI;
        AbstractC2855l.g(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f25761c);
        if (strArrM == null || (strArrG = kotlinClass.a().g()) == null) {
            return null;
        }
        try {
            try {
                pairI = C2814i.i(strArrM, strArrG);
            } catch (C2952k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.h(), e10);
            }
        } catch (Throwable th) {
            if (i() || kotlinClass.a().d().h(h())) {
                throw th;
            }
            pairI = null;
        }
        if (pairI == null) {
            return null;
        }
        return new C3647i((C2811f) pairI.getFirst(), (f8.c) pairI.getSecond(), kotlinClass.a().d(), new C2378z(kotlinClass, g(kotlinClass), k(kotlinClass), e(kotlinClass)));
    }

    public final InterfaceC1280e n(InterfaceC2376x kotlinClass) {
        AbstractC2855l.g(kotlinClass, "kotlinClass");
        C3647i c3647iL = l(kotlinClass);
        if (c3647iL == null) {
            return null;
        }
        return f().f().e(kotlinClass.c(), c3647iL);
    }

    public final void o(C2363k components) {
        AbstractC2855l.g(components, "components");
        p(components.a());
    }

    public final void p(C3652n c3652n) {
        AbstractC2855l.g(c3652n, "<set-?>");
        this.f25766a = c3652n;
    }
}
