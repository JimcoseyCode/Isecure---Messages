package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.AbstractC1658a0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f22642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22647f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22648g = true;

    public g(View view) {
        this.f22642a = view;
    }

    void a() {
        View view = this.f22642a;
        AbstractC1658a0.V(view, this.f22645d - (view.getTop() - this.f22643b));
        View view2 = this.f22642a;
        AbstractC1658a0.U(view2, this.f22646e - (view2.getLeft() - this.f22644c));
    }

    public int b() {
        return this.f22645d;
    }

    void c() {
        this.f22643b = this.f22642a.getTop();
        this.f22644c = this.f22642a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f22648g || this.f22646e == i10) {
            return false;
        }
        this.f22646e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f22647f || this.f22645d == i10) {
            return false;
        }
        this.f22645d = i10;
        a();
        return true;
    }
}
