package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC3324a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2180q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        boolean zV = false;
        zzbt zzbtVar = null;
        zzbv zzbvVar = null;
        boolean zV2 = false;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                zzbtVar = (zzbt) AbstractC3324a.n(parcel, iY, zzbt.CREATOR);
            } else if (iU == 2) {
                zzbvVar = (zzbv) AbstractC3324a.n(parcel, iY, zzbv.CREATOR);
            } else if (iU == 3) {
                zV = AbstractC3324a.v(parcel, iY);
            } else if (iU != 4) {
                AbstractC3324a.E(parcel, iY);
            } else {
                zV2 = AbstractC3324a.v(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzbc(zzbtVar, zzbvVar, zV, zV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbc[i10];
    }
}
