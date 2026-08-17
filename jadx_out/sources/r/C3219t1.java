package r;

import F.InterfaceC0490j0;
import android.hardware.camera2.CaptureRequest;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import q.C3091a;
import r.C3232y;
import y.InterfaceC3586j;

/* JADX INFO: renamed from: r.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3219t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3232y f31496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3222u1 f31497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f31498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31499d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c.a f31500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3232y.c f31501f;

    C3219t1(C3232y c3232y, s.E e10, Executor executor) {
        this.f31496a = c3232y;
        this.f31497b = new C3222u1(e10, 0);
        this.f31498c = executor;
    }

    private void a() {
        c.a aVar = this.f31500e;
        if (aVar != null) {
            aVar.f(new InterfaceC3586j.a("Cancelled by another setExposureCompensationIndex()"));
            this.f31500e = null;
        }
        C3232y.c cVar = this.f31501f;
        if (cVar != null) {
            this.f31496a.g0(cVar);
            this.f31501f = null;
        }
    }

    void b(boolean z10) {
        if (z10 == this.f31499d) {
            return;
        }
        this.f31499d = z10;
        if (z10) {
            return;
        }
        this.f31497b.b(0);
        a();
    }

    void c(C3091a.C0345a c0345a) {
        c0345a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f31497b.a()), InterfaceC0490j0.c.REQUIRED);
    }
}
