package com.swmansion.rnscreens.gamma.tabs;

import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuItem b(Menu menu, int i10, a aVar) {
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem != null) {
            return menuItemFindItem;
        }
        MenuItem menuItemAdd = menu.add(0, i10, 0, aVar.getTabTitle());
        AbstractC2855l.f(menuItemAdd, "add(...)");
        return menuItemAdd;
    }
}
