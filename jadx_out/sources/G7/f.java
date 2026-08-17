package G7;

import F7.Y0;
import i7.AbstractC2746i;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final Object g(Class annotationClass, Map values, List methods) {
        AbstractC2855l.g(annotationClass, "annotationClass");
        AbstractC2855l.g(values, "values");
        AbstractC2855l.g(methods, "methods");
        Lazy lazyB = AbstractC2746i.b(new b(values));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new d(annotationClass, values, AbstractC2746i.b(new c(annotationClass, values)), lazyB, methods));
        AbstractC2855l.e(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean i(Class cls, List list, Map map, Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zB;
        boolean z10;
        C7.d dVarA;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (AbstractC2855l.b((annotation == null || (dVarA = AbstractC3430a.a(annotation)) == null) ? null : AbstractC3430a.b(dVarA), cls)) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Method method = (Method) it.next();
                    Object obj2 = map.get(method.getName());
                    Object objInvoke = method.invoke(obj, null);
                    if (obj2 instanceof boolean[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zB = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zB = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zB = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zB = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zB = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zB = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zB = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zB = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zB = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zB = AbstractC2855l.b(obj2, objInvoke);
                    }
                    if (!zB) {
                        z10 = false;
                        break;
                    }
                }
                z10 = true;
                if (!z10) {
                    return true;
                }
            } else {
                z10 = true;
                if (!z10) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Map map) {
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return iHashCode;
    }

    private static final int k(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Class cls, Map map) {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        AbstractC2800q.m0(map.entrySet(), sb, ", ", "(", ")", 0, null, e.f3506g, 48, null);
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        String string;
        AbstractC2855l.g(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            AbstractC2855l.f(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    private static final String n(Lazy lazy) {
        return (String) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Class cls, Map map, Lazy lazy, Lazy lazy2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(lazy2));
                }
            } else if (name.equals("toString")) {
                return n(lazy);
            }
        }
        if (AbstractC2855l.b(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, AbstractC2793j.i0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(AbstractC2793j.v0(objArr));
        sb.append(')');
        throw new Y0(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void p(int i10, String str, Class cls) {
        String strN;
        C7.d dVarB = AbstractC2855l.b(cls, Class.class) ? D.b(C7.d.class) : (cls.isArray() && AbstractC2855l.b(cls.getComponentType(), Class.class)) ? D.b(C7.d[].class) : AbstractC3430a.e(cls);
        if (AbstractC2855l.b(dVarB.n(), D.b(Object[].class).n())) {
            StringBuilder sb = new StringBuilder();
            sb.append(dVarB.n());
            sb.append('<');
            Class<?> componentType = AbstractC3430a.b(dVarB).getComponentType();
            AbstractC2855l.f(componentType, "getComponentType(...)");
            sb.append(AbstractC3430a.e(componentType).n());
            sb.append('>');
            strN = sb.toString();
        } else {
            strN = dVarB.n();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof C7.d) {
            obj = AbstractC3430a.b((C7.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof C7.d[]) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                C7.d[] dVarArr = (C7.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (C7.d dVar : dVarArr) {
                    arrayList.add(AbstractC3430a.b(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
