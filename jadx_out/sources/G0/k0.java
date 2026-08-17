package g0;

import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class k0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f28067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f28069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceFutureC2904a f28070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c.a f28071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f28072f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f28073g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f28074h = false;

    k0(MediaCodec mediaCodec, int i10) {
        this.f28067a = (MediaCodec) H0.g.g(mediaCodec);
        this.f28068b = H0.g.d(i10);
        this.f28069c = mediaCodec.getInputBuffer(i10);
        final AtomicReference atomicReference = new AtomicReference();
        this.f28070d = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: g0.j0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return k0.f(atomicReference, aVar);
            }
        });
        this.f28071e = (c.a) H0.g.g((c.a) atomicReference.get());
    }

    public static /* synthetic */ Object f(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    private void g() {
        if (this.f28072f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // g0.i0
    public ByteBuffer a() {
        g();
        return this.f28069c;
    }

    @Override // g0.i0
    public InterfaceFutureC2904a b() {
        return J.n.s(this.f28070d);
    }

    @Override // g0.i0
    public void c(boolean z10) {
        g();
        this.f28074h = z10;
    }

    @Override // g0.i0
    public boolean cancel() {
        if (this.f28072f.getAndSet(true)) {
            return false;
        }
        try {
            this.f28067a.queueInputBuffer(this.f28068b, 0, 0, 0L, 0);
            this.f28071e.c(null);
        } catch (IllegalStateException e10) {
            this.f28071e.f(e10);
        }
        return true;
    }

    @Override // g0.i0
    public boolean d() {
        if (this.f28072f.getAndSet(true)) {
            return false;
        }
        try {
            this.f28067a.queueInputBuffer(this.f28068b, this.f28069c.position(), this.f28069c.limit(), this.f28073g, this.f28074h ? 4 : 0);
            this.f28071e.c(null);
            return true;
        } catch (IllegalStateException e10) {
            this.f28071e.f(e10);
            return false;
        }
    }

    @Override // g0.i0
    public void e(long j10) {
        g();
        H0.g.a(j10 >= 0);
        this.f28073g = j10;
    }
}
