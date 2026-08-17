package s;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class T extends W {
    T(Context context) {
        super(context, null);
    }

    static T j(Context context) {
        return new T(context);
    }

    private boolean k(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && l(th);
    }

    private static boolean l(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void m(Throwable th) throws C3294h {
        throw new C3294h(10001, th);
    }

    @Override // s.W, s.S.b
    public void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f32021a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // s.W, s.S.b
    public void c(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f32021a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // s.W, s.S.b
    public CameraCharacteristics d(String str) throws C3294h {
        try {
            return super.d(str);
        } catch (RuntimeException e10) {
            if (k(e10)) {
                m(e10);
            }
            throw e10;
        }
    }

    @Override // s.W, s.S.b
    public void g(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C3294h {
        try {
            this.f32021a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (k(e13)) {
                m(e13);
            }
            throw e13;
        }
    }
}
