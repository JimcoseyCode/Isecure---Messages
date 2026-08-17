package R7;

import b8.InterfaceC1817a;
import j7.AbstractC2800q;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class F extends u implements j, b8.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeVariable f10053a;

    public F(TypeVariable typeVariable) {
        AbstractC2855l.g(typeVariable, "typeVariable");
        this.f10053a = typeVariable;
    }

    @Override // b8.y
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.f10053a.getBounds();
        AbstractC2855l.f(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new s(type));
        }
        s sVar = (s) AbstractC2800q.E0(arrayList);
        return AbstractC2855l.b(sVar != null ? sVar.N() : null, Object.class) ? AbstractC2800q.j() : arrayList;
    }

    @Override // b8.InterfaceC1820d
    public /* bridge */ /* synthetic */ InterfaceC1817a b(k8.c cVar) {
        return b(cVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof F) && AbstractC2855l.b(this.f10053a, ((F) obj).f10053a);
    }

    @Override // b8.InterfaceC1820d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // b8.t
    public k8.f getName() {
        k8.f fVarQ = k8.f.q(this.f10053a.getName());
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return fVarQ;
    }

    public int hashCode() {
        return this.f10053a.hashCode();
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return false;
    }

    @Override // R7.j
    public AnnotatedElement t() {
        TypeVariable typeVariable = this.f10053a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public String toString() {
        return F.class.getName() + ": " + this.f10053a;
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
