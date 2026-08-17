package c0;

import c0.p;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C implements p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f18681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f18682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f18683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f18684j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18686l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f18675a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f18676b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f18677c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f18678d = I.c.g(I.c.a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f18679e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f18680f = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f18685k = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteBuffer f18689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f18690d;

        a(ByteBuffer byteBuffer, p.c cVar, int i10, int i11) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit == cVar.a()) {
                this.f18687a = i10;
                this.f18688b = i11;
                this.f18689c = byteBuffer;
                this.f18690d = cVar.b();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + iLimit + " != " + cVar.a());
        }

        public int a() {
            return this.f18689c.remaining();
        }

        public p.c b(ByteBuffer byteBuffer) {
            int iRemaining;
            long j10 = this.f18690d;
            int iPosition = this.f18689c.position();
            int iPosition2 = byteBuffer.position();
            if (this.f18689c.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.f18690d += t.d(t.g(iRemaining, this.f18687a), this.f18688b);
                ByteBuffer byteBufferDuplicate = this.f18689c.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = this.f18689c.remaining();
                byteBuffer.put(this.f18689c).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            this.f18689c.position(iPosition + iRemaining);
            return p.c.c(iRemaining, j10);
        }
    }

    public C(p pVar, AbstractC1834a abstractC1834a) {
        this.f18681g = pVar;
        int iD = abstractC1834a.d();
        this.f18682h = iD;
        int iE = abstractC1834a.e();
        this.f18683i = iE;
        H0.g.b(((long) iD) > 0, "mBytesPerFrame must be greater than 0.");
        H0.g.b(((long) iE) > 0, "mSampleRate must be greater than 0.");
        this.f18684j = 500;
        this.f18686l = iD * IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
    }

    public static /* synthetic */ void c(C c10) {
        c10.f18685k.set(false);
        c10.f18681g.stop();
        synchronized (c10.f18679e) {
            c10.f18680f = null;
            c10.f18677c.clear();
        }
    }

    public static /* synthetic */ void d(C c10) {
        c10.getClass();
        try {
            c10.f18681g.start();
            c10.l();
        } catch (p.b e10) {
            throw new RuntimeException(e10);
        }
    }

    public static /* synthetic */ void e(C c10) {
        c10.f18685k.set(false);
        c10.f18681g.a();
        synchronized (c10.f18679e) {
            c10.f18680f = null;
            c10.f18677c.clear();
        }
    }

    private void i() {
        H0.g.j(!this.f18676b.get(), "AudioStream has been released.");
    }

    private void j() {
        H0.g.j(this.f18675a.get(), "AudioStream has not been started.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f18685k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f18686l);
            a aVar = new a(byteBufferAllocateDirect, this.f18681g.read(byteBufferAllocateDirect), this.f18682h, this.f18683i);
            int i10 = this.f18684j;
            synchronized (this.f18679e) {
                try {
                    this.f18677c.offer(aVar);
                    while (this.f18677c.size() > i10) {
                        this.f18677c.poll();
                        AbstractC3583h0.l("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f18685k.get()) {
                this.f18678d.execute(new Runnable() { // from class: c0.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18673g.k();
                    }
                });
            }
        }
    }

    private void l() {
        if (this.f18685k.getAndSet(true)) {
            return;
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i10) {
        int i11 = this.f18686l;
        if (i11 == i10) {
            return;
        }
        int i12 = this.f18682h;
        this.f18686l = (i10 / i12) * i12;
        AbstractC3583h0.a("BufferedAudioStream", "Update buffer size from " + i11 + " to " + this.f18686l);
    }

    private void n(final int i10) {
        this.f18678d.execute(new Runnable() { // from class: c0.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f18787g.m(i10);
            }
        });
    }

    @Override // c0.p
    public void a() {
        if (this.f18676b.getAndSet(true)) {
            return;
        }
        this.f18678d.execute(new Runnable() { // from class: c0.B
            @Override // java.lang.Runnable
            public final void run() {
                C.e(this.f18674g);
            }
        });
    }

    @Override // c0.p
    public void b(final p.a aVar, final Executor executor) {
        boolean z10 = true;
        H0.g.j(!this.f18675a.get(), "AudioStream can not be started when setCallback.");
        i();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        H0.g.b(z10, "executor can't be null with non-null callback.");
        this.f18678d.execute(new Runnable() { // from class: c0.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f18783g.f18681g.b(aVar, executor);
            }
        });
    }

    @Override // c0.p
    public p.c read(ByteBuffer byteBuffer) {
        boolean z10;
        i();
        j();
        n(byteBuffer.remaining());
        p.c cVarC = p.c.c(0, 0L);
        do {
            synchronized (this.f18679e) {
                try {
                    a aVar = this.f18680f;
                    this.f18680f = null;
                    if (aVar == null) {
                        aVar = (a) this.f18677c.poll();
                    }
                    if (aVar != null) {
                        cVarC = aVar.b(byteBuffer);
                        if (aVar.a() > 0) {
                            this.f18680f = aVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z10 = cVarC.a() <= 0 && this.f18675a.get() && !this.f18676b.get();
            if (z10) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e10) {
                    AbstractC3583h0.m("BufferedAudioStream", "Interruption while waiting for audio data", e10);
                    return cVarC;
                }
            }
        } while (z10);
        return cVarC;
    }

    @Override // c0.p
    public void start() throws p.b {
        i();
        if (this.f18675a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: c0.y
            @Override // java.lang.Runnable
            public final void run() {
                C.d(this.f18786g);
            }
        }, null);
        this.f18678d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f18675a.set(false);
            throw new p.b(e10);
        }
    }

    @Override // c0.p
    public void stop() {
        i();
        if (this.f18675a.getAndSet(false)) {
            this.f18678d.execute(new Runnable() { // from class: c0.w
                @Override // java.lang.Runnable
                public final void run() {
                    C.c(this.f18782g);
                }
            });
        }
    }
}
