package r;

import F.AbstractC0504q0;
import F.E1;
import F.InterfaceC0490j0;
import F.k1;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC0504q0 f31182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private F.k1 f31183b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f31185d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f31187f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v.x f31186e = new v.x();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k1.c f31188g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f31184c = new b();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f31189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f31190b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f31189a = surface;
            this.f31190b = surfaceTexture;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f31189a.release();
            this.f31190b.release();
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements F.D1 {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private final InterfaceC0490j0 f31192P;

        b() {
            F.S0 s0I0 = F.S0.i0();
            s0I0.X(F.D1.f1310y, new R0());
            s0I0.X(F.D0.f1294j, 34);
            f0(s0I0);
            this.f31192P = s0I0;
        }

        private void f0(F.S0 s02) {
            s02.X(K.q.f7019N, X1.class);
            s02.X(K.q.f7018M, X1.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // F.D1
        public E1.b G() {
            return E1.b.METERING_REPEATING;
        }

        @Override // F.h1
        public InterfaceC0490j0 o() {
            return this.f31192P;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface c {
        void a();
    }

    X1(s.E e10, C3213r1 c3213r1, c cVar) {
        this.f31187f = cVar;
        Size sizeG = g(e10, c3213r1);
        this.f31185d = sizeG;
        AbstractC3583h0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeG);
        this.f31183b = d();
    }

    public static /* synthetic */ void a(X1 x12, F.k1 k1Var, k1.g gVar) {
        x12.f31183b = x12.d();
        c cVar = x12.f31187f;
        if (cVar != null) {
            cVar.a();
        }
    }

    private Size g(s.E e10, C3213r1 c3213r1) {
        Size[] sizeArrG = e10.e().g(34);
        if (sizeArrG == null) {
            AbstractC3583h0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrA = this.f31186e.a(sizeArrG);
        List listAsList = Arrays.asList(sizeArrA);
        Collections.sort(listAsList, new Comparator() { // from class: r.W1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            }
        });
        Size sizeF = c3213r1.f();
        long jMin = Math.min(((long) sizeF.getWidth()) * ((long) sizeF.getHeight()), 307200L);
        int length = sizeArrA.length;
        Size size = null;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = sizeArrA[i10];
            long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
            if (width == jMin) {
                return size2;
            }
            if (width <= jMin) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) listAsList.get(0);
    }

    void c() {
        AbstractC3583h0.a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC0504q0 abstractC0504q0 = this.f31182a;
        if (abstractC0504q0 != null) {
            abstractC0504q0.d();
        }
        this.f31182a = null;
    }

    F.k1 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f31185d.getWidth(), this.f31185d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        k1.b bVarR = k1.b.r(this.f31184c, this.f31185d);
        bVarR.B(1);
        F.G0 g02 = new F.G0(surface);
        this.f31182a = g02;
        J.n.j(g02.k(), new a(surface, surfaceTexture), I.c.b());
        bVarR.l(this.f31182a);
        k1.c cVar = this.f31188g;
        if (cVar != null) {
            cVar.b();
        }
        k1.c cVar2 = new k1.c(new k1.d() { // from class: r.V1
            @Override // F.k1.d
            public final void a(F.k1 k1Var, k1.g gVar) {
                X1.a(this.f31179a, k1Var, gVar);
            }
        });
        this.f31188g = cVar2;
        bVarR.u(cVar2);
        return bVarR.p();
    }

    Size e() {
        return this.f31185d;
    }

    String f() {
        return "MeteringRepeating";
    }

    F.k1 h() {
        return this.f31183b;
    }

    F.D1 i() {
        return this.f31184c;
    }
}
