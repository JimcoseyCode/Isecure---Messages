package expo.modules.filesystem;

import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.filesystem.FileSystemModule$definition$1$7", f = "FileSystemModule.kt", l = {94}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Li7/B;", "<anonymous>", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;)V"}, k = 3, mv = {2, 1, 0})
final class FileSystemModule$definition$1$7 extends l implements Function2 {
    final /* synthetic */ C $filePickerLauncher;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FileSystemModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystemModule$definition$1$7(C c10, FileSystemModule fileSystemModule, n7.f fVar) {
        super(2, fVar);
        this.$filePickerLauncher = c10;
        this.this$0 = fileSystemModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        FileSystemModule$definition$1$7 fileSystemModule$definition$1$7 = new FileSystemModule$definition$1$7(this.$filePickerLauncher, this.this$0, fVar);
        fileSystemModule$definition$1$7.L$0 = obj;
        return fileSystemModule$definition$1$7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppContextActivityResultCaller appContextActivityResultCaller, n7.f fVar) {
        return ((FileSystemModule$definition$1$7) create(appContextActivityResultCaller, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C c10;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            AppContextActivityResultCaller appContextActivityResultCaller = (AppContextActivityResultCaller) this.L$0;
            C c11 = this.$filePickerLauncher;
            FilePickerContract filePickerContract = new FilePickerContract(this.this$0);
            this.L$0 = c11;
            this.label = 1;
            Object objRegisterForActivityResult$default = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller, filePickerContract, null, this, 2, null);
            if (objRegisterForActivityResult$default == objE) {
                return objE;
            }
            c10 = c11;
            obj = objRegisterForActivityResult$default;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10 = (C) this.L$0;
            AbstractC2753p.b(obj);
        }
        c10.f29371g = obj;
        return C2735B.f28704a;
    }
}
