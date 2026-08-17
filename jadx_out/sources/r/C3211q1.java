package r;

import F.InterfaceC0490j0;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.c;
import q.C3091a;
import r.E2;
import y.InterfaceC3586j;

/* JADX INFO: renamed from: r.q1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3211q1 implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s.E f31463a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.a f31465c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f31464b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f31466d = null;

    C3211q1(s.E e10) {
        this.f31463a = e10;
    }

    private static Rect h(Rect rect, float f10) {
        float fWidth = rect.width() / f10;
        float fHeight = rect.height() / f10;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    private Rect i() {
        return (Rect) H0.g.g((Rect) this.f31463a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // r.E2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f31465c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f31466d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f31465c.c(null);
            this.f31465c = null;
            this.f31466d = null;
        }
    }

    @Override // r.E2.b
    public void b(float f10, c.a aVar) {
        this.f31464b = h(i(), f10);
        c.a aVar2 = this.f31465c;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC3586j.a("There is a new zoomRatio being set"));
        }
        this.f31466d = this.f31464b;
        this.f31465c = aVar;
    }

    @Override // r.E2.b
    public float c() {
        Float f10 = (Float) this.f31463a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < e() ? e() : f10.floatValue();
    }

    @Override // r.E2.b
    public void d(C3091a.C0345a c0345a) {
        Rect rect = this.f31464b;
        if (rect != null) {
            c0345a.g(CaptureRequest.SCALER_CROP_REGION, rect, InterfaceC0490j0.c.REQUIRED);
        }
    }

    @Override // r.E2.b
    public float e() {
        return 1.0f;
    }

    @Override // r.E2.b
    public Rect f() {
        Rect rect = this.f31464b;
        return rect != null ? rect : i();
    }

    @Override // r.E2.b
    public void g() {
        this.f31466d = null;
        this.f31464b = null;
        c.a aVar = this.f31465c;
        if (aVar != null) {
            aVar.f(new InterfaceC3586j.a("Camera is not active."));
            this.f31465c = null;
        }
    }
}
