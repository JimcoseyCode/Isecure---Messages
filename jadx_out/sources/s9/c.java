package s9;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.F;
import t9.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3391h f32339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Inflater f32340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f32341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f32342j;

    public c(boolean z10) {
        this.f32342j = z10;
        C3391h c3391h = new C3391h();
        this.f32339g = c3391h;
        Inflater inflater = new Inflater(true);
        this.f32340h = inflater;
        this.f32341i = new q((F) c3391h, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32341i.close();
    }

    public final void d(C3391h buffer) throws IOException {
        AbstractC2855l.g(buffer, "buffer");
        if (!(this.f32339g.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f32342j) {
            this.f32340h.reset();
        }
        this.f32339g.G(buffer);
        this.f32339g.writeInt(65535);
        long bytesRead = this.f32340h.getBytesRead() + this.f32339g.size();
        do {
            this.f32341i.d(buffer, Long.MAX_VALUE);
        } while (this.f32340h.getBytesRead() < bytesRead);
    }
}
