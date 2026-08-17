package com.facebook.react.internal.featureflags;

import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeNewArchitectureFeatureFlags;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "enableBridgelessArchitecture", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enableFabricRenderer", "useFabricInterop", "useTurboModuleInterop", "useTurboModules", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeNewArchitectureFeatureFlags {
    public static final ReactNativeNewArchitectureFeatureFlags INSTANCE = new ReactNativeNewArchitectureFeatureFlags();

    private ReactNativeNewArchitectureFeatureFlags() {
    }

    public static final boolean enableBridgelessArchitecture() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.enableBridgelessArchitecture();
        }
        AbstractC3007a.b(ReactNativeFeatureFlags.enableBridgelessArchitecture(), "ReactNativeFeatureFlags.enableBridgelessArchitecture() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean enableFabricRenderer() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.enableFabricRenderer();
        }
        AbstractC3007a.b(ReactNativeFeatureFlags.enableFabricRenderer(), "ReactNativeFeatureFlags.enableFabricRenderer() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean useFabricInterop() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useFabricInterop();
        }
        AbstractC3007a.b(!ReactNativeFeatureFlags.useFabricInterop(), "ReactNativeFeatureFlags.useFabricInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean useTurboModuleInterop() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useTurboModuleInterop();
        }
        AbstractC3007a.b(!ReactNativeFeatureFlags.useTurboModuleInterop(), "ReactNativeFeatureFlags.useTurboModuleInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean useTurboModules() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useTurboModules();
        }
        AbstractC3007a.b(ReactNativeFeatureFlags.useTurboModules(), "ReactNativeFeatureFlags.useTurboModules() should be set to TRUE when Strict Mode is enabled");
        return true;
    }
}
