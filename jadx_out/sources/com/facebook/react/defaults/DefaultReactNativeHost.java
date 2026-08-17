package com.facebook.react.defaults;

import android.app.Application;
import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManagerProviderImpl;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewManagerResolver;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178TX\u0095\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactNativeHost;", "Lcom/facebook/react/ReactNativeHost;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "getReactPackageTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "Lcom/facebook/react/bridge/UIManagerProvider;", "getUIManagerProvider", "()Lcom/facebook/react/bridge/UIManagerProvider;", "Li7/B;", "clear", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/ReactHost;", "toReactHost$ReactAndroid_release", "(Landroid/content/Context;Lcom/facebook/react/runtime/JSRuntimeFactory;)Lcom/facebook/react/ReactHost;", "toReactHost", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isHermesEnabled", "()Z", "isHermesEnabled$annotations", "isNewArchEnabled", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DefaultReactNativeHost extends ReactNativeHost {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DefaultReactNativeHost(Application application) {
        super(application);
        AbstractC2855l.g(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager getUIManagerProvider$lambda$0(final DefaultReactNativeHost defaultReactNativeHost, ReactApplicationContext reactApplicationContext) {
        ViewManagerRegistry viewManagerRegistry;
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        if (defaultReactNativeHost.getLazyViewManagersEnabled()) {
            viewManagerRegistry = new ViewManagerRegistry(new ViewManagerResolver() { // from class: com.facebook.react.defaults.DefaultReactNativeHost$getUIManagerProvider$1$viewManagerRegistry$1
                @Override // com.facebook.react.uimanager.ViewManagerResolver
                public ViewManager getViewManager(String viewManagerName) {
                    AbstractC2855l.g(viewManagerName, "viewManagerName");
                    return this.this$0.getReactInstanceManager().createViewManager(viewManagerName);
                }

                @Override // com.facebook.react.uimanager.ViewManagerResolver
                public Collection<String> getViewManagerNames() {
                    return this.this$0.getReactInstanceManager().getViewManagerNames();
                }
            });
        } else {
            List<ViewManager> orCreateViewManagers = defaultReactNativeHost.getReactInstanceManager().getOrCreateViewManagers(reactApplicationContext);
            AbstractC2855l.f(orCreateViewManagers, "getOrCreateViewManagers(...)");
            viewManagerRegistry = new ViewManagerRegistry(orCreateViewManagers);
        }
        return new FabricUIManagerProviderImpl(componentFactory, viewManagerRegistry).createUIManager(reactApplicationContext);
    }

    public static /* synthetic */ ReactHost toReactHost$ReactAndroid_release$default(DefaultReactNativeHost defaultReactNativeHost, Context context, JSRuntimeFactory jSRuntimeFactory, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toReactHost");
        }
        if ((i10 & 2) != 0) {
            jSRuntimeFactory = null;
        }
        return defaultReactNativeHost.toReactHost$ReactAndroid_release(context, jSRuntimeFactory);
    }

    @Override // com.facebook.react.ReactNativeHost
    public void clear() {
        super.clear();
        DefaultReactHost.INSTANCE.invalidate$ReactAndroid_release();
    }

    @Override // com.facebook.react.ReactNativeHost
    protected ReactPackageTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
        if (getIsNewArchEnabled()) {
            return new DefaultTurboModuleManagerDelegate.Builder();
        }
        throw new IllegalStateException("Overriding isNewArchEnabled to false is not supported anymore since React Native 0.82. Please check your MainApplication.kt file, and remove the override for `isNewArchEnabled`.");
    }

    @Override // com.facebook.react.ReactNativeHost
    protected UIManagerProvider getUIManagerProvider() {
        if (getIsNewArchEnabled()) {
            return new UIManagerProvider() { // from class: com.facebook.react.defaults.c
                @Override // com.facebook.react.bridge.UIManagerProvider
                public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                    return DefaultReactNativeHost.getUIManagerProvider$lambda$0(this.f20294a, reactApplicationContext);
                }
            };
        }
        throw new IllegalStateException("Overriding isNewArchEnabled to false is not supported anymore since React Native 0.82. Please check your MainApplication.kt file, and remove the override for `isNewArchEnabled`.");
    }

    /* JADX INFO: renamed from: isHermesEnabled */
    protected boolean getIsHermesEnabled() {
        return true;
    }

    /* JADX INFO: renamed from: isNewArchEnabled */
    protected boolean getIsNewArchEnabled() {
        return true;
    }

    @UnstableReactNativeAPI
    public final ReactHost toReactHost$ReactAndroid_release(Context context, JSRuntimeFactory jsRuntimeFactory) {
        AbstractC2855l.g(context, "context");
        if (jsRuntimeFactory == null) {
            jsRuntimeFactory = new HermesInstance();
        }
        JSRuntimeFactory jSRuntimeFactory = jsRuntimeFactory;
        List<ReactPackage> packages = getPackages();
        AbstractC2855l.f(packages, "getPackages(...)");
        String jSMainModuleName = getJSMainModuleName();
        AbstractC2855l.f(jSMainModuleName, "getJSMainModuleName(...)");
        String bundleAssetName = getBundleAssetName();
        if (bundleAssetName == null) {
            bundleAssetName = "index.android.bundle";
        }
        return DefaultReactHost.getDefaultReactHost(context, packages, (896 & 4) != 0 ? "index" : jSMainModuleName, (896 & 8) != 0 ? "index.android.bundle" : bundleAssetName, (896 & 16) != 0 ? null : getJSBundleFile(), (896 & 32) != 0 ? null : jSRuntimeFactory, (896 & 64) != 0 ? ReactBuildConfig.DEBUG : getUseDeveloperSupport(), (896 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? AbstractC2800q.j() : null, (896 & 256) != 0 ? new Function1() { // from class: com.facebook.react.defaults.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultReactHost.getDefaultReactHost$lambda$0((Exception) obj);
            }
        } : null, (896 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : null);
    }

    protected static /* synthetic */ void isHermesEnabled$annotations() {
    }
}
