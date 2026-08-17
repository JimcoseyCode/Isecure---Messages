package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class V implements x1.v, x1.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Resources f19210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x1.v f19211h;

    private V(Resources resources, x1.v vVar) {
        this.f19210g = (Resources) Q1.k.e(resources);
        this.f19211h = (x1.v) Q1.k.e(vVar);
    }

    public static x1.v d(Resources resources, x1.v vVar) {
        if (vVar == null) {
            return null;
        }
        return new V(resources, vVar);
    }

    @Override // x1.v
    public Class a() {
        return BitmapDrawable.class;
    }

    @Override // x1.v
    public int b() {
        return this.f19211h.b();
    }

    @Override // x1.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f19210g, (Bitmap) this.f19211h.get());
    }

    @Override // x1.r
    public void initialize() {
        x1.v vVar = this.f19211h;
        if (vVar instanceof x1.r) {
            ((x1.r) vVar).initialize();
        }
    }

    @Override // x1.v
    public void recycle() {
        this.f19211h.recycle();
    }
}
