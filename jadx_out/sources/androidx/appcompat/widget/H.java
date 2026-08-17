package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.C1678k0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface H {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    void e(Drawable drawable);

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i();

    void j(Y y10);

    boolean k();

    void l(int i10);

    Menu m();

    void n(int i10);

    int o();

    C1678k0 p(int i10, long j10);

    void q(j.a aVar, e.a aVar2);

    void r(int i10);

    ViewGroup s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z10);

    int u();

    void v();

    void w();

    void x(Drawable drawable);

    void y(boolean z10);
}
