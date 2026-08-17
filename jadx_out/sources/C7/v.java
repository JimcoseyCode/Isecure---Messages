package C7;

import i7.C2750m;
import j7.AbstractC2800q;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f539a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.f524h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.f523g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.f525i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f539a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2853j implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f540g = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class p02) {
            AbstractC2855l.g(p02, "p0");
            return p02.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(o oVar, boolean z10) {
        e classifier = oVar.getClassifier();
        if (classifier instanceof p) {
            return new u((p) classifier);
        }
        if (!(classifier instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + oVar);
        }
        d dVar = (d) classifier;
        Class clsC = z10 ? AbstractC3430a.c(dVar) : AbstractC3430a.b(dVar);
        List arguments = oVar.getArguments();
        if (arguments.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, arguments);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        q qVar = (q) AbstractC2800q.E0(arguments);
        if (qVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + oVar);
        }
        r rVarA = qVar.a();
        o oVarB = qVar.b();
        int i10 = rVarA == null ? -1 : a.f539a[rVarA.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsC;
        }
        if (i10 != 2 && i10 != 3) {
            throw new C2750m();
        }
        AbstractC2855l.d(oVarB);
        Type typeD = d(oVarB, false, 1, null);
        return typeD instanceof Class ? clsC : new C7.a(typeD);
    }

    static /* synthetic */ Type d(o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(oVar, z10);
    }

    private static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((q) it.next()));
            }
            return new t(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((q) it2.next()));
            }
            return new t(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((q) it3.next()));
        }
        return new t(cls, typeE, arrayList3);
    }

    public static final Type f(o oVar) {
        Type typeC;
        AbstractC2855l.g(oVar, "<this>");
        return (!(oVar instanceof kotlin.jvm.internal.m) || (typeC = ((kotlin.jvm.internal.m) oVar).c()) == null) ? d(oVar, false, 1, null) : typeC;
    }

    private static final Type g(q qVar) {
        r rVarD = qVar.d();
        if (rVarD == null) {
            return w.f541i.a();
        }
        o oVarC = qVar.c();
        AbstractC2855l.d(oVarC);
        int i10 = a.f539a[rVarD.ordinal()];
        if (i10 == 1) {
            return new w(null, c(oVarC, true));
        }
        if (i10 == 2) {
            return c(oVarC, true);
        }
        if (i10 == 3) {
            return new w(c(oVarC, true), null);
        }
        throw new C2750m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            AbstractC2855l.f(name, "getName(...)");
            return name;
        }
        O8.i iVarN = O8.l.n(type, b.f540g);
        return ((Class) O8.l.I(iVarN)).getName() + P8.q.A("[]", O8.l.v(iVarN));
    }
}
