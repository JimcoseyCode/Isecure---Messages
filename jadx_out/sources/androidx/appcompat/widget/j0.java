package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1682m0;
import androidx.core.view.C1678k0;
import f.AbstractC2568a;
import f.AbstractC2572e;
import f.AbstractC2573f;
import f.AbstractC2575h;
import f.AbstractC2577j;
import g.AbstractC2619a;
import k.C2816a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j0 implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f15014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f15016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f15017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f15018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f15019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f15020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f15021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f15022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f15023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f15024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f15025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f15026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ActionMenuPresenter f15027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f15029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f15030q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final C2816a f15031g;

        a() {
            this.f15031g = new C2816a(j0.this.f15014a.getContext(), 0, R.id.home, 0, 0, j0.this.f15022i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j0 j0Var = j0.this;
            Window.Callback callback = j0Var.f15025l;
            if (callback == null || !j0Var.f15026m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f15031g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1682m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f15033a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15034b;

        b(int i10) {
            this.f15034b = i10;
        }

        @Override // androidx.core.view.AbstractC1682m0, androidx.core.view.InterfaceC1680l0
        public void a(View view) {
            this.f15033a = true;
        }

        @Override // androidx.core.view.InterfaceC1680l0
        public void b(View view) {
            if (this.f15033a) {
                return;
            }
            j0.this.f15014a.setVisibility(this.f15034b);
        }

        @Override // androidx.core.view.AbstractC1682m0, androidx.core.view.InterfaceC1680l0
        public void c(View view) {
            j0.this.f15014a.setVisibility(0);
        }
    }

    public j0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, AbstractC2575h.f26885a, AbstractC2572e.f26809n);
    }

    private void G(CharSequence charSequence) {
        this.f15022i = charSequence;
        if ((this.f15015b & 8) != 0) {
            this.f15014a.setTitle(charSequence);
            if (this.f15021h) {
                AbstractC1658a0.n0(this.f15014a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f15015b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15024k)) {
                this.f15014a.setNavigationContentDescription(this.f15029p);
            } else {
                this.f15014a.setNavigationContentDescription(this.f15024k);
            }
        }
    }

    private void I() {
        if ((this.f15015b & 4) == 0) {
            this.f15014a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f15014a;
        Drawable drawable = this.f15020g;
        if (drawable == null) {
            drawable = this.f15030q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f15015b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f15019f) == null) {
            drawable = this.f15018e;
        }
        this.f15014a.setLogo(drawable);
    }

    private int z() {
        if (this.f15014a.getNavigationIcon() == null) {
            return 11;
        }
        this.f15030q = this.f15014a.getNavigationIcon();
        return 15;
    }

    public void A(View view) {
        View view2 = this.f15017d;
        if (view2 != null && (this.f15015b & 16) != 0) {
            this.f15014a.removeView(view2);
        }
        this.f15017d = view;
        if (view == null || (this.f15015b & 16) == 0) {
            return;
        }
        this.f15014a.addView(view);
    }

    public void B(int i10) {
        if (i10 == this.f15029p) {
            return;
        }
        this.f15029p = i10;
        if (TextUtils.isEmpty(this.f15014a.getNavigationContentDescription())) {
            D(this.f15029p);
        }
    }

    public void C(Drawable drawable) {
        this.f15019f = drawable;
        J();
    }

    public void D(int i10) {
        E(i10 == 0 ? null : getContext().getString(i10));
    }

    public void E(CharSequence charSequence) {
        this.f15024k = charSequence;
        H();
    }

    public void F(CharSequence charSequence) {
        this.f15023j = charSequence;
        if ((this.f15015b & 8) != 0) {
            this.f15014a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.H
    public void a(Menu menu, j.a aVar) {
        if (this.f15027n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f15014a.getContext());
            this.f15027n = actionMenuPresenter;
            actionMenuPresenter.r(AbstractC2573f.f26846h);
        }
        this.f15027n.f(aVar);
        this.f15014a.K((androidx.appcompat.view.menu.e) menu, this.f15027n);
    }

    @Override // androidx.appcompat.widget.H
    public boolean b() {
        return this.f15014a.B();
    }

    @Override // androidx.appcompat.widget.H
    public void c() {
        this.f15026m = true;
    }

    @Override // androidx.appcompat.widget.H
    public void collapseActionView() {
        this.f15014a.e();
    }

    @Override // androidx.appcompat.widget.H
    public boolean d() {
        return this.f15014a.d();
    }

    @Override // androidx.appcompat.widget.H
    public void e(Drawable drawable) {
        this.f15014a.setBackground(drawable);
    }

    @Override // androidx.appcompat.widget.H
    public boolean f() {
        return this.f15014a.A();
    }

    @Override // androidx.appcompat.widget.H
    public boolean g() {
        return this.f15014a.w();
    }

    @Override // androidx.appcompat.widget.H
    public Context getContext() {
        return this.f15014a.getContext();
    }

    @Override // androidx.appcompat.widget.H
    public CharSequence getTitle() {
        return this.f15014a.getTitle();
    }

    @Override // androidx.appcompat.widget.H
    public boolean h() {
        return this.f15014a.Q();
    }

    @Override // androidx.appcompat.widget.H
    public void i() {
        this.f15014a.f();
    }

    @Override // androidx.appcompat.widget.H
    public void j(Y y10) {
        View view = this.f15016c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f15014a;
            if (parent == toolbar) {
                toolbar.removeView(this.f15016c);
            }
        }
        this.f15016c = y10;
    }

    @Override // androidx.appcompat.widget.H
    public boolean k() {
        return this.f15014a.v();
    }

    @Override // androidx.appcompat.widget.H
    public void l(int i10) {
        View view;
        int i11 = this.f15015b ^ i10;
        this.f15015b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f15014a.setTitle(this.f15022i);
                    this.f15014a.setSubtitle(this.f15023j);
                } else {
                    this.f15014a.setTitle((CharSequence) null);
                    this.f15014a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f15017d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f15014a.addView(view);
            } else {
                this.f15014a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.H
    public Menu m() {
        return this.f15014a.getMenu();
    }

    @Override // androidx.appcompat.widget.H
    public void n(int i10) {
        C(i10 != 0 ? AbstractC2619a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.H
    public int o() {
        return this.f15028o;
    }

    @Override // androidx.appcompat.widget.H
    public C1678k0 p(int i10, long j10) {
        return AbstractC1658a0.e(this.f15014a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // androidx.appcompat.widget.H
    public void q(j.a aVar, e.a aVar2) {
        this.f15014a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.H
    public void r(int i10) {
        this.f15014a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.H
    public ViewGroup s() {
        return this.f15014a;
    }

    @Override // androidx.appcompat.widget.H
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? AbstractC2619a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.H
    public void setTitle(CharSequence charSequence) {
        this.f15021h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.H
    public void setWindowCallback(Window.Callback callback) {
        this.f15025l = callback;
    }

    @Override // androidx.appcompat.widget.H
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f15021h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.H
    public int u() {
        return this.f15015b;
    }

    @Override // androidx.appcompat.widget.H
    public void x(Drawable drawable) {
        this.f15020g = drawable;
        I();
    }

    @Override // androidx.appcompat.widget.H
    public void y(boolean z10) {
        this.f15014a.setCollapsible(z10);
    }

    public j0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f15028o = 0;
        this.f15029p = 0;
        this.f15014a = toolbar;
        this.f15022i = toolbar.getTitle();
        this.f15023j = toolbar.getSubtitle();
        this.f15021h = this.f15022i != null;
        this.f15020g = toolbar.getNavigationIcon();
        f0 f0VarV = f0.v(toolbar.getContext(), null, AbstractC2577j.f27033a, AbstractC2568a.f26731c, 0);
        this.f15030q = f0VarV.g(AbstractC2577j.f27088l);
        if (z10) {
            CharSequence charSequenceP = f0VarV.p(AbstractC2577j.f27118r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = f0VarV.p(AbstractC2577j.f27108p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                F(charSequenceP2);
            }
            Drawable drawableG = f0VarV.g(AbstractC2577j.f27098n);
            if (drawableG != null) {
                C(drawableG);
            }
            Drawable drawableG2 = f0VarV.g(AbstractC2577j.f27093m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f15020g == null && (drawable = this.f15030q) != null) {
                x(drawable);
            }
            l(f0VarV.k(AbstractC2577j.f27068h, 0));
            int iN = f0VarV.n(AbstractC2577j.f27063g, 0);
            if (iN != 0) {
                A(LayoutInflater.from(this.f15014a.getContext()).inflate(iN, (ViewGroup) this.f15014a, false));
                l(this.f15015b | 16);
            }
            int iM = f0VarV.m(AbstractC2577j.f27078j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f15014a.getLayoutParams();
                layoutParams.height = iM;
                this.f15014a.setLayoutParams(layoutParams);
            }
            int iE = f0VarV.e(AbstractC2577j.f27058f, -1);
            int iE2 = f0VarV.e(AbstractC2577j.f27053e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f15014a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = f0VarV.n(AbstractC2577j.f27123s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f15014a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = f0VarV.n(AbstractC2577j.f27113q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f15014a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = f0VarV.n(AbstractC2577j.f27103o, 0);
            if (iN4 != 0) {
                this.f15014a.setPopupTheme(iN4);
            }
        } else {
            this.f15015b = z();
        }
        f0VarV.x();
        B(i10);
        this.f15024k = this.f15014a.getNavigationContentDescription();
        this.f15014a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.H
    public void setIcon(Drawable drawable) {
        this.f15018e = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.H
    public void v() {
    }

    @Override // androidx.appcompat.widget.H
    public void w() {
    }

    @Override // androidx.appcompat.widget.H
    public void t(boolean z10) {
    }
}
