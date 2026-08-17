package R8;

import i7.C2752o;

/* JADX INFO: renamed from: R8.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1444y {
    public static final InterfaceC1440w a(A0 a02) {
        return new C1442x(a02);
    }

    public static /* synthetic */ InterfaceC1440w b(A0 a02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a02 = null;
        }
        return a(a02);
    }

    public static final boolean c(InterfaceC1440w interfaceC1440w, Object obj) {
        Throwable thD = C2752o.d(obj);
        return thD == null ? interfaceC1440w.l0(obj) : interfaceC1440w.k0(thD);
    }
}
