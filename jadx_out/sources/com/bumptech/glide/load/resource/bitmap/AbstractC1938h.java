package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1938h implements v1.l {
    @Override // v1.l
    public final x1.v a(Context context, x1.v vVar, int i10, int i11) {
        if (!Q1.l.u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        y1.d dVarG = com.bumptech.glide.b.d(context).g();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapB = b(dVarG, bitmap, i10, i11);
        return bitmap.equals(bitmapB) ? vVar : C1937g.d(bitmapB, dVarG);
    }

    protected abstract Bitmap b(y1.d dVar, Bitmap bitmap, int i10, int i11);
}
