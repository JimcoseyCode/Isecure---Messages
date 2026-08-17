.class public final synthetic Lexpo/modules/adapters/react/permissions/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/interfaces/permissions/PermissionsResponseListener;


# instance fields
.field public final synthetic a:Lexpo/modules/adapters/react/permissions/PermissionsService;

.field public final synthetic b:Lexpo/modules/core/Promise;

.field public final synthetic c:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/adapters/react/permissions/PermissionsService;Lexpo/modules/core/Promise;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/adapters/react/permissions/a;->a:Lexpo/modules/adapters/react/permissions/PermissionsService;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/adapters/react/permissions/a;->b:Lexpo/modules/core/Promise;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/adapters/react/permissions/a;->c:[Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onResult(Ljava/util/Map;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/permissions/a;->a:Lexpo/modules/adapters/react/permissions/PermissionsService;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/adapters/react/permissions/a;->b:Lexpo/modules/core/Promise;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/adapters/react/permissions/a;->c:[Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lexpo/modules/adapters/react/permissions/PermissionsService;->b(Lexpo/modules/adapters/react/permissions/PermissionsService;Lexpo/modules/core/Promise;[Ljava/lang/String;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
