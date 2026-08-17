package y;

import F.C0474c1;
import F.E1;
import F.InterfaceC0490j0;
import F.J;
import F.K;
import F.R0;
import F.S0;
import F.X0;
import android.os.Handler;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: y.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3559D implements K.q {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    static final InterfaceC0490j0.a f33616Q = InterfaceC0490j0.a.a("camerax.core.appConfig.cameraFactoryProvider", K.a.class);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    static final InterfaceC0490j0.a f33617R = InterfaceC0490j0.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", J.a.class);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    static final InterfaceC0490j0.a f33618S = InterfaceC0490j0.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", E1.c.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    static final InterfaceC0490j0.a f33619T = InterfaceC0490j0.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    static final InterfaceC0490j0.a f33620U = InterfaceC0490j0.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    static final InterfaceC0490j0.a f33621V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    static final InterfaceC0490j0.a f33622W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    static final InterfaceC0490j0.a f33623X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    static final InterfaceC0490j0.a f33624Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final InterfaceC0490j0.a f33625Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final InterfaceC0490j0.a f33626a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final InterfaceC0490j0.a f33627b0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final X0 f33628P;

    /* JADX INFO: renamed from: y.D$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S0 f33629a;

        public a() {
            this(S0.i0());
        }

        public C3559D a() {
            return new C3559D(X0.h0(this.f33629a));
        }

        public R0 b() {
            return this.f33629a;
        }

        public a c(K.a aVar) {
            b().X(C3559D.f33616Q, aVar);
            return this;
        }

        public a d(int i10) {
            b().X(C3559D.f33626a0, Integer.valueOf(i10));
            return this;
        }

        public a e(J.a aVar) {
            b().X(C3559D.f33617R, aVar);
            return this;
        }

        public a f(boolean z10) {
            b().X(C3559D.f33627b0, Boolean.valueOf(z10));
            return this;
        }

        public a g(Class cls) {
            b().X(K.q.f7019N, cls);
            if (b().f(K.q.f7018M, null) == null) {
                h(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a h(String str) {
            b().X(K.q.f7018M, str);
            return this;
        }

        public a i(E1.c cVar) {
            b().X(C3559D.f33618S, cVar);
            return this;
        }

        private a(S0 s02) {
            this.f33629a = s02;
            Class cls = (Class) s02.f(K.q.f7019N, null);
            if (cls == null || cls.equals(C3558C.class)) {
                g(C3558C.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: renamed from: y.D$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        C3559D getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        f33621V = InterfaceC0490j0.a.a("camerax.core.appConfig.minimumLoggingLevel", cls);
        f33622W = InterfaceC0490j0.a.a("camerax.core.appConfig.availableCamerasLimiter", C3598s.class);
        f33623X = InterfaceC0490j0.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);
        f33624Y = InterfaceC0490j0.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", r0.class);
        f33625Z = InterfaceC0490j0.a.a("camerax.core.appConfig.quirksSettings", C0474c1.class);
        f33626a0 = InterfaceC0490j0.a.a("camerax.core.appConfig.configImplType", cls);
        f33627b0 = InterfaceC0490j0.a.a("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE);
    }

    C3559D(X0 x02) {
        this.f33628P = x02;
    }

    public C3598s f0(C3598s c3598s) {
        return (C3598s) this.f33628P.f(f33622W, c3598s);
    }

    public Executor g0(Executor executor) {
        return (Executor) this.f33628P.f(f33619T, executor);
    }

    public K.a h0(K.a aVar) {
        return (K.a) this.f33628P.f(f33616Q, aVar);
    }

    public long i0() {
        return ((Long) this.f33628P.f(f33623X, -1L)).longValue();
    }

    public r0 j0() {
        r0 r0Var = (r0) this.f33628P.f(f33624Y, r0.f33834b);
        Objects.requireNonNull(r0Var);
        return r0Var;
    }

    public int k0() {
        return ((Integer) this.f33628P.f(f33626a0, -1)).intValue();
    }

    public J.a l0(J.a aVar) {
        return (J.a) this.f33628P.f(f33617R, aVar);
    }

    public C0474c1 m0() {
        return (C0474c1) this.f33628P.f(f33625Z, null);
    }

    public Handler n0(Handler handler) {
        return (Handler) this.f33628P.f(f33620U, handler);
    }

    @Override // F.h1
    public InterfaceC0490j0 o() {
        return this.f33628P;
    }

    public E1.c o0(E1.c cVar) {
        return (E1.c) this.f33628P.f(f33618S, cVar);
    }

    public boolean p0() {
        return ((Boolean) this.f33628P.f(f33627b0, Boolean.TRUE)).booleanValue();
    }
}
