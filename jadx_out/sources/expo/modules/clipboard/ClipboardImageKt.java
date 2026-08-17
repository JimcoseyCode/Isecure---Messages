package expo.modules.clipboard;

import P8.C1385d;
import P8.q;
import R8.AbstractC1443x0;
import R8.C1404d0;
import R8.J;
import R8.f1;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2793j;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017\u001a \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u000eH\u0082@¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, d2 = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "base64Image", "Lexpo/modules/clipboard/ImageFormat;", "getImageFormatFromBase64", "(Ljava/lang/String;)Lexpo/modules/clipboard/ImageFormat;", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "imageUri", "Lexpo/modules/clipboard/GetImageOptions;", "options", "Lexpo/modules/clipboard/ImageResult;", "imageFromContentUri", "(Landroid/content/Context;Landroid/net/Uri;Lexpo/modules/clipboard/GetImageOptions;Ln7/f;)Ljava/lang/Object;", "Ljava/io/File;", "clipboardCacheDir", "Li7/B;", "clearClipboardCache", "(Ljava/io/File;)V", "hashFileName", "()Ljava/lang/String;", "Landroid/content/ClipData;", "clipDataFromBase64Image", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ln7/f;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmapFromContentUriAsync", "(Landroid/content/Context;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", "bitmapFromBase64String", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ensureExists", "(Ljava/io/File;Ln7/f;)Ljava/lang/Object;", "PNG_PREFIX", "Ljava/lang/String;", "JPEG_PREFIX", "expo-clipboard_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ClipboardImageKt {
    public static final String JPEG_PREFIX = "/9j/";
    public static final String PNG_PREFIX = "iVBORw0K";

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            try {
                iArr[ImageFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageFormat.JPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: expo.modules.clipboard.ClipboardImageKt$bitmapFromContentUriAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.clipboard.ClipboardImageKt", f = "ClipboardImage.kt", l = {190}, m = "bitmapFromContentUriAsync")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ClipboardImageKt.bitmapFromContentUriAsync(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.clipboard.ClipboardImageKt$clipDataFromBase64Image$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.clipboard.ClipboardImageKt", f = "ClipboardImage.kt", l = {162, 166, 169}, m = "clipDataFromBase64Image")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24581 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C24581(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ClipboardImageKt.clipDataFromBase64Image(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.clipboard.ClipboardImageKt$imageFromContentUri$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.clipboard.ClipboardImageKt", f = "ClipboardImage.kt", l = {79, 87}, m = "imageFromContentUri")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24591 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C24591(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ClipboardImageKt.imageFromContentUri(null, null, null, this);
        }
    }

    public static final Bitmap bitmapFromBase64String(String base64Image) throws InvalidImageException {
        AbstractC2855l.g(base64Image, "base64Image");
        try {
            byte[] bArrDecode = Base64.decode(base64Image, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray != null) {
                return bitmapDecodeByteArray;
            }
            throw new RuntimeException("Failed to convert base64 into Bitmap");
        } catch (RuntimeException e10) {
            throw new InvalidImageException(base64Image, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bitmapFromContentUriAsync(final Context context, final Uri uri, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objB = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objB);
            J jB = C1404d0.b();
            InterfaceC3487a interfaceC3487a = new InterfaceC3487a() { // from class: expo.modules.clipboard.c
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return ClipboardImageKt.bitmapFromContentUriAsync$lambda$9(context, uri);
                }
            };
            anonymousClass1.label = 1;
            objB = AbstractC1443x0.b(jB, interfaceC3487a, anonymousClass1);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objB);
        }
        AbstractC2855l.f(objB, "runInterruptible(...)");
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap bitmapFromContentUriAsync$lambda$9(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 28) {
            return MediaStore.Images.Media.getBitmap(contentResolver, uri);
        }
        ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(contentResolver, uri);
        AbstractC2855l.f(sourceCreateSource, "createSource(...)");
        return ImageDecoder.decodeBitmap(sourceCreateSource);
    }

    public static final void clearClipboardCache(File clipboardCacheDir) {
        File[] fileArrListFiles;
        AbstractC2855l.g(clipboardCacheDir, "clipboardCacheDir");
        if (clipboardCacheDir.exists() && clipboardCacheDir.isDirectory() && (fileArrListFiles = clipboardCacheDir.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    AbstractC2855l.d(file);
                    t7.j.x(file);
                } else {
                    file.delete();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object clipDataFromBase64Image(Context context, String str, File file, n7.f fVar) throws NoSuchAlgorithmException, IOException, InvalidImageException {
        C24581 c24581;
        ImageFormat imageFormatFromBase64;
        String str2;
        Context context2;
        Bitmap bitmap;
        final File file2;
        final BufferedOutputStream bufferedOutputStream;
        Closeable closeable;
        InterfaceC3487a interfaceC3487a;
        File file3;
        Context context3;
        if (fVar instanceof C24581) {
            c24581 = (C24581) fVar;
            int i10 = c24581.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24581.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24581 = new C24581(fVar);
            }
        }
        Object objC = c24581.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24581.label;
        if (i11 == 0) {
            AbstractC2753p.b(objC);
            Bitmap bitmapBitmapFromBase64String = bitmapFromBase64String(str);
            imageFormatFromBase64 = getImageFormatFromBase64(str);
            clearClipboardCache(file);
            String strHashFileName = hashFileName();
            int i12 = WhenMappings.$EnumSwitchMapping$0[imageFormatFromBase64.ordinal()];
            if (i12 == 1) {
                str2 = strHashFileName + ".png";
            } else {
                if (i12 != 2) {
                    throw new C2750m();
                }
                str2 = strHashFileName + ".jpeg";
            }
            File file4 = new File(file, str2);
            c24581.L$0 = context;
            c24581.L$1 = bitmapBitmapFromBase64String;
            c24581.L$2 = imageFormatFromBase64;
            c24581.L$3 = file4;
            c24581.label = 1;
            if (ensureExists(file4, c24581) != objE) {
                context2 = context;
                bitmap = bitmapBitmapFromBase64String;
                file2 = file4;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) c24581.L$2;
                file3 = (File) c24581.L$1;
                context3 = (Context) c24581.L$0;
                try {
                    AbstractC2753p.b(objC);
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(closeable, null);
                    ClipData clipDataNewUri = ClipData.newUri(context3.getContentResolver(), "image", ClipboardFileProvider.INSTANCE.getUriForFile(context3, context3.getApplicationInfo().packageName + ".ClipboardFileProvider", file3));
                    AbstractC2855l.f(clipDataNewUri, "newUri(...)");
                    return clipDataNewUri;
                } catch (Throwable th) {
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3376c.a(closeable, th);
                        throw th2;
                    }
                }
            }
            file2 = (File) c24581.L$3;
            imageFormatFromBase64 = (ImageFormat) c24581.L$2;
            bitmap = (Bitmap) c24581.L$1;
            context2 = (Context) c24581.L$0;
            AbstractC2753p.b(objC);
            bufferedOutputStream = new BufferedOutputStream((FileOutputStream) objC);
            try {
                bitmap.compress(imageFormatFromBase64.getCompressFormat(), 100, bufferedOutputStream);
                interfaceC3487a = new InterfaceC3487a() { // from class: expo.modules.clipboard.e
                    @Override // w7.InterfaceC3487a
                    public final Object invoke() {
                        return ClipboardImageKt.clipDataFromBase64Image$lambda$8$lambda$7(bufferedOutputStream);
                    }
                };
                c24581.L$0 = context2;
                c24581.L$1 = file2;
                c24581.L$2 = bufferedOutputStream;
                c24581.L$3 = null;
                c24581.label = 3;
                if (AbstractC1443x0.c(null, interfaceC3487a, c24581, 1, null) != objE) {
                    file3 = file2;
                    context3 = context2;
                    closeable = bufferedOutputStream;
                    C2735B c2735b2 = C2735B.f28704a;
                    AbstractC3376c.a(closeable, null);
                    ClipData clipDataNewUri2 = ClipData.newUri(context3.getContentResolver(), "image", ClipboardFileProvider.INSTANCE.getUriForFile(context3, context3.getApplicationInfo().packageName + ".ClipboardFileProvider", file3));
                    AbstractC2855l.f(clipDataNewUri2, "newUri(...)");
                    return clipDataNewUri2;
                }
                return objE;
            } catch (Throwable th3) {
                th = th3;
                closeable = bufferedOutputStream;
                throw th;
            }
        }
        file2 = (File) c24581.L$3;
        imageFormatFromBase64 = (ImageFormat) c24581.L$2;
        bitmap = (Bitmap) c24581.L$1;
        context2 = (Context) c24581.L$0;
        AbstractC2753p.b(objC);
        InterfaceC3487a interfaceC3487a2 = new InterfaceC3487a() { // from class: expo.modules.clipboard.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ClipboardImageKt.clipDataFromBase64Image$lambda$6(file2);
            }
        };
        c24581.L$0 = context2;
        c24581.L$1 = bitmap;
        c24581.L$2 = imageFormatFromBase64;
        c24581.L$3 = file2;
        c24581.label = 2;
        objC = AbstractC1443x0.c(null, interfaceC3487a2, c24581, 1, null);
        if (objC != objE) {
            bufferedOutputStream = new BufferedOutputStream((FileOutputStream) objC);
            bitmap.compress(imageFormatFromBase64.getCompressFormat(), 100, bufferedOutputStream);
            interfaceC3487a = new InterfaceC3487a() { // from class: expo.modules.clipboard.e
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return ClipboardImageKt.clipDataFromBase64Image$lambda$8$lambda$7(bufferedOutputStream);
                }
            };
            c24581.L$0 = context2;
            c24581.L$1 = file2;
            c24581.L$2 = bufferedOutputStream;
            c24581.L$3 = null;
            c24581.label = 3;
            if (AbstractC1443x0.c(null, interfaceC3487a, c24581, 1, null) != objE) {
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileOutputStream clipDataFromBase64Image$lambda$6(File file) {
        return new FileOutputStream(file, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B clipDataFromBase64Image$lambda$8$lambda$7(BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.flush();
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ensureExists(final File file, n7.f fVar) {
        return AbstractC1443x0.b(C1404d0.b(), new InterfaceC3487a() { // from class: expo.modules.clipboard.f
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Boolean.valueOf(ClipboardImageKt.ensureExists$lambda$10(file));
            }
        }, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ensureExists$lambda$10(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file.createNewFile();
    }

    public static final ImageFormat getImageFormatFromBase64(String base64Image) {
        AbstractC2855l.g(base64Image, "base64Image");
        String strSubstring = base64Image.substring(0, 8);
        AbstractC2855l.f(strSubstring, "substring(...)");
        return q.K(strSubstring, PNG_PREFIX, false, 2, null) ? ImageFormat.PNG : q.K(strSubstring, JPEG_PREFIX, false, 2, null) ? ImageFormat.JPG : ImageFormat.JPG;
    }

    public static final String hashFileName() throws NoSuchAlgorithmException {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String str = "copied_image" + AbstractC2793j.Y(bArr, PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, new Function1() { // from class: expo.modules.clipboard.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClipboardImageKt.hashFileName$lambda$3(((Byte) obj).byteValue());
            }
        }, 30, null);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(C1385d.f8858b);
        AbstractC2855l.f(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC2855l.d(bArrDigest);
        return AbstractC2793j.Y(bArrDigest, PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, new Function1() { // from class: expo.modules.clipboard.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClipboardImageKt.hashFileName$lambda$4(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hashFileName$lambda$3(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hashFileName$lambda$4(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object imageFromContentUri(Context context, Uri uri, GetImageOptions getImageOptions, n7.f fVar) {
        C24591 c24591;
        ImageFormat imageFormat;
        Bitmap bitmap;
        ByteArrayOutputStream byteArrayOutputStream;
        if (fVar instanceof C24591) {
            c24591 = (C24591) fVar;
            int i10 = c24591.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24591.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24591 = new C24591(fVar);
            }
        }
        Object objBitmapFromContentUriAsync = c24591.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24591.label;
        if (i11 == 0) {
            AbstractC2753p.b(objBitmapFromContentUriAsync);
            c24591.L$0 = getImageOptions;
            c24591.label = 1;
            objBitmapFromContentUriAsync = bitmapFromContentUriAsync(context, uri, c24591);
            if (objBitmapFromContentUriAsync != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteArrayOutputStream = (ByteArrayOutputStream) c24591.L$2;
            imageFormat = (ImageFormat) c24591.L$1;
            bitmap = (Bitmap) c24591.L$0;
            AbstractC2753p.b(objBitmapFromContentUriAsync);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            StringBuilder sb = new StringBuilder("data:" + imageFormat.getMimeType() + ";base64,");
            sb.append(strEncodeToString);
            String string = sb.toString();
            AbstractC2855l.f(string, "toString(...)");
            return new ImageResult(string, bitmap.getWidth(), bitmap.getHeight());
        }
        getImageOptions = (GetImageOptions) c24591.L$0;
        AbstractC2753p.b(objBitmapFromContentUriAsync);
        Bitmap bitmap2 = (Bitmap) objBitmapFromContentUriAsync;
        imageFormat = getImageOptions.getImageFormat();
        int jpegQuality = (int) (getImageOptions.getJpegQuality() * ((double) 100));
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        bitmap2.compress(imageFormat.getCompressFormat(), jpegQuality, byteArrayOutputStream2);
        c24591.L$0 = bitmap2;
        c24591.L$1 = imageFormat;
        c24591.L$2 = byteArrayOutputStream2;
        c24591.label = 2;
        if (f1.a(c24591) != objE) {
            bitmap = bitmap2;
            byteArrayOutputStream = byteArrayOutputStream2;
            String strEncodeToString2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            StringBuilder sb2 = new StringBuilder("data:" + imageFormat.getMimeType() + ";base64,");
            sb2.append(strEncodeToString2);
            String string2 = sb2.toString();
            AbstractC2855l.f(string2, "toString(...)");
            return new ImageResult(string2, bitmap.getWidth(), bitmap.getHeight());
        }
        return objE;
    }
}
