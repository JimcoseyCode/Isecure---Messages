package c0;

import F.V0;
import android.content.Context;
import androidx.concurrent.futures.c;
import b0.c;
import c0.p;
import g0.i0;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f18722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference f18723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f18724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final p f18725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final E f18726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f18727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    e f18728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    c.a f18729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f18730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Executor f18731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    c f18732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b0.c f18733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private J.c f18734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private V0.a f18735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f18736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f18737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f18738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f18739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f18740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    double f18741t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    long f18742u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f18743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f18744w;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements V0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0.c f18745a;

        a(b0.c cVar) {
            this.f18745a = cVar;
        }

        @Override // F.V0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c.a aVar) {
            Objects.requireNonNull(aVar);
            if (n.this.f18733l == this.f18745a) {
                AbstractC3583h0.a("AudioSource", "Receive BufferProvider state change: " + n.this.f18729h + " to " + aVar);
                n nVar = n.this;
                if (nVar.f18729h != aVar) {
                    nVar.f18729h = aVar;
                    nVar.H();
                }
            }
        }

        @Override // F.V0.a
        public void onError(Throwable th) {
            n nVar = n.this;
            if (nVar.f18733l == this.f18745a) {
                nVar.r(th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0.c f18747a;

        b(b0.c cVar) {
            this.f18747a = cVar;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(i0 i0Var) {
            n nVar = n.this;
            if (!nVar.f18730i || nVar.f18733l != this.f18747a) {
                i0Var.cancel();
                return;
            }
            if (nVar.f18736o && nVar.p()) {
                n.this.y();
            }
            p pVarM = n.this.m();
            ByteBuffer byteBufferA = i0Var.a();
            p.c cVar = pVarM.read(byteBufferA);
            if (cVar.a() > 0) {
                n nVar2 = n.this;
                if (nVar2.f18739r) {
                    nVar2.u(byteBufferA, cVar.a());
                }
                if (n.this.f18731j != null) {
                    long jB = cVar.b();
                    n nVar3 = n.this;
                    if (jB - nVar3.f18742u >= 200) {
                        nVar3.f18742u = cVar.b();
                        n.this.v(byteBufferA);
                    }
                }
                byteBufferA.limit(byteBufferA.position() + cVar.a());
                i0Var.e(TimeUnit.NANOSECONDS.toMicros(cVar.b()));
                i0Var.d();
            } else {
                AbstractC3583h0.l("AudioSource", "Unable to read data from AudioStream.");
                i0Var.cancel();
            }
            n.this.z();
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (n.this.f18733l != this.f18747a) {
                return;
            }
            AbstractC3583h0.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th instanceof IllegalStateException) {
                return;
            }
            n.this.r(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements p.a {
        d() {
        }

        @Override // c0.p.a
        public void a(boolean z10) {
            n nVar = n.this;
            nVar.f18738q = z10;
            if (nVar.f18728g == e.STARTED) {
                nVar.s();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum e {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public n(AbstractC1834a abstractC1834a, Executor executor, Context context) {
        this(abstractC1834a, executor, context, new q() { // from class: c0.h
            @Override // c0.q
            public final p a(AbstractC1834a abstractC1834a2, Context context2) {
                return new s(abstractC1834a2, context2);
            }
        }, 3000L);
    }

    private void E() {
        if (this.f18730i) {
            return;
        }
        try {
            AbstractC3583h0.a("AudioSource", "startSendingAudio");
            this.f18725d.start();
            this.f18736o = false;
        } catch (p.b e10) {
            AbstractC3583h0.m("AudioSource", "Failed to start AudioStream", e10);
            this.f18736o = true;
            this.f18726e.start();
            this.f18737p = n();
            s();
        }
        this.f18730i = true;
        z();
    }

    private void G() {
        if (this.f18730i) {
            this.f18730i = false;
            AbstractC3583h0.a("AudioSource", "stopSendingAudio");
            this.f18725d.stop();
        }
    }

    public static /* synthetic */ Object a(final n nVar, final c.a aVar) {
        nVar.f18722a.execute(new Runnable() { // from class: c0.k
            @Override // java.lang.Runnable
            public final void run() {
                n.f(this.f18715g, aVar);
            }
        });
        return "AudioSource-release";
    }

    public static /* synthetic */ void b(n nVar, Executor executor, c cVar) {
        int iOrdinal = nVar.f18728g.ordinal();
        if (iOrdinal == 0) {
            nVar.f18731j = executor;
            nVar.f18732k = cVar;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    public static /* synthetic */ void d(n nVar, b0.c cVar) {
        int iOrdinal = nVar.f18728g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (nVar.f18733l != cVar) {
            nVar.x(cVar);
        }
    }

    public static /* synthetic */ void e(n nVar, boolean z10) {
        int iOrdinal = nVar.f18728g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (nVar.f18739r == z10) {
                return;
            }
            nVar.f18739r = z10;
            if (nVar.f18728g == e.STARTED) {
                nVar.s();
            }
        }
    }

    public static /* synthetic */ void f(n nVar, c.a aVar) {
        nVar.getClass();
        try {
            int iOrdinal = nVar.f18728g.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                nVar.x(null);
                nVar.f18726e.a();
                nVar.f18725d.a();
                nVar.G();
                nVar.C(e.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th) {
            aVar.f(th);
        }
    }

    public static /* synthetic */ void g(n nVar) {
        int iOrdinal = nVar.f18728g.ordinal();
        if (iOrdinal == 1) {
            nVar.C(e.CONFIGURED);
            nVar.H();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            AbstractC3583h0.l("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    public static /* synthetic */ void k(n nVar, boolean z10) {
        int iOrdinal = nVar.f18728g.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        nVar.f18723b.set(null);
        nVar.f18724c.set(false);
        nVar.C(e.STARTED);
        nVar.q(z10);
        nVar.H();
    }

    private static c.a l(b0.c cVar) {
        try {
            InterfaceFutureC2904a interfaceFutureC2904aD = cVar.d();
            if (interfaceFutureC2904aD.isDone()) {
                return (c.a) interfaceFutureC2904aD.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    private static long n() {
        return System.nanoTime();
    }

    public static boolean o(int i10, int i11, int i12) {
        return s.n(i10, i11, i12);
    }

    private void x(b0.c cVar) {
        b0.c cVar2 = this.f18733l;
        if (cVar2 != null) {
            V0.a aVar = this.f18735n;
            Objects.requireNonNull(aVar);
            cVar2.e(aVar);
            this.f18733l = null;
            this.f18735n = null;
            this.f18734m = null;
            this.f18729h = c.a.INACTIVE;
            H();
        }
        if (cVar != null) {
            this.f18733l = cVar;
            this.f18735n = new a(cVar);
            this.f18734m = new b(cVar);
            c.a aVarL = l(cVar);
            if (aVarL != null) {
                this.f18729h = aVarL;
                H();
            }
            this.f18733l.c(this.f18722a, this.f18735n);
        }
    }

    public void A(final Executor executor, final c cVar) {
        this.f18722a.execute(new Runnable() { // from class: c0.l
            @Override // java.lang.Runnable
            public final void run() {
                n.b(this.f18717g, executor, cVar);
            }
        });
    }

    public void B(final b0.c cVar) {
        this.f18722a.execute(new Runnable() { // from class: c0.g
            @Override // java.lang.Runnable
            public final void run() {
                n.d(this.f18709g, cVar);
            }
        });
    }

    void C(e eVar) {
        AbstractC3583h0.a("AudioSource", "Transitioning internal state: " + this.f18728g + " --> " + eVar);
        this.f18728g = eVar;
    }

    public void D(final boolean z10) {
        this.f18722a.execute(new Runnable() { // from class: c0.f
            @Override // java.lang.Runnable
            public final void run() {
                n.k(this.f18707g, z10);
            }
        });
    }

    public void F() {
        this.f18722a.execute(new Runnable() { // from class: c0.b
            @Override // java.lang.Runnable
            public final void run() {
                n.g(this.f18701g);
            }
        });
    }

    void H() {
        if (this.f18728g != e.STARTED) {
            G();
            return;
        }
        boolean z10 = this.f18729h == c.a.ACTIVE;
        t(!z10);
        if (z10) {
            E();
        } else {
            G();
        }
    }

    p m() {
        return this.f18736o ? this.f18726e : this.f18725d;
    }

    boolean p() {
        H0.g.i(this.f18737p > 0);
        return n() - this.f18737p >= this.f18727f;
    }

    public void q(final boolean z10) {
        this.f18722a.execute(new Runnable() { // from class: c0.i
            @Override // java.lang.Runnable
            public final void run() {
                n.e(this.f18711g, z10);
            }
        });
    }

    void r(final Throwable th) {
        Executor executor = this.f18731j;
        final c cVar = this.f18732k;
        if (executor == null || cVar == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: c0.d
            @Override // java.lang.Runnable
            public final void run() {
                cVar.onError(th);
            }
        });
    }

    void s() {
        Executor executor = this.f18731j;
        final c cVar = this.f18732k;
        if (executor == null || cVar == null) {
            return;
        }
        final boolean z10 = this.f18739r || this.f18736o || this.f18738q;
        if (Objects.equals(this.f18723b.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: c0.j
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(z10);
            }
        });
    }

    void t(final boolean z10) {
        Executor executor = this.f18731j;
        final c cVar = this.f18732k;
        if (executor == null || cVar == null || this.f18724c.getAndSet(z10) == z10) {
            return;
        }
        executor.execute(new Runnable() { // from class: c0.c
            @Override // java.lang.Runnable
            public final void run() {
                cVar.b(z10);
            }
        });
    }

    void u(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = this.f18740s;
        if (bArr == null || bArr.length < i10) {
            this.f18740s = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f18740s, 0, i10);
        byteBuffer.limit(byteBuffer.position()).position(iPosition);
    }

    void v(ByteBuffer byteBuffer) {
        Executor executor = this.f18731j;
        final c cVar = this.f18732k;
        if (this.f18743v == 2) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            double dMax = 0.0d;
            while (shortBufferAsShortBuffer.hasRemaining()) {
                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
            }
            this.f18741t = dMax / 32767.0d;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: c0.m
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.c(this.f18720g.f18741t);
                }
            });
        }
    }

    public InterfaceFutureC2904a w() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: c0.e
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return n.a(this.f18706a, aVar);
            }
        });
    }

    void y() {
        H0.g.i(this.f18736o);
        try {
            this.f18725d.start();
            AbstractC3583h0.a("AudioSource", "Retry start AudioStream succeed");
            this.f18726e.stop();
            this.f18736o = false;
        } catch (p.b e10) {
            AbstractC3583h0.m("AudioSource", "Retry start AudioStream failed", e10);
            this.f18737p = n();
        }
    }

    void z() {
        b0.c cVar = this.f18733l;
        Objects.requireNonNull(cVar);
        InterfaceFutureC2904a interfaceFutureC2904aA = cVar.a();
        J.c cVar2 = this.f18734m;
        Objects.requireNonNull(cVar2);
        J.n.j(interfaceFutureC2904aA, cVar2, this.f18722a);
    }

    n(AbstractC1834a abstractC1834a, Executor executor, Context context, q qVar, long j10) throws o {
        this.f18723b = new AtomicReference(null);
        this.f18724c = new AtomicBoolean(false);
        this.f18728g = e.CONFIGURED;
        this.f18729h = c.a.INACTIVE;
        this.f18742u = 0L;
        Executor executorG = I.c.g(executor);
        this.f18722a = executorG;
        this.f18727f = TimeUnit.MILLISECONDS.toNanos(j10);
        try {
            C c10 = new C(qVar.a(abstractC1834a, context), abstractC1834a);
            this.f18725d = c10;
            c10.b(new d(), executorG);
            this.f18726e = new E(abstractC1834a);
            this.f18743v = abstractC1834a.b();
            this.f18744w = abstractC1834a.c();
        } catch (p.b | IllegalArgumentException e10) {
            throw new o("Unable to create AudioStream", e10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        void a(boolean z10);

        void c(double d10);

        void onError(Throwable th);

        default void b(boolean z10) {
        }
    }
}
