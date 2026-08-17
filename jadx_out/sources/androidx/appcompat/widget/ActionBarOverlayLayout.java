package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import com.facebook.react.uimanager.ViewDefaults;
import f.AbstractC2568a;
import f.AbstractC2573f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements G, androidx.core.view.F, androidx.core.view.G {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final int[] f14510M = {AbstractC2568a.f26730b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final L0 f14511N = new L0.a().d(x0.e.c(0, 1, 0, 1)).a();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Rect f14512O = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private L0 f14513A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private L0 f14514B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private L0 f14515C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private L0 f14516D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private d f14517E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private OverScroller f14518F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    ViewPropertyAnimator f14519G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final AnimatorListenerAdapter f14520H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Runnable f14521I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Runnable f14522J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final androidx.core.view.H f14523K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final f f14524L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ContentFrameLayout f14527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ActionBarContainer f14528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private H f14529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f14530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f14533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f14534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f14537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f14538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Rect f14539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Rect f14540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f14541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Rect f14542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Rect f14543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Rect f14544z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f14519G = null;
            actionBarOverlayLayout.f14534p = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f14519G = null;
            actionBarOverlayLayout.f14534p = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.p();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f14519G = actionBarOverlayLayout.f14528j.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f14520H);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.p();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f14519G = actionBarOverlayLayout.f14528j.animate().translationY(-ActionBarOverlayLayout.this.f14528j.getHeight()).setListener(ActionBarOverlayLayout.this.f14520H);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14526h = 0;
        this.f14537s = new Rect();
        this.f14538t = new Rect();
        this.f14539u = new Rect();
        this.f14540v = new Rect();
        this.f14541w = new Rect();
        this.f14542x = new Rect();
        this.f14543y = new Rect();
        this.f14544z = new Rect();
        L0 l02 = L0.f16462b;
        this.f14513A = l02;
        this.f14514B = l02;
        this.f14515C = l02;
        this.f14516D = l02;
        this.f14520H = new a();
        this.f14521I = new b();
        this.f14522J = new c();
        q(context);
        this.f14523K = new androidx.core.view.H(this);
        f fVar = new f(context);
        this.f14524L = fVar;
        addView(fVar);
    }

    private void e() {
        p();
        this.f14522J.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean k(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        e eVar = (e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z14 = true;
            } else {
                z14 = false;
            }
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                z14 = true;
            }
        }
        if (z13) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                z14 = true;
            }
        }
        if (z12) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z14;
    }

    private boolean l() {
        AbstractC1658a0.f(this.f14524L, f14511N, this.f14540v);
        return !this.f14540v.equals(f14512O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private H o(View view) {
        if (view instanceof H) {
            return (H) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void q(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f14510M);
        this.f14525g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f14530l = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f14518F = new OverScroller(context);
    }

    private void s() {
        p();
        postDelayed(this.f14522J, 600L);
    }

    private void t() {
        p();
        postDelayed(this.f14521I, 600L);
    }

    private void v() {
        p();
        this.f14521I.run();
    }

    private boolean w(float f10) {
        this.f14518F.fling(0, 0, 0, (int) f10, 0, 0, androidx.customview.widget.a.INVALID_ID, ViewDefaults.NUMBER_OF_LINES);
        return this.f14518F.getFinalY() > this.f14528j.getHeight();
    }

    @Override // androidx.appcompat.widget.G
    public void a(Menu menu, j.a aVar) {
        u();
        this.f14529k.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.G
    public boolean b() {
        u();
        return this.f14529k.b();
    }

    @Override // androidx.appcompat.widget.G
    public void c() {
        u();
        this.f14529k.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.G
    public boolean d() {
        u();
        return this.f14529k.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f14530l != null) {
            int bottom = this.f14528j.getVisibility() == 0 ? (int) (this.f14528j.getBottom() + this.f14528j.getTranslationY() + 0.5f) : 0;
            this.f14530l.setBounds(0, bottom, getWidth(), this.f14530l.getIntrinsicHeight() + bottom);
            this.f14530l.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.G
    public boolean f() {
        u();
        return this.f14529k.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.G
    public boolean g() {
        u();
        return this.f14529k.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f14528j;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f14523K.a();
    }

    public CharSequence getTitle() {
        u();
        return this.f14529k.getTitle();
    }

    @Override // androidx.appcompat.widget.G
    public boolean h() {
        u();
        return this.f14529k.h();
    }

    @Override // androidx.appcompat.widget.G
    public void i(int i10) {
        u();
        if (i10 == 2) {
            this.f14529k.v();
        } else if (i10 == 5) {
            this.f14529k.w();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.G
    public void j() {
        u();
        this.f14529k.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        u();
        L0 l0Z = L0.z(windowInsets, this);
        boolean zK = k(this.f14528j, new Rect(l0Z.k(), l0Z.m(), l0Z.l(), l0Z.j()), true, true, false, true);
        AbstractC1658a0.f(this, l0Z, this.f14537s);
        Rect rect = this.f14537s;
        L0 l0N = l0Z.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f14513A = l0N;
        boolean z10 = true;
        if (!this.f14514B.equals(l0N)) {
            this.f14514B = this.f14513A;
            zK = true;
        }
        if (this.f14538t.equals(this.f14537s)) {
            z10 = zK;
        } else {
            this.f14538t.set(this.f14537s);
        }
        if (z10) {
            requestLayout();
        }
        return l0Z.a().c().b().x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q(getContext());
        AbstractC1658a0.h0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        u();
        measureChildWithMargins(this.f14528j, i10, 0, i11, 0);
        e eVar = (e) this.f14528j.getLayoutParams();
        int iMax = Math.max(0, this.f14528j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f14528j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f14528j.getMeasuredState());
        boolean z10 = (AbstractC1658a0.K(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f14525g;
            if (this.f14532n && this.f14528j.getTabContainer() != null) {
                measuredHeight += this.f14525g;
            }
        } else {
            measuredHeight = this.f14528j.getVisibility() != 8 ? this.f14528j.getMeasuredHeight() : 0;
        }
        this.f14539u.set(this.f14537s);
        this.f14515C = this.f14513A;
        if (this.f14531m || z10 || !l()) {
            this.f14515C = new L0.a(this.f14515C).d(x0.e.c(this.f14515C.k(), this.f14515C.m() + measuredHeight, this.f14515C.l(), this.f14515C.j())).a();
        } else {
            Rect rect = this.f14539u;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f14515C = this.f14515C.n(0, measuredHeight, 0, 0);
        }
        k(this.f14527i, this.f14539u, true, true, true, true);
        if (!this.f14516D.equals(this.f14515C)) {
            L0 l02 = this.f14515C;
            this.f14516D = l02;
            AbstractC1658a0.g(this.f14527i, l02);
        }
        measureChildWithMargins(this.f14527i, i10, 0, i11, 0);
        e eVar2 = (e) this.f14527i.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f14527i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f14527i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f14527i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f14533o || !z10) {
            return false;
        }
        if (w(f11)) {
            e();
        } else {
            v();
        }
        this.f14534p = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // androidx.core.view.G
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.F
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.F
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // androidx.core.view.F
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        u();
        int i11 = this.f14536r ^ i10;
        this.f14536r = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f14517E;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f14517E.a();
            } else {
                this.f14517E.d();
            }
        }
        if ((i11 & 256) == 0 || this.f14517E == null) {
            return;
        }
        AbstractC1658a0.h0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f14526h = i10;
        d dVar = this.f14517E;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    void p() {
        removeCallbacks(this.f14521I);
        removeCallbacks(this.f14522J);
        ViewPropertyAnimator viewPropertyAnimator = this.f14519G;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean r() {
        return this.f14531m;
    }

    public void setActionBarHideOffset(int i10) {
        p();
        this.f14528j.setTranslationY(-Math.max(0, Math.min(i10, this.f14528j.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f14517E = dVar;
        if (getWindowToken() != null) {
            this.f14517E.onWindowVisibilityChanged(this.f14526h);
            int i10 = this.f14536r;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                AbstractC1658a0.h0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f14532n = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f14533o) {
            this.f14533o = z10;
            if (z10) {
                return;
            }
            p();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        u();
        this.f14529k.setIcon(i10);
    }

    public void setLogo(int i10) {
        u();
        this.f14529k.n(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f14531m = z10;
    }

    @Override // androidx.appcompat.widget.G
    public void setWindowCallback(Window.Callback callback) {
        u();
        this.f14529k.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.G
    public void setWindowTitle(CharSequence charSequence) {
        u();
        this.f14529k.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        if (this.f14527i == null) {
            this.f14527i = (ContentFrameLayout) findViewById(AbstractC2573f.f26840b);
            this.f14528j = (ActionBarContainer) findViewById(AbstractC2573f.f26841c);
            this.f14529k = o(findViewById(AbstractC2573f.f26839a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.F
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.F
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f14523K.b(view, view2, i10);
        this.f14535q = getActionBarHideOffset();
        p();
        d dVar = this.f14517E;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f14528j.getVisibility() != 0) {
            return false;
        }
        return this.f14533o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f14533o && !this.f14534p) {
            if (this.f14535q <= this.f14528j.getHeight()) {
                t();
            } else {
                s();
            }
        }
        d dVar = this.f14517E;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f14535q + i11;
        this.f14535q = i14;
        setActionBarHideOffset(i14);
    }

    public void setIcon(Drawable drawable) {
        u();
        this.f14529k.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }
}
