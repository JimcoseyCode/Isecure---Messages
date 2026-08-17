package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L0 extends K0 implements InterfaceC2191s1 {
    protected L0(M0 m02) {
        super(m02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K0
    protected final void n() {
        super.n();
        if (((M0) this.f21742h).zzb != F0.d()) {
            M0 m02 = (M0) this.f21742h;
            m02.zzb = m02.zzb.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2182q1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final M0 u0() {
        if (!((M0) this.f21742h).B()) {
            return (M0) this.f21742h;
        }
        ((M0) this.f21742h).zzb.g();
        return (M0) super.u0();
    }
}
