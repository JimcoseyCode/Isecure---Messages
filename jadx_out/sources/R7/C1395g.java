package R7;

import R7.AbstractC1396h;
import b8.InterfaceC1817a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: renamed from: R7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1395g extends u implements InterfaceC1817a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotation f10081a;

    public C1395g(Annotation annotation) {
        AbstractC2855l.g(annotation, "annotation");
        this.f10081a = annotation;
    }

    public final Annotation N() {
        return this.f10081a;
    }

    @Override // b8.InterfaceC1817a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public q resolve() {
        return new q(AbstractC3430a.b(AbstractC3430a.a(this.f10081a)));
    }

    @Override // b8.InterfaceC1817a
    public k8.b c() {
        return AbstractC1394f.e(AbstractC3430a.b(AbstractC3430a.a(this.f10081a)));
    }

    @Override // b8.InterfaceC1817a
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1395g) && this.f10081a == ((C1395g) obj).f10081a;
    }

    @Override // b8.InterfaceC1817a
    public Collection getArguments() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = AbstractC3430a.b(AbstractC3430a.a(this.f10081a)).getDeclaredMethods();
        AbstractC2855l.f(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC1396h.a aVar = AbstractC1396h.f10082b;
            Object objInvoke = method.invoke(this.f10081a, null);
            AbstractC2855l.f(objInvoke, "invoke(...)");
            arrayList.add(aVar.a(objInvoke, k8.f.q(method.getName())));
        }
        return arrayList;
    }

    public int hashCode() {
        return System.identityHashCode(this.f10081a);
    }

    @Override // b8.InterfaceC1817a
    public boolean s() {
        return false;
    }

    public String toString() {
        return C1395g.class.getName() + ": " + this.f10081a;
    }
}
