package com.google.android.material.snackbar;

import Q4.k;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.o;
import e5.AbstractC2425c;
import h5.h;
import h5.l;
import k5.AbstractC2830a;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeInterpolator f23687a = R4.a.f10025b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TimeInterpolator f23688b = R4.a.f10024a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TimeInterpolator f23689c = R4.a.f10027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f23691e = {Q4.a.f9098D0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f23692f = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Handler f23690d = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final b f23693k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f23693k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f23693k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            }
            if (i10 != 1) {
                return false;
            }
            android.support.v4.media.session.b.a(message.obj);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.y(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable c(int i10, Resources resources) {
        float dimension = resources.getDimension(Q4.c.f9247q0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h d(int i10, l lVar) {
        h hVar = new h(lVar);
        hVar.d0(ColorStateList.valueOf(i10));
        return hVar;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static class c extends FrameLayout {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final View.OnTouchListener f23694q = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        l f23695g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f23696h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f23697i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float f23698j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f23699k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f23700l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ColorStateList f23701m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private PorterDuff.Mode f23702n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Rect f23703o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f23704p;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected c(Context context, AttributeSet attributeSet) {
            super(AbstractC2830a.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, k.f9752n5);
            if (typedArrayObtainStyledAttributes.hasValue(k.f9808u5)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9808u5, 0));
            }
            this.f23696h = typedArrayObtainStyledAttributes.getInt(k.f9776q5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(k.f9824w5) || typedArrayObtainStyledAttributes.hasValue(k.f9832x5)) {
                this.f23695g = l.e(context2, attributeSet, 0, 0).m();
            }
            this.f23697i = typedArrayObtainStyledAttributes.getFloat(k.f9784r5, 1.0f);
            setBackgroundTintList(AbstractC2425c.a(context2, typedArrayObtainStyledAttributes, k.f9792s5));
            setBackgroundTintMode(o.i(typedArrayObtainStyledAttributes.getInt(k.f9800t5, -1), PorterDuff.Mode.SRC_IN));
            this.f23698j = typedArrayObtainStyledAttributes.getFloat(k.f9768p5, 1.0f);
            this.f23699k = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9760o5, -1);
            this.f23700l = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f9816v5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f23694q);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(a());
            }
        }

        private Drawable a() {
            int iK = X4.a.k(this, Q4.a.f9109J, Q4.a.f9164r, getBackgroundOverlayColorAlpha());
            l lVar = this.f23695g;
            Drawable drawableD = lVar != null ? BaseTransientBottomBar.d(iK, lVar) : BaseTransientBottomBar.c(iK, getResources());
            if (this.f23701m == null) {
                return AbstractC3606a.r(drawableD);
            }
            Drawable drawableR = AbstractC3606a.r(drawableD);
            drawableR.setTintList(this.f23701m);
            return drawableR;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f23703o = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        float getActionTextColorAlpha() {
            return this.f23698j;
        }

        int getAnimationMode() {
            return this.f23696h;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f23697i;
        }

        int getMaxInlineActionWidth() {
            return this.f23700l;
        }

        int getMaxWidth() {
            return this.f23699k;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f23699k > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f23699k;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f23696h = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f23701m != null) {
                drawable = AbstractC3606a.r(drawable.mutate());
                drawable.setTintList(this.f23701m);
                drawable.setTintMode(this.f23702n);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f23701m = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = AbstractC3606a.r(getBackground().mutate());
                drawableR.setTintList(colorStateList);
                drawableR.setTintMode(this.f23702n);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f23702n = mode;
            if (getBackground() != null) {
                Drawable drawableR = AbstractC3606a.r(getBackground().mutate());
                drawableR.setTintMode(mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f23704p || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f23694q);
            super.setOnClickListener(onClickListener);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }
    }
}
