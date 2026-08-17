package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1942l extends AbstractC1938h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19254b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(v1.f.f32884a);

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1938h
    protected Bitmap b(y1.d dVar, Bitmap bitmap, int i10, int i11) {
        return a0.b(dVar, bitmap, i10, i11);
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        return obj instanceof C1942l;
    }

    @Override // v1.f
    public int hashCode() {
        return -670243078;
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f19254b);
    }
}
