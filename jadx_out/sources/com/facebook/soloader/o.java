package com.facebook.soloader;

import z3.AbstractC3674b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class o implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f20710a;

    public o(x xVar) {
        this.f20710a = xVar;
    }

    @Override // com.facebook.soloader.x
    public void a(String str, int i10) {
        AbstractC3674b.j(this.f20710a, "load", i10);
        try {
            this.f20710a.a(str, i10);
            AbstractC3674b.i(null);
        } finally {
        }
    }
}
