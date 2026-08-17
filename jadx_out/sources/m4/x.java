package m4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29623c = 0;

    public x(Context context) {
        this.f29621a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoD;
        if (this.f29622b == 0) {
            try {
                packageInfoD = A4.d.a(this.f29621a).d("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                "Failed to find package ".concat(e10.toString());
                packageInfoD = null;
            }
            if (packageInfoD != null) {
                this.f29622b = packageInfoD.versionCode;
            }
        }
        return this.f29622b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:3:0x0001, B:7:0x0007, B:12:0x001f, B:14:0x0026, B:16:0x0038, B:26:0x005b, B:21:0x0041, B:23:0x0054, B:29:0x005f, B:33:0x0067), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int b() {
        try {
            int i10 = this.f29623c;
            if (i10 != 0) {
                return i10;
            }
            Context context = this.f29621a;
            PackageManager packageManager = context.getPackageManager();
            if (A4.d.a(context).a("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i11 = 1;
            if (!y4.l.g()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
                        if (true == y4.l.g()) {
                            i11 = 2;
                        }
                        this.f29623c = i11;
                        return i11;
                    }
                    i11 = 2;
                }
            }
            this.f29623c = i11;
            return i11;
        } catch (Throwable th) {
            throw th;
        }
    }
}
