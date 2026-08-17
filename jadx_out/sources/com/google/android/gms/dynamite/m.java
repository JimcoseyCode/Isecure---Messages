package com.google.android.gms.dynamite;

import B4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends F4.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final B4.a A(B4.a aVar, String str, int i10, B4.a aVar2) {
        Parcel parcelD = d();
        F4.c.c(parcelD, aVar);
        parcelD.writeString(str);
        parcelD.writeInt(i10);
        F4.c.c(parcelD, aVar2);
        Parcel parcelC = c(8, parcelD);
        B4.a aVarD = a.AbstractBinderC0016a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarD;
    }

    public final B4.a B(B4.a aVar, String str, int i10) {
        Parcel parcelD = d();
        F4.c.c(parcelD, aVar);
        parcelD.writeString(str);
        parcelD.writeInt(i10);
        Parcel parcelC = c(4, parcelD);
        B4.a aVarD = a.AbstractBinderC0016a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarD;
    }

    public final B4.a C(B4.a aVar, String str, boolean z10, long j10) {
        Parcel parcelD = d();
        F4.c.c(parcelD, aVar);
        parcelD.writeString(str);
        parcelD.writeInt(z10 ? 1 : 0);
        parcelD.writeLong(j10);
        Parcel parcelC = c(7, parcelD);
        B4.a aVarD = a.AbstractBinderC0016a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarD;
    }

    public final int f() {
        Parcel parcelC = c(6, d());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final int x(B4.a aVar, String str, boolean z10) {
        Parcel parcelD = d();
        F4.c.c(parcelD, aVar);
        parcelD.writeString(str);
        parcelD.writeInt(z10 ? 1 : 0);
        Parcel parcelC = c(3, parcelD);
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final int y(B4.a aVar, String str, boolean z10) {
        Parcel parcelD = d();
        F4.c.c(parcelD, aVar);
        parcelD.writeString(str);
        parcelD.writeInt(z10 ? 1 : 0);
        Parcel parcelC = c(5, parcelD);
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final B4.a z(B4.a aVar, String str, int i10) {
        Parcel parcelD = d();
        F4.c.c(parcelD, aVar);
        parcelD.writeString(str);
        parcelD.writeInt(i10);
        Parcel parcelC = c(2, parcelD);
        B4.a aVarD = a.AbstractBinderC0016a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarD;
    }
}
