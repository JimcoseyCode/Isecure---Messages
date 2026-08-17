package I4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;

/* JADX INFO: renamed from: I4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0917k extends AbstractC0807a implements InterfaceC0939m {
    C0917k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // I4.InterfaceC0939m
    public final C0906j l(B4.a aVar, zzah zzahVar) {
        C0906j c0906j;
        Parcel parcelC = c();
        N.b(parcelC, aVar);
        N.a(parcelC, zzahVar);
        Parcel parcelD = d(1, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            c0906j = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c0906j = iInterfaceQueryLocalInterface instanceof C0906j ? (C0906j) iInterfaceQueryLocalInterface : new C0906j(strongBinder);
        }
        parcelD.recycle();
        return c0906j;
    }
}
