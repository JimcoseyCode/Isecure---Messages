package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class f extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f22639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22641c;

    public f() {
        this.f22640b = 0;
        this.f22641c = 0;
    }

    public int E() {
        g gVar = this.f22639a;
        if (gVar != null) {
            return gVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.G(view, i10);
    }

    public boolean G(int i10) {
        g gVar = this.f22639a;
        if (gVar != null) {
            return gVar.e(i10);
        }
        this.f22640b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f22639a == null) {
            this.f22639a = new g(view);
        }
        this.f22639a.c();
        this.f22639a.a();
        int i11 = this.f22640b;
        if (i11 != 0) {
            this.f22639a.e(i11);
            this.f22640b = 0;
        }
        int i12 = this.f22641c;
        if (i12 == 0) {
            return true;
        }
        this.f22639a.d(i12);
        this.f22641c = 0;
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22640b = 0;
        this.f22641c = 0;
    }
}
