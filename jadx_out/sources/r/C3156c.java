package r;

import F.InterfaceC0490j0;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.concurrent.futures.c;
import q.C3091a;
import r.E2;
import t.C3342b;
import y.InterfaceC3586j;

/* JADX INFO: renamed from: r.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3156c implements E2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s.E f31222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Range f31223b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.a f31225d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31227f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31224c = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f31226e = 1.0f;

    C3156c(s.E e10) {
        this.f31227f = false;
        this.f31222a = e10;
        this.f31223b = (Range) e10.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f31227f = e10.i();
    }

    @Override // r.E2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f31225d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f31226e == f10.floatValue()) {
                this.f31225d.c(null);
                this.f31225d = null;
            }
        }
    }

    @Override // r.E2.b
    public void b(float f10, c.a aVar) {
        this.f31224c = f10;
        c.a aVar2 = this.f31225d;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC3586j.a("There is a new zoomRatio being set"));
        }
        this.f31226e = this.f31224c;
        this.f31225d = aVar;
    }

    @Override // r.E2.b
    public float c() {
        return ((Float) this.f31223b.getUpper()).floatValue();
    }

    @Override // r.E2.b
    public void d(C3091a.C0345a c0345a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f31224c);
        InterfaceC0490j0.c cVar = InterfaceC0490j0.c.REQUIRED;
        c0345a.g(key, fValueOf, cVar);
        if (this.f31227f) {
            C3342b.a(c0345a, cVar);
        }
    }

    @Override // r.E2.b
    public float e() {
        return ((Float) this.f31223b.getLower()).floatValue();
    }

    @Override // r.E2.b
    public Rect f() {
        return (Rect) H0.g.g((Rect) this.f31222a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // r.E2.b
    public void g() {
        this.f31224c = 1.0f;
        c.a aVar = this.f31225d;
        if (aVar != null) {
            aVar.f(new InterfaceC3586j.a("Camera is not active."));
            this.f31225d = null;
        }
    }
}
