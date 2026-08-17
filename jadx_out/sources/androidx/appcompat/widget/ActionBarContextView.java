package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1678k0;
import f.AbstractC2568a;
import f.AbstractC2573f;
import f.AbstractC2574g;
import f.AbstractC2577j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1628a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f14496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f14497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f14498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f14499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f14500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LinearLayout f14501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f14502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f14503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f14504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f14505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f14506y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f14507z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f14508g;

        a(androidx.appcompat.view.b bVar) {
            this.f14508g = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f14508g.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f14501t == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC2574g.f26865a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f14501t = linearLayout;
            this.f14502u = (TextView) linearLayout.findViewById(AbstractC2573f.f26844f);
            this.f14503v = (TextView) this.f14501t.findViewById(AbstractC2573f.f26843e);
            if (this.f14504w != 0) {
                this.f14502u.setTextAppearance(getContext(), this.f14504w);
            }
            if (this.f14505x != 0) {
                this.f14503v.setTextAppearance(getContext(), this.f14505x);
            }
        }
        this.f14502u.setText(this.f14496o);
        this.f14503v.setText(this.f14497p);
        boolean zIsEmpty = TextUtils.isEmpty(this.f14496o);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f14497p);
        this.f14503v.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f14501t.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f14501t.getParent() == null) {
            addView(this.f14501t);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1628a
    public /* bridge */ /* synthetic */ C1678k0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f14498q == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1628a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1628a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f14497p;
    }

    public CharSequence getTitle() {
        return this.f14496o;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f14498q;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f14507z, (ViewGroup) this, false);
            this.f14498q = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f14498q);
        }
        View viewFindViewById = this.f14498q.findViewById(AbstractC2573f.f26848j);
        this.f14499r = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f14937j;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f14937j = actionMenuPresenter2;
        actionMenuPresenter2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f14937j, this.f14935h);
        ActionMenuView actionMenuView = (ActionMenuView) this.f14937j.q(this);
        this.f14936i = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f14936i, layoutParams);
    }

    public boolean j() {
        return this.f14506y;
    }

    public void k() {
        removeAllViews();
        this.f14500s = null;
        this.f14936i = null;
        this.f14937j = null;
        View view = this.f14499r;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.f14937j;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f14937j;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.f14937j.E();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1628a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = q0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f14498q;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14498q.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC1628a.d(paddingRight, i14, zB);
            paddingRight = AbstractC1628a.d(iD + e(this.f14498q, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f14501t;
        if (linearLayout != null && this.f14500s == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f14501t, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f14500s;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f14936i;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f14938k;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, androidx.customview.widget.a.INVALID_ID);
        View view = this.f14498q;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14498q.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f14936i;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f14936i, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f14501t;
        if (linearLayout != null && this.f14500s == null) {
            if (this.f14506y) {
                this.f14501t.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f14501t.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f14501t.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f14500s;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f14500s.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f14938k > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC1628a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1628a
    public void setContentHeight(int i10) {
        this.f14938k = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f14500s;
        if (view2 != null) {
            removeView(view2);
        }
        this.f14500s = view;
        if (view != null && (linearLayout = this.f14501t) != null) {
            removeView(linearLayout);
            this.f14501t = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f14497p = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f14496o = charSequence;
        i();
        AbstractC1658a0.n0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f14506y) {
            requestLayout();
        }
        this.f14506y = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC1628a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26735g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0 f0VarV = f0.v(context, attributeSet, AbstractC2577j.f27153y, i10, 0);
        setBackground(f0VarV.g(AbstractC2577j.f27158z));
        this.f14504w = f0VarV.n(AbstractC2577j.f26920D, 0);
        this.f14505x = f0VarV.n(AbstractC2577j.f26915C, 0);
        this.f14938k = f0VarV.m(AbstractC2577j.f26910B, 0);
        this.f14507z = f0VarV.n(AbstractC2577j.f26905A, AbstractC2574g.f26868d);
        f0VarV.x();
    }
}
