package r;

import F.C0486h0;
import F.C0508t;
import F.I;
import F.InterfaceC0490j0;
import F.k1;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import m5.InterfaceFutureC2904a;
import q.C3091a;
import r.C3232y;
import v.C3410a;
import x.C3510g;
import x.l;
import y.AbstractC3583h0;
import y.C3565J;
import y.InterfaceC3586j;
import y.V;

/* JADX INFO: renamed from: r.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3232y implements F.I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f31546A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f31547B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final a f31548C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f31549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Executor f31550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f31551d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s.E f31552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I.d f31553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k1.b f31554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final K1 f31555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E2 f31556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x2 f31557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final U1 f31558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C3219t1 f31559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    G2 f31560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C3510g f31561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C3177h0 f31562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final B2 f31563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f31564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private V.i f31565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile int f31566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile int f31567t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile boolean f31568u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile int f31569v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C3410a f31570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f31571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicLong f31572y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile InterfaceFutureC2904a f31573z;

    /* JADX INFO: renamed from: r.y$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends F.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Set f31574a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Map f31575b = new ArrayMap();

        a() {
        }

        @Override // F.r
        public void a(final int i10) {
            for (final F.r rVar : this.f31574a) {
                try {
                    ((Executor) this.f31575b.get(rVar)).execute(new Runnable() { // from class: r.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            rVar.a(i10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC3583h0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // F.r
        public void b(final int i10, final F.B b10) {
            for (final F.r rVar : this.f31574a) {
                try {
                    ((Executor) this.f31575b.get(rVar)).execute(new Runnable() { // from class: r.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            rVar.b(i10, b10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC3583h0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // F.r
        public void c(final int i10, final C0508t c0508t) {
            for (final F.r rVar : this.f31574a) {
                try {
                    ((Executor) this.f31575b.get(rVar)).execute(new Runnable() { // from class: r.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            rVar.c(i10, c0508t);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC3583h0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void h(Executor executor, F.r rVar) {
            this.f31574a.add(rVar);
            this.f31575b.put(rVar, executor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void i(F.r rVar) {
            this.f31574a.remove(rVar);
            this.f31575b.remove(rVar);
        }
    }

    /* JADX INFO: renamed from: r.y$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set f31576a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f31577b;

        b(Executor executor) {
            this.f31577b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f31576a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f31576a.removeAll(hashSet);
        }

        void b(c cVar) {
            this.f31576a.add(cVar);
        }

        void c(c cVar) {
            this.f31576a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f31577b.execute(new Runnable() { // from class: r.z
                @Override // java.lang.Runnable
                public final void run() {
                    C3232y.b.a(this.f31582g, totalCaptureResult);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r.y$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    C3232y(s.E e10, ScheduledExecutorService scheduledExecutorService, Executor executor, I.d dVar, F.g1 g1Var) {
        k1.b bVar = new k1.b();
        this.f31554g = bVar;
        this.f31564q = 0;
        this.f31566s = 0;
        this.f31568u = false;
        this.f31569v = 2;
        this.f31571x = true;
        this.f31572y = new AtomicLong(0L);
        this.f31573z = J.n.p(null);
        this.f31546A = 1;
        this.f31547B = 0L;
        a aVar = new a();
        this.f31548C = aVar;
        this.f31552e = e10;
        this.f31553f = dVar;
        this.f31550c = executor;
        this.f31563p = new B2(executor);
        b bVar2 = new b(executor);
        this.f31549b = bVar2;
        bVar.B(this.f31546A);
        bVar.j(C3154b1.e(bVar2));
        bVar.j(aVar);
        this.f31559l = new C3219t1(this, e10, executor);
        this.f31555h = new K1(this, scheduledExecutorService, executor, g1Var);
        this.f31556i = new E2(this, e10, executor);
        this.f31557j = new x2(this, e10, executor);
        this.f31567t = e10.c();
        this.f31558k = new U1(this, e10, executor);
        this.f31560m = new K2(e10, executor);
        this.f31570w = new C3410a(g1Var);
        this.f31561n = new C3510g(this, executor);
        this.f31562o = new C3177h0(this, e10, g1Var, executor, scheduledExecutorService);
    }

    public static /* synthetic */ boolean A(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!e0(totalCaptureResult, j10)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public static int R(s.E e10, int i10) {
        int[] iArr = (int[]) e10.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return c0(i10, iArr) ? i10 : c0(1, iArr) ? 1 : 0;
    }

    private int T(int i10) {
        int[] iArr = (int[]) this.f31552e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return c0(i10, iArr) ? i10 : c0(1, iArr) ? 1 : 0;
    }

    private boolean Z() {
        return V() > 0;
    }

    private static boolean c0(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    private boolean d0() {
        try {
            return ((Boolean) androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.p
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C3232y.p(this.f31448a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if repeating request is available.", e10);
        }
    }

    static boolean e0(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof F.u1) && (l10 = (Long) ((F.u1) tag).d("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    private void i0() {
        C0486h0.a aVar = new C0486h0.a();
        aVar.v(this.f31546A);
        aVar.w(true);
        C3091a.C0345a c0345a = new C3091a.C0345a();
        c0345a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(1)));
        c0345a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0345a.a());
        q0(Collections.singletonList(aVar.h()));
    }

    public static /* synthetic */ Object p(final C3232y c3232y, final c.a aVar) {
        c3232y.getClass();
        try {
            c3232y.f31550c.execute(new Runnable() { // from class: r.k
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f31366g.f31571x));
                }
            });
            return "isRepeatingRequestAvailable";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
            return "isRepeatingRequestAvailable";
        }
    }

    private InterfaceFutureC2904a t0(final long j10) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.l
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return C3232y.v(this.f31373a, j10, aVar);
            }
        });
    }

    public static /* synthetic */ Object v(C3232y c3232y, final long j10, final c.a aVar) {
        c3232y.getClass();
        c3232y.B(new c() { // from class: r.m
            @Override // r.C3232y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C3232y.A(j10, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    public static /* synthetic */ Object x(final C3232y c3232y, final c.a aVar) {
        c3232y.f31550c.execute(new Runnable() { // from class: r.j
            @Override // java.lang.Runnable
            public final void run() {
                C3232y c3232y2 = this.f31361g;
                J.n.t(c3232y2.t0(c3232y2.s0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    void B(c cVar) {
        this.f31549b.b(cVar);
    }

    void C(final Executor executor, final F.r rVar) {
        this.f31550c.execute(new Runnable() { // from class: r.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f31460g.f31548C.h(executor, rVar);
            }
        });
    }

    void D() {
        synchronized (this.f31551d) {
            try {
                int i10 = this.f31564q;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f31564q = i10 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void E(boolean z10) {
        if (this.f31568u == z10) {
            return;
        }
        if (z10 && f0()) {
            i0();
            this.f31566s = 0;
            this.f31557j.f();
        }
        this.f31568u = z10;
        s0();
    }

    void F(int i10) {
        if (this.f31568u) {
            return;
        }
        this.f31566s = i10;
        if (i10 == 0) {
            i0();
        }
        s0();
    }

    Rect G() {
        return this.f31556i.e();
    }

    public int H() {
        return this.f31569v;
    }

    public K1 I() {
        return this.f31555h;
    }

    public U1 J() {
        return this.f31558k;
    }

    int K() {
        Integer num = (Integer) this.f31552e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int L() {
        Integer num = (Integer) this.f31552e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int M() {
        Integer num = (Integer) this.f31552e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public V.i N() {
        return this.f31565r;
    }

    public F.k1 O() {
        this.f31554g.B(this.f31546A);
        this.f31554g.w(P());
        this.f31554g.o("CameraControlSessionUpdateId", Long.valueOf(this.f31547B));
        return this.f31554g.p();
    }

    InterfaceC0490j0 P() {
        C3091a.C0345a c0345a = new C3091a.C0345a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        InterfaceC0490j0.c cVar = InterfaceC0490j0.c.REQUIRED;
        c0345a.g(key, 1, cVar);
        this.f31555h.p(c0345a);
        this.f31556i.c(c0345a);
        int iA = this.f31555h.J() ? 5 : 1;
        if (this.f31568u) {
            iA = 6;
        } else if (f0()) {
            c0345a.g(CaptureRequest.FLASH_MODE, 2, cVar);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.f31566s == 1) {
                    c0345a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f31567t), cVar);
                } else if (this.f31566s == 2) {
                    c0345a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f31552e.c()), cVar);
                }
            }
        } else {
            int i10 = this.f31569v;
            if (i10 == 0) {
                iA = this.f31570w.a(2);
            } else if (i10 == 1) {
                iA = 3;
            } else if (i10 == 2) {
                iA = 1;
            }
        }
        c0345a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(iA)), cVar);
        c0345a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(T(1)), cVar);
        this.f31559l.c(c0345a);
        this.f31561n.i(c0345a);
        return c0345a.a();
    }

    int Q(int i10) {
        return R(this.f31552e, i10);
    }

    int S(int i10) {
        int[] iArr = (int[]) this.f31552e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (c0(i10, iArr)) {
            return i10;
        }
        if (c0(4, iArr)) {
            return 4;
        }
        return c0(1, iArr) ? 1 : 0;
    }

    public x2 U() {
        return this.f31557j;
    }

    int V() {
        int i10;
        synchronized (this.f31551d) {
            i10 = this.f31564q;
        }
        return i10;
    }

    public E2 W() {
        return this.f31556i;
    }

    public G2 X() {
        return this.f31560m;
    }

    void Y() {
        synchronized (this.f31551d) {
            this.f31564q++;
        }
    }

    @Override // F.I
    public void a() {
        this.f31560m.a();
    }

    public boolean a0() {
        int iE = this.f31563p.e();
        AbstractC3583h0.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iE);
        return iE > 0;
    }

    @Override // F.I
    public void b(k1.b bVar) {
        this.f31560m.b(bVar);
    }

    boolean b0() {
        return this.f31568u;
    }

    @Override // F.I
    public void c(V.i iVar) {
        this.f31565r = iVar;
    }

    @Override // F.I
    public void d() {
        this.f31563p.c();
    }

    @Override // F.I
    public InterfaceFutureC2904a e(final List list, final int i10, final int i11) {
        if (Z()) {
            final int iH = H();
            return J.d.a(J.n.s(this.f31573z)).e(new J.a() { // from class: r.n
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return this.f31431a.f31562o.h(list, i10, iH, i11);
                }
            }, this.f31550c);
        }
        AbstractC3583h0.l("Camera2CameraControlImp", "Camera is not active.");
        return J.n.n(new InterfaceC3586j.a("Camera is not active."));
    }

    @Override // y.InterfaceC3586j
    public InterfaceFutureC2904a f() {
        return !Z() ? J.n.n(new InterfaceC3586j.a("Camera is not active.")) : !d0() ? J.n.n(new InterfaceC3586j.a("Repeating request is not available possibly because it's disable for the ImageCapture.")) : J.n.s(this.f31555h.r());
    }

    boolean f0() {
        return this.f31566s != 0;
    }

    @Override // y.InterfaceC3586j
    public InterfaceFutureC2904a g(float f10) {
        return !Z() ? J.n.n(new InterfaceC3586j.a("Camera is not active.")) : J.n.s(this.f31556i.k(f10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(c cVar) {
        this.f31549b.c(cVar);
    }

    @Override // F.I
    public void h(int i10) {
        if (!Z()) {
            AbstractC3583h0.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f31569v = i10;
        AbstractC3583h0.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f31569v);
        G2 g22 = this.f31560m;
        boolean z10 = true;
        if (this.f31569v != 1 && this.f31569v != 0) {
            z10 = false;
        }
        g22.e(z10);
        this.f31573z = r0();
    }

    void h0(final F.r rVar) {
        this.f31550c.execute(new Runnable() { // from class: r.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f31488g.f31548C.i(rVar);
            }
        });
    }

    @Override // y.InterfaceC3586j
    public InterfaceFutureC2904a i(C3565J c3565j) {
        return !Z() ? J.n.n(new InterfaceC3586j.a("Camera is not active.")) : !d0() ? J.n.n(new InterfaceC3586j.a("Repeating request is not available possibly because it's disable for the ImageCapture.")) : J.n.s(this.f31555h.Q(c3565j));
    }

    @Override // F.I
    public void j(InterfaceC0490j0 interfaceC0490j0) {
        this.f31561n.g(l.a.e(interfaceC0490j0).d()).h(new Runnable() { // from class: r.r
            @Override // java.lang.Runnable
            public final void run() {
                C3232y.q();
            }
        }, I.c.b());
    }

    void j0() {
        o0(1);
    }

    @Override // y.InterfaceC3586j
    public InterfaceFutureC2904a k(boolean z10) {
        return !Z() ? J.n.n(new InterfaceC3586j.a("Camera is not active.")) : J.n.s(this.f31557j.d(z10));
    }

    void k0(boolean z10) {
        AbstractC3583h0.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f31555h.M(z10);
        this.f31556i.j(z10);
        this.f31558k.d(z10);
        this.f31557j.i(z10);
        this.f31559l.b(z10);
        this.f31561n.o(z10);
        if (z10) {
            return;
        }
        this.f31565r = null;
        this.f31563p.h();
    }

    @Override // F.I
    public InterfaceFutureC2904a l(final int i10, final int i11) {
        if (Z()) {
            final int iH = H();
            return J.d.a(J.n.s(this.f31573z)).e(new J.a() { // from class: r.o
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return J.n.p(this.f31440a.f31562o.c(i10, iH, i11));
                }
            }, this.f31550c);
        }
        AbstractC3583h0.l("Camera2CameraControlImp", "Camera is not active.");
        return J.n.n(new InterfaceC3586j.a("Camera is not active."));
    }

    void l0(boolean z10) {
        this.f31571x = z10;
    }

    @Override // F.I
    public InterfaceC0490j0 m() {
        return this.f31561n.n();
    }

    public void m0(boolean z10) {
        this.f31558k.f(z10);
    }

    @Override // F.I
    public void n() {
        this.f31561n.j().h(new Runnable() { // from class: r.u
            @Override // java.lang.Runnable
            public final void run() {
                C3232y.r();
            }
        }, I.c.b());
    }

    public void n0(Rational rational) {
        this.f31555h.N(rational);
    }

    @Override // F.I
    public void o() {
        this.f31563p.f();
    }

    void o0(int i10) {
        this.f31546A = i10;
        this.f31555h.O(i10);
        this.f31562o.g(this.f31546A);
    }

    public void p0(boolean z10) {
        this.f31560m.f(z10);
    }

    void q0(List list) {
        this.f31553f.b(list);
    }

    public InterfaceFutureC2904a r0() {
        return J.n.s(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.t
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return C3232y.x(this.f31494a, aVar);
            }
        }));
    }

    long s0() {
        this.f31547B = this.f31572y.getAndIncrement();
        this.f31553f.a();
        return this.f31547B;
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r() {
    }
}
