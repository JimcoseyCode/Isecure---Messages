package P;

import R.d;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.concurrent.futures.c;
import i7.C2756s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;
import y.AbstractC3583h0;
import y.C3563H;
import y.I0;
import y.w0;

/* JADX INFO: renamed from: P.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1364t implements P, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f8742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HandlerThread f8743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f8744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f8745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f8746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f8747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f8748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map f8749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f8752k;

    /* JADX INFO: renamed from: P.t$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static InterfaceC2955a f8753a = new InterfaceC2955a() { // from class: P.s
            @Override // n.InterfaceC2955a
            public final Object apply(Object obj) {
                return new C1364t((C3563H) obj);
            }
        };

        public static P a(C3563H c3563h) {
            return (P) f8753a.apply(c3563h);
        }
    }

    /* JADX INFO: renamed from: P.t$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class b {
        b() {
        }

        static C1346a d(int i10, int i11, c.a aVar) {
            return new C1346a(i10, i11, aVar);
        }

        abstract c.a a();

        abstract int b();

        abstract int c();
    }

    C1364t(C3563H c3563h) {
        this(c3563h, Collections.EMPTY_MAP);
    }

    public static /* synthetic */ void f(C1364t c1364t, I0 i02, SurfaceTexture surfaceTexture, Surface surface, I0.g gVar) {
        c1364t.getClass();
        i02.l();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        c1364t.f8750i--;
        c1364t.r();
    }

    public static /* synthetic */ void g(C1364t c1364t) {
        c1364t.f8751j = true;
        c1364t.r();
    }

    public static /* synthetic */ void h(C1364t c1364t, C3563H c3563h, Map map, c.a aVar) throws Throwable {
        c1364t.getClass();
        try {
            c1364t.f8742a.h(c3563h, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object i(final C1364t c1364t, int i10, int i11, final c.a aVar) {
        c1364t.getClass();
        final C1346a c1346aD = b.d(i10, i11, aVar);
        c1364t.t(new Runnable() { // from class: P.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f8727g.f8752k.add(c1346aD);
            }
        }, new Runnable() { // from class: P.k
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void j(C1364t c1364t, I0 i02, I0.h hVar) {
        c1364t.getClass();
        d.e eVar = d.e.DEFAULT;
        if (i02.o().d() && hVar.e()) {
            eVar = d.e.YUV;
        }
        c1364t.f8742a.o(eVar);
    }

    public static /* synthetic */ void k(final C1364t c1364t, final w0 w0Var) {
        Surface surfaceO = w0Var.o(c1364t.f8744c, new H0.a() { // from class: P.r
            @Override // H0.a
            public final void accept(Object obj) {
                C1364t.l(this.f8740a, w0Var, (w0.b) obj);
            }
        });
        c1364t.f8742a.j(surfaceO);
        c1364t.f8749h.put(w0Var, surfaceO);
    }

    public static /* synthetic */ void l(C1364t c1364t, w0 w0Var, w0.b bVar) {
        c1364t.getClass();
        w0Var.close();
        Surface surface = (Surface) c1364t.f8749h.remove(w0Var);
        if (surface != null) {
            c1364t.f8742a.r(surface);
        }
    }

    public static /* synthetic */ Object m(final C1364t c1364t, final C3563H c3563h, final Map map, final c.a aVar) {
        c1364t.getClass();
        c1364t.s(new Runnable() { // from class: P.g
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C1364t.h(this.f8720g, c3563h, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public static /* synthetic */ void p(final C1364t c1364t, final I0 i02) {
        c1364t.f8750i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(c1364t.f8742a.g());
        surfaceTexture.setDefaultBufferSize(i02.q().getWidth(), i02.q().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        i02.x(c1364t.f8744c, new I0.i() { // from class: P.e
            @Override // y.I0.i
            public final void a(I0.h hVar) {
                C1364t.j(this.f8714a, i02, hVar);
            }
        });
        i02.w(surface, c1364t.f8744c, new H0.a() { // from class: P.f
            @Override // H0.a
            public final void accept(Object obj) {
                C1364t.f(this.f8716a, i02, surfaceTexture, surface, (I0.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(c1364t, c1364t.f8745d);
    }

    public static /* synthetic */ void q(C1364t c1364t, Runnable runnable, Runnable runnable2) {
        if (c1364t.f8751j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    private void r() {
        if (this.f8751j && this.f8750i == 0) {
            Iterator it = this.f8749h.keySet().iterator();
            while (it.hasNext()) {
                ((w0) it.next()).close();
            }
            Iterator it2 = this.f8752k.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f8749h.clear();
            this.f8742a.k();
            this.f8743b.quit();
        }
    }

    private void s(Runnable runnable) {
        t(runnable, new Runnable() { // from class: P.h
            @Override // java.lang.Runnable
            public final void run() {
                C1364t.n();
            }
        });
    }

    private void t(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f8744c.execute(new Runnable() { // from class: P.i
                @Override // java.lang.Runnable
                public final void run() {
                    C1364t.q(this.f8724g, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            AbstractC3583h0.m("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void u(Throwable th) {
        Iterator it = this.f8752k.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a().f(th);
        }
        this.f8752k.clear();
    }

    private Bitmap v(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        H.s.c(fArr2, i10, 0.5f, 0.5f);
        H.s.d(fArr2, 0.5f);
        return this.f8742a.p(H.z.p(size, i10), fArr2);
    }

    private void w(final C3563H c3563h, final Map map) {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: P.l
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C1364t.m(this.f8730a, c3563h, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    private void x(C2756s c2756s) {
        if (this.f8752k.isEmpty()) {
            return;
        }
        if (c2756s == null) {
            u(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = this.f8752k.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapV = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (iC != bVar.c() || bitmapV == null) {
                        iC = bVar.c();
                        if (bitmapV != null) {
                            bitmapV.recycle();
                        }
                        bitmapV = v((Size) c2756s.e(), (float[]) c2756s.f(), iC);
                        iB = -1;
                    }
                    if (iB != bVar.b()) {
                        byteArrayOutputStream.reset();
                        iB = bVar.b();
                        bitmapV.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) c2756s.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.q(surface, byteArray);
                    bVar.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            u(e10);
        }
    }

    @Override // P.P
    public void a() {
        if (this.f8746e.getAndSet(true)) {
            return;
        }
        s(new Runnable() { // from class: P.q
            @Override // java.lang.Runnable
            public final void run() {
                C1364t.g(this.f8739g);
            }
        });
    }

    @Override // y.x0
    public void b(final I0 i02) {
        if (this.f8746e.get()) {
            i02.z();
            return;
        }
        Runnable runnable = new Runnable() { // from class: P.o
            @Override // java.lang.Runnable
            public final void run() {
                C1364t.p(this.f8736g, i02);
            }
        };
        Objects.requireNonNull(i02);
        t(runnable, new RunnableC1361p(i02));
    }

    @Override // y.x0
    public void c(final w0 w0Var) {
        if (this.f8746e.get()) {
            w0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: P.m
            @Override // java.lang.Runnable
            public final void run() {
                C1364t.k(this.f8733g, w0Var);
            }
        };
        Objects.requireNonNull(w0Var);
        t(runnable, new RunnableC1359n(w0Var));
    }

    @Override // P.P
    public InterfaceFutureC2904a d(final int i10, final int i11) {
        return J.n.s(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: P.d
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return C1364t.i(this.f8711a, i10, i11, aVar);
            }
        }));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f8746e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f8747f);
        C2756s c2756s = null;
        for (Map.Entry entry : this.f8749h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            w0 w0Var = (w0) entry.getKey();
            w0Var.w(this.f8748g, this.f8747f);
            if (w0Var.getFormat() == 34) {
                try {
                    this.f8742a.n(surfaceTexture.getTimestamp(), this.f8748g, surface);
                } catch (RuntimeException e10) {
                    AbstractC3583h0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                H0.g.j(w0Var.getFormat() == 256, "Unsupported format: " + w0Var.getFormat());
                H0.g.j(c2756s == null, "Only one JPEG output is supported.");
                c2756s = new C2756s(surface, w0Var.b(), (float[]) this.f8748g.clone());
            }
        }
        try {
            x(c2756s);
        } catch (RuntimeException e11) {
            u(e11);
        }
    }

    C1364t(C3563H c3563h, Map map) {
        this.f8746e = new AtomicBoolean(false);
        this.f8747f = new float[16];
        this.f8748g = new float[16];
        this.f8749h = new LinkedHashMap();
        this.f8750i = 0;
        this.f8751j = false;
        this.f8752k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f8743b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f8745d = handler;
        this.f8744c = I.c.f(handler);
        this.f8742a = new x();
        try {
            w(c3563h, map);
        } catch (RuntimeException e10) {
            a();
            throw e10;
        }
    }

    public static /* synthetic */ void n() {
    }
}
