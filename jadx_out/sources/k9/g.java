package k9;

import e9.B;
import e9.D;
import e9.InterfaceC2437e;
import e9.v;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j9.e f29342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f29343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j9.c f29345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B f29346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f29348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f29349i;

    public g(j9.e call, List interceptors, int i10, j9.c cVar, B request, int i11, int i12, int i13) {
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(interceptors, "interceptors");
        AbstractC2855l.g(request, "request");
        this.f29342b = call;
        this.f29343c = interceptors;
        this.f29344d = i10;
        this.f29345e = cVar;
        this.f29346f = request;
        this.f29347g = i11;
        this.f29348h = i12;
        this.f29349i = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, j9.c cVar, B b10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f29344d;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f29345e;
        }
        if ((i14 & 4) != 0) {
            b10 = gVar.f29346f;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.f29347g;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.f29348h;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.f29349i;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.b(i10, cVar, b10, i11, i15, i16);
    }

    @Override // e9.v.a
    public D a(B request) {
        AbstractC2855l.g(request, "request");
        if (!(this.f29344d < this.f29343c.size())) {
            throw new IllegalStateException("Check failed.");
        }
        this.f29341a++;
        j9.c cVar = this.f29345e;
        if (cVar != null) {
            if (!cVar.j().g(request.p())) {
                throw new IllegalStateException(("network interceptor " + ((v) this.f29343c.get(this.f29344d - 1)) + " must retain the same host and port").toString());
            }
            if (!(this.f29341a == 1)) {
                throw new IllegalStateException(("network interceptor " + ((v) this.f29343c.get(this.f29344d - 1)) + " must call proceed() exactly once").toString());
            }
        }
        g gVarC = c(this, this.f29344d + 1, null, request, 0, 0, 0, 58, null);
        v vVar = (v) this.f29343c.get(this.f29344d);
        D dIntercept = vVar.intercept(gVarC);
        if (dIntercept == null) {
            throw new NullPointerException("interceptor " + vVar + " returned null");
        }
        if (this.f29345e != null) {
            if (!(this.f29344d + 1 >= this.f29343c.size() || gVarC.f29341a == 1)) {
                throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
            }
        }
        if (dIntercept.r() != null) {
            return dIntercept;
        }
        throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
    }

    public final g b(int i10, j9.c cVar, B request, int i11, int i12, int i13) {
        AbstractC2855l.g(request, "request");
        return new g(this.f29342b, this.f29343c, i10, cVar, request, i11, i12, i13);
    }

    @Override // e9.v.a
    public InterfaceC2437e call() {
        return this.f29342b;
    }

    @Override // e9.v.a
    public B d() {
        return this.f29346f;
    }

    public final j9.e e() {
        return this.f29342b;
    }

    public final int f() {
        return this.f29347g;
    }

    public final j9.c g() {
        return this.f29345e;
    }

    public final int h() {
        return this.f29348h;
    }

    public final B i() {
        return this.f29346f;
    }

    public final int j() {
        return this.f29349i;
    }

    public int k() {
        return this.f29348h;
    }
}
