package s;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import t.C3356p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f31995a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        void a(C3356p c3356p);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CameraDevice.StateCallback f31996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f31997b;

        b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f31997b = executor;
            this.f31996a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f31997b.execute(new Runnable() { // from class: s.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31998g.f31996a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f31997b.execute(new Runnable() { // from class: s.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32003g.f31996a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.f31997b.execute(new Runnable() { // from class: s.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32000g.f31996a.onError(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f31997b.execute(new Runnable() { // from class: s.J
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32005g.f31996a.onOpened(cameraDevice);
                }
            });
        }
    }

    private F(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f31995a = new M(cameraDevice);
        } else {
            this.f31995a = L.e(cameraDevice, handler);
        }
    }

    public static F b(CameraDevice cameraDevice, Handler handler) {
        return new F(cameraDevice, handler);
    }

    public void a(C3356p c3356p) {
        this.f31995a.a(c3356p);
    }
}
