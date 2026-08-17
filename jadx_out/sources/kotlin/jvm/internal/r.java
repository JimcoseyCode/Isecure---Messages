package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements InterfaceC2847d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f29397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f29398h;

    public r(Class jClass, String moduleName) {
        AbstractC2855l.g(jClass, "jClass");
        AbstractC2855l.g(moduleName, "moduleName");
        this.f29397g = jClass;
        this.f29398h = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC2847d
    public Class b() {
        return this.f29397g;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && AbstractC2855l.b(b(), ((r) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
