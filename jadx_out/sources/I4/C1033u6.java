package I4;

import r4.AbstractC3267h;

/* JADX INFO: renamed from: I4.u6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1033u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1011s6 f4912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f4913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f4914c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f4915d = null;

    /* synthetic */ C1033u6(C1000r6 c1000r6, AbstractC1022t6 abstractC1022t6) {
        this.f4912a = c1000r6.f4866a;
        this.f4913b = c1000r6.f4867b;
    }

    public final EnumC1011s6 a() {
        return this.f4912a;
    }

    public final Integer b() {
        return this.f4913b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1033u6)) {
            return false;
        }
        C1033u6 c1033u6 = (C1033u6) obj;
        return AbstractC3267h.a(this.f4912a, c1033u6.f4912a) && AbstractC3267h.a(this.f4913b, c1033u6.f4913b) && AbstractC3267h.a(null, null) && AbstractC3267h.a(null, null);
    }

    public final int hashCode() {
        return AbstractC3267h.b(this.f4912a, this.f4913b, null, null);
    }
}
