package expo.modules.securestore;

import R8.N;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.securestore.SecureStoreModule$definition$1$3$1", f = "SecureStoreModule.kt", l = {49}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
final class SecureStoreModule$definition$1$3$1 extends l implements Function2 {
    final /* synthetic */ String $key;
    final /* synthetic */ SecureStoreOptions $options;
    final /* synthetic */ String $value;
    int label;
    final /* synthetic */ SecureStoreModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureStoreModule$definition$1$3$1(SecureStoreModule secureStoreModule, String str, String str2, SecureStoreOptions secureStoreOptions, n7.f fVar) {
        super(2, fVar);
        this.this$0 = secureStoreModule;
        this.$key = str;
        this.$value = str2;
        this.$options = secureStoreOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new SecureStoreModule$definition$1$3$1(this.this$0, this.$key, this.$value, this.$options, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((SecureStoreModule$definition$1$3$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            SecureStoreModule secureStoreModule = this.this$0;
            String str = this.$key;
            String str2 = this.$value;
            SecureStoreOptions secureStoreOptions = this.$options;
            this.label = 1;
            if (secureStoreModule.setItemImpl(str, str2, secureStoreOptions, false, this) == objE) {
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
