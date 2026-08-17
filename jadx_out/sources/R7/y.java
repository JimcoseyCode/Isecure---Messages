package R7;

import L7.w0;
import L7.x0;
import b8.InterfaceC1817a;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends u implements j, A, b8.q {
    @Override // b8.s
    public boolean M() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // b8.q
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public q L() {
        Class<?> declaringClass = O().getDeclaringClass();
        AbstractC2855l.f(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    public abstract Member O();

    protected final List P(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z10) throws IllegalAccessException, InvocationTargetException {
        String str;
        AbstractC2855l.g(parameterTypes, "parameterTypes");
        AbstractC2855l.g(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List listB = C1391c.f10071a.b(O());
        int size = listB != null ? listB.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            E eA = E.f10052a.a(parameterTypes[i10]);
            if (listB != null) {
                str = (String) AbstractC2800q.h0(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + eA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new G(eA, parameterAnnotations[i10], str, z10 && i10 == AbstractC2793j.K(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    @Override // b8.InterfaceC1820d
    public /* bridge */ /* synthetic */ InterfaceC1817a b(k8.c cVar) {
        return b(cVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && AbstractC2855l.b(O(), ((y) obj).O());
    }

    @Override // b8.InterfaceC1820d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // R7.A
    public int getModifiers() {
        return O().getModifiers();
    }

    @Override // b8.t
    public k8.f getName() {
        k8.f fVarQ;
        String name = O().getName();
        return (name == null || (fVarQ = k8.f.q(name)) == null) ? k8.h.f29221b : fVarQ;
    }

    @Override // b8.s
    public x0 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? w0.h.f7371c : Modifier.isPrivate(modifiers) ? w0.e.f7368c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? P7.c.f8851c : P7.b.f8850c : P7.a.f8849c;
    }

    public int hashCode() {
        return O().hashCode();
    }

    @Override // b8.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // b8.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return false;
    }

    @Override // R7.j
    public AnnotatedElement t() {
        Member memberO = O();
        AbstractC2855l.e(memberO, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberO;
    }

    public String toString() {
        return getClass().getName() + ": " + O();
    }

    @Override // R7.j, b8.InterfaceC1820d
    public C1395g b(k8.c fqName) {
        Annotation[] declaredAnnotations;
        AbstractC2855l.g(fqName, "fqName");
        AnnotatedElement annotatedElementT = t();
        if (annotatedElementT == null || (declaredAnnotations = annotatedElementT.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }

    @Override // R7.j, b8.InterfaceC1820d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementT = t();
        return (annotatedElementT == null || (declaredAnnotations = annotatedElementT.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? AbstractC2800q.j() : listB;
    }
}
