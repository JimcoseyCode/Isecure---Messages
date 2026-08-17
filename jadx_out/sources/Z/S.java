package Z;

import F.T0;
import F.V0;
import F.n1;
import F.v1;
import Z.S;
import Z.d0;
import Z.r;
import Z.x0;
import Z.y0;
import Z.z0;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.concurrent.futures.c;
import b0.f;
import c0.AbstractC1834a;
import c0.n;
import f0.AbstractC2579b;
import f0.AbstractC2582e;
import f0.AbstractC2590m;
import g0.C2628I;
import g0.C2641g;
import g0.C2642h;
import g0.InterfaceC2643i;
import g0.InterfaceC2646l;
import g0.InterfaceC2647m;
import g0.InterfaceC2648n;
import g0.InterfaceC2649o;
import h0.AbstractC2690d;
import h0.C2691e;
import i0.AbstractC2713a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;
import y.C3563H;
import y.I0;
import y.InterfaceC3597q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class S implements x0 {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    static long f13177A0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Set f13178q0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Set f13179r0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final C1585y f13180s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final z0 f13181t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final r f13182u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Exception f13183v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    static final InterfaceC2649o f13184w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final f.a f13185x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final Executor f13186y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    static int f13187z0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    Integer f13188A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    I0 f13189B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    v1 f13190C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    Surface f13191D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    Surface f13192E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    MediaMuxer f13193F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final T0 f13194G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    c0.n f13195H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    InterfaceC2646l f13196I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    g0.m0 f13197J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    InterfaceC2646l f13198K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    g0.m0 f13199L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    h f13200M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    Uri f13201N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    long f13202O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    long f13203P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    long f13204Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    long f13205R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f13206S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    long f13207T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    long f13208U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    long f13209V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    long f13210W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    long f13211X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    int f13212Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    Throwable f13213Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T0 f13214a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    InterfaceC2643i f13215a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T0 f13216b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    final O.c f13217b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f13218c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    Throwable f13219c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f13220d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f13221d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Executor f13222e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    x0.a f13223e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2649o f13224f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    ScheduledFuture f13225f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2649o f13226g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f13227g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f.a f13228h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    w0 f13229h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f13230i = new Object();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private g0.q0 f13231i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f13232j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    w0 f13233j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f13234k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    double f13235k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f13236l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f13237l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T0 f13238m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private k f13239m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f13240n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private b0.f f13241n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f13242o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private long f13243o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f13244p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f13245p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    j f13246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    j f13247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f13248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    j f13249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f13250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private I0.h f13251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private I0.h f13252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b0.i f13253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final List f13254y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Integer f13255z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f13256a;

        a(w0 w0Var) {
            this.f13256a = w0Var;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC2646l interfaceC2646l) {
            InterfaceC2646l interfaceC2646l2;
            AbstractC3583h0.a("Recorder", "VideoEncoder can be released: " + interfaceC2646l);
            if (interfaceC2646l == null) {
                return;
            }
            ScheduledFuture scheduledFuture = S.this.f13225f0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (interfaceC2646l2 = S.this.f13196I) != null && interfaceC2646l2 == interfaceC2646l) {
                S.V(interfaceC2646l2);
            }
            S s10 = S.this;
            s10.f13233j0 = this.f13256a;
            s10.t0(null);
            S s11 = S.this;
            s11.j0(4, null, s11.S());
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            AbstractC3583h0.a("Recorder", "Error in ReadyToReleaseFuture: " + th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0.n f13258a;

        b(c0.n nVar) {
            this.f13258a = nVar;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            AbstractC3583h0.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f13258a.hashCode())));
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            AbstractC3583h0.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f13258a.hashCode())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements n.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ H0.a f13263a;

        d(H0.a aVar) {
            this.f13263a = aVar;
        }

        @Override // c0.n.c
        public void a(boolean z10) {
            S s10 = S.this;
            if (s10.f13221d0 != z10) {
                s10.f13221d0 = z10;
                s10.I0(true);
            } else {
                AbstractC3583h0.l("Recorder", "Audio source silenced transitions to the same state " + z10);
            }
        }

        @Override // c0.n.c
        public void c(double d10) {
            S.this.f13235k0 = d10;
        }

        @Override // c0.n.c
        public void onError(Throwable th) {
            AbstractC3583h0.d("Recorder", "Error occurred after audio source started.", th);
            if (th instanceof c0.o) {
                this.f13263a.accept(th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f implements J.c {
        f() {
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            AbstractC3583h0.a("Recorder", "Encodings end successfully.");
            S s10 = S.this;
            s10.I(s10.f13212Y, s10.f13213Z);
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            H0.g.j(S.this.f13249t != null, "In-progress recording shouldn't be null");
            if (S.this.f13249t.g0()) {
                return;
            }
            AbstractC3583h0.a("Recorder", "Encodings end with error: " + th);
            S s10 = S.this;
            s10.I(s10.f13193F == null ? 8 : 6, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g implements V0.a {
        g() {
        }

        @Override // F.V0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            S.this.f13216b.k(bool);
        }

        @Override // F.V0.a
        public void onError(Throwable th) {
            S.this.f13216b.j(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum h {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r.a f13278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13279b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f13280c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InterfaceC2649o f13281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InterfaceC2649o f13282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private f.a f13283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f13284g;

        public i() {
            InterfaceC2649o interfaceC2649o = S.f13184w0;
            this.f13281d = interfaceC2649o;
            this.f13282e = interfaceC2649o;
            this.f13283f = S.f13185x0;
            this.f13284g = -1L;
            this.f13278a = r.a();
        }

        public S c() {
            return new S(this.f13280c, this.f13278a.a(), this.f13279b, this.f13281d, this.f13282e, this.f13283f, this.f13284g);
        }

        public i d(Executor executor) {
            H0.g.h(executor, "The specified executor can't be null.");
            this.f13280c = executor;
            return this;
        }

        public i e(final C1585y c1585y) {
            H0.g.h(c1585y, "The specified quality selector can't be null.");
            this.f13278a.b(new H0.a() { // from class: Z.U
                @Override // H0.a
                public final void accept(Object obj) {
                    ((z0.a) obj).e(c1585y);
                }
            });
            return this;
        }

        public i f(final int i10) {
            if (i10 > 0) {
                this.f13278a.b(new H0.a() { // from class: Z.T
                    @Override // H0.a
                    public final void accept(Object obj) {
                        int i11 = i10;
                        ((z0.a) obj).c(new Range(Integer.valueOf(i11), Integer.valueOf(i11)));
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i10 + " is not supported. Target bitrate must be greater than 0.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I0 f13295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v1 f13296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f13297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13298d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f13299e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ScheduledFuture f13300f = null;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements J.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w0 f13302a;

            a(w0 w0Var) {
                this.f13302a = w0Var;
            }

            public static /* synthetic */ void a(a aVar) {
                if (k.this.f13298d) {
                    return;
                }
                AbstractC3583h0.a("Recorder", "Retry setupVideo #" + k.this.f13299e);
                k kVar = k.this;
                kVar.k(kVar.f13295a, k.this.f13296b);
            }

            @Override // J.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(InterfaceC2646l interfaceC2646l) {
                AbstractC3583h0.a("Recorder", "VideoEncoder is created. " + interfaceC2646l);
                if (interfaceC2646l == null) {
                    return;
                }
                H0.g.i(S.this.f13229h0 == this.f13302a);
                H0.g.i(S.this.f13196I == null);
                S.this.d0(this.f13302a);
                S.this.W();
            }

            @Override // J.c
            public void onFailure(Throwable th) {
                AbstractC3583h0.m("Recorder", "VideoEncoder Setup error: " + th, th);
                if (k.this.f13299e >= k.this.f13297c) {
                    S.this.X(th);
                    return;
                }
                k.g(k.this);
                k.this.f13300f = S.q0(new Runnable() { // from class: Z.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.k.a.a(this.f13323g);
                    }
                }, S.this.f13222e, S.f13177A0, TimeUnit.MILLISECONDS);
            }
        }

        k(I0 i02, v1 v1Var, boolean z10, int i10) {
            this.f13295a = i02;
            this.f13296b = v1Var;
            S.this.f13245p0 = z10;
            this.f13297c = i10;
        }

        public static /* synthetic */ void a(k kVar, I0 i02, v1 v1Var) {
            kVar.getClass();
            if (i02.v() || (S.this.f13229h0.n(i02) && !S.this.S())) {
                AbstractC3583h0.l("Recorder", "Ignore the SurfaceRequest " + i02 + " isServiced: " + i02.v() + " VideoEncoderSession: " + S.this.f13229h0 + " has been configured with a persistent in-progress recording.");
                return;
            }
            InterfaceC2649o interfaceC2649o = S.this.f13224f;
            S s10 = S.this;
            w0 w0Var = new w0(interfaceC2649o, s10.f13222e, s10.f13220d);
            S s11 = S.this;
            r rVar = (r) s11.M(s11.f13194G);
            C3563H c3563hO = i02.o();
            g0.q0 q0VarG = AbstractC2590m.g(AbstractC2590m.d(AbstractC2590m.e(rVar, c3563hO, S.this.f13253x), v1Var, rVar.d(), i02.q(), c3563hO, i02.p()), S.this.f13245p0);
            S.this.f13231i0 = q0VarG;
            InterfaceFutureC2904a interfaceFutureC2904aI = w0Var.i(i02, q0VarG);
            S.this.f13229h0 = w0Var;
            J.n.j(interfaceFutureC2904aI, kVar.new a(w0Var), S.this.f13222e);
        }

        static /* synthetic */ int g(k kVar) {
            int i10 = kVar.f13299e;
            kVar.f13299e = i10 + 1;
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(final I0 i02, final v1 v1Var) {
            S.this.p0().h(new Runnable() { // from class: Z.Y
                @Override // java.lang.Runnable
                public final void run() {
                    S.k.a(this.f13320g, i02, v1Var);
                }
            }, S.this.f13222e);
        }

        void j() {
            if (this.f13298d) {
                return;
            }
            this.f13298d = true;
            ScheduledFuture scheduledFuture = this.f13300f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f13300f = null;
            }
        }

        void l() {
            k(this.f13295a, this.f13296b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum l {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C1585y c1585y = z0.f13530b;
        f13180s0 = c1585y;
        z0 z0VarA = z0.a().e(c1585y).b(-1).a();
        f13181t0 = z0VarA;
        f13182u0 = r.a().e(-1).f(z0VarA).a();
        f13183v0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f13184w0 = new InterfaceC2649o() { // from class: Z.I
            @Override // g0.InterfaceC2649o
            public final InterfaceC2646l a(Executor executor, InterfaceC2648n interfaceC2648n, int i10) {
                return new C2628I(executor, interfaceC2648n, i10);
            }
        };
        f13185x0 = new f.a() { // from class: Z.J
            @Override // b0.f.a
            public final b0.f a(AbstractC1579s abstractC1579s) {
                return new b0.g(abstractC1579s);
            }
        };
        f13186y0 = I.c.g(I.c.d());
        f13187z0 = 3;
        f13177A0 = 1000L;
    }

    S(Executor executor, r rVar, int i10, InterfaceC2649o interfaceC2649o, InterfaceC2649o interfaceC2649o2, f.a aVar, long j10) {
        this.f13232j = androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f13238m = T0.l(null);
        this.f13240n = l.CONFIGURING;
        this.f13242o = null;
        this.f13244p = 0;
        this.f13246q = null;
        this.f13247r = null;
        this.f13248s = 0L;
        this.f13249t = null;
        this.f13250u = false;
        this.f13251v = null;
        this.f13252w = null;
        this.f13253x = null;
        this.f13254y = new ArrayList();
        this.f13255z = null;
        this.f13188A = null;
        this.f13191D = null;
        this.f13192E = null;
        this.f13193F = null;
        this.f13195H = null;
        this.f13196I = null;
        this.f13197J = null;
        this.f13198K = null;
        this.f13199L = null;
        this.f13200M = h.INITIALIZING;
        this.f13201N = Uri.EMPTY;
        this.f13202O = 0L;
        this.f13203P = 0L;
        this.f13204Q = 0L;
        this.f13205R = Long.MAX_VALUE;
        this.f13206S = 0;
        this.f13207T = Long.MAX_VALUE;
        this.f13208U = Long.MAX_VALUE;
        this.f13209V = Long.MAX_VALUE;
        this.f13210W = 0L;
        this.f13211X = 0L;
        this.f13212Y = 1;
        this.f13213Z = null;
        this.f13215a0 = null;
        this.f13217b0 = new O.a(60);
        this.f13219c0 = null;
        this.f13221d0 = false;
        this.f13223e0 = x0.a.INACTIVE;
        this.f13225f0 = null;
        this.f13227g0 = false;
        this.f13231i0 = null;
        this.f13233j0 = null;
        this.f13235k0 = 0.0d;
        this.f13237l0 = false;
        this.f13239m0 = null;
        this.f13241n0 = null;
        this.f13243o0 = Long.MAX_VALUE;
        this.f13245p0 = false;
        this.f13218c = executor;
        executor = executor == null ? I.c.d() : executor;
        this.f13220d = executor;
        Executor executorG = I.c.g(executor);
        this.f13222e = executorG;
        this.f13194G = T0.l(G(rVar));
        this.f13234k = i10;
        this.f13214a = T0.l(d0.d(this.f13244p, P(this.f13240n)));
        this.f13216b = T0.l(Boolean.FALSE);
        this.f13224f = interfaceC2649o;
        this.f13226g = interfaceC2649o2;
        this.f13228h = aVar;
        this.f13229h0 = new w0(interfaceC2649o, executorG, executor);
        j10 = j10 == -1 ? 52428800L : j10;
        this.f13236l = j10;
        AbstractC3583h0.a("Recorder", "mRequiredFreeStorageBytes = " + C2691e.a(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0(j jVar) {
        if (this.f13249t != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        this.f13249t = jVar;
        b0.f fVarA = this.f13228h.a(jVar.I());
        this.f13241n0 = fVarA;
        long jA = fVarA.a();
        AbstractC3583h0.a("Recorder", "availableBytes = " + C2691e.a(jA));
        long j10 = this.f13236l;
        if (jA < j10) {
            I(3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(this.f13236l))));
            return;
        }
        this.f13243o0 = jA - j10;
        if (jVar.I().b() > 0) {
            this.f13210W = Math.round(jVar.I().b() * 0.95d);
            AbstractC3583h0.a("Recorder", "File size limit in bytes: " + this.f13210W);
        } else {
            this.f13210W = 0L;
        }
        if (jVar.I().a() > 0) {
            this.f13211X = TimeUnit.MILLISECONDS.toNanos(jVar.I().a());
            AbstractC3583h0.a("Recorder", "Duration limit in nanoseconds: " + this.f13211X);
        } else {
            this.f13211X = 0L;
        }
        int iOrdinal = this.f13200M.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r0(jVar.W() ? h.ENABLED : h.DISABLED);
            } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f13200M);
            }
        } else if (jVar.W()) {
            if (!R()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.f13249t.g0() || this.f13198K == null) {
                    x0(jVar);
                }
                r0(h.ENABLED);
            } catch (c0.o e10) {
                e = e10;
                AbstractC3583h0.d("Recorder", "Unable to create audio resource with error: ", e);
                r0(!(e instanceof g0.l0) ? h.ERROR_ENCODER : h.ERROR_SOURCE);
                this.f13219c0 = e;
            } catch (g0.l0 e11) {
                e = e11;
                AbstractC3583h0.d("Recorder", "Unable to create audio resource with error: ", e);
                r0(!(e instanceof g0.l0) ? h.ERROR_ENCODER : h.ERROR_SOURCE);
                this.f13219c0 = e;
            }
        }
        H0(jVar, false);
        if (Q()) {
            this.f13195H.D(jVar.d0());
            this.f13198K.start();
        }
        this.f13196I.start();
        j jVar2 = this.f13249t;
        jVar2.u0(y0.f(jVar2.I(), L()));
    }

    private void B0(j jVar, boolean z10) {
        A0(jVar);
        if (z10) {
            f0(jVar);
        }
    }

    private static int E0(b0.i iVar, int i10) {
        if (iVar != null) {
            int iB = iVar.b();
            if (iB == 1) {
                return Build.VERSION.SDK_INT < 26 ? 0 : 2;
            }
            if (iB == 2) {
                return 0;
            }
            if (iB == 9) {
                return 1;
            }
        }
        return i10;
    }

    private void F() {
        while (!this.f13217b0.isEmpty()) {
            this.f13217b0.a();
        }
    }

    private void F0() {
        w0 w0Var = this.f13233j0;
        if (w0Var == null) {
            p0();
            return;
        }
        H0.g.i(w0Var.m() == this.f13196I);
        AbstractC3583h0.a("Recorder", "Releasing video encoder: " + this.f13196I);
        this.f13233j0.r();
        this.f13233j0 = null;
        this.f13196I = null;
        this.f13197J = null;
        t0(null);
    }

    private r G(r rVar) {
        r.a aVarI = rVar.i();
        if (rVar.d().b() == -1) {
            aVarI.b(new H0.a() { // from class: Z.z
                @Override // H0.a
                public final void accept(Object obj) {
                    ((z0.a) obj).b(S.f13181t0.b());
                }
            });
        }
        return aVarI.a();
    }

    private void H(I0 i02, v1 v1Var, boolean z10) {
        if (i02.v()) {
            AbstractC3583h0.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        i02.x(this.f13222e, new I0.i() { // from class: Z.M
            @Override // y.I0.i
            public final void a(I0.h hVar) {
                this.f13165a.f13252w = hVar;
            }
        });
        Size sizeQ = i02.q();
        C3563H c3563hO = i02.o();
        e0 e0VarC = c(i02.m().d(), i02.r());
        AbstractC1582v abstractC1582vE = e0VarC.e(sizeQ, c3563hO);
        AbstractC3583h0.a("Recorder", "Using supported quality of " + abstractC1582vE + " for surface size " + sizeQ);
        if (abstractC1582vE != AbstractC1582v.f13489g) {
            b0.i iVarC = e0VarC.c(abstractC1582vE, c3563hO);
            this.f13253x = iVarC;
            if (iVarC == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        AbstractC3583h0.a("Recorder", "mResolvedEncoderProfiles = " + this.f13253x);
        k kVar = this.f13239m0;
        if (kVar != null) {
            kVar.j();
        }
        k kVar2 = new k(i02, v1Var, this.f13245p0, z10 ? f13187z0 : 0);
        this.f13239m0 = kVar2;
        kVar2.l();
    }

    private void H0(final j jVar, boolean z10) {
        if (!this.f13254y.isEmpty()) {
            InterfaceFutureC2904a interfaceFutureC2904aK = J.n.k(this.f13254y);
            if (!interfaceFutureC2904aK.isDone()) {
                interfaceFutureC2904aK.cancel(true);
            }
            this.f13254y.clear();
        }
        this.f13254y.add(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: Z.P
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return S.q(this.f13173a, jVar, aVar);
            }
        }));
        if (Q() && !z10) {
            this.f13254y.add(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: Z.Q
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return S.r(this.f13175a, jVar, aVar);
                }
            }));
        }
        J.n.j(J.n.k(this.f13254y), new f(), I.c.b());
    }

    private void J(j jVar, int i10, Throwable th) {
        Uri uri = Uri.EMPTY;
        jVar.m(uri);
        jVar.u0(y0.b(jVar.I(), c0.d(0L, 0L, AbstractC1563b.e(1, this.f13219c0, 0.0d, 0L)), AbstractC1580t.b(uri), i10, th));
    }

    private void J0(l lVar) {
        if (!f13178q0.contains(this.f13240n)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f13240n);
        }
        if (!f13179r0.contains(lVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        if (this.f13242o != lVar) {
            this.f13242o = lVar;
            this.f13214a.k(d0.e(this.f13244p, P(lVar), this.f13251v));
        }
    }

    private List K(long j10) {
        ArrayList arrayList = new ArrayList();
        while (!this.f13217b0.isEmpty()) {
            InterfaceC2643i interfaceC2643i = (InterfaceC2643i) this.f13217b0.a();
            if (interfaceC2643i.o0() >= j10) {
                arrayList.add(interfaceC2643i);
            }
        }
        return arrayList;
    }

    private static e0 N(int i10, InterfaceC3597q interfaceC3597q, int i11) {
        return new a0(i11, (F.L) interfaceC3597q, i10, g0.u0.f28089d);
    }

    private int O(h hVar) {
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            j jVar = this.f13249t;
            if (jVar == null || !jVar.d0()) {
                return this.f13221d0 ? 2 : 0;
            }
            return 5;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        if (iOrdinal == 5) {
            return 4;
        }
        throw new AssertionError("Invalid internal audio state: " + hVar);
    }

    private d0.a P(l lVar) {
        return (lVar == l.RECORDING || (lVar == l.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? d0.a.ACTIVE : d0.a.INACTIVE;
    }

    private static boolean T(b0 b0Var, j jVar) {
        return jVar != null && b0Var.m() == jVar.J();
    }

    private j U(l lVar) {
        boolean z10;
        if (lVar == l.PENDING_PAUSED) {
            z10 = true;
        } else {
            if (lVar != l.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z10 = false;
        }
        if (this.f13246q != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        j jVar = this.f13247r;
        if (jVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f13246q = jVar;
        jVar.M().c(I.c.b(), new g());
        this.f13247r = null;
        if (z10) {
            u0(l.PAUSED);
            return jVar;
        }
        u0(l.RECORDING);
        return jVar;
    }

    static void V(InterfaceC2646l interfaceC2646l) {
        if (interfaceC2646l instanceof C2628I) {
            ((C2628I) interfaceC2646l).c0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [Z.S$j] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r8v0, types: [Z.S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Z(j jVar) {
        j jVarU;
        boolean z10;
        Object obj;
        Exception exc;
        int i10;
        int i11;
        int i12;
        ?? r22;
        synchronized (this.f13230i) {
            try {
                j jVar2 = this.f13246q;
                if (jVar2 != jVar) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                jVar2.M().f();
                jVarU = null;
                this.f13246q = null;
                int i13 = 1;
                switch (this.f13240n.ordinal()) {
                    case 1:
                        z10 = false;
                        if (this.f13223e0 != x0.a.INACTIVE) {
                            j jVar3 = this.f13247r;
                            this.f13247r = null;
                            u0(l.CONFIGURING);
                            exc = f13183v0;
                            i11 = 0;
                            i12 = 4;
                            i10 = 0;
                            r22 = jVar3;
                        } else if (this.f13232j) {
                            this.f13192E = null;
                            I0 i02 = this.f13189B;
                            if (i02 == null || i02.v()) {
                                i13 = 0;
                            }
                            J0(l.CONFIGURING);
                            exc = null;
                            i10 = i13;
                            i11 = 0;
                            i12 = i11;
                            r22 = exc;
                        } else if (this.f13196I == null) {
                            obj = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                            i12 = i11;
                            r22 = obj;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            i12 = 0;
                            jVarU = U(this.f13240n);
                            r22 = exc;
                        }
                        break;
                    case 2:
                        z10 = true;
                        if (this.f13223e0 != x0.a.INACTIVE) {
                        }
                        break;
                    case 3:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.f13240n);
                    case 4:
                    case 5:
                    case 6:
                        if (!this.f13232j) {
                            u0(l.IDLING);
                            obj = null;
                            exc = null;
                            z10 = false;
                            i10 = 0;
                            i11 = i10;
                            i12 = i11;
                            r22 = obj;
                        } else {
                            this.f13192E = null;
                            I0 i03 = this.f13189B;
                            if (i03 == null || i03.v()) {
                                i13 = 0;
                            }
                            u0(l.CONFIGURING);
                            exc = null;
                            i10 = i13;
                            z10 = false;
                            i11 = 0;
                            i12 = i11;
                            r22 = exc;
                        }
                        break;
                    case 7:
                        exc = null;
                        i11 = 1;
                        z10 = false;
                        i10 = 0;
                        i12 = 0;
                        r22 = exc;
                        break;
                    default:
                        obj = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        i12 = i11;
                        r22 = obj;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 != 0) {
            H(this.f13189B, this.f13190C, false);
            return;
        }
        if (i11 != 0) {
            k0();
            return;
        }
        if (jVarU != null) {
            if (this.f13232j) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            B0(jVarU, z10);
        } else if (r22 != 0) {
            J(r22, i12, exc);
        }
    }

    private void a0() {
        boolean z10;
        I0 i02;
        synchronized (this.f13230i) {
            try {
                switch (this.f13240n.ordinal()) {
                    case 1:
                    case 2:
                        J0(l.CONFIGURING);
                        z10 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (S()) {
                            z10 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        u0(l.CONFIGURING);
                        z10 = true;
                        break;
                    default:
                        z10 = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13227g0 = false;
        if (!z10 || (i02 = this.f13189B) == null || i02.v()) {
            return;
        }
        H(this.f13189B, this.f13190C, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(I0 i02, v1 v1Var, boolean z10) {
        I0 i03 = this.f13189B;
        if (i03 != null && !i03.v()) {
            this.f13189B.z();
        }
        this.f13245p0 = z10;
        this.f13189B = i02;
        this.f13190C = v1Var;
        H(i02, v1Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(j jVar) {
        if (this.f13249t != jVar || this.f13250u) {
            return;
        }
        if (Q()) {
            this.f13198K.pause();
        }
        this.f13196I.pause();
        j jVar2 = this.f13249t;
        jVar2.u0(y0.d(jVar2.I(), L()));
    }

    private C1581u h0(Context context, AbstractC1579s abstractC1579s) {
        H0.g.h(abstractC1579s, "The OutputOptions cannot be null.");
        return new C1581u(context, this, abstractC1579s);
    }

    public static /* synthetic */ void i(InterfaceC2646l interfaceC2646l) {
        AbstractC3583h0.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            V(interfaceC2646l);
        }
    }

    private void i0() {
        c0.n nVar = this.f13195H;
        if (nVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f13195H = null;
        AbstractC3583h0.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(nVar.hashCode())));
        J.n.j(nVar.w(), new b(nVar), I.c.b());
    }

    public static /* synthetic */ void j(S s10, c.a aVar, Throwable th) {
        if (s10.f13219c0 == null) {
            if (th instanceof C2642h) {
                s10.r0(h.ERROR_ENCODER);
            } else {
                s10.r0(h.ERROR_SOURCE);
            }
            s10.f13219c0 = th;
            s10.I0(true);
            aVar.c(null);
        }
    }

    private void k0() {
        if (this.f13198K != null) {
            AbstractC3583h0.a("Recorder", "Releasing audio encoder.");
            this.f13198K.a();
            this.f13198K = null;
            this.f13199L = null;
        }
        if (this.f13195H != null) {
            i0();
        }
        r0(h.INITIALIZING);
        l0();
    }

    public static /* synthetic */ void l(S s10) {
        I0 i02 = s10.f13189B;
        if (i02 == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        s10.H(i02, s10.f13190C, false);
    }

    private void l0() {
        if (this.f13196I != null) {
            AbstractC3583h0.a("Recorder", "Releasing video encoder.");
            F0();
        }
        a0();
    }

    private void m0() {
        if (f13178q0.contains(this.f13240n)) {
            u0(this.f13242o);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f13240n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(j jVar) {
        if (this.f13249t != jVar || this.f13250u) {
            return;
        }
        if (Q()) {
            this.f13198K.start();
        }
        InterfaceC2646l interfaceC2646l = this.f13196I;
        if (interfaceC2646l == null) {
            this.f13237l0 = true;
            return;
        }
        interfaceC2646l.start();
        j jVar2 = this.f13249t;
        jVar2.u0(y0.e(jVar2.I(), L()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceFutureC2904a p0() {
        AbstractC3583h0.a("Recorder", "Try to safely release video encoder: " + this.f13196I);
        return this.f13229h0.q();
    }

    public static /* synthetic */ Object q(S s10, j jVar, c.a aVar) {
        s10.f13196I.d(s10.new c(aVar, jVar), s10.f13222e);
        return "videoEncodingFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledFuture q0(final Runnable runnable, final Executor executor, long j10, TimeUnit timeUnit) {
        return I.c.e().schedule(new Runnable() { // from class: Z.E
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j10, timeUnit);
    }

    public static /* synthetic */ Object r(final S s10, j jVar, final c.a aVar) {
        s10.getClass();
        H0.a aVar2 = new H0.a() { // from class: Z.C
            @Override // H0.a
            public final void accept(Object obj) {
                S.j(this.f13151a, aVar, (Throwable) obj);
            }
        };
        s10.f13195H.A(s10.f13222e, s10.new d(aVar2));
        s10.f13198K.d(s10.new e(aVar, aVar2, jVar), s10.f13222e);
        return "audioEncodingFuture";
    }

    private void v0(int i10) {
        if (this.f13244p == i10) {
            return;
        }
        AbstractC3583h0.a("Recorder", "Transitioning streamId: " + this.f13244p + " --> " + i10);
        this.f13244p = i10;
        this.f13214a.k(d0.e(i10, P(this.f13240n), this.f13251v));
    }

    private void x0(j jVar) {
        r rVar = (r) M(this.f13194G);
        AbstractC2582e abstractC2582eC = AbstractC2579b.c(rVar, this.f13253x);
        v1 v1Var = v1.UPTIME;
        g0.q0 q0Var = (g0.q0) H0.g.g(this.f13231i0);
        AbstractC1834a abstractC1834aD = AbstractC2579b.d(abstractC2582eC, rVar.b(), q0Var.e() != q0Var.h() ? new Rational(q0Var.e(), q0Var.h()) : null);
        if (this.f13195H != null) {
            i0();
        }
        c0.n nVarY0 = y0(jVar, abstractC1834aD);
        this.f13195H = nVarY0;
        AbstractC3583h0.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(nVarY0.hashCode())));
        InterfaceC2646l interfaceC2646lA = this.f13226g.a(this.f13220d, AbstractC2579b.b(abstractC2582eC, v1Var, abstractC1834aD, rVar.b()), ((I0) H0.g.g(this.f13189B)).r());
        this.f13198K = interfaceC2646lA;
        InterfaceC2646l.b bVarC = interfaceC2646lA.c();
        if (!(bVarC instanceof InterfaceC2646l.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.f13195H.B((InterfaceC2646l.a) bVarC);
    }

    private c0.n y0(j jVar, AbstractC1834a abstractC1834a) {
        return jVar.k0(abstractC1834a, f13186y0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void C0(b0 b0Var, int i10, Throwable th) {
        Throwable th2;
        final int i11;
        final Throwable th3;
        synchronized (this.f13230i) {
            try {
                try {
                    if (!T(b0Var, this.f13247r)) {
                        try {
                            if (!T(b0Var, this.f13246q)) {
                                AbstractC3583h0.a("Recorder", "stop() called on a recording that is no longer active: " + b0Var.k());
                                return;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            throw th2;
                        }
                    }
                    j jVar = null;
                    switch (this.f13240n) {
                        case CONFIGURING:
                        case IDLING:
                            throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                            i11 = i10;
                            th3 = th;
                            H0.g.i(T(b0Var, this.f13247r));
                            j jVar2 = this.f13247r;
                            this.f13247r = null;
                            m0();
                            jVar = jVar2;
                            if (jVar != null) {
                                if (i11 == 10) {
                                    AbstractC3583h0.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                J(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th3));
                                return;
                            }
                            return;
                        case RECORDING:
                        case PAUSED:
                            u0(l.STOPPING);
                            final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                            final j jVar3 = this.f13246q;
                            i11 = i10;
                            th3 = th;
                            this.f13222e.execute(new Runnable() { // from class: Z.O
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f13168g.D0(jVar3, micros, i11, th3);
                                }
                            });
                            if (jVar != null) {
                            }
                            break;
                        case STOPPING:
                        case RESETTING:
                            H0.g.i(T(b0Var, this.f13246q));
                        default:
                            i11 = i10;
                            th3 = th;
                            if (jVar != null) {
                            }
                            break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                th2 = th;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0(j jVar, long j10, int i10, Throwable th) {
        if (this.f13249t != jVar || this.f13250u) {
            return;
        }
        this.f13250u = true;
        this.f13212Y = i10;
        this.f13213Z = th;
        if (Q()) {
            F();
            this.f13198K.b(j10);
        }
        InterfaceC2643i interfaceC2643i = this.f13215a0;
        if (interfaceC2643i != null) {
            interfaceC2643i.close();
            this.f13215a0 = null;
        }
        if (this.f13223e0 != x0.a.ACTIVE_NON_STREAMING) {
            final InterfaceC2646l interfaceC2646l = this.f13196I;
            this.f13225f0 = q0(new Runnable() { // from class: Z.B
                @Override // java.lang.Runnable
                public final void run() {
                    S.i(interfaceC2646l);
                }
            }, this.f13222e, 1000L, TimeUnit.MILLISECONDS);
        } else {
            V(this.f13196I);
        }
        this.f13196I.b(j10);
    }

    void G0() {
        boolean z10;
        j jVarU;
        int i10;
        j jVar;
        Throwable th;
        synchronized (this.f13230i) {
            try {
                AbstractC3583h0.a("Recorder", "tryServicePendingRecording on state: " + this.f13240n);
                int iOrdinal = this.f13240n.ordinal();
                boolean z11 = true;
                z10 = false;
                jVarU = null;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        i10 = 0;
                        jVar = null;
                    }
                    th = jVar;
                } else {
                    z11 = false;
                }
                if (this.f13223e0 == x0.a.INACTIVE) {
                    jVar = this.f13247r;
                    this.f13247r = null;
                    m0();
                    i10 = 4;
                    z10 = z11;
                    th = f13183v0;
                } else {
                    if (this.f13246q != null || this.f13227g0) {
                        AbstractC3583h0.l("Recorder", "PendingRecording is not handled, active recording = " + this.f13246q + ", need reset flag = " + this.f13227g0);
                    } else if (this.f13196I != null) {
                        i10 = 0;
                        z10 = z11;
                        th = null;
                        jVarU = U(this.f13240n);
                        jVar = null;
                    }
                    i10 = 0;
                    jVar = null;
                    z10 = z11;
                    th = jVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVarU != null) {
            B0(jVarU, z10);
        } else if (jVar != null) {
            J(jVar, i10, th);
        }
    }

    void I(int i10, Throwable th) {
        if (this.f13249t == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.f13193F;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f13193F.release();
            } catch (IllegalStateException e10) {
                AbstractC3583h0.d("Recorder", "MediaMuxer failed to stop or release with error: " + e10.getMessage(), e10);
                if (i10 == 0) {
                    i10 = ((b0.f) H0.g.g(this.f13241n0)).a() < this.f13236l ? 3 : this.f13203P == 0 ? 8 : 1;
                }
            }
            this.f13193F = null;
        } else if (i10 == 0) {
            i10 = 8;
        }
        this.f13249t.m(this.f13201N);
        AbstractC1579s abstractC1579sI = this.f13249t.I();
        c0 c0VarL = L();
        AbstractC1580t abstractC1580tB = AbstractC1580t.b(this.f13201N);
        this.f13249t.u0(i10 == 0 ? y0.a(abstractC1579sI, c0VarL, abstractC1580tB) : y0.b(abstractC1579sI, c0VarL, abstractC1580tB, i10, th));
        j jVar = this.f13249t;
        this.f13249t = null;
        this.f13250u = false;
        this.f13255z = null;
        this.f13188A = null;
        this.f13254y.clear();
        this.f13201N = Uri.EMPTY;
        this.f13202O = 0L;
        this.f13203P = 0L;
        this.f13204Q = 0L;
        this.f13205R = Long.MAX_VALUE;
        this.f13207T = Long.MAX_VALUE;
        this.f13208U = Long.MAX_VALUE;
        this.f13209V = Long.MAX_VALUE;
        this.f13212Y = 1;
        this.f13213Z = null;
        this.f13219c0 = null;
        this.f13235k0 = 0.0d;
        this.f13241n0 = null;
        this.f13243o0 = Long.MAX_VALUE;
        F();
        s0(null);
        int iOrdinal = this.f13200M.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            r0(h.IDLING);
            this.f13195H.F();
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            r0(h.INITIALIZING);
        }
        Z(jVar);
    }

    void I0(boolean z10) {
        j jVar = this.f13249t;
        if (jVar != null) {
            jVar.w0(y0.g(jVar.I(), L()), z10);
        }
    }

    void K0(InterfaceC2643i interfaceC2643i, j jVar) throws Throwable {
        long size = this.f13202O + interfaceC2643i.size();
        long j10 = this.f13210W;
        if (j10 != 0 && size > j10) {
            AbstractC3583h0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f13210W)));
            Y(jVar, 2, null);
            return;
        }
        long jO0 = interfaceC2643i.o0();
        long j11 = this.f13207T;
        if (j11 == Long.MAX_VALUE) {
            this.f13207T = jO0;
            AbstractC3583h0.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jO0), b0.d.f(this.f13207T)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jO0 - Math.min(this.f13205R, j11));
            H0.g.j(this.f13209V != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(jO0 - this.f13209V);
            long j12 = this.f13211X;
            if (j12 != 0 && nanos2 > j12) {
                AbstractC3583h0.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f13211X)));
                Y(jVar, 9, null);
                return;
            }
        }
        try {
            this.f13193F.writeSampleData(this.f13255z.intValue(), interfaceC2643i.a(), interfaceC2643i.O());
            this.f13202O = size;
            this.f13203P += interfaceC2643i.size();
            this.f13209V = jO0;
        } catch (IllegalStateException e10) {
            Y(jVar, ((b0.f) H0.g.g(this.f13241n0)).a() < this.f13236l ? 3 : 1, e10);
        }
    }

    c0 L() {
        return c0.d(this.f13204Q, this.f13202O, AbstractC1563b.e(O(this.f13200M), this.f13219c0, this.f13235k0, this.f13203P));
    }

    void L0(InterfaceC2643i interfaceC2643i, j jVar) throws Throwable {
        if (this.f13188A == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.f13202O + interfaceC2643i.size();
        long j10 = this.f13210W;
        long nanos = 0;
        if (j10 != 0 && size > j10) {
            AbstractC3583h0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f13210W)));
            Y(jVar, 2, null);
            return;
        }
        long jO0 = interfaceC2643i.o0();
        long j11 = this.f13205R;
        if (j11 == Long.MAX_VALUE) {
            this.f13205R = jO0;
            AbstractC3583h0.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jO0), b0.d.f(this.f13205R)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(jO0 - Math.min(j11, this.f13207T));
            H0.g.j(this.f13208U != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jO0 - this.f13208U) + nanos;
            long j12 = this.f13211X;
            if (j12 != 0 && nanos2 > j12) {
                AbstractC3583h0.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f13211X)));
                Y(jVar, 9, null);
                return;
            }
        }
        try {
            this.f13193F.writeSampleData(this.f13188A.intValue(), interfaceC2643i.a(), interfaceC2643i.O());
            this.f13202O = size;
            this.f13204Q = nanos;
            this.f13208U = jO0;
            I0(interfaceC2643i.T());
            if (size > this.f13243o0) {
                long jA = ((b0.f) H0.g.g(this.f13241n0)).a();
                AbstractC3583h0.a("Recorder", "availableBytes = " + C2691e.a(jA));
                long j13 = this.f13236l;
                if (jA < j13) {
                    Y(jVar, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(this.f13236l))));
                } else {
                    this.f13243o0 = jA - j13;
                }
            }
        } catch (IllegalStateException e10) {
            Y(jVar, ((b0.f) H0.g.g(this.f13241n0)).a() < this.f13236l ? 3 : 1, e10);
        }
    }

    Object M(n1 n1Var) {
        try {
            return n1Var.d().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    boolean Q() {
        return this.f13200M == h.ENABLED;
    }

    boolean R() {
        return ((r) M(this.f13194G)).b().c() != 0;
    }

    boolean S() {
        j jVar = this.f13249t;
        return jVar != null && jVar.g0();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void W() {
        j jVarU;
        boolean z10;
        Exception exc;
        int i10;
        int i11;
        j jVar;
        synchronized (this.f13230i) {
            try {
                jVarU = null;
                switch (this.f13240n) {
                    case CONFIGURING:
                        u0(l.IDLING);
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                    case PENDING_RECORDING:
                        z10 = false;
                        if (this.f13246q == null) {
                            jVar = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                        } else if (this.f13223e0 == x0.a.INACTIVE) {
                            jVar = this.f13247r;
                            this.f13247r = null;
                            m0();
                            exc = f13183v0;
                            i10 = 4;
                            i11 = 0;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            jVarU = U(this.f13240n);
                            jVar = null;
                        }
                        break;
                    case PENDING_PAUSED:
                        z10 = true;
                        if (this.f13246q == null) {
                        }
                        break;
                    case IDLING:
                    case RESETTING:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.f13240n);
                    case RECORDING:
                        z10 = false;
                        H0.g.j(S(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i11 = 1;
                        jVar = null;
                        exc = null;
                        i10 = 0;
                        break;
                    case PAUSED:
                        z10 = true;
                        H0.g.j(S(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i11 = 1;
                        jVar = null;
                        exc = null;
                        i10 = 0;
                        break;
                    case STOPPING:
                        if (!this.f13232j) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                        break;
                    case ERROR:
                        AbstractC3583h0.c("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                    default:
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i11 == 0) {
            if (jVarU != null) {
                B0(jVarU, z10);
                return;
            } else {
                if (jVar != null) {
                    J(jVar, i10, exc);
                    return;
                }
                return;
            }
        }
        H0(this.f13249t, true);
        this.f13196I.start();
        if (this.f13237l0) {
            j jVar2 = this.f13249t;
            jVar2.u0(y0.e(jVar2.I(), L()));
            this.f13237l0 = false;
        }
        if (z10) {
            this.f13196I.pause();
        }
    }

    void X(Throwable th) {
        j jVar;
        synchronized (this.f13230i) {
            try {
                jVar = null;
                switch (this.f13240n) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        j jVar2 = this.f13247r;
                        this.f13247r = null;
                        jVar = jVar2;
                    case CONFIGURING:
                        v0(-1);
                        u0(l.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f13240n + ": " + th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            J(jVar, 7, th);
        }
    }

    void Y(j jVar, int i10, Throwable th) throws Throwable {
        Throwable th2;
        if (jVar != this.f13249t) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f13230i) {
            try {
                try {
                    boolean z10 = false;
                    switch (this.f13240n) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f13240n);
                        case RECORDING:
                        case PAUSED:
                            try {
                                u0(l.STOPPING);
                                z10 = true;
                                break;
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                        case STOPPING:
                        case RESETTING:
                            if (jVar != this.f13246q) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z10) {
                                D0(jVar, -1L, i10, th);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // Z.x0
    public void a(I0 i02) {
        b(i02, v1.UPTIME, false);
    }

    @Override // Z.x0
    public void b(final I0 i02, final v1 v1Var, final boolean z10) {
        synchronized (this.f13230i) {
            try {
                AbstractC3583h0.a("Recorder", "Surface is requested in state: " + this.f13240n + ", Current surface: " + this.f13244p);
                if (this.f13240n == l.ERROR) {
                    u0(l.CONFIGURING);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13222e.execute(new Runnable() { // from class: Z.F
            @Override // java.lang.Runnable
            public final void run() {
                this.f13157g.c0(i02, v1Var, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(x0.a aVar) throws Throwable {
        ScheduledFuture scheduledFuture;
        InterfaceC2646l interfaceC2646l;
        x0.a aVar2 = this.f13223e0;
        this.f13223e0 = aVar;
        if (aVar2 == aVar) {
            AbstractC3583h0.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        AbstractC3583h0.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != x0.a.INACTIVE) {
            if (aVar != x0.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f13225f0) == null || !scheduledFuture.cancel(false) || (interfaceC2646l = this.f13196I) == null) {
                return;
            }
            V(interfaceC2646l);
            return;
        }
        if (this.f13192E == null) {
            k kVar = this.f13239m0;
            if (kVar != null) {
                kVar.j();
                this.f13239m0 = null;
            }
            j0(4, null, false);
            return;
        }
        this.f13227g0 = true;
        j jVar = this.f13249t;
        if (jVar == null || jVar.g0()) {
            return;
        }
        Y(this.f13249t, 4, null);
    }

    @Override // Z.x0
    public e0 c(InterfaceC3597q interfaceC3597q, int i10) {
        return N(i10 == 1 ? 2 : 1, interfaceC3597q, this.f13234k);
    }

    @Override // Z.x0
    public V0 d() {
        return this.f13194G;
    }

    void d0(w0 w0Var) {
        InterfaceC2646l interfaceC2646l = (InterfaceC2646l) H0.g.g(w0Var.m());
        this.f13196I = interfaceC2646l;
        this.f13238m.k(((g0.s0) interfaceC2646l.e()).c());
        this.f13206S = this.f13196I.h();
        Surface surfaceK = w0Var.k();
        this.f13192E = surfaceK;
        t0(surfaceK);
        w0Var.p(this.f13222e, new InterfaceC2646l.c.a() { // from class: Z.G
            @Override // g0.InterfaceC2646l.c.a
            public final void a(Surface surface) {
                this.f13161a.t0(surface);
            }
        });
        J.n.j(w0Var.l(), new a(w0Var), this.f13222e);
    }

    @Override // Z.x0
    public V0 e() {
        return this.f13214a;
    }

    void e0(b0 b0Var) {
        synchronized (this.f13230i) {
            try {
                if (!T(b0Var, this.f13247r) && !T(b0Var, this.f13246q)) {
                    AbstractC3583h0.a("Recorder", "pause() called on a recording that is no longer active: " + b0Var.k());
                    return;
                }
                int iOrdinal = this.f13240n.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        u0(l.PENDING_PAUSED);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            u0(l.PAUSED);
                            final j jVar = this.f13246q;
                            this.f13222e.execute(new Runnable() { // from class: Z.N
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f13166g.f0(jVar);
                                }
                            });
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + this.f13240n);
            } finally {
            }
        }
    }

    @Override // Z.x0
    public V0 f() {
        return this.f13216b;
    }

    @Override // Z.x0
    public void g(final x0.a aVar) {
        this.f13222e.execute(new Runnable() { // from class: Z.D
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f13153g.b0(aVar);
            }
        });
    }

    public C1581u g0(Context context, C1578q c1578q) {
        return h0(context, c1578q);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    void j0(int i10, Throwable th, boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f13230i) {
            try {
                z11 = true;
                z12 = false;
                switch (this.f13240n) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        J0(l.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        H0.g.j(this.f13249t != null, "In-progress recording shouldn't be null when in state " + this.f13240n);
                        if (this.f13246q != this.f13249t) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!S()) {
                            u0(l.RESETTING);
                            z12 = true;
                            z11 = false;
                        }
                        break;
                        break;
                    case STOPPING:
                        u0(l.RESETTING);
                        z11 = false;
                        break;
                    case RESETTING:
                    default:
                        z11 = false;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            if (z12) {
                D0(this.f13249t, -1L, i10, th);
            }
        } else if (z10) {
            l0();
        } else {
            k0();
        }
    }

    void n0(b0 b0Var) {
        synchronized (this.f13230i) {
            try {
                if (!T(b0Var, this.f13247r) && !T(b0Var, this.f13246q)) {
                    AbstractC3583h0.a("Recorder", "resume() called on a recording that is no longer active: " + b0Var.k());
                    return;
                }
                int iOrdinal = this.f13240n.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 5) {
                        u0(l.RECORDING);
                        final j jVar = this.f13246q;
                        this.f13222e.execute(new Runnable() { // from class: Z.A
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f13148g.o0(jVar);
                            }
                        });
                    } else if (iOrdinal == 2) {
                        u0(l.PENDING_RECORDING);
                    } else if (iOrdinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + this.f13240n);
            } finally {
            }
        }
    }

    void r0(h hVar) {
        AbstractC3583h0.a("Recorder", "Transitioning audio state: " + this.f13200M + " --> " + hVar);
        this.f13200M = hVar;
    }

    void s0(I0.h hVar) {
        AbstractC3583h0.a("Recorder", "Update stream transformation info: " + hVar);
        this.f13251v = hVar;
        synchronized (this.f13230i) {
            this.f13214a.k(d0.e(this.f13244p, P(this.f13240n), hVar));
        }
    }

    void t0(Surface surface) {
        int iHashCode;
        if (this.f13191D == surface) {
            return;
        }
        this.f13191D = surface;
        synchronized (this.f13230i) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            v0(iHashCode);
        }
    }

    void u0(l lVar) {
        if (this.f13240n == lVar) {
            throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
        }
        AbstractC3583h0.a("Recorder", "Transitioning Recorder internal state: " + this.f13240n + " --> " + lVar);
        Set set = f13178q0;
        d0.a aVarP = null;
        if (set.contains(lVar)) {
            if (!set.contains(this.f13240n)) {
                if (!f13179r0.contains(this.f13240n)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f13240n);
                }
                l lVar2 = this.f13240n;
                this.f13242o = lVar2;
                aVarP = P(lVar2);
            }
        } else if (this.f13242o != null) {
            this.f13242o = null;
        }
        this.f13240n = lVar;
        if (aVarP == null) {
            aVarP = P(lVar);
        }
        this.f13214a.k(d0.e(this.f13244p, aVarP, this.f13251v));
    }

    void w0(j jVar) {
        if (this.f13193F != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (Q() && this.f13217b0.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        InterfaceC2643i interfaceC2643i = this.f13215a0;
        if (interfaceC2643i == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f13215a0 = null;
            List listK = K(interfaceC2643i.o0());
            long size = interfaceC2643i.size();
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                size += ((InterfaceC2643i) it.next()).size();
            }
            long j10 = this.f13210W;
            if (j10 != 0 && size > j10) {
                AbstractC3583h0.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f13210W)));
                Y(jVar, 2, null);
                interfaceC2643i.close();
                return;
            }
            int i10 = 3;
            try {
                r rVar = (r) M(this.f13194G);
                MediaMuxer mediaMuxerL0 = jVar.l0(rVar.c() == -1 ? E0(this.f13253x, r.g(f13182u0.c())) : r.g(rVar.c()), new H0.a() { // from class: Z.H
                    @Override // H0.a
                    public final void accept(Object obj) {
                        this.f13162a.f13201N = (Uri) obj;
                    }
                });
                I0.h hVar = this.f13252w;
                if (hVar != null) {
                    s0(hVar);
                    mediaMuxerL0.setOrientationHint(hVar.b());
                }
                Location locationC = jVar.I().c();
                if (locationC != null) {
                    try {
                        Pair pairA = AbstractC2713a.a(locationC.getLatitude(), locationC.getLongitude());
                        mediaMuxerL0.setLocation((float) ((Double) pairA.first).doubleValue(), (float) ((Double) pairA.second).doubleValue());
                    } catch (IllegalArgumentException e10) {
                        mediaMuxerL0.release();
                        Y(jVar, 5, e10);
                        interfaceC2643i.close();
                        return;
                    }
                }
                this.f13188A = Integer.valueOf(mediaMuxerL0.addTrack(this.f13197J.a()));
                if (Q()) {
                    this.f13255z = Integer.valueOf(mediaMuxerL0.addTrack(this.f13199L.a()));
                }
                try {
                    mediaMuxerL0.start();
                    this.f13193F = mediaMuxerL0;
                    L0(interfaceC2643i, jVar);
                    Iterator it2 = listK.iterator();
                    while (it2.hasNext()) {
                        K0((InterfaceC2643i) it2.next(), jVar);
                    }
                    interfaceC2643i.close();
                } catch (IllegalStateException e11) {
                    if (((b0.f) H0.g.g(this.f13241n0)).a() >= this.f13236l) {
                        i10 = 1;
                    }
                    Y(jVar, i10, e11);
                    interfaceC2643i.close();
                }
            } catch (IOException e12) {
                if (!C2691e.d(e12)) {
                    i10 = 5;
                }
                Y(jVar, i10, e12);
                interfaceC2643i.close();
            }
        } catch (Throwable th) {
            if (interfaceC2643i != null) {
                try {
                    interfaceC2643i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    b0 z0(C1581u c1581u) {
        long j10;
        j jVar;
        int i10;
        j jVar2;
        H0.g.h(c1581u, "The given PendingRecording cannot be null.");
        synchronized (this.f13230i) {
            try {
                j10 = this.f13248s + 1;
                this.f13248s = j10;
                jVar = null;
                i10 = 0;
                switch (this.f13240n) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        l lVar = this.f13240n;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            H0.g.j(this.f13246q == null && this.f13247r == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            j jVarS = j.s(c1581u, j10);
                            jVarS.X(c1581u.a());
                            this.f13247r = jVarS;
                            l lVar3 = this.f13240n;
                            if (lVar3 == lVar2) {
                                u0(l.PENDING_RECORDING);
                                this.f13222e.execute(new Runnable() { // from class: Z.K
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f13163g.G0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                u0(l.PENDING_RECORDING);
                                this.f13222e.execute(new Runnable() { // from class: Z.L
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        S.l(this.f13164g);
                                    }
                                });
                            } else {
                                u0(l.PENDING_RECORDING);
                            }
                            e = null;
                        } catch (IOException e10) {
                            e = e10;
                            i10 = 5;
                        }
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        jVar2 = (j) H0.g.g(this.f13247r);
                        jVar = jVar2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        jVar2 = this.f13246q;
                        jVar = jVar2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i10 == 0) {
            return b0.e(c1581u, j10);
        }
        AbstractC3583h0.c("Recorder", "Recording was started when the Recorder had encountered error " + e);
        J(j.s(c1581u, j10), i10, e);
        return b0.d(c1581u, j10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements InterfaceC2647m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f13260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f13261c;

        c(c.a aVar, j jVar) {
            this.f13260b = aVar;
            this.f13261c = jVar;
        }

        @Override // g0.InterfaceC2647m
        public void b(g0.m0 m0Var) {
            S.this.f13197J = m0Var;
        }

        @Override // g0.InterfaceC2647m
        public void c(C2642h c2642h) {
            this.f13260b.f(c2642h);
        }

        @Override // g0.InterfaceC2647m
        public void d() {
            this.f13260b.c(null);
        }

        @Override // g0.InterfaceC2647m
        public void e(InterfaceC2643i interfaceC2643i) {
            boolean z10;
            S s10 = S.this;
            if (s10.f13193F != null) {
                try {
                    s10.L0(interfaceC2643i, this.f13261c);
                    if (interfaceC2643i != null) {
                        interfaceC2643i.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (interfaceC2643i != null) {
                        try {
                            interfaceC2643i.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (s10.f13250u) {
                AbstractC3583h0.a("Recorder", "Drop video data since recording is stopping.");
                interfaceC2643i.close();
                return;
            }
            InterfaceC2643i interfaceC2643i2 = s10.f13215a0;
            if (interfaceC2643i2 != null) {
                interfaceC2643i2.close();
                S.this.f13215a0 = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!interfaceC2643i.T()) {
                if (z10) {
                    AbstractC3583h0.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                AbstractC3583h0.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                S.this.f13196I.g();
                interfaceC2643i.close();
                return;
            }
            S s11 = S.this;
            s11.f13215a0 = interfaceC2643i;
            if (!s11.Q() || !S.this.f13217b0.isEmpty()) {
                AbstractC3583h0.a("Recorder", "Received video keyframe. Starting muxer...");
                S.this.w0(this.f13261c);
            } else if (z10) {
                AbstractC3583h0.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                AbstractC3583h0.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override // g0.InterfaceC2647m
        public void a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements InterfaceC2647m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f13265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ H0.a f13266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f13267d;

        e(c.a aVar, H0.a aVar2, j jVar) {
            this.f13265b = aVar;
            this.f13266c = aVar2;
            this.f13267d = jVar;
        }

        @Override // g0.InterfaceC2647m
        public void b(g0.m0 m0Var) {
            S.this.f13199L = m0Var;
        }

        @Override // g0.InterfaceC2647m
        public void c(C2642h c2642h) {
            if (S.this.f13219c0 == null) {
                this.f13266c.accept(c2642h);
            }
        }

        @Override // g0.InterfaceC2647m
        public void d() {
            this.f13265b.c(null);
        }

        @Override // g0.InterfaceC2647m
        public void e(InterfaceC2643i interfaceC2643i) {
            S s10 = S.this;
            if (s10.f13200M == h.DISABLED) {
                interfaceC2643i.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            if (s10.f13193F == null) {
                if (s10.f13250u) {
                    AbstractC3583h0.a("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    s10.f13217b0.b(new C2641g(interfaceC2643i));
                    if (S.this.f13215a0 != null) {
                        AbstractC3583h0.a("Recorder", "Received audio data. Starting muxer...");
                        S.this.w0(this.f13267d);
                    } else {
                        AbstractC3583h0.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                interfaceC2643i.close();
                return;
            }
            try {
                s10.K0(interfaceC2643i, this.f13267d);
                if (interfaceC2643i != null) {
                    interfaceC2643i.close();
                }
            } catch (Throwable th) {
                if (interfaceC2643i != null) {
                    try {
                        interfaceC2643i.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // g0.InterfaceC2647m
        public void a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class j implements AutoCloseable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final H.d f13285g = H.d.b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AtomicBoolean f13286h = new AtomicBoolean(false);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final AtomicReference f13287i = new AtomicReference(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final AtomicReference f13288j = new AtomicReference(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final AtomicReference f13289k = new AtomicReference(new H0.a() { // from class: Z.X
            @Override // H0.a
            public final void accept(Object obj) {
                S.j.d((Uri) obj);
            }
        });

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final AtomicBoolean f13290l = new AtomicBoolean(false);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final T0 f13291m = T0.l(Boolean.FALSE);

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f13292a;

            a(Context context) {
                this.f13292a = context;
            }

            @Override // Z.S.j.c
            public c0.n a(AbstractC1834a abstractC1834a, Executor executor) {
                return new c0.n(abstractC1834a, executor, this.f13292a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b implements c {
            b() {
            }

            @Override // Z.S.j.c
            public c0.n a(AbstractC1834a abstractC1834a, Executor executor) {
                return new c0.n(abstractC1834a, executor, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private interface c {
            c0.n a(AbstractC1834a abstractC1834a, Executor executor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        interface d {
            MediaMuxer a(int i10, H0.a aVar);
        }

        j() {
        }

        public static /* synthetic */ MediaMuxer k(AbstractC1579s abstractC1579s, ParcelFileDescriptor parcelFileDescriptor, int i10, H0.a aVar) {
            Uri uri = Uri.EMPTY;
            if (!(abstractC1579s instanceof C1578q)) {
                throw new AssertionError("Invalid output options type: " + abstractC1579s.getClass().getSimpleName());
            }
            File fileD = ((C1578q) abstractC1579s).d();
            if (!AbstractC2690d.a(fileD)) {
                AbstractC3583h0.l("Recorder", "Failed to create folder for " + fileD.getAbsolutePath());
            }
            MediaMuxer mediaMuxer = new MediaMuxer(fileD.getAbsolutePath(), i10);
            aVar.accept(Uri.fromFile(fileD));
            return mediaMuxer;
        }

        private void r(H0.a aVar, Uri uri) {
            if (aVar != null) {
                this.f13285g.a();
                aVar.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        static j s(C1581u c1581u, long j10) {
            C1572k c1572k = new C1572k(c1581u.d(), c1581u.c(), c1581u.b(), c1581u.f(), c1581u.h(), j10);
            c1572k.i0(c1581u.g());
            return c1572k;
        }

        private void t0(y0 y0Var) {
            if ((y0Var instanceof y0.d) || (y0Var instanceof y0.c)) {
                this.f13291m.k(Boolean.TRUE);
            } else if ((y0Var instanceof y0.b) || (y0Var instanceof y0.a)) {
                this.f13291m.k(Boolean.FALSE);
            }
        }

        abstract Executor A();

        abstract H0.a B();

        abstract AbstractC1579s I();

        abstract long J();

        n1 M() {
            return this.f13291m;
        }

        abstract boolean W();

        void X(Context context) {
            if (this.f13286h.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final AbstractC1579s abstractC1579sI = I();
            this.f13285g.c("finalizeRecording");
            final ParcelFileDescriptor parcelFileDescriptor = null;
            this.f13287i.set(new d() { // from class: Z.V
                @Override // Z.S.j.d
                public final MediaMuxer a(int i10, H0.a aVar) {
                    return S.j.k(abstractC1579sI, parcelFileDescriptor, i10, aVar);
                }
            });
            if (W()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f13288j.set(new a(context));
                } else {
                    this.f13288j.set(new b());
                }
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            m(Uri.EMPTY);
        }

        boolean d0() {
            return this.f13290l.get();
        }

        protected void finalize() throws Throwable {
            try {
                this.f13285g.d();
                H0.a aVar = (H0.a) this.f13289k.getAndSet(null);
                if (aVar != null) {
                    r(aVar, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        abstract boolean g0();

        void i0(boolean z10) {
            this.f13290l.set(z10);
        }

        c0.n k0(AbstractC1834a abstractC1834a, Executor executor) {
            if (!W()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c cVar = (c) this.f13288j.getAndSet(null);
            if (cVar != null) {
                return cVar.a(abstractC1834a, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        MediaMuxer l0(int i10, H0.a aVar) throws IOException {
            if (!this.f13286h.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d dVar = (d) this.f13287i.getAndSet(null);
            if (dVar == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return dVar.a(i10, aVar);
            } catch (RuntimeException e10) {
                throw new IOException("Failed to create MediaMuxer by " + e10, e10);
            }
        }

        void m(Uri uri) {
            if (this.f13286h.get()) {
                r((H0.a) this.f13289k.getAndSet(null), uri);
            }
        }

        void u0(y0 y0Var) {
            w0(y0Var, true);
        }

        void w0(final y0 y0Var, boolean z10) {
            if (!Objects.equals(y0Var.c(), I())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + y0Var.c() + ", Expected: " + I() + "]");
            }
            if (z10) {
                String str = "Sending VideoRecordEvent " + y0Var.getClass().getSimpleName();
                if (y0Var instanceof y0.a) {
                    y0.a aVar = (y0.a) y0Var;
                    if (aVar.l()) {
                        str = str + String.format(" [error: %s]", y0.a.h(aVar.j()));
                    }
                }
                AbstractC3583h0.a("Recorder", str);
            }
            t0(y0Var);
            if (A() == null || B() == null) {
                return;
            }
            try {
                A().execute(new Runnable() { // from class: Z.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13318g.B().accept(y0Var);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC3583h0.d("Recorder", "The callback executor is invalid.", e10);
            }
        }

        public static /* synthetic */ void d(Uri uri) {
        }
    }
}
