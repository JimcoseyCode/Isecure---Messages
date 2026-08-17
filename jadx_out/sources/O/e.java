package O;

import F.D1;
import F.E0;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(D1.b bVar, int i10) {
        Size sizeA;
        E0 e02 = (E0) bVar.c();
        int iC0 = e02.c0(-1);
        if (iC0 == -1 || iC0 != i10) {
            ((E0.a) bVar).d(i10);
        }
        if (iC0 == -1 || i10 == -1 || iC0 == i10) {
            return;
        }
        if (Math.abs(H.c.b(i10) - H.c.b(iC0)) % 180 != 90 || (sizeA = e02.A(null)) == null) {
            return;
        }
        ((E0.a) bVar).a(new Size(sizeA.getHeight(), sizeA.getWidth()));
    }
}
