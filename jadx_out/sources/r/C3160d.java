package r;

import android.util.Size;
import java.util.List;
import r.V;

/* JADX INFO: renamed from: r.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3160d extends V.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f31230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F.k1 f31231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.D1 f31232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f31233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F.o1 f31234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f31235g;

    C3160d(String str, Class cls, F.k1 k1Var, F.D1 d12, Size size, F.o1 o1Var, List list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f31229a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f31230b = cls;
        if (k1Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f31231c = k1Var;
        if (d12 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f31232d = d12;
        this.f31233e = size;
        this.f31234f = o1Var;
        this.f31235g = list;
    }

    @Override // r.V.k
    List c() {
        return this.f31235g;
    }

    @Override // r.V.k
    F.k1 d() {
        return this.f31231c;
    }

    @Override // r.V.k
    F.o1 e() {
        return this.f31234f;
    }

    public boolean equals(Object obj) {
        Size size;
        F.o1 o1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof V.k) {
            V.k kVar = (V.k) obj;
            if (this.f31229a.equals(kVar.h()) && this.f31230b.equals(kVar.i()) && this.f31231c.equals(kVar.d()) && this.f31232d.equals(kVar.g()) && ((size = this.f31233e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((o1Var = this.f31234f) != null ? o1Var.equals(kVar.e()) : kVar.e() == null) && ((list = this.f31235g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // r.V.k
    Size f() {
        return this.f31233e;
    }

    @Override // r.V.k
    F.D1 g() {
        return this.f31232d;
    }

    @Override // r.V.k
    String h() {
        return this.f31229a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f31229a.hashCode() ^ 1000003) * 1000003) ^ this.f31230b.hashCode()) * 1000003) ^ this.f31231c.hashCode()) * 1000003) ^ this.f31232d.hashCode()) * 1000003;
        Size size = this.f31233e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        F.o1 o1Var = this.f31234f;
        int iHashCode3 = (iHashCode2 ^ (o1Var == null ? 0 : o1Var.hashCode())) * 1000003;
        List list = this.f31235g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // r.V.k
    Class i() {
        return this.f31230b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f31229a + ", useCaseType=" + this.f31230b + ", sessionConfig=" + this.f31231c + ", useCaseConfig=" + this.f31232d + ", surfaceResolution=" + this.f31233e + ", streamSpec=" + this.f31234f + ", captureTypes=" + this.f31235g + "}";
    }
}
