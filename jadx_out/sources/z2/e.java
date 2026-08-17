package z2;

import c2.k;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f34247a = a.BITMAP_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34248b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f34249c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34250d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34251e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34252f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f34253g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34254h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34255i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34256j = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static e a(float f10) {
        return new e().p(f10);
    }

    private float[] e() {
        if (this.f34249c == null) {
            this.f34249c = new float[8];
        }
        return this.f34249c;
    }

    public int b() {
        return this.f34252f;
    }

    public float c() {
        return this.f34251e;
    }

    public float[] d() {
        return this.f34249c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f34248b == eVar.f34248b && this.f34250d == eVar.f34250d && Float.compare(eVar.f34251e, this.f34251e) == 0 && this.f34252f == eVar.f34252f && Float.compare(eVar.f34253g, this.f34253g) == 0 && this.f34247a == eVar.f34247a && this.f34254h == eVar.f34254h && this.f34255i == eVar.f34255i) {
            return Arrays.equals(this.f34249c, eVar.f34249c);
        }
        return false;
    }

    public int f() {
        return this.f34250d;
    }

    public float g() {
        return this.f34253g;
    }

    public boolean h() {
        return this.f34255i;
    }

    public int hashCode() {
        a aVar = this.f34247a;
        int iHashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f34248b ? 1 : 0)) * 31;
        float[] fArr = this.f34249c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f34250d) * 31;
        float f10 = this.f34251e;
        int iFloatToIntBits = (((iHashCode2 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f34252f) * 31;
        float f11 = this.f34253g;
        return ((((iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + (this.f34254h ? 1 : 0)) * 31) + (this.f34255i ? 1 : 0);
    }

    public boolean i() {
        return this.f34256j;
    }

    public boolean j() {
        return this.f34248b;
    }

    public a k() {
        return this.f34247a;
    }

    public boolean l() {
        return this.f34254h;
    }

    public e m(int i10) {
        this.f34252f = i10;
        return this;
    }

    public e n(float f10) {
        k.c(f10 >= 0.0f, "the border width cannot be < 0");
        this.f34251e = f10;
        return this;
    }

    public e o(float f10, float f11, float f12, float f13) {
        float[] fArrE = e();
        fArrE[1] = f10;
        fArrE[0] = f10;
        fArrE[3] = f11;
        fArrE[2] = f11;
        fArrE[5] = f12;
        fArrE[4] = f12;
        fArrE[7] = f13;
        fArrE[6] = f13;
        return this;
    }

    public e p(float f10) {
        Arrays.fill(e(), f10);
        return this;
    }

    public e q(int i10) {
        this.f34250d = i10;
        this.f34247a = a.OVERLAY_COLOR;
        return this;
    }

    public e r(float f10) {
        k.c(f10 >= 0.0f, "the padding cannot be < 0");
        this.f34253g = f10;
        return this;
    }

    public e s(boolean z10) {
        this.f34255i = z10;
        return this;
    }

    public e t(boolean z10) {
        this.f34248b = z10;
        return this;
    }

    public e u(a aVar) {
        this.f34247a = aVar;
        return this;
    }
}
