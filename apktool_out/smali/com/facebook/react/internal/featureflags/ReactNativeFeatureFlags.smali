.class public final Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008?\n\u0002\u0010\u0006\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u000f\u0010\u000c\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008 \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008&\u0010\u0006J\u000f\u0010\'\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008/\u0010\u0006J\u000f\u00100\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00080\u0010\u0006J\u000f\u00101\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00081\u0010\u0006J\u000f\u00102\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00082\u0010\u0006J\u000f\u00103\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00083\u0010\u0006J\u000f\u00104\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00084\u0010\u0006J\u000f\u00105\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00085\u0010\u0006J\u000f\u00106\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00086\u0010\u0006J\u000f\u00107\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00087\u0010\u0006J\u000f\u00108\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00088\u0010\u0006J\u000f\u00109\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00089\u0010\u0006J\u000f\u0010:\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008:\u0010\u0006J\u000f\u0010;\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008;\u0010\u0006J\u000f\u0010<\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008<\u0010\u0006J\u000f\u0010=\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008=\u0010\u0006J\u000f\u0010>\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008>\u0010\u0006J\u000f\u0010?\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008?\u0010\u0006J\u000f\u0010@\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008@\u0010\u0006J\u000f\u0010A\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008A\u0010\u0006J\u000f\u0010B\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008B\u0010\u0006J\u000f\u0010C\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008C\u0010\u0006J\u000f\u0010E\u001a\u00020DH\u0007\u00a2\u0006\u0004\u0008E\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008G\u0010\u0006J\u000f\u0010H\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008H\u0010\u0006J\u000f\u0010I\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008I\u0010\u0006J\u000f\u0010J\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008J\u0010\u0006J\u000f\u0010K\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008K\u0010\u0006J\u000f\u0010L\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008L\u0010\u0006J\u000f\u0010M\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008M\u0010\u0006J\u000f\u0010N\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008N\u0010\u0006J\u000f\u0010O\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008O\u0010\u0006J\u000f\u0010P\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008P\u0010\u0006J\u000f\u0010Q\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008Q\u0010\u0006J\u000f\u0010R\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008R\u0010\u0006J\u000f\u0010S\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008S\u0010\u0006J\u000f\u0010T\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008T\u0010\u0006J\u000f\u0010U\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008U\u0010\u0006J\u000f\u0010V\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008V\u0010\u0006J\u000f\u0010W\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008W\u0010\u0006J\u000f\u0010X\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008X\u0010\u0006J\u000f\u0010Y\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008Y\u0010\u0006J\u000f\u0010Z\u001a\u00020DH\u0007\u00a2\u0006\u0004\u0008Z\u0010FJ\u000f\u0010[\u001a\u00020DH\u0007\u00a2\u0006\u0004\u0008[\u0010FJ\u000f\u0010\\\u001a\u00020DH\u0007\u00a2\u0006\u0004\u0008\\\u0010FJ\u0017\u0010`\u001a\u00020_2\u0006\u0010^\u001a\u00020]H\u0007\u00a2\u0006\u0004\u0008`\u0010aJ\u000f\u0010b\u001a\u00020_H\u0007\u00a2\u0006\u0004\u0008b\u0010\u0003J\u0019\u0010d\u001a\u0004\u0018\u00010c2\u0006\u0010^\u001a\u00020]H\u0007\u00a2\u0006\u0004\u0008d\u0010eJ\u001d\u0010k\u001a\u00020_2\u000c\u0010h\u001a\u0008\u0012\u0004\u0012\u00020g0fH\u0001\u00a2\u0006\u0004\u0008i\u0010jR\u001c\u0010l\u001a\u0008\u0012\u0004\u0012\u00020g0f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0016\u0010n\u001a\u00020g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008n\u0010o\u00a8\u0006p"
    }
    d2 = {
        "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;",
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
        "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;",
        "provider",
        "Li7/B;",
        "override",
        "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V",
        "dangerouslyReset",
        "",
        "dangerouslyForceOverride",
        "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)Ljava/lang/String;",
        "Lkotlin/Function0;",
        "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;",
        "newAccessorProvider",
        "setAccessorProvider$ReactAndroid_release",
        "(Lw7/a;)V",
        "setAccessorProvider",
        "accessorProvider",
        "Lw7/a;",
        "accessor",
        "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;",
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
.field public static final INSTANCE:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;

.field private static accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

.field private static accessorProvider:Lw7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->INSTANCE:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;

    .line 7
    .line 8
    new-instance v0, Lr3/a;

    .line 9
    .line 10
    invoke-direct {v0}, Lr3/a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessorProvider:Lw7/a;

    .line 14
    .line 15
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 20
    .line 21
    sput-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 22
    .line 23
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

.method public static synthetic a()Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxAccessor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessorProvider$lambda$0()Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxAccessor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final accessorProvider$lambda$0()Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxAccessor;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxAccessor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxAccessor;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final cdpInteractionMetricsEnabled()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->cdpInteractionMetricsEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final commonTestFlag()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->commonTestFlag()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final cxxNativeAnimatedEnabled()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->cxxNativeAnimatedEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final cxxNativeAnimatedRemoveJsSync()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->cxxNativeAnimatedRemoveJsSync()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final dangerouslyForceOverride(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessorProvider:Lw7/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 13
    .line 14
    invoke-interface {v0, p0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;->dangerouslyForceOverride(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sput-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final dangerouslyReset()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;->dangerouslyReset()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessorProvider:Lw7/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 15
    .line 16
    return-void
.end method

.method public static final disableEarlyViewCommandExecution()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->disableEarlyViewCommandExecution()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final disableFabricCommitInCXXAnimated()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->disableFabricCommitInCXXAnimated()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final disableMountItemReorderingAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->disableMountItemReorderingAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final disableOldAndroidAttachmentMetricsWorkarounds()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->disableOldAndroidAttachmentMetricsWorkarounds()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final disableTextLayoutManagerCacheAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->disableTextLayoutManagerCacheAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableAccessibilityOrder()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableAccessibilityOrder()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableAccumulatedUpdatesInRawPropsAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableAccumulatedUpdatesInRawPropsAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableAndroidLinearText()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableAndroidLinearText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableAndroidTextMeasurementOptimizations()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableAndroidTextMeasurementOptimizations()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableBridgelessArchitecture()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableBridgelessArchitecture()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableCppPropsIteratorSetter()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableCppPropsIteratorSetter()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableCustomFocusSearchOnClippedElementsAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableCustomFocusSearchOnClippedElementsAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableDestroyShadowTreeRevisionAsync()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableDestroyShadowTreeRevisionAsync()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableDoubleMeasurementFixAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableDoubleMeasurementFixAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableEagerMainQueueModulesOnIOS()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableEagerMainQueueModulesOnIOS()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableEagerRootViewAttachment()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableEagerRootViewAttachment()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableFabricLogs()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableFabricLogs()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableFabricRenderer()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableFabricRenderer()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableFontScaleChangesUpdatingLayout()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableFontScaleChangesUpdatingLayout()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableIOSTextBaselineOffsetPerLine()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableIOSTextBaselineOffsetPerLine()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableIOSViewClipToPaddingBox()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableIOSViewClipToPaddingBox()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableImagePrefetchingAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableImagePrefetchingAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableImagePrefetchingOnUiThreadAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableImagePrefetchingOnUiThreadAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableImmediateUpdateModeForContentOffsetChanges()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableImmediateUpdateModeForContentOffsetChanges()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableImperativeFocus()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableImperativeFocus()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableInteropViewManagerClassLookUpOptimizationIOS()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableInteropViewManagerClassLookUpOptimizationIOS()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableIntersectionObserverByDefault()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableIntersectionObserverByDefault()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableKeyEvents()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableKeyEvents()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableLayoutAnimationsOnAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableLayoutAnimationsOnAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableLayoutAnimationsOnIOS()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableLayoutAnimationsOnIOS()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableMainQueueCoordinatorOnIOS()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableMainQueueCoordinatorOnIOS()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableModuleArgumentNSNullConversionIOS()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableModuleArgumentNSNullConversionIOS()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableNativeCSSParsing()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableNativeCSSParsing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableNetworkEventReporting()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableNetworkEventReporting()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enablePreparedTextLayout()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enablePreparedTextLayout()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enablePropsUpdateReconciliationAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enablePropsUpdateReconciliationAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableResourceTimingAPI()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableResourceTimingAPI()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableSwiftUIBasedFilters()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableSwiftUIBasedFilters()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableViewCulling()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableViewCulling()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableViewRecycling()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableViewRecycling()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableViewRecyclingForImage()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableViewRecyclingForImage()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableViewRecyclingForScrollView()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableViewRecyclingForScrollView()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableViewRecyclingForText()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableViewRecyclingForText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableViewRecyclingForView()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableViewRecyclingForView()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableVirtualViewClippingWithoutScrollViewClipping()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableVirtualViewClippingWithoutScrollViewClipping()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableVirtualViewContainerStateExperimental()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableVirtualViewContainerStateExperimental()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableVirtualViewDebugFeatures()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableVirtualViewDebugFeatures()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableVirtualViewRenderState()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableVirtualViewRenderState()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableVirtualViewWindowFocusDetection()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableVirtualViewWindowFocusDetection()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final enableWebPerformanceAPIsByDefault()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->enableWebPerformanceAPIsByDefault()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final fixMappingOfEventPrioritiesBetweenFabricAndReact()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->fixMappingOfEventPrioritiesBetweenFabricAndReact()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final fuseboxAssertSingleHostState()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->fuseboxAssertSingleHostState()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final fuseboxEnabledRelease()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->fuseboxEnabledRelease()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final fuseboxNetworkInspectionEnabled()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->fuseboxNetworkInspectionEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final hideOffscreenVirtualViewsOnIOS()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->hideOffscreenVirtualViewsOnIOS()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final override(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 7
    .line 8
    invoke-interface {v0, p0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;->override(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final overrideBySynchronousMountPropsAtMountingAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->overrideBySynchronousMountPropsAtMountingAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final perfIssuesEnabled()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->perfIssuesEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final perfMonitorV2Enabled()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->perfMonitorV2Enabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final preparedTextCacheSize()D
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->preparedTextCacheSize()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public static final preventShadowTreeCommitExhaustion()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->preventShadowTreeCommitExhaustion()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final shouldPressibilityUseW3CPointerEventsForHover()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->shouldPressibilityUseW3CPointerEventsForHover()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final shouldTriggerResponderTransferOnScrollAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->shouldTriggerResponderTransferOnScrollAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final skipActivityIdentityAssertionOnHostPause()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->skipActivityIdentityAssertionOnHostPause()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final sweepActiveTouchOnChildNativeGesturesAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->sweepActiveTouchOnChildNativeGesturesAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final traceTurboModulePromiseRejectionsOnAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->traceTurboModulePromiseRejectionsOnAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final updateRuntimeShadowNodeReferencesOnCommit()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->updateRuntimeShadowNodeReferencesOnCommit()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useAlwaysAvailableJSErrorHandling()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useAlwaysAvailableJSErrorHandling()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useFabricInterop()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useFabricInterop()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useNativeEqualsInNativeReadableArrayAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useNativeEqualsInNativeReadableArrayAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useNativeTransformHelperAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useNativeTransformHelperAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useNativeViewConfigsInBridgelessMode()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useNativeViewConfigsInBridgelessMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useOptimizedEventBatchingOnAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useOptimizedEventBatchingOnAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useRawPropsJsiValue()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useRawPropsJsiValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useShadowNodeStateOnClone()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useShadowNodeStateOnClone()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useSharedAnimatedBackend()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useSharedAnimatedBackend()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useTraitHiddenOnAndroid()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useTraitHiddenOnAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useTurboModuleInterop()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useTurboModuleInterop()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final useTurboModules()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->useTurboModules()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final viewCullingOutsetRatio()D
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->viewCullingOutsetRatio()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public static final virtualViewHysteresisRatio()D
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->virtualViewHysteresisRatio()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public static final virtualViewPrerenderRatio()D
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;->virtualViewPrerenderRatio()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method


# virtual methods
.method public final setAccessorProvider$ReactAndroid_release(Lw7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "newAccessorProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-object p1, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessorProvider:Lw7/a;

    .line 7
    .line 8
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 13
    .line 14
    sput-object p1, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->accessor:Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;

    .line 15
    .line 16
    return-void
.end method
