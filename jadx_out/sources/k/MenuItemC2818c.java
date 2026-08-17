package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1659b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemC2818c extends AbstractC2817b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0.b f29086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f29087e;

    /* JADX INFO: renamed from: k.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC1659b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AbstractC1659b.InterfaceC0163b f29088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ActionProvider f29089e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f29089e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1659b
        public boolean a() {
            return this.f29089e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1659b
        public boolean b() {
            return this.f29089e.isVisible();
        }

        @Override // androidx.core.view.AbstractC1659b
        public View c(MenuItem menuItem) {
            return this.f29089e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1659b
        public boolean d() {
            return this.f29089e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1659b
        public void e(SubMenu subMenu) {
            this.f29089e.onPrepareSubMenu(MenuItemC2818c.this.d(subMenu));
        }

        @Override // androidx.core.view.AbstractC1659b
        public boolean f() {
            return this.f29089e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1659b
        public void i(AbstractC1659b.InterfaceC0163b interfaceC0163b) {
            this.f29088d = interfaceC0163b;
            this.f29089e.setVisibilityListener(interfaceC0163b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC1659b.InterfaceC0163b interfaceC0163b = this.f29088d;
            if (interfaceC0163b != null) {
                interfaceC0163b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* JADX INFO: renamed from: k.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final CollapsibleActionView f29091g;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f29091g = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f29091g;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f29091g.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f29091g.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: k.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class MenuItemOnActionExpandListenerC0304c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f29092a;

        MenuItemOnActionExpandListenerC0304c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f29092a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f29092a.onMenuItemActionCollapse(MenuItemC2818c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f29092a.onMenuItemActionExpand(MenuItemC2818c.this.c(menuItem));
        }
    }

    /* JADX INFO: renamed from: k.c$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f29094a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f29094a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f29094a.onMenuItemClick(MenuItemC2818c.this.c(menuItem));
        }
    }

    public MenuItemC2818c(Context context, A0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f29086d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f29086d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f29086d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1659b abstractC1659bB = this.f29086d.b();
        if (abstractC1659bB instanceof a) {
            return ((a) abstractC1659bB).f29089e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f29086d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f29086d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f29086d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f29086d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f29086d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f29086d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f29086d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f29086d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f29086d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f29086d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f29086d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f29086d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f29086d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f29086d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f29086d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f29086d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f29086d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f29086d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f29087e == null) {
                this.f29087e = this.f29086d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f29087e.invoke(this.f29086d, Boolean.valueOf(z10));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f29086d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f29086d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f29086d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f29086d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f29086d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f29086d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f29083a, actionProvider);
        A0.b bVar = this.f29086d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f29086d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f29086d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f29086d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f29086d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f29086d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f29086d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f29086d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f29086d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f29086d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f29086d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f29086d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f29086d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0304c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f29086d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f29086d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f29086d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f29086d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f29086d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f29086d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f29086d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f29086d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f29086d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f29086d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f29086d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f29086d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f29086d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f29086d.setActionView(i10);
        View actionView = this.f29086d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f29086d.setActionView(new b(actionView));
        }
        return this;
    }
}
