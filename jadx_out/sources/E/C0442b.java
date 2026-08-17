package E;

import E.C0460u;
import P.C1365u;
import android.util.Size;
import java.util.List;
import y.InterfaceC3575d0;

/* JADX INFO: renamed from: E.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0442b extends C0460u.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Size f929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final G f933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1365u f934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1365u f935l;

    C0442b(Size size, int i10, List list, boolean z10, InterfaceC3575d0 interfaceC3575d0, G g10, C1365u c1365u, C1365u c1365u2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f929f = size;
        this.f930g = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f931h = list;
        this.f932i = z10;
        this.f933j = g10;
        if (c1365u == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f934k = c1365u;
        if (c1365u2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f935l = c1365u2;
    }

    @Override // E.C0460u.c
    C1365u b() {
        return this.f935l;
    }

    @Override // E.C0460u.c
    InterfaceC3575d0 c() {
        return null;
    }

    @Override // E.C0460u.c
    int d() {
        return this.f930g;
    }

    @Override // E.C0460u.c
    List e() {
        return this.f931h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0460u.c) {
            C0460u.c cVar = (C0460u.c) obj;
            if (this.f929f.equals(cVar.k()) && this.f930g == cVar.d() && this.f931h.equals(cVar.e()) && this.f932i == cVar.m()) {
                cVar.c();
                cVar.f();
                if (this.f934k.equals(cVar.h()) && this.f935l.equals(cVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // E.C0460u.c
    G f() {
        return this.f933j;
    }

    @Override // E.C0460u.c
    C1365u h() {
        return this.f934k;
    }

    public int hashCode() {
        return ((((((((((((this.f929f.hashCode() ^ 1000003) * 1000003) ^ this.f930g) * 1000003) ^ this.f931h.hashCode()) * 1000003) ^ (this.f932i ? 1231 : 1237)) * (-721379959)) ^ 0) * 1000003) ^ this.f934k.hashCode()) * 1000003) ^ this.f935l.hashCode();
    }

    @Override // E.C0460u.c
    Size k() {
        return this.f929f;
    }

    @Override // E.C0460u.c
    boolean m() {
        return this.f932i;
    }

    public String toString() {
        return "In{size=" + this.f929f + ", inputFormat=" + this.f930g + ", outputFormats=" + this.f931h + ", virtualCamera=" + this.f932i + ", imageReaderProxyProvider=" + ((Object) null) + ", postviewSettings=" + this.f933j + ", requestEdge=" + this.f934k + ", errorEdge=" + this.f935l + "}";
    }
}
