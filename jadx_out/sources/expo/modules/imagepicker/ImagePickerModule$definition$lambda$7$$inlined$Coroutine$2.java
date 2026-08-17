package expo.modules.imagepicker;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.imagepicker.contracts.CameraContractOptions;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2", f = "ImagePickerModule.kt", l = {272, 280}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 1, 0})
public final class ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2 extends l implements o {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ImagePickerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2(n7.f fVar, ImagePickerModule imagePickerModule) {
        super(3, fVar);
        this.this$0 = imagePickerModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2 imagePickerModule$definition$lambda$7$$inlined$Coroutine$2 = new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2(fVar, this.this$0);
        imagePickerModule$definition$lambda$7$$inlined$Coroutine$2.L$0 = objArr;
        return imagePickerModule$definition$lambda$7$$inlined$Coroutine$2.invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ImagePickerOptions imagePickerOptions;
        File fileCreateOutputFile;
        File file;
        Throwable th;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                imagePickerOptions = (ImagePickerOptions) ((Object[]) this.L$0)[0];
                this.this$0.ensureTargetActivityIsAvailable(imagePickerOptions);
                ImagePickerModule imagePickerModule = this.this$0;
                this.L$0 = imagePickerOptions;
                this.label = 1;
                if (imagePickerModule.ensureCameraPermissionsAreGranted(this) != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = (File) this.L$0;
                try {
                    AbstractC2753p.b(obj);
                    file.delete();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    file.delete();
                    throw th;
                }
            }
            imagePickerOptions = (ImagePickerOptions) this.L$0;
            AbstractC2753p.b(obj);
            String string = ImagePickerUtilsKt.toContentUri(fileCreateOutputFile, this.this$0.getContext()).toString();
            AbstractC2855l.f(string, "toString(...)");
            CameraContractOptions cameraContractOptions = imagePickerOptions.toCameraContractOptions(string);
            ImagePickerModule imagePickerModule2 = this.this$0;
            ImagePickerModule$definition$1$5$1 imagePickerModule$definition$1$5$1 = new ImagePickerModule$definition$1$5$1(imagePickerModule2, cameraContractOptions, null);
            this.L$0 = fileCreateOutputFile;
            this.label = 2;
            Object objLaunchContract = imagePickerModule2.launchContract(imagePickerModule$definition$1$5$1, imagePickerOptions, this);
            if (objLaunchContract != objE) {
                file = fileCreateOutputFile;
                obj = objLaunchContract;
                file.delete();
                return obj;
            }
            return objE;
        } catch (Throwable th3) {
            file = fileCreateOutputFile;
            th = th3;
            file.delete();
            throw th;
        }
        fileCreateOutputFile = ImagePickerUtilsKt.createOutputFile(this.this$0.getCacheDirectory(), imagePickerOptions.getNativeMediaTypes().toFileExtension());
    }
}
