package R8;

/* JADX INFO: renamed from: R8.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1414i0 implements InterfaceC1439v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f10194g;

    public C1414i0(boolean z10) {
        this.f10194g = z10;
    }

    @Override // R8.InterfaceC1439v0
    public L0 a() {
        return null;
    }

    @Override // R8.InterfaceC1439v0
    public boolean d() {
        return this.f10194g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
