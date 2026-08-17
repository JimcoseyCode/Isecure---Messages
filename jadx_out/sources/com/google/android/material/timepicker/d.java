package com.google.android.material.timepicker;

import Q4.g;
import Q4.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import h5.h;
import h5.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class d extends ConstraintLayout {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Runnable f24005E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f24006F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private h f24007G;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(g.f9336i, this);
        setBackground(w());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f9521L4, i10, 0);
        this.f24006F = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9529M4, 0);
        this.f24005E = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f24004g.B();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private static boolean A(View view) {
        return "skip".equals(view.getTag());
    }

    private void C() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f24005E);
            handler.post(this.f24005E);
        }
    }

    private void v(List list, androidx.constraintlayout.widget.e eVar, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            eVar.g(((View) it.next()).getId(), Q4.e.f9301c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable w() {
        h hVar = new h();
        this.f24007G = hVar;
        hVar.a0(new j(0.5f));
        this.f24007G.d0(ColorStateList.valueOf(-1));
        return this.f24007G;
    }

    protected void B() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != Q4.e.f9301c && !A(childAt)) {
                int i11 = (Integer) childAt.getTag(Q4.e.f9309k);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            v((List) entry.getValue(), eVar, x(((Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        C();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        B();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        C();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f24007G.d0(ColorStateList.valueOf(i10));
    }

    int x(int i10) {
        return i10 == 2 ? Math.round(this.f24006F * 0.66f) : this.f24006F;
    }

    public int y() {
        return this.f24006F;
    }

    public void z(int i10) {
        this.f24006F = i10;
        B();
    }
}
