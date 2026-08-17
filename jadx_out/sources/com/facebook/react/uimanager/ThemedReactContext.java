package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u0014\"\b\b\u0000\u0010\u001b*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J)\u0010'\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010'\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0017¢\u0006\u0004\b-\u0010\u0016J\u000f\u0010.\u001a\u00020\u0014H\u0016¢\u0006\u0004\b.\u0010\u0016J\u000f\u0010/\u001a\u00020\u0014H\u0017¢\u0006\u0004\b/\u0010\u0016J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010\u0016J\u000f\u00101\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u00020\u00102\u000e\u00107\u001a\n\u0018\u000105j\u0004\u0018\u0001`6H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0014H\u0017¢\u0006\u0004\b:\u0010\u0016J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010B\u001a\u0004\u0018\u00010AH\u0017¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bD\u00104J+\u0010I\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u00104R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lcom/facebook/react/uimanager/ThemedReactContext;", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "Landroid/content/Context;", Constants.SENSITIVITY_BASE, PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "surfaceId", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;Ljava/lang/String;I)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;Ljava/lang/String;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;)V", "Lcom/facebook/react/bridge/LifecycleEventListener;", "listener", "Li7/B;", "addLifecycleEventListener", "(Lcom/facebook/react/bridge/LifecycleEventListener;)V", "removeLifecycleEventListener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasCurrentActivity", "()Z", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/JavaScriptModule;", "T", "Ljava/lang/Class;", "jsInterface", "getJSModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleInterface", "hasNativeModule", "(Ljava/lang/Class;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeModules", "()Ljava/util/Collection;", "getNativeModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/CatalystInstance;", "getCatalystInstance", "()Lcom/facebook/react/bridge/CatalystInstance;", "hasActiveCatalystInstance", "hasActiveReactInstance", "hasCatalystInstance", "hasReactInstance", "destroy", "()V", "getSurfaceID", "()Ljava/lang/String;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "handleException", "(Ljava/lang/Exception;)V", "isBridgeless", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJSCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "Lcom/facebook/react/bridge/UIManager;", "getFabricUIManager", "()Lcom/facebook/react/bridge/UIManager;", "getSourceURL", "segmentId", "path", "Lcom/facebook/react/bridge/Callback;", "callback", "registerSegment", "(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactApplicationContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/lang/String;", "getModuleName", "I", "getSurfaceId", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemedReactContext extends ReactContext {
    private final String moduleName;
    private final ReactApplicationContext reactApplicationContext;
    private final int surfaceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemedReactContext(ReactApplicationContext reactApplicationContext, Context base, String str, int i10) {
        super(base);
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        AbstractC2855l.g(base, "base");
        this.reactApplicationContext = reactApplicationContext;
        this.moduleName = str;
        this.surfaceId = i10;
        initializeFromOther(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.reactApplicationContext.addLifecycleEventListener(listener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        this.reactApplicationContext.destroy();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        return this.reactApplicationContext.getCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.reactApplicationContext.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.reactApplicationContext.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.reactApplicationContext.getJSCallInvokerHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends JavaScriptModule> T getJSModule(Class<T> jsInterface) {
        AbstractC2855l.g(jsInterface, "jsInterface");
        T t10 = (T) this.reactApplicationContext.getJSModule(jsInterface);
        AbstractC2855l.f(t10, "getJSModule(...)");
        return t10;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.reactApplicationContext.getJavaScriptContextHolder();
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> T getNativeModule(Class<T> nativeModuleInterface) {
        AbstractC2855l.g(nativeModuleInterface, "nativeModuleInterface");
        return (T) this.reactApplicationContext.getNativeModule(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection<NativeModule> getNativeModules() {
        return this.reactApplicationContext.getNativeModules();
    }

    public final ReactApplicationContext getReactApplicationContext() {
        return this.reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return this.reactApplicationContext.getSourceURL();
    }

    public final String getSurfaceID() {
        return this.moduleName;
    }

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception e10) {
        this.reactApplicationContext.handleException(e10);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return this.reactApplicationContext.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.reactApplicationContext.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return this.reactApplicationContext.hasCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.reactApplicationContext.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(Class<T> nativeModuleInterface) {
        AbstractC2855l.g(nativeModuleInterface, "nativeModuleInterface");
        return this.reactApplicationContext.hasNativeModule(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.reactApplicationContext.hasReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return this.reactApplicationContext.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int segmentId, String path, Callback callback) {
        this.reactApplicationContext.registerSegment(segmentId, path, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.reactApplicationContext.removeLifecycleEventListener(listener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        return this.reactApplicationContext.getNativeModule(moduleName);
    }

    public /* synthetic */ ThemedReactContext(ReactApplicationContext reactApplicationContext, Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, context, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThemedReactContext(ReactApplicationContext reactApplicationContext, Context base, String str) {
        this(reactApplicationContext, base, str, -1);
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        AbstractC2855l.g(base, "base");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThemedReactContext(ReactApplicationContext reactApplicationContext, Context base) {
        this(reactApplicationContext, base, null, -1);
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        AbstractC2855l.g(base, "base");
    }
}
