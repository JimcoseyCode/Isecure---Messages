package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1659b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f16530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0163b f16531c;

    /* JADX INFO: renamed from: androidx.core.view.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0163b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC1659b(Context context) {
        this.f16529a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f16531c = null;
        this.f16530b = null;
    }

    public void h(a aVar) {
        this.f16530b = aVar;
    }

    public abstract void i(InterfaceC0163b interfaceC0163b);
}
