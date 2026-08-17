package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class f16277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f16278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f16279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f16280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f16281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f16282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f16283g = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0158d f16284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f16285h;

        a(C0158d c0158d, Object obj) {
            this.f16284g = c0158d;
            this.f16285h = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16284g.f16290g = this.f16285h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Application f16286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ C0158d f16287h;

        b(Application application, C0158d c0158d) {
            this.f16286g = application;
            this.f16287h = c0158d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16286g.unregisterActivityLifecycleCallbacks(this.f16287h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f16288g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f16289h;

        c(Object obj, Object obj2) {
            this.f16288g = obj;
            this.f16289h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f16280d;
                if (method != null) {
                    method.invoke(this.f16288g, this.f16289h, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f16281e.invoke(this.f16288g, this.f16289h, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Class clsA = a();
        f16277a = clsA;
        f16278b = b();
        f16279c = f();
        f16280d = d(clsA);
        f16281e = c(clsA);
        f16282f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f16279c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f16283g.postAtFrontOfQueue(new c(f16278b.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f16282f == null) {
            return false;
        }
        if (f16281e == null && f16280d == null) {
            return false;
        }
        try {
            Object obj2 = f16279c.get(activity);
            if (obj2 == null || (obj = f16278b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0158d c0158d = new C0158d(activity);
            application.registerActivityLifecycleCallbacks(c0158d);
            Handler handler = f16283g;
            handler.post(new a(c0158d, obj2));
            try {
                if (g()) {
                    Method method = f16282f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0158d));
                return true;
            } catch (Throwable th) {
                f16283g.post(new b(application, c0158d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0158d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f16290g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Activity f16291h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f16292i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f16293j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f16294k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f16295l = false;

        C0158d(Activity activity) {
            this.f16291h = activity;
            this.f16292i = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f16291h == activity) {
                this.f16291h = null;
                this.f16294k = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f16294k || this.f16295l || this.f16293j || !d.h(this.f16290g, this.f16292i, activity)) {
                return;
            }
            this.f16295l = true;
            this.f16290g = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f16291h == activity) {
                this.f16293j = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
