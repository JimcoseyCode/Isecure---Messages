package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C1772t;
import h1.C2697f;
import h1.C2699h;
import h1.InterfaceC2700i;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.activity.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC1623w extends Dialog implements androidx.lifecycle.r, V, InterfaceC2700i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1772t f13871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2699h f13872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final T f13873i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1623w(Context context, int i10) {
        super(context, i10);
        AbstractC2855l.g(context, "context");
        this.f13872h = C2699h.f28264c.b(this);
        this.f13873i = new T(new Runnable() { // from class: androidx.activity.v
            @Override // java.lang.Runnable
            public final void run() {
                DialogC1623w.d(this.f13870g);
            }
        });
    }

    private final C1772t b() {
        C1772t c1772t = this.f13871g;
        if (c1772t != null) {
            return c1772t;
        }
        C1772t c1772t2 = new C1772t(this);
        this.f13871g = c1772t2;
        return c1772t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogC1623w dialogC1623w) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC2855l.g(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        AbstractC2855l.d(window);
        View decorView = window.getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        androidx.lifecycle.X.a(decorView, this);
        Window window2 = getWindow();
        AbstractC2855l.d(window2);
        View decorView2 = window2.getDecorView();
        AbstractC2855l.f(decorView2, "getDecorView(...)");
        a0.a(decorView2, this);
        Window window3 = getWindow();
        AbstractC2855l.d(window3);
        View decorView3 = window3.getDecorView();
        AbstractC2855l.f(decorView3, "getDecorView(...)");
        h1.m.a(decorView3, this);
    }

    @Override // androidx.lifecycle.r
    public AbstractC1764k getLifecycle() {
        return b();
    }

    @Override // androidx.activity.V
    public final T getOnBackPressedDispatcher() {
        return this.f13873i;
    }

    @Override // h1.InterfaceC2700i
    public C2697f getSavedStateRegistry() {
        return this.f13872h.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f13873i.s();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            T t10 = this.f13873i;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC2855l.f(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            t10.v(onBackInvokedDispatcher);
        }
        this.f13872h.d(bundle);
        b().i(AbstractC1764k.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC2855l.f(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f13872h.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().i(AbstractC1764k.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().i(AbstractC1764k.a.ON_DESTROY);
        this.f13871g = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC2855l.g(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC2855l.g(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
