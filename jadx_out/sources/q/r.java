package Q;

import F.M;
import H.y;
import H.z;
import P.L;
import P.P;
import P.V;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import y.AbstractC3583h0;
import y.w0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final P f8975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final M f8976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final M f8977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f8978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f8979e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f8980a;

        a(L l10) {
            this.f8980a = l10;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(w0 w0Var) {
            H0.g.g(w0Var);
            r.this.f8975a.c(w0Var);
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (this.f8980a.t() == 2 && (th instanceof CancellationException)) {
                AbstractC3583h0.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            AbstractC3583h0.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + V.a(this.f8980a.t()), th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {
        public static b d(L l10, L l11, List list) {
            return new Q.b(l10, l11, list);
        }

        public abstract List a();

        public abstract L b();

        public abstract L c();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends HashMap {
    }

    public r(M m10, M m11, P p10) {
        this.f8976b = m10;
        this.f8977c = m11;
        this.f8975a = p10;
    }

    public static /* synthetic */ void a(r rVar) {
        c cVar = rVar.f8978d;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((L) it.next()).i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(M m10, M m11, L l10, L l11, Map.Entry entry) {
        L l12 = (L) entry.getValue();
        AbstractC3583h0.a("DualSurfaceProcessorNode", "     -> outputEdge = " + l12);
        Size sizeF = l10.s().f();
        Rect rectA = ((d) entry.getKey()).a().a();
        if (!l10.u()) {
            m10 = null;
        }
        w0.a aVarF = w0.a.f(sizeF, rectA, m10, ((d) entry.getKey()).a().c(), ((d) entry.getKey()).a().g());
        Size sizeF2 = l11.s().f();
        Rect rectA2 = ((d) entry.getKey()).b().a();
        if (!l11.u()) {
            m11 = null;
        }
        J.n.j(l12.j(((d) entry.getKey()).a().b(), aVarF, w0.a.f(sizeF2, rectA2, m11, ((d) entry.getKey()).b().c(), ((d) entry.getKey()).b().g())), new a(l12), I.c.e());
    }

    private void e(M m10, M m11, L l10, L l11, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            final M m12 = m10;
            final M m13 = m11;
            final L l12 = l10;
            final L l13 = l11;
            c(m12, m13, l12, l13, entry);
            ((L) entry.getValue()).e(new Runnable() { // from class: Q.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8969g.c(m12, m13, l12, l13, entry);
                }
            });
            m10 = m12;
            m11 = m13;
            l10 = l12;
            l11 = l13;
        }
    }

    private void f(M m10, L l10, boolean z10) {
        this.f8975a.b(l10.l(m10, z10));
    }

    private L h(L l10, R.f fVar) {
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(l10.r());
        matrix.postConcat(z.e(new RectF(rectA), z.s(fVar.d()), iC, zG));
        H0.g.a(z.j(z.f(rectA, iC), fVar.d()));
        Rect rectQ = z.q(fVar.d());
        return new L(fVar.e(), fVar.b(), l10.s().i().f(fVar.d()).a(), matrix, false, rectQ, l10.q() - iC, -1, l10.w() != zG);
    }

    public void d() {
        this.f8975a.a();
        y.e(new Runnable() { // from class: Q.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f8968g);
            }
        });
    }

    public c g(b bVar) {
        y.b();
        AbstractC3583h0.a("DualSurfaceProcessorNode", "DualSurfaceProcessorNode Transform Processor = " + this.f8975a + "\n   primary input = " + bVar.b() + "\n   secondary input = " + bVar.c());
        Iterator it = bVar.a().iterator();
        while (it.hasNext()) {
            AbstractC3583h0.a("SurfaceProcessorNode", "   outputConfig = " + ((d) it.next()));
        }
        this.f8979e = bVar;
        this.f8978d = new c();
        L lB = this.f8979e.b();
        L lC = this.f8979e.c();
        for (d dVar : this.f8979e.a()) {
            this.f8978d.put(dVar, h(lB, dVar.a()));
        }
        f(this.f8976b, lB, true);
        f(this.f8977c, lC, false);
        e(this.f8976b, this.f8977c, lB, lC, this.f8978d);
        return this.f8978d;
    }
}
