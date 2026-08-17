package Y;

import F.AbstractC0517x0;
import F.C0475d;
import F.E;
import F.G;
import F.L;
import F.M;
import H.y;
import J.n;
import Y.h;
import android.content.Context;
import i7.C2735B;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.H;
import l1.AbstractC2861a;
import m5.InterfaceFutureC2904a;
import y.C3558C;
import y.C3559D;
import y.C3561F;
import y.C3581g0;
import y.C3596p;
import y.C3598s;
import y.InterfaceC3584i;
import y.InterfaceC3595o;
import y.InterfaceC3597q;
import y.J0;
import y.K0;
import y.r;
import y.v0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12568a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3559D.b f12569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceFutureC2904a f12570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceFutureC2904a f12571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f12572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3558C f12573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f12574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f12575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet f12576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f12577j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a implements C3559D.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3559D f12578a;

        a(C3559D c3559d) {
            this.f12578a = c3559d;
        }

        @Override // y.C3559D.b
        public final C3559D getCameraXConfig() {
            return this.f12578a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements J.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3558C f12580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f12581c;

        b(C3558C c3558c, Context context) {
            this.f12580b = c3558c;
            this.f12581c = context;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            g.this.f12573f = this.f12580b;
            g.this.B(H.f.a(this.f12581c));
        }

        @Override // J.c
        public void onFailure(Throwable t10) {
            AbstractC2855l.g(t10, "t");
            g.this.C(false);
        }
    }

    public g() {
        InterfaceFutureC2904a interfaceFutureC2904aP = n.p(null);
        AbstractC2855l.f(interfaceFutureC2904aP, "immediateFuture(...)");
        this.f12571d = interfaceFutureC2904aP;
        h hVarC = h.c();
        AbstractC2855l.f(hVarC, "getInstance(...)");
        this.f12572e = hVarC;
        this.f12575h = new HashMap();
        this.f12576i = new HashSet();
        this.f12577j = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(g gVar) {
        gVar.E();
        gVar.f12572e.i(gVar.f12576i);
    }

    private final InterfaceC3584i o(androidx.lifecycle.r rVar, C3598s c3598s, C3598s c3598s2, C3561F c3561f, C3561F c3561f2, v0 v0Var) {
        M m10;
        C0475d c0475d;
        AbstractC2861a.c("CX:bindToLifecycle-internal");
        try {
            y.b();
            C3558C c3558c = this.f12573f;
            AbstractC2855l.d(c3558c);
            M mG = c3598s.g(c3558c.h().m());
            AbstractC2855l.f(mG, "select(...)");
            mG.p(true);
            InterfaceC3597q interfaceC3597qS = s(c3598s);
            AbstractC2855l.e(interfaceC3597qS, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
            C0475d c0475d2 = (C0475d) interfaceC3597qS;
            if (c3598s2 != null) {
                C3558C c3558c2 = this.f12573f;
                AbstractC2855l.d(c3558c2);
                M mG2 = c3598s2.g(c3558c2.h().m());
                mG2.p(false);
                InterfaceC3597q interfaceC3597qS2 = s(c3598s2);
                AbstractC2855l.e(interfaceC3597qS2, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
                m10 = mG2;
                c0475d = (C0475d) interfaceC3597qS2;
            } else {
                m10 = null;
                c0475d = null;
            }
            C3596p c3596pE = C3596p.f33816c.e(c0475d2, c0475d);
            c cVarD = this.f12572e.d(rVar, c3596pE);
            Collection collectionF = this.f12572e.f();
            for (J0 j02 : v0Var.k()) {
                for (Object obj : collectionF) {
                    AbstractC2855l.f(obj, "next(...)");
                    c cVar = (c) obj;
                    if (cVar.w(j02) && !AbstractC2855l.b(cVar.u(), rVar)) {
                        H h10 = H.f29375a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{j02}, 1));
                        AbstractC2855l.f(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (cVarD == null) {
                h hVar = this.f12572e;
                C3558C c3558c3 = this.f12573f;
                AbstractC2855l.d(c3558c3);
                cVarD = hVar.b(rVar, c3558c3.i().a(mG, m10, c0475d2, c0475d, c3561f, c3561f2));
            }
            if (v0Var.k().isEmpty()) {
                AbstractC2855l.d(cVarD);
            } else {
                h hVar2 = this.f12572e;
                AbstractC2855l.d(cVarD);
                C3558C c3558c4 = this.f12573f;
                AbstractC2855l.d(c3558c4);
                hVar2.a(cVarD, v0Var, c3558c4.g().f());
                this.f12576i.add(h.a.a(rVar, c3596pE));
            }
            AbstractC2861a.f();
            return cVarD;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    static /* synthetic */ InterfaceC3584i p(g gVar, androidx.lifecycle.r rVar, C3598s c3598s, C3598s c3598s2, C3561F c3561f, C3561F c3561f2, v0 v0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c3598s2 = null;
        }
        C3598s c3598s3 = c3598s2;
        if ((i10 & 8) != 0) {
            c3561f = C3561F.f33635d;
        }
        C3561F c3561f3 = c3561f;
        if ((i10 & 16) != 0) {
            c3561f2 = C3561F.f33635d;
        }
        return gVar.o(rVar, c3598s, c3598s3, c3561f3, c3561f2, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E r(C3598s c3598s, InterfaceC3597q interfaceC3597q) {
        Iterator it = c3598s.c().iterator();
        AbstractC2855l.f(it, "iterator(...)");
        E e10 = null;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC2855l.f(next, "next(...)");
            InterfaceC3595o interfaceC3595o = (InterfaceC3595o) next;
            if (!AbstractC2855l.b(interfaceC3595o.a(), InterfaceC3595o.f33814a)) {
                G gA = AbstractC0517x0.a(interfaceC3595o.a());
                Context context = this.f12574g;
                AbstractC2855l.d(context);
                E eB = gA.b(interfaceC3597q, context);
                if (eB == null) {
                    continue;
                } else {
                    if (e10 != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    e10 = eB;
                }
            }
        }
        return e10 == null ? F.H.a() : e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int t() {
        C3558C c3558c = this.f12573f;
        if (c3558c == null) {
            return 0;
        }
        AbstractC2855l.d(c3558c);
        return c3558c.g().f().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceFutureC2904a w(C3558C c3558c, Void r12) {
        return c3558c.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceFutureC2904a x(Function1 function1, Object obj) {
        return (InterfaceFutureC2904a) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i10) {
        C3558C c3558c = this.f12573f;
        if (c3558c == null) {
            return;
        }
        AbstractC2855l.d(c3558c);
        c3558c.g().f().h(i10);
    }

    public void A(int i10) {
        this.f12577j = i10;
    }

    public final void B(Context context) {
        this.f12574g = context;
    }

    public final InterfaceFutureC2904a C(boolean z10) {
        InterfaceFutureC2904a interfaceFutureC2904aP;
        y.f(new Runnable() { // from class: Y.f
            @Override // java.lang.Runnable
            public final void run() {
                g.D(this.f12567g);
            }
        });
        C3558C c3558c = this.f12573f;
        if (c3558c != null) {
            AbstractC2855l.d(c3558c);
            interfaceFutureC2904aP = c3558c.q();
        } else {
            interfaceFutureC2904aP = n.p(null);
        }
        AbstractC2855l.d(interfaceFutureC2904aP);
        synchronized (this.f12568a) {
            if (z10) {
                try {
                    this.f12569b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f12570c = null;
            this.f12571d = interfaceFutureC2904aP;
            this.f12575h.clear();
            this.f12576i.clear();
            C2735B c2735b = C2735B.f28704a;
        }
        this.f12573f = null;
        this.f12574g = null;
        return interfaceFutureC2904aP;
    }

    public void E() {
        AbstractC2861a.c("CX:unbindAll");
        try {
            y.b();
            y(0);
            this.f12572e.m(this.f12576i);
            C2735B c2735b = C2735B.f28704a;
        } finally {
            AbstractC2861a.f();
        }
    }

    @Override // y.r
    public int a() {
        return this.f12577j;
    }

    public InterfaceC3584i n(androidx.lifecycle.r lifecycleOwner, C3598s cameraSelector, K0 useCaseGroup) {
        AbstractC2855l.g(lifecycleOwner, "lifecycleOwner");
        AbstractC2855l.g(cameraSelector, "cameraSelector");
        AbstractC2855l.g(useCaseGroup, "useCaseGroup");
        AbstractC2861a.c("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (t() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            y(1);
            InterfaceC3584i interfaceC3584iP = p(this, lifecycleOwner, cameraSelector, null, null, null, new C3581g0(useCaseGroup), 28, null);
            AbstractC2861a.f();
            return interfaceC3584iP;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final void q(C3559D cameraXConfig) {
        AbstractC2855l.g(cameraXConfig, "cameraXConfig");
        AbstractC2861a.c("CX:configureInstanceInternal");
        try {
            synchronized (this.f12568a) {
                H0.g.g(cameraXConfig);
                H0.g.j(u() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                z(new a(cameraXConfig));
                C2735B c2735b = C2735B.f28704a;
            }
        } finally {
            AbstractC2861a.f();
        }
    }

    public InterfaceC3597q s(C3598s cameraSelector) {
        Object c0475d;
        AbstractC2855l.g(cameraSelector, "cameraSelector");
        AbstractC2861a.c("CX:getCameraInfo");
        try {
            C3558C c3558c = this.f12573f;
            AbstractC2855l.d(c3558c);
            L lR = cameraSelector.g(c3558c.h().m()).r();
            AbstractC2855l.f(lR, "getCameraInfoInternal(...)");
            E eR = r(cameraSelector, lR);
            C3596p.a aVar = C3596p.f33816c;
            String strF = lR.f();
            AbstractC2855l.f(strF, "getCameraId(...)");
            C3596p c3596pB = aVar.b(strF, null, eR.T());
            synchronized (this.f12568a) {
                try {
                    c0475d = this.f12575h.get(c3596pB);
                    if (c0475d == null) {
                        c0475d = new C0475d(lR, eR);
                        this.f12575h.put(c3596pB, c0475d);
                    }
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (C0475d) c0475d;
        } finally {
            AbstractC2861a.f();
        }
    }

    public final C3559D.b u() {
        return this.f12569b;
    }

    public final InterfaceFutureC2904a v(Context context, C3559D c3559d) {
        AbstractC2855l.g(context, "context");
        synchronized (this.f12568a) {
            InterfaceFutureC2904a interfaceFutureC2904a = this.f12570c;
            if (interfaceFutureC2904a != null) {
                AbstractC2855l.e(interfaceFutureC2904a, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>");
                return interfaceFutureC2904a;
            }
            if (c3559d != null) {
                q(c3559d);
            }
            final C3558C c3558c = new C3558C(context, this.f12569b);
            A(c3558c.j());
            J.d dVarA = J.d.a(this.f12571d);
            final Function1 function1 = new Function1() { // from class: Y.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.w(c3558c, (Void) obj);
                }
            };
            J.d dVarE = dVarA.e(new J.a() { // from class: Y.e
                @Override // J.a
                public final InterfaceFutureC2904a apply(Object obj) {
                    return g.x(function1, obj);
                }
            }, I.c.b());
            AbstractC2855l.f(dVarE, "transformAsync(...)");
            this.f12570c = dVarE;
            n.j(dVarE, new b(c3558c, context), I.c.b());
            InterfaceFutureC2904a interfaceFutureC2904aS = n.s(dVarE);
            AbstractC2855l.f(interfaceFutureC2904aS, "nonCancellationPropagating(...)");
            return interfaceFutureC2904aS;
        }
    }

    public final void z(C3559D.b bVar) {
        this.f12569b = bVar;
    }
}
