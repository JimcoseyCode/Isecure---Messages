package I4;

/* JADX INFO: renamed from: I4.d9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0850d9 implements L0 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4748g;

    EnumC0850d9(int i10) {
        this.f4748g = i10;
    }

    @Override // I4.L0
    public final int zza() {
        return this.f4748g;
    }
}
