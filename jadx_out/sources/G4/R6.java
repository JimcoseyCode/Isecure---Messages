package G4;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class R6 extends M4 implements Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient C6 f2568h;

    R6() {
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
        return Y6.a(this);
    }

    public final C6 r() {
        C6 c62 = this.f2568h;
        if (c62 != null) {
            return c62;
        }
        C6 c6S = s();
        this.f2568h = c6S;
        return c6S;
    }

    C6 s() {
        Object[] array = toArray();
        int i10 = C6.f2236i;
        return C6.s(array, array.length);
    }
}
