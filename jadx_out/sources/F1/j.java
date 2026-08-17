package F1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import x1.r;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements v, r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Drawable f1800g;

    public j(Drawable drawable) {
        this.f1800g = (Drawable) Q1.k.e(drawable);
    }

    @Override // x1.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f1800g.getConstantState();
        return constantState == null ? this.f1800g : constantState.newDrawable();
    }

    @Override // x1.r
    public void initialize() {
        Drawable drawable = this.f1800g;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof H1.c) {
            ((H1.c) drawable).e().prepareToDraw();
        }
    }
}
