package F2;

import android.graphics.Bitmap;
import android.util.SparseArray;
import d2.AbstractC2325a;
import g2.AbstractC2662a;
import i7.C2735B;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V2.d f1803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D2.c f1804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f1805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f1806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f1807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray f1808f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C2.a f1809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final D2.b f1810h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f1811i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f1812j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ c f1813k;

        public a(c cVar, C2.a animationBackend, D2.b bitmapFrameCache, int i10, int i11) {
            AbstractC2855l.g(animationBackend, "animationBackend");
            AbstractC2855l.g(bitmapFrameCache, "bitmapFrameCache");
            this.f1813k = cVar;
            this.f1809g = animationBackend;
            this.f1810h = bitmapFrameCache;
            this.f1811i = i10;
            this.f1812j = i11;
        }

        private final boolean a(int i10, int i11) {
            AbstractC2662a abstractC2662aA;
            int i12 = 2;
            try {
                if (i11 == 1) {
                    abstractC2662aA = this.f1810h.a(i10, this.f1809g.e(), this.f1809g.c());
                } else {
                    if (i11 != 2) {
                        return false;
                    }
                    abstractC2662aA = this.f1813k.f1803a.b(this.f1809g.e(), this.f1809g.c(), this.f1813k.f1805c);
                    i12 = -1;
                }
                AbstractC2662a abstractC2662a = abstractC2662aA;
                boolean zB = b(i10, abstractC2662a, i11);
                AbstractC2662a.B(abstractC2662a);
                return (zB || i12 == -1) ? zB : a(i10, i12);
            } catch (RuntimeException e10) {
                AbstractC2325a.F(this.f1813k.f1807e, "Failed to create frame bitmap", e10);
                return false;
            } finally {
                AbstractC2662a.B(null);
            }
        }

        private final boolean b(int i10, AbstractC2662a abstractC2662a, int i11) {
            if (AbstractC2662a.d0(abstractC2662a) && abstractC2662a != null) {
                D2.c cVar = this.f1813k.f1804b;
                Object objJ = abstractC2662a.J();
                AbstractC2855l.f(objJ, "get(...)");
                if (cVar.a(i10, (Bitmap) objJ)) {
                    AbstractC2325a.y(this.f1813k.f1807e, "Frame %d ready.", Integer.valueOf(i10));
                    synchronized (this.f1813k.f1808f) {
                        this.f1810h.b(i10, abstractC2662a, i11);
                        C2735B c2735b = C2735B.f28704a;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f1810h.contains(this.f1811i)) {
                    AbstractC2325a.y(this.f1813k.f1807e, "Frame %d is cached already.", Integer.valueOf(this.f1811i));
                    SparseArray sparseArray = this.f1813k.f1808f;
                    c cVar = this.f1813k;
                    synchronized (sparseArray) {
                        cVar.f1808f.remove(this.f1812j);
                        C2735B c2735b = C2735B.f28704a;
                    }
                    return;
                }
                if (a(this.f1811i, 1)) {
                    AbstractC2325a.y(this.f1813k.f1807e, "Prepared frame %d.", Integer.valueOf(this.f1811i));
                } else {
                    AbstractC2325a.k(this.f1813k.f1807e, "Could not prepare frame %d.", Integer.valueOf(this.f1811i));
                }
                SparseArray sparseArray2 = this.f1813k.f1808f;
                c cVar2 = this.f1813k;
                synchronized (sparseArray2) {
                    cVar2.f1808f.remove(this.f1812j);
                    C2735B c2735b2 = C2735B.f28704a;
                }
            } catch (Throwable th) {
                SparseArray sparseArray3 = this.f1813k.f1808f;
                c cVar3 = this.f1813k;
                synchronized (sparseArray3) {
                    cVar3.f1808f.remove(this.f1812j);
                    C2735B c2735b3 = C2735B.f28704a;
                    throw th;
                }
            }
        }
    }

    public c(V2.d platformBitmapFactory, D2.c bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        AbstractC2855l.g(platformBitmapFactory, "platformBitmapFactory");
        AbstractC2855l.g(bitmapFrameRenderer, "bitmapFrameRenderer");
        AbstractC2855l.g(bitmapConfig, "bitmapConfig");
        AbstractC2855l.g(executorService, "executorService");
        this.f1803a = platformBitmapFactory;
        this.f1804b = bitmapFrameRenderer;
        this.f1805c = bitmapConfig;
        this.f1806d = executorService;
        this.f1807e = c.class;
        this.f1808f = new SparseArray();
    }

    private final int g(C2.a aVar, int i10) {
        return (aVar.hashCode() * 31) + i10;
    }

    @Override // F2.b
    public boolean a(D2.b bitmapFrameCache, C2.a animationBackend, int i10) throws Throwable {
        Throwable th;
        AbstractC2855l.g(bitmapFrameCache, "bitmapFrameCache");
        AbstractC2855l.g(animationBackend, "animationBackend");
        int iG = g(animationBackend, i10);
        synchronized (this.f1808f) {
            try {
                try {
                    if (this.f1808f.get(iG) != null) {
                        AbstractC2325a.y(this.f1807e, "Already scheduled decode job for frame %d", Integer.valueOf(i10));
                        return true;
                    }
                    if (bitmapFrameCache.contains(i10)) {
                        AbstractC2325a.y(this.f1807e, "Frame %d is cached already.", Integer.valueOf(i10));
                        return true;
                    }
                    try {
                        a aVar = new a(this, animationBackend, bitmapFrameCache, i10, iG);
                        this.f1808f.put(iG, aVar);
                        this.f1806d.execute(aVar);
                        C2735B c2735b = C2735B.f28704a;
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            th = th;
            throw th;
        }
    }
}
