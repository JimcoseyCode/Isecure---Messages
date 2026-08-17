package H4;

import java.util.Set;

/* JADX INFO: renamed from: H4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0788j extends AbstractC0781c implements Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient AbstractC0784f f3775h;

    AbstractC0788j() {
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
        return r.a(this);
    }

    public final AbstractC0784f r() {
        AbstractC0784f abstractC0784f = this.f3775h;
        if (abstractC0784f != null) {
            return abstractC0784f;
        }
        AbstractC0784f abstractC0784fS = s();
        this.f3775h = abstractC0784fS;
        return abstractC0784fS;
    }

    AbstractC0784f s() {
        Object[] array = toArray();
        int i10 = AbstractC0784f.f3765i;
        return AbstractC0784f.s(array, array.length);
    }
}
