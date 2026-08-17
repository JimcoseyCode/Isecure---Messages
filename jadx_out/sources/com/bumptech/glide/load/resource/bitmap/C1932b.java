package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1932b implements v1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.d f19232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1.k f19233b;

    public C1932b(y1.d dVar, v1.k kVar) {
        this.f19232a = dVar;
        this.f19233b = kVar;
    }

    @Override // v1.k
    public v1.c a(v1.h hVar) {
        return this.f19233b.a(hVar);
    }

    @Override // v1.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(x1.v vVar, File file, v1.h hVar) {
        return this.f19233b.b(new C1937g(((BitmapDrawable) vVar.get()).getBitmap(), this.f19232a), file, hVar);
    }
}
