package F7;

import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.InterfaceC1276a;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import Q7.l;
import R7.AbstractC1394f;
import R7.C1395g;
import d8.C2378z;
import d8.InterfaceC2376x;
import h8.AbstractC2708a;
import h8.InterfaceC2710c;
import i7.C2750m;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3029k;
import q8.C3136a;
import q8.C3137b;
import q8.s;
import s8.AbstractC3340e;
import v7.AbstractC3430a;
import y8.C3637K;
import y8.C3652n;
import y8.C3654p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k8.c f2073a = new k8.c("kotlin.jvm.JvmStatic");

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2074a;

        static {
            int[] iArr = new int[I7.l.values().length];
            try {
                iArr[I7.l.f5080m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I7.l.f5081n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I7.l.f5082o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I7.l.f5083p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[I7.l.f5084q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[I7.l.f5085r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[I7.l.f5086s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[I7.l.f5087t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f2074a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object a(C3137b c3137b, ClassLoader classLoader) {
        C8.S sE;
        Class clsO;
        q8.z zVar = c3137b instanceof q8.z ? (q8.z) c3137b : null;
        if (zVar == null || (sE = zVar.e()) == null) {
            return null;
        }
        Iterable iterable = (Iterable) c3137b.b();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(s((q8.g) it.next(), classLoader));
        }
        I7.l lVarN = I7.i.N(sE);
        int i10 = 0;
        switch (lVarN == null ? -1 : a.f2074a[lVarN.ordinal()]) {
            case -1:
                if (!I7.i.c0(sE)) {
                    throw new IllegalStateException(("Not an array type: " + sE).toString());
                }
                C8.S type = ((C8.B0) AbstractC2800q.C0(sE.I0())).getType();
                AbstractC2855l.f(type, "getType(...)");
                InterfaceC1283h interfaceC1283hP = type.K0().p();
                InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
                if (interfaceC1280e == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (I7.i.v0(type)) {
                    int size = ((List) c3137b.b()).size();
                    String[] strArr = new String[size];
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i10] = obj;
                        i10++;
                    }
                    return strArr;
                }
                if (I7.i.l0(interfaceC1280e)) {
                    int size2 = ((List) c3137b.b()).size();
                    Class[] clsArr = new Class[size2];
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        AbstractC2855l.e(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i10] = obj2;
                        i10++;
                    }
                    return clsArr;
                }
                k8.b bVarN = AbstractC3340e.n(interfaceC1280e);
                if (bVarN == null || (clsO = o(classLoader, bVarN, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsO, ((List) c3137b.b()).size());
                AbstractC2855l.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i10 < size3) {
                    objArr[i10] = arrayList.get(i10);
                    i10++;
                }
                return objArr;
            case 0:
            default:
                throw new C2750m();
            case 1:
                int size4 = ((List) c3137b.b()).size();
                boolean[] zArr = new boolean[size4];
                while (i10 < size4) {
                    Object obj3 = arrayList.get(i10);
                    AbstractC2855l.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i10] = ((Boolean) obj3).booleanValue();
                    i10++;
                }
                return zArr;
            case 2:
                int size5 = ((List) c3137b.b()).size();
                char[] cArr = new char[size5];
                while (i10 < size5) {
                    Object obj4 = arrayList.get(i10);
                    AbstractC2855l.e(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i10] = ((Character) obj4).charValue();
                    i10++;
                }
                return cArr;
            case 3:
                int size6 = ((List) c3137b.b()).size();
                byte[] bArr = new byte[size6];
                while (i10 < size6) {
                    Object obj5 = arrayList.get(i10);
                    AbstractC2855l.e(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i10] = ((Byte) obj5).byteValue();
                    i10++;
                }
                return bArr;
            case 4:
                int size7 = ((List) c3137b.b()).size();
                short[] sArr = new short[size7];
                while (i10 < size7) {
                    Object obj6 = arrayList.get(i10);
                    AbstractC2855l.e(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i10] = ((Short) obj6).shortValue();
                    i10++;
                }
                return sArr;
            case 5:
                int size8 = ((List) c3137b.b()).size();
                int[] iArr = new int[size8];
                while (i10 < size8) {
                    Object obj7 = arrayList.get(i10);
                    AbstractC2855l.e(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i10] = ((Integer) obj7).intValue();
                    i10++;
                }
                return iArr;
            case 6:
                int size9 = ((List) c3137b.b()).size();
                float[] fArr = new float[size9];
                while (i10 < size9) {
                    Object obj8 = arrayList.get(i10);
                    AbstractC2855l.e(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i10] = ((Float) obj8).floatValue();
                    i10++;
                }
                return fArr;
            case 7:
                int size10 = ((List) c3137b.b()).size();
                long[] jArr = new long[size10];
                while (i10 < size10) {
                    Object obj9 = arrayList.get(i10);
                    AbstractC2855l.e(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i10] = ((Long) obj9).longValue();
                    i10++;
                }
                return jArr;
            case 8:
                int size11 = ((List) c3137b.b()).size();
                double[] dArr = new double[size11];
                while (i10 < size11) {
                    Object obj10 = arrayList.get(i10);
                    AbstractC2855l.e(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i10] = ((Double) obj10).doubleValue();
                    i10++;
                }
                return dArr;
        }
    }

    public static final A b(Object obj) {
        A a10 = obj instanceof A ? (A) obj : null;
        if (a10 != null) {
            return a10;
        }
        C0539i0 c0539i0C = c(obj);
        return c0539i0C != null ? c0539i0C : d(obj);
    }

    public static final C0539i0 c(Object obj) {
        C0539i0 c0539i0 = obj instanceof C0539i0 ? (C0539i0) obj : null;
        if (c0539i0 != null) {
            return c0539i0;
        }
        AbstractC2852i abstractC2852i = obj instanceof AbstractC2852i ? (AbstractC2852i) obj : null;
        C7.c cVarCompute = abstractC2852i != null ? abstractC2852i.compute() : null;
        if (cVarCompute instanceof C0539i0) {
            return (C0539i0) cVarCompute;
        }
        return null;
    }

    public static final K0 d(Object obj) {
        K0 k02 = obj instanceof K0 ? (K0) obj : null;
        if (k02 != null) {
            return k02;
        }
        kotlin.jvm.internal.y yVar = obj instanceof kotlin.jvm.internal.y ? (kotlin.jvm.internal.y) obj : null;
        C7.c cVarCompute = yVar != null ? yVar.compute() : null;
        if (cVarCompute instanceof K0) {
            return (K0) cVarCompute;
        }
        return null;
    }

    public static final List e(M7.a aVar) {
        Annotation annotationP;
        AbstractC2855l.g(aVar, "<this>");
        M7.h<M7.c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (M7.c cVar : annotations) {
            L7.h0 h0VarG = cVar.g();
            if (h0VarG instanceof Q7.b) {
                annotationP = ((Q7.b) h0VarG).d();
            } else if (h0VarG instanceof l.a) {
                R7.u uVarB = ((l.a) h0VarG).b();
                C1395g c1395g = uVarB instanceof C1395g ? (C1395g) uVarB : null;
                annotationP = c1395g != null ? c1395g.N() : null;
            } else {
                annotationP = p(cVar);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class f(Class cls) {
        AbstractC2855l.g(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object g(Type type) {
        AbstractC2855l.g(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (AbstractC2855l.b(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (AbstractC2855l.b(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (AbstractC2855l.b(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (AbstractC2855l.b(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (AbstractC2855l.b(cls, Integer.TYPE)) {
            return 0;
        }
        if (AbstractC2855l.b(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (AbstractC2855l.b(cls, Long.TYPE)) {
            return 0L;
        }
        if (AbstractC2855l.b(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (AbstractC2855l.b(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC1276a h(Class moduleAnchor, m8.p proto, InterfaceC2710c nameResolver, h8.g typeTable, AbstractC2708a metadataVersion, Function2 createDescriptor) {
        List listM0;
        AbstractC2855l.g(moduleAnchor, "moduleAnchor");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        AbstractC2855l.g(createDescriptor, "createDescriptor");
        Q7.k kVarA = Z0.a(moduleAnchor);
        if (proto instanceof f8.i) {
            listM0 = ((f8.i) proto).k0();
        } else {
            if (!(proto instanceof f8.n)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            listM0 = ((f8.n) proto).m0();
        }
        List list = listM0;
        C3652n c3652nA = kVarA.a();
        L7.H hB = kVarA.b();
        h8.h hVarB = h8.h.f28564b.b();
        AbstractC2855l.d(list);
        return (InterfaceC1276a) createDescriptor.invoke(new C3637K(new C3654p(c3652nA, nameResolver, hB, typeTable, hVarB, metadataVersion, null, null, list)), proto);
    }

    public static final L7.c0 i(InterfaceC1276a interfaceC1276a) {
        AbstractC2855l.g(interfaceC1276a, "<this>");
        if (interfaceC1276a.a0() == null) {
            return null;
        }
        InterfaceC1288m interfaceC1288mB = interfaceC1276a.b();
        AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC1280e) interfaceC1288mB).G0();
    }

    public static final k8.c j() {
        return f2073a;
    }

    public static final boolean k(C7.o oVar) {
        C8.S sV;
        AbstractC2855l.g(oVar, "<this>");
        U0 u02 = oVar instanceof U0 ? (U0) oVar : null;
        return (u02 == null || (sV = u02.v()) == null || !AbstractC3029k.i(sV)) ? false : true;
    }

    public static final boolean l(C7.o oVar) {
        C8.S sV;
        AbstractC2855l.g(oVar, "<this>");
        U0 u02 = oVar instanceof U0 ? (U0) oVar : null;
        return (u02 == null || (sV = u02.v()) == null || !AbstractC3029k.c(sV)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class m(ClassLoader classLoader, String str, String str2, int i10) {
        if (AbstractC2855l.b(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            sb.append(str + '.');
        }
        sb.append(P8.q.D(str2, '.', '$', false, 4, null));
        if (i10 > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return Q7.e.a(classLoader, string);
    }

    private static final Class n(ClassLoader classLoader, k8.b bVar, int i10) {
        K7.c cVar = K7.c.f7110a;
        k8.d dVarJ = bVar.a().j();
        AbstractC2855l.f(dVarJ, "toUnsafe(...)");
        k8.b bVarN = cVar.n(dVarJ);
        if (bVarN != null) {
            bVar = bVarN;
        }
        String strB = bVar.f().b();
        AbstractC2855l.f(strB, "asString(...)");
        String strB2 = bVar.g().b();
        AbstractC2855l.f(strB2, "asString(...)");
        return m(classLoader, strB, strB2, i10);
    }

    static /* synthetic */ Class o(ClassLoader classLoader, k8.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return n(classLoader, bVar, i10);
    }

    private static final Annotation p(M7.c cVar) {
        InterfaceC1280e interfaceC1280eL = AbstractC3340e.l(cVar);
        Class clsQ = interfaceC1280eL != null ? q(interfaceC1280eL) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            k8.f fVar = (k8.f) entry.getKey();
            q8.g gVar = (q8.g) entry.getValue();
            ClassLoader classLoader = clsQ.getClassLoader();
            AbstractC2855l.f(classLoader, "getClassLoader(...)");
            Object objS = s(gVar, classLoader);
            Pair pairA = objS != null ? i7.t.a(fVar.j(), objS) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return (Annotation) G7.f.h(clsQ, j7.K.r(arrayList), null, 4, null);
    }

    public static final Class q(InterfaceC1280e interfaceC1280e) {
        AbstractC2855l.g(interfaceC1280e, "<this>");
        L7.h0 h0VarG = interfaceC1280e.g();
        AbstractC2855l.f(h0VarG, "getSource(...)");
        if (h0VarG instanceof C2378z) {
            InterfaceC2376x interfaceC2376xD = ((C2378z) h0VarG).d();
            AbstractC2855l.e(interfaceC2376xD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((Q7.f) interfaceC2376xD).e();
        }
        if (h0VarG instanceof l.a) {
            R7.u uVarB = ((l.a) h0VarG).b();
            AbstractC2855l.e(uVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((R7.q) uVarB).t();
        }
        k8.b bVarN = AbstractC3340e.n(interfaceC1280e);
        if (bVarN == null) {
            return null;
        }
        return n(AbstractC1394f.j(interfaceC1280e.getClass()), bVarN, 0);
    }

    public static final C7.s r(AbstractC1295u abstractC1295u) {
        AbstractC2855l.g(abstractC1295u, "<this>");
        if (AbstractC2855l.b(abstractC1295u, AbstractC1294t.f7347e)) {
            return C7.s.f528g;
        }
        if (AbstractC2855l.b(abstractC1295u, AbstractC1294t.f7345c)) {
            return C7.s.f529h;
        }
        if (AbstractC2855l.b(abstractC1295u, AbstractC1294t.f7346d)) {
            return C7.s.f530i;
        }
        if (AbstractC2855l.b(abstractC1295u, AbstractC1294t.f7343a) || AbstractC2855l.b(abstractC1295u, AbstractC1294t.f7344b)) {
            return C7.s.f531j;
        }
        return null;
    }

    private static final Object s(q8.g gVar, ClassLoader classLoader) {
        if (gVar instanceof C3136a) {
            return p((M7.c) ((C3136a) gVar).b());
        }
        if (gVar instanceof C3137b) {
            return a((C3137b) gVar, classLoader);
        }
        if (gVar instanceof q8.k) {
            Pair pair = (Pair) ((q8.k) gVar).b();
            k8.b bVar = (k8.b) pair.getFirst();
            k8.f fVar = (k8.f) pair.getSecond();
            Class clsO = o(classLoader, bVar, 0, 4, null);
            if (clsO != null) {
                return i1.a(clsO, fVar.j());
            }
            return null;
        }
        if (!(gVar instanceof q8.s)) {
            if ((gVar instanceof q8.l) || (gVar instanceof q8.u)) {
                return null;
            }
            return gVar.b();
        }
        s.b bVar2 = (s.b) ((q8.s) gVar).b();
        if (bVar2 instanceof s.b.C0350b) {
            s.b.C0350b c0350b = (s.b.C0350b) bVar2;
            return n(classLoader, c0350b.b(), c0350b.a());
        }
        if (!(bVar2 instanceof s.b.a)) {
            throw new C2750m();
        }
        InterfaceC1283h interfaceC1283hP = ((s.b.a) bVar2).a().K0().p();
        InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
        if (interfaceC1280e != null) {
            return q(interfaceC1280e);
        }
        return null;
    }

    private static final List t(List list) throws IllegalAccessException, InvocationTargetException {
        List listE;
        if (list != null && list.isEmpty()) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC2855l.b(AbstractC3430a.b(AbstractC3430a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Annotation annotation = (Annotation) it2.next();
                    Class clsB = AbstractC3430a.b(AbstractC3430a.a(annotation));
                    if (!AbstractC2855l.b(clsB.getSimpleName(), "Container") || clsB.getAnnotation(kotlin.jvm.internal.F.class) == null) {
                        listE = AbstractC2800q.e(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listE = AbstractC2793j.e((Annotation[]) objInvoke);
                    }
                    AbstractC2800q.A(arrayList, listE);
                }
                return arrayList;
            }
        }
        return list;
    }
}
