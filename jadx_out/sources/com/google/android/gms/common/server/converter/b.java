package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        ArrayList arrayListS = null;
        int iA = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                iA = AbstractC3324a.A(parcel, iY);
            } else if (iU != 2) {
                AbstractC3324a.E(parcel, iY);
            } else {
                arrayListS = AbstractC3324a.s(parcel, iY, zac.CREATOR);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new StringToIntConverter(iA, arrayListS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StringToIntConverter[i10];
    }
}
