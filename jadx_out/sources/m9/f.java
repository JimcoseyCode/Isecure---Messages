package m9;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.h;
import t9.C3391h;
import t9.InterfaceC3392i;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final m f29830I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final c f29831J = new c(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f29832A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f29833B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f29834C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f29835D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Socket f29836E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final m9.j f29837F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final e f29838G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Set f29839H;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f29840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f29841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f29842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f29843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i9.e f29847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i9.d f29848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final i9.d f29849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i9.d f29850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m9.l f29851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f29852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f29853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f29854u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f29855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f29856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f29857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final m f29858y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private m f29859z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f29861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f29862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j10) {
            super(str2, false, 2, null);
            this.f29860e = str;
            this.f29861f = fVar;
            this.f29862g = j10;
        }

        @Override // i9.a
        public long f() {
            boolean z10;
            synchronized (this.f29861f) {
                if (this.f29861f.f29853t < this.f29861f.f29852s) {
                    z10 = true;
                } else {
                    this.f29861f.f29852s++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f29861f.u0(null);
                return -1L;
            }
            this.f29861f.i1(false, 1, 0);
            return this.f29862g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Socket f29863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f29864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t9.j f29865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC3392i f29866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f29867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private m9.l f29868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29870h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final i9.e f29871i;

        public b(boolean z10, i9.e taskRunner) {
            AbstractC2855l.g(taskRunner, "taskRunner");
            this.f29870h = z10;
            this.f29871i = taskRunner;
            this.f29867e = d.f29872a;
            this.f29868f = m9.l.f30002a;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f29870h;
        }

        public final String c() {
            String str = this.f29864b;
            if (str == null) {
                AbstractC2855l.y("connectionName");
            }
            return str;
        }

        public final d d() {
            return this.f29867e;
        }

        public final int e() {
            return this.f29869g;
        }

        public final m9.l f() {
            return this.f29868f;
        }

        public final InterfaceC3392i g() {
            InterfaceC3392i interfaceC3392i = this.f29866d;
            if (interfaceC3392i == null) {
                AbstractC2855l.y("sink");
            }
            return interfaceC3392i;
        }

        public final Socket h() {
            Socket socket = this.f29863a;
            if (socket == null) {
                AbstractC2855l.y("socket");
            }
            return socket;
        }

        public final t9.j i() {
            t9.j jVar = this.f29865c;
            if (jVar == null) {
                AbstractC2855l.y("source");
            }
            return jVar;
        }

        public final i9.e j() {
            return this.f29871i;
        }

        public final b k(d listener) {
            AbstractC2855l.g(listener, "listener");
            this.f29867e = listener;
            return this;
        }

        public final b l(int i10) {
            this.f29869g = i10;
            return this;
        }

        public final b m(Socket socket, String peerName, t9.j source, InterfaceC3392i sink) {
            String str;
            AbstractC2855l.g(socket, "socket");
            AbstractC2855l.g(peerName, "peerName");
            AbstractC2855l.g(source, "source");
            AbstractC2855l.g(sink, "sink");
            this.f29863a = socket;
            if (this.f29870h) {
                str = f9.c.f27873i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            this.f29864b = str;
            this.f29865c = source;
            this.f29866d = sink;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {
        private c() {
        }

        public final m a() {
            return f.f29830I;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f29873b = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f29872a = new a();

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends d {
            a() {
            }

            @Override // m9.f.d
            public void b(m9.i stream) {
                AbstractC2855l.g(stream, "stream");
                stream.d(m9.b.REFUSED_STREAM, null);
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

        public void a(f connection, m settings) {
            AbstractC2855l.g(connection, "connection");
            AbstractC2855l.g(settings, "settings");
        }

        public abstract void b(m9.i iVar);
    }

    /* JADX INFO: renamed from: m9.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0322f extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f29904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f29905h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ C3391h f29906i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f29907j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f29908k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0322f(String str, boolean z10, String str2, boolean z11, f fVar, int i10, C3391h c3391h, int i11, boolean z12) {
            super(str2, z11);
            this.f29902e = str;
            this.f29903f = z10;
            this.f29904g = fVar;
            this.f29905h = i10;
            this.f29906i = c3391h;
            this.f29907j = i11;
            this.f29908k = z12;
        }

        @Override // i9.a
        public long f() {
            try {
                boolean zA = this.f29904g.f29851r.a(this.f29905h, this.f29906i, this.f29907j, this.f29908k);
                if (zA) {
                    this.f29904g.P0().M(this.f29905h, m9.b.CANCEL);
                }
                if (!zA && !this.f29908k) {
                    return -1L;
                }
                synchronized (this.f29904g) {
                    this.f29904g.f29839H.remove(Integer.valueOf(this.f29905h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class g extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f29911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f29912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f29913i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f29914j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, String str2, boolean z11, f fVar, int i10, List list, boolean z12) {
            super(str2, z11);
            this.f29909e = str;
            this.f29910f = z10;
            this.f29911g = fVar;
            this.f29912h = i10;
            this.f29913i = list;
            this.f29914j = z12;
        }

        @Override // i9.a
        public long f() {
            boolean zD = this.f29911g.f29851r.d(this.f29912h, this.f29913i, this.f29914j);
            if (zD) {
                try {
                    this.f29911g.P0().M(this.f29912h, m9.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zD && !this.f29914j) {
                return -1L;
            }
            synchronized (this.f29911g) {
                this.f29911g.f29839H.remove(Integer.valueOf(this.f29912h));
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class h extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f29917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f29918h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f29919i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, String str2, boolean z11, f fVar, int i10, List list) {
            super(str2, z11);
            this.f29915e = str;
            this.f29916f = z10;
            this.f29917g = fVar;
            this.f29918h = i10;
            this.f29919i = list;
        }

        @Override // i9.a
        public long f() {
            if (!this.f29917g.f29851r.c(this.f29918h, this.f29919i)) {
                return -1L;
            }
            try {
                this.f29917g.P0().M(this.f29918h, m9.b.CANCEL);
                synchronized (this.f29917g) {
                    this.f29917g.f29839H.remove(Integer.valueOf(this.f29918h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class i extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f29922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f29923h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ m9.b f29924i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, String str2, boolean z11, f fVar, int i10, m9.b bVar) {
            super(str2, z11);
            this.f29920e = str;
            this.f29921f = z10;
            this.f29922g = fVar;
            this.f29923h = i10;
            this.f29924i = bVar;
        }

        @Override // i9.a
        public long f() {
            this.f29922g.f29851r.b(this.f29923h, this.f29924i);
            synchronized (this.f29922g) {
                this.f29922g.f29839H.remove(Integer.valueOf(this.f29923h));
                C2735B c2735b = C2735B.f28704a;
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class j extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f29927g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z10, String str2, boolean z11, f fVar) {
            super(str2, z11);
            this.f29925e = str;
            this.f29926f = z10;
            this.f29927g = fVar;
        }

        @Override // i9.a
        public long f() {
            this.f29927g.i1(false, 2, 0);
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class k extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f29930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f29931h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ m9.b f29932i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, String str2, boolean z11, f fVar, int i10, m9.b bVar) {
            super(str2, z11);
            this.f29928e = str;
            this.f29929f = z10;
            this.f29930g = fVar;
            this.f29931h = i10;
            this.f29932i = bVar;
        }

        @Override // i9.a
        public long f() {
            try {
                this.f29930g.j1(this.f29931h, this.f29932i);
                return -1L;
            } catch (IOException e10) {
                this.f29930g.u0(e10);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class l extends i9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f29935g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f29936h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f29937i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, String str2, boolean z11, f fVar, int i10, long j10) {
            super(str2, z11);
            this.f29933e = str;
            this.f29934f = z10;
            this.f29935g = fVar;
            this.f29936h = i10;
            this.f29937i = j10;
        }

        @Override // i9.a
        public long f() {
            try {
                this.f29935g.P0().X(this.f29936h, this.f29937i);
                return -1L;
            } catch (IOException e10) {
                this.f29935g.u0(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f29830I = mVar;
    }

    public f(b builder) {
        AbstractC2855l.g(builder, "builder");
        boolean zB = builder.b();
        this.f29840g = zB;
        this.f29841h = builder.d();
        this.f29842i = new LinkedHashMap();
        String strC = builder.c();
        this.f29843j = strC;
        this.f29845l = builder.b() ? 3 : 2;
        i9.e eVarJ = builder.j();
        this.f29847n = eVarJ;
        i9.d dVarI = eVarJ.i();
        this.f29848o = dVarI;
        this.f29849p = eVarJ.i();
        this.f29850q = eVarJ.i();
        this.f29851r = builder.f();
        m mVar = new m();
        if (builder.b()) {
            mVar.h(7, PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
        }
        C2735B c2735b = C2735B.f28704a;
        this.f29858y = mVar;
        this.f29859z = f29830I;
        this.f29835D = r2.c();
        this.f29836E = builder.h();
        this.f29837F = new m9.j(builder.g(), zB);
        this.f29838G = new e(this, new m9.h(builder.i(), zB));
        this.f29839H = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            String str = strC + " ping";
            dVarI.i(new a(str, str, this, nanos), nanos);
        }
    }

    private final m9.i R0(int i10, List list, boolean z10) throws Throwable {
        Throwable th;
        boolean z11 = !z10;
        synchronized (this.f29837F) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f29845l > 1073741823) {
                                try {
                                    c1(m9.b.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            try {
                                if (this.f29846m) {
                                    throw new m9.a();
                                }
                                int i11 = this.f29845l;
                                this.f29845l = i11 + 2;
                                m9.i iVar = new m9.i(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.f29834C >= this.f29835D || iVar.r() >= iVar.q();
                                if (iVar.u()) {
                                    this.f29842i.put(Integer.valueOf(i11), iVar);
                                }
                                C2735B c2735b = C2735B.f28704a;
                                if (i10 == 0) {
                                    this.f29837F.A(z11, i11, list);
                                } else {
                                    if (this.f29840g) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f29837F.J(i10, i11, list);
                                }
                                if (z12) {
                                    this.f29837F.flush();
                                }
                                return iVar;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        th = th;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public static /* synthetic */ void e1(f fVar, boolean z10, i9.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = i9.e.f28848h;
        }
        fVar.d1(z10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(IOException iOException) {
        m9.b bVar = m9.b.PROTOCOL_ERROR;
        t0(bVar, bVar, iOException);
    }

    public final int A0() {
        return this.f29844k;
    }

    public final d D0() {
        return this.f29841h;
    }

    public final int J0() {
        return this.f29845l;
    }

    public final m K0() {
        return this.f29858y;
    }

    public final m L0() {
        return this.f29859z;
    }

    public final synchronized m9.i M0(int i10) {
        return (m9.i) this.f29842i.get(Integer.valueOf(i10));
    }

    public final Map N0() {
        return this.f29842i;
    }

    public final long O0() {
        return this.f29835D;
    }

    public final m9.j P0() {
        return this.f29837F;
    }

    public final synchronized boolean Q0(long j10) {
        if (this.f29846m) {
            return false;
        }
        if (this.f29855v < this.f29854u) {
            if (j10 >= this.f29857x) {
                return false;
            }
        }
        return true;
    }

    public final m9.i S0(List requestHeaders, boolean z10) {
        AbstractC2855l.g(requestHeaders, "requestHeaders");
        return R0(0, requestHeaders, z10);
    }

    public final void T0(int i10, t9.j source, int i11, boolean z10) {
        AbstractC2855l.g(source, "source");
        C3391h c3391h = new C3391h();
        long j10 = i11;
        source.B0(j10);
        source.read(c3391h, j10);
        i9.d dVar = this.f29849p;
        String str = this.f29843j + '[' + i10 + "] onData";
        dVar.i(new C0322f(str, true, str, true, this, i10, c3391h, i11, z10), 0L);
    }

    public final void U0(int i10, List requestHeaders, boolean z10) {
        AbstractC2855l.g(requestHeaders, "requestHeaders");
        i9.d dVar = this.f29849p;
        String str = this.f29843j + '[' + i10 + "] onHeaders";
        dVar.i(new g(str, true, str, true, this, i10, requestHeaders, z10), 0L);
    }

    public final void V0(int i10, List requestHeaders) throws Throwable {
        Throwable th;
        AbstractC2855l.g(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.f29839H.contains(Integer.valueOf(i10))) {
                    this.f29839H.add(Integer.valueOf(i10));
                    i9.d dVar = this.f29849p;
                    String str = this.f29843j + '[' + i10 + "] onRequest";
                    dVar.i(new h(str, true, str, true, this, i10, requestHeaders), 0L);
                    return;
                }
                try {
                    k1(i10, m9.b.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    public final void W0(int i10, m9.b errorCode) {
        AbstractC2855l.g(errorCode, "errorCode");
        i9.d dVar = this.f29849p;
        String str = this.f29843j + '[' + i10 + "] onReset";
        dVar.i(new i(str, true, str, true, this, i10, errorCode), 0L);
    }

    public final boolean X0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized m9.i Y0(int i10) {
        m9.i iVar;
        iVar = (m9.i) this.f29842i.remove(Integer.valueOf(i10));
        notifyAll();
        return iVar;
    }

    public final void Z0() {
        synchronized (this) {
            long j10 = this.f29855v;
            long j11 = this.f29854u;
            if (j10 < j11) {
                return;
            }
            this.f29854u = j11 + 1;
            this.f29857x = System.nanoTime() + ((long) 1000000000);
            C2735B c2735b = C2735B.f28704a;
            i9.d dVar = this.f29848o;
            String str = this.f29843j + " ping";
            dVar.i(new j(str, true, str, true, this), 0L);
        }
    }

    public final void a1(int i10) {
        this.f29844k = i10;
    }

    public final void b1(m mVar) {
        AbstractC2855l.g(mVar, "<set-?>");
        this.f29859z = mVar;
    }

    public final void c1(m9.b statusCode) {
        AbstractC2855l.g(statusCode, "statusCode");
        synchronized (this.f29837F) {
            synchronized (this) {
                if (this.f29846m) {
                    return;
                }
                this.f29846m = true;
                int i10 = this.f29844k;
                C2735B c2735b = C2735B.f28704a;
                this.f29837F.s(i10, statusCode, f9.c.f27865a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        t0(m9.b.NO_ERROR, m9.b.CANCEL, null);
    }

    public final void d1(boolean z10, i9.e taskRunner) {
        AbstractC2855l.g(taskRunner, "taskRunner");
        if (z10) {
            this.f29837F.e();
            this.f29837F.W(this.f29858y);
            if (this.f29858y.c() != 65535) {
                this.f29837F.X(0, r7 - 65535);
            }
        }
        i9.d dVarI = taskRunner.i();
        String str = this.f29843j;
        dVarI.i(new i9.c(this.f29838G, str, true, str, true), 0L);
    }

    public final synchronized void f1(long j10) {
        long j11 = this.f29832A + j10;
        this.f29832A = j11;
        long j12 = j11 - this.f29833B;
        if (j12 >= this.f29858y.c() / 2) {
            l1(0, j12);
            this.f29833B += j12;
        }
    }

    public final void flush() {
        this.f29837F.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f29837F.B());
        r6 = r2;
        r8.f29834C += r6;
        r4 = i7.C2735B.f28704a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1(int i10, boolean z10, C3391h c3391h, long j10) {
        int iMin;
        long j11;
        if (j10 == 0) {
            this.f29837F.k(z10, i10, c3391h, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j12 = this.f29834C;
                            long j13 = this.f29835D;
                            if (j12 < j13) {
                                break;
                            } else {
                                if (!this.f29842i.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            }
            j10 -= j11;
            this.f29837F.k(z10 && j10 == 0, i10, c3391h, iMin);
        }
    }

    public final void h1(int i10, boolean z10, List alternating) {
        AbstractC2855l.g(alternating, "alternating");
        this.f29837F.A(z10, i10, alternating);
    }

    public final void i1(boolean z10, int i10, int i11) {
        try {
            this.f29837F.I(z10, i10, i11);
        } catch (IOException e10) {
            u0(e10);
        }
    }

    public final void j1(int i10, m9.b statusCode) {
        AbstractC2855l.g(statusCode, "statusCode");
        this.f29837F.M(i10, statusCode);
    }

    public final void k1(int i10, m9.b errorCode) {
        AbstractC2855l.g(errorCode, "errorCode");
        i9.d dVar = this.f29848o;
        String str = this.f29843j + '[' + i10 + "] writeSynReset";
        dVar.i(new k(str, true, str, true, this, i10, errorCode), 0L);
    }

    public final void l1(int i10, long j10) {
        i9.d dVar = this.f29848o;
        String str = this.f29843j + '[' + i10 + "] windowUpdate";
        dVar.i(new l(str, true, str, true, this, i10, j10), 0L);
    }

    public final void t0(m9.b connectionCode, m9.b streamCode, IOException iOException) {
        int i10;
        m9.i[] iVarArr;
        AbstractC2855l.g(connectionCode, "connectionCode");
        AbstractC2855l.g(streamCode, "streamCode");
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
        try {
            c1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f29842i.isEmpty()) {
                    iVarArr = null;
                } else {
                    Object[] array = this.f29842i.values().toArray(new m9.i[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    iVarArr = (m9.i[]) array;
                    this.f29842i.clear();
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (m9.i iVar : iVarArr) {
                try {
                    iVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f29837F.close();
        } catch (IOException unused3) {
        }
        try {
            this.f29836E.close();
        } catch (IOException unused4) {
        }
        this.f29848o.n();
        this.f29849p.n();
        this.f29850q.n();
    }

    public final boolean w0() {
        return this.f29840g;
    }

    public final String y0() {
        return this.f29843j;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class e implements h.c, InterfaceC3487a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final m9.h f29874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f f29875h;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends i9.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f29876e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f29877f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f29878g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ C f29879h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f29880i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ m f29881j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ B f29882k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ C f29883l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, String str2, boolean z11, e eVar, C c10, boolean z12, m mVar, B b10, C c11) {
                super(str2, z11);
                this.f29876e = str;
                this.f29877f = z10;
                this.f29878g = eVar;
                this.f29879h = c10;
                this.f29880i = z12;
                this.f29881j = mVar;
                this.f29882k = b10;
                this.f29883l = c11;
            }

            @Override // i9.a
            public long f() {
                this.f29878g.f29875h.D0().a(this.f29878g.f29875h, (m) this.f29879h.f29371g);
                return -1L;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends i9.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f29884e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f29885f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m9.i f29886g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ e f29887h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ m9.i f29888i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f29889j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ List f29890k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f29891l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, String str2, boolean z11, m9.i iVar, e eVar, m9.i iVar2, int i10, List list, boolean z12) {
                super(str2, z11);
                this.f29884e = str;
                this.f29885f = z10;
                this.f29886g = iVar;
                this.f29887h = eVar;
                this.f29888i = iVar2;
                this.f29889j = i10;
                this.f29890k = list;
                this.f29891l = z12;
            }

            @Override // i9.a
            public long f() {
                try {
                    this.f29887h.f29875h.D0().b(this.f29886g);
                    return -1L;
                } catch (IOException e10) {
                    o9.j.f30594c.g().k("Http2Connection.Listener failure for " + this.f29887h.f29875h.y0(), 4, e10);
                    try {
                        this.f29886g.d(m9.b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class c extends i9.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f29892e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f29893f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f29894g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f29895h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f29896i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, String str2, boolean z11, e eVar, int i10, int i11) {
                super(str2, z11);
                this.f29892e = str;
                this.f29893f = z10;
                this.f29894g = eVar;
                this.f29895h = i10;
                this.f29896i = i11;
            }

            @Override // i9.a
            public long f() {
                this.f29894g.f29875h.i1(true, this.f29895h, this.f29896i);
                return -1L;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class d extends i9.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f29897e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f29898f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f29899g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f29900h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ m f29901i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z10, String str2, boolean z11, e eVar, boolean z12, m mVar) {
                super(str2, z11);
                this.f29897e = str;
                this.f29898f = z10;
                this.f29899g = eVar;
                this.f29900h = z12;
                this.f29901i = mVar;
            }

            @Override // i9.a
            public long f() {
                this.f29899g.t(this.f29900h, this.f29901i);
                return -1L;
            }
        }

        public e(f fVar, m9.h reader) {
            AbstractC2855l.g(reader, "reader");
            this.f29875h = fVar;
            this.f29874g = reader;
        }

        @Override // m9.h.c
        public void c(boolean z10, int i10, int i11, List headerBlock) {
            AbstractC2855l.g(headerBlock, "headerBlock");
            if (this.f29875h.X0(i10)) {
                this.f29875h.U0(i10, headerBlock, z10);
                return;
            }
            synchronized (this.f29875h) {
                m9.i iVarM0 = this.f29875h.M0(i10);
                if (iVarM0 != null) {
                    C2735B c2735b = C2735B.f28704a;
                    iVarM0.x(f9.c.M(headerBlock), z10);
                    return;
                }
                if (this.f29875h.f29846m) {
                    return;
                }
                if (i10 <= this.f29875h.A0()) {
                    return;
                }
                if (i10 % 2 == this.f29875h.J0() % 2) {
                    return;
                }
                m9.i iVar = new m9.i(i10, this.f29875h, false, z10, f9.c.M(headerBlock));
                this.f29875h.a1(i10);
                this.f29875h.N0().put(Integer.valueOf(i10), iVar);
                i9.d dVarI = this.f29875h.f29847n.i();
                String str = this.f29875h.y0() + '[' + i10 + "] onStream";
                dVarI.i(new b(str, true, str, true, iVar, this, iVarM0, i10, headerBlock, z10), 0L);
            }
        }

        @Override // m9.h.c
        public void d(int i10, long j10) {
            if (i10 != 0) {
                m9.i iVarM0 = this.f29875h.M0(i10);
                if (iVarM0 != null) {
                    synchronized (iVarM0) {
                        iVarM0.a(j10);
                        C2735B c2735b = C2735B.f28704a;
                    }
                    return;
                }
                return;
            }
            synchronized (this.f29875h) {
                f fVar = this.f29875h;
                fVar.f29835D = fVar.O0() + j10;
                f fVar2 = this.f29875h;
                if (fVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                fVar2.notifyAll();
                C2735B c2735b2 = C2735B.f28704a;
            }
        }

        @Override // m9.h.c
        public void f(int i10, m9.b errorCode, t9.k debugData) {
            int i11;
            m9.i[] iVarArr;
            AbstractC2855l.g(errorCode, "errorCode");
            AbstractC2855l.g(debugData, "debugData");
            debugData.E();
            synchronized (this.f29875h) {
                Object[] array = this.f29875h.N0().values().toArray(new m9.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                iVarArr = (m9.i[]) array;
                this.f29875h.f29846m = true;
                C2735B c2735b = C2735B.f28704a;
            }
            for (m9.i iVar : iVarArr) {
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(m9.b.REFUSED_STREAM);
                    this.f29875h.Y0(iVar.j());
                }
            }
        }

        @Override // m9.h.c
        public void g(boolean z10, int i10, t9.j source, int i11) {
            AbstractC2855l.g(source, "source");
            if (this.f29875h.X0(i10)) {
                this.f29875h.T0(i10, source, i11, z10);
                return;
            }
            m9.i iVarM0 = this.f29875h.M0(i10);
            if (iVarM0 == null) {
                this.f29875h.k1(i10, m9.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f29875h.f1(j10);
                source.skip(j10);
                return;
            }
            iVarM0.w(source, i11);
            if (z10) {
                iVarM0.x(f9.c.f27866b, true);
            }
        }

        @Override // w7.InterfaceC3487a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            u();
            return C2735B.f28704a;
        }

        @Override // m9.h.c
        public void j(int i10, m9.b errorCode) {
            AbstractC2855l.g(errorCode, "errorCode");
            if (this.f29875h.X0(i10)) {
                this.f29875h.W0(i10, errorCode);
                return;
            }
            m9.i iVarY0 = this.f29875h.Y0(i10);
            if (iVarY0 != null) {
                iVarY0.y(errorCode);
            }
        }

        @Override // m9.h.c
        public void l(boolean z10, int i10, int i11) {
            if (!z10) {
                i9.d dVar = this.f29875h.f29848o;
                String str = this.f29875h.y0() + " ping";
                dVar.i(new c(str, true, str, true, this, i10, i11), 0L);
                return;
            }
            synchronized (this.f29875h) {
                try {
                    if (i10 == 1) {
                        this.f29875h.f29853t++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            this.f29875h.f29856w++;
                            f fVar = this.f29875h;
                            if (fVar == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            fVar.notifyAll();
                        }
                        C2735B c2735b = C2735B.f28704a;
                    } else {
                        this.f29875h.f29855v++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // m9.h.c
        public void o(boolean z10, m settings) {
            AbstractC2855l.g(settings, "settings");
            i9.d dVar = this.f29875h.f29848o;
            String str = this.f29875h.y0() + " applyAndAckSettings";
            dVar.i(new d(str, true, str, true, this, z10, settings), 0L);
        }

        @Override // m9.h.c
        public void q(int i10, int i11, List requestHeaders) throws Throwable {
            AbstractC2855l.g(requestHeaders, "requestHeaders");
            this.f29875h.V0(i11, requestHeaders);
        }

        public final void t(boolean z10, m settings) {
            m mVar;
            m9.i[] iVarArr;
            AbstractC2855l.g(settings, "settings");
            B b10 = new B();
            C c10 = new C();
            C c11 = new C();
            synchronized (this.f29875h.P0()) {
                synchronized (this.f29875h) {
                    try {
                        m mVarL0 = this.f29875h.L0();
                        if (z10) {
                            mVar = settings;
                        } else {
                            mVar = new m();
                            mVar.g(mVarL0);
                            mVar.g(settings);
                            C2735B c2735b = C2735B.f28704a;
                        }
                        c11.f29371g = mVar;
                        long jC = ((long) mVar.c()) - ((long) mVarL0.c());
                        b10.f29370g = jC;
                        if (jC == 0 || this.f29875h.N0().isEmpty()) {
                            iVarArr = null;
                        } else {
                            Object[] array = this.f29875h.N0().values().toArray(new m9.i[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            iVarArr = (m9.i[]) array;
                        }
                        c10.f29371g = iVarArr;
                        this.f29875h.b1((m) c11.f29371g);
                        i9.d dVar = this.f29875h.f29850q;
                        String str = this.f29875h.y0() + " onSettings";
                        dVar.i(new a(str, true, str, true, this, c11, z10, settings, b10, c10), 0L);
                        C2735B c2735b2 = C2735B.f28704a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    this.f29875h.P0().d((m) c11.f29371g);
                } catch (IOException e10) {
                    this.f29875h.u0(e10);
                }
                C2735B c2735b3 = C2735B.f28704a;
            }
            Object obj = c10.f29371g;
            if (((m9.i[]) obj) != null) {
                m9.i[] iVarArr2 = (m9.i[]) obj;
                AbstractC2855l.d(iVarArr2);
                for (m9.i iVar : iVarArr2) {
                    synchronized (iVar) {
                        iVar.a(b10.f29370g);
                        C2735B c2735b4 = C2735B.f28704a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [m9.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, m9.h] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void u() throws Throwable {
            m9.b bVar;
            m9.b bVar2 = m9.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f29874g.k(this);
                    while (this.f29874g.e(false, this)) {
                    }
                    m9.b bVar3 = m9.b.NO_ERROR;
                    try {
                        this.f29875h.t0(bVar3, m9.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        m9.b bVar4 = m9.b.PROTOCOL_ERROR;
                        f fVar = this.f29875h;
                        fVar.t0(bVar4, bVar4, e10);
                        bVar = fVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f29875h.t0(bVar, bVar2, e10);
                    f9.c.j(this.f29874g);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.f29875h.t0(bVar, bVar2, e10);
                f9.c.j(this.f29874g);
                throw th;
            }
            bVar2 = this.f29874g;
            f9.c.j(bVar2);
        }

        @Override // m9.h.c
        public void a() {
        }

        @Override // m9.h.c
        public void n(int i10, int i11, int i12, boolean z10) {
        }
    }
}
