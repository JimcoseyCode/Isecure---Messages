package y;

import android.graphics.Matrix;
import android.graphics.Rect;
import y.I0;

/* JADX INFO: renamed from: y.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3582h extends I0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f33791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Matrix f33795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f33796f;

    C3582h(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f33791a = rect;
        this.f33792b = i10;
        this.f33793c = i11;
        this.f33794d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f33795e = matrix;
        this.f33796f = z11;
    }

    @Override // y.I0.h
    public Rect a() {
        return this.f33791a;
    }

    @Override // y.I0.h
    public int b() {
        return this.f33792b;
    }

    @Override // y.I0.h
    public Matrix c() {
        return this.f33795e;
    }

    @Override // y.I0.h
    public int d() {
        return this.f33793c;
    }

    @Override // y.I0.h
    public boolean e() {
        return this.f33794d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I0.h) {
            I0.h hVar = (I0.h) obj;
            if (this.f33791a.equals(hVar.a()) && this.f33792b == hVar.b() && this.f33793c == hVar.d() && this.f33794d == hVar.e() && this.f33795e.equals(hVar.c()) && this.f33796f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // y.I0.h
    public boolean f() {
        return this.f33796f;
    }

    public int hashCode() {
        return ((((((((((this.f33791a.hashCode() ^ 1000003) * 1000003) ^ this.f33792b) * 1000003) ^ this.f33793c) * 1000003) ^ (this.f33794d ? 1231 : 1237)) * 1000003) ^ this.f33795e.hashCode()) * 1000003) ^ (this.f33796f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f33791a + ", getRotationDegrees=" + this.f33792b + ", getTargetRotation=" + this.f33793c + ", hasCameraTransform=" + this.f33794d + ", getSensorToBufferTransform=" + this.f33795e + ", isMirroring=" + this.f33796f + "}";
    }
}
