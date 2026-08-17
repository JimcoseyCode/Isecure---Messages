package I4;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.text.TextAttributeProps;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class G8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        double dW = 0.0d;
        int iA = 0;
        int iA2 = 0;
        boolean zV = false;
        String strO = null;
        String strO2 = null;
        Point[] pointArr = null;
        zzn zznVar = null;
        zzq zzqVar = null;
        zzr zzrVar = null;
        zzt zztVar = null;
        zzs zzsVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzl zzlVar = null;
        zzm zzmVar = null;
        byte[] bArrG = null;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 2:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 3:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 4:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case 5:
                    iA2 = AbstractC3324a.A(parcel, iY);
                    break;
                case 6:
                    pointArr = (Point[]) AbstractC3324a.r(parcel, iY, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) AbstractC3324a.n(parcel, iY, zzn.CREATOR);
                    break;
                case 8:
                    zzqVar = (zzq) AbstractC3324a.n(parcel, iY, zzq.CREATOR);
                    break;
                case 9:
                    zzrVar = (zzr) AbstractC3324a.n(parcel, iY, zzr.CREATOR);
                    break;
                case 10:
                    zztVar = (zzt) AbstractC3324a.n(parcel, iY, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) AbstractC3324a.n(parcel, iY, zzs.CREATOR);
                    break;
                case 12:
                    zzoVar = (zzo) AbstractC3324a.n(parcel, iY, zzo.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    zzkVar = (zzk) AbstractC3324a.n(parcel, iY, zzk.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    zzlVar = (zzl) AbstractC3324a.n(parcel, iY, zzl.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    zzmVar = (zzm) AbstractC3324a.n(parcel, iY, zzm.CREATOR);
                    break;
                case 16:
                    bArrG = AbstractC3324a.g(parcel, iY);
                    break;
                case 17:
                    zV = AbstractC3324a.v(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    dW = AbstractC3324a.w(parcel, iY);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzu(iA, strO, strO2, iA2, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArrG, zV, dW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
