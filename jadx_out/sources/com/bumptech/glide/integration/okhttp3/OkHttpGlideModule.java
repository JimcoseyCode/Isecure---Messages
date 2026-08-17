package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.integration.okhttp3.a;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class OkHttpGlideModule implements K1.a {
    @Override // K1.a
    public void b(Context context, b bVar, h hVar) {
        hVar.u(B1.h.class, InputStream.class, new a.C0204a());
    }

    @Override // K1.a
    public void a(Context context, c cVar) {
    }
}
