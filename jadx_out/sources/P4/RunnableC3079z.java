package p4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: renamed from: p4.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3079z implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f30660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f30661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ FragmentC3051A f30662i;

    RunnableC3079z(FragmentC3051A fragmentC3051A, LifecycleCallback lifecycleCallback, String str) {
        this.f30662i = fragmentC3051A;
        this.f30660g = lifecycleCallback;
        this.f30661h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        FragmentC3051A fragmentC3051A = this.f30662i;
        if (fragmentC3051A.f30624h > 0) {
            LifecycleCallback lifecycleCallback = this.f30660g;
            if (fragmentC3051A.f30625i != null) {
                bundle = fragmentC3051A.f30625i.getBundle(this.f30661h);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f30662i.f30624h >= 2) {
            this.f30660g.j();
        }
        if (this.f30662i.f30624h >= 3) {
            this.f30660g.h();
        }
        if (this.f30662i.f30624h >= 4) {
            this.f30660g.k();
        }
        if (this.f30662i.f30624h >= 5) {
            this.f30660g.g();
        }
    }
}
