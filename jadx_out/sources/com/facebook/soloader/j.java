package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f20691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ZipEntry f20692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ZipFile f20693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f20694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20695k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f20696l = 0;

    public j(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f20693i = zipFile;
        this.f20692h = zipEntry;
        this.f20694j = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f20691g = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.h
    public int R(ByteBuffer byteBuffer, long j10) throws IOException {
        if (this.f20691g == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j11 = this.f20694j - j10;
        if (j11 <= 0) {
            return -1;
        }
        int i10 = (int) j11;
        if (iRemaining > i10) {
            iRemaining = i10;
        }
        d(j10);
        if (byteBuffer.hasArray()) {
            this.f20691g.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f20691g.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f20696l += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f20691g;
        if (inputStream != null) {
            inputStream.close();
            this.f20695k = false;
        }
    }

    public h d(long j10) throws IOException {
        InputStream inputStream = this.f20691g;
        if (inputStream == null) {
            throw new IOException(this.f20692h.getName() + "'s InputStream is null");
        }
        long j11 = this.f20696l;
        if (j10 == j11) {
            return this;
        }
        long j12 = this.f20694j;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j10 >= j11) {
            inputStream.skip(j10 - j11);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f20693i.getInputStream(this.f20692h);
            this.f20691g = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f20692h.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j10);
        }
        this.f20696l = j10;
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f20695k;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return R(byteBuffer, this.f20696l);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
