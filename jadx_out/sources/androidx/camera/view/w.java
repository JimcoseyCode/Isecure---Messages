package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.n;
import androidx.camera.view.w;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;
import y.I0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class w extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SurfaceView f15424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f15425f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Size f15426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private I0 f15427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private I0 f15428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n.a f15429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Size f15430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15431f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f15432g = false;

        b() {
        }

        public static /* synthetic */ void a(n.a aVar, I0.g gVar) {
            AbstractC3583h0.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        private boolean b() {
            return (this.f15431f || this.f15427b == null || !Objects.equals(this.f15426a, this.f15430e)) ? false : true;
        }

        private void c() {
            n.a aVar;
            if (this.f15427b != null) {
                AbstractC3583h0.a("SurfaceViewImpl", "Request canceled: " + this.f15427b);
                if (!this.f15427b.z() || (aVar = this.f15429d) == null) {
                    return;
                }
                aVar.a();
            }
        }

        private void d() {
            if (this.f15427b != null) {
                AbstractC3583h0.a("SurfaceViewImpl", "Surface closed " + this.f15427b);
                this.f15427b.n().d();
            }
        }

        private boolean f() {
            Surface surface = w.this.f15424e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            AbstractC3583h0.a("SurfaceViewImpl", "Surface set on Preview.");
            final n.a aVar = this.f15429d;
            I0 i02 = this.f15427b;
            Objects.requireNonNull(i02);
            i02.w(surface, androidx.core.content.a.h(w.this.f15424e.getContext()), new H0.a() { // from class: androidx.camera.view.x
                @Override // H0.a
                public final void accept(Object obj) {
                    w.b.a(aVar, (I0.g) obj);
                }
            });
            this.f15431f = true;
            w.this.f();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(I0 i02, n.a aVar) {
            c();
            if (this.f15432g) {
                this.f15432g = false;
                i02.t();
                return;
            }
            this.f15427b = i02;
            this.f15429d = aVar;
            Size sizeQ = i02.q();
            this.f15426a = sizeQ;
            this.f15431f = false;
            if (f()) {
                return;
            }
            AbstractC3583h0.a("SurfaceViewImpl", "Wait for new Surface creation.");
            w.this.f15424e.getHolder().setFixedSize(sizeQ.getWidth(), sizeQ.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            AbstractC3583h0.a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f15430e = new Size(i11, i12);
            f();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            I0 i02;
            AbstractC3583h0.a("SurfaceViewImpl", "Surface created.");
            if (!this.f15432g || (i02 = this.f15428c) == null) {
                return;
            }
            i02.t();
            this.f15428c = null;
            this.f15432g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            AbstractC3583h0.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f15431f) {
                d();
            } else {
                c();
            }
            this.f15432g = true;
            I0 i02 = this.f15427b;
            if (i02 != null) {
                this.f15428c = i02;
            }
            this.f15431f = false;
            this.f15427b = null;
            this.f15429d = null;
            this.f15430e = null;
            this.f15426a = null;
        }
    }

    w(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f15425f = new b();
    }

    public static /* synthetic */ void k(Semaphore semaphore, int i10) {
        if (i10 == 0) {
            AbstractC3583h0.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            AbstractC3583h0.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
        }
        semaphore.release();
    }

    private static boolean m(SurfaceView surfaceView, Size size, I0 i02) {
        return surfaceView != null && Objects.equals(size, i02.q());
    }

    @Override // androidx.camera.view.n
    View b() {
        return this.f15424e;
    }

    @Override // androidx.camera.view.n
    Bitmap c() {
        SurfaceView surfaceView = this.f15424e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f15424e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f15424e.getWidth(), this.f15424e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f15424e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.v
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                w.k(semaphore, i10);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                AbstractC3583h0.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e10) {
            AbstractC3583h0.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.n
    void g(final I0 i02, final n.a aVar) {
        if (!m(this.f15424e, this.f15399a, i02)) {
            this.f15399a = i02.q();
            l();
        }
        if (aVar != null) {
            i02.k(androidx.core.content.a.h(this.f15424e.getContext()), new Runnable() { // from class: androidx.camera.view.t
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a();
                }
            });
        }
        this.f15424e.post(new Runnable() { // from class: androidx.camera.view.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f15420g.f15425f.e(i02, aVar);
            }
        });
    }

    @Override // androidx.camera.view.n
    InterfaceFutureC2904a i() {
        return J.n.p(null);
    }

    void l() {
        H0.g.g(this.f15400b);
        H0.g.g(this.f15399a);
        SurfaceView surfaceView = new SurfaceView(this.f15400b.getContext());
        this.f15424e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f15399a.getWidth(), this.f15399a.getHeight()));
        this.f15400b.removeAllViews();
        this.f15400b.addView(this.f15424e);
        this.f15424e.getHolder().addCallback(this.f15425f);
    }

    @Override // androidx.camera.view.n
    void d() {
    }

    @Override // androidx.camera.view.n
    void e() {
    }
}
