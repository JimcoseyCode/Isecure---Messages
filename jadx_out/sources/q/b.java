package Q;

import P.L;
import Q.r;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f8930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f8931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8932c;

    b(L l10, L l11, List list) {
        if (l10 == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f8930a = l10;
        if (l11 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f8931b = l11;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f8932c = list;
    }

    @Override // Q.r.b
    public List a() {
        return this.f8932c;
    }

    @Override // Q.r.b
    public L b() {
        return this.f8930a;
    }

    @Override // Q.r.b
    public L c() {
        return this.f8931b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f8930a.equals(bVar.b()) && this.f8931b.equals(bVar.c()) && this.f8932c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f8930a.hashCode() ^ 1000003) * 1000003) ^ this.f8931b.hashCode()) * 1000003) ^ this.f8932c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f8930a + ", secondarySurfaceEdge=" + this.f8931b + ", outConfigs=" + this.f8932c + "}";
    }
}
