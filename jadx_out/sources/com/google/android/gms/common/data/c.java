package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String[] strArrP = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleF = null;
        int iA = 0;
        int iA2 = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                strArrP = AbstractC3324a.p(parcel, iY);
            } else if (iU == 2) {
                cursorWindowArr = (CursorWindow[]) AbstractC3324a.r(parcel, iY, CursorWindow.CREATOR);
            } else if (iU == 3) {
                iA2 = AbstractC3324a.A(parcel, iY);
            } else if (iU == 4) {
                bundleF = AbstractC3324a.f(parcel, iY);
            } else if (iU != 1000) {
                AbstractC3324a.E(parcel, iY);
            } else {
                iA = AbstractC3324a.A(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        DataHolder dataHolder = new DataHolder(iA, strArrP, cursorWindowArr, iA2, bundleF);
        dataHolder.X();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
