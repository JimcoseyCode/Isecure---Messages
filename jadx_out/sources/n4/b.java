package N4;

import android.os.Parcel;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends D4.b implements c {
    public b() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // D4.b
    protected final boolean x(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                D4.c.b(parcel);
                break;
            case 4:
                D4.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                D4.c.b(parcel);
                break;
            case 7:
                D4.c.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) D4.c.a(parcel, zak.CREATOR);
                D4.c.b(parcel);
                g(zakVar);
                break;
            case 9:
                D4.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
