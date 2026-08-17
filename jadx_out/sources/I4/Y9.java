package I4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Y9 extends AbstractC0807a implements IInterface {
    Y9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final void e() {
        f(2, c());
    }

    public final List x(B4.a aVar, zzyu zzyuVar) {
        Parcel parcelC = c();
        N.b(parcelC, aVar);
        N.a(parcelC, zzyuVar);
        Parcel parcelD = d(3, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(zzyb.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    public final void y() {
        f(1, c());
    }
}
