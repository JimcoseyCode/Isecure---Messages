package I4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class I0 implements N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0 f4121b;

    I0(int i10, M0 m02) {
        this.f4120a = i10;
        this.f4121b = m02;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return N0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f4120a == n02.zza() && this.f4121b.equals(n02.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f4120a ^ 14552422) + (this.f4121b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f4120a + "intEncoding=" + this.f4121b + ')';
    }

    @Override // I4.N0
    public final int zza() {
        return this.f4120a;
    }

    @Override // I4.N0
    public final M0 zzb() {
        return this.f4121b;
    }
}
