package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C1772t;
import androidx.lifecycle.InterfaceC1762i;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import d1.AbstractC2320a;
import d1.C2321b;
import h1.C2697f;
import h1.C2699h;
import h1.InterfaceC2700i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class M implements InterfaceC1762i, InterfaceC2700i, W {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Fragment f17401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.lifecycle.V f17402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f17403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private U.c f17404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C1772t f17405k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C2699h f17406l = null;

    M(Fragment fragment, androidx.lifecycle.V v10, Runnable runnable) {
        this.f17401g = fragment;
        this.f17402h = v10;
        this.f17403i = runnable;
    }

    void a(AbstractC1764k.a aVar) {
        this.f17405k.i(aVar);
    }

    void b() {
        if (this.f17405k == null) {
            this.f17405k = new C1772t(this);
            C2699h c2699hA = C2699h.a(this);
            this.f17406l = c2699hA;
            c2699hA.c();
            this.f17403i.run();
        }
    }

    boolean c() {
        return this.f17405k != null;
    }

    void d(Bundle bundle) {
        this.f17406l.d(bundle);
    }

    void e(Bundle bundle) {
        this.f17406l.e(bundle);
    }

    void f(AbstractC1764k.b bVar) {
        this.f17405k.n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC1762i
    public AbstractC2320a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f17401g.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C2321b c2321b = new C2321b();
        if (application != null) {
            c2321b.c(U.a.f17564h, application);
        }
        c2321b.c(androidx.lifecycle.L.f17542a, this.f17401g);
        c2321b.c(androidx.lifecycle.L.f17543b, this);
        if (this.f17401g.getArguments() != null) {
            c2321b.c(androidx.lifecycle.L.f17544c, this.f17401g.getArguments());
        }
        return c2321b;
    }

    @Override // androidx.lifecycle.InterfaceC1762i
    public U.c getDefaultViewModelProviderFactory() {
        Application application;
        U.c defaultViewModelProviderFactory = this.f17401g.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f17401g.mDefaultFactory)) {
            this.f17404j = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f17404j == null) {
            Context applicationContext = this.f17401g.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f17401g;
            this.f17404j = new androidx.lifecycle.P(application, fragment, fragment.getArguments());
        }
        return this.f17404j;
    }

    @Override // androidx.lifecycle.r
    public AbstractC1764k getLifecycle() {
        b();
        return this.f17405k;
    }

    @Override // h1.InterfaceC2700i
    public C2697f getSavedStateRegistry() {
        b();
        return this.f17406l.b();
    }

    @Override // androidx.lifecycle.W
    public androidx.lifecycle.V getViewModelStore() {
        b();
        return this.f17402h;
    }
}
