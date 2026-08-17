package m4;

import P4.AbstractC1378l;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import z4.ThreadFactoryC3675a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static w f29616e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f29618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f29619c = new q(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29620d = 1;

    w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f29618b = scheduledExecutorService;
        this.f29617a = context.getApplicationContext();
    }

    public static synchronized w b(Context context) {
        try {
            if (f29616e == null) {
                E4.e.a();
                f29616e = new w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC3675a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f29616e;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f29620d;
        this.f29620d = i10 + 1;
        return i10;
    }

    private final synchronized AbstractC1378l g(t tVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(tVar.toString());
            }
            if (!this.f29619c.g(tVar)) {
                q qVar = new q(this, null);
                this.f29619c = qVar;
                qVar.g(tVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return tVar.f29613b.a();
    }

    public final AbstractC1378l c(int i10, Bundle bundle) {
        return g(new s(f(), i10, bundle));
    }

    public final AbstractC1378l d(int i10, Bundle bundle) {
        return g(new v(f(), i10, bundle));
    }
}
