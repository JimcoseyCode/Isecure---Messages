package r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m5.InterfaceFutureC2904a;
import s.C3295i;
import t.C3356p;

/* JADX INFO: renamed from: r.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3175g2 {

    /* JADX INFO: renamed from: r.g2$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        Executor b();

        InterfaceFutureC2904a m(List list, long j10);

        InterfaceFutureC2904a o(CameraDevice cameraDevice, C3356p c3356p, List list);

        C3356p p(int i10, List list, c cVar);

        boolean stop();
    }

    /* JADX INFO: renamed from: r.g2$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f31297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f31298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f31299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C3208p1 f31300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final F.g1 f31301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final F.g1 f31302f;

        b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C3208p1 c3208p1, F.g1 g1Var, F.g1 g1Var2) {
            this.f31297a = executor;
            this.f31298b = scheduledExecutorService;
            this.f31299c = handler;
            this.f31300d = c3208p1;
            this.f31301e = g1Var;
            this.f31302f = g1Var2;
        }

        a a() {
            return new q2(this.f31301e, this.f31302f, this.f31300d, this.f31297a, this.f31298b, this.f31299c);
        }
    }

    void a();

    c c();

    void close();

    void d();

    void e();

    int f(List list, CameraCaptureSession.CaptureCallback captureCallback);

    int g(List list, CameraCaptureSession.CaptureCallback captureCallback);

    C3295i h();

    void i(int i10);

    CameraDevice j();

    int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    List l(CaptureRequest captureRequest);

    InterfaceFutureC2904a n();

    /* JADX INFO: renamed from: r.g2$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class c {
        public abstract void t(InterfaceC3175g2 interfaceC3175g2);

        abstract void u(InterfaceC3175g2 interfaceC3175g2);

        abstract void v(InterfaceC3175g2 interfaceC3175g2);

        abstract void w(InterfaceC3175g2 interfaceC3175g2);

        void q(InterfaceC3175g2 interfaceC3175g2) {
        }

        void r(InterfaceC3175g2 interfaceC3175g2) {
        }

        public void s(InterfaceC3175g2 interfaceC3175g2) {
        }

        void x(InterfaceC3175g2 interfaceC3175g2, Surface surface) {
        }
    }
}
