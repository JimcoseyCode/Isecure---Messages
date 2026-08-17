package R7;

import R7.E;
import b8.InterfaceC1818b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends y implements b8.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f10106a;

    public z(Method member) {
        AbstractC2855l.g(member, "member");
        this.f10106a = member;
    }

    @Override // b8.r
    public boolean H() {
        return p() != null;
    }

    @Override // R7.y
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Method O() {
        return this.f10106a;
    }

    @Override // b8.r
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public E getReturnType() {
        E.a aVar = E.f10052a;
        Type genericReturnType = O().getGenericReturnType();
        AbstractC2855l.f(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // b8.z
    public List getTypeParameters() {
        TypeVariable<Method>[] typeParameters = O().getTypeParameters();
        AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // b8.r
    public List i() {
        Type[] genericParameterTypes = O().getGenericParameterTypes();
        AbstractC2855l.f(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = O().getParameterAnnotations();
        AbstractC2855l.f(parameterAnnotations, "getParameterAnnotations(...)");
        return P(genericParameterTypes, parameterAnnotations, O().isVarArgs());
    }

    @Override // b8.r
    public InterfaceC1818b p() {
        Object defaultValue = O().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC1396h.f10082b.a(defaultValue, null);
        }
        return null;
    }
}
