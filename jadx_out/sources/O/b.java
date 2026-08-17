package O;

import H.i;
import H.j;
import H0.g;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.o;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final EnumC0086a f8161g;

        /* JADX INFO: renamed from: O.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum EnumC0086a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        a(String str, EnumC0086a enumC0086a) {
            super(str);
            this.f8161g = enumC0086a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i10;
        if (!h(rational)) {
            AbstractC3583h0.l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f12) {
            int iRound = Math.round((f10 / numerator) * denominator);
            i10 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f11 / denominator) * numerator);
            int i12 = (width - iRound2) / 2;
            width = iRound2;
            i10 = 0;
            i11 = i12;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    public static Bitmap b(o oVar) {
        int format = oVar.getFormat();
        if (format == 1) {
            return d(oVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(oVar);
        }
        if (format == 256 || format == 4101) {
            return c(oVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    private static Bitmap c(o oVar) {
        byte[] bArrK = k(oVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrK, 0, bArrK.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    private static Bitmap d(o oVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(oVar.getWidth(), oVar.getHeight(), Bitmap.Config.ARGB_8888);
        oVar.p()[0].c().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, oVar.p()[0].c(), oVar.p()[0].d());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer e(Bitmap bitmap) {
        g.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static Rational f(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? g(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational g(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean h(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean i(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    public static boolean j(int i10) {
        return i10 == 32;
    }

    public static byte[] k(o oVar) {
        if (!i(oVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oVar.getFormat());
        }
        ByteBuffer byteBufferC = oVar.p()[0].c();
        byte[] bArr = new byte[byteBufferC.capacity()];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        return bArr;
    }

    public static Bitmap l(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] m(o oVar, Rect rect, int i10, int i11) throws a {
        if (oVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(n(oVar), 17, oVar.getWidth(), oVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = new j(byteArrayOutputStream, i.c(oVar, i11));
        if (rect == null) {
            rect = new Rect(0, 0, oVar.getWidth(), oVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i10, jVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0086a.ENCODE_FAILED);
    }

    public static byte[] n(o oVar) {
        o.a aVar = oVar.p()[0];
        o.a aVar2 = oVar.p()[1];
        o.a aVar3 = oVar.p()[2];
        ByteBuffer byteBufferC = aVar.c();
        ByteBuffer byteBufferC2 = aVar2.c();
        ByteBuffer byteBufferC3 = aVar3.c();
        byteBufferC.rewind();
        byteBufferC2.rewind();
        byteBufferC3.rewind();
        int iRemaining = byteBufferC.remaining();
        byte[] bArr = new byte[((oVar.getWidth() * oVar.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i10 = 0; i10 < oVar.getHeight(); i10++) {
            byteBufferC.get(bArr, width, oVar.getWidth());
            width += oVar.getWidth();
            byteBufferC.position(Math.min(iRemaining, (byteBufferC.position() - oVar.getWidth()) + aVar.d()));
        }
        int height = oVar.getHeight() / 2;
        int width2 = oVar.getWidth() / 2;
        int iD = aVar3.d();
        int iD2 = aVar2.d();
        int iE = aVar3.e();
        int iE2 = aVar2.e();
        byte[] bArr2 = new byte[iD];
        byte[] bArr3 = new byte[iD2];
        for (int i11 = 0; i11 < height; i11++) {
            byteBufferC3.get(bArr2, 0, Math.min(iD, byteBufferC3.remaining()));
            byteBufferC2.get(bArr3, 0, Math.min(iD2, byteBufferC2.remaining()));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < width2; i14++) {
                int i15 = width + 1;
                bArr[width] = bArr2[i12];
                width += 2;
                bArr[i15] = bArr3[i13];
                i12 += iE;
                i13 += iE2;
            }
        }
        return bArr;
    }
}
