package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends D4.a implements IInterface {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void x(zai zaiVar, N4.c cVar) {
        Parcel parcelC = c();
        D4.c.c(parcelC, zaiVar);
        D4.c.d(parcelC, cVar);
        d(12, parcelC);
    }
}
