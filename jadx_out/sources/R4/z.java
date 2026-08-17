package r4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzk;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends F4.b implements InterfaceC3264e {
    public z() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // F4.b
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) F4.c.a(parcel, Bundle.CREATOR);
            F4.c.b(parcel);
            n(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) F4.c.a(parcel, Bundle.CREATOR);
            F4.c.b(parcel);
            j(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) F4.c.a(parcel, zzk.CREATOR);
            F4.c.b(parcel);
            u(i14, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
