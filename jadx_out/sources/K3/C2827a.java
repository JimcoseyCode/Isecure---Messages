package k3;

import d2.AbstractC2325a;
import d3.k;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: k3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2827a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2827a f29111a = new C2827a();

    private C2827a() {
    }

    public static final float a(X2.h rotationOptions, X2.g gVar, k encodedImage) {
        AbstractC2855l.g(rotationOptions, "rotationOptions");
        AbstractC2855l.g(encodedImage, "encodedImage");
        if (!k.l0(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        if (gVar == null || gVar.f12446b <= 0 || gVar.f12445a <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int iD = f29111a.d(rotationOptions, encodedImage);
        boolean z10 = iD == 90 || iD == 270;
        int height = z10 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z10 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f10 = gVar.f12445a / height;
        float f11 = gVar.f12446b / width;
        float fC = B7.d.c(f10, f11);
        AbstractC2325a.D("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(gVar.f12445a), Integer.valueOf(gVar.f12446b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(fC));
        return fC;
    }

    public static final int b(X2.h rotationOptions, X2.g gVar, k encodedImage, int i10) {
        AbstractC2855l.g(rotationOptions, "rotationOptions");
        AbstractC2855l.g(encodedImage, "encodedImage");
        if (!k.l0(encodedImage)) {
            return 1;
        }
        float fA = a(rotationOptions, gVar, encodedImage);
        int iF = encodedImage.I() == Q2.b.f9065b ? f(fA) : e(fA);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f10 = gVar != null ? gVar.f12447c : i10;
        while (iMax / iF > f10) {
            iF = encodedImage.I() == Q2.b.f9065b ? iF * 2 : iF + 1;
        }
        return iF;
    }

    public static final int c(k encodedImage, int i10, int i11) {
        AbstractC2855l.g(encodedImage, "encodedImage");
        int iW = encodedImage.W();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i10) / iW) / iW > i11) {
            iW *= 2;
        }
        return iW;
    }

    private final int d(X2.h hVar, k kVar) {
        if (!hVar.h()) {
            return 0;
        }
        int iF = kVar.F();
        if (iF == 0 || iF == 90 || iF == 180 || iF == 270) {
            return iF;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final int e(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            double d10 = i10;
            if ((1.0d / d10) + ((1.0d / (Math.pow(d10, 2.0d) - d10)) * ((double) 0.33333334f)) <= f10) {
                return i10 - 1;
            }
            i10++;
        }
    }

    public static final int f(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            int i11 = i10 * 2;
            double d10 = 1.0d / ((double) i11);
            if (d10 + (((double) 0.33333334f) * d10) <= f10) {
                return i10;
            }
            i10 = i11;
        }
    }
}
