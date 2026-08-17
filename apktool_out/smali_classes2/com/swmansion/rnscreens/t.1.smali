.class public final Lcom/swmansion/rnscreens/t;
.super Lcom/facebook/react/BaseReactPackage;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/t$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/swmansion/rnscreens/t$a;


# instance fields
.field private a:Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/t$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/t;->b:Lcom/swmansion/rnscreens/t$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/BaseReactPackage;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Lcom/swmansion/rnscreens/t;->b()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final b()Ljava/util/Map;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 7
    .line 8
    const/4 v6, 0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    const-string v2, "RNSModule"

    .line 11
    .line 12
    const-string v3, "RNSModule"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "RNSModule"

    .line 21
    .line 22
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-object v0
.end method


# virtual methods
.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "reactContext"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p0

    .line 14
    .line 15
    iput-object v1, v2, Lcom/swmansion/rnscreens/t;->a:Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;

    .line 16
    .line 17
    sget-object v1, Lcom/swmansion/rnscreens/k;->g:Lcom/swmansion/rnscreens/k;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lcom/swmansion/rnscreens/k;->f(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/swmansion/rnscreens/ScreenContainerViewManager;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lcom/swmansion/rnscreens/ScreenViewManager;

    .line 28
    .line 29
    invoke-direct {v1}, Lcom/swmansion/rnscreens/ScreenViewManager;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v3, Lcom/swmansion/rnscreens/ModalScreenViewManager;

    .line 33
    .line 34
    invoke-direct {v3}, Lcom/swmansion/rnscreens/ModalScreenViewManager;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/swmansion/rnscreens/ScreenStackViewManager;

    .line 38
    .line 39
    invoke-direct {v4}, Lcom/swmansion/rnscreens/ScreenStackViewManager;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v5, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;

    .line 43
    .line 44
    invoke-direct {v5}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v6, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;

    .line 48
    .line 49
    invoke-direct {v6}, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v7, Lcom/swmansion/rnscreens/SearchBarManager;

    .line 53
    .line 54
    invoke-direct {v7}, Lcom/swmansion/rnscreens/SearchBarManager;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v8, Lcom/swmansion/rnscreens/ScreenFooterManager;

    .line 58
    .line 59
    invoke-direct {v8}, Lcom/swmansion/rnscreens/ScreenFooterManager;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v9, Lcom/swmansion/rnscreens/ScreenContentWrapperManager;

    .line 63
    .line 64
    invoke-direct {v9}, Lcom/swmansion/rnscreens/ScreenContentWrapperManager;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v10, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;

    .line 68
    .line 69
    invoke-direct {v10}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v11, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;

    .line 73
    .line 74
    invoke-direct {v11}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v12, Lcom/swmansion/rnscreens/safearea/SafeAreaViewManager;

    .line 78
    .line 79
    invoke-direct {v12}, Lcom/swmansion/rnscreens/safearea/SafeAreaViewManager;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v13, Lcom/swmansion/rnscreens/gamma/stack/host/StackHostViewManager;

    .line 83
    .line 84
    invoke-direct {v13}, Lcom/swmansion/rnscreens/gamma/stack/host/StackHostViewManager;-><init>()V

    .line 85
    .line 86
    .line 87
    new-instance v14, Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenViewManager;

    .line 88
    .line 89
    invoke-direct {v14}, Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenViewManager;-><init>()V

    .line 90
    .line 91
    .line 92
    const/16 v15, 0xe

    .line 93
    .line 94
    new-array v15, v15, [Lcom/facebook/react/uimanager/ViewManager;

    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    aput-object v0, v15, v16

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    aput-object v1, v15, v0

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    aput-object v3, v15, v0

    .line 105
    .line 106
    const/4 v0, 0x3

    .line 107
    aput-object v4, v15, v0

    .line 108
    .line 109
    const/4 v0, 0x4

    .line 110
    aput-object v5, v15, v0

    .line 111
    .line 112
    const/4 v0, 0x5

    .line 113
    aput-object v6, v15, v0

    .line 114
    .line 115
    const/4 v0, 0x6

    .line 116
    aput-object v7, v15, v0

    .line 117
    .line 118
    const/4 v0, 0x7

    .line 119
    aput-object v8, v15, v0

    .line 120
    .line 121
    const/16 v0, 0x8

    .line 122
    .line 123
    aput-object v9, v15, v0

    .line 124
    .line 125
    const/16 v0, 0x9

    .line 126
    .line 127
    aput-object v10, v15, v0

    .line 128
    .line 129
    const/16 v0, 0xa

    .line 130
    .line 131
    aput-object v11, v15, v0

    .line 132
    .line 133
    const/16 v0, 0xb

    .line 134
    .line 135
    aput-object v12, v15, v0

    .line 136
    .line 137
    const/16 v0, 0xc

    .line 138
    .line 139
    aput-object v13, v15, v0

    .line 140
    .line 141
    const/16 v0, 0xd

    .line 142
    .line 143
    aput-object v14, v15, v0

    .line 144
    .line 145
    invoke-static {v15}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    const-string v0, "s"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactApplicationContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "RNSModule"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Lcom/swmansion/rnscreens/ScreensModule;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Lcom/swmansion/rnscreens/ScreensModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 1

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/swmansion/rnscreens/s;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
