package A8;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.Z;
import L7.g0;
import L7.l0;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import m8.AbstractC2942a;
import o8.C3030l;
import v8.AbstractC3443l;
import v8.C3435d;
import w7.InterfaceC3487a;
import y8.AbstractC3638L;
import y8.C3637K;
import y8.C3654p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends AbstractC3443l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f192f = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(w.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(w.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3654p f193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.i f195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.j f196e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface a {
        Set a();

        Collection b(k8.f fVar, T7.b bVar);

        Set c();

        Collection d(k8.f fVar, T7.b bVar);

        void e(Collection collection, C3435d c3435d, Function1 function1, T7.b bVar);

        Set f();

        l0 g(k8.f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class b implements a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final /* synthetic */ C7.k[] f197o = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final B8.i f201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final B8.i f202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final B8.i f203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final B8.i f204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final B8.i f205h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final B8.i f206i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final B8.i f207j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final B8.i f208k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final B8.i f209l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final B8.i f210m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w f211n;

        public b(w wVar, List functionList, List propertyList, List typeAliasList) {
            AbstractC2855l.g(functionList, "functionList");
            AbstractC2855l.g(propertyList, "propertyList");
            AbstractC2855l.g(typeAliasList, "typeAliasList");
            this.f211n = wVar;
            this.f198a = functionList;
            this.f199b = propertyList;
            this.f200c = wVar.s().c().g().g() ? typeAliasList : AbstractC2800q.j();
            this.f201d = wVar.s().h().e(new x(this));
            this.f202e = wVar.s().h().e(new y(this));
            this.f203f = wVar.s().h().e(new z(this));
            this.f204g = wVar.s().h().e(new A(this));
            this.f205h = wVar.s().h().e(new B(this));
            this.f206i = wVar.s().h().e(new C(this));
            this.f207j = wVar.s().h().e(new D(this));
            this.f208k = wVar.s().h().e(new E(this));
            this.f209l = wVar.s().h().e(new F(this, wVar));
            this.f210m = wVar.s().h().e(new G(this, wVar));
        }

        private final List A() {
            List list = this.f200c;
            w wVar = this.f211n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l0 l0VarZ = wVar.s().f().z((f8.r) ((m8.p) it.next()));
                if (l0VarZ != null) {
                    arrayList.add(l0VarZ);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set D(b bVar, w wVar) {
            List list = bVar.f198a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f211n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC3638L.b(wVar2.s().g(), ((f8.i) ((m8.p) it.next())).c0()));
            }
            return j7.T.k(linkedHashSet, wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map E(b bVar) {
            List listF = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listF) {
                k8.f name = ((g0) obj).getName();
                AbstractC2855l.f(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List F() {
            return (List) B8.m.a(this.f204g, this, f197o[3]);
        }

        private final List G() {
            return (List) B8.m.a(this.f205h, this, f197o[4]);
        }

        private final List H() {
            return (List) B8.m.a(this.f203f, this, f197o[2]);
        }

        private final List I() {
            return (List) B8.m.a(this.f201d, this, f197o[0]);
        }

        private final List J() {
            return (List) B8.m.a(this.f202e, this, f197o[1]);
        }

        private final Map K() {
            return (Map) B8.m.a(this.f207j, this, f197o[6]);
        }

        private final Map L() {
            return (Map) B8.m.a(this.f208k, this, f197o[7]);
        }

        private final Map M() {
            return (Map) B8.m.a(this.f206i, this, f197o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map N(b bVar) {
            List listG = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listG) {
                k8.f name = ((Z) obj).getName();
                AbstractC2855l.f(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map O(b bVar) {
            List listH = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(listH, 10)), 16));
            for (Object obj : listH) {
                k8.f name = ((l0) obj).getName();
                AbstractC2855l.f(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set P(b bVar, w wVar) {
            List list = bVar.f199b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f211n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC3638L.b(wVar2.s().g(), ((f8.n) ((m8.p) it.next())).b0()));
            }
            return j7.T.k(linkedHashSet, wVar.x());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List r(b bVar) {
            return AbstractC2800q.z0(bVar.I(), bVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List s(b bVar) {
            return AbstractC2800q.z0(bVar.J(), bVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List u() {
            Set setW = this.f211n.w();
            ArrayList arrayList = new ArrayList();
            Iterator it = setW.iterator();
            while (it.hasNext()) {
                AbstractC2800q.A(arrayList, x((k8.f) it.next()));
            }
            return arrayList;
        }

        private final List v() {
            Set setX = this.f211n.x();
            ArrayList arrayList = new ArrayList();
            Iterator it = setX.iterator();
            while (it.hasNext()) {
                AbstractC2800q.A(arrayList, y((k8.f) it.next()));
            }
            return arrayList;
        }

        private final List w() {
            List list = this.f198a;
            w wVar = this.f211n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g0 g0VarS = wVar.s().f().s((f8.i) ((m8.p) it.next()));
                if (!wVar.A(g0VarS)) {
                    g0VarS = null;
                }
                if (g0VarS != null) {
                    arrayList.add(g0VarS);
                }
            }
            return arrayList;
        }

        private final List x(k8.f fVar) {
            List listI = I();
            w wVar = this.f211n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (AbstractC2855l.b(((InterfaceC1288m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.n(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List y(k8.f fVar) {
            List listJ = J();
            w wVar = this.f211n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (AbstractC2855l.b(((InterfaceC1288m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List z() {
            List list = this.f199b;
            w wVar = this.f211n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Z zU = wVar.s().f().u((f8.n) ((m8.p) it.next()));
                if (zU != null) {
                    arrayList.add(zU);
                }
            }
            return arrayList;
        }

        @Override // A8.w.a
        public Set a() {
            return (Set) B8.m.a(this.f209l, this, f197o[8]);
        }

        @Override // A8.w.a
        public Collection b(k8.f name, T7.b location) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(location, "location");
            if (!a().contains(name)) {
                return AbstractC2800q.j();
            }
            Collection collection = (Collection) K().get(name);
            return collection == null ? AbstractC2800q.j() : collection;
        }

        @Override // A8.w.a
        public Set c() {
            return (Set) B8.m.a(this.f210m, this, f197o[9]);
        }

        @Override // A8.w.a
        public Collection d(k8.f name, T7.b location) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(location, "location");
            if (!c().contains(name)) {
                return AbstractC2800q.j();
            }
            Collection collection = (Collection) L().get(name);
            return collection == null ? AbstractC2800q.j() : collection;
        }

        @Override // A8.w.a
        public void e(Collection result, C3435d kindFilter, Function1 nameFilter, T7.b location) {
            AbstractC2855l.g(result, "result");
            AbstractC2855l.g(kindFilter, "kindFilter");
            AbstractC2855l.g(nameFilter, "nameFilter");
            AbstractC2855l.g(location, "location");
            if (kindFilter.a(C3435d.f32955c.i())) {
                for (Object obj : G()) {
                    k8.f name = ((Z) obj).getName();
                    AbstractC2855l.f(name, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(C3435d.f32955c.d())) {
                for (Object obj2 : F()) {
                    k8.f name2 = ((g0) obj2).getName();
                    AbstractC2855l.f(name2, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // A8.w.a
        public Set f() {
            List list = this.f200c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar = this.f211n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC3638L.b(wVar.s().g(), ((f8.r) ((m8.p) it.next())).V()));
            }
            return linkedHashSet;
        }

        @Override // A8.w.a
        public l0 g(k8.f name) {
            AbstractC2855l.g(name, "name");
            return (l0) M().get(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class c implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ C7.k[] f212j = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final B8.g f216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final B8.g f217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final B8.h f218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final B8.i f219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final B8.i f220h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w f221i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a implements InterfaceC3487a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m8.r f222g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f223h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ w f224i;

            public a(m8.r rVar, ByteArrayInputStream byteArrayInputStream, w wVar) {
                this.f222g = rVar;
                this.f223h = byteArrayInputStream;
                this.f224i = wVar;
            }

            @Override // w7.InterfaceC3487a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m8.p invoke() {
                return (m8.p) this.f222g.b(this.f223h, this.f224i.s().c().k());
            }
        }

        public c(w wVar, List functionList, List propertyList, List typeAliasList) throws IOException {
            Map mapI;
            AbstractC2855l.g(functionList, "functionList");
            AbstractC2855l.g(propertyList, "propertyList");
            AbstractC2855l.g(typeAliasList, "typeAliasList");
            this.f221i = wVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                k8.f fVarB = AbstractC3638L.b(wVar.s().g(), ((f8.i) ((m8.p) obj)).c0());
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f213a = r(linkedHashMap);
            w wVar2 = this.f221i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                k8.f fVarB2 = AbstractC3638L.b(wVar2.s().g(), ((f8.n) ((m8.p) obj2)).b0());
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f214b = r(linkedHashMap2);
            if (this.f221i.s().c().g().g()) {
                w wVar3 = this.f221i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    k8.f fVarB3 = AbstractC3638L.b(wVar3.s().g(), ((f8.r) ((m8.p) obj3)).V());
                    Object arrayList3 = linkedHashMap3.get(fVarB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(fVarB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapI = r(linkedHashMap3);
            } else {
                mapI = j7.K.i();
            }
            this.f215c = mapI;
            this.f216d = this.f221i.s().h().h(new H(this));
            this.f217e = this.f221i.s().h().h(new I(this));
            this.f218f = this.f221i.s().h().i(new J(this));
            this.f219g = this.f221i.s().h().e(new K(this, this.f221i));
            this.f220h = this.f221i.s().h().e(new L(this, this.f221i));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Collection m(k8.f fVar) {
            List<f8.i> listJ;
            Map map = this.f213a;
            m8.r PARSER = f8.i.f27529C;
            AbstractC2855l.f(PARSER, "PARSER");
            w wVar = this.f221i;
            byte[] bArr = (byte[]) map.get(fVar);
            if (bArr != null) {
                listJ = O8.l.S(O8.l.o(new a(PARSER, new ByteArrayInputStream(bArr), this.f221i)));
                if (listJ == null) {
                    listJ = AbstractC2800q.j();
                }
            }
            ArrayList arrayList = new ArrayList(listJ.size());
            for (f8.i iVar : listJ) {
                C3637K c3637kF = wVar.s().f();
                AbstractC2855l.d(iVar);
                g0 g0VarS = c3637kF.s(iVar);
                if (!wVar.A(g0VarS)) {
                    g0VarS = null;
                }
                if (g0VarS != null) {
                    arrayList.add(g0VarS);
                }
            }
            wVar.n(fVar, arrayList);
            return M8.a.c(arrayList);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Collection n(k8.f fVar) {
            List<f8.n> listJ;
            Map map = this.f214b;
            m8.r PARSER = f8.n.f27611C;
            AbstractC2855l.f(PARSER, "PARSER");
            w wVar = this.f221i;
            byte[] bArr = (byte[]) map.get(fVar);
            if (bArr != null) {
                listJ = O8.l.S(O8.l.o(new a(PARSER, new ByteArrayInputStream(bArr), this.f221i)));
                if (listJ == null) {
                    listJ = AbstractC2800q.j();
                }
            }
            ArrayList arrayList = new ArrayList(listJ.size());
            for (f8.n nVar : listJ) {
                C3637K c3637kF = wVar.s().f();
                AbstractC2855l.d(nVar);
                Z zU = c3637kF.u(nVar);
                if (zU != null) {
                    arrayList.add(zU);
                }
            }
            wVar.o(fVar, arrayList);
            return M8.a.c(arrayList);
        }

        private final l0 o(k8.f fVar) {
            f8.r rVarN0;
            byte[] bArr = (byte[]) this.f215c.get(fVar);
            if (bArr == null || (rVarN0 = f8.r.n0(new ByteArrayInputStream(bArr), this.f221i.s().c().k())) == null) {
                return null;
            }
            return this.f221i.s().f().z(rVarN0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set p(c cVar, w wVar) {
            return j7.T.k(cVar.f213a.keySet(), wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection q(c cVar, k8.f it) {
            AbstractC2855l.g(it, "it");
            return cVar.m(it);
        }

        private final Map r(Map map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(j7.K.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractC2942a) it.next()).h(byteArrayOutputStream);
                    arrayList.add(C2735B.f28704a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection s(c cVar, k8.f it) {
            AbstractC2855l.g(it, "it");
            return cVar.n(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l0 t(c cVar, k8.f it) {
            AbstractC2855l.g(it, "it");
            return cVar.o(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set u(c cVar, w wVar) {
            return j7.T.k(cVar.f214b.keySet(), wVar.x());
        }

        @Override // A8.w.a
        public Set a() {
            return (Set) B8.m.a(this.f219g, this, f212j[0]);
        }

        @Override // A8.w.a
        public Collection b(k8.f name, T7.b location) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(location, "location");
            return !a().contains(name) ? AbstractC2800q.j() : (Collection) this.f216d.invoke(name);
        }

        @Override // A8.w.a
        public Set c() {
            return (Set) B8.m.a(this.f220h, this, f212j[1]);
        }

        @Override // A8.w.a
        public Collection d(k8.f name, T7.b location) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(location, "location");
            return !c().contains(name) ? AbstractC2800q.j() : (Collection) this.f217e.invoke(name);
        }

        @Override // A8.w.a
        public void e(Collection result, C3435d kindFilter, Function1 nameFilter, T7.b location) {
            AbstractC2855l.g(result, "result");
            AbstractC2855l.g(kindFilter, "kindFilter");
            AbstractC2855l.g(nameFilter, "nameFilter");
            AbstractC2855l.g(location, "location");
            if (kindFilter.a(C3435d.f32955c.i())) {
                Set<k8.f> setC = c();
                ArrayList arrayList = new ArrayList();
                for (k8.f fVar : setC) {
                    if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                        arrayList.addAll(d(fVar, location));
                    }
                }
                C3030l INSTANCE = C3030l.f30531g;
                AbstractC2855l.f(INSTANCE, "INSTANCE");
                AbstractC2800q.y(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(C3435d.f32955c.d())) {
                Set<k8.f> setA = a();
                ArrayList arrayList2 = new ArrayList();
                for (k8.f fVar2 : setA) {
                    if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                        arrayList2.addAll(b(fVar2, location));
                    }
                }
                C3030l INSTANCE2 = C3030l.f30531g;
                AbstractC2855l.f(INSTANCE2, "INSTANCE");
                AbstractC2800q.y(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // A8.w.a
        public Set f() {
            return this.f215c.keySet();
        }

        @Override // A8.w.a
        public l0 g(k8.f name) {
            AbstractC2855l.g(name, "name");
            return (l0) this.f218f.invoke(name);
        }
    }

    protected w(C3654p c10, List functionList, List propertyList, List typeAliasList, InterfaceC3487a classNames) {
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(functionList, "functionList");
        AbstractC2855l.g(propertyList, "propertyList");
        AbstractC2855l.g(typeAliasList, "typeAliasList");
        AbstractC2855l.g(classNames, "classNames");
        this.f193b = c10;
        this.f194c = q(functionList, propertyList, typeAliasList);
        this.f195d = c10.h().e(new u(classNames));
        this.f196e = c10.h().g(new v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(InterfaceC3487a interfaceC3487a) {
        return AbstractC2800q.T0((Iterable) interfaceC3487a.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set l(w wVar) {
        Set setV = wVar.v();
        if (setV == null) {
            return null;
        }
        return j7.T.k(j7.T.k(wVar.t(), wVar.f194c.f()), setV);
    }

    private final a q(List list, List list2, List list3) {
        return this.f193b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final InterfaceC1280e r(k8.f fVar) {
        return this.f193b.c().b(p(fVar));
    }

    private final Set u() {
        return (Set) B8.m.b(this.f196e, this, f192f[1]);
    }

    private final l0 y(k8.f fVar) {
        return this.f194c.g(fVar);
    }

    protected boolean A(g0 function) {
        AbstractC2855l.g(function, "function");
        return true;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set a() {
        return this.f194c.a();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return this.f194c.b(name, location);
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set c() {
        return this.f194c.c();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return this.f194c.d(name, location);
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set e() {
        return u();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        if (z(name)) {
            return r(name);
        }
        if (this.f194c.f().contains(name)) {
            return y(name);
        }
        return null;
    }

    protected abstract void j(Collection collection, Function1 function1);

    protected final Collection m(C3435d kindFilter, Function1 nameFilter, T7.b location) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        AbstractC2855l.g(location, "location");
        ArrayList arrayList = new ArrayList(0);
        C3435d.a aVar = C3435d.f32955c;
        if (kindFilter.a(aVar.g())) {
            j(arrayList, nameFilter);
        }
        this.f194c.e(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (k8.f fVar : t()) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    M8.a.a(arrayList, r(fVar));
                }
            }
        }
        if (kindFilter.a(C3435d.f32955c.h())) {
            for (k8.f fVar2 : this.f194c.f()) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    M8.a.a(arrayList, this.f194c.g(fVar2));
                }
            }
        }
        return M8.a.c(arrayList);
    }

    protected void n(k8.f name, List functions) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(functions, "functions");
    }

    protected void o(k8.f name, List descriptors) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(descriptors, "descriptors");
    }

    protected abstract k8.b p(k8.f fVar);

    protected final C3654p s() {
        return this.f193b;
    }

    public final Set t() {
        return (Set) B8.m.a(this.f195d, this, f192f[0]);
    }

    protected abstract Set v();

    protected abstract Set w();

    protected abstract Set x();

    protected boolean z(k8.f name) {
        AbstractC2855l.g(name, "name");
        return t().contains(name);
    }
}
