package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import v4.e;
import v4.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends D4.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void x(e eVar, ApiFeatureRequest apiFeatureRequest) {
        Parcel parcelC = c();
        D4.c.d(parcelC, eVar);
        D4.c.c(parcelC, apiFeatureRequest);
        d(1, parcelC);
    }

    public final void y(e eVar, ApiFeatureRequest apiFeatureRequest, f fVar) {
        Parcel parcelC = c();
        D4.c.d(parcelC, eVar);
        D4.c.c(parcelC, apiFeatureRequest);
        D4.c.d(parcelC, fVar);
        d(2, parcelC);
    }
}
