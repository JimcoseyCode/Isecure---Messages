package expo.modules.imagepicker;

import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", l = {OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION, 29}, m = "readExtras$expo_image_picker_release")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class MediaHandler$readExtras$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaHandler$readExtras$1(MediaHandler mediaHandler, n7.f fVar) {
        super(fVar);
        this.this$0 = mediaHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= androidx.customview.widget.a.INVALID_ID;
        return this.this$0.readExtras$expo_image_picker_release(null, null, this);
    }
}
