package j9;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.C2433a;
import e9.C2439g;
import e9.D;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import e9.p;
import e9.r;
import e9.u;
import e9.z;
import i7.AbstractC2738a;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3389f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC2437e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f28990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r f28991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f28992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f28993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f28994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f28995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f f28996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f28997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j9.c f28998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f28999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f29000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f29001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f29002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile j9.c f29003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile f f29004u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final z f29005v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final B f29006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f29007x;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile AtomicInteger f29008g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InterfaceC2438f f29009h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ e f29010i;

        public a(e eVar, InterfaceC2438f responseCallback) {
            AbstractC2855l.g(responseCallback, "responseCallback");
            this.f29010i = eVar;
            this.f29009h = responseCallback;
            this.f29008g = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            AbstractC2855l.g(executorService, "executorService");
            p pVarR = this.f29010i.k().r();
            if (f9.c.f27872h && Thread.holdsLock(pVarR)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(pVarR);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f29010i.u(interruptedIOException);
                    this.f29009h.onFailure(this.f29010i, interruptedIOException);
                    this.f29010i.k().r().f(this);
                }
            } catch (Throwable th) {
                this.f29010i.k().r().f(this);
                throw th;
            }
        }

        public final e b() {
            return this.f29010i;
        }

        public final AtomicInteger c() {
            return this.f29008g;
        }

        public final String d() {
            return this.f29010i.p().p().h();
        }

        public final void e(a other) {
            AbstractC2855l.g(other, "other");
            this.f29008g = other.f29008g;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th;
            IOException e10;
            z zVarK;
            String str = "OkHttp " + this.f29010i.v();
            Thread currentThread = Thread.currentThread();
            AbstractC2855l.f(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                this.f29010i.f28992i.v();
                try {
                    try {
                        z10 = true;
                        try {
                            this.f29009h.onResponse(this.f29010i, this.f29010i.q());
                            zVarK = this.f29010i.k();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                o9.j.f30594c.g().k("Callback failure for " + this.f29010i.B(), 4, e10);
                            } else {
                                this.f29009h.onFailure(this.f29010i, e10);
                            }
                            zVarK = this.f29010i.k();
                        } catch (Throwable th2) {
                            th = th2;
                            this.f29010i.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC2738a.a(iOException, th);
                                this.f29009h.onFailure(this.f29010i, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        this.f29010i.k().r().f(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z10 = false;
                    th = th4;
                }
                zVarK.r().f(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f29011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            AbstractC2855l.g(referent, "referent");
            this.f29011a = obj;
        }

        public final Object a() {
            return this.f29011a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends C3389f {
        c() {
        }

        @Override // t9.C3389f
        protected void B() {
            e.this.cancel();
        }
    }

    public e(z client, B originalRequest, boolean z10) {
        AbstractC2855l.g(client, "client");
        AbstractC2855l.g(originalRequest, "originalRequest");
        this.f29005v = client;
        this.f29006w = originalRequest;
        this.f29007x = z10;
        this.f28990g = client.o().a();
        this.f28991h = client.u().a(this);
        c cVar = new c();
        cVar.g(client.k(), TimeUnit.MILLISECONDS);
        C2735B c2735b = C2735B.f28704a;
        this.f28992i = cVar;
        this.f28993j = new AtomicBoolean();
        this.f29001r = true;
    }

    private final IOException A(IOException iOException) {
        if (this.f28997n || !this.f28992i.w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String B() {
        StringBuilder sb = new StringBuilder();
        sb.append(s() ? "canceled " : PointerEventHelper.POINTER_TYPE_UNKNOWN);
        sb.append(this.f29007x ? "web socket" : "call");
        sb.append(" to ");
        sb.append(v());
        return sb.toString();
    }

    private final IOException e(IOException iOException) {
        Socket socketW;
        boolean z10 = f9.c.f27872h;
        if (z10 && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        f fVar = this.f28996m;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread2 = Thread.currentThread();
                AbstractC2855l.f(threadCurrentThread2, "Thread.currentThread()");
                sb2.append(threadCurrentThread2.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(fVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (fVar) {
                socketW = w();
            }
            if (this.f28996m == null) {
                if (socketW != null) {
                    f9.c.k(socketW);
                }
                this.f28991h.l(this, fVar);
            } else {
                if (!(socketW == null)) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
        IOException iOExceptionA = A(iOException);
        if (iOException == null) {
            this.f28991h.d(this);
            return iOExceptionA;
        }
        r rVar = this.f28991h;
        AbstractC2855l.d(iOExceptionA);
        rVar.e(this, iOExceptionA);
        return iOExceptionA;
    }

    private final void f() {
        this.f28994k = o9.j.f30594c.g().i("response.body().close()");
        this.f28991h.f(this);
    }

    private final C2433a h(u uVar) {
        SSLSocketFactory sSLSocketFactoryM;
        HostnameVerifier hostnameVerifierY;
        C2439g c2439gM;
        if (uVar.i()) {
            sSLSocketFactoryM = this.f29005v.M();
            hostnameVerifierY = this.f29005v.y();
            c2439gM = this.f29005v.m();
        } else {
            sSLSocketFactoryM = null;
            hostnameVerifierY = null;
            c2439gM = null;
        }
        return new C2433a(uVar.h(), uVar.l(), this.f29005v.t(), this.f29005v.L(), sSLSocketFactoryM, hostnameVerifierY, c2439gM, this.f29005v.H(), this.f29005v.G(), this.f29005v.F(), this.f29005v.p(), this.f29005v.I());
    }

    public final void c(f connection) {
        AbstractC2855l.g(connection, "connection");
        if (!f9.c.f27872h || Thread.holdsLock(connection)) {
            if (!(this.f28996m == null)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f28996m = connection;
            connection.n().add(new b(this, this.f28994k));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }

    @Override // e9.InterfaceC2437e
    public void cancel() {
        if (this.f29002s) {
            return;
        }
        this.f29002s = true;
        j9.c cVar = this.f29003t;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f29004u;
        if (fVar != null) {
            fVar.d();
        }
        this.f28991h.g(this);
    }

    @Override // e9.InterfaceC2437e
    public B d() {
        return this.f29006w;
    }

    @Override // e9.InterfaceC2437e
    public D execute() {
        if (!this.f28993j.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f28992i.v();
        f();
        try {
            this.f29005v.r().b(this);
            return q();
        } finally {
            this.f29005v.r().g(this);
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.f29005v, this.f29006w, this.f29007x);
    }

    public final void i(B request, boolean z10) {
        AbstractC2855l.g(request, "request");
        if (!(this.f28998o == null)) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f29000q) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f28999p) {
                throw new IllegalStateException("Check failed.");
            }
            C2735B c2735b = C2735B.f28704a;
        }
        if (z10) {
            this.f28995l = new d(this.f28990g, h(request.p()), this, this.f28991h);
        }
    }

    public final void j(boolean z10) {
        j9.c cVar;
        synchronized (this) {
            if (!this.f29001r) {
                throw new IllegalStateException("released");
            }
            C2735B c2735b = C2735B.f28704a;
        }
        if (z10 && (cVar = this.f29003t) != null) {
            cVar.d();
        }
        this.f28998o = null;
    }

    public final z k() {
        return this.f29005v;
    }

    public final f l() {
        return this.f28996m;
    }

    public final r m() {
        return this.f28991h;
    }

    public final boolean n() {
        return this.f29007x;
    }

    public final j9.c o() {
        return this.f28998o;
    }

    public final B p() {
        return this.f29006w;
    }

    public final D q() {
        ArrayList arrayList = new ArrayList();
        AbstractC2800q.A(arrayList, this.f29005v.z());
        arrayList.add(new k9.j(this.f29005v));
        arrayList.add(new k9.a(this.f29005v.q()));
        arrayList.add(new h9.a(this.f29005v.j()));
        arrayList.add(j9.a.f28958a);
        if (!this.f29007x) {
            AbstractC2800q.A(arrayList, this.f29005v.B());
        }
        arrayList.add(new k9.b(this.f29007x));
        try {
            try {
                D dA = new k9.g(this, arrayList, 0, null, this.f29006w, this.f29005v.n(), this.f29005v.J(), this.f29005v.O()).a(this.f29006w);
                if (s()) {
                    f9.c.j(dA);
                    throw new IOException("Canceled");
                }
                u(null);
                return dA;
            } catch (IOException e10) {
                IOException iOExceptionU = u(e10);
                if (iOExceptionU == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionU;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                u(null);
            }
            throw th;
        }
    }

    public final j9.c r(k9.g chain) throws IOException {
        AbstractC2855l.g(chain, "chain");
        synchronized (this) {
            if (!this.f29001r) {
                throw new IllegalStateException("released");
            }
            if (this.f29000q) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f28999p) {
                throw new IllegalStateException("Check failed.");
            }
            C2735B c2735b = C2735B.f28704a;
        }
        d dVar = this.f28995l;
        AbstractC2855l.d(dVar);
        j9.c cVar = new j9.c(this, this.f28991h, dVar, dVar.a(this.f29005v, chain));
        this.f28998o = cVar;
        this.f29003t = cVar;
        synchronized (this) {
            this.f28999p = true;
            this.f29000q = true;
        }
        if (this.f29002s) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    @Override // e9.InterfaceC2437e
    public boolean s() {
        return this.f29002s;
    }

    public final IOException t(j9.c exchange, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        AbstractC2855l.g(exchange, "exchange");
        if (AbstractC2855l.b(exchange, this.f29003t)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f28999p) {
                            if (z11 || !this.f29000q) {
                                z13 = false;
                            }
                            C2735B c2735b = C2735B.f28704a;
                        }
                        if (z10) {
                            this.f28999p = false;
                        }
                        if (z11) {
                            this.f29000q = false;
                        }
                        boolean z14 = this.f28999p;
                        boolean z15 = (z14 || this.f29000q) ? false : true;
                        if (!z14 && !this.f29000q && !this.f29001r) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                        C2735B c2735b2 = C2735B.f28704a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    C2735B c2735b22 = C2735B.f28704a;
                }
            }
            if (z12) {
                this.f29003t = null;
                f fVar = this.f28996m;
                if (fVar != null) {
                    fVar.s();
                }
            }
            if (z13) {
                return e(iOException);
            }
        }
        return iOException;
    }

    @Override // e9.InterfaceC2437e
    public void t0(InterfaceC2438f responseCallback) {
        AbstractC2855l.g(responseCallback, "responseCallback");
        if (!this.f28993j.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        f();
        this.f29005v.r().a(new a(this, responseCallback));
    }

    public final IOException u(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f29001r) {
                    this.f29001r = false;
                    if (!this.f28999p && !this.f29000q) {
                        z10 = true;
                    }
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? e(iOException) : iOException;
    }

    public final String v() {
        return this.f29006w.p().n();
    }

    public final Socket w() {
        f fVar = this.f28996m;
        AbstractC2855l.d(fVar);
        if (f9.c.f27872h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        }
        List listN = fVar.n();
        Iterator it = listN.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC2855l.b((e) ((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (!(i10 != -1)) {
            throw new IllegalStateException("Check failed.");
        }
        listN.remove(i10);
        this.f28996m = null;
        if (listN.isEmpty()) {
            fVar.C(System.nanoTime());
            if (this.f28990g.c(fVar)) {
                return fVar.E();
            }
        }
        return null;
    }

    public final boolean x() {
        d dVar = this.f28995l;
        AbstractC2855l.d(dVar);
        return dVar.e();
    }

    public final void y(f fVar) {
        this.f29004u = fVar;
    }

    public final void z() {
        if (this.f28997n) {
            throw new IllegalStateException("Check failed.");
        }
        this.f28997n = true;
        this.f28992i.w();
    }
}
