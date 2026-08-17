package com.facebook.animated.gif;

import R2.b;
import R2.c;
import X2.d;
import android.graphics.Bitmap;
import c2.k;
import java.nio.ByteBuffer;
import y3.AbstractC3612a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class GifImage implements c, S2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f19676b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap.Config f19677a = null;
    private long mNativeContext;

    public GifImage() {
    }

    public static GifImage f(ByteBuffer byteBuffer, d dVar) {
        h();
        byteBuffer.rewind();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, dVar.f12415b, dVar.f12420g);
        gifImageNativeCreateFromDirectByteBuffer.f19677a = dVar.f12422i;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    public static GifImage g(long j10, int i10, d dVar) {
        h();
        k.b(Boolean.valueOf(j10 != 0));
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j10, i10, dVar.f12415b, dVar.f12420g);
        gifImageNativeCreateFromNativeMemory.f19677a = dVar.f12422i;
        return gifImageNativeCreateFromNativeMemory;
    }

    private static synchronized void h() {
        if (!f19676b) {
            f19676b = true;
            AbstractC3612a.d("gifimage");
        }
    }

    private static b.EnumC0104b i(int i10) {
        return i10 == 0 ? b.EnumC0104b.DISPOSE_DO_NOT : i10 == 1 ? b.EnumC0104b.DISPOSE_DO_NOT : i10 == 2 ? b.EnumC0104b.DISPOSE_TO_BACKGROUND : i10 == 3 ? b.EnumC0104b.DISPOSE_TO_PREVIOUS : b.EnumC0104b.DISPOSE_DO_NOT;
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i10, boolean z10);

    private static native GifImage nativeCreateFromFileDescriptor(int i10, int i11, boolean z10);

    private static native GifImage nativeCreateFromNativeMemory(long j10, int i10, int i11, boolean z10);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i10);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // R2.c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // R2.c
    public int b() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // R2.c
    public b c(int i10) {
        GifFrame gifFrameN = n(i10);
        try {
            return new b(i10, gifFrameN.b(), gifFrameN.c(), gifFrameN.getWidth(), gifFrameN.getHeight(), b.a.BLEND_WITH_PREVIOUS, i(gifFrameN.d()));
        } finally {
            gifFrameN.dispose();
        }
    }

    @Override // S2.c
    public c d(ByteBuffer byteBuffer, d dVar) {
        return f(byteBuffer, dVar);
    }

    @Override // S2.c
    public c e(long j10, int i10, d dVar) {
        return g(j10, i10, dVar);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // R2.c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // R2.c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // R2.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public GifFrame n(int i10) {
        return nativeGetFrame(i10);
    }

    @Override // R2.c
    public int l() {
        return nativeGetSizeInBytes();
    }

    @Override // R2.c
    public Bitmap.Config m() {
        return this.f19677a;
    }

    @Override // R2.c
    public boolean o() {
        return false;
    }

    @Override // R2.c
    public int[] p() {
        return nativeGetFrameDurations();
    }

    GifImage(long j10) {
        this.mNativeContext = j10;
    }
}
