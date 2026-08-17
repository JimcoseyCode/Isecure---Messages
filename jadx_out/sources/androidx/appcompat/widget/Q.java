package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1692s;
import f.AbstractC2577j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q extends ViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f14702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f14704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f14705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f14707o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f14708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f14709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f14711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14712t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f14713u;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public Q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(int i10, int i11) {
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View viewQ = q(i13);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewQ.getMeasuredWidth();
                    i12 = i11;
                    measureChildWithMargins(viewQ, i12, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i14;
                } else {
                    i12 = i11;
                }
            }
            i13++;
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void j(int i10, int i11) {
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View viewQ = q(i13);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewQ.getMeasuredHeight();
                    i12 = i11;
                    measureChildWithMargins(viewQ, iMakeMeasureSpec, 0, i12, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i14;
                } else {
                    i12 = i11;
                }
            }
            i13++;
            i11 = i12;
        }
    }

    private void y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = q0.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewQ = q(i11);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i11)) {
                a aVar = (a) viewQ.getLayoutParams();
                h(canvas, zB ? viewQ.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewQ.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f14710r);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            if (viewQ2 != null) {
                a aVar2 = (a) viewQ2.getLayoutParams();
                if (zB) {
                    left = viewQ2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f14710r;
                    right = left - i10;
                } else {
                    right = viewQ2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f14710r;
                right = left - i10;
            }
            h(canvas, right);
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewQ = q(i10);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i10)) {
                g(canvas, (viewQ.getTop() - ((LinearLayout.LayoutParams) ((a) viewQ.getLayoutParams())).topMargin) - this.f14711s);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            g(canvas, viewQ2 == null ? (getHeight() - getPaddingBottom()) - this.f14711s : viewQ2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewQ2.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i10) {
        this.f14709q.setBounds(getPaddingLeft() + this.f14713u, i10, (getWidth() - getPaddingRight()) - this.f14713u, this.f14711s + i10);
        this.f14709q.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f14700h < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f14700h;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14700h == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f14701i;
        if (this.f14702j == 1 && (i10 = this.f14703k & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f14704l) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14704l;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14700h;
    }

    public Drawable getDividerDrawable() {
        return this.f14709q;
    }

    public int getDividerPadding() {
        return this.f14713u;
    }

    public int getDividerWidth() {
        return this.f14710r;
    }

    public int getGravity() {
        return this.f14703k;
    }

    public int getOrientation() {
        return this.f14702j;
    }

    public int getShowDividers() {
        return this.f14712t;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f14705m;
    }

    void h(Canvas canvas, int i10) {
        this.f14709q.setBounds(i10, getPaddingTop() + this.f14713u, this.f14710r + i10, (getHeight() - getPaddingBottom()) - this.f14713u);
        this.f14709q.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f14702j;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    int n(View view, int i10) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f14709q == null) {
            return;
        }
        if (this.f14702j == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f14702j == 1) {
            t(i10, i11, i12, i13);
        } else {
            s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f14702j == 1) {
            x(i10, i11);
        } else {
            v(i10, i11);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i10) {
        return getChildAt(i10);
    }

    protected boolean r(int i10) {
        if (i10 == 0) {
            return (this.f14712t & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f14712t & 4) != 0;
        }
        if ((this.f14712t & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void s(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        char c10;
        char c11;
        int i16;
        int iN;
        int i17;
        int i18;
        int i19;
        int i20;
        int measuredHeight;
        boolean zB = q0.b(this);
        int paddingTop = getPaddingTop();
        int i21 = i13 - i11;
        int paddingBottom = i21 - getPaddingBottom();
        int paddingBottom2 = (i21 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i22 = this.f14703k;
        int i23 = i22 & 112;
        boolean z10 = this.f14699g;
        int[] iArr = this.f14707o;
        int[] iArr2 = this.f14708p;
        int iB = AbstractC1692s.b(8388615 & i22, getLayoutDirection());
        char c12 = 2;
        char c13 = 1;
        int paddingLeft = iB != 1 ? iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f14704l : getPaddingLeft() + (((i12 - i10) - this.f14704l) / 2);
        if (zB) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i24 = 0;
        while (i24 < virtualChildCount) {
            int i25 = i14 + (i15 * i24);
            int i26 = i24;
            View viewQ = q(i25);
            if (viewQ == null) {
                paddingLeft += w(i25);
                iN = i26;
                i16 = paddingTop;
                c10 = c12;
                c11 = c13;
            } else {
                c10 = c12;
                c11 = c13;
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight2 = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i27 = paddingLeft;
                    if (z10) {
                        i17 = measuredHeight2;
                        int baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewQ.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i18 < 0) {
                            i18 = i23;
                        }
                        i19 = i18 & 112;
                        i16 = paddingTop;
                        if (i19 == 16) {
                            if (i19 == 48) {
                                i20 = i16 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                if (baseline != -1) {
                                    i20 += iArr[c11] - baseline;
                                }
                            } else if (i19 != 80) {
                                i20 = i16;
                            } else {
                                i20 = (paddingBottom - i17) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c10] - (viewQ.getMeasuredHeight() - baseline);
                                }
                            }
                            int i28 = ((LinearLayout.LayoutParams) aVar).leftMargin + (r(i25) ? i27 + this.f14710r : i27);
                            y(viewQ, o(viewQ) + i28, i20, measuredWidth, i17);
                            int iP = i28 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                            iN = n(viewQ, i25) + i26;
                            paddingLeft = iP;
                        } else {
                            i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i20 -= measuredHeight;
                        int i282 = ((LinearLayout.LayoutParams) aVar).leftMargin + (r(i25) ? i27 + this.f14710r : i27);
                        y(viewQ, o(viewQ) + i282, i20, measuredWidth, i17);
                        int iP2 = i282 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                        iN = n(viewQ, i25) + i26;
                        paddingLeft = iP2;
                    } else {
                        i17 = measuredHeight2;
                    }
                    i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i18 < 0) {
                    }
                    i19 = i18 & 112;
                    i16 = paddingTop;
                    if (i19 == 16) {
                    }
                    i20 -= measuredHeight;
                    int i2822 = ((LinearLayout.LayoutParams) aVar).leftMargin + (r(i25) ? i27 + this.f14710r : i27);
                    y(viewQ, o(viewQ) + i2822, i20, measuredWidth, i17);
                    int iP22 = i2822 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                    iN = n(viewQ, i25) + i26;
                    paddingLeft = iP22;
                } else {
                    i16 = paddingTop;
                    iN = i26;
                }
            }
            i24 = iN + 1;
            c12 = c10;
            c13 = c11;
            paddingTop = i16;
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f14699g = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f14700h = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14709q) {
            return;
        }
        this.f14709q = drawable;
        if (drawable != null) {
            this.f14710r = drawable.getIntrinsicWidth();
            this.f14711s = drawable.getIntrinsicHeight();
        } else {
            this.f14710r = 0;
            this.f14711s = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f14713u = i10;
    }

    public void setGravity(int i10) {
        if (this.f14703k != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f14703k = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f14703k;
        if ((8388615 & i12) != i11) {
            this.f14703k = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f14706n = z10;
    }

    public void setOrientation(int i10) {
        if (this.f14702j != i10) {
            this.f14702j = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f14712t) {
            requestLayout();
        }
        this.f14712t = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f14703k;
        if ((i12 & 112) != i11) {
            this.f14703k = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f14705m = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void t(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.f14703k;
        int i19 = i18 & 112;
        int i20 = i18 & 8388615;
        int paddingTop = i19 != 16 ? i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f14704l : getPaddingTop() + (((i13 - i11) - this.f14704l) / 2);
        int iN = 0;
        while (iN < virtualChildCount) {
            View viewQ = q(iN);
            if (viewQ == null) {
                paddingTop += w(iN);
            } else {
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i21 < 0) {
                        i21 = i20;
                    }
                    int iB = AbstractC1692s.b(i21, getLayoutDirection()) & 7;
                    if (iB == 1) {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    } else if (iB != 5) {
                        i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        int i22 = i16;
                        if (r(iN)) {
                            paddingTop += this.f14711s;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        y(viewQ, i22, i23 + o(viewQ), measuredWidth, measuredHeight);
                        paddingTop = i23 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                        iN += n(viewQ, iN);
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i16 = i14 - i15;
                    int i222 = i16;
                    if (r(iN)) {
                    }
                    int i232 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(viewQ, i222, i232 + o(viewQ), measuredWidth, measuredHeight);
                    paddingTop = i232 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                    iN += n(viewQ, iN);
                }
                iN++;
            }
            iN++;
        }
    }

    void u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void v(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int iMax;
        int i18;
        int i19;
        int baseline;
        int i20;
        int i21;
        float f11;
        int i22;
        byte b10;
        int i23;
        boolean z10;
        int i24;
        int i25;
        int i26;
        int[] iArr;
        int i27;
        int i28;
        boolean z11;
        int[] iArr2;
        View view;
        boolean z12;
        boolean z13;
        int baseline2;
        this.f14704l = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f14707o == null || this.f14708p == null) {
            this.f14707o = new int[4];
            this.f14708p = new int[4];
        }
        int[] iArr3 = this.f14707o;
        int[] iArr4 = this.f14708p;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z14 = this.f14699g;
        boolean z15 = this.f14706n;
        int i29 = 1073741824;
        boolean z16 = mode == 1073741824;
        boolean z17 = z15;
        int iN = 0;
        int i30 = 0;
        int iMax2 = 0;
        boolean z18 = false;
        int iCombineMeasuredStates = 0;
        boolean z19 = false;
        boolean z20 = true;
        float f12 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i12 = i30;
            if (iN >= virtualChildCount) {
                break;
            }
            boolean z21 = z14;
            View viewQ = q(iN);
            if (viewQ == null) {
                this.f14704l += w(iN);
            } else if (viewQ.getVisibility() == 8) {
                iN += n(viewQ, iN);
            } else {
                if (r(iN)) {
                    this.f14704l += this.f14710r;
                }
                a aVar = (a) viewQ.getLayoutParams();
                float f13 = ((LinearLayout.LayoutParams) aVar).weight;
                float f14 = f12 + f13;
                if (mode == i29 && ((LinearLayout.LayoutParams) aVar).width == 0 && f13 > 0.0f) {
                    if (z16) {
                        this.f14704l += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                    } else {
                        int i31 = this.f14704l;
                        this.f14704l = Math.max(i31, ((LinearLayout.LayoutParams) aVar).leftMargin + i31 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                    }
                    if (z21) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        i25 = virtualChildCount;
                        i26 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        i25 = virtualChildCount;
                        i26 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z18 = true;
                    }
                    i27 = i12;
                    i28 = 1073741824;
                    z11 = z17;
                    view = viewQ;
                } else {
                    if (((LinearLayout.LayoutParams) aVar).width != 0 || f13 <= 0.0f) {
                        b10 = -2;
                        i23 = androidx.customview.widget.a.INVALID_ID;
                    } else {
                        b10 = -2;
                        ((LinearLayout.LayoutParams) aVar).width = -2;
                        i23 = 0;
                    }
                    if (f14 == 0.0f) {
                        z10 = z17;
                        i24 = this.f14704l;
                    } else {
                        z10 = z17;
                        i24 = 0;
                    }
                    i25 = virtualChildCount;
                    i26 = mode;
                    iArr = iArr3;
                    i27 = i12;
                    i28 = 1073741824;
                    z11 = z10;
                    iArr2 = iArr4;
                    int i32 = i23;
                    u(viewQ, iN, i10, i24, i11, 0);
                    view = viewQ;
                    if (i32 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar).width = i32;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z16) {
                        this.f14704l += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view);
                    } else {
                        int i33 = this.f14704l;
                        this.f14704l = Math.max(i33, i33 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view));
                    }
                    if (z11) {
                        iMax2 = Math.max(measuredWidth, iMax2);
                    }
                }
                if (mode2 == i28 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                    z12 = false;
                } else {
                    z12 = true;
                    z19 = true;
                }
                int i34 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i34;
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                if (!z21 || (baseline2 = view.getBaseline()) == -1) {
                    z13 = z12;
                } else {
                    int i35 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i35 < 0) {
                        i35 = this.f14703k;
                    }
                    int i36 = (((i35 & 112) >> 4) & (-2)) >> 1;
                    z13 = z12;
                    iArr[i36] = Math.max(iArr[i36], baseline2);
                    iArr2[i36] = Math.max(iArr2[i36], measuredHeight - baseline2);
                }
                int iMax5 = Math.max(i27, measuredHeight);
                z20 = z20 && ((LinearLayout.LayoutParams) aVar).height == -1;
                if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                    if (!z13) {
                        i34 = measuredHeight;
                    }
                    iMax4 = Math.max(iMax4, i34);
                } else {
                    if (!z13) {
                        i34 = measuredHeight;
                    }
                    iMax3 = Math.max(iMax3, i34);
                }
                iN += n(view, iN);
                i30 = iMax5;
                f12 = f14;
                iN++;
                z17 = z11;
                iArr4 = iArr2;
                z14 = z21;
                mode = i26;
                iArr3 = iArr;
                virtualChildCount = i25;
                i29 = 1073741824;
            }
            i25 = virtualChildCount;
            i26 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i30 = i12;
            z11 = z17;
            iN++;
            z17 = z11;
            iArr4 = iArr2;
            z14 = z21;
            mode = i26;
            iArr3 = iArr;
            virtualChildCount = i25;
            i29 = 1073741824;
        }
        boolean z22 = z14;
        int i37 = virtualChildCount;
        int i38 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i39 = iCombineMeasuredStates;
        boolean z23 = z17;
        if (this.f14704l > 0) {
            i13 = i37;
            if (r(i13)) {
                this.f14704l += this.f14710r;
            }
        } else {
            i13 = i37;
        }
        int i40 = iArr5[1];
        int iMax6 = (i40 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i12 : Math.max(i12, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i40, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        if (z23) {
            i14 = i38;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                this.f14704l = 0;
                int iN2 = 0;
                while (iN2 < i13) {
                    View viewQ2 = q(iN2);
                    if (viewQ2 == null) {
                        this.f14704l += w(iN2);
                    } else if (viewQ2.getVisibility() == 8) {
                        iN2 += n(viewQ2, iN2);
                    } else {
                        a aVar2 = (a) viewQ2.getLayoutParams();
                        if (z16) {
                            f11 = f12;
                            this.f14704l += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2);
                            i22 = iMax6;
                            iN2++;
                            f12 = f11;
                            iMax6 = i22;
                        } else {
                            f11 = f12;
                            int i41 = this.f14704l;
                            i22 = iMax6;
                            this.f14704l = Math.max(i41, i41 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2));
                            iN2++;
                            f12 = f11;
                            iMax6 = i22;
                        }
                    }
                    f11 = f12;
                    i22 = iMax6;
                    iN2++;
                    f12 = f11;
                    iMax6 = i22;
                }
            }
            f10 = f12;
        } else {
            f10 = f12;
            i14 = i38;
        }
        int iMax7 = iMax6;
        int paddingLeft = this.f14704l + getPaddingLeft() + getPaddingRight();
        this.f14704l = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i42 = (16777215 & iResolveSizeAndState) - this.f14704l;
        if (z18 || (i42 != 0 && f10 > 0.0f)) {
            float f15 = this.f14705m;
            if (f15 > 0.0f) {
                f10 = f15;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.f14704l = 0;
            int iCombineMeasuredStates2 = i39;
            int iMax8 = -1;
            int i43 = 0;
            while (i43 < i13) {
                View viewQ3 = q(i43);
                if (viewQ3 == null || viewQ3.getVisibility() == 8) {
                    i18 = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) viewQ3.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f16 > 0.0f) {
                        int i44 = (int) ((i42 * f16) / f10);
                        f10 -= f16;
                        i42 -= i44;
                        i18 = iResolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i21 = 1073741824;
                            if (i14 == 1073741824) {
                                if (i44 <= 0) {
                                    i44 = 0;
                                }
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(i44, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                        } else {
                            i21 = 1073741824;
                        }
                        int measuredWidth2 = viewQ3.getMeasuredWidth() + i44;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewQ3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i21), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                    } else {
                        i18 = iResolveSizeAndState;
                    }
                    if (z16) {
                        this.f14704l += viewQ3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3);
                    } else {
                        int i45 = this.f14704l;
                        this.f14704l = Math.max(i45, viewQ3.getMeasuredWidth() + i45 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3));
                    }
                    boolean z24 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i46 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewQ3.getMeasuredHeight() + i46;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z24) {
                        i46 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i46);
                    if (z20) {
                        i19 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z22 && (baseline = viewQ3.getBaseline()) != i19) {
                            i20 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i20 < 0) {
                                i20 = this.f14703k;
                            }
                            int i47 = (((i20 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i47] = Math.max(iArr5[i47], baseline);
                            iArr6[i47] = Math.max(iArr6[i47], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax9;
                        z20 = z25;
                    } else {
                        i19 = -1;
                    }
                    if (z22) {
                        i20 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i20 < 0) {
                        }
                        int i472 = (((i20 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i472] = Math.max(iArr5[i472], baseline);
                        iArr6[i472] = Math.max(iArr6[i472], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax9;
                    z20 = z25;
                }
                i43++;
                iResolveSizeAndState = i18;
            }
            i15 = iResolveSizeAndState;
            i16 = -16777216;
            this.f14704l += getPaddingLeft() + getPaddingRight();
            int i48 = iArr5[1];
            iMax7 = (i48 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i48, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            i17 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z23 && i14 != 1073741824) {
                for (int i49 = 0; i49 < i13; i49++) {
                    View viewQ4 = q(i49);
                    if (viewQ4 != null && viewQ4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ4.getLayoutParams())).weight > 0.0f) {
                        viewQ4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(viewQ4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i15 = iResolveSizeAndState;
            i17 = i39;
            i16 = -16777216;
        }
        if (z20 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i15 | (i17 & i16), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
        if (z19) {
            i(i13, i10);
        }
    }

    int w(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void x(int i10, int i11) {
        int i12;
        int iMax;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        View view;
        boolean z10;
        int iMax2;
        boolean z11;
        int iMax3;
        int i24;
        this.f14704l = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i25 = this.f14700h;
        boolean z12 = this.f14706n;
        int iN = 0;
        int i26 = 0;
        int iMax4 = 0;
        int i27 = 0;
        int i28 = 0;
        int iMax5 = 0;
        boolean z13 = false;
        boolean z14 = false;
        float f10 = 0.0f;
        boolean z15 = true;
        while (true) {
            int i29 = 8;
            if (iN >= virtualChildCount) {
                float f11 = f10;
                int i30 = i26;
                int i31 = virtualChildCount;
                int i32 = mode2;
                boolean z16 = z12;
                int i33 = iMax4;
                int iMax6 = i27;
                int iCombineMeasuredStates = i28;
                if (this.f14704l > 0) {
                    i12 = i31;
                    if (r(i12)) {
                        this.f14704l += this.f14711s;
                    }
                } else {
                    i12 = i31;
                }
                int i34 = i32;
                if (z16 && (i34 == Integer.MIN_VALUE || i34 == 0)) {
                    this.f14704l = 0;
                    int iN2 = 0;
                    while (iN2 < i12) {
                        View viewQ = q(iN2);
                        if (viewQ == null) {
                            this.f14704l += w(iN2);
                        } else if (viewQ.getVisibility() == i29) {
                            iN2 += n(viewQ, iN2);
                        } else {
                            a aVar = (a) viewQ.getLayoutParams();
                            int i35 = this.f14704l;
                            this.f14704l = Math.max(i35, i35 + i33 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ));
                        }
                        iN2++;
                        i29 = 8;
                    }
                }
                int paddingTop = this.f14704l + getPaddingTop() + getPaddingBottom();
                this.f14704l = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i36 = (16777215 & iResolveSizeAndState) - this.f14704l;
                if (z13 || (i36 != 0 && f11 > 0.0f)) {
                    float f12 = this.f14705m;
                    if (f12 <= 0.0f) {
                        f12 = f11;
                    }
                    this.f14704l = 0;
                    float f13 = f12;
                    int i37 = i36;
                    int i38 = 0;
                    while (i38 < i12) {
                        View viewQ2 = q(i38);
                        if (viewQ2.getVisibility() == 8) {
                            i13 = i34;
                            i14 = i38;
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f14 > 0.0f) {
                                i14 = i38;
                                int i39 = (int) ((i37 * f14) / f13);
                                f13 -= f14;
                                i37 -= i39;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i16 = 1073741824;
                                    if (i34 == 1073741824) {
                                        i13 = i34;
                                        viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i39 > 0 ? i39 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                                } else {
                                    i16 = 1073741824;
                                }
                                i13 = i34;
                                int measuredHeight = viewQ2.getMeasuredHeight() + i39;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i16));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                            } else {
                                i13 = i34;
                                i14 = i38;
                            }
                            int i40 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewQ2.getMeasuredWidth() + i40;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i15 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i40;
                                }
                            } else {
                                i15 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z17 = z15 && ((LinearLayout.LayoutParams) aVar2).width == i15;
                            int i41 = this.f14704l;
                            this.f14704l = Math.max(i41, i41 + viewQ2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(viewQ2));
                            iMax5 = iMax7;
                            z15 = z17;
                        }
                        i38 = i14 + 1;
                        i34 = i13;
                    }
                    this.f14704l += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i30);
                    if (z16 && i34 != 1073741824) {
                        for (int i42 = 0; i42 < i12; i42++) {
                            View viewQ3 = q(i42);
                            if (viewQ3 != null && viewQ3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ3.getLayoutParams())).weight > 0.0f) {
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(viewQ3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i33, 1073741824));
                            }
                        }
                    }
                }
                if (!z15 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z14) {
                    j(i12, i11);
                    return;
                }
                return;
            }
            float f15 = f10;
            View viewQ4 = q(iN);
            if (viewQ4 == null) {
                this.f14704l += w(iN);
            } else if (viewQ4.getVisibility() == 8) {
                iN += n(viewQ4, iN);
            } else {
                if (r(iN)) {
                    this.f14704l += this.f14711s;
                }
                a aVar3 = (a) viewQ4.getLayoutParams();
                float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                float f17 = f15 + f16;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f16 > 0.0f) {
                    int i43 = this.f14704l;
                    this.f14704l = Math.max(i43, ((LinearLayout.LayoutParams) aVar3).topMargin + i43 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                    iMax2 = i26;
                    i20 = virtualChildCount;
                    i21 = mode2;
                    z13 = true;
                    view = viewQ4;
                    i23 = i27;
                    i22 = i28;
                    z10 = z12;
                } else {
                    if (((LinearLayout.LayoutParams) aVar3).height != 0 || f16 <= 0.0f) {
                        i17 = androidx.customview.widget.a.INVALID_ID;
                    } else {
                        ((LinearLayout.LayoutParams) aVar3).height = -2;
                        i17 = 0;
                    }
                    if (f17 == 0.0f) {
                        int i44 = i28;
                        i19 = this.f14704l;
                        i18 = i44;
                    } else {
                        i18 = i28;
                        i19 = 0;
                    }
                    int i45 = iMax4;
                    i20 = virtualChildCount;
                    i21 = mode2;
                    i22 = i18;
                    i23 = i27;
                    view = viewQ4;
                    z10 = z12;
                    iMax2 = i26;
                    u(view, iN, i10, 0, i11, i19);
                    if (i17 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar3).height = i17;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i46 = this.f14704l;
                    this.f14704l = Math.max(i46, i46 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(view));
                    iMax4 = z10 ? Math.max(measuredHeight2, i45) : i45;
                }
                if (i25 >= 0 && i25 == iN + 1) {
                    this.f14701i = this.f14704l;
                }
                if (iN < i25 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                    z11 = false;
                } else {
                    z11 = true;
                    z14 = true;
                }
                int i47 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i47;
                iMax3 = Math.max(i23, measuredWidth2);
                int i48 = iMax4;
                int iCombineMeasuredStates2 = View.combineMeasuredStates(i22, view.getMeasuredState());
                if (z15) {
                    i24 = iCombineMeasuredStates2;
                    z15 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                    if (((LinearLayout.LayoutParams) aVar3).weight <= 0.0f) {
                        if (!z11) {
                            i47 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i47);
                    } else {
                        if (!z11) {
                            i47 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i47);
                    }
                    iN += n(view, iN);
                    f10 = f17;
                    iMax4 = i48;
                    i28 = i24;
                    iN++;
                    i27 = iMax3;
                    i26 = iMax2;
                    z12 = z10;
                    mode2 = i21;
                    virtualChildCount = i20;
                } else {
                    i24 = iCombineMeasuredStates2;
                }
                if (((LinearLayout.LayoutParams) aVar3).weight <= 0.0f) {
                }
                iN += n(view, iN);
                f10 = f17;
                iMax4 = i48;
                i28 = i24;
                iN++;
                i27 = iMax3;
                i26 = iMax2;
                z12 = z10;
                mode2 = i21;
                virtualChildCount = i20;
            }
            iMax2 = i26;
            i20 = virtualChildCount;
            i21 = mode2;
            z10 = z12;
            f10 = f15;
            iMax3 = i27;
            iN++;
            i27 = iMax3;
            i26 = iMax2;
            z12 = z10;
            mode2 = i21;
            virtualChildCount = i20;
        }
    }

    public Q(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14699g = true;
        this.f14700h = -1;
        this.f14701i = 0;
        this.f14703k = 8388659;
        f0 f0VarV = f0.v(context, attributeSet, AbstractC2577j.f27035a1, i10, 0);
        AbstractC1658a0.i0(this, context, AbstractC2577j.f27035a1, attributeSet, f0VarV.r(), i10, 0);
        int iK = f0VarV.k(AbstractC2577j.f27045c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = f0VarV.k(AbstractC2577j.f27040b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = f0VarV.a(AbstractC2577j.f27050d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f14705m = f0VarV.i(AbstractC2577j.f27060f1, -1.0f);
        this.f14700h = f0VarV.k(AbstractC2577j.f27055e1, -1);
        this.f14706n = f0VarV.a(AbstractC2577j.f27075i1, false);
        setDividerDrawable(f0VarV.g(AbstractC2577j.f27065g1));
        this.f14712t = f0VarV.k(AbstractC2577j.f27080j1, 0);
        this.f14713u = f0VarV.f(AbstractC2577j.f27070h1, 0);
        f0VarV.x();
    }
}
