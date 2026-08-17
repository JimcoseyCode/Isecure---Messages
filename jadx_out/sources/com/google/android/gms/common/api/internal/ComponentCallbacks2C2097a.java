package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2097a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ComponentCallbacks2C2097a f21026k = new ComponentCallbacks2C2097a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f21027g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f21028h = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList f21029i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21030j = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0221a {
        void a(boolean z10);
    }

    private ComponentCallbacks2C2097a() {
    }

    public static ComponentCallbacks2C2097a b() {
        return f21026k;
    }

    public static void c(Application application) {
        ComponentCallbacks2C2097a componentCallbacks2C2097a = f21026k;
        synchronized (componentCallbacks2C2097a) {
            try {
                if (!componentCallbacks2C2097a.f21030j) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C2097a);
                    application.registerComponentCallbacks(componentCallbacks2C2097a);
                    componentCallbacks2C2097a.f21030j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f21026k) {
            try {
                Iterator it = this.f21029i.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0221a) it.next()).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InterfaceC0221a interfaceC0221a) {
        synchronized (f21026k) {
            this.f21029i.add(interfaceC0221a);
        }
    }

    public boolean d() {
        return this.f21027g.get();
    }

    public boolean e(boolean z10) {
        if (!this.f21028h.get()) {
            if (!y4.l.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f21028h.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f21027g.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f21028h;
        boolean zCompareAndSet = this.f21027g.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f21028h;
        boolean zCompareAndSet = this.f21027g.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f21027g.compareAndSet(false, true)) {
            this.f21028h.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
