package R7;

import b8.InterfaceC1827k;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends y implements InterfaceC1827k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Constructor f10102a;

    public t(Constructor member) {
        AbstractC2855l.g(member, "member");
        this.f10102a = member;
    }

    @Override // R7.y
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Constructor O() {
        return this.f10102a;
    }

    @Override // b8.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = O().getTypeParameters();
        AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // b8.InterfaceC1827k
    public List i() {
        Type[] genericParameterTypes = O().getGenericParameterTypes();
        AbstractC2855l.d(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return AbstractC2800q.j();
        }
        Class declaringClass = O().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) AbstractC2793j.n(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = O().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + O());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            AbstractC2855l.d(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) AbstractC2793j.n(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        AbstractC2855l.d(genericParameterTypes);
        AbstractC2855l.d(parameterAnnotations);
        return P(genericParameterTypes, parameterAnnotations, O().isVarArgs());
    }
}
