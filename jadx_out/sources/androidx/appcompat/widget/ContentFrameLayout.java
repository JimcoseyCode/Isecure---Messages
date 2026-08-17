package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TypedValue f14646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TypedValue f14647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TypedValue f14648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TypedValue f14649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TypedValue f14650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TypedValue f14651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Rect f14652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f14653n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f14652m.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f14650k == null) {
            this.f14650k = new TypedValue();
        }
        return this.f14650k;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f14651l == null) {
            this.f14651l = new TypedValue();
        }
        return this.f14651l;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f14648i == null) {
            this.f14648i = new TypedValue();
        }
        return this.f14648i;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f14649j == null) {
            this.f14649j = new TypedValue();
        }
        return this.f14649j;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f14646g == null) {
            this.f14646g = new TypedValue();
        }
        return this.f14646g;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f14647h == null) {
            this.f14647h = new TypedValue();
        }
        return this.f14647h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f14653n;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f14653n;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f14649j : this.f14648i;
            if (typedValue != null && (i16 = typedValue.type) != 0) {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i16 == 6) {
                    int i18 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i18, i18);
                } else {
                    i17 = 0;
                    if (i17 <= 0) {
                        Rect rect = this.f14652m;
                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    }
                }
                i17 = (int) fraction3;
                if (i17 <= 0) {
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.f14650k : this.f14651l;
            if (typedValue2 != null && (i14 = typedValue2.type) != 0) {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i14 == 6) {
                    int i19 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i19, i19);
                } else {
                    i15 = 0;
                    if (i15 > 0) {
                        Rect rect2 = this.f14652m;
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                }
            }
        }
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f14647h : this.f14646g;
            if (typedValue3 != null && (i12 = typedValue3.type) != 0) {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i12 == 6) {
                    int i20 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i20, i20);
                } else {
                    i13 = 0;
                    if (i13 > 0) {
                        Rect rect3 = this.f14652m;
                        i13 -= rect3.left + rect3.right;
                    }
                    if (measuredWidth >= i13) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                }
                if (measuredWidth >= i13) {
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec, i11);
        }
    }

    public void setAttachListener(a aVar) {
        this.f14653n = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14652m = new Rect();
    }
}
