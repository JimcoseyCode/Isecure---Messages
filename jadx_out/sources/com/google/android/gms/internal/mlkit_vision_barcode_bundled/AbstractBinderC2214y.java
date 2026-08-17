package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import B4.a;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2214y extends AbstractBinderC2170o implements InterfaceC2218z {
    public AbstractBinderC2214y() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC2170o
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            b();
            parcel2.writeNoException();
        } else if (i10 == 2) {
            e();
            parcel2.writeNoException();
        } else if (i10 == 3) {
            B4.a aVarD = a.AbstractBinderC0016a.d(parcel.readStrongBinder());
            zzcc zzccVar = (zzcc) J.a(parcel, zzcc.CREATOR);
            J.b(parcel);
            List listR = r(aVarD, zzccVar);
            parcel2.writeNoException();
            parcel2.writeTypedList(listR);
        } else if (i10 == 4) {
            B4.a aVarD2 = a.AbstractBinderC0016a.d(parcel.readStrongBinder());
            zzcc zzccVar2 = (zzcc) J.a(parcel, zzcc.CREATOR);
            zzbc zzbcVar = (zzbc) J.a(parcel, zzbc.CREATOR);
            J.b(parcel);
            List listS = s(aVarD2, zzccVar2, zzbcVar);
            parcel2.writeNoException();
            parcel2.writeTypedList(listS);
        } else {
            if (i10 != 5) {
                return false;
            }
            zzbe zzbeVar = (zzbe) J.a(parcel, zzbe.CREATOR);
            J.b(parcel);
            m(zzbeVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
