package J4;

/* JADX INFO: renamed from: J4.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1175l5 extends AbstractC1216r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f6170d;

    C1175l5() {
    }

    @Override // J4.AbstractC1216r5
    public final AbstractC1216r5 a(boolean z10) {
        this.f6168b = true;
        this.f6170d = (byte) (1 | this.f6170d);
        return this;
    }

    @Override // J4.AbstractC1216r5
    public final AbstractC1216r5 b(int i10) {
        this.f6169c = 1;
        this.f6170d = (byte) (this.f6170d | 2);
        return this;
    }

    @Override // J4.AbstractC1216r5
    public final AbstractC1223s5 c() {
        String str;
        if (this.f6170d == 3 && (str = this.f6167a) != null) {
            return new C1196o5(str, this.f6168b, this.f6169c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6167a == null) {
            sb.append(" libraryName");
        }
        if ((this.f6170d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f6170d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC1216r5 d(String str) {
        this.f6167a = "vision-common";
        return this;
    }
}
