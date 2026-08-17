package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.AbstractC1659b;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f.AbstractC2575h;
import g.AbstractC2619a;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements A0.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f14394A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private AbstractC1659b f14395B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f14396C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f14398E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f14403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f14404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f14405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f14406h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f14408j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f14410l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f14412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f14413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f14414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f14415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f14416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f14417s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f14424z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14407i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14409k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14411m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f14418t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f14419u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f14420v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f14421w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f14422x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f14423y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f14397D = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements AbstractC1659b.InterfaceC0163b {
        a() {
        }

        @Override // androidx.core.view.AbstractC1659b.InterfaceC0163b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f14412n.M(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f14412n = eVar;
        this.f14399a = i11;
        this.f14400b = i10;
        this.f14401c = i12;
        this.f14402d = i13;
        this.f14403e = charSequence;
        this.f14424z = i14;
    }

    private static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f14422x && (this.f14420v || this.f14421w)) {
            drawable = AbstractC3606a.r(drawable).mutate();
            if (this.f14420v) {
                AbstractC3606a.o(drawable, this.f14418t);
            }
            if (this.f14421w) {
                AbstractC3606a.p(drawable, this.f14419u);
            }
            this.f14422x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f14412n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f14424z & 4) == 4;
    }

    @Override // A0.b
    public A0.b a(AbstractC1659b abstractC1659b) {
        AbstractC1659b abstractC1659b2 = this.f14395B;
        if (abstractC1659b2 != null) {
            abstractC1659b2.g();
        }
        this.f14394A = null;
        this.f14395B = abstractC1659b;
        this.f14412n.N(true);
        AbstractC1659b abstractC1659b3 = this.f14395B;
        if (abstractC1659b3 != null) {
            abstractC1659b3.i(new a());
        }
        return this;
    }

    @Override // A0.b
    public AbstractC1659b b() {
        return this.f14395B;
    }

    public void c() {
        this.f14412n.L(this);
    }

    @Override // A0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f14424z & 8) == 0) {
            return false;
        }
        if (this.f14394A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14396C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f14412n.f(this);
        }
        return false;
    }

    @Override // A0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14396C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f14412n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f14402d;
    }

    char g() {
        return this.f14412n.J() ? this.f14408j : this.f14406h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // A0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f14394A;
        if (view != null) {
            return view;
        }
        AbstractC1659b abstractC1659b = this.f14395B;
        if (abstractC1659b == null) {
            return null;
        }
        View viewC = abstractC1659b.c(this);
        this.f14394A = viewC;
        return viewC;
    }

    @Override // A0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f14409k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f14408j;
    }

    @Override // A0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f14416r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f14400b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f14410l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f14411m == 0) {
            return null;
        }
        Drawable drawableB = AbstractC2619a.b(this.f14412n.w(), this.f14411m);
        this.f14411m = 0;
        this.f14410l = drawableB;
        return e(drawableB);
    }

    @Override // A0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f14418t;
    }

    @Override // A0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f14419u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f14405g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f14399a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f14398E;
    }

    @Override // A0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f14407i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f14406h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f14401c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f14413o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f14403e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f14404f;
        return charSequence != null ? charSequence : this.f14403e;
    }

    @Override // A0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f14417s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        Resources resources = this.f14412n.w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f14412n.w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC2575h.f26897m));
        }
        int i10 = this.f14412n.J() ? this.f14409k : this.f14407i;
        d(sb, i10, 65536, resources.getString(AbstractC2575h.f26893i));
        d(sb, i10, 4096, resources.getString(AbstractC2575h.f26889e));
        d(sb, i10, 2, resources.getString(AbstractC2575h.f26888d));
        d(sb, i10, 1, resources.getString(AbstractC2575h.f26894j));
        d(sb, i10, 4, resources.getString(AbstractC2575h.f26896l));
        d(sb, i10, 8, resources.getString(AbstractC2575h.f26892h));
        if (cG == '\b') {
            sb.append(resources.getString(AbstractC2575h.f26890f));
        } else if (cG == '\n') {
            sb.append(resources.getString(AbstractC2575h.f26891g));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(AbstractC2575h.f26895k));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f14413o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // A0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f14397D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f14423y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f14423y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f14423y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1659b abstractC1659b = this.f14395B;
        return (abstractC1659b == null || !abstractC1659b.f()) ? (this.f14423y & 8) == 0 : (this.f14423y & 8) == 0 && this.f14395B.b();
    }

    public boolean j() {
        AbstractC1659b abstractC1659b;
        if ((this.f14424z & 8) != 0) {
            if (this.f14394A == null && (abstractC1659b = this.f14395B) != null) {
                this.f14394A = abstractC1659b.c(this);
            }
            if (this.f14394A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f14415q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f14412n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f14414p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f14405g != null) {
            try {
                this.f14412n.w().startActivity(this.f14405g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        AbstractC1659b abstractC1659b = this.f14395B;
        return abstractC1659b != null && abstractC1659b.d();
    }

    public boolean l() {
        return (this.f14423y & 32) == 32;
    }

    public boolean m() {
        return (this.f14423y & 4) != 0;
    }

    public boolean n() {
        return (this.f14424z & 1) == 1;
    }

    public boolean o() {
        return (this.f14424z & 2) == 2;
    }

    @Override // A0.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public A0.b setActionView(int i10) {
        Context contextW = this.f14412n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public A0.b setActionView(View view) {
        int i10;
        this.f14394A = view;
        this.f14395B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f14399a) > 0) {
            view.setId(i10);
        }
        this.f14412n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.f14397D = z10;
        this.f14412n.N(false);
    }

    void s(boolean z10) {
        int i10 = this.f14423y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f14423y = i11;
        if (i10 != i11) {
            this.f14412n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f14408j == c10) {
            return this;
        }
        this.f14408j = Character.toLowerCase(c10);
        this.f14412n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f14423y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f14423y = i11;
        if (i10 != i11) {
            this.f14412n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f14423y & 4) != 0) {
            this.f14412n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f14423y |= 16;
        } else {
            this.f14423y &= -17;
        }
        this.f14412n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f14411m = 0;
        this.f14410l = drawable;
        this.f14422x = true;
        this.f14412n.N(false);
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14418t = colorStateList;
        this.f14420v = true;
        this.f14422x = true;
        this.f14412n.N(false);
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14419u = mode;
        this.f14421w = true;
        this.f14422x = true;
        this.f14412n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f14405g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f14406h == c10) {
            return this;
        }
        this.f14406h = c10;
        this.f14412n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14396C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14415q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f14406h = c10;
        this.f14408j = Character.toLowerCase(c11);
        this.f14412n.N(false);
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14424z = i10;
        this.f14412n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f14403e = charSequence;
        this.f14412n.N(false);
        m mVar = this.f14413o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14404f = charSequence;
        this.f14412n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f14412n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f14423y = (z10 ? 4 : 0) | (this.f14423y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f14403e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f14423y |= 32;
        } else {
            this.f14423y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f14398E = contextMenuInfo;
    }

    @Override // A0.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public A0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f14413o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f14423y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f14423y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f14412n.C();
    }

    @Override // android.view.MenuItem
    public A0.b setContentDescription(CharSequence charSequence) {
        this.f14416r = charSequence;
        this.f14412n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public A0.b setTooltipText(CharSequence charSequence) {
        this.f14417s = charSequence;
        this.f14412n.N(false);
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f14408j == c10 && this.f14409k == i10) {
            return this;
        }
        this.f14408j = Character.toLowerCase(c10);
        this.f14409k = KeyEvent.normalizeMetaState(i10);
        this.f14412n.N(false);
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f14406h == c10 && this.f14407i == i10) {
            return this;
        }
        this.f14406h = c10;
        this.f14407i = KeyEvent.normalizeMetaState(i10);
        this.f14412n.N(false);
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f14406h = c10;
        this.f14407i = KeyEvent.normalizeMetaState(i10);
        this.f14408j = Character.toLowerCase(c11);
        this.f14409k = KeyEvent.normalizeMetaState(i11);
        this.f14412n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f14410l = null;
        this.f14411m = i10;
        this.f14422x = true;
        this.f14412n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f14412n.w().getString(i10));
    }
}
