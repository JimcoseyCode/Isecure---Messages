package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1936f implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.d f19249a = new y1.e();

    public x1.v a(ImageDecoder.Source source, int i10, int i11, v1.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new D1.l(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C1937g(bitmapDecodeBitmap, this.f19249a);
    }

    public boolean b(ImageDecoder.Source source, v1.h hVar) {
        return true;
    }

    @Override // v1.j
    public /* bridge */ /* synthetic */ x1.v decode(Object obj, int i10, int i11, v1.h hVar) {
        return a(AbstractC1934d.a(obj), i10, i11, hVar);
    }

    @Override // v1.j
    public /* bridge */ /* synthetic */ boolean handles(Object obj, v1.h hVar) {
        return b(AbstractC1934d.a(obj), hVar);
    }
}
