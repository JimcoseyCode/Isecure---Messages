package I4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public enum K6 implements L0 {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4151g;

    K6(int i10) {
        this.f4151g = i10;
    }

    @Override // I4.L0
    public final int zza() {
        return this.f4151g;
    }
}
