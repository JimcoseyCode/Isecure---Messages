package G2;

import B7.d;
import j7.AbstractC2800q;
import j7.K;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2190a;

    public c(int i10) {
        this.f2190a = i10;
    }

    public final Map a(int i10, int i11, int i12) {
        float fC = d.c(d.h(d.d(i12, 1), this.f2190a) * b(i10), 0.0f);
        float f10 = i11;
        float fG = f10 / d.g(fC, f10);
        int i13 = 0;
        B7.c cVarP = d.p(0, i11);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d.d(K.e(AbstractC2800q.u(cVarP, 10)), 16));
        for (Object obj : cVarP) {
            int iIntValue = ((Number) obj).intValue();
            if (((int) (iIntValue % fG)) == 0) {
                i13 = iIntValue;
            }
            linkedHashMap.put(obj, Integer.valueOf(i13));
        }
        return linkedHashMap;
    }

    public final float b(int i10) {
        return i10 / 1000.0f;
    }
}
