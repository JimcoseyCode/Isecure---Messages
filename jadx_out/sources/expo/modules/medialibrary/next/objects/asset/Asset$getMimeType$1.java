package expo.modules.medialibrary.next.objects.asset;

import androidx.customview.widget.a;
import expo.modules.medialibrary.next.objects.wrappers.MimeType;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.asset.Asset", f = "Asset.kt", l = {50}, m = "getMimeType-dctPOJs")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Asset$getMimeType$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Asset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Asset$getMimeType$1(Asset asset, n7.f fVar) {
        super(fVar);
        this.this$0 = asset;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= a.INVALID_ID;
        Object objM282getMimeTypedctPOJs = this.this$0.m282getMimeTypedctPOJs(this);
        return objM282getMimeTypedctPOJs == AbstractC3016b.e() ? objM282getMimeTypedctPOJs : MimeType.m296boximpl((String) objM282getMimeTypedctPOJs);
    }
}
