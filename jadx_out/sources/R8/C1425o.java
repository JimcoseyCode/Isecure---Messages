package R8;

import R8.InterfaceC1419l;
import W8.C1506i;
import i7.C2735B;
import i7.C2742e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: R8.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1425o extends AbstractC1400b0 implements InterfaceC1421m, kotlin.coroutines.jvm.internal.e, d1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10209l = AtomicIntegerFieldUpdater.newUpdater(C1425o.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10210m = AtomicReferenceFieldUpdater.newUpdater(C1425o.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10211n = AtomicReferenceFieldUpdater.newUpdater(C1425o.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n7.f f10212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n7.j f10213k;

    public C1425o(n7.f fVar, int i10) {
        super(i10);
        this.f10212j = fVar;
        this.f10213k = fVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1403d.f10174a;
    }

    private final String B() {
        Object objA = A();
        return objA instanceof O0 ? "Active" : objA instanceof r ? "Cancelled" : "Completed";
    }

    private final InterfaceC1408f0 G() {
        A0 a02 = (A0) getContext().e(A0.f10112c);
        if (a02 == null) {
            return null;
        }
        InterfaceC1408f0 interfaceC1408f0J = E0.j(a02, false, new C1432s(this), 1, null);
        androidx.concurrent.futures.b.a(f10211n, this, null, interfaceC1408f0J);
        return interfaceC1408f0J;
    }

    private final void H(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10210m;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C1403d) {
                if (androidx.concurrent.futures.b.a(f10210m, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC1419l) || (obj2 instanceof W8.B)) {
                K(obj, obj2);
            } else {
                if (obj2 instanceof B) {
                    B b10 = (B) obj2;
                    if (!b10.c()) {
                        K(obj, obj2);
                    }
                    if (obj2 instanceof r) {
                        Throwable th = b10.f10115a;
                        if (obj instanceof InterfaceC1419l) {
                            p((InterfaceC1419l) obj, th);
                            return;
                        } else {
                            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            s((W8.B) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof A) {
                    A a10 = (A) obj2;
                    if (a10.f10108b != null) {
                        K(obj, obj2);
                    }
                    if (obj instanceof W8.B) {
                        return;
                    }
                    AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC1419l interfaceC1419l = (InterfaceC1419l) obj;
                    if (a10.c()) {
                        p(interfaceC1419l, a10.f10111e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f10210m, this, obj2, A.b(a10, null, interfaceC1419l, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof W8.B) {
                        return;
                    }
                    AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f10210m, this, obj2, new A(obj2, (InterfaceC1419l) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean J() {
        if (!AbstractC1402c0.c(this.f10171i)) {
            return false;
        }
        n7.f fVar = this.f10212j;
        AbstractC2855l.e(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1506i) fVar).t();
    }

    private final void K(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B Q(Function1 function1, Throwable th, Object obj, n7.j jVar) {
        function1.invoke(th);
        return C2735B.f28704a;
    }

    public static /* synthetic */ void S(C1425o c1425o, Object obj, int i10, w7.o oVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            oVar = null;
        }
        c1425o.R(obj, i10, oVar);
    }

    private final Object T(O0 o02, Object obj, int i10, w7.o oVar, Object obj2) {
        if (obj instanceof B) {
            return obj;
        }
        if ((AbstractC1402c0.b(i10) || obj2 != null) && !(oVar == null && !(o02 instanceof InterfaceC1419l) && obj2 == null)) {
            return new A(obj, o02 instanceof InterfaceC1419l ? (InterfaceC1419l) o02 : null, oVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean U() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10209l;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f10209l.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final W8.E V(Object obj, Object obj2, w7.o oVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10210m;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof O0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof A) && obj4 != null && ((A) obj3).f10110d == obj4) {
                    return AbstractC1427p.f10214a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            w7.o oVar2 = oVar;
            if (androidx.concurrent.futures.b.a(f10210m, this, obj3, T((O0) obj3, obj5, this.f10171i, oVar2, obj6))) {
                v();
                return AbstractC1427p.f10214a;
            }
            obj = obj5;
            oVar = oVar2;
            obj2 = obj6;
        }
    }

    private final boolean W() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10209l;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f10209l.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void s(W8.B b10, Throwable th) {
        int i10 = f10209l.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            b10.s(i10, th, getContext());
        } catch (Throwable th2) {
            L.a(getContext(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean t(Throwable th) {
        if (!J()) {
            return false;
        }
        n7.f fVar = this.f10212j;
        AbstractC2855l.e(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1506i) fVar).u(th);
    }

    private final void v() {
        if (J()) {
            return;
        }
        u();
    }

    private final void w(int i10) {
        if (U()) {
            return;
        }
        AbstractC1402c0.a(this, i10);
    }

    private final InterfaceC1408f0 y() {
        return (InterfaceC1408f0) f10211n.get(this);
    }

    public final Object A() {
        return f10210m.get(this);
    }

    public void F() {
        InterfaceC1408f0 interfaceC1408f0G = G();
        if (interfaceC1408f0G != null && isCompleted()) {
            interfaceC1408f0G.dispose();
            f10211n.set(this, N0.f10147g);
        }
    }

    public final void I(InterfaceC1419l interfaceC1419l) {
        H(interfaceC1419l);
    }

    protected String L() {
        return "CancellableContinuation";
    }

    public final void M(Throwable th) {
        if (t(th)) {
            return;
        }
        n(th);
        v();
    }

    public final void N() {
        Throwable thW;
        n7.f fVar = this.f10212j;
        C1506i c1506i = fVar instanceof C1506i ? (C1506i) fVar : null;
        if (c1506i == null || (thW = c1506i.w(this)) == null) {
            return;
        }
        u();
        n(thW);
    }

    public final boolean O() {
        Object obj = f10210m.get(this);
        if ((obj instanceof A) && ((A) obj).f10110d != null) {
            u();
            return false;
        }
        f10209l.set(this, 536870911);
        f10210m.set(this, C1403d.f10174a);
        return true;
    }

    public void P(Object obj, final Function1 function1) {
        R(obj, this.f10171i, function1 != null ? new w7.o() { // from class: R8.n
            @Override // w7.o
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return C1425o.Q(function1, (Throwable) obj2, obj3, (n7.j) obj4);
            }
        } : null);
    }

    public final void R(Object obj, int i10, w7.o oVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10210m;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof O0)) {
                Object obj3 = obj;
                w7.o oVar2 = oVar;
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.e()) {
                        if (oVar2 != null) {
                            r(oVar2, rVar.f10115a, obj3);
                            return;
                        }
                        return;
                    }
                }
                m(obj3);
                throw new C2742e();
            }
            Object obj4 = obj;
            int i11 = i10;
            w7.o oVar3 = oVar;
            if (androidx.concurrent.futures.b.a(f10210m, this, obj2, T((O0) obj2, obj4, i11, oVar3, null))) {
                v();
                w(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                oVar = oVar3;
            }
        }
    }

    @Override // R8.AbstractC1400b0
    public void a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10210m;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof O0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof B) {
                return;
            }
            if (obj2 instanceof A) {
                A a10 = (A) obj2;
                if (a10.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (androidx.concurrent.futures.b.a(f10210m, this, obj2, A.b(a10, null, null, null, null, th3, 15, null))) {
                    a10.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (androidx.concurrent.futures.b.a(f10210m, this, obj2, new A(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // R8.d1
    public void b(W8.B b10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10209l;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        H(b10);
    }

    @Override // R8.AbstractC1400b0
    public final n7.f c() {
        return this.f10212j;
    }

    @Override // R8.InterfaceC1421m
    public boolean d() {
        return A() instanceof O0;
    }

    @Override // R8.AbstractC1400b0
    public Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // R8.InterfaceC1421m
    public void f(Object obj, w7.o oVar) {
        R(obj, this.f10171i, oVar);
    }

    @Override // R8.InterfaceC1421m
    public void g(Function1 function1) {
        AbstractC1429q.c(this, new InterfaceC1419l.a(function1));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n7.f fVar = this.f10212j;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // n7.f
    public n7.j getContext() {
        return this.f10213k;
    }

    @Override // R8.AbstractC1400b0
    public Object h(Object obj) {
        return obj instanceof A ? ((A) obj).f10107a : obj;
    }

    @Override // R8.InterfaceC1421m
    public boolean isCancelled() {
        return A() instanceof r;
    }

    @Override // R8.InterfaceC1421m
    public boolean isCompleted() {
        return !(A() instanceof O0);
    }

    @Override // R8.InterfaceC1421m
    public Object j(Throwable th) {
        return V(new B(th, false, 2, null), null, null);
    }

    @Override // R8.AbstractC1400b0
    public Object k() {
        return A();
    }

    @Override // R8.InterfaceC1421m
    public boolean n(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10210m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof O0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f10210m, this, obj, new r(this, th, (obj instanceof InterfaceC1419l) || (obj instanceof W8.B))));
        O0 o02 = (O0) obj;
        if (o02 instanceof InterfaceC1419l) {
            p((InterfaceC1419l) obj, th);
        } else if (o02 instanceof W8.B) {
            s((W8.B) obj, th);
        }
        v();
        w(this.f10171i);
        return true;
    }

    @Override // R8.InterfaceC1421m
    public Object o(Object obj, Object obj2, w7.o oVar) {
        return V(obj, obj2, oVar);
    }

    public final void p(InterfaceC1419l interfaceC1419l, Throwable th) {
        try {
            interfaceC1419l.a(th);
        } catch (Throwable th2) {
            L.a(getContext(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // R8.InterfaceC1421m
    public void q(Object obj) {
        w(this.f10171i);
    }

    public final void r(w7.o oVar, Throwable th, Object obj) {
        try {
            oVar.invoke(th, obj, getContext());
        } catch (Throwable th2) {
            L.a(getContext(), new C("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // n7.f
    public void resumeWith(Object obj) {
        S(this, D.c(obj, this), this.f10171i, null, 4, null);
    }

    public String toString() {
        return L() + '(' + S.c(this.f10212j) + "){" + B() + "}@" + S.b(this);
    }

    public final void u() {
        InterfaceC1408f0 interfaceC1408f0Y = y();
        if (interfaceC1408f0Y == null) {
            return;
        }
        interfaceC1408f0Y.dispose();
        f10211n.set(this, N0.f10147g);
    }

    public Throwable x(A0 a02) {
        return a02.M();
    }

    public final Object z() {
        A0 a02;
        boolean zJ = J();
        if (W()) {
            if (y() == null) {
                G();
            }
            if (zJ) {
                N();
            }
            return AbstractC3016b.e();
        }
        if (zJ) {
            N();
        }
        Object objA = A();
        if (objA instanceof B) {
            throw ((B) objA).f10115a;
        }
        if (!AbstractC1402c0.b(this.f10171i) || (a02 = (A0) getContext().e(A0.f10112c)) == null || a02.d()) {
            return h(objA);
        }
        CancellationException cancellationExceptionM = a02.M();
        a(objA, cancellationExceptionM);
        throw cancellationExceptionM;
    }
}
