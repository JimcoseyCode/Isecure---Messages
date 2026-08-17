package K5;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7059b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f7058a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f7059b = str2;
    }

    @Override // K5.f
    public String b() {
        return this.f7058a;
    }

    @Override // K5.f
    public String c() {
        return this.f7059b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f7058a.equals(fVar.b()) && this.f7059b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7058a.hashCode() ^ 1000003) * 1000003) ^ this.f7059b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f7058a + ", version=" + this.f7059b + "}";
    }
}
