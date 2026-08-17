package U7;

import com.facebook.react.uimanager.events.PointerEventHelper;
import d8.C2348F;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;
import t8.EnumC3382e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11461a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f11462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f11463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f11464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f11465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f11466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f11467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f11468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a.C0119a f11469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map f11470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f11471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set f11472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set f11473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f11474n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: U7.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0119a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f11475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final k8.f f11476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f11477c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f11478d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f11479e;

            public C0119a(String classInternalName, k8.f name, String parameters, String returnType) {
                AbstractC2855l.g(classInternalName, "classInternalName");
                AbstractC2855l.g(name, "name");
                AbstractC2855l.g(parameters, "parameters");
                AbstractC2855l.g(returnType, "returnType");
                this.f11475a = classInternalName;
                this.f11476b = name;
                this.f11477c = parameters;
                this.f11478d = returnType;
                this.f11479e = C2348F.f25682a.l(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ C0119a b(C0119a c0119a, String str, k8.f fVar, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0119a.f11475a;
                }
                if ((i10 & 2) != 0) {
                    fVar = c0119a.f11476b;
                }
                if ((i10 & 4) != 0) {
                    str2 = c0119a.f11477c;
                }
                if ((i10 & 8) != 0) {
                    str3 = c0119a.f11478d;
                }
                return c0119a.a(str, fVar, str2, str3);
            }

            public final C0119a a(String classInternalName, k8.f name, String parameters, String returnType) {
                AbstractC2855l.g(classInternalName, "classInternalName");
                AbstractC2855l.g(name, "name");
                AbstractC2855l.g(parameters, "parameters");
                AbstractC2855l.g(returnType, "returnType");
                return new C0119a(classInternalName, name, parameters, returnType);
            }

            public final k8.f c() {
                return this.f11476b;
            }

            public final String d() {
                return this.f11479e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0119a)) {
                    return false;
                }
                C0119a c0119a = (C0119a) obj;
                return AbstractC2855l.b(this.f11475a, c0119a.f11475a) && AbstractC2855l.b(this.f11476b, c0119a.f11476b) && AbstractC2855l.b(this.f11477c, c0119a.f11477c) && AbstractC2855l.b(this.f11478d, c0119a.f11478d);
            }

            public int hashCode() {
                return (((((this.f11475a.hashCode() * 31) + this.f11476b.hashCode()) * 31) + this.f11477c.hashCode()) * 31) + this.f11478d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f11475a + ", name=" + this.f11476b + ", parameters=" + this.f11477c + ", returnType=" + this.f11478d + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0119a m(String str, String str2, String str3, String str4) {
            k8.f fVarQ = k8.f.q(str2);
            AbstractC2855l.f(fVarQ, "identifier(...)");
            return new C0119a(str, fVarQ, str3, str4);
        }

        public final k8.f b(k8.f name) {
            AbstractC2855l.g(name, "name");
            return (k8.f) f().get(name);
        }

        public final List c() {
            return U.f11463c;
        }

        public final Set d() {
            return U.f11467g;
        }

        public final Set e() {
            return U.f11468h;
        }

        public final Map f() {
            return U.f11474n;
        }

        public final Set g() {
            return U.f11473m;
        }

        public final C0119a h() {
            return U.f11469i;
        }

        public final Map i() {
            return U.f11466f;
        }

        public final Map j() {
            return U.f11471k;
        }

        public final boolean k(k8.f fVar) {
            AbstractC2855l.g(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String builtinSignature) {
            AbstractC2855l.g(builtinSignature, "builtinSignature");
            return c().contains(builtinSignature) ? b.f11480i : ((c) j7.K.j(i(), builtinSignature)) == c.f11487h ? b.f11482k : b.f11481j;
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f11480i = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f11481j = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f11482k = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ b[] f11483l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11484m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f11485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f11486h;

        static {
            b[] bVarArrH = h();
            f11483l = bVarArrH;
            f11484m = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10, String str2, boolean z10) {
            this.f11485g = str2;
            this.f11486h = z10;
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f11480i, f11481j, f11482k};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11483l.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f11487h = new c("NULL", 0, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f11488i = new c("INDEX", 1, -1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c f11489j = new c("FALSE", 2, Boolean.FALSE);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final c f11490k = new a("MAP_GET_OR_DEFAULT", 3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ c[] f11491l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11492m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f11493g;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            a(String str, int i10) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i10, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        static {
            c[] cVarArrH = h();
            f11491l = cVarArrH;
            f11492m = AbstractC3083a.a(cVarArrH);
        }

        public /* synthetic */ c(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        private static final /* synthetic */ c[] h() {
            return new c[]{f11487h, f11488i, f11489j, f11490k};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f11491l.clone();
        }

        private c(String str, int i10, Object obj) {
            this.f11493g = obj;
        }
    }

    static {
        Set<String> setH = j7.T.h("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(setH, 10));
        for (String str : setH) {
            a aVar = f11461a;
            String strM = EnumC3382e.BOOLEAN.m();
            AbstractC2855l.f(strM, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", strM));
        }
        f11462b = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0119a) it.next()).d());
        }
        f11463c = arrayList2;
        List list = f11462b;
        ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C0119a) it2.next()).c().j());
        }
        f11464d = arrayList3;
        C2348F c2348f = C2348F.f25682a;
        a aVar2 = f11461a;
        String strI = c2348f.i("Collection");
        EnumC3382e enumC3382e = EnumC3382e.BOOLEAN;
        String strM2 = enumC3382e.m();
        AbstractC2855l.f(strM2, "getDesc(...)");
        a.C0119a c0119aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", strM2);
        c cVar = c.f11489j;
        Pair pairA = i7.t.a(c0119aM, cVar);
        String strI2 = c2348f.i("Collection");
        String strM3 = enumC3382e.m();
        AbstractC2855l.f(strM3, "getDesc(...)");
        Pair pairA2 = i7.t.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", strM3), cVar);
        String strI3 = c2348f.i("Map");
        String strM4 = enumC3382e.m();
        AbstractC2855l.f(strM4, "getDesc(...)");
        Pair pairA3 = i7.t.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", strM4), cVar);
        String strI4 = c2348f.i("Map");
        String strM5 = enumC3382e.m();
        AbstractC2855l.f(strM5, "getDesc(...)");
        Pair pairA4 = i7.t.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", strM5), cVar);
        String strI5 = c2348f.i("Map");
        String strM6 = enumC3382e.m();
        AbstractC2855l.f(strM6, "getDesc(...)");
        Pair pairA5 = i7.t.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strM6), cVar);
        Pair pairA6 = i7.t.a(aVar2.m(c2348f.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f11490k);
        a.C0119a c0119aM2 = aVar2.m(c2348f.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f11487h;
        Pair pairA7 = i7.t.a(c0119aM2, cVar2);
        Pair pairA8 = i7.t.a(aVar2.m(c2348f.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strI6 = c2348f.i("List");
        EnumC3382e enumC3382e2 = EnumC3382e.INT;
        String strM7 = enumC3382e2.m();
        AbstractC2855l.f(strM7, "getDesc(...)");
        a.C0119a c0119aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", strM7);
        c cVar3 = c.f11488i;
        Pair pairA9 = i7.t.a(c0119aM3, cVar3);
        String strI7 = c2348f.i("List");
        String strM8 = enumC3382e2.m();
        AbstractC2855l.f(strM8, "getDesc(...)");
        Map mapL = j7.K.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, i7.t.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", strM8), cVar3));
        f11465e = mapL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.K.e(mapL.size()));
        for (Map.Entry entry : mapL.entrySet()) {
            linkedHashMap.put(((a.C0119a) entry.getKey()).d(), entry.getValue());
        }
        f11466f = linkedHashMap;
        Set setK = j7.T.k(f11465e.keySet(), f11462b);
        ArrayList arrayList4 = new ArrayList(AbstractC2800q.u(setK, 10));
        Iterator it3 = setK.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.C0119a) it3.next()).c());
        }
        f11467g = AbstractC2800q.T0(arrayList4);
        ArrayList arrayList5 = new ArrayList(AbstractC2800q.u(setK, 10));
        Iterator it4 = setK.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C0119a) it4.next()).d());
        }
        f11468h = AbstractC2800q.T0(arrayList5);
        a aVar3 = f11461a;
        EnumC3382e enumC3382e3 = EnumC3382e.INT;
        String strM9 = enumC3382e3.m();
        AbstractC2855l.f(strM9, "getDesc(...)");
        a.C0119a c0119aM4 = aVar3.m("java/util/List", "removeAt", strM9, "Ljava/lang/Object;");
        f11469i = c0119aM4;
        C2348F c2348f2 = C2348F.f25682a;
        String strH = c2348f2.h("Number");
        String strM10 = EnumC3382e.BYTE.m();
        AbstractC2855l.f(strM10, "getDesc(...)");
        Pair pairA10 = i7.t.a(aVar3.m(strH, "toByte", PointerEventHelper.POINTER_TYPE_UNKNOWN, strM10), k8.f.q("byteValue"));
        String strH2 = c2348f2.h("Number");
        String strM11 = EnumC3382e.SHORT.m();
        AbstractC2855l.f(strM11, "getDesc(...)");
        Pair pairA11 = i7.t.a(aVar3.m(strH2, "toShort", PointerEventHelper.POINTER_TYPE_UNKNOWN, strM11), k8.f.q("shortValue"));
        String strH3 = c2348f2.h("Number");
        String strM12 = enumC3382e3.m();
        AbstractC2855l.f(strM12, "getDesc(...)");
        Pair pairA12 = i7.t.a(aVar3.m(strH3, "toInt", PointerEventHelper.POINTER_TYPE_UNKNOWN, strM12), k8.f.q("intValue"));
        String strH4 = c2348f2.h("Number");
        String strM13 = EnumC3382e.LONG.m();
        AbstractC2855l.f(strM13, "getDesc(...)");
        Pair pairA13 = i7.t.a(aVar3.m(strH4, "toLong", PointerEventHelper.POINTER_TYPE_UNKNOWN, strM13), k8.f.q("longValue"));
        String strH5 = c2348f2.h("Number");
        String strM14 = EnumC3382e.FLOAT.m();
        AbstractC2855l.f(strM14, "getDesc(...)");
        Pair pairA14 = i7.t.a(aVar3.m(strH5, "toFloat", PointerEventHelper.POINTER_TYPE_UNKNOWN, strM14), k8.f.q("floatValue"));
        String strH6 = c2348f2.h("Number");
        String strM15 = EnumC3382e.DOUBLE.m();
        AbstractC2855l.f(strM15, "getDesc(...)");
        Pair pairA15 = i7.t.a(aVar3.m(strH6, "toDouble", PointerEventHelper.POINTER_TYPE_UNKNOWN, strM15), k8.f.q("doubleValue"));
        Pair pairA16 = i7.t.a(c0119aM4, k8.f.q("remove"));
        String strH7 = c2348f2.h("CharSequence");
        String strM16 = enumC3382e3.m();
        AbstractC2855l.f(strM16, "getDesc(...)");
        String strM17 = EnumC3382e.CHAR.m();
        AbstractC2855l.f(strM17, "getDesc(...)");
        Map mapL2 = j7.K.l(pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, i7.t.a(aVar3.m(strH7, "get", strM16, strM17), k8.f.q("charAt")));
        f11470j = mapL2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(j7.K.e(mapL2.size()));
        for (Map.Entry entry2 : mapL2.entrySet()) {
            linkedHashMap2.put(((a.C0119a) entry2.getKey()).d(), entry2.getValue());
        }
        f11471k = linkedHashMap2;
        Map map = f11470j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0119a.b((a.C0119a) entry3.getKey(), null, (k8.f) entry3.getValue(), null, null, 13, null).d());
        }
        f11472l = linkedHashSet;
        Set setKeySet = f11470j.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a.C0119a) it5.next()).c());
        }
        f11473m = hashSet;
        Set<Map.Entry> setEntrySet = f11470j.entrySet();
        ArrayList<Pair> arrayList6 = new ArrayList(AbstractC2800q.u(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList6.add(new Pair(((a.C0119a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(arrayList6, 10)), 16));
        for (Pair pair : arrayList6) {
            linkedHashMap3.put((k8.f) pair.d(), (k8.f) pair.c());
        }
        f11474n = linkedHashMap3;
    }
}
