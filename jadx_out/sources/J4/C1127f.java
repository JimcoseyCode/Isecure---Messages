package J4;

/* JADX INFO: renamed from: J4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1127f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1148i f6041b = EnumC1148i.DEFAULT;

    public final C1127f a(int i10) {
        this.f6040a = i10;
        return this;
    }

    public final InterfaceC1155j b() {
        return new C1120e(this.f6040a, this.f6041b);
    }
}
