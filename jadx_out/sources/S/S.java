package s;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f32015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32016b = new ArrayMap(4);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f32017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CameraManager.AvailabilityCallback f32018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f32019c = new Object();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32020d = false;

        a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f32017a = executor;
            this.f32018b = availabilityCallback;
        }

        void d() {
            synchronized (this.f32019c) {
                this.f32020d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f32019c) {
                try {
                    if (!this.f32020d) {
                        this.f32017a.execute(new Runnable() { // from class: s.P
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC3293g.a(this.f32012g.f32018b);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f32019c) {
                try {
                    if (!this.f32020d) {
                        this.f32017a.execute(new Runnable() { // from class: s.O
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f32010g.f32018b.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f32019c) {
                try {
                    if (!this.f32020d) {
                        this.f32017a.execute(new Runnable() { // from class: s.Q
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f32013g.f32018b.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        static b e(Context context, Handler handler) {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? new V(context) : i10 >= 29 ? new U(context) : i10 >= 28 ? T.j(context) : W.i(context, handler);
        }

        CameraManager a();

        void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void c(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics d(String str);

        Set f();

        void g(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] h();
    }

    private S(b bVar) {
        this.f32015a = bVar;
    }

    public static S a(Context context) {
        return b(context, H.n.a());
    }

    public static S b(Context context, Handler handler) {
        return new S(b.e(context, handler));
    }

    public E c(String str) {
        E eK;
        synchronized (this.f32016b) {
            eK = (E) this.f32016b.get(str);
            if (eK == null) {
                try {
                    eK = E.k(this.f32015a.d(str), str);
                    this.f32016b.put(str, eK);
                } catch (AssertionError e10) {
                    throw new C3294h(10002, e10.getMessage(), e10);
                }
            }
        }
        return eK;
    }

    public String[] d() {
        return this.f32015a.h();
    }

    public Set e() {
        return this.f32015a.f();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f32015a.g(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f32015a.b(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f32015a.c(availabilityCallback);
    }

    public CameraManager i() {
        return this.f32015a.a();
    }
}
