package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import c2.AbstractC1840a;
import c2.AbstractC1841b;
import c2.k;
import c2.p;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import f2.h;
import f2.j;
import g2.AbstractC2662a;
import i2.C2724a;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import l2.InterfaceC2865b;
import l2.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f19906d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2865b f19907c = c.i();

    private static MemoryFile h(AbstractC2662a abstractC2662a, int i10, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        C2724a c2724a;
        j jVar;
        j jVar2 = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i10);
        memoryFile.allowPurging(false);
        try {
            jVar = new j((h) abstractC2662a.J());
            try {
                c2724a = new C2724a(jVar, i10);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                c2724a = null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
            c2724a = null;
        }
        try {
            outputStream2 = memoryFile.getOutputStream();
            AbstractC1840a.a(c2724a, outputStream2);
            if (bArr != null) {
                memoryFile.writeBytes(bArr, 0, i10, bArr.length);
            }
            AbstractC2662a.B(abstractC2662a);
            AbstractC1841b.b(jVar);
            AbstractC1841b.b(c2724a);
            AbstractC1841b.a(outputStream2, true);
            return memoryFile;
        } catch (Throwable th3) {
            th = th3;
            outputStream = outputStream2;
            jVar2 = jVar;
            AbstractC2662a.B(abstractC2662a);
            AbstractC1841b.b(jVar2);
            AbstractC1841b.b(c2724a);
            AbstractC1841b.a(outputStream, true);
            throw th;
        }
    }

    private Bitmap i(AbstractC2662a abstractC2662a, int i10, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFileH;
        MemoryFile memoryFile = null;
        try {
            try {
                memoryFileH = h(abstractC2662a, i10, bArr);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            FileDescriptor fileDescriptorK = k(memoryFileH);
            InterfaceC2865b interfaceC2865b = this.f19907c;
            if (interfaceC2865b == null) {
                throw new IllegalStateException("WebpBitmapFactory is null");
            }
            Bitmap bitmap = (Bitmap) k.h(interfaceC2865b.a(fileDescriptorK, null, options), "BitmapFactory returned null");
            if (memoryFileH != null) {
                memoryFileH.close();
            }
            return bitmap;
        } catch (IOException e11) {
            e = e11;
            memoryFile = memoryFileH;
            throw p.a(e);
        } catch (Throwable th2) {
            th = th2;
            memoryFile = memoryFileH;
            if (memoryFile != null) {
                memoryFile.close();
            }
            throw th;
        }
    }

    private synchronized Method j() {
        if (f19906d == null) {
            try {
                f19906d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e10) {
                throw p.a(e10);
            }
        }
        return f19906d;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(j().invoke(memoryFile, null));
        } catch (Exception e10) {
            throw p.a(e10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(AbstractC2662a abstractC2662a, BitmapFactory.Options options) {
        return i(abstractC2662a, ((h) abstractC2662a.J()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(AbstractC2662a abstractC2662a, int i10, BitmapFactory.Options options) {
        return i(abstractC2662a, i10, DalvikPurgeableDecoder.e(abstractC2662a, i10) ? null : DalvikPurgeableDecoder.f19894b, options);
    }
}
