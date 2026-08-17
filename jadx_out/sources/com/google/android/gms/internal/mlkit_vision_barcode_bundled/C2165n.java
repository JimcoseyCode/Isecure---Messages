package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.text.TextAttributeProps;
import s4.AbstractC3324a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2165n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        String strO = null;
        String strO2 = null;
        byte[] bArrG = null;
        Point[] pointArr = null;
        zzar zzarVar = null;
        zzau zzauVar = null;
        zzav zzavVar = null;
        zzax zzaxVar = null;
        zzaw zzawVar = null;
        zzas zzasVar = null;
        zzao zzaoVar = null;
        zzap zzapVar = null;
        zzaq zzaqVar = null;
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
                    zzarVar = (zzar) AbstractC3324a.n(parcel, iY, zzar.CREATOR);
                    break;
                case 8:
                    zzauVar = (zzau) AbstractC3324a.n(parcel, iY, zzau.CREATOR);
                    break;
                case 9:
                    zzavVar = (zzav) AbstractC3324a.n(parcel, iY, zzav.CREATOR);
                    break;
                case 10:
                    zzaxVar = (zzax) AbstractC3324a.n(parcel, iY, zzax.CREATOR);
                    break;
                case 11:
                    zzawVar = (zzaw) AbstractC3324a.n(parcel, iY, zzaw.CREATOR);
                    break;
                case 12:
                    zzasVar = (zzas) AbstractC3324a.n(parcel, iY, zzas.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    zzaoVar = (zzao) AbstractC3324a.n(parcel, iY, zzao.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    zzapVar = (zzap) AbstractC3324a.n(parcel, iY, zzap.CREATOR);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    zzaqVar = (zzaq) AbstractC3324a.n(parcel, iY, zzaq.CREATOR);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzay(iA, strO, strO2, bArrG, pointArr, iA2, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzay[i10];
    }
}
