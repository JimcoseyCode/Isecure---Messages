package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class W implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1949t f19212a;

    public W(C1949t c1949t) {
        this.f19212a = c1949t;
    }

    private boolean c(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x1.v decode(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, v1.h hVar) {
        return this.f19212a.d(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(ParcelFileDescriptor parcelFileDescriptor, v1.h hVar) {
        return c(parcelFileDescriptor) && this.f19212a.o(parcelFileDescriptor);
    }
}
