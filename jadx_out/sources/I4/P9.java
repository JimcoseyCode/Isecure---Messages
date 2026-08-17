package I4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class P9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        zzp zzpVar = null;
        String strO = null;
        String strO2 = null;
        zzq[] zzqVarArr = null;
        zzn[] zznVarArr = null;
        String[] strArrP = null;
        zzi[] zziVarArr = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 2:
                    zzpVar = (zzp) AbstractC3324a.n(parcel, iY, zzp.CREATOR);
                    break;
                case 3:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 4:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 5:
                    zzqVarArr = (zzq[]) AbstractC3324a.r(parcel, iY, zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (zzn[]) AbstractC3324a.r(parcel, iY, zzn.CREATOR);
                    break;
                case 7:
                    strArrP = AbstractC3324a.p(parcel, iY);
                    break;
                case 8:
                    zziVarArr = (zzi[]) AbstractC3324a.r(parcel, iY, zzi.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzl(zzpVar, strO, strO2, zzqVarArr, zznVarArr, strArrP, zziVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
