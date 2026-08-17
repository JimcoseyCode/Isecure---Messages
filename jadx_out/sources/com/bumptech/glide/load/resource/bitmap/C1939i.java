package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1939i implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1949t f19252a;

    public C1939i(C1949t c1949t) {
        this.f19252a = c1949t;
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x1.v decode(ByteBuffer byteBuffer, int i10, int i11, v1.h hVar) {
        return this.f19252a.g(byteBuffer, i10, i11, hVar);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(ByteBuffer byteBuffer, v1.h hVar) {
        return this.f19252a.q(byteBuffer);
    }
}
