package v;

import F.AbstractC0504q0;
import F.C0486h0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;
import q.C3091a;

/* JADX INFO: renamed from: v.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3409A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32735a;

    public C3409A() {
        this.f32735a = androidx.camera.camera2.internal.compat.quirk.b.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public C0486h0 a(C0486h0 c0486h0) {
        C0486h0.a aVar = new C0486h0.a();
        aVar.v(c0486h0.k());
        Iterator it = c0486h0.i().iterator();
        while (it.hasNext()) {
            aVar.f((AbstractC0504q0) it.next());
        }
        aVar.e(c0486h0.g());
        C3091a.C0345a c0345a = new C3091a.C0345a();
        c0345a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0345a.a());
        return aVar.h();
    }

    public boolean b(List list, boolean z10) {
        if (!this.f32735a || !z10) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
