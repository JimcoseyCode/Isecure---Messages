package com.facebook.react.bridge;

import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\n\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015J%\u0010\u001d\u001a\u00020\u001c\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\"J\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\f8F¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00060"}, d2 = {"Lcom/facebook/react/bridge/NativeModuleRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ModuleHolder;", "modules", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/Map;)V", "Lcom/facebook/react/bridge/JSInstance;", "jsInstance", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/JavaModuleWrapper;", "getJavaModules", "(Lcom/facebook/react/bridge/JSInstance;)Ljava/util/List;", "newRegister", "Li7/B;", "registerModules", "(Lcom/facebook/react/bridge/NativeModuleRegistry;)V", "notifyJSInstanceDestroy", "()V", "notifyJSInstanceInitialized", "onBatchComplete", "Lcom/facebook/react/bridge/NativeModule;", "T", "Ljava/lang/Class;", "moduleInterface", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasModule", "(Ljava/lang/Class;)Z", "getModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "name", "(Ljava/lang/String;)Z", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/Map;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getModuleMap", "()Ljava/util/Map;", "moduleMap", "getCxxModules", "()Ljava/util/List;", "cxxModules", "getAllModules", "allModules", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeModuleRegistry {
    private static final Companion Companion = new Companion(null);
    private final Map<String, ModuleHolder> modules;
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/NativeModuleRegistry$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("NativeModuleRegistry", LegacyArchitectureLogLevel.ERROR);
    }

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> modules) {
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        AbstractC2855l.g(modules, "modules");
        this.reactApplicationContext = reactApplicationContext;
        this.modules = modules;
    }

    private final Map<String, ModuleHolder> getModuleMap() {
        return this.modules;
    }

    public final List<NativeModule> getAllModules() {
        List listC = AbstractC2800q.c();
        Iterator<ModuleHolder> it = this.modules.values().iterator();
        while (it.hasNext()) {
            listC.add(it.next().getModule());
        }
        return AbstractC2800q.a(listC);
    }

    public final List<ModuleHolder> getCxxModules() {
        List listC = AbstractC2800q.c();
        Iterator<Map.Entry<String, ModuleHolder>> it = this.modules.entrySet().iterator();
        while (it.hasNext()) {
            ModuleHolder value = it.next().getValue();
            if (value.isCxxModule()) {
                listC.add(value);
            }
        }
        return AbstractC2800q.a(listC);
    }

    public final List<JavaModuleWrapper> getJavaModules(JSInstance jsInstance) {
        AbstractC2855l.g(jsInstance, "jsInstance");
        List listC = AbstractC2800q.c();
        Iterator<Map.Entry<String, ModuleHolder>> it = this.modules.entrySet().iterator();
        while (it.hasNext()) {
            ModuleHolder value = it.next().getValue();
            if (!value.isCxxModule()) {
                listC.add(new JavaModuleWrapper(jsInstance, value));
            }
        }
        return AbstractC2800q.a(listC);
    }

    public final <T extends NativeModule> T getModule(Class<T> moduleInterface) {
        AbstractC2855l.g(moduleInterface, "moduleInterface");
        ReactModule reactModule = (ReactModule) moduleInterface.getAnnotation(ReactModule.class);
        if (reactModule == null) {
            throw new IllegalArgumentException(("Could not find @ReactModule annotation in class " + moduleInterface.getName()).toString());
        }
        ModuleHolder moduleHolder = this.modules.get(reactModule.name());
        if (moduleHolder != null) {
            T t10 = (T) moduleHolder.getModule();
            AbstractC2855l.e(t10, "null cannot be cast to non-null type T of com.facebook.react.bridge.NativeModuleRegistry.getModule");
            return t10;
        }
        throw new IllegalStateException((reactModule + ".name could not be found. Is it defined in " + moduleInterface.getName()).toString());
    }

    public final <T extends NativeModule> boolean hasModule(Class<T> moduleInterface) {
        AbstractC2855l.g(moduleInterface, "moduleInterface");
        ReactModule reactModule = (ReactModule) moduleInterface.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return this.modules.containsKey(reactModule.name());
        }
        throw new IllegalArgumentException(("Could not find @ReactModule annotation in class " + moduleInterface.getName()).toString());
    }

    public final void notifyJSInstanceDestroy() {
        this.reactApplicationContext.assertOnNativeModulesQueueThread();
        B3.a.c(0L, "NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            Iterator<ModuleHolder> it = this.modules.values().iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        } finally {
            B3.a.i(0L);
        }
    }

    public final void notifyJSInstanceInitialized() {
        this.reactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        B3.a.c(0L, "NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            Iterator<ModuleHolder> it = this.modules.values().iterator();
            while (it.hasNext()) {
                it.next().markInitializable$ReactAndroid_release();
            }
        } finally {
            B3.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public final void onBatchComplete() {
        LegacyArchitectureLogger.assertLegacyArchitecture("NativeModuleRegistry.onBatchComplete()", LegacyArchitectureLogLevel.WARNING);
        ModuleHolder moduleHolder = this.modules.get(UIManagerModule.NAME);
        if (moduleHolder == null || !moduleHolder.hasInstance$ReactAndroid_release()) {
            return;
        }
        NativeModule module = moduleHolder.getModule();
        AbstractC2855l.e(module, "null cannot be cast to non-null type com.facebook.react.bridge.OnBatchCompleteListener");
        ((OnBatchCompleteListener) module).onBatchComplete();
    }

    public final void registerModules(NativeModuleRegistry newRegister) {
        AbstractC2855l.g(newRegister, "newRegister");
        if (!AbstractC2855l.b(this.reactApplicationContext, newRegister.reactApplicationContext)) {
            throw new IllegalStateException("Extending native modules with non-matching application contexts.");
        }
        for (Map.Entry<String, ModuleHolder> entry : newRegister.getModuleMap().entrySet()) {
            String key = entry.getKey();
            ModuleHolder value = entry.getValue();
            if (!this.modules.containsKey(key)) {
                this.modules.put(key, value);
            }
        }
    }

    public final boolean hasModule(String name) {
        AbstractC2855l.g(name, "name");
        return this.modules.containsKey(name);
    }

    public final NativeModule getModule(String name) {
        AbstractC2855l.g(name, "name");
        ModuleHolder moduleHolder = this.modules.get(name);
        if (moduleHolder != null) {
            return moduleHolder.getModule();
        }
        throw new IllegalStateException(("Could not find module with name " + name).toString());
    }
}
