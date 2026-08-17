package com.github.penfeizhou.animation.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements Reader {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final ByteBuffer f20898g;

    public a(ByteBuffer byteBuffer) {
        this.f20898g = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int available() {
        return this.f20898g.limit() - this.f20898g.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() {
        return this.f20898g.get();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.f20898g.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i10, int i11) {
        this.f20898g.get(bArr, i10, i11);
        return i11;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void reset() {
        this.f20898g.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public long skip(long j10) {
        ByteBuffer byteBuffer = this.f20898g;
        byteBuffer.position((int) (((long) byteBuffer.position()) + j10));
        return j10;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() {
        return new ByteArrayInputStream(this.f20898g.array());
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void close() {
    }
}
