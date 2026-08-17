package s6;

import U0.h;
import U0.i;
import U0.m;
import U0.n;
import android.os.CancellationSignal;
import android.view.View;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.D0;
import androidx.core.view.K0;
import androidx.core.view.L0;
import androidx.core.view.l1;
import i7.AbstractC2746i;
import i7.C2735B;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K0 f32316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CancellationSignal f32317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Function1 f32318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f32319d = AbstractC2746i.b(new InterfaceC3487a() { // from class: s6.e
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return f.m(this.f32315g);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m f32321f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements D0 {
        a() {
        }

        @Override // androidx.core.view.D0
        public void a(K0 k02) {
            f.this.w();
        }

        @Override // androidx.core.view.D0
        public void b(K0 controller, int i10) {
            AbstractC2855l.g(controller, "controller");
            f.this.v(controller);
        }

        @Override // androidx.core.view.D0
        public void c(K0 controller) {
            AbstractC2855l.g(controller, "controller");
            f.this.w();
        }
    }

    private final void g(boolean z10, Float f10) {
        final K0 k02 = this.f32316a;
        if (k02 == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        m mVarB = i.b(new Function1() { // from class: s6.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.i(this.f32312g, ((Float) obj).floatValue());
            }
        }, new InterfaceC3487a() { // from class: s6.c
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Float.valueOf(f.j(k02));
            }
        }, z10 ? k02.e().f33240d : k02.d().f33240d);
        if (mVarB.q() == null) {
            mVarB.t(new n());
        }
        n spring = mVarB.q();
        AbstractC2855l.c(spring, "spring");
        spring.f(1.0f);
        spring.h(1500.0f);
        if (f10 != null) {
            mVarB.k(f10.floatValue());
        }
        mVarB.b(new h.q() { // from class: s6.d
            @Override // U0.h.q
            public final void a(h hVar, boolean z11, float f11, float f12) {
                f.k(this.f32314a, hVar, z11, f11, f12);
            }
        });
        mVarB.l();
        this.f32321f = mVarB;
    }

    static /* synthetic */ void h(f fVar, boolean z10, Float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        fVar.g(z10, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B i(f fVar, float f10) {
        fVar.s(AbstractC3624a.c(f10));
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(K0 k02) {
        return k02.c().f33240d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f fVar, h hVar, boolean z10, float f10, float f11) {
        if (AbstractC2855l.b(hVar, fVar.f32321f)) {
            fVar.f32321f = null;
        }
        fVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a m(f fVar) {
        return fVar.new a();
    }

    private final a p() {
        return (a) this.f32319d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(K0 k02) {
        this.f32317b = null;
        this.f32316a = k02;
        Function1 function1 = this.f32318c;
        if (function1 != null) {
            function1.invoke(k02);
        }
        this.f32318c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        this.f32316a = null;
        this.f32317b = null;
        this.f32320e = false;
        m mVar = this.f32321f;
        if (mVar != null) {
            mVar.c();
        }
        this.f32321f = null;
        this.f32318c = null;
    }

    public static /* synthetic */ void y(f fVar, View view, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        fVar.x(view, function1);
    }

    public final void l(Float f10) {
        K0 k02 = this.f32316a;
        if (k02 == null) {
            CancellationSignal cancellationSignal = this.f32317b;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        C3330a.f32310a.b(false);
        int i10 = k02.c().f33240d;
        int i11 = k02.e().f33240d;
        int i12 = k02.d().f33240d;
        if (f10 != null) {
            g(f10.floatValue() < 0.0f, f10);
            return;
        }
        if (i10 == i11) {
            k02.a(true);
            return;
        }
        if (i10 == i12) {
            k02.a(false);
        } else if (k02.b() >= 0.15f) {
            h(this, !this.f32320e, null, 2, null);
        } else {
            h(this, this.f32320e, null, 2, null);
        }
    }

    public final void n() {
        K0 k02 = this.f32316a;
        if (k02 != null) {
            k02.a(this.f32320e);
        }
        CancellationSignal cancellationSignal = this.f32317b;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        m mVar = this.f32321f;
        if (mVar != null) {
            mVar.c();
        }
        w();
    }

    public final void o() {
        K0 k02 = this.f32316a;
        if (k02 == null) {
            CancellationSignal cancellationSignal = this.f32317b;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        int i10 = k02.c().f33240d;
        int i11 = k02.e().f33240d;
        int i12 = k02.d().f33240d;
        if (i10 == i11) {
            k02.a(true);
            return;
        }
        if (i10 == i12) {
            k02.a(false);
        } else if (k02.b() >= 0.15f) {
            k02.a(!this.f32320e);
        } else {
            k02.a(this.f32320e);
        }
    }

    public final int q() {
        K0 k02 = this.f32316a;
        if (k02 != null) {
            return k02.c().f33240d;
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    public final int r(int i10) {
        K0 k02 = this.f32316a;
        if (k02 == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        C3330a.f32310a.b(true);
        return s(k02.c().f33240d - i10);
    }

    public final int s(int i10) {
        K0 k02 = this.f32316a;
        if (k02 == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        int i11 = k02.d().f33240d;
        int i12 = k02.e().f33240d;
        boolean z10 = this.f32320e;
        int i13 = z10 ? i12 : i11;
        int i14 = z10 ? i11 : i12;
        int iL = B7.d.l(i10, i11, i12);
        int i15 = k02.c().f33240d - iL;
        k02.f(x0.e.c(0, 0, 0, iL), 1.0f, (iL - i13) / (i14 - i13));
        return i15;
    }

    public final boolean t() {
        return this.f32316a != null;
    }

    public final boolean u() {
        return this.f32317b != null;
    }

    public final void x(View view, Function1 function1) {
        AbstractC2855l.g(view, "view");
        if (t()) {
            throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()");
        }
        L0 l0F = AbstractC1658a0.F(view);
        boolean z10 = false;
        if (l0F != null && l0F.q(L0.p.b())) {
            z10 = true;
        }
        this.f32320e = z10;
        this.f32317b = new CancellationSignal();
        this.f32318c = function1;
        C3330a.f32310a.b(true);
        l1 l1VarJ = AbstractC1658a0.J(view);
        if (l1VarJ != null) {
            l1VarJ.a(L0.p.b(), -1L, g.f32323a, this.f32317b, p());
        }
    }
}
