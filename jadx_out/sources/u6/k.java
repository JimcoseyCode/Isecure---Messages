package u6;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1690q0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.view.ReactViewGroup;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import p6.C3082b;
import q6.C3127f;
import r6.AbstractC3276e;
import r6.AbstractC3277f;
import s6.C3330a;
import u6.n;
import v6.C3429a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends C1690q0.b implements I, n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ReactViewGroup f32702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f32703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ThemedReactContext f32704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f32705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f32706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f32707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f32708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f32709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f32711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HashSet f32713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f32714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f32715t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g f32716u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReactViewGroup eventPropagationView, View view, ThemedReactContext themedReactContext, l config) {
        super(config.b());
        AbstractC2855l.g(eventPropagationView, "eventPropagationView");
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(config, "config");
        this.f32702g = eventPropagationView;
        this.f32703h = view;
        this.f32704i = themedReactContext;
        this.f32705j = config;
        this.f32706k = UIManagerHelper.getSurfaceId(eventPropagationView);
        this.f32712q = -1;
        this.f32713r = new HashSet();
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: u6.j
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                k.f(this.f32701g, view2, view3);
            }
        };
        this.f32715t = onGlobalFocusChangeListener;
        if ((config.a() & config.d()) != 0) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values");
        }
        this.f32716u = new g(view, eventPropagationView, themedReactContext);
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(k kVar, View view, View view2) {
        if (view2 instanceof EditText) {
            kVar.f32712q = ((EditText) view2).getId();
            if (!kVar.f32709n || view == null) {
                return;
            }
            ThemedReactContext themedReactContext = kVar.f32704i;
            int id = kVar.f32702g.getId();
            int i10 = kVar.f32706k;
            int id2 = kVar.f32702g.getId();
            C3127f.a aVar = C3127f.f30847f;
            r6.i.a(themedReactContext, id, new C3127f(i10, id2, aVar.d(), kVar.f32707l, 1.0d, 0, kVar.f32712q));
            r6.i.a(kVar.f32704i, kVar.f32702g.getId(), new C3127f(kVar.f32706k, kVar.f32702g.getId(), aVar.a(), kVar.f32707l, 1.0d, 0, kVar.f32712q));
            r6.i.b(kVar.f32704i, "KeyboardController::keyboardWillShow", kVar.h(kVar.f32707l));
            r6.i.b(kVar.f32704i, "KeyboardController::keyboardDidShow", kVar.h(kVar.f32707l));
        }
    }

    private final double g() {
        x0.e eVarF;
        x0.e eVarF2;
        L0 l0F = AbstractC1658a0.F(this.f32703h);
        int i10 = 0;
        int i11 = (l0F == null || (eVarF2 = l0F.f(L0.p.b())) == null) ? 0 : eVarF2.f33240d;
        if (!this.f32705j.c() && l0F != null && (eVarF = l0F.f(L0.p.e())) != null) {
            i10 = eVarF.f33240d;
        }
        return B7.d.b(AbstractC3277f.a(i11 - i10), 0.0d);
    }

    private final WritableMap h(double d10) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("height", d10);
        writableMapCreateMap.putInt("duration", this.f32711p);
        writableMapCreateMap.putDouble("timestamp", System.currentTimeMillis());
        writableMapCreateMap.putInt("target", this.f32712q);
        EditText editTextB = A6.a.f86a.b();
        writableMapCreateMap.putString(NotificationsService.EVENT_TYPE_KEY, editTextB != null ? AbstractC3276e.f(editTextB) : null);
        writableMapCreateMap.putString("appearance", r6.i.c(this.f32704i));
        return writableMapCreateMap;
    }

    private final boolean j() {
        return this.f32711p == -1;
    }

    private final boolean k() {
        L0 l0F = AbstractC1658a0.F(this.f32703h);
        if (l0F != null) {
            return l0F.q(L0.p.b());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(k kVar, C1690q0 c1690q0) {
        double dG = kVar.g();
        kVar.f32709n = kVar.k();
        kVar.f32708m = dG;
        if (kVar.f32713r.contains(c1690q0)) {
            kVar.f32711p = 0;
            kVar.f32713r.remove(c1690q0);
            return;
        }
        r6.i.b(kVar.f32704i, "KeyboardController::" + (!kVar.f32709n ? "keyboardDidHide" : "keyboardDidShow"), kVar.h(dG));
        r6.i.a(kVar.f32704i, kVar.f32702g.getId(), new C3127f(kVar.f32706k, kVar.f32702g.getId(), C3127f.f30847f.a(), dG, !kVar.f32709n ? 0.0d : 1.0d, kVar.f32711p, kVar.f32712q));
        kVar.f32711p = 0;
        r6.i.d(kVar.f32704i, kVar.f32702g.getId());
    }

    private final void n(double d10) {
        this.f32711p = 0;
        r6.i.b(this.f32704i, "KeyboardController::keyboardWillShow", h(d10));
        C3127f.a aVar = C3127f.f30847f;
        Iterator it = AbstractC2800q.m(aVar.d(), aVar.c(), aVar.a()).iterator();
        while (it.hasNext()) {
            r6.i.a(this.f32704i, this.f32702g.getId(), new C3127f(this.f32706k, this.f32702g.getId(), (C3127f.a.EnumC0347a) it.next(), d10, 1.0d, 0, this.f32712q));
        }
        r6.i.b(this.f32704i, "KeyboardController::keyboardDidShow", h(d10));
        r6.i.d(this.f32704i, this.f32702g.getId());
        this.f32707l = d10;
    }

    public static /* synthetic */ void q(k kVar, Double d10, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        kVar.p(d10, bool);
    }

    @Override // androidx.core.view.I
    public L0 a(View v10, L0 insets) {
        AbstractC2855l.g(v10, "v");
        AbstractC2855l.g(insets, "insets");
        double dG = g();
        boolean z10 = (this.f32709n && k()) && !(this.f32710o || C3330a.f32310a.a());
        boolean z11 = this.f32707l == dG;
        if (z10 && !z11 && !m.f32722b) {
            C3429a.b(C3429a.f32948a, m.f32721a, "onApplyWindowInsets: " + this.f32707l + " -> " + dG, null, 4, null);
            g gVar = this.f32716u;
            if (gVar != null) {
                gVar.l();
            }
            n(dG);
        }
        return insets;
    }

    @Override // u6.n
    public void b(boolean z10) {
        this.f32714s = z10;
    }

    public final void e() {
        this.f32703h.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f32715t);
        g gVar = this.f32716u;
        if (gVar != null) {
            gVar.f();
        }
    }

    public final g i() {
        return this.f32716u;
    }

    public boolean l() {
        return this.f32714s;
    }

    public void o(boolean z10) {
        n.a.a(this, z10);
    }

    @Override // androidx.core.view.C1690q0.b
    public void onEnd(final C1690q0 animation) {
        AbstractC2855l.g(animation, "animation");
        super.onEnd(animation);
        if (!r6.l.a(animation) || l()) {
            return;
        }
        this.f32710o = false;
        this.f32711p = (int) animation.a();
        Runnable runnable = new Runnable() { // from class: u6.i
            @Override // java.lang.Runnable
            public final void run() {
                k.m(this.f32699g, animation);
            }
        };
        if (j()) {
            this.f32703h.postDelayed(runnable, C3082b.f30665a.a());
        } else {
            runnable.run();
        }
    }

    @Override // androidx.core.view.C1690q0.b
    public L0 onProgress(L0 insets, List runningAnimations) {
        Object next;
        AbstractC2855l.g(insets, "insets");
        AbstractC2855l.g(runningAnimations, "runningAnimations");
        Iterator it = runningAnimations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C1690q0 c1690q0 = (C1690q0) next;
            if (r6.l.a(c1690q0) && !this.f32713r.contains(c1690q0)) {
                break;
            }
        }
        boolean z10 = next == null;
        if (!l() && !z10) {
            x0.e eVarF = insets.f(this.f32705j.a());
            AbstractC2855l.f(eVarF, "getInsets(...)");
            x0.e NONE = insets.f(this.f32705j.d());
            AbstractC2855l.f(NONE, "getInsets(...)");
            if (this.f32705j.c()) {
                NONE = x0.e.f33236e;
                AbstractC2855l.f(NONE, "NONE");
            }
            x0.e eVarB = x0.e.b(x0.e.e(eVarF, NONE), x0.e.f33236e);
            AbstractC2855l.f(eVarB, "let(...)");
            float f10 = eVarB.f33240d - eVarB.f33238b;
            double dA = AbstractC3277f.a(f10);
            double d10 = 0.0d;
            try {
                double dAbs = Math.abs(dA / this.f32707l);
                if (!Double.isNaN(dAbs)) {
                    if (!Double.isInfinite(dAbs)) {
                        d10 = dAbs;
                    }
                }
            } catch (ArithmeticException e10) {
                C3429a.d(C3429a.f32948a, m.f32721a, "Caught arithmetic exception during `progress` calculation: " + e10, null, 4, null);
            }
            double d11 = d10;
            C3429a c3429a = C3429a.f32948a;
            String str = m.f32721a;
            C3330a c3330a = C3330a.f32310a;
            C3429a.b(c3429a, str, "DiffY: " + f10 + " " + dA + " " + d11 + " " + c3330a.a() + " " + this.f32712q, null, 4, null);
            r6.i.a(this.f32704i, this.f32702g.getId(), new C3127f(this.f32706k, this.f32702g.getId(), c3330a.a() ? C3127f.f30847f.b() : C3127f.f30847f.c(), dA, d11, this.f32711p, this.f32712q));
        }
        return insets;
    }

    @Override // androidx.core.view.C1690q0.b
    public C1690q0.a onStart(C1690q0 animation, C1690q0.a bounds) {
        AbstractC2855l.g(animation, "animation");
        AbstractC2855l.g(bounds, "bounds");
        if (!r6.l.a(animation) || l()) {
            return bounds;
        }
        this.f32710o = true;
        this.f32709n = k();
        this.f32711p = (int) animation.a();
        double dG = g();
        if (this.f32709n) {
            this.f32707l = dG;
        }
        g gVar = this.f32716u;
        if (gVar != null) {
            gVar.l();
        }
        boolean z10 = (dG == 0.0d || this.f32708m == dG) ? false : true;
        boolean z11 = this.f32709n && this.f32708m != 0.0d;
        if (z10 && z11 && m.f32722b) {
            n(dG);
            this.f32713r.add(animation);
            return bounds;
        }
        r6.i.b(this.f32704i, "KeyboardController::" + (!this.f32709n ? "keyboardWillHide" : "keyboardWillShow"), h(dG));
        C3429a.b(C3429a.f32948a, m.f32721a, "HEIGHT:: " + dG + " TAG:: " + this.f32712q, null, 4, null);
        ThemedReactContext themedReactContext = this.f32704i;
        int id = this.f32702g.getId();
        double d10 = 0.0d;
        int i10 = this.f32706k;
        int id2 = this.f32702g.getId();
        C3127f.a.EnumC0347a enumC0347aD = C3127f.f30847f.d();
        if (this.f32709n) {
            d10 = 1.0d;
        }
        r6.i.a(themedReactContext, id, new C3127f(i10, id2, enumC0347aD, dG, d10, this.f32711p, this.f32712q));
        C1690q0.a aVarOnStart = super.onStart(animation, bounds);
        AbstractC2855l.f(aVarOnStart, "onStart(...)");
        return aVarOnStart;
    }

    public final void p(Double d10, Boolean bool) {
        double dDoubleValue = d10 != null ? d10.doubleValue() : g();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : k();
        this.f32709n = zBooleanValue;
        this.f32708m = dDoubleValue;
        this.f32710o = false;
        this.f32711p = 0;
        r6.i.b(this.f32704i, "KeyboardController::" + (!zBooleanValue ? "keyboardDidHide" : "keyboardDidShow"), h(dDoubleValue));
        C3127f.a aVar = C3127f.f30847f;
        Iterator it = AbstractC2800q.m(aVar.c(), aVar.a()).iterator();
        while (it.hasNext()) {
            r6.i.a(this.f32704i, this.f32702g.getId(), new C3127f(this.f32706k, this.f32702g.getId(), (C3127f.a.EnumC0347a) it.next(), dDoubleValue, !this.f32709n ? 0.0d : 1.0d, this.f32711p, this.f32712q));
        }
    }
}
