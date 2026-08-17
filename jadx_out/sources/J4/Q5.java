package J4;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q5 extends M4 implements Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient N5 f5865h;

    Q5() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1099b.a(this);
    }

    public final N5 r() {
        N5 n52 = this.f5865h;
        if (n52 != null) {
            return n52;
        }
        N5 n5S = s();
        this.f5865h = n5S;
        return n5S;
    }

    N5 s() {
        return N5.s(toArray());
    }
}
