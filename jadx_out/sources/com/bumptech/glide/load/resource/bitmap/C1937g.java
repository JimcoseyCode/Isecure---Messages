package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1937g implements x1.v, x1.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bitmap f19250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y1.d f19251h;

    public C1937g(Bitmap bitmap, y1.d dVar) {
        this.f19250g = (Bitmap) Q1.k.f(bitmap, "Bitmap must not be null");
        this.f19251h = (y1.d) Q1.k.f(dVar, "BitmapPool must not be null");
    }

    public static C1937g d(Bitmap bitmap, y1.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1937g(bitmap, dVar);
    }

    @Override // x1.v
    public Class a() {
        return Bitmap.class;
    }

    @Override // x1.v
    public int b() {
        return Q1.l.i(this.f19250g);
    }

    @Override // x1.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f19250g;
    }

    @Override // x1.r
    public void initialize() {
        this.f19250g.prepareToDraw();
    }

    @Override // x1.v
    public void recycle() {
        this.f19251h.c(this.f19250g);
    }
}
