package com.google.android.gms.common.api.internal;

import P4.AbstractC1378l;
import P4.C1379m;
import P4.InterfaceC1372f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class f implements InterfaceC1372f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1379m f21057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f21058b;

    f(g gVar, C1379m c1379m) {
        this.f21058b = gVar;
        this.f21057a = c1379m;
    }

    @Override // P4.InterfaceC1372f
    public final void onComplete(AbstractC1378l abstractC1378l) {
        this.f21058b.f21060b.remove(this.f21057a);
    }
}
