package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f20688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f20689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private FileChannel f20690i;

    public i(File file) {
        this.f20688g = file;
        d();
    }

    @Override // com.facebook.soloader.h
    public int R(ByteBuffer byteBuffer, long j10) {
        return this.f20690i.read(byteBuffer, j10);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20689h.close();
    }

    public void d() {
        FileInputStream fileInputStream = new FileInputStream(this.f20688g);
        this.f20689h = fileInputStream;
        this.f20690i = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f20690i.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f20690i.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f20690i.write(byteBuffer);
    }
}
