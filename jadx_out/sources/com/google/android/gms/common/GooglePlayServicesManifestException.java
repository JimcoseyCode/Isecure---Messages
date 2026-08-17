package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20999g;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f20999g = i10;
    }
}
