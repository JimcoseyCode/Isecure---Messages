package r;

import s.C3294h;
import y.C3600u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Z0 {
    public static C3600u a(C3294h c3294h) {
        int iD = c3294h.d();
        int i10 = 1;
        if (iD != 1) {
            i10 = 2;
            if (iD != 2) {
                i10 = 3;
                if (iD != 3) {
                    i10 = 4;
                    if (iD != 4) {
                        i10 = 5;
                        if (iD != 5) {
                            i10 = iD != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new C3600u(i10, c3294h);
    }
}
