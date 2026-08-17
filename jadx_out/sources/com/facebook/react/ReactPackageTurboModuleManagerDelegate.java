package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0002*+B\u001f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB'\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R,\u0010&\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020%0$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/ReactPackage;", "packages", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Lcom/facebook/jni/HybridData;)V", "Li7/B;", "initialize", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldSupportLegacyPackages", "()Z", "unstable_shouldEnableLegacyModuleInterop", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleName", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "getModule", "(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "unstable_isModuleRegistered", "(Ljava/lang/String;)Z", "unstable_isLegacyModuleRegistered", "Lcom/facebook/react/bridge/NativeModule;", "getLegacyModule", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "getEagerInitModuleNames", "()Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$ModuleProvider;", "moduleProviders", "Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/module/model/ReactModuleInfo;", "packageModuleInfos", "Ljava/util/Map;", "shouldEnableLegacyModuleInterop", "Z", "ModuleProvider", "Builder", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactPackageTurboModuleManagerDelegate extends TurboModuleManagerDelegate {
    private final List<ModuleProvider> moduleProviders;
    private final Map<ModuleProvider, Map<String, ReactModuleInfo>> packageModuleInfos;
    private final boolean shouldEnableLegacyModuleInterop;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H$J\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "packages", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/ReactPackage;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "setPackages", "setReactApplicationContext", "build", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Builder {
        private ReactApplicationContext context;
        private List<? extends ReactPackage> packages;

        public final ReactPackageTurboModuleManagerDelegate build() {
            ReactApplicationContext reactApplicationContext = this.context;
            if (reactApplicationContext == null) {
                throw new IllegalArgumentException("The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            }
            List<? extends ReactPackage> list = this.packages;
            if (list != null) {
                return build(reactApplicationContext, list);
            }
            throw new IllegalArgumentException("A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
        }

        protected abstract ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext context, List<? extends ReactPackage> packages);

        public final Builder setPackages(List<? extends ReactPackage> packages) {
            AbstractC2855l.g(packages, "packages");
            this.packages = AbstractC2800q.P0(packages);
            return this;
        }

        public final Builder setReactApplicationContext(ReactApplicationContext context) {
            this.context = context;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$ModuleProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getModule", "Lcom/facebook/react/bridge/NativeModule;", "moduleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ModuleProvider {
        NativeModule getModule(String moduleName);
    }

    protected ReactPackageTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> packages) {
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        AbstractC2855l.g(packages, "packages");
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        this.shouldEnableLegacyModuleInterop = ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && ReactNativeNewArchitectureFeatureFlags.useTurboModuleInterop();
        initialize(reactApplicationContext, packages);
    }

    private final void initialize(final ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> packages) {
        String name;
        ReactModuleInfo reactModuleInfo;
        for (final ReactPackage reactPackage : packages) {
            if (reactPackage instanceof BaseReactPackage) {
                ModuleProvider moduleProvider = new ModuleProvider() { // from class: com.facebook.react.u
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public final NativeModule getModule(String str) {
                        return ReactPackageTurboModuleManagerDelegate.initialize$lambda$0(reactPackage, reactApplicationContext, str);
                    }
                };
                this.moduleProviders.add(moduleProvider);
                this.packageModuleInfos.put(moduleProvider, ((BaseReactPackage) reactPackage).getReactModuleInfoProvider().getReactModuleInfos());
            } else if (shouldSupportLegacyPackages() && (reactPackage instanceof LazyReactPackage)) {
                LazyReactPackage lazyReactPackage = (LazyReactPackage) reactPackage;
                List<ModuleSpec> listInternal_getNativeModules$ReactAndroid_release = lazyReactPackage.internal_getNativeModules$ReactAndroid_release(reactApplicationContext);
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (ModuleSpec moduleSpec : listInternal_getNativeModules$ReactAndroid_release) {
                    linkedHashMap.put(moduleSpec.getName(), moduleSpec.getProvider());
                }
                ModuleProvider moduleProvider2 = new ModuleProvider() { // from class: com.facebook.react.v
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public final NativeModule getModule(String str) {
                        return ReactPackageTurboModuleManagerDelegate.initialize$lambda$1(linkedHashMap, str);
                    }
                };
                this.moduleProviders.add(moduleProvider2);
                this.packageModuleInfos.put(moduleProvider2, lazyReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            } else if (shouldSupportLegacyPackages()) {
                List<NativeModule> listCreateNativeModules = reactPackage.createNativeModules(reactApplicationContext);
                final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (NativeModule nativeModule : listCreateNativeModules) {
                    Class<?> cls = nativeModule.getClass();
                    ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                    if (reactModule == null || (name = reactModule.name()) == null) {
                        name = nativeModule.getName();
                        AbstractC2855l.f(name, "getName(...)");
                    }
                    String str = name;
                    if (reactModule != null) {
                        String name2 = cls.getName();
                        AbstractC2855l.f(name2, "getName(...)");
                        reactModuleInfo = new ReactModuleInfo(str, name2, reactModule.canOverrideExistingModule(), true, reactModule.isCxxModule(), ReactModuleInfo.INSTANCE.classIsTurboModule(cls));
                    } else {
                        String name3 = cls.getName();
                        AbstractC2855l.f(name3, "getName(...)");
                        reactModuleInfo = new ReactModuleInfo(str, name3, nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.INSTANCE.classIsTurboModule(cls));
                    }
                    linkedHashMap3.put(str, reactModuleInfo);
                    linkedHashMap2.put(str, nativeModule);
                }
                ModuleProvider moduleProvider3 = new ModuleProvider() { // from class: com.facebook.react.w
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public final NativeModule getModule(String str2) {
                        return ReactPackageTurboModuleManagerDelegate.initialize$lambda$2(linkedHashMap2, str2);
                    }
                };
                this.moduleProviders.add(moduleProvider3);
                this.packageModuleInfos.put(moduleProvider3, linkedHashMap3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule initialize$lambda$0(ReactPackage reactPackage, ReactApplicationContext reactApplicationContext, String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        return ((BaseReactPackage) reactPackage).getModule(moduleName, reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule initialize$lambda$1(Map map, String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        Provider provider = (Provider) map.get(moduleName);
        if (provider != null) {
            return (NativeModule) provider.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule initialize$lambda$2(Map map, String module) {
        AbstractC2855l.g(module, "module");
        return (NativeModule) map.get(module);
    }

    private final boolean shouldSupportLegacyPackages() {
        return getShouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        Collection<ReactModuleInfo> collectionJ;
        List listC = AbstractC2800q.c();
        Iterator<ModuleProvider> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            if (map == null || (collectionJ = map.values()) == null) {
                collectionJ = AbstractC2800q.j();
            }
            for (ReactModuleInfo reactModuleInfo : collectionJ) {
                if (reactModuleInfo.getIsTurboModule() && reactModuleInfo.getNeedsEagerInit()) {
                    listC.add(reactModuleInfo.getName());
                }
            }
        }
        return AbstractC2800q.a(listC);
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public NativeModule getLegacyModule(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        if (!getShouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (ModuleProvider moduleProvider : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(moduleProvider);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.getIsTurboModule() && (nativeModule == null || reactModuleInfo.getCanOverrideExistingModule())) {
                NativeModule module = moduleProvider.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        NativeModule nativeModule = null;
        for (ModuleProvider moduleProvider : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(moduleProvider);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.getIsTurboModule() && (nativeModule == null || reactModuleInfo.getCanOverrideExistingModule())) {
                NativeModule module = moduleProvider.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        AbstractC2855l.e(nativeModule, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.interfaces.TurboModule");
        return (TurboModule) nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        Iterator<ModuleProvider> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.getIsTurboModule()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        Iterator<ModuleProvider> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.getIsTurboModule()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    /* JADX INFO: renamed from: unstable_shouldEnableLegacyModuleInterop, reason: from getter */
    public boolean getShouldEnableLegacyModuleInterop() {
        return this.shouldEnableLegacyModuleInterop;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected ReactPackageTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> packages, HybridData hybridData) {
        super(hybridData);
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        AbstractC2855l.g(packages, "packages");
        AbstractC2855l.g(hybridData, "hybridData");
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        this.shouldEnableLegacyModuleInterop = ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && ReactNativeNewArchitectureFeatureFlags.useTurboModuleInterop();
        initialize(reactApplicationContext, packages);
    }
}
