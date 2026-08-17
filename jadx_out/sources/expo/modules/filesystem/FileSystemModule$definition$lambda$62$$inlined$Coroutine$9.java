package expo.modules.filesystem;

import R8.N;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.filesystem.FilePickerContractResult;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$9", f = "FileSystemModule.kt", l = {271}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"}, k = 3, mv = {2, 1, 0})
public final class FileSystemModule$definition$lambda$62$$inlined$Coroutine$9 extends l implements o {
    final /* synthetic */ C $filePickerLauncher$inlined;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemModule$definition$lambda$62$$inlined$Coroutine$9(n7.f fVar, C c10) {
        super(3, fVar);
        this.$filePickerLauncher$inlined = c10;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        FileSystemModule$definition$lambda$62$$inlined$Coroutine$9 fileSystemModule$definition$lambda$62$$inlined$Coroutine$9 = new FileSystemModule$definition$lambda$62$$inlined$Coroutine$9(fVar, this.$filePickerLauncher$inlined);
        fileSystemModule$definition$lambda$62$$inlined$Coroutine$9.L$0 = objArr;
        return fileSystemModule$definition$lambda$62$$inlined$Coroutine$9.invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws PickerCancelledException {
        AppContextActivityResultLauncher appContextActivityResultLauncher;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            String str = (String) objArr[1];
            Uri uri = (Uri) obj2;
            Object obj3 = this.$filePickerLauncher$inlined.f29371g;
            if (obj3 == null) {
                AbstractC2855l.y("filePickerLauncher");
                appContextActivityResultLauncher = null;
            } else {
                appContextActivityResultLauncher = (AppContextActivityResultLauncher) obj3;
            }
            FilePickerContractOptions filePickerContractOptions = new FilePickerContractOptions(uri, str, PickerType.FILE);
            this.label = 1;
            obj = appContextActivityResultLauncher.launch(filePickerContractOptions, this);
            if (obj == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
        }
        FilePickerContractResult filePickerContractResult = (FilePickerContractResult) obj;
        if (filePickerContractResult instanceof FilePickerContractResult.Success) {
            FileSystemPath path = ((FilePickerContractResult.Success) filePickerContractResult).getPath();
            AbstractC2855l.e(path, "null cannot be cast to non-null type expo.modules.filesystem.FileSystemFile");
            return (FileSystemFile) path;
        }
        if (filePickerContractResult instanceof FilePickerContractResult.Cancelled) {
            throw new PickerCancelledException();
        }
        throw new C2750m();
    }
}
