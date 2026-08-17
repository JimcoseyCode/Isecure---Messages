package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1659b;
import y0.AbstractC3606a;

/* JADX INFO: renamed from: k.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2816a implements A0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f29066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f29067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f29068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f29069g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f29071i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f29073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f29074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f29075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f29076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f29077o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29070h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29072j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f29078p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f29079q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f29080r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29081s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f29082t = 16;

    public C2816a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f29074l = context;
        this.f29063a = i11;
        this.f29064b = i10;
        this.f29065c = i13;
        this.f29066d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f29073k;
        if (drawable != null) {
            if (this.f29080r || this.f29081s) {
                Drawable drawableR = AbstractC3606a.r(drawable);
                this.f29073k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f29073k = drawableMutate;
                if (this.f29080r) {
                    AbstractC3606a.o(drawableMutate, this.f29078p);
                }
                if (this.f29081s) {
                    AbstractC3606a.p(this.f29073k, this.f29079q);
                }
            }
        }
    }

    @Override // A0.b
    public A0.b a(AbstractC1659b abstractC1659b) {
        throw new UnsupportedOperationException();
    }

    @Override // A0.b
    public AbstractC1659b b() {
        return null;
    }

    @Override // A0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // A0.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public A0.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // A0.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public A0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // A0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // A0.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public A0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // A0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // A0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f29072j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f29071i;
    }

    @Override // A0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f29076n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f29064b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f29073k;
    }

    @Override // A0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f29078p;
    }

    @Override // A0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f29079q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f29068f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f29063a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // A0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f29070h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f29069g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f29065c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f29066d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f29067e;
        return charSequence != null ? charSequence : this.f29066d;
    }

    @Override // A0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f29077o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // A0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f29082t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f29082t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f29082t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f29082t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f29071i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f29082t = (z10 ? 1 : 0) | (this.f29082t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f29082t = (z10 ? 2 : 0) | (this.f29082t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f29082t = (z10 ? 16 : 0) | (this.f29082t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f29073k = drawable;
        c();
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f29078p = colorStateList;
        this.f29080r = true;
        c();
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f29079q = mode;
        this.f29081s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f29068f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f29069g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f29075m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f29069g = c10;
        this.f29071i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f29066d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f29067e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f29082t = (this.f29082t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f29071i = Character.toLowerCase(c10);
        this.f29072j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public A0.b setContentDescription(CharSequence charSequence) {
        this.f29076n = charSequence;
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f29069g = c10;
        this.f29070h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f29066d = this.f29074l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public A0.b setTooltipText(CharSequence charSequence) {
        this.f29077o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f29073k = androidx.core.content.a.e(this.f29074l, i10);
        c();
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f29069g = c10;
        this.f29070h = KeyEvent.normalizeMetaState(i10);
        this.f29071i = Character.toLowerCase(c11);
        this.f29072j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // A0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
