package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends androidx.appcompat.view.menu.e {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Class f23576B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f23577C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f23578D;

    public f(Context context, Class cls, int i10, boolean z10) {
        super(context);
        this.f23576B = cls;
        this.f23577C = i10;
        this.f23578D = z10;
    }

    @Override // androidx.appcompat.view.menu.e
    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.f23577C) {
            i0();
            MenuItem menuItemA = super.a(i10, i11, i12, charSequence);
            h0();
            return menuItemA;
        }
        String simpleName = this.f23576B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f23577C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        if (this.f23578D) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i10, i11, i12, charSequence);
            j jVar = new j(w(), this, gVar);
            gVar.x(jVar);
            return jVar;
        }
        throw new UnsupportedOperationException(this.f23576B.getSimpleName() + " does not support submenus");
    }
}
