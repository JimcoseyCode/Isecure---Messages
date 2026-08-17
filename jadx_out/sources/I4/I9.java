package I4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class I9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        zzj zzjVar = null;
        zzj zzjVar2 = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
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
                    strO5 = AbstractC3324a.o(parcel, iY);
                    break;
                case 7:
                    zzjVar = (zzj) AbstractC3324a.n(parcel, iY, zzj.CREATOR);
                    break;
                case 8:
                    zzjVar2 = (zzj) AbstractC3324a.n(parcel, iY, zzj.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzk(strO, strO2, strO3, strO4, strO5, zzjVar, zzjVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
