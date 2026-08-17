package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        int iA = 0;
        boolean zV = false;
        boolean zV2 = false;
        IBinder iBinderZ = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                iA = AbstractC3324a.A(parcel, iY);
            } else if (iU == 2) {
                iBinderZ = AbstractC3324a.z(parcel, iY);
            } else if (iU == 3) {
                connectionResult = (ConnectionResult) AbstractC3324a.n(parcel, iY, ConnectionResult.CREATOR);
            } else if (iU == 4) {
                zV = AbstractC3324a.v(parcel, iY);
            } else if (iU != 5) {
                AbstractC3324a.E(parcel, iY);
            } else {
                zV2 = AbstractC3324a.v(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zav(iA, iBinderZ, connectionResult, zV, zV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zav[i10];
    }
}
