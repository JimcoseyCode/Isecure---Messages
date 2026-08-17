package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.view.m;
import y.AbstractC3583h0;
import y.I0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final m.d f15346i = m.d.FILL_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Size f15347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f15348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f15350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m.d f15354h = f15346i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15355a;

        static {
            int[] iArr = new int[m.d.values().length];
            f15355a = iArr;
            try {
                iArr[m.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15355a[m.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15355a[m.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15355a[m.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15355a[m.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15355a[m.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    f() {
    }

    private static RectF b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    private int e() {
        return !this.f15353g ? this.f15349c : -H.c.b(this.f15351e);
    }

    private Size f() {
        return H.z.i(this.f15349c) ? new Size(this.f15348b.height(), this.f15348b.width()) : new Size(this.f15348b.width(), this.f15348b.height());
    }

    private RectF l(Size size, int i10) {
        H0.g.i(m());
        Matrix matrixJ = j(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f15347a.getWidth(), this.f15347a.getHeight());
        matrixJ.mapRect(rectF);
        return rectF;
    }

    private boolean m() {
        return (this.f15348b == null || this.f15347a == null || !(!this.f15353g || this.f15351e != -1)) ? false : true;
    }

    private static void p(Matrix matrix, RectF rectF, RectF rectF2, m.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f15355a[dVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                AbstractC3583h0.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (dVar == m.d.FIT_CENTER || dVar == m.d.FIT_START || dVar == m.d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    Bitmap a(Bitmap bitmap, Size size, int i10) {
        if (!m()) {
            return bitmap;
        }
        Matrix matrixK = k();
        RectF rectFL = l(size, i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixK);
        matrix.postScale(rectFL.width() / this.f15347a.getWidth(), rectFL.height() / this.f15347a.getHeight());
        matrix.postTranslate(rectFL.left, rectFL.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    Matrix c(Size size, int i10, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i10).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    RectF d(Size size, int i10) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeF = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f15354h);
        matrix.mapRect(rectF2);
        return i10 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    m.d g() {
        return this.f15354h;
    }

    Matrix h(Size size, int i10) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f15350d);
        matrix.postConcat(j(size, i10));
        return matrix;
    }

    Rect i() {
        return this.f15348b;
    }

    Matrix j(Size size, int i10) {
        H0.g.i(m());
        Matrix matrixD = H.z.d(new RectF(this.f15348b), n(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i10), this.f15349c);
        if (this.f15352f && this.f15353g) {
            if (H.z.i(this.f15349c)) {
                matrixD.preScale(1.0f, -1.0f, this.f15348b.centerX(), this.f15348b.centerY());
                return matrixD;
            }
            matrixD.preScale(-1.0f, 1.0f, this.f15348b.centerX(), this.f15348b.centerY());
        }
        return matrixD;
    }

    Matrix k() {
        H0.g.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f15347a.getWidth(), this.f15347a.getHeight());
        return H.z.d(rectF, rectF, e());
    }

    boolean n(Size size) {
        return H.z.k(size, true, f(), false);
    }

    void o(int i10, int i11) {
        if (this.f15353g) {
            this.f15349c = i10;
            this.f15351e = i11;
        }
    }

    void q(m.d dVar) {
        this.f15354h = dVar;
    }

    void r(I0.h hVar, Size size, boolean z10) {
        AbstractC3583h0.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z10);
        this.f15348b = hVar.a();
        this.f15349c = hVar.b();
        this.f15351e = hVar.d();
        this.f15347a = size;
        this.f15352f = z10;
        this.f15353g = hVar.e();
        this.f15350d = hVar.c();
    }

    void s(Size size, int i10, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            AbstractC3583h0.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z10 = false;
                boolean z11 = (!this.f15353g || display == null || display.getRotation() == this.f15351e) ? false : true;
                if (!this.f15353g && e() != 0) {
                    z10 = true;
                }
                if (z11 || z10) {
                    AbstractC3583h0.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFL = l(size, i10);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFL.width() / this.f15347a.getWidth());
            view.setScaleY(rectFL.height() / this.f15347a.getHeight());
            view.setTranslationX(rectFL.left - view.getLeft());
            view.setTranslationY(rectFL.top - view.getTop());
        }
    }
}
