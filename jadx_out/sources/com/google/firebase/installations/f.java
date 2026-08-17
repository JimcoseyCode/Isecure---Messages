package com.google.firebase.installations;

import P4.C1379m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C1379m f24110a;

    public f(C1379m c1379m) {
        this.f24110a = c1379m;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(E5.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f24110a.e(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
