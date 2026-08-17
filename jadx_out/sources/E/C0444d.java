package E;

import E.Q;
import P.C1365u;
import java.util.List;

/* JADX INFO: renamed from: E.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0444d extends Q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1365u f948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1365u f949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f951d;

    C0444d(C1365u c1365u, C1365u c1365u2, int i10, List list) {
        if (c1365u == null) {
            throw new NullPointerException("Null edge");
        }
        this.f948a = c1365u;
        if (c1365u2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f949b = c1365u2;
        this.f950c = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f951d = list;
    }

    @Override // E.Q.a
    C1365u a() {
        return this.f948a;
    }

    @Override // E.Q.a
    int b() {
        return this.f950c;
    }

    @Override // E.Q.a
    List c() {
        return this.f951d;
    }

    @Override // E.Q.a
    C1365u d() {
        return this.f949b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q.a) {
            Q.a aVar = (Q.a) obj;
            if (this.f948a.equals(aVar.a()) && this.f949b.equals(aVar.d()) && this.f950c == aVar.b() && this.f951d.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f948a.hashCode() ^ 1000003) * 1000003) ^ this.f949b.hashCode()) * 1000003) ^ this.f950c) * 1000003) ^ this.f951d.hashCode();
    }

    public String toString() {
        return "In{edge=" + this.f948a + ", postviewEdge=" + this.f949b + ", inputFormat=" + this.f950c + ", outputFormats=" + this.f951d + "}";
    }
}
