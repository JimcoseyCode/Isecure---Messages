package expo.modules.medialibrary.next.objects.asset.deleters;

import R8.N;
import android.net.Uri;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.asset.deleters.AssetLegacyDeleter$delete$4$1$1", f = "AssetLegacyDeleter.kt", l = {46}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", "Li7/o;", "Li7/B;", "<anonymous>", "(LR8/N;)Li7/o;"}, k = 3, mv = {2, 1, 0})
final class AssetLegacyDeleter$delete$4$1$1 extends l implements Function2 {
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetLegacyDeleter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetLegacyDeleter$delete$4$1$1(AssetLegacyDeleter assetLegacyDeleter, Uri uri, n7.f fVar) {
        super(2, fVar);
        this.this$0 = assetLegacyDeleter;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        AssetLegacyDeleter$delete$4$1$1 assetLegacyDeleter$delete$4$1$1 = new AssetLegacyDeleter$delete$4$1$1(this.this$0, this.$uri, fVar);
        assetLegacyDeleter$delete$4$1$1.L$0 = obj;
        return assetLegacyDeleter$delete$4$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((AssetLegacyDeleter$delete$4$1$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                AssetLegacyDeleter assetLegacyDeleter = this.this$0;
                Uri uri = this.$uri;
                C2752o.a aVar = C2752o.f28721h;
                this.label = 1;
                if (assetLegacyDeleter.delete(uri, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            objB = C2752o.b(C2735B.f28704a);
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        return C2752o.a(objB);
    }
}
