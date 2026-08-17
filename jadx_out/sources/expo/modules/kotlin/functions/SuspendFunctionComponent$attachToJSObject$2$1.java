package expo.modules.kotlin.functions;

import R8.N;
import R8.O;
import expo.modules.core.errors.CodedException;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.PromiseImpl;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.kotlin.functions.SuspendFunctionComponent$attachToJSObject$2$1", f = "SuspendFunctionComponent.kt", l = {47}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
final class SuspendFunctionComponent$attachToJSObject$2$1 extends l implements Function2 {
    final /* synthetic */ AppContext $appContext;
    final /* synthetic */ Object[] $args;
    final /* synthetic */ String $moduleName;
    final /* synthetic */ PromiseImpl $promiseImpl;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SuspendFunctionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendFunctionComponent$attachToJSObject$2$1(PromiseImpl promiseImpl, SuspendFunctionComponent suspendFunctionComponent, String str, Object[] objArr, AppContext appContext, n7.f fVar) {
        super(2, fVar);
        this.$promiseImpl = promiseImpl;
        this.this$0 = suspendFunctionComponent;
        this.$moduleName = str;
        this.$args = objArr;
        this.$appContext = appContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        SuspendFunctionComponent$attachToJSObject$2$1 suspendFunctionComponent$attachToJSObject$2$1 = new SuspendFunctionComponent$attachToJSObject$2$1(this.$promiseImpl, this.this$0, this.$moduleName, this.$args, this.$appContext, fVar);
        suspendFunctionComponent$attachToJSObject$2$1.L$0 = obj;
        return suspendFunctionComponent$attachToJSObject$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((SuspendFunctionComponent$attachToJSObject$2$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:25:0x006d, B:27:0x0071, B:29:0x0075, B:34:0x009e, B:35:0x00a7, B:32:0x0095, B:33:0x009b, B:13:0x0033), top: B:52:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:25:0x006d, B:27:0x0071, B:29:0x0075, B:34:0x009e, B:35:0x00a7, B:32:0x0095, B:33:0x009b, B:13:0x0033), top: B:52:0x0033 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SuspendFunctionComponent suspendFunctionComponent;
        CodedException codedException;
        String str;
        N n10;
        PromiseImpl promiseImpl;
        expo.modules.kotlin.exception.CodedException unexpectedException;
        expo.modules.kotlin.exception.CodedException codedException2;
        expo.modules.kotlin.exception.CodedException unexpectedException2;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            N n11 = (N) this.L$0;
            try {
                suspendFunctionComponent = this.this$0;
                String str2 = this.$moduleName;
                Object[] objArr = this.$args;
                AppContext appContext = this.$appContext;
                PromiseImpl promiseImpl2 = this.$promiseImpl;
                try {
                    o oVar = suspendFunctionComponent.body;
                    Object[] objArrConvertArgs$default = AnyFunction.convertArgs$default(suspendFunctionComponent, objArr, appContext, false, 4, null);
                    this.L$0 = suspendFunctionComponent;
                    this.L$1 = str2;
                    this.L$2 = promiseImpl2;
                    this.L$3 = n11;
                    this.label = 1;
                    Object objInvoke = oVar.invoke(n11, objArrConvertArgs$default, this);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    n10 = n11;
                    obj = objInvoke;
                    str = str2;
                    promiseImpl = promiseImpl2;
                } catch (Throwable th) {
                    codedException = th;
                    str = str2;
                    if (!(codedException instanceof expo.modules.kotlin.exception.CodedException)) {
                    }
                    throw new FunctionCallException(suspendFunctionComponent.getName(), str, unexpectedException2);
                }
            } catch (Throwable th2) {
                if (this.$promiseImpl.getWasSettled()) {
                    throw th2;
                }
                PromiseImpl promiseImpl3 = this.$promiseImpl;
                if (th2 instanceof expo.modules.kotlin.exception.CodedException) {
                    codedException2 = (expo.modules.kotlin.exception.CodedException) th2;
                } else {
                    if (th2 instanceof CodedException) {
                        CodedException codedException3 = (CodedException) th2;
                        String code = codedException3.getCode();
                        AbstractC2855l.f(code, "getCode(...)");
                        unexpectedException = new expo.modules.kotlin.exception.CodedException(code, codedException3.getMessage(), codedException3.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th2);
                    }
                    codedException2 = unexpectedException;
                }
                promiseImpl3.reject(codedException2);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n10 = (N) this.L$3;
            promiseImpl = (PromiseImpl) this.L$2;
            str = (String) this.L$1;
            suspendFunctionComponent = (SuspendFunctionComponent) this.L$0;
            try {
                AbstractC2753p.b(obj);
            } catch (Throwable th3) {
                codedException = th3;
                if (!(codedException instanceof expo.modules.kotlin.exception.CodedException)) {
                    unexpectedException2 = (expo.modules.kotlin.exception.CodedException) codedException;
                } else if (codedException instanceof CodedException) {
                    String code2 = codedException.getCode();
                    AbstractC2855l.f(code2, "getCode(...)");
                    unexpectedException2 = new expo.modules.kotlin.exception.CodedException(code2, codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException2 = new UnexpectedException(codedException);
                }
                throw new FunctionCallException(suspendFunctionComponent.getName(), str, unexpectedException2);
            }
        }
        if (O.e(n10)) {
            promiseImpl.resolve(obj);
        }
        C2735B c2735b = C2735B.f28704a;
        return C2735B.f28704a;
    }
}
