package A4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f54b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f55a = null;

    public static c a(Context context) {
        return f54b.b(context);
    }

    public final synchronized c b(Context context) {
        try {
            if (this.f55a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f55a = new c(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f55a;
    }
}
