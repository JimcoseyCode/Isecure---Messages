package s9;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.InterfaceC3392i;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3391h f32422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3391h f32423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f32425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final byte[] f32426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C3391h.a f32427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f32428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC3392i f32429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Random f32430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f32431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f32432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f32433r;

    public h(boolean z10, InterfaceC3392i sink, Random random, boolean z11, boolean z12, long j10) {
        AbstractC2855l.g(sink, "sink");
        AbstractC2855l.g(random, "random");
        this.f32428m = z10;
        this.f32429n = sink;
        this.f32430o = random;
        this.f32431p = z11;
        this.f32432q = z12;
        this.f32433r = j10;
        this.f32422g = new C3391h();
        this.f32423h = sink.c();
        this.f32426k = z10 ? new byte[4] : null;
        this.f32427l = z10 ? new C3391h.a() : null;
    }

    private final void e(int i10, k kVar) throws IOException {
        if (this.f32424i) {
            throw new IOException("closed");
        }
        int iE = kVar.E();
        if (!(((long) iE) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f32423h.writeByte(i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (this.f32428m) {
            this.f32423h.writeByte(iE | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            Random random = this.f32430o;
            byte[] bArr = this.f32426k;
            AbstractC2855l.d(bArr);
            random.nextBytes(bArr);
            this.f32423h.write(this.f32426k);
            if (iE > 0) {
                long size = this.f32423h.size();
                this.f32423h.S(kVar);
                C3391h c3391h = this.f32423h;
                C3391h.a aVar = this.f32427l;
                AbstractC2855l.d(aVar);
                c3391h.D0(aVar);
                this.f32427l.m(size);
                f.f32405a.b(this.f32427l, this.f32426k);
                this.f32427l.close();
            }
        } else {
            this.f32423h.writeByte(iE);
            this.f32423h.S(kVar);
        }
        this.f32429n.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        a aVar = this.f32425j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void d(int i10, k kVar) {
        k kVarC0 = k.f32604k;
        if (i10 != 0 || kVar != null) {
            if (i10 != 0) {
                f.f32405a.c(i10);
            }
            C3391h c3391h = new C3391h();
            c3391h.writeShort(i10);
            if (kVar != null) {
                c3391h.S(kVar);
            }
            kVarC0 = c3391h.c0();
        }
        try {
            e(8, kVarC0);
        } finally {
            this.f32424i = true;
        }
    }

    public final void k(int i10, k data) throws IOException {
        AbstractC2855l.g(data, "data");
        if (this.f32424i) {
            throw new IOException("closed");
        }
        this.f32422g.S(data);
        int i11 = i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (this.f32431p && data.E() >= this.f32433r) {
            a aVar = this.f32425j;
            if (aVar == null) {
                aVar = new a(this.f32432q);
                this.f32425j = aVar;
            }
            aVar.d(this.f32422g);
            i11 = i10 | JfifUtil.MARKER_SOFn;
        }
        long size = this.f32422g.size();
        this.f32423h.writeByte(i11);
        int i12 = this.f32428m ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0;
        if (size <= 125) {
            this.f32423h.writeByte(i12 | ((int) size));
        } else if (size <= 65535) {
            this.f32423h.writeByte(i12 | 126);
            this.f32423h.writeShort((int) size);
        } else {
            this.f32423h.writeByte(i12 | 127);
            this.f32423h.a1(size);
        }
        if (this.f32428m) {
            Random random = this.f32430o;
            byte[] bArr = this.f32426k;
            AbstractC2855l.d(bArr);
            random.nextBytes(bArr);
            this.f32423h.write(this.f32426k);
            if (size > 0) {
                C3391h c3391h = this.f32422g;
                C3391h.a aVar2 = this.f32427l;
                AbstractC2855l.d(aVar2);
                c3391h.D0(aVar2);
                this.f32427l.m(0L);
                f.f32405a.b(this.f32427l, this.f32426k);
                this.f32427l.close();
            }
        }
        this.f32423h.write(this.f32422g, size);
        this.f32429n.x();
    }

    public final void m(k payload) {
        AbstractC2855l.g(payload, "payload");
        e(9, payload);
    }

    public final void r(k payload) throws IOException {
        AbstractC2855l.g(payload, "payload");
        e(10, payload);
    }
}
