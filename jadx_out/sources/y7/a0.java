package Y7;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.g0;
import M8.b;
import b8.InterfaceC1823g;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3026h;
import v8.C3435d;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1823g f13017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final W7.c f13018o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(X7.k c10, InterfaceC1823g jClass, W7.c ownerDescriptor) {
        super(c10);
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(jClass, "jClass");
        AbstractC2855l.g(ownerDescriptor, "ownerDescriptor");
        this.f13017n = jClass;
        this.f13018o = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(b8.q it) {
        AbstractC2855l.g(it, "it");
        return it.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n0(k8.f fVar, InterfaceC3442k it) {
        AbstractC2855l.g(it, "it");
        return it.d(fVar, T7.d.f10640u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection o0(InterfaceC3442k it) {
        AbstractC2855l.g(it, "it");
        return it.c();
    }

    private final Set p0(InterfaceC1280e interfaceC1280e, Set set, Function1 function1) {
        M8.b.b(AbstractC2800q.e(interfaceC1280e), Y.f13014a, new a(interfaceC1280e, set, function1));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable q0(InterfaceC1280e interfaceC1280e) {
        Collection collectionG = interfaceC1280e.j().g();
        AbstractC2855l.f(collectionG, "getSupertypes(...)");
        return O8.l.t(O8.l.K(AbstractC2800q.V(collectionG), Z.f13015g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1280e r0(C8.S s10) {
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP instanceof InterfaceC1280e) {
            return (InterfaceC1280e) interfaceC1283hP;
        }
        return null;
    }

    private final L7.Z t0(L7.Z z10) {
        if (z10.getKind().h()) {
            return z10;
        }
        Collection<L7.Z> collectionE = z10.e();
        AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionE, 10));
        for (L7.Z z11 : collectionE) {
            AbstractC2855l.d(z11);
            arrayList.add(t0(z11));
        }
        return (L7.Z) AbstractC2800q.C0(AbstractC2800q.Y(arrayList));
    }

    private final Set u0(k8.f fVar, InterfaceC1280e interfaceC1280e) {
        a0 a0VarB = W7.h.b(interfaceC1280e);
        return a0VarB == null ? j7.T.e() : AbstractC2800q.T0(a0VarB.b(fVar, T7.d.f10640u));
    }

    @Override // Y7.U
    protected void B(Collection result, k8.f name) {
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(name, "name");
        Collection collectionE = V7.a.e(name, u0(name, R()), result, R(), L().a().c(), L().a().k().a());
        AbstractC2855l.f(collectionE, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionE);
        if (this.f13017n.x()) {
            if (AbstractC2855l.b(name, I7.o.f5121f)) {
                g0 g0VarG = AbstractC3026h.g(R());
                AbstractC2855l.f(g0VarG, "createEnumValueOfMethod(...)");
                result.add(g0VarG);
            } else if (AbstractC2855l.b(name, I7.o.f5119d)) {
                g0 g0VarH = AbstractC3026h.h(R());
                AbstractC2855l.f(g0VarH, "createEnumValuesMethod(...)");
                result.add(g0VarH);
            }
        }
    }

    @Override // Y7.b0, Y7.U
    protected void C(k8.f name, Collection result) {
        k8.f fVar;
        Collection collection;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(result, "result");
        Set setP0 = p0(R(), new LinkedHashSet(), new X(name));
        if (result.isEmpty()) {
            fVar = name;
            collection = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP0) {
                L7.Z zT0 = t0((L7.Z) obj);
                Object arrayList = linkedHashMap.get(zT0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(zT0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE = V7.a.e(fVar, (Collection) ((Map.Entry) it.next()).getValue(), collection, R(), L().a().c(), L().a().k().a());
                AbstractC2855l.f(collectionE, "resolveOverridesForStaticMembers(...)");
                AbstractC2800q.A(arrayList2, collectionE);
            }
            collection.addAll(arrayList2);
        } else {
            Collection collectionE2 = V7.a.e(name, setP0, result, R(), L().a().c(), L().a().k().a());
            fVar = name;
            collection = result;
            AbstractC2855l.f(collectionE2, "resolveOverridesForStaticMembers(...)");
            collection.addAll(collectionE2);
        }
        if (this.f13017n.x() && AbstractC2855l.b(fVar, I7.o.f5120e)) {
            M8.a.a(collection, AbstractC3026h.f(R()));
        }
    }

    @Override // Y7.U
    protected Set D(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        Set setS0 = AbstractC2800q.S0(((InterfaceC1539c) N().invoke()).e());
        p0(R(), setS0, W.f13012g);
        if (this.f13017n.x()) {
            setS0.add(I7.o.f5120e);
        }
        return setS0;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y7.U
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C1538b z() {
        return new C1538b(this.f13017n, V.f13011g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y7.U
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public W7.c R() {
        return this.f13018o;
    }

    @Override // Y7.U
    protected Set v(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        return j7.T.e();
    }

    @Override // Y7.U
    protected Set x(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        Set setS0 = AbstractC2800q.S0(((InterfaceC1539c) N().invoke()).b());
        a0 a0VarB = W7.h.b(R());
        Set setA = a0VarB != null ? a0VarB.a() : null;
        if (setA == null) {
            setA = j7.T.e();
        }
        setS0.addAll(setA);
        if (this.f13017n.x()) {
            setS0.addAll(AbstractC2800q.m(I7.o.f5121f, I7.o.f5119d));
        }
        setS0.addAll(L().a().w().b(R(), L()));
        return setS0;
    }

    @Override // Y7.U
    protected void y(Collection result, k8.f name) {
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(name, "name");
        L().a().w().c(R(), name, result, L());
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends b.AbstractC0071b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1280e f13019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f13020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f13021c;

        a(InterfaceC1280e interfaceC1280e, Set set, Function1 function1) {
            this.f13019a = interfaceC1280e;
            this.f13020b = set;
            this.f13021c = function1;
        }

        @Override // M8.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return C2735B.f28704a;
        }

        @Override // M8.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1280e current) {
            AbstractC2855l.g(current, "current");
            if (current == this.f13019a) {
                return true;
            }
            InterfaceC3442k interfaceC3442kP = current.P();
            AbstractC2855l.f(interfaceC3442kP, "getStaticScope(...)");
            if (!(interfaceC3442kP instanceof b0)) {
                return true;
            }
            this.f13020b.addAll((Collection) this.f13021c.invoke(interfaceC3442kP));
            return false;
        }

        public void e() {
        }
    }
}
