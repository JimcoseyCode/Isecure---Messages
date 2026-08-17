package m9;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.d;
import t9.C3391h;
import t9.InterfaceC3392i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3391h f29989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f29991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d.b f29992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC3392i f29993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f29994l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f29988n = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Logger f29987m = Logger.getLogger(e.class.getName());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(InterfaceC3392i sink, boolean z10) {
        AbstractC2855l.g(sink, "sink");
        this.f29993k = sink;
        this.f29994l = z10;
        C3391h c3391h = new C3391h();
        this.f29989g = c3391h;
        this.f29990h = 16384;
        this.f29992j = new d.b(0, false, c3391h, 3, null);
    }

    private final void d0(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f29990h, j10);
            j10 -= jMin;
            r(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f29993k.write(this.f29989g, jMin);
        }
    }

    public final synchronized void A(boolean z10, int i10, List headerBlock) {
        AbstractC2855l.g(headerBlock, "headerBlock");
        if (this.f29991i) {
            throw new IOException("closed");
        }
        this.f29992j.g(headerBlock);
        long size = this.f29989g.size();
        long jMin = Math.min(this.f29990h, size);
        int i11 = size == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        r(i10, (int) jMin, 1, i11);
        this.f29993k.write(this.f29989g, jMin);
        if (size > jMin) {
            d0(i10, size - jMin);
        }
    }

    public final int B() {
        return this.f29990h;
    }

    public final synchronized void I(boolean z10, int i10, int i11) {
        if (this.f29991i) {
            throw new IOException("closed");
        }
        r(0, 8, 6, z10 ? 1 : 0);
        this.f29993k.writeInt(i10);
        this.f29993k.writeInt(i11);
        this.f29993k.flush();
    }

    public final synchronized void J(int i10, int i11, List requestHeaders) {
        AbstractC2855l.g(requestHeaders, "requestHeaders");
        if (this.f29991i) {
            throw new IOException("closed");
        }
        this.f29992j.g(requestHeaders);
        long size = this.f29989g.size();
        int iMin = (int) Math.min(((long) this.f29990h) - 4, size);
        long j10 = iMin;
        r(i10, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f29993k.writeInt(i11 & ViewDefaults.NUMBER_OF_LINES);
        this.f29993k.write(this.f29989g, j10);
        if (size > j10) {
            d0(i10, size - j10);
        }
    }

    public final synchronized void M(int i10, b errorCode) {
        AbstractC2855l.g(errorCode, "errorCode");
        if (this.f29991i) {
            throw new IOException("closed");
        }
        if (!(errorCode.h() != -1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        r(i10, 4, 3, 0);
        this.f29993k.writeInt(errorCode.h());
        this.f29993k.flush();
    }

    public final synchronized void W(m settings) {
        try {
            AbstractC2855l.g(settings, "settings");
            if (this.f29991i) {
                throw new IOException("closed");
            }
            int i10 = 0;
            r(0, settings.i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.f(i10)) {
                    this.f29993k.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f29993k.writeInt(settings.a(i10));
                }
                i10++;
            }
            this.f29993k.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void X(int i10, long j10) {
        if (this.f29991i) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        r(i10, 4, 8, 0);
        this.f29993k.writeInt((int) j10);
        this.f29993k.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f29991i = true;
        this.f29993k.close();
    }

    public final synchronized void d(m peerSettings) {
        try {
            AbstractC2855l.g(peerSettings, "peerSettings");
            if (this.f29991i) {
                throw new IOException("closed");
            }
            this.f29990h = peerSettings.e(this.f29990h);
            if (peerSettings.b() != -1) {
                this.f29992j.e(peerSettings.b());
            }
            r(0, 0, 4, 1);
            this.f29993k.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        try {
            if (this.f29991i) {
                throw new IOException("closed");
            }
            if (this.f29994l) {
                Logger logger = f29987m;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f9.c.q(">> CONNECTION " + e.f29825a.u(), new Object[0]));
                }
                this.f29993k.S(e.f29825a);
                this.f29993k.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.f29991i) {
            throw new IOException("closed");
        }
        this.f29993k.flush();
    }

    public final synchronized void k(boolean z10, int i10, C3391h c3391h, int i11) {
        if (this.f29991i) {
            throw new IOException("closed");
        }
        m(i10, z10 ? 1 : 0, c3391h, i11);
    }

    public final void m(int i10, int i11, C3391h c3391h, int i12) {
        r(i10, i12, 0, i11);
        if (i12 > 0) {
            InterfaceC3392i interfaceC3392i = this.f29993k;
            AbstractC2855l.d(c3391h);
            interfaceC3392i.write(c3391h, i12);
        }
    }

    public final void r(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        Logger logger = f29987m;
        if (logger.isLoggable(Level.FINE)) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            logger.fine(e.f29829e.c(false, i14, i15, i16, i17));
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        if (!(i15 <= this.f29990h)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f29990h + ": " + i15).toString());
        }
        if (!((((int) 2147483648L) & i14) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i14).toString());
        }
        f9.c.Y(this.f29993k, i15);
        this.f29993k.writeByte(i16 & 255);
        this.f29993k.writeByte(i17 & 255);
        this.f29993k.writeInt(Integer.MAX_VALUE & i14);
    }

    public final synchronized void s(int i10, b errorCode, byte[] debugData) {
        try {
            AbstractC2855l.g(errorCode, "errorCode");
            AbstractC2855l.g(debugData, "debugData");
            if (this.f29991i) {
                throw new IOException("closed");
            }
            boolean z10 = true;
            if (!(errorCode.h() != -1)) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            r(0, debugData.length + 8, 7, 0);
            this.f29993k.writeInt(i10);
            this.f29993k.writeInt(errorCode.h());
            if (debugData.length != 0) {
                z10 = false;
            }
            if (!z10) {
                this.f29993k.write(debugData);
            }
            this.f29993k.flush();
        } finally {
        }
    }
}
