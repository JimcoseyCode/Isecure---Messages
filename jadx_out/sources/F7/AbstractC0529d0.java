package F7;

import F7.a1;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import L7.InterfaceC1284i;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import R7.AbstractC1394f;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import i7.C2735B;
import j7.AbstractC2800q;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC2847d;
import o8.AbstractC3029k;
import p7.AbstractC3083a;
import v8.InterfaceC3442k;
import v8.InterfaceC3445n;

/* JADX INFO: renamed from: F7.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0529d0 implements InterfaceC2847d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f2030g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class f2031h = DefaultConstructorMarker.class;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final P8.o f2032i = new P8.o("<v#(\\d+)>");

    /* JADX INFO: renamed from: F7.d0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final P8.o a() {
            return AbstractC0529d0.f2032i;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: F7.d0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ C7.k[] f2033c = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a1.a f2034a;

        public b() {
            this.f2034a = a1.c(new C0531e0(AbstractC0529d0.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q7.k c(AbstractC0529d0 abstractC0529d0) {
            return Z0.a(abstractC0529d0.b());
        }

        public final Q7.k b() {
            Object objC = this.f2034a.c(this, f2033c[0]);
            AbstractC2855l.f(objC, "getValue(...)");
            return (Q7.k) objC;
        }
    }

    /* JADX INFO: renamed from: F7.d0$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f2036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f2037b;

        public c(List parameters, Class cls) {
            AbstractC2855l.g(parameters, "parameters");
            this.f2036a = parameters;
            this.f2037b = cls;
        }

        public final List a() {
            return this.f2036a;
        }

        public final Class b() {
            return this.f2037b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: F7.d0$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static final class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f2038g = new d("DECLARED", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f2039h = new d("INHERITED", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ d[] f2040i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f2041j;

        static {
            d[] dVarArrH = h();
            f2040i = dVarArrH;
            f2041j = AbstractC3083a.a(dVarArrH);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] h() {
            return new d[]{f2038g, f2039h};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f2040i.clone();
        }

        public final boolean j(InterfaceC1277b member) {
            AbstractC2855l.g(member, "member");
            return member.getKind().h() == (this == f2038g);
        }
    }

    /* JADX INFO: renamed from: F7.d0$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends C0540j {
        e(AbstractC0529d0 abstractC0529d0) {
            super(abstractC0529d0);
        }

        @Override // O7.AbstractC1336o, L7.InterfaceC1290o
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public A e(InterfaceC1287l descriptor, C2735B data) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(AbstractC1295u abstractC1295u, AbstractC1295u abstractC1295u2) {
        Integer numD = AbstractC1294t.d(abstractC1295u, abstractC1295u2);
        if (numD != null) {
            return numD.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence D(L7.Z descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        return n8.n.f30125k.O(descriptor) + " | " + f1.f2051a.f(descriptor).a();
    }

    private final Method K(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        String str2;
        Class[] clsArr2;
        Class cls3;
        boolean z11;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodO = O(cls, str, clsArr, cls2);
        if (methodO != null) {
            return methodO;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodK = K(superclass, str, clsArr, cls2, z10);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
            if (methodK != null) {
                return methodK;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
        }
        Iterator itA = AbstractC2845b.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls4 = (Class) itA.next();
            AbstractC2855l.d(cls4);
            Method methodK2 = K(cls4, str2, clsArr2, cls3, z11);
            if (methodK2 != null) {
                return methodK2;
            }
            if (z11) {
                Class clsA = Q7.e.a(AbstractC1394f.j(cls4), cls4.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr2[0] = cls4;
                    Method methodO2 = O(clsA, str2, clsArr2, cls3);
                    if (methodO2 != null) {
                        return methodO2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c L(String str, boolean z10) {
        String str2;
        int iC0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            if (str.charAt(i10) == ')') {
                String str3 = str;
                return new c(arrayList, z10 ? M(str3, i10 + 1, str3.length()) : null);
            }
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (P8.q.P("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i12 = i11 + 1;
                str2 = str;
                iC0 = i12;
            } else {
                if (cCharAt != 'L') {
                    throw new Y0("Unknown type prefix in the method signature: " + str);
                }
                str2 = str;
                iC0 = P8.q.c0(str2, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(M(str2, i10, iC0));
            i10 = iC0;
            str = str2;
        }
    }

    private final Class M(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderJ = AbstractC1394f.j(b());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            AbstractC2855l.f(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderJ.loadClass(P8.q.D(strSubstring, '/', '.', false, 4, null));
            AbstractC2855l.f(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            AbstractC2855l.f(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return j1.f(M(str, i10 + 1, i11));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new Y0("Unknown type prefix in the method signature: " + str);
        }
    }

    private final Constructor N(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method O(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC2855l.b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC2855l.f(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (AbstractC2855l.b(method.getName(), str) && AbstractC2855l.b(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    private final void t(List list, List list2, boolean z10) {
        if (AbstractC2855l.b(AbstractC2800q.s0(list2), f2031h)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class TYPE = Integer.TYPE;
            AbstractC2855l.f(TYPE, "TYPE");
            list.add(TYPE);
        }
        Class cls = z10 ? f2031h : Object.class;
        AbstractC2855l.d(cls);
        list.add(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence y(InterfaceC1300z descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        return n8.n.f30125k.O(descriptor) + " | " + f1.f2051a.g(descriptor).a();
    }

    public final L7.Z A(String name, String signature) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signature, "signature");
        P8.l lVarC = f2032i.c(signature);
        if (lVarC != null) {
            String str = (String) lVarC.a().a().b().get(1);
            L7.Z zG = G(Integer.parseInt(str));
            if (zG != null) {
                return zG;
            }
            throw new Y0("Local property #" + str + " not found in " + b());
        }
        k8.f fVarQ = k8.f.q(name);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        Collection collectionJ = J(fVarQ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionJ) {
            if (AbstractC2855l.b(f1.f2051a.f((L7.Z) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Y0("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (L7.Z) AbstractC2800q.C0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC1295u visibility = ((L7.Z) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = j7.K.h(linkedHashMap, new C0523a0(Z.f2019g)).values();
        AbstractC2855l.f(collectionValues, "<get-values>(...)");
        List list = (List) AbstractC2800q.p0(collectionValues);
        if (list.size() == 1) {
            AbstractC2855l.d(list);
            return (L7.Z) AbstractC2800q.e0(list);
        }
        k8.f fVarQ2 = k8.f.q(name);
        AbstractC2855l.f(fVarQ2, "identifier(...)");
        String strO0 = AbstractC2800q.o0(J(fVarQ2), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, C0525b0.f2025g, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Property '");
        sb.append(name);
        sb.append("' (JVM signature: ");
        sb.append(signature);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strO0.length() == 0 ? " no members found" : '\n' + strO0);
        throw new Y0(sb.toString());
    }

    public abstract Collection E();

    public abstract Collection F(k8.f fVar);

    public abstract L7.Z G(int i10);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Collection H(InterfaceC3442k scope, d belonginess) {
        A a10;
        AbstractC2855l.g(scope, "scope");
        AbstractC2855l.g(belonginess, "belonginess");
        e eVar = new e(this);
        Collection<InterfaceC1288m> collectionA = InterfaceC3445n.a.a(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1288m interfaceC1288m : collectionA) {
            if (interfaceC1288m instanceof InterfaceC1277b) {
                InterfaceC1277b interfaceC1277b = (InterfaceC1277b) interfaceC1288m;
                a10 = (AbstractC2855l.b(interfaceC1277b.getVisibility(), AbstractC1294t.f7350h) || !belonginess.j(interfaceC1277b)) ? null : (A) interfaceC1288m.E0(eVar, C2735B.f28704a);
            }
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return AbstractC2800q.P0(arrayList);
    }

    protected Class I() {
        Class clsK = AbstractC1394f.k(b());
        return clsK == null ? b() : clsK;
    }

    public abstract Collection J(k8.f fVar);

    public final Constructor u(String desc) {
        AbstractC2855l.g(desc, "desc");
        return N(b(), L(desc, false).a());
    }

    public final Constructor v(String desc) {
        AbstractC2855l.g(desc, "desc");
        Class clsB = b();
        ArrayList arrayList = new ArrayList();
        t(arrayList, L(desc, false).a(), true);
        C2735B c2735b = C2735B.f28704a;
        return N(clsB, arrayList);
    }

    public final Method w(String name, String desc, boolean z10) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(desc, "desc");
        if (AbstractC2855l.b(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(b());
        }
        c cVarL = L(desc, true);
        t(arrayList, cVarL.a(), false);
        Class clsI = I();
        String str = name + "$default";
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsB = cVarL.b();
        AbstractC2855l.d(clsB);
        return K(clsI, str, clsArr, clsB, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1300z x(String name, String signature) {
        Collection collectionF;
        ArrayList arrayList;
        String strA;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signature, "signature");
        if (AbstractC2855l.b(name, "<init>")) {
            collectionF = AbstractC2800q.P0(E());
            arrayList = new ArrayList();
            for (Object obj : collectionF) {
                InterfaceC1287l interfaceC1287l = (InterfaceC1287l) obj;
                if (interfaceC1287l.A()) {
                    InterfaceC1284i interfaceC1284iB = interfaceC1287l.b();
                    AbstractC2855l.f(interfaceC1284iB, "getContainingDeclaration(...)");
                    if (AbstractC3029k.d(interfaceC1284iB)) {
                        String strA2 = f1.f2051a.g(interfaceC1287l).a();
                        if (!P8.q.K(strA2, "constructor-impl", false, 2, null) || !P8.q.w(strA2, ")V", false, 2, null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + interfaceC1287l + ": " + strA2).toString());
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(P8.q.x0(strA2, "V"));
                        InterfaceC1284i interfaceC1284iB2 = interfaceC1287l.b();
                        AbstractC2855l.f(interfaceC1284iB2, "getContainingDeclaration(...)");
                        sb.append(G7.o.u(interfaceC1284iB2));
                        strA = sb.toString();
                    } else {
                        strA = f1.f2051a.g(interfaceC1287l).a();
                    }
                }
                if (AbstractC2855l.b(strA, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            k8.f fVarQ = k8.f.q(name);
            AbstractC2855l.f(fVarQ, "identifier(...)");
            collectionF = F(fVarQ);
            arrayList = new ArrayList();
            for (Object obj2 : collectionF) {
                if (AbstractC2855l.b(f1.f2051a.g((InterfaceC1300z) obj2).a(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        Collection collection = collectionF;
        if (arrayList.size() == 1) {
            return (InterfaceC1300z) AbstractC2800q.C0(arrayList);
        }
        String strO0 = AbstractC2800q.o0(collection, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, C0527c0.f2027g, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Function '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strO0.length() == 0 ? " no members found" : '\n' + strO0);
        throw new Y0(sb2.toString());
    }

    public final Method z(String name, String desc) {
        Method methodK;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(desc, "desc");
        if (AbstractC2855l.b(name, "<init>")) {
            return null;
        }
        c cVarL = L(desc, true);
        Class[] clsArr = (Class[]) cVarL.a().toArray(new Class[0]);
        Class clsB = cVarL.b();
        AbstractC2855l.d(clsB);
        Method methodK2 = K(I(), name, clsArr, clsB, false);
        if (methodK2 != null) {
            return methodK2;
        }
        if (!I().isInterface() || (methodK = K(Object.class, name, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodK;
    }
}
