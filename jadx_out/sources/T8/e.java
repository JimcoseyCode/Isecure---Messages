package T8;

import R8.AbstractC1429q;
import R8.C1425o;
import R8.InterfaceC1421m;
import R8.d1;
import W8.AbstractC1499b;
import W8.AbstractC1500c;
import W8.AbstractC1508k;
import W8.B;
import W8.C;
import W8.D;
import W8.Q;
import i7.AbstractC2738a;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class e implements g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10656j = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10657k = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10658l = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10659m = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10660n = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10661o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10662p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10663q = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10664r = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f10665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f10666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w7.o f10667i;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a implements i, d1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object f10668g = f.f10686p;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private C1425o f10669h;

        public a() {
        }

        private final Object f(m mVar, int i10, long j10, n7.f fVar) throws Throwable {
            Boolean boolA;
            Function1 function1;
            m mVarO;
            e eVar = e.this;
            C1425o c1425oB = AbstractC1429q.b(AbstractC3016b.c(fVar));
            try {
                this.f10669h = c1425oB;
                try {
                    Object objV0 = eVar.V0(mVar, i10, j10, this);
                    if (objV0 == f.f10683m) {
                        eVar.F0(this, mVar, i10);
                    } else {
                        w7.o oVarB = null;
                        if (objV0 == f.f10685o) {
                            if (j10 < eVar.d0()) {
                                mVar.c();
                            }
                            m mVar2 = (m) e.X().get(eVar);
                            while (true) {
                                if (eVar.l0()) {
                                    h();
                                    break;
                                }
                                long andIncrement = e.Y().getAndIncrement(eVar);
                                int i11 = f.f10672b;
                                long j11 = andIncrement / ((long) i11);
                                int i12 = (int) (andIncrement % ((long) i11));
                                if (mVar2.f12154c != j11) {
                                    mVarO = eVar.O(j11, mVar2);
                                    if (mVarO == null) {
                                    }
                                } else {
                                    mVarO = mVar2;
                                }
                                objV0 = eVar.V0(mVarO, i12, andIncrement, this);
                                if (objV0 == f.f10683m) {
                                    eVar.F0(this, mVarO, i12);
                                    break;
                                }
                                if (objV0 == f.f10685o) {
                                    if (andIncrement < eVar.d0()) {
                                        mVarO.c();
                                    }
                                    mVar2 = mVarO;
                                } else {
                                    if (objV0 == f.f10684n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    mVarO.c();
                                    this.f10668g = objV0;
                                    this.f10669h = null;
                                    boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                    function1 = eVar.f10666h;
                                    if (function1 != null) {
                                    }
                                }
                            }
                            c1425oB.f(boolA, oVarB);
                        } else {
                            mVar.c();
                            this.f10668g = objV0;
                            this.f10669h = null;
                            boolA = kotlin.coroutines.jvm.internal.b.a(true);
                            function1 = eVar.f10666h;
                            if (function1 != null) {
                                oVarB = eVar.B(function1, objV0);
                            }
                            c1425oB.f(boolA, oVarB);
                        }
                    }
                    Object objZ = c1425oB.z();
                    if (objZ == AbstractC3016b.e()) {
                        kotlin.coroutines.jvm.internal.h.c(fVar);
                    }
                    return objZ;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    c1425oB.N();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final boolean g() throws Throwable {
            this.f10668g = f.z();
            Throwable thT = e.this.T();
            if (thT == null) {
                return false;
            }
            throw D.a(thT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C1425o c1425o = this.f10669h;
            AbstractC2855l.d(c1425o);
            this.f10669h = null;
            this.f10668g = f.z();
            Throwable thT = e.this.T();
            if (thT == null) {
                C2752o.a aVar = C2752o.f28721h;
                c1425o.resumeWith(C2752o.b(Boolean.FALSE));
            } else {
                C2752o.a aVar2 = C2752o.f28721h;
                c1425o.resumeWith(C2752o.b(AbstractC2753p.a(thT)));
            }
        }

        @Override // T8.i
        public Object a(n7.f fVar) throws Throwable {
            m mVarO;
            boolean zG = true;
            if (this.f10668g == f.f10686p || this.f10668g == f.z()) {
                e eVar = e.this;
                m mVar = (m) e.X().get(eVar);
                while (!eVar.l0()) {
                    long andIncrement = e.Y().getAndIncrement(eVar);
                    int i10 = f.f10672b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (mVar.f12154c != j10) {
                        mVarO = eVar.O(j10, mVar);
                        if (mVarO == null) {
                            continue;
                        }
                    } else {
                        mVarO = mVar;
                    }
                    Object objV0 = eVar.V0(mVarO, i11, andIncrement, null);
                    if (objV0 == f.f10683m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objV0 == f.f10685o) {
                        if (andIncrement < eVar.d0()) {
                            mVarO.c();
                        }
                        mVar = mVarO;
                    } else {
                        if (objV0 == f.f10684n) {
                            return f(mVarO, i11, andIncrement, fVar);
                        }
                        mVarO.c();
                        this.f10668g = objV0;
                    }
                }
                zG = g();
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        @Override // R8.d1
        public void b(B b10, int i10) {
            C1425o c1425o = this.f10669h;
            if (c1425o != null) {
                c1425o.b(b10, i10);
            }
        }

        public final boolean i(Object obj) {
            C1425o c1425o = this.f10669h;
            AbstractC2855l.d(c1425o);
            this.f10669h = null;
            this.f10668g = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            Function1 function1 = eVar.f10666h;
            return f.B(c1425o, bool, function1 != null ? eVar.B(function1, obj) : null);
        }

        public final void j() {
            C1425o c1425o = this.f10669h;
            AbstractC2855l.d(c1425o);
            this.f10669h = null;
            this.f10668g = f.z();
            Throwable thT = e.this.T();
            if (thT == null) {
                C2752o.a aVar = C2752o.f28721h;
                c1425o.resumeWith(C2752o.b(Boolean.FALSE));
            } else {
                C2752o.a aVar2 = C2752o.f28721h;
                c1425o.resumeWith(C2752o.b(AbstractC2753p.a(thT)));
            }
        }

        @Override // T8.i
        public Object next() throws Throwable {
            Object obj = this.f10668g;
            if (obj == f.f10686p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f10668g = f.f10686p;
            if (obj != f.z()) {
                return obj;
            }
            throw D.a(e.this.W());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2853j implements w7.o {
        b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // w7.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            j((Throwable) obj, obj2, (n7.j) obj3);
            return C2735B.f28704a;
        }

        public final void j(Throwable th, Object obj, n7.j jVar) {
            ((e) this.receiver).w0(th, obj, jVar);
        }
    }

    public e(int i10, Function1 function1) {
        this.f10665g = i10;
        this.f10666h = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = R();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (q0()) {
            mVar = f.f10671a;
            AbstractC2855l.e(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.f10667i = function1 != null ? new w7.o() { // from class: T8.b
            @Override // w7.o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                e eVar = this.f10651g;
                android.support.v4.media.session.b.a(obj);
                return e.D0(eVar, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = f.f10689s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7.g A(Function1 function1) {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(Object obj, InterfaceC1421m interfaceC1421m) {
        Function1 function1 = this.f10666h;
        if (function1 != null) {
            W8.x.a(function1, obj, interfaceC1421m.getContext());
        }
        Throwable thA0 = a0();
        C2752o.a aVar = C2752o.f28721h;
        interfaceC1421m.resumeWith(C2752o.b(AbstractC2753p.a(thA0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w7.o B(final Function1 function1, final Object obj) {
        return new w7.o() { // from class: T8.d
            @Override // w7.o
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return e.C(function1, obj, (Throwable) obj2, obj3, (n7.j) obj4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B C(Function1 function1, Object obj, Throwable th, Object obj2, n7.j jVar) {
        W8.x.a(function1, obj, jVar);
        return C2735B.f28704a;
    }

    private final boolean D(long j10) {
        return j10 < R() || j10 < Z() + ((long) this.f10665g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w7.o D0(final e eVar, final Z8.a aVar, Object obj, final Object obj2) {
        return new w7.o(obj2, eVar, aVar) { // from class: T8.c

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Object f10652g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ e f10653h;

            @Override // w7.o
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.E0(this.f10652g, this.f10653h, null, (Throwable) obj3, obj4, (n7.j) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B E0(Object obj, e eVar, Z8.a aVar, Throwable th, Object obj2, n7.j jVar) {
        if (obj != f.z()) {
            W8.x.a(eVar.f10666h, obj, aVar.getContext());
        }
        return C2735B.f28704a;
    }

    private final void F(m mVar, long j10) {
        Object objB = AbstractC1508k.b(null, 1, null);
        loop0: while (mVar != null) {
            for (int i10 = f.f10672b - 1; -1 < i10; i10--) {
                if ((mVar.f12154c * ((long) f.f10672b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = mVar.B(i10);
                    if (objB2 != null && objB2 != f.f10675e) {
                        if (!(objB2 instanceof x)) {
                            if (!(objB2 instanceof d1)) {
                                break;
                            }
                            if (mVar.v(i10, objB2, f.z())) {
                                objB = AbstractC1508k.c(objB, objB2);
                                mVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (mVar.v(i10, objB2, f.z())) {
                                objB = AbstractC1508k.c(objB, ((x) objB2).f10702a);
                                mVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar.v(i10, objB2, f.z())) {
                            mVar.t();
                            break;
                        }
                    }
                }
            }
            mVar = (m) mVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                K0((d1) objB);
                return;
            }
            AbstractC2855l.e(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                K0((d1) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(d1 d1Var, m mVar, int i10) {
        C0();
        d1Var.b(mVar, i10);
    }

    private final m G() {
        Object obj = f10662p.get(this);
        m mVar = (m) f10660n.get(this);
        if (mVar.f12154c > ((m) obj).f12154c) {
            obj = mVar;
        }
        m mVar2 = (m) f10661o.get(this);
        if (mVar2.f12154c > ((m) obj).f12154c) {
            obj = mVar2;
        }
        return (m) AbstractC1499b.b((AbstractC1500c) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(d1 d1Var, m mVar, int i10) {
        d1Var.b(mVar, i10 + f.f10672b);
    }

    static /* synthetic */ Object H0(e eVar, n7.f fVar) throws Throwable {
        m mVar;
        m mVar2 = (m) X().get(eVar);
        while (!eVar.l0()) {
            long andIncrement = Y().getAndIncrement(eVar);
            int i10 = f.f10672b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar2.f12154c != j10) {
                m mVarO = eVar.O(j10, mVar2);
                if (mVarO == null) {
                    continue;
                } else {
                    mVar = mVarO;
                }
            } else {
                mVar = mVar2;
            }
            e eVar2 = eVar;
            Object objV0 = eVar2.V0(mVar, i11, andIncrement, null);
            if (objV0 == f.f10683m) {
                throw new IllegalStateException("unexpected");
            }
            if (objV0 != f.f10685o) {
                if (objV0 == f.f10684n) {
                    return eVar2.I0(mVar, i11, andIncrement, fVar);
                }
                mVar.c();
                return objV0;
            }
            if (andIncrement < eVar2.d0()) {
                mVar.c();
            }
            eVar = eVar2;
            mVar2 = mVar;
        }
        throw D.a(eVar.W());
    }

    private final void I(long j10) {
        J0(J(j10));
    }

    private final Object I0(m mVar, int i10, long j10, n7.f fVar) {
        m mVar2;
        C1425o c1425oB = AbstractC1429q.b(AbstractC3016b.c(fVar));
        try {
            Object objV0 = V0(mVar, i10, j10, c1425oB);
            if (objV0 == f.f10683m) {
                F0(c1425oB, mVar, i10);
            } else {
                C7.g gVarA = null;
                gVarA = null;
                if (objV0 == f.f10685o) {
                    if (j10 < d0()) {
                        mVar.c();
                    }
                    m mVar3 = (m) X().get(this);
                    while (true) {
                        if (l0()) {
                            y0(c1425oB);
                            break;
                        }
                        long andIncrement = Y().getAndIncrement(this);
                        int i11 = f.f10672b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (mVar3.f12154c != j11) {
                            m mVarO = O(j11, mVar3);
                            if (mVarO != null) {
                                mVar2 = mVarO;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        objV0 = V0(mVar2, i12, andIncrement, c1425oB);
                        m mVar4 = mVar2;
                        if (objV0 == f.f10683m) {
                            C1425o c1425o = c1425oB != null ? c1425oB : null;
                            if (c1425o != null) {
                                F0(c1425o, mVar4, i12);
                            }
                        } else if (objV0 == f.f10685o) {
                            if (andIncrement < d0()) {
                                mVar4.c();
                            }
                            mVar3 = mVar4;
                        } else {
                            if (objV0 == f.f10684n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar4.c();
                            Function1 function1 = this.f10666h;
                            if (function1 != null) {
                                gVarA = A(function1);
                            }
                        }
                    }
                } else {
                    mVar.c();
                    Function1 function12 = this.f10666h;
                    if (function12 != null) {
                        gVarA = A(function12);
                    }
                }
                c1425oB.f(objV0, (w7.o) gVarA);
            }
            Object objZ = c1425oB.z();
            if (objZ == AbstractC3016b.e()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objZ;
        } catch (Throwable th) {
            c1425oB.N();
            throw th;
        }
    }

    private final m J(long j10) {
        m mVarG = G();
        if (p0()) {
            long jR0 = r0(mVarG);
            if (jR0 != -1) {
                L(jR0);
            }
        }
        F(mVarG, j10);
        return mVarG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (T8.m) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void J0(m mVar) {
        Function1 function1 = this.f10666h;
        Q qB = null;
        Object objB = AbstractC1508k.b(null, 1, null);
        loop0: do {
            int i10 = f.f10672b - 1;
            while (true) {
                if (-1 >= i10) {
                    break;
                }
                long j10 = (mVar.f12154c * ((long) f.f10672b)) + ((long) i10);
                while (true) {
                    Object objB2 = mVar.B(i10);
                    if (objB2 == f.f10679i) {
                        break loop0;
                    }
                    if (objB2 != f.f10674d) {
                        if (objB2 != f.f10675e && objB2 != null) {
                            if (!(objB2 instanceof d1) && !(objB2 instanceof x)) {
                                if (objB2 != f.f10677g && objB2 != f.f10676f) {
                                    if (objB2 != f.f10677g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j10 < Z()) {
                                    break loop0;
                                }
                                d1 d1Var = objB2 instanceof x ? ((x) objB2).f10702a : (d1) objB2;
                                if (mVar.v(i10, objB2, f.z())) {
                                    if (function1 != null) {
                                        qB = W8.x.b(function1, mVar.A(i10), qB);
                                    }
                                    objB = AbstractC1508k.c(objB, d1Var);
                                    mVar.w(i10);
                                    mVar.t();
                                }
                            }
                        } else {
                            if (mVar.v(i10, objB2, f.z())) {
                                mVar.t();
                                break;
                            }
                        }
                    } else {
                        if (j10 < Z()) {
                            break loop0;
                        }
                        if (mVar.v(i10, objB2, f.z())) {
                            if (function1 != null) {
                                qB = W8.x.b(function1, mVar.A(i10), qB);
                            }
                            mVar.w(i10);
                            mVar.t();
                        }
                    }
                }
                i10--;
            }
        } while (mVar != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                AbstractC2855l.e(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    L0((d1) arrayList.get(size));
                }
            } else {
                L0((d1) objB);
            }
        }
        if (qB != null) {
            throw qB;
        }
    }

    private final void K() {
        n0();
    }

    private final void K0(d1 d1Var) {
        M0(d1Var, true);
    }

    private final void L0(d1 d1Var) {
        M0(d1Var, false);
    }

    private final void M() {
        if (q0()) {
            return;
        }
        m mVar = (m) f10662p.get(this);
        while (true) {
            long andIncrement = f10658l.getAndIncrement(this);
            int i10 = f.f10672b;
            long j10 = andIncrement / ((long) i10);
            if (d0() <= andIncrement) {
                if (mVar.f12154c < j10 && mVar.f() != null) {
                    v0(j10, mVar);
                }
                h0(this, 0L, 1, null);
                return;
            }
            if (mVar.f12154c != j10) {
                m mVarN = N(j10, mVar, andIncrement);
                if (mVarN == null) {
                    continue;
                } else {
                    mVar = mVarN;
                }
            }
            if (T0(mVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                h0(this, 0L, 1, null);
                return;
            }
            h0(this, 0L, 1, null);
        }
    }

    private final void M0(d1 d1Var, boolean z10) {
        if (d1Var instanceof InterfaceC1421m) {
            n7.f fVar = (n7.f) d1Var;
            C2752o.a aVar = C2752o.f28721h;
            fVar.resumeWith(C2752o.b(AbstractC2753p.a(z10 ? W() : a0())));
        } else {
            if (d1Var instanceof a) {
                ((a) d1Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + d1Var).toString());
        }
    }

    private final m N(long j10, m mVar, long j11) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10662p;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = AbstractC1499b.c(mVar, j10, function2);
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
        if (C.c(objC)) {
            K();
            v0(j10, mVar);
            h0(this, 0L, 1, null);
            return null;
        }
        m mVar2 = (m) C.b(objC);
        if (mVar2.f12154c <= j10) {
            return mVar2;
        }
        long j12 = mVar2.f12154c;
        int i10 = f.f10672b;
        if (f10658l.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            g0((mVar2.f12154c * ((long) i10)) - j11);
        } else {
            h0(this, 0L, 1, null);
        }
        return null;
    }

    static /* synthetic */ Object N0(e eVar, Object obj, n7.f fVar) {
        m mVar;
        m mVar2 = (m) b0().get(eVar);
        while (true) {
            long andIncrement = c0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zO0 = eVar.o0(andIncrement);
            int i10 = f.f10672b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (mVar2.f12154c != j11) {
                m mVarP = eVar.P(j11, mVar2);
                if (mVarP != null) {
                    mVar = mVarP;
                } else if (zO0) {
                    Object objZ0 = eVar.z0(obj, fVar);
                    if (objZ0 == AbstractC3016b.e()) {
                        return objZ0;
                    }
                }
            } else {
                mVar = mVar2;
            }
            e eVar2 = eVar;
            Object obj2 = obj;
            int iX0 = eVar2.X0(mVar, i11, obj2, j10, null, zO0);
            if (iX0 == 0) {
                mVar.c();
                break;
            }
            if (iX0 == 1) {
                break;
            }
            if (iX0 != 2) {
                if (iX0 == 3) {
                    Object objO0 = eVar2.O0(mVar, i11, obj2, j10, fVar);
                    if (objO0 == AbstractC3016b.e()) {
                        return objO0;
                    }
                } else if (iX0 != 4) {
                    if (iX0 == 5) {
                        mVar.c();
                    }
                    eVar = eVar2;
                    mVar2 = mVar;
                    obj = obj2;
                } else {
                    if (j10 < eVar2.Z()) {
                        mVar.c();
                    }
                    Object objZ02 = eVar2.z0(obj2, fVar);
                    if (objZ02 == AbstractC3016b.e()) {
                        return objZ02;
                    }
                }
            } else if (zO0) {
                mVar.t();
                Object objZ03 = eVar2.z0(obj2, fVar);
                if (objZ03 == AbstractC3016b.e()) {
                    return objZ03;
                }
            }
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m O(long j10, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10661o;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = AbstractC1499b.c(mVar, j10, function2);
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
        if (C.c(objC)) {
            K();
            if (mVar.f12154c * ((long) f.f10672b) < d0()) {
                mVar.c();
            }
            return null;
        }
        m mVar2 = (m) C.b(objC);
        if (!q0() && j10 <= R() / ((long) f.f10672b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10662p;
            while (true) {
                B b12 = (B) atomicReferenceFieldUpdater2.get(this);
                if (b12.f12154c >= mVar2.f12154c || !mVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, b12, mVar2)) {
                    if (b12.p()) {
                        b12.n();
                    }
                } else if (mVar2.p()) {
                    mVar2.n();
                }
            }
        }
        long j11 = mVar2.f12154c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f10672b;
        Z0(j11 * ((long) i10));
        if (mVar2.f12154c * ((long) i10) < d0()) {
            mVar2.c();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object O0(m mVar, int i10, Object obj, long j10, n7.f fVar) {
        C2735B c2735b;
        Object objZ;
        m mVarP;
        C1425o c1425oB = AbstractC1429q.b(AbstractC3016b.c(fVar));
        try {
            int iX0 = X0(mVar, i10, obj, j10, c1425oB, false);
            if (iX0 == 0) {
                mVar.c();
                C2752o.a aVar = C2752o.f28721h;
                c2735b = C2735B.f28704a;
            } else {
                if (iX0 != 1) {
                    if (iX0 != 2) {
                        if (iX0 != 4) {
                            String str = "unexpected";
                            if (iX0 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar.c();
                            m mVar2 = (m) b0().get(this);
                            while (true) {
                                long andIncrement = c0().getAndIncrement(this);
                                long j11 = 1152921504606846975L & andIncrement;
                                boolean zO0 = o0(andIncrement);
                                int i11 = f.f10672b;
                                long j12 = j11 / ((long) i11);
                                int i12 = (int) (j11 % ((long) i11));
                                String str2 = str;
                                if (mVar2.f12154c != j12) {
                                    mVarP = P(j12, mVar2);
                                    if (mVarP == null) {
                                        if (zO0) {
                                            break;
                                        }
                                        str = str2;
                                    }
                                } else {
                                    mVarP = mVar2;
                                }
                                int iX02 = X0(mVarP, i12, obj, j11, c1425oB, zO0);
                                if (iX02 == 0) {
                                    mVarP.c();
                                    C2752o.a aVar2 = C2752o.f28721h;
                                    c2735b = C2735B.f28704a;
                                    break;
                                }
                                if (iX02 == 1) {
                                    C2752o.a aVar3 = C2752o.f28721h;
                                    c2735b = C2735B.f28704a;
                                    break;
                                }
                                if (iX02 != 2) {
                                    if (iX02 == 3) {
                                        throw new IllegalStateException(str2);
                                    }
                                    if (iX02 != 4) {
                                        if (iX02 == 5) {
                                            mVarP.c();
                                        }
                                        str = str2;
                                        mVar2 = mVarP;
                                    } else if (j11 < Z()) {
                                        mVarP.c();
                                    }
                                } else if (zO0) {
                                    mVarP.t();
                                } else {
                                    C1425o c1425o = c1425oB != null ? c1425oB : null;
                                    if (c1425o != null) {
                                        G0(c1425o, mVarP, i12);
                                    }
                                }
                            }
                        } else if (j10 < Z()) {
                            mVar.c();
                        }
                        A0(obj, c1425oB);
                    } else {
                        G0(c1425oB, mVar, i10);
                    }
                    objZ = c1425oB.z();
                    if (objZ == AbstractC3016b.e()) {
                        kotlin.coroutines.jvm.internal.h.c(fVar);
                    }
                    return objZ != AbstractC3016b.e() ? objZ : C2735B.f28704a;
                }
                C2752o.a aVar4 = C2752o.f28721h;
                c2735b = C2735B.f28704a;
            }
            c1425oB.resumeWith(C2752o.b(c2735b));
            objZ = c1425oB.z();
            if (objZ == AbstractC3016b.e()) {
            }
            if (objZ != AbstractC3016b.e()) {
            }
        } catch (Throwable th) {
            c1425oB.N();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m P(long j10, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10660n;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = AbstractC1499b.c(mVar, j10, function2);
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
        if (C.c(objC)) {
            K();
            if (mVar.f12154c * ((long) f.f10672b) < Z()) {
                mVar.c();
            }
            return null;
        }
        m mVar2 = (m) C.b(objC);
        long j11 = mVar2.f12154c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f10672b;
        a1(j11 * ((long) i10));
        if (mVar2.f12154c * ((long) i10) < Z()) {
            mVar2.c();
        }
        return null;
    }

    private final boolean P0(long j10) {
        if (o0(j10)) {
            return false;
        }
        return !D(j10 & 1152921504606846975L);
    }

    private final boolean Q0(Object obj, Object obj2) {
        if (obj instanceof a) {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC1421m) {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1421m interfaceC1421m = (InterfaceC1421m) obj;
            Function1 function1 = this.f10666h;
            return f.B(interfaceC1421m, obj2, (w7.o) (function1 != null ? A(function1) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final long R() {
        return f10658l.get(this);
    }

    private final boolean R0(Object obj, m mVar, int i10) {
        if (obj instanceof InterfaceC1421m) {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((InterfaceC1421m) obj, C2735B.f28704a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final boolean T0(m mVar, int i10, long j10) {
        Object objB = mVar.B(i10);
        if (!(objB instanceof d1) || j10 < f10657k.get(this) || !mVar.v(i10, objB, f.f10677g)) {
            return U0(mVar, i10, j10);
        }
        if (R0(objB, mVar, i10)) {
            mVar.F(i10, f.f10674d);
            return true;
        }
        mVar.F(i10, f.f10680j);
        mVar.C(i10, false);
        return false;
    }

    private final boolean U0(m mVar, int i10, long j10) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB instanceof d1) {
                if (j10 < f10657k.get(this)) {
                    if (mVar.v(i10, objB, new x((d1) objB))) {
                        return true;
                    }
                } else if (mVar.v(i10, objB, f.f10677g)) {
                    if (R0(objB, mVar, i10)) {
                        mVar.F(i10, f.f10674d);
                        return true;
                    }
                    mVar.F(i10, f.f10680j);
                    mVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == f.f10680j) {
                    return false;
                }
                if (objB == null) {
                    if (mVar.v(i10, objB, f.f10675e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f10674d || objB == f.f10678h || objB == f.f10679i || objB == f.f10681k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f10676f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object V0(m mVar, int i10, long j10, Object obj) {
        Object objB = mVar.B(i10);
        if (objB == null) {
            if (j10 >= (f10656j.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f10684n;
                }
                if (mVar.v(i10, objB, obj)) {
                    M();
                    return f.f10683m;
                }
            }
        } else if (objB == f.f10674d && mVar.v(i10, objB, f.f10679i)) {
            M();
            return mVar.D(i10);
        }
        return W0(mVar, i10, j10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable W() {
        Throwable thT = T();
        return thT == null ? new p("Channel was closed") : thT;
    }

    private final Object W0(m mVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB == null || objB == f.f10675e) {
                if (j10 < (f10656j.get(this) & 1152921504606846975L)) {
                    if (mVar.v(i10, objB, f.f10678h)) {
                        M();
                        return f.f10685o;
                    }
                } else {
                    if (obj == null) {
                        return f.f10684n;
                    }
                    if (mVar.v(i10, objB, obj)) {
                        M();
                        return f.f10683m;
                    }
                }
            } else {
                if (objB != f.f10674d) {
                    if (objB != f.f10680j && objB != f.f10678h) {
                        if (objB == f.z()) {
                            M();
                            return f.f10685o;
                        }
                        if (objB != f.f10677g && mVar.v(i10, objB, f.f10676f)) {
                            boolean z10 = objB instanceof x;
                            if (z10) {
                                objB = ((x) objB).f10702a;
                            }
                            if (R0(objB, mVar, i10)) {
                                mVar.F(i10, f.f10679i);
                                M();
                                return mVar.D(i10);
                            }
                            mVar.F(i10, f.f10680j);
                            mVar.C(i10, false);
                            if (z10) {
                                M();
                            }
                            return f.f10685o;
                        }
                    }
                    return f.f10685o;
                }
                if (mVar.v(i10, objB, f.f10679i)) {
                    M();
                    return mVar.D(i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater X() {
        return f10661o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int X0(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        mVar.G(i10, obj);
        if (z10) {
            return Y0(mVar, i10, obj, j10, obj2, z10);
        }
        Object objB = mVar.B(i10);
        if (objB == null) {
            if (D(j10)) {
                if (mVar.v(i10, null, f.f10674d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof d1) {
            mVar.w(i10);
            if (Q0(objB, obj)) {
                mVar.F(i10, f.f10679i);
                B0();
                return 0;
            }
            if (mVar.x(i10, f.f10681k) == f.f10681k) {
                return 5;
            }
            mVar.C(i10, true);
            return 5;
        }
        return Y0(mVar, i10, obj, j10, obj2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater Y() {
        return f10657k;
    }

    private final int Y0(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB == null) {
                if (!D(j10) || z10) {
                    if (z10) {
                        if (mVar.v(i10, null, f.f10680j)) {
                            mVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.v(i10, null, f.f10674d)) {
                    return 1;
                }
            } else {
                if (objB != f.f10675e) {
                    if (objB == f.f10681k) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (objB == f.f10678h) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (objB == f.z()) {
                        mVar.w(i10);
                        K();
                        return 4;
                    }
                    mVar.w(i10);
                    if (objB instanceof x) {
                        objB = ((x) objB).f10702a;
                    }
                    if (Q0(objB, obj)) {
                        mVar.F(i10, f.f10679i);
                        B0();
                        return 0;
                    }
                    if (mVar.x(i10, f.f10681k) != f.f10681k) {
                        mVar.C(i10, true);
                    }
                    return 5;
                }
                if (mVar.v(i10, objB, f.f10674d)) {
                    return 1;
                }
            }
        }
    }

    private final void Z0(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10657k;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f10657k.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    private final void a1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10656j;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f10656j.compareAndSet(this, j11, f.w(j12, (int) (j11 >> 60))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater b0() {
        return f10660n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater c0() {
        return f10656j;
    }

    private final void g0(long j10) {
        if ((f10659m.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f10659m.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void h0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.g0(j10);
    }

    private final void i0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10664r;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f10687q : f.f10688r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(T());
    }

    private final boolean j0(m mVar, int i10, long j10) {
        Object objB;
        do {
            objB = mVar.B(i10);
            if (objB != null && objB != f.f10675e) {
                if (objB == f.f10674d) {
                    return true;
                }
                if (objB == f.f10680j || objB == f.z() || objB == f.f10679i || objB == f.f10678h) {
                    return false;
                }
                if (objB == f.f10677g) {
                    return true;
                }
                return objB != f.f10676f && j10 == Z();
            }
        } while (!mVar.v(i10, objB, f.f10678h));
        M();
        return false;
    }

    private final boolean k0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            J(j10 & 1152921504606846975L);
            return (z10 && f0()) ? false : true;
        }
        if (i10 == 3) {
            I(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    private final boolean m0(long j10) {
        return k0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o0(long j10) {
        return k0(j10, false);
    }

    private final boolean q0() {
        long jR = R();
        return jR == 0 || jR == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (T8.m) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long r0(m mVar) {
        do {
            int i10 = f.f10672b;
            while (true) {
                i10--;
                if (-1 >= i10) {
                    break;
                }
                long j10 = (mVar.f12154c * ((long) f.f10672b)) + ((long) i10);
                if (j10 < Z()) {
                    return -1L;
                }
                while (true) {
                    Object objB = mVar.B(i10);
                    if (objB == null || objB == f.f10675e) {
                        if (mVar.v(i10, objB, f.z())) {
                            mVar.t();
                            break;
                        }
                    } else if (objB == f.f10674d) {
                        return j10;
                    }
                }
            }
        } while (mVar != null);
        return -1L;
    }

    private final void s0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10656j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 1)));
    }

    private final void t0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10656j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 3)));
    }

    private final void u0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10656j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = f.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = f.w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void v0(long j10, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.f12154c < j10 && (mVar3 = (m) mVar.f()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.k() || (mVar2 = (m) mVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10662p;
                while (true) {
                    B b10 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b10.f12154c >= mVar.f12154c) {
                        return;
                    }
                    if (!mVar.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b10, mVar)) {
                        if (b10.p()) {
                            b10.n();
                            return;
                        }
                        return;
                    } else if (mVar.p()) {
                        mVar.n();
                    }
                }
            } else {
                mVar = mVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(Throwable th, Object obj, n7.j jVar) {
        Function1 function1 = this.f10666h;
        AbstractC2855l.d(function1);
        W8.x.a(function1, obj, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(InterfaceC1421m interfaceC1421m) {
        C2752o.a aVar = C2752o.f28721h;
        interfaceC1421m.resumeWith(C2752o.b(AbstractC2753p.a(W())));
    }

    private final Object z0(Object obj, n7.f fVar) {
        Q qC;
        C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        Function1 function1 = this.f10666h;
        if (function1 == null || (qC = W8.x.c(function1, obj, null, 2, null)) == null) {
            Throwable thA0 = a0();
            C2752o.a aVar = C2752o.f28721h;
            c1425o.resumeWith(C2752o.b(AbstractC2753p.a(thA0)));
        } else {
            AbstractC2738a.a(qC, a0());
            C2752o.a aVar2 = C2752o.f28721h;
            c1425o.resumeWith(C2752o.b(AbstractC2753p.a(qC)));
        }
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ == AbstractC3016b.e() ? objZ : C2735B.f28704a;
    }

    public boolean E(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return H(th, true);
    }

    protected boolean H(Throwable th, boolean z10) {
        if (z10) {
            s0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f10663q, this, f.f10689s, th);
        if (z10) {
            t0();
        } else {
            u0();
        }
        K();
        x0();
        if (zA) {
            i0();
        }
        return zA;
    }

    protected final void L(long j10) {
        m mVarO;
        Q qC;
        m mVar = (m) f10661o.get(this);
        while (true) {
            long j11 = f10657k.get(this);
            if (j10 < Math.max(((long) this.f10665g) + j11, R())) {
                return;
            }
            if (f10657k.compareAndSet(this, j11, 1 + j11)) {
                int i10 = f.f10672b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (mVar.f12154c != j12) {
                    mVarO = O(j12, mVar);
                    if (mVarO == null) {
                        continue;
                    }
                } else {
                    mVarO = mVar;
                }
                Object objV0 = V0(mVarO, i11, j11, null);
                if (objV0 != f.f10685o) {
                    mVarO.c();
                    Function1 function1 = this.f10666h;
                    if (function1 != null && (qC = W8.x.c(function1, objV0, null, 2, null)) != null) {
                        throw qC;
                    }
                } else if (j11 < d0()) {
                    mVarO.c();
                }
                mVar = mVarO;
            }
        }
    }

    protected final Object S0(Object obj) {
        m mVarP;
        int i10;
        e eVar;
        Object obj2 = f.f10674d;
        m mVar = (m) b0().get(this);
        while (true) {
            long andIncrement = c0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zO0 = o0(andIncrement);
            int i11 = f.f10672b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (mVar.f12154c != j11) {
                mVarP = P(j11, mVar);
                if (mVarP != null) {
                    eVar = this;
                    i10 = i12;
                } else if (zO0) {
                    return k.f10695a.a(a0());
                }
            } else {
                mVarP = mVar;
                i10 = i12;
                eVar = this;
            }
            Object obj3 = obj;
            int iX0 = eVar.X0(mVarP, i10, obj3, j10, obj2, zO0);
            mVar = mVarP;
            if (iX0 == 0) {
                mVar.c();
                return k.f10695a.c(C2735B.f28704a);
            }
            if (iX0 == 1) {
                return k.f10695a.c(C2735B.f28704a);
            }
            if (iX0 == 2) {
                if (zO0) {
                    mVar.t();
                    return k.f10695a.a(a0());
                }
                d1 d1Var = obj2 instanceof d1 ? (d1) obj2 : null;
                if (d1Var != null) {
                    G0(d1Var, mVar, i10);
                }
                L((mVar.f12154c * ((long) i11)) + ((long) i10));
                return k.f10695a.c(C2735B.f28704a);
            }
            if (iX0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iX0 == 4) {
                if (j10 < Z()) {
                    mVar.c();
                }
                return k.f10695a.a(a0());
            }
            if (iX0 == 5) {
                mVar.c();
            }
            obj = obj3;
        }
    }

    protected final Throwable T() {
        return (Throwable) f10663q.get(this);
    }

    public final long Z() {
        return f10657k.get(this);
    }

    @Override // T8.v
    public Object a(n7.f fVar) {
        return H0(this, fVar);
    }

    protected final Throwable a0() {
        Throwable thT = T();
        return thT == null ? new q("Channel was closed") : thT;
    }

    @Override // T8.w
    public Object b(Object obj, n7.f fVar) {
        return N0(this, obj, fVar);
    }

    public final void b1(long j10) {
        e eVar = this;
        if (eVar.q0()) {
            return;
        }
        while (eVar.R() <= j10) {
            eVar = this;
        }
        int i10 = f.f10673c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jR = eVar.R();
            if (jR == (4611686018427387903L & f10659m.get(eVar)) && jR == eVar.R()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10659m;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j11, f.v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jR2 = eVar.R();
            long j12 = f10659m.get(eVar);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (jR2 == j13 && jR2 == eVar.R()) {
                break;
            }
            if (z10) {
                eVar = this;
            } else {
                eVar = this;
                f10659m.compareAndSet(eVar, j12, f.v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10659m;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j14, f.v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    @Override // T8.v
    public Object c() {
        m mVarO;
        long j10 = f10657k.get(this);
        long j11 = f10656j.get(this);
        if (m0(j11)) {
            return k.f10695a.a(T());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.f10695a.b();
        }
        Object obj = f.f10681k;
        m mVar = (m) X().get(this);
        while (!l0()) {
            long andIncrement = Y().getAndIncrement(this);
            int i10 = f.f10672b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar.f12154c != j12) {
                mVarO = O(j12, mVar);
                if (mVarO == null) {
                    continue;
                }
            } else {
                mVarO = mVar;
            }
            Object objV0 = V0(mVarO, i11, andIncrement, obj);
            if (objV0 == f.f10683m) {
                d1 d1Var = obj instanceof d1 ? (d1) obj : null;
                if (d1Var != null) {
                    F0(d1Var, mVarO, i11);
                }
                b1(andIncrement);
                mVarO.t();
                return k.f10695a.b();
            }
            if (objV0 != f.f10685o) {
                if (objV0 == f.f10684n) {
                    throw new IllegalStateException("unexpected");
                }
                mVarO.c();
                return k.f10695a.c(objV0);
            }
            if (andIncrement < d0()) {
                mVarO.c();
            }
            mVar = mVarO;
        }
        return k.f10695a.a(T());
    }

    public final long d0() {
        return f10656j.get(this) & 1152921504606846975L;
    }

    public final boolean f0() {
        while (true) {
            m mVarO = (m) f10661o.get(this);
            long jZ = Z();
            if (d0() <= jZ) {
                return false;
            }
            int i10 = f.f10672b;
            long j10 = jZ / ((long) i10);
            if (mVarO.f12154c == j10 || (mVarO = O(j10, mVarO)) != null) {
                mVarO.c();
                if (j0(mVarO, (int) (jZ % ((long) i10)), jZ)) {
                    return true;
                }
                f10657k.compareAndSet(this, jZ, 1 + jZ);
            } else if (((m) f10661o.get(this)).f12154c < j10) {
                return false;
            }
        }
    }

    @Override // T8.w
    public boolean h(Throwable th) {
        return H(th, false);
    }

    @Override // T8.v
    public i iterator() {
        return new a();
    }

    @Override // T8.v
    public final void k(CancellationException cancellationException) {
        E(cancellationException);
    }

    @Override // T8.w
    public Object l(Object obj) {
        Object obj2;
        int i10;
        m mVar;
        e eVar;
        if (P0(f10656j.get(this))) {
            return k.f10695a.b();
        }
        Object obj3 = f.f10680j;
        m mVar2 = (m) b0().get(this);
        while (true) {
            long andIncrement = c0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zO0 = o0(andIncrement);
            int i11 = f.f10672b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (mVar2.f12154c != j11) {
                m mVarP = P(j11, mVar2);
                if (mVarP != null) {
                    i10 = i12;
                    mVar = mVarP;
                    eVar = this;
                    obj2 = obj;
                } else if (zO0) {
                    return k.f10695a.a(a0());
                }
            } else {
                obj2 = obj;
                i10 = i12;
                mVar = mVar2;
                eVar = this;
            }
            int iX0 = eVar.X0(mVar, i10, obj2, j10, obj3, zO0);
            mVar2 = mVar;
            if (iX0 == 0) {
                mVar2.c();
                return k.f10695a.c(C2735B.f28704a);
            }
            if (iX0 == 1) {
                return k.f10695a.c(C2735B.f28704a);
            }
            if (iX0 == 2) {
                if (zO0) {
                    mVar2.t();
                    return k.f10695a.a(a0());
                }
                d1 d1Var = obj3 instanceof d1 ? (d1) obj3 : null;
                if (d1Var != null) {
                    G0(d1Var, mVar2, i10);
                }
                mVar2.t();
                return k.f10695a.b();
            }
            if (iX0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iX0 == 4) {
                if (j10 < Z()) {
                    mVar2.c();
                }
                return k.f10695a.a(a0());
            }
            if (iX0 == 5) {
                mVar2.c();
            }
            obj = obj2;
        }
    }

    public boolean l0() {
        return m0(f10656j.get(this));
    }

    public boolean n0() {
        return o0(f10656j.get(this));
    }

    protected boolean p0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b3, code lost:
    
        r16 = r7;
        r3 = (T8.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bc, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z10;
        String string;
        StringBuilder sb = new StringBuilder();
        int i10 = (int) (f10656j.get(this) >> 60);
        if (i10 == 2) {
            sb.append("closed,");
        } else if (i10 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f10665g + ',');
        sb.append("data=[");
        int i11 = 0;
        boolean z11 = true;
        List listM = AbstractC2800q.m(f10661o.get(this), f10660n.get(this), f10662p.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((m) obj) != f.f10671a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((m) next).f12154c;
            do {
                Object next2 = it.next();
                long j11 = ((m) next2).f12154c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long jZ = Z();
        long jD0 = d0();
        loop2: while (true) {
            int i12 = f.f10672b;
            int i13 = i11;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                long j12 = (mVar.f12154c * ((long) f.f10672b)) + ((long) i13);
                if (j12 >= jD0 && j12 >= jZ) {
                    break loop2;
                }
                Object objB = mVar.B(i13);
                Object objA = mVar.A(i13);
                boolean z12 = z11;
                if (objB instanceof InterfaceC1421m) {
                    string = (j12 >= jZ || j12 < jD0) ? (j12 >= jD0 || j12 < jZ) ? "cont" : "send" : "receive";
                } else if (objB instanceof x) {
                    string = "EB(" + objB + ')';
                } else if (AbstractC2855l.b(objB, f.f10676f) || AbstractC2855l.b(objB, f.f10677g)) {
                    string = "resuming_sender";
                } else if (objB == null || AbstractC2855l.b(objB, f.f10675e) || AbstractC2855l.b(objB, f.f10679i) || AbstractC2855l.b(objB, f.f10678h) || AbstractC2855l.b(objB, f.f10681k) || AbstractC2855l.b(objB, f.f10680j) || AbstractC2855l.b(objB, f.z())) {
                    i13++;
                    z11 = z12;
                } else {
                    string = objB.toString();
                }
                if (objA != null) {
                    sb.append('(' + string + ',' + objA + "),");
                } else {
                    sb.append(string + ',');
                }
                i13++;
                z11 = z12;
            }
            z11 = z10;
            i11 = 0;
        }
        if (P8.q.g1(sb) == ',') {
            AbstractC2855l.f(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    protected void B0() {
    }

    protected void C0() {
    }

    protected void x0() {
    }
}
