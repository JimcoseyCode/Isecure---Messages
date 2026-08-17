package kotlin.jvm.internal;

import i7.C2742e;
import j7.AbstractC2800q;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v7.AbstractC3430a;
import v7.C3431b;
import w7.InterfaceC3487a;
import w7.InterfaceC3488b;
import w7.InterfaceC3489c;
import w7.InterfaceC3490d;
import w7.InterfaceC3491e;
import w7.InterfaceC3492f;
import w7.InterfaceC3493g;
import w7.InterfaceC3494h;

/* JADX INFO: renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2848e implements C7.d, InterfaceC2847d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f29388h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f29389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashMap f29390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap f29391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashMap f29392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map f29393m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f29394g;

    /* JADX INFO: renamed from: kotlin.jvm.internal.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            AbstractC2855l.g(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C2848e.f29392l.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C2848e.f29392l.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class jClass) {
            String str;
            AbstractC2855l.g(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) C2848e.f29393m.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C2848e.f29393m.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                AbstractC2855l.d(simpleName);
                String strP0 = P8.q.P0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strP0 != null) {
                    return strP0;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                AbstractC2855l.d(simpleName);
                return P8.q.O0(simpleName, '$', null, 2, null);
            }
            AbstractC2855l.d(simpleName);
            return P8.q.P0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class jClass) {
            AbstractC2855l.g(jClass, "jClass");
            Map map = C2848e.f29389i;
            AbstractC2855l.e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return I.k(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = AbstractC3430a.c(AbstractC3430a.e(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        List listM = AbstractC2800q.m(InterfaceC3487a.class, Function1.class, Function2.class, w7.o.class, w7.p.class, w7.q.class, w7.r.class, w7.s.class, w7.t.class, w7.u.class, InterfaceC3488b.class, InterfaceC3489c.class, InterfaceC3490d.class, InterfaceC3491e.class, InterfaceC3492f.class, InterfaceC3493g.class, InterfaceC3494h.class, w7.i.class, w7.j.class, w7.k.class, w7.l.class, w7.m.class, w7.n.class);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listM, 10));
        int i10 = 0;
        for (Object obj : listM) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            arrayList.add(i7.t.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f29389i = j7.K.r(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f29390j = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f29391k = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC2855l.f(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            AbstractC2855l.d(str);
            sb.append(P8.q.S0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            Pair pairA = i7.t.a(sb.toString(), str + ".Companion");
            map3.put(pairA.c(), pairA.d());
        }
        for (Map.Entry entry : f29389i.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f29392l = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.K.e(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC2855l.d(str2);
            linkedHashMap.put(key, P8.q.S0(str2, '.', null, 2, null));
        }
        f29393m = linkedHashMap;
    }

    public C2848e(Class jClass) {
        AbstractC2855l.g(jClass, "jClass");
        this.f29394g = jClass;
    }

    private final Void k() {
        throw new C3431b();
    }

    @Override // kotlin.jvm.internal.InterfaceC2847d
    public Class b() {
        return this.f29394g;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2848e) && AbstractC2855l.b(AbstractC3430a.c(this), AbstractC3430a.c((C7.d) obj));
    }

    @Override // C7.d
    public Collection f() {
        k();
        throw new C2742e();
    }

    @Override // C7.d
    public List g() {
        k();
        throw new C2742e();
    }

    @Override // C7.b
    public List getAnnotations() {
        k();
        throw new C2742e();
    }

    @Override // C7.d
    public int hashCode() {
        return AbstractC3430a.c(this).hashCode();
    }

    @Override // C7.d
    public boolean l() {
        k();
        throw new C2742e();
    }

    @Override // C7.d
    public String n() {
        return f29388h.a(b());
    }

    @Override // C7.d
    public String o() {
        return f29388h.b(b());
    }

    @Override // C7.d
    public boolean q(Object obj) {
        return f29388h.c(obj, b());
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
