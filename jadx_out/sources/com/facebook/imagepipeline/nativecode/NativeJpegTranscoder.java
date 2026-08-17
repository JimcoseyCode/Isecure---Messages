package com.facebook.imagepipeline.nativecode;

import X2.g;
import X2.h;
import android.graphics.ColorSpace;
import c2.AbstractC1841b;
import c2.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k3.C2827a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class NativeJpegTranscoder implements k3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19898c;

    public NativeJpegTranscoder(boolean z10, int i10, boolean z11, boolean z12) {
        this.f19896a = z10;
        this.f19897b = i10;
        this.f19898c = z11;
        if (z12) {
            d.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) throws IOException {
        d.a();
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(k3.e.j(i10)));
        k.c((i11 == 8 && i10 == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) throws IOException {
        d.a();
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(k3.e.i(i10)));
        k.c((i11 == 8 && i10 == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) throws IOException;

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) throws IOException;

    @Override // k3.c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // k3.c
    public boolean b(d3.k kVar, h hVar, g gVar) {
        if (hVar == null) {
            hVar = h.c();
        }
        return k3.e.f(hVar, gVar, kVar, this.f19896a) < 8;
    }

    @Override // k3.c
    public k3.b c(d3.k kVar, OutputStream outputStream, h hVar, g gVar, Q2.c cVar, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (hVar == null) {
            hVar = h.c();
        }
        int iB = C2827a.b(hVar, gVar, kVar, this.f19897b);
        try {
            int iF = k3.e.f(hVar, gVar, kVar, this.f19896a);
            int iA = k3.e.a(iB);
            if (this.f19898c) {
                iF = iA;
            }
            InputStream inputStreamJ = kVar.J();
            if (k3.e.f29114b.contains(Integer.valueOf(kVar.I0()))) {
                f((InputStream) k.h(inputStreamJ, "Cannot transcode from null input stream!"), outputStream, k3.e.d(hVar, kVar), iF, num.intValue());
            } else {
                e((InputStream) k.h(inputStreamJ, "Cannot transcode from null input stream!"), outputStream, k3.e.e(hVar, kVar), iF, num.intValue());
            }
            AbstractC1841b.b(inputStreamJ);
            return new k3.b(iB != 1 ? 0 : 1);
        } catch (Throwable th) {
            AbstractC1841b.b(null);
            throw th;
        }
    }

    @Override // k3.c
    public boolean d(Q2.c cVar) {
        return cVar == Q2.b.f9065b;
    }
}
