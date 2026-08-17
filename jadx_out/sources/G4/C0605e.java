package G4;

/* JADX INFO: renamed from: G4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0605e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0629h f2767b = EnumC0629h.DEFAULT;

    public final C0605e a(int i10) {
        this.f2766a = i10;
        return this;
    }

    public final InterfaceC0637i b() {
        return new C0597d(this.f2766a, this.f2767b);
    }
}
