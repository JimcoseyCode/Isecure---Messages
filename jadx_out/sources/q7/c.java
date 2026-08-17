package Q7;

import I7.o;
import R7.AbstractC1394f;
import d8.InterfaceC2376x;
import j7.AbstractC2793j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import k8.b;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import t8.EnumC3382e;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9864a = new c();

    private c() {
    }

    private final q8.f a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            k8.b bVarE = AbstractC1394f.e(cls);
            k8.b bVarM = K7.c.f7110a.m(bVarE.a());
            if (bVarM != null) {
                bVarE = bVarM;
            }
            return new q8.f(bVarE, i10);
        }
        if (!AbstractC2855l.b(cls, Void.TYPE)) {
            I7.l lVarQ = EnumC3382e.k(cls.getName()).q();
            AbstractC2855l.f(lVarQ, "getPrimitiveType(...)");
            return i10 > 0 ? new q8.f(k8.b.f29200d.c(lVarQ.p()), i10 - 1) : new q8.f(k8.b.f29200d.c(lVarQ.r()), i10);
        }
        b.a aVar = k8.b.f29200d;
        k8.c cVarL = o.a.f5193f.l();
        AbstractC2855l.f(cVarL, "toSafe(...)");
        return new q8.f(aVar.c(cVarL), i10);
    }

    private final void c(Class cls, InterfaceC2376x.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC2845b.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            k8.f fVar = k8.h.f29229j;
            m mVar = m.f9878a;
            AbstractC2855l.d(constructor);
            InterfaceC2376x.e eVarA = dVar.a(fVar, mVar.a(constructor));
            if (eVarA != null) {
                Iterator itA2 = AbstractC2845b.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC2855l.d(annotation);
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                AbstractC2855l.d(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator itA3 = AbstractC2845b.a(parameterAnnotations[i10]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class clsB = AbstractC3430a.b(AbstractC3430a.a(annotation2));
                            k8.b bVarE = AbstractC1394f.e(clsB);
                            AbstractC2855l.d(annotation2);
                            InterfaceC2376x.a aVarB = eVarA.b(i10 + length, bVarE, new b(annotation2));
                            if (aVarB != null) {
                                f9864a.h(aVarB, annotation2, clsB);
                            }
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void d(Class cls, InterfaceC2376x.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC2845b.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            k8.f fVarQ = k8.f.q(field.getName());
            AbstractC2855l.f(fVarQ, "identifier(...)");
            m mVar = m.f9878a;
            AbstractC2855l.d(field);
            InterfaceC2376x.c cVarB = dVar.b(fVarQ, mVar.b(field), null);
            if (cVarB != null) {
                Iterator itA2 = AbstractC2845b.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC2855l.d(annotation);
                    f(cVarB, annotation);
                }
                cVarB.a();
            }
        }
    }

    private final void e(Class cls, InterfaceC2376x.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC2845b.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            k8.f fVarQ = k8.f.q(method.getName());
            AbstractC2855l.f(fVarQ, "identifier(...)");
            m mVar = m.f9878a;
            AbstractC2855l.d(method);
            InterfaceC2376x.e eVarA = dVar.a(fVarQ, mVar.c(method));
            if (eVarA != null) {
                Iterator itA2 = AbstractC2845b.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC2855l.d(annotation);
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                AbstractC2855l.f(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Iterator itA3 = AbstractC2845b.a(annotationArr[i10]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class clsB = AbstractC3430a.b(AbstractC3430a.a(annotation2));
                        k8.b bVarE = AbstractC1394f.e(clsB);
                        AbstractC2855l.d(annotation2);
                        InterfaceC2376x.a aVarB = eVarA.b(i10, bVarE, new b(annotation2));
                        if (aVarB != null) {
                            f9864a.h(aVarB, annotation2, clsB);
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void f(InterfaceC2376x.c cVar, Annotation annotation) throws InvocationTargetException {
        Class clsB = AbstractC3430a.b(AbstractC3430a.a(annotation));
        InterfaceC2376x.a aVarC = cVar.c(AbstractC1394f.e(clsB), new b(annotation));
        if (aVarC != null) {
            f9864a.h(aVarC, annotation, clsB);
        }
    }

    private final void g(InterfaceC2376x.a aVar, k8.f fVar, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (AbstractC2855l.b(enclosingClass, Class.class)) {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.f(fVar, a((Class) obj));
            return;
        }
        if (i.f9871a.contains(enclosingClass)) {
            aVar.e(fVar, obj);
            return;
        }
        if (AbstractC1394f.l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            AbstractC2855l.d(enclosingClass);
            k8.b bVarE = AbstractC1394f.e(enclosingClass);
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            k8.f fVarQ = k8.f.q(((Enum) obj).name());
            AbstractC2855l.f(fVarQ, "identifier(...)");
            aVar.b(fVar, bVarE, fVarQ);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            AbstractC2855l.f(interfaces, "getInterfaces(...)");
            Class cls = (Class) AbstractC2793j.i0(interfaces);
            AbstractC2855l.d(cls);
            InterfaceC2376x.a aVarD = aVar.d(fVar, AbstractC1394f.e(cls));
            if (aVarD == null) {
                return;
            }
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarD, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        InterfaceC2376x.b bVarC = aVar.c(fVar);
        if (bVarC == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            AbstractC2855l.d(componentType);
            k8.b bVarE2 = AbstractC1394f.e(componentType);
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                AbstractC2855l.e(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                k8.f fVarQ2 = k8.f.q(((Enum) obj2).name());
                AbstractC2855l.f(fVarQ2, "identifier(...)");
                bVarC.b(bVarE2, fVarQ2);
                i10++;
            }
        } else if (AbstractC2855l.b(componentType, Class.class)) {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                AbstractC2855l.e(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarC.e(a((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                AbstractC2855l.d(componentType);
                InterfaceC2376x.a aVarC = bVarC.c(AbstractC1394f.e(componentType));
                if (aVarC != null) {
                    AbstractC2855l.e(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(aVarC, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                bVarC.d(objArr4[i10]);
                i10++;
            }
        }
        bVarC.a();
    }

    private final void h(InterfaceC2376x.a aVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Iterator itA = AbstractC2845b.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                AbstractC2855l.d(objInvoke);
                k8.f fVarQ = k8.f.q(method.getName());
                AbstractC2855l.f(fVarQ, "identifier(...)");
                g(aVar, fVarQ, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class klass, InterfaceC2376x.c visitor) {
        AbstractC2855l.g(klass, "klass");
        AbstractC2855l.g(visitor, "visitor");
        Iterator itA = AbstractC2845b.a(klass.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            AbstractC2855l.d(annotation);
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void i(Class klass, InterfaceC2376x.d memberVisitor) {
        AbstractC2855l.g(klass, "klass");
        AbstractC2855l.g(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
