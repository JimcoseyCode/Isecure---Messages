package I4;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: I4.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1037v extends G implements InterfaceC0940m0 {
    protected AbstractC1037v(Map map) {
        super(map);
    }

    @Override // I4.InterfaceC0940m0
    public final List b(Object obj) {
        return (List) super.j(obj);
    }

    @Override // I4.G
    final Collection h(Object obj, Collection collection) {
        return k(obj, (List) collection, null);
    }
}
