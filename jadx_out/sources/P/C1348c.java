package P;

import P.U;
import java.util.List;

/* JADX INFO: renamed from: P.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1348c extends U.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f8709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8710b;

    C1348c(L l10, List list) {
        if (l10 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f8709a = l10;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f8710b = list;
    }

    @Override // P.U.b
    public List a() {
        return this.f8710b;
    }

    @Override // P.U.b
    public L b() {
        return this.f8709a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof U.b) {
            U.b bVar = (U.b) obj;
            if (this.f8709a.equals(bVar.b()) && this.f8710b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8709a.hashCode() ^ 1000003) * 1000003) ^ this.f8710b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f8709a + ", outConfigs=" + this.f8710b + "}";
    }
}
