package I4;

/* JADX INFO: renamed from: I4.s6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1011s6 implements L0 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4887g;

    EnumC1011s6(int i10) {
        this.f4887g = i10;
    }

    @Override // I4.L0
    public final int zza() {
        return this.f4887g;
    }
}
