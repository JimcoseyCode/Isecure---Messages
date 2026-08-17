package L7;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.f f7279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G8.j f7280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(k8.f underlyingPropertyName, G8.j underlyingType) {
        super(null);
        AbstractC2855l.g(underlyingPropertyName, "underlyingPropertyName");
        AbstractC2855l.g(underlyingType, "underlyingType");
        this.f7279a = underlyingPropertyName;
        this.f7280b = underlyingType;
    }

    @Override // L7.r0
    public boolean a(k8.f name) {
        AbstractC2855l.g(name, "name");
        return AbstractC2855l.b(this.f7279a, name);
    }

    public final k8.f c() {
        return this.f7279a;
    }

    public final G8.j d() {
        return this.f7280b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f7279a + ", underlyingType=" + this.f7280b + ')';
    }
}
