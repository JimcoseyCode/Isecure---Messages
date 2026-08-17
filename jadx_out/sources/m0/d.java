package m0;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC2855l;
import n0.AbstractC2956a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(b bVar, int i10) {
        AbstractC2855l.g(bVar, "<this>");
        bVar.u(new int[i10]);
        bVar.t(new Object[i10]);
    }

    public static final int b(b bVar, int i10) {
        AbstractC2855l.g(bVar, "<this>");
        try {
            return AbstractC2956a.a(bVar.p(), bVar.r(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(b bVar, Object obj, int i10) {
        AbstractC2855l.g(bVar, "<this>");
        int iR = bVar.r();
        if (iR == 0) {
            return -1;
        }
        int iB = b(bVar, i10);
        if (iB < 0 || AbstractC2855l.b(obj, bVar.o()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iR && bVar.p()[i11] == i10) {
            if (AbstractC2855l.b(obj, bVar.o()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && bVar.p()[i12] == i10; i12--) {
            if (AbstractC2855l.b(obj, bVar.o()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(b bVar) {
        AbstractC2855l.g(bVar, "<this>");
        return c(bVar, null, 0);
    }
}
