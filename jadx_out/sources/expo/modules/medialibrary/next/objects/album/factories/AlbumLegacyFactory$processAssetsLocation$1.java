package expo.modules.medialibrary.next.objects.album.factories;

import androidx.customview.widget.a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.next.objects.album.factories.AlbumLegacyFactory", f = "AlbumLegacyFactory.kt", l = {72, 74}, m = "processAssetsLocation-KTsBHyQ")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AlbumLegacyFactory$processAssetsLocation$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AlbumLegacyFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlbumLegacyFactory$processAssetsLocation$1(AlbumLegacyFactory albumLegacyFactory, n7.f fVar) {
        super(fVar);
        this.this$0 = albumLegacyFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= a.INVALID_ID;
        return this.this$0.m278processAssetsLocationKTsBHyQ(null, null, false, this);
    }
}
