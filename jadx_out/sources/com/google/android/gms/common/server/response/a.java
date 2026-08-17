package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        String strO2 = null;
        zaa zaaVar = null;
        int iA = 0;
        int iA2 = 0;
        boolean zV = false;
        int iA3 = 0;
        boolean zV2 = false;
        int iA4 = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 2:
                    iA2 = AbstractC3324a.A(parcel, iY);
                    break;
                case 3:
                    zV = AbstractC3324a.v(parcel, iY);
                    break;
                case 4:
                    iA3 = AbstractC3324a.A(parcel, iY);
                    break;
                case 5:
                    zV2 = AbstractC3324a.v(parcel, iY);
                    break;
                case 6:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 7:
                    iA4 = AbstractC3324a.A(parcel, iY);
                    break;
                case 8:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 9:
                    zaaVar = (zaa) AbstractC3324a.n(parcel, iY, zaa.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new FastJsonResponse.Field(iA, iA2, zV, iA3, zV2, strO, iA4, strO2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FastJsonResponse.Field[i10];
    }
}
