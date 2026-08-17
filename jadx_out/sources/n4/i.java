package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        long jB = -1;
        int iA = 0;
        String strO = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                strO = AbstractC3324a.o(parcel, iY);
            } else if (iU == 2) {
                iA = AbstractC3324a.A(parcel, iY);
            } else if (iU != 3) {
                AbstractC3324a.E(parcel, iY);
            } else {
                jB = AbstractC3324a.B(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new Feature(strO, iA, jB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Feature[i10];
    }
}
