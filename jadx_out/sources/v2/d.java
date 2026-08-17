package V2;

import android.graphics.Bitmap;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public AbstractC2662a a(int i10, int i11) {
        return b(i10, i11, Bitmap.Config.ARGB_8888);
    }

    public AbstractC2662a b(int i10, int i11, Bitmap.Config config) {
        return c(i10, i11, config, null);
    }

    public AbstractC2662a c(int i10, int i11, Bitmap.Config config, Object obj) {
        return d(i10, i11, config);
    }

    public abstract AbstractC2662a d(int i10, int i11, Bitmap.Config config);
}
