package com.google.android.material.timepicker;

import I0.z;
import Q4.g;
import Q4.j;
import Q4.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.material.timepicker.ClockHandView;
import e5.AbstractC2425c;
import g.AbstractC2619a;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends d implements ClockHandView.b {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final ClockHandView f23947H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Rect f23948I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final RectF f23949J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Rect f23950K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final SparseArray f23951L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final C1657a f23952M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int[] f23953N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float[] f23954O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final int f23955P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final int f23956Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final int f23957R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f23958S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private String[] f23959T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f23960U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final ColorStateList f23961V;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.z(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f23947H.i()) - ClockFaceView.this.f23955P);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends C1657a {
        b() {
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            int iIntValue = ((Integer) view.getTag(Q4.e.f9314p)).intValue();
            if (iIntValue > 0) {
                zVar.Z0((View) ClockFaceView.this.f23951L.get(iIntValue - 1));
            }
            zVar.z0(z.g.b(0, 1, iIntValue, 1, false, view.isSelected()));
            zVar.x0(true);
            zVar.b(z.a.f3882i);
        }

        @Override // androidx.core.view.C1657a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f23948I);
            float fCenterX = ClockFaceView.this.f23948I.centerX();
            float fCenterY = ClockFaceView.this.f23948I.centerY();
            ClockFaceView.this.f23947H.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f23947H.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Q4.a.f9149j0);
    }

    private void H() {
        RectF rectFE = this.f23947H.e();
        TextView textViewJ = J(rectFE);
        for (int i10 = 0; i10 < this.f23951L.size(); i10++) {
            TextView textView = (TextView) this.f23951L.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewJ);
                textView.getPaint().setShader(I(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient I(RectF rectF, TextView textView) {
        textView.getHitRect(this.f23948I);
        this.f23949J.set(this.f23948I);
        textView.getLineBounds(0, this.f23950K);
        RectF rectF2 = this.f23949J;
        Rect rect = this.f23950K;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f23949J)) {
            return new RadialGradient(rectF.centerX() - this.f23949J.left, rectF.centerY() - this.f23949J.top, rectF.width() * 0.5f, this.f23953N, this.f23954O, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView J(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f23951L.size(); i10++) {
            TextView textView2 = (TextView) this.f23951L.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f23948I);
                this.f23949J.set(this.f23948I);
                this.f23949J.union(rectF);
                float fWidth = this.f23949J.width() * this.f23949J.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float K(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void M(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f23951L.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f23959T.length, size); i11++) {
            TextView textView = (TextView) this.f23951L.get(i11);
            if (i11 >= this.f23959T.length) {
                removeView(textView);
                this.f23951L.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(g.f9334g, (ViewGroup) this, false);
                    this.f23951L.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f23959T[i11]);
                textView.setTag(Q4.e.f9314p, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(Q4.e.f9309k, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                AbstractC1658a0.k0(textView, this.f23952M);
                textView.setTextColor(this.f23961V);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f23959T[i11]));
                }
            }
        }
        this.f23947H.q(z10);
    }

    @Override // com.google.android.material.timepicker.d
    protected void B() {
        super.B();
        for (int i10 = 0; i10 < this.f23951L.size(); i10++) {
            ((TextView) this.f23951L.get(i10)).setVisibility(0);
        }
    }

    public void L(String[] strArr, int i10) {
        this.f23959T = strArr;
        M(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f23960U - f10) > 0.001f) {
            this.f23960U = f10;
            H();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.d1(accessibilityNodeInfo).y0(z.f.b(1, this.f23959T.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iK = (int) (this.f23958S / K(this.f23956Q / displayMetrics.heightPixels, this.f23957R / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iK, 1073741824);
        setMeasuredDimension(iK, iK);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.d
    public void z(int i10) {
        if (i10 != y()) {
            super.z(i10);
            this.f23947H.m(y());
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23948I = new Rect();
        this.f23949J = new RectF();
        this.f23950K = new Rect();
        this.f23951L = new SparseArray();
        this.f23954O = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f9764p1, i10, j.f9400B);
        Resources resources = getResources();
        ColorStateList colorStateListA = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, k.f9780r1);
        this.f23961V = colorStateListA;
        LayoutInflater.from(context).inflate(g.f9335h, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(Q4.e.f9308j);
        this.f23947H = clockHandView;
        this.f23955P = resources.getDimensionPixelSize(Q4.c.f9193F);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f23953N = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC2619a.a(context, Q4.b.f9183b).getDefaultColor();
        ColorStateList colorStateListA2 = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, k.f9772q1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f23952M = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, PointerEventHelper.POINTER_TYPE_UNKNOWN);
        L(strArr, 0);
        this.f23956Q = resources.getDimensionPixelSize(Q4.c.f9207T);
        this.f23957R = resources.getDimensionPixelSize(Q4.c.f9208U);
        this.f23958S = resources.getDimensionPixelSize(Q4.c.f9195H);
    }
}
