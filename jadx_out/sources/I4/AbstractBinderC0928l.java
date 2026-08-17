package I4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: I4.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0928l extends AbstractBinderC1004s implements InterfaceC0939m {
    public static InterfaceC0939m c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0939m ? (InterfaceC0939m) iInterfaceQueryLocalInterface : new C0917k(iBinder);
    }
}
