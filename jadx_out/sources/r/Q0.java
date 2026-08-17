package r;

import F.AbstractC0469b;
import android.hardware.camera2.CameraManager;
import androidx.concurrent.futures.c;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceFutureC2904a;
import s.C3294h;
import y.C3596p;
import y.C3600u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends AbstractC0469b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f31064i = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s.S f31065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f31066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CameraManager.AvailabilityCallback f31067h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends CameraManager.AvailabilityCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            Q0 q02 = Q0.this;
            q02.q(q02.d());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String cameraId) {
            AbstractC2855l.g(cameraId, "cameraId");
            Q0 q02 = Q0.this;
            q02.q(q02.d());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String cameraId) {
            AbstractC2855l.g(cameraId, "cameraId");
            Q0 q02 = Q0.this;
            q02.q(q02.d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(List initialCameraIds, s.S cameraManager, Executor systemCallbackExecutor) {
        super(initialCameraIds);
        AbstractC2855l.g(initialCameraIds, "initialCameraIds");
        AbstractC2855l.g(cameraManager, "cameraManager");
        AbstractC2855l.g(systemCallbackExecutor, "systemCallbackExecutor");
        this.f31065f = cameraManager;
        this.f31066g = systemCallbackExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(final Q0 q02, final c.a completer) {
        AbstractC2855l.g(completer, "completer");
        q02.f31066g.execute(new Runnable() { // from class: r.P0
            @Override // java.lang.Runnable
            public final void run() {
                Q0.p(this.f31050g, completer);
            }
        });
        return "FetchData for CameraAvailability";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Q0 q02, c.a aVar) {
        try {
            String[] strArrD = q02.f31065f.d();
            AbstractC2855l.f(strArrD, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList(strArrD.length);
            for (String str : strArrD) {
                C3596p.a aVar2 = C3596p.f33816c;
                AbstractC2855l.d(str);
                arrayList.add(C3596p.a.d(aVar2, str, null, null, 6, null));
            }
            AbstractC2800q.o0(arrayList, null, null, null, 0, null, null, 63, null);
            q02.i(arrayList);
            aVar.c(arrayList);
        } catch (C3294h e10) {
            C3600u c3600uA = Z0.a(e10);
            AbstractC2855l.f(c3600uA, "createFrom(...)");
            q02.j(c3600uA);
            aVar.f(c3600uA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(InterfaceFutureC2904a interfaceFutureC2904a) {
        J.n.z(interfaceFutureC2904a);
    }

    @Override // F.V0
    public InterfaceFutureC2904a d() {
        InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.O0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return Q0.o(this.f31046a, aVar);
            }
        });
        AbstractC2855l.f(interfaceFutureC2904aA, "getFuture(...)");
        return interfaceFutureC2904aA;
    }

    @Override // F.AbstractC0469b
    public void g() {
        if (this.f31067h != null) {
            h();
        }
        b bVar = new b();
        this.f31067h = bVar;
        s.S s10 = this.f31065f;
        Executor executor = this.f31066g;
        AbstractC2855l.d(bVar);
        s10.g(executor, bVar);
        q(d());
    }

    @Override // F.AbstractC0469b
    public void h() {
        CameraManager.AvailabilityCallback availabilityCallback = this.f31067h;
        if (availabilityCallback != null) {
            try {
                this.f31065f.h(availabilityCallback);
                C2735B c2735b = C2735B.f28704a;
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f31067h = null;
                throw th;
            }
            this.f31067h = null;
        }
    }
}
