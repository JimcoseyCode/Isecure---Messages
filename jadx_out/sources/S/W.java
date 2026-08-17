package s;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import s.F;
import s.S;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class W implements S.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CameraManager f32021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f32022b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f32023a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Handler f32024b;

        a(Handler handler) {
            this.f32024b = handler;
        }
    }

    W(Context context, Object obj) {
        this.f32021a = (CameraManager) context.getSystemService("camera");
        this.f32022b = obj;
    }

    static W i(Context context, Handler handler) {
        return new W(context, new a(handler));
    }

    @Override // s.S.b
    public CameraManager a() {
        return this.f32021a;
    }

    @Override // s.S.b
    public void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        S.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f32022b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f32023a) {
                try {
                    aVar = (S.a) aVar2.f32023a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new S.a(executor, availabilityCallback);
                        aVar2.f32023a.put(availabilityCallback, aVar);
                    }
                } finally {
                }
            }
        } else {
            aVar = null;
        }
        this.f32021a.registerAvailabilityCallback(aVar, aVar2.f32024b);
    }

    @Override // s.S.b
    public void c(CameraManager.AvailabilityCallback availabilityCallback) {
        S.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f32022b;
            synchronized (aVar2.f32023a) {
                aVar = (S.a) aVar2.f32023a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.d();
        }
        this.f32021a.unregisterAvailabilityCallback(aVar);
    }

    @Override // s.S.b
    public CameraCharacteristics d(String str) throws C3294h {
        try {
            return this.f32021a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        }
    }

    @Override // s.S.b
    public Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // s.S.b
    public void g(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C3294h {
        H0.g.g(executor);
        H0.g.g(stateCallback);
        try {
            this.f32021a.openCamera(str, new F.b(executor, stateCallback), ((a) this.f32022b).f32024b);
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        }
    }

    @Override // s.S.b
    public String[] h() throws C3294h {
        try {
            return this.f32021a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        }
    }
}
