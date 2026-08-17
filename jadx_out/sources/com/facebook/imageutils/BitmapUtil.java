package com.facebook.imageutils;

import H0.f;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f2.C2601b;
import i7.AbstractC2746i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u0010J'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\f\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020#2\u0006\u0010*\u001a\u00020&H\u0007¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020\u001fH\u0002¢\u0006\u0004\b,\u0010!J-\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102R!\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010=\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010:R\u0014\u0010>\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010:R\u0014\u0010?\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010:R\u0014\u0010A\u001a\u00020@8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010D¨\u0006E"}, d2 = {"Lcom/facebook/imageutils/BitmapUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSizeInBytes", "(Landroid/graphics/Bitmap;)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bytes", "Landroid/util/Pair;", "decodeDimensions", "([B)Landroid/util/Pair;", "Landroid/net/Uri;", "uri", "(Landroid/net/Uri;)Landroid/util/Pair;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)Landroid/util/Pair;", "Lcom/facebook/imageutils/ImageMetaData;", "decodeDimensionsAndColorSpace", "(Ljava/io/InputStream;)Lcom/facebook/imageutils/ImageMetaData;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "getPixelSizeForBitmapConfig", "(Landroid/graphics/Bitmap$Config;)I", "width", "height", "getSizeInByteForBitmap", "(IILandroid/graphics/Bitmap$Config;)I", "Ljava/nio/ByteBuffer;", "c", "()Ljava/nio/ByteBuffer;", "byteBuffer", "Li7/B;", "f", "(Ljava/nio/ByteBuffer;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "useDecodeBufferHelper", "setUseDecodeBufferHelper", "(Z)V", "fixDecodeDrmImageCrash", "setFixDecodeDrmImageCrash", "e", "Landroid/graphics/Rect;", "outPadding", "Landroid/graphics/BitmapFactory$Options;", "options", "decodeStreamInternal", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "LH0/f;", "a", "Lkotlin/Lazy;", "d", "()LH0/f;", "DECODE_BUFFERS", "ALPHA_8_BYTES_PER_PIXEL", "I", "ARGB_4444_BYTES_PER_PIXEL", "ARGB_8888_BYTES_PER_PIXEL", "RGB_565_BYTES_PER_PIXEL", "RGBA_F16_BYTES_PER_PIXEL", "RGBA_1010102_BYTES_PER_PIXEL", PointerEventHelper.POINTER_TYPE_UNKNOWN, "MAX_BITMAP_DIMENSION", "F", "b", "Z", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapUtil {
    public static final int ALPHA_8_BYTES_PER_PIXEL = 1;
    public static final int ARGB_4444_BYTES_PER_PIXEL = 2;
    public static final int ARGB_8888_BYTES_PER_PIXEL = 4;
    public static final float MAX_BITMAP_DIMENSION = 2048.0f;
    public static final int RGBA_1010102_BYTES_PER_PIXEL = 4;
    public static final int RGBA_F16_BYTES_PER_PIXEL = 8;
    public static final int RGB_565_BYTES_PER_PIXEL = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean useDecodeBufferHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean fixDecodeDrmImageCrash;
    public static final BitmapUtil INSTANCE = new BitmapUtil();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Lazy DECODE_BUFFERS = AbstractC2746i.b(new InterfaceC3487a() { // from class: n3.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return BitmapUtil.b();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BitmapUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f b() {
        return new f(12);
    }

    private final ByteBuffer c() {
        return useDecodeBufferHelper ? C2601b.f27219a.acquire() : (ByteBuffer) d().acquire();
    }

    private final f d() {
        return (f) DECODE_BUFFERS.getValue();
    }

    public static final Pair<Integer, Integer> decodeDimensions(byte[] bytes) {
        return decodeDimensions(new ByteArrayInputStream(bytes));
    }

    public static final ImageMetaData decodeDimensionsAndColorSpace(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BitmapUtil bitmapUtil = INSTANCE;
        ByteBuffer byteBufferE = bitmapUtil.e();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferE.array();
            bitmapUtil.decodeStreamInternal(inputStream, null, options);
            ImageMetaData imageMetaData = new ImageMetaData(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
            bitmapUtil.f(byteBufferE);
            return imageMetaData;
        } catch (Throwable th) {
            INSTANCE.f(byteBufferE);
            throw th;
        }
    }

    private final ByteBuffer e() {
        ByteBuffer byteBufferC = c();
        if (byteBufferC != null) {
            return byteBufferC;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(C2601b.c());
        AbstractC2855l.f(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    private final void f(ByteBuffer byteBuffer) {
        if (useDecodeBufferHelper) {
            return;
        }
        d().release(byteBuffer);
    }

    public static final int getPixelSizeForBitmapConfig(Bitmap.Config bitmapConfig) {
        switch (bitmapConfig == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bitmapConfig.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int getSizeInByteForBitmap(int width, int height, Bitmap.Config bitmapConfig) {
        if (width <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + width).toString());
        }
        if (height <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + height).toString());
        }
        int pixelSizeForBitmapConfig = getPixelSizeForBitmapConfig(bitmapConfig);
        int i10 = width * height * pixelSizeForBitmapConfig;
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i10 + ", width: " + width + ", height: " + height + ", pixelSize: " + pixelSizeForBitmapConfig).toString());
    }

    public static final int getSizeInBytes(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    public static final void setFixDecodeDrmImageCrash(boolean fixDecodeDrmImageCrash2) {
        fixDecodeDrmImageCrash = fixDecodeDrmImageCrash2;
    }

    public static final void setUseDecodeBufferHelper(boolean useDecodeBufferHelper2) {
        useDecodeBufferHelper = useDecodeBufferHelper2;
    }

    public final Bitmap decodeStreamInternal(InputStream inputStream, Rect outPadding, BitmapFactory.Options options) {
        if (!fixDecodeDrmImageCrash) {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, outPadding, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final Pair<Integer, Integer> decodeDimensions(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public static final Pair<Integer, Integer> decodeDimensions(InputStream inputStream) {
        if (inputStream != null) {
            BitmapUtil bitmapUtil = INSTANCE;
            ByteBuffer byteBufferE = bitmapUtil.e();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = byteBufferE.array();
                Pair<Integer, Integer> pair = null;
                bitmapUtil.decodeStreamInternal(inputStream, null, options);
                if (options.outWidth != -1 && options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
                bitmapUtil.f(byteBufferE);
                return pair;
            } catch (Throwable th) {
                INSTANCE.f(byteBufferE);
                throw th;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }
}
