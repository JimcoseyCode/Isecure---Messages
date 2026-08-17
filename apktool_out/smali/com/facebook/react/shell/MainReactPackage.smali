.class public final Lcom/facebook/react/shell/MainReactPackage;
.super Lcom/facebook/react/BaseReactPackage;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/ViewManagerOnDemandReactPackage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0008\u0007\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u001e\u0010\r\u001a\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\"\u0010\u001a\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0008\u0010\u001c\u001a\u00020\u001dH\u0016J\u0008\u0010\u001e\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/facebook/react/shell/MainReactPackage;",
        "Lcom/facebook/react/BaseReactPackage;",
        "Lcom/facebook/react/ViewManagerOnDemandReactPackage;",
        "config",
        "Lcom/facebook/react/shell/MainPackageConfig;",
        "<init>",
        "(Lcom/facebook/react/shell/MainPackageConfig;)V",
        "getModule",
        "Lcom/facebook/react/bridge/NativeModule;",
        "name",
        "",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "createViewManagers",
        "",
        "Lcom/facebook/react/uimanager/ViewManager;",
        "viewManagersMap",
        "",
        "Lcom/facebook/react/bridge/ModuleSpec;",
        "getViewManagersMap$annotations",
        "()V",
        "getViewManagersMap",
        "()Ljava/util/Map;",
        "getViewManagers",
        "getViewManagerNames",
        "",
        "createViewManager",
        "viewManagerName",
        "getReactModuleInfoProvider",
        "Lcom/facebook/react/module/model/ReactModuleInfoProvider;",
        "fallbackForMissingClass",
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


# instance fields
.field private final config:Lcom/facebook/react/shell/MainPackageConfig;

