package C6;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f509b;

    public a(int i10, int i11) {
        this.f508a = i10;
        this.f509b = i11;
    }

    public final int a() {
        return c.c(this.f508a, this.f509b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f508a == aVar.f508a && this.f509b == aVar.f509b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f508a) * 31) + Integer.hashCode(this.f509b);
    }

    public String toString() {
        return "ColorProperties(color=" + this.f508a + ", tone=" + this.f509b + ")";
    }
}
