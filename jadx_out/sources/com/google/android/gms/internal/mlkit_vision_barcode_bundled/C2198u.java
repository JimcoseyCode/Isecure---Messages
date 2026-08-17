package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC3324a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2198u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        zzat zzatVar = null;
        String strO = null;
        String strO2 = null;
        zzau[] zzauVarArr = null;
        zzar[] zzarVarArr = null;
        String[] strArrP = null;
        zzam[] zzamVarArr = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    zzatVar = (zzat) AbstractC3324a.n(parcel, iY, zzat.CREATOR);
                    break;
                case 2:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 3:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 4:
                    zzauVarArr = (zzau[]) AbstractC3324a.r(parcel, iY, zzau.CREATOR);
                    break;
                case 5:
                    zzarVarArr = (zzar[]) AbstractC3324a.r(parcel, iY, zzar.CREATOR);
                    break;
                case 6:
                    strArrP = AbstractC3324a.p(parcel, iY);
                    break;
                case 7:
                    zzamVarArr = (zzam[]) AbstractC3324a.r(parcel, iY, zzam.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzap(zzatVar, strO, strO2, zzauVarArr, zzarVarArr, strArrP, zzamVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzap[i10];
    }
}
