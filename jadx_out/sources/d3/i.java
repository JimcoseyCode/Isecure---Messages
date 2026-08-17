package d3;

import android.graphics.Bitmap;
import d2.AbstractC2325a;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class i extends b {
    protected i(AbstractC2662a abstractC2662a, p pVar, int i10, int i11) {
        super(abstractC2662a, pVar, i10, i11);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        AbstractC2325a.K("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    protected i(Bitmap bitmap, g2.h hVar, p pVar, int i10, int i11) {
        super(bitmap, hVar, pVar, i10, i11);
    }
}
