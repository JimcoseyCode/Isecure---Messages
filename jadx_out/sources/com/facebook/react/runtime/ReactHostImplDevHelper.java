package com.facebook.react.runtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.devsupport.ReactInstanceDevHelper;
import com.facebook.react.devsupport.interfaces.TracingState;
import com.facebook.react.devsupport.interfaces.TracingStateProvider;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorDevHelper;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorInspectorTarget;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImplDevHelper;", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;", "Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;", "Lcom/facebook/react/runtime/ReactHostImpl;", "delegate", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;)V", "Li7/B;", "onJSBundleLoadedFromServer", "()V", "toggleElementInspector", PointerEventHelper.POINTER_TYPE_UNKNOWN, "appKey", "Landroid/view/View;", "createRootView", "(Ljava/lang/String;)Landroid/view/View;", "rootView", "destroyRootView", "(Landroid/view/View;)V", "reason", "reload", "(Ljava/lang/String;)V", "Lcom/facebook/react/bridge/JSBundleLoader;", "bundleLoader", "Lcom/facebook/react/interfaces/TaskInterface;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "loadBundle", "(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/interfaces/TaskInterface;", "Lcom/facebook/react/devsupport/interfaces/TracingState;", "getTracingState", "()Lcom/facebook/react/devsupport/interfaces/TracingState;", "Lcom/facebook/react/runtime/ReactHostImpl;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "getJavaScriptExecutorFactory", "()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "javaScriptExecutorFactory", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;", "getInspectorTarget", "()Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;", "inspectorTarget", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@UnstableReactNativeAPI
public final class ReactHostImplDevHelper implements ReactInstanceDevHelper, PerfMonitorDevHelper, TracingStateProvider {
    private final ReactHostImpl delegate;

    public ReactHostImplDevHelper(ReactHostImpl delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public View createRootView(String appKey) {
        AbstractC2855l.g(appKey, "appKey");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || this.delegate.isSurfaceWithModuleNameAttached$ReactAndroid_release(appKey)) {
            return null;
        }
        ReactSurfaceImpl reactSurfaceImplCreateWithView = ReactSurfaceImpl.INSTANCE.createWithView(currentActivity, appKey, new Bundle());
        reactSurfaceImplCreateWithView.attach(this.delegate);
        reactSurfaceImplCreateWithView.start();
        return reactSurfaceImplCreateWithView.getView();
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void destroyRootView(View rootView) {
        AbstractC2855l.g(rootView, "rootView");
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public Activity getCurrentActivity() {
        return this.delegate.getLastUsedActivity$ReactAndroid_release();
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public ReactContext getCurrentReactContext() {
        return this.delegate.getCurrentReactContext();
    }

    @Override // com.facebook.react.devsupport.perfmonitor.PerfMonitorDevHelper
    public PerfMonitorInspectorTarget getInspectorTarget() {
        return this.delegate.getReactHostInspectorTarget();
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        throw new IllegalStateException("Not implemented for bridgeless mode");
    }

    @Override // com.facebook.react.devsupport.interfaces.TracingStateProvider
    public TracingState getTracingState() {
        TracingState tracingState;
        ReactHostInspectorTarget reactHostInspectorTarget = this.delegate.getReactHostInspectorTarget();
        return (reactHostInspectorTarget == null || (tracingState = reactHostInspectorTarget.getTracingState()) == null) ? TracingState.ENABLEDINCDPMODE : tracingState;
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public TaskInterface<Boolean> loadBundle(JSBundleLoader bundleLoader) {
        AbstractC2855l.g(bundleLoader, "bundleLoader");
        return this.delegate.loadBundle$ReactAndroid_release(bundleLoader);
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void reload(String reason) {
        AbstractC2855l.g(reason, "reason");
        this.delegate.reload(reason);
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void toggleElementInspector() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        ReactContext currentReactContext = this.delegate.getCurrentReactContext();
        if (currentReactContext == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit("toggleElementInspector", null);
    }

    @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
    public void onJSBundleLoadedFromServer() {
    }
}
