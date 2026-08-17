package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1933c implements v1.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1.g f19235b = v1.g.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v1.g f19236c = v1.g.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.b f19237a;

    public C1933c(y1.b bVar) {
        this.f19237a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, v1.h hVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.b(f19236c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // v1.k
    public v1.c a(v1.h hVar) {
        return v1.c.TRANSFORMED;
    }

    @Override // v1.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(x1.v vVar, File file, v1.h hVar) {
        boolean z10;
        Bitmap bitmap = (Bitmap) vVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, hVar);
        R1.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = Q1.g.b();
            int iIntValue = ((Integer) hVar.b(f19235b)).intValue();
            OutputStream cVar = null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    cVar = this.f19237a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f19237a) : fileOutputStream;
                    bitmap.compress(compressFormatD, iIntValue, cVar);
                    cVar.close();
                    try {
                        cVar.close();
                    } catch (IOException unused) {
                    }
                    z10 = true;
                } catch (IOException unused2) {
                    cVar = fileOutputStream;
                    if (cVar != null) {
                        try {
                            cVar.close();
                        } catch (IOException unused3) {
                        }
                    }
                    z10 = false;
                } catch (Throwable th) {
                    th = th;
                    cVar = fileOutputStream;
                    if (cVar != null) {
                        try {
                            cVar.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormatD);
                Q1.l.i(bitmap);
                Q1.g.a(jB);
                Objects.toString(hVar.b(f19236c));
                bitmap.hasAlpha();
            }
            return z10;
        } finally {
            R1.b.e();
        }
    }
}
