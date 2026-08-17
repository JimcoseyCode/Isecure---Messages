package expo.modules.kotlin;

import R8.N;
import expo.modules.kotlin.activityresult.DefaultAppContextActivityResultCaller;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.kotlin.ModuleHolder$registerContracts$1$1", f = "ModuleHolder.kt", l = {129}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
final class ModuleHolder$registerContracts$1$1 extends l implements Function2 {
    final /* synthetic */ Function2 $it;
    int label;
    final /* synthetic */ ModuleHolder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModuleHolder$registerContracts$1$1(Function2 function2, ModuleHolder<T> moduleHolder, n7.f fVar) {
        super(2, fVar);
        this.$it = function2;
        this.this$0 = moduleHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ModuleHolder$registerContracts$1$1(this.$it, this.this$0, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ModuleHolder$registerContracts$1$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            Function2 function2 = this.$it;
            DefaultAppContextActivityResultCaller appContextActivityResultCaller = this.this$0.getModule().getAppContext().getAppContextActivityResultCaller();
            this.label = 1;
            if (function2.invoke(appContextActivityResultCaller, this) == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
        }
        return C2735B.f28704a;
    }
}
