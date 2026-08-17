package I4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;

/* JADX INFO: renamed from: I4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0906j extends AbstractC0807a implements IInterface {
    C0906j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void b() {
        f(3, c());
    }

    public final zzu[] x(B4.a aVar, zzan zzanVar) {
        Parcel parcelC = c();
        N.b(parcelC, aVar);
        N.a(parcelC, zzanVar);
        Parcel parcelD = d(1, parcelC);
        zzu[] zzuVarArr = (zzu[]) parcelD.createTypedArray(zzu.CREATOR);
        parcelD.recycle();
        return zzuVarArr;
    }

    public final zzu[] y(B4.a aVar, zzan zzanVar) {
        Parcel parcelC = c();
        N.b(parcelC, aVar);
        N.a(parcelC, zzanVar);
        Parcel parcelD = d(2, parcelC);
        zzu[] zzuVarArr = (zzu[]) parcelD.createTypedArray(zzu.CREATOR);
        parcelD.recycle();
        return zzuVarArr;
    }
}
