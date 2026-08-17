package s9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.j;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f32408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f32411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C3391h f32412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C3391h f32413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f32414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f32415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C3391h.a f32416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f32417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final j f32418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a f32419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f32420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f32421v;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(k kVar);

        void b(String str);

        void e(k kVar);

        void f(k kVar);

        void g(int i10, String str);
    }

    public g(boolean z10, j source, a frameCallback, boolean z11, boolean z12) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(frameCallback, "frameCallback");
        this.f32417r = z10;
        this.f32418s = source;
        this.f32419t = frameCallback;
        this.f32420u = z11;
        this.f32421v = z12;
        this.f32412m = new C3391h();
        this.f32413n = new C3391h();
        this.f32415p = z10 ? null : new byte[4];
        this.f32416q = z10 ? null : new C3391h.a();
    }

    private final void e() throws ProtocolException, EOFException {
        short s10;
        String strQ0;
        long j10 = this.f32408i;
        if (j10 > 0) {
            this.f32418s.Q(this.f32412m, j10);
            if (!this.f32417r) {
                C3391h c3391h = this.f32412m;
                C3391h.a aVar = this.f32416q;
                AbstractC2855l.d(aVar);
                c3391h.D0(aVar);
                this.f32416q.m(0L);
                f fVar = f.f32405a;
                C3391h.a aVar2 = this.f32416q;
                byte[] bArr = this.f32415p;
                AbstractC2855l.d(bArr);
                fVar.b(aVar2, bArr);
                this.f32416q.close();
            }
        }
        switch (this.f32407h) {
            case 8:
                long size = this.f32412m.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = this.f32412m.readShort();
                    strQ0 = this.f32412m.q0();
                    String strA = f.f32405a.a(s10);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s10 = 1005;
                    strQ0 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                }
                this.f32419t.g(s10, strQ0);
                this.f32406g = true;
                return;
            case 9:
                this.f32419t.a(this.f32412m.c0());
                return;
            case 10:
                this.f32419t.e(this.f32412m.c0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + f9.c.N(this.f32407h));
        }
    }

    private final void k() throws IOException {
        boolean z10;
        if (this.f32406g) {
            throw new IOException("closed");
        }
        long jH = this.f32418s.timeout().h();
        this.f32418s.timeout().b();
        try {
            int iB = f9.c.b(this.f32418s.readByte(), 255);
            this.f32418s.timeout().g(jH, TimeUnit.NANOSECONDS);
            int i10 = iB & 15;
            this.f32407h = i10;
            boolean z11 = (iB & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
            this.f32409j = z11;
            boolean z12 = (iB & 8) != 0;
            this.f32410k = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (iB & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f32420u) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f32411l = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iB & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iB & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iB2 = f9.c.b(this.f32418s.readByte(), 255);
            boolean z14 = (iB2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
            if (z14 == this.f32417r) {
                throw new ProtocolException(this.f32417r ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = iB2 & 127;
            this.f32408i = j10;
            if (j10 == 126) {
                this.f32408i = f9.c.c(this.f32418s.readShort(), 65535);
            } else if (j10 == 127) {
                long j11 = this.f32418s.readLong();
                this.f32408i = j11;
                if (j11 < 0) {
                    throw new ProtocolException("Frame length 0x" + f9.c.O(this.f32408i) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f32410k && this.f32408i > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                j jVar = this.f32418s;
                byte[] bArr = this.f32415p;
                AbstractC2855l.d(bArr);
                jVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f32418s.timeout().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void m() throws IOException {
        while (!this.f32406g) {
            long j10 = this.f32408i;
            if (j10 > 0) {
                this.f32418s.Q(this.f32413n, j10);
                if (!this.f32417r) {
                    C3391h c3391h = this.f32413n;
                    C3391h.a aVar = this.f32416q;
                    AbstractC2855l.d(aVar);
                    c3391h.D0(aVar);
                    this.f32416q.m(this.f32413n.size() - this.f32408i);
                    f fVar = f.f32405a;
                    C3391h.a aVar2 = this.f32416q;
                    byte[] bArr = this.f32415p;
                    AbstractC2855l.d(bArr);
                    fVar.b(aVar2, bArr);
                    this.f32416q.close();
                }
            }
            if (this.f32409j) {
                return;
            }
            s();
            if (this.f32407h != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + f9.c.N(this.f32407h));
            }
        }
        throw new IOException("closed");
    }

    private final void r() throws IOException {
        int i10 = this.f32407h;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + f9.c.N(i10));
        }
        m();
        if (this.f32411l) {
            c cVar = this.f32414o;
            if (cVar == null) {
                cVar = new c(this.f32421v);
                this.f32414o = cVar;
            }
            cVar.d(this.f32413n);
        }
        if (i10 == 1) {
            this.f32419t.b(this.f32413n.q0());
        } else {
            this.f32419t.f(this.f32413n.c0());
        }
    }

    private final void s() throws IOException {
        while (!this.f32406g) {
            k();
            if (!this.f32410k) {
                return;
            } else {
                e();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c cVar = this.f32414o;
        if (cVar != null) {
            cVar.close();
        }
    }

    public final void d() {
        k();
        if (this.f32410k) {
            e();
        } else {
            r();
        }
    }
}
