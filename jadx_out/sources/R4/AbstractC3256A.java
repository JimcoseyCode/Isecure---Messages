package r4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: r4.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3256A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f31898a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f31899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f31900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f31901d;

    public static int a(Context context) {
        b(context);
        return f31901d;
    }

    private static void b(Context context) {
        synchronized (f31898a) {
            try {
                if (f31899b) {
                    return;
                }
                f31899b = true;
                try {
                    Bundle bundle = A4.d.a(context).b(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f31900c = bundle.getString("com.google.app.id");
                    f31901d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
