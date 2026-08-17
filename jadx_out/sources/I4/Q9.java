package I4;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.text.TextAttributeProps;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzya;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Q9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        String strO2 = null;
        byte[] bArrG = null;
        Point[] pointArr = null;
        zzxu zzxuVar = null;
        zzxx zzxxVar = null;
        zzxy zzxyVar = null;
        zzya zzyaVar = null;
        zzxz zzxzVar = null;
        zzxv zzxvVar = null;
        zzxr zzxrVar = null;
        zzxs zzxsVar = null;
        zzxt zzxtVar = null;
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
                    zzxuVar = (zzxu) AbstractC3324a.n(parcel, iY, zzxu.CREATOR);
                    break;
                case 8:
                    zzxxVar = (zzxx) AbstractC3324a.n(parcel, iY, zzxx.CREATOR);
                    break;
                case 9:
                    zzxyVar = (zzxy) AbstractC3324a.n(parcel, iY, zzxy.CREATOR);
                    break;
                case 10:
                    zzyaVar = (zzya) AbstractC3324a.n(parcel, iY, zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (zzxz) AbstractC3324a.n(parcel, iY, zzxz.CREATOR);
                    break;
                case 12:
                    zzxvVar = (zzxv) AbstractC3324a.n(parcel, iY, zzxv.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    zzxrVar = (zzxr) AbstractC3324a.n(parcel, iY, zzxr.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    zzxsVar = (zzxs) AbstractC3324a.n(parcel, iY, zzxs.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    zzxtVar = (zzxt) AbstractC3324a.n(parcel, iY, zzxt.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzyb(iA, strO, strO2, bArrG, pointArr, iA2, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzyb[i10];
    }
}
