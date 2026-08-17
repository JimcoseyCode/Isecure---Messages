package com.google.android.material.navigation;

import I0.z;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.transition.C1783a;
import androidx.transition.r;
import androidx.transition.t;
import f.AbstractC2568a;
import g.AbstractC2619a;
import h5.l;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends ViewGroup implements androidx.appcompat.view.menu.k {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int[] f23584f0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int[] f23585g0 = {-16842910};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f23586A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final SparseArray f23587B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f23588C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f23589D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f23590E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f23591F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f23592G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f23593H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f23594I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f23595J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f23596K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f23597L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f23598M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f23599N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private l f23600O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f23601P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ColorStateList f23602Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private NavigationBarPresenter f23603R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private g f23604S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f23605T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f23606U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f23607V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f23608W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f23609a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private MenuItem f23610b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f23611c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f23612d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Rect f23613e0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t f23614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View.OnClickListener f23615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private H0.e f23616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseArray f23617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h[] f23620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f23623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ColorStateList f23625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ColorStateList f23626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f23628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f23629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f23632y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f23633z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.appcompat.view.menu.g itemData = ((e) view).getItemData();
            boolean zE = i.this.f23604S.e(itemData, i.this.f23603R, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!zE || itemData.isChecked()) {
                i.this.setCheckedItem(itemData);
            }
        }
    }

    public i(Context context) {
        super(context);
        this.f23617j = new SparseArray();
        this.f23621n = -1;
        this.f23622o = -1;
        this.f23587B = new SparseArray();
        this.f23588C = -1;
        this.f23589D = -1;
        this.f23590E = -1;
        this.f23591F = -1;
        this.f23599N = 49;
        this.f23601P = false;
        this.f23607V = 1;
        this.f23608W = 0;
        this.f23610b0 = null;
        this.f23611c0 = 7;
        this.f23612d0 = false;
        this.f23613e0 = new Rect();
        this.f23626s = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f23614g = null;
        } else {
            C1783a c1783a = new C1783a();
            this.f23614g = c1783a;
            c1783a.x0(0);
            c1783a.q(TextView.class, true);
            c1783a.b0(c5.d.f(getContext(), Q4.a.f9163q0, getResources().getInteger(Q4.f.f9326b)));
            c1783a.d0(c5.d.g(getContext(), Q4.a.f9177x0, R4.a.f10025b));
            c1783a.n0(new com.google.android.material.internal.j());
        }
        this.f23615h = new a();
        setImportantForAccessibility(1);
    }

    private Drawable f() {
        if (this.f23600O == null || this.f23602Q == null) {
            return null;
        }
        h5.h hVar = new h5.h(this.f23600O);
        hVar.d0(this.f23602Q);
        return hVar;
    }

    private e g(int i10, androidx.appcompat.view.menu.g gVar, boolean z10, boolean z11) {
        this.f23603R.m(true);
        gVar.setCheckable(true);
        this.f23603R.m(false);
        e newItem = getNewItem();
        newItem.setShifting(z10);
        newItem.setLabelMaxLines(this.f23607V);
        newItem.setIconTintList(this.f23623p);
        newItem.setIconSize(this.f23624q);
        newItem.setTextColor(this.f23626s);
        newItem.setTextAppearanceInactive(this.f23627t);
        newItem.setTextAppearanceActive(this.f23628u);
        newItem.setHorizontalTextAppearanceInactive(this.f23629v);
        newItem.setHorizontalTextAppearanceActive(this.f23630w);
        newItem.setTextAppearanceActiveBoldEnabled(this.f23631x);
        newItem.setTextColor(this.f23625r);
        int i11 = this.f23588C;
        if (i11 != -1) {
            newItem.setItemPaddingTop(i11);
        }
        int i12 = this.f23589D;
        if (i12 != -1) {
            newItem.setItemPaddingBottom(i12);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f23605T);
        newItem.setLabelFontScalingEnabled(this.f23606U);
        int i13 = this.f23590E;
        if (i13 != -1) {
            newItem.setActiveIndicatorLabelPadding(i13);
        }
        int i14 = this.f23591F;
        if (i14 != -1) {
            newItem.setIconLabelHorizontalSpacing(i14);
        }
        newItem.setActiveIndicatorWidth(this.f23593H);
        newItem.setActiveIndicatorHeight(this.f23594I);
        newItem.setActiveIndicatorExpandedWidth(this.f23595J);
        newItem.setActiveIndicatorExpandedHeight(this.f23596K);
        newItem.setActiveIndicatorMarginHorizontal(this.f23597L);
        newItem.setItemGravity(this.f23599N);
        newItem.setActiveIndicatorExpandedPadding(this.f23613e0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f23598M);
        newItem.setActiveIndicatorDrawable(f());
        newItem.setActiveIndicatorResizeable(this.f23601P);
        newItem.setActiveIndicatorEnabled(this.f23592G);
        Drawable drawable = this.f23632y;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f23586A);
        }
        newItem.setItemRippleColor(this.f23633z);
        newItem.setLabelVisibilityMode(this.f23618k);
        newItem.setItemIconGravity(this.f23619l);
        newItem.setOnlyShowWhenExpanded(z11);
        newItem.setExpanded(this.f23609a0);
        newItem.d(gVar, 0);
        newItem.setItemPosition(i10);
        int itemId = gVar.getItemId();
        newItem.setOnTouchListener((View.OnTouchListener) this.f23617j.get(itemId));
        newItem.setOnClickListener(this.f23615h);
        int i15 = this.f23621n;
        if (i15 != 0 && itemId == i15) {
            this.f23622o = i10;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f23611c0, this.f23604S.d());
    }

    private e getNewItem() {
        H0.e eVar = this.f23616i;
        e eVar2 = eVar != null ? (e) eVar.acquire() : null;
        return eVar2 == null ? h(getContext()) : eVar2;
    }

    private boolean l() {
        g gVar;
        if (this.f23620m == null || (gVar = this.f23604S) == null || gVar.g() != this.f23620m.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f23620m.length) {
                return true;
            }
            if ((this.f23604S.b(i10) instanceof com.google.android.material.navigation.a) && !(this.f23620m[i10] instanceof b)) {
                return false;
            }
            boolean z10 = this.f23604S.b(i10).hasSubMenu() && !(this.f23620m[i10] instanceof k);
            boolean z11 = (this.f23604S.b(i10).hasSubMenu() || (this.f23620m[i10] instanceof e)) ? false : true;
            if (!(this.f23604S.b(i10) instanceof com.google.android.material.navigation.a) && (z10 || z11)) {
                break;
            }
            i10++;
        }
        return false;
    }

    private boolean n(int i10) {
        return i10 != -1;
    }

    private void o() {
        h[] hVarArr = this.f23620m;
        if (hVarArr == null || this.f23616i == null) {
            return;
        }
        for (h hVar : hVarArr) {
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                this.f23616i.release(eVar);
                eVar.g();
            }
        }
    }

    private void p() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f23604S.g(); i10++) {
            hashSet.add(Integer.valueOf(this.f23604S.b(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f23587B.size(); i11++) {
            int iKeyAt = this.f23587B.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f23587B.delete(iKeyAt);
            }
        }
    }

    private void setBadgeIfNeeded(e eVar) {
        com.google.android.material.badge.a aVar;
        int id = eVar.getId();
        if (n(id) && (aVar = (com.google.android.material.badge.a) this.f23587B.get(id)) != null) {
            eVar.setBadge(aVar);
        }
    }

    private void u(int i10) {
        if (n(i10)) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f23604S = new g(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        View viewG;
        removeAllViews();
        o();
        this.f23603R.m(true);
        this.f23604S.f();
        this.f23603R.m(false);
        int iA = this.f23604S.a();
        if (iA == 0) {
            this.f23621n = 0;
            this.f23622o = 0;
            this.f23620m = null;
            this.f23616i = null;
            return;
        }
        if (this.f23616i == null || this.f23608W != iA) {
            this.f23608W = iA;
            this.f23616i = new H0.f(iA);
        }
        p();
        int iG = this.f23604S.g();
        this.f23620m = new h[iG];
        boolean zM = m(this.f23618k, getCurrentVisibleContentItemCount());
        int size = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.f23604S.b(i11);
            boolean z10 = menuItemB instanceof com.google.android.material.navigation.a;
            if (z10) {
                b bVar = new b(getContext());
                bVar.setOnlyShowWhenExpanded(true);
                bVar.setDividersEnabled(this.f23612d0);
                viewG = bVar;
            } else if (menuItemB.hasSubMenu()) {
                if (size > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                k kVar = new k(getContext());
                int i12 = this.f23630w;
                if (i12 == 0) {
                    i12 = this.f23628u;
                }
                kVar.setTextAppearance(i12);
                kVar.setTextColor(this.f23625r);
                kVar.setOnlyShowWhenExpanded(true);
                kVar.d((androidx.appcompat.view.menu.g) menuItemB, 0);
                size = menuItemB.getSubMenu().size();
                viewG = kVar;
            } else if (size > 0) {
                size--;
                viewG = g(i11, (androidx.appcompat.view.menu.g) menuItemB, zM, true);
            } else {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) menuItemB;
                boolean z11 = i10 >= this.f23611c0;
                i10++;
                viewG = g(i11, gVar, zM, z11);
            }
            if (!z10 && menuItemB.isCheckable() && this.f23622o == -1) {
                this.f23622o = i11;
            }
            this.f23620m[i11] = viewG;
            addView(viewG);
        }
        int iMin = Math.min(iG - 1, this.f23622o);
        this.f23622o = iMin;
        setCheckedItem(this.f23620m[iMin].getItemData());
    }

    public ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = AbstractC2619a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(AbstractC2568a.f26751w, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f23585g0;
        return new ColorStateList(new int[][]{iArr, f23584f0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f23590E;
    }

    SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.f23587B;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f23609a0 ? this.f23604S.c() : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f23630w;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f23629v;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f23591F;
    }

    public ColorStateList getIconTintList() {
        return this.f23623p;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f23602Q;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f23592G;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f23596K;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f23598M;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f23595J;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f23594I;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f23597L;
    }

    public l getItemActiveIndicatorShapeAppearance() {
        return this.f23600O;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f23593H;
    }

    public Drawable getItemBackground() {
        h[] hVarArr = this.f23620m;
        if (hVarArr != null && hVarArr.length > 0) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    return ((e) hVar).getBackground();
                }
            }
        }
        return this.f23632y;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f23586A;
    }

    public int getItemGravity() {
        return this.f23599N;
    }

    public int getItemIconGravity() {
        return this.f23619l;
    }

    public int getItemIconSize() {
        return this.f23624q;
    }

    public int getItemPaddingBottom() {
        return this.f23589D;
    }

    public int getItemPaddingTop() {
        return this.f23588C;
    }

    public ColorStateList getItemRippleColor() {
        return this.f23633z;
    }

    public int getItemTextAppearanceActive() {
        return this.f23628u;
    }

    public int getItemTextAppearanceInactive() {
        return this.f23627t;
    }

    public ColorStateList getItemTextColor() {
        return this.f23625r;
    }

    public int getLabelMaxLines() {
        return this.f23607V;
    }

    public int getLabelVisibilityMode() {
        return this.f23618k;
    }

    protected g getMenu() {
        return this.f23604S;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f23606U;
    }

    public int getSelectedItemId() {
        return this.f23621n;
    }

    protected int getSelectedItemPosition() {
        return this.f23622o;
    }

    public int getWindowAnimations() {
        return 0;
    }

    protected abstract e h(Context context);

    public e i(int i10) {
        u(i10);
        h[] hVarArr = this.f23620m;
        if (hVarArr == null) {
            return null;
        }
        for (h hVar : hVarArr) {
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                if (eVar.getId() == i10) {
                    return eVar;
                }
            }
        }
        return null;
    }

    public com.google.android.material.badge.a j(int i10) {
        return (com.google.android.material.badge.a) this.f23587B.get(i10);
    }

    com.google.android.material.badge.a k(int i10) {
        u(i10);
        com.google.android.material.badge.a aVarG = (com.google.android.material.badge.a) this.f23587B.get(i10);
        if (aVarG == null) {
            aVarG = com.google.android.material.badge.a.g(getContext());
            this.f23587B.put(i10, aVarG);
        }
        e eVarI = i(i10);
        if (eVarI != null) {
            eVarI.setBadge(aVarG);
        }
        return aVarG;
    }

    protected boolean m(int i10, int i11) {
        return i10 == -1 ? i11 > 3 : i10 == 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.d1(accessibilityNodeInfo).y0(z.f.b(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    void q(SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            if (this.f23587B.indexOfKey(iKeyAt) < 0) {
                this.f23587B.append(iKeyAt, (com.google.android.material.badge.a) sparseArray.get(iKeyAt));
            }
        }
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    e eVar = (e) hVar;
                    com.google.android.material.badge.a aVar = (com.google.android.material.badge.a) this.f23587B.get(eVar.getId());
                    if (aVar != null) {
                        eVar.setBadge(aVar);
                    }
                }
            }
        }
    }

    public void r(int i10, int i11, int i12, int i13) {
        Rect rect = this.f23613e0;
        rect.left = i10;
        rect.top = i11;
        rect.right = i12;
        rect.bottom = i13;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedPadding(this.f23613e0);
                }
            }
        }
    }

    void s(int i10) {
        int iG = this.f23604S.g();
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.f23604S.b(i11);
            if (i10 == menuItemB.getItemId()) {
                this.f23621n = i10;
                this.f23622o = i11;
                setCheckedItem(menuItemB);
                return;
            }
        }
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f23590E = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorLabelPadding(i10);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f23610b0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f23610b0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f23610b0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f23610b0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i10) {
        this.f23611c0 = i10;
    }

    public void setExpanded(boolean z10) {
        this.f23609a0 = z10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                hVar.setExpanded(z10);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f23630w = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f23629v = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f23591F = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconLabelHorizontalSpacing(i10);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f23623p = colorStateList;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f23602Q = colorStateList;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f23592G = z10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorEnabled(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f23596K = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f23598M = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f23595J = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedWidth(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f23594I = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f23597L = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorMarginHorizontal(i10);
                }
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z10) {
        this.f23601P = z10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorResizeable(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(l lVar) {
        this.f23600O = lVar;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f23593H = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorWidth(i10);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f23632y = drawable;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f23586A = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(i10);
                }
            }
        }
    }

    public void setItemGravity(int i10) {
        this.f23599N = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemGravity(i10);
                }
            }
        }
    }

    public void setItemIconGravity(int i10) {
        this.f23619l = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemIconGravity(i10);
                }
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f23624q = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconSize(i10);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f23589D = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingBottom(this.f23589D);
                }
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f23588C = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingTop(i10);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f23633z = colorStateList;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f23628u = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f23631x = z10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActiveBoldEnabled(z10);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f23627t = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f23625r = colorStateList;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f23606U = z10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelFontScalingEnabled(z10);
                }
            }
        }
    }

    public void setLabelMaxLines(int i10) {
        this.f23607V = i10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelMaxLines(i10);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f23618k = i10;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z10) {
        this.f23605T = z10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setMeasureBottomPaddingFromLabelBaseline(z10);
                }
            }
        }
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f23603R = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.f23612d0 == z10) {
            return;
        }
        this.f23612d0 = z10;
        h[] hVarArr = this.f23620m;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof b) {
                    ((b) hVar).setDividersEnabled(z10);
                }
            }
        }
    }

    public void t() {
        t tVar;
        if (this.f23604S == null || this.f23620m == null) {
            return;
        }
        this.f23603R.m(true);
        this.f23604S.f();
        this.f23603R.m(false);
        if (!l()) {
            d();
            return;
        }
        int i10 = this.f23621n;
        int iG = this.f23604S.g();
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.f23604S.b(i11);
            if (menuItemB.isChecked()) {
                setCheckedItem(menuItemB);
                this.f23621n = menuItemB.getItemId();
                this.f23622o = i11;
            }
        }
        if (i10 != this.f23621n && (tVar = this.f23614g) != null) {
            r.a(this, tVar);
        }
        boolean zM = m(this.f23618k, getCurrentVisibleContentItemCount());
        for (int i12 = 0; i12 < iG; i12++) {
            this.f23603R.m(true);
            this.f23620m[i12].setExpanded(this.f23609a0);
            h hVar = this.f23620m[i12];
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                eVar.setLabelVisibilityMode(this.f23618k);
                eVar.setItemIconGravity(this.f23619l);
                eVar.setItemGravity(this.f23599N);
                eVar.setShifting(zM);
            }
            if (this.f23604S.b(i12) instanceof androidx.appcompat.view.menu.g) {
                this.f23620m[i12].d((androidx.appcompat.view.menu.g) this.f23604S.b(i12), 0);
            }
            this.f23603R.m(false);
        }
    }
}
