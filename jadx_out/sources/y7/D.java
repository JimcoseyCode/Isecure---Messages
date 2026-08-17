package Y7;

import L7.InterfaceC1280e;
import L7.h0;
import b8.InterfaceC1823g;
import d8.AbstractC2375w;
import d8.C2377y;
import d8.InterfaceC2346D;
import d8.InterfaceC2376x;
import e8.C2431a;
import j7.AbstractC2800q;
import j8.C2810e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k8.b;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import t8.C3381d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class D extends O7.H {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f12952u = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(D.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(D.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b8.u f12953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final X7.k f12954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C2810e f12955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final B8.i f12956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1542f f12957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final B8.i f12958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final M7.h f12959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B8.i f12960t;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12961a;

        static {
            int[] iArr = new int[C2431a.EnumC0258a.values().length];
            try {
                iArr[C2431a.EnumC0258a.f25959o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2431a.EnumC0258a.f25956l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12961a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(X7.k outerContext, b8.u jPackage) {
        super(outerContext.d(), jPackage.d());
        AbstractC2855l.g(outerContext, "outerContext");
        AbstractC2855l.g(jPackage, "jPackage");
        this.f12953m = jPackage;
        X7.k kVarF = X7.c.f(outerContext, this, null, 0, 6, null);
        this.f12954n = kVarF;
        this.f12955o = M8.c.a(outerContext.a().b().f().g());
        this.f12956p = kVarF.e().e(new A(this));
        this.f12957q = new C1542f(kVarF, jPackage, this);
        this.f12958r = kVarF.e().b(new B(this), AbstractC2800q.j());
        this.f12959s = kVarF.a().i().b() ? M7.h.f7570a.b() : X7.h.a(kVarF, jPackage);
        this.f12960t = kVarF.e().e(new C(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map J0(D d10) {
        InterfaceC2346D interfaceC2346DO = d10.f12954n.a().o();
        String strB = d10.d().b();
        AbstractC2855l.f(strB, "asString(...)");
        List<String> listA = interfaceC2346DO.a(strB);
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            b.a aVar = k8.b.f29200d;
            k8.c cVarE = C3381d.d(str).e();
            AbstractC2855l.f(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            InterfaceC2376x interfaceC2376xB = AbstractC2375w.b(d10.f12954n.a().j(), aVar.c(cVarE), d10.f12955o);
            Pair pairA = interfaceC2376xB != null ? i7.t.a(str, interfaceC2376xB) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return j7.K.r(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap O0(D d10) {
        HashMap map = new HashMap();
        for (Map.Entry entry : d10.L0().entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC2376x interfaceC2376x = (InterfaceC2376x) entry.getValue();
            C3381d c3381dD = C3381d.d(str);
            AbstractC2855l.f(c3381dD, "byInternalName(...)");
            C2431a c2431aA = interfaceC2376x.a();
            int i10 = a.f12961a[c2431aA.c().ordinal()];
            if (i10 == 1) {
                String strE = c2431aA.e();
                if (strE != null) {
                    map.put(c3381dD, C3381d.d(strE));
                }
            } else if (i10 == 2) {
                map.put(c3381dD, c3381dD);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List P0(D d10) {
        Collection collectionW = d10.f12953m.w();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionW, 10));
        Iterator it = collectionW.iterator();
        while (it.hasNext()) {
            arrayList.add(((b8.u) it.next()).d());
        }
        return arrayList;
    }

    public final InterfaceC1280e K0(InterfaceC1823g jClass) {
        AbstractC2855l.g(jClass, "jClass");
        return this.f12957q.i().k0(jClass);
    }

    public final Map L0() {
        return (Map) B8.m.a(this.f12956p, this, f12952u[0]);
    }

    @Override // L7.N
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public C1542f o() {
        return this.f12957q;
    }

    public final List N0() {
        return (List) this.f12958r.invoke();
    }

    @Override // O7.H, O7.AbstractC1335n, L7.InterfaceC1291p
    public h0 g() {
        return new C2377y(this);
    }

    @Override // M7.b, M7.a
    public M7.h getAnnotations() {
        return this.f12959s;
    }

    @Override // O7.H, O7.AbstractC1334m
    public String toString() {
        return "Lazy Java package fragment: " + d() + " of module " + this.f12954n.a().m();
    }
}
