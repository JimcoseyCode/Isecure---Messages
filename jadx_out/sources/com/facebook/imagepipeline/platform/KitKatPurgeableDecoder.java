package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import c2.k;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import f2.h;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f19908c;

    public KitKatPurgeableDecoder(d dVar) {
        this.f19908c = dVar;
    }

    private static void h(byte[] bArr, int i10) {
        bArr[i10] = -1;
        bArr[i10 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(AbstractC2662a abstractC2662a, BitmapFactory.Options options) {
        h hVar = (h) abstractC2662a.J();
        int size = hVar.size();
        AbstractC2662a abstractC2662aA = this.f19908c.a(size);
        try {
            byte[] bArr = (byte[]) abstractC2662aA.J();
            hVar.h(0, bArr, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            AbstractC2662a.B(abstractC2662aA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(AbstractC2662a abstractC2662a, int i10, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(abstractC2662a, i10) ? null : DalvikPurgeableDecoder.f19894b;
        h hVar = (h) abstractC2662a.J();
        k.b(Boolean.valueOf(i10 <= hVar.size()));
        int i11 = i10 + 2;
        AbstractC2662a abstractC2662aA = this.f19908c.a(i11);
        try {
            byte[] bArr2 = (byte[]) abstractC2662aA.J();
            hVar.h(0, bArr2, 0, i10);
            if (bArr != null) {
                h(bArr2, i10);
                i10 = i11;
            }
            Bitmap bitmap = (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr2, 0, i10, options), "BitmapFactory returned null");
            AbstractC2662a.B(abstractC2662aA);
            return bitmap;
        } catch (Throwable th) {
            AbstractC2662a.B(abstractC2662aA);
            throw th;
        }
    }
}
