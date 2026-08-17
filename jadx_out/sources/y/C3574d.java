package y;

import F.u1;
import android.graphics.Matrix;

/* JADX INFO: renamed from: y.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3574d extends AbstractC3577e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f33776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f33779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33780e;

    C3574d(u1 u1Var, long j10, int i10, Matrix matrix, int i11) {
        if (u1Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f33776a = u1Var;
        this.f33777b = j10;
        this.f33778c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f33779d = matrix;
        this.f33780e = i11;
    }

    @Override // y.AbstractC3577e0, y.Y
    public long a() {
        return this.f33777b;
    }

    @Override // y.AbstractC3577e0, y.Y
    public u1 b() {
        return this.f33776a;
    }

    @Override // y.AbstractC3577e0, y.Y
    public int c() {
        return this.f33780e;
    }

    @Override // y.AbstractC3577e0, y.Y
    public int e() {
        return this.f33778c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3577e0) {
            AbstractC3577e0 abstractC3577e0 = (AbstractC3577e0) obj;
            if (this.f33776a.equals(abstractC3577e0.b()) && this.f33777b == abstractC3577e0.a() && this.f33778c == abstractC3577e0.e() && this.f33779d.equals(abstractC3577e0.g()) && this.f33780e == abstractC3577e0.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // y.AbstractC3577e0
    public Matrix g() {
        return this.f33779d;
    }

    public int hashCode() {
        int iHashCode = (this.f33776a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f33777b;
        return ((((((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f33778c) * 1000003) ^ this.f33779d.hashCode()) * 1000003) ^ this.f33780e;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f33776a + ", timestamp=" + this.f33777b + ", rotationDegrees=" + this.f33778c + ", sensorToBufferTransformMatrix=" + this.f33779d + ", flashState=" + this.f33780e + "}";
    }
}
