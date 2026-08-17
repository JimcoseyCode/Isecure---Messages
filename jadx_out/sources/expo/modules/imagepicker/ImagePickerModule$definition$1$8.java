package expo.modules.imagepicker;

import expo.modules.imagepicker.contracts.CameraContract;
import expo.modules.imagepicker.contracts.CameraContractOptions;
import expo.modules.imagepicker.contracts.CropImageContract;
import expo.modules.imagepicker.contracts.CropImageContractOptions;
import expo.modules.imagepicker.contracts.ImageLibraryContract;
import expo.modules.imagepicker.contracts.ImageLibraryContractOptions;
import expo.modules.imagepicker.contracts.ImagePickerContractResult;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.ImagePickerModule$definition$1$8", f = "ImagePickerModule.kt", l = {101, 105, 109}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Li7/B;", "<anonymous>", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;)V"}, k = 3, mv = {2, 1, 0})
final class ImagePickerModule$definition$1$8 extends l implements Function2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImagePickerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImagePickerModule$definition$1$8(ImagePickerModule imagePickerModule, n7.f fVar) {
        super(2, fVar);
        this.this$0 = imagePickerModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        ImagePickerModule$definition$1$8 imagePickerModule$definition$1$8 = new ImagePickerModule$definition$1$8(this.this$0, fVar);
        imagePickerModule$definition$1$8.L$0 = obj;
        return imagePickerModule$definition$1$8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppContextActivityResultCaller appContextActivityResultCaller, n7.f fVar) {
        return ((ImagePickerModule$definition$1$8) create(appContextActivityResultCaller, fVar)).invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ImagePickerModule imagePickerModule;
        AppContextActivityResultCaller appContextActivityResultCaller;
        ImagePickerModule imagePickerModule2;
        AppContextActivityResultCaller appContextActivityResultCaller2;
        Object objRegisterForActivityResult;
        ImagePickerModule imagePickerModule3;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            AppContextActivityResultCaller appContextActivityResultCaller3 = (AppContextActivityResultCaller) this.L$0;
            imagePickerModule = this.this$0;
            CameraContract cameraContract = new CameraContract(imagePickerModule);
            final ImagePickerModule imagePickerModule4 = this.this$0;
            AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback = new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.1
                @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                public final void onActivityResult(CameraContractOptions input, ImagePickerContractResult result) {
                    AbstractC2855l.g(input, "input");
                    AbstractC2855l.g(result, "result");
                    imagePickerModule4.handleResultUponActivityDestruction(result, input.getOptions());
                }
            };
            this.L$0 = appContextActivityResultCaller3;
            this.L$1 = imagePickerModule;
            this.label = 1;
            Object objRegisterForActivityResult2 = appContextActivityResultCaller3.registerForActivityResult(cameraContract, appContextActivityResultFallbackCallback, this);
            if (objRegisterForActivityResult2 != objE) {
                appContextActivityResultCaller = appContextActivityResultCaller3;
                obj = objRegisterForActivityResult2;
            }
            return objE;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                imagePickerModule3 = (ImagePickerModule) this.L$0;
                AbstractC2753p.b(obj);
                imagePickerModule3.cropImageLauncher = (AppContextActivityResultLauncher) obj;
                return C2735B.f28704a;
            }
            imagePickerModule2 = (ImagePickerModule) this.L$1;
            appContextActivityResultCaller2 = (AppContextActivityResultCaller) this.L$0;
            AbstractC2753p.b(obj);
            imagePickerModule2.imageLibraryLauncher = (AppContextActivityResultLauncher) obj;
            ImagePickerModule imagePickerModule5 = this.this$0;
            CropImageContract cropImageContract = new CropImageContract(imagePickerModule5);
            final ImagePickerModule imagePickerModule6 = this.this$0;
            AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback2 = new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.3
                @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                public final void onActivityResult(CropImageContractOptions input, ImagePickerContractResult result) {
                    AbstractC2855l.g(input, "input");
                    AbstractC2855l.g(result, "result");
                    imagePickerModule6.handleResultUponActivityDestruction(result, input.getOptions());
                }
            };
            this.L$0 = imagePickerModule5;
            this.L$1 = null;
            this.label = 3;
            objRegisterForActivityResult = appContextActivityResultCaller2.registerForActivityResult(cropImageContract, appContextActivityResultFallbackCallback2, this);
            if (objRegisterForActivityResult != objE) {
                imagePickerModule3 = imagePickerModule5;
                obj = objRegisterForActivityResult;
                imagePickerModule3.cropImageLauncher = (AppContextActivityResultLauncher) obj;
                return C2735B.f28704a;
            }
            return objE;
        }
        imagePickerModule = (ImagePickerModule) this.L$1;
        appContextActivityResultCaller = (AppContextActivityResultCaller) this.L$0;
        AbstractC2753p.b(obj);
        imagePickerModule.cameraLauncher = (AppContextActivityResultLauncher) obj;
        imagePickerModule2 = this.this$0;
        ImageLibraryContract imageLibraryContract = new ImageLibraryContract(imagePickerModule2);
        final ImagePickerModule imagePickerModule7 = this.this$0;
        AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback3 = new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.2
            @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
            public final void onActivityResult(ImageLibraryContractOptions input, ImagePickerContractResult result) {
                AbstractC2855l.g(input, "input");
                AbstractC2855l.g(result, "result");
                imagePickerModule7.handleResultUponActivityDestruction(result, input.getOptions());
            }
        };
        this.L$0 = appContextActivityResultCaller;
        this.L$1 = imagePickerModule2;
        this.label = 2;
        obj = appContextActivityResultCaller.registerForActivityResult(imageLibraryContract, appContextActivityResultFallbackCallback3, this);
        if (obj != objE) {
            appContextActivityResultCaller2 = appContextActivityResultCaller;
            imagePickerModule2.imageLibraryLauncher = (AppContextActivityResultLauncher) obj;
            ImagePickerModule imagePickerModule52 = this.this$0;
            CropImageContract cropImageContract2 = new CropImageContract(imagePickerModule52);
            final ImagePickerModule imagePickerModule62 = this.this$0;
            AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback22 = new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.3
                @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                public final void onActivityResult(CropImageContractOptions input, ImagePickerContractResult result) {
                    AbstractC2855l.g(input, "input");
                    AbstractC2855l.g(result, "result");
                    imagePickerModule62.handleResultUponActivityDestruction(result, input.getOptions());
                }
            };
            this.L$0 = imagePickerModule52;
            this.L$1 = null;
            this.label = 3;
            objRegisterForActivityResult = appContextActivityResultCaller2.registerForActivityResult(cropImageContract2, appContextActivityResultFallbackCallback22, this);
            if (objRegisterForActivityResult != objE) {
            }
        }
        return objE;
    }
}
