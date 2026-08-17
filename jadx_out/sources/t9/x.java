package t9;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements F {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f32629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3391h f32630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private A f32631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f32634l;

    public x(j upstream) {
        AbstractC2855l.g(upstream, "upstream");
        this.f32629g = upstream;
        C3391h c3391hC = upstream.c();
        this.f32630h = c3391hC;
        A a10 = c3391hC.f32592g;
        this.f32631i = a10;
        this.f32632j = a10 != null ? a10.f32552b : -1;
    }

    @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32633k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f32552b) goto L15;
     */
    @Override // t9.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(C3391h sink, long j10) {
        A a10;
        AbstractC2855l.g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f32633k) {
            throw new IllegalStateException("closed");
        }
        A a11 = this.f32631i;
        if (a11 != null) {
            A a12 = this.f32630h.f32592g;
            if (a11 == a12) {
                int i10 = this.f32632j;
                AbstractC2855l.d(a12);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f32629g.e0(this.f32634l + 1)) {
            return -1L;
        }
        if (this.f32631i == null && (a10 = this.f32630h.f32592g) != null) {
            this.f32631i = a10;
            AbstractC2855l.d(a10);
            this.f32632j = a10.f32552b;
        }
        long jMin = Math.min(j10, this.f32630h.size() - this.f32634l);
        this.f32630h.B(sink, this.f32634l, jMin);
        this.f32634l += jMin;
        return jMin;
    }

    @Override // t9.F
    public G timeout() {
        return this.f32629g.timeout();
    }
}
