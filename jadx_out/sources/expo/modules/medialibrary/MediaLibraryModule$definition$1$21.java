package expo.modules.medialibrary;

import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import expo.modules.medialibrary.contracts.DeleteContract;
import expo.modules.medialibrary.contracts.WriteContract;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.MediaLibraryModule$definition$1$21", f = "MediaLibraryModule.kt", l = {275, 277}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Li7/B;", "<anonymous>", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;)V"}, k = 3, mv = {2, 1, 0})
final class MediaLibraryModule$definition$1$21 extends l implements Function2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MediaLibraryModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaLibraryModule$definition$1$21(MediaLibraryModule mediaLibraryModule, n7.f fVar) {
        super(2, fVar);
        this.this$0 = mediaLibraryModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        MediaLibraryModule$definition$1$21 mediaLibraryModule$definition$1$21 = new MediaLibraryModule$definition$1$21(this.this$0, fVar);
        mediaLibraryModule$definition$1$21.L$0 = obj;
        return mediaLibraryModule$definition$1$21;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppContextActivityResultCaller appContextActivityResultCaller, n7.f fVar) {
        return ((MediaLibraryModule$definition$1$21) create(appContextActivityResultCaller, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MediaLibraryModule mediaLibraryModule;
        MediaLibraryModule$definition$1$21 mediaLibraryModule$definition$1$21;
        AppContextActivityResultCaller appContextActivityResultCaller;
        MediaLibraryModule mediaLibraryModule2;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            AppContextActivityResultCaller appContextActivityResultCaller2 = (AppContextActivityResultCaller) this.L$0;
            mediaLibraryModule = this.this$0;
            DeleteContract deleteContract = new DeleteContract(mediaLibraryModule);
            this.L$0 = appContextActivityResultCaller2;
            this.L$1 = mediaLibraryModule;
            this.label = 1;
            mediaLibraryModule$definition$1$21 = this;
            obj = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, deleteContract, null, mediaLibraryModule$definition$1$21, 2, null);
            if (obj != objE) {
                appContextActivityResultCaller = appContextActivityResultCaller2;
            }
            return objE;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaLibraryModule2 = (MediaLibraryModule) this.L$0;
            AbstractC2753p.b(obj);
            mediaLibraryModule2.writeLauncher = (AppContextActivityResultLauncher) obj;
            return C2735B.f28704a;
        }
        mediaLibraryModule = (MediaLibraryModule) this.L$1;
        AppContextActivityResultCaller appContextActivityResultCaller3 = (AppContextActivityResultCaller) this.L$0;
        AbstractC2753p.b(obj);
        mediaLibraryModule$definition$1$21 = this;
        appContextActivityResultCaller = appContextActivityResultCaller3;
        mediaLibraryModule.deleteLauncher = (AppContextActivityResultLauncher) obj;
        MediaLibraryModule mediaLibraryModule3 = mediaLibraryModule$definition$1$21.this$0;
        WriteContract writeContract = new WriteContract(mediaLibraryModule3);
        mediaLibraryModule$definition$1$21.L$0 = mediaLibraryModule3;
        mediaLibraryModule$definition$1$21.L$1 = null;
        mediaLibraryModule$definition$1$21.label = 2;
        Object objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller, writeContract, null, this, 2, null);
        if (objRegisterForActivityResult$default != objE) {
            mediaLibraryModule2 = mediaLibraryModule3;
            obj = objRegisterForActivityResult$default;
            mediaLibraryModule2.writeLauncher = (AppContextActivityResultLauncher) obj;
            return C2735B.f28704a;
        }
        return objE;
    }
}
