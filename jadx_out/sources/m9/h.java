package m9;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.d;
import t9.C3391h;
import t9.F;
import t9.G;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Logger f29947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f29948l = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f29949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d.a f29950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t9.j f29951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f29952j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public final Logger a() {
            return h.f29947k;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        void a();

        void c(boolean z10, int i10, int i11, List list);

        void d(int i10, long j10);

        void f(int i10, m9.b bVar, t9.k kVar);

        void g(boolean z10, int i10, t9.j jVar, int i11);

        void j(int i10, m9.b bVar);

        void l(boolean z10, int i10, int i11);

        void n(int i10, int i11, int i12, boolean z10);

        void o(boolean z10, m mVar);

        void q(int i10, int i11, List list);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        AbstractC2855l.f(logger, "Logger.getLogger(Http2::class.java.name)");
        f29947k = logger;
    }

    public h(t9.j source, boolean z10) {
        AbstractC2855l.g(source, "source");
        this.f29951i = source;
        this.f29952j = z10;
        b bVar = new b(source);
        this.f29949g = bVar;
        this.f29950h = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void A(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iB = (i11 & 8) != 0 ? f9.c.b(this.f29951i.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            I(cVar, i12);
            i10 -= 5;
        }
        cVar.c(z10, i12, -1, s(f29948l.b(i10, i11, iB), iB, i11, i12));
    }

    private final void B(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.l((i11 & 1) != 0, this.f29951i.readInt(), this.f29951i.readInt());
    }

    private final void I(c cVar, int i10) {
        int i11 = this.f29951i.readInt();
        cVar.n(i10, i11 & ViewDefaults.NUMBER_OF_LINES, f9.c.b(this.f29951i.readByte(), 255) + 1, (((int) 2147483648L) & i11) != 0);
    }

    private final void J(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            I(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void M(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (i11 & 8) != 0 ? f9.c.b(this.f29951i.readByte(), 255) : 0;
        cVar.q(i12, this.f29951i.readInt() & ViewDefaults.NUMBER_OF_LINES, s(f29948l.b(i10 - 4, i11, iB), iB, i11, i12));
    }

    private final void W(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f29951i.readInt();
        m9.b bVarA = m9.b.f29792w.a(i13);
        if (bVarA != null) {
            cVar.j(i12, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    private final void X(c cVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.a();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        m mVar = new m();
        B7.a aVarO = B7.d.o(B7.d.p(0, i10), 6);
        int iD = aVarO.d();
        int iO = aVarO.o();
        int iP = aVarO.p();
        if (iP < 0 ? iD >= iO : iD <= iO) {
            while (true) {
                int iC = f9.c.c(this.f29951i.readShort(), 65535);
                i13 = this.f29951i.readInt();
                if (iC != 2) {
                    if (iC == 3) {
                        iC = 4;
                    } else if (iC != 4) {
                        if (iC == 5 && (i13 < 16384 || i13 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iC = 7;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iC, i13);
                if (iD == iO) {
                    break;
                } else {
                    iD += iP;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
        }
        cVar.o(false, mVar);
    }

    private final void d0(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
        }
        long jD = f9.c.d(this.f29951i.readInt(), 2147483647L);
        if (jD == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.d(i12, jD);
    }

    private final void m(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (i11 & 8) != 0 ? f9.c.b(this.f29951i.readByte(), 255) : 0;
        cVar.g(z10, i12, this.f29951i, f29948l.b(i10, i11, iB));
        this.f29951i.skip(iB);
    }

    private final void r(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f29951i.readInt();
        int i14 = this.f29951i.readInt();
        int i15 = i10 - 8;
        m9.b bVarA = m9.b.f29792w.a(i14);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        t9.k kVarT = t9.k.f32604k;
        if (i15 > 0) {
            kVarT = this.f29951i.t(i15);
        }
        cVar.f(i13, bVarA, kVarT);
    }

    private final List s(int i10, int i11, int i12, int i13) throws IOException {
        this.f29949g.m(i10);
        b bVar = this.f29949g;
        bVar.r(bVar.d());
        this.f29949g.s(i11);
        this.f29949g.k(i12);
        this.f29949g.A(i13);
        this.f29950h.k();
        return this.f29950h.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29951i.close();
    }

    public final boolean e(boolean z10, c handler) throws IOException {
        AbstractC2855l.g(handler, "handler");
        try {
            this.f29951i.B0(9L);
            int iH = f9.c.H(this.f29951i);
            if (iH > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iH);
            }
            int iB = f9.c.b(this.f29951i.readByte(), 255);
            int iB2 = f9.c.b(this.f29951i.readByte(), 255);
            int i10 = this.f29951i.readInt() & ViewDefaults.NUMBER_OF_LINES;
            Logger logger = f29947k;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f29829e.c(true, i10, iH, iB, iB2));
            }
            if (z10 && iB != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f29829e.b(iB));
            }
            switch (iB) {
                case 0:
                    m(handler, iH, iB2, i10);
                    return true;
                case 1:
                    A(handler, iH, iB2, i10);
                    return true;
                case 2:
                    J(handler, iH, iB2, i10);
                    return true;
                case 3:
                    W(handler, iH, iB2, i10);
                    return true;
                case 4:
                    X(handler, iH, iB2, i10);
                    return true;
                case 5:
                    M(handler, iH, iB2, i10);
                    return true;
                case 6:
                    B(handler, iH, iB2, i10);
                    return true;
                case 7:
                    r(handler, iH, iB2, i10);
                    return true;
                case 8:
                    d0(handler, iH, iB2, i10);
                    return true;
                default:
                    this.f29951i.skip(iH);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void k(c handler) throws IOException {
        AbstractC2855l.g(handler, "handler");
        if (this.f29952j) {
            if (!e(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        t9.j jVar = this.f29951i;
        t9.k kVar = e.f29825a;
        t9.k kVarT = jVar.t(kVar.E());
        Logger logger = f29947k;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(f9.c.q("<< CONNECTION " + kVarT.u(), new Object[0]));
        }
        if (AbstractC2855l.b(kVar, kVarT)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + kVarT.I());
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements F {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29953g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29954h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29955i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f29956j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f29957k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final t9.j f29958l;

        public b(t9.j source) {
            AbstractC2855l.g(source, "source");
            this.f29958l = source;
        }

        private final void e() throws IOException {
            int i10 = this.f29955i;
            int iH = f9.c.H(this.f29958l);
            this.f29956j = iH;
            this.f29953g = iH;
            int iB = f9.c.b(this.f29958l.readByte(), 255);
            this.f29954h = f9.c.b(this.f29958l.readByte(), 255);
            a aVar = h.f29948l;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f29829e.c(true, this.f29955i, this.f29953g, iB, this.f29954h));
            }
            int i11 = this.f29958l.readInt() & ViewDefaults.NUMBER_OF_LINES;
            this.f29955i = i11;
            if (iB == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        public final void A(int i10) {
            this.f29955i = i10;
        }

        public final int d() {
            return this.f29956j;
        }

        public final void k(int i10) {
            this.f29954h = i10;
        }

        public final void m(int i10) {
            this.f29956j = i10;
        }

        public final void r(int i10) {
            this.f29953g = i10;
        }

        @Override // t9.F
        public long read(C3391h sink, long j10) throws IOException {
            AbstractC2855l.g(sink, "sink");
            while (true) {
                int i10 = this.f29956j;
                if (i10 != 0) {
                    long j11 = this.f29958l.read(sink, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f29956j -= (int) j11;
                    return j11;
                }
                this.f29958l.skip(this.f29957k);
                this.f29957k = 0;
                if ((this.f29954h & 4) != 0) {
                    return -1L;
                }
                e();
            }
        }

        public final void s(int i10) {
            this.f29957k = i10;
        }

        @Override // t9.F
        public G timeout() {
            return this.f29958l.timeout();
        }

        @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
