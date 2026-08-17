package p4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: renamed from: p4.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3052B implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f30626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f30627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ C3053C f30628i;

    RunnableC3052B(C3053C c3053c, LifecycleCallback lifecycleCallback, String str) {
        this.f30628i = c3053c;
        this.f30626g = lifecycleCallback;
        this.f30627h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        C3053C c3053c = this.f30628i;
        if (c3053c.f30631h > 0) {
            LifecycleCallback lifecycleCallback = this.f30626g;
            if (c3053c.f30632i != null) {
                bundle = c3053c.f30632i.getBundle(this.f30627h);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f30628i.f30631h >= 2) {
            this.f30626g.j();
        }
        if (this.f30628i.f30631h >= 3) {
            this.f30626g.h();
        }
        if (this.f30628i.f30631h >= 4) {
            this.f30626g.k();
        }
        if (this.f30628i.f30631h >= 5) {
            this.f30626g.g();
        }
    }
}
