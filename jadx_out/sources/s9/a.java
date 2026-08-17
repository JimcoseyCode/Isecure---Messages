package s9;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;
import t9.C3391h;
import t9.D;
import t9.k;
import t9.l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3391h f32334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Deflater f32335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f32336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f32337j;

    public a(boolean z10) {
        this.f32337j = z10;
        C3391h c3391h = new C3391h();
        this.f32334g = c3391h;
        Deflater deflater = new Deflater(-1, true);
        this.f32335h = deflater;
        this.f32336i = new l((D) c3391h, deflater);
    }

    private final boolean e(C3391h c3391h, k kVar) {
        return c3391h.y0(c3391h.size() - ((long) kVar.E()), kVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f32336i.close();
    }

    public final void d(C3391h buffer) throws IOException {
        AbstractC2855l.g(buffer, "buffer");
        if (!(this.f32334g.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f32337j) {
            this.f32335h.reset();
        }
        this.f32336i.write(buffer, buffer.size());
        this.f32336i.flush();
        if (e(this.f32334g, b.f32338a)) {
            long size = this.f32334g.size() - ((long) 4);
            C3391h.a aVarJ0 = C3391h.J0(this.f32334g, null, 1, null);
            try {
                aVarJ0.k(size);
                AbstractC3376c.a(aVarJ0, null);
            } finally {
            }
        } else {
            this.f32334g.writeByte(0);
        }
        C3391h c3391h = this.f32334g;
        buffer.write(c3391h, c3391h.size());
    }
}
