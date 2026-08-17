package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        Uri uri = null;
        String strO5 = null;
        String strO6 = null;
        ArrayList arrayListS = null;
        String strO7 = null;
        String strO8 = null;
        long jB = 0;
        int iA = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 2:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 3:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 4:
                    strO3 = AbstractC3324a.o(parcel, iY);
                    break;
                case 5:
                    strO4 = AbstractC3324a.o(parcel, iY);
                    break;
                case 6:
                    uri = (Uri) AbstractC3324a.n(parcel, iY, Uri.CREATOR);
                    break;
                case 7:
                    strO5 = AbstractC3324a.o(parcel, iY);
                    break;
                case 8:
                    jB = AbstractC3324a.B(parcel, iY);
                    break;
                case 9:
                    strO6 = AbstractC3324a.o(parcel, iY);
                    break;
                case 10:
                    arrayListS = AbstractC3324a.s(parcel, iY, Scope.CREATOR);
                    break;
                case 11:
                    strO7 = AbstractC3324a.o(parcel, iY);
                    break;
                case 12:
                    strO8 = AbstractC3324a.o(parcel, iY);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new GoogleSignInAccount(iA, strO, strO2, strO3, strO4, uri, strO5, jB, strO6, arrayListS, strO7, strO8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
