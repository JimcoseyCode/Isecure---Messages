package R7;

import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.K;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;
import w7.InterfaceC3488b;
import w7.InterfaceC3489c;
import w7.InterfaceC3490d;
import w7.InterfaceC3491e;
import w7.InterfaceC3492f;
import w7.InterfaceC3493g;
import w7.InterfaceC3494h;

/* JADX INFO: renamed from: R7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1394f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f10077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f10078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f10079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f10080d;

    static {
        int i10 = 0;
        List<C7.d> listM = AbstractC2800q.m(kotlin.jvm.internal.D.b(Boolean.TYPE), kotlin.jvm.internal.D.b(Byte.TYPE), kotlin.jvm.internal.D.b(Character.TYPE), kotlin.jvm.internal.D.b(Double.TYPE), kotlin.jvm.internal.D.b(Float.TYPE), kotlin.jvm.internal.D.b(Integer.TYPE), kotlin.jvm.internal.D.b(Long.TYPE), kotlin.jvm.internal.D.b(Short.TYPE));
        f10077a = listM;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listM, 10));
        for (C7.d dVar : listM) {
            arrayList.add(i7.t.a(AbstractC3430a.c(dVar), AbstractC3430a.d(dVar)));
        }
        f10078b = K.r(arrayList);
        List<C7.d> list = f10077a;
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
        for (C7.d dVar2 : list) {
            arrayList2.add(i7.t.a(AbstractC3430a.d(dVar2), AbstractC3430a.c(dVar2)));
        }
        f10079c = K.r(arrayList2);
        List listM2 = AbstractC2800q.m(InterfaceC3487a.class, Function1.class, Function2.class, w7.o.class, w7.p.class, w7.q.class, w7.r.class, w7.s.class, w7.t.class, w7.u.class, InterfaceC3488b.class, InterfaceC3489c.class, InterfaceC3490d.class, InterfaceC3491e.class, InterfaceC3492f.class, InterfaceC3493g.class, InterfaceC3494h.class, w7.i.class, w7.j.class, w7.k.class, w7.l.class, w7.m.class, w7.n.class);
        ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(listM2, 10));
        for (Object obj : listM2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            arrayList3.add(i7.t.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f10080d = K.r(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType it) {
        AbstractC2855l.g(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O8.i b(ParameterizedType it) {
        AbstractC2855l.g(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        AbstractC2855l.f(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC2793j.y(actualTypeArguments);
    }

    public static final k8.b e(Class cls) {
        k8.b bVarE;
        AbstractC2855l.g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            AbstractC2855l.f(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (bVarE = e(declaringClass)) != null) {
                    k8.f fVarQ = k8.f.q(cls.getSimpleName());
                    AbstractC2855l.f(fVarQ, "identifier(...)");
                    k8.b bVarD = bVarE.d(fVarQ);
                    if (bVarD != null) {
                        return bVarD;
                    }
                }
                return k8.b.f29200d.c(new k8.c(cls.getName()));
            }
        }
        k8.c cVar = new k8.c(cls.getName());
        k8.c cVarE = cVar.e();
        AbstractC2855l.f(cVarE, "parent(...)");
        k8.c cVarK = k8.c.k(cVar.g());
        AbstractC2855l.f(cVarK, "topLevel(...)");
        return new k8.b(cVarE, cVarK, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String f(Class cls) {
        AbstractC2855l.g(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                AbstractC2855l.f(name, "getName(...)");
                return P8.q.D(name, '.', '/', false, 4, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            String name2 = cls.getName();
            AbstractC2855l.f(name2, "getName(...)");
            sb.append(P8.q.D(name2, '.', '/', false, 4, null));
            sb.append(';');
            return sb.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class cls) {
        AbstractC2855l.g(cls, "<this>");
        return (Integer) f10080d.get(cls);
    }

    public static final List h(Type type) {
        AbstractC2855l.g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return AbstractC2800q.j();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return O8.l.S(O8.l.D(O8.l.n(type, C1392d.f10075g), C1393e.f10076g));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC2855l.f(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC2793j.v0(actualTypeArguments);
    }

    public static final Class i(Class cls) {
        AbstractC2855l.g(cls, "<this>");
        return (Class) f10078b.get(cls);
    }

    public static final ClassLoader j(Class cls) {
        AbstractC2855l.g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC2855l.f(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class k(Class cls) {
        AbstractC2855l.g(cls, "<this>");
        return (Class) f10079c.get(cls);
    }

    public static final boolean l(Class cls) {
        AbstractC2855l.g(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
