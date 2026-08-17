.class public final Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008?\n\u0002\u0010\u0006\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u0010\u0010\u000c\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u000c\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0010\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0012\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0013\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0014\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0015\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0016\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0017\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0018\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0019\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u001a\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u001b\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u001c\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u001d\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u001e\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u001f\u0010\u0006J\u0010\u0010 \u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008 \u0010\u0006J\u0010\u0010!\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008!\u0010\u0006J\u0010\u0010\"\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\"\u0010\u0006J\u0010\u0010#\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008#\u0010\u0006J\u0010\u0010$\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008$\u0010\u0006J\u0010\u0010%\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008%\u0010\u0006J\u0010\u0010&\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008&\u0010\u0006J\u0010\u0010\'\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\'\u0010\u0006J\u0010\u0010(\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008(\u0010\u0006J\u0010\u0010)\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008)\u0010\u0006J\u0010\u0010*\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008*\u0010\u0006J\u0010\u0010+\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008+\u0010\u0006J\u0010\u0010,\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008,\u0010\u0006J\u0010\u0010-\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008-\u0010\u0006J\u0010\u0010.\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008.\u0010\u0006J\u0010\u0010/\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008/\u0010\u0006J\u0010\u00100\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00080\u0010\u0006J\u0010\u00101\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00081\u0010\u0006J\u0010\u00102\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00082\u0010\u0006J\u0010\u00103\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00083\u0010\u0006J\u0010\u00104\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00084\u0010\u0006J\u0010\u00105\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00085\u0010\u0006J\u0010\u00106\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00086\u0010\u0006J\u0010\u00107\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00087\u0010\u0006J\u0010\u00108\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00088\u0010\u0006J\u0010\u00109\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u00089\u0010\u0006J\u0010\u0010:\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008:\u0010\u0006J\u0010\u0010;\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008;\u0010\u0006J\u0010\u0010<\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008<\u0010\u0006J\u0010\u0010=\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008=\u0010\u0006J\u0010\u0010>\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008>\u0010\u0006J\u0010\u0010?\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008?\u0010\u0006J\u0010\u0010@\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008@\u0010\u0006J\u0010\u0010A\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008A\u0010\u0006J\u0010\u0010B\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008B\u0010\u0006J\u0010\u0010C\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008C\u0010\u0006J\u0010\u0010E\u001a\u00020DH\u0087 \u00a2\u0006\u0004\u0008E\u0010FJ\u0010\u0010G\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008G\u0010\u0006J\u0010\u0010H\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008H\u0010\u0006J\u0010\u0010I\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008I\u0010\u0006J\u0010\u0010J\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008J\u0010\u0006J\u0010\u0010K\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008K\u0010\u0006J\u0010\u0010L\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008L\u0010\u0006J\u0010\u0010M\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008M\u0010\u0006J\u0010\u0010N\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008N\u0010\u0006J\u0010\u0010O\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008O\u0010\u0006J\u0010\u0010P\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008P\u0010\u0006J\u0010\u0010Q\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008Q\u0010\u0006J\u0010\u0010R\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008R\u0010\u0006J\u0010\u0010S\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008S\u0010\u0006J\u0010\u0010T\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008T\u0010\u0006J\u0010\u0010U\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008U\u0010\u0006J\u0010\u0010V\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008V\u0010\u0006J\u0010\u0010W\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008W\u0010\u0006J\u0010\u0010X\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008X\u0010\u0006J\u0010\u0010Y\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008Y\u0010\u0006J\u0010\u0010Z\u001a\u00020DH\u0087 \u00a2\u0006\u0004\u0008Z\u0010FJ\u0010\u0010[\u001a\u00020DH\u0087 \u00a2\u0006\u0004\u0008[\u0010FJ\u0010\u0010\\\u001a\u00020DH\u0087 \u00a2\u0006\u0004\u0008\\\u0010FJ\u0018\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\u0001H\u0087 \u00a2\u0006\u0004\u0008_\u0010`J\u0010\u0010a\u001a\u00020^H\u0087 \u00a2\u0006\u0004\u0008a\u0010\u0003J\u001a\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010]\u001a\u00020\u0001H\u0087 \u00a2\u0006\u0004\u0008c\u0010d\u00a8\u0006e"
    }
    d2 = {
        "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;",
        "",
        "<init>",
        "()V",
        "",
        "commonTestFlag",
        "()Z",
        "cdpInteractionMetricsEnabled",
        "cxxNativeAnimatedEnabled",
        "cxxNativeAnimatedRemoveJsSync",
        "disableEarlyViewCommandExecution",
        "disableFabricCommitInCXXAnimated",
        "disableMountItemReorderingAndroid",
        "disableOldAndroidAttachmentMetricsWorkarounds",
        "disableTextLayoutManagerCacheAndroid",
        "enableAccessibilityOrder",
        "enableAccumulatedUpdatesInRawPropsAndroid",
        "enableAndroidLinearText",
        "enableAndroidTextMeasurementOptimizations",
        "enableBridgelessArchitecture",
        "enableCppPropsIteratorSetter",
        "enableCustomFocusSearchOnClippedElementsAndroid",
        "enableDestroyShadowTreeRevisionAsync",
        "enableDoubleMeasurementFixAndroid",
        "enableEagerMainQueueModulesOnIOS",
        "enableEagerRootViewAttachment",
        "enableFabricLogs",
        "enableFabricRenderer",
        "enableFontScaleChangesUpdatingLayout",
        "enableIOSTextBaselineOffsetPerLine",
        "enableIOSViewClipToPaddingBox",
        "enableImagePrefetchingAndroid",
        "enableImagePrefetchingOnUiThreadAndroid",
        "enableImmediateUpdateModeForContentOffsetChanges",
        "enableImperativeFocus",
        "enableInteropViewManagerClassLookUpOptimizationIOS",
        "enableIntersectionObserverByDefault",
        "enableKeyEvents",
        "enableLayoutAnimationsOnAndroid",
        "enableLayoutAnimationsOnIOS",
        "enableMainQueueCoordinatorOnIOS",
        "enableModuleArgumentNSNullConversionIOS",
        "enableNativeCSSParsing",
        "enableNetworkEventReporting",
        "enablePreparedTextLayout",
        "enablePropsUpdateReconciliationAndroid",
        "enableResourceTimingAPI",
        "enableSwiftUIBasedFilters",
        "enableViewCulling",
        "enableViewRecycling",
        "enableViewRecyclingForImage",
        "enableViewRecyclingForScrollView",
        "enableViewRecyclingForText",
        "enableViewRecyclingForView",
        "enableVirtualViewClippingWithoutScrollViewClipping",
        "enableVirtualViewContainerStateExperimental",
        "enableVirtualViewDebugFeatures",
        "enableVirtualViewRenderState",
        "enableVirtualViewWindowFocusDetection",
        "enableWebPerformanceAPIsByDefault",
        "fixMappingOfEventPrioritiesBetweenFabricAndReact",
        "fuseboxAssertSingleHostState",
        "fuseboxEnabledRelease",
        "fuseboxNetworkInspectionEnabled",
        "hideOffscreenVirtualViewsOnIOS",
        "overrideBySynchronousMountPropsAtMountingAndroid",
        "perfIssuesEnabled",
        "perfMonitorV2Enabled",
        "",
        "preparedTextCacheSize",
        "()D",
        "preventShadowTreeCommitExhaustion",
        "shouldPressibilityUseW3CPointerEventsForHover",
        "shouldTriggerResponderTransferOnScrollAndroid",
        "skipActivityIdentityAssertionOnHostPause",
        "sweepActiveTouchOnChildNativeGesturesAndroid",
        "traceTurboModulePromiseRejectionsOnAndroid",
        "updateRuntimeShadowNodeReferencesOnCommit",
        "useAlwaysAvailableJSErrorHandling",
        "useFabricInterop",
        "useNativeEqualsInNativeReadableArrayAndroid",
        "useNativeTransformHelperAndroid",
        "useNativeViewConfigsInBridgelessMode",
        "useOptimizedEventBatchingOnAndroid",
        "useRawPropsJsiValue",
        "useShadowNodeStateOnClone",
        "useSharedAnimatedBackend",
        "useTraitHiddenOnAndroid",
        "useTurboModuleInterop",
        "useTurboModules",
        "viewCullingOutsetRatio",
        "virtualViewHysteresisRatio",
        "virtualViewPrerenderRatio",
        "provider",
        "Li7/B;",
        "override",
        "(Ljava/lang/Object;)V",
        "dangerouslyReset",
        "",
        "dangerouslyForceOverride",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;->INSTANCE:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;

    .line 7
    .line 8
    const-string v0, "react_featureflagsjni"

    .line 9
    .line 10
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final native cdpInteractionMetricsEnabled()Z
.end method

.method public static final native commonTestFlag()Z
.end method

.method public static final native cxxNativeAnimatedEnabled()Z
.end method

.method public static final native cxxNativeAnimatedRemoveJsSync()Z
.end method

.method public static final native dangerouslyForceOverride(Ljava/lang/Object;)Ljava/lang/String;
.end method

.method public static final native dangerouslyReset()V
.end method

.method public static final native disableEarlyViewCommandExecution()Z
.end method

.method public static final native disableFabricCommitInCXXAnimated()Z
.end method

.method public static final native disableMountItemReorderingAndroid()Z
.end method

.method public static final native disableOldAndroidAttachmentMetricsWorkarounds()Z
.end method

.method public static final native disableTextLayoutManagerCacheAndroid()Z
.end method

.method public static final native enableAccessibilityOrder()Z
.end method

.method public static final native enableAccumulatedUpdatesInRawPropsAndroid()Z
.end method

.method public static final native enableAndroidLinearText()Z
.end method

.method public static final native enableAndroidTextMeasurementOptimizations()Z
.end method

.method public static final native enableBridgelessArchitecture()Z
.end method

.method public static final native enableCppPropsIteratorSetter()Z
.end method

.method public static final native enableCustomFocusSearchOnClippedElementsAndroid()Z
.end method

.method public static final native enableDestroyShadowTreeRevisionAsync()Z
.end method

.method public static final native enableDoubleMeasurementFixAndroid()Z
.end method

.method public static final native enableEagerMainQueueModulesOnIOS()Z
.end method

.method public static final native enableEagerRootViewAttachment()Z
.end method

.method public static final native enableFabricLogs()Z
.end method

.method public static final native enableFabricRenderer()Z
.end method

.method public static final native enableFontScaleChangesUpdatingLayout()Z
.end method

.method public static final native enableIOSTextBaselineOffsetPerLine()Z
.end method

.method public static final native enableIOSViewClipToPaddingBox()Z
.end method

.method public static final native enableImagePrefetchingAndroid()Z
.end method

.method public static final native enableImagePrefetchingOnUiThreadAndroid()Z
.end method

.method public static final native enableImmediateUpdateModeForContentOffsetChanges()Z
.end method

.method public static final native enableImperativeFocus()Z
.end method

.method public static final native enableInteropViewManagerClassLookUpOptimizationIOS()Z
.end method

.method public static final native enableIntersectionObserverByDefault()Z
.end method

.method public static final native enableKeyEvents()Z
.end method

.method public static final native enableLayoutAnimationsOnAndroid()Z
.end method

.method public static final native enableLayoutAnimationsOnIOS()Z
.end method

.method public static final native enableMainQueueCoordinatorOnIOS()Z
.end method

.method public static final native enableModuleArgumentNSNullConversionIOS()Z
.end method

.method public static final native enableNativeCSSParsing()Z
.end method

.method public static final native enableNetworkEventReporting()Z
.end method

.method public static final native enablePreparedTextLayout()Z
.end method

.method public static final native enablePropsUpdateReconciliationAndroid()Z
.end method

.method public static final native enableResourceTimingAPI()Z
.end method

.method public static final native enableSwiftUIBasedFilters()Z
.end method

.method public static final native enableViewCulling()Z
.end method

.method public static final native enableViewRecycling()Z
.end method

.method public static final native enableViewRecyclingForImage()Z
.end method

.method public static final native enableViewRecyclingForScrollView()Z
.end method

.method public static final native enableViewRecyclingForText()Z
.end method

.method public static final native enableViewRecyclingForView()Z
.end method

.method public static final native enableVirtualViewClippingWithoutScrollViewClipping()Z
.end method

.method public static final native enableVirtualViewContainerStateExperimental()Z
.end method

.method public static final native enableVirtualViewDebugFeatures()Z
.end method

.method public static final native enableVirtualViewRenderState()Z
.end method

.method public static final native enableVirtualViewWindowFocusDetection()Z
.end method

.method public static final native enableWebPerformanceAPIsByDefault()Z
.end method

.method public static final native fixMappingOfEventPrioritiesBetweenFabricAndReact()Z
.end method

.method public static final native fuseboxAssertSingleHostState()Z
.end method

.method public static final native fuseboxEnabledRelease()Z
.end method

.method public static final native fuseboxNetworkInspectionEnabled()Z
.end method

.method public static final native hideOffscreenVirtualViewsOnIOS()Z
.end method

.method public static final native override(Ljava/lang/Object;)V
.end method

.method public static final native overrideBySynchronousMountPropsAtMountingAndroid()Z
.end method

.method public static final native perfIssuesEnabled()Z
.end method

.method public static final native perfMonitorV2Enabled()Z
.end method

.method public static final native preparedTextCacheSize()D
.end method

.method public static final native preventShadowTreeCommitExhaustion()Z
.end method

.method public static final native shouldPressibilityUseW3CPointerEventsForHover()Z
.end method

.method public static final native shouldTriggerResponderTransferOnScrollAndroid()Z
.end method

.method public static final native skipActivityIdentityAssertionOnHostPause()Z
.end method

.method public static final native sweepActiveTouchOnChildNativeGesturesAndroid()Z
.end method

.method public static final native traceTurboModulePromiseRejectionsOnAndroid()Z
.end method

.method public static final native updateRuntimeShadowNodeReferencesOnCommit()Z
.end method

.method public static final native useAlwaysAvailableJSErrorHandling()Z
.end method

.method public static final native useFabricInterop()Z
.end method

.method public static final native useNativeEqualsInNativeReadableArrayAndroid()Z
.end method

.method public static final native useNativeTransformHelperAndroid()Z
.end method

.method public static final native useNativeViewConfigsInBridgelessMode()Z
.end method

.method public static final native useOptimizedEventBatchingOnAndroid()Z
.end method

.method public static final native useRawPropsJsiValue()Z
.end method

.method public static final native useShadowNodeStateOnClone()Z
.end method

.method public static final native useSharedAnimatedBackend()Z
.end method

.method public static final native useTraitHiddenOnAndroid()Z
.end method

.method public static final native useTurboModuleInterop()Z
.end method

.method public static final native useTurboModules()Z
.end method

.method public static final native viewCullingOutsetRatio()D
.end method

.method public static final native virtualViewHysteresisRatio()D
.end method

.method public static final native virtualViewPrerenderRatio()D
.end method
