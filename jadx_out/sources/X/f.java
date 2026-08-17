package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f12220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f12221c;

    public f(Context context) {
        this.f12219a = context;
        if (Build.VERSION.SDK_INT >= 35) {
            this.f12221c = new d(context);
        }
        this.f12220b = b();
    }

    private g b() {
        String string;
        try {
            ServiceInfo[] serviceInfoArr = this.f12219a.getPackageManager().getPackageInfo(this.f12219a.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return null;
            }
            String str = null;
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                    if (str != null) {
                        throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                    }
                    str = string;
                }
            }
            if (str == null) {
                return null;
            }
            return c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private g c(String str) {
        try {
            return (g) Class.forName(str).getConstructor(Context.class).newInstance(this.f12219a);
        } catch (Exception e10) {
            throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e10);
        }
    }

    public e a(String str) {
        ArrayList arrayList = new ArrayList();
        g gVar = this.f12220b;
        if (gVar != null) {
            arrayList.add(gVar.a(str));
        }
        g gVar2 = this.f12221c;
        if (gVar2 != null) {
            try {
                arrayList.add(gVar2.a(str));
            } catch (UnsupportedOperationException unused) {
            }
        }
        return new a(arrayList);
    }
}
