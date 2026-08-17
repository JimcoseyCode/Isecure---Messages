package expo.modules;

import O8.l;
import P8.q;
import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.ExpoReactHostFactory;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import j7.AbstractC2800q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lexpo/modules/ExpoReactHostFactory;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "reactHost", "Lcom/facebook/react/ReactHost;", "getDefaultReactHost", "context", "Landroid/content/Context;", "packageList", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/ReactPackage;", "jsMainModulePath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsBundleAssetPath", "jsBundleFilePath", "jsRuntimeFactory", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "useDevSupport", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bindingsInstaller", "Lcom/facebook/react/runtime/BindingsInstaller;", "ExpoReactHostDelegate", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoReactHostFactory {
    public static final ExpoReactHostFactory INSTANCE = new ExpoReactHostFactory();
    private static ReactHost reactHost;

    private ExpoReactHostFactory() {
    }

    public static final ReactHost getDefaultReactHost(Context context, List<? extends ReactPackage> packageList, String jsMainModulePath, String jsBundleAssetPath, String jsBundleFilePath, JSRuntimeFactory jsRuntimeFactory, final boolean useDevSupport, BindingsInstaller bindingsInstaller) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(packageList, "packageList");
        AbstractC2855l.g(jsMainModulePath, "jsMainModulePath");
        AbstractC2855l.g(jsBundleAssetPath, "jsBundleAssetPath");
        if (reactHost == null) {
            List<Package> packageList2 = ExpoModulesPackage.INSTANCE.getPackageList();
            final ArrayList<ReactNativeHostHandler> arrayList = new ArrayList();
            Iterator<T> it = packageList2.iterator();
            while (it.hasNext()) {
                List<? extends ReactNativeHostHandler> listCreateReactNativeHostHandlers = ((Package) it.next()).createReactNativeHostHandlers(context);
                AbstractC2855l.f(listCreateReactNativeHostHandlers, "createReactNativeHostHandlers(...)");
                AbstractC2800q.A(arrayList, listCreateReactNativeHostHandlers);
            }
            ExpoReactHostDelegate expoReactHostDelegate = new ExpoReactHostDelegate(new WeakReference(context), packageList, jsMainModulePath, jsBundleAssetPath, jsBundleFilePath, useDevSupport, bindingsInstaller, null, arrayList, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ReactNativeHostHandler) it2.next()).onWillCreateReactInstance(useDevSupport);
            }
            ReactHostImpl reactHostImpl = new ReactHostImpl(context, expoReactHostDelegate, componentFactory, true, useDevSupport);
            for (ReactNativeHostHandler reactNativeHostHandler : arrayList) {
                reactNativeHostHandler.onDidCreateReactHost(context, reactHostImpl);
                reactNativeHostHandler.onDidCreateDevSupportManager(reactHostImpl.getDevSupportManager());
            }
            reactHostImpl.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: expo.modules.ExpoReactHostFactory.getDefaultReactHost.3
                @Override // com.facebook.react.ReactInstanceEventListener
                public void onReactContextInitialized(ReactContext context2) {
                    AbstractC2855l.g(context2, "context");
                    List<ReactNativeHostHandler> list = arrayList;
                    boolean z10 = useDevSupport;
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((ReactNativeHostHandler) it3.next()).onDidCreateReactInstance(z10, context2);
                    }
                }
            });
            reactHost = reactHostImpl;
        }
        ReactHost reactHost2 = reactHost;
        AbstractC2855l.e(reactHost2, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return reactHost2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001Bm\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0013\u0010,\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010 R\u0013\u0010.\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b-\u0010 R\u0011\u00101\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lexpo/modules/ExpoReactHostFactory$ExpoReactHostDelegate;", "Lcom/facebook/react/runtime/ReactHostDelegate;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "weakContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/ReactPackage;", "packageList", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsMainModulePath", "jsBundleAssetPath", "jsBundleFilePath", PointerEventHelper.POINTER_TYPE_UNKNOWN, "useDevSupport", "Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "turboModuleManagerDelegateBuilder", "Lexpo/modules/core/interfaces/ReactNativeHostHandler;", "hostHandlers", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;Ljava/util/List;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Li7/B;", "handleInstanceException", "(Ljava/lang/Exception;)V", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "Ljava/lang/String;", "getJsMainModulePath", "()Ljava/lang/String;", "Z", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "getTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "Lcom/facebook/react/bridge/JSBundleLoader;", "_jsBundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "getHostDelegateJsBundleFilePath", "hostDelegateJsBundleFilePath", "getHostDelegateJSBundleAssetPath", "hostDelegateJSBundleAssetPath", "getHostDelegateUseDeveloperSupport", "()Z", "hostDelegateUseDeveloperSupport", "getJsBundleLoader", "()Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "getJsRuntimeFactory", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "getReactPackages", "()Ljava/util/List;", "reactPackages", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @UnstableReactNativeAPI
    static final class ExpoReactHostDelegate implements ReactHostDelegate {
        private JSBundleLoader _jsBundleLoader;
        private final BindingsInstaller bindingsInstaller;
        private final List<ReactNativeHostHandler> hostHandlers;
        private final String jsBundleAssetPath;
        private final String jsBundleFilePath;
        private final String jsMainModulePath;
        private final List<ReactPackage> packageList;
        private final ReactPackageTurboModuleManagerDelegate.Builder turboModuleManagerDelegateBuilder;
        private final boolean useDevSupport;
        private final WeakReference<Context> weakContext;

        /* JADX WARN: Multi-variable type inference failed */
        public ExpoReactHostDelegate(WeakReference<Context> weakContext, List<? extends ReactPackage> packageList, String jsMainModulePath, String str, String str2, boolean z10, BindingsInstaller bindingsInstaller, ReactPackageTurboModuleManagerDelegate.Builder turboModuleManagerDelegateBuilder, List<? extends ReactNativeHostHandler> hostHandlers) {
            AbstractC2855l.g(weakContext, "weakContext");
            AbstractC2855l.g(packageList, "packageList");
            AbstractC2855l.g(jsMainModulePath, "jsMainModulePath");
            AbstractC2855l.g(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
            AbstractC2855l.g(hostHandlers, "hostHandlers");
            this.weakContext = weakContext;
            this.packageList = packageList;
            this.jsMainModulePath = jsMainModulePath;
            this.jsBundleAssetPath = str;
            this.jsBundleFilePath = str2;
            this.useDevSupport = z10;
            this.bindingsInstaller = bindingsInstaller;
            this.turboModuleManagerDelegateBuilder = turboModuleManagerDelegateBuilder;
            this.hostHandlers = hostHandlers;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_hostDelegateJSBundleAssetPath_$lambda$1(ExpoReactHostDelegate expoReactHostDelegate, ReactNativeHostHandler it) {
            AbstractC2855l.g(it, "it");
            return it.getBundleAssetName(expoReactHostDelegate.useDevSupport);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_hostDelegateJsBundleFilePath_$lambda$0(ExpoReactHostDelegate expoReactHostDelegate, ReactNativeHostHandler it) {
            AbstractC2855l.g(it, "it");
            return it.getJSBundleFile(expoReactHostDelegate.useDevSupport);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean _get_hostDelegateUseDeveloperSupport_$lambda$2(ReactNativeHostHandler it) {
            AbstractC2855l.g(it, "it");
            return it.getUseDeveloperSupport();
        }

        @Override // com.facebook.react.runtime.ReactHostDelegate
        public BindingsInstaller getBindingsInstaller() {
            return this.bindingsInstaller;
        }

        public final String getHostDelegateJSBundleAssetPath() {
            String str = (String) l.C(l.K(AbstractC2800q.V(this.hostHandlers), new Function1() { // from class: expo.modules.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExpoReactHostFactory.ExpoReactHostDelegate._get_hostDelegateJSBundleAssetPath_$lambda$1(this.f26445g, (ReactNativeHostHandler) obj);
                }
            }));
            return str == null ? this.jsBundleAssetPath : str;
        }

        public final String getHostDelegateJsBundleFilePath() {
            String str = (String) l.C(l.K(AbstractC2800q.V(this.hostHandlers), new Function1() { // from class: expo.modules.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExpoReactHostFactory.ExpoReactHostDelegate._get_hostDelegateJsBundleFilePath_$lambda$0(this.f26516g, (ReactNativeHostHandler) obj);
                }
            }));
            return str == null ? this.jsBundleFilePath : str;
        }

        public final boolean getHostDelegateUseDeveloperSupport() {
            Boolean bool = (Boolean) l.C(l.K(AbstractC2800q.V(this.hostHandlers), new Function1() { // from class: expo.modules.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExpoReactHostFactory.ExpoReactHostDelegate._get_hostDelegateUseDeveloperSupport_$lambda$2((ReactNativeHostHandler) obj);
                }
            }));
            return bool != null ? bool.booleanValue() : this.useDevSupport;
        }

        @Override // com.facebook.react.runtime.ReactHostDelegate
        public JSBundleLoader getJsBundleLoader() {
            JSBundleLoader jSBundleLoader = this._jsBundleLoader;
            if (jSBundleLoader != null) {
                return jSBundleLoader;
            }
            Context context = this.weakContext.get();
            if (context == null) {
                throw new IllegalStateException("Unable to get concrete Context");
            }
            String hostDelegateJsBundleFilePath = getHostDelegateJsBundleFilePath();
            if (hostDelegateJsBundleFilePath != null) {
                return q.K(hostDelegateJsBundleFilePath, "assets://", false, 2, null) ? JSBundleLoader.INSTANCE.createAssetLoader(context, hostDelegateJsBundleFilePath, true) : JSBundleLoader.INSTANCE.createFileLoader(hostDelegateJsBundleFilePath);
            }
            return JSBundleLoader.INSTANCE.createAssetLoader(context, "assets://" + getHostDelegateJSBundleAssetPath(), true);
        }

        @Override // com.facebook.react.runtime.ReactHostDelegate
        public String getJsMainModulePath() {
            return this.jsMainModulePath;
        }

        @Override // com.facebook.react.runtime.ReactHostDelegate
        public JSRuntimeFactory getJsRuntimeFactory() {
            return new HermesInstance();
        }

        @Override // com.facebook.react.runtime.ReactHostDelegate
        public List<ReactPackage> getReactPackages() {
            return this.packageList;
        }

        @Override // com.facebook.react.runtime.ReactHostDelegate
        public ReactPackageTurboModuleManagerDelegate.Builder getTurboModuleManagerDelegateBuilder() {
            return this.turboModuleManagerDelegateBuilder;
        }

        @Override // com.facebook.react.runtime.ReactHostDelegate
        public void handleInstanceException(Exception error) throws Exception {
            AbstractC2855l.g(error, "error");
            if (this.hostHandlers.isEmpty()) {
                throw error;
            }
            Iterator<T> it = this.hostHandlers.iterator();
            while (it.hasNext()) {
                ((ReactNativeHostHandler) it.next()).onReactInstanceException(getHostDelegateUseDeveloperSupport(), error);
            }
        }

        public /* synthetic */ ExpoReactHostDelegate(WeakReference weakReference, List list, String str, String str2, String str3, boolean z10, BindingsInstaller bindingsInstaller, ReactPackageTurboModuleManagerDelegate.Builder builder, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(weakReference, list, str, str2, (i10 & 16) != 0 ? null : str3, z10, (i10 & 64) != 0 ? null : bindingsInstaller, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new DefaultTurboModuleManagerDelegate.Builder() : builder, list2);
        }
    }
}
