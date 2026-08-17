package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.AbstractC1944n;
import com.bumptech.glide.load.resource.bitmap.T;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import v1.EnumC3418b;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1949t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v1.g f19264f = v1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC3418b.f32877i);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v1.g f19265g = v1.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v1.g f19266h = AbstractC1944n.OPTION;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v1.g f19267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v1.g f19268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f19269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f19270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set f19271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Queue f19272n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.d f19273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f19274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1.b f19275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f19276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S f19277e = S.b();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.t$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a();

        void b(y1.d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f19267i = v1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f19268j = v1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f19269k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f19270l = new a();
        f19271m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f19272n = Q1.l.g(0);
    }

    public C1949t(List list, DisplayMetrics displayMetrics, y1.d dVar, y1.b bVar) {
        this.f19276d = list;
        this.f19274b = (DisplayMetrics) Q1.k.e(displayMetrics);
        this.f19273a = (y1.d) Q1.k.e(dVar);
        this.f19275c = (y1.b) Q1.k.e(bVar);
    }

    private static int a(double d10) {
        int iL = l(d10);
        int iX = x(((double) iL) * d10);
        return x((d10 / ((double) (iX / iL))) * ((double) iX));
    }

    private void b(T t10, EnumC3418b enumC3418b, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f19277e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (enumC3418b == EnumC3418b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = t10.e().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(enumC3418b);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, T t10, b bVar, y1.d dVar, AbstractC1944n abstractC1944n, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int iFloor;
        int iFloor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float scaleFactor = abstractC1944n.getScaleFactor(i15, i16, i13, i14);
        if (scaleFactor <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + scaleFactor + " from: " + abstractC1944n + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        AbstractC1944n.g sampleSizeRounding = abstractC1944n.getSampleSizeRounding(i15, i16, i13, i14);
        if (sampleSizeRounding == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int iX = i15 / x(scaleFactor * f10);
        int iX2 = i16 / x(scaleFactor * f11);
        AbstractC1944n.g gVar = AbstractC1944n.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRounding == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (sampleSizeRounding == gVar && iMax < 1.0f / scaleFactor) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i17 = iMax / 8;
            if (i17 > 0) {
                iFloor /= i17;
                iFloor2 /= i17;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = iMax;
            iFloor = (int) Math.floor(f10 / f12);
            iFloor2 = (int) Math.floor(f11 / f12);
        } else if (imageType.isWebp()) {
            float f13 = iMax;
            iFloor = Math.round(f10 / f13);
            iFloor2 = Math.round(f11 / f13);
        } else if (i15 % iMax == 0 && i16 % iMax == 0) {
            iFloor = i15 / iMax;
            iFloor2 = i16 / iMax;
        } else {
            int[] iArrM = m(t10, options, bVar, dVar);
            iFloor = iArrM[0];
            iFloor2 = iArrM[1];
        }
        double scaleFactor2 = abstractC1944n.getScaleFactor(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = a(scaleFactor2);
        options.inDensity = l(scaleFactor2);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
    }

    private x1.v e(T t10, int i10, int i11, v1.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f19275c.d(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        EnumC3418b enumC3418b = (EnumC3418b) hVar.b(f19264f);
        v1.i iVar = (v1.i) hVar.b(f19265g);
        AbstractC1944n abstractC1944n = (AbstractC1944n) hVar.b(AbstractC1944n.OPTION);
        boolean zBooleanValue = ((Boolean) hVar.b(f19267i)).booleanValue();
        v1.g gVar = f19268j;
        try {
            return C1937g.d(h(t10, optionsK, abstractC1944n, enumC3418b, iVar, hVar.b(gVar) != null && ((Boolean) hVar.b(gVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f19273a);
        } finally {
            v(optionsK);
            this.f19275c.put(bArr);
        }
    }

    private Bitmap h(T t10, BitmapFactory.Options options, AbstractC1944n abstractC1944n, EnumC3418b enumC3418b, v1.i iVar, boolean z10, int i10, int i11, boolean z11, b bVar) {
        int i12;
        long jB = Q1.g.b();
        int[] iArrM = m(t10, options, bVar, this.f19273a);
        int i13 = iArrM[0];
        int i14 = iArrM[1];
        String str = options.outMimeType;
        boolean z12 = (i13 == -1 || i14 == -1) ? false : z10;
        int iA = t10.a();
        int iF = a0.f(iA);
        boolean zI = a0.i(iA);
        int i15 = i10;
        if (i15 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (r(iF)) {
            i12 = i11;
            i15 = i14;
        } else {
            i12 = i11;
            i15 = i13;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = r(iF) ? i13 : i14;
        }
        ImageHeaderParser.ImageType imageTypeE = t10.e();
        c(imageTypeE, t10, bVar, this.f19273a, abstractC1944n, iF, i13, i14, i15, i12, options);
        int i16 = i15;
        int iRound = i12;
        b(t10, enumC3418b, z12, zI, options, i16, iRound);
        int i17 = Build.VERSION.SDK_INT;
        if (z(imageTypeE)) {
            if (i13 < 0 || i14 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f11 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i13 / f11);
                int iCeil2 = (int) Math.ceil(i14 / f11);
                int iRound2 = Math.round(iCeil * f10);
                iRound = Math.round(iCeil2 * f10);
                i16 = iRound2;
            }
            if (i16 > 0 && iRound > 0) {
                y(options, this.f19273a, i16, iRound);
            }
        }
        if (iVar != null) {
            if (i17 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((iVar == v1.i.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i17 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(t10, options, bVar, this.f19273a);
        bVar.b(this.f19273a, bitmapI);
        if (Log.isLoggable("Downsampler", 2)) {
            t(i13, i14, str, options, bitmapI, i10, i11, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f19274b.densityDpi);
        Bitmap bitmapJ = a0.j(this.f19273a, bitmapI, iA);
        if (!bitmapI.equals(bitmapJ)) {
            this.f19273a.c(bitmapI);
        }
        return bitmapJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap i(T t10, BitmapFactory.Options options, b bVar, y1.d dVar) {
        Bitmap bitmapI;
        if (!options.inJustDecodeBounds) {
            bVar.a();
            t10.d();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        a0.e().lock();
        try {
            try {
                bitmapI = t10.b(options);
            } catch (IllegalArgumentException e10) {
                IOException iOExceptionU = u(e10, i10, i11, str, options);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionU;
                }
                try {
                    dVar.c(bitmap);
                    options.inBitmap = null;
                    bitmapI = i(t10, options, bVar, dVar);
                } catch (IOException unused) {
                    throw iOExceptionU;
                }
            }
            return bitmapI;
        } finally {
            a0.e().unlock();
        }
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        Queue queue = f19272n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            w(options);
        }
        return options;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(T t10, BitmapFactory.Options options, b bVar, y1.d dVar) {
        options.inJustDecodeBounds = true;
        i(t10, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        j(bitmap);
        n(options);
        int i14 = options.inSampleSize;
        Thread.currentThread().getName();
        Q1.g.a(j10);
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f19272n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, y1.d dVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public x1.v d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, v1.h hVar) {
        return e(new T.c(parcelFileDescriptor, this.f19276d, this.f19275c), i10, i11, hVar, f19270l);
    }

    public x1.v f(InputStream inputStream, int i10, int i11, v1.h hVar, b bVar) {
        return e(new T.b(inputStream, this.f19276d, this.f19275c), i10, i11, hVar, bVar);
    }

    public x1.v g(ByteBuffer byteBuffer, int i10, int i11, v1.h hVar) {
        return e(new T.a(byteBuffer, this.f19276d, this.f19275c), i10, i11, hVar, f19270l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.b();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.t$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1949t.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1949t.b
        public void b(y1.d dVar, Bitmap bitmap) {
        }
    }
}
