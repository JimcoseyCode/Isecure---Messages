package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1751t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1753v f17504a;

    private C1751t(AbstractC1753v abstractC1753v) {
        this.f17504a = abstractC1753v;
    }

    public static C1751t b(AbstractC1753v abstractC1753v) {
        return new C1751t((AbstractC1753v) H0.g.h(abstractC1753v, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        AbstractC1753v abstractC1753v = this.f17504a;
        abstractC1753v.f17510k.m(abstractC1753v, abstractC1753v, fragment);
    }

    public void c() {
        this.f17504a.f17510k.x();
    }

    public boolean d(MenuItem menuItem) {
        return this.f17504a.f17510k.A(menuItem);
    }

    public void e() {
        this.f17504a.f17510k.B();
    }

    public void f() {
        this.f17504a.f17510k.D();
    }

    public void g() {
        this.f17504a.f17510k.M();
    }

    public void h() {
        this.f17504a.f17510k.Q();
    }

    public void i() {
        this.f17504a.f17510k.R();
    }

    public void j() {
        this.f17504a.f17510k.T();
    }

    public boolean k() {
        return this.f17504a.f17510k.a0(true);
    }

    public FragmentManager l() {
        return this.f17504a.f17510k;
    }

    public void m() {
        this.f17504a.f17510k.V0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f17504a.f17510k.x0().onCreateView(view, str, context, attributeSet);
    }
}
