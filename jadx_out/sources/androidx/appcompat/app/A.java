package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1682m0;
import androidx.core.view.C1678k0;
import androidx.core.view.InterfaceC1680l0;
import androidx.core.view.InterfaceC1684n0;
import f.AbstractC2568a;
import f.AbstractC2573f;
import f.AbstractC2577j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class A extends AbstractC1627a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Interpolator f13877D = new AccelerateInterpolator();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Interpolator f13878E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f13882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f13883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f13884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f13885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f13886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    H f13887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f13888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f13889h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f13892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    d f13893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f13894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    b.a f13895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13896o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f13898q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f13901t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f13902u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f13903v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f13905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f13906y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f13907z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f13890i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13891j = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList f13897p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13899r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f13900s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f13904w = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final InterfaceC1680l0 f13879A = new a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final InterfaceC1680l0 f13880B = new b();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final InterfaceC1684n0 f13881C = new c();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC1682m0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC1680l0
        public void b(View view) {
            View view2;
            A a10 = A.this;
            if (a10.f13900s && (view2 = a10.f13889h) != null) {
                view2.setTranslationY(0.0f);
                A.this.f13886e.setTranslationY(0.0f);
            }
            A.this.f13886e.setVisibility(8);
            A.this.f13886e.setTransitioning(false);
            A a11 = A.this;
            a11.f13905x = null;
            a11.B();
            ActionBarOverlayLayout actionBarOverlayLayout = A.this.f13885d;
            if (actionBarOverlayLayout != null) {
                AbstractC1658a0.h0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1682m0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC1680l0
        public void b(View view) {
            A a10 = A.this;
            a10.f13905x = null;
            a10.f13886e.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements InterfaceC1684n0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC1684n0
        public void a(View view) {
            ((View) A.this.f13886e.getParent()).invalidate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public class d extends androidx.appcompat.view.b implements e.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Context f13911i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f13912j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private b.a f13913k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private WeakReference f13914l;

        public d(Context context, b.a aVar) {
            this.f13911i = context;
            this.f13913k = aVar;
            androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(context).X(1);
            this.f13912j = eVarX;
            eVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f13913k;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f13913k == null) {
                return;
            }
            k();
            A.this.f13888g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            A a10 = A.this;
            if (a10.f13893l != this) {
                return;
            }
            if (A.A(a10.f13901t, a10.f13902u, false)) {
                this.f13913k.a(this);
            } else {
                A a11 = A.this;
                a11.f13894m = this;
                a11.f13895n = this.f13913k;
            }
            this.f13913k = null;
            A.this.z(false);
            A.this.f13888g.g();
            A a12 = A.this;
            a12.f13885d.setHideOnContentScrollEnabled(a12.f13907z);
            A.this.f13893l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f13914l;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f13912j;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f13911i);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return A.this.f13888g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return A.this.f13888g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (A.this.f13893l != this) {
                return;
            }
            this.f13912j.i0();
            try {
                this.f13913k.c(this, this.f13912j);
            } finally {
                this.f13912j.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return A.this.f13888g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            A.this.f13888g.setCustomView(view);
            this.f13914l = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(A.this.f13882a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            A.this.f13888g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(A.this.f13882a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            A.this.f13888g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            A.this.f13888g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f13912j.i0();
            try {
                return this.f13913k.b(this, this.f13912j);
            } finally {
                this.f13912j.h0();
            }
        }
    }

    public A(Activity activity, boolean z10) {
        this.f13884c = activity;
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (z10) {
            return;
        }
        this.f13889h = decorView.findViewById(R.id.content);
    }

    static boolean A(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private H E(View view) {
        if (view instanceof H) {
            return (H) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void G() {
        if (this.f13903v) {
            this.f13903v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f13885d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O(false);
        }
    }

    private void H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC2573f.f26855q);
        this.f13885d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f13887f = E(view.findViewById(AbstractC2573f.f26839a));
        this.f13888g = (ActionBarContextView) view.findViewById(AbstractC2573f.f26845g);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC2573f.f26841c);
        this.f13886e = actionBarContainer;
        H h10 = this.f13887f;
        if (h10 == null || this.f13888g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f13882a = h10.getContext();
        boolean z10 = (this.f13887f.u() & 4) != 0;
        if (z10) {
            this.f13892k = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f13882a);
        L(aVarB.a() || z10);
        J(aVarB.e());
        TypedArray typedArrayObtainStyledAttributes = this.f13882a.obtainStyledAttributes(null, AbstractC2577j.f27033a, AbstractC2568a.f26731c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC2577j.f27083k, false)) {
            K(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2577j.f27073i, 0);
        if (dimensionPixelSize != 0) {
            t(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void J(boolean z10) {
        this.f13898q = z10;
        if (z10) {
            this.f13886e.setTabContainer(null);
            this.f13887f.j(null);
        } else {
            this.f13887f.j(null);
            this.f13886e.setTabContainer(null);
        }
        boolean z11 = false;
        boolean z12 = F() == 2;
        this.f13887f.y(!this.f13898q && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13885d;
        if (!this.f13898q && z12) {
            z11 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    private boolean M() {
        return this.f13886e.isLaidOut();
    }

    private void N() {
        if (this.f13903v) {
            return;
        }
        this.f13903v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13885d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        O(false);
    }

    private void O(boolean z10) {
        if (A(this.f13901t, this.f13902u, this.f13903v)) {
            if (this.f13904w) {
                return;
            }
            this.f13904w = true;
            D(z10);
            return;
        }
        if (this.f13904w) {
            this.f13904w = false;
            C(z10);
        }
    }

    void B() {
        b.a aVar = this.f13895n;
        if (aVar != null) {
            aVar.a(this.f13894m);
            this.f13894m = null;
            this.f13895n = null;
        }
    }

    public void C(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f13905x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f13899r != 0 || (!this.f13906y && !z10)) {
            this.f13879A.b(null);
            return;
        }
        this.f13886e.setAlpha(1.0f);
        this.f13886e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f13886e.getHeight();
        if (z10) {
            this.f13886e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        C1678k0 c1678k0L = AbstractC1658a0.e(this.f13886e).l(f10);
        c1678k0L.j(this.f13881C);
        hVar2.c(c1678k0L);
        if (this.f13900s && (view = this.f13889h) != null) {
            hVar2.c(AbstractC1658a0.e(view).l(f10));
        }
        hVar2.f(f13877D);
        hVar2.e(250L);
        hVar2.g(this.f13879A);
        this.f13905x = hVar2;
        hVar2.h();
    }

    public void D(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f13905x;
        if (hVar != null) {
            hVar.a();
        }
        this.f13886e.setVisibility(0);
        if (this.f13899r == 0 && (this.f13906y || z10)) {
            this.f13886e.setTranslationY(0.0f);
            float f10 = -this.f13886e.getHeight();
            if (z10) {
                this.f13886e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f13886e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C1678k0 c1678k0L = AbstractC1658a0.e(this.f13886e).l(0.0f);
            c1678k0L.j(this.f13881C);
            hVar2.c(c1678k0L);
            if (this.f13900s && (view2 = this.f13889h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(AbstractC1658a0.e(this.f13889h).l(0.0f));
            }
            hVar2.f(f13878E);
            hVar2.e(250L);
            hVar2.g(this.f13880B);
            this.f13905x = hVar2;
            hVar2.h();
        } else {
            this.f13886e.setAlpha(1.0f);
            this.f13886e.setTranslationY(0.0f);
            if (this.f13900s && (view = this.f13889h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f13880B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13885d;
        if (actionBarOverlayLayout != null) {
            AbstractC1658a0.h0(actionBarOverlayLayout);
        }
    }

    public int F() {
        return this.f13887f.o();
    }

    public void I(int i10, int i11) {
        int iU = this.f13887f.u();
        if ((i11 & 4) != 0) {
            this.f13892k = true;
        }
        this.f13887f.l((i10 & i11) | ((~i11) & iU));
    }

    public void K(boolean z10) {
        if (z10 && !this.f13885d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f13907z = z10;
        this.f13885d.setHideOnContentScrollEnabled(z10);
    }

    public void L(boolean z10) {
        this.f13887f.t(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f13902u) {
            this.f13902u = false;
            O(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f13900s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f13902u) {
            return;
        }
        this.f13902u = true;
        O(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f13905x;
        if (hVar != null) {
            hVar.a();
            this.f13905x = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public boolean g() {
        H h10 = this.f13887f;
        if (h10 == null || !h10.k()) {
            return false;
        }
        this.f13887f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void h(boolean z10) {
        if (z10 == this.f13896o) {
            return;
        }
        this.f13896o = z10;
        if (this.f13897p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f13897p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public int i() {
        return this.f13887f.u();
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public Context j() {
        if (this.f13883b == null) {
            TypedValue typedValue = new TypedValue();
            this.f13882a.getTheme().resolveAttribute(AbstractC2568a.f26733e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f13883b = new ContextThemeWrapper(this.f13882a, i10);
            } else {
                this.f13883b = this.f13882a;
            }
        }
        return this.f13883b;
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void l(Configuration configuration) {
        J(androidx.appcompat.view.a.b(this.f13882a).e());
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f13893l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f13899r = i10;
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void q(Drawable drawable) {
        this.f13886e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void r(boolean z10) {
        if (this.f13892k) {
            return;
        }
        s(z10);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void s(boolean z10) {
        I(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void t(float f10) {
        AbstractC1658a0.r0(this.f13886e, f10);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void u(Drawable drawable) {
        this.f13887f.x(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void v(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f13906y = z10;
        if (z10 || (hVar = this.f13905x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void w(CharSequence charSequence) {
        this.f13887f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void x(CharSequence charSequence) {
        this.f13887f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public androidx.appcompat.view.b y(b.a aVar) {
        d dVar = this.f13893l;
        if (dVar != null) {
            dVar.c();
        }
        this.f13885d.setHideOnContentScrollEnabled(false);
        this.f13888g.k();
        d dVar2 = new d(this.f13888g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f13893l = dVar2;
        dVar2.k();
        this.f13888g.h(dVar2);
        z(true);
        return dVar2;
    }

    public void z(boolean z10) {
        C1678k0 c1678k0P;
        C1678k0 c1678k0F;
        if (z10) {
            N();
        } else {
            G();
        }
        if (!M()) {
            if (z10) {
                this.f13887f.r(4);
                this.f13888g.setVisibility(0);
                return;
            } else {
                this.f13887f.r(0);
                this.f13888g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c1678k0F = this.f13887f.p(4, 100L);
            c1678k0P = this.f13888g.f(0, 200L);
        } else {
            c1678k0P = this.f13887f.p(0, 200L);
            c1678k0F = this.f13888g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(c1678k0F, c1678k0P);
        hVar.h();
    }

    public A(Dialog dialog) {
        H(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
