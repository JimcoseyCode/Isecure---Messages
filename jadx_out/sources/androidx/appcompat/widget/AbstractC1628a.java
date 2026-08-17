package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1678k0;
import androidx.core.view.InterfaceC1680l0;
import f.AbstractC2568a;
import f.AbstractC2577j;

/* JADX INFO: renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1628a extends ViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final C0147a f14934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Context f14935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected ActionMenuView f14936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ActionMenuPresenter f14937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f14938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected C1678k0 f14939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14941n;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected class C0147a implements InterfaceC1680l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14942a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14943b;

        protected C0147a() {
        }

        @Override // androidx.core.view.InterfaceC1680l0
        public void a(View view) {
            this.f14942a = true;
        }

        @Override // androidx.core.view.InterfaceC1680l0
        public void b(View view) {
            if (this.f14942a) {
                return;
            }
            AbstractC1628a abstractC1628a = AbstractC1628a.this;
            abstractC1628a.f14939l = null;
            AbstractC1628a.super.setVisibility(this.f14943b);
        }

        @Override // androidx.core.view.InterfaceC1680l0
        public void c(View view) {
            AbstractC1628a.super.setVisibility(0);
            this.f14942a = false;
        }

        public C0147a d(C1678k0 c1678k0, int i10) {
            AbstractC1628a.this.f14939l = c1678k0;
            this.f14943b = i10;
            return this;
        }
    }

    AbstractC1628a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14934g = new C0147a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC2568a.f26729a, typedValue, true) || typedValue.resourceId == 0) {
            this.f14935h = context;
        } else {
            this.f14935h = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, androidx.customview.widget.a.INVALID_ID), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public C1678k0 f(int i10, long j10) {
        C1678k0 c1678k0 = this.f14939l;
        if (c1678k0 != null) {
            c1678k0.c();
        }
        if (i10 != 0) {
            C1678k0 c1678k0B = AbstractC1658a0.e(this).b(0.0f);
            c1678k0B.e(j10);
            c1678k0B.g(this.f14934g.d(c1678k0B, i10));
            return c1678k0B;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1678k0 c1678k0B2 = AbstractC1658a0.e(this).b(1.0f);
        c1678k0B2.e(j10);
        c1678k0B2.g(this.f14934g.d(c1678k0B2, i10));
        return c1678k0B2;
    }

    public int getAnimatedVisibility() {
        return this.f14939l != null ? this.f14934g.f14943b : getVisibility();
    }

    public int getContentHeight() {
        return this.f14938k;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC2577j.f27033a, AbstractC2568a.f26731c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(AbstractC2577j.f27078j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f14937j;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f14941n = false;
        }
        if (!this.f14941n) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f14941n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f14941n = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14940m = false;
        }
        if (!this.f14940m) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f14940m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f14940m = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C1678k0 c1678k0 = this.f14939l;
            if (c1678k0 != null) {
                c1678k0.c();
            }
            super.setVisibility(i10);
        }
    }
}
