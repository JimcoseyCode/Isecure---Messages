package c9;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class h implements b9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f19033a = Uri.parse("content://com.android.badge/badge");

    @Override // b9.a
    public List a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // b9.a
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f19033a, "setAppBadgeCount", (String) null, bundle);
    }
}
