package I4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import s4.AbstractC3324a;

/* JADX INFO: renamed from: I4.h9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0894h9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        int iA = 0;
        int iA2 = 0;
        int iA3 = 0;
        int iA4 = 0;
        int iA5 = 0;
        int iA6 = 0;
        boolean zV = false;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 2:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 3:
                    iA2 = AbstractC3324a.A(parcel, iY);
                    break;
                case 4:
                    iA3 = AbstractC3324a.A(parcel, iY);
                    break;
                case 5:
                    iA4 = AbstractC3324a.A(parcel, iY);
                    break;
                case 6:
                    iA5 = AbstractC3324a.A(parcel, iY);
                    break;
                case 7:
                    iA6 = AbstractC3324a.A(parcel, iY);
                    break;
                case 8:
                    zV = AbstractC3324a.v(parcel, iY);
                    break;
                case 9:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzj(iA, iA2, iA3, iA4, iA5, iA6, zV, strO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
