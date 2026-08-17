package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class v {
    private static D0.h a(D0.h hVar, D0.h hVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < hVar.f() + hVar2.f()) {
            Locale localeC = i10 < hVar.f() ? hVar.c(i10) : hVar2.c(i10 - hVar.f());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return D0.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static D0.h b(D0.h hVar, D0.h hVar2) {
        return (hVar == null || hVar.e()) ? D0.h.d() : a(hVar, hVar2);
    }
}
