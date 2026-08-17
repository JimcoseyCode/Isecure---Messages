package F;

/* JADX INFO: renamed from: F.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0495m extends A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1554a;

    C0495m(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f1554a = obj;
    }

    @Override // F.A0
    public Object b() {
        return this.f1554a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            return this.f1554a.equals(((A0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f1554a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f1554a + "}";
    }
}
