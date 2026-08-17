package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.view.menu.e f23579a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23581c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23582d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23583e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23580b = new ArrayList();

    g(androidx.appcompat.view.menu.e eVar) {
        this.f23579a = eVar;
        f();
    }

    public int a() {
        return this.f23581c;
    }

    public MenuItem b(int i10) {
        return (MenuItem) this.f23580b.get(i10);
    }

    public int c() {
        return this.f23582d;
    }

    public int d() {
        return this.f23583e;
    }

    public boolean e(MenuItem menuItem, androidx.appcompat.view.menu.j jVar, int i10) {
        return this.f23579a.P(menuItem, jVar, i10);
    }

    public void f() {
        this.f23580b.clear();
        this.f23581c = 0;
        this.f23582d = 0;
        this.f23583e = 0;
        for (int i10 = 0; i10 < this.f23579a.size(); i10++) {
            MenuItem item = this.f23579a.getItem(i10);
            if (item.hasSubMenu()) {
                if (!this.f23580b.isEmpty()) {
                    if (!(this.f23580b.get(r3.size() - 1) instanceof a) && item.isVisible()) {
                        this.f23580b.add(new a());
                    }
                }
                this.f23580b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i11 = 0; i11 < subMenu.size(); i11++) {
                    MenuItem item2 = subMenu.getItem(i11);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f23580b.add(item2);
                    this.f23581c++;
                    if (item2.isVisible()) {
                        this.f23582d++;
                    }
                }
                this.f23580b.add(new a());
            } else {
                this.f23580b.add(item);
                this.f23581c++;
                if (item.isVisible()) {
                    this.f23582d++;
                    this.f23583e++;
                }
            }
        }
        if (this.f23580b.isEmpty()) {
            return;
        }
        if (this.f23580b.get(r0.size() - 1) instanceof a) {
            this.f23580b.remove(r0.size() - 1);
        }
    }

    public int g() {
        return this.f23580b.size();
    }
}
