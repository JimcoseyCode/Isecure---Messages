package C7;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Type f512g;

    public a(Type elementType) {
        AbstractC2855l.g(elementType, "elementType");
        this.f512g = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC2855l.b(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f512g;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return v.h(this.f512g) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
