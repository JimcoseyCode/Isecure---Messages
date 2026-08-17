package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ReactExtensionsKt;
import expo.modules.kotlin.defaultmodules.JSLoggerModule;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import j7.K;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B©\u0001\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\"\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\r\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b:\u00103R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=¨\u0006@"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerDefinition;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function2;", "Landroid/content/Context;", "Lexpo/modules/kotlin/AppContext;", "Landroid/view/View;", "viewFactory", "Ljava/lang/Class;", "viewType", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/views/AnyViewProp;", "props", "name", "Lkotlin/Function1;", "Li7/B;", "onViewDestroys", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "callbacksDefinition", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "onViewDidUpdateProps", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "asyncFunctions", "<init>", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/views/CallbacksDefinition;Lexpo/modules/kotlin/views/ViewGroupDefinition;Lkotlin/jvm/functions/Function1;Ljava/util/List;)V", "context", "appContext", "createView", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)Landroid/view/View;", "Lexpo/modules/kotlin/views/ViewManagerType;", "getViewManagerType", "()Lexpo/modules/kotlin/views/ViewManagerType;", "view", "Lexpo/modules/kotlin/exception/CodedException;", NotificationsService.EXCEPTION_KEY, "handleException", "(Landroid/view/View;Lexpo/modules/kotlin/exception/CodedException;)V", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "getViewType$expo_modules_core_release", "()Ljava/lang/Class;", "Ljava/util/Map;", "getProps$expo_modules_core_release", "()Ljava/util/Map;", "Ljava/lang/String;", "getName$expo_modules_core_release", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnViewDestroys", "()Lkotlin/jvm/functions/Function1;", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "getCallbacksDefinition", "()Lexpo/modules/kotlin/views/CallbacksDefinition;", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getOnViewDidUpdateProps", "Ljava/util/List;", "getAsyncFunctions", "()Ljava/util/List;", "propsNames", "getPropsNames", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewManagerDefinition {
    private final List<BaseAsyncFunctionComponent> asyncFunctions;
    private final CallbacksDefinition callbacksDefinition;
    private final String name;
    private final Function1 onViewDestroys;
    private final Function1 onViewDidUpdateProps;
    private final Map<String, AnyViewProp> props;
    private final List<String> propsNames;
    private final Function2 viewFactory;
    private final ViewGroupDefinition viewGroupDefinition;
    private final Class<? extends View> viewType;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewManagerDefinition(Function2 viewFactory, Class<? extends View> viewType, Map<String, ? extends AnyViewProp> props, String name, Function1 function1, CallbacksDefinition callbacksDefinition, ViewGroupDefinition viewGroupDefinition, Function1 function12, List<? extends BaseAsyncFunctionComponent> asyncFunctions) {
        AbstractC2855l.g(viewFactory, "viewFactory");
        AbstractC2855l.g(viewType, "viewType");
        AbstractC2855l.g(props, "props");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(asyncFunctions, "asyncFunctions");
        this.viewFactory = viewFactory;
        this.viewType = viewType;
        this.props = props;
        this.name = name;
        this.onViewDestroys = function1;
        this.callbacksDefinition = callbacksDefinition;
        this.viewGroupDefinition = viewGroupDefinition;
        this.onViewDidUpdateProps = function12;
        this.asyncFunctions = asyncFunctions;
        this.propsNames = AbstractC2800q.P0(props.keySet());
    }

    public final View createView(Context context, AppContext appContext) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(appContext, "appContext");
        return (View) this.viewFactory.invoke(context, appContext);
    }

    public final List<BaseAsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final CallbacksDefinition getCallbacksDefinition() {
        return this.callbacksDefinition;
    }

    /* JADX INFO: renamed from: getName$expo_modules_core_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Function1 getOnViewDestroys() {
        return this.onViewDestroys;
    }

    public final Function1 getOnViewDidUpdateProps() {
        return this.onViewDidUpdateProps;
    }

    public final Map<String, AnyViewProp> getProps$expo_modules_core_release() {
        return this.props;
    }

    public final List<String> getPropsNames() {
        return this.propsNames;
    }

    public final ViewGroupDefinition getViewGroupDefinition() {
        return this.viewGroupDefinition;
    }

    public final ViewManagerType getViewManagerType() {
        return ViewGroup.class.isAssignableFrom(this.viewType) ? ViewManagerType.GROUP : ViewManagerType.SIMPLE;
    }

    public final Class<? extends View> getViewType$expo_modules_core_release() {
        return this.viewType;
    }

    public final void handleException(View view, CodedException exception) {
        NativeModulesProxy unimoduleProxy;
        JSLoggerModule errorManager;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(exception, "exception");
        Context context = view.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (unimoduleProxy = ReactExtensionsKt.getUnimoduleProxy(reactContext)) == null || (errorManager = unimoduleProxy.getKotlinInteropModuleRegistry().getAppContext().getErrorManager()) == null) {
            return;
        }
        errorManager.reportExceptionToLogBox(exception);
    }

    public /* synthetic */ ViewManagerDefinition(Function2 function2, Class cls, Map map, String str, Function1 function1, CallbacksDefinition callbacksDefinition, ViewGroupDefinition viewGroupDefinition, Function1 function12, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, cls, (i10 & 4) != 0 ? K.i() : map, (i10 & 8) != 0 ? cls.getName() : str, (i10 & 16) != 0 ? null : function1, (i10 & 32) != 0 ? null : callbacksDefinition, (i10 & 64) != 0 ? null : viewGroupDefinition, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : function12, (i10 & 256) != 0 ? AbstractC2800q.j() : list);
    }
}
