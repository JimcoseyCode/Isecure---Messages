package P;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: P.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1347b extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H.g f8702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f8704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f8705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f8707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F.B f8708h;

    C1347b(Object obj, H.g gVar, int i10, Size size, Rect rect, int i11, Matrix matrix, F.B b10) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f8701a = obj;
        this.f8702b = gVar;
        this.f8703c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f8704d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f8705e = rect;
        this.f8706f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f8707g = matrix;
        if (b10 == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f8708h = b10;
    }

    @Override // P.z
    public F.B a() {
        return this.f8708h;
    }

    @Override // P.z
    public Rect b() {
        return this.f8705e;
    }

    @Override // P.z
    public Object c() {
        return this.f8701a;
    }

    @Override // P.z
    public H.g d() {
        return this.f8702b;
    }

    @Override // P.z
    public int e() {
        return this.f8703c;
    }

    public boolean equals(Object obj) {
        H.g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f8701a.equals(zVar.c()) && ((gVar = this.f8702b) != null ? gVar.equals(zVar.d()) : zVar.d() == null) && this.f8703c == zVar.e() && this.f8704d.equals(zVar.h()) && this.f8705e.equals(zVar.b()) && this.f8706f == zVar.f() && this.f8707g.equals(zVar.g()) && this.f8708h.equals(zVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // P.z
    public int f() {
        return this.f8706f;
    }

    @Override // P.z
    public Matrix g() {
        return this.f8707g;
    }

    @Override // P.z
    public Size h() {
        return this.f8704d;
    }

    public int hashCode() {
        int iHashCode = (this.f8701a.hashCode() ^ 1000003) * 1000003;
        H.g gVar = this.f8702b;
        return ((((((((((((iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f8703c) * 1000003) ^ this.f8704d.hashCode()) * 1000003) ^ this.f8705e.hashCode()) * 1000003) ^ this.f8706f) * 1000003) ^ this.f8707g.hashCode()) * 1000003) ^ this.f8708h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f8701a + ", exif=" + this.f8702b + ", format=" + this.f8703c + ", size=" + this.f8704d + ", cropRect=" + this.f8705e + ", rotationDegrees=" + this.f8706f + ", sensorToBufferTransform=" + this.f8707g + ", cameraCaptureResult=" + this.f8708h + "}";
    }
}
