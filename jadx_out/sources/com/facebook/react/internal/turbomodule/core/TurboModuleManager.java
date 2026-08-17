package com.facebook.react.internal.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.internal.turbomodule.core.TurboModuleInteropUtils;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import d2.AbstractC2325a;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0007\u0018\u0000 K2\u00020\u0001:\u0003LMKB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J2\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0082 ¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010\u0016J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u0010\u0010J\u000f\u00100\u001a\u00020+H\u0016¢\u0006\u0004\b0\u00101R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R \u00104\u001a\b\u0012\u0004\u0012\u00020\f038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e0A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bD\u0010E\u0012\u0004\bF\u00101R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00140G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "delegate", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "nativeMethodCallInvokerHolder", "<init>", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isTurboModule", "(Ljava/lang/String;)Z", "isLegacyModule", "shouldEnableLegacyModuleInterop", "()Z", "Lcom/facebook/react/bridge/NativeModule;", "getLegacyJavaModule", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/CxxModuleWrapper;", "getLegacyCxxModule", "(Ljava/lang/String;)Lcom/facebook/react/bridge/CxxModuleWrapper;", "getTurboLegacyCxxModule", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "getTurboJavaModule", "(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;", "moduleHolder", "shouldPerfLog", "getOrCreateModule", "(Ljava/lang/String;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;Z)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "nativeMethodCallInvoker", "tmmDelegate", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;)Lcom/facebook/jni/HybridData;", "shouldCreateLegacyModules", "Li7/B;", "installJSIBindings", "(Z)V", "getModule", "hasModule", "invalidate", "()V", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eagerInitModuleNames", "Ljava/util/List;", "getEagerInitModuleNames", "()Ljava/util/List;", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "turboModuleProvider", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "legacyModuleProvider", "Ljava/lang/Object;", "moduleCleanupLock", "Ljava/lang/Object;", "moduleCleanupStarted", "Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleHolders", "Ljava/util/Map;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getModules", "()Ljava/util/Collection;", "modules", "Companion", "ModuleHolder", "ModuleProvider", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurboModuleManager implements TurboModuleRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "TurboModuleManager";
    private final TurboModuleManagerDelegate delegate;
    private final List<String> eagerInitModuleNames;
    private final ModuleProvider legacyModuleProvider;
    private final HybridData mHybridData;
    private final Object moduleCleanupLock;
    private boolean moduleCleanupStarted;
    private final Map<String, ModuleHolder> moduleHolders;
    private final ModuleProvider turboModuleProvider;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getMethodDescriptorsFromModule", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/NativeModule;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule module) {
            return TurboModuleInteropUtils.getMethodDescriptorsFromModule(module);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Li7/B;", "startCreatingModule", "endCreatingModule", "Lcom/facebook/react/bridge/NativeModule;", "module", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "()Lcom/facebook/react/bridge/NativeModule;", "setModule", "(Lcom/facebook/react/bridge/NativeModule;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "isCreatingModule", "Z", "()Z", "isDoneCreatingModule", PointerEventHelper.POINTER_TYPE_UNKNOWN, "moduleId", "I", "getModuleId", "()I", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ModuleHolder {
        private static volatile int holderCount;
        private volatile boolean isCreatingModule;
        private volatile boolean isDoneCreatingModule;
        private volatile NativeModule module;
        private volatile int moduleId = holderCount;

        public ModuleHolder() {
            holderCount++;
        }

        public final void endCreatingModule() {
            this.isCreatingModule = false;
            this.isDoneCreatingModule = true;
        }

        public final NativeModule getModule() {
            return this.module;
        }

        public final int getModuleId() {
            return this.moduleId;
        }

        /* JADX INFO: renamed from: isCreatingModule, reason: from getter */
        public final boolean getIsCreatingModule() {
            return this.isCreatingModule;
        }

        /* JADX INFO: renamed from: isDoneCreatingModule, reason: from getter */
        public final boolean getIsDoneCreatingModule() {
            return this.isDoneCreatingModule;
        }

        public final void setModule(NativeModule nativeModule) {
            this.module = nativeModule;
        }

        public final void startCreatingModule() {
            this.isCreatingModule = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getModule", "Lcom/facebook/react/bridge/NativeModule;", "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    interface ModuleProvider {
        NativeModule getModule(String name);
    }

    static {
        SoLoader.t("turbomodulejsijni");
    }

    public TurboModuleManager(RuntimeExecutor runtimeExecutor, TurboModuleManagerDelegate turboModuleManagerDelegate, CallInvokerHolder jsCallInvokerHolder, NativeMethodCallInvokerHolder nativeMethodCallInvokerHolder) {
        List<String> eagerInitModuleNames;
        AbstractC2855l.g(runtimeExecutor, "runtimeExecutor");
        AbstractC2855l.g(jsCallInvokerHolder, "jsCallInvokerHolder");
        AbstractC2855l.g(nativeMethodCallInvokerHolder, "nativeMethodCallInvokerHolder");
        this.delegate = turboModuleManagerDelegate;
        this.moduleCleanupLock = new Object();
        this.moduleHolders = new LinkedHashMap();
        this.mHybridData = initHybrid(runtimeExecutor, (CallInvokerHolderImpl) jsCallInvokerHolder, (NativeMethodCallInvokerHolderImpl) nativeMethodCallInvokerHolder, turboModuleManagerDelegate);
        installJSIBindings(shouldEnableLegacyModuleInterop());
        this.eagerInitModuleNames = (turboModuleManagerDelegate == null || (eagerInitModuleNames = turboModuleManagerDelegate.getEagerInitModuleNames()) == null) ? AbstractC2800q.j() : eagerInitModuleNames;
        ModuleProvider moduleProvider = new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.a
            @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
            public final NativeModule getModule(String str) {
                return TurboModuleManager._init_$lambda$0(str);
            }
        };
        this.turboModuleProvider = turboModuleManagerDelegate == null ? moduleProvider : new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.b
            @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
            public final NativeModule getModule(String str) {
                return TurboModuleManager._init_$lambda$1(this.f20400a, str);
            }
        };
        if (turboModuleManagerDelegate != null && shouldEnableLegacyModuleInterop()) {
            moduleProvider = new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.c
                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    return TurboModuleManager._init_$lambda$3(this.f20401a, str);
                }
            };
        }
        this.legacyModuleProvider = moduleProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$0(String str) {
        AbstractC2855l.g(str, "<unused var>");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$1(TurboModuleManager turboModuleManager, String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        return (NativeModule) turboModuleManager.delegate.getModule(moduleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$3(TurboModuleManager turboModuleManager, String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        NativeModule legacyModule = turboModuleManager.delegate.getLegacyModule(moduleName);
        if (legacyModule == null) {
            return null;
        }
        if (!(legacyModule instanceof TurboModule)) {
            return legacyModule;
        }
        throw new IllegalArgumentException(("NativeModule \"" + moduleName + "\" is a TurboModule").toString());
    }

    private final CxxModuleWrapper getLegacyCxxModule(String moduleName) {
        if (!isLegacyModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if (!(module instanceof CxxModuleWrapper) || (module instanceof TurboModule)) {
            return null;
        }
        return (CxxModuleWrapper) module;
    }

    private final NativeModule getLegacyJavaModule(String moduleName) {
        if (!isLegacyModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) || (module instanceof TurboModule)) {
            return null;
        }
        return module;
    }

    private static final List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule nativeModule) {
        return INSTANCE.getMethodDescriptorsFromModule(nativeModule);
    }

    private final NativeModule getOrCreateModule(String moduleName, ModuleHolder moduleHolder, boolean shouldPerfLog) {
        boolean z10;
        NativeModule module;
        synchronized (moduleHolder) {
            try {
                if (moduleHolder.getIsDoneCreatingModule()) {
                    if (shouldPerfLog) {
                        TurboModulePerfLogger.moduleCreateCacheHit(moduleName, moduleHolder.getModuleId());
                    }
                    return moduleHolder.getModule();
                }
                boolean z11 = false;
                if (moduleHolder.getIsCreatingModule()) {
                    z10 = false;
                } else {
                    moduleHolder.startCreatingModule();
                    z10 = true;
                }
                C2735B c2735b = C2735B.f28704a;
                if (!z10) {
                    synchronized (moduleHolder) {
                        while (moduleHolder.getIsCreatingModule()) {
                            try {
                                AbstractC2855l.e(moduleHolder, "null cannot be cast to non-null type java.lang.Object");
                                moduleHolder.wait();
                            } catch (InterruptedException unused) {
                                z11 = true;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                        module = moduleHolder.getModule();
                    }
                    return module;
                }
                TurboModulePerfLogger.moduleCreateConstructStart(moduleName, moduleHolder.getModuleId());
                NativeModule module2 = this.turboModuleProvider.getModule(moduleName);
                if (module2 == null) {
                    module2 = this.legacyModuleProvider.getModule(moduleName);
                }
                TurboModulePerfLogger.moduleCreateConstructEnd(moduleName, moduleHolder.getModuleId());
                TurboModulePerfLogger.moduleCreateSetUpStart(moduleName, moduleHolder.getModuleId());
                if (module2 != null) {
                    synchronized (moduleHolder) {
                        moduleHolder.setModule(module2);
                    }
                    module2.initialize();
                } else {
                    AbstractC2325a.o(TAG, "getOrCreateModule(): Unable to create module \"%s\" (legacy: %b, turbo: %b)", moduleName, Boolean.valueOf(isLegacyModule(moduleName)), Boolean.valueOf(isTurboModule(moduleName)));
                }
                TurboModulePerfLogger.moduleCreateSetUpEnd(moduleName, moduleHolder.getModuleId());
                synchronized (moduleHolder) {
                    moduleHolder.endCreatingModule();
                    AbstractC2855l.e(moduleHolder, "null cannot be cast to non-null type java.lang.Object");
                    moduleHolder.notifyAll();
                }
                return module2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final TurboModule getTurboJavaModule(String moduleName) {
        if (!isTurboModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) || !(module instanceof TurboModule)) {
            return null;
        }
        return (TurboModule) module;
    }

    private final CxxModuleWrapper getTurboLegacyCxxModule(String moduleName) {
        if (!isTurboModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) && (module instanceof TurboModule)) {
            return (CxxModuleWrapper) module;
        }
        return null;
    }

    private final native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl jsCallInvokerHolder, NativeMethodCallInvokerHolderImpl nativeMethodCallInvoker, TurboModuleManagerDelegate tmmDelegate);

    private final native void installJSIBindings(boolean shouldCreateLegacyModules);

    private final boolean isLegacyModule(String moduleName) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isLegacyModuleRegistered(moduleName);
    }

    private final boolean isTurboModule(String moduleName) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isModuleRegistered(moduleName);
    }

    private final boolean shouldEnableLegacyModuleInterop() {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.getShouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public List<String> getEagerInitModuleNames() {
        return this.eagerInitModuleNames;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public NativeModule getModule(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        synchronized (this.moduleCleanupLock) {
            if (this.moduleCleanupStarted) {
                AbstractC2325a.o(TAG, "getModule(): Tried to get module \"%s\", but TurboModuleManager was tearing down (legacy: %b, turbo: %b)", moduleName, Boolean.valueOf(isLegacyModule(moduleName)), Boolean.valueOf(isTurboModule(moduleName)));
                return null;
            }
            if (!this.moduleHolders.containsKey(moduleName)) {
                this.moduleHolders.put(moduleName, new ModuleHolder());
            }
            ModuleHolder moduleHolder = this.moduleHolders.get(moduleName);
            C2735B c2735b = C2735B.f28704a;
            if (moduleHolder == null) {
                AbstractC2325a.o(TAG, "getModule(): Tried to get module \"%s\", but moduleHolder was null", moduleName);
                return null;
            }
            ModuleHolder moduleHolder2 = moduleHolder;
            TurboModulePerfLogger.moduleCreateStart(moduleName, moduleHolder2.getModuleId());
            NativeModule orCreateModule = getOrCreateModule(moduleName, moduleHolder2, true);
            if (orCreateModule != null) {
                TurboModulePerfLogger.moduleCreateEnd(moduleName, moduleHolder2.getModuleId());
                return orCreateModule;
            }
            TurboModulePerfLogger.moduleCreateFail(moduleName, moduleHolder2.getModuleId());
            return orCreateModule;
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public Collection<NativeModule> getModules() {
        List<ModuleHolder> listP0;
        NativeModule module;
        synchronized (this.moduleCleanupLock) {
            listP0 = AbstractC2800q.P0(this.moduleHolders.values());
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder moduleHolder : listP0) {
            synchronized (listP0) {
                module = moduleHolder.getModule();
            }
            if (module != null) {
                arrayList.add(module);
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public boolean hasModule(String moduleName) {
        ModuleHolder moduleHolder;
        boolean z10;
        AbstractC2855l.g(moduleName, "moduleName");
        synchronized (this.moduleCleanupLock) {
            moduleHolder = this.moduleHolders.get(moduleName);
        }
        if (moduleHolder == null) {
            return false;
        }
        synchronized (moduleHolder) {
            z10 = moduleHolder.getModule() != null;
        }
        return z10;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public void invalidate() {
        synchronized (this.moduleCleanupLock) {
            this.moduleCleanupStarted = true;
            C2735B c2735b = C2735B.f28704a;
        }
        for (Map.Entry<String, ModuleHolder> entry : this.moduleHolders.entrySet()) {
            NativeModule orCreateModule = getOrCreateModule(entry.getKey(), entry.getValue(), false);
            if (orCreateModule != null) {
                orCreateModule.invalidate();
            }
        }
        this.moduleHolders.clear();
        this.mHybridData.resetNative();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }
}
