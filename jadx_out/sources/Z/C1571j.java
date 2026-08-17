package Z;

import Z.AbstractC1582v;
import java.util.List;

/* JADX INFO: renamed from: Z.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1571j extends AbstractC1582v.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f13390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f13391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f13392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f13393m;

    C1571j(int i10, int i11, String str, List list) {
        this.f13390j = i10;
        this.f13391k = i11;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f13392l = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f13393m = list;
    }

    @Override // Z.AbstractC1582v.b
    int c() {
        return this.f13391k;
    }

    @Override // Z.AbstractC1582v.b
    public String d() {
        return this.f13392l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1582v.b) {
            AbstractC1582v.b bVar = (AbstractC1582v.b) obj;
            if (this.f13390j == bVar.g() && this.f13391k == bVar.c() && this.f13392l.equals(bVar.d()) && this.f13393m.equals(bVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // Z.AbstractC1582v.b
    public List f() {
        return this.f13393m;
    }

    @Override // Z.AbstractC1582v.b
    int g() {
        return this.f13390j;
    }

    public int hashCode() {
        return ((((((this.f13390j ^ 1000003) * 1000003) ^ this.f13391k) * 1000003) ^ this.f13392l.hashCode()) * 1000003) ^ this.f13393m.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f13390j + ", highSpeedValue=" + this.f13391k + ", name=" + this.f13392l + ", typicalSizes=" + this.f13393m + "}";
    }
}
