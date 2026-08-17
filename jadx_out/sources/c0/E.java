package c0;

import c0.p;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class E implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f18692a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f18693b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f18696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f18697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p.a f18698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f18699h;

    public E(AbstractC1834a abstractC1834a) {
        this.f18694c = abstractC1834a.d();
        this.f18695d = abstractC1834a.e();
    }

    private static void d(long j10) {
        long jG = j10 - g();
        if (jG > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jG));
            } catch (InterruptedException e10) {
                AbstractC3583h0.m("SilentAudioStream", "Ignore interruption", e10);
            }
        }
    }

    private void e() {
        H0.g.j(!this.f18693b.get(), "AudioStream has been released.");
    }

    private void f() {
        H0.g.j(this.f18692a.get(), "AudioStream has not been started.");
    }

    private static long g() {
        return System.nanoTime();
    }

    private void h() {
        final p.a aVar = this.f18698g;
        Executor executor = this.f18699h;
        if (aVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: c0.D
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(true);
            }
        });
    }

    private void i(ByteBuffer byteBuffer, int i10) {
        H0.g.i(i10 <= byteBuffer.remaining());
        byte[] bArr = this.f18696e;
        if (bArr == null || bArr.length < i10) {
            this.f18696e = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f18696e, 0, i10).limit(i10 + iPosition).position(iPosition);
    }

    @Override // c0.p
    public void a() {
        this.f18693b.getAndSet(true);
    }

    @Override // c0.p
    public void b(p.a aVar, Executor executor) {
        boolean z10 = true;
        H0.g.j(!this.f18692a.get(), "AudioStream can not be started when setCallback.");
        e();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        H0.g.b(z10, "executor can't be null with non-null callback.");
        this.f18698g = aVar;
        this.f18699h = executor;
    }

    @Override // c0.p
    public p.c read(ByteBuffer byteBuffer) {
        e();
        f();
        long jG = t.g(byteBuffer.remaining(), this.f18694c);
        int iE = (int) t.e(jG, this.f18694c);
        if (iE <= 0) {
            return p.c.c(0, this.f18697f);
        }
        long jD = this.f18697f + t.d(jG, this.f18695d);
        d(jD);
        i(byteBuffer, iE);
        p.c cVarC = p.c.c(iE, this.f18697f);
        this.f18697f = jD;
        return cVarC;
    }

    @Override // c0.p
    public void start() {
        e();
        if (this.f18692a.getAndSet(true)) {
            return;
        }
        this.f18697f = g();
        h();
    }

    @Override // c0.p
    public void stop() {
        e();
        this.f18692a.set(false);
    }
}
