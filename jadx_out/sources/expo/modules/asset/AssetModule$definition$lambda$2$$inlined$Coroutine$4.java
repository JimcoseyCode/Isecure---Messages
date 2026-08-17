package expo.modules.asset;

import P8.q;
import R8.N;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import java.net.URI;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.asset.AssetModule$definition$lambda$2$$inlined$Coroutine$4", f = "AssetModule.kt", l = {281, 288}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7"}, k = 3, mv = {2, 1, 0})
public final class AssetModule$definition$lambda$2$$inlined$Coroutine$4 extends l implements o {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetModule$definition$lambda$2$$inlined$Coroutine$4(n7.f fVar, AssetModule assetModule) {
        super(3, fVar);
        this.this$0 = assetModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        AssetModule$definition$lambda$2$$inlined$Coroutine$4 assetModule$definition$lambda$2$$inlined$Coroutine$4 = new AssetModule$definition$lambda$2$$inlined$Coroutine$4(fVar, this.this$0);
        assetModule$definition$lambda$2$$inlined$Coroutine$4.L$0 = objArr;
        return assetModule$definition$lambda$2$$inlined$Coroutine$4.invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws UnableToDownloadAssetException, Exceptions.AppContextLost {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC2753p.b(obj);
                return obj;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return obj;
        }
        AbstractC2753p.b(obj);
        Object[] objArr = (Object[]) this.L$0;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) obj3;
        URI uri = (URI) obj2;
        if (AbstractC2855l.b(uri.getScheme(), "file")) {
            String string = uri.toString();
            AbstractC2855l.f(string, "toString(...)");
            if (!q.K(string, ResourceAssetKt.ANDROID_EMBEDDED_URL_BASE_RESOURCE, false, 2, null)) {
                return uri;
            }
        }
        String mD5HashOfFilePath = str2 == null ? this.this$0.getMD5HashOfFilePath(uri) : str2;
        File file = new File(this.this$0.getAppContext().getCacheDirectory() + "/ExponentAsset-" + mD5HashOfFilePath + "." + str);
        if (!file.exists()) {
            AssetModule assetModule = this.this$0;
            AppContext appContext = assetModule.getAppContext();
            this.label = 1;
            Object objDownloadAsset = assetModule.downloadAsset(appContext, uri, file, this);
            if (objDownloadAsset != objE) {
                return objDownloadAsset;
            }
        } else {
            if (str2 == null || AbstractC2855l.b(str2, FileUtilsKt.getMD5HashOfFileContent(file))) {
                return Uri.fromFile(file);
            }
            AssetModule assetModule2 = this.this$0;
            AppContext appContext2 = assetModule2.getAppContext();
            this.label = 2;
            Object objDownloadAsset2 = assetModule2.downloadAsset(appContext2, uri, file, this);
            if (objDownloadAsset2 != objE) {
                return objDownloadAsset2;
            }
        }
        return objE;
    }
}
