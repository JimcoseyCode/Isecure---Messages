package com.bumptech.glide.integration.okhttp3;

import K1.b;
import android.content.Context;
import com.bumptech.glide.h;
import com.bumptech.glide.integration.okhttp3.a;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class OkHttpLibraryGlideModule extends b {
    @Override // K1.b
    public void registerComponents(Context context, com.bumptech.glide.b bVar, h hVar) {
        hVar.u(B1.h.class, InputStream.class, new a.C0204a());
    }
}
