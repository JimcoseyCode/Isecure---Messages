package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC1627a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1692s;
import androidx.core.view.C1704y;
import androidx.core.view.InterfaceC1698v;
import androidx.customview.view.AbsSavedState;
import f.AbstractC2568a;
import f.AbstractC2577j;
import g.AbstractC2619a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1698v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f14830A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f14831B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f14832C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private CharSequence f14833D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private CharSequence f14834E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private ColorStateList f14835F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ColorStateList f14836G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f14837H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f14838I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final ArrayList f14839J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final ArrayList f14840K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int[] f14841L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final C1704y f14842M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ArrayList f14843N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    h f14844O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final ActionMenuView.e f14845P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private j0 f14846Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private ActionMenuPresenter f14847R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private f f14848S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private j.a f14849T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    e.a f14850U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f14851V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private OnBackInvokedCallback f14852W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private OnBackInvokedDispatcher f14853a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f14854b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Runnable f14855c0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionMenuView f14856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f14857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f14858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ImageButton f14859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageView f14860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f14861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f14862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ImageButton f14863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    View f14864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Context f14865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f14868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f14869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f14870u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f14871v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f14872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f14873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f14874y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private X f14875z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f14842M.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f14844O;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f14850U;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f14856g.H()) {
                Toolbar.this.f14842M.i(eVar);
            }
            e.a aVar = Toolbar.this.f14850U;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.i0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f14842M.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f14843N = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f14855c0);
        post(this.f14855c0);
    }

    private boolean O() {
        if (!this.f14851V) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = AbstractC1692s.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f14885b == 0 && P(childAt) && p(gVar.f14121a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f14885b == 0 && P(childAt2) && p(gVar2.f14121a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f14885b = 1;
        if (!z10 || this.f14864o == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f14840K.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f14875z == null) {
            this.f14875z = new X();
        }
    }

    private void i() {
        if (this.f14860k == null) {
            this.f14860k = new C1644q(getContext());
        }
    }

    private void j() {
        k();
        if (this.f14856g.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f14856g.getMenu();
            if (this.f14848S == null) {
                this.f14848S = new f();
            }
            this.f14856g.setExpandedActionViewsExclusive(true);
            eVar.c(this.f14848S, this.f14865p);
            R();
        }
    }

    private void k() {
        if (this.f14856g == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f14856g = actionMenuView;
            actionMenuView.setPopupTheme(this.f14866q);
            this.f14856g.setOnMenuItemClickListener(this.f14845P);
            this.f14856g.M(this.f14849T, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f14121a = (this.f14869t & 112) | 8388613;
            this.f14856g.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f14856g, false);
        }
    }

    private void l() {
        if (this.f14859j == null) {
            this.f14859j = new C1642o(getContext(), null, AbstractC2568a.f26727N);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f14121a = (this.f14869t & 112) | 8388611;
            this.f14859j.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = AbstractC1692s.b(i10, layoutDirection) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f14121a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f14832C & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.f14840K.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f14856g;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f14856g;
        return actionMenuView != null && actionMenuView.H();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f14885b != 2 && childAt != this.f14856g) {
                removeViewAt(childCount);
                this.f14840K.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f14875z.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar == null && this.f14856g == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f14856g.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.R(this.f14847R);
            eVarL.R(this.f14848S);
        }
        if (this.f14848S == null) {
            this.f14848S = new f();
        }
        actionMenuPresenter.I(true);
        if (eVar != null) {
            eVar.c(actionMenuPresenter, this.f14865p);
            eVar.c(this.f14848S, this.f14865p);
        } else {
            actionMenuPresenter.g(this.f14865p, null);
            this.f14848S.g(this.f14865p, null);
            actionMenuPresenter.b(true);
            this.f14848S.b(true);
        }
        this.f14856g.setPopupTheme(this.f14866q);
        this.f14856g.setPresenter(actionMenuPresenter);
        this.f14847R = actionMenuPresenter;
        R();
    }

    public void L(j.a aVar, e.a aVar2) {
        this.f14849T = aVar;
        this.f14850U = aVar2;
        ActionMenuView actionMenuView = this.f14856g;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f14868s = i10;
        TextView textView = this.f14858i;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f14867r = i10;
        TextView textView = this.f14857h;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f14856g;
        return actionMenuView != null && actionMenuView.N();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f14854b0;
            if (z10 && this.f14853a0 == null) {
                if (this.f14852W == null) {
                    this.f14852W = e.b(new Runnable() { // from class: androidx.appcompat.widget.g0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14990g.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f14852W);
                this.f14853a0 = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f14853a0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f14852W);
            this.f14853a0 = null;
        }
    }

    void a() {
        for (int size = this.f14840K.size() - 1; size >= 0; size--) {
            addView((View) this.f14840K.get(size));
        }
        this.f14840K.clear();
    }

    @Override // androidx.core.view.InterfaceC1698v
    public void addMenuProvider(androidx.core.view.B b10) {
        this.f14842M.c(b10);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f14856g) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.f14848S;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f14883h;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f14856g;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f14863n == null) {
            C1642o c1642o = new C1642o(getContext(), null, AbstractC2568a.f26727N);
            this.f14863n = c1642o;
            c1642o.setImageDrawable(this.f14861l);
            this.f14863n.setContentDescription(this.f14862m);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f14121a = (this.f14869t & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f14885b = 2;
            this.f14863n.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f14863n.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f14863n;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f14863n;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        X x10 = this.f14875z;
        if (x10 != null) {
            return x10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f14831B;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        X x10 = this.f14875z;
        if (x10 != null) {
            return x10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        X x10 = this.f14875z;
        if (x10 != null) {
            return x10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        X x10 = this.f14875z;
        if (x10 != null) {
            return x10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f14830A;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f14856g;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f14831B, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f14830A, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f14860k;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f14860k;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f14856g.getMenu();
    }

    View getNavButtonView() {
        return this.f14859j;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f14859j;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f14859j;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f14847R;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f14856g.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f14865p;
    }

    public int getPopupTheme() {
        return this.f14866q;
    }

    public CharSequence getSubtitle() {
        return this.f14834E;
    }

    final TextView getSubtitleTextView() {
        return this.f14858i;
    }

    public CharSequence getTitle() {
        return this.f14833D;
    }

    public int getTitleMarginBottom() {
        return this.f14874y;
    }

    public int getTitleMarginEnd() {
        return this.f14872w;
    }

    public int getTitleMarginStart() {
        return this.f14871v;
    }

    public int getTitleMarginTop() {
        return this.f14873x;
    }

    final TextView getTitleTextView() {
        return this.f14857h;
    }

    public H getWrapper() {
        if (this.f14846Q == null) {
            this.f14846Q = new j0(this, true);
        }
        return this.f14846Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC1627a.C0145a ? new g((AbstractC1627a.C0145a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f14855c0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f14838I = false;
        }
        if (!this.f14838I) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f14838I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f14838I = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iC;
        int iD;
        int iMax;
        boolean zP;
        boolean zP2;
        boolean z11;
        int measuredHeight;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int iC2;
        int i20;
        int size2;
        int i21;
        int i22;
        int size3;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i23 = width - paddingRight;
        int[] iArr = this.f14841L;
        iArr[1] = 0;
        iArr[0] = 0;
        int iZ = AbstractC1658a0.z(this);
        int iMin = iZ >= 0 ? Math.min(iZ, i13 - i11) : 0;
        if (!P(this.f14859j)) {
            iC = paddingLeft;
        } else {
            if (z12) {
                iD = D(this.f14859j, i23, iArr, iMin);
                iC = paddingLeft;
                if (P(this.f14863n)) {
                    if (z12) {
                        iD = D(this.f14863n, iD, iArr, iMin);
                    } else {
                        iC = C(this.f14863n, iC, iArr, iMin);
                    }
                }
                if (P(this.f14856g)) {
                    if (z12) {
                        iC = C(this.f14856g, iC, iArr, iMin);
                    } else {
                        iD = D(this.f14856g, iD, iArr, iMin);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iC);
                iArr[1] = Math.max(0, currentContentInsetRight - (i23 - iD));
                iMax = Math.max(iC, currentContentInsetLeft);
                int iMin2 = Math.min(iD, i23 - currentContentInsetRight);
                if (P(this.f14864o)) {
                    if (z12) {
                        iMin2 = D(this.f14864o, iMin2, iArr, iMin);
                    } else {
                        iMax = C(this.f14864o, iMax, iArr, iMin);
                    }
                }
                if (P(this.f14860k)) {
                    if (z12) {
                        iMin2 = D(this.f14860k, iMin2, iArr, iMin);
                    } else {
                        iMax = C(this.f14860k, iMax, iArr, iMin);
                    }
                }
                zP = P(this.f14857h);
                zP2 = P(this.f14858i);
                if (zP) {
                    z11 = z12;
                    measuredHeight = 0;
                } else {
                    g gVar = (g) this.f14857h.getLayoutParams();
                    z11 = z12;
                    measuredHeight = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f14857h.getMeasuredHeight();
                }
                if (!zP2) {
                    g gVar2 = (g) this.f14858i.getLayoutParams();
                    measuredHeight += ((ViewGroup.MarginLayoutParams) gVar2).topMargin + this.f14858i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin;
                }
                if (!zP || zP2) {
                    TextView textView = !zP ? this.f14857h : this.f14858i;
                    TextView textView2 = !zP2 ? this.f14858i : this.f14857h;
                    g gVar3 = (g) textView.getLayoutParams();
                    g gVar4 = (g) textView2.getLayoutParams();
                    int i24 = measuredHeight;
                    boolean z13 = (zP && this.f14857h.getMeasuredWidth() > 0) || (zP2 && this.f14858i.getMeasuredWidth() > 0);
                    i14 = this.f14832C & 112;
                    int i25 = iMax;
                    if (i14 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f14873x;
                    } else if (i14 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i24) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin;
                        int i27 = this.f14873x;
                        if (iMax2 < i26 + i27) {
                            iMax2 = i26 + i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i24) - iMax2) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                            int i30 = this.f14874y;
                            if (i28 < i29 + i30) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.f14874y) - i24;
                    }
                    if (z11) {
                        int i31 = (z13 ? this.f14871v : 0) - iArr[1];
                        iMin2 -= Math.max(0, i31);
                        iArr[1] = Math.max(0, -i31);
                        if (zP) {
                            g gVar5 = (g) this.f14857h.getLayoutParams();
                            int measuredWidth = iMin2 - this.f14857h.getMeasuredWidth();
                            int measuredHeight2 = this.f14857h.getMeasuredHeight() + paddingTop;
                            this.f14857h.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i18 = measuredWidth - this.f14872w;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                        } else {
                            i18 = iMin2;
                        }
                        if (zP2) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f14858i.getLayoutParams())).topMargin;
                            this.f14858i.layout(iMin2 - this.f14858i.getMeasuredWidth(), i32, iMin2, this.f14858i.getMeasuredHeight() + i32);
                            i19 = iMin2 - this.f14872w;
                        } else {
                            i19 = iMin2;
                        }
                        if (z13) {
                            iMin2 = Math.min(i18, i19);
                        }
                        iMax = i25;
                        i15 = 0;
                    } else {
                        i15 = 0;
                        int i33 = (z13 ? this.f14871v : 0) - iArr[0];
                        iMax = i25 + Math.max(0, i33);
                        iArr[0] = Math.max(0, -i33);
                        if (zP) {
                            g gVar6 = (g) this.f14857h.getLayoutParams();
                            int measuredWidth2 = this.f14857h.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f14857h.getMeasuredHeight() + paddingTop;
                            this.f14857h.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i16 = measuredWidth2 + this.f14872w;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                        } else {
                            i16 = iMax;
                        }
                        if (zP2) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f14858i.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f14858i.getMeasuredWidth() + iMax;
                            this.f14858i.layout(iMax, i34, measuredWidth3, this.f14858i.getMeasuredHeight() + i34);
                            i17 = measuredWidth3 + this.f14872w;
                        } else {
                            i17 = iMax;
                        }
                        if (z13) {
                            iMax = Math.max(i16, i17);
                        }
                    }
                } else {
                    i15 = 0;
                }
                b(this.f14839J, 3);
                size = this.f14839J.size();
                iC2 = iMax;
                for (i20 = i15; i20 < size; i20++) {
                    iC2 = C((View) this.f14839J.get(i20), iC2, iArr, iMin);
                }
                b(this.f14839J, 5);
                size2 = this.f14839J.size();
                for (i21 = i15; i21 < size2; i21++) {
                    iMin2 = D((View) this.f14839J.get(i21), iMin2, iArr, iMin);
                }
                b(this.f14839J, 1);
                int iU = u(this.f14839J, iArr);
                i22 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU / 2);
                int i35 = iU + i22;
                if (i22 >= iC2) {
                    iC2 = i35 > iMin2 ? i22 - (i35 - iMin2) : i22;
                }
                size3 = this.f14839J.size();
                while (i15 < size3) {
                    iC2 = C((View) this.f14839J.get(i15), iC2, iArr, iMin);
                    i15++;
                }
                this.f14839J.clear();
            }
            iC = C(this.f14859j, paddingLeft, iArr, iMin);
        }
        iD = i23;
        if (P(this.f14863n)) {
        }
        if (P(this.f14856g)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iC);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i23 - iD));
        iMax = Math.max(iC, currentContentInsetLeft2);
        int iMin22 = Math.min(iD, i23 - currentContentInsetRight2);
        if (P(this.f14864o)) {
        }
        if (P(this.f14860k)) {
        }
        zP = P(this.f14857h);
        zP2 = P(this.f14858i);
        if (zP) {
        }
        if (!zP2) {
        }
        if (zP) {
            if (!zP) {
            }
            if (!zP2) {
            }
            g gVar32 = (g) textView.getLayoutParams();
            g gVar42 = (g) textView2.getLayoutParams();
            int i242 = measuredHeight;
            if (zP) {
                i14 = this.f14832C & 112;
                int i252 = iMax;
                if (i14 == 48) {
                }
                if (z11) {
                }
            } else {
                i14 = this.f14832C & 112;
                int i2522 = iMax;
                if (i14 == 48) {
                }
                if (z11) {
                }
            }
        }
        b(this.f14839J, 3);
        size = this.f14839J.size();
        iC2 = iMax;
        while (i20 < size) {
        }
        b(this.f14839J, 5);
        size2 = this.f14839J.size();
        while (i21 < size2) {
        }
        b(this.f14839J, 1);
        int iU2 = u(this.f14839J, iArr);
        i22 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU2 / 2);
        int i352 = iU2 + i22;
        if (i22 >= iC2) {
        }
        size3 = this.f14839J.size();
        while (i15 < size3) {
        }
        this.f14839J.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f14841L;
        boolean zB = q0.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f14859j)) {
            F(this.f14859j, i10, 0, i11, 0, this.f14870u);
            measuredWidth = this.f14859j.getMeasuredWidth() + s(this.f14859j);
            iMax = Math.max(0, this.f14859j.getMeasuredHeight() + t(this.f14859j));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f14859j.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f14863n)) {
            F(this.f14863n, i10, 0, i11, 0, this.f14870u);
            measuredWidth = this.f14863n.getMeasuredWidth() + s(this.f14863n);
            iMax = Math.max(iMax, this.f14863n.getMeasuredHeight() + t(this.f14863n));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14863n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f14856g)) {
            F(this.f14856g, i10, iMax3, i11, 0, this.f14870u);
            measuredWidth2 = this.f14856g.getMeasuredWidth() + s(this.f14856g);
            iMax = Math.max(iMax, this.f14856g.getMeasuredHeight() + t(this.f14856g));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14856g.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f14864o)) {
            iArr = iArr2;
            iMax4 += E(this.f14864o, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f14864o.getMeasuredHeight() + t(this.f14864o));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14864o.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f14860k)) {
            iMax4 += E(this.f14860k, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f14860k.getMeasuredHeight() + t(this.f14860k));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14860k.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f14885b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f14873x + this.f14874y;
        int i16 = this.f14871v + this.f14872w;
        if (P(this.f14857h)) {
            E(this.f14857h, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f14857h.getMeasuredWidth() + s(this.f14857h);
            int measuredHeight2 = this.f14857h.getMeasuredHeight() + t(this.f14857h);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f14857h.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (P(this.f14858i)) {
            iMax2 = Math.max(iMax2, E(this.f14858i, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f14858i.getMeasuredHeight() + t(this.f14858i);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f14858i.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f14856g;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = savedState.f14876i;
        if (i10 != 0 && this.f14848S != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f14877j) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f14875z.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f14848S;
        if (fVar != null && (gVar = fVar.f14883h) != null) {
            savedState.f14876i = gVar.getItemId();
        }
        savedState.f14877j = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14837H = false;
        }
        if (!this.f14837H) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f14837H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f14837H = false;
        }
        return true;
    }

    @Override // androidx.core.view.InterfaceC1698v
    public void removeMenuProvider(androidx.core.view.B b10) {
        this.f14842M.j(b10);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f14854b0 != z10) {
            this.f14854b0 = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(AbstractC2619a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f14851V = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = androidx.customview.widget.a.INVALID_ID;
        }
        if (i10 != this.f14831B) {
            this.f14831B = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = androidx.customview.widget.a.INVALID_ID;
        }
        if (i10 != this.f14830A) {
            this.f14830A = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(AbstractC2619a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(AbstractC2619a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f14859j.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f14844O = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f14856g.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f14866q != i10) {
            this.f14866q = i10;
            if (i10 == 0) {
                this.f14865p = getContext();
            } else {
                this.f14865p = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f14874y = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f14872w = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f14871v = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f14873x = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.f14848S;
        return (fVar == null || fVar.f14883h == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f14856g;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator it = this.f14843N.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class g extends AbstractC1627a.C0145a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14885b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14885b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f14885b = 0;
            this.f14121a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC1627a.C0145a) gVar);
            this.f14885b = 0;
            this.f14885b = gVar.f14885b;
        }

        public g(AbstractC1627a.C0145a c0145a) {
            super(c0145a);
            this.f14885b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14885b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14885b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26728O);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f14863n;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f14863n.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f14863n;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f14861l);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f14860k)) {
                c(this.f14860k, true);
            }
        } else {
            ImageView imageView = this.f14860k;
            if (imageView != null && z(imageView)) {
                removeView(this.f14860k);
                this.f14840K.remove(this.f14860k);
            }
        }
        ImageView imageView2 = this.f14860k;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f14860k;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f14859j;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            k0.a(this.f14859j, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f14859j)) {
                c(this.f14859j, true);
            }
        } else {
            ImageButton imageButton = this.f14859j;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f14859j);
                this.f14840K.remove(this.f14859j);
            }
        }
        ImageButton imageButton2 = this.f14859j;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f14858i;
            if (textView != null && z(textView)) {
                removeView(this.f14858i);
                this.f14840K.remove(this.f14858i);
            }
        } else {
            if (this.f14858i == null) {
                Context context = getContext();
                B b10 = new B(context);
                this.f14858i = b10;
                b10.setSingleLine();
                this.f14858i.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f14868s;
                if (i10 != 0) {
                    this.f14858i.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f14836G;
                if (colorStateList != null) {
                    this.f14858i.setTextColor(colorStateList);
                }
            }
            if (!z(this.f14858i)) {
                c(this.f14858i, true);
            }
        }
        TextView textView2 = this.f14858i;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f14834E = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f14836G = colorStateList;
        TextView textView = this.f14858i;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f14857h;
            if (textView != null && z(textView)) {
                removeView(this.f14857h);
                this.f14840K.remove(this.f14857h);
            }
        } else {
            if (this.f14857h == null) {
                Context context = getContext();
                B b10 = new B(context);
                this.f14857h = b10;
                b10.setSingleLine();
                this.f14857h.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f14867r;
                if (i10 != 0) {
                    this.f14857h.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f14835F;
                if (colorStateList != null) {
                    this.f14857h.setTextColor(colorStateList);
                }
            }
            if (!z(this.f14857h)) {
                c(this.f14857h, true);
            }
        }
        TextView textView2 = this.f14857h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f14833D = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f14835F = colorStateList;
        TextView textView = this.f14857h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f14876i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f14877j;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14876i = parcel.readInt();
            this.f14877j = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f14876i);
            parcel.writeInt(this.f14877j ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14832C = 8388627;
        this.f14839J = new ArrayList();
        this.f14840K = new ArrayList();
        this.f14841L = new int[2];
        this.f14842M = new C1704y(new Runnable() { // from class: androidx.appcompat.widget.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14997g.y();
            }
        });
        this.f14843N = new ArrayList();
        this.f14845P = new a();
        this.f14855c0 = new b();
        f0 f0VarV = f0.v(getContext(), attributeSet, AbstractC2577j.f27082j3, i10, 0);
        AbstractC1658a0.i0(this, context, AbstractC2577j.f27082j3, attributeSet, f0VarV.r(), i10, 0);
        this.f14867r = f0VarV.n(AbstractC2577j.f26964L3, 0);
        this.f14868s = f0VarV.n(AbstractC2577j.f26919C3, 0);
        this.f14832C = f0VarV.l(AbstractC2577j.f27087k3, this.f14832C);
        this.f14869t = f0VarV.l(AbstractC2577j.f27092l3, 48);
        int iE = f0VarV.e(AbstractC2577j.f26934F3, 0);
        iE = f0VarV.s(AbstractC2577j.f26959K3) ? f0VarV.e(AbstractC2577j.f26959K3, iE) : iE;
        this.f14874y = iE;
        this.f14873x = iE;
        this.f14872w = iE;
        this.f14871v = iE;
        int iE2 = f0VarV.e(AbstractC2577j.f26949I3, -1);
        if (iE2 >= 0) {
            this.f14871v = iE2;
        }
        int iE3 = f0VarV.e(AbstractC2577j.f26944H3, -1);
        if (iE3 >= 0) {
            this.f14872w = iE3;
        }
        int iE4 = f0VarV.e(AbstractC2577j.f26954J3, -1);
        if (iE4 >= 0) {
            this.f14873x = iE4;
        }
        int iE5 = f0VarV.e(AbstractC2577j.f26939G3, -1);
        if (iE5 >= 0) {
            this.f14874y = iE5;
        }
        this.f14870u = f0VarV.f(AbstractC2577j.f27147w3, -1);
        int iE6 = f0VarV.e(AbstractC2577j.f27127s3, androidx.customview.widget.a.INVALID_ID);
        int iE7 = f0VarV.e(AbstractC2577j.f27107o3, androidx.customview.widget.a.INVALID_ID);
        int iF = f0VarV.f(AbstractC2577j.f27117q3, 0);
        int iF2 = f0VarV.f(AbstractC2577j.f27122r3, 0);
        h();
        this.f14875z.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f14875z.g(iE6, iE7);
        }
        this.f14830A = f0VarV.e(AbstractC2577j.f27132t3, androidx.customview.widget.a.INVALID_ID);
        this.f14831B = f0VarV.e(AbstractC2577j.f27112p3, androidx.customview.widget.a.INVALID_ID);
        this.f14861l = f0VarV.g(AbstractC2577j.f27102n3);
        this.f14862m = f0VarV.p(AbstractC2577j.f27097m3);
        CharSequence charSequenceP = f0VarV.p(AbstractC2577j.f26929E3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = f0VarV.p(AbstractC2577j.f26914B3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f14865p = getContext();
        setPopupTheme(f0VarV.n(AbstractC2577j.f26909A3, 0));
        Drawable drawableG = f0VarV.g(AbstractC2577j.f27162z3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = f0VarV.p(AbstractC2577j.f27157y3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = f0VarV.g(AbstractC2577j.f27137u3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = f0VarV.p(AbstractC2577j.f27142v3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (f0VarV.s(AbstractC2577j.f26969M3)) {
            setTitleTextColor(f0VarV.c(AbstractC2577j.f26969M3));
        }
        if (f0VarV.s(AbstractC2577j.f26924D3)) {
            setSubtitleTextColor(f0VarV.c(AbstractC2577j.f26924D3));
        }
        if (f0VarV.s(AbstractC2577j.f27152x3)) {
            x(f0VarV.n(AbstractC2577j.f27152x3, 0));
        }
        f0VarV.x();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.appcompat.view.menu.e f14882g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.appcompat.view.menu.g f14883h;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(boolean z10) {
            if (this.f14883h != null) {
                androidx.appcompat.view.menu.e eVar = this.f14882g;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f14882g.getItem(i10) == this.f14883h) {
                            return;
                        }
                    }
                }
                d(this.f14882g, this.f14883h);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f14864o;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f14864o);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f14863n);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f14864o = null;
            toolbar3.a();
            this.f14883h = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f14863n.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f14863n);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f14863n);
            }
            Toolbar.this.f14864o = gVar.getActionView();
            this.f14883h = gVar;
            ViewParent parent2 = Toolbar.this.f14864o.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f14864o);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f14121a = (toolbar4.f14869t & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f14885b = 2;
                toolbar4.f14864o.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f14864o);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f14864o;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void g(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f14882g;
            if (eVar2 != null && (gVar = this.f14883h) != null) {
                eVar2.f(gVar);
            }
            this.f14882g = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean i(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable k() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public void h(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }
}
