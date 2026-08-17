package I4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import s4.AbstractC3324a;

/* JADX INFO: renamed from: I4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0829c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        double dW = 0.0d;
        double dW2 = 0.0d;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 2) {
                dW = AbstractC3324a.w(parcel, iY);
            } else if (iU != 3) {
                AbstractC3324a.E(parcel, iY);
            } else {
                dW2 = AbstractC3324a.w(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new zzo(dW, dW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
