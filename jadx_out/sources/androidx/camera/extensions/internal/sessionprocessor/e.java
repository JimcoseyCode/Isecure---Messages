package androidx.camera.extensions.internal.sessionprocessor;

import F.A;
import F.B;
import F.EnumC0510u;
import F.EnumC0512v;
import F.EnumC0514w;
import F.EnumC0516x;
import F.EnumC0518y;
import F.EnumC0520z;
import F.u1;
import H.i;
import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;
import java.util.Map;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class e implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f15283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u1 f15284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15285c;

    e(long j10, u1 u1Var, Map map) {
        this.f15283a = map;
        this.f15284b = u1Var;
        this.f15285c = j10;
    }

    @Override // F.B
    public long a() {
        return this.f15285c;
    }

    @Override // F.B
    public u1 b() {
        return this.f15284b;
    }

    @Override // F.B
    public A c() {
        Integer num = (Integer) this.f15283a.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return A.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return A.NONE;
        }
        if (iIntValue == 2) {
            return A.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return A.FIRED;
        }
        AbstractC3583h0.c("KeyValueMapCameraCaptureResult", "Undefined flash state: " + num);
        return A.UNKNOWN;
    }

    @Override // F.B
    public void d(i.b bVar) {
        super.d(bVar);
        try {
            Integer num = (Integer) this.f15283a.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC3583h0.l("KeyValueMapCameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f15283a.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f15283a.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer numValueOf = (Integer) this.f15283a.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) this.f15283a.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f11 = (Float) this.f15283a.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num2 = (Integer) this.f15283a.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            i.c cVar = i.c.AUTO;
            if (num2.intValue() == 0) {
                cVar = i.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // F.B
    public EnumC0520z e() {
        Integer num = (Integer) this.f15283a.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC0520z.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC0520z.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC0520z.METERING;
        }
        if (iIntValue == 2) {
            return EnumC0520z.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC0520z.LOCKED;
        }
        AbstractC3583h0.c("KeyValueMapCameraCaptureResult", "Undefined awb state: " + num);
        return EnumC0520z.UNKNOWN;
    }

    @Override // F.B
    public EnumC0518y f() {
        Integer num = (Integer) this.f15283a.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC0518y.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return EnumC0518y.UNKNOWN;
    }

    @Override // F.B
    public EnumC0514w g() {
        Integer num = (Integer) this.f15283a.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC0514w.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC0514w.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC0514w.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                AbstractC3583h0.c("KeyValueMapCameraCaptureResult", "Undefined af mode: " + num);
                return EnumC0514w.UNKNOWN;
            }
        }
        return EnumC0514w.OFF;
    }

    @Override // F.B
    public EnumC0512v h() {
        Integer num = (Integer) this.f15283a.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC0512v.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC0512v.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC0512v.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC0512v.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC0512v.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                AbstractC3583h0.c("KeyValueMapCameraCaptureResult", "Undefined ae state: " + num);
                return EnumC0512v.UNKNOWN;
            }
        }
        return EnumC0512v.SEARCHING;
    }

    @Override // F.B
    public CaptureResult i() {
        return null;
    }

    @Override // F.B
    public EnumC0510u j() {
        Integer num = (Integer) this.f15283a.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return EnumC0510u.UNKNOWN;
        }
        int iIntValue = num.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? EnumC0510u.UNKNOWN : EnumC0510u.ON_EXTERNAL_FLASH : EnumC0510u.ON_AUTO_FLASH_REDEYE : EnumC0510u.ON_ALWAYS_FLASH : EnumC0510u.ON_AUTO_FLASH : EnumC0510u.ON : EnumC0510u.OFF;
    }

    @Override // F.B
    public EnumC0516x k() {
        Integer num = (Integer) this.f15283a.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC0516x.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                AbstractC3583h0.c("KeyValueMapCameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC0516x.UNKNOWN;
    }
}
