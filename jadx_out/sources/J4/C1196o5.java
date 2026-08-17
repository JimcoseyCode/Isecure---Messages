package J4;

/* JADX INFO: renamed from: J4.o5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1196o5 extends AbstractC1223s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6226c;

    /* synthetic */ C1196o5(String str, boolean z10, int i10, AbstractC1182m5 abstractC1182m5) {
        this.f6224a = str;
        this.f6225b = z10;
        this.f6226c = i10;
    }

    @Override // J4.AbstractC1223s5
    public final int a() {
        return this.f6226c;
    }

    @Override // J4.AbstractC1223s5
    public final String b() {
        return this.f6224a;
    }

    @Override // J4.AbstractC1223s5
    public final boolean c() {
        return this.f6225b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1223s5) {
            AbstractC1223s5 abstractC1223s5 = (AbstractC1223s5) obj;
            if (this.f6224a.equals(abstractC1223s5.b()) && this.f6225b == abstractC1223s5.c() && this.f6226c == abstractC1223s5.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6224a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f6225b ? 1237 : 1231)) * 1000003) ^ this.f6226c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f6224a + ", enableFirelog=" + this.f6225b + ", firelogEventType=" + this.f6226c + "}";
    }
}
