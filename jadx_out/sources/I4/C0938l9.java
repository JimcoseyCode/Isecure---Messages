package I4;

/* JADX INFO: renamed from: I4.l9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0938l9 extends AbstractC0982p9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4815c;

    /* synthetic */ C0938l9(String str, boolean z10, int i10, AbstractC0927k9 abstractC0927k9) {
        this.f4813a = str;
        this.f4814b = z10;
        this.f4815c = i10;
    }

    @Override // I4.AbstractC0982p9
    public final int a() {
        return this.f4815c;
    }

    @Override // I4.AbstractC0982p9
    public final String b() {
        return this.f4813a;
    }

    @Override // I4.AbstractC0982p9
    public final boolean c() {
        return this.f4814b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0982p9) {
            AbstractC0982p9 abstractC0982p9 = (AbstractC0982p9) obj;
            if (this.f4813a.equals(abstractC0982p9.b()) && this.f4814b == abstractC0982p9.c() && this.f4815c == abstractC0982p9.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4813a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f4814b ? 1237 : 1231)) * 1000003) ^ this.f4815c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f4813a + ", enableFirelog=" + this.f4814b + ", firelogEventType=" + this.f4815c + "}";
    }
}
