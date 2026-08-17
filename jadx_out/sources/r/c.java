package R;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EGLSurface f9912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9914c;

    c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f9912a = eGLSurface;
        this.f9913b = i10;
        this.f9914c = i11;
    }

    @Override // R.g
    public EGLSurface a() {
        return this.f9912a;
    }

    @Override // R.g
    public int b() {
        return this.f9914c;
    }

    @Override // R.g
    public int c() {
        return this.f9913b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f9912a.equals(gVar.a()) && this.f9913b == gVar.c() && this.f9914c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9912a.hashCode() ^ 1000003) * 1000003) ^ this.f9913b) * 1000003) ^ this.f9914c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f9912a + ", width=" + this.f9913b + ", height=" + this.f9914c + "}";
    }
}
