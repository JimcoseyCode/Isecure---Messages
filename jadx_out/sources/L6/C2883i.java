package l6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
import s4.AbstractC3324a;

/* JADX INFO: renamed from: l6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2883i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        int iA = 0;
        int iA2 = 0;
        int iA3 = 0;
        int iA4 = 0;
        long jB = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                iA = AbstractC3324a.A(parcel, iY);
            } else if (iU == 2) {
                iA2 = AbstractC3324a.A(parcel, iY);
            } else if (iU == 3) {
                iA3 = AbstractC3324a.A(parcel, iY);
            } else if (iU == 4) {
                jB = AbstractC3324a.B(parcel, iY);
            } else if (iU != 5) {
                AbstractC3324a.E(parcel, iY);
            } else {
                iA4 = AbstractC3324a.A(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new VisionImageMetadataParcel(iA, iA2, iA3, jB, iA4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VisionImageMetadataParcel[i10];
    }
}
