package I4;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: I4.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0994r0 extends AbstractMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f4860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Collection f4861h;

    AbstractC0994r0() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f4860g;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f4860g = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f4861h;
        if (collection != null) {
            return collection;
        }
        C0984q0 c0984q0 = new C0984q0(this);
        this.f4861h = c0984q0;
        return c0984q0;
    }
}
