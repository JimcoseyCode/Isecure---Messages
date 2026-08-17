package com.bumptech.glide.integration.avif;

import K1.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.h;
import com.bumptech.glide.load.resource.bitmap.C1931a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import t1.C3360b;
import t1.C3361c;
import v1.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class AvifGlideModule extends b {
    @Override // K1.b
    public void registerComponents(Context context, com.bumptech.glide.b bVar, h hVar) {
        C3360b c3360b = new C3360b(bVar.g());
        hVar.q("Bitmap", ByteBuffer.class, Bitmap.class, c3360b);
        hVar.q("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1931a(context.getResources(), c3360b));
        j c3361c = new C3361c(hVar.g(), c3360b, bVar.f());
        hVar.q("Bitmap", InputStream.class, Bitmap.class, c3361c);
        hVar.q("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1931a(context.getResources(), c3361c));
    }
}
