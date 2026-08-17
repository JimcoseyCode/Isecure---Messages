package com.facebook.react.internal.featureflags;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b?\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0010\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0013\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0016\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0019\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001a\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001b\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001c\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001d\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001e\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001f\u0010\u0006J\u0010\u0010 \u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b \u0010\u0006J\u0010\u0010!\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b!\u0010\u0006J\u0010\u0010\"\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\"\u0010\u0006J\u0010\u0010#\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b#\u0010\u0006J\u0010\u0010$\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b$\u0010\u0006J\u0010\u0010%\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b%\u0010\u0006J\u0010\u0010&\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b&\u0010\u0006J\u0010\u0010'\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b'\u0010\u0006J\u0010\u0010(\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b(\u0010\u0006J\u0010\u0010)\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b)\u0010\u0006J\u0010\u0010*\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b*\u0010\u0006J\u0010\u0010+\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b+\u0010\u0006J\u0010\u0010,\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b,\u0010\u0006J\u0010\u0010-\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b-\u0010\u0006J\u0010\u0010.\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b.\u0010\u0006J\u0010\u0010/\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b/\u0010\u0006J\u0010\u00100\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b0\u0010\u0006J\u0010\u00101\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b1\u0010\u0006J\u0010\u00102\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b2\u0010\u0006J\u0010\u00103\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b3\u0010\u0006J\u0010\u00104\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b4\u0010\u0006J\u0010\u00105\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b5\u0010\u0006J\u0010\u00106\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b6\u0010\u0006J\u0010\u00107\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b7\u0010\u0006J\u0010\u00108\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b8\u0010\u0006J\u0010\u00109\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b9\u0010\u0006J\u0010\u0010:\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b:\u0010\u0006J\u0010\u0010;\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b;\u0010\u0006J\u0010\u0010<\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b<\u0010\u0006J\u0010\u0010=\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b=\u0010\u0006J\u0010\u0010>\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b>\u0010\u0006J\u0010\u0010?\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b?\u0010\u0006J\u0010\u0010@\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b@\u0010\u0006J\u0010\u0010A\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bA\u0010\u0006J\u0010\u0010B\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bB\u0010\u0006J\u0010\u0010C\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bC\u0010\u0006J\u0010\u0010E\u001a\u00020DH\u0087 ¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bG\u0010\u0006J\u0010\u0010H\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bH\u0010\u0006J\u0010\u0010I\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bI\u0010\u0006J\u0010\u0010J\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bJ\u0010\u0006J\u0010\u0010K\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bK\u0010\u0006J\u0010\u0010L\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bL\u0010\u0006J\u0010\u0010M\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bM\u0010\u0006J\u0010\u0010N\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bN\u0010\u0006J\u0010\u0010O\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bO\u0010\u0006J\u0010\u0010P\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bP\u0010\u0006J\u0010\u0010Q\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bQ\u0010\u0006J\u0010\u0010R\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bR\u0010\u0006J\u0010\u0010S\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bS\u0010\u0006J\u0010\u0010T\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bT\u0010\u0006J\u0010\u0010U\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bU\u0010\u0006J\u0010\u0010V\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bV\u0010\u0006J\u0010\u0010W\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bW\u0010\u0006J\u0010\u0010X\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bX\u0010\u0006J\u0010\u0010Y\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bY\u0010\u0006J\u0010\u0010Z\u001a\u00020DH\u0087 ¢\u0006\u0004\bZ\u0010FJ\u0010\u0010[\u001a\u00020DH\u0087 ¢\u0006\u0004\b[\u0010FJ\u0010\u0010\\\u001a\u00020DH\u0087 ¢\u0006\u0004\b\\\u0010FJ\u0018\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\u0001H\u0087 ¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020^H\u0087 ¢\u0006\u0004\ba\u0010\u0003J\u001a\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010]\u001a\u00020\u0001H\u0087 ¢\u0006\u0004\bc\u0010d¨\u0006e"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "commonTestFlag", "()Z", "cdpInteractionMetricsEnabled", "cxxNativeAnimatedEnabled", "cxxNativeAnimatedRemoveJsSync", "disableEarlyViewCommandExecution", "disableFabricCommitInCXXAnimated", "disableMountItemReorderingAndroid", "disableOldAndroidAttachmentMetricsWorkarounds", "disableTextLayoutManagerCacheAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidLinearText", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDoubleMeasurementFixAndroid", "enableEagerMainQueueModulesOnIOS", "enableEagerRootViewAttachment", "enableFabricLogs", "enableFabricRenderer", "enableFontScaleChangesUpdatingLayout", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableImagePrefetchingOnUiThreadAndroid", "enableImmediateUpdateModeForContentOffsetChanges", "enableImperativeFocus", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableIntersectionObserverByDefault", "enableKeyEvents", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableNativeCSSParsing", "enableNetworkEventReporting", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableResourceTimingAPI", "enableSwiftUIBasedFilters", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForImage", "enableViewRecyclingForScrollView", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewClippingWithoutScrollViewClipping", "enableVirtualViewContainerStateExperimental", "enableVirtualViewDebugFeatures", "enableVirtualViewRenderState", "enableVirtualViewWindowFocusDetection", "enableWebPerformanceAPIsByDefault", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fuseboxAssertSingleHostState", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "hideOffscreenVirtualViewsOnIOS", "overrideBySynchronousMountPropsAtMountingAndroid", "perfIssuesEnabled", "perfMonitorV2Enabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "preparedTextCacheSize", "()D", "preventShadowTreeCommitExhaustion", "shouldPressibilityUseW3CPointerEventsForHover", "shouldTriggerResponderTransferOnScrollAndroid", "skipActivityIdentityAssertionOnHostPause", "sweepActiveTouchOnChildNativeGesturesAndroid", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeEqualsInNativeReadableArrayAndroid", "useNativeTransformHelperAndroid", "useNativeViewConfigsInBridgelessMode", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useSharedAnimatedBackend", "useTraitHiddenOnAndroid", "useTurboModuleInterop", "useTurboModules", "viewCullingOutsetRatio", "virtualViewHysteresisRatio", "virtualViewPrerenderRatio", "provider", "Li7/B;", "override", "(Ljava/lang/Object;)V", "dangerouslyReset", PointerEventHelper.POINTER_TYPE_UNKNOWN, "dangerouslyForceOverride", "(Ljava/lang/Object;)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeFeatureFlagsCxxInterop {
    public static final ReactNativeFeatureFlagsCxxInterop INSTANCE = new ReactNativeFeatureFlagsCxxInterop();

    static {
        SoLoader.t("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    public static final native boolean cdpInteractionMetricsEnabled();

    public static final native boolean commonTestFlag();

    public static final native boolean cxxNativeAnimatedEnabled();

    public static final native boolean cxxNativeAnimatedRemoveJsSync();

    public static final native String dangerouslyForceOverride(Object provider);

    public static final native void dangerouslyReset();

    public static final native boolean disableEarlyViewCommandExecution();

    public static final native boolean disableFabricCommitInCXXAnimated();

    public static final native boolean disableMountItemReorderingAndroid();

    public static final native boolean disableOldAndroidAttachmentMetricsWorkarounds();

    public static final native boolean disableTextLayoutManagerCacheAndroid();

    public static final native boolean enableAccessibilityOrder();

    public static final native boolean enableAccumulatedUpdatesInRawPropsAndroid();

    public static final native boolean enableAndroidLinearText();

    public static final native boolean enableAndroidTextMeasurementOptimizations();

    public static final native boolean enableBridgelessArchitecture();

    public static final native boolean enableCppPropsIteratorSetter();

    public static final native boolean enableCustomFocusSearchOnClippedElementsAndroid();

    public static final native boolean enableDestroyShadowTreeRevisionAsync();

    public static final native boolean enableDoubleMeasurementFixAndroid();

    public static final native boolean enableEagerMainQueueModulesOnIOS();

    public static final native boolean enableEagerRootViewAttachment();

    public static final native boolean enableFabricLogs();

    public static final native boolean enableFabricRenderer();

    public static final native boolean enableFontScaleChangesUpdatingLayout();

    public static final native boolean enableIOSTextBaselineOffsetPerLine();

    public static final native boolean enableIOSViewClipToPaddingBox();

    public static final native boolean enableImagePrefetchingAndroid();

    public static final native boolean enableImagePrefetchingOnUiThreadAndroid();

    public static final native boolean enableImmediateUpdateModeForContentOffsetChanges();

    public static final native boolean enableImperativeFocus();

    public static final native boolean enableInteropViewManagerClassLookUpOptimizationIOS();

    public static final native boolean enableIntersectionObserverByDefault();

    public static final native boolean enableKeyEvents();

    public static final native boolean enableLayoutAnimationsOnAndroid();

    public static final native boolean enableLayoutAnimationsOnIOS();

    public static final native boolean enableMainQueueCoordinatorOnIOS();

    public static final native boolean enableModuleArgumentNSNullConversionIOS();

    public static final native boolean enableNativeCSSParsing();

    public static final native boolean enableNetworkEventReporting();

    public static final native boolean enablePreparedTextLayout();

    public static final native boolean enablePropsUpdateReconciliationAndroid();

    public static final native boolean enableResourceTimingAPI();

    public static final native boolean enableSwiftUIBasedFilters();

    public static final native boolean enableViewCulling();

    public static final native boolean enableViewRecycling();

    public static final native boolean enableViewRecyclingForImage();

    public static final native boolean enableViewRecyclingForScrollView();

    public static final native boolean enableViewRecyclingForText();

    public static final native boolean enableViewRecyclingForView();

    public static final native boolean enableVirtualViewClippingWithoutScrollViewClipping();

    public static final native boolean enableVirtualViewContainerStateExperimental();

    public static final native boolean enableVirtualViewDebugFeatures();

    public static final native boolean enableVirtualViewRenderState();

    public static final native boolean enableVirtualViewWindowFocusDetection();

    public static final native boolean enableWebPerformanceAPIsByDefault();

    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    public static final native boolean fuseboxAssertSingleHostState();

    public static final native boolean fuseboxEnabledRelease();

    public static final native boolean fuseboxNetworkInspectionEnabled();

    public static final native boolean hideOffscreenVirtualViewsOnIOS();

    public static final native void override(Object provider);

    public static final native boolean overrideBySynchronousMountPropsAtMountingAndroid();

    public static final native boolean perfIssuesEnabled();

    public static final native boolean perfMonitorV2Enabled();

    public static final native double preparedTextCacheSize();

    public static final native boolean preventShadowTreeCommitExhaustion();

    public static final native boolean shouldPressibilityUseW3CPointerEventsForHover();

    public static final native boolean shouldTriggerResponderTransferOnScrollAndroid();

    public static final native boolean skipActivityIdentityAssertionOnHostPause();

    public static final native boolean sweepActiveTouchOnChildNativeGesturesAndroid();

    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    public static final native boolean updateRuntimeShadowNodeReferencesOnCommit();

    public static final native boolean useAlwaysAvailableJSErrorHandling();

    public static final native boolean useFabricInterop();

    public static final native boolean useNativeEqualsInNativeReadableArrayAndroid();

    public static final native boolean useNativeTransformHelperAndroid();

    public static final native boolean useNativeViewConfigsInBridgelessMode();

    public static final native boolean useOptimizedEventBatchingOnAndroid();

    public static final native boolean useRawPropsJsiValue();

    public static final native boolean useShadowNodeStateOnClone();

    public static final native boolean useSharedAnimatedBackend();

    public static final native boolean useTraitHiddenOnAndroid();

    public static final native boolean useTurboModuleInterop();

    public static final native boolean useTurboModules();

    public static final native double viewCullingOutsetRatio();

    public static final native double virtualViewHysteresisRatio();

    public static final native double virtualViewPrerenderRatio();
}
