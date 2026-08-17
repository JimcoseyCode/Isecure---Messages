package J4;

/* JADX INFO: renamed from: J4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1120e implements InterfaceC1155j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1148i f6029b;

    C1120e(int i10, EnumC1148i enumC1148i) {
        this.f6028a = i10;
        this.f6029b = enumC1148i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC1155j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1155j)) {
            return false;
        }
        InterfaceC1155j interfaceC1155j = (InterfaceC1155j) obj;
        return this.f6028a == interfaceC1155j.zza() && this.f6029b.equals(interfaceC1155j.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f6028a ^ 14552422) + (this.f6029b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6028a + "intEncoding=" + this.f6029b + ')';
    }

    @Override // J4.InterfaceC1155j
    public final int zza() {
        return this.f6028a;
    }

    @Override // J4.InterfaceC1155j
    public final EnumC1148i zzb() {
        return this.f6029b;
    }
}
