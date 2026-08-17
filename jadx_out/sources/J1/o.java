package J1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC1749q;
import com.bumptech.glide.load.resource.bitmap.S;
import m0.C2892a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class o implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f5343f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.k f5344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f5345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2892a f5346c = new C2892a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f5347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f5348e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements b {
        a() {
        }

        @Override // J1.o.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.k(bVar, jVar, pVar, context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f5343f : bVar;
        this.f5345b = bVar;
        this.f5348e = new m(bVar);
        this.f5347d = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (S.f19193f && S.f19192e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.k f(Context context) {
        if (this.f5344a == null) {
            synchronized (this) {
                try {
                    if (this.f5344a == null) {
                        this.f5344a = this.f5345b.a(com.bumptech.glide.b.d(context.getApplicationContext()), new J1.a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f5344a;
    }

    private static boolean g(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public com.bumptech.glide.k d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (Q1.l.s() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC1749q) {
                return e((AbstractActivityC1749q) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.k e(AbstractActivityC1749q abstractActivityC1749q) {
        if (Q1.l.r()) {
            return d(abstractActivityC1749q.getApplicationContext());
        }
        a(abstractActivityC1749q);
        this.f5347d.a(abstractActivityC1749q);
        boolean zG = g(abstractActivityC1749q);
        return this.f5348e.b(abstractActivityC1749q, com.bumptech.glide.b.d(abstractActivityC1749q.getApplicationContext()), abstractActivityC1749q.getLifecycle(), abstractActivityC1749q.getSupportFragmentManager(), zG);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
