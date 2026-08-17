package expo.modules.kotlin.functions;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.types.AnyType;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\"\u0010\u000b\u001a\u001e\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013R0\u0010\u000b\u001a\u001e\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "Lkotlin/Function2;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/Promise;", "Li7/B;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V", "args", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/AppContext;", "appContext", "callUserImplementation$expo_modules_core_release", "([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;Lexpo/modules/kotlin/AppContext;)V", "callUserImplementation", "Lkotlin/jvm/functions/Function2;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsyncFunctionWithPromiseComponent extends AsyncFunctionComponent {
    private final Function2 body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFunctionWithPromiseComponent(String name, AnyType[] desiredArgsTypes, Function2 body) {
        super(name, desiredArgsTypes);
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(desiredArgsTypes, "desiredArgsTypes");
        AbstractC2855l.g(body, "body");
        this.body = body;
    }

    @Override // expo.modules.kotlin.functions.AsyncFunctionComponent
    public void callUserImplementation$expo_modules_core_release(Object[] args, Promise promise, AppContext appContext) {
        AbstractC2855l.g(args, "args");
        AbstractC2855l.g(promise, "promise");
        AbstractC2855l.g(appContext, "appContext");
        this.body.invoke(AnyFunction.convertArgs$default(this, args, appContext, false, 4, null), promise);
    }
}
