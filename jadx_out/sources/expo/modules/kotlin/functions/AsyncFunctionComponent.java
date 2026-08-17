package expo.modules.kotlin.functions;

import R8.AbstractC1417k;
import R8.N;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.AnyType;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2750m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0016\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH ¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lkotlin/Function0;", "Li7/B;", "block", "dispatchOnQueue", "(Lexpo/modules/kotlin/AppContext;Lw7/a;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "callUserImplementation$expo_modules_core_release", "([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;Lexpo/modules/kotlin/AppContext;)V", "callUserImplementation", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "moduleName", "attachToJSObject", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AsyncFunctionComponent extends BaseAsyncFunctionComponent {

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$1", f = "AsyncFunctionComponent.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ InterfaceC3487a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3487a interfaceC3487a, n7.f fVar) {
            super(2, fVar);
            this.$block = interfaceC3487a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass1(this.$block, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            this.$block.invoke();
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$3", f = "AsyncFunctionComponent.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass3 extends l implements Function2 {
        final /* synthetic */ InterfaceC3487a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InterfaceC3487a interfaceC3487a, n7.f fVar) {
            super(2, fVar);
            this.$block = interfaceC3487a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass3(this.$block, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass3) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            this.$block.invoke();
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.functions.AsyncFunctionComponent$dispatchOnQueue$4", f = "AsyncFunctionComponent.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass4 extends l implements Function2 {
        final /* synthetic */ InterfaceC3487a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(InterfaceC3487a interfaceC3487a, n7.f fVar) {
            super(2, fVar);
            this.$block = interfaceC3487a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass4(this.$block, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass4) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            this.$block.invoke();
            return C2735B.f28704a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFunctionComponent(String name, AnyType[] desiredArgsTypes) {
        super(name, desiredArgsTypes);
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(desiredArgsTypes, "desiredArgsTypes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachToJSObject$lambda$4(WeakReference weakReference, final String str, final AsyncFunctionComponent asyncFunctionComponent, final AppContext appContext, final Object[] args, final PromiseImpl promiseImpl) {
        AbstractC2855l.g(args, "args");
        AbstractC2855l.g(promiseImpl, "promiseImpl");
        asyncFunctionComponent.dispatchOnQueue(appContext, new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AsyncFunctionComponent.attachToJSObject$lambda$4$lambda$3(promiseImpl, asyncFunctionComponent, str, args, appContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B attachToJSObject$lambda$4$lambda$3(PromiseImpl promiseImpl, AsyncFunctionComponent asyncFunctionComponent, String str, Object[] objArr, AppContext appContext) {
        CodedException unexpectedException;
        CodedException codedException;
        CodedException unexpectedException2;
        try {
            asyncFunctionComponent.callUserImplementation$expo_modules_core_release(objArr, promiseImpl, appContext);
            C2735B c2735b = C2735B.f28704a;
            return C2735B.f28704a;
        } catch (Throwable th) {
            try {
                if (th instanceof CodedException) {
                    unexpectedException2 = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    String code = ((expo.modules.core.errors.CodedException) th).getCode();
                    AbstractC2855l.f(code, "getCode(...)");
                    unexpectedException2 = new CodedException(code, ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause());
                } else {
                    unexpectedException2 = new UnexpectedException(th);
                }
                throw new FunctionCallException(asyncFunctionComponent.getName(), str, unexpectedException2);
            } catch (Throwable th2) {
                if (promiseImpl.getWasSettled()) {
                    throw th2;
                }
                if (th2 instanceof CodedException) {
                    codedException = (CodedException) th2;
                } else {
                    if (th2 instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th2;
                        String code2 = codedException2.getCode();
                        AbstractC2855l.f(code2, "getCode(...)");
                        unexpectedException = new CodedException(code2, codedException2.getMessage(), codedException2.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th2);
                    }
                    codedException = unexpectedException;
                }
                promiseImpl.reject(codedException);
            }
        }
    }

    private final void dispatchOnQueue(AppContext appContext, InterfaceC3487a block) {
        FunctionQueue queue = getQueue();
        if (queue == Queues.DEFAULT) {
            AbstractC1417k.d(appContext.getModulesQueue(), null, null, new AnonymousClass1(block, null), 3, null);
        } else if (queue == Queues.MAIN) {
            AbstractC1417k.d(appContext.getMainQueue(), null, null, new AnonymousClass3(block, null), 3, null);
        } else {
            if (!(queue instanceof CustomQueue)) {
                throw new C2750m();
            }
            AbstractC1417k.d(((CustomQueue) queue).getScope(), null, null, new AnonymousClass4(block, null), 3, null);
        }
    }

    @Override // expo.modules.kotlin.functions.AnyFunction
    public void attachToJSObject(final AppContext appContext, JSDecoratorsBridgingObject jsObject, final String moduleName) {
        AbstractC2855l.g(appContext, "appContext");
        AbstractC2855l.g(jsObject, "jsObject");
        AbstractC2855l.g(moduleName, "moduleName");
        final WeakReference weakReferenceWeak = UtilsKt.weak(appContext);
        String name = getName();
        boolean takesOwner$expo_modules_core_release = getTakesOwner$expo_modules_core_release();
        boolean isEnumerable = getIsEnumerable();
        AnyType[] desiredArgsTypes = getDesiredArgsTypes();
        ArrayList arrayList = new ArrayList(desiredArgsTypes.length);
        for (AnyType anyType : desiredArgsTypes) {
            arrayList.add(anyType.getCppRequiredTypes());
        }
        jsObject.registerAsyncFunction(name, takesOwner$expo_modules_core_release, isEnumerable, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody() { // from class: expo.modules.kotlin.functions.a
            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                AsyncFunctionComponent.attachToJSObject$lambda$4(weakReferenceWeak, moduleName, this, appContext, objArr, promiseImpl);
            }
        });
    }

    public abstract void callUserImplementation$expo_modules_core_release(Object[] args, Promise promise, AppContext appContext);
}
