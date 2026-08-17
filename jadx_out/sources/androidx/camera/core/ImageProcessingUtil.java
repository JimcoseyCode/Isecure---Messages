package androidx.camera.core;

import F.F0;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.e;
import androidx.camera.core.o;
import java.nio.ByteBuffer;
import java.util.Locale;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15134a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends e {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final o.a[] f15135j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f15136k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f15137l;

        /* JADX INFO: renamed from: androidx.camera.core.ImageProcessingUtil$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0148a implements o.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f15138a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f15139b;

            C0148a(int i10, ByteBuffer byteBuffer) {
                this.f15138a = i10;
                this.f15139b = byteBuffer;
            }

            @Override // androidx.camera.core.o.a
            public ByteBuffer c() {
                return this.f15139b;
            }

            @Override // androidx.camera.core.o.a
            public int d() {
                return this.f15138a;
            }

            @Override // androidx.camera.core.o.a
            public int e() {
                return 1;
            }
        }

        a(o oVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12) {
            super(oVar);
            this.f15135j = k(byteBuffer, byteBuffer2, byteBuffer3, i10);
            this.f15136k = i10;
            this.f15137l = i11;
        }

        private o.a[] k(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
            return new o.a[]{new C0148a(i10, byteBuffer), new b(byteBuffer2, i10), new b(byteBuffer3, i10)};
        }

        @Override // androidx.camera.core.e, androidx.camera.core.o
        public int getHeight() {
            return this.f15137l;
        }

        @Override // androidx.camera.core.e, androidx.camera.core.o
        public int getWidth() {
            return this.f15136k;
        }

        @Override // androidx.camera.core.e, androidx.camera.core.o
        public o.a[] p() {
            return this.f15135j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f15141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f15142b;

        b(ByteBuffer byteBuffer, int i10) {
            this.f15141a = byteBuffer;
            this.f15142b = i10;
        }

        @Override // androidx.camera.core.o.a
        public ByteBuffer c() {
            return this.f15141a;
        }

        @Override // androidx.camera.core.o.a
        public int d() {
            return this.f15142b;
        }

        @Override // androidx.camera.core.o.a
        public int e() {
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum c {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static /* synthetic */ void a(o oVar, o oVar2, o oVar3) {
        if (oVar == null || oVar2 == null) {
            return;
        }
        oVar2.close();
    }

    public static /* synthetic */ void b(o oVar, o oVar2, o oVar3) {
        if (oVar == null || oVar2 == null) {
            return;
        }
        oVar2.close();
    }

    public static boolean c(o oVar) {
        if (!m(oVar)) {
            AbstractC3583h0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(oVar) != c.ERROR_CONVERSION) {
            return true;
        }
        AbstractC3583h0.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    private static c d(o oVar) {
        int width = oVar.getWidth();
        int height = oVar.getHeight();
        int iD = oVar.p()[0].d();
        int iD2 = oVar.p()[1].d();
        int iD3 = oVar.p()[2].d();
        int iE = oVar.p()[0].e();
        int iE2 = oVar.p()[1].e();
        return nativeShiftPixel(oVar.p()[0].c(), iD, oVar.p()[1].c(), iD2, oVar.p()[2].c(), iD3, iE, iE2, width, height, iE, iE2, iE2) != 0 ? c.ERROR_CONVERSION : c.SUCCESS;
    }

    public static o e(F0 f02, byte[] bArr) {
        H0.g.a(f02.c() == 256);
        H0.g.g(bArr);
        Surface surface = f02.getSurface();
        H0.g.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC3583h0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        o oVarB = f02.b();
        if (oVarB == null) {
            AbstractC3583h0.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return oVarB;
    }

    public static Bitmap f(o oVar) {
        if (oVar.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = oVar.getWidth();
        int height = oVar.getHeight();
        int iD = oVar.p()[0].d();
        int iD2 = oVar.p()[1].d();
        int iD3 = oVar.p()[2].d();
        int iE = oVar.p()[0].e();
        int iE2 = oVar.p()[1].e();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(oVar.getWidth(), oVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(oVar.p()[0].c(), iD, oVar.p()[1].c(), iD2, oVar.p()[2].c(), iD3, iE, iE2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static o g(final o oVar, F0 f02, ByteBuffer byteBuffer, int i10, boolean z10) {
        if (!m(oVar)) {
            AbstractC3583h0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!l(i10)) {
            AbstractC3583h0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (h(oVar, f02.getSurface(), byteBuffer, i10, z10) == c.ERROR_CONVERSION) {
            AbstractC3583h0.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            AbstractC3583h0.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f15134a)));
            f15134a++;
        }
        final o oVarB = f02.b();
        if (oVarB == null) {
            AbstractC3583h0.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        t tVar = new t(oVarB);
        tVar.d(new e.a() { // from class: y.Z
            @Override // androidx.camera.core.e.a
            public final void a(androidx.camera.core.o oVar2) {
                ImageProcessingUtil.b(oVarB, oVar, oVar2);
            }
        });
        return tVar;
    }

    private static c h(o oVar, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int width = oVar.getWidth();
        int height = oVar.getHeight();
        int iD = oVar.p()[0].d();
        int iD2 = oVar.p()[1].d();
        int iD3 = oVar.p()[2].d();
        int iE = oVar.p()[0].e();
        int iE2 = oVar.p()[1].e();
        return nativeConvertAndroid420ToABGR(oVar.p()[0].c(), iD, oVar.p()[1].c(), iD2, oVar.p()[2].c(), iD3, iE, iE2, surface, byteBuffer, width, height, z10 ? iE : 0, z10 ? iE2 : 0, z10 ? iE2 : 0, i10) != 0 ? c.ERROR_CONVERSION : c.SUCCESS;
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean k(o oVar) {
        return oVar.p().length == 3 && oVar.p()[1].e() == 2 && nativeGetYUVImageVUOff(oVar.p()[2].c(), oVar.p()[1].c()) == -1;
    }

    private static boolean l(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    private static boolean m(o oVar) {
        return oVar.getFormat() == 35 && oVar.p().length == 3;
    }

    public static o n(o oVar, F0 f02, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        final o oVar2;
        c cVarP;
        if (!m(oVar)) {
            AbstractC3583h0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!l(i10)) {
            AbstractC3583h0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        c cVar = c.ERROR_CONVERSION;
        if (i10 > 0) {
            oVar2 = oVar;
            cVarP = p(oVar2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10);
        } else {
            oVar2 = oVar;
            cVarP = cVar;
        }
        if (cVarP == cVar) {
            AbstractC3583h0.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final o oVarB = f02.b();
        if (oVarB == null) {
            AbstractC3583h0.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        t tVar = new t(oVarB);
        tVar.d(new e.a() { // from class: y.a0
            @Override // androidx.camera.core.e.a
            public final void a(androidx.camera.core.o oVar3) {
                ImageProcessingUtil.a(oVarB, oVar2, oVar3);
            }
        });
        return tVar;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Bitmap bitmap, int i15, int i16, int i17);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static o o(o oVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i10) {
        if (!m(oVar)) {
            AbstractC3583h0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!l(i10)) {
            AbstractC3583h0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i10 == 0 && k(oVar)) {
            return null;
        }
        int i11 = i10 % 180;
        int width = i11 == 0 ? oVar.getWidth() : oVar.getHeight();
        int height = i11 == 0 ? oVar.getHeight() : oVar.getWidth();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        int i12 = height;
        if (nativeRotateYUV(oVar.p()[0].c(), oVar.p()[0].d(), oVar.p()[1].c(), oVar.p()[1].d(), oVar.p()[2].c(), oVar.p()[2].d(), oVar.p()[2].e(), byteBuffer4, width, 1, byteBufferNativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, oVar.getWidth(), oVar.getHeight(), i10) == 0) {
            return new t(new a(oVar, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, width, i12, i10));
        }
        AbstractC3583h0.c("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    private static c p(o oVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int width = oVar.getWidth();
        int height = oVar.getHeight();
        int iD = oVar.p()[0].d();
        int iD2 = oVar.p()[1].d();
        int iD3 = oVar.p()[2].d();
        int iE = oVar.p()[1].e();
        Image imageB = L.a.b(imageWriter);
        if (imageB == null) {
            return c.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(oVar.p()[0].c(), iD, oVar.p()[1].c(), iD2, oVar.p()[2].c(), iD3, iE, imageB.getPlanes()[0].getBuffer(), imageB.getPlanes()[0].getRowStride(), imageB.getPlanes()[0].getPixelStride(), imageB.getPlanes()[1].getBuffer(), imageB.getPlanes()[1].getRowStride(), imageB.getPlanes()[1].getPixelStride(), imageB.getPlanes()[2].getBuffer(), imageB.getPlanes()[2].getRowStride(), imageB.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i10) != 0) {
            return c.ERROR_CONVERSION;
        }
        L.a.d(imageWriter, imageB);
        return c.SUCCESS;
    }

    public static boolean q(Surface surface, byte[] bArr) {
        H0.g.g(bArr);
        H0.g.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        AbstractC3583h0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
