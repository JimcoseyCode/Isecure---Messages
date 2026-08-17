package R;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f9904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f9907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f9908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f9909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9911h;

    b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f9904a = uuid;
        this.f9905b = i10;
        this.f9906c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f9907d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f9908e = size;
        this.f9909f = i12;
        this.f9910g = z10;
        this.f9911h = z11;
    }

    @Override // R.f
    public Rect a() {
        return this.f9907d;
    }

    @Override // R.f
    public int b() {
        return this.f9906c;
    }

    @Override // R.f
    public int c() {
        return this.f9909f;
    }

    @Override // R.f
    public Size d() {
        return this.f9908e;
    }

    @Override // R.f
    public int e() {
        return this.f9905b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f9904a.equals(fVar.f()) && this.f9905b == fVar.e() && this.f9906c == fVar.b() && this.f9907d.equals(fVar.a()) && this.f9908e.equals(fVar.d()) && this.f9909f == fVar.c() && this.f9910g == fVar.g() && this.f9911h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // R.f
    UUID f() {
        return this.f9904a;
    }

    @Override // R.f
    public boolean g() {
        return this.f9910g;
    }

    public int hashCode() {
        return ((((((((((((((this.f9904a.hashCode() ^ 1000003) * 1000003) ^ this.f9905b) * 1000003) ^ this.f9906c) * 1000003) ^ this.f9907d.hashCode()) * 1000003) ^ this.f9908e.hashCode()) * 1000003) ^ this.f9909f) * 1000003) ^ (this.f9910g ? 1231 : 1237)) * 1000003) ^ (this.f9911h ? 1231 : 1237);
    }

    @Override // R.f
    public boolean k() {
        return this.f9911h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f9904a + ", getTargets=" + this.f9905b + ", getFormat=" + this.f9906c + ", getCropRect=" + this.f9907d + ", getSize=" + this.f9908e + ", getRotationDegrees=" + this.f9909f + ", isMirroring=" + this.f9910g + ", shouldRespectInputCropRect=" + this.f9911h + "}";
    }
}
