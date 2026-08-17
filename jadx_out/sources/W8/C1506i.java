package W8;

import R8.AbstractC1400b0;
import R8.AbstractC1416j0;
import R8.C1425o;
import R8.InterfaceC1421m;
import R8.S;
import R8.V0;
import i7.C2735B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: W8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1506i extends AbstractC1400b0 implements kotlin.coroutines.jvm.internal.e, n7.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12177n = AtomicReferenceFieldUpdater.newUpdater(C1506i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final R8.J f12178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n7.f f12179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f12180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f12181m;

    public C1506i(R8.J j10, n7.f fVar) {
        super(-1);
        this.f12178j = j10;
        this.f12179k = fVar;
        this.f12180l = AbstractC1507j.f12182a;
        this.f12181m = L.g(getContext());
    }

    private final C1425o r() {
        Object obj = f12177n.get(this);
        if (obj instanceof C1425o) {
            return (C1425o) obj;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n7.f fVar = this.f12179k;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // n7.f
    public n7.j getContext() {
        return this.f12179k.getContext();
    }

    @Override // R8.AbstractC1400b0
    public Object k() {
        Object obj = this.f12180l;
        this.f12180l = AbstractC1507j.f12182a;
        return obj;
    }

    public final void l() {
        while (f12177n.get(this) == AbstractC1507j.f12183b) {
        }
    }

    public final C1425o m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12177n;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f12177n.set(this, AbstractC1507j.f12183b);
                return null;
            }
            if (obj instanceof C1425o) {
                if (androidx.concurrent.futures.b.a(f12177n, this, obj, AbstractC1507j.f12183b)) {
                    return (C1425o) obj;
                }
            } else if (obj != AbstractC1507j.f12183b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void p(n7.j jVar, Object obj) {
        this.f12180l = obj;
        this.f10171i = 1;
        this.f12178j.K0(jVar, this);
    }

    @Override // n7.f
    public void resumeWith(Object obj) {
        Object objB = R8.D.b(obj);
        if (AbstractC1507j.d(this.f12178j, getContext())) {
            this.f12180l = objB;
            this.f10171i = 0;
            AbstractC1507j.c(this.f12178j, getContext(), this);
            return;
        }
        AbstractC1416j0 abstractC1416j0B = V0.f10160a.b();
        if (abstractC1416j0B.V0()) {
            this.f12180l = objB;
            this.f10171i = 0;
            abstractC1416j0B.R0(this);
            return;
        }
        abstractC1416j0B.T0(true);
        try {
            n7.j context = getContext();
            Object objI = L.i(context, this.f12181m);
            try {
                this.f12179k.resumeWith(obj);
                C2735B c2735b = C2735B.f28704a;
                while (abstractC1416j0B.Y0()) {
                }
            } finally {
                L.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean t() {
        return f12177n.get(this) != null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f12178j + ", " + S.c(this.f12179k) + ']';
    }

    public final boolean u(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12177n;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            E e10 = AbstractC1507j.f12183b;
            if (AbstractC2855l.b(obj, e10)) {
                if (androidx.concurrent.futures.b.a(f12177n, this, e10, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f12177n, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        l();
        C1425o c1425oR = r();
        if (c1425oR != null) {
            c1425oR.u();
        }
    }

    public final Throwable w(InterfaceC1421m interfaceC1421m) {
        E e10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12177n;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e10 = AbstractC1507j.f12183b;
            if (obj != e10) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f12177n, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f12177n, this, e10, interfaceC1421m));
        return null;
    }

    @Override // R8.AbstractC1400b0
    public n7.f c() {
        return this;
    }
}
