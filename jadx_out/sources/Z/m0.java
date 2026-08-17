package Z;

import F.AbstractC0504q0;
import F.D0;
import F.D1;
import F.E0;
import F.E1;
import F.InterfaceC0490j0;
import F.InterfaceC0515w0;
import F.R0;
import F.S0;
import F.V0;
import F.X0;
import F.k1;
import F.o1;
import F.p1;
import F.v1;
import P.C1364t;
import P.U;
import Z.d0;
import Z.m0;
import Z.x0;
import a0.C1589a;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.concurrent.futures.c;
import f0.AbstractC2590m;
import g0.s0;
import h0.AbstractC2688b;
import i0.C2719g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.InterfaceFutureC2904a;
import y.AbstractC3567L;
import y.AbstractC3583h0;
import y.C3563H;
import y.I0;
import y.InterfaceC3597q;
import y.J0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends J0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final e f13411G = new e();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f13412A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f13413B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private f f13414C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private k1.c f13415D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Map f13416E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final V0.a f13417F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    AbstractC0504q0 f13418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private P.L f13419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    d0 f13420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    k1.b f13421u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    InterfaceFutureC2904a f13422v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private I0 f13423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    x0.a f13424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private P.U f13425y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Rect f13426z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements V0.a {
        a() {
        }

        @Override // F.V0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d0 d0Var) {
            if (d0Var == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            if (m0.this.f13424x == x0.a.INACTIVE) {
                return;
            }
            AbstractC3583h0.a("VideoCapture", "Stream info update: old: " + m0.this.f13420t + " new: " + d0Var);
            m0 m0Var = m0.this;
            d0 d0Var2 = m0Var.f13420t;
            m0Var.f13420t = d0Var;
            o1 o1Var = (o1) H0.g.g(m0Var.g());
            if (m0.this.T0(d0Var2.a(), d0Var.a()) || m0.this.j1(d0Var2, d0Var)) {
                m0.this.V0();
                return;
            }
            if ((d0Var2.a() != -1 && d0Var.a() == -1) || (d0Var2.a() == -1 && d0Var.a() != -1)) {
                m0 m0Var2 = m0.this;
                m0Var2.z0(m0Var2.f13421u, d0Var, o1Var);
                m0 m0Var3 = m0.this;
                m0Var3.d0(AbstractC3567L.a(new Object[]{m0Var3.f13421u.p()}));
                m0.this.L();
                return;
            }
            if (d0Var2.c() != d0Var.c()) {
                m0 m0Var4 = m0.this;
                m0Var4.z0(m0Var4.f13421u, d0Var, o1Var);
                m0 m0Var5 = m0.this;
                m0Var5.d0(AbstractC3567L.a(new Object[]{m0Var5.f13421u.p()}));
                m0.this.N();
            }
        }

        @Override // F.V0.a
        public void onError(Throwable th) {
            AbstractC3583h0.m("VideoCapture", "Receive onError from StreamState observer", th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends F.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f13428a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f13429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.a f13430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.b f13431d;

        b(AtomicBoolean atomicBoolean, c.a aVar, k1.b bVar) {
            this.f13429b = atomicBoolean;
            this.f13430c = aVar;
            this.f13431d = bVar;
        }

        public static /* synthetic */ void e(b bVar, k1.b bVar2) {
            bVar.getClass();
            bVar2.t(bVar);
        }

        @Override // F.r
        public void b(int i10, F.B b10) {
            Object objD;
            super.b(i10, b10);
            if (this.f13428a) {
                this.f13428a = false;
                AbstractC3583h0.a("VideoCapture", "cameraCaptureResult timestampNs = " + b10.a() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.f13429b.get() || (objD = b10.b().d("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) objD).intValue() != this.f13430c.hashCode() || !this.f13430c.c(null) || this.f13429b.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceE = I.c.e();
            final k1.b bVar = this.f13431d;
            scheduledExecutorServiceE.execute(new Runnable() { // from class: Z.n0
                @Override // java.lang.Runnable
                public final void run() {
                    m0.b.e(this.f13454g, bVar);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceFutureC2904a f13433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13434b;

        c(InterfaceFutureC2904a interfaceFutureC2904a, boolean z10) {
            this.f13433a = interfaceFutureC2904a;
            this.f13434b = z10;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            InterfaceFutureC2904a interfaceFutureC2904a = this.f13433a;
            m0 m0Var = m0.this;
            if (interfaceFutureC2904a != m0Var.f13422v || m0Var.f13424x == x0.a.INACTIVE) {
                return;
            }
            m0Var.b1(this.f13434b ? x0.a.ACTIVE_STREAMING : x0.a.ACTIVE_NON_STREAMING);
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            AbstractC3583h0.d("VideoCapture", "Surface update completed with unexpected exception", th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements D1.b, E0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S0 f13436a;

        public d(x0 x0Var) {
            this(f(x0Var));
        }

        private static S0 f(x0 x0Var) {
            S0 s0I0 = S0.i0();
            s0I0.X(C1589a.f13658Q, x0Var);
            return s0I0;
        }

        static d g(InterfaceC0490j0 interfaceC0490j0) {
            return new d(S0.j0(interfaceC0490j0));
        }

        @Override // y.InterfaceC3564I
        public R0 b() {
            return this.f13436a;
        }

        public m0 e() {
            return new m0(c());
        }

        @Override // F.D1.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C1589a c() {
            return new C1589a(X0.h0(this.f13436a));
        }

        public d i(E1.b bVar) {
            b().X(D1.f1303G, bVar);
            return this;
        }

        public d j(C3563H c3563h) {
            b().X(D0.f1296l, c3563h);
            return this;
        }

        public d k(int i10) {
            b().X(E0.f1325p, Integer.valueOf(i10));
            return this;
        }

        public d l(p1 p1Var) {
            b().X(D1.f1307K, p1Var);
            return this;
        }

        public d m(int i10) {
            b().X(D1.f1297A, Integer.valueOf(i10));
            return this;
        }

        public d n(Class cls) {
            b().X(K.q.f7019N, cls);
            if (b().f(K.q.f7018M, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public d o(String str) {
            b().X(K.q.f7018M, str);
            return this;
        }

        @Override // F.E0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public d a(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // F.E0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public d d(int i10) {
            b().X(E0.f1323n, Integer.valueOf(i10));
            return this;
        }

        d r(s0.a aVar) {
            b().X(C1589a.f13659R, aVar);
            return this;
        }

        public d s(boolean z10) {
            b().X(D1.f1305I, Integer.valueOf(z10 ? 2 : 1));
            return this;
        }

        private d(S0 s02) {
            this.f13436a = s02;
            if (!s02.b(C1589a.f13658Q)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) s02.f(K.q.f7019N, null);
            if (cls == null || cls.equals(m0.class)) {
                i(E1.b.VIDEO_CAPTURE);
                n(m0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final p1 f13437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final x0 f13438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final C1589a f13439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final s0.a f13440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Range f13441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final Range f13442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final C3563H f13443g;

        static {
            p1 p1Var = p1.f1607j;
            f13437a = p1Var;
            x0 x0Var = new x0() { // from class: Z.o0
                @Override // Z.x0
                public final void a(I0 i02) {
                    i02.z();
                }
            };
            f13438b = x0Var;
            s0.a aVar = g0.u0.f28089d;
            f13440d = aVar;
            f13441e = new Range(30, 30);
            f13442f = new Range(120, 120);
            C3563H c3563h = C3563H.f33650d;
            f13443g = c3563h;
            f13439c = new d(x0Var).m(5).l(p1Var).r(aVar).j(c3563h).c();
        }

        public C1589a a() {
            return f13439c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f implements V0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private F.I f13444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f13445b = false;

        f(F.I i10) {
            this.f13444a = i10;
        }

        private void d(boolean z10) {
            if (this.f13445b == z10) {
                return;
            }
            this.f13445b = z10;
            F.I i10 = this.f13444a;
            if (i10 == null) {
                AbstractC3583h0.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z10) {
                i10.o();
            } else {
                i10.d();
            }
        }

        public void b() {
            H0.g.j(H.y.d(), "SourceStreamRequirementObserver can be closed from main thread only");
            AbstractC3583h0.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f13445b);
            if (this.f13444a == null) {
                AbstractC3583h0.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                d(false);
                this.f13444a = null;
            }
        }

        @Override // F.V0.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            H0.g.j(H.y.d(), "SourceStreamRequirementObserver can be updated from main thread only");
            d(Boolean.TRUE.equals(bool));
        }

        @Override // F.V0.a
        public void onError(Throwable th) {
            AbstractC3583h0.m("VideoCapture", "SourceStreamRequirementObserver#onError", th);
        }
    }

    m0(C1589a c1589a) {
        super(c1589a);
        this.f13420t = d0.f13353a;
        this.f13421u = new k1.b();
        this.f13422v = null;
        this.f13424x = x0.a.INACTIVE;
        this.f13413B = false;
        this.f13416E = Collections.EMPTY_MAP;
        this.f13417F = new a();
    }

    private Rect A0(Size size, g0.s0 s0Var) {
        Rect rectE = E() != null ? E() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (s0Var == null || s0Var.a(rectE.width(), rectE.height())) ? rectE : t0(rectE, size, s0Var);
    }

    private void B0() {
        H.y.b();
        k1.c cVar = this.f13415D;
        if (cVar != null) {
            cVar.b();
            this.f13415D = null;
        }
        AbstractC0504q0 abstractC0504q0 = this.f13418r;
        if (abstractC0504q0 != null) {
            abstractC0504q0.d();
            this.f13418r = null;
        }
        P.U u10 = this.f13425y;
        if (u10 != null) {
            u10.f();
            this.f13425y = null;
        }
        P.L l10 = this.f13419s;
        if (l10 != null) {
            l10.i();
            this.f13419s = null;
        }
        this.f13426z = null;
        this.f13423w = null;
        this.f13420t = d0.f13353a;
        this.f13412A = 0;
        this.f13413B = false;
    }

    private P.U C0(F.M m10, C1589a c1589a, int i10, Rect rect, Size size, C3563H c3563h) {
        if (!S0(m10, c1589a, i10, rect, size, c3563h)) {
            return null;
        }
        AbstractC3583h0.a("VideoCapture", "Surface processing is enabled.");
        F.M mI = i();
        Objects.requireNonNull(mI);
        n();
        return new P.U(mI, C1364t.a.a(c3563h));
    }

    private LinkedHashMap D0(F.L l10, r rVar, C3563H c3563h, e0 e0Var, int i10, Range range, s0.a aVar, List list) {
        int iB = rVar.d().b();
        Map mapH = C1585y.h(e0Var, c3563h);
        C1584x c1584x = new C1584x(P0(l10, i10, range), mapH);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1582v abstractC1582v = (AbstractC1582v) it.next();
            linkedHashMap.put(abstractC1582v, c1584x.g(abstractC1582v, iB));
        }
        return G0(aVar, rVar, c3563h, e0Var, linkedHashMap, mapH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k1.b E0(final C1589a c1589a, o1 o1Var) {
        final m0 m0Var = this;
        H.y.b();
        final F.M m10 = (F.M) H0.g.g(m0Var.i());
        Size sizeF = o1Var.f();
        Runnable runnable = new Runnable() { // from class: Z.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13378g.L();
            }
        };
        Range rangeW0 = W0(o1Var);
        r rVarJ0 = m0Var.J0();
        Objects.requireNonNull(rVarJ0);
        int iG = o1Var.g();
        e0 e0VarR0 = m0Var.R0(m10.d(), iG);
        C3563H c3563hB = o1Var.b();
        g0.s0 s0VarY0 = Y0(c1589a.f0(), e0VarR0.a(sizeF, c3563hB), rVarJ0, c3563hB);
        m0Var.f13412A = m0Var.I0(m10);
        Rect rectA0 = m0Var.A0(sizeF, s0VarY0);
        Rect rectU0 = m0Var.u0(rectA0, m0Var.f13412A);
        m0Var.f13426z = rectU0;
        Size sizeV0 = m0Var.v0(sizeF, rectA0, rectU0);
        if (m0Var.d1()) {
            m0Var.f13413B = true;
        }
        Rect rect = m0Var.f13426z;
        Rect rectS0 = s0(rect, m0Var.f13412A, m0Var.S0(m10, c1589a, iG, rect, sizeF, c3563hB), s0VarY0);
        m0Var.f13426z = rectS0;
        m0Var.f13425y = m0Var.C0(m10, c1589a, iG, rectS0, sizeF, c3563hB);
        final boolean z10 = (m10.o() && m0Var.f13425y == null) ? false : true;
        final v1 v1VarX0 = X0(m10, m0Var.f13425y);
        AbstractC3583h0.a("VideoCapture", "camera timebase = " + m10.r().m() + ", processing timebase = " + v1VarX0);
        o1 o1VarA = o1Var.i().f(sizeV0).c(rangeW0).a();
        H0.g.i(m0Var.f13419s == null);
        P.L l10 = new P.L(2, 34, o1VarA, m0Var.y(), m10.o(), m0Var.f13426z, m0Var.f13412A, m0Var.f(), m0Var.i1(m10));
        m0Var.f13419s = l10;
        l10.e(runnable);
        if (m0Var.f13425y != null) {
            R.f fVarJ = R.f.j(m0Var.f13419s);
            final P.L l11 = (P.L) m0Var.f13425y.j(U.b.c(m0Var.f13419s, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(l11);
            m0Var = this;
            l11.e(new Runnable() { // from class: Z.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13380g.U0(l11, m10, c1589a, v1VarX0, z10);
                }
            });
            m0Var.f13423w = l11.k(m10);
            final AbstractC0504q0 abstractC0504q0O = m0Var.f13419s.o();
            m0Var.f13418r = abstractC0504q0O;
            abstractC0504q0O.k().h(new Runnable() { // from class: Z.i0
                @Override // java.lang.Runnable
                public final void run() {
                    m0.j0(this.f13388g, abstractC0504q0O);
                }
            }, I.c.e());
        } else {
            I0 i0K = m0Var.f13419s.k(m10);
            m0Var.f13423w = i0K;
            m0Var.f13418r = i0K.n();
        }
        c1589a.g0().b(m0Var.f13423w, v1VarX0, z10);
        m0Var.Z0();
        m0Var.f13418r.p(MediaCodec.class);
        k1.b bVarR = k1.b.r(c1589a, o1Var.f());
        bVarR.A(iG);
        m0Var.b(bVarR, o1Var);
        bVarR.C(c1589a.H());
        k1.c cVar = m0Var.f13415D;
        if (cVar != null) {
            cVar.b();
        }
        k1.c cVar2 = new k1.c(new k1.d() { // from class: Z.j0
            @Override // F.k1.d
            public final void a(k1 k1Var, k1.g gVar) {
                this.f13394a.V0();
            }
        });
        m0Var.f13415D = cVar2;
        bVarR.u(cVar2);
        if (o1Var.d() != null) {
            bVarR.g(o1Var.d());
        }
        return bVarR;
    }

    private static Object F0(V0 v02, Object obj) {
        InterfaceFutureC2904a interfaceFutureC2904aD = v02.d();
        if (!interfaceFutureC2904aD.isDone()) {
            return obj;
        }
        try {
            return interfaceFutureC2904aD.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static LinkedHashMap G0(s0.a aVar, r rVar, C3563H c3563h, e0 e0Var, LinkedHashMap linkedHashMap, Map map) {
        b0.i iVarA;
        g0.s0 s0VarH0;
        if (linkedHashMap.isEmpty()) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ArrayList arrayList = new ArrayList((Collection) entry.getValue());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (!map.containsValue(size) && (iVarA = e0Var.a(size, c3563h)) != null && (s0VarH0 = H0(aVar, iVarA, c3563h, rVar)) != null && !s0VarH0.a(size.getWidth(), size.getHeight())) {
                    it.remove();
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap2.put((AbstractC1582v) entry.getKey(), arrayList);
            }
        }
        return linkedHashMap2;
    }

    private static g0.s0 H0(s0.a aVar, b0.i iVar, C3563H c3563h, r rVar) {
        g0.s0 s0VarY0;
        int iB;
        if (c3563h.e()) {
            return Y0(aVar, iVar, rVar, c3563h);
        }
        g0.s0 s0Var = null;
        int i10 = androidx.customview.widget.a.INVALID_ID;
        for (InterfaceC0515w0.c cVar : iVar.d()) {
            if (AbstractC2688b.f(cVar, c3563h) && (s0VarY0 = Y0(aVar, iVar, rVar, new C3563H(AbstractC2688b.h(cVar.g()), AbstractC2688b.g(cVar.b())))) != null && (iB = O.d.b(((Integer) s0VarY0.h().getUpper()).intValue(), ((Integer) s0VarY0.j().getUpper()).intValue())) > i10) {
                s0Var = s0VarY0;
                i10 = iB;
            }
        }
        return s0Var;
    }

    private int I0(F.M m10) {
        boolean zH = H(m10);
        int iU = u(m10, zH);
        if (!d1()) {
            return iU;
        }
        I0.h hVarB = this.f13420t.b();
        Objects.requireNonNull(hVarB);
        int iB = hVarB.b();
        if (zH != hVarB.f()) {
            iB = -iB;
        }
        return H.z.v(iU - iB);
    }

    private r J0() {
        return (r) F0(L0().d(), null);
    }

    private r K0() {
        r rVarJ0 = J0();
        if (rVarJ0 != null) {
            return rVarJ0;
        }
        throw new IllegalArgumentException("MediaSpec can't be null");
    }

    private List M0(List list, C1585y c1585y) {
        List listF = c1585y.f(list);
        AbstractC3583h0.a("VideoCapture", "Found selectedQualities " + listF + " by " + c1585y);
        if (listF.isEmpty()) {
            throw new IllegalArgumentException("Unable to find selected quality");
        }
        return listF;
    }

    private int N0(C1589a c1589a) {
        return c1589a.q(0);
    }

    private List O0(C3563H c3563h, e0 e0Var, int i10) {
        List listD = e0Var.d(c3563h);
        AbstractC3583h0.a("VideoCapture", "supportedQualities = " + listD);
        if (listD.isEmpty() && i10 == 1) {
            throw new IllegalArgumentException("No supported quality on the device for high-speed capture.");
        }
        return listD;
    }

    private List P0(F.L l10, int i10, Range range) {
        return i10 == 1 ? o1.f1588a.equals(range) ? l10.v() : l10.h(range) : l10.x(p());
    }

    private Range Q0(C1589a c1589a) {
        Range rangeK = c1589a.K(o1.f1588a);
        Objects.requireNonNull(rangeK);
        return rangeK;
    }

    private e0 R0(InterfaceC3597q interfaceC3597q, int i10) {
        return L0().c(interfaceC3597q, i10);
    }

    private boolean S0(F.M m10, C1589a c1589a, int i10, Rect rect, Size size, C3563H c3563h) {
        if (i10 == 1) {
            return false;
        }
        n();
        return g1(m10, c1589a) || h1(m10) || f1(m10, c3563h) || e1(rect, size) || i1(m10) || d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0(P.L l10, F.M m10, C1589a c1589a, v1 v1Var, boolean z10) {
        if (m10 == i()) {
            this.f13423w = l10.k(m10);
            c1589a.g0().b(this.f13423w, v1Var, z10);
            Z0();
        }
    }

    private static Range W0(o1 o1Var) {
        Range rangeC = o1Var.c();
        return Objects.equals(rangeC, o1.f1588a) ? o1Var.g() == 1 ? e.f13442f : e.f13441e : rangeC;
    }

    private static v1 X0(F.M m10, P.U u10) {
        return (u10 == null && m10.o()) ? v1.UPTIME : m10.r().m();
    }

    private static g0.s0 Y0(s0.a aVar, b0.i iVar, r rVar, C3563H c3563h) {
        g0.s0 s0VarA = aVar.a(AbstractC2590m.e(rVar, c3563h, iVar).a());
        if (s0VarA != null) {
            return C2719g.l(s0VarA, iVar != null ? iVar.k().k() : null);
        }
        AbstractC3583h0.l("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    private void Z0() {
        F.M mI = i();
        P.L l10 = this.f13419s;
        if (mI == null || l10 == null) {
            return;
        }
        int iI0 = I0(mI);
        this.f13412A = iI0;
        l10.z(iI0, f());
    }

    private void a1(D1.b bVar, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        AbstractC3583h0.a("VideoCapture", "Set custom ordered resolutions = " + arrayList);
        bVar.b().X(E0.f1331v, arrayList);
        this.f13416E = linkedHashMap;
    }

    private void c1(final k1.b bVar, boolean z10) {
        InterfaceFutureC2904a interfaceFutureC2904a = this.f13422v;
        if (interfaceFutureC2904a != null && interfaceFutureC2904a.cancel(false)) {
            AbstractC3583h0.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: Z.f0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return m0.m0(this.f13370a, bVar, aVar);
            }
        });
        this.f13422v = interfaceFutureC2904aA;
        J.n.j(interfaceFutureC2904aA, new c(interfaceFutureC2904aA, z10), I.c.e());
    }

    private boolean d1() {
        return this.f13420t.b() != null;
    }

    private static boolean e1(Rect rect, Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    private static boolean f1(F.M m10, C3563H c3563h) {
        HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) androidx.camera.video.internal.compat.quirk.a.b(HdrRepeatingRequestFailureQuirk.class);
        return m10.o() && hdrRepeatingRequestFailureQuirk != null && hdrRepeatingRequestFailureQuirk.i(c3563h);
    }

    private static boolean g1(F.M m10, C1589a c1589a) {
        return m10.o() && c1589a.h0();
    }

    private static boolean h1(F.M m10) {
        if (m10.o()) {
            return SurfaceProcessingQuirk.d(androidx.camera.video.internal.compat.quirk.a.c()) || SurfaceProcessingQuirk.d(m10.r().w());
        }
        return false;
    }

    public static /* synthetic */ int i0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    private boolean i1(F.M m10) {
        return m10.o() && H(m10);
    }

    public static /* synthetic */ void j0(m0 m0Var, AbstractC0504q0 abstractC0504q0) {
        if (abstractC0504q0 == m0Var.f13418r) {
            m0Var.B0();
        }
    }

    private void k1(F.L l10, D1.b bVar) {
        r rVarK0 = K0();
        C1585y c1585yE = rVarK0.d().e();
        C1589a c1589a = (C1589a) bVar.c();
        if (c1589a.b(E0.f1331v)) {
            H0.g.b(c1585yE == z0.f13530b, "Custom ordered resolutions and QualitySelector can't both be set");
            return;
        }
        C3563H c3563hL = c1589a.l();
        int iN0 = N0(c1589a);
        Range rangeQ0 = Q0(c1589a);
        e0 e0VarR0 = R0(l10, iN0);
        AbstractC3583h0.a("VideoCapture", "Update custom order resolutions: requestedDynamicRange = " + c3563hL + ", sessionType = " + iN0 + ", targetFrameRate = " + rangeQ0);
        List listO0 = O0(c3563hL, e0VarR0, iN0);
        if (listO0.isEmpty()) {
            AbstractC3583h0.l("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            a1(bVar, D0(l10, rVarK0, c3563hL, e0VarR0, iN0, rangeQ0, c1589a.f0(), M0(listO0, c1585yE)));
        }
    }

    public static /* synthetic */ void l0(AtomicBoolean atomicBoolean, k1.b bVar, F.r rVar) {
        H0.g.j(H.y.d(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.t(rVar);
    }

    public static /* synthetic */ Object m0(m0 m0Var, final k1.b bVar, c.a aVar) {
        m0Var.getClass();
        bVar.o("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar2 = m0Var.new b(atomicBoolean, aVar, bVar);
        aVar.a(new Runnable() { // from class: Z.k0
            @Override // java.lang.Runnable
            public final void run() {
                m0.l0(atomicBoolean, bVar, bVar2);
            }
        }, I.c.b());
        bVar.j(bVar2);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
    }

    private static void r0(Set set, int i10, int i11, Size size, g0.s0 s0Var) {
        if (i10 > size.getWidth() || i11 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i10, ((Integer) s0Var.f(i10).clamp(Integer.valueOf(i11))).intValue()));
        } catch (IllegalArgumentException e10) {
            AbstractC3583h0.m("VideoCapture", "No supportedHeights for width: " + i10, e10);
        }
        try {
            set.add(new Size(((Integer) s0Var.e(i11).clamp(Integer.valueOf(i10))).intValue(), i11));
        } catch (IllegalArgumentException e11) {
            AbstractC3583h0.m("VideoCapture", "No supportedWidths for height: " + i11, e11);
        }
    }

    private static Rect s0(Rect rect, int i10, boolean z10, g0.s0 s0Var) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) androidx.camera.video.internal.compat.quirk.a.b(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z10) {
            i10 = 0;
        }
        return sizeCannotEncodeVideoQuirk.g(rect, i10, s0Var);
    }

    private static Rect t0(final Rect rect, Size size, g0.s0 s0Var) {
        AbstractC3583h0.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", H.z.n(rect), Integer.valueOf(s0Var.b()), Integer.valueOf(s0Var.g()), s0Var.h(), s0Var.j()));
        if ((!s0Var.h().contains(Integer.valueOf(rect.width())) || !s0Var.j().contains(Integer.valueOf(rect.height()))) && s0Var.d() && s0Var.j().contains(Integer.valueOf(rect.width())) && s0Var.h().contains(Integer.valueOf(rect.height()))) {
            s0Var = new g0.n0(s0Var);
        }
        int iB = s0Var.b();
        int iG = s0Var.g();
        Range rangeH = s0Var.h();
        Range rangeJ = s0Var.j();
        int iX0 = x0(rect.width(), iB, rangeH);
        int iY0 = y0(rect.width(), iB, rangeH);
        int iX02 = x0(rect.height(), iG, rangeJ);
        int iY02 = y0(rect.height(), iG, rangeJ);
        HashSet hashSet = new HashSet();
        r0(hashSet, iX0, iX02, size, s0Var);
        r0(hashSet, iX0, iY02, size, s0Var);
        r0(hashSet, iY0, iX02, size, s0Var);
        r0(hashSet, iY0, iY02, size, s0Var);
        if (hashSet.isEmpty()) {
            AbstractC3583h0.l("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        AbstractC3583h0.a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: Z.l0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m0.i0(rect, (Size) obj, (Size) obj2);
            }
        });
        AbstractC3583h0.a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            AbstractC3583h0.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        H0.g.i(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int iMax = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = iMax;
            int i10 = iMax + width;
            rect2.right = i10;
            if (i10 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int iMax2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = iMax2;
            int i11 = iMax2 + height;
            rect2.bottom = i11;
            if (i11 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        AbstractC3583h0.a("VideoCapture", String.format("Adjust cropRect from %s to %s", H.z.n(rect), H.z.n(rect2)));
        return rect2;
    }

    private Rect u0(Rect rect, int i10) {
        return d1() ? H.z.q(H.z.f(((I0.h) H0.g.g(this.f13420t.b())).a(), i10)) : rect;
    }

    private Size v0(Size size, Rect rect, Rect rect2) {
        if (!d1() || rect2.equals(rect)) {
            return size;
        }
        float fHeight = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * fHeight), (int) Math.ceil(size.getHeight() * fHeight));
    }

    private static int w0(boolean z10, int i10, int i11, Range range) {
        int i12 = i10 % i11;
        if (i12 != 0) {
            i10 = z10 ? i10 - i12 : i10 + (i11 - i12);
        }
        return ((Integer) range.clamp(Integer.valueOf(i10))).intValue();
    }

    private static int x0(int i10, int i11, Range range) {
        return w0(true, i10, i11, range);
    }

    private static int y0(int i10, int i11, Range range) {
        return w0(false, i10, i11, range);
    }

    @Override // y.J0
    public Set A(F.L l10) {
        return R0(l10, 0).b();
    }

    @Override // y.J0
    public Set B() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // y.J0
    public D1.b D(InterfaceC0490j0 interfaceC0490j0) {
        return d.g(interfaceC0490j0);
    }

    public x0 L0() {
        return ((C1589a) l()).g0();
    }

    @Override // y.J0
    protected D1 Q(F.L l10, D1.b bVar) {
        k1(l10, bVar);
        return bVar.c();
    }

    @Override // y.J0
    public void R() {
        super.R();
        AbstractC3583h0.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + k());
        if (g() == null || this.f13423w != null) {
            return;
        }
        o1 o1Var = (o1) H0.g.g(g());
        this.f13420t = (d0) F0(L0().e(), d0.f13353a);
        k1.b bVarE0 = E0((C1589a) l(), o1Var);
        this.f13421u = bVarE0;
        z0(bVarE0, this.f13420t, o1Var);
        d0(AbstractC3567L.a(new Object[]{this.f13421u.p()}));
        J();
        L0().e().c(I.c.e(), this.f13417F);
        f fVar = this.f13414C;
        if (fVar != null) {
            fVar.b();
        }
        this.f13414C = new f(j());
        L0().f().c(I.c.e(), this.f13414C);
        b1(x0.a.ACTIVE_NON_STREAMING);
    }

    @Override // y.J0
    public void S() {
        AbstractC3583h0.a("VideoCapture", "VideoCapture#onStateDetached");
        H0.g.j(H.y.d(), "VideoCapture can only be detached on the main thread.");
        if (this.f13414C != null) {
            L0().f().e(this.f13414C);
            this.f13414C.b();
            this.f13414C = null;
        }
        b1(x0.a.INACTIVE);
        L0().e().e(this.f13417F);
        InterfaceFutureC2904a interfaceFutureC2904a = this.f13422v;
        if (interfaceFutureC2904a != null && interfaceFutureC2904a.cancel(false)) {
            AbstractC3583h0.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        B0();
    }

    @Override // y.J0
    protected o1 T(InterfaceC0490j0 interfaceC0490j0) {
        this.f13421u.g(interfaceC0490j0);
        d0(AbstractC3567L.a(new Object[]{this.f13421u.p()}));
        o1 o1VarG = g();
        Objects.requireNonNull(o1VarG);
        return o1VarG.i().d(interfaceC0490j0).a();
    }

    boolean T0(int i10, int i11) {
        Set set = d0.f13354b;
        return (set.contains(Integer.valueOf(i10)) || set.contains(Integer.valueOf(i11)) || i10 == i11) ? false : true;
    }

    @Override // y.J0
    protected o1 U(o1 o1Var, o1 o1Var2) {
        AbstractC3583h0.a("VideoCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + o1Var + ", secondaryStreamSpec " + o1Var2);
        List listP = ((C1589a) l()).p(null);
        if (listP != null && !listP.contains(o1Var.f())) {
            AbstractC3583h0.l("VideoCapture", "suggested resolution " + o1Var.f() + " is not in custom ordered resolutions " + listP);
        }
        return o1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V0() {
        if (i() == null) {
            return;
        }
        B0();
        k1.b bVarE0 = E0((C1589a) l(), (o1) H0.g.g(g()));
        this.f13421u = bVarE0;
        z0(bVarE0, this.f13420t, g());
        d0(AbstractC3567L.a(new Object[]{this.f13421u.p()}));
        L();
    }

    @Override // y.J0
    public void b0(Rect rect) {
        super.b0(rect);
        Z0();
    }

    void b1(x0.a aVar) {
        if (aVar != this.f13424x) {
            this.f13424x = aVar;
            L0().g(aVar);
        }
    }

    boolean j1(d0 d0Var, d0 d0Var2) {
        return this.f13413B && d0Var.b() != null && d0Var2.b() == null;
    }

    @Override // y.J0
    public D1 m(boolean z10, E1 e12) {
        e eVar = f13411G;
        InterfaceC0490j0 interfaceC0490j0A = e12.a(eVar.a().G(), 1);
        if (z10) {
            interfaceC0490j0A = InterfaceC0490j0.W(interfaceC0490j0A, eVar.a());
        }
        if (interfaceC0490j0A == null) {
            return null;
        }
        return D(interfaceC0490j0A).c();
    }

    public String toString() {
        return "VideoCapture:" + r();
    }

    void z0(k1.b bVar, d0 d0Var, o1 o1Var) {
        AbstractC0504q0 abstractC0504q0;
        boolean z10 = d0Var.a() == -1;
        boolean z11 = d0Var.c() == d0.a.ACTIVE;
        if (z10 && z11) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.q();
        C3563H c3563hB = o1Var.b();
        if (!z10 && (abstractC0504q0 = this.f13418r) != null) {
            if (z11) {
                bVar.n(abstractC0504q0, c3563hB, null, -1);
            } else {
                bVar.i(abstractC0504q0, c3563hB);
            }
        }
        c1(bVar, z11);
    }
}
