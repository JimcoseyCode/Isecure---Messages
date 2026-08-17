package B6;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1688p0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import r6.j;
import u6.k;
import u6.l;
import v6.C3429a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends ReactViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ReactViewGroup f373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final l f376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x6.b f377p;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2853j implements InterfaceC3487a {
        a(Object obj) {
            super(0, obj, d.class, "getKeyboardCallback", "getKeyboardCallback()Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", 0);
        }

        @Override // w7.InterfaceC3487a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return ((d) this.receiver).getKeyboardCallback();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f368g = reactContext;
        l lVar = new l(L0.p.g(), L0.p.b(), 1, this.f370i);
        this.f376o = lVar;
        this.f377p = new x6.b(this, reactContext, lVar, new a(this));
        f.f379a.b(this);
    }

    private final void f() {
        o();
        this.f377p.c();
    }

    private final void g() {
        l();
        this.f377p.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getKeyboardCallback() {
        return this.f375n;
    }

    private final void h() {
        p();
        g();
    }

    private final void i() {
        p();
        f();
    }

    private final void k() {
        p();
        r6.k.c(this);
    }

    private final void l() {
        k kVar = this.f375n;
        if (kVar != null) {
            kVar.e();
        }
        final ReactViewGroup reactViewGroup = this.f373l;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: B6.c
            @Override // java.lang.Runnable
            public final void run() {
                d.m(reactViewGroup);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ReactViewGroup reactViewGroup) {
        j.a(reactViewGroup);
    }

    private final void o() {
        if (this.f368g.getCurrentActivity() == null) {
            C3429a.d(C3429a.f32948a, e.f378a, "Can not setup keyboard animation listener, since `currentActivity` is null", null, 4, null);
            return;
        }
        this.f373l = new ReactViewGroup(getContext());
        ViewGroup viewGroupA = r6.h.a(this.f368g);
        if (viewGroupA != null) {
            viewGroupA.addView(this.f373l);
        }
        k kVar = new k(this, this, this.f368g, this.f376o);
        this.f375n = kVar;
        ReactViewGroup reactViewGroup = this.f373l;
        if (reactViewGroup != null) {
            AbstractC1658a0.C0(reactViewGroup, kVar);
            AbstractC1658a0.w0(reactViewGroup, this.f375n);
            r6.k.c(reactViewGroup);
        }
    }

    private final void p() {
        View viewC = r6.h.c(this.f368g);
        if (viewC != null) {
            AbstractC1658a0.w0(viewC, new I() { // from class: B6.b
                @Override // androidx.core.view.I
                public final L0 a(View view, L0 l02) {
                    return d.q(this.f366g, view, l02);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 q(d dVar, View v10, L0 insets) {
        AbstractC2855l.g(v10, "v");
        AbstractC2855l.g(insets, "insets");
        ViewGroup viewGroupA = r6.h.a(dVar.f368g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        boolean z10 = (dVar.f372k || r6.h.e(dVar.f368g) != 16 || dVar.f371j) ? false : true;
        x0.e eVarF = insets.f(L0.p.e());
        AbstractC2855l.f(eVarF, "getInsets(...)");
        x0.e eVarF2 = insets.f(L0.p.g());
        AbstractC2855l.f(eVarF2, "getInsets(...)");
        int iMax = !z10 ? 0 : insets.f(L0.p.b()).f33240d;
        int i10 = eVarF.f33237a;
        int i11 = dVar.f369h ? 0 : eVarF2.f33238b;
        int i12 = eVarF.f33239c;
        if (!dVar.f370i) {
            iMax = Math.max(eVarF.f33240d, iMax);
        }
        layoutParams.setMargins(i10, i11, i12, iMax);
        if (viewGroupA != null) {
            viewGroupA.setLayoutParams(layoutParams);
        }
        return AbstractC1658a0.W(v10, insets);
    }

    public final boolean getActive() {
        return this.f372k;
    }

    public final k getCallback$react_native_keyboard_controller_release() {
        return this.f375n;
    }

    public final ThemedReactContext getReactContext() {
        return this.f368g;
    }

    public final void j(boolean z10) {
        if (!this.f372k || this.f369h == z10) {
            return;
        }
        this.f369h = z10;
        k();
    }

    public final void n() {
        Window window;
        Activity currentActivity = this.f368g.getCurrentActivity();
        if (currentActivity != null) {
            AbstractC1688p0.c(currentActivity.getWindow(), false);
        }
        Activity currentActivity2 = this.f368g.getCurrentActivity();
        if (currentActivity2 == null || (window = currentActivity2.getWindow()) == null) {
            return;
        }
        window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f374m) {
            f();
        } else {
            this.f374m = true;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    public final void setActive(boolean z10) {
        this.f372k = z10;
        if (z10) {
            i();
        } else {
            h();
        }
    }

    public final void setCallback$react_native_keyboard_controller_release(k kVar) {
        this.f375n = kVar;
    }

    public final void setNavigationBarTranslucent(boolean z10) {
        this.f370i = z10;
        this.f376o.e(z10);
    }

    public final void setPreserveEdgeToEdge(boolean z10) {
        this.f371j = z10;
    }

    public final void setStatusBarTranslucent(boolean z10) {
        this.f369h = z10;
    }
}
