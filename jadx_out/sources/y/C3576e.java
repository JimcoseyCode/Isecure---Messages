package y;

import android.graphics.Rect;
import android.util.Size;
import y.w0;

/* JADX INFO: renamed from: y.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3576e extends w0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f33781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f33782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F.M f33783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f33785e;

    C3576e(Size size, Rect rect, F.M m10, int i10, boolean z10) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f33781a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f33782b = rect;
        this.f33783c = m10;
        this.f33784d = i10;
        this.f33785e = z10;
    }

    @Override // y.w0.a
    public F.M a() {
        return this.f33783c;
    }

    @Override // y.w0.a
    public Rect b() {
        return this.f33782b;
    }

    @Override // y.w0.a
    public Size c() {
        return this.f33781a;
    }

    @Override // y.w0.a
    public boolean d() {
        return this.f33785e;
    }

    @Override // y.w0.a
    public int e() {
        return this.f33784d;
    }

    public boolean equals(Object obj) {
        F.M m10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0.a) {
            w0.a aVar = (w0.a) obj;
            if (this.f33781a.equals(aVar.c()) && this.f33782b.equals(aVar.b()) && ((m10 = this.f33783c) != null ? m10.equals(aVar.a()) : aVar.a() == null) && this.f33784d == aVar.e() && this.f33785e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f33781a.hashCode() ^ 1000003) * 1000003) ^ this.f33782b.hashCode()) * 1000003;
        F.M m10 = this.f33783c;
        return ((((iHashCode ^ (m10 == null ? 0 : m10.hashCode())) * 1000003) ^ this.f33784d) * 1000003) ^ (this.f33785e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f33781a + ", inputCropRect=" + this.f33782b + ", cameraInternal=" + this.f33783c + ", rotationDegrees=" + this.f33784d + ", mirroring=" + this.f33785e + "}";
    }
}
