package J4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class L5 extends I2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final N5 f5802i;

    L5(N5 n52, int i10) {
        super(n52.size(), i10);
        this.f5802i = n52;
    }

    @Override // J4.I2
    protected final Object b(int i10) {
        return this.f5802i.get(i10);
    }
}
