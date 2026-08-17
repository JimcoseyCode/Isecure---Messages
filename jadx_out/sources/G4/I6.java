package G4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_code_scanner.zzos;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class I6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        String strO2 = null;
        int iA = 0;
        String strO3 = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                iA = AbstractC3324a.A(parcel, iY);
            } else if (iU == 2) {
                strO = AbstractC3324a.o(parcel, iY);
            } else if (iU == 3) {
                strO3 = AbstractC3324a.o(parcel, iY);
            } else if (iU != 4) {
                AbstractC3324a.E(parcel, iY);
            } else {
                strO2 = AbstractC3324a.o(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzos(iA, strO, strO3, strO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzos[i10];
    }
}
