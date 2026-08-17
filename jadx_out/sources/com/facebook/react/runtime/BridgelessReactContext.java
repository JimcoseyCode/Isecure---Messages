package com.facebook.react.runtime;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherProvider;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001XB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J'\u0010'\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010**\u00020)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\u0019\"\b\b\u0000\u0010**\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020408H\u0016¢\u0006\u0004\b9\u0010:J)\u0010;\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010**\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010;\u001a\u0004\u0018\u0001042\u0006\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010>J\u0011\u0010@\u001a\u0004\u0018\u00010?H\u0017¢\u0006\u0004\b@\u0010AJ\u001b\u0010E\u001a\u00020\u00102\n\u0010D\u001a\u00060Bj\u0002`CH\u0016¢\u0006\u0004\bE\u0010FJ\u0011\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010W\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lcom/facebook/react/runtime/BridgelessReactContext;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/uimanager/events/EventDispatcherProvider;", "Landroid/content/Context;", "context", "Lcom/facebook/react/runtime/ReactHostImpl;", "reactHost", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostImpl;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSourceURL", "()Ljava/lang/String;", "sourceURL", "Li7/B;", "setSourceURL", "(Ljava/lang/String;)V", "Lcom/facebook/react/bridge/UIManager;", "getFabricUIManager", "()Lcom/facebook/react/bridge/UIManager;", "Lcom/facebook/react/bridge/CatalystInstance;", "getCatalystInstance", "()Lcom/facebook/react/bridge/CatalystInstance;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasActiveCatalystInstance", "()Z", "isBridgeless", "hasCatalystInstance", "hasActiveReactInstance", "hasReactInstance", "destroy", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "segmentId", "path", "Lcom/facebook/react/bridge/Callback;", "callback", "registerSegment", "(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "Lcom/facebook/react/bridge/JavaScriptModule;", "T", "Ljava/lang/Class;", "jsInterface", "getJSModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "eventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "args", "emitDeviceEvent", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleInterface", "hasNativeModule", "(Ljava/lang/Class;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeModules", "()Ljava/util/Collection;", "getNativeModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "name", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "handleException", "(Ljava/lang/Exception;)V", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJSCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "Lcom/facebook/react/runtime/ReactHostImpl;", "Ljava/util/concurrent/atomic/AtomicReference;", "sourceURLRef", "Ljava/util/concurrent/atomic/AtomicReference;", "TAG", "Ljava/lang/String;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "getDefaultHardwareBackBtnHandler", "()Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "defaultHardwareBackBtnHandler", "BridgelessJSModuleInvocationHandler", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BridgelessReactContext extends ReactApplicationContext implements EventDispatcherProvider {
    private final String TAG;
    private final ReactHostImpl reactHost;
    private final AtomicReference<String> sourceURLRef;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/runtime/BridgelessReactContext$BridgelessJSModuleInvocationHandler;", "Ljava/lang/reflect/InvocationHandler;", "reactHost", "Lcom/facebook/react/runtime/ReactHostImpl;", "jsModuleInterface", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/Class;)V", "invoke", PointerEventHelper.POINTER_TYPE_UNKNOWN, "proxy", "method", "Ljava/lang/reflect/Method;", "args", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class BridgelessJSModuleInvocationHandler implements InvocationHandler {
        private final Class<? extends JavaScriptModule> jsModuleInterface;
        private final ReactHostImpl reactHost;

        public BridgelessJSModuleInvocationHandler(ReactHostImpl reactHost, Class<? extends JavaScriptModule> jsModuleInterface) {
            AbstractC2855l.g(reactHost, "reactHost");
            AbstractC2855l.g(jsModuleInterface, "jsModuleInterface");
            this.reactHost = reactHost;
            this.jsModuleInterface = jsModuleInterface;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            AbstractC2855l.g(proxy, "proxy");
            AbstractC2855l.g(method, "method");
            AbstractC2855l.g(args, "args");
            WritableNativeArray writableNativeArrayFromJavaArgs = Arguments.fromJavaArgs(args);
            ReactHostImpl reactHostImpl = this.reactHost;
            String jSModuleName = JavaScriptModuleRegistry.INSTANCE.getJSModuleName(this.jsModuleInterface);
            String name = method.getName();
            AbstractC2855l.f(name, "getName(...)");
            reactHostImpl.callFunctionOnModule$ReactAndroid_release(jSModuleName, name, writableNativeArrayFromJavaArgs);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgelessReactContext(Context context, ReactHostImpl reactHost) {
        super(context);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(reactHost, "reactHost");
        this.reactHost = reactHost;
        this.sourceURLRef = new AtomicReference<>();
        String simpleName = BridgelessReactContext.class.getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        this.TAG = simpleName;
        if (ReactNativeNewArchitectureFeatureFlags.useFabricInterop()) {
            initializeInteropModules();
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void emitDeviceEvent(String eventName, Object args) {
        AbstractC2855l.g(eventName, "eventName");
        this.reactHost.callFunctionOnModule$ReactAndroid_release("RCTDeviceEventEmitter", "emit", Arguments.fromJavaArgs(new Object[]{eventName, args}));
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            throw new UnsupportedOperationException("CatalystInstance is not supported when Bridgeless mode is enabled.");
        }
        return new BridgelessCatalystInstance(this.reactHost);
    }

    public final DefaultHardwareBackBtnHandler getDefaultHardwareBackBtnHandler() {
        return this.reactHost.getDefaultBackButtonHandler$ReactAndroid_release();
    }

    public final DevSupportManager getDevSupportManager() {
        return this.reactHost.getDevSupportManager();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherProvider
    public EventDispatcher getEventDispatcher() {
        return this.reactHost.getEventDispatcher$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.reactHost.getUiManager$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.reactHost.getJsCallInvokerHolder$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends JavaScriptModule> T getJSModule(Class<T> jsInterface) {
        T t10;
        AbstractC2855l.g(jsInterface, "jsInterface");
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry != null && (t10 = (T) interopModuleRegistry.getInteropModule(jsInterface)) != null) {
            if (AbstractC2855l.b(jsInterface, RCTEventEmitter.class)) {
                ReactSoftExceptionLogger.logSoftException(this.TAG, new IllegalArgumentException("getJSModule(RCTEventEmitter) is not recommended in the new architecture and will stop working with interop disabled. Please use UIManagerHelper.getEventDispatcher or UIManagerHelper.getEventDispatcherForReactTag instead"));
            }
            return t10;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(jsInterface.getClassLoader(), new Class[]{jsInterface}, new BridgelessJSModuleInvocationHandler(this.reactHost, jsInterface));
        AbstractC2855l.e(objNewProxyInstance, "null cannot be cast to non-null type com.facebook.react.bridge.JavaScriptModule");
        T t11 = (T) objNewProxyInstance;
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @FrameworkAPI
    @UnstableReactNativeAPI
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.reactHost.getJavaScriptContextHolder$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> T getNativeModule(Class<T> nativeModuleInterface) {
        AbstractC2855l.g(nativeModuleInterface, "nativeModuleInterface");
        return (T) this.reactHost.getNativeModule$ReactAndroid_release(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection<NativeModule> getNativeModules() {
        return this.reactHost.getNativeModules$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return this.sourceURLRef.get();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception e10) {
        AbstractC2855l.g(e10, "e");
        this.reactHost.handleHostException$ReactAndroid_release(e10);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.reactHost.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(Class<T> nativeModuleInterface) {
        AbstractC2855l.g(nativeModuleInterface, "nativeModuleInterface");
        return this.reactHost.hasNativeModule$ReactAndroid_release(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.reactHost.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int segmentId, String path, Callback callback) {
        AbstractC2855l.g(path, "path");
        AbstractC2855l.g(callback, "callback");
        this.reactHost.registerSegment$ReactAndroid_release(segmentId, path, callback);
    }

    public final void setSourceURL(String sourceURL) {
        this.sourceURLRef.set(sourceURL);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String name) {
        AbstractC2855l.g(name, "name");
        return this.reactHost.getNativeModule$ReactAndroid_release(name);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
    }
}
