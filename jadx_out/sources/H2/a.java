package H2;

import g2.AbstractC2662a;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2662a f3690h;

    public a(int i10, AbstractC2662a bitmap) {
        AbstractC2855l.g(bitmap, "bitmap");
        this.f3689g = i10;
        this.f3690h = bitmap;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3690h.close();
    }

    public final AbstractC2662a d() {
        return this.f3690h;
    }

    public final int e() {
        return this.f3689g;
    }
}
