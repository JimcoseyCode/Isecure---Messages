package Q;

import P.P;
import P.RunnableC1359n;
import P.RunnableC1361p;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import y.AbstractC3583h0;
import y.C3561F;
import y.C3563H;
import y.I0;
import y.w0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class o implements P, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f8957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HandlerThread f8958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f8959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f8960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f8963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map f8964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SurfaceTexture f8965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f8966j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static w7.o f8967a = new w7.o() { // from class: Q.n
            @Override // w7.o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((C3563H) obj, (C3561F) obj2, (C3561F) obj3);
            }
        };

        public static P a(C3563H c3563h, C3561F c3561f, C3561F c3561f2) {
            return (P) f8967a.invoke(c3563h, c3561f, c3561f2);
        }
    }

    o(C3563H c3563h, C3561F c3561f, C3561F c3561f2) {
        this(c3563h, Collections.EMPTY_MAP, c3561f, c3561f2);
    }

    public static /* synthetic */ void e(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f8962f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void g(o oVar, SurfaceTexture surfaceTexture, Surface surface, I0.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f8961e--;
        oVar.n();
    }

    public static /* synthetic */ void h(o oVar) {
        oVar.f8962f = true;
        oVar.n();
    }

    public static /* synthetic */ void i(o oVar, w0 w0Var, w0.b bVar) {
        oVar.getClass();
        w0Var.close();
        Surface surface = (Surface) oVar.f8964h.remove(w0Var);
        if (surface != null) {
            oVar.f8957a.r(surface);
        }
    }

    public static /* synthetic */ void j(final o oVar, final w0 w0Var) {
        Surface surfaceO = w0Var.o(oVar.f8959c, new H0.a() { // from class: Q.f
            @Override // H0.a
            public final void accept(Object obj) {
                o.i(this.f8941a, w0Var, (w0.b) obj);
            }
        });
        oVar.f8957a.j(surfaceO);
        oVar.f8964h.put(w0Var, surfaceO);
    }

    public static /* synthetic */ void k(final o oVar, I0 i02) {
        oVar.f8961e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f8957a.t(i02.u()));
        surfaceTexture.setDefaultBufferSize(i02.q().getWidth(), i02.q().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        i02.w(surface, oVar.f8959c, new H0.a() { // from class: Q.i
            @Override // H0.a
            public final void accept(Object obj) {
                o.g(this.f8946a, surfaceTexture, surface, (I0.g) obj);
            }
        });
        if (i02.u()) {
            oVar.f8965i = surfaceTexture;
        } else {
            oVar.f8966j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f8960d);
        }
    }

    public static /* synthetic */ void l(o oVar, C3563H c3563h, Map map, c.a aVar) throws Throwable {
        oVar.getClass();
        try {
            oVar.f8957a.h(c3563h, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object m(final o oVar, final C3563H c3563h, final Map map, final c.a aVar) {
        oVar.getClass();
        oVar.o(new Runnable() { // from class: Q.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.l(this.f8937g, c3563h, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private void n() {
        if (this.f8962f && this.f8961e == 0) {
            Iterator it = this.f8964h.keySet().iterator();
            while (it.hasNext()) {
                ((w0) it.next()).close();
            }
            this.f8964h.clear();
            this.f8957a.k();
            this.f8958b.quit();
        }
    }

    private void o(Runnable runnable) {
        p(runnable, new Runnable() { // from class: Q.h
            @Override // java.lang.Runnable
            public final void run() {
                o.f();
            }
        });
    }

    private void p(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f8959c.execute(new Runnable() { // from class: Q.g
                @Override // java.lang.Runnable
                public final void run() {
                    o.e(this.f8943g, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            AbstractC3583h0.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void q(final C3563H c3563h, final Map map) {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: Q.l
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return o.m(this.f8952a, c3563h, map, aVar);
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

    @Override // P.P
    public void a() {
        if (this.f8963g.getAndSet(true)) {
            return;
        }
        o(new Runnable() { // from class: Q.j
            @Override // java.lang.Runnable
            public final void run() {
                o.h(this.f8949g);
            }
        });
    }

    @Override // y.x0
    public void b(final I0 i02) {
        if (this.f8963g.get()) {
            i02.z();
            return;
        }
        Runnable runnable = new Runnable() { // from class: Q.k
            @Override // java.lang.Runnable
            public final void run() {
                o.k(this.f8950g, i02);
            }
        };
        Objects.requireNonNull(i02);
        p(runnable, new RunnableC1361p(i02));
    }

    @Override // y.x0
    public void c(final w0 w0Var) {
        if (this.f8963g.get()) {
            w0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: Q.m
            @Override // java.lang.Runnable
            public final void run() {
                o.j(this.f8955g, w0Var);
            }
        };
        Objects.requireNonNull(w0Var);
        p(runnable, new RunnableC1359n(w0Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f8963g.get() || (surfaceTexture2 = this.f8965i) == null || this.f8966j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f8966j.updateTexImage();
        for (Map.Entry entry : this.f8964h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            w0 w0Var = (w0) entry.getKey();
            if (w0Var.getFormat() == 34) {
                try {
                    this.f8957a.v(surfaceTexture.getTimestamp(), surface, w0Var, this.f8965i, this.f8966j);
                } catch (RuntimeException e10) {
                    AbstractC3583h0.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    o(C3563H c3563h, Map map, C3561F c3561f, C3561F c3561f2) {
        this.f8961e = 0;
        this.f8962f = false;
        this.f8963g = new AtomicBoolean(false);
        this.f8964h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f8958b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f8960d = handler;
        this.f8959c = I.c.f(handler);
        this.f8957a = new c(c3561f, c3561f2);
        try {
            q(c3563h, map);
        } catch (RuntimeException e10) {
            a();
            throw e10;
        }
    }

    public static /* synthetic */ void f() {
    }
}
