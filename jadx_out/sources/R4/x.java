package r4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        int iA = -1;
        int iA2 = 0;
        int iA3 = 0;
        int iA4 = 0;
        int iA5 = 0;
        String strO = null;
        String strO2 = null;
        long jB = 0;
        long jB2 = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    iA2 = AbstractC3324a.A(parcel, iY);
                    break;
                case 2:
                    iA3 = AbstractC3324a.A(parcel, iY);
                    break;
                case 3:
                    iA4 = AbstractC3324a.A(parcel, iY);
                    break;
                case 4:
                    jB = AbstractC3324a.B(parcel, iY);
                    break;
                case 5:
                    jB2 = AbstractC3324a.B(parcel, iY);
                    break;
                case 6:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 7:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 8:
                    iA5 = AbstractC3324a.A(parcel, iY);
                    break;
                case 9:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new MethodInvocation(iA2, iA3, iA4, jB, jB2, strO, strO2, iA5, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
