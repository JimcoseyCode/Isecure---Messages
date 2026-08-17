package r;

import F.AbstractC0506s;
import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: r.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3158c1 {
    static CameraCaptureSession.CaptureCallback a(F.r rVar) {
        if (rVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(rVar, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : AbstractC3157c0.a(arrayList);
    }

    static void b(F.r rVar, List list) {
        if (rVar instanceof AbstractC0506s.a) {
            Iterator it = ((AbstractC0506s.a) rVar).e().iterator();
            while (it.hasNext()) {
                b((F.r) it.next(), list);
            }
        } else if (rVar instanceof C3154b1) {
            list.add(((C3154b1) rVar).f());
        } else {
            list.add(new C3150a1(rVar));
        }
    }
}
