package H2;

import j7.AbstractC2800q;
import j7.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3719a;

    public h(int i10) {
        this.f3719a = i10;
    }

    public final int a(int i10) {
        int i11 = i10 % this.f3719a;
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11 + this.f3719a;
    }

    public final int b() {
        return this.f3719a;
    }

    public final boolean c(int i10, int i11, int i12) {
        int iA = a(i12 + i10);
        return i10 < iA ? i10 <= i11 && i11 <= iA : (i10 <= i11 && i11 <= this.f3719a) || (i11 >= 0 && i11 <= iA);
    }

    public final List d(int i10, int i11) {
        B7.c cVarP = B7.d.p(0, i11);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(cVarP, 10));
        Iterator it = cVarP.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a(((J) it).nextInt() + i10)));
        }
        return arrayList;
    }
}
