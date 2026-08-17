package v4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import s4.AbstractC3324a;

/* JADX INFO: renamed from: v4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3427c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        ArrayList arrayListS = null;
        String strO = null;
        boolean zV = false;
        String strO2 = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                arrayListS = AbstractC3324a.s(parcel, iY, Feature.CREATOR);
            } else if (iU == 2) {
                zV = AbstractC3324a.v(parcel, iY);
            } else if (iU == 3) {
                strO2 = AbstractC3324a.o(parcel, iY);
            } else if (iU != 4) {
                AbstractC3324a.E(parcel, iY);
            } else {
                strO = AbstractC3324a.o(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new ApiFeatureRequest(arrayListS, zV, strO2, strO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiFeatureRequest[i10];
    }
}
