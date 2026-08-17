package I4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Z9 extends AbstractC0807a implements ba {
    Z9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // I4.ba
    public final Y9 q(B4.a aVar, zzyd zzydVar) {
        Y9 y92;
        Parcel parcelC = c();
        N.b(parcelC, aVar);
        N.a(parcelC, zzydVar);
        Parcel parcelD = d(1, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            y92 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            y92 = iInterfaceQueryLocalInterface instanceof Y9 ? (Y9) iInterfaceQueryLocalInterface : new Y9(strongBinder);
        }
        parcelD.recycle();
        return y92;
    }
}
