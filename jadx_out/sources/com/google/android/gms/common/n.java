package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class n extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f21313d;

    n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f21313d = bArr;
    }

    @Override // com.google.android.gms.common.m
    final byte[] x() {
        return this.f21313d;
    }
}
