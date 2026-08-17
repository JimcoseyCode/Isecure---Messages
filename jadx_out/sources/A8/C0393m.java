package A8;

import C8.AbstractC0402b;
import C8.AbstractC0407d0;
import C8.v0;
import L7.AbstractC1295u;
import L7.C1296v;
import L7.EnumC1281f;
import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.M;
import L7.Z;
import L7.f0;
import L7.g0;
import L7.h0;
import L7.k0;
import L7.q0;
import L7.r0;
import L7.t0;
import O7.AbstractC1322a;
import O7.AbstractC1339s;
import O7.C1330i;
import O7.C1338q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f8.c;
import h8.AbstractC2708a;
import h8.AbstractC2709b;
import h8.InterfaceC2710c;
import h8.h;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3026h;
import o8.AbstractC3031m;
import o8.C3019a;
import o8.C3033o;
import s8.AbstractC3340e;
import v8.AbstractC3443l;
import v8.C3435d;
import v8.C3448q;
import v8.InterfaceC3442k;
import v8.InterfaceC3445n;
import w8.C3496b;
import y8.AbstractC3638L;
import y8.C3637K;
import y8.C3652n;
import y8.C3654p;
import y8.InterfaceC3660w;
import y8.N;
import y8.X;

/* JADX INFO: renamed from: A8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0393m extends AbstractC1322a implements InterfaceC1288m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final B8.i f148A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final B8.j f149B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final B8.i f150C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final B8.j f151D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final N.a f152E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final M7.h f153F;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f8.c f154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AbstractC2708a f155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h0 f156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k8.b f157o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final L7.E f158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1295u f159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final EnumC1281f f160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C3654p f161s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f162t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AbstractC3443l f163u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final b f164v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final f0 f165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final c f166x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final InterfaceC1288m f167y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final B8.j f168z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A8.m$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class b extends AbstractC0402b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final B8.i f174d;

        public b() {
            super(C0393m.this.a1().h());
            this.f174d = C0393m.this.a1().h().e(new C0394n(C0393m.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List K(C0393m c0393m) {
            return q0.g(c0393m);
        }

        @Override // C8.AbstractC0435v, C8.v0
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C0393m p() {
            return C0393m.this;
        }

        @Override // C8.v0
        public List getParameters() {
            return (List) this.f174d.invoke();
        }

        @Override // C8.AbstractC0430p
        protected Collection m() {
            String strJ;
            k8.c cVarA;
            List listO = h8.f.o(C0393m.this.b1(), C0393m.this.a1().j());
            C0393m c0393m = C0393m.this;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(c0393m.a1().i().u((f8.q) it.next()));
            }
            List listZ0 = AbstractC2800q.z0(arrayList, C0393m.this.a1().c().c().a(C0393m.this));
            ArrayList<M.b> arrayList2 = new ArrayList();
            Iterator it2 = listZ0.iterator();
            while (it2.hasNext()) {
                InterfaceC1283h interfaceC1283hP = ((C8.S) it2.next()).K0().p();
                M.b bVar = interfaceC1283hP instanceof M.b ? (M.b) interfaceC1283hP : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC3660w interfaceC3660wJ = C0393m.this.a1().c().j();
                C0393m c0393m2 = C0393m.this;
                ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(arrayList2, 10));
                for (M.b bVar2 : arrayList2) {
                    k8.b bVarN = AbstractC3340e.n(bVar2);
                    if (bVarN == null || (cVarA = bVarN.a()) == null || (strJ = cVarA.b()) == null) {
                        strJ = bVar2.getName().j();
                        AbstractC2855l.f(strJ, "asString(...)");
                    }
                    arrayList3.add(strJ);
                }
                interfaceC3660wJ.b(c0393m2, arrayList3);
            }
            return AbstractC2800q.P0(listZ0);
        }

        @Override // C8.v0
        public boolean q() {
            return true;
        }

        public String toString() {
            String string = C0393m.this.getName().toString();
            AbstractC2855l.f(string, "toString(...)");
            return string;
        }

        @Override // C8.AbstractC0430p
        protected k0 u() {
            return k0.a.f7338a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A8.m$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final B8.h f177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final B8.i f178c;

        public c() {
            List listC0 = C0393m.this.b1().C0();
            AbstractC2855l.f(listC0, "getEnumEntryList(...)");
            LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(listC0, 10)), 16));
            for (Object obj : listC0) {
                linkedHashMap.put(AbstractC3638L.b(C0393m.this.a1().g(), ((f8.g) obj).E()), obj);
            }
            this.f176a = linkedHashMap;
            this.f177b = C0393m.this.a1().h().i(new C0395o(this, C0393m.this));
            this.f178c = C0393m.this.a1().h().e(new C0396p(this));
        }

        private final Set e() {
            HashSet hashSet = new HashSet();
            Iterator it = C0393m.this.j().g().iterator();
            while (it.hasNext()) {
                for (InterfaceC1288m interfaceC1288m : InterfaceC3445n.a.a(((C8.S) it.next()).o(), null, null, 3, null)) {
                    if ((interfaceC1288m instanceof g0) || (interfaceC1288m instanceof Z)) {
                        hashSet.add(((InterfaceC1277b) interfaceC1288m).getName());
                    }
                }
            }
            List listH0 = C0393m.this.b1().H0();
            AbstractC2855l.f(listH0, "getFunctionList(...)");
            C0393m c0393m = C0393m.this;
            Iterator it2 = listH0.iterator();
            while (it2.hasNext()) {
                hashSet.add(AbstractC3638L.b(c0393m.a1().g(), ((f8.i) it2.next()).c0()));
            }
            List listV0 = C0393m.this.b1().V0();
            AbstractC2855l.f(listV0, "getPropertyList(...)");
            C0393m c0393m2 = C0393m.this;
            Iterator it3 = listV0.iterator();
            while (it3.hasNext()) {
                hashSet.add(AbstractC3638L.b(c0393m2.a1().g(), ((f8.n) it3.next()).b0()));
            }
            return j7.T.k(hashSet, hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC1280e f(c cVar, C0393m c0393m, k8.f name) {
            AbstractC2855l.g(name, "name");
            f8.g gVar = (f8.g) cVar.f176a.get(name);
            if (gVar != null) {
                return C1338q.I0(c0393m.a1().h(), c0393m, name, cVar.f178c, new C0381a(c0393m.a1().h(), new C0397q(c0393m, gVar)), h0.f7335a);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(C0393m c0393m, f8.g gVar) {
            return AbstractC2800q.P0(c0393m.a1().c().d().k(c0393m.f1(), gVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set h(c cVar) {
            return cVar.e();
        }

        public final Collection d() {
            Set setKeySet = this.f176a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                InterfaceC1280e interfaceC1280eI = i((k8.f) it.next());
                if (interfaceC1280eI != null) {
                    arrayList.add(interfaceC1280eI);
                }
            }
            return arrayList;
        }

        public final InterfaceC1280e i(k8.f name) {
            AbstractC2855l.g(name, "name");
            return (InterfaceC1280e) this.f177b.invoke(name);
        }
    }

    /* JADX INFO: renamed from: A8.m$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class d extends AbstractC2852i implements Function1 {
        d(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "simpleType";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(AbstractC2855l.a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final AbstractC0407d0 invoke(f8.q p02) {
            AbstractC2855l.g(p02, "p0");
            return X.q((X) this.receiver, p02, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: A8.m$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class e extends AbstractC2852i implements Function1 {
        e(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "getValueClassPropertyType";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(C0393m.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final AbstractC0407d0 invoke(k8.f p02) {
            AbstractC2855l.g(p02, "p0");
            return ((C0393m) this.receiver).g1(p02);
        }
    }

    /* JADX INFO: renamed from: A8.m$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class f extends AbstractC2852i implements Function1 {
        f(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final a invoke(D8.g p02) {
            AbstractC2855l.g(p02, "p0");
            return new a((C0393m) this.receiver, p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0393m(C3654p outerContext, f8.c classProto, InterfaceC2710c nameResolver, AbstractC2708a metadataVersion, h0 sourceElement) {
        AbstractC3443l c3448q;
        super(outerContext.h(), AbstractC3638L.a(nameResolver, classProto.E0()).h());
        AbstractC2855l.g(outerContext, "outerContext");
        AbstractC2855l.g(classProto, "classProto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        AbstractC2855l.g(sourceElement, "sourceElement");
        this.f154l = classProto;
        this.f155m = metadataVersion;
        this.f156n = sourceElement;
        this.f157o = AbstractC3638L.a(nameResolver, classProto.E0());
        y8.O o10 = y8.O.f34047a;
        this.f158p = o10.b((f8.k) AbstractC2709b.f28535e.d(classProto.D0()));
        this.f159q = y8.P.a(o10, (f8.x) AbstractC2709b.f28534d.d(classProto.D0()));
        EnumC1281f enumC1281fA = o10.a((c.EnumC0277c) AbstractC2709b.f28536f.d(classProto.D0()));
        this.f160r = enumC1281fA;
        List listG1 = classProto.g1();
        AbstractC2855l.f(listG1, "getTypeParameterList(...)");
        f8.t tVarH1 = classProto.h1();
        AbstractC2855l.f(tVarH1, "getTypeTable(...)");
        h8.g gVar = new h8.g(tVarH1);
        h.a aVar = h8.h.f28564b;
        f8.w wVarJ1 = classProto.j1();
        AbstractC2855l.f(wVarJ1, "getVersionRequirementTable(...)");
        C3654p c3654pA = outerContext.a(this, listG1, nameResolver, gVar, aVar.a(wVarJ1), metadataVersion);
        this.f161s = c3654pA;
        Boolean boolD = AbstractC2709b.f28543m.d(classProto.D0());
        AbstractC2855l.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        this.f162t = zBooleanValue;
        EnumC1281f enumC1281f = EnumC1281f.f7322j;
        if (enumC1281fA == enumC1281f) {
            c3448q = new C3448q(c3654pA.h(), this, zBooleanValue || AbstractC2855l.b(c3654pA.c().i().a(), Boolean.TRUE));
        } else {
            c3448q = InterfaceC3442k.b.f32996b;
        }
        this.f163u = c3448q;
        this.f164v = new b();
        this.f165w = f0.f7329e.a(this, c3654pA.h(), c3654pA.c().n().d(), new f(this));
        this.f166x = enumC1281fA == enumC1281f ? new c() : null;
        InterfaceC1288m interfaceC1288mE = outerContext.e();
        this.f167y = interfaceC1288mE;
        this.f168z = c3654pA.h().g(new C0384d(this));
        this.f148A = c3654pA.h().e(new C0385e(this));
        this.f149B = c3654pA.h().g(new C0386f(this));
        this.f150C = c3654pA.h().e(new C0387g(this));
        this.f151D = c3654pA.h().g(new C0388h(this));
        InterfaceC2710c interfaceC2710cG = c3654pA.g();
        h8.g gVarJ = c3654pA.j();
        C0393m c0393m = interfaceC1288mE instanceof C0393m ? (C0393m) interfaceC1288mE : null;
        this.f152E = new N.a(classProto, interfaceC2710cG, gVarJ, sourceElement, c0393m != null ? c0393m.f152E : null);
        this.f153F = !AbstractC2709b.f28533c.d(classProto.D0()).booleanValue() ? M7.h.f7570a.b() : new T(c3654pA.h(), new C0389i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List R0(C0393m c0393m) {
        return AbstractC2800q.P0(c0393m.f161s.c().d().d(c0393m.f152E));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1280e S0(C0393m c0393m) {
        return c0393m.T0();
    }

    private final InterfaceC1280e T0() {
        if (!this.f154l.k1()) {
            return null;
        }
        InterfaceC1283h interfaceC1283hF = c1().f(AbstractC3638L.b(this.f161s.g(), this.f154l.q0()), T7.d.f10643x);
        if (interfaceC1283hF instanceof InterfaceC1280e) {
            return (InterfaceC1280e) interfaceC1283hF;
        }
        return null;
    }

    private final Collection U0() {
        return AbstractC2800q.z0(AbstractC2800q.z0(W0(), AbstractC2800q.n(O())), this.f161s.c().c().b(this));
    }

    private final InterfaceC1279d V0() {
        Object next;
        if (this.f160r.j()) {
            C1330i c1330iL = AbstractC3026h.l(this, h0.f7335a);
            c1330iL.d1(r());
            return c1330iL;
        }
        List listT0 = this.f154l.t0();
        AbstractC2855l.f(listT0, "getConstructorList(...)");
        Iterator it = listT0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!AbstractC2709b.f28544n.d(((f8.d) next).I()).booleanValue()) {
                break;
            }
        }
        f8.d dVar = (f8.d) next;
        if (dVar != null) {
            return this.f161s.f().r(dVar, true);
        }
        return null;
    }

    private final List W0() {
        List listT0 = this.f154l.t0();
        AbstractC2855l.f(listT0, "getConstructorList(...)");
        ArrayList<f8.d> arrayList = new ArrayList();
        for (Object obj : listT0) {
            Boolean boolD = AbstractC2709b.f28544n.d(((f8.d) obj).I());
            AbstractC2855l.f(boolD, "get(...)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
        for (f8.d dVar : arrayList) {
            C3637K c3637kF = this.f161s.f();
            AbstractC2855l.d(dVar);
            arrayList2.add(c3637kF.r(dVar, false));
        }
        return arrayList2;
    }

    private final Collection X0() {
        if (this.f158p != L7.E.f7284i) {
            return AbstractC2800q.j();
        }
        List<Integer> listW0 = this.f154l.W0();
        AbstractC2855l.d(listW0);
        if (listW0.isEmpty()) {
            return C3019a.f30510a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listW0) {
            C3652n c3652nC = this.f161s.c();
            InterfaceC2710c interfaceC2710cG = this.f161s.g();
            AbstractC2855l.d(num);
            InterfaceC1280e interfaceC1280eB = c3652nC.b(AbstractC3638L.a(interfaceC2710cG, num.intValue()));
            if (interfaceC1280eB != null) {
                arrayList.add(interfaceC1280eB);
            }
        }
        return arrayList;
    }

    private final r0 Y0() {
        if (!isInline() && !l()) {
            return null;
        }
        r0 r0VarA = y8.Z.a(this.f154l, this.f161s.g(), this.f161s.j(), new d(this.f161s.i()), new e(this));
        if (r0VarA != null) {
            return r0VarA;
        }
        if (this.f155m.c(1, 5, 1)) {
            return null;
        }
        InterfaceC1279d interfaceC1279dO = O();
        if (interfaceC1279dO == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List listI = interfaceC1279dO.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        k8.f name = ((t0) AbstractC2800q.e0(listI)).getName();
        AbstractC2855l.f(name, "getName(...)");
        AbstractC0407d0 abstractC0407d0G1 = g1(name);
        if (abstractC0407d0G1 != null) {
            return new L7.A(name, abstractC0407d0G1);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection Z0(C0393m c0393m) {
        return c0393m.U0();
    }

    private final a c1() {
        return (a) this.f165w.c(this.f161s.c().n().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC0407d0 g1(k8.f fVar) {
        Iterator it = c1().d(fVar, T7.d.f10643x).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((Z) next).h0() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        Z z11 = (Z) obj;
        return (AbstractC0407d0) (z11 != null ? z11.getType() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1279d i1(C0393m c0393m) {
        return c0393m.V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection j1(C0393m c0393m) {
        return c0393m.X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 k1(C0393m c0393m) {
        return c0393m.Y0();
    }

    @Override // L7.D
    public boolean B0() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public boolean C() {
        Boolean boolD = AbstractC2709b.f28542l.d(this.f154l.D0());
        AbstractC2855l.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // O7.AbstractC1322a, L7.InterfaceC1280e
    public List D0() {
        List listB = h8.f.b(this.f154l, this.f161s.j());
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new O7.N(G0(), new C3496b(this, this.f161s.i().u((f8.q) it.next()), null, null), M7.h.f7570a.b()));
        }
        return arrayList;
    }

    @Override // L7.InterfaceC1280e
    public boolean F0() {
        Boolean boolD = AbstractC2709b.f28538h.d(this.f154l.D0());
        AbstractC2855l.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // L7.InterfaceC1280e
    public Collection I() {
        return (Collection) this.f150C.invoke();
    }

    @Override // L7.D
    public boolean J() {
        Boolean boolD = AbstractC2709b.f28540j.d(this.f154l.D0());
        AbstractC2855l.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // L7.InterfaceC1284i
    public boolean K() {
        Boolean boolD = AbstractC2709b.f28537g.d(this.f154l.D0());
        AbstractC2855l.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // O7.z
    protected InterfaceC3442k L(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f165w.c(kotlinTypeRefiner);
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1279d O() {
        return (InterfaceC1279d) this.f168z.invoke();
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1280e R() {
        return (InterfaceC1280e) this.f149B.invoke();
    }

    public final C3654p a1() {
        return this.f161s;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1289n, L7.InterfaceC1288m
    public InterfaceC1288m b() {
        return this.f167y;
    }

    public final f8.c b1() {
        return this.f154l;
    }

    public final AbstractC2708a d1() {
        return this.f155m;
    }

    @Override // L7.InterfaceC1280e
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public AbstractC3443l P() {
        return this.f163u;
    }

    @Override // L7.InterfaceC1280e
    public Collection f() {
        return (Collection) this.f148A.invoke();
    }

    public final N.a f1() {
        return this.f152E;
    }

    @Override // L7.InterfaceC1291p
    public h0 g() {
        return this.f156n;
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        return this.f153F;
    }

    @Override // L7.InterfaceC1280e
    public EnumC1281f getKind() {
        return this.f160r;
    }

    @Override // L7.InterfaceC1280e, L7.D, L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        return this.f159q;
    }

    public final boolean h1(k8.f name) {
        AbstractC2855l.g(name, "name");
        return c1().t().contains(name);
    }

    @Override // L7.D
    public boolean isExternal() {
        Boolean boolD = AbstractC2709b.f28539i.d(this.f154l.D0());
        AbstractC2855l.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // L7.InterfaceC1280e
    public boolean isInline() {
        return AbstractC2709b.f28541k.d(this.f154l.D0()).booleanValue() && this.f155m.e(1, 4, 1);
    }

    @Override // L7.InterfaceC1283h
    public v0 j() {
        return this.f164v;
    }

    @Override // L7.InterfaceC1280e, L7.D
    public L7.E k() {
        return this.f158p;
    }

    @Override // L7.InterfaceC1280e
    public boolean l() {
        return AbstractC2709b.f28541k.d(this.f154l.D0()).booleanValue() && this.f155m.c(1, 4, 2);
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1284i
    public List t() {
        return this.f161s.i().m();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        sb.append(J() ? "expect " : PointerEventHelper.POINTER_TYPE_UNKNOWN);
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // L7.InterfaceC1280e
    public r0 w0() {
        return (r0) this.f151D.invoke();
    }

    @Override // L7.InterfaceC1280e
    public boolean y() {
        return AbstractC2709b.f28536f.d(this.f154l.D0()) == c.EnumC0277c.COMPANION_OBJECT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A8.m$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class a extends w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final D8.g f169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final B8.i f170h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final B8.i f171i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C0393m f172j;

        /* JADX INFO: renamed from: A8.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0006a extends AbstractC3031m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f173a;

            C0006a(List list) {
                this.f173a = list;
            }

            @Override // o8.AbstractC3032n
            public void a(InterfaceC1277b fakeOverride) {
                AbstractC2855l.g(fakeOverride, "fakeOverride");
                C3033o.K(fakeOverride, null);
                this.f173a.add(fakeOverride);
            }

            @Override // o8.AbstractC3031m
            protected void e(InterfaceC1277b fromSuper, InterfaceC1277b fromCurrent) {
                AbstractC2855l.g(fromSuper, "fromSuper");
                AbstractC2855l.g(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof AbstractC1339s) {
                    ((AbstractC1339s) fromCurrent).R0(C1296v.f7360a, fromSuper);
                }
            }
        }

        public a(C0393m c0393m, D8.g kotlinTypeRefiner) {
            AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f172j = c0393m;
            C3654p c3654pA1 = c0393m.a1();
            List listH0 = c0393m.b1().H0();
            AbstractC2855l.f(listH0, "getFunctionList(...)");
            List listV0 = c0393m.b1().V0();
            AbstractC2855l.f(listV0, "getPropertyList(...)");
            List listD1 = c0393m.b1().d1();
            AbstractC2855l.f(listD1, "getTypeAliasList(...)");
            List listS0 = c0393m.b1().S0();
            AbstractC2855l.f(listS0, "getNestedClassNameList(...)");
            InterfaceC2710c interfaceC2710cG = c0393m.a1().g();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listS0, 10));
            Iterator it = listS0.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3638L.b(interfaceC2710cG, ((Number) it.next()).intValue()));
            }
            super(c3654pA1, listH0, listV0, listD1, new C0390j(arrayList));
            this.f169g = kotlinTypeRefiner;
            this.f170h = s().h().e(new C0391k(this));
            this.f171i = s().h().e(new C0392l(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(a aVar) {
            return aVar.m(C3435d.f32967o, InterfaceC3442k.f32993a.c(), T7.d.f10638s);
        }

        private final void G(k8.f fVar, Collection collection, List list) {
            s().c().n().a().v(fVar, collection, new ArrayList(list), H(), new C0006a(list));
        }

        private final C0393m H() {
            return this.f172j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection J(a aVar) {
            return aVar.f169g.g(aVar.H());
        }

        @Override // A8.w
        protected boolean A(g0 function) {
            AbstractC2855l.g(function, "function");
            return s().c().t().c(this.f172j, function);
        }

        public void I(k8.f name, T7.b location) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(location, "location");
            S7.a.a(s().c().p(), location, H(), name);
        }

        @Override // A8.w, v8.AbstractC3443l, v8.InterfaceC3442k
        public Collection b(k8.f name, T7.b location) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(location, "location");
            I(name, location);
            return super.b(name, location);
        }

        @Override // A8.w, v8.AbstractC3443l, v8.InterfaceC3442k
        public Collection d(k8.f name, T7.b location) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(location, "location");
            I(name, location);
            return super.d(name, location);
        }

        @Override // A8.w, v8.AbstractC3443l, v8.InterfaceC3445n
        public InterfaceC1283h f(k8.f name, T7.b location) {
            InterfaceC1280e interfaceC1280eI;
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(location, "location");
            I(name, location);
            c cVar = H().f166x;
            return (cVar == null || (interfaceC1280eI = cVar.i(name)) == null) ? super.f(name, location) : interfaceC1280eI;
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3445n
        public Collection g(C3435d kindFilter, Function1 nameFilter) {
            AbstractC2855l.g(kindFilter, "kindFilter");
            AbstractC2855l.g(nameFilter, "nameFilter");
            return (Collection) this.f170h.invoke();
        }

        @Override // A8.w
        protected void j(Collection result, Function1 nameFilter) {
            AbstractC2855l.g(result, "result");
            AbstractC2855l.g(nameFilter, "nameFilter");
            c cVar = H().f166x;
            Collection collectionD = cVar != null ? cVar.d() : null;
            if (collectionD == null) {
                collectionD = AbstractC2800q.j();
            }
            result.addAll(collectionD);
        }

        @Override // A8.w
        protected void n(k8.f name, List functions) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f171i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((C8.S) it.next()).o().b(name, T7.d.f10637r));
            }
            functions.addAll(s().c().c().e(name, this.f172j));
            G(name, arrayList, functions);
        }

        @Override // A8.w
        protected void o(k8.f name, List descriptors) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f171i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((C8.S) it.next()).o().d(name, T7.d.f10637r));
            }
            G(name, arrayList, descriptors);
        }

        @Override // A8.w
        protected k8.b p(k8.f name) {
            AbstractC2855l.g(name, "name");
            return this.f172j.f157o.d(name);
        }

        @Override // A8.w
        protected Set v() {
            List listG = H().f164v.g();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                Set setE = ((C8.S) it.next()).o().e();
                if (setE == null) {
                    return null;
                }
                AbstractC2800q.A(linkedHashSet, setE);
            }
            return linkedHashSet;
        }

        @Override // A8.w
        protected Set w() {
            List listG = H().f164v.g();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                AbstractC2800q.A(linkedHashSet, ((C8.S) it.next()).o().a());
            }
            linkedHashSet.addAll(s().c().c().d(this.f172j));
            return linkedHashSet;
        }

        @Override // A8.w
        protected Set x() {
            List listG = H().f164v.g();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                AbstractC2800q.A(linkedHashSet, ((C8.S) it.next()).o().c());
            }
            return linkedHashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(List list) {
            return list;
        }
    }
}
