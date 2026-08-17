package com.github.penfeizhou.animation.glide;

import O3.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.h;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class GlideAnimationModule extends K1.b {
    @Override // K1.b
    public void registerComponents(Context context, com.bumptech.glide.b bVar, h hVar) {
        super.registerComponents(context, bVar, hVar);
        O3.b bVar2 = new O3.b();
        hVar.p(InputStream.class, com.github.penfeizhou.animation.decode.b.class, new c(bVar2));
        hVar.p(ByteBuffer.class, com.github.penfeizhou.animation.decode.b.class, bVar2);
        hVar.t(com.github.penfeizhou.animation.decode.b.class, Drawable.class, new b());
        hVar.t(com.github.penfeizhou.animation.decode.b.class, Bitmap.class, new a(bVar.g()));
    }
}
