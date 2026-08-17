package j7;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: j7.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2783G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28899b;

    public C2783G(int i10, Object obj) {
        this.f28898a = i10;
        this.f28899b = obj;
    }

    public final int a() {
        return this.f28898a;
    }

    public final Object b() {
        return this.f28899b;
    }

    public final int c() {
        return this.f28898a;
    }

    public final Object d() {
        return this.f28899b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2783G)) {
            return false;
        }
        C2783G c2783g = (C2783G) obj;
        return this.f28898a == c2783g.f28898a && AbstractC2855l.b(this.f28899b, c2783g.f28899b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f28898a) * 31;
        Object obj = this.f28899b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f28898a + ", value=" + this.f28899b + ')';
    }
}
