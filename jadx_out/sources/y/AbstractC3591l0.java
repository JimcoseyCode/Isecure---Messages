package y;

import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: renamed from: y.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3591l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rational f33805a;

    public AbstractC3591l0() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    protected abstract PointF a(float f10, float f11);

    public final C3589k0 b(float f10, float f11) {
        return c(f10, f11, d());
    }

    public final C3589k0 c(float f10, float f11, float f12) {
        PointF pointFA = a(f10, f11);
        return new C3589k0(pointFA.x, pointFA.y, f12, this.f33805a);
    }

    protected void e(Rational rational) {
        this.f33805a = rational;
    }

    public AbstractC3591l0(Rational rational) {
        this.f33805a = rational;
    }
}
