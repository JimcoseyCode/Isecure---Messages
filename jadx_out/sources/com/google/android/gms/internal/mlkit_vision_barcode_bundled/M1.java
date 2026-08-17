package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class M1 extends T1 {
    M1() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.T1
    public final void a() {
        if (!j()) {
            for (int i10 = 0; i10 < c(); i10++) {
                ((E0) ((N1) g(i10)).h()).l();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((E0) ((Map.Entry) it.next()).getKey()).l();
            }
        }
        super.a();
    }
}
