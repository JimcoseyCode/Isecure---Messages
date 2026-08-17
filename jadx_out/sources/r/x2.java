package r;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.concurrent.futures.c;
import androidx.lifecycle.AbstractC1776x;
import java.util.Objects;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;
import r.C3232y;
import y.AbstractC3583h0;
import y.InterfaceC3586j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3232y f31534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.A f31535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.A f31536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f31538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c.a f31543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    c.a f31544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f31545l;

    x2(C3232y c3232y, s.E e10, Executor executor) {
        this.f31534a = c3232y;
        this.f31538e = executor;
        Objects.requireNonNull(e10);
        boolean zA = v.g.a(new C3149a0(e10));
        this.f31537d = zA;
        boolean zH = e10.h();
        this.f31540g = zH;
        int iC = (zA && zH) ? e10.c() : 0;
        this.f31541h = iC;
        this.f31542i = iC;
        this.f31535b = new androidx.lifecycle.A(0);
        this.f31536c = new androidx.lifecycle.A(Integer.valueOf(this.f31541h));
        c3232y.B(new C3232y.c() { // from class: r.v2
            @Override // r.C3232y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return x2.b(this.f31516a, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ boolean b(x2 x2Var, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (x2Var.f31544k != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num2 != null && num2.intValue() == 2) == x2Var.f31545l) {
                x2Var.f31544k.c(null);
                x2Var.f31544k = null;
            }
        }
        if (x2Var.f31540g && Build.VERSION.SDK_INT >= 35 && x2Var.f31543j != null && (num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STRENGTH_LEVEL)) != null && num.intValue() == x2Var.f31542i) {
            x2Var.f31543j.c(null);
            x2Var.f31543j = null;
        }
        return false;
    }

    public static /* synthetic */ Object c(final x2 x2Var, final int i10, boolean z10, final c.a aVar) {
        x2Var.f31538e.execute(new Runnable() { // from class: r.w2
            @Override // java.lang.Runnable
            public final void run() {
                this.f31525g.e(aVar, i10);
            }
        });
        return "enableTorch: " + z10;
    }

    private void j(androidx.lifecycle.A a10, Object obj) {
        if (H.y.d()) {
            a10.n(obj);
        } else {
            a10.l(obj);
        }
    }

    private void k(int i10) {
        j(this.f31535b, Integer.valueOf(i10 != 1 ? 0 : 1));
    }

    InterfaceFutureC2904a d(final boolean z10) {
        if (!this.f31537d) {
            AbstractC3583h0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return J.n.n(new IllegalStateException("No flash unit"));
        }
        k(z10 ? 1 : 0);
        final int i10 = z10 ? 1 : 0;
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.u2
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return x2.c(this.f31508a, i10, z10, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(c.a aVar, int i10) {
        if (!this.f31537d) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f31539f) {
            k(0);
            if (aVar != null) {
                aVar.f(new InterfaceC3586j.a("Camera is not active."));
                return;
            }
            return;
        }
        if (this.f31534a.b0()) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("Torch can not be enabled when low-light boost is on!"));
                return;
            }
            return;
        }
        this.f31545l = i10 != 0;
        this.f31534a.F(i10);
        k(i10);
        c.a aVar2 = this.f31544k;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC3586j.a("There is a new enableTorch being set"));
        }
        this.f31544k = aVar;
    }

    void f() {
        if (this.f31545l) {
            this.f31545l = false;
            k(0);
        }
    }

    AbstractC1776x g() {
        return this.f31535b;
    }

    AbstractC1776x h() {
        return this.f31536c;
    }

    void i(boolean z10) {
        if (this.f31539f == z10) {
            return;
        }
        this.f31539f = z10;
        if (z10) {
            return;
        }
        if (this.f31545l) {
            this.f31545l = false;
            this.f31542i = this.f31541h;
            this.f31534a.F(0);
            k(0);
            j(this.f31536c, Integer.valueOf(this.f31541h));
        }
        c.a aVar = this.f31544k;
        if (aVar != null) {
            aVar.f(new InterfaceC3586j.a("Camera is not active."));
            this.f31544k = null;
        }
        c.a aVar2 = this.f31543j;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC3586j.a("Camera is not active."));
            this.f31543j = null;
        }
    }
}
