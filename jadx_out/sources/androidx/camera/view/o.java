package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import y.AbstractC3591l0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class o extends AbstractC3591l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final PointF f15403e = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f15404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f15405c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f15406d;

    o(f fVar) {
        this.f15404b = fVar;
    }

    @Override // y.AbstractC3591l0
    protected PointF a(float f10, float f11) {
        float[] fArr = {f10, f11};
        synchronized (this) {
            try {
                Matrix matrix = this.f15406d;
                if (matrix == null) {
                    return f15403e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f(Size size, int i10) {
        Rect rect;
        H.y.b();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f15405c) != null) {
                    this.f15406d = this.f15404b.c(size, i10, rect);
                    return;
                }
                this.f15406d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(Rect rect) {
        e(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f15405c = rect;
        }
    }
}
