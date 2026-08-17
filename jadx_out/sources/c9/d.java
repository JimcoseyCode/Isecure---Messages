package c9;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class d implements b9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19032a = -1;

    private void c(Context context, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // b9.a
    public List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // b9.a
    public void b(Context context, ComponentName componentName, int i10) {
        if (this.f19032a == i10) {
            return;
        }
        this.f19032a = i10;
        c(context, i10);
    }
}
