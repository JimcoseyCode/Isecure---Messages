package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.n;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;
import y.I0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class D extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    TextureView f15317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SurfaceTexture f15318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    InterfaceFutureC2904a f15319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    I0 f15320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f15321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    SurfaceTexture f15322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    AtomicReference f15323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    n.a f15324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Executor f15325m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: androidx.camera.view.D$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0150a implements J.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f15327a;

            C0150a(SurfaceTexture surfaceTexture) {
                this.f15327a = surfaceTexture;
            }

            @Override // J.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(I0.g gVar) {
                H0.g.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                AbstractC3583h0.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f15327a.release();
                D d10 = D.this;
                if (d10.f15322j != null) {
                    d10.f15322j = null;
                }
            }

            @Override // J.c
            public void onFailure(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            AbstractC3583h0.a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            D d10 = D.this;
            d10.f15318f = surfaceTexture;
            if (d10.f15319g == null) {
                d10.q();
                return;
            }
            H0.g.g(d10.f15320h);
            AbstractC3583h0.a("TextureViewImpl", "Surface invalidated " + D.this.f15320h);
            D.this.f15320h.n().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            D d10 = D.this;
            d10.f15318f = null;
            InterfaceFutureC2904a interfaceFutureC2904a = d10.f15319g;
            if (interfaceFutureC2904a == null) {
                AbstractC3583h0.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            J.n.j(interfaceFutureC2904a, new C0150a(surfaceTexture), androidx.core.content.a.h(D.this.f15317e.getContext()));
            D.this.f15322j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            AbstractC3583h0.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            c.a aVar = (c.a) D.this.f15323k.getAndSet(null);
            if (aVar != null) {
                aVar.c(null);
            }
            D.this.getClass();
            Executor executor = D.this.f15325m;
        }
    }

    D(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f15321i = false;
        this.f15323k = new AtomicReference();
    }

    public static /* synthetic */ Object j(D d10, Surface surface, final c.a aVar) {
        d10.getClass();
        AbstractC3583h0.a("TextureViewImpl", "Surface set on Preview.");
        I0 i02 = d10.f15320h;
        Executor executorB = I.c.b();
        Objects.requireNonNull(aVar);
        i02.w(surface, executorB, new H0.a() { // from class: androidx.camera.view.C
            @Override // H0.a
            public final void accept(Object obj) {
                aVar.c((I0.g) obj);
            }
        });
        return "provideSurface[request=" + d10.f15320h + " surface=" + surface + "]";
    }

    public static /* synthetic */ void k(D d10, Surface surface, InterfaceFutureC2904a interfaceFutureC2904a, I0 i02) {
        d10.getClass();
        AbstractC3583h0.a("TextureViewImpl", "Safe to release surface.");
        d10.o();
        surface.release();
        if (d10.f15319g == interfaceFutureC2904a) {
            d10.f15319g = null;
        }
        if (d10.f15320h == i02) {
            d10.f15320h = null;
        }
    }

    public static /* synthetic */ void l(D d10, I0 i02) {
        I0 i03 = d10.f15320h;
        if (i03 != null && i03 == i02) {
            d10.f15320h = null;
            d10.f15319g = null;
        }
        d10.o();
    }

    public static /* synthetic */ Object m(D d10, c.a aVar) {
        d10.f15323k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void o() {
        n.a aVar = this.f15324l;
        if (aVar != null) {
            aVar.a();
            this.f15324l = null;
        }
    }

    private void p() {
        if (!this.f15321i || this.f15322j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f15317e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f15322j;
        if (surfaceTexture != surfaceTexture2) {
            this.f15317e.setSurfaceTexture(surfaceTexture2);
            this.f15322j = null;
            this.f15321i = false;
        }
    }

    @Override // androidx.camera.view.n
    View b() {
        return this.f15317e;
    }

    @Override // androidx.camera.view.n
    Bitmap c() {
        TextureView textureView = this.f15317e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f15317e.getBitmap();
    }

    @Override // androidx.camera.view.n
    void d() {
        p();
    }

    @Override // androidx.camera.view.n
    void e() {
        this.f15321i = true;
    }

    @Override // androidx.camera.view.n
    void g(final I0 i02, n.a aVar) {
        this.f15399a = i02.q();
        n();
        I0 i03 = this.f15320h;
        if (i03 != null && i03.z()) {
            o();
        }
        this.f15320h = i02;
        this.f15324l = aVar;
        i02.k(androidx.core.content.a.h(this.f15317e.getContext()), new Runnable() { // from class: androidx.camera.view.y
            @Override // java.lang.Runnable
            public final void run() {
                D.l(this.f15435g, i02);
            }
        });
        q();
    }

    @Override // androidx.camera.view.n
    InterfaceFutureC2904a i() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: androidx.camera.view.z
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return D.m(this.f15437a, aVar);
            }
        });
    }

    public void n() {
        H0.g.g(this.f15400b);
        H0.g.g(this.f15399a);
        TextureView textureView = new TextureView(this.f15400b.getContext());
        this.f15317e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f15399a.getWidth(), this.f15399a.getHeight()));
        this.f15317e.setSurfaceTextureListener(new a());
        this.f15400b.removeAllViews();
        this.f15400b.addView(this.f15317e);
    }

    void q() {
        SurfaceTexture surfaceTexture;
        Size size = this.f15399a;
        if (size == null || (surfaceTexture = this.f15318f) == null || this.f15320h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f15399a.getHeight());
        final Surface surface = new Surface(this.f15318f);
        final I0 i02 = this.f15320h;
        final InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: androidx.camera.view.A
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return D.j(this.f15310a, surface, aVar);
            }
        });
        this.f15319g = interfaceFutureC2904aA;
        interfaceFutureC2904aA.h(new Runnable() { // from class: androidx.camera.view.B
            @Override // java.lang.Runnable
            public final void run() {
                D.k(this.f15312g, surface, interfaceFutureC2904aA, i02);
            }
        }, androidx.core.content.a.h(this.f15317e.getContext()));
        f();
    }
}
