package I4;

import r4.AbstractC3267h;

/* JADX INFO: renamed from: I4.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0831c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L6 f4713a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f4715c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0883g9 f4717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC0885h0 f4718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC0885h0 f4719g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f4714b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1033u6 f4716d = null;

    /* synthetic */ C0831c1(C0809a1 c0809a1, AbstractC0820b1 abstractC0820b1) {
        this.f4713a = c0809a1.f4694a;
        this.f4715c = c0809a1.f4695b;
        this.f4717e = c0809a1.f4696c;
        this.f4718f = c0809a1.f4697d;
        this.f4719g = c0809a1.f4698e;
    }

    public final AbstractC0885h0 a() {
        return this.f4718f;
    }

    public final AbstractC0885h0 b() {
        return this.f4719g;
    }

    public final L6 c() {
        return this.f4713a;
    }

    public final C0883g9 d() {
        return this.f4717e;
    }

    public final Boolean e() {
        return this.f4715c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0831c1)) {
            return false;
        }
        C0831c1 c0831c1 = (C0831c1) obj;
        return AbstractC3267h.a(this.f4713a, c0831c1.f4713a) && AbstractC3267h.a(null, null) && AbstractC3267h.a(this.f4715c, c0831c1.f4715c) && AbstractC3267h.a(null, null) && AbstractC3267h.a(this.f4717e, c0831c1.f4717e) && AbstractC3267h.a(this.f4718f, c0831c1.f4718f) && AbstractC3267h.a(this.f4719g, c0831c1.f4719g);
    }

    public final int hashCode() {
        return AbstractC3267h.b(this.f4713a, null, this.f4715c, null, this.f4717e, this.f4718f, this.f4719g);
    }
}
