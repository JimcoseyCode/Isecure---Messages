package r;

import F.C0486h0;
import F.C0508t;
import F.I;
import F.InterfaceC0490j0;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.concurrent.futures.c;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m5.InterfaceFutureC2904a;
import q.C3091a;
import r.C3232y;
import y.AbstractC3583h0;
import y.C3565J;
import y.C3566K;
import y.C3589k0;
import y.InterfaceC3586j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class K1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final MeteringRectangle[] f30983x = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3232y f30984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f30985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f30986c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v.m f30989f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScheduledFuture f30992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ScheduledFuture f30993j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MeteringRectangle[] f31000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MeteringRectangle[] f31001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MeteringRectangle[] f31002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    c.a f31003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c.a f31004u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f31005v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C3232y.c f31006w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f30987d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Rational f30988e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30990g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Integer f30991h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f30994k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f30995l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f30996m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f30997n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C3232y.c f30998o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C3232y.c f30999p = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends F.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f31007a;

        a(c.a aVar) {
            this.f31007a = aVar;
        }

        @Override // F.r
        public void a(int i10) {
            c.a aVar = this.f31007a;
            if (aVar != null) {
                aVar.f(new InterfaceC3586j.a("Camera is closed"));
            }
        }

        @Override // F.r
        public void b(int i10, F.B b10) {
            c.a aVar = this.f31007a;
            if (aVar != null) {
                aVar.c(b10);
            }
        }

        @Override // F.r
        public void c(int i10, C0508t c0508t) {
            c.a aVar = this.f31007a;
            if (aVar != null) {
                aVar.f(new I.c(c0508t));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends F.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f31009a;

        b(c.a aVar) {
            this.f31009a = aVar;
        }

        @Override // F.r
        public void a(int i10) {
            c.a aVar = this.f31009a;
            if (aVar != null) {
                aVar.f(new InterfaceC3586j.a("Camera is closed"));
            }
        }

        @Override // F.r
        public void b(int i10, F.B b10) {
            if (this.f31009a != null) {
                AbstractC3583h0.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f31009a.c(null);
            }
        }

        @Override // F.r
        public void c(int i10, C0508t c0508t) {
            c.a aVar = this.f31009a;
            if (aVar != null) {
                aVar.f(new I.c(c0508t));
            }
        }
    }

    K1(C3232y c3232y, ScheduledExecutorService scheduledExecutorService, Executor executor, F.g1 g1Var) {
        MeteringRectangle[] meteringRectangleArr = f30983x;
        this.f31000q = meteringRectangleArr;
        this.f31001r = meteringRectangleArr;
        this.f31002s = meteringRectangleArr;
        this.f31003t = null;
        this.f31004u = null;
        this.f31005v = false;
        this.f31006w = null;
        this.f30984a = c3232y;
        this.f30985b = executor;
        this.f30986c = scheduledExecutorService;
        this.f30989f = new v.m(g1Var);
    }

    private void A(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, C3565J c3565j, long j10) {
        final long jS0;
        this.f30984a.g0(this.f30998o);
        x();
        u();
        this.f31000q = meteringRectangleArr;
        this.f31001r = meteringRectangleArr2;
        this.f31002s = meteringRectangleArr3;
        if (P()) {
            this.f30990g = true;
            this.f30995l = false;
            this.f30996m = false;
            jS0 = this.f30984a.s0();
            V(null, true);
        } else {
            this.f30990g = false;
            this.f30995l = true;
            this.f30996m = false;
            jS0 = this.f30984a.s0();
        }
        this.f30991h = 0;
        final boolean zI = I();
        C3232y.c cVar = new C3232y.c() { // from class: r.y1
            @Override // r.C3232y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return K1.l(this.f31579a, zI, jS0, totalCaptureResult);
            }
        };
        this.f30998o = cVar;
        this.f30984a.B(cVar);
        final long j11 = this.f30994k + 1;
        this.f30994k = j11;
        Runnable runnable = new Runnable() { // from class: r.z1
            @Override // java.lang.Runnable
            public final void run() {
                K1 k12 = this.f31586g;
                k12.f30985b.execute(new Runnable() { // from class: r.B1
                    @Override // java.lang.Runnable
                    public final void run() {
                        K1.k(this.f30917g, j);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f30986c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f30993j = scheduledExecutorService.schedule(runnable, j10, timeUnit);
        if (c3565j.e()) {
            this.f30992i = this.f30986c.schedule(new Runnable() { // from class: r.A1
                @Override // java.lang.Runnable
                public final void run() {
                    K1 k12 = this.f30912g;
                    k12.f30985b.execute(new Runnable() { // from class: r.v1
                        @Override // java.lang.Runnable
                        public final void run() {
                            K1.m(k12, j);
                        }
                    });
                }
            }, c3565j.a(), timeUnit);
        }
    }

    private void B(String str) {
        this.f30984a.g0(this.f30998o);
        c.a aVar = this.f31003t;
        if (aVar != null) {
            aVar.f(new InterfaceC3586j.a(str));
            this.f31003t = null;
        }
    }

    private void C(String str) {
        this.f30984a.g0(this.f30999p);
        c.a aVar = this.f31004u;
        if (aVar != null) {
            aVar.f(new InterfaceC3586j.a(str));
            this.f31004u = null;
        }
    }

    private Rational E() {
        if (this.f30988e != null) {
            return this.f30988e;
        }
        Rect rectG = this.f30984a.G();
        return new Rational(rectG.width(), rectG.height());
    }

    private static PointF F(C3589k0 c3589k0, Rational rational, Rational rational2, int i10, v.m mVar) {
        if (c3589k0.b() != null) {
            rational2 = c3589k0.b();
        }
        PointF pointFA = mVar.a(c3589k0, i10);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointFA.y = (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointFA.y) * (1.0f / fDoubleValue);
                return pointFA;
            }
            float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            pointFA.x = (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointFA.x) * (1.0f / fDoubleValue2);
        }
        return pointFA;
    }

    private static MeteringRectangle G(C3589k0 c3589k0, PointF pointF, Rect rect) {
        int iWidth = (int) (rect.left + (pointF.x * rect.width()));
        int iHeight = (int) (rect.top + (pointF.y * rect.height()));
        int iA = ((int) (c3589k0.a() * rect.width())) / 2;
        int iA2 = ((int) (c3589k0.a() * rect.height())) / 2;
        Rect rect2 = new Rect(iWidth - iA, iHeight - iA2, iWidth + iA, iHeight + iA2);
        rect2.left = L(rect2.left, rect.right, rect.left);
        rect2.right = L(rect2.right, rect.right, rect.left);
        rect2.top = L(rect2.top, rect.bottom, rect.top);
        rect2.bottom = L(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, ProgressBarContainerView.MAX_PROGRESS);
    }

    private List H(List list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3589k0 c3589k0 = (C3589k0) it.next();
            if (arrayList.size() == i10) {
                break;
            }
            if (K(c3589k0)) {
                MeteringRectangle meteringRectangleG = G(c3589k0, F(c3589k0, rational2, rational, i11, this.f30989f), rect);
                if (meteringRectangleG.getWidth() != 0 && meteringRectangleG.getHeight() != 0) {
                    arrayList.add(meteringRectangleG);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean I() {
        return this.f30984a.S(1) == 1;
    }

    private static boolean K(C3589k0 c3589k0) {
        return c3589k0.c() >= 0.0f && c3589k0.c() <= 1.0f && c3589k0.d() >= 0.0f && c3589k0.d() <= 1.0f;
    }

    private static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i12), i11);
    }

    private boolean P() {
        return this.f31000q.length > 0;
    }

    public static /* synthetic */ boolean a(K1 k12, int i10, long j10, TotalCaptureResult totalCaptureResult) {
        k12.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !C3232y.e0(totalCaptureResult, j10)) {
            return false;
        }
        k12.w();
        return true;
    }

    public static /* synthetic */ void b(K1 k12, boolean z10, c.a aVar) {
        k12.f30984a.g0(k12.f31006w);
        k12.f31005v = z10;
        k12.z(aVar);
    }

    public static /* synthetic */ Object c(final K1 k12, final C3565J c3565j, final long j10, final c.a aVar) {
        k12.f30985b.execute(new Runnable() { // from class: r.w1
            @Override // java.lang.Runnable
            public final void run() {
                this.f31521g.S(aVar, c3565j, j10);
            }
        });
        return "startFocusAndMetering";
    }

    public static /* synthetic */ Object f(final K1 k12, final boolean z10, final c.a aVar) {
        k12.f30985b.execute(new Runnable() { // from class: r.E1
            @Override // java.lang.Runnable
            public final void run() {
                K1.b(this.f30943g, z10, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public static /* synthetic */ boolean i(K1 k12, long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        k12.getClass();
        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        AbstractC3583h0.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != k12.f31005v || !C3232y.e0(totalCaptureResult, j10)) {
            return false;
        }
        AbstractC3583h0.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    public static /* synthetic */ Object j(final K1 k12, final c.a aVar) {
        k12.f30985b.execute(new Runnable() { // from class: r.F1
            @Override // java.lang.Runnable
            public final void run() {
                this.f30956g.U(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    public static /* synthetic */ void k(K1 k12, long j10) {
        if (j10 == k12.f30994k) {
            k12.f30996m = false;
            k12.v(false);
        }
    }

    public static /* synthetic */ boolean l(K1 k12, boolean z10, long j10, TotalCaptureResult totalCaptureResult) {
        k12.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (k12.P()) {
            if (!z10 || num == null) {
                k12.f30996m = true;
                k12.f30995l = true;
            } else if (k12.f30991h.intValue() == 3) {
                if (num.intValue() == 4) {
                    k12.f30996m = true;
                    k12.f30995l = true;
                } else if (num.intValue() == 5) {
                    k12.f30996m = false;
                    k12.f30995l = true;
                }
            }
        }
        if (k12.f30995l && C3232y.e0(totalCaptureResult, j10)) {
            k12.v(k12.f30996m);
            return true;
        }
        if (!k12.f30991h.equals(num) && num != null) {
            k12.f30991h = num;
        }
        return false;
    }

    public static /* synthetic */ void m(K1 k12, long j10) {
        if (j10 == k12.f30994k) {
            k12.t();
        }
    }

    public static /* synthetic */ Object n(final K1 k12, final c.a aVar) {
        k12.f30985b.execute(new Runnable() { // from class: r.J1
            @Override // java.lang.Runnable
            public final void run() {
                this.f30978g.s(aVar);
            }
        });
        return "cancelFocusAndMetering";
    }

    private void u() {
        ScheduledFuture scheduledFuture = this.f30993j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f30993j = null;
        }
    }

    private void w() {
        c.a aVar = this.f31004u;
        if (aVar != null) {
            aVar.c(null);
            this.f31004u = null;
        }
    }

    private void x() {
        ScheduledFuture scheduledFuture = this.f30992i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f30992i = null;
        }
    }

    private void z(final c.a aVar) {
        if (!this.f30987d) {
            if (aVar != null) {
                aVar.f(new InterfaceC3586j.a("Camera is not active."));
            }
        } else {
            final long jS0 = this.f30984a.s0();
            C3232y.c cVar = new C3232y.c() { // from class: r.G1
                @Override // r.C3232y.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return K1.i(this.f30964a, jS0, aVar, totalCaptureResult);
                }
            };
            this.f31006w = cVar;
            this.f30984a.B(cVar);
        }
    }

    int D() {
        return this.f30997n != 3 ? 4 : 3;
    }

    boolean J() {
        return this.f31005v;
    }

    void M(boolean z10) {
        if (z10 == this.f30987d) {
            return;
        }
        this.f30987d = z10;
        if (this.f30987d) {
            return;
        }
        t();
    }

    public void N(Rational rational) {
        this.f30988e = rational;
    }

    void O(int i10) {
        this.f30997n = i10;
    }

    InterfaceFutureC2904a Q(C3565J c3565j) {
        return R(c3565j, 5000L);
    }

    InterfaceFutureC2904a R(final C3565J c3565j, final long j10) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.H1
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return K1.c(this.f30969a, c3565j, j10, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(c.a aVar, C3565J c3565j, long j10) {
        if (!this.f30987d) {
            aVar.f(new InterfaceC3586j.a("Camera is not active."));
            return;
        }
        Rect rectG = this.f30984a.G();
        Rational rationalE = E();
        List listH = H(c3565j.c(), this.f30984a.L(), rationalE, rectG, 1);
        List listH2 = H(c3565j.b(), this.f30984a.K(), rationalE, rectG, 2);
        List listH3 = H(c3565j.d(), this.f30984a.M(), rationalE, rectG, 4);
        if (listH.isEmpty() && listH2.isEmpty() && listH3.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        B("Cancelled by another startFocusAndMetering()");
        C("Cancelled by another startFocusAndMetering()");
        x();
        this.f31003t = aVar;
        MeteringRectangle[] meteringRectangleArr = f30983x;
        A((MeteringRectangle[]) listH.toArray(meteringRectangleArr), (MeteringRectangle[]) listH2.toArray(meteringRectangleArr), (MeteringRectangle[]) listH3.toArray(meteringRectangleArr), c3565j, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceFutureC2904a T() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.D1
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return K1.j(this.f30932a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(c.a aVar) {
        AbstractC3583h0.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f30987d) {
            if (aVar != null) {
                aVar.f(new InterfaceC3586j.a("Camera is not active."));
                return;
            }
            return;
        }
        C0486h0.a aVar2 = new C0486h0.a();
        aVar2.v(this.f30997n);
        aVar2.w(true);
        C3091a.C0345a c0345a = new C3091a.C0345a();
        c0345a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0345a.a());
        aVar2.c(new b(aVar));
        this.f30984a.q0(Collections.singletonList(aVar2.h()));
    }

    void V(c.a aVar, boolean z10) {
        if (!this.f30987d) {
            if (aVar != null) {
                aVar.f(new InterfaceC3586j.a("Camera is not active."));
                return;
            }
            return;
        }
        C0486h0.a aVar2 = new C0486h0.a();
        aVar2.v(this.f30997n);
        aVar2.w(true);
        C3091a.C0345a c0345a = new C3091a.C0345a();
        c0345a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c0345a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f30984a.Q(1)), InterfaceC0490j0.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c0345a.a());
        aVar2.c(new a(aVar));
        this.f30984a.q0(Collections.singletonList(aVar2.h()));
    }

    void p(C3091a.C0345a c0345a) {
        int iD = this.f30990g ? 1 : D();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Object objValueOf = Integer.valueOf(this.f30984a.S(iD));
        InterfaceC0490j0.c cVar = InterfaceC0490j0.c.REQUIRED;
        c0345a.g(key, objValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f31000q;
        if (meteringRectangleArr.length != 0) {
            c0345a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f31001r;
        if (meteringRectangleArr2.length != 0) {
            c0345a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f31002s;
        if (meteringRectangleArr3.length != 0) {
            c0345a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    void q(boolean z10, boolean z11) {
        if (this.f30987d) {
            C0486h0.a aVar = new C0486h0.a();
            aVar.w(true);
            aVar.v(this.f30997n);
            C3091a.C0345a c0345a = new C3091a.C0345a();
            if (z10) {
                c0345a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                c0345a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0345a.a());
            this.f30984a.q0(Collections.singletonList(aVar.h()));
        }
    }

    InterfaceFutureC2904a r() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.I1
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return K1.n(this.f30974a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(c.a aVar) {
        C("Cancelled by another cancelFocusAndMetering()");
        B("Cancelled by cancelFocusAndMetering()");
        this.f31004u = aVar;
        x();
        u();
        if (P()) {
            q(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f30983x;
        this.f31000q = meteringRectangleArr;
        this.f31001r = meteringRectangleArr;
        this.f31002s = meteringRectangleArr;
        this.f30990g = false;
        final long jS0 = this.f30984a.s0();
        if (this.f31004u != null) {
            final int iS = this.f30984a.S(D());
            C3232y.c cVar = new C3232y.c() { // from class: r.x1
                @Override // r.C3232y.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return K1.a(this.f31531a, iS, jS0, totalCaptureResult);
                }
            };
            this.f30999p = cVar;
            this.f30984a.B(cVar);
        }
    }

    void t() {
        s(null);
    }

    void v(boolean z10) {
        u();
        c.a aVar = this.f31003t;
        if (aVar != null) {
            aVar.c(C3566K.a(z10));
            this.f31003t = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceFutureC2904a y(final boolean z10) {
        return Build.VERSION.SDK_INT < 28 ? J.n.p(null) : this.f30984a.Q(5) != 5 ? J.n.p(null) : androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.C1
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return K1.f(this.f30925a, z10, aVar);
            }
        });
    }
}
