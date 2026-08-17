package a9;

import R8.InterfaceC1421m;
import R8.d1;
import T8.l;
import W8.AbstractC1499b;
import W8.B;
import W8.C;
import i7.C2735B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13699c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f13700d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13701e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f13702f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13703g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f13705b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2853j implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f13706g = new a();

        a() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (k) obj2);
        }

        public final k j(long j10, k kVar) {
            return j.h(j10, kVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2853j implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f13707g = new b();

        b() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (k) obj2);
        }

        public final k j(long j10, k kVar) {
            return j.h(j10, kVar);
        }
    }

    public i(int i10, int i11) {
        this.f13704a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10 - i11;
        this.f13705b = new o() { // from class: a9.h
            @Override // w7.o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return i.o(this.f13698g, (Throwable) obj, (C2735B) obj2, (n7.j) obj3);
            }
        };
    }

    private final boolean f(d1 d1Var) {
        Object objC;
        k kVar = (k) f13701e.get(this);
        long andIncrement = f13702f.getAndIncrement(this);
        a aVar = a.f13706g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13701e;
        long j10 = andIncrement / ((long) j.f13713f);
        loop0: while (true) {
            objC = AbstractC1499b.c(kVar, j10, aVar);
            if (!C.c(objC)) {
                B b10 = C.b(objC);
                while (true) {
                    B b11 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b11.f12154c >= b10.f12154c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                        if (b11.p()) {
                            b11.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) C.b(objC);
        int i10 = (int) (andIncrement % ((long) j.f13713f));
        if (l.a(kVar2.v(), i10, null, d1Var)) {
            d1Var.b(kVar2, i10);
            return true;
        }
        if (!l.a(kVar2.v(), i10, j.f13709b, j.f13710c)) {
            return false;
        }
        if (d1Var instanceof InterfaceC1421m) {
            AbstractC2855l.e(d1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC1421m) d1Var).f(C2735B.f28704a, this.f13705b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + d1Var).toString());
    }

    private final void g() {
        int i10;
        do {
            i10 = f13703g.get(this);
            if (i10 <= this.f13704a) {
                return;
            }
        } while (!f13703g.compareAndSet(this, i10, this.f13704a));
    }

    private final int h() {
        int andDecrement;
        do {
            andDecrement = f13703g.getAndDecrement(this);
        } while (andDecrement > this.f13704a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B o(i iVar, Throwable th, C2735B c2735b, n7.j jVar) {
        iVar.p();
        return C2735B.f28704a;
    }

    private final boolean r(Object obj) {
        if (!(obj instanceof InterfaceC1421m)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1421m interfaceC1421m = (InterfaceC1421m) obj;
        Object objO = interfaceC1421m.o(C2735B.f28704a, null, this.f13705b);
        if (objO == null) {
            return false;
        }
        interfaceC1421m.q(objO);
        return true;
    }

    private final boolean s() {
        Object objC;
        k kVar = (k) f13699c.get(this);
        long andIncrement = f13700d.getAndIncrement(this);
        long j10 = andIncrement / ((long) j.f13713f);
        b bVar = b.f13707g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13699c;
        loop0: while (true) {
            objC = AbstractC1499b.c(kVar, j10, bVar);
            if (C.c(objC)) {
                break;
            }
            B b10 = C.b(objC);
            while (true) {
                B b11 = (B) atomicReferenceFieldUpdater.get(this);
                if (b11.f12154c >= b10.f12154c) {
                    break loop0;
                }
                if (!b10.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                    if (b11.p()) {
                        b11.n();
                    }
                } else if (b10.p()) {
                    b10.n();
                }
            }
        }
        k kVar2 = (k) C.b(objC);
        kVar2.c();
        if (kVar2.f12154c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) j.f13713f));
        Object andSet = kVar2.v().getAndSet(i10, j.f13709b);
        if (andSet != null) {
            if (andSet == j.f13712e) {
                return false;
            }
            return r(andSet);
        }
        int i11 = j.f13708a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (kVar2.v().get(i10) == j.f13710c) {
                return true;
            }
        }
        return !l.a(kVar2.v(), i10, j.f13709b, j.f13711d);
    }

    protected final void e(InterfaceC1421m interfaceC1421m) {
        while (h() <= 0) {
            AbstractC2855l.e(interfaceC1421m, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((d1) interfaceC1421m)) {
                return;
            }
        }
        interfaceC1421m.f(C2735B.f28704a, this.f13705b);
    }

    public final int i() {
        return Math.max(f13703g.get(this), 0);
    }

    public final void p() {
        do {
            int andIncrement = f13703g.getAndIncrement(this);
            if (andIncrement >= this.f13704a) {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f13704a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!s());
    }

    public final boolean q() {
        while (true) {
            int i10 = f13703g.get(this);
            if (i10 > this.f13704a) {
                g();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f13703g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
