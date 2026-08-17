package v;

import F.r1;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f32763a;

    public u() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    public List a(r1.d dVar, List list) {
        Size sizeG;
        ExtraCroppingQuirk extraCroppingQuirk = this.f32763a;
        if (extraCroppingQuirk == null || (sizeG = extraCroppingQuirk.g(dVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeG);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!size.equals(sizeG)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    u(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f32763a = extraCroppingQuirk;
    }
}
