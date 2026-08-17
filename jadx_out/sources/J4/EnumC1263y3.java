package J4;

/* JADX INFO: renamed from: J4.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1263y3 implements InterfaceC1141h {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6514g;

    EnumC1263y3(int i10) {
        this.f6514g = i10;
    }

    @Override // J4.InterfaceC1141h
    public final int zza() {
        return this.f6514g;
    }
}
