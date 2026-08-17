package r;

import java.util.List;
import r.C3171f2;

/* JADX INFO: renamed from: r.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3164e extends C3171f2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f31240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31243e;

    C3164e(List list, List list2, int i10, int i11, int i12) {
        this.f31239a = list;
        this.f31240b = list2;
        this.f31241c = i10;
        this.f31242d = i11;
        this.f31243e = i12;
    }

    @Override // r.C3171f2.b
    List a() {
        return this.f31239a;
    }

    @Override // r.C3171f2.b
    List b() {
        return this.f31240b;
    }

    @Override // r.C3171f2.b
    int c() {
        return this.f31243e;
    }

    @Override // r.C3171f2.b
    int d() {
        return this.f31241c;
    }

    @Override // r.C3171f2.b
    int e() {
        return this.f31242d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3171f2.b) {
            C3171f2.b bVar = (C3171f2.b) obj;
            List list = this.f31239a;
            if (list != null ? list.equals(bVar.a()) : bVar.a() == null) {
                List list2 = this.f31240b;
                if (list2 != null ? list2.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f31241c == bVar.d() && this.f31242d == bVar.e() && this.f31243e == bVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List list = this.f31239a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List list2 = this.f31240b;
        return ((((((iHashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.f31241c) * 1000003) ^ this.f31242d) * 1000003) ^ this.f31243e;
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.f31239a + ", bestSizesForStreamUseCase=" + this.f31240b + ", maxFpsForBestSizes=" + this.f31241c + ", maxFpsForStreamUseCase=" + this.f31242d + ", maxFpsForAllSizes=" + this.f31243e + "}";
    }
}
