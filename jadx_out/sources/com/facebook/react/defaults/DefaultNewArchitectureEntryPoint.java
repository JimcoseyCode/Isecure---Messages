package com.facebook.react.defaults;

import com.facebook.react.common.ReleaseLevel;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Experimental_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import i7.t;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\bJ#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\nJ-\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0003\u001a\u0004\b%\u0010#R\u001a\u0010)\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010#R\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010#¨\u0006,"}, d2 = {"Lcom/facebook/react/defaults/DefaultNewArchitectureEntryPoint;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Li7/B;", "load", PointerEventHelper.POINTER_TYPE_UNKNOWN, "turboModulesEnabled", "(Z)V", "fabricEnabled", "(ZZ)V", "bridgelessEnabled", "(ZZZ)V", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "featureFlags", "loadWithFeatureFlags$ReactAndroid_release", "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V", "loadWithFeatureFlags", "Lkotlin/Pair;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isConfigurationValid", "(ZZZ)Lkotlin/Pair;", "Lcom/facebook/react/common/ReleaseLevel;", "releaseLevel", "Lcom/facebook/react/common/ReleaseLevel;", "getReleaseLevel", "()Lcom/facebook/react/common/ReleaseLevel;", "setReleaseLevel", "(Lcom/facebook/react/common/ReleaseLevel;)V", "privateFabricEnabled", "Z", "privateTurboModulesEnabled", "privateConcurrentReactEnabled", "privateBridgelessEnabled", "getFabricEnabled", "()Z", "getFabricEnabled$annotations", "getTurboModulesEnabled", "getTurboModulesEnabled$annotations", "getConcurrentReactEnabled", "getConcurrentReactEnabled$annotations", "concurrentReactEnabled", "getBridgelessEnabled", "getBridgelessEnabled$annotations", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultNewArchitectureEntryPoint {
    private static boolean privateBridgelessEnabled;
    private static boolean privateConcurrentReactEnabled;
    private static boolean privateFabricEnabled;
    private static boolean privateTurboModulesEnabled;
    public static final DefaultNewArchitectureEntryPoint INSTANCE = new DefaultNewArchitectureEntryPoint();
    private static ReleaseLevel releaseLevel = ReleaseLevel.STABLE;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReleaseLevel.values().length];
            try {
                iArr[ReleaseLevel.EXPERIMENTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReleaseLevel.CANARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReleaseLevel.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DefaultNewArchitectureEntryPoint() {
    }

    public static final boolean getBridgelessEnabled() {
        return privateBridgelessEnabled;
    }

    public static final boolean getConcurrentReactEnabled() {
        return privateConcurrentReactEnabled;
    }

    public static final boolean getFabricEnabled() {
        return privateFabricEnabled;
    }

    public static final boolean getTurboModulesEnabled() {
        return privateTurboModulesEnabled;
    }

    public static final void load() {
        load(true, true, true);
    }

    public static /* synthetic */ void load$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        load(z10);
    }

    public static final void loadWithFeatureFlags$ReactAndroid_release(ReactNativeFeatureFlagsProvider featureFlags) {
        AbstractC2855l.g(featureFlags, "featureFlags");
        ReactNativeFeatureFlags.override(featureFlags);
        privateFabricEnabled = featureFlags.enableFabricRenderer();
        privateTurboModulesEnabled = featureFlags.useTurboModules();
        privateConcurrentReactEnabled = featureFlags.enableFabricRenderer();
        boolean newArchitectureEnabled = featureFlags.getNewArchitectureEnabled();
        privateBridgelessEnabled = newArchitectureEnabled;
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(privateTurboModulesEnabled, privateFabricEnabled, newArchitectureEnabled);
        boolean zBooleanValue = ((Boolean) pairIsConfigurationValid.getFirst()).booleanValue();
        String str = (String) pairIsConfigurationValid.getSecond();
        if (!zBooleanValue) {
            throw new IllegalStateException(str.toString());
        }
        DefaultSoLoader.maybeLoadSoLibrary();
    }

    public final ReleaseLevel getReleaseLevel() {
        return releaseLevel;
    }

    @VisibleForTesting
    public final Pair<Boolean, String> isConfigurationValid(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        if (turboModulesEnabled && fabricEnabled && bridgelessEnabled) {
            return t.a(Boolean.TRUE, PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
        return t.a(Boolean.FALSE, "You cannot load React Native with the New Architecture disabled. Please use DefaultNewArchitectureEntryPoint.load() instead of DefaultNewArchitectureEntryPoint.load(turboModulesEnabled=" + turboModulesEnabled + ", fabricEnabled=" + fabricEnabled + ", bridgelessEnabled=" + bridgelessEnabled + ")");
    }

    public final void setReleaseLevel(ReleaseLevel releaseLevel2) {
        AbstractC2855l.g(releaseLevel2, "<set-?>");
        releaseLevel = releaseLevel2;
    }

    public static final void load(boolean turboModulesEnabled) {
        load(turboModulesEnabled, true, true);
    }

    public static /* synthetic */ void load$default(boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        load(z10, z11);
    }

    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled) {
        load(turboModulesEnabled, fabricEnabled, true);
    }

    public static /* synthetic */ void load$default(boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        load(z10, z11, z12);
    }

    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(turboModulesEnabled, fabricEnabled, bridgelessEnabled);
        boolean zBooleanValue = ((Boolean) pairIsConfigurationValid.getFirst()).booleanValue();
        String str = (String) pairIsConfigurationValid.getSecond();
        if (zBooleanValue) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[releaseLevel.ordinal()];
            if (i10 == 1) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Experimental_Android());
            } else if (i10 == 2) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android());
            } else if (i10 == 3) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android());
            } else {
                throw new C2750m();
            }
            privateFabricEnabled = fabricEnabled;
            privateTurboModulesEnabled = turboModulesEnabled;
            privateConcurrentReactEnabled = fabricEnabled;
            privateBridgelessEnabled = bridgelessEnabled;
            DefaultSoLoader.maybeLoadSoLibrary();
            return;
        }
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ void getBridgelessEnabled$annotations() {
    }

    public static /* synthetic */ void getConcurrentReactEnabled$annotations() {
    }

    public static /* synthetic */ void getFabricEnabled$annotations() {
    }

    public static /* synthetic */ void getTurboModulesEnabled$annotations() {
    }
}
