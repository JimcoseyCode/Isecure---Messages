package g0;

import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;

/* JADX INFO: renamed from: g0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2645k implements InterfaceC2643i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MediaCodec f28060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MediaCodec.BufferInfo f28061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f28062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ByteBuffer f28063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceFutureC2904a f28064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c.a f28065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f28066m = new AtomicBoolean(false);

    C2645k(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        this.f28060g = (MediaCodec) H0.g.g(mediaCodec);
        this.f28062i = i10;
        this.f28063j = mediaCodec.getOutputBuffer(i10);
        this.f28061h = (MediaCodec.BufferInfo) H0.g.g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f28064k = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: g0.j
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return C2645k.d(atomicReference, aVar);
            }
        });
        this.f28065l = (c.a) H0.g.g((c.a) atomicReference.get());
    }

    public static /* synthetic */ Object d(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    private void k() {
        if (this.f28066m.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // g0.InterfaceC2643i
    public MediaCodec.BufferInfo O() {
        return this.f28061h;
    }

    @Override // g0.InterfaceC2643i
    public boolean T() {
        return (this.f28061h.flags & 1) != 0;
    }

    @Override // g0.InterfaceC2643i
    public ByteBuffer a() {
        k();
        this.f28063j.position(this.f28061h.offset);
        ByteBuffer byteBuffer = this.f28063j;
        MediaCodec.BufferInfo bufferInfo = this.f28061h;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f28063j;
    }

    @Override // g0.InterfaceC2643i, java.lang.AutoCloseable
    public void close() {
        if (this.f28066m.getAndSet(true)) {
            return;
        }
        try {
            this.f28060g.releaseOutputBuffer(this.f28062i, false);
            this.f28065l.c(null);
        } catch (IllegalStateException e10) {
            this.f28065l.f(e10);
        }
    }

    public InterfaceFutureC2904a e() {
        return J.n.s(this.f28064k);
    }

    @Override // g0.InterfaceC2643i
    public long o0() {
        return this.f28061h.presentationTimeUs;
    }

    @Override // g0.InterfaceC2643i
    public long size() {
        return this.f28061h.size;
    }
}
