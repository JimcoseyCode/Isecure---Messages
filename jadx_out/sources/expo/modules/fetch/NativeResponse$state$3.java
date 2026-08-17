package expo.modules.fetch;

import R8.N;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.fetch.NativeResponse$state$3", f = "NativeResponse.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
final class NativeResponse$state$3 extends l implements Function2 {
    final /* synthetic */ ResponseState $value;
    int label;
    final /* synthetic */ NativeResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeResponse$state$3(NativeResponse nativeResponse, ResponseState responseState, n7.f fVar) {
        super(2, fVar);
        this.this$0 = nativeResponse;
        this.$value = responseState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(ResponseState responseState, Function1 function1) {
        return ((Boolean) function1.invoke(responseState)).booleanValue();
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new NativeResponse$state$3(this.this$0, this.$value, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((NativeResponse$state$3) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3016b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC2753p.b(obj);
        List list = this.this$0.stateChangeOnceListeners;
        final ResponseState responseState = this.$value;
        AbstractC2800q.G(list, new Function1() { // from class: expo.modules.fetch.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(NativeResponse$state$3.invokeSuspend$lambda$0(responseState, (Function1) obj2));
            }
        });
        return C2735B.f28704a;
    }
}
