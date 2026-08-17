package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b9.a;
import b9.b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class NewHtcHomeBadger implements a {
    @Override // b9.a
    public List a() {
        return Collections.singletonList("com.htc.launcher");
    }

    @Override // b9.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        boolean z10;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i10);
        boolean z11 = false;
        try {
            d9.a.c(context, intent);
            z10 = true;
        } catch (b unused) {
            z10 = false;
        }
        try {
            d9.a.c(context, intent2);
            z11 = true;
        } catch (b unused2) {
        }
        if (z10 || z11) {
            return;
        }
        throw new b("unable to resolve intent: " + intent2.toString());
    }
}
