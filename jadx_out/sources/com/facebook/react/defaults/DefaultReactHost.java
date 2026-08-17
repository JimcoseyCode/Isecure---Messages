package com.facebook.react.defaults;

import P8.q;
import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0099\u0001\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u00062\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u001b\u0010\u001fJ\u000f\u0010!\u001a\u00020\u0016H\u0000¢\u0006\u0004\b \u0010\u0003R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHost;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/ReactPackage;", "packageList", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsMainModulePath", "jsBundleAssetPath", "jsBundleFilePath", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", PointerEventHelper.POINTER_TYPE_UNKNOWN, "useDevSupport", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/runtime/cxxreactpackage/CxxReactPackage;", "cxxReactPackageProviders", "Ljava/lang/Exception;", "Li7/B;", "exceptionHandler", "Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "Lcom/facebook/react/ReactHost;", "getDefaultReactHost", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/runtime/JSRuntimeFactory;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lcom/facebook/react/runtime/BindingsInstaller;)Lcom/facebook/react/ReactHost;", "Lcom/facebook/react/ReactNativeHost;", "reactNativeHost", "(Landroid/content/Context;Lcom/facebook/react/ReactNativeHost;Lcom/facebook/react/runtime/JSRuntimeFactory;)Lcom/facebook/react/ReactHost;", "invalidate$ReactAndroid_release", "invalidate", "reactHost", "Lcom/facebook/react/ReactHost;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultReactHost {
    public static final DefaultReactHost INSTANCE = new DefaultReactHost();
    private static ReactHost reactHost;

    private DefaultReactHost() {
    }

    public static final ReactHost getDefaultReactHost(Context context, List<? extends ReactPackage> packageList, String jsMainModulePath, String jsBundleAssetPath, String jsBundleFilePath, JSRuntimeFactory jsRuntimeFactory, boolean useDevSupport, List<? extends Function1> cxxReactPackageProviders, Function1 exceptionHandler, BindingsInstaller bindingsInstaller) {
        JSBundleLoader jSBundleLoaderCreateAssetLoader;
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(packageList, "packageList");
        AbstractC2855l.g(jsMainModulePath, "jsMainModulePath");
        AbstractC2855l.g(jsBundleAssetPath, "jsBundleAssetPath");
        AbstractC2855l.g(cxxReactPackageProviders, "cxxReactPackageProviders");
        AbstractC2855l.g(exceptionHandler, "exceptionHandler");
        if (reactHost == null) {
            if (jsBundleFilePath != null) {
                jSBundleLoaderCreateAssetLoader = q.K(jsBundleFilePath, "assets://", false, 2, null) ? JSBundleLoader.INSTANCE.createAssetLoader(context, jsBundleFilePath, true) : JSBundleLoader.INSTANCE.createFileLoader(jsBundleFilePath);
            } else {
                jSBundleLoaderCreateAssetLoader = JSBundleLoader.INSTANCE.createAssetLoader(context, "assets://" + jsBundleAssetPath, true);
            }
            JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
            DefaultTurboModuleManagerDelegate.Builder builder = new DefaultTurboModuleManagerDelegate.Builder();
            Iterator<T> it = cxxReactPackageProviders.iterator();
            while (it.hasNext()) {
                builder.addCxxReactPackage((Function1) it.next());
            }
            DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(jsMainModulePath, jSBundleLoader, packageList, jsRuntimeFactory == null ? new HermesInstance() : jsRuntimeFactory, bindingsInstaller, exceptionHandler, builder);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            reactHost = new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, true, useDevSupport);
        }
        ReactHost reactHost2 = reactHost;
        AbstractC2855l.e(reactHost2, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return reactHost2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B getDefaultReactHost$lambda$0(Exception it) throws Exception {
        AbstractC2855l.g(it, "it");
        throw it;
    }

    public final void invalidate$ReactAndroid_release() {
        reactHost = null;
    }

    public static /* synthetic */ ReactHost getDefaultReactHost$default(Context context, ReactNativeHost reactNativeHost, JSRuntimeFactory jSRuntimeFactory, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            jSRuntimeFactory = null;
        }
        return getDefaultReactHost(context, reactNativeHost, jSRuntimeFactory);
    }

    public static final ReactHost getDefaultReactHost(Context context, ReactNativeHost reactNativeHost, JSRuntimeFactory jsRuntimeFactory) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(reactNativeHost, "reactNativeHost");
        if (reactNativeHost instanceof DefaultReactNativeHost) {
            return ((DefaultReactNativeHost) reactNativeHost).toReactHost$ReactAndroid_release(context, jsRuntimeFactory);
        }
        throw new IllegalArgumentException("You can call getDefaultReactHost only with instances of DefaultReactNativeHost");
    }
}
