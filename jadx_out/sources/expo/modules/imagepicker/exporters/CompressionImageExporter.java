package expo.modules.imagepicker.exporters;

import R8.AbstractC1443x0;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.FailedToWriteFileException;
import expo.modules.imagepicker.ImagePickerUtilsKt;
import expo.modules.imagepicker.MissingModuleException;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.kotlin.providers.AppContextProvider;
import expo.modules.kotlin.services.Service;
import i7.AbstractC2753p;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/imagepicker/exporters/CompressionImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "Lexpo/modules/kotlin/providers/AppContextProvider;", "appContextProvider", PointerEventHelper.POINTER_TYPE_UNKNOWN, "quality", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;D)V", "Landroid/net/Uri;", "source", "Landroid/graphics/Bitmap;", "readBitmap", "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", "bitmap", "Ljava/io/File;", "output", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", PointerEventHelper.POINTER_TYPE_UNKNOWN, "writeImage", "(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Ln7/f;)Ljava/lang/Object;", "Landroid/content/ContentResolver;", "contentResolver", "Lexpo/modules/imagepicker/exporters/ImageExportResult;", "exportAsync", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/providers/AppContextProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "compressQuality", "I", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompressionImageExporter implements ImageExporter {
    private final AppContextProvider appContextProvider;
    private final int compressQuality;

    /* JADX INFO: renamed from: expo.modules.imagepicker.exporters.CompressionImageExporter$exportAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.exporters.CompressionImageExporter", f = "CompressionImageExporter.kt", l = {35, 37, 38}, m = "exportAsync")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return CompressionImageExporter.this.exportAsync(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.exporters.CompressionImageExporter$readBitmap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.exporters.CompressionImageExporter", f = "CompressionImageExporter.kt", l = {53}, m = "readBitmap")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24771 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C24771(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return CompressionImageExporter.this.readBitmap(null, this);
        }
    }

    public CompressionImageExporter(AppContextProvider appContextProvider, double d10) {
        AbstractC2855l.g(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
        this.compressQuality = (int) (d10 * ((double) 100));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readBitmap(final Uri uri, n7.f fVar) {
        C24771 c24771;
        if (fVar instanceof C24771) {
            c24771 = (C24771) fVar;
            int i10 = c24771.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24771.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24771 = new C24771(fVar);
            }
        }
        Object objC = c24771.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24771.label;
        if (i11 == 0) {
            AbstractC2753p.b(objC);
            InterfaceC3487a interfaceC3487a = new InterfaceC3487a() { // from class: expo.modules.imagepicker.exporters.b
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return CompressionImageExporter.readBitmap$lambda$0(this.f26551g, uri);
                }
            };
            c24771.label = 1;
            objC = AbstractC1443x0.c(null, interfaceC3487a, c24771, 1, null);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objC);
        }
        AbstractC2855l.d(objC);
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap readBitmap$lambda$0(CompressionImageExporter compressionImageExporter, Uri uri) throws MissingModuleException, FailedToReadFileException {
        Service service = compressionImageExporter.appContextProvider.getAppContext().getServices().getRegistry().get(ImageLoaderInterface.class);
        if (!(service instanceof ImageLoaderInterface)) {
            service = null;
        }
        ImageLoaderInterface imageLoaderInterface = (ImageLoaderInterface) service;
        if (imageLoaderInterface != null) {
            String string = uri.toString();
            AbstractC2855l.f(string, "toString(...)");
            Future<Bitmap> futureLoadImageForManipulationFromURL = imageLoaderInterface.loadImageForManipulationFromURL(string);
            if (futureLoadImageForManipulationFromURL != null) {
                try {
                    return futureLoadImageForManipulationFromURL.get();
                } catch (ExecutionException e10) {
                    throw new FailedToReadFileException(C0.a.a(uri), e10);
                }
            }
        }
        throw new MissingModuleException("ImageLoader");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeImage(final Bitmap bitmap, final File file, final Bitmap.CompressFormat compressFormat, n7.f fVar) {
        return AbstractC1443x0.c(null, new InterfaceC3487a() { // from class: expo.modules.imagepicker.exporters.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Boolean.valueOf(CompressionImageExporter.writeImage$lambda$2(file, bitmap, compressFormat, this));
            }
        }, fVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean writeImage$lambda$2(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, CompressionImageExporter compressionImageExporter) throws FailedToWriteFileException, IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                boolean zCompress = bitmap.compress(compressFormat, compressionImageExporter.compressQuality, fileOutputStream);
                AbstractC3376c.a(fileOutputStream, null);
                return zCompress;
            } finally {
            }
        } catch (FileNotFoundException e10) {
            throw new FailedToWriteFileException(file, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (expo.modules.imagepicker.ImagePickerUtilsKt.copyExifData(r2, r11, r12, r0) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.imagepicker.exporters.ImageExporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object exportAsync(Uri uri, File file, ContentResolver contentResolver, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        Uri uri2;
        Bitmap bitmap;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object bitmap2 = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(bitmap2);
            anonymousClass1.L$0 = uri;
            anonymousClass1.L$1 = file;
            anonymousClass1.L$2 = contentResolver;
            anonymousClass1.label = 1;
            bitmap2 = readBitmap(uri, anonymousClass1);
            if (bitmap2 != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            contentResolver = (ContentResolver) anonymousClass1.L$2;
            file = (File) anonymousClass1.L$1;
            uri = (Uri) anonymousClass1.L$0;
            AbstractC2753p.b(bitmap2);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap = (Bitmap) anonymousClass1.L$1;
                file = (File) anonymousClass1.L$0;
                AbstractC2753p.b(bitmap2);
                final Bitmap bitmap3 = bitmap;
                return new ImageExportResult(file, bitmap3.getWidth(), bitmap3.getHeight()) { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter.exportAsync.2
                    @Override // expo.modules.imagepicker.exporters.ImageExportResult
                    public Object data(ContentResolver contentResolver2, n7.f fVar2) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap3.compress(Bitmap.CompressFormat.JPEG, this.compressQuality, byteArrayOutputStream);
                        return byteArrayOutputStream;
                    }
                };
            }
            bitmap = (Bitmap) anonymousClass1.L$3;
            ContentResolver contentResolver2 = (ContentResolver) anonymousClass1.L$2;
            File file2 = (File) anonymousClass1.L$1;
            uri2 = (Uri) anonymousClass1.L$0;
            AbstractC2753p.b(bitmap2);
            contentResolver = contentResolver2;
            file = file2;
            anonymousClass1.L$0 = file;
            anonymousClass1.L$1 = bitmap;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 3;
        }
        Bitmap bitmap4 = (Bitmap) bitmap2;
        Bitmap.CompressFormat bitmapCompressFormat = ImagePickerUtilsKt.toBitmapCompressFormat(file);
        anonymousClass1.L$0 = uri;
        anonymousClass1.L$1 = file;
        anonymousClass1.L$2 = contentResolver;
        anonymousClass1.L$3 = bitmap4;
        anonymousClass1.label = 2;
        if (writeImage(bitmap4, file, bitmapCompressFormat, anonymousClass1) != objE) {
            uri2 = uri;
            bitmap = bitmap4;
            anonymousClass1.L$0 = file;
            anonymousClass1.L$1 = bitmap;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 3;
        }
        return objE;
    }
}
