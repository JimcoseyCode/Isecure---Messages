package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    String getName();

    W1.d getPostprocessorCacheKey();

    AbstractC2662a process(Bitmap bitmap, V2.d dVar);
}
