package E;

import E.C0448h;
import E.C0463x;
import E.Q;
import F.g1;
import P.C1365u;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.List;
import java.util.concurrent.Executor;
import y.AbstractC3583h0;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final P.w f877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraCharacteristics f878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private P.y f880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private P.y f881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private P.y f882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private P.y f883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P.y f884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private P.y f885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private P.y f886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private P.y f887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private P.y f888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g1 f889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f890o;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class a {
        a() {
        }

        static a e(int i10, List list) {
            return new C0444d(new C1365u(), new C1365u(), i10, list);
        }

        abstract C1365u a();

        abstract int b();

        abstract List c();

        abstract C1365u d();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class b {
        b() {
        }

        static b c(S s10, androidx.camera.core.o oVar) {
            return new C0445e(s10, oVar);
        }

        abstract androidx.camera.core.o a();

        abstract S b();
    }

    Q(Executor executor, CameraCharacteristics cameraCharacteristics, P.w wVar) {
        this(executor, cameraCharacteristics, wVar, androidx.camera.core.internal.compat.quirk.a.c());
    }

    public static /* synthetic */ void b(final Q q10, final b bVar) {
        q10.getClass();
        if (bVar.b().l()) {
            bVar.a().close();
        } else {
            q10.f876a.execute(new Runnable() { // from class: E.J
                @Override // java.lang.Runnable
                public final void run() {
                    this.f864g.k(bVar);
                }
            });
        }
    }

    public static /* synthetic */ void d(final Q q10, final b bVar) {
        q10.getClass();
        if (!bVar.b().l()) {
            q10.f876a.execute(new Runnable() { // from class: E.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f862g.m(bVar);
                }
            });
        } else {
            AbstractC3583h0.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    private P.z i(P.z zVar, int i10) {
        H0.g.i(O.b.i(zVar.e()));
        P.z zVar2 = (P.z) this.f884i.apply(zVar);
        P.y yVar = this.f888m;
        if (yVar != null) {
            zVar2 = (P.z) yVar.apply(zVar2);
        }
        return (P.z) this.f882g.apply(C0448h.b.c(zVar2, i10));
    }

    private void o(final S s10, final y.X x10) {
        I.c.e().execute(new Runnable() { // from class: E.N
            @Override // java.lang.Runnable
            public final void run() {
                s10.u(x10);
            }
        });
    }

    androidx.camera.core.o j(b bVar) {
        S sB = bVar.b();
        P.z zVar = (P.z) this.f880e.apply(bVar);
        List listC = this.f879d.c();
        H0.g.a(!listC.isEmpty());
        int iIntValue = ((Integer) listC.get(0)).intValue();
        if ((zVar.e() == 35 || this.f888m != null || this.f890o) && iIntValue == 256) {
            P.z zVarI = (P.z) this.f881f.apply(C0463x.a.c(zVar, sB.c()));
            if (this.f888m != null) {
                zVarI = i(zVarI, sB.c());
            }
            zVar = (P.z) this.f886k.apply(zVarI);
        }
        androidx.camera.core.o oVar = (androidx.camera.core.o) this.f885j.apply(zVar);
        if (listC.size() > 1) {
            sB.k().u(oVar.getFormat(), true);
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(b bVar) {
        final S sB = bVar.b();
        try {
            boolean z10 = true;
            if (this.f879d.c().size() <= 1) {
                z10 = false;
            }
            if (bVar.b().m()) {
                final androidx.camera.core.o oVarJ = j(bVar);
                I.c.e().execute(new Runnable() { // from class: E.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        sB.q(oVarJ);
                    }
                });
                return;
            }
            final V.h hVarL = l(bVar);
            if (z10 && !sB.k().s()) {
                return;
            }
            I.c.e().execute(new Runnable() { // from class: E.L
                @Override // java.lang.Runnable
                public final void run() {
                    sB.r(hVarL);
                }
            });
        } catch (OutOfMemoryError e10) {
            o(sB, new y.X(0, "Processing failed due to low memory.", e10));
        } catch (RuntimeException e11) {
            o(sB, new y.X(0, "Processing failed.", e11));
        } catch (y.X e12) {
            o(sB, e12);
        }
    }

    V.h l(b bVar) {
        List listC = this.f879d.c();
        H0.g.a(!listC.isEmpty());
        Integer num = (Integer) listC.get(0);
        int iIntValue = num.intValue();
        H0.g.b(O.b.i(iIntValue) || O.b.j(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        S sB = bVar.b();
        sB.d();
        H0.g.b(false, "OutputFileOptions cannot be empty");
        P.z zVar = (P.z) this.f880e.apply(bVar);
        if (listC.size() <= 1) {
            if (iIntValue != 32) {
                sB.d();
                throw null;
            }
            sB.d();
            throw null;
        }
        sB.d();
        H0.g.b(false, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (zVar.e() != 32) {
            sB.g();
            throw null;
        }
        sB.d();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(b bVar) {
        final S sB = bVar.b();
        try {
            P.z zVar = (P.z) this.f880e.apply(bVar);
            int iE = zVar.e();
            H0.g.b(iE == 35 || iE == 256 || iE == 4101, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(iE)));
            final Bitmap bitmap = (Bitmap) this.f887l.apply(zVar);
            I.c.e().execute(new Runnable() { // from class: E.M
                @Override // java.lang.Runnable
                public final void run() {
                    sB.t(bitmap);
                }
            });
        } catch (Exception e10) {
            bVar.a().close();
            AbstractC3583h0.d("ProcessingNode", "process postview input packet failed.", e10);
        }
    }

    public Void p(a aVar) {
        this.f879d = aVar;
        aVar.a().a(new H0.a() { // from class: E.O
            @Override // H0.a
            public final void accept(Object obj) {
                Q.b(this.f874a, (Q.b) obj);
            }
        });
        aVar.d().a(new H0.a() { // from class: E.P
            @Override // H0.a
            public final void accept(Object obj) {
                Q.d(this.f875a, (Q.b) obj);
            }
        });
        this.f880e = new H();
        this.f881f = new C0463x(this.f889n);
        this.f884i = new A();
        this.f882g = new C0448h();
        this.f883h = new B();
        this.f885j = new D();
        this.f887l = new C0462w();
        if (aVar.b() != 35 && !this.f890o) {
            return null;
        }
        this.f886k = new C();
        return null;
    }

    Q(Executor executor, CameraCharacteristics cameraCharacteristics, P.w wVar, g1 g1Var) {
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f876a = I.c.g(executor);
        } else {
            this.f876a = executor;
        }
        this.f877b = wVar;
        this.f878c = cameraCharacteristics;
        this.f889n = g1Var;
        this.f890o = g1Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public void n() {
    }
}
