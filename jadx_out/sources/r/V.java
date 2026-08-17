package r;

import F.AbstractC0481f;
import F.AbstractC0504q0;
import F.C0473c0;
import F.C0486h0;
import F.C1;
import F.E1;
import F.I;
import F.M;
import F.k1;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.concurrent.futures.c;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l1.AbstractC2861a;
import m5.InterfaceFutureC2904a;
import r.InterfaceC3175g2;
import r.V;
import r.X1;
import s.AbstractC3287a;
import s.C3294h;
import t.C3346f;
import v.AbstractC3412c;
import y.AbstractC3583h0;
import y.AbstractC3599t;
import y.C3559D;
import y.C3600u;
import z.InterfaceC3664a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class V implements F.M {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final InterfaceC3664a f31097A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final C0473c0 f31098B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final C3559D f31099C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f31100D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f31101E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f31102F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f31103G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f31104H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private X1 f31105I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final C3208p1 f31106J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final InterfaceC3175g2.b f31107K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Set f31108L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private F.E f31109M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final Object f31110N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f31111O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final C3213r1 f31112P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final s.E f31113Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final C3346f f31114R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final C3171f2 f31115S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final h f31116T;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F.C1 f31117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s.S f31118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f31119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f31120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile i f31121k = i.INITIALIZED;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final F.Q0 f31122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Y0 f31123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C3232y f31124n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j f31125o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final C3153b0 f31126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    CameraDevice f31127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f31128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    InterfaceC3198m1 f31129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final AtomicInteger f31130t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    InterfaceFutureC2904a f31131u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    c.a f31132v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final Map f31133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f31134x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final e f31135y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final f f31136z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC3172g {
        a() {
        }

        @Override // r.InterfaceC3172g
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // r.InterfaceC3172g
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f31138a;

        b(c.a aVar) {
            this.f31138a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            V.this.a0("openCameraConfigAndClose camera closed");
            this.f31138a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            V.this.a0("openCameraConfigAndClose camera disconnected");
            this.f31138a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            V.this.a0("openCameraConfigAndClose camera error " + i10);
            this.f31138a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            V.this.a0("openCameraConfigAndClose camera opened");
            InterfaceFutureC2904a interfaceFutureC2904aX = V.this.X(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            interfaceFutureC2904aX.h(new Runnable() { // from class: r.W
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, V.this.f31119i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3198m1 f31142a;

        d(InterfaceC3198m1 interfaceC3198m1) {
            this.f31142a = interfaceC3198m1;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            if (V.this.f31097A.c() == 2 && V.this.f31121k == i.OPENED) {
                V.this.D0(i.CONFIGURED);
            }
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (th instanceof AbstractC0504q0.a) {
                F.k1 k1VarC0 = V.this.c0(((AbstractC0504q0.a) th).a());
                if (k1VarC0 != null) {
                    V.this.x0(k1VarC0);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                V.this.a0("Unable to configure camera cancelled");
                return;
            }
            i iVar = V.this.f31121k;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                V.this.E0(iVar2, AbstractC3599t.a.b(4, th));
            }
            AbstractC3583h0.d("Camera2CameraImpl", "Unable to configure camera " + V.this, th);
            V v10 = V.this;
            if (v10.f31129s == this.f31142a) {
                v10.B0(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class e extends CameraManager.AvailabilityCallback implements C0473c0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f31145b = true;

        e(String str) {
            this.f31144a = str;
        }

        @Override // F.C0473c0.c
        public void a() {
            if (V.this.f31121k == i.PENDING_OPEN || V.this.f31121k == i.OPENING_WITH_ERROR) {
                V.this.M0(false);
            }
        }

        boolean b() {
            return this.f31145b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f31144a.equals(str)) {
                this.f31145b = true;
                if (V.this.f31121k == i.PENDING_OPEN || V.this.f31121k == i.OPENING_WITH_ERROR) {
                    V.this.M0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f31144a.equals(str)) {
                this.f31145b = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class f implements C0473c0.b {
        f() {
        }

        @Override // F.C0473c0.b
        public void a() {
            if (V.this.f31121k == i.OPENED) {
                V.this.v0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class g implements I.d {
        g() {
        }

        @Override // F.I.d
        public void a() {
            V.this.N0();
        }

        @Override // F.I.d
        public void b(List list) {
            V.this.G0((List) H0.g.g(list));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        OPENING_WITH_ERROR,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f31166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f31167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f31168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ScheduledFuture f31169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f31170e;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f31172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f31173b = -1;

            a(long j10) {
                this.f31172a = j10;
            }

            boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f31173b == -1) {
                    this.f31173b = jUptimeMillis;
                }
                return jUptimeMillis - this.f31173b;
            }

            int c() {
                if (!j.this.f()) {
                    return ReactFontManager.TypefaceStyle.BOLD;
                }
                long jB = b();
                return jB <= 120000 ? ProgressBarContainerView.MAX_PROGRESS : jB <= DataPersistorKt.EXPIRATION_TIME ? 2000 : 4000;
            }

            int d() {
                if (!j.this.f()) {
                    long j10 = this.f31172a;
                    return j10 > 0 ? Math.min((int) j10, ModuleDescriptor.MODULE_VERSION) : ModuleDescriptor.MODULE_VERSION;
                }
                long j11 = this.f31172a;
                if (j11 > 0) {
                    return Math.min((int) j11, 1800000);
                }
                return 1800000;
            }

            void e() {
                this.f31173b = -1L;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b implements Runnable {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f31175g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f31176h = false;

            b(Executor executor) {
                this.f31175g = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                if (bVar.f31176h) {
                    return;
                }
                H0.g.i(V.this.f31121k == i.REOPENING || V.this.f31121k == i.REOPENING_QUIRK);
                if (j.this.f()) {
                    V.this.L0(true);
                } else {
                    V.this.M0(true);
                }
            }

            void b() {
                this.f31176h = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f31175g.execute(new Runnable() { // from class: r.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        V.j.b.a(this.f31197g);
                    }
                });
            }
        }

        j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j10) {
            this.f31166a = executor;
            this.f31167b = scheduledExecutorService;
            this.f31170e = new a(j10);
        }

        private void b(CameraDevice cameraDevice, int i10) {
            H0.g.j(V.this.f31121k == i.OPENING || V.this.f31121k == i.OPENED || V.this.f31121k == i.CONFIGURED || V.this.f31121k == i.REOPENING || V.this.f31121k == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + V.this.f31121k);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                AbstractC3583h0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), V.g0(i10)));
                c(i10);
                return;
            }
            AbstractC3583h0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + V.g0(i10) + " closing camera.");
            V.this.E0(i.CLOSING, AbstractC3599t.a.a(i10 == 3 ? 5 : 6));
            V.this.V(false);
        }

        private void c(int i10) {
            int i11 = 1;
            H0.g.j(V.this.f31128r != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            V.this.E0(i.REOPENING, AbstractC3599t.a.a(i11));
            V.this.V(false);
        }

        boolean a() {
            if (this.f31169d == null) {
                return false;
            }
            V.this.a0("Cancelling scheduled re-open: " + this.f31168c);
            this.f31168c.b();
            this.f31168c = null;
            this.f31169d.cancel(false);
            this.f31169d = null;
            return true;
        }

        void d() {
            this.f31170e.e();
        }

        void e() {
            H0.g.i(this.f31168c == null);
            H0.g.i(this.f31169d == null);
            if (!this.f31170e.a()) {
                AbstractC3583h0.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f31170e.d() + "ms without success.");
                V.this.F0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f31168c = new b(this.f31166a);
            V.this.a0("Attempting camera re-open in " + this.f31170e.c() + "ms: " + this.f31168c + " activeResuming = " + V.this.f31111O);
            this.f31169d = this.f31167b.schedule(this.f31168c, (long) this.f31170e.c(), TimeUnit.MILLISECONDS);
        }

        boolean f() {
            V v10 = V.this;
            if (!v10.f31111O) {
                return false;
            }
            int i10 = v10.f31128r;
            return i10 == 1 || i10 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            V.this.a0("CameraDevice.onClosed()");
            H0.g.j(V.this.f31127q == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = V.this.f31121k.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                H0.g.i(V.this.o0());
                V.this.Y();
                return;
            }
            if (iOrdinal != 6 && iOrdinal != 7) {
                throw new IllegalStateException("Camera closed while in state: " + V.this.f31121k);
            }
            V v10 = V.this;
            if (v10.f31128r == 0) {
                v10.M0(false);
                return;
            }
            v10.a0("Camera closed due to error: " + V.g0(V.this.f31128r));
            e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            V.this.a0("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            V v10 = V.this;
            v10.f31127q = cameraDevice;
            v10.f31128r = i10;
            v10.f31116T.b();
            int iOrdinal = V.this.f31121k.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        AbstractC3583h0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), V.g0(i10), V.this.f31121k.name()));
                        b(cameraDevice, i10);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + V.this.f31121k);
                }
            }
            AbstractC3583h0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), V.g0(i10), V.this.f31121k.name()));
            V.this.V(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            V.this.a0("CameraDevice.onOpened()");
            V v10 = V.this;
            v10.f31127q = cameraDevice;
            v10.f31128r = 0;
            d();
            int iOrdinal = V.this.f31121k.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                H0.g.i(V.this.o0());
                V.this.f31127q.close();
                V.this.f31127q = null;
            } else {
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + V.this.f31121k);
                }
                V.this.D0(i.OPENED);
                C0473c0 c0473c0 = V.this.f31098B;
                String id = cameraDevice.getId();
                V v11 = V.this;
                if (c0473c0.j(id, v11.f31097A.g(v11.f31127q.getId()))) {
                    V.this.v0();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class k {
        k() {
        }

        static k a(String str, Class cls, F.k1 k1Var, F.D1 d12, Size size, F.o1 o1Var, List list) {
            return new C3160d(str, cls, k1Var, d12, size, o1Var, list);
        }

        static k b(y.J0 j02, boolean z10) {
            return a(V.j0(j02), j02.getClass(), z10 ? j02.z() : j02.x(), j02.l(), j02.h(), j02.g(), V.f0(j02));
        }

        abstract List c();

        abstract F.k1 d();

        abstract F.o1 e();

        abstract Size f();

        abstract F.D1 g();

        abstract String h();

        abstract Class i();
    }

    V(Context context, s.S s10, String str, C3153b0 c3153b0, InterfaceC3664a interfaceC3664a, C0473c0 c0473c0, Executor executor, Handler handler, C3213r1 c3213r1, long j10, C3559D c3559d) throws C3600u {
        F.Q0 q02 = new F.Q0();
        this.f31122l = q02;
        this.f31128r = 0;
        this.f31130t = new AtomicInteger(0);
        this.f31133w = new LinkedHashMap();
        this.f31134x = 0;
        this.f31102F = false;
        this.f31103G = false;
        this.f31104H = true;
        this.f31108L = new HashSet();
        this.f31109M = F.H.a();
        this.f31110N = new Object();
        this.f31111O = false;
        this.f31116T = new h(this, null);
        this.f31118h = s10;
        this.f31097A = interfaceC3664a;
        this.f31098B = c0473c0;
        ScheduledExecutorService scheduledExecutorServiceF = I.c.f(handler);
        this.f31120j = scheduledExecutorServiceF;
        Executor executorG = I.c.g(executor);
        this.f31119i = executorG;
        this.f31125o = new j(executorG, scheduledExecutorServiceF, j10);
        this.f31117g = new F.C1(str);
        q02.n(M.a.CLOSED);
        Y0 y02 = new Y0(c0473c0);
        this.f31123m = y02;
        C3208p1 c3208p1 = new C3208p1(executorG);
        this.f31106J = c3208p1;
        this.f31112P = c3213r1;
        this.f31099C = c3559d;
        try {
            s.E eC = s10.c(str);
            this.f31113Q = eC;
            C3232y c3232y = new C3232y(eC, scheduledExecutorServiceF, executorG, new g(), c3153b0.w());
            this.f31124n = c3232y;
            this.f31126p = c3153b0;
            c3153b0.G(c3232y);
            c3153b0.J(y02.a());
            this.f31114R = C3346f.a(eC);
            this.f31129s = q0();
            this.f31107K = new InterfaceC3175g2.b(executorG, scheduledExecutorServiceF, handler, c3208p1, c3153b0.w(), androidx.camera.camera2.internal.compat.quirk.b.c());
            this.f31100D = AbstractC3412c.a(c3153b0.w());
            this.f31101E = c3153b0.w().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f31135y = eVar;
            f fVar = new f();
            this.f31136z = fVar;
            c0473c0.g(this, executorG, fVar, eVar);
            s10.g(executorG, eVar);
            this.f31115S = new C3171f2(context, str, s10, new a(), B.a.f229b);
        } catch (C3294h e10) {
            throw Z0.a(e10);
        }
    }

    public static /* synthetic */ InterfaceFutureC2904a A(C3194l1 c3194l1, AbstractC0504q0 abstractC0504q0, Void r22) {
        c3194l1.close();
        abstractC0504q0.d();
        return c3194l1.c(false);
    }

    private void A0() {
        if (this.f31105I != null) {
            this.f31117g.s(this.f31105I.f() + this.f31105I.hashCode());
            this.f31117g.t(this.f31105I.f() + this.f31105I.hashCode());
            this.f31105I.c();
            this.f31105I = null;
        }
    }

    public static /* synthetic */ void B(V v10, boolean z10) {
        v10.f31111O = z10;
        if (z10) {
            if (v10.f31121k == i.PENDING_OPEN || v10.f31121k == i.OPENING_WITH_ERROR) {
                v10.L0(false);
            }
        }
    }

    private void C0(final String str, final F.k1 k1Var, final F.D1 d12, final F.o1 o1Var, final List list) {
        this.f31119i.execute(new Runnable() { // from class: r.E
            @Override // java.lang.Runnable
            public final void run() {
                V.F(this.f30936g, str, k1Var, d12, o1Var, list);
            }
        });
    }

    public static /* synthetic */ void E(V v10, String str, F.k1 k1Var, F.D1 d12, F.o1 o1Var, List list) {
        v10.getClass();
        v10.a0("Use case " + str + " ACTIVE");
        v10.f31117g.q(str, k1Var, d12, o1Var, list);
        v10.f31117g.u(str, k1Var, d12, o1Var, list);
        v10.N0();
    }

    public static /* synthetic */ void F(V v10, String str, F.k1 k1Var, F.D1 d12, F.o1 o1Var, List list) {
        v10.getClass();
        v10.a0("Use case " + str + " RESET");
        v10.f31117g.u(str, k1Var, d12, o1Var, list);
        v10.T();
        v10.B0(false);
        v10.N0();
        if (v10.f31121k == i.OPENED) {
            v10.v0();
        }
    }

    public static /* synthetic */ Object G(final V v10, final c.a aVar) {
        v10.f31119i.execute(new Runnable() { // from class: r.J
            @Override // java.lang.Runnable
            public final void run() {
                J.n.t(this.f30976g.y0(), aVar);
            }
        });
        return "Release[request=" + v10.f31130t.getAndIncrement() + "]";
    }

    private Collection H0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b((y.J0) it.next(), this.f31104H));
        }
        return arrayList;
    }

    public static /* synthetic */ void I(V v10) {
        v10.a0("Camera is removed. Updating state and cleaning up.");
        i iVar = v10.f31121k;
        i iVar2 = i.RELEASING;
        if (iVar == iVar2 || v10.f31121k == i.RELEASED) {
            return;
        }
        AbstractC3599t.a aVarA = AbstractC3599t.a.a(8);
        v10.f31123m.c(M.a.CLOSED, aVarA);
        v10.E0(iVar2, aVarA);
        v10.f31125o.a();
        v10.f31116T.a();
        if (v10.f31127q != null) {
            v10.V(false);
        } else {
            v10.d0();
        }
    }

    private void J0(Collection collection) {
        Size sizeF;
        boolean zIsEmpty = this.f31117g.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!this.f31117g.o(kVar.h())) {
                this.f31117g.r(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == y.p0.class && (sizeF = kVar.f()) != null) {
                    rational = new Rational(sizeF.getWidth(), sizeF.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a0("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f31124n.k0(true);
            this.f31124n.Y();
        }
        T();
        P0();
        O0();
        N0();
        B0(false);
        if (this.f31121k == i.OPENED) {
            v0();
        } else {
            w0();
        }
        if (rational != null) {
            this.f31124n.n0(rational);
        }
    }

    public static /* synthetic */ void K(V v10, List list) {
        v10.getClass();
        try {
            v10.J0(list);
        } finally {
            v10.f31124n.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (this.f31117g.o(kVar.h())) {
                this.f31117g.p(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == y.p0.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a0("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f31124n.n0(null);
        }
        T();
        if (this.f31117g.i().isEmpty()) {
            this.f31124n.p0(false);
            this.f31124n.m0(false);
        } else {
            P0();
            O0();
        }
        if (this.f31117g.h().isEmpty()) {
            this.f31124n.D();
            B0(false);
            this.f31124n.k0(false);
            this.f31129s = q0();
            W();
            return;
        }
        N0();
        B0(false);
        if (this.f31121k == i.OPENED) {
            v0();
        }
    }

    public static /* synthetic */ Object L(V v10, c.a aVar) {
        H0.g.j(v10.f31132v == null, "Camera can only be released once, so release completer should be null on creation.");
        v10.f31132v = aVar;
        return "Release[camera=" + v10 + "]";
    }

    private void O0() {
        if (this.f31126p.F()) {
            k1.h hVarE = this.f31117g.e();
            if (hVarE.f()) {
                if (((Integer) hVarE.c().e().getUpper()).intValue() > 30) {
                    this.f31124n.m0(true);
                } else {
                    this.f31124n.m0(false);
                }
            }
        }
    }

    private void P0() {
        Iterator it = this.f31117g.i().iterator();
        boolean zY = false;
        while (it.hasNext()) {
            zY |= ((F.D1) it.next()).y(false);
        }
        this.f31124n.p0(zY);
    }

    private void S() {
        X1 x12 = this.f31105I;
        if (x12 != null) {
            String strH0 = h0(x12);
            F.C1 c12 = this.f31117g;
            F.k1 k1VarH = this.f31105I.h();
            F.D1 d1I = this.f31105I.i();
            E1.b bVar = E1.b.METERING_REPEATING;
            c12.r(strH0, k1VarH, d1I, null, Collections.singletonList(bVar));
            this.f31117g.q(strH0, this.f31105I.h(), this.f31105I.i(), null, Collections.singletonList(bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void T() {
        F.k1 k1VarC = this.f31117g.g().c();
        int size = k1VarC.k().i().size();
        int size2 = k1VarC.o().size();
        boolean z10 = false;
        if (l0()) {
            boolean z11 = size != 1 || size2 == 1;
            if (z11 || n0(this.f31105I)) {
                A0();
                if (z11) {
                    z10 = true;
                }
            }
        } else if (size == 0 && size2 > 0) {
            if (this.f31105I == null) {
                this.f31105I = new X1(this.f31126p.C(), this.f31112P, new X1.c() { // from class: r.I
                    @Override // r.X1.c
                    public final void a() {
                        V.v(this.f30972a);
                    }
                });
            }
            if (!n0(this.f31105I)) {
                S();
                z10 = true;
            }
        }
        this.f31124n.l0(z10);
        if (z10) {
            return;
        }
        AbstractC3583h0.c("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
    }

    private boolean U(C0486h0.a aVar) {
        if (!aVar.m().isEmpty()) {
            AbstractC3583h0.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator it = this.f31117g.f().iterator();
        while (it.hasNext()) {
            C0486h0 c0486h0K = ((F.k1) it.next()).k();
            List listI = c0486h0K.i();
            if (!listI.isEmpty()) {
                if (c0486h0K.h() != 0) {
                    aVar.u(c0486h0K.h());
                }
                if (c0486h0K.l() != 0) {
                    aVar.x(c0486h0K.l());
                }
                Iterator it2 = listI.iterator();
                while (it2.hasNext()) {
                    aVar.f((AbstractC0504q0) it2.next());
                }
            }
        }
        if (!aVar.m().isEmpty()) {
            return true;
        }
        AbstractC3583h0.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    private void W() {
        a0("Closing camera.");
        switch (this.f31121k.ordinal()) {
            case 3:
            case 4:
                H0.g.i(this.f31127q == null);
                D0(i.INITIALIZED);
                break;
            case 5:
            default:
                a0("close() ignored due to being in state: " + this.f31121k);
                break;
            case 6:
            case 7:
            case 8:
                if (!this.f31125o.a() && !this.f31116T.c()) {
                    z = false;
                }
                this.f31116T.a();
                D0(i.CLOSING);
                if (z) {
                    H0.g.i(o0());
                    Y();
                }
                break;
            case 9:
            case 10:
                D0(i.CLOSING);
                V(false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceFutureC2904a X(CameraDevice cameraDevice) {
        final C3194l1 c3194l1 = new C3194l1(this.f31114R);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final F.G0 g02 = new F.G0(surface);
        g02.k().h(new Runnable() { // from class: r.L
            @Override // java.lang.Runnable
            public final void run() {
                V.x(surface, surfaceTexture);
            }
        }, I.c.b());
        k1.b bVar = new k1.b();
        bVar.h(g02);
        bVar.B(1);
        a0("Start configAndClose.");
        return J.d.a(J.n.z(c3194l1.a(bVar.p(), cameraDevice, this.f31107K.a()))).e(new J.a() { // from class: r.M
            @Override // J.a
            public final InterfaceFutureC2904a apply(Object obj) {
                return V.A(c3194l1, g02, (Void) obj);
            }
        }, this.f31119i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        H0.g.i(this.f31121k == i.RELEASING || this.f31121k == i.CLOSING);
        H0.g.i(this.f31133w.isEmpty());
        if (!this.f31102F) {
            d0();
            return;
        }
        if (this.f31103G) {
            a0("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f31135y.b()) {
            this.f31102F = false;
            d0();
            a0("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            a0("Open camera to configAndClose");
            InterfaceFutureC2904a interfaceFutureC2904aT0 = t0();
            this.f31103G = true;
            interfaceFutureC2904aT0.h(new Runnable() { // from class: r.O
                @Override // java.lang.Runnable
                public final void run() {
                    V.w(this.f31045g);
                }
            }, this.f31119i);
        }
    }

    private CameraDevice.StateCallback Z() {
        ArrayList arrayList = new ArrayList(this.f31117g.g().c().c());
        arrayList.add(this.f31106J.c());
        arrayList.add(this.f31125o);
        return V0.a(arrayList);
    }

    private void b0(String str, Throwable th) {
        AbstractC3583h0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    private int e0() {
        synchronized (this.f31110N) {
            try {
                return this.f31097A.c() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static List f0(y.J0 j02) {
        if (j02.i() == null) {
            return null;
        }
        return T.g.q0(j02);
    }

    static String g0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String h0(X1 x12) {
        return x12.f() + x12.hashCode();
    }

    private InterfaceFutureC2904a i0() {
        if (this.f31131u == null) {
            if (this.f31121k != i.RELEASED) {
                this.f31131u = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.K
                    @Override // androidx.concurrent.futures.c.InterfaceC0153c
                    public final Object a(c.a aVar) {
                        return V.L(this.f30982a, aVar);
                    }
                });
            } else {
                this.f31131u = J.n.p(null);
            }
        }
        return this.f31131u;
    }

    static String j0(y.J0 j02) {
        return j02.r() + j02.hashCode();
    }

    private boolean l0() {
        X1 x12 = this.f31105I;
        if (x12 == null) {
            return false;
        }
        return this.f31117g.o(h0(x12));
    }

    private boolean m0() {
        C3559D c3559d = this.f31099C;
        return (c3559d == null || c3559d.p0()) ? false : true;
    }

    private boolean n0(X1 x12) {
        H0.g.g(x12);
        return !p0(x12) || m0();
    }

    private boolean p0(X1 x12) {
        ArrayList arrayList = new ArrayList();
        int iE0 = e0();
        for (C1.b bVar : this.f31117g.j()) {
            if (bVar.c() == null || bVar.c().get(0) != E1.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    AbstractC3583h0.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                F.k1 k1VarD = bVar.d();
                F.D1 d1F = bVar.f();
                for (AbstractC0504q0 abstractC0504q0 : k1VarD.o()) {
                    arrayList.add(AbstractC0481f.a(this.f31115S.a0(iE0, d1F.r(), abstractC0504q0.h(), d1F.F()), d1F.r(), abstractC0504q0.h(), bVar.e().b(), bVar.c(), bVar.e().d(), bVar.e().g(), bVar.e().c(), d1F.S()));
                }
            }
        }
        H0.g.g(x12);
        HashMap map = new HashMap();
        map.put(x12.i(), Collections.singletonList(x12.e()));
        try {
            this.f31115S.K(iE0, arrayList, map, false, false, false, false);
            a0("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e10) {
            b0("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    private InterfaceC3198m1 q0() {
        C3194l1 c3194l1;
        synchronized (this.f31110N) {
            C3559D c3559d = this.f31099C;
            if (c3559d != null) {
                x.j.a(c3559d);
            }
            c3194l1 = new C3194l1(this.f31114R, this.f31126p.w(), null);
        }
        return c3194l1;
    }

    private void r0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y.J0 j02 = (y.J0) it.next();
            String strJ0 = j0(j02);
            if (!this.f31108L.contains(strJ0)) {
                this.f31108L.add(strJ0);
                j02.R();
                j02.P();
            }
        }
    }

    private void s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y.J0 j02 = (y.J0) it.next();
            String strJ0 = j0(j02);
            if (this.f31108L.contains(strJ0)) {
                j02.S();
                this.f31108L.remove(strJ0);
            }
        }
    }

    public static /* synthetic */ Object t(V v10, c.a aVar) {
        v10.getClass();
        try {
            ArrayList arrayList = new ArrayList(v10.f31117g.g().c().c());
            arrayList.add(v10.f31106J.c());
            arrayList.add(v10.new b(aVar));
            v10.f31118h.f(v10.f31126p.f(), v10.f31119i, V0.a(arrayList));
            return "configAndCloseTask";
        } catch (RuntimeException | C3294h e10) {
            v10.b0("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
            aVar.f(e10);
            return "configAndCloseTask";
        }
    }

    private InterfaceFutureC2904a t0() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.H
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return V.t(this.f30967a, aVar);
            }
        });
    }

    public static /* synthetic */ Object u(final V v10, final c.a aVar) {
        v10.getClass();
        try {
            v10.f31119i.execute(new Runnable() { // from class: r.N
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f31037g.l0()));
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    private void u0(boolean z10) {
        if (!z10) {
            this.f31125o.d();
        }
        this.f31125o.a();
        this.f31116T.a();
        a0("Opening camera.");
        D0(i.OPENING);
        try {
            this.f31118h.f(this.f31126p.f(), this.f31119i, Z());
        } catch (SecurityException e10) {
            a0("Unable to open camera due to " + e10.getMessage());
            D0(i.REOPENING);
            this.f31125o.e();
        } catch (RuntimeException e11) {
            b0("Unexpected error occurred when opening camera.", e11);
            E0(i.OPENING_WITH_ERROR, AbstractC3599t.a.a(6));
        } catch (C3294h e12) {
            a0("Unable to open camera due to " + e12.getMessage());
            if (e12.d() != 10001) {
                this.f31116T.d();
            } else {
                E0(i.INITIALIZED, AbstractC3599t.a.b(7, e12));
            }
        }
    }

    public static /* synthetic */ void v(V v10) {
        if (v10.k0()) {
            v10.C0(h0(v10.f31105I), v10.f31105I.h(), v10.f31105I.i(), null, Collections.singletonList(E1.b.METERING_REPEATING));
        }
    }

    public static /* synthetic */ void w(V v10) {
        v10.f31103G = false;
        v10.f31102F = false;
        v10.a0("OpenCameraConfigAndClose is done, state: " + v10.f31121k);
        int iOrdinal = v10.f31121k.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            H0.g.i(v10.o0());
            v10.d0();
            return;
        }
        if (iOrdinal != 7) {
            v10.a0("OpenCameraConfigAndClose finished while in state: " + v10.f31121k);
            return;
        }
        if (v10.f31128r == 0) {
            v10.M0(false);
            return;
        }
        v10.a0("OpenCameraConfigAndClose in error: " + g0(v10.f31128r));
        v10.f31125o.e();
    }

    private void w0() {
        int iOrdinal = this.f31121k.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            L0(false);
            return;
        }
        if (iOrdinal != 5) {
            a0("open() ignored due to being in state: " + this.f31121k);
            return;
        }
        D0(i.REOPENING);
        if (o0() || this.f31103G || this.f31128r != 0) {
            return;
        }
        H0.g.j(this.f31127q != null, "Camera Device should be open if session close is not complete");
        D0(i.OPENED);
        v0();
    }

    public static /* synthetic */ void x(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void y(V v10, String str) {
        v10.getClass();
        v10.a0("Use case " + str + " INACTIVE");
        v10.f31117g.t(str);
        v10.N0();
    }

    private InterfaceFutureC2904a y0() {
        InterfaceFutureC2904a interfaceFutureC2904aI0 = i0();
        switch (this.f31121k.ordinal()) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!this.f31125o.a() && !this.f31116T.c()) {
                    z = false;
                }
                this.f31116T.a();
                D0(i.RELEASING);
                if (z) {
                    H0.g.i(o0());
                    Y();
                }
                break;
            case 2:
            case 3:
            case 4:
                H0.g.i(this.f31127q == null);
                D0(i.RELEASING);
                H0.g.i(o0());
                Y();
                break;
            case 9:
            case 10:
                D0(i.RELEASING);
                V(false);
                break;
            default:
                a0("release() ignored due to being in state: " + this.f31121k);
                break;
        }
        return interfaceFutureC2904aI0;
    }

    public static /* synthetic */ void z(V v10, String str, F.k1 k1Var, F.D1 d12, F.o1 o1Var, List list) {
        v10.getClass();
        v10.a0("Use case " + str + " UPDATED");
        v10.f31117g.u(str, k1Var, d12, o1Var, list);
        v10.N0();
    }

    void B0(boolean z10) {
        H0.g.i(this.f31129s != null);
        a0("Resetting Capture Session");
        InterfaceC3198m1 interfaceC3198m1 = this.f31129s;
        F.k1 k1VarF = interfaceC3198m1.f();
        List listD = interfaceC3198m1.d();
        InterfaceC3198m1 interfaceC3198m1Q0 = q0();
        this.f31129s = interfaceC3198m1Q0;
        interfaceC3198m1Q0.g(k1VarF);
        this.f31129s.e(listD);
        if (this.f31121k.ordinal() != 9) {
            a0("Skipping Capture Session state check due to current camera state: " + this.f31121k + " and previous session status: " + interfaceC3198m1.h());
        } else if (this.f31100D && interfaceC3198m1.h()) {
            a0("Close camera before creating new session");
            D0(i.REOPENING_QUIRK);
        }
        if (this.f31101E && interfaceC3198m1.h()) {
            a0("ConfigAndClose is required when close the camera.");
            this.f31102F = true;
        }
        z0(interfaceC3198m1, z10);
    }

    void D0(i iVar) {
        E0(iVar, null);
    }

    void E0(i iVar, AbstractC3599t.a aVar) {
        F0(iVar, aVar, true);
    }

    void F0(i iVar, AbstractC3599t.a aVar, boolean z10) {
        M.a aVar2;
        a0("Transitioning camera internal state: " + this.f31121k + " --> " + iVar);
        I0(iVar, aVar);
        this.f31121k = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = M.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = M.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = M.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = M.a.PENDING_OPEN;
                break;
            case OPENING_WITH_ERROR:
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = M.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = M.a.OPENING;
                break;
            case OPENED:
                aVar2 = M.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = M.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f31098B.e(this, aVar2, z10);
        this.f31122l.n(aVar2);
        this.f31123m.c(aVar2, aVar);
    }

    void G0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0486h0 c0486h0 = (C0486h0) it.next();
            C0486h0.a aVarK = C0486h0.a.k(c0486h0);
            if (c0486h0.k() == 5 && c0486h0.d() != null) {
                aVarK.p(c0486h0.d());
            }
            if (!c0486h0.i().isEmpty() || !c0486h0.m() || U(aVarK)) {
                arrayList.add(aVarK.h());
            }
        }
        a0("Issue capture request");
        this.f31129s.e(arrayList);
    }

    void I0(i iVar, AbstractC3599t.a aVar) {
        if (AbstractC2861a.h()) {
            AbstractC2861a.j("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f31134x++;
            }
            if (this.f31134x > 0) {
                AbstractC2861a.j("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    void L0(boolean z10) {
        a0("Attempting to force open the camera.");
        if (this.f31098B.i(this)) {
            u0(z10);
        } else {
            a0("No cameras available. Waiting for available camera before opening camera.");
            D0(i.PENDING_OPEN);
        }
    }

    void M0(boolean z10) {
        a0("Attempting to open the camera.");
        if (this.f31135y.b() && this.f31098B.i(this)) {
            u0(z10);
        } else {
            a0("No cameras available. Waiting for available camera before opening camera.");
            D0(i.PENDING_OPEN);
        }
    }

    void N0() {
        k1.h hVarE = this.f31117g.e();
        if (!hVarE.f()) {
            this.f31124n.j0();
            this.f31129s.g(this.f31124n.O());
            return;
        }
        this.f31124n.o0(hVarE.c().p());
        hVarE.b(this.f31124n.O());
        this.f31129s.g(hVarE.c());
    }

    void V(boolean z10) {
        H0.g.j(this.f31121k == i.CLOSING || this.f31121k == i.RELEASING || (this.f31121k == i.REOPENING && this.f31128r != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f31121k + " (error: " + g0(this.f31128r) + ")");
        B0(z10);
        this.f31129s.b();
    }

    @Override // F.M
    public InterfaceFutureC2904a a() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.U
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return V.G(this.f31084a, aVar);
            }
        });
    }

    void a0(String str) {
        b0(str, null);
    }

    @Override // F.M
    public F.V0 c() {
        return this.f31122l;
    }

    F.k1 c0(AbstractC0504q0 abstractC0504q0) {
        for (F.k1 k1Var : this.f31117g.h()) {
            if (k1Var.o().contains(abstractC0504q0)) {
                return k1Var;
            }
        }
        return null;
    }

    void d0() {
        H0.g.i(this.f31121k == i.RELEASING || this.f31121k == i.CLOSING);
        H0.g.i(this.f31133w.isEmpty());
        this.f31127q = null;
        if (this.f31121k == i.CLOSING) {
            D0(i.INITIALIZED);
            return;
        }
        this.f31118h.h(this.f31135y);
        D0(i.RELEASED);
        c.a aVar = this.f31132v;
        if (aVar != null) {
            aVar.c(null);
            this.f31132v = null;
        }
    }

    @Override // y.J0.c
    public void e(y.J0 j02) {
        H0.g.g(j02);
        final String strJ0 = j0(j02);
        this.f31119i.execute(new Runnable() { // from class: r.S
            @Override // java.lang.Runnable
            public final void run() {
                V.y(this.f31072g, strJ0);
            }
        });
    }

    @Override // y.J0.c
    public void g(y.J0 j02) {
        H0.g.g(j02);
        C0(j0(j02), this.f31104H ? j02.z() : j02.x(), j02.l(), j02.g(), f0(j02));
    }

    @Override // F.M
    public F.I h() {
        return this.f31124n;
    }

    @Override // F.M
    public F.E i() {
        return this.f31109M;
    }

    @Override // F.M
    public void j(final boolean z10) {
        this.f31119i.execute(new Runnable() { // from class: r.F
            @Override // java.lang.Runnable
            public final void run() {
                V.B(this.f30954g, z10);
            }
        });
    }

    @Override // y.J0.c
    public void k(y.J0 j02) {
        H0.g.g(j02);
        final String strJ0 = j0(j02);
        final F.k1 k1VarZ = this.f31104H ? j02.z() : j02.x();
        final F.D1 d1L = j02.l();
        final F.o1 o1VarG = j02.g();
        final List listF0 = f0(j02);
        this.f31119i.execute(new Runnable() { // from class: r.Q
            @Override // java.lang.Runnable
            public final void run() {
                V.z(this.f31058g, strJ0, k1VarZ, d1L, o1VarG, listF0);
            }
        });
    }

    boolean k0() {
        try {
            return ((Boolean) androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.B
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return V.u(this.f30915a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    @Override // F.M
    public void l(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f31124n.Y();
        r0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(H0(arrayList));
        try {
            this.f31119i.execute(new Runnable() { // from class: r.P
                @Override // java.lang.Runnable
                public final void run() {
                    V.K(this.f31048g, arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            b0("Unable to attach use cases.", e10);
            this.f31124n.D();
        }
    }

    @Override // F.M
    public void m(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(H0(arrayList));
        s0(new ArrayList(arrayList));
        this.f31119i.execute(new Runnable() { // from class: r.D
            @Override // java.lang.Runnable
            public final void run() {
                this.f30929g.K0(arrayList2);
            }
        });
    }

    @Override // F.M
    public void n() {
        this.f31119i.execute(new Runnable() { // from class: r.G
            @Override // java.lang.Runnable
            public final void run() {
                V.I(this.f30962g);
            }
        });
    }

    boolean o0() {
        return this.f31133w.isEmpty();
    }

    @Override // F.M
    public void p(boolean z10) {
        this.f31104H = z10;
    }

    @Override // F.M
    public void q(F.E e10) {
        if (e10 == null) {
            e10 = F.H.a();
        }
        e10.R(null);
        this.f31109M = e10;
        synchronized (this.f31110N) {
        }
    }

    @Override // F.M
    public F.L r() {
        return this.f31126p;
    }

    @Override // y.J0.c
    public void s(y.J0 j02) {
        H0.g.g(j02);
        final String strJ0 = j0(j02);
        final F.k1 k1VarZ = this.f31104H ? j02.z() : j02.x();
        final F.D1 d1L = j02.l();
        final F.o1 o1VarG = j02.g();
        final List listF0 = f0(j02);
        this.f31119i.execute(new Runnable() { // from class: r.T
            @Override // java.lang.Runnable
            public final void run() {
                V.E(this.f31075g, strJ0, k1VarZ, d1L, o1VarG, listF0);
            }
        });
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f31126p.f());
    }

    void v0() {
        H0.g.i(this.f31121k == i.OPENED);
        k1.h hVarG = this.f31117g.g();
        if (!hVarG.f()) {
            a0("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f31098B.j(this.f31127q.getId(), this.f31097A.g(this.f31127q.getId()))) {
            a0("Unable to create capture session in camera operating mode = " + this.f31097A.c());
            return;
        }
        HashMap map = new HashMap();
        C3155b2.m(this.f31117g.h(), this.f31117g.i(), map);
        this.f31129s.i(map);
        InterfaceC3198m1 interfaceC3198m1 = this.f31129s;
        J.n.j(interfaceC3198m1.a(hVarG.c(), (CameraDevice) H0.g.g(this.f31127q), this.f31107K.a()), new d(interfaceC3198m1), this.f31119i);
    }

    void x0(final F.k1 k1Var) {
        ScheduledExecutorService scheduledExecutorServiceE = I.c.e();
        final k1.d dVarD = k1Var.d();
        if (dVarD != null) {
            b0("Posting surface closed", new Throwable());
            scheduledExecutorServiceE.execute(new Runnable() { // from class: r.C
                @Override // java.lang.Runnable
                public final void run() {
                    dVarD.a(k1Var, k1.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    InterfaceFutureC2904a z0(InterfaceC3198m1 interfaceC3198m1, boolean z10) {
        interfaceC3198m1.close();
        InterfaceFutureC2904a interfaceFutureC2904aC = interfaceC3198m1.c(z10);
        a0("Releasing session in state " + this.f31121k.name());
        this.f31133w.put(interfaceC3198m1, interfaceFutureC2904aC);
        J.n.j(interfaceFutureC2904aC, new c(interfaceC3198m1), I.c.b());
        return interfaceFutureC2904aC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f31149a;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ScheduledFuture f31151a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final AtomicBoolean f31152b = new AtomicBoolean(false);

            a() {
                this.f31151a = V.this.f31120j.schedule(new Runnable() { // from class: r.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31181g.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d() {
                if (this.f31152b.getAndSet(true)) {
                    return;
                }
                V.this.f31119i.execute(new Runnable() { // from class: r.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31193g.e();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void e() {
                if (V.this.f31121k == i.OPENING) {
                    V.this.a0("Camera onError timeout, reopen it.");
                    V.this.D0(i.REOPENING);
                    V.this.f31125o.e();
                } else {
                    V.this.a0("Camera skip reopen at state: " + V.this.f31121k);
                }
            }

            public void c() {
                this.f31152b.set(true);
                this.f31151a.cancel(true);
            }

            public boolean f() {
                return this.f31152b.get();
            }
        }

        private h() {
            this.f31149a = null;
        }

        public void a() {
            a aVar = this.f31149a;
            if (aVar != null) {
                aVar.c();
            }
            this.f31149a = null;
        }

        public void b() {
            V.this.a0("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f31149a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (V.this.f31121k != i.OPENING) {
                V.this.a0("Don't need the onError timeout handler.");
                return;
            }
            V.this.a0("Camera waiting for onError.");
            a();
            this.f31149a = new a();
        }

        /* synthetic */ h(V v10, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3198m1 f31140a;

        c(InterfaceC3198m1 interfaceC3198m1) {
            this.f31140a = interfaceC3198m1;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            V.this.f31133w.remove(this.f31140a);
            int iOrdinal = V.this.f31121k.ordinal();
            if (iOrdinal != 1 && iOrdinal != 5) {
                if (iOrdinal != 6 && (iOrdinal != 7 || V.this.f31128r == 0)) {
                    return;
                } else {
                    V.this.a0("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (V.this.o0()) {
                V v10 = V.this;
                if (v10.f31127q != null) {
                    v10.a0("closing camera");
                    AbstractC3287a.a(V.this.f31127q);
                    V.this.f31127q = null;
                }
            }
        }

        @Override // J.c
        public void onFailure(Throwable th) {
        }
    }
}
