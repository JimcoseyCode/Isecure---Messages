package q;

import F.InterfaceC0490j0;
import F.R0;
import F.S0;
import F.X0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import x.l;
import y.InterfaceC3564I;

/* JADX INFO: renamed from: q.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3091a extends x.l {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0490j0.a f30707Q = InterfaceC0490j0.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC0490j0.a f30708R = InterfaceC0490j0.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0490j0.a f30709S = InterfaceC0490j0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC0490j0.a f30710T = InterfaceC0490j0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC0490j0.a f30711U = InterfaceC0490j0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC0490j0.a f30712V = InterfaceC0490j0.a.a("camera2.captureRequest.tag", Object.class);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC0490j0.a f30713W = InterfaceC0490j0.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* JADX INFO: renamed from: q.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0345a implements InterfaceC3564I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S0 f30714a = S0.i0();

        public C3091a a() {
            return new C3091a(X0.h0(this.f30714a));
        }

        @Override // y.InterfaceC3564I
        public R0 b() {
            return this.f30714a;
        }

        public C0345a d(InterfaceC0490j0 interfaceC0490j0) {
            e(interfaceC0490j0, InterfaceC0490j0.c.OPTIONAL);
            return this;
        }

        public C0345a e(InterfaceC0490j0 interfaceC0490j0, InterfaceC0490j0.c cVar) {
            for (InterfaceC0490j0.a aVar : interfaceC0490j0.a()) {
                this.f30714a.t(aVar, cVar, interfaceC0490j0.d(aVar));
            }
            return this;
        }

        public C0345a f(CaptureRequest.Key key, Object obj) {
            this.f30714a.X(C3091a.f0(key), obj);
            return this;
        }

        public C0345a g(CaptureRequest.Key key, Object obj, InterfaceC0490j0.c cVar) {
            this.f30714a.t(C3091a.f0(key), cVar, obj);
            return this;
        }
    }

    public C3091a(InterfaceC0490j0 interfaceC0490j0) {
        super(interfaceC0490j0);
    }

    public static InterfaceC0490j0.a f0(CaptureRequest.Key key) {
        return InterfaceC0490j0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public x.l g0() {
        return l.a.e(o()).d();
    }

    public int h0(int i10) {
        return ((Integer) o().f(f30707Q, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback i0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) o().f(f30709S, stateCallback);
    }

    public String j0(String str) {
        return (String) o().f(f30713W, str);
    }

    public CameraCaptureSession.CaptureCallback k0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) o().f(f30711U, captureCallback);
    }

    public CameraCaptureSession.StateCallback l0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) o().f(f30710T, stateCallback);
    }

    public long m0(long j10) {
        return ((Long) o().f(f30708R, Long.valueOf(j10))).longValue();
    }
}
