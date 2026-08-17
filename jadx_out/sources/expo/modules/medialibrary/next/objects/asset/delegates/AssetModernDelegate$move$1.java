package expo.modules.medialibrary.next.objects.asset.delegates;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate", f = "AssetModernDelegate.kt", l = {174, 180}, m = "move-dXLngQ8")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AssetModernDelegate$move$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetModernDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetModernDelegate$move$1(AssetModernDelegate assetModernDelegate, n7.f fVar) {
        super(fVar);
        this.this$0 = assetModernDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= androidx.customview.widget.a.INVALID_ID;
        return this.this$0.mo286movedXLngQ8(null, this);
    }
}
