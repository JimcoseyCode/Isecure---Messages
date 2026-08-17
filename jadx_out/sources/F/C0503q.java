package F;

import android.util.Size;
import java.util.Map;

/* JADX INFO: renamed from: F.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0503q extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f1615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f1616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f1617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f1618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f1619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f1620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f1621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f1622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f1623i;

    C0503q(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4, Map map5, Map map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f1615a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f1616b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f1617c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f1618d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f1619e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f1620f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null maximum4x3SizeMap");
        }
        this.f1621g = map4;
        if (map5 == null) {
            throw new NullPointerException("Null maximum16x9SizeMap");
        }
        this.f1622h = map5;
        if (map6 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f1623i = map6;
    }

    @Override // F.s1
    public Size b() {
        return this.f1615a;
    }

    @Override // F.s1
    public Map d() {
        return this.f1622h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (this.f1615a.equals(s1Var.b()) && this.f1616b.equals(s1Var.n()) && this.f1617c.equals(s1Var.i()) && this.f1618d.equals(s1Var.l()) && this.f1619e.equals(s1Var.j()) && this.f1620f.equals(s1Var.h()) && this.f1621g.equals(s1Var.f()) && this.f1622h.equals(s1Var.d()) && this.f1623i.equals(s1Var.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // F.s1
    public Map f() {
        return this.f1621g;
    }

    @Override // F.s1
    public Map h() {
        return this.f1620f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f1615a.hashCode() ^ 1000003) * 1000003) ^ this.f1616b.hashCode()) * 1000003) ^ this.f1617c.hashCode()) * 1000003) ^ this.f1618d.hashCode()) * 1000003) ^ this.f1619e.hashCode()) * 1000003) ^ this.f1620f.hashCode()) * 1000003) ^ this.f1621g.hashCode()) * 1000003) ^ this.f1622h.hashCode()) * 1000003) ^ this.f1623i.hashCode();
    }

    @Override // F.s1
    public Size i() {
        return this.f1617c;
    }

    @Override // F.s1
    public Size j() {
        return this.f1619e;
    }

    @Override // F.s1
    public Map l() {
        return this.f1618d;
    }

    @Override // F.s1
    public Map n() {
        return this.f1616b;
    }

    @Override // F.s1
    public Map p() {
        return this.f1623i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f1615a + ", s720pSizeMap=" + this.f1616b + ", previewSize=" + this.f1617c + ", s1440pSizeMap=" + this.f1618d + ", recordSize=" + this.f1619e + ", maximumSizeMap=" + this.f1620f + ", maximum4x3SizeMap=" + this.f1621g + ", maximum16x9SizeMap=" + this.f1622h + ", ultraMaximumSizeMap=" + this.f1623i + "}";
    }
}
