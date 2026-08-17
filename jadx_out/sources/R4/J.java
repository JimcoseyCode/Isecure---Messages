package r4;

import B4.a;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class J extends F4.a implements y {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // r4.y
    public final int a() {
        Parcel parcelC = c(2, d());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    @Override // r4.y
    public final B4.a b() {
        Parcel parcelC = c(1, d());
        B4.a aVarD = a.AbstractBinderC0016a.d(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarD;
    }
}
