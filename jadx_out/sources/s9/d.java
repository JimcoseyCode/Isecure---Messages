package s9;

import P8.q;
import e9.A;
import e9.B;
import e9.D;
import e9.H;
import e9.I;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import e9.r;
import e9.z;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.g;
import t9.InterfaceC3392i;
import t9.j;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements H, g.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final b f32343A = new b(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List f32344z = AbstractC2800q.e(A.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC2437e f32346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i9.a f32347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s9.g f32348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s9.h f32349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i9.d f32350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbstractC0360d f32352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque f32353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f32354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f32355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f32356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f32358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f32360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f32363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B f32364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final I f32365u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Random f32366v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f32367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private s9.e f32368x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f32369y;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k f32371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f32372c;

        public a(int i10, k kVar, long j10) {
            this.f32370a = i10;
            this.f32371b = kVar;
            this.f32372c = j10;
        }

        public final long a() {
            return this.f32372c;
        }

        public final int b() {
            return this.f32370a;
        }

        public final k c() {
            return this.f32371b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k f32374b;

        public c(int i10, k data) {
            AbstractC2855l.g(data, "data");
            this.f32373a = i10;
            this.f32374b = data;
        }

        public final k a() {
            return this.f32374b;
        }

        public final int b() {
            return this.f32373a;
        }
    }

    /* JADX INFO: renamed from: s9.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractC0360d implements Closeable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f32375g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final j f32376h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final InterfaceC3392i f32377i;

        public AbstractC0360d(boolean z10, j source, InterfaceC3392i sink) {
            AbstractC2855l.g(source, "source");
            AbstractC2855l.g(sink, "sink");
            this.f32375g = z10;
            this.f32376h = source;
            this.f32377i = sink;
        }

        public final boolean d() {
            return this.f32375g;
        }

        public final InterfaceC3392i e() {
            return this.f32377i;
        }

        public final j k() {
            return this.f32376h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class e extends i9.a {
        public e() {
            super(d.this.f32351g + " writer", false, 2, null);
        }

        @Override // i9.a
        public long f() {
            try {
                return d.this.w() ? 0L : -1L;
            } catch (IOException e10) {
                d.this.p(e10, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class f implements InterfaceC2438f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ B f32380h;

        f(B b10) {
            this.f32380h = b10;
        }

        @Override // e9.InterfaceC2438f
        public void onFailure(InterfaceC2437e call, IOException e10) {
            AbstractC2855l.g(call, "call");
            AbstractC2855l.g(e10, "e");
            d.this.p(e10, null);
        }

        @Override // e9.InterfaceC2438f
        public void onResponse(InterfaceC2437e call, D response) throws Throwable {
            AbstractC2855l.g(call, "call");
            AbstractC2855l.g(response, "response");
            j9.c cVarJ = response.J();
            try {
                d.this.m(response, cVarJ);
                AbstractC2855l.d(cVarJ);
                AbstractC0360d abstractC0360dM = cVarJ.m();
                s9.e eVarA = s9.e.f32398g.a(response.g0());
                d.this.f32368x = eVarA;
                if (!d.this.s(eVarA)) {
                    synchronized (d.this) {
                        d.this.f32354j.clear();
                        d.this.d(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    d.this.r(f9.c.f27873i + " WebSocket " + this.f32380h.p().n(), abstractC0360dM);
                    d.this.q().onOpen(d.this, response);
                    d.this.t();
                } catch (Exception e10) {
                    d.this.p(e10, null);
                }
            } catch (IOException e11) {
                if (cVarJ != null) {
                    cVarJ.u();
                }
                d.this.p(e11, response);
                f9.c.j(response);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class g extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f32381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f32382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f32383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f32384h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC0360d f32385i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ s9.e f32386j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, long j10, d dVar, String str3, AbstractC0360d abstractC0360d, s9.e eVar) {
            super(str2, false, 2, null);
            this.f32381e = str;
            this.f32382f = j10;
            this.f32383g = dVar;
            this.f32384h = str3;
            this.f32385i = abstractC0360d;
            this.f32386j = eVar;
        }

        @Override // i9.a
        public long f() {
            this.f32383g.x();
            return this.f32382f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class h extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f32387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f32388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f32389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ s9.h f32390h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ k f32391i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C f32392j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.A f32393k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ C f32394l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C f32395m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C f32396n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ C f32397o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, String str2, boolean z11, d dVar, s9.h hVar, k kVar, C c10, kotlin.jvm.internal.A a10, C c11, C c12, C c13, C c14) {
            super(str2, z11);
            this.f32387e = str;
            this.f32388f = z10;
            this.f32389g = dVar;
            this.f32390h = hVar;
            this.f32391i = kVar;
            this.f32392j = c10;
            this.f32393k = a10;
            this.f32394l = c11;
            this.f32395m = c12;
            this.f32396n = c13;
            this.f32397o = c14;
        }

        @Override // i9.a
        public long f() {
            this.f32389g.l();
            return -1L;
        }
    }

    public d(i9.e taskRunner, B originalRequest, I listener, Random random, long j10, s9.e eVar, long j11) {
        AbstractC2855l.g(taskRunner, "taskRunner");
        AbstractC2855l.g(originalRequest, "originalRequest");
        AbstractC2855l.g(listener, "listener");
        AbstractC2855l.g(random, "random");
        this.f32364t = originalRequest;
        this.f32365u = listener;
        this.f32366v = random;
        this.f32367w = j10;
        this.f32368x = eVar;
        this.f32369y = j11;
        this.f32350f = taskRunner.i();
        this.f32353i = new ArrayDeque();
        this.f32354j = new ArrayDeque();
        this.f32357m = -1;
        if (!AbstractC2855l.b("GET", originalRequest.l())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.l()).toString());
        }
        k.a aVar = k.f32603j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        C2735B c2735b = C2735B.f28704a;
        this.f32345a = k.a.j(aVar, bArr, 0, 0, 3, null).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s(s9.e eVar) {
        if (eVar.f32404f || eVar.f32400b != null) {
            return false;
        }
        Integer num = eVar.f32402d;
        if (num == null) {
            return true;
        }
        int iIntValue = num.intValue();
        return 8 <= iIntValue && 15 >= iIntValue;
    }

    private final void u() {
        if (!f9.c.f27872h || Thread.holdsLock(this)) {
            i9.a aVar = this.f32347c;
            if (aVar != null) {
                i9.d.j(this.f32350f, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    private final synchronized boolean v(k kVar, int i10) {
        if (!this.f32359o && !this.f32356l) {
            if (this.f32355k + ((long) kVar.E()) > 16777216) {
                d(1001, null);
                return false;
            }
            this.f32355k += (long) kVar.E();
            this.f32354j.add(new c(i10, kVar));
            u();
            return true;
        }
        return false;
    }

    @Override // s9.g.a
    public synchronized void a(k payload) {
        try {
            AbstractC2855l.g(payload, "payload");
            if (!this.f32359o && (!this.f32356l || !this.f32354j.isEmpty())) {
                this.f32353i.add(payload);
                u();
                this.f32361q++;
            }
        } finally {
        }
    }

    @Override // s9.g.a
    public void b(String text) {
        AbstractC2855l.g(text, "text");
        this.f32365u.onMessage(this, text);
    }

    @Override // e9.H
    public boolean c(k bytes) {
        AbstractC2855l.g(bytes, "bytes");
        return v(bytes, 2);
    }

    @Override // e9.H
    public boolean d(int i10, String str) {
        return n(i10, str, 60000L);
    }

    @Override // s9.g.a
    public synchronized void e(k payload) {
        AbstractC2855l.g(payload, "payload");
        this.f32362r++;
        this.f32363s = false;
    }

    @Override // s9.g.a
    public void f(k bytes) {
        AbstractC2855l.g(bytes, "bytes");
        this.f32365u.onMessage(this, bytes);
    }

    @Override // s9.g.a
    public void g(int i10, String reason) {
        AbstractC0360d abstractC0360d;
        s9.g gVar;
        s9.h hVar;
        AbstractC2855l.g(reason, "reason");
        if (!(i10 != -1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (!(this.f32357m == -1)) {
                    throw new IllegalStateException("already closed");
                }
                this.f32357m = i10;
                this.f32358n = reason;
                abstractC0360d = null;
                if (this.f32356l && this.f32354j.isEmpty()) {
                    AbstractC0360d abstractC0360d2 = this.f32352h;
                    this.f32352h = null;
                    gVar = this.f32348d;
                    this.f32348d = null;
                    hVar = this.f32349e;
                    this.f32349e = null;
                    this.f32350f.n();
                    abstractC0360d = abstractC0360d2;
                } else {
                    gVar = null;
                    hVar = null;
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f32365u.onClosing(this, i10, reason);
            if (abstractC0360d != null) {
                this.f32365u.onClosed(this, i10, reason);
            }
        } finally {
            if (abstractC0360d != null) {
                f9.c.j(abstractC0360d);
            }
            if (gVar != null) {
                f9.c.j(gVar);
            }
            if (hVar != null) {
                f9.c.j(hVar);
            }
        }
    }

    public void l() {
        InterfaceC2437e interfaceC2437e = this.f32346b;
        AbstractC2855l.d(interfaceC2437e);
        interfaceC2437e.cancel();
    }

    public final void m(D response, j9.c cVar) throws ProtocolException {
        AbstractC2855l.g(response, "response");
        if (response.I() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.I() + ' ' + response.l0() + '\'');
        }
        String strD0 = D.d0(response, "Connection", null, 2, null);
        if (!q.x("Upgrade", strD0, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strD0 + '\'');
        }
        String strD02 = D.d0(response, "Upgrade", null, 2, null);
        if (!q.x("websocket", strD02, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strD02 + '\'');
        }
        String strD03 = D.d0(response, "Sec-WebSocket-Accept", null, 2, null);
        String strJ = k.f32603j.g(this.f32345a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").C().j();
        if (AbstractC2855l.b(strJ, strD03)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strJ + "' but was '" + strD03 + '\'');
    }

    public final synchronized boolean n(int i10, String str, long j10) {
        k kVarG;
        try {
            s9.f.f32405a.c(i10);
            if (str != null) {
                kVarG = k.f32603j.g(str);
                if (!(((long) kVarG.E()) <= 123)) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                kVarG = null;
            }
            if (!this.f32359o && !this.f32356l) {
                this.f32356l = true;
                this.f32354j.add(new a(i10, kVarG, j10));
                u();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void o(z client) {
        AbstractC2855l.g(client, "client");
        if (this.f32364t.h("Sec-WebSocket-Extensions") != null) {
            p(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        z zVarC = client.C().h(r.f26310a).O(f32344z).c();
        B b10 = this.f32364t.m().e("Upgrade", "websocket").e("Connection", "Upgrade").e("Sec-WebSocket-Key", this.f32345a).e("Sec-WebSocket-Version", "13").e("Sec-WebSocket-Extensions", "permessage-deflate").b();
        j9.e eVar = new j9.e(zVarC, b10, true);
        this.f32346b = eVar;
        AbstractC2855l.d(eVar);
        eVar.t0(new f(b10));
    }

    public final void p(Exception e10, D d10) {
        AbstractC2855l.g(e10, "e");
        synchronized (this) {
            if (this.f32359o) {
                return;
            }
            this.f32359o = true;
            AbstractC0360d abstractC0360d = this.f32352h;
            this.f32352h = null;
            s9.g gVar = this.f32348d;
            this.f32348d = null;
            s9.h hVar = this.f32349e;
            this.f32349e = null;
            this.f32350f.n();
            C2735B c2735b = C2735B.f28704a;
            try {
                this.f32365u.onFailure(this, e10, d10);
            } finally {
                if (abstractC0360d != null) {
                    f9.c.j(abstractC0360d);
                }
                if (gVar != null) {
                    f9.c.j(gVar);
                }
                if (hVar != null) {
                    f9.c.j(hVar);
                }
            }
        }
    }

    public final I q() {
        return this.f32365u;
    }

    public final void r(String name, AbstractC0360d streams) throws Throwable {
        d dVar = this;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(streams, "streams");
        s9.e eVar = dVar.f32368x;
        AbstractC2855l.d(eVar);
        synchronized (this) {
            try {
                dVar.f32351g = name;
                dVar.f32352h = streams;
                dVar.f32349e = new s9.h(streams.d(), streams.e(), dVar.f32366v, eVar.f32399a, eVar.a(streams.d()), dVar.f32369y);
                dVar.f32347c = dVar.new e();
                long j10 = dVar.f32367w;
                if (j10 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    i9.d dVar2 = dVar.f32350f;
                    String str = name + " ping";
                    try {
                        try {
                            dVar = this;
                            dVar2.i(new g(str, str, nanos, this, name, streams, eVar), nanos);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (!dVar.f32354j.isEmpty()) {
                    dVar.u();
                }
                C2735B c2735b = C2735B.f28704a;
                dVar.f32348d = new s9.g(streams.d(), streams.k(), dVar, eVar.f32399a, eVar.a(!streams.d()));
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // e9.H
    public boolean send(String text) {
        AbstractC2855l.g(text, "text");
        return v(k.f32603j.g(text), 1);
    }

    public final void t() {
        while (this.f32357m == -1) {
            s9.g gVar = this.f32348d;
            AbstractC2855l.d(gVar);
            gVar.d();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final boolean w() {
        C c10 = new C();
        c10.f29371g = null;
        kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
        a10.f29369g = -1;
        C c11 = new C();
        c11.f29371g = null;
        C c12 = new C();
        c12.f29371g = null;
        C c13 = new C();
        c13.f29371g = null;
        C c14 = new C();
        c14.f29371g = null;
        synchronized (this) {
            try {
                if (this.f32359o) {
                    return false;
                }
                s9.h hVar = this.f32349e;
                k kVar = (k) this.f32353i.poll();
                if (kVar == null) {
                    Object objPoll = this.f32354j.poll();
                    c10.f29371g = objPoll;
                    if (objPoll instanceof a) {
                        int i10 = this.f32357m;
                        a10.f29369g = i10;
                        c11.f29371g = this.f32358n;
                        if (i10 != -1) {
                            c12.f29371g = this.f32352h;
                            this.f32352h = null;
                            c13.f29371g = this.f32348d;
                            this.f32348d = null;
                            c14.f29371g = this.f32349e;
                            this.f32349e = null;
                            this.f32350f.n();
                        } else {
                            Object obj = c10.f29371g;
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                            }
                            long jA = ((a) obj).a();
                            i9.d dVar = this.f32350f;
                            String str = this.f32351g + " cancel";
                            dVar.i(new h(str, true, str, true, this, hVar, kVar, c10, a10, c11, c12, c13, c14), TimeUnit.MILLISECONDS.toNanos(jA));
                        }
                    } else if (objPoll == null) {
                        return false;
                    }
                }
                C2735B c2735b = C2735B.f28704a;
                try {
                    if (kVar != null) {
                        AbstractC2855l.d(hVar);
                        hVar.r(kVar);
                    } else {
                        Object obj2 = c10.f29371g;
                        if (obj2 instanceof c) {
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
                            }
                            c cVar = (c) obj2;
                            AbstractC2855l.d(hVar);
                            hVar.k(cVar.b(), cVar.a());
                            synchronized (this) {
                                this.f32355k -= (long) cVar.a().E();
                            }
                        } else {
                            if (!(obj2 instanceof a)) {
                                throw new AssertionError();
                            }
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                            }
                            a aVar = (a) obj2;
                            AbstractC2855l.d(hVar);
                            hVar.d(aVar.b(), aVar.c());
                            if (((AbstractC0360d) c12.f29371g) != null) {
                                I i11 = this.f32365u;
                                int i12 = a10.f29369g;
                                String str2 = (String) c11.f29371g;
                                AbstractC2855l.d(str2);
                                i11.onClosed(this, i12, str2);
                            }
                        }
                    }
                    AbstractC0360d abstractC0360d = (AbstractC0360d) c12.f29371g;
                    if (abstractC0360d != null) {
                        f9.c.j(abstractC0360d);
                    }
                    s9.g gVar = (s9.g) c13.f29371g;
                    if (gVar != null) {
                        f9.c.j(gVar);
                    }
                    s9.h hVar2 = (s9.h) c14.f29371g;
                    if (hVar2 != null) {
                        f9.c.j(hVar2);
                    }
                    return true;
                } catch (Throwable th) {
                    AbstractC0360d abstractC0360d2 = (AbstractC0360d) c12.f29371g;
                    if (abstractC0360d2 != null) {
                        f9.c.j(abstractC0360d2);
                    }
                    s9.g gVar2 = (s9.g) c13.f29371g;
                    if (gVar2 != null) {
                        f9.c.j(gVar2);
                    }
                    s9.h hVar3 = (s9.h) c14.f29371g;
                    if (hVar3 != null) {
                        f9.c.j(hVar3);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        synchronized (this) {
            try {
                if (this.f32359o) {
                    return;
                }
                s9.h hVar = this.f32349e;
                if (hVar != null) {
                    int i10 = this.f32363s ? this.f32360p : -1;
                    this.f32360p++;
                    this.f32363s = true;
                    C2735B c2735b = C2735B.f28704a;
                    if (i10 == -1) {
                        try {
                            hVar.m(k.f32604k);
                            return;
                        } catch (IOException e10) {
                            p(e10, null);
                            return;
                        }
                    }
                    p(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f32367w + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
