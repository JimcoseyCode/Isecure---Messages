package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K0 extends Z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P0 f21741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected P0 f21742h;

    protected K0(P0 p02) {
        this.f21741g = p02;
        if (p02.B()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f21742h = p02.n();
    }

    private static void h(Object obj, Object obj2) {
        C2216y1.a().b(obj.getClass()).h(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1
    public final boolean e() {
        return P0.A(this.f21742h, false);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final K0 clone() {
        K0 k02 = (K0) this.f21741g.E(5, null, null);
        k02.f21742h = u0();
        return k02;
    }

    public final K0 j(P0 p02) {
        if (!this.f21741g.equals(p02)) {
            if (!this.f21742h.B()) {
                n();
            }
            h(this.f21742h, p02);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2182q1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final P0 k0() {
        P0 p0U0 = u0();
        if (P0.A(p0U0, true)) {
            return p0U0;
        }
        throw new V1(p0U0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2182q1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public P0 u0() {
        if (!this.f21742h.B()) {
            return this.f21742h;
        }
        this.f21742h.w();
        return this.f21742h;
    }

    protected final void m() {
        if (this.f21742h.B()) {
            return;
        }
        n();
    }

    protected void n() {
        P0 p0N = this.f21741g.n();
        h(p0N, this.f21742h);
        this.f21742h = p0N;
    }
}
