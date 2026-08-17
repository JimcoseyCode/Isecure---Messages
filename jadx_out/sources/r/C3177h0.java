package r;

import E.InterfaceC0450j;
import F.AbstractC0496m0;
import F.C0486h0;
import F.C0508t;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;
import q.C3091a;
import r.C3177h0;
import r.C3232y;
import y.AbstractC3583h0;
import y.V;

/* JADX INFO: renamed from: r.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3177h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3232y f31305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v.C f31306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.g1 f31308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f31309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f31310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31312h = 1;

    /* JADX INFO: renamed from: r.h0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3232y f31313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v.o f31314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f31315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f31316d = false;

        a(C3232y c3232y, int i10, v.o oVar) {
            this.f31313a = c3232y;
            this.f31315c = i10;
            this.f31314b = oVar;
        }

        public static /* synthetic */ Object e(a aVar, c.a aVar2) {
            aVar.f31313a.I().U(aVar2);
            aVar.f31314b.b();
            return "AePreCapture";
        }

        @Override // r.C3177h0.e
        public InterfaceFutureC2904a a(TotalCaptureResult totalCaptureResult) {
            if (this.f31313a.b0() || !C3177h0.e(this.f31315c, totalCaptureResult)) {
                return J.n.p(Boolean.FALSE);
            }
            AbstractC3583h0.a("Camera2CapturePipeline", "Trigger AE");
            this.f31316d = true;
            return J.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.f0
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C3177h0.a.e(this.f31262a, aVar);
                }
            })).d(new InterfaceC2955a() { // from class: r.g0
                @Override // n.InterfaceC2955a
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, I.c.b());
        }

        @Override // r.C3177h0.e
        public boolean b() {
            return this.f31315c == 0;
        }

        @Override // r.C3177h0.e
        public void c() {
            if (this.f31316d) {
                AbstractC3583h0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f31313a.I().q(false, true);
                this.f31314b.a();
            }
        }
    }

    /* JADX INFO: renamed from: r.h0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3232y f31317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f31318b = false;

        b(C3232y c3232y) {
            this.f31317a = c3232y;
        }

        @Override // r.C3177h0.e
        public InterfaceFutureC2904a a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            InterfaceFutureC2904a interfaceFutureC2904aP = J.n.p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                AbstractC3583h0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    AbstractC3583h0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f31318b = true;
                    this.f31317a.I().V(null, false);
                }
            }
            return interfaceFutureC2904aP;
        }

        @Override // r.C3177h0.e
        public boolean b() {
            return true;
        }

        @Override // r.C3177h0.e
        public void c() {
            if (this.f31318b) {
                AbstractC3583h0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f31317a.I().q(true, false);
            }
        }
    }

    /* JADX INFO: renamed from: r.h0$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c implements InterfaceC0450j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f31319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f31320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f31321c;

        c(d dVar, Executor executor, int i10) {
            this.f31320b = dVar;
            this.f31319a = executor;
            this.f31321c = i10;
        }

        public static /* synthetic */ Object c(c cVar, c.a aVar) {
            cVar.f31320b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        public static /* synthetic */ Void d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // E.InterfaceC0450j
        public InterfaceFutureC2904a a() {
            AbstractC3583h0.a("Camera2CapturePipeline", "invokePreCapture");
            return J.d.a(this.f31320b.k(this.f31321c)).d(new InterfaceC2955a() { // from class: r.j0
                @Override // n.InterfaceC2955a
                public final Object apply(Object obj) {
                    return C3177h0.c.d((TotalCaptureResult) obj);
                }
            }, this.f31319a);
        }

        @Override // E.InterfaceC0450j
        public InterfaceFutureC2904a b() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.i0
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C3177h0.c.c(this.f31355a, aVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r.h0$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f31322j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f31323k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f31325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f31326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C3232y f31327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final v.o f31328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f31329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f31330g = f31322j;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final List f31331h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final e f31332i = new a();

        /* JADX INFO: renamed from: r.h0$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements e {
            a() {
            }

            @Override // r.C3177h0.e
            public InterfaceFutureC2904a a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = d.this.f31331h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a(totalCaptureResult));
                }
                return J.n.x(J.n.k(arrayList), new InterfaceC2955a() { // from class: r.q0
                    @Override // n.InterfaceC2955a
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, I.c.b());
            }

            @Override // r.C3177h0.e
            public boolean b() {
                Iterator it = d.this.f31331h.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // r.C3177h0.e
            public void c() {
                Iterator it = d.this.f31331h.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c();
                }
            }
        }

        /* JADX INFO: renamed from: r.h0$d$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b extends F.r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f31334a;

            b(c.a aVar) {
                this.f31334a = aVar;
            }

            @Override // F.r
            public void a(int i10) {
                this.f31334a.f(new y.X(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // F.r
            public void b(int i10, F.B b10) {
                this.f31334a.c(null);
            }

            @Override // F.r
            public void c(int i10, C0508t c0508t) {
                this.f31334a.f(new y.X(2, "Capture request failed with reason " + c0508t.b(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f31322j = timeUnit.toNanos(1L);
            f31323k = timeUnit.toNanos(5L);
        }

        d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, C3232y c3232y, boolean z10, v.o oVar) {
            this.f31324a = i10;
            this.f31325b = executor;
            this.f31326c = scheduledExecutorService;
            this.f31327d = c3232y;
            this.f31329f = z10;
            this.f31328e = oVar;
        }

        public static /* synthetic */ InterfaceFutureC2904a a(d dVar, int i10, TotalCaptureResult totalCaptureResult) {
            if (!dVar.f31327d.b0() && C3177h0.e(i10, totalCaptureResult)) {
                dVar.l(f31323k);
            }
            return dVar.f31332i.a(totalCaptureResult);
        }

        public static /* synthetic */ InterfaceFutureC2904a d(d dVar, Boolean bool) {
            dVar.getClass();
            return Boolean.TRUE.equals(bool) ? C3177h0.i(dVar.f31330g, dVar.f31326c, dVar.f31327d, new f.a() { // from class: r.p0
                @Override // r.C3177h0.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C3177h0.d(totalCaptureResult, false);
                }
            }) : J.n.p(null);
        }

        public static /* synthetic */ Object e(d dVar, C0486h0.a aVar, c.a aVar2) {
            dVar.getClass();
            aVar.c(dVar.new b(aVar2));
            return "submitStillCapture";
        }

        private void g(C0486h0.a aVar) {
            C3091a.C0345a c0345a = new C3091a.C0345a();
            c0345a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0345a.a());
        }

        private void h(C0486h0.a aVar, C0486h0 c0486h0) {
            int i10 = (this.f31324a != 3 || this.f31329f) ? (c0486h0.k() == -1 || c0486h0.k() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.v(i10);
            }
            AbstractC3583h0.a("Camera2CapturePipeline", "applyStillCaptureTemplate: templateToModify = " + i10);
        }

        private void l(long j10) {
            this.f31330g = j10;
        }

        void f(e eVar) {
            this.f31331h.add(eVar);
        }

        InterfaceFutureC2904a i(final List list, final int i10) {
            J.d dVarE = J.d.a(k(i10)).e(new J.a() { // from class: r.k0
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return this.f31368a.m(list, i10);
                }
            }, this.f31325b);
            dVarE.h(new Runnable() { // from class: r.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31375g.j();
                }
            }, this.f31325b);
            return dVarE;
        }

        public void j() {
            this.f31332i.c();
        }

        public InterfaceFutureC2904a k(final int i10) {
            InterfaceFutureC2904a interfaceFutureC2904aP = J.n.p(null);
            if (this.f31331h.isEmpty()) {
                return interfaceFutureC2904aP;
            }
            return J.d.a(this.f31332i.b() ? C3177h0.j(this.f31327d, null) : J.n.p(null)).e(new J.a() { // from class: r.n0
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return C3177h0.d.a(this.f31436a, i10, (TotalCaptureResult) obj);
                }
            }, this.f31325b).e(new J.a() { // from class: r.o0
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return C3177h0.d.d(this.f31444a, (Boolean) obj);
                }
            }, this.f31325b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public InterfaceFutureC2904a m(List list, int i10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0486h0 c0486h0 = (C0486h0) it.next();
                final C0486h0.a aVarK = C0486h0.a.k(c0486h0);
                F.B bA = null;
                if (c0486h0.k() == 5 && !this.f31327d.X().d() && !this.f31327d.X().c()) {
                    androidx.camera.core.o oVarG = this.f31327d.X().g();
                    if (oVarG != null) {
                        if (this.f31327d.X().h(oVarG)) {
                            bA = F.C.a(oVarG.i());
                        } else {
                            AbstractC3583h0.c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                        }
                        if (bA == null) {
                            oVarG.close();
                        }
                    } else {
                        AbstractC3583h0.a("Camera2CapturePipeline", "ZSL capture skipped due to no valid buffer image");
                    }
                }
                if (bA != null) {
                    aVarK.p(bA);
                } else {
                    h(aVarK, c0486h0);
                }
                if (this.f31328e.c(i10)) {
                    g(aVarK);
                }
                arrayList.add(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.m0
                    @Override // androidx.concurrent.futures.c.InterfaceC0153c
                    public final Object a(c.a aVar) {
                        return C3177h0.d.e(this.f31413a, aVarK, aVar);
                    }
                }));
                arrayList2.add(aVarK.h());
            }
            this.f31327d.q0(arrayList2);
            return J.n.k(arrayList);
        }
    }

    /* JADX INFO: renamed from: r.h0$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface e {
        InterfaceFutureC2904a a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* JADX INFO: renamed from: r.h0$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f implements C3232y.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c.a f31336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceFutureC2904a f31337b = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.r0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return C3177h0.f.b(this.f31476a, aVar);
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f31338c;

        /* JADX INFO: renamed from: r.h0$f$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        f(a aVar) {
            this.f31338c = aVar;
        }

        public static /* synthetic */ Object b(f fVar, c.a aVar) {
            fVar.f31336a = aVar;
            return "waitFor3AResult";
        }

        @Override // r.C3232y.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f31338c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f31336a.c(totalCaptureResult);
            return true;
        }

        public InterfaceFutureC2904a c() {
            return this.f31337b;
        }
    }

    /* JADX INFO: renamed from: r.h0$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class h implements e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f31345g = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3232y f31346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f31347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31348c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Executor f31349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f31350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f31351f;

        h(C3232y c3232y, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f31346a = c3232y;
            this.f31347b = i10;
            this.f31349d = executor;
            this.f31350e = scheduledExecutorService;
            this.f31351f = z10;
        }

        public static /* synthetic */ InterfaceFutureC2904a d(h hVar, Void r12) {
            return hVar.f31351f ? hVar.f31346a.I().T() : J.n.p(null);
        }

        public static /* synthetic */ Object e(h hVar, c.a aVar) {
            hVar.f31346a.U().e(aVar, 2);
            return "TorchOn";
        }

        @Override // r.C3177h0.e
        public InterfaceFutureC2904a a(TotalCaptureResult totalCaptureResult) {
            AbstractC3583h0.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C3177h0.e(this.f31347b, totalCaptureResult));
            if (C3177h0.e(this.f31347b, totalCaptureResult)) {
                if (this.f31346a.b0()) {
                    AbstractC3583h0.a("Camera2CapturePipeline", "Low-light boost already on, not turn on");
                } else {
                    if (!this.f31346a.f0()) {
                        AbstractC3583h0.a("Camera2CapturePipeline", "Turn on torch");
                        this.f31348c = true;
                        return J.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.G0
                            @Override // androidx.concurrent.futures.c.InterfaceC0153c
                            public final Object a(c.a aVar) {
                                return C3177h0.h.e(this.f30963a, aVar);
                            }
                        })).e(new J.a() { // from class: r.H0
                            @Override // J.a
                            public final InterfaceFutureC2904a apply(Object obj) {
                                return C3177h0.h.d(this.f30968a, (Void) obj);
                            }
                        }, this.f31349d).e(new J.a() { // from class: r.I0
                            @Override // J.a
                            public final InterfaceFutureC2904a apply(Object obj) {
                                C3177h0.h hVar = this.f30973a;
                                return C3177h0.i(C3177h0.h.f31345g, hVar.f31350e, hVar.f31346a, new C3177h0.f.a() { // from class: r.K0
                                    @Override // r.C3177h0.f.a
                                    public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                        return C3177h0.d(totalCaptureResult2, true);
                                    }
                                });
                            }
                        }, this.f31349d).d(new InterfaceC2955a() { // from class: r.J0
                            @Override // n.InterfaceC2955a
                            public final Object apply(Object obj) {
                                return Boolean.FALSE;
                            }
                        }, I.c.b());
                    }
                    AbstractC3583h0.a("Camera2CapturePipeline", "Torch already on, not turn on");
                }
            }
            return J.n.p(Boolean.FALSE);
        }

        @Override // r.C3177h0.e
        public boolean b() {
            return this.f31347b == 0;
        }

        @Override // r.C3177h0.e
        public void c() {
            if (this.f31348c) {
                this.f31346a.U().e(null, 0);
                AbstractC3583h0.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f31351f) {
                    this.f31346a.I().q(false, true);
                }
            }
        }
    }

    C3177h0(C3232y c3232y, s.E e10, F.g1 g1Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f31305a = c3232y;
        Integer num = (Integer) e10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f31311g = num != null && num.intValue() == 2;
        this.f31309e = executor;
        this.f31310f = scheduledExecutorService;
        this.f31308d = g1Var;
        this.f31306b = new v.C(g1Var);
        this.f31307c = v.g.a(new C3149a0(e10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return AbstractC0496m0.a(new C3176h(totalCaptureResult), z10);
    }

    static boolean e(int i10, TotalCaptureResult totalCaptureResult) {
        AbstractC3583h0.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return false;
                }
                if (i10 != 3) {
                    throw new AssertionError(i10);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        AbstractC3583h0.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean f(int i10) {
        return this.f31306b.a() || this.f31312h == 3 || i10 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceFutureC2904a i(long j10, ScheduledExecutorService scheduledExecutorService, C3232y c3232y, f.a aVar) {
        return J.n.q(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, j(c3232y, aVar));
    }

    static InterfaceFutureC2904a j(final C3232y c3232y, f.a aVar) {
        final f fVar = new f(aVar);
        c3232y.B(fVar);
        InterfaceFutureC2904a interfaceFutureC2904aC = fVar.c();
        interfaceFutureC2904aC.h(new Runnable() { // from class: r.e0
            @Override // java.lang.Runnable
            public final void run() {
                c3232y.g0(fVar);
            }
        }, c3232y.f31550c);
        return interfaceFutureC2904aC;
    }

    d b(int i10, int i11, int i12) {
        int i13;
        v.o oVar = new v.o(this.f31308d);
        d dVar = new d(this.f31312h, this.f31309e, this.f31310f, this.f31305a, this.f31311g, oVar);
        if (i10 == 0) {
            dVar.f(new b(this.f31305a));
        }
        if (i11 != 3) {
            if (this.f31307c) {
                if (f(i12)) {
                    i13 = i11;
                    dVar.f(new h(this.f31305a, i13, this.f31309e, this.f31310f, (this.f31306b.a() || this.f31305a.a0()) ? false : true));
                } else {
                    i13 = i11;
                    dVar.f(new a(this.f31305a, i13, oVar));
                }
            }
            AbstractC3583h0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f31331h);
            return dVar;
        }
        dVar.f(new g(this.f31305a, this.f31309e, this.f31310f, new v.B(this.f31308d)));
        i13 = i11;
        AbstractC3583h0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f31331h);
        return dVar;
    }

    InterfaceC0450j c(int i10, int i11, int i12) {
        return new c(b(i10, i11, i12), this.f31309e, i11);
    }

    public void g(int i10) {
        this.f31312h = i10;
    }

    public InterfaceFutureC2904a h(List list, int i10, int i11, int i12) {
        return J.n.s(b(i10, i11, i12).i(list, i11));
    }

    /* JADX INFO: renamed from: r.h0$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class g implements e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f31339f = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3232y f31340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f31341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f31342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final V.i f31343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final v.B f31344e;

        g(C3232y c3232y, Executor executor, ScheduledExecutorService scheduledExecutorService, v.B b10) {
            this.f31340a = c3232y;
            this.f31341b = executor;
            this.f31342c = scheduledExecutorService;
            this.f31344e = b10;
            V.i iVarN = c3232y.N();
            Objects.requireNonNull(iVarN);
            this.f31343d = iVarN;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, c.a aVar) {
            gVar.getClass();
            AbstractC3583h0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f31343d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (V.j) atomicReference.get());
            aVar.c(null);
        }

        public static /* synthetic */ InterfaceFutureC2904a h(final g gVar, Void r12) {
            gVar.getClass();
            return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.t0
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C3177h0.g.l(this.f31495a, aVar);
                }
            });
        }

        public static /* synthetic */ Object j(final g gVar, final AtomicReference atomicReference, final c.a aVar) {
            gVar.getClass();
            I.c.e().execute(new Runnable() { // from class: r.u0
                @Override // java.lang.Runnable
                public final void run() {
                    C3177h0.g.d(this.f31502g, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ void k(c.a aVar) {
            AbstractC3583h0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static /* synthetic */ Object l(g gVar, c.a aVar) {
            if (!gVar.f31344e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            AbstractC3583h0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f31340a.F(2);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object n(AtomicReference atomicReference, final c.a aVar) {
            atomicReference.set(new V.j() { // from class: r.w0
                @Override // y.V.j
                public final void a() {
                    C3177h0.g.k(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        public static /* synthetic */ InterfaceFutureC2904a p(g gVar, InterfaceFutureC2904a interfaceFutureC2904a, Object obj) {
            gVar.getClass();
            return J.n.q(TimeUnit.SECONDS.toMillis(3L), gVar.f31342c, null, true, interfaceFutureC2904a);
        }

        @Override // r.C3177h0.e
        public InterfaceFutureC2904a a(TotalCaptureResult totalCaptureResult) {
            AbstractC3583h0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.y0
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C3177h0.g.n(atomicReference, aVar);
                }
            });
            return J.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.z0
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C3177h0.g.j(this.f31584a, atomicReference, aVar);
                }
            })).e(new J.a() { // from class: r.A0
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return this.f30911a.f31340a.I().y(true);
                }
            }, this.f31341b).e(new J.a() { // from class: r.B0
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return C3177h0.g.h(this.f30916a, (Void) obj);
                }
            }, this.f31341b).e(new J.a() { // from class: r.C0
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return C3177h0.g.p(this.f30923a, interfaceFutureC2904aA, obj);
                }
            }, this.f31341b).e(new J.a() { // from class: r.D0
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return this.f30931a.f31340a.I().T();
                }
            }, this.f31341b).e(new J.a() { // from class: r.E0
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    C3177h0.g gVar = this.f30942a;
                    return C3177h0.i(C3177h0.g.f31339f, gVar.f31342c, gVar.f31340a, new C3177h0.f.a() { // from class: r.v0
                        @Override // r.C3177h0.f.a
                        public final boolean a(TotalCaptureResult totalCaptureResult2) {
                            return C3177h0.d(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.f31341b).d(new InterfaceC2955a() { // from class: r.F0
                @Override // n.InterfaceC2955a
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, I.c.b());
        }

        @Override // r.C3177h0.e
        public boolean b() {
            return false;
        }

        @Override // r.C3177h0.e
        public void c() {
            AbstractC3583h0.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f31344e.a()) {
                this.f31340a.F(0);
            }
            this.f31340a.I().y(false).h(new Runnable() { // from class: r.s0
                @Override // java.lang.Runnable
                public final void run() {
                    C3177h0.g.i();
                }
            }, this.f31341b);
            this.f31340a.I().q(false, true);
            ScheduledExecutorService scheduledExecutorServiceE = I.c.e();
            final V.i iVar = this.f31343d;
            Objects.requireNonNull(iVar);
            scheduledExecutorServiceE.execute(new Runnable() { // from class: r.x0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.clear();
                }
            });
        }

        public static /* synthetic */ void i() {
        }
    }
}
