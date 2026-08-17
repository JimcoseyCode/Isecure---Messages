package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/NativeModuleRegistryBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/ReactInstanceManager;", "reactInstanceManager", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/ReactInstanceManager;)V", "Lcom/facebook/react/ReactPackage;", "reactPackage", "Li7/B;", "processPackage", "(Lcom/facebook/react/ReactPackage;)V", "Lcom/facebook/react/bridge/NativeModuleRegistry;", "build", "()Lcom/facebook/react/bridge/NativeModuleRegistry;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/HashMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ModuleHolder;", "Lkotlin/collections/HashMap;", "modules", "Ljava/util/HashMap;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeModuleRegistryBuilder {
    private static final Companion Companion = new Companion(null);
    private final HashMap<String, ModuleHolder> modules;
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/NativeModuleRegistryBuilder$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("NativeModuleRegistryBuilder", LegacyArchitectureLogLevel.ERROR);
    }

    public NativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext) {
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        this.reactApplicationContext = reactApplicationContext;
        this.modules = new HashMap<>();
    }

    public final NativeModuleRegistry build() {
        return new NativeModuleRegistry(this.reactApplicationContext, this.modules);
    }

    public final void processPackage(ReactPackage reactPackage) {
        AbstractC2855l.g(reactPackage, "reactPackage");
        for (ModuleHolder moduleHolder : reactPackage instanceof LazyReactPackage ? ((LazyReactPackage) reactPackage).getNativeModuleIterator(this.reactApplicationContext) : reactPackage instanceof BaseReactPackage ? ((BaseReactPackage) reactPackage).getNativeModuleIterator$ReactAndroid_release(this.reactApplicationContext) : ReactPackageHelper.INSTANCE.getNativeModuleIterator(reactPackage, this.reactApplicationContext)) {
            String name = moduleHolder.getName();
            ModuleHolder moduleHolder2 = this.modules.get(name);
            if (moduleHolder2 != null && !moduleHolder.getCanOverrideExistingModule()) {
                throw new IllegalStateException(("\nNative module " + name + " tried to override " + moduleHolder2.getClassName() + ".\n\nCheck the getPackages() method in MainApplication.java, it might be that module is being created twice.\nIf this was your intention, set canOverrideExistingModule=true. This error may also be present if the\npackage is present only once in getPackages() but is also automatically added later during build time\nby autolinking. Try removing the existing entry and rebuild.\n").toString());
            }
            this.modules.put(name, moduleHolder);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        this(reactApplicationContext);
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        AbstractC2855l.g(reactInstanceManager, "reactInstanceManager");
    }
}
