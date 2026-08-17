package H5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import z5.InterfaceC3678c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f3798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3678c f3799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3800d;

    public a(Context context, String str, InterfaceC3678c interfaceC3678c) {
        Context contextA = a(context);
        this.f3797a = contextA;
        this.f3798b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f3799c = interfaceC3678c;
        this.f3800d = c();
    }

    private static Context a(Context context) {
        return androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f3798b.contains("firebase_data_collection_default_enabled") ? this.f3798b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f3797a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f3797a.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f3800d;
    }
}
