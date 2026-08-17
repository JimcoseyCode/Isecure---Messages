package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import B4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class B extends AbstractBinderC2170o implements C {
    public B() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static C asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof C ? (C) iInterfaceQueryLocalInterface : new A(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC2170o
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        B4.a aVarD = a.AbstractBinderC0016a.d(parcel.readStrongBinder());
        zzba zzbaVar = (zzba) J.a(parcel, zzba.CREATOR);
        J.b(parcel);
        InterfaceC2218z interfaceC2218zNewBarcodeScanner = newBarcodeScanner(aVarD, zzbaVar);
        parcel2.writeNoException();
        if (interfaceC2218zNewBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(interfaceC2218zNewBarcodeScanner.asBinder());
        }
        return true;
    }
}
