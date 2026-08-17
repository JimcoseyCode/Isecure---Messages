package r;

import F.AbstractC0504q0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.InterfaceFutureC2904a;
import t.C3356p;
import v.h;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class q2 extends AbstractC3199m2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ScheduledExecutorService f31467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f31468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f31469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    InterfaceFutureC2904a f31470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final v.i f31471s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final v.h f31472t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final v.t f31473u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final v.v f31474v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f31475w;

    q2(F.g1 g1Var, F.g1 g1Var2, C3208p1 c3208p1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c3208p1, executor, scheduledExecutorService, handler);
        this.f31468p = new Object();
        this.f31475w = new AtomicBoolean(false);
        this.f31471s = new v.i(g1Var, g1Var2);
        this.f31473u = new v.t(g1Var.a(CaptureSessionStuckQuirk.class) || g1Var.a(IncorrectCaptureStateQuirk.class));
        this.f31472t = new v.h(g1Var2);
        this.f31474v = new v.v(g1Var2);
        this.f31467o = scheduledExecutorService;
    }

    public static /* synthetic */ InterfaceFutureC2904a I(q2 q2Var, CameraDevice cameraDevice, C3356p c3356p, List list, List list2) {
        if (q2Var.f31474v.a()) {
            q2Var.K();
        }
        q2Var.L("start openCaptureSession");
        return super.o(cameraDevice, c3356p, list);
    }

    public static /* synthetic */ void J(q2 q2Var) {
        q2Var.L("Session call super.close()");
        super.close();
    }

    private void K() {
        Iterator it = this.f31416b.d().iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2) it.next()).close();
        }
    }

    void L(String str) {
        AbstractC3583h0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2
    public void close() {
        if (!this.f31475w.compareAndSet(false, true)) {
            L("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f31474v.a()) {
            try {
                L("Call abortCaptures() before closing session.");
                a();
            } catch (Exception e10) {
                L("Exception when calling abortCaptures()" + e10);
            }
        }
        L("Session call close()");
        this.f31473u.e().h(new Runnable() { // from class: r.o2
            @Override // java.lang.Runnable
            public final void run() {
                q2.J(this.f31447g);
            }
        }, b());
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2
    public void e() {
        super.e();
        this.f31473u.g();
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2
    public int g(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.g(list, this.f31473u.d(captureCallback));
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2
    public void i(int i10) {
        super.i(i10);
        if (i10 == 5) {
            synchronized (this.f31468p) {
                try {
                    if (F() && this.f31469q != null) {
                        L("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.f31469q.iterator();
                        while (it.hasNext()) {
                            ((AbstractC0504q0) it.next()).d();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2
    public int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.k(captureRequest, this.f31473u.d(captureCallback));
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2.a
    public InterfaceFutureC2904a m(List list, long j10) {
        InterfaceFutureC2904a interfaceFutureC2904aM;
        synchronized (this.f31468p) {
            this.f31469q = list;
            interfaceFutureC2904aM = super.m(list, j10);
        }
        return interfaceFutureC2904aM;
    }

    @Override // r.InterfaceC3175g2
    public InterfaceFutureC2904a n() {
        return J.n.r(1500L, this.f31467o, this.f31473u.e());
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2.a
    public InterfaceFutureC2904a o(final CameraDevice cameraDevice, final C3356p c3356p, final List list) {
        InterfaceFutureC2904a interfaceFutureC2904aS;
        synchronized (this.f31468p) {
            try {
                List listD = this.f31416b.d();
                ArrayList arrayList = new ArrayList();
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3175g2) it.next()).n());
                }
                InterfaceFutureC2904a interfaceFutureC2904aW = J.n.w(arrayList);
                this.f31470r = interfaceFutureC2904aW;
                interfaceFutureC2904aS = J.n.s(J.d.a(interfaceFutureC2904aW).e(new J.a() { // from class: r.p2
                    @Override // J.a
                    public final InterfaceFutureC2904a apply(Object obj) {
                        return q2.I(this.f31456a, cameraDevice, c3356p, list, (List) obj);
                    }
                }, b()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceFutureC2904aS;
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2.c
    public void s(InterfaceC3175g2 interfaceC3175g2) {
        synchronized (this.f31468p) {
            this.f31471s.a(this.f31469q);
        }
        L("onClosed()");
        super.s(interfaceC3175g2);
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f31468p) {
            try {
                if (F()) {
                    this.f31471s.a(this.f31469q);
                } else {
                    InterfaceFutureC2904a interfaceFutureC2904a = this.f31470r;
                    if (interfaceFutureC2904a != null) {
                        interfaceFutureC2904a.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }

    @Override // r.AbstractC3199m2, r.InterfaceC3175g2.c
    public void u(InterfaceC3175g2 interfaceC3175g2) {
        L("Session onConfigured()");
        this.f31472t.c(interfaceC3175g2, this.f31416b.e(), this.f31416b.d(), new h.a() { // from class: r.n2
            @Override // v.h.a
            public final void a(InterfaceC3175g2 interfaceC3175g22) {
                super/*r.m2*/.u(interfaceC3175g22);
            }
        });
    }
}
