package G4;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.text.TextAttributeProps;
import com.google.android.gms.internal.mlkit_code_scanner.zzop;
import com.google.android.gms.internal.mlkit_code_scanner.zzoq;
import com.google.android.gms.internal.mlkit_code_scanner.zzor;
import com.google.android.gms.internal.mlkit_code_scanner.zzos;
import com.google.android.gms.internal.mlkit_code_scanner.zzot;
import com.google.android.gms.internal.mlkit_code_scanner.zzov;
import com.google.android.gms.internal.mlkit_code_scanner.zzow;
import com.google.android.gms.internal.mlkit_code_scanner.zzox;
import com.google.android.gms.internal.mlkit_code_scanner.zzoy;
import com.google.android.gms.internal.mlkit_code_scanner.zzoz;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class D6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        String strO2 = null;
        byte[] bArrG = null;
        Point[] pointArr = null;
        zzos zzosVar = null;
        zzov zzovVar = null;
        zzow zzowVar = null;
        zzoy zzoyVar = null;
        zzox zzoxVar = null;
        zzot zzotVar = null;
        zzop zzopVar = null;
        zzoq zzoqVar = null;
        zzor zzorVar = null;
        int iA = 0;
        int iA2 = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 2:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 3:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 4:
                    bArrG = AbstractC3324a.g(parcel, iY);
                    break;
                case 5:
                    pointArr = (Point[]) AbstractC3324a.r(parcel, iY, Point.CREATOR);
                    break;
                case 6:
                    iA2 = AbstractC3324a.A(parcel, iY);
                    break;
                case 7:
                    zzosVar = (zzos) AbstractC3324a.n(parcel, iY, zzos.CREATOR);
                    break;
                case 8:
                    zzovVar = (zzov) AbstractC3324a.n(parcel, iY, zzov.CREATOR);
                    break;
                case 9:
                    zzowVar = (zzow) AbstractC3324a.n(parcel, iY, zzow.CREATOR);
                    break;
                case 10:
                    zzoyVar = (zzoy) AbstractC3324a.n(parcel, iY, zzoy.CREATOR);
                    break;
                case 11:
                    zzoxVar = (zzox) AbstractC3324a.n(parcel, iY, zzox.CREATOR);
                    break;
                case 12:
                    zzotVar = (zzot) AbstractC3324a.n(parcel, iY, zzot.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    zzopVar = (zzop) AbstractC3324a.n(parcel, iY, zzop.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    zzoqVar = (zzoq) AbstractC3324a.n(parcel, iY, zzoq.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    zzorVar = (zzor) AbstractC3324a.n(parcel, iY, zzor.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzoz(iA, strO, strO2, bArrG, pointArr, iA2, zzosVar, zzovVar, zzowVar, zzoyVar, zzoxVar, zzotVar, zzopVar, zzoqVar, zzorVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzoz[i10];
    }
}
