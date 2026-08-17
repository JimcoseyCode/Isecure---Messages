package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class U implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1936f f19209a = new C1936f();

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x1.v decode(InputStream inputStream, int i10, int i11, v1.h hVar) {
        return this.f19209a.a(ImageDecoder.createSource(Q1.a.b(inputStream)), i10, i11, hVar);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(InputStream inputStream, v1.h hVar) {
        return true;
    }
}
