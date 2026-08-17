package expo.modules.kotlin.viewevent;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.core.logging.Logger;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.ReactExtensionsKt;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.types.JSTypeConverterHelperKt;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import expo.modules.kotlin.views.CallbacksDefinition;
import expo.modules.kotlin.views.ViewFunctionHolder;
import expo.modules.kotlin.views.ViewManagerDefinition;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R.\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/viewevent/ViewEvent;", "T", "Lexpo/modules/kotlin/viewevent/ViewEventCallback;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Landroid/view/View;", "view", "Lkotlin/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/viewevent/CoalescingKey;", "coalescingKey", "<init>", "(Ljava/lang/String;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "arg", "Lcom/facebook/react/bridge/WritableMap;", "convertEventBody", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Li7/B;", "invoke", "(Ljava/lang/Object;)V", "Ljava/lang/String;", "Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isValidated", "Z", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ViewEvent<T> implements ViewEventCallback<T> {
    private final Function1 coalescingKey;
    private boolean isValidated;
    private final String name;
    private final View view;

    public ViewEvent(String name, View view, Function1 function1) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(view, "view");
        this.name = name;
        this.view = view;
        this.coalescingKey = function1;
    }

    private final WritableMap convertEventBody(T arg) {
        Object objConvertToJSValue$default = JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, arg, null, false, 6, null);
        if ((objConvertToJSValue$default instanceof C2735B) || objConvertToJSValue$default == null) {
            return null;
        }
        if (objConvertToJSValue$default instanceof WritableMap) {
            return (WritableMap) objConvertToJSValue$default;
        }
        WritableMap writableMapCreateMap = JSTypeConverterProvider.DefaultContainerProvider.INSTANCE.createMap();
        JSTypeConverterHelperKt.putGeneric(writableMapCreateMap, "payload", objConvertToJSValue$default);
        return writableMapCreateMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    @Override // expo.modules.kotlin.viewevent.ViewEventCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void invoke(T arg) {
        CallbacksDefinition callbacksDefinition;
        Context context = this.view.getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        NativeModulesProxy unimoduleProxy = ReactExtensionsKt.getUnimoduleProxy((ReactContext) context);
        if (unimoduleProxy == null) {
            return;
        }
        AppContext appContext = unimoduleProxy.getKotlinInteropModuleRegistry().getAppContext();
        if (!this.isValidated) {
            ModuleHolder<?> moduleHolder = appContext.getRegistry().getModuleHolder(this.view.getClass());
            if (moduleHolder == null) {
                Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ Cannot get module holder for " + this.view.getClass(), null, 2, null);
                return;
            }
            if (this.view instanceof ViewFunctionHolder) {
                ViewManagerDefinition viewDefinition = appContext.getRegistry().getViewDefinition(moduleHolder, ((ViewFunctionHolder) this.view).getName());
                callbacksDefinition = viewDefinition != null ? viewDefinition.getCallbacksDefinition() : null;
                if (callbacksDefinition != null) {
                    Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ Cannot get callbacks for " + moduleHolder.getModule().getClass(), null, 2, null);
                    return;
                }
                for (String str : callbacksDefinition.getNames()) {
                    if (AbstractC2855l.b(str, this.name)) {
                        this.isValidated = true;
                    }
                }
                Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ Event " + this.name + " wasn't exported from " + moduleHolder.getModule().getClass(), null, 2, null);
                return;
            }
            ViewManagerDefinition viewDefinition2 = appContext.getRegistry().getViewDefinition(moduleHolder, this.view.getClass());
            if (viewDefinition2 != null) {
                callbacksDefinition = viewDefinition2.getCallbacksDefinition();
            }
            if (callbacksDefinition != null) {
            }
        }
        EventEmitter callbackInvoker$expo_modules_core_release = appContext.getCallbackInvoker$expo_modules_core_release();
        if (callbackInvoker$expo_modules_core_release != null) {
            View view = this.view;
            String str2 = this.name;
            WritableMap writableMapConvertEventBody = convertEventBody(arg);
            Function1 function1 = this.coalescingKey;
            callbackInvoker$expo_modules_core_release.emit(view, str2, writableMapConvertEventBody, function1 != null ? (Short) function1.invoke(arg) : null);
        }
    }
}
