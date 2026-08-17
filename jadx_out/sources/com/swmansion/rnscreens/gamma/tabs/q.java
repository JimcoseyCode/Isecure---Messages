package com.swmansion.rnscreens.gamma.tabs;

import android.view.Menu;
import android.view.MenuItem;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.material.bottomnavigation.c f25269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f25271c;

    public q(androidx.appcompat.view.d context, com.google.android.material.bottomnavigation.c bottomNavigationView, List tabScreenFragments) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(bottomNavigationView, "bottomNavigationView");
        AbstractC2855l.g(tabScreenFragments, "tabScreenFragments");
        this.f25269a = bottomNavigationView;
        this.f25270b = tabScreenFragments;
        this.f25271c = new p(context, bottomNavigationView);
    }

    private final void b() {
        Menu menu = this.f25269a.getMenu();
        AbstractC2855l.f(menu, "getMenu(...)");
        if (menu.size() != this.f25270b.size()) {
            this.f25269a.getMenu().clear();
        }
        int i10 = 0;
        for (Object obj : this.f25270b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            e eVar = (e) obj;
            Menu menu2 = this.f25269a.getMenu();
            AbstractC2855l.f(menu2, "getMenu(...)");
            MenuItem menuItemB = r.b(menu2, i10, eVar.w());
            if (menuItemB.getItemId() != i10) {
                throw new IllegalStateException("[RNScreens] Illegal state: menu items are shuffled");
            }
            a(menuItemB, eVar.w());
            i10 = i11;
        }
    }

    public final void a(MenuItem menuItem, a tabScreen) {
        AbstractC2855l.g(menuItem, "menuItem");
        AbstractC2855l.g(tabScreen, "tabScreen");
        this.f25271c.d(menuItem, tabScreen);
        this.f25271c.b(menuItem, tabScreen);
    }

    public final void c(l tabsHost) {
        AbstractC2855l.g(tabsHost, "tabsHost");
        this.f25271c.e(tabsHost);
        b();
        this.f25271c.c(tabsHost);
    }
}
