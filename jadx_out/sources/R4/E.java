package r4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import s4.AbstractC3324a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iF = AbstractC3324a.F(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrJ = null;
        int[] iArrJ2 = null;
        boolean zV = false;
        boolean zV2 = false;
        int iA = 0;
        while (parcel.dataPosition() < iF) {
            int iY = AbstractC3324a.y(parcel);
            switch (AbstractC3324a.u(iY)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) AbstractC3324a.n(parcel, iY, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zV = AbstractC3324a.v(parcel, iY);
                    break;
                case 3:
                    zV2 = AbstractC3324a.v(parcel, iY);
                    break;
                case 4:
                    iArrJ = AbstractC3324a.j(parcel, iY);
                    break;
                case 5:
                    iA = AbstractC3324a.A(parcel, iY);
                    break;
                case 6:
                    iArrJ2 = AbstractC3324a.j(parcel, iY);
                    break;
                default:
                    AbstractC3324a.E(parcel, iY);
                    break;
            }
        }
        AbstractC3324a.t(parcel, iF);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zV, zV2, iArrJ, iA, iArrJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
