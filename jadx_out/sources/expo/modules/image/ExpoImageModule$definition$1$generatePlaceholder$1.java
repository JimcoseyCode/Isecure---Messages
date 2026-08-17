package expo.modules.image;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.image.ExpoImageModule", f = "ExpoImageModule.kt", l = {IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 131}, m = "definition$lambda$30$generatePlaceholder")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ExpoImageModule$definition$1$generatePlaceholder$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ExpoImageModule$definition$1$generatePlaceholder$1(n7.f fVar) {
        super(fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= androidx.customview.widget.a.INVALID_ID;
        return ExpoImageModule.definition$lambda$30$generatePlaceholder(null, null, null, this);
    }
}
