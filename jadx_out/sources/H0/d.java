package H0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3635b;

    public d(Object obj, Object obj2) {
        this.f3634a = obj;
        this.f3635b = obj2;
    }

    public static d a(Object obj, Object obj2) {
        return new d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f3634a, this.f3634a) && c.a(dVar.f3635b, this.f3635b);
    }

    public int hashCode() {
        Object obj = this.f3634a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3635b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f3634a + " " + this.f3635b + "}";
    }
}
