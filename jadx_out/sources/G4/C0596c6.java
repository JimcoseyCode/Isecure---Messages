package G4;

/* JADX INFO: renamed from: G4.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0596c6 extends AbstractC0636h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f2756d;

    C0596c6() {
    }

    @Override // G4.AbstractC0636h6
    public final AbstractC0636h6 a(boolean z10) {
        this.f2754b = true;
        this.f2756d = (byte) (1 | this.f2756d);
        return this;
    }

    @Override // G4.AbstractC0636h6
    public final AbstractC0636h6 b(int i10) {
        this.f2755c = 1;
        this.f2756d = (byte) (this.f2756d | 2);
        return this;
    }

    @Override // G4.AbstractC0636h6
    public final AbstractC0644i6 c() {
        String str;
        if (this.f2756d == 3 && (str = this.f2753a) != null) {
            return new C0612e6(str, this.f2754b, this.f2755c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2753a == null) {
            sb.append(" libraryName");
        }
        if ((this.f2756d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f2756d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC0636h6 d(String str) {
        this.f2753a = "play-services-code-scanner";
        return this;
    }
}
