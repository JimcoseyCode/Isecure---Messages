package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.e;
import com.google.android.material.navigation.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class b extends i {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final int f22771h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final int f22772i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final int f22773j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final int f22774k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f22775l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final List f22776m0;

    public b(Context context) {
        super(context);
        this.f22776m0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f22771h0 = resources.getDimensionPixelSize(Q4.c.f9224f);
        this.f22772i0 = resources.getDimensionPixelSize(Q4.c.f9226g);
        this.f22773j0 = resources.getDimensionPixelSize(Q4.c.f9220d);
        this.f22774k0 = resources.getDimensionPixelSize(Q4.c.f9222e);
    }

    @Override // com.google.android.material.navigation.i
    protected e h(Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i17 = i14 - measuredWidth;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i15);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i15);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.f22776m0.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), androidx.customview.widget.a.INVALID_ID);
        int i14 = 0;
        if (getItemIconGravity() == 0) {
            if (m(getLabelVisibilityMode(), currentVisibleContentItemCount) && v()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int iMax2 = this.f22774k0;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f22773j0, androidx.customview.widget.a.INVALID_ID), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i15 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin = Math.min(size - (this.f22772i0 * i15), Math.min(iMax2, this.f22773j0));
                int i16 = size - iMin;
                int iMin2 = Math.min(i16 / (i15 != 0 ? i15 : 1), this.f22771h0);
                int i17 = i16 - (i15 * iMin2);
                int i18 = 0;
                while (i18 < childCount) {
                    if (getChildAt(i18).getVisibility() != 8) {
                        i13 = i18 == getSelectedItemPosition() ? iMin : iMin2;
                        if (i17 > 0) {
                            i13++;
                            i17--;
                        }
                    } else {
                        i13 = 0;
                    }
                    this.f22776m0.add(Integer.valueOf(i13));
                    i18++;
                }
            } else {
                int iMin3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), this.f22773j0);
                int i19 = size - (currentVisibleContentItemCount * iMin3);
                for (int i20 = 0; i20 < childCount; i20++) {
                    if (getChildAt(i20).getVisibility() == 8) {
                        i12 = 0;
                    } else if (i19 > 0) {
                        i12 = iMin3 + 1;
                        i19--;
                    } else {
                        i12 = iMin3;
                    }
                    this.f22776m0.add(Integer.valueOf(i12));
                }
            }
            measuredWidth = 0;
            iMax = 0;
            while (i14 < childCount) {
                View childAt2 = getChildAt(i14);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) this.f22776m0.get(i14)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    measuredWidth += childAt2.getMeasuredWidth();
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                }
                i14++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f10 = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f10;
            float f11 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f11);
            int iRound2 = Math.round(f10 / f11);
            int measuredWidth2 = 0;
            int iMax3 = 0;
            while (i14 < childCount) {
                View childAt3 = getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, androidx.customview.widget.a.INVALID_ID), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    measuredWidth2 += childAt3.getMeasuredWidth();
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                }
                i14++;
            }
            measuredWidth = measuredWidth2;
            iMax = iMax3;
        }
        setMeasuredDimension(measuredWidth, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f22775l0 = z10;
    }

    public boolean v() {
        return this.f22775l0;
    }
}
