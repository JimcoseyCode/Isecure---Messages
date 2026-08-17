package expo.modules.camera.tasks;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import X0.a;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.camera.CameraExceptions;
import expo.modules.camera.PictureFormat;
import expo.modules.camera.PictureOptions;
import expo.modules.camera.PictureRef;
import expo.modules.camera.utils.CameraViewHelper;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.runtime.Runtime;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010,R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010.R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010/R\u0014\u00102\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lexpo/modules/camera/tasks/ResolveTakenPicture;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "imageData", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/camera/PictureOptions;", "options", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mirror", "Lexpo/modules/kotlin/runtime/Runtime;", "Lexpo/modules/kotlin/RuntimeContext;", "runtimeContext", "Ljava/io/File;", "directory", "Lexpo/modules/camera/tasks/PictureSavedDelegate;", "pictureSavedDelegate", "<init>", "([BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;ZLexpo/modules/kotlin/runtime/Runtime;Ljava/io/File;Lexpo/modules/camera/tasks/PictureSavedDelegate;)V", "Landroid/os/Bundle;", "processImage", "()Landroid/os/Bundle;", "skipProcessing", "response", "Li7/B;", "onComplete", "(Landroid/os/Bundle;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "orientation", "Landroid/graphics/BitmapFactory$Options;", "bitmapOptions", "Landroid/graphics/Bitmap;", "decodeBitmap", "([BILexpo/modules/camera/PictureOptions;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "angle", "decodeAndRotateBitmap", "([BILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "getImageRotation", "(I)I", "resolve", "(Ln7/f;)Ljava/lang/Object;", "[B", "Lexpo/modules/kotlin/Promise;", "Lexpo/modules/camera/PictureOptions;", "Z", "Lexpo/modules/kotlin/runtime/Runtime;", "Ljava/io/File;", "Lexpo/modules/camera/tasks/PictureSavedDelegate;", "getQuality", "()I", "quality", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResolveTakenPicture {
    private final File directory;
    private byte[] imageData;
    private boolean mirror;
    private PictureOptions options;
    private PictureSavedDelegate pictureSavedDelegate;
    private Promise promise;
    private final Runtime runtimeContext;

    /* JADX INFO: renamed from: expo.modules.camera.tasks.ResolveTakenPicture$resolve$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.camera.tasks.ResolveTakenPicture$resolve$2", f = "ResolveTakenPicture.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        int label;

        AnonymousClass2(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ResolveTakenPicture.this.new AnonymousClass2(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            Bundle bundleProcessImage = ResolveTakenPicture.this.processImage();
            if (!ResolveTakenPicture.this.options.getPictureRef()) {
                ResolveTakenPicture.this.onComplete(bundleProcessImage);
            }
            return C2735B.f28704a;
        }
    }

    public ResolveTakenPicture(byte[] imageData, Promise promise, PictureOptions options, boolean z10, Runtime runtimeContext, File directory, PictureSavedDelegate pictureSavedDelegate) {
        AbstractC2855l.g(imageData, "imageData");
        AbstractC2855l.g(promise, "promise");
        AbstractC2855l.g(options, "options");
        AbstractC2855l.g(runtimeContext, "runtimeContext");
        AbstractC2855l.g(directory, "directory");
        AbstractC2855l.g(pictureSavedDelegate, "pictureSavedDelegate");
        this.imageData = imageData;
        this.promise = promise;
        this.options = options;
        this.mirror = z10;
        this.runtimeContext = runtimeContext;
        this.directory = directory;
        this.pictureSavedDelegate = pictureSavedDelegate;
    }

    private final Bitmap decodeAndRotateBitmap(byte[] imageData, int angle, BitmapFactory.Options options) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(imageData, 0, imageData.length, options);
        if (angle == 0 && !this.mirror) {
            AbstractC2855l.d(bitmapDecodeByteArray);
            return bitmapDecodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        if (this.mirror) {
            matrix.postScale(-1.0f, 1.0f);
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
            AbstractC2855l.f(bitmapCreateBitmap, "createBitmap(...)");
            if (!AbstractC2855l.b(bitmapCreateBitmap, bitmapDecodeByteArray) && !bitmapDecodeByteArray.isRecycled()) {
                bitmapDecodeByteArray.recycle();
            }
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            AbstractC2855l.d(bitmapDecodeByteArray);
            return bitmapDecodeByteArray;
        }
    }

    private final Bitmap decodeBitmap(byte[] imageData, int orientation, PictureOptions options, BitmapFactory.Options bitmapOptions) {
        if (!options.getExif()) {
            return decodeAndRotateBitmap(imageData, getImageRotation(orientation), bitmapOptions);
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(imageData, 0, imageData.length, bitmapOptions);
        AbstractC2855l.d(bitmapDecodeByteArray);
        return bitmapDecodeByteArray;
    }

    private final int getImageRotation(int orientation) {
        switch (orientation) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private final int getQuality() {
        return (int) (this.options.getQuality() * ((double) 100));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onComplete(Bundle response) {
        if (response == null) {
            return;
        }
        if (!this.options.getFastMode()) {
            this.promise.resolve(response);
            return;
        }
        Bundle bundle = new Bundle();
        Integer id = this.options.getId();
        if (id == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        bundle.putInt("id", id.intValue());
        bundle.putBundle("data", response);
        this.pictureSavedDelegate.onPictureSaved(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle processImage() {
        if (this.options.getSkipProcessing()) {
            return skipProcessing();
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.imageData);
            try {
                Bundle bundle = new Bundle();
                a aVar = new a(byteArrayInputStream);
                Map<String, Object> additionalExif = this.options.getAdditionalExif();
                if (additionalExif != null) {
                    CameraViewHelper.setExifData(aVar, additionalExif);
                }
                int iM = aVar.m("Orientation", 1);
                if (this.mirror) {
                    aVar.f0("Orientation", String.valueOf(ResolveTakenPictureKt.getMirroredOrientation(iM)));
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                C c10 = new C();
                OutOfMemoryError e10 = null;
                while (options.inSampleSize <= this.options.getMaxDownsampling()) {
                    try {
                        c10.f29371g = decodeBitmap(this.imageData, iM, this.options, options);
                        break;
                    } catch (OutOfMemoryError e11) {
                        e10 = e11;
                        options.inSampleSize *= 2;
                    }
                }
                if (c10.f29371g == null) {
                    this.promise.reject("ERR_CAMERA_OUT_OF_MEMORY", "Cannot allocate enough space to process the taken picture.", e10);
                    AbstractC3376c.a(byteArrayInputStream, null);
                    return null;
                }
                if (this.options.getExif()) {
                    bundle.putBundle("exif", CameraViewHelper.getExifData(aVar));
                }
                bundle.putInt("width", ((Bitmap) c10.f29371g).getWidth());
                bundle.putInt("height", ((Bitmap) c10.f29371g).getHeight());
                if (this.options.getPictureRef()) {
                    this.promise.resolve(new PictureRef((Bitmap) c10.f29371g, this.runtimeContext));
                    AbstractC3376c.a(byteArrayInputStream, null);
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ((Bitmap) c10.f29371g).compress(this.options.getImageType() == PictureFormat.PNG ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, getQuality(), byteArrayOutputStream);
                        String strWriteStreamToFile = ResolveTakenPictureKt.writeStreamToFile(this.directory, byteArrayOutputStream, this.options.getImageType().toExtension());
                        ((Bitmap) c10.f29371g).recycle();
                        if (this.options.getExif()) {
                            CameraViewHelper.addExifData(new a(strWriteStreamToFile), aVar);
                        }
                        String string = Uri.fromFile(new File(strWriteStreamToFile)).toString();
                        AbstractC2855l.f(string, "toString(...)");
                        bundle.putString("uri", string);
                        bundle.putString("format", this.options.getImageType().toExtension());
                        if (this.options.getBase64()) {
                            bundle.putString("base64", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                        }
                        C2735B c2735b = C2735B.f28704a;
                        AbstractC3376c.a(byteArrayOutputStream, null);
                        AbstractC3376c.a(byteArrayInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3376c.a(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                return bundle;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC3376c.a(byteArrayInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e12) {
            if (!(e12 instanceof Resources.NotFoundException)) {
            }
            e12.printStackTrace();
            return null;
        }
        if (!(e12 instanceof Resources.NotFoundException)) {
            this.promise.reject("E_TAKING_PICTURE_FAILED", "Documents directory of the app could not be found.", e12);
        } else if (e12 instanceof IOException) {
            this.promise.reject("E_TAKING_PICTURE_FAILED", "An unknown I/O exception has occurred.", e12);
        } else if (e12 instanceof IllegalArgumentException) {
            this.promise.reject("E_TAKING_PICTURE_FAILED", "An incompatible parameter has been passed in. ", e12);
        } else if (e12 instanceof CameraExceptions.WriteImageException) {
            this.promise.reject((CodedException) e12);
        } else {
            this.promise.reject("E_TAKING_PICTURE_FAILED", "An unknown exception has occurred.", e12);
        }
        e12.printStackTrace();
        return null;
    }

    private final Bundle skipProcessing() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.imageData);
                String strWriteStreamToFile = ResolveTakenPictureKt.writeStreamToFile(this.directory, byteArrayOutputStream, this.options.getImageType().toExtension());
                String string = Uri.fromFile(new File(strWriteStreamToFile)).toString();
                AbstractC2855l.f(string, "toString(...)");
                a aVar = new a(strWriteStreamToFile);
                Bundle bundle = new Bundle();
                bundle.putString("uri", string);
                bundle.putInt("width", aVar.m("ImageWidth", -1));
                bundle.putInt("height", aVar.m("ImageLength", -1));
                if (this.options.getExif()) {
                    bundle.putBundle("exif", CameraViewHelper.getExifData(aVar));
                }
                if (this.options.getBase64()) {
                    bundle.putString("base64", Base64.encodeToString(this.imageData, 2));
                }
                AbstractC3376c.a(byteArrayOutputStream, null);
                return bundle;
            } finally {
            }
        } catch (IOException e10) {
            this.promise.reject("E_TAKING_PICTURE_FAILED", "An unknown I/O exception has occurred.", e10);
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            this.promise.reject("E_TAKING_PICTURE_FAILED", "An unknown exception has occurred.", e11);
            e11.printStackTrace();
            return null;
        }
    }

    public final Object resolve(n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }
}
