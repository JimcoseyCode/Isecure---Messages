package Z;

import android.view.Surface;
import androidx.concurrent.futures.c;
import g0.InterfaceC2646l;
import g0.InterfaceC2649o;
import java.util.Objects;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;
import y.I0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f13495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f13496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2649o f13497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC2646l f13498d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f13499e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private I0 f13500f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Executor f13501g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC2646l.c.a f13502h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f13503i = b.NOT_INITIALIZED;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceFutureC2904a f13504j = J.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c.a f13505k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceFutureC2904a f13506l = J.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c.a f13507m = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum b {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    w0(InterfaceC2649o interfaceC2649o, Executor executor, Executor executor2) {
        this.f13495a = executor2;
        this.f13496b = executor;
        this.f13497c = interfaceC2649o;
    }

    public static /* synthetic */ Object c(w0 w0Var, c.a aVar) {
        w0Var.f13505k = aVar;
        return "ReleasedFuture " + w0Var;
    }

    public static /* synthetic */ Object e(w0 w0Var, c.a aVar) {
        w0Var.f13507m = aVar;
        return "ReadyToReleaseFuture " + w0Var;
    }

    public static /* synthetic */ Object f(w0 w0Var, I0 i02, g0.q0 q0Var, c.a aVar) {
        w0Var.j(i02, q0Var, aVar);
        return "ConfigureVideoEncoderFuture " + w0Var;
    }

    public static /* synthetic */ void g(final w0 w0Var, c.a aVar, I0 i02, final Surface surface) {
        Executor executor;
        int iOrdinal = w0Var.f13503i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (i02.v()) {
                    AbstractC3583h0.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(i02, "EMPTY") + " is already serviced.");
                    aVar.c(null);
                    w0Var.h();
                    return;
                }
                w0Var.f13499e = surface;
                AbstractC3583h0.a("VideoEncoderSession", "provide surface: " + surface);
                i02.w(surface, w0Var.f13496b, new H0.a() { // from class: Z.u0
                    @Override // H0.a
                    public final void accept(Object obj) {
                        this.f13482a.o((I0.g) obj);
                    }
                });
                w0Var.f13503i = b.READY;
                aVar.c(w0Var.f13498d);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (w0Var.f13502h != null && (executor = w0Var.f13501g) != null) {
                        executor.execute(new Runnable() { // from class: Z.v0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f13492g.f13502h.a(surface);
                            }
                        });
                    }
                    AbstractC3583h0.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iOrdinal != 4) {
                    throw new IllegalStateException("State " + w0Var.f13503i + " is not handled");
                }
            }
        }
        AbstractC3583h0.a("VideoEncoderSession", "Not provide surface in " + w0Var.f13503i);
        aVar.c(null);
    }

    private void h() {
        int iOrdinal = this.f13503i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            r();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            AbstractC3583h0.a("VideoEncoderSession", "closeInternal in " + this.f13503i + " state");
            this.f13503i = b.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            AbstractC3583h0.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f13503i + " is not handled");
    }

    private void j(final I0 i02, g0.q0 q0Var, final c.a aVar) {
        try {
            InterfaceC2646l interfaceC2646lA = this.f13497c.a(this.f13495a, q0Var, i02.r());
            this.f13498d = interfaceC2646lA;
            InterfaceC2646l.b bVarC = interfaceC2646lA.c();
            if (bVarC instanceof InterfaceC2646l.c) {
                ((InterfaceC2646l.c) bVarC).b(this.f13496b, new InterfaceC2646l.c.a() { // from class: Z.t0
                    @Override // g0.InterfaceC2646l.c.a
                    public final void a(Surface surface) {
                        w0.g(this.f13471a, aVar, i02, surface);
                    }
                });
            } else {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (g0.l0 e10) {
            AbstractC3583h0.d("VideoEncoderSession", "Unable to initialize video encoder.", e10);
            aVar.f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(I0.g gVar) {
        AbstractC3583h0.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface surfaceB = gVar.b();
        if (surfaceB != this.f13499e) {
            surfaceB.release();
            return;
        }
        this.f13499e = null;
        this.f13507m.c(this.f13498d);
        h();
    }

    InterfaceFutureC2904a i(final I0 i02, final g0.q0 q0Var) {
        if (this.f13503i.ordinal() != 0) {
            return J.n.n(new IllegalStateException("configure() shouldn't be called in " + this.f13503i));
        }
        this.f13503i = b.INITIALIZING;
        this.f13500f = i02;
        AbstractC3583h0.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f13504j = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: Z.q0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return w0.c(this.f13464a, aVar);
            }
        });
        this.f13506l = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: Z.r0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return w0.e(this.f13465a, aVar);
            }
        });
        InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: Z.s0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return w0.f(this.f13468a, i02, q0Var, aVar);
            }
        });
        J.n.j(interfaceFutureC2904aA, new a(), this.f13496b);
        return J.n.s(interfaceFutureC2904aA);
    }

    Surface k() {
        if (this.f13503i != b.READY) {
            return null;
        }
        return this.f13499e;
    }

    InterfaceFutureC2904a l() {
        return J.n.s(this.f13506l);
    }

    InterfaceC2646l m() {
        return this.f13498d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean n(I0 i02) {
        int iOrdinal = this.f13503i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.f13500f == i02) {
                    return true;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("State " + this.f13503i + " is not handled");
                    }
                }
            }
        }
        return false;
    }

    void p(Executor executor, InterfaceC2646l.c.a aVar) {
        this.f13501g = executor;
        this.f13502h = aVar;
    }

    InterfaceFutureC2904a q() {
        h();
        return J.n.s(this.f13504j);
    }

    void r() {
        int iOrdinal = this.f13503i.ordinal();
        if (iOrdinal == 0) {
            this.f13503i = b.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.f13503i + " is not handled");
            }
            AbstractC3583h0.a("VideoEncoderSession", "terminateNow in " + this.f13503i + ", No-op");
            return;
        }
        this.f13503i = b.RELEASED;
        this.f13507m.c(this.f13498d);
        this.f13500f = null;
        if (this.f13498d == null) {
            AbstractC3583h0.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f13505k.c(null);
            return;
        }
        AbstractC3583h0.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f13498d);
        this.f13498d.a();
        this.f13498d.f().h(new Runnable() { // from class: Z.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13461g.f13505k.c(null);
            }
        }, this.f13496b);
        this.f13498d = null;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f13500f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {
        a() {
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            AbstractC3583h0.m("VideoEncoderSession", "VideoEncoder configuration failed.", th);
            w0.this.r();
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC2646l interfaceC2646l) {
        }
    }
}
