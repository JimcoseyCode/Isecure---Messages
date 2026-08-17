package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.core.view.AbstractC1658a0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class x extends AbstractC1627a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final H f14168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Window.Callback f14169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AppCompatDelegateImpl.g f14170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f14171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f14174g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f14175h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Toolbar.h f14176i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.A();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return x.this.f14169b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class c implements j.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f14179g;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f14179g) {
                return;
            }
            this.f14179g = true;
            x.this.f14168a.i();
            x.this.f14169b.onPanelClosed(108, eVar);
            this.f14179g = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            x.this.f14169b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (x.this.f14168a.b()) {
                x.this.f14169b.onPanelClosed(108, eVar);
            } else if (x.this.f14169b.onPreparePanel(0, null, eVar)) {
                x.this.f14169b.onMenuOpened(108, eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class e implements AppCompatDelegateImpl.g {
        e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            x xVar = x.this;
            if (xVar.f14171d) {
                return false;
            }
            xVar.f14168a.c();
            x.this.f14171d = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(x.this.f14168a.getContext());
            }
            return null;
        }
    }

    x(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f14176i = bVar;
        H0.g.g(toolbar);
        j0 j0Var = new j0(toolbar, false);
        this.f14168a = j0Var;
        this.f14169b = (Window.Callback) H0.g.g(callback);
        j0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        j0Var.setWindowTitle(charSequence);
        this.f14170c = new e();
    }

    private Menu z() {
        if (!this.f14172e) {
            this.f14168a.q(new c(), new d());
            this.f14172e = true;
        }
        return this.f14168a.m();
    }

    void A() {
        Menu menuZ = z();
        androidx.appcompat.view.menu.e eVar = menuZ instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuZ : null;
        if (eVar != null) {
            eVar.i0();
        }
        try {
            menuZ.clear();
            if (!this.f14169b.onCreatePanelMenu(0, menuZ) || !this.f14169b.onPreparePanel(0, null, menuZ)) {
                menuZ.clear();
            }
            if (eVar != null) {
                eVar.h0();
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.h0();
            }
            throw th;
        }
    }

    public void B(int i10, int i11) {
        this.f14168a.l((i10 & i11) | ((~i11) & this.f14168a.u()));
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public boolean f() {
        return this.f14168a.g();
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public boolean g() {
        if (!this.f14168a.k()) {
            return false;
        }
        this.f14168a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void h(boolean z10) {
        if (z10 == this.f14173f) {
            return;
        }
        this.f14173f = z10;
        if (this.f14174g.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f14174g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public int i() {
        return this.f14168a.u();
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public Context j() {
        return this.f14168a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public boolean k() {
        this.f14168a.s().removeCallbacks(this.f14175h);
        AbstractC1658a0.c0(this.f14168a.s(), this.f14175h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    void m() {
        this.f14168a.s().removeCallbacks(this.f14175h);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuZ = z();
        if (menuZ == null) {
            return false;
        }
        menuZ.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuZ.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public boolean p() {
        return this.f14168a.h();
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void q(Drawable drawable) {
        this.f14168a.e(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void s(boolean z10) {
        B(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void t(float f10) {
        AbstractC1658a0.r0(this.f14168a.s(), f10);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void u(Drawable drawable) {
        this.f14168a.x(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void w(CharSequence charSequence) {
        this.f14168a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void x(CharSequence charSequence) {
        this.f14168a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void r(boolean z10) {
    }

    @Override // androidx.appcompat.app.AbstractC1627a
    public void v(boolean z10) {
    }
}
