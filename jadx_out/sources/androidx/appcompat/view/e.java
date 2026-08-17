package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e extends b implements e.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f14202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ActionBarContextView f14203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b.a f14204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference f14205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f14208o;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f14202i = context;
        this.f14203j = actionBarContextView;
        this.f14204k = aVar;
        androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).X(1);
        this.f14208o = eVarX;
        eVarX.W(this);
        this.f14207n = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f14204k.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f14203j.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f14206m) {
            return;
        }
        this.f14206m = true;
        this.f14204k.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f14205l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f14208o;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f14203j.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f14203j.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f14203j.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f14204k.c(this, this.f14208o);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f14203j.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f14203j.setCustomView(view);
        this.f14205l = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f14202i.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f14203j.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f14202i.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f14203j.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f14203j.setTitleOptional(z10);
    }
}
