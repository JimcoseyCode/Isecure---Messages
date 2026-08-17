package g0;

import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;

/* JADX INFO: renamed from: g0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2641g implements InterfaceC2643i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ByteBuffer f28051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MediaCodec.BufferInfo f28052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceFutureC2904a f28053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c.a f28054j;

    public C2641g(InterfaceC2643i interfaceC2643i) {
        this.f28052h = k(interfaceC2643i);
        this.f28051g = e(interfaceC2643i);
        final AtomicReference atomicReference = new AtomicReference();
        this.f28053i = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: g0.f
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return C2641g.d(atomicReference, aVar);
            }
        });
        this.f28054j = (c.a) H0.g.g((c.a) atomicReference.get());
    }

    public static /* synthetic */ Object d(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    private ByteBuffer e(InterfaceC2643i interfaceC2643i) {
        ByteBuffer byteBufferA = interfaceC2643i.a();
        MediaCodec.BufferInfo bufferInfoO = interfaceC2643i.O();
        byteBufferA.position(bufferInfoO.offset);
        byteBufferA.limit(bufferInfoO.offset + bufferInfoO.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoO.size);
        byteBufferAllocate.order(byteBufferA.order());
        byteBufferAllocate.put(byteBufferA);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private MediaCodec.BufferInfo k(InterfaceC2643i interfaceC2643i) {
        MediaCodec.BufferInfo bufferInfoO = interfaceC2643i.O();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoO.size, bufferInfoO.presentationTimeUs, bufferInfoO.flags);
        return bufferInfo;
    }

    @Override // g0.InterfaceC2643i
    public MediaCodec.BufferInfo O() {
        return this.f28052h;
    }

    @Override // g0.InterfaceC2643i
    public boolean T() {
        return (this.f28052h.flags & 1) != 0;
    }

    @Override // g0.InterfaceC2643i
    public ByteBuffer a() {
        return this.f28051g;
    }

    @Override // g0.InterfaceC2643i, java.lang.AutoCloseable
    public void close() {
        this.f28054j.c(null);
    }

    @Override // g0.InterfaceC2643i
    public long o0() {
        return this.f28052h.presentationTimeUs;
    }

    @Override // g0.InterfaceC2643i
    public long size() {
        return this.f28052h.size;
    }
}
