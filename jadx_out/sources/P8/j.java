package P8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7.c f8913b;

    public j(String value, B7.c range) {
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(range, "range");
        this.f8912a = value;
        this.f8913b = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC2855l.b(this.f8912a, jVar.f8912a) && AbstractC2855l.b(this.f8913b, jVar.f8913b);
    }

    public int hashCode() {
        return (this.f8912a.hashCode() * 31) + this.f8913b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f8912a + ", range=" + this.f8913b + ')';
    }
}
