package com.github.penfeizhou.animation.glide;

import I1.e;
import com.bumptech.glide.load.resource.bitmap.C1937g;
import java.io.IOException;
import v1.h;
import x1.v;
import y1.d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f20889a;

    a(d dVar) {
        this.f20889a = dVar;
    }

    @Override // I1.e
    public v transcode(v vVar, h hVar) {
        try {
            return C1937g.d(((com.github.penfeizhou.animation.decode.b) vVar.get()).v(0), this.f20889a);
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
