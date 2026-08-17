package G4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class O5 extends I2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C6 f2529i;

    O5(C6 c62, int i10) {
        super(c62.size(), i10);
        this.f2529i = c62;
    }

    @Override // G4.I2
    protected final Object b(int i10) {
        return this.f2529i.get(i10);
    }
}
