.class public Lexpo/modules/adapters/react/ReactAdapterPackage;
.super Lexpo/modules/core/BasePackage;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/core/BasePackage;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createInternalModules(Landroid/content/Context;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lexpo/modules/core/interfaces/InternalModule;",
            ">;"
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    new-instance v0, Lexpo/modules/adapters/react/services/UIManagerModuleWrapper;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lexpo/modules/adapters/react/services/UIManagerModuleWrapper;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lexpo/modules/adapters/react/services/EventEmitterModule;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lexpo/modules/adapters/react/services/EventEmitterModule;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lexpo/modules/adapters/react/permissions/PermissionsService;

    .line 14
    .line 15
    invoke-direct {v2, p1}, Lexpo/modules/adapters/react/permissions/PermissionsService;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x3

    .line 19
    new-array p1, p1, [Lexpo/modules/core/interfaces/InternalModule;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    aput-object v0, p1, v3

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    aput-object v1, p1, v0

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    aput-object v2, p1, v0

    .line 29
    .line 30
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method
