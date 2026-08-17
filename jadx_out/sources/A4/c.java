package A4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f53a;

    public c(Context context) {
        this.f53a = context;
    }

    public int a(String str, String str2) {
        return this.f53a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo b(String str, int i10) {
        return this.f53a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence c(String str) {
        Context context = this.f53a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i10) {
        return this.f53a.getPackageManager().getPackageInfo(str, i10);
    }
}
