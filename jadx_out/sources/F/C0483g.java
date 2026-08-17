package F;

import android.util.Range;
import android.util.Size;
import java.util.List;
import y.C3563H;

/* JADX INFO: renamed from: F.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0483g extends AbstractC0481f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1 f1460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f1462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3563H f1463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f1464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0490j0 f1465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Range f1467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f1468i;

    C0483g(r1 r1Var, int i10, Size size, C3563H c3563h, List list, InterfaceC0490j0 interfaceC0490j0, int i11, Range range, boolean z10) {
        if (r1Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f1460a = r1Var;
        this.f1461b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f1462c = size;
        if (c3563h == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f1463d = c3563h;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f1464e = list;
        this.f1465f = interfaceC0490j0;
        this.f1466g = i11;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f1467h = range;
        this.f1468i = z10;
    }

    @Override // F.AbstractC0481f
    public List b() {
        return this.f1464e;
    }

    @Override // F.AbstractC0481f
    public C3563H c() {
        return this.f1463d;
    }

    @Override // F.AbstractC0481f
    public int d() {
        return this.f1461b;
    }

    @Override // F.AbstractC0481f
    public InterfaceC0490j0 e() {
        return this.f1465f;
    }

    public boolean equals(Object obj) {
        InterfaceC0490j0 interfaceC0490j0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0481f) {
            AbstractC0481f abstractC0481f = (AbstractC0481f) obj;
            if (this.f1460a.equals(abstractC0481f.h()) && this.f1461b == abstractC0481f.d() && this.f1462c.equals(abstractC0481f.g()) && this.f1463d.equals(abstractC0481f.c()) && this.f1464e.equals(abstractC0481f.b()) && ((interfaceC0490j0 = this.f1465f) != null ? interfaceC0490j0.equals(abstractC0481f.e()) : abstractC0481f.e() == null) && this.f1466g == abstractC0481f.f() && this.f1467h.equals(abstractC0481f.i()) && this.f1468i == abstractC0481f.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.AbstractC0481f
    public int f() {
        return this.f1466g;
    }

    @Override // F.AbstractC0481f
    public Size g() {
        return this.f1462c;
    }

    @Override // F.AbstractC0481f
    public r1 h() {
        return this.f1460a;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f1460a.hashCode() ^ 1000003) * 1000003) ^ this.f1461b) * 1000003) ^ this.f1462c.hashCode()) * 1000003) ^ this.f1463d.hashCode()) * 1000003) ^ this.f1464e.hashCode()) * 1000003;
        InterfaceC0490j0 interfaceC0490j0 = this.f1465f;
        return ((((((iHashCode ^ (interfaceC0490j0 == null ? 0 : interfaceC0490j0.hashCode())) * 1000003) ^ this.f1466g) * 1000003) ^ this.f1467h.hashCode()) * 1000003) ^ (this.f1468i ? 1231 : 1237);
    }

    @Override // F.AbstractC0481f
    public Range i() {
        return this.f1467h;
    }

    @Override // F.AbstractC0481f
    public boolean j() {
        return this.f1468i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f1460a + ", imageFormat=" + this.f1461b + ", size=" + this.f1462c + ", dynamicRange=" + this.f1463d + ", captureTypes=" + this.f1464e + ", implementationOptions=" + this.f1465f + ", sessionType=" + this.f1466g + ", targetFrameRate=" + this.f1467h + ", strictFrameRateRequired=" + this.f1468i + "}";
    }
}
