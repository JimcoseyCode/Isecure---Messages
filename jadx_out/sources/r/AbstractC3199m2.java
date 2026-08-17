package r;

import F.AbstractC0504q0;
import F.AbstractC0509t0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m5.InterfaceFutureC2904a;
import r.InterfaceC3175g2;
import s.C3295i;
import t.C3356p;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: r.m2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3199m2 extends InterfaceC3175g2.c implements InterfaceC3175g2, InterfaceC3175g2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C3208p1 f31416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Handler f31417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Executor f31418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f31419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    InterfaceC3175g2.c f31420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    C3295i f31421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    InterfaceFutureC2904a f31422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    c.a f31423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceFutureC2904a f31424j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f31415a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f31425k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31426l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31427m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f31428n = false;

    /* JADX INFO: renamed from: r.m2$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            AbstractC3199m2.this.D(cameraCaptureSession);
            AbstractC3199m2 abstractC3199m2 = AbstractC3199m2.this;
            abstractC3199m2.q(abstractC3199m2);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            AbstractC3199m2.this.D(cameraCaptureSession);
            AbstractC3199m2 abstractC3199m2 = AbstractC3199m2.this;
            abstractC3199m2.r(abstractC3199m2);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            AbstractC3199m2.this.D(cameraCaptureSession);
            AbstractC3199m2 abstractC3199m2 = AbstractC3199m2.this;
            abstractC3199m2.s(abstractC3199m2);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a aVar;
            try {
                AbstractC3199m2.this.D(cameraCaptureSession);
                AbstractC3199m2 abstractC3199m2 = AbstractC3199m2.this;
                abstractC3199m2.t(abstractC3199m2);
                synchronized (AbstractC3199m2.this.f31415a) {
                    H0.g.h(AbstractC3199m2.this.f31423i, "OpenCaptureSession completer should not null");
                    AbstractC3199m2 abstractC3199m22 = AbstractC3199m2.this;
                    aVar = abstractC3199m22.f31423i;
                    abstractC3199m22.f31423i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (AbstractC3199m2.this.f31415a) {
                    H0.g.h(AbstractC3199m2.this.f31423i, "OpenCaptureSession completer should not null");
                    AbstractC3199m2 abstractC3199m23 = AbstractC3199m2.this;
                    c.a aVar2 = abstractC3199m23.f31423i;
                    abstractC3199m23.f31423i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a aVar;
            try {
                AbstractC3199m2.this.D(cameraCaptureSession);
                AbstractC3199m2 abstractC3199m2 = AbstractC3199m2.this;
                abstractC3199m2.u(abstractC3199m2);
                synchronized (AbstractC3199m2.this.f31415a) {
                    H0.g.h(AbstractC3199m2.this.f31423i, "OpenCaptureSession completer should not null");
                    AbstractC3199m2 abstractC3199m22 = AbstractC3199m2.this;
                    aVar = abstractC3199m22.f31423i;
                    abstractC3199m22.f31423i = null;
                }
                aVar.c(null);
            } catch (Throwable th) {
                synchronized (AbstractC3199m2.this.f31415a) {
                    H0.g.h(AbstractC3199m2.this.f31423i, "OpenCaptureSession completer should not null");
                    AbstractC3199m2 abstractC3199m23 = AbstractC3199m2.this;
                    c.a aVar2 = abstractC3199m23.f31423i;
                    abstractC3199m23.f31423i = null;
                    aVar2.c(null);
                    throw th;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            AbstractC3199m2.this.D(cameraCaptureSession);
            AbstractC3199m2 abstractC3199m2 = AbstractC3199m2.this;
            abstractC3199m2.v(abstractC3199m2);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            AbstractC3199m2.this.D(cameraCaptureSession);
            AbstractC3199m2 abstractC3199m2 = AbstractC3199m2.this;
            abstractC3199m2.x(abstractC3199m2, surface);
        }
    }

    /* JADX INFO: renamed from: r.m2$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {
        static List a(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, CaptureRequest captureRequest) {
            return cameraConstrainedHighSpeedCaptureSession.createHighSpeedRequestList(captureRequest);
        }
    }

    AbstractC3199m2(C3208p1 c3208p1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f31416b = c3208p1;
        this.f31417c = handler;
        this.f31418d = executor;
        this.f31419e = scheduledExecutorService;
    }

    public static /* synthetic */ void A(AbstractC3199m2 abstractC3199m2, InterfaceC3175g2 interfaceC3175g2) {
        Objects.requireNonNull(abstractC3199m2.f31420f);
        abstractC3199m2.f31420f.C(interfaceC3175g2);
    }

    public static /* synthetic */ InterfaceFutureC2904a B(AbstractC3199m2 abstractC3199m2, List list, List list2) {
        abstractC3199m2.getClass();
        AbstractC3583h0.a("SyncCaptureSessionBase", "[" + abstractC3199m2 + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? J.n.n(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? J.n.n(new AbstractC0504q0.a("Surface closed", (AbstractC0504q0) list.get(list2.indexOf(null)))) : J.n.p(list2);
    }

    public static /* synthetic */ void y(AbstractC3199m2 abstractC3199m2, InterfaceC3175g2 interfaceC3175g2) {
        abstractC3199m2.f31416b.g(abstractC3199m2);
        abstractC3199m2.C(interfaceC3175g2);
        if (abstractC3199m2.f31421g != null) {
            Objects.requireNonNull(abstractC3199m2.f31420f);
            abstractC3199m2.f31420f.s(interfaceC3175g2);
            return;
        }
        AbstractC3583h0.l("SyncCaptureSessionBase", "[" + abstractC3199m2 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object z(AbstractC3199m2 abstractC3199m2, List list, s.F f10, C3356p c3356p, c.a aVar) {
        String str;
        synchronized (abstractC3199m2.f31415a) {
            abstractC3199m2.E(list);
            H0.g.j(abstractC3199m2.f31423i == null, "The openCaptureSessionCompleter can only set once!");
            abstractC3199m2.f31423i = aVar;
            f10.a(c3356p);
            str = "openCaptureSession[session=" + abstractC3199m2 + "]";
        }
        return str;
    }

    void D(CameraCaptureSession cameraCaptureSession) {
        if (this.f31421g == null) {
            this.f31421g = C3295i.e(cameraCaptureSession, this.f31417c);
        }
    }

    void E(List list) {
        synchronized (this.f31415a) {
            G();
            AbstractC0509t0.d(list);
            this.f31425k = list;
        }
    }

    boolean F() {
        boolean z10;
        synchronized (this.f31415a) {
            z10 = this.f31422h != null;
        }
        return z10;
    }

    void G() {
        synchronized (this.f31415a) {
            try {
                List list = this.f31425k;
                if (list != null) {
                    AbstractC0509t0.c(list);
                    this.f31425k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r.InterfaceC3175g2
    public void a() {
        H0.g.h(this.f31421g, "Need to call openCaptureSession before using this API.");
        this.f31421g.d().abortCaptures();
    }

    @Override // r.InterfaceC3175g2.a
    public Executor b() {
        return this.f31418d;
    }

    @Override // r.InterfaceC3175g2
    public void close() {
        H0.g.h(this.f31421g, "Need to call openCaptureSession before using this API.");
        this.f31416b.h(this);
        this.f31421g.d().close();
        b().execute(new Runnable() { // from class: r.k2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3199m2 abstractC3199m2 = this.f31372g;
                abstractC3199m2.C(abstractC3199m2);
            }
        });
    }

    @Override // r.InterfaceC3175g2
    public void d() throws CameraAccessException {
        H0.g.h(this.f31421g, "Need to call openCaptureSession before using this API.");
        this.f31421g.d().stopRepeating();
    }

    @Override // r.InterfaceC3175g2
    public void e() {
        G();
    }

    @Override // r.InterfaceC3175g2
    public int f(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        H0.g.h(this.f31421g, "Need to call openCaptureSession before using this API.");
        return this.f31421g.b(list, b(), captureCallback);
    }

    @Override // r.InterfaceC3175g2
    public int g(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        H0.g.h(this.f31421g, "Need to call openCaptureSession before using this API.");
        return this.f31421g.a(list, b(), captureCallback);
    }

    @Override // r.InterfaceC3175g2
    public C3295i h() {
        H0.g.g(this.f31421g);
        return this.f31421g;
    }

    @Override // r.InterfaceC3175g2
    public CameraDevice j() {
        H0.g.g(this.f31421g);
        return this.f31421g.d().getDevice();
    }

    @Override // r.InterfaceC3175g2
    public int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        H0.g.h(this.f31421g, "Need to call openCaptureSession before using this API.");
        return this.f31421g.c(captureRequest, b(), captureCallback);
    }

    @Override // r.InterfaceC3175g2
    public List l(CaptureRequest captureRequest) {
        CameraCaptureSession cameraCaptureSessionD = ((C3295i) H0.g.g(this.f31421g)).d();
        return cameraCaptureSessionD instanceof CameraConstrainedHighSpeedCaptureSession ? c.a((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSessionD, captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // r.InterfaceC3175g2.a
    public InterfaceFutureC2904a m(final List list, long j10) {
        synchronized (this.f31415a) {
            try {
                if (this.f31427m) {
                    return J.n.n(new CancellationException("Opener is disabled"));
                }
                J.d dVarE = J.d.a(AbstractC0509t0.e(list, false, j10, b(), this.f31419e)).e(new J.a() { // from class: r.i2
                    @Override // J.a
                    public final InterfaceFutureC2904a apply(Object obj) {
                        return AbstractC3199m2.B(this.f31359a, list, (List) obj);
                    }
                }, b());
                this.f31424j = dVarE;
                return J.n.s(dVarE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r.InterfaceC3175g2.a
    public InterfaceFutureC2904a o(CameraDevice cameraDevice, final C3356p c3356p, final List list) {
        synchronized (this.f31415a) {
            try {
                if (this.f31427m) {
                    return J.n.n(new CancellationException("Opener is disabled"));
                }
                this.f31416b.k(this);
                final s.F fB = s.F.b(cameraDevice, this.f31417c);
                InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.l2
                    @Override // androidx.concurrent.futures.c.InterfaceC0153c
                    public final Object a(c.a aVar) {
                        return AbstractC3199m2.z(this.f31407a, list, fB, c3356p, aVar);
                    }
                });
                this.f31422h = interfaceFutureC2904aA;
                J.n.j(interfaceFutureC2904aA, new a(), I.c.b());
                return J.n.s(this.f31422h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r.InterfaceC3175g2.a
    public C3356p p(int i10, List list, InterfaceC3175g2.c cVar) {
        this.f31420f = cVar;
        return new C3356p(i10, list, b(), new b());
    }

    @Override // r.InterfaceC3175g2.c
    public void q(InterfaceC3175g2 interfaceC3175g2) {
        Objects.requireNonNull(this.f31420f);
        this.f31420f.q(interfaceC3175g2);
    }

    @Override // r.InterfaceC3175g2.c
    public void r(InterfaceC3175g2 interfaceC3175g2) {
        Objects.requireNonNull(this.f31420f);
        this.f31420f.r(interfaceC3175g2);
    }

    @Override // r.InterfaceC3175g2.c
    public void s(final InterfaceC3175g2 interfaceC3175g2) {
        InterfaceFutureC2904a interfaceFutureC2904a;
        synchronized (this.f31415a) {
            try {
                if (this.f31426l) {
                    interfaceFutureC2904a = null;
                } else {
                    this.f31426l = true;
                    H0.g.h(this.f31422h, "Need to call openCaptureSession before using this API.");
                    interfaceFutureC2904a = this.f31422h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e();
        if (interfaceFutureC2904a != null) {
            interfaceFutureC2904a.h(new Runnable() { // from class: r.h2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3199m2.y(this.f31353g, interfaceC3175g2);
                }
            }, I.c.b());
        }
    }

    @Override // r.InterfaceC3175g2.a
    public boolean stop() {
        boolean z10;
        try {
            synchronized (this.f31415a) {
                try {
                    if (!this.f31427m) {
                        InterfaceFutureC2904a interfaceFutureC2904a = this.f31424j;
                        interfaceFutureC2904a = interfaceFutureC2904a != null ? interfaceFutureC2904a : null;
                        this.f31427m = true;
                    }
                    z10 = !F();
                } finally {
                }
            }
            return z10;
        } finally {
            if (interfaceFutureC2904a != null) {
                interfaceFutureC2904a.cancel(true);
            }
        }
    }

    @Override // r.InterfaceC3175g2.c
    public void t(InterfaceC3175g2 interfaceC3175g2) {
        Objects.requireNonNull(this.f31420f);
        e();
        this.f31416b.i(this);
        this.f31420f.t(interfaceC3175g2);
    }

    @Override // r.InterfaceC3175g2.c
    public void u(InterfaceC3175g2 interfaceC3175g2) {
        Objects.requireNonNull(this.f31420f);
        this.f31416b.j(this);
        this.f31420f.u(interfaceC3175g2);
    }

    @Override // r.InterfaceC3175g2.c
    public void v(InterfaceC3175g2 interfaceC3175g2) {
        Objects.requireNonNull(this.f31420f);
        this.f31420f.v(interfaceC3175g2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // r.InterfaceC3175g2.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void C(final InterfaceC3175g2 interfaceC3175g2) {
        InterfaceFutureC2904a interfaceFutureC2904a;
        synchronized (this.f31415a) {
            try {
                if (this.f31428n) {
                    interfaceFutureC2904a = null;
                } else {
                    this.f31428n = true;
                    H0.g.h(this.f31422h, "Need to call openCaptureSession before using this API.");
                    interfaceFutureC2904a = this.f31422h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceFutureC2904a != null) {
            interfaceFutureC2904a.h(new Runnable() { // from class: r.j2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3199m2.A(this.f31364g, interfaceC3175g2);
                }
            }, I.c.b());
        }
    }

    @Override // r.InterfaceC3175g2.c
    public void x(InterfaceC3175g2 interfaceC3175g2, Surface surface) {
        Objects.requireNonNull(this.f31420f);
        this.f31420f.x(interfaceC3175g2, surface);
    }

    @Override // r.InterfaceC3175g2
    public InterfaceC3175g2.c c() {
        return this;
    }

    /* JADX INFO: renamed from: r.m2$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {
        a() {
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            AbstractC3199m2.this.e();
            AbstractC3199m2 abstractC3199m2 = AbstractC3199m2.this;
            abstractC3199m2.f31416b.i(abstractC3199m2);
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    @Override // r.InterfaceC3175g2
    public void i(int i10) {
    }
}
