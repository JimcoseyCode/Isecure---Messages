package I8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f5261b;

    public a(Object obj, Object obj2) {
        this.f5260a = obj;
        this.f5261b = obj2;
    }

    public final Object a() {
        return this.f5260a;
    }

    public final Object b() {
        return this.f5261b;
    }

    public final Object c() {
        return this.f5260a;
    }

    public final Object d() {
        return this.f5261b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC2855l.b(this.f5260a, aVar.f5260a) && AbstractC2855l.b(this.f5261b, aVar.f5261b);
    }

    public int hashCode() {
        Object obj = this.f5260a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5261b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f5260a + ", upper=" + this.f5261b + ')';
    }
}
