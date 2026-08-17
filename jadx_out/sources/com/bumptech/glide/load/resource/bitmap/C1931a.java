package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1931a implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v1.j f19225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f19226b;

    public C1931a(Resources resources, v1.j jVar) {
        this.f19226b = (Resources) Q1.k.e(resources);
        this.f19225a = (v1.j) Q1.k.e(jVar);
    }

    @Override // v1.j
    public x1.v decode(Object obj, int i10, int i11, v1.h hVar) {
        return V.d(this.f19226b, this.f19225a.decode(obj, i10, i11, hVar));
    }

    @Override // v1.j
    public boolean handles(Object obj, v1.h hVar) {
        return this.f19225a.handles(obj, hVar);
    }
}
