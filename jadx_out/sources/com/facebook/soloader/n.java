package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FileOutputStream f20708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final FileLock f20709h;

    private n(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f20708g = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f20709h = fileLockLock;
        } catch (Throwable th) {
            this.f20708g.close();
            throw th;
        }
    }

    public static n d(File file) {
        return new n(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f20709h;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f20708g.close();
        }
    }
}
