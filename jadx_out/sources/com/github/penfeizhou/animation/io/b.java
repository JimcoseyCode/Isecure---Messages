package com.github.penfeizhou.animation.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ByteBuffer f20899a;

    public b() {
        d(10240);
    }

    public int a() {
        return this.f20899a.position();
    }

    public void b(byte b10) {
        this.f20899a.put(b10);
    }

    public void c(byte[] bArr) {
        this.f20899a.put(bArr);
    }

    public void d(int i10) {
        ByteBuffer byteBuffer = this.f20899a;
        if (byteBuffer == null || i10 > byteBuffer.capacity()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            this.f20899a = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f20899a.clear();
    }

    public void e(int i10) {
        this.f20899a.position(i10 + a());
    }

    public byte[] f() {
        return this.f20899a.array();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() {
    }
}
