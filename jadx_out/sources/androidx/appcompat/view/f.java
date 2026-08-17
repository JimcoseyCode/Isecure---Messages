package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import k.MenuC2819d;
import k.MenuItemC2818c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f14209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f14210b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f14211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f14212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f14213c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final m0.i f14214d = new m0.i();

        public a(Context context, ActionMode.Callback callback) {
            this.f14212b = context;
            this.f14211a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f14214d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC2819d menuC2819d = new MenuC2819d(this.f14212b, (A0.a) menu);
            this.f14214d.put(menu, menuC2819d);
            return menuC2819d;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f14211a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f14211a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f14211a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f14211a.onActionItemClicked(e(bVar), new MenuItemC2818c(this.f14212b, (A0.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f14213c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f14213c.get(i10);
                if (fVar != null && fVar.f14210b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f14212b, bVar);
            this.f14213c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f14209a = context;
        this.f14210b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f14210b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f14210b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC2819d(this.f14209a, (A0.a) this.f14210b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f14210b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f14210b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f14210b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f14210b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f14210b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f14210b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f14210b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f14210b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f14210b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f14210b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f14210b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f14210b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f14210b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f14210b.q(i10);
    }
}
