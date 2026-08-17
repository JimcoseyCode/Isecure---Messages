package G4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_code_scanner.zzon;
import com.google.android.gms.internal.mlkit_code_scanner.zzoq;
import com.google.android.gms.internal.mlkit_code_scanner.zzos;
import com.google.android.gms.internal.mlkit_code_scanner.zzou;
import com.google.android.gms.internal.mlkit_code_scanner.zzov;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class G6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        zzou zzouVar = null;
        String strO = null;
        String strO2 = null;
        zzov[] zzovVarArr = null;
        zzos[] zzosVarArr = null;
        String[] strArrP = null;
        zzon[] zzonVarArr = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    zzouVar = (zzou) AbstractC3324a.n(parcel, iY, zzou.CREATOR);
                    break;
                case 2:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 3:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 4:
                    zzovVarArr = (zzov[]) AbstractC3324a.r(parcel, iY, zzov.CREATOR);
                    break;
                case 5:
                    zzosVarArr = (zzos[]) AbstractC3324a.r(parcel, iY, zzos.CREATOR);
                    break;
                case 6:
                    strArrP = AbstractC3324a.p(parcel, iY);
                    break;
                case 7:
                    zzonVarArr = (zzon[]) AbstractC3324a.r(parcel, iY, zzon.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzoq(zzouVar, strO, strO2, zzovVarArr, zzosVarArr, strArrP, zzonVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzoq[i10];
    }
}
