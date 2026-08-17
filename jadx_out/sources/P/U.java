package P;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import y.AbstractC3583h0;
import y.I0;
import y.w0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final P f8692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final F.M f8693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f8694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f8695d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f8696a;

        a(L l10) {
            this.f8696a = l10;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(w0 w0Var) {
            H0.g.g(w0Var);
            U.this.f8692a.c(w0Var);
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (this.f8696a.t() == 2 && (th instanceof CancellationException)) {
                AbstractC3583h0.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            AbstractC3583h0.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + V.a(this.f8696a.t()), th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {
        public static b c(L l10, List list) {
            return new C1348c(l10, list);
        }

        public abstract List a();

        public abstract L b();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends HashMap {
    }

    public U(F.M m10, P p10) {
        this.f8693b = m10;
        this.f8692a = p10;
    }

    public static /* synthetic */ void b(Map map, I0.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iB = hVar.b() - ((R.f) entry.getKey()).c();
            if (((R.f) entry.getKey()).g()) {
                iB = -iB;
            }
            ((L) entry.getValue()).z(H.z.v(iB), -1);
        }
    }

    public static /* synthetic */ void c(U u10) {
        c cVar = u10.f8694c;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((L) it.next()).i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(L l10, Map.Entry entry) {
        L l11 = (L) entry.getValue();
        AbstractC3583h0.a("SurfaceProcessorNode", "     -> outputEdge = " + l11);
        J.n.j(l11.j(((R.f) entry.getKey()).b(), w0.a.f(l10.s().f(), ((R.f) entry.getKey()).a(), l10.u() ? this.f8693b : null, ((R.f) entry.getKey()).c(), ((R.f) entry.getKey()).g()), null), new a(l11), I.c.e());
    }

    private void g(final L l10, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            d(l10, entry);
            ((L) entry.getValue()).e(new Runnable() { // from class: P.Q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8687g.d(l10, entry);
                }
            });
        }
    }

    private void h(L l10) {
        this.f8692a.b(l10.k(this.f8693b));
    }

    private L k(L l10, R.f fVar) {
        Rect rectQ;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(l10.r());
        Matrix matrixE = H.z.e(new RectF(rectA), H.z.s(fVar.d()), iC, zG);
        matrix.postConcat(matrixE);
        H0.g.a(H.z.j(H.z.f(rectA, iC), fVar.d()));
        if (fVar.k()) {
            H0.g.b(fVar.a().contains(l10.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), l10.n()));
            rectQ = new Rect();
            RectF rectF = new RectF(l10.n());
            matrixE.mapRect(rectF);
            rectF.round(rectQ);
        } else {
            rectQ = H.z.q(fVar.d());
        }
        Rect rect = rectQ;
        return new L(fVar.e(), fVar.b(), l10.s().i().f(fVar.d()).a(), matrix, false, rect, l10.q() - iC, -1, l10.w() != zG);
    }

    public P e() {
        return this.f8692a;
    }

    public void f() {
        this.f8692a.a();
        H.y.e(new Runnable() { // from class: P.T
            @Override // java.lang.Runnable
            public final void run() {
                U.c(this.f8691g);
            }
        });
    }

    void i(L l10, final Map map) {
        l10.f(new H0.a() { // from class: P.S
            @Override // H0.a
            public final void accept(Object obj) {
                U.b(map, (I0.h) obj);
            }
        });
    }

    public c j(b bVar) {
        H.y.b();
        AbstractC3583h0.a("SurfaceProcessorNode", "SurfaceProcessorNode Transform (Processor=" + this.f8692a + "\n   inputEdge = " + bVar.b());
        Iterator it = bVar.a().iterator();
        while (it.hasNext()) {
            AbstractC3583h0.a("SurfaceProcessorNode", "   outputConfig = " + ((R.f) it.next()));
        }
        this.f8695d = bVar;
        this.f8694c = new c();
        L lB = bVar.b();
        for (R.f fVar : bVar.a()) {
            this.f8694c.put(fVar, k(lB, fVar));
        }
        h(lB);
        g(lB, this.f8694c);
        i(lB, this.f8694c);
        return this.f8694c;
    }
}
