package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        boolean zV = false;
        boolean zV2 = false;
        boolean zV3 = false;
        float fX = 0.0f;
        byte[] bArrG = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                zV = AbstractC3324a.v(parcel, iY);
            } else if (iU == 2) {
                bArrG = AbstractC3324a.g(parcel, iY);
            } else if (iU == 3) {
                zV2 = AbstractC3324a.v(parcel, iY);
            } else if (iU == 4) {
                fX = AbstractC3324a.x(parcel, iY);
            } else if (iU != 5) {
                AbstractC3324a.E(parcel, iY);
            } else {
                zV3 = AbstractC3324a.v(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzbr(zV, bArrG, zV2, fX, zV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbr[i10];
    }
}
