package com.canhub.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.e;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f19592a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Rect f19593b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final RectF f19594c = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final RectF f19595d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float[] f19596e = new float[6];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float[] f19597f = new float[6];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Pair f19599h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f19600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19601b;

        public a(Bitmap bitmap, int i10) {
            this.f19600a = bitmap;
            this.f19601b = i10;
        }

        public final Bitmap a() {
            return this.f19600a;
        }

        public final int b() {
            return this.f19601b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f19602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f19604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f19605d;

        public b(Bitmap bitmap, int i10, boolean z10, boolean z11) {
            this.f19602a = bitmap;
            this.f19603b = i10;
            this.f19604c = z10;
            this.f19605d = z11;
        }

        public final Bitmap a() {
            return this.f19602a;
        }

        public final int b() {
            return this.f19603b;
        }

        public final boolean c() {
            return this.f19604c;
        }

        public final boolean d() {
            return this.f19605d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19606a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19606a = iArr;
        }
    }

    private d() {
    }

    private final Bitmap H(Bitmap bitmap, int i10, boolean z10, boolean z11) {
        if (i10 <= 0 && !z10 && !z11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        matrix.postScale(z10 ? -1 : 1, z11 ? -1 : 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
        if (!AbstractC2855l.b(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private final Uri a(Context context, Bitmap.CompressFormat compressFormat) {
        try {
            int i10 = c.f19606a[compressFormat.ordinal()];
            String str = i10 != 1 ? i10 != 2 ? ".webp" : ".png" : ".jpg";
            if (Build.VERSION.SDK_INT < 29) {
                return Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
            }
            File fileCreateTempFile = File.createTempFile("cropped", str, context.getCacheDir());
            AbstractC2855l.d(fileCreateTempFile);
            return T1.c.b(context, fileCreateTempFile);
        } catch (IOException e10) {
            throw new RuntimeException("Failed to create temp file for output image", e10);
        }
    }

    private final int b(int i10, int i11) {
        if (f19598g == 0) {
            f19598g = r();
        }
        int i12 = 1;
        if (f19598g <= 0) {
            return 1;
        }
        while (true) {
            int i13 = i11 / i12;
            int i14 = f19598g;
            if (i13 <= i14 && i10 / i12 <= i14) {
                return i12;
            }
            i12 *= 2;
        }
    }

    private final int c(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 <= i13 && i10 <= i12) {
            return 1;
        }
        while ((i11 / 2) / i14 > i13 && (i10 / 2) / i14 > i12) {
            i14 *= 2;
        }
        return i14;
    }

    private final a e(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, int i17) {
        int iB;
        Bitmap bitmapH;
        Rect rectY = y(fArr, i11, i12, z10, i13, i14);
        int iWidth = i15 > 0 ? i15 : rectY.width();
        int iHeight = i16 > 0 ? i16 : rectY.height();
        Bitmap bitmapA = null;
        try {
            a aVarM = m(context, uri, rectY, iWidth, iHeight, i17);
            try {
                bitmapA = aVarM.a();
                iB = aVarM.b();
            } catch (Exception unused) {
                iB = 1;
            }
        } catch (Exception unused2) {
            rectY = rectY;
        }
        int i18 = iB;
        Bitmap bitmap = bitmapA;
        if (bitmap == null) {
            return f(context, uri, fArr, i10, z10, i13, i14, i17, rectY, iWidth, iHeight, z11, z12);
        }
        try {
            bitmapH = H(bitmap, i10, z11, z12);
        } catch (OutOfMemoryError e10) {
            e = e10;
        }
        try {
            if (i10 % 90 != 0) {
                bitmapH = i(bitmapH, fArr, rectY, i10, z10, i13, i14);
            }
            return new a(bitmapH, i18);
        } catch (OutOfMemoryError e11) {
            e = e11;
            bitmap = bitmapH;
            bitmap.recycle();
            throw e;
        }
    }

    private final a f(Context context, Uri uri, float[] fArr, int i10, boolean z10, int i11, int i12, int i13, Rect rect, int i14, int i15, boolean z11, boolean z12) throws Throwable {
        Bitmap bitmap;
        float[] fArr2;
        Bitmap bitmapH = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iC = i13 * c(rect.width(), rect.height(), i14, i15);
            options.inSampleSize = iC;
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC2855l.f(contentResolver, "getContentResolver(...)");
            Bitmap bitmapJ = j(contentResolver, uri, options);
            if (bitmapJ != null) {
                try {
                    int length = fArr.length;
                    try {
                        fArr2 = new float[length];
                        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                        for (int i16 = 0; i16 < length; i16++) {
                            fArr2[i16] = fArr2[i16] / options.inSampleSize;
                        }
                        bitmap = bitmapJ;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapJ;
                    }
                    try {
                        bitmapH = h(bitmap, fArr2, i10, z10, i11, i12, 1.0f, z11, z12);
                        if (!AbstractC2855l.b(bitmapH, bitmap)) {
                            bitmap.recycle();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!AbstractC2855l.b(null, bitmap)) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bitmap = bitmapJ;
                }
            }
            return new a(bitmapH, iC);
        } catch (Exception e10) {
            throw new e.c(uri, e10.getMessage());
        } catch (OutOfMemoryError e11) {
            if (0 != 0) {
                bitmapH.recycle();
            }
            throw e11;
        }
    }

    private final Bitmap h(Bitmap bitmap, float[] fArr, int i10, boolean z10, int i11, int i12, float f10, boolean z11, boolean z12) {
        float f11 = f10;
        Rect rectY = y(fArr, bitmap.getWidth(), bitmap.getHeight(), z10, i11, i12);
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        float f12 = z11 ? -f11 : f11;
        if (z12) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectY.left, rectY.top, rectY.width(), rectY.height(), matrix, true);
        AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
        if (AbstractC2855l.b(bitmapCreateBitmap, bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i10 % 90 != 0 ? i(bitmapCreateBitmap, fArr, rectY, i10, z10, i11, i12) : bitmapCreateBitmap;
    }

    private final Bitmap i(Bitmap bitmap, float[] fArr, Rect rect, int i10, boolean z10, int i11, int i12) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (i10 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i10);
        int i13 = (i10 < 90 || (181 <= i10 && i10 < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= fArr.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f10 = fArr[i14];
            if (f10 >= i13 - 1 && f10 <= i13 + 1) {
                int i15 = i14 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * ((double) (rect.bottom - fArr[i15])));
                iAbs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i15] - rect.top)));
                iAbs3 = (int) Math.abs(((double) (fArr[i15] - rect.top)) / Math.sin(radians));
                iAbs = (int) Math.abs(((double) (rect.bottom - fArr[i15])) / Math.cos(radians));
                break;
            }
            i14 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (z10) {
            n(rect, i11, i12);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!AbstractC2855l.b(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private final Bitmap j(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws e.b, IOException {
        do {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, f19593b, options);
                    AbstractC3376c.a(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(inputStreamOpenInputStream, null);
                }
            } finally {
            }
        } while (options.inSampleSize <= 512);
        throw new e.b(uri);
    }

    private final BitmapFactory.Options k(ContentResolver contentResolver, Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, f19593b, options);
            options.inJustDecodeBounds = false;
            AbstractC3376c.a(inputStreamOpenInputStream, null);
            return options;
        } finally {
        }
    }

    private final a m(Context context, Uri uri, Rect rect, int i10, int i11, int i12) throws e.c {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i13;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i12 * c(rect.width(), rect.height(), i10, i11);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    AbstractC2855l.d(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    AbstractC2855l.d(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            AbstractC2855l.d(bitmapRegionDecoderNewInstance);
                            a aVar = new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            AbstractC3376c.a(inputStreamOpenInputStream, null);
                            return aVar;
                        } catch (OutOfMemoryError unused) {
                            i13 = options.inSampleSize * 2;
                            options.inSampleSize = i13;
                        }
                    } finally {
                        if (bitmapRegionDecoderNewInstance != null) {
                            bitmapRegionDecoderNewInstance.recycle();
                        }
                    }
                } while (i13 <= 512);
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(inputStreamOpenInputStream, null);
                return new a(null, 1);
            } finally {
            }
        } catch (Exception e10) {
            throw new e.c(uri, e10.getMessage());
        }
    }

    private final void n(Rect rect, int i10, int i11) {
        if (i10 != i11 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    private final int r() {
        try {
            EGL egl = EGLContext.getEGL();
            AbstractC2855l.e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
            int i10 = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i10, iArr);
            int[] iArr2 = new int[1];
            int i11 = iArr[0];
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i13], 12332, iArr2);
                int i14 = iArr2[0];
                if (i12 < i14) {
                    i12 = i14;
                }
            }
            egl10.eglTerminate(eGLDisplayEglGetDisplay);
            return Math.max(i12, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    public final float A(float[] points) {
        AbstractC2855l.g(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    public final float B(float[] points) {
        AbstractC2855l.g(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    public final float C(float[] points) {
        AbstractC2855l.g(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    public final float D(float[] points) {
        AbstractC2855l.g(points, "points");
        return B(points) - A(points);
    }

    public final b E(Bitmap bitmap, X0.a exif) {
        AbstractC2855l.g(exif, "exif");
        boolean z10 = true;
        int iM = exif.m("Orientation", 1);
        int i10 = iM != 3 ? (iM == 5 || iM == 6 || iM == 7) ? 90 : iM != 8 ? 0 : 270 : 180;
        boolean z11 = iM == 2 || iM == 5;
        if (iM != 4 && iM != 7) {
            z10 = false;
        }
        return new b(bitmap, i10, z11, z10);
    }

    public final b F(Bitmap bitmap, Context context, Uri uri) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(uri, "uri");
        X0.a aVar = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    X0.a aVar2 = new X0.a(inputStreamOpenInputStream);
                    AbstractC3376c.a(inputStreamOpenInputStream, null);
                    aVar = aVar2;
                } finally {
                }
            }
        } catch (Throwable unused) {
        }
        return aVar != null ? E(bitmap, aVar) : new b(bitmap, 0, false, false);
    }

    public final Bitmap G(Bitmap bitmap, int i10, int i11, CropImageView.k options) {
        Bitmap bitmapCreateScaledBitmap;
        AbstractC2855l.g(options, "options");
        if (i10 > 0 && i11 > 0) {
            try {
                CropImageView.k kVar = CropImageView.k.f19483j;
                if (options == kVar || options == CropImageView.k.f19482i || options == CropImageView.k.f19484k) {
                    if (options == CropImageView.k.f19484k) {
                        AbstractC2855l.d(bitmap);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, false);
                    } else {
                        AbstractC2855l.d(bitmap);
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i10, height / i11);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || options == kVar) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!AbstractC2855l.b(bitmapCreateScaledBitmap, bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception unused) {
            }
        }
        AbstractC2855l.d(bitmap);
        return bitmap;
    }

    public final void I(Pair pair) {
        f19599h = pair;
    }

    public final void J(Uri uri, Bitmap.CompressFormat compressFormat) {
        AbstractC2855l.g(uri, "uri");
        AbstractC2855l.g(compressFormat, "compressFormat");
        if (!AbstractC2855l.b(uri.getScheme(), "content")) {
            throw new SecurityException("Only content:// URIs are allowed for security reasons. Received: " + uri.getScheme() + "://");
        }
        String path = uri.getPath();
        if (path == null) {
            path = uri.toString();
            AbstractC2855l.f(path, "toString(...)");
        }
        int i10 = c.f19606a[compressFormat.ordinal()];
        List listE = i10 != 1 ? i10 != 2 ? AbstractC2800q.e(".webp") : AbstractC2800q.e(".png") : AbstractC2800q.m(".jpg", ".jpeg");
        if (listE == null || !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                if (P8.q.v(path, (String) it.next(), true)) {
                    return;
                }
            }
        }
        throw new SecurityException("File extension does not match compress format. Expected one of: " + AbstractC2800q.o0(listE, ", ", null, null, 0, null, null, 62, null) + ", Format: " + compressFormat + ", Path: " + path);
    }

    public final Uri K(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, Uri uri) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(bitmap, "bitmap");
        AbstractC2855l.g(compressFormat, "compressFormat");
        Uri uriA = uri == null ? a(context, compressFormat) : uri;
        if (uri != null) {
            J(uri, compressFormat);
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriA, "wt");
        AbstractC2855l.d(outputStreamOpenOutputStream);
        try {
            bitmap.compress(compressFormat, i10, outputStreamOpenOutputStream);
            AbstractC3376c.a(outputStreamOpenOutputStream, null);
            return uriA;
        } finally {
        }
    }

    public final Uri L(Context context, Bitmap bitmap, Uri uri) {
        AbstractC2855l.g(context, "context");
        try {
            AbstractC2855l.d(bitmap);
            return K(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
        } catch (Exception unused) {
            return null;
        }
    }

    public final a d(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12) {
        Context context2 = context;
        AbstractC2855l.g(context2, "context");
        float[] cropPoints = fArr;
        AbstractC2855l.g(cropPoints, "cropPoints");
        int i17 = 1;
        while (true) {
            try {
                AbstractC2855l.d(uri);
                return e(context2, uri, cropPoints, i10, i11, i12, z10, i13, i14, i15, i16, z11, z12, i17);
            } catch (OutOfMemoryError e10) {
                i17 *= 2;
                if (i17 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i17 + "): " + uri + "\r\n" + e10.getMessage(), e10);
                }
                context2 = context;
                cropPoints = fArr;
            }
        }
    }

    public final a g(Bitmap bitmap, float[] cropPoints, int i10, boolean z10, int i11, int i12, boolean z11, boolean z12) {
        AbstractC2855l.g(cropPoints, "cropPoints");
        int i13 = 1;
        do {
            try {
                AbstractC2855l.d(bitmap);
                return new a(h(bitmap, cropPoints, i10, z10, i11, i12, 1 / i13, z11, z12), i13);
            } catch (OutOfMemoryError e10) {
                i13 *= 2;
            }
        } while (i13 <= 8);
        throw e10;
    }

    public final a l(Context context, Uri uri, int i10, int i11) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(uri, "uri");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC2855l.d(contentResolver);
            BitmapFactory.Options optionsK = k(contentResolver, uri);
            int i12 = optionsK.outWidth;
            if (i12 == -1 && optionsK.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            optionsK.inSampleSize = Math.max(c(i12, optionsK.outHeight, i10, i11), b(optionsK.outWidth, optionsK.outHeight));
            return new a(j(contentResolver, uri, optionsK), optionsK.inSampleSize);
        } catch (Exception e10) {
            throw new e.c(uri, e10.getMessage());
        }
    }

    public final Rect o() {
        return f19593b;
    }

    public final RectF p() {
        return f19594c;
    }

    public final Pair q() {
        return f19599h;
    }

    public final float[] s() {
        return f19596e;
    }

    public final float[] t() {
        return f19597f;
    }

    public final RectF u() {
        return f19595d;
    }

    public final float v(float[] points) {
        AbstractC2855l.g(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    public final float w(float[] points) {
        AbstractC2855l.g(points, "points");
        return (B(points) + A(points)) / 2.0f;
    }

    public final float x(float[] points) {
        AbstractC2855l.g(points, "points");
        return (v(points) + C(points)) / 2.0f;
    }

    public final Rect y(float[] cropPoints, int i10, int i11, boolean z10, int i12, int i13) {
        AbstractC2855l.g(cropPoints, "cropPoints");
        Rect rect = new Rect(AbstractC3624a.c(Math.max(0.0f, A(cropPoints))), AbstractC3624a.c(Math.max(0.0f, C(cropPoints))), AbstractC3624a.c(Math.min(i10, B(cropPoints))), AbstractC3624a.c(Math.min(i11, v(cropPoints))));
        if (z10) {
            n(rect, i12, i13);
        }
        return rect;
    }

    public final float z(float[] points) {
        AbstractC2855l.g(points, "points");
        return v(points) - C(points);
    }
}
