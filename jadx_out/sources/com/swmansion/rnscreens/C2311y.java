package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1670g0;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.B;
import h5.l;
import j7.AbstractC2800q;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: renamed from: com.swmansion.rnscreens.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2311y extends AbstractC2295h implements B.a, O6.a {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final b f25401P = new b(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f25402A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f25403B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private L6.p f25404C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f25405D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f25406E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f25407F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f25408G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f25409H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f25410I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f25411J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private D f25412K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private String f25413L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Boolean f25414M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Boolean f25415N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f25416O;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ThemedReactContext f25417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private G f25419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private A f25420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f25421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f25423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f25424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f25425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25426t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer f25427u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f25428v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f25429w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f25430x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f25431y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f25432z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f25433g = new a("INACTIVE", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f25434h = new a("TRANSITIONING_OR_BELOW_TOP", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f25435i = new a("ON_TOP", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f25436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25437k;

        static {
            a[] aVarArrH = h();
            f25436j = aVarArrH;
            f25437k = AbstractC3083a.a(aVarArrH);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f25433g, f25434h, f25435i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25436j.clone();
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f25438g = new c("PUSH", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f25439h = new c("POP", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ c[] f25440i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25441j;

        static {
            c[] cVarArrH = h();
            f25440i = cVarArrH;
            f25441j = AbstractC3083a.a(cVarArrH);
        }

        private c(String str, int i10) {
        }

        private static final /* synthetic */ c[] h() {
            return new c[]{f25438g, f25439h};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f25440i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f25442g = new d("DEFAULT", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f25443h = new d("NONE", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f25444i = new d("FADE", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f25445j = new d("SLIDE_FROM_BOTTOM", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final d f25446k = new d("SLIDE_FROM_RIGHT", 4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final d f25447l = new d("SLIDE_FROM_LEFT", 5);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final d f25448m = new d("FADE_FROM_BOTTOM", 6);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final d f25449n = new d("IOS_FROM_RIGHT", 7);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final d f25450o = new d("IOS_FROM_LEFT", 8);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ d[] f25451p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25452q;

        static {
            d[] dVarArrH = h();
            f25451p = dVarArrH;
            f25452q = AbstractC3083a.a(dVarArrH);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] h() {
            return new d[]{f25442g, f25443h, f25444i, f25445j, f25446k, f25447l, f25448m, f25449n, f25450o};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f25451p.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f25453g = new e("PUSH", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f25454h = new e("MODAL", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final e f25455i = new e("TRANSPARENT_MODAL", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final e f25456j = new e("FORM_SHEET", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ e[] f25457k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25458l;

        static {
            e[] eVarArrH = h();
            f25457k = eVarArrH;
            f25458l = AbstractC3083a.a(eVarArrH);
        }

        private e(String str, int i10) {
        }

        private static final /* synthetic */ e[] h() {
            return new e[]{f25453g, f25454h, f25455i, f25456j};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f25457k.clone();
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25459a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f25455i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f25456j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25459a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g f25460g = new g("ORIENTATION", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final g f25461h = new g("STYLE", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final g f25462i = new g("HIDDEN", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final g f25463j = new g("ANIMATED", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final g f25464k = new g("NAVIGATION_BAR_HIDDEN", 4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ g[] f25465l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25466m;

        static {
            g[] gVarArrH = h();
            f25465l = gVarArrH;
            f25466m = AbstractC3083a.a(gVarArrH);
        }

        private g(String str, int i10) {
        }

        private static final /* synthetic */ g[] h() {
            return new g[]{f25460g, f25461h, f25462i, f25463j, f25464k};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f25465l.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2311y(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f25417k = reactContext;
        this.f25423q = e.f25453g;
        this.f25424r = c.f25439h;
        this.f25425s = d.f25442g;
        this.f25426t = true;
        this.f25403B = true;
        this.f25404C = new L6.p(AbstractC2800q.e(Double.valueOf(1.0d)));
        this.f25405D = -1;
        this.f25407F = true;
        this.f25408G = 24.0f;
        this.f25410I = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.f25416O = true;
    }

    private final int B(int i10, float f10) {
        X xA;
        L6.o oVarD0;
        Integer numP;
        Fragment fragment = getFragment();
        return (fragment == null || (xA = N6.a.a(fragment)) == null || (oVarD0 = xA.getSheetDelegate()) == null || (numP = oVarD0.P()) == null) ? i10 : B7.d.h(i10, (int) (numP.intValue() + f10));
    }

    private final void C(BottomSheetBehavior bottomSheetBehavior, int i10) {
        L6.a.e(bottomSheetBehavior, Integer.valueOf(i10), false, 2, null);
        requestLayout();
    }

    private final void E(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((viewGroup instanceof SwipeRefreshLayout) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i10);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof a0) {
                    E(((a0) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    E((ViewGroup) childAt);
                }
            }
        }
    }

    private final void G(final BottomSheetBehavior bottomSheetBehavior, int i10, int i11) {
        final float translationY = getTranslationY();
        int iB = B(i10, translationY);
        final int iB2 = B(i11, translationY);
        float f10 = iB2 - iB;
        if (f10 == 0.0f) {
            return;
        }
        if (f10 > 0.0f) {
            setTranslationY(getTranslationY() + f10);
            animate().translationY(translationY).withStartAction(new Runnable() { // from class: com.swmansion.rnscreens.u
                @Override // java.lang.Runnable
                public final void run() {
                    C2311y.H(bottomSheetBehavior, iB2, this);
                }
            }).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.v
                @Override // java.lang.Runnable
                public final void run() {
                    C2311y.I(this.f25395g);
                }
            }).start();
        } else {
            animate().translationY(translationY - f10).withStartAction(new Runnable() { // from class: com.swmansion.rnscreens.w
                @Override // java.lang.Runnable
                public final void run() {
                    C2311y.J(bottomSheetBehavior, iB2);
                }
            }).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.x
                @Override // java.lang.Runnable
                public final void run() {
                    C2311y.K(this.f25398g, iB2, translationY);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(BottomSheetBehavior bottomSheetBehavior, int i10, C2311y c2311y) {
        L6.a.c(bottomSheetBehavior, Integer.valueOf(i10), null, 2, null);
        c2311y.layout(c2311y.getLeft(), c2311y.getBottom() - i10, c2311y.getRight(), c2311y.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(C2311y c2311y) {
        c2311y.getParent().requestLayout();
        c2311y.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(BottomSheetBehavior bottomSheetBehavior, int i10) {
        L6.a.c(bottomSheetBehavior, Integer.valueOf(i10), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(C2311y c2311y, int i10, float f10) {
        c2311y.layout(c2311y.getLeft(), c2311y.getBottom() - i10, c2311y.getRight(), c2311y.getBottom());
        c2311y.setTranslationY(f10);
        c2311y.getParent().requestLayout();
        c2311y.y();
    }

    private final void L(BottomSheetBehavior bottomSheetBehavior, int i10) {
        int iB = B(i10, getTranslationY());
        L6.a.c(bottomSheetBehavior, Integer.valueOf(iB), null, 2, null);
        layout(getLeft(), getBottom() - iB, getRight(), getBottom());
        getParent().requestLayout();
        b(getWidth(), iB, getTop() + ((int) getTranslationY()));
    }

    private final void i(int i10, int i11, int i12) {
        b(i10, i11, i12);
    }

    private final void j(int i10, boolean z10) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.f25417k);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new M6.s(surfaceId, getId(), i10, z10));
        }
    }

    private final void l(ViewGroup viewGroup) {
        for (View view : AbstractC1670g0.a(viewGroup)) {
            viewGroup.endViewTransition(view);
            if (view instanceof a0) {
                l(((a0) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                l((ViewGroup) view);
            }
        }
    }

    private final boolean m(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && m((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final boolean o() {
        return this.f25420n instanceof S;
    }

    public final void A() {
        if (this.f25409H) {
            return;
        }
        this.f25411J = true;
    }

    public final void D() {
        if (this.f25430x) {
            return;
        }
        this.f25430x = true;
        E(this);
    }

    public final void F() {
        if (this.f25411J) {
            this.f25411J = false;
            Fragment fragment = getFragment();
            if (fragment != null) {
                fragment.startPostponedEnterTransition();
            }
        }
    }

    @Override // com.swmansion.rnscreens.B.a
    public void a(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        BottomSheetBehavior<C2311y> sheetBehavior = getSheetBehavior();
        if (L6.r.d(this) && L6.r.b(this) && sheetBehavior != null) {
            int iA = L6.a.a(sheetBehavior);
            boolean z11 = iA == 0;
            if (iA != i14) {
                if (z11) {
                    C(sheetBehavior, i14);
                } else if (this.f25410I) {
                    G(sheetBehavior, iA, i14);
                } else {
                    L(sheetBehavior, i14);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray container) {
        AbstractC2855l.g(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray container) {
        AbstractC2855l.g(container, "container");
    }

    public final a getActivityState() {
        return this.f25421o;
    }

    @Override // O6.a
    public Fragment getAssociatedFragment() {
        return getFragment();
    }

    public final A getContainer() {
        return this.f25420n;
    }

    public final B getContentWrapper() {
        Object next;
        Iterator it = AbstractC1670g0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((View) next) instanceof B) {
                break;
            }
        }
        if (next instanceof B) {
            return (B) next;
        }
        return null;
    }

    public final D getFooter() {
        return this.f25412K;
    }

    public final Fragment getFragment() {
        G g10 = this.f25419m;
        if (g10 != null) {
            return g10.f();
        }
        return null;
    }

    public final G getFragmentWrapper() {
        return this.f25419m;
    }

    public final a0 getHeaderConfig() {
        Object next;
        Iterator it = AbstractC1670g0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((View) next) instanceof a0) {
                break;
            }
        }
        if (next instanceof a0) {
            return (a0) next;
        }
        return null;
    }

    public final boolean getInsetsApplied() {
        return this.f25418l;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f25416O;
    }

    public final ThemedReactContext getReactContext() {
        return this.f25417k;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return UIManagerHelper.getEventDispatcherForReactTag(this.f25417k, getId());
    }

    public final c getReplaceAnimation() {
        return this.f25424r;
    }

    public final String getScreenId() {
        return this.f25428v;
    }

    public final Integer getScreenOrientation() {
        return this.f25427u;
    }

    public final BottomSheetBehavior<C2311y> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c cVarE = fVar != null ? fVar.e() : null;
        if (cVarE instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarE;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.f25407F;
    }

    public final float getSheetCornerRadius() {
        return this.f25402A;
    }

    public final boolean getSheetDefaultResizeAnimationEnabled() {
        return this.f25410I;
    }

    public final L6.p getSheetDetents() {
        return this.f25404C;
    }

    public final float getSheetElevation() {
        return this.f25408G;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.f25403B;
    }

    public final int getSheetInitialDetentIndex() {
        return this.f25406E;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.f25405D;
    }

    public final boolean getSheetShouldOverflowTopInset() {
        return this.f25409H;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.f25411J;
    }

    public final d getStackAnimation() {
        return this.f25425s;
    }

    public final e getStackPresentation() {
        return this.f25423q;
    }

    public final String getStatusBarStyle() {
        return this.f25413L;
    }

    public final void h(int i10) {
        C2292e toolbar;
        setImportantForAccessibility(i10);
        a0 headerConfig = getHeaderConfig();
        if (headerConfig == null || (toolbar = headerConfig.getToolbar()) == null) {
            return;
        }
        toolbar.setImportantForAccessibility(i10);
    }

    public final void k() {
        if (this.f25430x) {
            this.f25430x = false;
            l(this);
        }
    }

    public final boolean n() {
        return this.f25430x;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f25418l = true;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Fragment fragment;
        X xA;
        L6.o oVarD0;
        super.onAttachedToWindow();
        if (!L6.r.d(this) || (fragment = getFragment()) == null || (xA = N6.a.a(fragment)) == null || (oVarD0 = xA.getSheetDelegate()) == null) {
            return;
        }
        C2298k.f25283g.b(oVarD0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0 headerConfig;
        a0 headerConfig2;
        Window window;
        if (z10 && o() && !L6.r.d(this)) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f25418l || (headerConfig = getHeaderConfig()) == null || headerConfig.h() || (headerConfig2 = getHeaderConfig()) == null || headerConfig2.i()) {
                i(i14, i15, i11);
                return;
            }
            Activity currentActivity = this.f25417k.getCurrentActivity();
            View decorView = (currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView();
            if (decorView == null) {
                throw new IllegalArgumentException("[RNScreens] DecorView is required for applying inset correction, but was null.");
            }
            int iA = Y6.a.a(decorView);
            i(i14, i15 - iA, i11 + iA);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (L6.r.d(this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final Boolean p() {
        return this.f25415N;
    }

    public final Boolean q() {
        return this.f25429w;
    }

    public final Boolean r() {
        return this.f25414M;
    }

    public final boolean s() {
        int i10 = f.f25459a[this.f25423q.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public final void setActivityState(a activityState) {
        AbstractC2855l.g(activityState, "activityState");
        a aVar = this.f25421o;
        if (activityState == aVar) {
            return;
        }
        if ((this.f25420n instanceof S) && aVar != null) {
            AbstractC2855l.d(aVar);
            if (activityState.compareTo(aVar) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.f25421o = activityState;
        A a10 = this.f25420n;
        if (a10 != null) {
            a10.r();
        }
    }

    public final void setBeingRemoved(boolean z10) {
        this.f25430x = z10;
    }

    public final void setContainer(A a10) {
        this.f25420n = a10;
    }

    public final void setFooter(D d10) {
        BottomSheetBehavior<C2311y> sheetBehavior;
        if (d10 == null && this.f25412K != null) {
            BottomSheetBehavior<C2311y> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                D d11 = this.f25412K;
                AbstractC2855l.d(d11);
                d11.v(sheetBehavior2);
            }
        } else if (d10 != null && (sheetBehavior = getSheetBehavior()) != null) {
            d10.q(sheetBehavior);
        }
        this.f25412K = d10;
    }

    public final void setFragmentWrapper(G g10) {
        this.f25419m = g10;
    }

    public final void setGestureEnabled(boolean z10) {
        this.f25426t = z10;
    }

    public final void setInsetsApplied(boolean z10) {
        this.f25418l = z10;
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z10) {
        this.f25416O = z10;
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            g0.f25132a.c();
        }
        this.f25415N = bool;
        G g10 = this.f25419m;
        if (g10 != null) {
            g0.f25132a.l(this, g10.e());
        }
    }

    public final void setReplaceAnimation(c cVar) {
        AbstractC2855l.g(cVar, "<set-?>");
        this.f25424r = cVar;
    }

    public final void setScreenId(String str) {
        this.f25428v = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setScreenOrientation(String str) {
        int i10;
        if (str == null) {
            this.f25427u = null;
            return;
        }
        g0 g0Var = g0.f25132a;
        g0Var.d();
        switch (str.hashCode()) {
            case -1894896954:
                i10 = !str.equals("portrait_down") ? -1 : 9;
                break;
            case 96673:
                if (str.equals("all")) {
                    i10 = 10;
                    break;
                }
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    i10 = 7;
                    break;
                }
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    i10 = 6;
                    break;
                }
                break;
            case 1651658175:
                if (str.equals("portrait_up")) {
                    i10 = 1;
                    break;
                }
                break;
            case 1730732811:
                if (str.equals("landscape_left")) {
                    i10 = 8;
                    break;
                }
                break;
            case 2118770584:
                if (str.equals("landscape_right")) {
                    i10 = 0;
                    break;
                }
                break;
        }
        this.f25427u = Integer.valueOf(i10);
        G g10 = this.f25419m;
        if (g10 != null) {
            g0Var.m(this, g10.e());
        }
    }

    public final void setSheetClosesOnTouchOutside(boolean z10) {
        this.f25407F = z10;
    }

    public final void setSheetCornerRadius(float f10) {
        if (this.f25402A == f10) {
            return;
        }
        this.f25402A = f10;
        this.f25432z = true;
    }

    public final void setSheetDefaultResizeAnimationEnabled(boolean z10) {
        this.f25410I = z10;
    }

    public final void setSheetDetents(L6.p pVar) {
        AbstractC2855l.g(pVar, "<set-?>");
        this.f25404C = pVar;
    }

    public final void setSheetElevation(float f10) {
        this.f25408G = f10;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z10) {
        this.f25403B = z10;
    }

    public final void setSheetGrabberVisible(boolean z10) {
        this.f25431y = z10;
    }

    public final void setSheetInitialDetentIndex(int i10) {
        this.f25406E = i10;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i10) {
        this.f25405D = i10;
    }

    public final void setSheetShouldOverflowTopInset(boolean z10) {
        this.f25409H = z10;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z10) {
        this.f25411J = z10;
    }

    public final void setStackAnimation(d dVar) {
        AbstractC2855l.g(dVar, "<set-?>");
        this.f25425s = dVar;
    }

    public final void setStackPresentation(e eVar) {
        AbstractC2855l.g(eVar, "<set-?>");
        this.f25423q = eVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f25429w = bool;
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            g0.f25132a.e();
        }
        this.f25414M = bool;
        G g10 = this.f25419m;
        if (g10 != null) {
            g0.f25132a.k(this, g10.e());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            g0.f25132a.e();
        }
        this.f25413L = str;
        G g10 = this.f25419m;
        if (g10 != null) {
            g0.f25132a.o(this, g10.e(), g10.i());
        }
    }

    public final void setTransitioning(boolean z10) {
        if (this.f25422p == z10) {
            return;
        }
        this.f25422p = z10;
        boolean zM = m(this);
        if (!zM || getLayerType() == 2) {
            super.setLayerType((!z10 || zM) ? 0 : 2, null);
        }
    }

    public final void t(int i10) {
        Context context = getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new M6.d(surfaceId, getId(), PixelUtil.toDIPFromPixel(i10)));
        }
    }

    public final void u(boolean z10) {
        if (L6.r.d(this) && o()) {
            if (L6.r.b(this)) {
                requestLayout();
            }
            if (z10) {
                i(getWidth(), getHeight(), getTop());
            }
            D d10 = this.f25412K;
            if (d10 != null) {
                int left = getLeft();
                int top = getTop();
                int right = getRight();
                int bottom = getBottom();
                A a10 = this.f25420n;
                AbstractC2855l.d(a10);
                d10.p(z10, left, top, right, bottom, a10.getHeight());
            }
        }
    }

    public final void v() {
        if (this.f25432z) {
            this.f25432z = false;
            w();
        }
    }

    public final void w() {
        if (this.f25423q != e.f25456j || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        h5.h hVar = background instanceof h5.h ? (h5.h) background : null;
        if (hVar != null) {
            float fMax = Math.max(PixelUtil.toDIPFromPixel(this.f25402A), 0.0f);
            l.b bVar = new l.b();
            bVar.A(0, fMax);
            bVar.F(0, fMax);
            hVar.setShapeAppearanceModel(bVar.m());
        }
    }

    public final void x(int i10, boolean z10) {
        j(i10, z10);
        if (z10) {
            y();
        }
    }

    public final void y() {
        b(getWidth(), getHeight(), getTop() + ((int) getTranslationY()));
    }

    public final void z(B wrapper) {
        AbstractC2855l.g(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
    }
}
