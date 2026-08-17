package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import m0.i;

/* JADX INFO: renamed from: k.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2817b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f29083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f29084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f29085c;

    AbstractC2817b(Context context) {
        this.f29083a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof A0.b)) {
            return menuItem;
        }
        A0.b bVar = (A0.b) menuItem;
        if (this.f29084b == null) {
            this.f29084b = new i();
        }
        MenuItem menuItem2 = (MenuItem) this.f29084b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC2818c menuItemC2818c = new MenuItemC2818c(this.f29083a, bVar);
        this.f29084b.put(bVar, menuItemC2818c);
        return menuItemC2818c;
    }

    final void e() {
        i iVar = this.f29084b;
        if (iVar != null) {
            iVar.clear();
        }
        i iVar2 = this.f29085c;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    final void f(int i10) {
        if (this.f29084b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f29084b.size()) {
            if (((A0.b) this.f29084b.f(i11)).getGroupId() == i10) {
                this.f29084b.h(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f29084b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f29084b.size(); i11++) {
            if (((A0.b) this.f29084b.f(i11)).getItemId() == i10) {
                this.f29084b.h(i11);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
