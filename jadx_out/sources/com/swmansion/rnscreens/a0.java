package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC1627a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.swmansion.rnscreens.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends AbstractC2293f implements ReactPointerEventsView {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final a f25062J = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f25063A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f25064B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f25065C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f25066D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f25067E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f25068F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final View.OnClickListener f25069G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f25070H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final c0 f25071I;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ReactPointerEventsView f25072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f25073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C2292e f25074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f25077r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f25078s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f25079t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f25080u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f25081v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f25083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f25084y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f25085z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextView a(Toolbar toolbar) {
            AbstractC2855l.g(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toolbar.getChildAt(i10);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25086a;

        static {
            int[] iArr = new int[d0.a.values().length];
            try {
                iArr[d0.a.f25100g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.a.f25102i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.a.f25101h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25086a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, ReactPointerEventsView pointerEventsImpl) {
        super(context);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(pointerEventsImpl, "pointerEventsImpl");
        this.f25072m = pointerEventsImpl;
        this.f25073n = new ArrayList(3);
        this.f25069G = new View.OnClickListener() { // from class: com.swmansion.rnscreens.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.e(this.f25061g, view);
            }
        };
        this.f25071I = new c0();
        setVisibility(8);
        C2292e c2292e = new C2292e(context, this);
        this.f25074o = c2292e;
        this.f25067E = c2292e.getContentInsetStart();
        this.f25068F = c2292e.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            c2292e.setBackgroundColor(typedValue.data);
        }
        c2292e.setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a0 a0Var, View view) {
        X screenFragment = a0Var.getScreenFragment();
        if (screenFragment != null) {
            S screenStack = a0Var.getScreenStack();
            if (screenStack == null || !AbstractC2855l.b(screenStack.getRootScreen(), screenFragment.j())) {
                if (screenFragment.j().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.Y();
                    return;
                } else {
                    screenFragment.y();
                    return;
                }
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof X) {
                X x10 = (X) parentFragment;
                if (x10.j().getNativeBackButtonDismissalEnabled()) {
                    x10.Y();
                } else {
                    x10.y();
                }
            }
        }
    }

    private final C2311y getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof C2311y) {
            return (C2311y) parent;
        }
        return null;
    }

    private final S getScreenStack() {
        C2311y screen = getScreen();
        A container = screen != null ? screen.getContainer() : null;
        if (container instanceof S) {
            return (S) container;
        }
        return null;
    }

    private final void j() {
        C2311y screen;
        if (getParent() == null || this.f25063A || (screen = getScreen()) == null || screen.n()) {
            return;
        }
        l();
    }

    public final void d(d0 child, int i10) {
        AbstractC2855l.g(child, "child");
        this.f25073n.add(i10, child);
        j();
    }

    public final void f() {
        this.f25063A = true;
    }

    public final d0 g(int i10) {
        Object obj = this.f25073n.get(i10);
        AbstractC2855l.f(obj, "get(...)");
        return (d0) obj;
    }

    public final int getConfigSubviewsCount() {
        return this.f25073n.size();
    }

    public final c0 getHeaderHeightUpdateProxy() {
        return this.f25071I;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return this.f25072m.getPointerEvents();
    }

    public final int getPreferredContentInsetEnd() {
        return this.f25067E;
    }

    public final int getPreferredContentInsetStart() {
        return this.f25067E;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.f25070H) {
            return 0;
        }
        return this.f25068F;
    }

    public final X getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof C2311y)) {
            return null;
        }
        Fragment fragment = ((C2311y) parent).getFragment();
        if (fragment instanceof X) {
            return (X) fragment;
        }
        return null;
    }

    public final C2292e getToolbar() {
        return this.f25074o;
    }

    public final boolean h() {
        return this.f25075p;
    }

    public final boolean i() {
        return this.f25076q;
    }

    public final void k(Toolbar toolbar, boolean z10) {
        Object next;
        AbstractC2855l.g(toolbar, "toolbar");
        if (z10) {
            int currentContentInsetStart = toolbar.getNavigationIcon() != null ? toolbar.getCurrentContentInsetStart() + toolbar.getPaddingStart() : Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
            Iterator it = this.f25073n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((d0) next).getType() == d0.a.f25100g) {
                        break;
                    }
                }
            }
            d0 d0Var = (d0) next;
            if (d0Var != null) {
                currentContentInsetStart = d0Var.getLeft();
            }
            int currentContentInsetEnd = toolbar.getCurrentContentInsetEnd() + toolbar.getPaddingEnd();
            this.f25071I.a(this, getScreen());
            a(toolbar.getWidth(), toolbar.getHeight(), currentContentInsetStart, currentContentInsetEnd);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l() {
        Drawable navigationIcon;
        X screenFragment;
        X screenFragment2;
        ReactContext reactContextI;
        S screenStack = getScreenStack();
        boolean z10 = screenStack == null || AbstractC2855l.b(screenStack.getTopScreen(), getParent());
        if (this.f25066D && z10 && !this.f25063A) {
            X screenFragment3 = getScreenFragment();
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (dVar == null) {
                return;
            }
            String str = this.f25080u;
            if (str != null) {
                if (AbstractC2855l.b(str, "rtl")) {
                    this.f25074o.setLayoutDirection(1);
                } else if (AbstractC2855l.b(this.f25080u, "ltr")) {
                    this.f25074o.setLayoutDirection(0);
                }
            }
            C2311y screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextI = (ReactContext) context;
                } else {
                    G fragmentWrapper = screen.getFragmentWrapper();
                    reactContextI = fragmentWrapper != null ? fragmentWrapper.i() : null;
                }
                g0.f25132a.p(screen, dVar, reactContextI);
            }
            if (this.f25075p) {
                if (this.f25074o.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    screenFragment2.h0();
                }
                this.f25071I.a(this, getScreen());
                return;
            }
            if (this.f25074o.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.o0(this.f25074o);
            }
            dVar.setSupportActionBar(this.f25074o);
            AbstractC1627a supportActionBar = dVar.getSupportActionBar();
            if (supportActionBar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            X screenFragment4 = getScreenFragment();
            supportActionBar.s((screenFragment4 == null || !screenFragment4.U() || this.f25084y) ? false : true);
            supportActionBar.w(this.f25077r);
            if (TextUtils.isEmpty(this.f25077r)) {
                this.f25070H = true;
            }
            this.f25074o.V();
            this.f25074o.setNavigationOnClickListener(this.f25069G);
            X screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.p0(this.f25085z);
            }
            X screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.q0(this.f25076q);
            }
            TextView textViewA = f25062J.a(this.f25074o);
            int i10 = this.f25078s;
            if (i10 != 0) {
                this.f25074o.setTitleTextColor(i10);
            }
            if (textViewA != null) {
                String str2 = this.f25079t;
                if (str2 != null || this.f25082w > 0) {
                    int i11 = this.f25082w;
                    AssetManager assets = getContext().getAssets();
                    AbstractC2855l.f(assets, "getAssets(...)");
                    textViewA.setTypeface(ReactTypefaceUtils.applyStyles(null, 0, i11, str2, assets));
                }
                float f10 = this.f25081v;
                if (f10 > 0.0f) {
                    textViewA.setTextSize(f10);
                }
            }
            Integer num = this.f25083x;
            if (num != null) {
                this.f25074o.setBackgroundColor(num.intValue());
            }
            if (this.f25065C != 0 && (navigationIcon = this.f25074o.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f25065C, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = this.f25074o.getChildCount() - 1; -1 < childCount; childCount--) {
                if (this.f25074o.getChildAt(childCount) instanceof d0) {
                    this.f25074o.removeViewAt(childCount);
                }
            }
            int size = this.f25073n.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = this.f25073n.get(i12);
                AbstractC2855l.f(obj, "get(...)");
                d0 d0Var = (d0) obj;
                d0.a type = d0Var.getType();
                if (type == d0.a.f25103j) {
                    View childAt = d0Var.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    supportActionBar.u(imageView.getDrawable());
                } else {
                    Toolbar.g gVar = new Toolbar.g(-2, -1);
                    int i13 = b.f25086a[type.ordinal()];
                    if (i13 == 1) {
                        if (!this.f25064B) {
                            this.f25074o.setNavigationIcon((Drawable) null);
                        }
                        this.f25074o.setTitle((CharSequence) null);
                        gVar.f14121a = 8388611;
                    } else if (i13 == 2) {
                        gVar.f14121a = 8388613;
                    } else if (i13 == 3) {
                        ((ViewGroup.MarginLayoutParams) gVar).width = -1;
                        gVar.f14121a = 1;
                        this.f25074o.setTitle((CharSequence) null);
                    }
                    d0Var.setLayoutParams(gVar);
                    this.f25074o.addView(d0Var);
                }
            }
            this.f25071I.a(this, getScreen());
        }
    }

    public final void m() {
        this.f25073n.clear();
        j();
    }

    public final void n(int i10) {
        this.f25073n.remove(i10);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25066D = true;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new M6.a(surfaceId, getId()));
        }
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25066D = false;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new M6.c(surfaceId, getId()));
        }
    }

    public final void setBackButtonInCustomView(boolean z10) {
        this.f25064B = z10;
    }

    public final void setBackgroundColor(Integer num) {
        this.f25083x = num;
    }

    public final void setDirection(String str) {
        this.f25080u = str;
    }

    public final void setHeaderHidden(boolean z10) {
        this.f25075p = z10;
    }

    public final void setHeaderTranslucent(boolean z10) {
        this.f25076q = z10;
    }

    public final void setHidden(boolean z10) {
        this.f25075p = z10;
    }

    public final void setHideBackButton(boolean z10) {
        this.f25084y = z10;
    }

    public final void setHideShadow(boolean z10) {
        this.f25085z = z10;
    }

    public final void setTintColor(int i10) {
        this.f25065C = i10;
    }

    public final void setTitle(String str) {
        this.f25077r = str;
    }

    public final void setTitleColor(int i10) {
        this.f25078s = i10;
    }

    public final void setTitleEmpty(boolean z10) {
        this.f25070H = z10;
    }

    public final void setTitleFontFamily(String str) {
        this.f25079t = str;
    }

    public final void setTitleFontSize(float f10) {
        this.f25081v = f10;
    }

    public final void setTitleFontWeight(String str) {
        this.f25082w = ReactTypefaceUtils.parseFontWeight(str);
    }

    public final void setTranslucent(boolean z10) {
        this.f25076q = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Context context) {
        this(context, new C2304q());
        AbstractC2855l.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
