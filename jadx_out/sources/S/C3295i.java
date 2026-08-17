package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: s.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3295i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f32035a;

    /* JADX INFO: renamed from: s.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        CameraCaptureSession a();

        int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int d(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* JADX INFO: renamed from: s.i$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f32036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f32037b;

        b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f32037b = executor;
            this.f32036a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.f32037b.execute(new Runnable() { // from class: s.o
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3289c.a(this.f32061g.f32036a, cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f32037b.execute(new Runnable() { // from class: s.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32045g.f32036a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f32037b.execute(new Runnable() { // from class: s.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32057g.f32036a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f32037b.execute(new Runnable() { // from class: s.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32049g.f32036a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.f32037b.execute(new Runnable() { // from class: s.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32066g.f32036a.onCaptureSequenceAborted(cameraCaptureSession, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.f32037b.execute(new Runnable() { // from class: s.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32053g.f32036a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f32037b.execute(new Runnable() { // from class: s.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32040g.f32036a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s.i$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.StateCallback f32038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f32039b;

        c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f32039b = executor;
            this.f32038a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f32039b.execute(new Runnable() { // from class: s.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32069g.f32038a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f32039b.execute(new Runnable() { // from class: s.t
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3291e.a(this.f32076g.f32038a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f32039b.execute(new Runnable() { // from class: s.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32071g.f32038a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f32039b.execute(new Runnable() { // from class: s.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32082g.f32038a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f32039b.execute(new Runnable() { // from class: s.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32078g.f32038a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f32039b.execute(new Runnable() { // from class: s.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32080g.f32038a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f32039b.execute(new Runnable() { // from class: s.s
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3288b.a(this.f32073g.f32038a, cameraCaptureSession, surface);
                }
            });
        }
    }

    private C3295i(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f32035a = new C3309x(cameraCaptureSession);
        } else {
            this.f32035a = C3310y.e(cameraCaptureSession, handler);
        }
    }

    public static C3295i e(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C3295i(cameraCaptureSession, handler);
    }

    public int a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32035a.c(list, executor, captureCallback);
    }

    public int b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32035a.d(list, executor, captureCallback);
    }

    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32035a.b(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession d() {
        return this.f32035a.a();
    }
}
