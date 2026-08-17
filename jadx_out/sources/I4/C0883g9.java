package I4;

import r4.AbstractC3267h;

/* JADX INFO: renamed from: I4.g9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0883g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0885h0 f4770a;

    /* synthetic */ C0883g9(C0861e9 c0861e9, AbstractC0872f9 abstractC0872f9) {
        this.f4770a = c0861e9.f4757a;
    }

    public final AbstractC0885h0 a() {
        return this.f4770a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0883g9) {
            return AbstractC3267h.a(this.f4770a, ((C0883g9) obj).f4770a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3267h.b(this.f4770a);
    }
}
