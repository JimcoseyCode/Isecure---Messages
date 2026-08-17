package com.swmansion.rnscreens.gamma.tabs;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.material.bottomnavigation.c f25265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25266b;

    public o(com.google.android.material.bottomnavigation.c bottomNavigationView, List tabScreenFragments) {
        AbstractC2855l.g(bottomNavigationView, "bottomNavigationView");
        AbstractC2855l.g(tabScreenFragments, "tabScreenFragments");
        this.f25265a = bottomNavigationView;
        this.f25266b = tabScreenFragments;
    }

    public final void a() {
        int i10 = 0;
        for (Object obj : this.f25266b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            Menu menu = this.f25265a.getMenu();
            AbstractC2855l.f(menu, "getMenu(...)");
            b(menu.getItem(i10), ((e) obj).w());
            i10 = i11;
        }
    }

    public final void b(MenuItem menuItem, a tabScreen) {
        AbstractC2855l.g(menuItem, "menuItem");
        AbstractC2855l.g(tabScreen, "tabScreen");
        com.google.android.material.navigation.e eVar = (com.google.android.material.navigation.e) this.f25265a.findViewById(menuItem.getItemId());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(tabScreen.getTabBarItemAccessibilityLabel());
        }
        eVar.setTag(tabScreen.getTabBarItemTestID());
    }
}
