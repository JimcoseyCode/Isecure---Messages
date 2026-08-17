package h9;

import P8.o;
import P8.q;
import i7.C2735B;
import i7.C2742e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.n;
import t7.AbstractC3376c;
import t9.D;
import t9.F;
import t9.InterfaceC3392i;
import t9.j;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final int f28600A;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f28601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f28602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final File f28603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final File f28604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f28605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC3392i f28606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final LinkedHashMap f28607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f28609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f28610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f28611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f28612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f28613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f28614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f28615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final i9.d f28616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final e f28617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final n9.a f28618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final File f28619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f28620z;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final a f28599M = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f28588B = "journal";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f28589C = "journal.tmp";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f28590D = "journal.bkp";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f28591E = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f28592F = "1";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final long f28593G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final o f28594H = new o("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f28595I = "CLEAN";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f28596J = "DIRTY";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f28597K = "REMOVE";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f28598L = "READ";

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean[] f28621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f28622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f28623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f28624d;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a extends n implements Function1 {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f28626i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10) {
                super(1);
                this.f28626i = i10;
            }

            public final void a(IOException it) {
                AbstractC2855l.g(it, "it");
                synchronized (b.this.f28624d) {
                    b.this.c();
                    C2735B c2735b = C2735B.f28704a;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((IOException) obj);
                return C2735B.f28704a;
            }
        }

        public b(d dVar, c entry) {
            AbstractC2855l.g(entry, "entry");
            this.f28624d = dVar;
            this.f28623c = entry;
            this.f28621a = entry.g() ? null : new boolean[dVar.l0()];
        }

        public final void a() {
            synchronized (this.f28624d) {
                try {
                    if (this.f28622b) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC2855l.b(this.f28623c.b(), this)) {
                        this.f28624d.J(this, false);
                    }
                    this.f28622b = true;
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.f28624d) {
                try {
                    if (this.f28622b) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC2855l.b(this.f28623c.b(), this)) {
                        this.f28624d.J(this, true);
                    }
                    this.f28622b = true;
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (AbstractC2855l.b(this.f28623c.b(), this)) {
                if (this.f28624d.f28610p) {
                    this.f28624d.J(this, false);
                } else {
                    this.f28623c.q(true);
                }
            }
        }

        public final c d() {
            return this.f28623c;
        }

        public final boolean[] e() {
            return this.f28621a;
        }

        public final D f(int i10) {
            synchronized (this.f28624d) {
                if (this.f28622b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!AbstractC2855l.b(this.f28623c.b(), this)) {
                    return s.b();
                }
                if (!this.f28623c.g()) {
                    boolean[] zArr = this.f28621a;
                    AbstractC2855l.d(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new h9.e(this.f28624d.k0().b((File) this.f28623c.c().get(i10)), new a(i10));
                } catch (FileNotFoundException unused) {
                    return s.b();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f28627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f28628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f28629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f28630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f28631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b f28632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f28633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f28634h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f28635i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f28636j;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends t9.n {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f28637g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ F f28639i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(F f10, F f11) {
                super(f11);
                this.f28639i = f10;
            }

            @Override // t9.n, t9.F, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (this.f28637g) {
                    return;
                }
                this.f28637g = true;
                synchronized (c.this.f28636j) {
                    try {
                        c.this.n(r1.f() - 1);
                        if (c.this.f() == 0 && c.this.i()) {
                            c cVar = c.this;
                            cVar.f28636j.L0(cVar);
                        }
                        C2735B c2735b = C2735B.f28704a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(d dVar, String key) {
            AbstractC2855l.g(key, "key");
            this.f28636j = dVar;
            this.f28635i = key;
            this.f28627a = new long[dVar.l0()];
            this.f28628b = new ArrayList();
            this.f28629c = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int iL0 = dVar.l0();
            for (int i10 = 0; i10 < iL0; i10++) {
                sb.append(i10);
                this.f28628b.add(new File(dVar.i0(), sb.toString()));
                sb.append(".tmp");
                this.f28629c.add(new File(dVar.i0(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final F k(int i10) {
            F fA = this.f28636j.k0().a((File) this.f28628b.get(i10));
            if (this.f28636j.f28610p) {
                return fA;
            }
            this.f28633g++;
            return new a(fA, fA);
        }

        public final List a() {
            return this.f28628b;
        }

        public final b b() {
            return this.f28632f;
        }

        public final List c() {
            return this.f28629c;
        }

        public final String d() {
            return this.f28635i;
        }

        public final long[] e() {
            return this.f28627a;
        }

        public final int f() {
            return this.f28633g;
        }

        public final boolean g() {
            return this.f28630d;
        }

        public final long h() {
            return this.f28634h;
        }

        public final boolean i() {
            return this.f28631e;
        }

        public final void l(b bVar) {
            this.f28632f = bVar;
        }

        public final void m(List strings) throws IOException {
            AbstractC2855l.g(strings, "strings");
            if (strings.size() != this.f28636j.l0()) {
                j(strings);
                throw new C2742e();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f28627a[i10] = Long.parseLong((String) strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new C2742e();
            }
        }

        public final void n(int i10) {
            this.f28633g = i10;
        }

        public final void o(boolean z10) {
            this.f28630d = z10;
        }

        public final void p(long j10) {
            this.f28634h = j10;
        }

        public final void q(boolean z10) {
            this.f28631e = z10;
        }

        public final C0289d r() {
            d dVar = this.f28636j;
            if (f9.c.f27872h && !Thread.holdsLock(dVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(dVar);
                throw new AssertionError(sb.toString());
            }
            if (!this.f28630d) {
                return null;
            }
            if (!this.f28636j.f28610p && (this.f28632f != null || this.f28631e)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f28627a.clone();
            try {
                int iL0 = this.f28636j.l0();
                for (int i10 = 0; i10 < iL0; i10++) {
                    arrayList.add(k(i10));
                }
                return new C0289d(this.f28636j, this.f28635i, this.f28634h, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f9.c.j((F) it.next());
                }
                try {
                    this.f28636j.L0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(InterfaceC3392i writer) {
            AbstractC2855l.g(writer, "writer");
            for (long j10 : this.f28627a) {
                writer.writeByte(32).C0(j10);
            }
        }
    }

    /* JADX INFO: renamed from: h9.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class C0289d implements Closeable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f28640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f28641h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List f28642i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long[] f28643j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ d f28644k;

        public C0289d(d dVar, String key, long j10, List sources, long[] lengths) {
            AbstractC2855l.g(key, "key");
            AbstractC2855l.g(sources, "sources");
            AbstractC2855l.g(lengths, "lengths");
            this.f28644k = dVar;
            this.f28640g = key;
            this.f28641h = j10;
            this.f28642i = sources;
            this.f28643j = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f28642i.iterator();
            while (it.hasNext()) {
                f9.c.j((F) it.next());
            }
        }

        public final b d() {
            return this.f28644k.W(this.f28640g, this.f28641h);
        }

        public final F e(int i10) {
            return (F) this.f28642i.get(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends i9.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // i9.a
        public long f() {
            synchronized (d.this) {
                if (!d.this.f28611q || d.this.g0()) {
                    return -1L;
                }
                try {
                    d.this.N0();
                } catch (IOException unused) {
                    d.this.f28613s = true;
                }
                try {
                    if (d.this.u0()) {
                        d.this.J0();
                        d.this.f28608n = 0;
                    }
                } catch (IOException unused2) {
                    d.this.f28614t = true;
                    d.this.f28606l = s.c(s.b());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class f extends n implements Function1 {
        f() {
            super(1);
        }

        public final void a(IOException it) {
            AbstractC2855l.g(it, "it");
            d dVar = d.this;
            if (!f9.c.f27872h || Thread.holdsLock(dVar)) {
                d.this.f28609o = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(dVar);
            throw new AssertionError(sb.toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IOException) obj);
            return C2735B.f28704a;
        }
    }

    public d(n9.a fileSystem, File directory, int i10, int i11, long j10, i9.e taskRunner) {
        AbstractC2855l.g(fileSystem, "fileSystem");
        AbstractC2855l.g(directory, "directory");
        AbstractC2855l.g(taskRunner, "taskRunner");
        this.f28618x = fileSystem;
        this.f28619y = directory;
        this.f28620z = i10;
        this.f28600A = i11;
        this.f28601g = j10;
        this.f28607m = new LinkedHashMap(0, 0.75f, true);
        this.f28616v = taskRunner.i();
        this.f28617w = new e(f9.c.f27873i + " Cache");
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (!(i11 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f28602h = new File(directory, f28588B);
        this.f28603i = new File(directory, f28589C);
        this.f28604j = new File(directory, f28590D);
    }

    private final void A0() throws IOException {
        j jVarD = s.d(this.f28618x.a(this.f28602h));
        try {
            String strJ0 = jVarD.j0();
            String strJ02 = jVarD.j0();
            String strJ03 = jVarD.j0();
            String strJ04 = jVarD.j0();
            String strJ05 = jVarD.j0();
            if (!AbstractC2855l.b(f28591E, strJ0) || !AbstractC2855l.b(f28592F, strJ02) || !AbstractC2855l.b(String.valueOf(this.f28620z), strJ03) || !AbstractC2855l.b(String.valueOf(this.f28600A), strJ04) || strJ05.length() > 0) {
                throw new IOException("unexpected journal header: [" + strJ0 + ", " + strJ02 + ", " + strJ04 + ", " + strJ05 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    D0(jVarD.j0());
                    i10++;
                } catch (EOFException unused) {
                    this.f28608n = i10 - this.f28607m.size();
                    if (jVarD.D()) {
                        this.f28606l = w0();
                    } else {
                        J0();
                    }
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(jVarD, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void D0(String str) throws IOException {
        String strSubstring;
        int iC0 = q.c0(str, ' ', 0, false, 6, null);
        if (iC0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iC0 + 1;
        int iC02 = q.c0(str, ' ', i10, false, 4, null);
        if (iC02 == -1) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(i10);
            AbstractC2855l.f(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String str2 = f28597K;
            if (iC0 == str2.length() && q.K(str, str2, false, 2, null)) {
                this.f28607m.remove(strSubstring);
                return;
            }
        } else {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(i10, iC02);
            AbstractC2855l.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        c cVar = (c) this.f28607m.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f28607m.put(strSubstring, cVar);
        }
        if (iC02 != -1) {
            String str3 = f28595I;
            if (iC0 == str3.length() && q.K(str, str3, false, 2, null)) {
                int i11 = iC02 + 1;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring2 = str.substring(i11);
                AbstractC2855l.f(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                List listF0 = q.F0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listF0);
                return;
            }
        }
        if (iC02 == -1) {
            String str4 = f28596J;
            if (iC0 == str4.length() && q.K(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iC02 == -1) {
            String str5 = f28598L;
            if (iC0 == str5.length() && q.K(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final synchronized void I() {
        if (this.f28612r) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final boolean M0() {
        for (c toEvict : this.f28607m.values()) {
            if (!toEvict.i()) {
                AbstractC2855l.f(toEvict, "toEvict");
                L0(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void O0(String str) {
        if (f28594H.d(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public static /* synthetic */ b X(d dVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f28593G;
        }
        return dVar.W(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u0() {
        int i10 = this.f28608n;
        return i10 >= 2000 && i10 >= this.f28607m.size();
    }

    private final InterfaceC3392i w0() {
        return s.c(new h9.e(this.f28618x.g(this.f28602h), new f()));
    }

    private final void y0() {
        this.f28618x.f(this.f28603i);
        Iterator it = this.f28607m.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC2855l.f(next, "i.next()");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f28600A;
                while (i10 < i11) {
                    this.f28605k += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f28600A;
                while (i10 < i12) {
                    this.f28618x.f((File) cVar.a().get(i10));
                    this.f28618x.f((File) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void J(b editor, boolean z10) {
        AbstractC2855l.g(editor, "editor");
        c cVarD = editor.d();
        if (!AbstractC2855l.b(cVarD.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !cVarD.g()) {
            int i10 = this.f28600A;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArrE = editor.e();
                AbstractC2855l.d(zArrE);
                if (!zArrE[i11]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f28618x.d((File) cVarD.c().get(i11))) {
                    editor.a();
                    return;
                }
            }
        }
        int i12 = this.f28600A;
        for (int i13 = 0; i13 < i12; i13++) {
            File file = (File) cVarD.c().get(i13);
            if (!z10 || cVarD.i()) {
                this.f28618x.f(file);
            } else if (this.f28618x.d(file)) {
                File file2 = (File) cVarD.a().get(i13);
                this.f28618x.e(file, file2);
                long j10 = cVarD.e()[i13];
                long jH = this.f28618x.h(file2);
                cVarD.e()[i13] = jH;
                this.f28605k = (this.f28605k - j10) + jH;
            }
        }
        cVarD.l(null);
        if (cVarD.i()) {
            L0(cVarD);
            return;
        }
        this.f28608n++;
        InterfaceC3392i interfaceC3392i = this.f28606l;
        AbstractC2855l.d(interfaceC3392i);
        if (cVarD.g() || z10) {
            cVarD.o(true);
            interfaceC3392i.V(f28595I).writeByte(32);
            interfaceC3392i.V(cVarD.d());
            cVarD.s(interfaceC3392i);
            interfaceC3392i.writeByte(10);
            if (z10) {
                long j11 = this.f28615u;
                this.f28615u = 1 + j11;
                cVarD.p(j11);
            }
        } else {
            this.f28607m.remove(cVarD.d());
            interfaceC3392i.V(f28597K).writeByte(32);
            interfaceC3392i.V(cVarD.d());
            interfaceC3392i.writeByte(10);
        }
        interfaceC3392i.flush();
        if (this.f28605k > this.f28601g || u0()) {
            i9.d.j(this.f28616v, this.f28617w, 0L, 2, null);
        }
    }

    public final synchronized void J0() {
        try {
            InterfaceC3392i interfaceC3392i = this.f28606l;
            if (interfaceC3392i != null) {
                interfaceC3392i.close();
            }
            InterfaceC3392i interfaceC3392iC = s.c(this.f28618x.b(this.f28603i));
            try {
                interfaceC3392iC.V(f28591E).writeByte(10);
                interfaceC3392iC.V(f28592F).writeByte(10);
                interfaceC3392iC.C0(this.f28620z).writeByte(10);
                interfaceC3392iC.C0(this.f28600A).writeByte(10);
                interfaceC3392iC.writeByte(10);
                for (c cVar : this.f28607m.values()) {
                    if (cVar.b() != null) {
                        interfaceC3392iC.V(f28596J).writeByte(32);
                        interfaceC3392iC.V(cVar.d());
                        interfaceC3392iC.writeByte(10);
                    } else {
                        interfaceC3392iC.V(f28595I).writeByte(32);
                        interfaceC3392iC.V(cVar.d());
                        cVar.s(interfaceC3392iC);
                        interfaceC3392iC.writeByte(10);
                    }
                }
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(interfaceC3392iC, null);
                if (this.f28618x.d(this.f28602h)) {
                    this.f28618x.e(this.f28602h, this.f28604j);
                }
                this.f28618x.e(this.f28603i, this.f28602h);
                this.f28618x.f(this.f28604j);
                this.f28606l = w0();
                this.f28609o = false;
                this.f28614t = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean K0(String key) {
        AbstractC2855l.g(key, "key");
        t0();
        I();
        O0(key);
        c cVar = (c) this.f28607m.get(key);
        if (cVar == null) {
            return false;
        }
        AbstractC2855l.f(cVar, "lruEntries[key] ?: return false");
        boolean zL0 = L0(cVar);
        if (zL0 && this.f28605k <= this.f28601g) {
            this.f28613s = false;
        }
        return zL0;
    }

    public final boolean L0(c entry) {
        InterfaceC3392i interfaceC3392i;
        AbstractC2855l.g(entry, "entry");
        if (!this.f28610p) {
            if (entry.f() > 0 && (interfaceC3392i = this.f28606l) != null) {
                interfaceC3392i.V(f28596J);
                interfaceC3392i.writeByte(32);
                interfaceC3392i.V(entry.d());
                interfaceC3392i.writeByte(10);
                interfaceC3392i.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i10 = this.f28600A;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f28618x.f((File) entry.a().get(i11));
            this.f28605k -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f28608n++;
        InterfaceC3392i interfaceC3392i2 = this.f28606l;
        if (interfaceC3392i2 != null) {
            interfaceC3392i2.V(f28597K);
            interfaceC3392i2.writeByte(32);
            interfaceC3392i2.V(entry.d());
            interfaceC3392i2.writeByte(10);
        }
        this.f28607m.remove(entry.d());
        if (u0()) {
            i9.d.j(this.f28616v, this.f28617w, 0L, 2, null);
        }
        return true;
    }

    public final void M() {
        close();
        this.f28618x.c(this.f28619y);
    }

    public final void N0() {
        while (this.f28605k > this.f28601g) {
            if (!M0()) {
                return;
            }
        }
        this.f28613s = false;
    }

    public final synchronized b W(String key, long j10) {
        AbstractC2855l.g(key, "key");
        t0();
        I();
        O0(key);
        c cVar = (c) this.f28607m.get(key);
        if (j10 != f28593G && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f28613s && !this.f28614t) {
            InterfaceC3392i interfaceC3392i = this.f28606l;
            AbstractC2855l.d(interfaceC3392i);
            interfaceC3392i.V(f28596J).writeByte(32).V(key).writeByte(10);
            interfaceC3392i.flush();
            if (this.f28609o) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f28607m.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        i9.d.j(this.f28616v, this.f28617w, 0L, 2, null);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.f28611q && !this.f28612r) {
                Collection collectionValues = this.f28607m.values();
                AbstractC2855l.f(collectionValues, "lruEntries.values");
                Object[] array = collectionValues.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                for (c cVar : (c[]) array) {
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.c();
                    }
                }
                N0();
                InterfaceC3392i interfaceC3392i = this.f28606l;
                AbstractC2855l.d(interfaceC3392i);
                interfaceC3392i.close();
                this.f28606l = null;
                this.f28612r = true;
                return;
            }
            this.f28612r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C0289d d0(String key) {
        AbstractC2855l.g(key, "key");
        t0();
        I();
        O0(key);
        c cVar = (c) this.f28607m.get(key);
        if (cVar == null) {
            return null;
        }
        AbstractC2855l.f(cVar, "lruEntries[key] ?: return null");
        C0289d c0289dR = cVar.r();
        if (c0289dR == null) {
            return null;
        }
        this.f28608n++;
        InterfaceC3392i interfaceC3392i = this.f28606l;
        AbstractC2855l.d(interfaceC3392i);
        interfaceC3392i.V(f28598L).writeByte(32).V(key).writeByte(10);
        if (u0()) {
            i9.d.j(this.f28616v, this.f28617w, 0L, 2, null);
        }
        return c0289dR;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f28611q) {
            I();
            N0();
            InterfaceC3392i interfaceC3392i = this.f28606l;
            AbstractC2855l.d(interfaceC3392i);
            interfaceC3392i.flush();
        }
    }

    public final boolean g0() {
        return this.f28612r;
    }

    public final File i0() {
        return this.f28619y;
    }

    public final n9.a k0() {
        return this.f28618x;
    }

    public final int l0() {
        return this.f28600A;
    }

    public final synchronized void t0() {
        try {
            if (f9.c.f27872h && !Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
            if (this.f28611q) {
                return;
            }
            if (this.f28618x.d(this.f28604j)) {
                if (this.f28618x.d(this.f28602h)) {
                    this.f28618x.f(this.f28604j);
                } else {
                    this.f28618x.e(this.f28604j, this.f28602h);
                }
            }
            this.f28610p = f9.c.C(this.f28618x, this.f28604j);
            if (this.f28618x.d(this.f28602h)) {
                try {
                    A0();
                    y0();
                    this.f28611q = true;
                    return;
                } catch (IOException e10) {
                    o9.j.f30594c.g().k("DiskLruCache " + this.f28619y + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        M();
                        this.f28612r = false;
                        J0();
                        this.f28611q = true;
                    } catch (Throwable th) {
                        this.f28612r = false;
                        throw th;
                    }
                }
            }
            J0();
            this.f28611q = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
