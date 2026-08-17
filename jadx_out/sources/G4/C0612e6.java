package G4;

/* JADX INFO: renamed from: G4.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0612e6 extends AbstractC0644i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2784c;

    /* synthetic */ C0612e6(String str, boolean z10, int i10, AbstractC0604d6 abstractC0604d6) {
        this.f2782a = str;
        this.f2783b = z10;
        this.f2784c = i10;
    }

    @Override // G4.AbstractC0644i6
    public final int a() {
        return this.f2784c;
    }

    @Override // G4.AbstractC0644i6
    public final String b() {
        return this.f2782a;
    }

    @Override // G4.AbstractC0644i6
    public final boolean c() {
        return this.f2783b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0644i6) {
            AbstractC0644i6 abstractC0644i6 = (AbstractC0644i6) obj;
            if (this.f2782a.equals(abstractC0644i6.b()) && this.f2783b == abstractC0644i6.c() && this.f2784c == abstractC0644i6.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2782a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f2783b ? 1237 : 1231)) * 1000003) ^ this.f2784c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f2782a + ", enableFirelog=" + this.f2783b + ", firelogEventType=" + this.f2784c + "}";
    }
}
