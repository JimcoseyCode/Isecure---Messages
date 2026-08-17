package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC1688p0;
import androidx.core.view.l1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class E extends B {
    @Override // androidx.activity.C1626z, androidx.activity.H
    public void a(Y statusBarStyle, Y navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        AbstractC2855l.g(statusBarStyle, "statusBarStyle");
        AbstractC2855l.g(navigationBarStyle, "navigationBarStyle");
        AbstractC2855l.g(window, "window");
        AbstractC2855l.g(view, "view");
        AbstractC1688p0.c(window, false);
        window.setStatusBarColor(statusBarStyle.e(z10));
        window.setNavigationBarColor(navigationBarStyle.e(z11));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.c() == 0);
        l1 l1Var = new l1(window, view);
        l1Var.e(!z10);
        l1Var.d(true ^ z11);
    }
}
