package H4;

/* JADX INFO: renamed from: H4.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0802y extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f3796d;

    C0802y() {
    }

    @Override // H4.D
    public final D a(boolean z10) {
        this.f3794b = true;
        this.f3796d = (byte) (1 | this.f3796d);
        return this;
    }

    @Override // H4.D
    public final D b(int i10) {
        this.f3795c = 1;
        this.f3796d = (byte) (this.f3796d | 2);
        return this;
    }

    @Override // H4.D
    public final E c() {
        String str;
        if (this.f3796d == 3 && (str = this.f3793a) != null) {
            return new A(str, this.f3794b, this.f3795c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3793a == null) {
            sb.append(" libraryName");
        }
        if ((this.f3796d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f3796d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final D d(String str) {
        this.f3793a = "common";
        return this;
    }
}
