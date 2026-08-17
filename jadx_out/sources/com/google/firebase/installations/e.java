package com.google.firebase.installations;

import P4.C1379m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f24108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1379m f24109b;

    public e(i iVar, C1379m c1379m) {
        this.f24108a = iVar;
        this.f24109b = c1379m;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(E5.d dVar) {
        if (!dVar.k() || this.f24108a.f(dVar)) {
            return false;
        }
        this.f24109b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.f24109b.d(exc);
        return true;
    }
}
