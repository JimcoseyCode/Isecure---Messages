.class public final Lcom/reactnativekeyboardcontroller/b;
.super Lcom/facebook/react/BaseReactPackage;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
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
    invoke-static {}, Lcom/reactnativekeyboardcontroller/b;->b()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final b()Ljava/util/Map;
    .locals 14

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
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    const-string v2, "KeyboardController"

    .line 11
    .line 12
    const-string v3, "KeyboardController"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v7, 0x1

    .line 16
    invoke-direct/range {v1 .. v7}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 17
    .line 18
    .line 19
    const-string v2, "KeyboardController"

    .line 20
    .line 21
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move v13, v7

    .line 25
    new-instance v7, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    const-string v8, "StatusBarManager"

    .line 30
    .line 31
    const-string v9, "StatusBarManager"

    .line 32
    .line 33
    const/4 v10, 0x1

    .line 34
    invoke-direct/range {v7 .. v13}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 35
    .line 36
    .line 37
    const-string v1, "StatusBarManager"

    .line 38
    .line 39
    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-object v0
.end method


# virtual methods
.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 7

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/reactnativekeyboardcontroller/KeyboardControllerViewManager;

    .line 7
    .line 8
    invoke-direct {p1}, Lcom/reactnativekeyboardcontroller/KeyboardControllerViewManager;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/reactnativekeyboardcontroller/OverKeyboardViewManager;

    .line 17
    .line 18
    invoke-direct {v1}, Lcom/reactnativekeyboardcontroller/OverKeyboardViewManager;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcom/reactnativekeyboardcontroller/KeyboardBackgroundViewManager;

    .line 22
    .line 23
    invoke-direct {v2}, Lcom/reactnativekeyboardcontroller/KeyboardBackgroundViewManager;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v3, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/reactnativekeyboardcontroller/KeyboardToolbarGroupViewManager;

    .line 32
    .line 33
    invoke-direct {v4}, Lcom/reactnativekeyboardcontroller/KeyboardToolbarGroupViewManager;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x6

    .line 37
    new-array v5, v5, [Lcom/facebook/react/uimanager/ViewManager;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    aput-object p1, v5, v6

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    aput-object v0, v5, p1

    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    aput-object v1, v5, p1

    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    aput-object v2, v5, p1

    .line 50
    .line 51
    const/4 p1, 0x4

    .line 52
    aput-object v3, v5, p1

    .line 53
    .line 54
    const/4 p1, 0x5

    .line 55
    aput-object v4, v5, p1

    .line 56
    .line 57
    invoke-static {v5}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

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
    const-string v0, "KeyboardController"

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
    new-instance p1, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string v0, "StatusBarManager"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance p1, Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;

    .line 34
    .line 35
    invoke-direct {p1, p2}, Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return-object p1
.end method

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 1

    .line 1
    new-instance v0, Lcom/reactnativekeyboardcontroller/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/reactnativekeyboardcontroller/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
