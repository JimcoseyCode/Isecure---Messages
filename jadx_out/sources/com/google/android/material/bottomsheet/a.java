package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.C1690q0;
import androidx.core.view.L0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class a extends C1690q0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f22862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f22865j;

    public a(View view) {
        super(0);
        this.f22865j = new int[2];
        this.f22862g = view;
    }

    @Override // androidx.core.view.C1690q0.b
    public void onEnd(C1690q0 c1690q0) {
        this.f22862g.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.C1690q0.b
    public void onPrepare(C1690q0 c1690q0) {
        this.f22862g.getLocationOnScreen(this.f22865j);
        this.f22863h = this.f22865j[1];
    }

    @Override // androidx.core.view.C1690q0.b
    public L0 onProgress(L0 l02, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C1690q0) it.next()).c() & L0.p.b()) != 0) {
                this.f22862g.setTranslationY(R4.a.c(this.f22864i, 0, r0.b()));
                break;
            }
        }
        return l02;
    }

    @Override // androidx.core.view.C1690q0.b
    public C1690q0.a onStart(C1690q0 c1690q0, C1690q0.a aVar) {
        this.f22862g.getLocationOnScreen(this.f22865j);
        int i10 = this.f22863h - this.f22865j[1];
        this.f22864i = i10;
        this.f22862g.setTranslationY(i10);
        return aVar;
    }
}
