package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.ArrayList;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        int iA = 0;
        int iA2 = 0;
        int iA3 = 0;
        int iA4 = 0;
        boolean zV = false;
        String strO = null;
        ArrayList arrayListQ = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        long jB = 0;
        long jB2 = 0;
        long jB3 = 0;
        float fX = 0.0f;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 2:
                    jB = AbstractC3324a.B(parcel, iY);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
                case 4:
                    strO = AbstractC3324a.o(parcel, iY);
                    break;
                case 5:
                    iA3 = AbstractC3324a.A(parcel, iY);
                    break;
                case 6:
                    arrayListQ = AbstractC3324a.q(parcel, iY);
                    break;
                case 8:
                    jB2 = AbstractC3324a.B(parcel, iY);
                    break;
                case 10:
                    strO3 = AbstractC3324a.o(parcel, iY);
                    break;
                case 11:
                    iA2 = AbstractC3324a.A(parcel, iY);
                    break;
                case 12:
                    strO2 = AbstractC3324a.o(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    strO4 = AbstractC3324a.o(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    iA4 = AbstractC3324a.A(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    fX = AbstractC3324a.x(parcel, iY);
                    break;
                case 16:
                    jB3 = AbstractC3324a.B(parcel, iY);
                    break;
                case 17:
                    strO5 = AbstractC3324a.o(parcel, iY);
                    break;
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                    zV = AbstractC3324a.v(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new WakeLockEvent(iA, jB, iA2, strO, iA3, arrayListQ, strO2, jB2, iA4, strO3, strO4, fX, jB3, strO5, zV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WakeLockEvent[i10];
    }
}
