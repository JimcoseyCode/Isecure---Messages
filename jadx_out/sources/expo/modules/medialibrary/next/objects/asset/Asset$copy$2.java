package expo.modules.medialibrary.next.objects.asset;

import R8.N;
import expo.modules.medialibrary.next.objects.asset.delegates.AssetDelegate;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.asset.Asset$copy$2", f = "Asset.kt", l = {63}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "<anonymous>", "(LR8/N;)Lexpo/modules/medialibrary/next/objects/asset/Asset;"}, k = 3, mv = {2, 1, 0})
final class Asset$copy$2 extends l implements Function2 {
    final /* synthetic */ String $relativePath;
    int label;
    final /* synthetic */ Asset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Asset$copy$2(Asset asset, String str, n7.f fVar) {
        super(2, fVar);
        this.this$0 = asset;
        this.$relativePath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new Asset$copy$2(this.this$0, this.$relativePath, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((Asset$copy$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
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
        AssetDelegate assetDelegate = this.this$0.getAssetDelegate();
        String str = this.$relativePath;
        this.label = 1;
        Object objMo284copydXLngQ8 = assetDelegate.mo284copydXLngQ8(str, this);
        return objMo284copydXLngQ8 == objE ? objE : objMo284copydXLngQ8;
    }
}
