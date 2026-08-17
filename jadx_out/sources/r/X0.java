package r;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.C3294h;
import y.C3579f0;
import y.C3598s;
import y.C3600u;
import y.InterfaceC3597q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class X0 {
    private static String a(s.S s10, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) s10.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) s10.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    static List b(C3141A c3141a, C3598s c3598s, List list) throws C3579f0 {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            if (c3598s == null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    strA = a(c3141a.a(), c3598s.d(), list);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!str.equals(strA)) {
                        arrayList2.add(c3141a.h(str));
                    }
                }
                Iterator it3 = c3598s.b(arrayList2).iterator();
                while (it3.hasNext()) {
                    arrayList.add(((F.L) ((InterfaceC3597q) it3.next())).f());
                }
            }
            return arrayList;
        } catch (C3294h e10) {
            throw new C3579f0(Z0.a(e10));
        } catch (C3600u e11) {
            throw new C3579f0(e11);
        }
    }
}
