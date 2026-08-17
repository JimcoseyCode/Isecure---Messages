package I4;

import java.util.Set;

/* JADX INFO: renamed from: I4.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0918k0 extends AbstractC0830c0 implements Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient AbstractC0885h0 f4792h;

    AbstractC0918k0() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return C0.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C0.a(this);
    }

    public final AbstractC0885h0 r() {
        AbstractC0885h0 abstractC0885h0 = this.f4792h;
        if (abstractC0885h0 != null) {
            return abstractC0885h0;
        }
        AbstractC0885h0 abstractC0885h0S = s();
        this.f4792h = abstractC0885h0S;
        return abstractC0885h0S;
    }

    AbstractC0885h0 s() {
        Object[] array = toArray();
        int i10 = AbstractC0885h0.f4772i;
        return AbstractC0885h0.s(array, array.length);
    }
}
