package b4;

/* JADX INFO: renamed from: b4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1805b {
    public static Object a(int i10, Object obj, InterfaceC1804a interfaceC1804a, InterfaceC1806c interfaceC1806c) {
        Object objApply;
        if (i10 < 1) {
            return interfaceC1804a.apply(obj);
        }
        do {
            objApply = interfaceC1804a.apply(obj);
            obj = interfaceC1806c.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return objApply;
    }
}
