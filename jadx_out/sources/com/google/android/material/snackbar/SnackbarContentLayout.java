package com.google.android.material.snackbar;

import Q4.c;
import Q4.e;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c5.d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f23705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Button f23706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TimeInterpolator f23707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23708j;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23707i = d.g(context, Q4.a.f9173v0, R4.a.f10025b);
    }

    private static void a(View view, int i10, int i11) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i10, view.getPaddingEnd(), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f23705g.getPaddingTop() == i11 && this.f23705g.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f23705g, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f23706h;
    }

    public TextView getMessageView() {
        return this.f23705g;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f23705g = (TextView) findViewById(e.f9289S);
        this.f23706h = (Button) findViewById(e.f9288R);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f9238m);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f9236l);
        Layout layout = this.f23705g.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f23708j <= 0 || this.f23706h.getMeasuredWidth() <= this.f23708j) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f23708j = i10;
    }
}
