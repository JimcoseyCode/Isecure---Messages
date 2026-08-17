package I4;

/* JADX INFO: renamed from: I4.j9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0916j9 extends AbstractC0971o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f4791d;

    C0916j9() {
    }

    @Override // I4.AbstractC0971o9
    public final AbstractC0971o9 a(boolean z10) {
        this.f4789b = true;
        this.f4791d = (byte) (1 | this.f4791d);
        return this;
    }

    @Override // I4.AbstractC0971o9
    public final AbstractC0971o9 b(int i10) {
        this.f4790c = 1;
        this.f4791d = (byte) (this.f4791d | 2);
        return this;
    }

    @Override // I4.AbstractC0971o9
    public final AbstractC0982p9 c() {
        String str;
        if (this.f4791d == 3 && (str = this.f4788a) != null) {
            return new C0938l9(str, this.f4789b, this.f4790c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4788a == null) {
            sb.append(" libraryName");
        }
        if ((this.f4791d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f4791d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC0971o9 d(String str) {
        this.f4788a = str;
        return this;
    }
}
