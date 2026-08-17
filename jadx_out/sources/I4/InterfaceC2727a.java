package i4;

import T3.b;
import T3.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: i4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2727a extends IInterface {

    /* JADX INFO: renamed from: i4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractBinderC0290a extends b implements InterfaceC2727a {

        /* JADX INFO: renamed from: i4.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static class C0291a extends T3.a implements InterfaceC2727a {
            C0291a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // i4.InterfaceC2727a
            public final Bundle k(Bundle bundle) {
                Parcel parcelC = c();
                c.b(parcelC, bundle);
                Parcel parcelD = d(parcelC);
                Bundle bundle2 = (Bundle) c.a(parcelD, Bundle.CREATOR);
                parcelD.recycle();
                return bundle2;
            }
        }

        public static InterfaceC2727a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2727a ? (InterfaceC2727a) iInterfaceQueryLocalInterface : new C0291a(iBinder);
        }
    }

    Bundle k(Bundle bundle);
}
