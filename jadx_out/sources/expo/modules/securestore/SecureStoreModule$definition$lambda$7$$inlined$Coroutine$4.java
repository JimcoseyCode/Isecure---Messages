package expo.modules.securestore;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.securestore.SecureStoreModule$definition$lambda$7$$inlined$Coroutine$4", f = "SecureStoreModule.kt", l = {272}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7"}, k = 3, mv = {2, 1, 0})
public final class SecureStoreModule$definition$lambda$7$$inlined$Coroutine$4 extends l implements o {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SecureStoreModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureStoreModule$definition$lambda$7$$inlined$Coroutine$4(n7.f fVar, SecureStoreModule secureStoreModule) {
        super(3, fVar);
        this.this$0 = secureStoreModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        SecureStoreModule$definition$lambda$7$$inlined$Coroutine$4 secureStoreModule$definition$lambda$7$$inlined$Coroutine$4 = new SecureStoreModule$definition$lambda$7$$inlined$Coroutine$4(fVar, this.this$0);
        secureStoreModule$definition$lambda$7$$inlined$Coroutine$4.L$0 = objArr;
        return secureStoreModule$definition$lambda$7$$inlined$Coroutine$4.invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws NullKeyException {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[2];
            String str = (String) obj3;
            String str2 = (String) obj2;
            if (str == null) {
                throw new NullKeyException();
            }
            SecureStoreModule secureStoreModule = this.this$0;
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
