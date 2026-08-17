package I4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxx;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class U9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        zzxw zzxwVar = null;
        String strO = null;
        String strO2 = null;
        zzxx[] zzxxVarArr = null;
        zzxu[] zzxuVarArr = null;
        String[] strArrP = null;
        zzxp[] zzxpVarArr = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    zzxwVar = (zzxw) AbstractC3324a.n(parcel, iY, zzxw.CREATOR);
                    break;
                case 2:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 3:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 4:
                    zzxxVarArr = (zzxx[]) AbstractC3324a.r(parcel, iY, zzxx.CREATOR);
                    break;
                case 5:
                    zzxuVarArr = (zzxu[]) AbstractC3324a.r(parcel, iY, zzxu.CREATOR);
                    break;
                case 6:
                    strArrP = AbstractC3324a.p(parcel, iY);
                    break;
                case 7:
                    zzxpVarArr = (zzxp[]) AbstractC3324a.r(parcel, iY, zzxp.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzxs(zzxwVar, strO, strO2, zzxxVarArr, zzxuVarArr, strArrP, zzxpVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxs[i10];
    }
}
