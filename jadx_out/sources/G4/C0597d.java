package G4;

/* JADX INFO: renamed from: G4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0597d implements InterfaceC0637i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0629h f2758b;

    C0597d(int i10, EnumC0629h enumC0629h) {
        this.f2757a = i10;
        this.f2758b = enumC0629h;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC0637i.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC0637i)) {
            return false;
        }
        InterfaceC0637i interfaceC0637i = (InterfaceC0637i) obj;
        return this.f2757a == interfaceC0637i.zza() && this.f2758b.equals(interfaceC0637i.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f2757a ^ 14552422) + (this.f2758b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f2757a + "intEncoding=" + this.f2758b + ')';
    }

    @Override // G4.InterfaceC0637i
    public final int zza() {
        return this.f2757a;
    }

    @Override // G4.InterfaceC0637i
    public final EnumC0629h zzb() {
        return this.f2758b;
    }
}
