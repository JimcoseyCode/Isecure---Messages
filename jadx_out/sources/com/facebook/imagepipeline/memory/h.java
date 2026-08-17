package com.facebook.imagepipeline.memory;

import c2.k;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class h extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinkedList f19892f;

    public h(int i10, int i11, int i12) {
        super(i10, i11, i12, false);
        this.f19892f = new LinkedList();
    }

    @Override // com.facebook.imagepipeline.memory.b
    void a(Object obj) {
        g2.f fVar = (g2.f) this.f19892f.poll();
        if (fVar == null) {
            fVar = new g2.f();
        }
        fVar.c(obj);
        this.f19881c.add(fVar);
    }

    @Override // com.facebook.imagepipeline.memory.b
    public Object g() {
        g2.f fVar = (g2.f) this.f19881c.poll();
        k.g(fVar);
        Object objB = fVar.b();
        fVar.a();
        this.f19892f.add(fVar);
        return objB;
    }
}
