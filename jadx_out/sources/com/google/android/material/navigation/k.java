package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class k extends FrameLayout implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextView f23635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f23637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f23638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f23639k;

    k(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(Q4.g.f9333f, (ViewGroup) this, true);
        this.f23635g = (TextView) findViewById(Q4.e.f9286P);
    }

    private void a() {
        androidx.appcompat.view.menu.g gVar = this.f23638j;
        if (gVar != null) {
            setVisibility((!gVar.isVisible() || (!this.f23636h && this.f23637i)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f23638j = gVar;
        gVar.setCheckable(false);
        this.f23635g.setText(gVar.getTitle());
        a();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f23638j;
    }

    @Override // com.google.android.material.navigation.h
    public void setExpanded(boolean z10) {
        this.f23636h = z10;
        a();
    }

    @Override // com.google.android.material.navigation.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f23637i = z10;
        a();
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.i.m(this.f23635g, i10);
        ColorStateList colorStateList = this.f23639k;
        if (colorStateList != null) {
            this.f23635g.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f23639k = colorStateList;
        if (colorStateList != null) {
            this.f23635g.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
