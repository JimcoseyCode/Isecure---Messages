package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Y implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F1.l f19219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.d f19220b;

    public Y(F1.l lVar, y1.d dVar) {
        this.f19219a = lVar;
        this.f19220b = dVar;
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x1.v decode(Uri uri, int i10, int i11, v1.h hVar) {
        x1.v vVarDecode = this.f19219a.decode(uri, i10, i11, hVar);
        if (vVarDecode == null) {
            return null;
        }
        return AbstractC1950u.a(this.f19220b, (Drawable) vVarDecode.get(), i10, i11);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Uri uri, v1.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
