package z2;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.E;
import com.facebook.drawee.drawable.F;
import com.facebook.drawee.drawable.g;

/* JADX INFO: renamed from: z2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3672d extends g implements E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f34245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private F f34246h;

    public C3672d(Drawable drawable) {
        super(drawable);
        this.f34245g = null;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            F f10 = this.f34246h;
            if (f10 != null) {
                f10.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f34245g;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f34245g.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.drawable.E
    public void g(F f10) {
        this.f34246h = f10;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    public void i(Drawable drawable) {
        this.f34245g = drawable;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        F f10 = this.f34246h;
        if (f10 != null) {
            f10.d(z10);
        }
        return super.setVisible(z10, z11);
    }
}
