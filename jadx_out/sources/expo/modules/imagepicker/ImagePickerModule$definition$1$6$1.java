package expo.modules.imagepicker;

import expo.modules.imagepicker.contracts.ImageLibraryContractOptions;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.ImagePickerModule$definition$1$6$1", f = "ImagePickerModule.kt", l = {87}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class ImagePickerModule$definition$1$6$1 extends l implements Function1 {
    final /* synthetic */ ImageLibraryContractOptions $contractOptions;
    int label;
    final /* synthetic */ ImagePickerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImagePickerModule$definition$1$6$1(ImagePickerModule imagePickerModule, ImageLibraryContractOptions imageLibraryContractOptions, n7.f fVar) {
        super(1, fVar);
        this.this$0 = imagePickerModule;
        this.$contractOptions = imageLibraryContractOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(n7.f fVar) {
        return new ImagePickerModule$definition$1$6$1(this.this$0, this.$contractOptions, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return obj;
        }
        AbstractC2753p.b(obj);
        AppContextActivityResultLauncher appContextActivityResultLauncher = this.this$0.imageLibraryLauncher;
        if (appContextActivityResultLauncher == null) {
            AbstractC2855l.y("imageLibraryLauncher");
            appContextActivityResultLauncher = null;
        }
        ImageLibraryContractOptions imageLibraryContractOptions = this.$contractOptions;
        this.label = 1;
        Object objLaunch = appContextActivityResultLauncher.launch(imageLibraryContractOptions, this);
        return objLaunch == objE ? objE : objLaunch;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(n7.f fVar) {
        return ((ImagePickerModule$definition$1$6$1) create(fVar)).invokeSuspend(C2735B.f28704a);
    }
}
