package m9;

import e9.t;
import i7.C2735B;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.C3389f;
import t9.C3391h;
import t9.D;
import t9.F;
import t9.G;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f29959o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f29963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f29964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f29966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f29967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f29968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f29969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m9.b f29970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IOException f29971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f29972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f f29973n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class b implements D {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C3391h f29974g = new C3391h();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private t f29975h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f29976i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f29977j;

        public b(boolean z10) {
            this.f29977j = z10;
        }

        /* JADX WARN: Finally extract failed */
        private final void d(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            synchronized (i.this) {
                try {
                    i.this.s().v();
                    while (i.this.r() >= i.this.q() && !this.f29977j && !this.f29976i && i.this.h() == null) {
                        try {
                            i.this.D();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    i.this.s().C();
                    i.this.c();
                    jMin = Math.min(i.this.q() - i.this.r(), this.f29974g.size());
                    i iVar = i.this;
                    iVar.B(iVar.r() + jMin);
                    z11 = z10 && jMin == this.f29974g.size() && i.this.h() == null;
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i.this.s().v();
            try {
                i.this.g().g1(i.this.j(), z11, this.f29974g, jMin);
            } finally {
                i.this.s().C();
            }
        }

        @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (f9.c.f27872h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (i.this) {
                if (this.f29976i) {
                    return;
                }
                boolean z10 = i.this.h() == null;
                C2735B c2735b = C2735B.f28704a;
                if (!i.this.o().f29977j) {
                    boolean z11 = this.f29974g.size() > 0;
                    if (this.f29975h != null) {
                        while (this.f29974g.size() > 0) {
                            d(false);
                        }
                        f fVarG = i.this.g();
                        int iJ = i.this.j();
                        t tVar = this.f29975h;
                        AbstractC2855l.d(tVar);
                        fVarG.h1(iJ, z10, f9.c.L(tVar));
                    } else if (z11) {
                        while (this.f29974g.size() > 0) {
                            d(true);
                        }
                    } else if (z10) {
                        i.this.g().g1(i.this.j(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f29976i = true;
                    C2735B c2735b2 = C2735B.f28704a;
                }
                i.this.g().flush();
                i.this.b();
            }
        }

        public final boolean e() {
            return this.f29976i;
        }

        @Override // t9.D, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (f9.c.f27872h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (i.this) {
                i.this.c();
                C2735B c2735b = C2735B.f28704a;
            }
            while (this.f29974g.size() > 0) {
                d(false);
                i.this.g().flush();
            }
        }

        public final boolean k() {
            return this.f29977j;
        }

        @Override // t9.D
        public G timeout() {
            return i.this.s();
        }

        @Override // t9.D
        public void write(C3391h source, long j10) throws IOException {
            AbstractC2855l.g(source, "source");
            i iVar = i.this;
            if (!f9.c.f27872h || !Thread.holdsLock(iVar)) {
                this.f29974g.write(source, j10);
                while (this.f29974g.size() >= 16384) {
                    d(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class c implements F {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C3391h f29979g = new C3391h();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C3391h f29980h = new C3391h();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private t f29981i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f29982j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f29983k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f29984l;

        public c(long j10, boolean z10) {
            this.f29983k = j10;
            this.f29984l = z10;
        }

        private final void s(long j10) {
            i iVar = i.this;
            if (!f9.c.f27872h || !Thread.holdsLock(iVar)) {
                i.this.g().f1(j10);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            synchronized (i.this) {
                this.f29982j = true;
                size = this.f29980h.size();
                this.f29980h.k();
                i iVar = i.this;
                if (iVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                iVar.notifyAll();
                C2735B c2735b = C2735B.f28704a;
            }
            if (size > 0) {
                s(size);
            }
            i.this.b();
        }

        public final boolean d() {
            return this.f29982j;
        }

        public final boolean e() {
            return this.f29984l;
        }

        public final void k(t9.j source, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            long size;
            AbstractC2855l.g(source, "source");
            i iVar = i.this;
            if (f9.c.f27872h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f29984l;
                    z11 = this.f29980h.size() + j10 > this.f29983k;
                    C2735B c2735b = C2735B.f28704a;
                }
                if (z11) {
                    source.skip(j10);
                    i.this.f(m9.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j10);
                    return;
                }
                long j11 = source.read(this.f29979g, j10);
                if (j11 == -1) {
                    throw new EOFException();
                }
                j10 -= j11;
                synchronized (i.this) {
                    try {
                        if (this.f29982j) {
                            size = this.f29979g.size();
                            this.f29979g.k();
                        } else {
                            boolean z12 = this.f29980h.size() == 0;
                            this.f29980h.G(this.f29979g);
                            if (z12) {
                                i iVar2 = i.this;
                                if (iVar2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                                iVar2.notifyAll();
                            }
                            size = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (size > 0) {
                    s(size);
                }
            }
        }

        public final void m(boolean z10) {
            this.f29984l = z10;
        }

        public final void r(t tVar) {
            this.f29981i = tVar;
        }

        /* JADX WARN: Finally extract failed */
        @Override // t9.F
        public long read(C3391h sink, long j10) throws IOException {
            IOException iOExceptionI;
            long j11;
            boolean z10;
            AbstractC2855l.g(sink, "sink");
            long j12 = 0;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                synchronized (i.this) {
                    i.this.m().v();
                    try {
                        if (i.this.h() != null) {
                            iOExceptionI = i.this.i();
                            if (iOExceptionI == null) {
                                m9.b bVarH = i.this.h();
                                AbstractC2855l.d(bVarH);
                                iOExceptionI = new n(bVarH);
                            }
                        } else {
                            iOExceptionI = null;
                        }
                        if (this.f29982j) {
                            throw new IOException("stream closed");
                        }
                        if (this.f29980h.size() > j12) {
                            C3391h c3391h = this.f29980h;
                            j11 = c3391h.read(sink, Math.min(j10, c3391h.size()));
                            i iVar = i.this;
                            iVar.A(iVar.l() + j11);
                            long jL = i.this.l() - i.this.k();
                            if (iOExceptionI == null && jL >= i.this.g().K0().c() / 2) {
                                i.this.g().l1(i.this.j(), jL);
                                i iVar2 = i.this;
                                iVar2.z(iVar2.l());
                            }
                        } else if (this.f29984l || iOExceptionI != null) {
                            j11 = -1;
                        } else {
                            i.this.D();
                            j11 = -1;
                            z10 = true;
                            i.this.m().C();
                            C2735B c2735b = C2735B.f28704a;
                        }
                        z10 = false;
                        i.this.m().C();
                        C2735B c2735b2 = C2735B.f28704a;
                    } catch (Throwable th) {
                        i.this.m().C();
                        throw th;
                    }
                }
                if (!z10) {
                    if (j11 != -1) {
                        s(j11);
                        return j11;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    AbstractC2855l.d(iOExceptionI);
                    throw iOExceptionI;
                }
                j12 = 0;
            }
        }

        @Override // t9.F
        public G timeout() {
            return i.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class d extends C3389f {
        public d() {
        }

        @Override // t9.C3389f
        protected void B() {
            i.this.f(m9.b.CANCEL);
            i.this.g().Z0();
        }

        public final void C() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // t9.C3389f
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public i(int i10, f connection, boolean z10, boolean z11, t tVar) {
        AbstractC2855l.g(connection, "connection");
        this.f29972m = i10;
        this.f29973n = connection;
        this.f29963d = connection.L0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f29964e = arrayDeque;
        this.f29966g = new c(connection.K0().c(), z11);
        this.f29967h = new b(z10);
        this.f29968i = new d();
        this.f29969j = new d();
        if (tVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(tVar);
        }
    }

    private final boolean e(m9.b bVar, IOException iOException) {
        if (f9.c.f27872h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.f29970k != null) {
                return false;
            }
            if (this.f29966g.e() && this.f29967h.k()) {
                return false;
            }
            this.f29970k = bVar;
            this.f29971l = iOException;
            notifyAll();
            C2735B c2735b = C2735B.f28704a;
            this.f29973n.Y0(this.f29972m);
            return true;
        }
    }

    public final void A(long j10) {
        this.f29960a = j10;
    }

    public final void B(long j10) {
        this.f29962c = j10;
    }

    public final synchronized t C() {
        Object objRemoveFirst;
        this.f29968i.v();
        while (this.f29964e.isEmpty() && this.f29970k == null) {
            try {
                D();
            } catch (Throwable th) {
                this.f29968i.C();
                throw th;
            }
        }
        this.f29968i.C();
        if (this.f29964e.isEmpty()) {
            IOException iOException = this.f29971l;
            if (iOException != null) {
                throw iOException;
            }
            m9.b bVar = this.f29970k;
            AbstractC2855l.d(bVar);
            throw new n(bVar);
        }
        objRemoveFirst = this.f29964e.removeFirst();
        AbstractC2855l.f(objRemoveFirst, "headersQueue.removeFirst()");
        return (t) objRemoveFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final G E() {
        return this.f29969j;
    }

    public final void a(long j10) {
        this.f29963d += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean zU;
        if (f9.c.f27872h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            try {
                z10 = !this.f29966g.e() && this.f29966g.d() && (this.f29967h.k() || this.f29967h.e());
                zU = u();
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            d(m9.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f29973n.Y0(this.f29972m);
        }
    }

    public final void c() throws IOException {
        if (this.f29967h.e()) {
            throw new IOException("stream closed");
        }
        if (this.f29967h.k()) {
            throw new IOException("stream finished");
        }
        if (this.f29970k != null) {
            IOException iOException = this.f29971l;
            if (iOException != null) {
                throw iOException;
            }
            m9.b bVar = this.f29970k;
            AbstractC2855l.d(bVar);
            throw new n(bVar);
        }
    }

    public final void d(m9.b rstStatusCode, IOException iOException) {
        AbstractC2855l.g(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f29973n.j1(this.f29972m, rstStatusCode);
        }
    }

    public final void f(m9.b errorCode) {
        AbstractC2855l.g(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f29973n.k1(this.f29972m, errorCode);
        }
    }

    public final f g() {
        return this.f29973n;
    }

    public final synchronized m9.b h() {
        return this.f29970k;
    }

    public final IOException i() {
        return this.f29971l;
    }

    public final int j() {
        return this.f29972m;
    }

    public final long k() {
        return this.f29961b;
    }

    public final long l() {
        return this.f29960a;
    }

    public final d m() {
        return this.f29968i;
    }

    public final D n() {
        synchronized (this) {
            try {
                if (!(this.f29965f || t())) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C2735B c2735b = C2735B.f28704a;
            } finally {
            }
        }
        return this.f29967h;
    }

    public final b o() {
        return this.f29967h;
    }

    public final c p() {
        return this.f29966g;
    }

    public final long q() {
        return this.f29963d;
    }

    public final long r() {
        return this.f29962c;
    }

    public final d s() {
        return this.f29969j;
    }

    public final boolean t() {
        return this.f29973n.w0() == ((this.f29972m & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.f29970k != null) {
                return false;
            }
            if (this.f29966g.e() || this.f29966g.d()) {
                if (this.f29967h.k() || this.f29967h.e()) {
                    if (this.f29965f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final G v() {
        return this.f29968i;
    }

    public final void w(t9.j source, int i10) {
        AbstractC2855l.g(source, "source");
        if (!f9.c.f27872h || !Thread.holdsLock(this)) {
            this.f29966g.k(source, i10);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void x(t headers, boolean z10) {
        boolean zU;
        AbstractC2855l.g(headers, "headers");
        if (f9.c.f27872h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            try {
                if (this.f29965f && z10) {
                    this.f29966g.r(headers);
                } else {
                    this.f29965f = true;
                    this.f29964e.add(headers);
                }
                if (z10) {
                    this.f29966g.m(true);
                }
                zU = u();
                notifyAll();
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            return;
        }
        this.f29973n.Y0(this.f29972m);
    }

    public final synchronized void y(m9.b errorCode) {
        AbstractC2855l.g(errorCode, "errorCode");
        if (this.f29970k == null) {
            this.f29970k = errorCode;
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f29961b = j10;
    }
}
