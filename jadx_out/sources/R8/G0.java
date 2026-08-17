package R8;

import R8.A0;
import W8.C1513p;
import i7.AbstractC2738a;
import i7.C2735B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.j;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class G0 implements A0, InterfaceC1438v, P0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10121g = AtomicReferenceFieldUpdater.newUpdater(G0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10122h = AtomicReferenceFieldUpdater.newUpdater(G0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a extends C1425o {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final G0 f10123o;

        public a(n7.f fVar, G0 g02) {
            super(fVar, 1);
            this.f10123o = g02;
        }

        @Override // R8.C1425o
        protected String L() {
            return "AwaitContinuation";
        }

        @Override // R8.C1425o
        public Throwable x(A0 a02) {
            Throwable thF;
            Object objV = this.f10123o.V();
            return (!(objV instanceof c) || (thF = ((c) objV).f()) == null) ? objV instanceof B ? ((B) objV).f10115a : a02.M() : thF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b extends F0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final G0 f10124k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final c f10125l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C1436u f10126m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f10127n;

        public b(G0 g02, c cVar, C1436u c1436u, Object obj) {
            this.f10124k = g02;
            this.f10125l = cVar;
            this.f10126m = c1436u;
            this.f10127n = obj;
        }

        @Override // R8.F0
        public boolean v() {
            return false;
        }

        @Override // R8.F0
        public void w(Throwable th) {
            this.f10124k.H(this.f10125l, this.f10126m, this.f10127n);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements InterfaceC1439v0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f10128h = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f10129i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f10130j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final L0 f10131g;

        public c(L0 l02, boolean z10, Throwable th) {
            this.f10131g = l02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object e() {
            return f10130j.get(this);
        }

        private final void o(Object obj) {
            f10130j.set(this, obj);
        }

        @Override // R8.InterfaceC1439v0
        public L0 a() {
            return this.f10131g;
        }

        public final void b(Throwable th) {
            Throwable thF = f();
            if (thF == null) {
                p(th);
                return;
            }
            if (th == thF) {
                return;
            }
            Object objE = e();
            if (objE == null) {
                o(th);
                return;
            }
            if (objE instanceof Throwable) {
                if (th == objE) {
                    return;
                }
                ArrayList arrayListC = c();
                arrayListC.add(objE);
                arrayListC.add(th);
                o(arrayListC);
                return;
            }
            if (objE instanceof ArrayList) {
                ((ArrayList) objE).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objE).toString());
        }

        @Override // R8.InterfaceC1439v0
        public boolean d() {
            return f() == null;
        }

        public final Throwable f() {
            return (Throwable) f10129i.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f10128h.get(this) == 1;
        }

        public final boolean l() {
            return e() == H0.f10136e;
        }

        public final List m(Throwable th) {
            ArrayList arrayListC;
            Object objE = e();
            if (objE == null) {
                arrayListC = c();
            } else if (objE instanceof Throwable) {
                ArrayList arrayListC2 = c();
                arrayListC2.add(objE);
                arrayListC = arrayListC2;
            } else {
                if (!(objE instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objE).toString());
                }
                arrayListC = (ArrayList) objE;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListC.add(0, thF);
            }
            if (th != null && !AbstractC2855l.b(th, thF)) {
                arrayListC.add(th);
            }
            o(H0.f10136e);
            return arrayListC;
        }

        public final void n(boolean z10) {
            f10128h.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th) {
            f10129i.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + a() + ']';
        }
    }

    public G0(boolean z10) {
        this._state$volatile = z10 ? H0.f10138g : H0.f10137f;
    }

    private final Object C(Object obj) {
        Object objJ0;
        do {
            Object objV = V();
            if (!(objV instanceof InterfaceC1439v0) || ((objV instanceof c) && ((c) objV).k())) {
                return H0.f10132a;
            }
            objJ0 = J0(objV, new B(K(obj), false, 2, null));
        } while (objJ0 == H0.f10134c);
        return objJ0;
    }

    private final int C0(Object obj) {
        if (obj instanceof C1414i0) {
            if (((C1414i0) obj).d()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f10121g, this, obj, H0.f10138g)) {
                return -1;
            }
            s0();
            return 1;
        }
        if (!(obj instanceof C1437u0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f10121g, this, obj, ((C1437u0) obj).a())) {
            return -1;
        }
        s0();
        return 1;
    }

    private final boolean D(Throwable th) {
        if (f0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC1434t interfaceC1434tU = U();
        return (interfaceC1434tU == null || interfaceC1434tU == N0.f10147g) ? z10 : interfaceC1434tU.j(th) || z10;
    }

    private final String D0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC1439v0 ? ((InterfaceC1439v0) obj).d() ? "Active" : "New" : obj instanceof B ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException F0(G0 g02, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return g02.E0(th, str);
    }

    private final void G(InterfaceC1439v0 interfaceC1439v0, Object obj) throws Throwable {
        InterfaceC1434t interfaceC1434tU = U();
        if (interfaceC1434tU != null) {
            interfaceC1434tU.dispose();
            B0(N0.f10147g);
        }
        B b10 = obj instanceof B ? (B) obj : null;
        Throwable th = b10 != null ? b10.f10115a : null;
        if (!(interfaceC1439v0 instanceof F0)) {
            L0 l0A = interfaceC1439v0.a();
            if (l0A != null) {
                p0(l0A, th);
                return;
            }
            return;
        }
        try {
            ((F0) interfaceC1439v0).w(th);
        } catch (Throwable th2) {
            b0(new C("Exception in completion handler " + interfaceC1439v0 + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(c cVar, C1436u c1436u, Object obj) {
        C1436u c1436uN0 = n0(c1436u);
        if (c1436uN0 == null || !L0(cVar, c1436uN0, obj)) {
            cVar.a().f(2);
            C1436u c1436uN02 = n0(c1436u);
            if (c1436uN02 == null || !L0(cVar, c1436uN02, obj)) {
                u(L(cVar, obj));
            }
        }
    }

    private final boolean H0(InterfaceC1439v0 interfaceC1439v0, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f10121g, this, interfaceC1439v0, H0.g(obj))) {
            return false;
        }
        q0(null);
        r0(obj);
        G(interfaceC1439v0, obj);
        return true;
    }

    private final boolean I0(InterfaceC1439v0 interfaceC1439v0, Throwable th) throws Throwable {
        L0 l0S = S(interfaceC1439v0);
        if (l0S == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f10121g, this, interfaceC1439v0, new c(l0S, false, th))) {
            return false;
        }
        o0(l0S, th);
        return true;
    }

    private final Object J0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC1439v0) ? H0.f10132a : ((!(obj instanceof C1414i0) && !(obj instanceof F0)) || (obj instanceof C1436u) || (obj2 instanceof B)) ? K0((InterfaceC1439v0) obj, obj2) : H0((InterfaceC1439v0) obj, obj2) ? obj2 : H0.f10134c;
    }

    private final Throwable K(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new B0(E(), null, this) : th;
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((P0) obj).t0();
    }

    private final Object K0(InterfaceC1439v0 interfaceC1439v0, Object obj) throws Throwable {
        L0 l0S = S(interfaceC1439v0);
        if (l0S == null) {
            return H0.f10134c;
        }
        c cVar = interfaceC1439v0 instanceof c ? (c) interfaceC1439v0 : null;
        if (cVar == null) {
            cVar = new c(l0S, false, null);
        }
        kotlin.jvm.internal.C c10 = new kotlin.jvm.internal.C();
        synchronized (cVar) {
            if (cVar.k()) {
                return H0.f10132a;
            }
            cVar.n(true);
            if (cVar != interfaceC1439v0 && !androidx.concurrent.futures.b.a(f10121g, this, interfaceC1439v0, cVar)) {
                return H0.f10134c;
            }
            boolean zJ = cVar.j();
            B b10 = obj instanceof B ? (B) obj : null;
            if (b10 != null) {
                cVar.b(b10.f10115a);
            }
            Throwable thF = zJ ? null : cVar.f();
            c10.f29371g = thF;
            C2735B c2735b = C2735B.f28704a;
            if (thF != null) {
                o0(l0S, thF);
            }
            C1436u c1436uN0 = n0(l0S);
            if (c1436uN0 != null && L0(cVar, c1436uN0, obj)) {
                return H0.f10133b;
            }
            l0S.f(2);
            C1436u c1436uN02 = n0(l0S);
            return (c1436uN02 == null || !L0(cVar, c1436uN02, obj)) ? L(cVar, obj) : H0.f10133b;
        }
    }

    private final Object L(c cVar, Object obj) throws Throwable {
        boolean zJ;
        Throwable thP;
        B b10 = obj instanceof B ? (B) obj : null;
        Throwable th = b10 != null ? b10.f10115a : null;
        synchronized (cVar) {
            zJ = cVar.j();
            List listM = cVar.m(th);
            thP = P(cVar, listM);
            if (thP != null) {
                t(thP, listM);
            }
        }
        if (thP != null && thP != th) {
            obj = new B(thP, false, 2, null);
        }
        if (thP != null && (D(thP) || a0(thP))) {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((B) obj).c();
        }
        if (!zJ) {
            q0(thP);
        }
        r0(obj);
        androidx.concurrent.futures.b.a(f10121g, this, cVar, H0.g(obj));
        G(cVar, obj);
        return obj;
    }

    private final boolean L0(c cVar, C1436u c1436u, Object obj) {
        while (D0.i(c1436u.f10220k, false, new b(this, cVar, c1436u, obj)) == N0.f10147g) {
            c1436u = n0(c1436u);
            if (c1436u == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable O(Object obj) {
        B b10 = obj instanceof B ? (B) obj : null;
        if (b10 != null) {
            return b10.f10115a;
        }
        return null;
    }

    private final Throwable P(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.j()) {
                return new B0(E(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof X0) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof X0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final L0 S(InterfaceC1439v0 interfaceC1439v0) {
        L0 l0A = interfaceC1439v0.a();
        if (l0A != null) {
            return l0A;
        }
        if (interfaceC1439v0 instanceof C1414i0) {
            return new L0();
        }
        if (interfaceC1439v0 instanceof F0) {
            x0((F0) interfaceC1439v0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1439v0).toString());
    }

    private final Object h0(Object obj) throws Throwable {
        Throwable thK = null;
        while (true) {
            Object objV = V();
            if (objV instanceof c) {
                synchronized (objV) {
                    if (((c) objV).l()) {
                        return H0.f10135d;
                    }
                    boolean zJ = ((c) objV).j();
                    if (obj != null || !zJ) {
                        if (thK == null) {
                            thK = K(obj);
                        }
                        ((c) objV).b(thK);
                    }
                    Throwable thF = zJ ? null : ((c) objV).f();
                    if (thF != null) {
                        o0(((c) objV).a(), thF);
                    }
                    return H0.f10132a;
                }
            }
            if (!(objV instanceof InterfaceC1439v0)) {
                return H0.f10135d;
            }
            if (thK == null) {
                thK = K(obj);
            }
            InterfaceC1439v0 interfaceC1439v0 = (InterfaceC1439v0) objV;
            if (!interfaceC1439v0.d()) {
                Object objJ0 = J0(objV, new B(thK, false, 2, null));
                if (objJ0 == H0.f10132a) {
                    throw new IllegalStateException(("Cannot happen in " + objV).toString());
                }
                if (objJ0 != H0.f10134c) {
                    return objJ0;
                }
            } else if (I0(interfaceC1439v0, thK)) {
                return H0.f10132a;
            }
        }
    }

    private final C1436u n0(C1513p c1513p) {
        while (c1513p.q()) {
            c1513p = c1513p.m();
        }
        while (true) {
            c1513p = c1513p.l();
            if (!c1513p.q()) {
                if (c1513p instanceof C1436u) {
                    return (C1436u) c1513p;
                }
                if (c1513p instanceof L0) {
                    return null;
                }
            }
        }
    }

    private final void o0(L0 l02, Throwable th) throws Throwable {
        q0(th);
        l02.f(4);
        Object objK = l02.k();
        AbstractC2855l.e(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C c10 = null;
        for (C1513p c1513pL = (C1513p) objK; !AbstractC2855l.b(c1513pL, l02); c1513pL = c1513pL.l()) {
            if ((c1513pL instanceof F0) && ((F0) c1513pL).v()) {
                try {
                    ((F0) c1513pL).w(th);
                } catch (Throwable th2) {
                    if (c10 != null) {
                        AbstractC2738a.a(c10, th2);
                    } else {
                        c10 = new C("Exception in completion handler " + c1513pL + " for " + this, th2);
                        C2735B c2735b = C2735B.f28704a;
                    }
                }
            }
        }
        if (c10 != null) {
            b0(c10);
        }
        D(th);
    }

    private final void p0(L0 l02, Throwable th) throws Throwable {
        l02.f(1);
        Object objK = l02.k();
        AbstractC2855l.e(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C c10 = null;
        for (C1513p c1513pL = (C1513p) objK; !AbstractC2855l.b(c1513pL, l02); c1513pL = c1513pL.l()) {
            if (c1513pL instanceof F0) {
                try {
                    ((F0) c1513pL).w(th);
                } catch (Throwable th2) {
                    if (c10 != null) {
                        AbstractC2738a.a(c10, th2);
                    } else {
                        c10 = new C("Exception in completion handler " + c1513pL + " for " + this, th2);
                        C2735B c2735b = C2735B.f28704a;
                    }
                }
            }
        }
        if (c10 != null) {
            b0(c10);
        }
    }

    private final void t(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC2738a.a(th, th2);
            }
        }
    }

    private final void v0(C1414i0 c1414i0) {
        L0 l02 = new L0();
        Object c1437u0 = l02;
        if (!c1414i0.d()) {
            c1437u0 = new C1437u0(l02);
        }
        androidx.concurrent.futures.b.a(f10121g, this, c1414i0, c1437u0);
    }

    private final Object w(n7.f fVar) {
        a aVar = new a(AbstractC3016b.c(fVar), this);
        aVar.F();
        AbstractC1429q.a(aVar, E0.j(this, false, new Q0(aVar), 1, null));
        Object objZ = aVar.z();
        if (objZ == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ;
    }

    private final void x0(F0 f02) {
        f02.e(new L0());
        androidx.concurrent.futures.b.a(f10121g, this, f02, f02.l());
    }

    @Override // R8.A0
    public final InterfaceC1434t A(InterfaceC1438v interfaceC1438v) {
        C1436u c1436u = new C1436u(interfaceC1438v);
        c1436u.x(this);
        while (true) {
            Object objV = V();
            if (objV instanceof C1414i0) {
                C1414i0 c1414i0 = (C1414i0) objV;
                if (!c1414i0.d()) {
                    v0(c1414i0);
                } else if (androidx.concurrent.futures.b.a(f10121g, this, objV, c1436u)) {
                    return c1436u;
                }
            } else {
                if (!(objV instanceof InterfaceC1439v0)) {
                    Object objV2 = V();
                    B b10 = objV2 instanceof B ? (B) objV2 : null;
                    c1436u.w(b10 != null ? b10.f10115a : null);
                    return N0.f10147g;
                }
                L0 l0A = ((InterfaceC1439v0) objV).a();
                if (l0A != null) {
                    if (!l0A.b(c1436u, 7)) {
                        boolean zB = l0A.b(c1436u, 3);
                        Object objV3 = V();
                        if (objV3 instanceof c) {
                            thF = ((c) objV3).f();
                        } else {
                            B b11 = objV3 instanceof B ? (B) objV3 : null;
                            if (b11 != null) {
                                thF = b11.f10115a;
                            }
                        }
                        c1436u.w(thF);
                        if (!zB) {
                            return N0.f10147g;
                        }
                    }
                    return c1436u;
                }
                AbstractC2855l.e(objV, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                x0((F0) objV);
            }
        }
    }

    public final void B0(InterfaceC1434t interfaceC1434t) {
        f10122h.set(this, interfaceC1434t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String E() {
        return "Job was cancelled";
    }

    protected final CancellationException E0(Throwable th, String str) {
        CancellationException b02 = th instanceof CancellationException ? (CancellationException) th : null;
        if (b02 == null) {
            if (str == null) {
                str = E();
            }
            b02 = new B0(str, th, this);
        }
        return b02;
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return y(th) && Q();
    }

    public final String G0() {
        return m0() + '{' + D0(V()) + '}';
    }

    @Override // R8.A0
    public final InterfaceC1408f0 J(boolean z10, boolean z11, Function1 function1) {
        return e0(z11, z10 ? new C1445y0(function1) : new C1447z0(function1));
    }

    @Override // R8.A0
    public final CancellationException M() {
        Object objV = V();
        if (!(objV instanceof c)) {
            if (objV instanceof InterfaceC1439v0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objV instanceof B) {
                return F0(this, ((B) objV).f10115a, null, 1, null);
            }
            return new B0(S.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((c) objV).f();
        if (thF != null) {
            CancellationException cancellationExceptionE0 = E0(thF, S.a(this) + " is cancelling");
            if (cancellationExceptionE0 != null) {
                return cancellationExceptionE0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Object N() throws Throwable {
        Object objV = V();
        if (objV instanceof InterfaceC1439v0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objV instanceof B) {
            throw ((B) objV).f10115a;
        }
        return H0.h(objV);
    }

    public boolean Q() {
        return true;
    }

    public boolean R() {
        return false;
    }

    public A0 T() {
        InterfaceC1434t interfaceC1434tU = U();
        if (interfaceC1434tU != null) {
            return interfaceC1434tU.getParent();
        }
        return null;
    }

    public final InterfaceC1434t U() {
        return (InterfaceC1434t) f10122h.get(this);
    }

    public final Object V() {
        return f10121g.get(this);
    }

    @Override // n7.j
    public n7.j X(n7.j jVar) {
        return A0.a.e(this, jVar);
    }

    protected boolean a0(Throwable th) {
        return false;
    }

    protected final void c0(A0 a02) {
        if (a02 == null) {
            B0(N0.f10147g);
            return;
        }
        a02.start();
        InterfaceC1434t interfaceC1434tA = a02.A(this);
        B0(interfaceC1434tA);
        if (isCompleted()) {
            interfaceC1434tA.dispose();
            B0(N0.f10147g);
        }
    }

    @Override // R8.A0
    public boolean d() {
        Object objV = V();
        return (objV instanceof InterfaceC1439v0) && ((InterfaceC1439v0) objV).d();
    }

    @Override // R8.InterfaceC1438v
    public final void d0(P0 p02) throws Throwable {
        y(p02);
    }

    @Override // n7.j.b, n7.j
    public j.b e(j.c cVar) {
        return A0.a.c(this, cVar);
    }

    public final InterfaceC1408f0 e0(boolean z10, F0 f02) {
        boolean z11;
        boolean zB;
        f02.x(this);
        while (true) {
            Object objV = V();
            z11 = true;
            if (!(objV instanceof C1414i0)) {
                if (!(objV instanceof InterfaceC1439v0)) {
                    z11 = false;
                    break;
                }
                InterfaceC1439v0 interfaceC1439v0 = (InterfaceC1439v0) objV;
                L0 l0A = interfaceC1439v0.a();
                if (l0A == null) {
                    AbstractC2855l.e(objV, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    x0((F0) objV);
                } else {
                    if (f02.v()) {
                        c cVar = interfaceC1439v0 instanceof c ? (c) interfaceC1439v0 : null;
                        Throwable thF = cVar != null ? cVar.f() : null;
                        if (thF != null) {
                            if (z10) {
                                f02.w(thF);
                            }
                            return N0.f10147g;
                        }
                        zB = l0A.b(f02, 5);
                    } else {
                        zB = l0A.b(f02, 1);
                    }
                    if (zB) {
                        break;
                    }
                }
            } else {
                C1414i0 c1414i0 = (C1414i0) objV;
                if (!c1414i0.d()) {
                    v0(c1414i0);
                } else if (androidx.concurrent.futures.b.a(f10121g, this, objV, f02)) {
                    break;
                }
            }
        }
        if (z11) {
            return f02;
        }
        if (z10) {
            Object objV2 = V();
            B b10 = objV2 instanceof B ? (B) objV2 : null;
            f02.w(b10 != null ? b10.f10115a : null);
        }
        return N0.f10147g;
    }

    protected boolean f0() {
        return false;
    }

    @Override // R8.A0
    public final InterfaceC1408f0 g0(Function1 function1) {
        return e0(true, new C1447z0(function1));
    }

    @Override // n7.j.b
    public final j.c getKey() {
        return A0.f10112c;
    }

    public final boolean i0(Object obj) {
        Object objJ0;
        do {
            objJ0 = J0(V(), obj);
            if (objJ0 == H0.f10132a) {
                return false;
            }
            if (objJ0 == H0.f10133b) {
                return true;
            }
        } while (objJ0 == H0.f10134c);
        u(objJ0);
        return true;
    }

    public final boolean isCancelled() {
        Object objV = V();
        if (objV instanceof B) {
            return true;
        }
        return (objV instanceof c) && ((c) objV).j();
    }

    @Override // R8.A0
    public final boolean isCompleted() {
        return !(V() instanceof InterfaceC1439v0);
    }

    public final Object j0(Object obj) {
        Object objJ0;
        do {
            objJ0 = J0(V(), obj);
            if (objJ0 == H0.f10132a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, O(obj));
            }
        } while (objJ0 == H0.f10134c);
        return objJ0;
    }

    @Override // R8.A0
    public void k(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new B0(E(), null, this);
        }
        z(cancellationException);
    }

    public String m0() {
        return S.a(this);
    }

    @Override // R8.A0
    public final boolean start() {
        int iC0;
        do {
            iC0 = C0(V());
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    @Override // R8.P0
    public CancellationException t0() {
        Throwable thF;
        Object objV = V();
        if (objV instanceof c) {
            thF = ((c) objV).f();
        } else if (objV instanceof B) {
            thF = ((B) objV).f10115a;
        } else {
            if (objV instanceof InterfaceC1439v0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objV).toString());
            }
            thF = null;
        }
        CancellationException cancellationException = thF instanceof CancellationException ? (CancellationException) thF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new B0("Parent job is " + D0(objV), thF, this);
    }

    public String toString() {
        return G0() + '@' + S.b(this);
    }

    @Override // n7.j
    public Object u0(Object obj, Function2 function2) {
        return A0.a.b(this, obj, function2);
    }

    protected final Object v(n7.f fVar) throws Throwable {
        Object objV;
        do {
            objV = V();
            if (!(objV instanceof InterfaceC1439v0)) {
                if (objV instanceof B) {
                    throw ((B) objV).f10115a;
                }
                return H0.h(objV);
            }
        } while (C0(objV) < 0);
        return w(fVar);
    }

    public final boolean x(Throwable th) {
        return y(th);
    }

    public final boolean y(Object obj) throws Throwable {
        Object objH0 = H0.f10132a;
        if (R() && (objH0 = C(obj)) == H0.f10133b) {
            return true;
        }
        if (objH0 == H0.f10132a) {
            objH0 = h0(obj);
        }
        if (objH0 == H0.f10132a || objH0 == H0.f10133b) {
            return true;
        }
        if (objH0 == H0.f10135d) {
            return false;
        }
        u(objH0);
        return true;
    }

    @Override // n7.j
    public n7.j y0(j.c cVar) {
        return A0.a.d(this, cVar);
    }

    public void z(Throwable th) throws Throwable {
        y(th);
    }

    public final void z0(F0 f02) {
        Object objV;
        do {
            objV = V();
            if (!(objV instanceof F0)) {
                if (!(objV instanceof InterfaceC1439v0) || ((InterfaceC1439v0) objV).a() == null) {
                    return;
                }
                f02.r();
                return;
            }
            if (objV != f02) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f10121g, this, objV, H0.f10138g));
    }

    protected void s0() {
    }

    public void b0(Throwable th) throws Throwable {
        throw th;
    }

    protected void q0(Throwable th) {
    }

    protected void r0(Object obj) {
    }

    protected void u(Object obj) {
    }
}
