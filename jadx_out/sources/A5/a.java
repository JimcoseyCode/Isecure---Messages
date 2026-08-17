package A5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f57b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f56a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f57b = list;
    }

    @Override // A5.x
    public List b() {
        return this.f57b;
    }

    @Override // A5.x
    public String c() {
        return this.f56a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f56a.equals(xVar.c()) && this.f57b.equals(xVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f56a.hashCode() ^ 1000003) * 1000003) ^ this.f57b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f56a + ", usedDates=" + this.f57b + "}";
    }
}
