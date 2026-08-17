package H4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class A extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3736c;

    /* synthetic */ A(String str, boolean z10, int i10, AbstractC0803z abstractC0803z) {
        this.f3734a = str;
        this.f3735b = z10;
        this.f3736c = i10;
    }

    @Override // H4.E
    public final int a() {
        return this.f3736c;
    }

    @Override // H4.E
    public final String b() {
        return this.f3734a;
    }

    @Override // H4.E
    public final boolean c() {
        return this.f3735b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E) {
            E e10 = (E) obj;
            if (this.f3734a.equals(e10.b()) && this.f3735b == e10.c() && this.f3736c == e10.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3734a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f3735b ? 1237 : 1231)) * 1000003) ^ this.f3736c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f3734a + ", enableFirelog=" + this.f3735b + ", firelogEventType=" + this.f3736c + "}";
    }
}
