package U3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11347a;

    private c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f11347a = str;
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f11347a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f11347a.equals(((c) obj).f11347a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11347a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f11347a + "\"}";
    }
}
