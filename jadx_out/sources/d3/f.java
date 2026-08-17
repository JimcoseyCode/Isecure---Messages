package d3;

import android.graphics.Bitmap;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface f extends d {
    static f E(Bitmap bitmap, g2.h hVar, p pVar, int i10, int i11) {
        return b.l0() ? new b(bitmap, hVar, pVar, i10, i11) : new i(bitmap, hVar, pVar, i10, i11);
    }

    static f f0(AbstractC2662a abstractC2662a, p pVar, int i10) {
        return u(abstractC2662a, pVar, i10, 0);
    }

    static f m0(Bitmap bitmap, g2.h hVar, p pVar, int i10) {
        return E(bitmap, hVar, pVar, i10, 0);
    }

    static f u(AbstractC2662a abstractC2662a, p pVar, int i10, int i11) {
        return b.l0() ? new b(abstractC2662a, pVar, i10, i11) : new i(abstractC2662a, pVar, i10, i11);
    }

    int F();

    int I0();

    AbstractC2662a y();
}
