package F1;

import android.graphics.drawable.Drawable;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class k extends j {
    private k(Drawable drawable) {
        super(drawable);
    }

    static v d(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // x1.v
    public Class a() {
        return this.f1800g.getClass();
    }

    @Override // x1.v
    public int b() {
        return Math.max(1, this.f1800g.getIntrinsicWidth() * this.f1800g.getIntrinsicHeight() * 4);
    }

    @Override // x1.v
    public void recycle() {
    }
}
