package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        ArrayList arrayListS = null;
        Account account = null;
        String strO = null;
        String strO2 = null;
        ArrayList arrayListS2 = null;
        String strO3 = null;
        int iA = 0;
        boolean zV = false;
        boolean zV2 = false;
        boolean zV3 = false;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 2:
                    arrayListS = AbstractC3324a.s(parcel, iY, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) AbstractC3324a.n(parcel, iY, Account.CREATOR);
                    break;
                case 4:
                    zV = AbstractC3324a.v(parcel, iY);
                    break;
                case 5:
                    zV2 = AbstractC3324a.v(parcel, iY);
                    break;
                case 6:
                    zV3 = AbstractC3324a.v(parcel, iY);
                    break;
                case 7:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 8:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 9:
                    arrayListS2 = AbstractC3324a.s(parcel, iY, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    strO3 = AbstractC3324a.o(parcel, iY);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new GoogleSignInOptions(iA, arrayListS, account, zV, zV2, zV3, strO, strO2, arrayListS2, strO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
