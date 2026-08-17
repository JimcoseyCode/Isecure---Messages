package p4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: p4.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3070q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f30641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3069p f30642b;

    public C3070q(AbstractC3069p abstractC3069p) {
        this.f30642b = abstractC3069p;
    }

    public final void a(Context context) {
        this.f30641a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f30641a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f30641a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f30642b.a();
            b();
        }
    }
}
