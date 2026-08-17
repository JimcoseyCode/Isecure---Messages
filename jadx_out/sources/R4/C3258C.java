package r4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import s4.AbstractC3324a;

/* JADX INFO: renamed from: r4.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3258C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        int iA = 0;
        boolean zV = false;
        boolean zV2 = false;
        int iA2 = 0;
        int iA3 = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            int iU = AbstractC3324a.u(iY);
            if (iU == 1) {
                iA = AbstractC3324a.A(parcel, iY);
            } else if (iU == 2) {
                zV = AbstractC3324a.v(parcel, iY);
            } else if (iU == 3) {
                zV2 = AbstractC3324a.v(parcel, iY);
            } else if (iU == 4) {
                iA2 = AbstractC3324a.A(parcel, iY);
            } else if (iU != 5) {
                AbstractC3324a.E(parcel, iY);
            } else {
                iA3 = AbstractC3324a.A(parcel, iY);
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new RootTelemetryConfiguration(iA, zV, zV2, iA2, iA3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RootTelemetryConfiguration[i10];
    }
}
