package r;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.concurrent.futures.c;
import androidx.lifecycle.AbstractC1776x;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import r.C3232y;
import y.InterfaceC3586j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3232y f31086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.A f31087b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31089d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f31092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    c.a f31094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f31095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final C3232y.c f31096k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f31088c = new AtomicInteger(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f31090e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31091f = false;

    U1(C3232y c3232y, s.E e10, Executor executor) {
        this.f31086a = c3232y;
        this.f31092g = executor;
        boolean zB = b(e10);
        this.f31089d = zB;
        this.f31087b = new androidx.lifecycle.A(-1);
        C3232y.c cVar = new C3232y.c() { // from class: r.T1
            @Override // r.C3232y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return U1.a(this.f31083a, totalCaptureResult);
            }
        };
        this.f31096k = cVar;
        if (zB) {
            c3232y.B(cVar);
        }
    }

    public static /* synthetic */ boolean a(U1 u12, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (u12.f31094i != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AE_MODE);
            if (num2 != null) {
                if ((num2.intValue() == 6) == u12.f31095j) {
                    u12.f31094i.c(null);
                    u12.f31094i = null;
                    if (Build.VERSION.SDK_INT >= 35) {
                        u12.e(u12.f31087b, num.intValue());
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 35 && u12.f31095j && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) != null) {
            u12.e(u12.f31087b, num.intValue());
        }
        return false;
    }

    static boolean b(s.E e10) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) e10.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    private void e(androidx.lifecycle.A a10, int i10) {
        if (this.f31088c.getAndSet(i10) != i10) {
            if (H.y.d()) {
                a10.n(Integer.valueOf(i10));
            } else {
                a10.l(Integer.valueOf(i10));
            }
        }
    }

    AbstractC1776x c() {
        return this.f31087b;
    }

    void d(boolean z10) {
        if (this.f31093h == z10) {
            return;
        }
        this.f31093h = z10;
        if (z10) {
            return;
        }
        if (this.f31095j) {
            this.f31095j = false;
            this.f31086a.E(false);
            e(this.f31087b, -1);
        }
        c.a aVar = this.f31094i;
        if (aVar != null) {
            aVar.f(new InterfaceC3586j.a("Camera is not active."));
            this.f31094i = null;
        }
    }

    void f(boolean z10) {
        synchronized (this.f31090e) {
            try {
                this.f31091f = z10;
                if (z10) {
                    if (this.f31095j) {
                        this.f31095j = false;
                        this.f31086a.E(false);
                        e(this.f31087b, -1);
                        c.a aVar = this.f31094i;
                        if (aVar != null) {
                            aVar.f(new IllegalStateException("Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."));
                            this.f31094i = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
