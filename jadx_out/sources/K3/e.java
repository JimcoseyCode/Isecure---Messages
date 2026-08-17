package k3;

import android.graphics.Matrix;
import d3.k;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f29113a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2.f f29114b;

    static {
        c2.f fVarP = c2.f.p(2, 7, 4, 5);
        AbstractC2855l.f(fVarP, "of(...)");
        f29114b = fVarP;
    }

    private e() {
    }

    public static final int a(int i10) {
        return Math.max(1, 8 / i10);
    }

    public static final float b(X2.g gVar, int i10, int i11) {
        if (gVar == null) {
            return 1.0f;
        }
        float f10 = i10;
        float f11 = i11;
        float fMax = Math.max(gVar.f12445a / f10, gVar.f12446b / f11);
        float f12 = f10 * fMax;
        float f13 = gVar.f12447c;
        if (f12 > f13) {
            fMax = f13 / f10;
        }
        return f11 * fMax > f13 ? f13 / f11 : fMax;
    }

    private final int c(k kVar) {
        int iF = kVar.F();
        if (iF == 90 || iF == 180 || iF == 270) {
            return kVar.F();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(X2.h rotationOptions, k encodedImage) {
        AbstractC2855l.g(rotationOptions, "rotationOptions");
        AbstractC2855l.g(encodedImage, "encodedImage");
        int iI0 = encodedImage.I0();
        c2.f fVar = f29114b;
        int iIndexOf = fVar.indexOf(Integer.valueOf(iI0));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        E e10 = fVar.get((iIndexOf + ((!rotationOptions.h() ? rotationOptions.f() : 0) / 90)) % fVar.size());
        AbstractC2855l.f(e10, "get(...)");
        return ((Number) e10).intValue();
    }

    public static final int e(X2.h rotationOptions, k encodedImage) {
        AbstractC2855l.g(rotationOptions, "rotationOptions");
        AbstractC2855l.g(encodedImage, "encodedImage");
        if (!rotationOptions.g()) {
            return 0;
        }
        int iC = f29113a.c(encodedImage);
        return rotationOptions.h() ? iC : (iC + rotationOptions.f()) % 360;
    }

    public static final int f(X2.h rotationOptions, X2.g gVar, k encodedImage, boolean z10) {
        AbstractC2855l.g(rotationOptions, "rotationOptions");
        AbstractC2855l.g(encodedImage, "encodedImage");
        if (!z10 || gVar == null) {
            return 8;
        }
        int iE = e(rotationOptions, encodedImage);
        int iD = f29114b.contains(Integer.valueOf(encodedImage.I0())) ? d(rotationOptions, encodedImage) : 0;
        boolean z11 = iE == 90 || iE == 270 || iD == 5 || iD == 7;
        int iK = k(b(gVar, z11 ? encodedImage.getHeight() : encodedImage.getWidth(), z11 ? encodedImage.getWidth() : encodedImage.getHeight()), gVar.f12448d);
        if (iK > 8) {
            return 8;
        }
        if (iK < 1) {
            return 1;
        }
        return iK;
    }

    public static final Matrix g(k encodedImage, X2.h rotationOptions) {
        AbstractC2855l.g(encodedImage, "encodedImage");
        AbstractC2855l.g(rotationOptions, "rotationOptions");
        if (f29114b.contains(Integer.valueOf(encodedImage.I0()))) {
            return f29113a.h(d(rotationOptions, encodedImage));
        }
        int iE = e(rotationOptions, encodedImage);
        if (iE == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iE);
        return matrix;
    }

    private final Matrix h(int i10) {
        Matrix matrix = new Matrix();
        if (i10 == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }

    public static final boolean i(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int i10) {
        return i10 >= 0 && i10 <= 270 && i10 % 90 == 0;
    }

    public static final int k(float f10, float f11) {
        return (int) (f11 + (f10 * 8));
    }
}
