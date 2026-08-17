package G4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.text.TextAttributeProps;
import com.google.android.gms.internal.mlkit_code_scanner.zzor;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class H6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        String strO8 = null;
        String strO9 = null;
        String strO10 = null;
        String strO11 = null;
        String strO12 = null;
        String strO13 = null;
        String strO14 = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 2:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 3:
                    strO3 = AbstractC3324a.o(parcel, iY);
                    break;
                case 4:
                    strO4 = AbstractC3324a.o(parcel, iY);
                    break;
                case 5:
                    strO5 = AbstractC3324a.o(parcel, iY);
                    break;
                case 6:
                    strO6 = AbstractC3324a.o(parcel, iY);
                    break;
                case 7:
                    strO7 = AbstractC3324a.o(parcel, iY);
                    break;
                case 8:
                    strO8 = AbstractC3324a.o(parcel, iY);
                    break;
                case 9:
                    strO9 = AbstractC3324a.o(parcel, iY);
                    break;
                case 10:
                    strO10 = AbstractC3324a.o(parcel, iY);
                    break;
                case 11:
                    strO11 = AbstractC3324a.o(parcel, iY);
                    break;
                case 12:
                    strO12 = AbstractC3324a.o(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    strO13 = AbstractC3324a.o(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    strO14 = AbstractC3324a.o(parcel, iY);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzor(strO, strO2, strO3, strO4, strO5, strO6, strO7, strO8, strO9, strO10, strO11, strO12, strO13, strO14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzor[i10];
    }
}
