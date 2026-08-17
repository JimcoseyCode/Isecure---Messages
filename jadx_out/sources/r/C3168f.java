package r;

import android.util.Range;
import r.C3171f2;

/* JADX INFO: renamed from: r.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3168f extends C3171f2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f31259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Range f31260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f31261j;

    C3168f(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
        this.f31252a = i10;
        this.f31253b = z10;
        this.f31254c = i11;
        this.f31255d = z11;
        this.f31256e = z12;
        this.f31257f = z13;
        this.f31258g = z14;
        this.f31259h = z15;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f31260i = range;
        this.f31261j = z16;
    }

    @Override // r.C3171f2.d
    int a() {
        return this.f31252a;
    }

    @Override // r.C3171f2.d
    int b() {
        return this.f31254c;
    }

    @Override // r.C3171f2.d
    Range c() {
        return this.f31260i;
    }

    @Override // r.C3171f2.d
    boolean d() {
        return this.f31253b;
    }

    @Override // r.C3171f2.d
    boolean e() {
        return this.f31258g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3171f2.d) {
            C3171f2.d dVar = (C3171f2.d) obj;
            if (this.f31252a == dVar.a() && this.f31253b == dVar.d() && this.f31254c == dVar.b() && this.f31255d == dVar.g() && this.f31256e == dVar.i() && this.f31257f == dVar.f() && this.f31258g == dVar.e() && this.f31259h == dVar.k() && this.f31260i.equals(dVar.c()) && this.f31261j == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // r.C3171f2.d
    boolean f() {
        return this.f31257f;
    }

    @Override // r.C3171f2.d
    boolean g() {
        return this.f31255d;
    }

    @Override // r.C3171f2.d
    boolean h() {
        return this.f31261j;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f31252a ^ 1000003) * 1000003) ^ (this.f31253b ? 1231 : 1237)) * 1000003) ^ this.f31254c) * 1000003) ^ (this.f31255d ? 1231 : 1237)) * 1000003) ^ (this.f31256e ? 1231 : 1237)) * 1000003) ^ (this.f31257f ? 1231 : 1237)) * 1000003) ^ (this.f31258g ? 1231 : 1237)) * 1000003) ^ (this.f31259h ? 1231 : 1237)) * 1000003) ^ this.f31260i.hashCode()) * 1000003) ^ (this.f31261j ? 1231 : 1237);
    }

    @Override // r.C3171f2.d
    boolean i() {
        return this.f31256e;
    }

    @Override // r.C3171f2.d
    boolean k() {
        return this.f31259h;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.f31252a + ", hasVideoCapture=" + this.f31253b + ", getRequiredMaxBitDepth=" + this.f31254c + ", isPreviewStabilizationOn=" + this.f31255d + ", isUltraHdrOn=" + this.f31256e + ", isHighSpeedOn=" + this.f31257f + ", isFeatureComboInvocation=" + this.f31258g + ", requiresFeatureComboQuery=" + this.f31259h + ", getTargetFpsRange=" + this.f31260i + ", isStrictFpsRequired=" + this.f31261j + "}";
    }
}
