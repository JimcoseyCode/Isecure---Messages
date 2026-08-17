package Y7;

import C8.AbstractC0407d0;
import C8.I0;
import C8.N0;
import L7.AbstractC1299y;
import L7.InterfaceC1280e;
import L7.t0;
import a8.InterfaceC1599a;
import b8.InterfaceC1817a;
import b8.InterfaceC1818b;
import b8.InterfaceC1819c;
import b8.InterfaceC1821e;
import b8.InterfaceC1823g;
import b8.InterfaceC1824h;
import b8.InterfaceC1829m;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q8.C3136a;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: Y7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1546j implements W7.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f13040i = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C1546j.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C1546j.class), NotificationsService.EVENT_TYPE_KEY, "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C1546j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.k f13041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1817a f13042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.j f13043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.i f13044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1599a f13045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B8.i f13046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f13047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f13048h;

    public C1546j(X7.k c10, InterfaceC1817a javaAnnotation, boolean z10) {
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(javaAnnotation, "javaAnnotation");
        this.f13041a = c10;
        this.f13042b = javaAnnotation;
        this.f13043c = c10.e().g(new C1543g(this));
        this.f13044d = c10.e().e(new C1544h(this));
        this.f13045e = c10.a().t().a(javaAnnotation);
        this.f13046f = c10.e().e(new C1545i(this));
        this.f13047g = javaAnnotation.e();
        this.f13048h = javaAnnotation.s() || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h(C1546j c1546j) {
        Collection<InterfaceC1818b> arguments = c1546j.f13042b.getArguments();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1818b interfaceC1818b : arguments) {
            k8.f name = interfaceC1818b.getName();
            if (name == null) {
                name = U7.I.f11398c;
            }
            q8.g gVarN = c1546j.n(interfaceC1818b);
            Pair pairA = gVarN != null ? i7.t.a(name, gVarN) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return j7.K.r(arrayList);
    }

    private final InterfaceC1280e i(k8.c cVar) {
        return AbstractC1299y.d(this.f13041a.d(), k8.b.f29200d.c(cVar), this.f13041a.a().b().f().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k8.c j(C1546j c1546j) {
        k8.b bVarC = c1546j.f13042b.c();
        if (bVarC != null) {
            return bVarC.a();
        }
        return null;
    }

    private final q8.g n(InterfaceC1818b interfaceC1818b) {
        if (interfaceC1818b instanceof b8.o) {
            return q8.i.f(q8.i.f30873a, ((b8.o) interfaceC1818b).getValue(), null, 2, null);
        }
        if (interfaceC1818b instanceof InterfaceC1829m) {
            InterfaceC1829m interfaceC1829m = (InterfaceC1829m) interfaceC1818b;
            return q(interfaceC1829m.b(), interfaceC1829m.d());
        }
        if (!(interfaceC1818b instanceof InterfaceC1821e)) {
            if (interfaceC1818b instanceof InterfaceC1819c) {
                return o(((InterfaceC1819c) interfaceC1818b).a());
            }
            if (interfaceC1818b instanceof InterfaceC1824h) {
                return r(((InterfaceC1824h) interfaceC1818b).c());
            }
            return null;
        }
        InterfaceC1821e interfaceC1821e = (InterfaceC1821e) interfaceC1818b;
        k8.f name = interfaceC1821e.getName();
        if (name == null) {
            name = U7.I.f11398c;
        }
        AbstractC2855l.d(name);
        return p(name, interfaceC1821e.e());
    }

    private final q8.g o(InterfaceC1817a interfaceC1817a) {
        return new C3136a(new C1546j(this.f13041a, interfaceC1817a, false, 4, null));
    }

    private final q8.g p(k8.f fVar, List list) {
        C8.S sL;
        if (C8.W.a(getType())) {
            return null;
        }
        InterfaceC1280e interfaceC1280eL = AbstractC3340e.l(this);
        AbstractC2855l.d(interfaceC1280eL);
        t0 t0VarB = V7.a.b(fVar, interfaceC1280eL);
        if (t0VarB == null || (sL = t0VarB.getType()) == null) {
            sL = this.f13041a.a().m().n().l(N0.f592k, E8.l.d(E8.k.f1186K0, new String[0]));
            AbstractC2855l.f(sL, "getArrayType(...)");
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q8.g gVarN = n((InterfaceC1818b) it.next());
            if (gVarN == null) {
                gVarN = new q8.u();
            }
            arrayList.add(gVarN);
        }
        return q8.i.f30873a.b(arrayList, sL);
    }

    private final q8.g q(k8.b bVar, k8.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new q8.k(bVar, fVar);
    }

    private final q8.g r(b8.x xVar) {
        return q8.s.f30891b.a(this.f13041a.g().p(xVar, Z7.b.b(I0.f575h, false, false, null, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 s(C1546j c1546j) {
        k8.c cVarD = c1546j.d();
        if (cVarD == null) {
            return E8.l.d(E8.k.f1188L0, c1546j.f13042b.toString());
        }
        InterfaceC1280e interfaceC1280eF = K7.d.f(K7.d.f7130a, cVarD, c1546j.f13041a.d().n(), null, 4, null);
        if (interfaceC1280eF == null) {
            InterfaceC1823g interfaceC1823gResolve = c1546j.f13042b.resolve();
            interfaceC1280eF = interfaceC1823gResolve != null ? c1546j.f13041a.a().n().a(interfaceC1823gResolve) : null;
            if (interfaceC1280eF == null) {
                interfaceC1280eF = c1546j.i(cVarD);
            }
        }
        return interfaceC1280eF.r();
    }

    @Override // M7.c
    public Map a() {
        return (Map) B8.m.a(this.f13046f, this, f13040i[2]);
    }

    @Override // M7.c
    public k8.c d() {
        return (k8.c) B8.m.b(this.f13043c, this, f13040i[0]);
    }

    @Override // W7.g
    public boolean e() {
        return this.f13047g;
    }

    @Override // M7.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC1599a g() {
        return this.f13045e;
    }

    @Override // M7.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC0407d0 getType() {
        return (AbstractC0407d0) B8.m.a(this.f13044d, this, f13040i[1]);
    }

    public final boolean m() {
        return this.f13048h;
    }

    public String toString() {
        return n8.n.Q(n8.n.f30122h, this, null, 2, null);
    }

    public /* synthetic */ C1546j(X7.k kVar, InterfaceC1817a interfaceC1817a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC1817a, (i10 & 4) != 0 ? false : z10);
    }
}
