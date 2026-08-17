package expo.modules.image;

import R8.N;
import android.content.Context;
import android.graphics.Color;
import com.bumptech.glide.j;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.image.ImageLoadTask$load$drawable$1", f = "ImageLoadTask.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "<anonymous>", "(LR8/N;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 1, 0})
final class ImageLoadTask$load$drawable$1 extends l implements Function2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ Object $model;
    int label;
    final /* synthetic */ ImageLoadTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageLoadTask$load$drawable$1(Context context, Object obj, ImageLoadTask imageLoadTask, n7.f fVar) {
        super(2, fVar);
        this.$context = context;
        this.$model = obj;
        this.this$0 = imageLoadTask;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ImageLoadTask$load$drawable$1(this.$context, this.$model, this.this$0, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ImageLoadTask$load$drawable$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3016b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC2753p.b(obj);
        M1.a aVarC = com.bumptech.glide.b.v(this.$context).c().x0(this.$model).c();
        AbstractC2855l.f(aVarC, "centerInside(...)");
        j jVarA = (j) aVarC;
        Color tintColor = this.this$0.options.getTintColor();
        if (tintColor != null) {
            jVarA = jVarA.a(new M1.f().W(CustomOptions.INSTANCE.getTintColor(), kotlin.coroutines.jvm.internal.b.c(tintColor.toArgb())));
            AbstractC2855l.f(jVarA, "apply(...)");
        }
        return jVarA.C0(this.this$0.options.getMaxWidth(), this.this$0.options.getMaxHeight()).get();
    }
}
