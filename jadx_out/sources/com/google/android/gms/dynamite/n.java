package com.google.android.gms.dynamite;

import B4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends F4.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final B4.a f(B4.a aVar, String str, int i10, B4.a aVar2) {
        Parcel parcelD = d();
        F4.c.c(parcelD, aVar);
        parcelD.writeString(str);
        parcelD.writeInt(i10);
        F4.c.c(parcelD, aVar2);
        Parcel parcelC = c(2, parcelD);
        B4.a aVarD = a.AbstractBinderC0016a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarD;
    }

    public final B4.a x(B4.a aVar, String str, int i10, B4.a aVar2) {
        Parcel parcelD = d();
        F4.c.c(parcelD, aVar);
        parcelD.writeString(str);
        parcelD.writeInt(i10);
        F4.c.c(parcelD, aVar2);
        Parcel parcelC = c(3, parcelD);
        B4.a aVarD = a.AbstractBinderC0016a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarD;
    }
}
