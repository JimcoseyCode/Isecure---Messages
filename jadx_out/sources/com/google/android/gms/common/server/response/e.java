package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        Parcel parcelL = null;
        int iA = 0;
        zan zanVar = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                iA = AbstractC3324a.A(parcel, iY);
            } else if (iU == 2) {
                parcelL = AbstractC3324a.l(parcel, iY);
            } else if (iU != 3) {
                AbstractC3324a.E(parcel, iY);
            } else {
                zanVar = (zan) AbstractC3324a.n(parcel, iY, zan.CREATOR);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new SafeParcelResponse(iA, parcelL, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SafeParcelResponse[i10];
    }
}
