package j9;

import e9.B;
import e9.C;
import e9.D;
import e9.E;
import e9.r;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC2855l;
import s9.d;
import t9.C3391h;
import t9.D;
import t9.F;
import t9.m;
import t9.n;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f28964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f28965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f28966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f28967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k9.d f28968f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a extends m {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f28969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f28970h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f28971i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f28972j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ c f28973k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, D delegate, long j10) {
            super(delegate);
            AbstractC2855l.g(delegate, "delegate");
            this.f28973k = cVar;
            this.f28972j = j10;
        }

        private final IOException d(IOException iOException) {
            if (this.f28969g) {
                return iOException;
            }
            this.f28969g = true;
            return this.f28973k.a(this.f28970h, false, true, iOException);
        }

        @Override // t9.m, t9.D, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f28971i) {
                return;
            }
            this.f28971i = true;
            long j10 = this.f28972j;
            if (j10 != -1 && this.f28970h != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                d(null);
            } catch (IOException e10) {
                throw d(e10);
            }
        }

        @Override // t9.m, t9.D, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw d(e10);
            }
        }

        @Override // t9.m, t9.D
        public void write(C3391h source, long j10) throws IOException {
            AbstractC2855l.g(source, "source");
            if (this.f28971i) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f28972j;
            if (j11 == -1 || this.f28970h + j10 <= j11) {
                try {
                    super.write(source, j10);
                    this.f28970h += j10;
                    return;
                } catch (IOException e10) {
                    throw d(e10);
                }
            }
            throw new ProtocolException("expected " + this.f28972j + " bytes but received " + (this.f28970h + j10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class b extends n {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f28974g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f28975h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f28976i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f28977j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f28978k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ c f28979l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, F delegate, long j10) {
            super(delegate);
            AbstractC2855l.g(delegate, "delegate");
            this.f28979l = cVar;
            this.f28978k = j10;
            this.f28975h = true;
            if (j10 == 0) {
                d(null);
            }
        }

        @Override // t9.n, t9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f28977j) {
                return;
            }
            this.f28977j = true;
            try {
                super.close();
                d(null);
            } catch (IOException e10) {
                throw d(e10);
            }
        }

        public final IOException d(IOException iOException) {
            if (this.f28976i) {
                return iOException;
            }
            this.f28976i = true;
            if (iOException == null && this.f28975h) {
                this.f28975h = false;
                this.f28979l.i().w(this.f28979l.g());
            }
            return this.f28979l.a(this.f28974g, true, false, iOException);
        }

        @Override // t9.n, t9.F
        public long read(C3391h sink, long j10) throws IOException {
            AbstractC2855l.g(sink, "sink");
            if (this.f28977j) {
                throw new IllegalStateException("closed");
            }
            try {
                long j11 = delegate().read(sink, j10);
                if (this.f28975h) {
                    this.f28975h = false;
                    this.f28979l.i().w(this.f28979l.g());
                }
                if (j11 == -1) {
                    d(null);
                    return -1L;
                }
                long j12 = this.f28974g + j11;
                long j13 = this.f28978k;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f28978k + " bytes but received " + j12);
                }
                this.f28974g = j12;
                if (j12 == j13) {
                    d(null);
                }
                return j11;
            } catch (IOException e10) {
                throw d(e10);
            }
        }
    }

    public c(e call, r eventListener, d finder, k9.d codec) {
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(eventListener, "eventListener");
        AbstractC2855l.g(finder, "finder");
        AbstractC2855l.g(codec, "codec");
        this.f28965c = call;
        this.f28966d = eventListener;
        this.f28967e = finder;
        this.f28968f = codec;
        this.f28964b = codec.d();
    }

    private final void t(IOException iOException) {
        this.f28967e.h(iOException);
        this.f28968f.d().H(this.f28965c, iOException);
    }

    public final IOException a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            t(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f28966d.s(this.f28965c, iOException);
            } else {
                this.f28966d.q(this.f28965c, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f28966d.x(this.f28965c, iOException);
            } else {
                this.f28966d.v(this.f28965c, j10);
            }
        }
        return this.f28965c.t(this, z11, z10, iOException);
    }

    public final void b() {
        this.f28968f.cancel();
    }

    public final D c(B request, boolean z10) {
        AbstractC2855l.g(request, "request");
        this.f28963a = z10;
        C cE = request.e();
        AbstractC2855l.d(cE);
        long jContentLength = cE.contentLength();
        this.f28966d.r(this.f28965c);
        return new a(this, this.f28968f.h(request, jContentLength), jContentLength);
    }

    public final void d() {
        this.f28968f.cancel();
        this.f28965c.t(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f28968f.a();
        } catch (IOException e10) {
            this.f28966d.s(this.f28965c, e10);
            t(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f28968f.g();
        } catch (IOException e10) {
            this.f28966d.s(this.f28965c, e10);
            t(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f28965c;
    }

    public final f h() {
        return this.f28964b;
    }

    public final r i() {
        return this.f28966d;
    }

    public final d j() {
        return this.f28967e;
    }

    public final boolean k() {
        return !AbstractC2855l.b(this.f28967e.d().l().h(), this.f28964b.A().a().l().h());
    }

    public final boolean l() {
        return this.f28963a;
    }

    public final d.AbstractC0360d m() {
        this.f28965c.z();
        return this.f28968f.d().x(this);
    }

    public final void n() {
        this.f28968f.d().z();
    }

    public final void o() {
        this.f28965c.t(this, true, false, null);
    }

    public final E p(e9.D response) throws IOException {
        AbstractC2855l.g(response, "response");
        try {
            String strD0 = e9.D.d0(response, "Content-Type", null, 2, null);
            long jB = this.f28968f.b(response);
            return new k9.h(strD0, jB, s.d(new b(this, this.f28968f.e(response), jB)));
        } catch (IOException e10) {
            this.f28966d.x(this.f28965c, e10);
            t(e10);
            throw e10;
        }
    }

    public final D.a q(boolean z10) throws IOException {
        try {
            D.a aVarC = this.f28968f.c(z10);
            if (aVarC == null) {
                return aVarC;
            }
            aVarC.l(this);
            return aVarC;
        } catch (IOException e10) {
            this.f28966d.x(this.f28965c, e10);
            t(e10);
            throw e10;
        }
    }

    public final void r(e9.D response) {
        AbstractC2855l.g(response, "response");
        this.f28966d.y(this.f28965c, response);
    }

    public final void s() {
        this.f28966d.z(this.f28965c);
    }

    public final void u() {
        a(-1L, true, true, null);
    }

    public final void v(B request) throws IOException {
        AbstractC2855l.g(request, "request");
        try {
            this.f28966d.u(this.f28965c);
            this.f28968f.f(request);
            this.f28966d.t(this.f28965c, request);
        } catch (IOException e10) {
            this.f28966d.s(this.f28965c, e10);
            t(e10);
            throw e10;
        }
    }
}
