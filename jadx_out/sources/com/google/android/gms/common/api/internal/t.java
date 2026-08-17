package com.google.android.gms.common.api.internal;

import P4.C1379m;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.d;
import o4.C3008a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class t extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d.a f21101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(d.a aVar, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.f21101d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final void b(C3008a.b bVar, C1379m c1379m) {
        this.f21101d.f21053a.accept(bVar, c1379m);
    }
}
