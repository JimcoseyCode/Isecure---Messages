package expo.modules.kotlin.functions;

import R8.AbstractC1417k;
import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.AnyType;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2750m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00124\u0010\u000b\u001a0\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015RB\u0010\u000b\u001a0\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "Lkotlin/Function3;", "LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ln7/f;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "moduleName", "Li7/B;", "attachToJSObject", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V", "Lw7/o;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SuspendFunctionComponent extends BaseAsyncFunctionComponent {
    private final o body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendFunctionComponent(String name, AnyType[] desiredArgsTypes, o body) {
        super(name, desiredArgsTypes);
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(desiredArgsTypes, "desiredArgsTypes");
        AbstractC2855l.g(body, "body");
        this.body = body;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachToJSObject$lambda$1(WeakReference weakReference, String str, SuspendFunctionComponent suspendFunctionComponent, AppContext appContext, Object[] args, PromiseImpl promiseImpl) {
        N scope;
        AbstractC2855l.g(args, "args");
        AbstractC2855l.g(promiseImpl, "promiseImpl");
        FunctionQueue queue = suspendFunctionComponent.getQueue();
        if (queue == Queues.MAIN) {
            scope = appContext.getMainQueue();
        } else if (queue == Queues.DEFAULT) {
            scope = appContext.getModulesQueue();
        } else {
            if (!(queue instanceof CustomQueue)) {
                throw new C2750m();
            }
            scope = ((CustomQueue) queue).getScope();
        }
        AbstractC1417k.d(scope, null, null, new SuspendFunctionComponent$attachToJSObject$2$1(promiseImpl, suspendFunctionComponent, str, args, appContext, null), 3, null);
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
        jsObject.registerAsyncFunction(name, takesOwner$expo_modules_core_release, isEnumerable, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody() { // from class: expo.modules.kotlin.functions.c
            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                SuspendFunctionComponent.attachToJSObject$lambda$1(weakReferenceWeak, moduleName, this, appContext, objArr, promiseImpl);
            }
        });
    }
}
