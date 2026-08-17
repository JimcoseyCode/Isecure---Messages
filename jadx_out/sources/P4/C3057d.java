package p4;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC1749q;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: p4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3057d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30637a;

    public C3057d(Activity activity) {
        AbstractC3268i.l(activity, "Activity must not be null");
        this.f30637a = activity;
    }

    public final Activity a() {
        return (Activity) this.f30637a;
    }

    public final AbstractActivityC1749q b() {
        return (AbstractActivityC1749q) this.f30637a;
    }

    public final boolean c() {
        return this.f30637a instanceof Activity;
    }

    public final boolean d() {
        return this.f30637a instanceof AbstractActivityC1749q;
    }
}
