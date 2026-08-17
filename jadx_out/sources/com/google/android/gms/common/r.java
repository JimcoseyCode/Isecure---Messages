package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        boolean zV = false;
        boolean zV2 = false;
        boolean zV3 = false;
        boolean zV4 = false;
        String strO = null;
        IBinder iBinderZ = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 2:
                    zV = AbstractC3324a.v(parcel, iY);
                    break;
                case 3:
                    zV2 = AbstractC3324a.v(parcel, iY);
                    break;
                case 4:
                    iBinderZ = AbstractC3324a.z(parcel, iY);
                    break;
                case 5:
                    zV3 = AbstractC3324a.v(parcel, iY);
                    break;
                case 6:
                    zV4 = AbstractC3324a.v(parcel, iY);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzo(strO, zV, zV2, iBinderZ, zV3, zV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
