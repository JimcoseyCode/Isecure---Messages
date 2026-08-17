package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.f0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.l;
import e5.AbstractC2425c;
import k5.AbstractC2830a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f23499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f23500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final NavigationBarPresenter f23501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MenuInflater f23502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f23503k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Bundle f23504i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f23504i = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f23504i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        boolean a(MenuItem menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationBarView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f23501i = navigationBarPresenter;
        Context context2 = getContext();
        f0 f0VarJ = l.j(context2, attributeSet, Q4.k.f9727k4, i10, i11, Q4.k.f9449C4, Q4.k.f9433A4);
        f fVar = new f(context2, getClass(), getMaxItemCount(), g());
        this.f23499g = fVar;
        i iVarC = c(context2);
        this.f23500h = iVarC;
        iVarC.setMinimumHeight(getSuggestedMinimumHeight());
        iVarC.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        navigationBarPresenter.l(iVarC);
        navigationBarPresenter.j(1);
        iVarC.setPresenter(navigationBarPresenter);
        fVar.b(navigationBarPresenter);
        navigationBarPresenter.g(getContext(), fVar);
        if (f0VarJ.s(Q4.k.f9823w4)) {
            iVarC.setIconTintList(f0VarJ.c(Q4.k.f9823w4));
        } else {
            iVarC.setIconTintList(iVarC.e(R.attr.textColorSecondary));
        }
        setItemIconSize(f0VarJ.f(Q4.k.f9815v4, getResources().getDimensionPixelSize(Q4.c.f9241n0)));
        if (f0VarJ.s(Q4.k.f9449C4)) {
            setItemTextAppearanceInactive(f0VarJ.n(Q4.k.f9449C4, 0));
        }
        if (f0VarJ.s(Q4.k.f9433A4)) {
            setItemTextAppearanceActive(f0VarJ.n(Q4.k.f9433A4, 0));
        }
        if (f0VarJ.s(Q4.k.f9767p4)) {
            setHorizontalItemTextAppearanceInactive(f0VarJ.n(Q4.k.f9767p4, 0));
        }
        if (f0VarJ.s(Q4.k.f9759o4)) {
            setHorizontalItemTextAppearanceActive(f0VarJ.n(Q4.k.f9759o4, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(f0VarJ.a(Q4.k.f9441B4, true));
        if (f0VarJ.s(Q4.k.f9457D4)) {
            setItemTextColor(f0VarJ.c(Q4.k.f9457D4));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(background);
        if (background == null || colorStateListF != null) {
            h5.h hVar = new h5.h(h5.l.e(context2, attributeSet, i10, i11).m());
            if (colorStateListF != null) {
                hVar.d0(colorStateListF);
            }
            hVar.R(context2);
            setBackground(hVar);
        }
        if (f0VarJ.s(Q4.k.f9839y4)) {
            setItemPaddingTop(f0VarJ.f(Q4.k.f9839y4, 0));
        }
        if (f0VarJ.s(Q4.k.f9831x4)) {
            setItemPaddingBottom(f0VarJ.f(Q4.k.f9831x4, 0));
        }
        if (f0VarJ.s(Q4.k.f9735l4)) {
            setActiveIndicatorLabelPadding(f0VarJ.f(Q4.k.f9735l4, 0));
        }
        if (f0VarJ.s(Q4.k.f9775q4)) {
            setIconLabelHorizontalSpacing(f0VarJ.f(Q4.k.f9775q4, 0));
        }
        if (f0VarJ.s(Q4.k.f9751n4)) {
            setElevation(f0VarJ.f(Q4.k.f9751n4, 0));
        }
        getBackground().mutate().setTintList(AbstractC2425c.b(context2, f0VarJ, Q4.k.f9743m4));
        int dimensionPixelSize = -1;
        setLabelVisibilityMode(f0VarJ.l(Q4.k.f9481G4, -1));
        setItemIconGravity(f0VarJ.l(Q4.k.f9807u4, 0));
        setItemGravity(f0VarJ.l(Q4.k.f9799t4, 49));
        int iN = f0VarJ.n(Q4.k.f9791s4, 0);
        if (iN != 0) {
            iVarC.setItemBackgroundRes(iN);
        } else {
            setItemRippleColor(AbstractC2425c.b(context2, f0VarJ, Q4.k.f9847z4));
        }
        setMeasureBottomPaddingFromLabelBaseline(f0VarJ.a(Q4.k.f9489H4, true));
        setLabelFontScalingEnabled(f0VarJ.a(Q4.k.f9465E4, false));
        setLabelMaxLines(f0VarJ.l(Q4.k.f9473F4, 1));
        int iN2 = f0VarJ.n(Q4.k.f9783r4, 0);
        if (iN2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iN2, Q4.k.f9616X3);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Q4.k.f9632Z3, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize2);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(Q4.k.f9624Y3, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9711i4, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(Q4.k.f9703h4);
            if (string == null) {
                dimensionPixelSize = -2;
                setItemActiveIndicatorExpandedWidth(dimensionPixelSize);
                setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(Q4.k.f9686f4, dimensionPixelSize2));
                setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9695g4, dimensionPixelOffset));
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(Q4.c.f9191D);
                int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9668d4, dimensionPixelSize3);
                int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9659c4, dimensionPixelSize3);
                h(getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9677e4, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9650b4, 0));
                setItemActiveIndicatorColor(AbstractC2425c.a(context2, typedArrayObtainStyledAttributes, Q4.k.f9641a4));
                setItemActiveIndicatorShapeAppearance(h5.l.b(context2, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9719j4, 0), 0).m());
                typedArrayObtainStyledAttributes.recycle();
            } else {
                if (!String.valueOf(-1).equals(string)) {
                    if (!String.valueOf(-2).equals(string)) {
                        dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(Q4.k.f9703h4, -2);
                    }
                }
                setItemActiveIndicatorExpandedWidth(dimensionPixelSize);
                setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(Q4.k.f9686f4, dimensionPixelSize2));
                setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9695g4, dimensionPixelOffset));
                int dimensionPixelSize32 = getResources().getDimensionPixelSize(Q4.c.f9191D);
                int dimensionPixelOffset22 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9668d4, dimensionPixelSize32);
                int dimensionPixelOffset32 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9659c4, dimensionPixelSize32);
                h(getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9677e4, 0), getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, typedArrayObtainStyledAttributes.getDimensionPixelOffset(Q4.k.f9650b4, 0));
                setItemActiveIndicatorColor(AbstractC2425c.a(context2, typedArrayObtainStyledAttributes, Q4.k.f9641a4));
                setItemActiveIndicatorShapeAppearance(h5.l.b(context2, typedArrayObtainStyledAttributes.getResourceId(Q4.k.f9719j4, 0), 0).m());
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        if (f0VarJ.s(Q4.k.f9497I4)) {
            f(f0VarJ.n(Q4.k.f9497I4, 0));
        }
        f0VarJ.x();
        if (!i()) {
            addView(iVarC);
        }
        fVar.W(new a());
    }

    static /* synthetic */ b a(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f23502j == null) {
            this.f23502j = new androidx.appcompat.view.g(getContext());
        }
        return this.f23502j;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f23500h.setMeasurePaddingFromLabelBaseline(z10);
    }

    protected abstract i c(Context context);

    public com.google.android.material.badge.a d(int i10) {
        return this.f23500h.j(i10);
    }

    public com.google.android.material.badge.a e(int i10) {
        return this.f23500h.k(i10);
    }

    public void f(int i10) {
        this.f23501i.m(true);
        getMenuInflater().inflate(i10, this.f23499g);
        this.f23501i.m(false);
        this.f23501i.b(true);
    }

    protected boolean g() {
        return false;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f23500h.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f23500h.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f23500h.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f23500h.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f23500h.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f23500h.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f23500h.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f23500h.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f23500h.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f23500h.getItemActiveIndicatorMarginHorizontal();
    }

    public h5.l getItemActiveIndicatorShapeAppearance() {
        return this.f23500h.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f23500h.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f23500h.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f23500h.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f23500h.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f23500h.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f23500h.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f23500h.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f23500h.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f23500h.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f23500h.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f23500h.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f23500h.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f23500h.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f23500h.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f23499g;
    }

    public androidx.appcompat.view.menu.k getMenuView() {
        return this.f23500h;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f23500h;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f23501i;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f23500h.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f23500h.getSelectedItemId();
    }

    public void h(int i10, int i11, int i12, int i13) {
        this.f23500h.r(i10, i11, i12, i13);
    }

    public boolean i() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h5.i.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f23499g.T(savedState.f23504i);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f23504i = bundle;
        this.f23499g.V(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f23500h.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h5.i.d(this, f10);
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f23500h.setHorizontalItemTextAppearanceActive(i10);
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f23500h.setHorizontalItemTextAppearanceInactive(i10);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f23500h.setIconLabelHorizontalSpacing(i10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f23500h.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f23500h.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f23500h.setItemActiveIndicatorExpandedHeight(i10);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f23500h.setItemActiveIndicatorExpandedMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f23500h.setItemActiveIndicatorExpandedWidth(i10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f23500h.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f23500h.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(h5.l lVar) {
        this.f23500h.setItemActiveIndicatorShapeAppearance(lVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f23500h.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f23500h.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f23500h.setItemBackgroundRes(i10);
    }

    public void setItemGravity(int i10) {
        if (this.f23500h.getItemGravity() != i10) {
            this.f23500h.setItemGravity(i10);
            this.f23501i.b(false);
        }
    }

    public void setItemIconGravity(int i10) {
        if (this.f23500h.getItemIconGravity() != i10) {
            this.f23500h.setItemIconGravity(i10);
            this.f23501i.b(false);
        }
    }

    public void setItemIconSize(int i10) {
        this.f23500h.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f23500h.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f23500h.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f23500h.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f23500h.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f23500h.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f23500h.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f23500h.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f23500h.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f23500h.setLabelFontScalingEnabled(z10);
    }

    public void setLabelMaxLines(int i10) {
        this.f23500h.setLabelMaxLines(i10);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f23500h.getLabelVisibilityMode() != i10) {
            this.f23500h.setLabelVisibilityMode(i10);
            this.f23501i.b(false);
        }
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f23503k = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem menuItemFindItem = this.f23499g.findItem(i10);
        if (menuItemFindItem != null) {
            boolean zP = this.f23499g.P(menuItemFindItem, this.f23501i, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zP || menuItemFindItem.isChecked()) {
                    this.f23500h.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            NavigationBarView.a(NavigationBarView.this);
            return (NavigationBarView.this.f23503k == null || NavigationBarView.this.f23503k.a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }
}
