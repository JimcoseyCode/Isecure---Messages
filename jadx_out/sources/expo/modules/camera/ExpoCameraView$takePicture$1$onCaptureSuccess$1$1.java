package expo.modules.camera;

import R8.N;
import android.os.Bundle;
import expo.modules.camera.records.CameraType;
import expo.modules.camera.tasks.PictureSavedDelegate;
import expo.modules.camera.tasks.ResolveTakenPicture;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.runtime.Runtime;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.camera.ExpoCameraView$takePicture$1$onCaptureSuccess$1$1", f = "ExpoCameraView.kt", l = {313}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
final class ExpoCameraView$takePicture$1$onCaptureSuccess$1$1 extends kotlin.coroutines.jvm.internal.l implements Function2 {
    final /* synthetic */ byte[] $data;
    final /* synthetic */ File $it;
    final /* synthetic */ PictureOptions $options;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Runtime $runtimeContext;
    int label;
    final /* synthetic */ ExpoCameraView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpoCameraView$takePicture$1$onCaptureSuccess$1$1(ExpoCameraView expoCameraView, byte[] bArr, Promise promise, PictureOptions pictureOptions, Runtime runtime, File file, n7.f fVar) {
        super(2, fVar);
        this.this$0 = expoCameraView;
        this.$data = bArr;
        this.$promise = promise;
        this.$options = pictureOptions;
        this.$runtimeContext = runtime;
        this.$it = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(PictureOptions pictureOptions, ExpoCameraView expoCameraView, Bundle bundle) {
        if (pictureOptions.getPictureRef()) {
            return;
        }
        expoCameraView.onPictureSaved(bundle);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ExpoCameraView$takePicture$1$onCaptureSuccess$1$1(this.this$0, this.$data, this.$promise, this.$options, this.$runtimeContext, this.$it, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ExpoCameraView$takePicture$1$onCaptureSuccess$1$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            boolean z10 = this.this$0.getMirror() && this.this$0.getLensFacing() == CameraType.FRONT;
            byte[] bArr = this.$data;
            Promise promise = this.$promise;
            final PictureOptions pictureOptions = this.$options;
            Runtime runtime = this.$runtimeContext;
            File file = this.$it;
            final ExpoCameraView expoCameraView = this.this$0;
            ResolveTakenPicture resolveTakenPicture = new ResolveTakenPicture(bArr, promise, pictureOptions, z10, runtime, file, new PictureSavedDelegate() { // from class: expo.modules.camera.l
                @Override // expo.modules.camera.tasks.PictureSavedDelegate
                public final void onPictureSaved(Bundle bundle) {
                    ExpoCameraView$takePicture$1$onCaptureSuccess$1$1.invokeSuspend$lambda$0(pictureOptions, expoCameraView, bundle);
                }
            });
            this.label = 1;
            if (resolveTakenPicture.resolve(this) == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
        }
        return C2735B.f28704a;
    }
}
