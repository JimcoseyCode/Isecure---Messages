package A4;

import android.content.Context;
import y4.l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f51a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f52b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f51a;
        if (context2 != null && (bool = f52b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f52b = null;
        if (l.g()) {
            f52b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f52b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f52b = Boolean.FALSE;
            }
        }
        f51a = applicationContext;
        return f52b.booleanValue();
    }
}
