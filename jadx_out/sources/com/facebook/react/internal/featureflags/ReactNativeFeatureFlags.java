package com.facebook.react.internal.featureflags;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b?\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0004H\u0007¢\u0006\u0004\b/\u0010\u0006J\u000f\u00100\u001a\u00020\u0004H\u0007¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u0010\u0006J\u000f\u00103\u001a\u00020\u0004H\u0007¢\u0006\u0004\b3\u0010\u0006J\u000f\u00104\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u0010\u0006J\u000f\u00105\u001a\u00020\u0004H\u0007¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\u0004H\u0007¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0004H\u0007¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\u0004H\u0007¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\u0004H\u0007¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010=\u001a\u00020\u0004H\u0007¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010>\u001a\u00020\u0004H\u0007¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\u0004H\u0007¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010@\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\u0004H\u0007¢\u0006\u0004\bA\u0010\u0006J\u000f\u0010B\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\u0004H\u0007¢\u0006\u0004\bC\u0010\u0006J\u000f\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0007¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u0004H\u0007¢\u0006\u0004\bH\u0010\u0006J\u000f\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bI\u0010\u0006J\u000f\u0010J\u001a\u00020\u0004H\u0007¢\u0006\u0004\bJ\u0010\u0006J\u000f\u0010K\u001a\u00020\u0004H\u0007¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010L\u001a\u00020\u0004H\u0007¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010M\u001a\u00020\u0004H\u0007¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\u0004H\u0007¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\u0004H\u0007¢\u0006\u0004\bO\u0010\u0006J\u000f\u0010P\u001a\u00020\u0004H\u0007¢\u0006\u0004\bP\u0010\u0006J\u000f\u0010Q\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010\u0006J\u000f\u0010R\u001a\u00020\u0004H\u0007¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\u0004H\u0007¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\u0004H\u0007¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\u0004H\u0007¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010V\u001a\u00020\u0004H\u0007¢\u0006\u0004\bV\u0010\u0006J\u000f\u0010W\u001a\u00020\u0004H\u0007¢\u0006\u0004\bW\u0010\u0006J\u000f\u0010X\u001a\u00020\u0004H\u0007¢\u0006\u0004\bX\u0010\u0006J\u000f\u0010Y\u001a\u00020\u0004H\u0007¢\u0006\u0004\bY\u0010\u0006J\u000f\u0010Z\u001a\u00020DH\u0007¢\u0006\u0004\bZ\u0010FJ\u000f\u0010[\u001a\u00020DH\u0007¢\u0006\u0004\b[\u0010FJ\u000f\u0010\\\u001a\u00020DH\u0007¢\u0006\u0004\b\\\u0010FJ\u0017\u0010`\u001a\u00020_2\u0006\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020_H\u0007¢\u0006\u0004\bb\u0010\u0003J\u0019\u0010d\u001a\u0004\u0018\u00010c2\u0006\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\bd\u0010eJ\u001d\u0010k\u001a\u00020_2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0fH\u0001¢\u0006\u0004\bi\u0010jR\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020g0f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "commonTestFlag", "()Z", "cdpInteractionMetricsEnabled", "cxxNativeAnimatedEnabled", "cxxNativeAnimatedRemoveJsSync", "disableEarlyViewCommandExecution", "disableFabricCommitInCXXAnimated", "disableMountItemReorderingAndroid", "disableOldAndroidAttachmentMetricsWorkarounds", "disableTextLayoutManagerCacheAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidLinearText", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDoubleMeasurementFixAndroid", "enableEagerMainQueueModulesOnIOS", "enableEagerRootViewAttachment", "enableFabricLogs", "enableFabricRenderer", "enableFontScaleChangesUpdatingLayout", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableImagePrefetchingOnUiThreadAndroid", "enableImmediateUpdateModeForContentOffsetChanges", "enableImperativeFocus", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableIntersectionObserverByDefault", "enableKeyEvents", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableNativeCSSParsing", "enableNetworkEventReporting", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableResourceTimingAPI", "enableSwiftUIBasedFilters", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForImage", "enableViewRecyclingForScrollView", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewClippingWithoutScrollViewClipping", "enableVirtualViewContainerStateExperimental", "enableVirtualViewDebugFeatures", "enableVirtualViewRenderState", "enableVirtualViewWindowFocusDetection", "enableWebPerformanceAPIsByDefault", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fuseboxAssertSingleHostState", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "hideOffscreenVirtualViewsOnIOS", "overrideBySynchronousMountPropsAtMountingAndroid", "perfIssuesEnabled", "perfMonitorV2Enabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "preparedTextCacheSize", "()D", "preventShadowTreeCommitExhaustion", "shouldPressibilityUseW3CPointerEventsForHover", "shouldTriggerResponderTransferOnScrollAndroid", "skipActivityIdentityAssertionOnHostPause", "sweepActiveTouchOnChildNativeGesturesAndroid", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeEqualsInNativeReadableArrayAndroid", "useNativeTransformHelperAndroid", "useNativeViewConfigsInBridgelessMode", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useSharedAnimatedBackend", "useTraitHiddenOnAndroid", "useTurboModuleInterop", "useTurboModules", "viewCullingOutsetRatio", "virtualViewHysteresisRatio", "virtualViewPrerenderRatio", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "provider", "Li7/B;", "override", "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V", "dangerouslyReset", PointerEventHelper.POINTER_TYPE_UNKNOWN, "dangerouslyForceOverride", "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)Ljava/lang/String;", "Lkotlin/Function0;", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;", "newAccessorProvider", "setAccessorProvider$ReactAndroid_release", "(Lw7/a;)V", "setAccessorProvider", "accessorProvider", "Lw7/a;", "accessor", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeFeatureFlags {
    public static final ReactNativeFeatureFlags INSTANCE = new ReactNativeFeatureFlags();
    private static ReactNativeFeatureFlagsAccessor accessor;
    private static InterfaceC3487a accessorProvider;

    static {
        InterfaceC3487a interfaceC3487a = new InterfaceC3487a() { // from class: r3.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ReactNativeFeatureFlags.accessorProvider$lambda$0();
            }
        };
        accessorProvider = interfaceC3487a;
        accessor = (ReactNativeFeatureFlagsAccessor) interfaceC3487a.invoke();
    }

    private ReactNativeFeatureFlags() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactNativeFeatureFlagsCxxAccessor accessorProvider$lambda$0() {
        return new ReactNativeFeatureFlagsCxxAccessor();
    }

    public static final boolean cdpInteractionMetricsEnabled() {
        return accessor.cdpInteractionMetricsEnabled();
    }

    public static final boolean commonTestFlag() {
        return accessor.commonTestFlag();
    }

    public static final boolean cxxNativeAnimatedEnabled() {
        return accessor.cxxNativeAnimatedEnabled();
    }

    public static final boolean cxxNativeAnimatedRemoveJsSync() {
        return accessor.cxxNativeAnimatedRemoveJsSync();
    }

    public static final String dangerouslyForceOverride(ReactNativeFeatureFlagsProvider provider) {
        AbstractC2855l.g(provider, "provider");
        ReactNativeFeatureFlagsAccessor reactNativeFeatureFlagsAccessor = (ReactNativeFeatureFlagsAccessor) accessorProvider.invoke();
        String strDangerouslyForceOverride = reactNativeFeatureFlagsAccessor.dangerouslyForceOverride(provider);
        accessor = reactNativeFeatureFlagsAccessor;
        return strDangerouslyForceOverride;
    }

    public static final void dangerouslyReset() {
        accessor.dangerouslyReset();
        accessor = (ReactNativeFeatureFlagsAccessor) accessorProvider.invoke();
    }

    public static final boolean disableEarlyViewCommandExecution() {
        return accessor.disableEarlyViewCommandExecution();
    }

    public static final boolean disableFabricCommitInCXXAnimated() {
        return accessor.disableFabricCommitInCXXAnimated();
    }

    public static final boolean disableMountItemReorderingAndroid() {
        return accessor.disableMountItemReorderingAndroid();
    }

    public static final boolean disableOldAndroidAttachmentMetricsWorkarounds() {
        return accessor.disableOldAndroidAttachmentMetricsWorkarounds();
    }

    public static final boolean disableTextLayoutManagerCacheAndroid() {
        return accessor.disableTextLayoutManagerCacheAndroid();
    }

    public static final boolean enableAccessibilityOrder() {
        return accessor.enableAccessibilityOrder();
    }

    public static final boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        return accessor.enableAccumulatedUpdatesInRawPropsAndroid();
    }

    public static final boolean enableAndroidLinearText() {
        return accessor.enableAndroidLinearText();
    }

    public static final boolean enableAndroidTextMeasurementOptimizations() {
        return accessor.enableAndroidTextMeasurementOptimizations();
    }

    public static final boolean enableBridgelessArchitecture() {
        return accessor.getNewArchitectureEnabled();
    }

    public static final boolean enableCppPropsIteratorSetter() {
        return accessor.enableCppPropsIteratorSetter();
    }

    public static final boolean enableCustomFocusSearchOnClippedElementsAndroid() {
        return accessor.enableCustomFocusSearchOnClippedElementsAndroid();
    }

    public static final boolean enableDestroyShadowTreeRevisionAsync() {
        return accessor.enableDestroyShadowTreeRevisionAsync();
    }

    public static final boolean enableDoubleMeasurementFixAndroid() {
        return accessor.enableDoubleMeasurementFixAndroid();
    }

    public static final boolean enableEagerMainQueueModulesOnIOS() {
        return accessor.enableEagerMainQueueModulesOnIOS();
    }

    public static final boolean enableEagerRootViewAttachment() {
        return accessor.enableEagerRootViewAttachment();
    }

    public static final boolean enableFabricLogs() {
        return accessor.enableFabricLogs();
    }

    public static final boolean enableFabricRenderer() {
        return accessor.enableFabricRenderer();
    }

    public static final boolean enableFontScaleChangesUpdatingLayout() {
        return accessor.enableFontScaleChangesUpdatingLayout();
    }

    public static final boolean enableIOSTextBaselineOffsetPerLine() {
        return accessor.enableIOSTextBaselineOffsetPerLine();
    }

    public static final boolean enableIOSViewClipToPaddingBox() {
        return accessor.enableIOSViewClipToPaddingBox();
    }

    public static final boolean enableImagePrefetchingAndroid() {
        return accessor.enableImagePrefetchingAndroid();
    }

    public static final boolean enableImagePrefetchingOnUiThreadAndroid() {
        return accessor.enableImagePrefetchingOnUiThreadAndroid();
    }

    public static final boolean enableImmediateUpdateModeForContentOffsetChanges() {
        return accessor.enableImmediateUpdateModeForContentOffsetChanges();
    }

    public static final boolean enableImperativeFocus() {
        return accessor.enableImperativeFocus();
    }

    public static final boolean enableInteropViewManagerClassLookUpOptimizationIOS() {
        return accessor.enableInteropViewManagerClassLookUpOptimizationIOS();
    }

    public static final boolean enableIntersectionObserverByDefault() {
        return accessor.enableIntersectionObserverByDefault();
    }

    public static final boolean enableKeyEvents() {
        return accessor.enableKeyEvents();
    }

    public static final boolean enableLayoutAnimationsOnAndroid() {
        return accessor.enableLayoutAnimationsOnAndroid();
    }

    public static final boolean enableLayoutAnimationsOnIOS() {
        return accessor.enableLayoutAnimationsOnIOS();
    }

    public static final boolean enableMainQueueCoordinatorOnIOS() {
        return accessor.enableMainQueueCoordinatorOnIOS();
    }

    public static final boolean enableModuleArgumentNSNullConversionIOS() {
        return accessor.enableModuleArgumentNSNullConversionIOS();
    }

    public static final boolean enableNativeCSSParsing() {
        return accessor.enableNativeCSSParsing();
    }

    public static final boolean enableNetworkEventReporting() {
        return accessor.enableNetworkEventReporting();
    }

    public static final boolean enablePreparedTextLayout() {
        return accessor.enablePreparedTextLayout();
    }

    public static final boolean enablePropsUpdateReconciliationAndroid() {
        return accessor.enablePropsUpdateReconciliationAndroid();
    }

    public static final boolean enableResourceTimingAPI() {
        return accessor.enableResourceTimingAPI();
    }

    public static final boolean enableSwiftUIBasedFilters() {
        return accessor.enableSwiftUIBasedFilters();
    }

    public static final boolean enableViewCulling() {
        return accessor.enableViewCulling();
    }

    public static final boolean enableViewRecycling() {
        return accessor.enableViewRecycling();
    }

    public static final boolean enableViewRecyclingForImage() {
        return accessor.enableViewRecyclingForImage();
    }

    public static final boolean enableViewRecyclingForScrollView() {
        return accessor.enableViewRecyclingForScrollView();
    }

    public static final boolean enableViewRecyclingForText() {
        return accessor.enableViewRecyclingForText();
    }

    public static final boolean enableViewRecyclingForView() {
        return accessor.enableViewRecyclingForView();
    }

    public static final boolean enableVirtualViewClippingWithoutScrollViewClipping() {
        return accessor.enableVirtualViewClippingWithoutScrollViewClipping();
    }

    public static final boolean enableVirtualViewContainerStateExperimental() {
        return accessor.enableVirtualViewContainerStateExperimental();
    }

    public static final boolean enableVirtualViewDebugFeatures() {
        return accessor.enableVirtualViewDebugFeatures();
    }

    public static final boolean enableVirtualViewRenderState() {
        return accessor.enableVirtualViewRenderState();
    }

    public static final boolean enableVirtualViewWindowFocusDetection() {
        return accessor.enableVirtualViewWindowFocusDetection();
    }

    public static final boolean enableWebPerformanceAPIsByDefault() {
        return accessor.enableWebPerformanceAPIsByDefault();
    }

    public static final boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        return accessor.fixMappingOfEventPrioritiesBetweenFabricAndReact();
    }

    public static final boolean fuseboxAssertSingleHostState() {
        return accessor.fuseboxAssertSingleHostState();
    }

    public static final boolean fuseboxEnabledRelease() {
        return accessor.fuseboxEnabledRelease();
    }

    public static final boolean fuseboxNetworkInspectionEnabled() {
        return accessor.fuseboxNetworkInspectionEnabled();
    }

    public static final boolean hideOffscreenVirtualViewsOnIOS() {
        return accessor.hideOffscreenVirtualViewsOnIOS();
    }

    public static final void override(ReactNativeFeatureFlagsProvider provider) {
        AbstractC2855l.g(provider, "provider");
        accessor.override(provider);
    }

    public static final boolean overrideBySynchronousMountPropsAtMountingAndroid() {
        return accessor.overrideBySynchronousMountPropsAtMountingAndroid();
    }

    public static final boolean perfIssuesEnabled() {
        return accessor.perfIssuesEnabled();
    }

    public static final boolean perfMonitorV2Enabled() {
        return accessor.perfMonitorV2Enabled();
    }

    public static final double preparedTextCacheSize() {
        return accessor.preparedTextCacheSize();
    }

    public static final boolean preventShadowTreeCommitExhaustion() {
        return accessor.preventShadowTreeCommitExhaustion();
    }

    public static final boolean shouldPressibilityUseW3CPointerEventsForHover() {
        return accessor.shouldPressibilityUseW3CPointerEventsForHover();
    }

    public static final boolean shouldTriggerResponderTransferOnScrollAndroid() {
        return accessor.shouldTriggerResponderTransferOnScrollAndroid();
    }

    public static final boolean skipActivityIdentityAssertionOnHostPause() {
        return accessor.skipActivityIdentityAssertionOnHostPause();
    }

    public static final boolean sweepActiveTouchOnChildNativeGesturesAndroid() {
        return accessor.sweepActiveTouchOnChildNativeGesturesAndroid();
    }

    public static final boolean traceTurboModulePromiseRejectionsOnAndroid() {
        return accessor.traceTurboModulePromiseRejectionsOnAndroid();
    }

    public static final boolean updateRuntimeShadowNodeReferencesOnCommit() {
        return accessor.updateRuntimeShadowNodeReferencesOnCommit();
    }

    public static final boolean useAlwaysAvailableJSErrorHandling() {
        return accessor.useAlwaysAvailableJSErrorHandling();
    }

    public static final boolean useFabricInterop() {
        return accessor.useFabricInterop();
    }

    public static final boolean useNativeEqualsInNativeReadableArrayAndroid() {
        return accessor.useNativeEqualsInNativeReadableArrayAndroid();
    }

    public static final boolean useNativeTransformHelperAndroid() {
        return accessor.useNativeTransformHelperAndroid();
    }

    public static final boolean useNativeViewConfigsInBridgelessMode() {
        return accessor.useNativeViewConfigsInBridgelessMode();
    }

    public static final boolean useOptimizedEventBatchingOnAndroid() {
        return accessor.useOptimizedEventBatchingOnAndroid();
    }

    public static final boolean useRawPropsJsiValue() {
        return accessor.useRawPropsJsiValue();
    }

    public static final boolean useShadowNodeStateOnClone() {
        return accessor.useShadowNodeStateOnClone();
    }

    public static final boolean useSharedAnimatedBackend() {
        return accessor.useSharedAnimatedBackend();
    }

    public static final boolean useTraitHiddenOnAndroid() {
        return accessor.useTraitHiddenOnAndroid();
    }

    public static final boolean useTurboModuleInterop() {
        return accessor.useTurboModuleInterop();
    }

    public static final boolean useTurboModules() {
        return accessor.useTurboModules();
    }

    public static final double viewCullingOutsetRatio() {
        return accessor.viewCullingOutsetRatio();
    }

    public static final double virtualViewHysteresisRatio() {
        return accessor.virtualViewHysteresisRatio();
    }

    public static final double virtualViewPrerenderRatio() {
        return accessor.virtualViewPrerenderRatio();
    }

    public final void setAccessorProvider$ReactAndroid_release(InterfaceC3487a newAccessorProvider) {
        AbstractC2855l.g(newAccessorProvider, "newAccessorProvider");
        accessorProvider = newAccessorProvider;
        accessor = (ReactNativeFeatureFlagsAccessor) newAccessorProvider.invoke();
    }
}
