package R8;

import W8.AbstractC1510m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K0 extends J {
    @Override // R8.J
    public J M0(int i10, String str) {
        AbstractC1510m.a(i10);
        return AbstractC1510m.b(this, str);
    }

    public abstract K0 O0();

    protected final String P0() {
        K0 k0O0;
        K0 k0C = C1404d0.c();
        if (this == k0C) {
            return "Dispatchers.Main";
        }
        try {
            k0O0 = k0C.O0();
        } catch (UnsupportedOperationException unused) {
            k0O0 = null;
        }
        if (this == k0O0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