.field private final viewManagersMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/shell/MainReactPackage;-><init>(Lcom/facebook/react/shell/MainPackageConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/shell/MainPackageConfig;)V
    .locals 19

    move-object/from16 v0, p0

    .line 3
    invoke-direct {v0}, Lcom/facebook/react/BaseReactPackage;-><init>()V

    move-object/from16 v1, p1

    .line 4
    iput-object v1, v0, Lcom/facebook/react/shell/MainReactPackage;->config:Lcom/facebook/react/shell/MainPackageConfig;

    .line 5
    sget-object v1, Lcom/facebook/react/bridge/ModuleSpec;->Companion:Lcom/facebook/react/bridge/ModuleSpec$Companion;

    new-instance v2, Lx3/h;

    invoke-direct {v2}, Lx3/h;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 6
    const-string v3, "AndroidDrawerLayout"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 7
    new-instance v2, Lx3/n;

    invoke-direct {v2}, Lx3/n;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 8
    const-string v3, "AndroidHorizontalScrollView"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 9
    new-instance v2, Lx3/o;

    invoke-direct {v2}, Lx3/o;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 10
    const-string v3, "AndroidHorizontalScrollContentView"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    .line 11
    new-instance v2, Lx3/p;

    invoke-direct {v2}, Lx3/p;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 12
    const-string v3, "AndroidProgressBar"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    .line 13
    new-instance v2, Lx3/b;

    invoke-direct {v2}, Lx3/b;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 14
    const-string v3, "RCTSafeAreaView"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    .line 15
    new-instance v2, Lx3/c;

    invoke-direct {v2}, Lx3/c;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 16
    const-string v3, "RCTScrollView"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    .line 17
    new-instance v2, Lx3/d;

    invoke-direct {v2}, Lx3/d;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    const-string v3, "AndroidSwitch"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 18
    new-instance v2, Lx3/e;

    invoke-direct {v2}, Lx3/e;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 19
    const-string v3, "AndroidSwipeRefreshLayout"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    .line 20
    new-instance v2, Lx3/f;

    invoke-direct {v2}, Lx3/f;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 21
    const-string v3, "RCTTextInlineImage"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    .line 22
    new-instance v2, Lx3/g;

    invoke-direct {v2}, Lx3/g;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    const-string v3, "RCTImageView"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    .line 23
    new-instance v2, Lx3/i;

    invoke-direct {v2}, Lx3/i;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 24
    const-string v3, "RCTModalHostView"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    .line 25
    new-instance v2, Lx3/j;

    invoke-direct {v2}, Lx3/j;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 26
    const-string v3, "AndroidTextInput"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v15

    .line 27
    new-instance v2, Lx3/k;

    invoke-direct {v2}, Lx3/k;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    .line 28
    const-string v3, "RCTText"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v16

    .line 29
    new-instance v2, Lx3/l;

    invoke-direct {v2}, Lx3/l;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v2

    const-string v3, "RCTView"

    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v17

    .line 30
    new-instance v2, Lx3/m;

    invoke-direct {v2}, Lx3/m;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object v1

    .line 31
    const-string v2, "UnimplementedNativeView"

    invoke-static {v2, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v18

    filled-new-array/range {v4 .. v18}, [Lkotlin/Pair;

    move-result-object v1

    .line 32
    invoke-static {v1}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/shell/MainPackageConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/shell/MainReactPackage;-><init>(Lcom/facebook/react/shell/MainPackageConfig;)V

    return-void
.end method

.method public static synthetic a()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$9()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$12()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic c()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$2()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic d()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$5()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic e()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$10()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic f()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$0()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final fallbackForMissingClass()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 25

    .line 1
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->cxxNativeAnimatedEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    move-object v14, v0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-class v0, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :goto_1
    const-class v23, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 14
    .line 15
    const-class v24, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 16
    .line 17
    const-class v1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 18
    .line 19
    const-class v2, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 20
    .line 21
    const-class v3, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 22
    .line 23
    const-class v4, Lcom/facebook/react/modules/blob/BlobModule;

    .line 24
    .line 25
    const-class v5, Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 26
    .line 27
    const-class v6, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 28
    .line 29
    const-class v7, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 30
    .line 31
    const-class v8, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 32
    .line 33
    const-class v9, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 34
    .line 35
    const-class v10, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 36
    .line 37
    const-class v11, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 38
    .line 39
    const-class v12, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 40
    .line 41
    const-class v13, Lcom/facebook/react/modules/intent/IntentModule;

    .line 42
    .line 43
    const-class v15, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 44
    .line 45
    const-class v16, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 46
    .line 47
    const-class v17, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;

    .line 48
    .line 49
    const-class v18, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;

    .line 50
    .line 51
    const-class v19, Lcom/facebook/react/modules/share/ShareModule;

    .line 52
    .line 53
    const-class v20, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 54
    .line 55
    const-class v21, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 56
    .line 57
    const-class v22, Lcom/facebook/react/modules/toast/ToastModule;

    .line 58
    .line 59
    filled-new-array/range {v1 .. v24}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Lj7/j;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x0

    .line 68
    new-array v2, v1, [Ljava/lang/Class;

    .line 69
    .line 70
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, [Ljava/lang/Class;

    .line 75
    .line 76
    new-instance v2, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    array-length v3, v0

    .line 82
    :goto_2
    const-class v4, Lcom/facebook/react/module/annotations/ReactModule;

    .line 83
    .line 84
    if-ge v1, v3, :cond_2

    .line 85
    .line 86
    aget-object v5, v0, v1

    .line 87
    .line 88
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_1

    .line 93
    .line 94
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    const/16 v0, 0xa

    .line 101
    .line 102
    invoke-static {v2, v0}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, Lj7/K;->e(I)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/16 v1, 0x10

    .line 111
    .line 112
    invoke-static {v0, v1}, LB7/d;->d(II)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Ljava/lang/Class;

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-eqz v3, :cond_3

    .line 142
    .line 143
    check-cast v3, Lcom/facebook/react/module/annotations/ReactModule;

    .line 144
    .line 145
    invoke-interface {v3}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    new-instance v6, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 150
    .line 151
    invoke-interface {v3}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const-string v9, "getName(...)"

    .line 160
    .line 161
    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v3}, Lcom/facebook/react/module/annotations/ReactModule;->canOverrideExistingModule()Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    invoke-interface {v3}, Lcom/facebook/react/module/annotations/ReactModule;->needsEagerInit()Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-interface {v3}, Lcom/facebook/react/module/annotations/ReactModule;->isCxxModule()Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    sget-object v3, Lcom/facebook/react/module/model/ReactModuleInfo;->Companion:Lcom/facebook/react/module/model/ReactModuleInfo$Companion;

    .line 177
    .line 178
    invoke-virtual {v3, v2}, Lcom/facebook/react/module/model/ReactModuleInfo$Companion;->classIsTurboModule(Ljava/lang/Class;)Z

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 183
    .line 184
    .line 185
    invoke-static {v5, v6}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    const-string v1, "Required value was null."

    .line 204
    .line 205
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_4
    new-instance v0, Lx3/a;

    .line 210
    .line 211
    invoke-direct {v0, v1}, Lx3/a;-><init>(Ljava/util/Map;)V

    .line 212
    .line 213
    .line 214
    return-object v0
.end method

.method private static final fallbackForMissingClass$lambda$17(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static synthetic g()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$1()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic getViewManagersMap$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic h()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$14()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic i()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$6()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic j()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$3()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic k(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/shell/MainReactPackage;->fallbackForMissingClass$lambda$17(Ljava/util/Map;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$7()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic m()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$11()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic n()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$8()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic o()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$4()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic p()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap$lambda$13()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final viewManagersMap$lambda$0()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$1()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v1}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;-><init>(Lcom/facebook/react/views/scroll/FpsListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private static final viewManagersMap$lambda$10()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/modal/ReactModalHostManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/modal/ReactModalHostManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$11()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$12()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enablePreparedTextLayout()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;

    .line 10
    .line 11
    invoke-direct {v0, v2, v1, v2}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;-><init>(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Lcom/facebook/react/views/text/ReactTextViewManager;

    .line 16
    .line 17
    invoke-direct {v0, v2, v1, v2}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private static final viewManagersMap$lambda$13()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/view/ReactViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$14()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$2()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$3()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$4()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$5()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/ReactScrollViewManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v1}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>(Lcom/facebook/react/views/scroll/FpsListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private static final viewManagersMap$lambda$6()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/switchview/ReactSwitchManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/switchview/ReactSwitchManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$7()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final viewManagersMap$lambda$8()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2, v1}, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;-><init>(Lw2/b;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private static final viewManagersMap$lambda$9()Lcom/facebook/react/bridge/NativeModule;
    .locals 6

    .line 1
    new-instance v0, Lcom/facebook/react/views/image/ReactImageManager;

    .line 2
    .line 3
    const/4 v4, 0x7

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(Lw2/b;Lcom/facebook/react/views/image/GlobalImageLoadListener;Lcom/facebook/react/views/image/ReactCallerContextFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "**>;"
        }
    .end annotation

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "viewManagerName"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/facebook/react/bridge/ModuleSpec;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ModuleSpec;->provider()Ljavax/inject/Provider;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/facebook/react/bridge/NativeModule;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p1, p2

    .line 36
    :goto_0
    instance-of v0, p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    return-object p2
.end method

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "**>;>;"
        }
    .end annotation

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v1, v2, v3, v2}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;-><init>(Lcom/facebook/react/views/scroll/FpsListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;

    .line 21
    .line 22
    invoke-direct {v4}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v5, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;

    .line 26
    .line 27
    invoke-direct {v5}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v6, Lcom/facebook/react/views/scroll/ReactScrollViewManager;

    .line 31
    .line 32
    invoke-direct {v6, v2, v3, v2}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>(Lcom/facebook/react/views/scroll/FpsListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    new-instance v7, Lcom/facebook/react/views/switchview/ReactSwitchManager;

    .line 36
    .line 37
    invoke-direct {v7}, Lcom/facebook/react/views/switchview/ReactSwitchManager;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v8, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;

    .line 41
    .line 42
    invoke-direct {v8}, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v9, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;

    .line 46
    .line 47
    invoke-direct {v9}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v10, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;

    .line 51
    .line 52
    const/4 v11, 0x3

    .line 53
    invoke-direct {v10, v2, v2, v11, v2}, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;-><init>(Lw2/b;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .line 55
    .line 56
    new-instance v12, Lcom/facebook/react/views/image/ReactImageManager;

    .line 57
    .line 58
    const/16 v16, 0x7

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    invoke-direct/range {v12 .. v17}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(Lw2/b;Lcom/facebook/react/views/image/GlobalImageLoadListener;Lcom/facebook/react/views/image/ReactCallerContextFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    .line 67
    .line 68
    new-instance v13, Lcom/facebook/react/views/modal/ReactModalHostManager;

    .line 69
    .line 70
    invoke-direct {v13}, Lcom/facebook/react/views/modal/ReactModalHostManager;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v14, Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 74
    .line 75
    invoke-direct {v14}, Lcom/facebook/react/views/textinput/ReactTextInputManager;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enablePreparedTextLayout()Z

    .line 79
    .line 80
    .line 81
    move-result v15

    .line 82
    if-eqz v15, :cond_0

    .line 83
    .line 84
    new-instance v15, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;

    .line 85
    .line 86
    invoke-direct {v15, v2, v3, v2}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;-><init>(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    new-instance v15, Lcom/facebook/react/views/text/ReactTextViewManager;

    .line 91
    .line 92
    invoke-direct {v15, v2, v3, v2}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    new-instance v2, Lcom/facebook/react/views/view/ReactViewManager;

    .line 96
    .line 97
    invoke-direct {v2}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 98
    .line 99
    .line 100
    new-instance v16, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;

    .line 101
    .line 102
    invoke-direct/range {v16 .. v16}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;-><init>()V

    .line 103
    .line 104
    .line 105
    move/from16 p1, v3

    .line 106
    .line 107
    const/16 v3, 0xf

    .line 108
    .line 109
    new-array v3, v3, [Lcom/facebook/react/uimanager/BaseViewManager;

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    aput-object v0, v3, v17

    .line 114
    .line 115
    aput-object v1, v3, p1

    .line 116
    .line 117
    const/4 v0, 0x2

    .line 118
    aput-object v4, v3, v0

    .line 119
    .line 120
    aput-object v5, v3, v11

    .line 121
    .line 122
    const/4 v0, 0x4

    .line 123
    aput-object v6, v3, v0

    .line 124
    .line 125
    const/4 v0, 0x5

    .line 126
    aput-object v7, v3, v0

    .line 127
    .line 128
    const/4 v0, 0x6

    .line 129
    aput-object v8, v3, v0

    .line 130
    .line 131
    const/4 v0, 0x7

    .line 132
    aput-object v9, v3, v0

    .line 133
    .line 134
    const/16 v0, 0x8

    .line 135
    .line 136
    aput-object v10, v3, v0

    .line 137
    .line 138
    const/16 v0, 0x9

    .line 139
    .line 140
    aput-object v12, v3, v0

    .line 141
    .line 142
    const/16 v0, 0xa

    .line 143
    .line 144
    aput-object v13, v3, v0

    .line 145
    .line 146
    const/16 v0, 0xb

    .line 147
    .line 148
    aput-object v14, v3, v0

    .line 149
    .line 150
    const/16 v0, 0xc

    .line 151
    .line 152
    aput-object v15, v3, v0

    .line 153
    .line 154
    const/16 v0, 0xd

    .line 155
    .line 156
    aput-object v2, v3, v0

    .line 157
    .line 158
    const/16 v0, 0xe

    .line 159
    .line 160
    aput-object v16, v3, v0

    .line 161
    .line 162
    invoke-static {v3}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "AccessibilityInfo"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string v0, "Appearance"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    new-instance p1, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-direct {p1, p2, v1, v0, v1}, Lcom/facebook/react/modules/appearance/AppearanceModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/appearance/AppearanceModule$OverrideColorScheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    const-string v0, "AppState"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    new-instance p1, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 50
    .line 51
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/appstate/AppStateModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    const-string v0, "BlobModule"

    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    new-instance p1, Lcom/facebook/react/modules/blob/BlobModule;

    .line 64
    .line 65
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/BlobModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    const-string v0, "DevLoadingView"

    .line 70
    .line 71
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    new-instance p1, Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/devloading/DevLoadingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    sget-object v0, Lcom/facebook/react/modules/blob/FileReaderModule;->Companion:Lcom/facebook/react/modules/blob/FileReaderModule$Companion;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/facebook/react/modules/blob/FileReaderModule$Companion;->getNAME()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    new-instance p1, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 96
    .line 97
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/FileReaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_5
    const-string v0, "Clipboard"

    .line 102
    .line 103
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    new-instance p1, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 110
    .line 111
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/clipboard/ClipboardModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 112
    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_6
    const-string v0, "DialogManagerAndroid"

    .line 116
    .line 117
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    new-instance p1, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 124
    .line 125
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/dialog/DialogModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_7
    const-string v0, "FrescoModule"

    .line 130
    .line 131
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    new-instance p1, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 138
    .line 139
    iget-object v0, p0, Lcom/facebook/react/shell/MainReactPackage;->config:Lcom/facebook/react/shell/MainPackageConfig;

    .line 140
    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/facebook/react/shell/MainPackageConfig;->getFrescoConfig()LY2/u;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    :cond_8
    const/4 v0, 0x1

    .line 148
    invoke-direct {p1, p2, v0, v1}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ZLY2/u;)V

    .line 149
    .line 150
    .line 151
    return-object p1

    .line 152
    :cond_9
    const-string v0, "I18nManager"

    .line 153
    .line 154
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_a

    .line 159
    .line 160
    new-instance p1, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 161
    .line 162
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 163
    .line 164
    .line 165
    return-object p1

    .line 166
    :cond_a
    const-string v0, "ImageLoader"

    .line 167
    .line 168
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    new-instance p1, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 175
    .line 176
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/image/ImageLoaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 177
    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_b
    const-string v0, "ImageStoreManager"

    .line 181
    .line 182
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_c

    .line 187
    .line 188
    new-instance p1, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 189
    .line 190
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/camera/ImageStoreManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 191
    .line 192
    .line 193
    return-object p1

    .line 194
    :cond_c
    const-string v0, "IntentAndroid"

    .line 195
    .line 196
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_d

    .line 201
    .line 202
    new-instance p1, Lcom/facebook/react/modules/intent/IntentModule;

    .line 203
    .line 204
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/intent/IntentModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 205
    .line 206
    .line 207
    return-object p1

    .line 208
    :cond_d
    const-string v0, "NativeAnimatedModule"

    .line 209
    .line 210
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_f

    .line 215
    .line 216
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->cxxNativeAnimatedEnabled()Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_e

    .line 221
    .line 222
    return-object v1

    .line 223
    :cond_e
    new-instance p1, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 224
    .line 225
    invoke-direct {p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 226
    .line 227
    .line 228
    return-object p1

    .line 229
    :cond_f
    const-string v0, "Networking"

    .line 230
    .line 231
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_10

    .line 236
    .line 237
    new-instance p1, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 238
    .line 239
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 240
    .line 241
    .line 242
    return-object p1

    .line 243
    :cond_10
    const-string v0, "PermissionsAndroid"

    .line 244
    .line 245
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_11

    .line 250
    .line 251
    new-instance p1, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 252
    .line 253
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/permissions/PermissionsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 254
    .line 255
    .line 256
    return-object p1

    .line 257
    :cond_11
    const-string v0, "ShareModule"

    .line 258
    .line 259
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_12

    .line 264
    .line 265
    new-instance p1, Lcom/facebook/react/modules/share/ShareModule;

    .line 266
    .line 267
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/share/ShareModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 268
    .line 269
    .line 270
    return-object p1

    .line 271
    :cond_12
    const-string v0, "StatusBarManager"

    .line 272
    .line 273
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_13

    .line 278
    .line 279
    new-instance p1, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 280
    .line 281
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/statusbar/StatusBarModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 282
    .line 283
    .line 284
    return-object p1

    .line 285
    :cond_13
    const-string v0, "SoundManager"

    .line 286
    .line 287
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_14

    .line 292
    .line 293
    new-instance p1, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 294
    .line 295
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/sound/SoundManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 296
    .line 297
    .line 298
    return-object p1

    .line 299
    :cond_14
    const-string v0, "ToastAndroid"

    .line 300
    .line 301
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_15

    .line 306
    .line 307
    new-instance p1, Lcom/facebook/react/modules/toast/ToastModule;

    .line 308
    .line 309
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/toast/ToastModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 310
    .line 311
    .line 312
    return-object p1

    .line 313
    :cond_15
    const-string v0, "Vibration"

    .line 314
    .line 315
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_16

    .line 320
    .line 321
    new-instance p1, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 322
    .line 323
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/vibration/VibrationModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 324
    .line 325
    .line 326
    return-object p1

    .line 327
    :cond_16
    const-string v0, "WebSocketModule"

    .line 328
    .line 329
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_17

    .line 334
    .line 335
    new-instance p1, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 336
    .line 337
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 338
    .line 339
    .line 340
    return-object p1

    .line 341
    :cond_17
    const-string v0, "ReactDevToolsSettingsManager"

    .line 342
    .line 343
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_18

    .line 348
    .line 349
    new-instance p1, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;

    .line 350
    .line 351
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 352
    .line 353
    .line 354
    return-object p1

    .line 355
    :cond_18
    const-string v0, "ReactDevToolsRuntimeSettingsModule"

    .line 356
    .line 357
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result p1

    .line 361
    if-eqz p1, :cond_19

    .line 362
    .line 363
    new-instance p1, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;

    .line 364
    .line 365
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 366
    .line 367
    .line 368
    return-object p1

    .line 369
    :cond_19
    return-object v1
.end method

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 4

    .line 1
    const-string v0, "No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider"

    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/common/ClassFinder;->canLoadClassesFromAnnotationProcessors()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/shell/MainReactPackage;->fallbackForMissingClass()Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    :try_start_0
    const-string v1, "com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider"

    .line 15
    .line 16
    invoke-static {v1}, Lcom/facebook/react/common/ClassFinder;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :catch_1
    move-exception v1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    move-object v1, v2

    .line 33
    :goto_0
    instance-of v3, v1, Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 39
    .line 40
    :cond_2
    if-nez v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/facebook/react/shell/MainReactPackage;->fallbackForMissingClass()Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-object v0

    .line 47
    :cond_3
    return-object v2

    .line 48
    :goto_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 49
    .line 50
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw v2

    .line 54
    :goto_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 55
    .line 56
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v2

    .line 60
    :catch_2
    invoke-direct {p0}, Lcom/facebook/react/shell/MainReactPackage;->fallbackForMissingClass()Lcom/facebook/react/module/model/ReactModuleInfoProvider;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method

.method public getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public getViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final getViewManagersMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/shell/MainReactPackage;->viewManagersMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
