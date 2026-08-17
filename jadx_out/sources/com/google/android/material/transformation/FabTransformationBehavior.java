package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f24010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f24011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f24012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f24013e;

    public FabTransformationBehavior() {
        this.f24010b = new Rect();
        this.f24011c = new RectF();
        this.f24012d = new RectF();
        this.f24013e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f16252h == 0) {
            fVar.f16252h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24010b = new Rect();
        this.f24011c = new RectF();
        this.f24012d = new RectF();
        this.f24013e = new int[2];
    }
}
