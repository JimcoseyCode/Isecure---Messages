package expo.modules.image;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;
import y0.AbstractC3607b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.image.ExpoImageModule$definition$1$generatePlaceholder$2", f = "ExpoImageModule.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
final class ExpoImageModule$definition$1$generatePlaceholder$2 extends l implements Function2 {
    final /* synthetic */ Function1 $encoder;
    final /* synthetic */ Image $image;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpoImageModule$definition$1$generatePlaceholder$2(Function1 function1, Image image, n7.f fVar) {
        super(2, fVar);
        this.$encoder = function1;
        this.$image = image;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ExpoImageModule$definition$1$generatePlaceholder$2(this.$encoder, this.$image, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ExpoImageModule$definition$1$generatePlaceholder$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3016b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC2753p.b(obj);
        return this.$encoder.invoke(AbstractC3607b.b(this.$image.getRef(), 0, 0, null, 7, null));
    }
}
