.class public final synthetic Lexpo/modules/adapters/react/permissions/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/interfaces/permissions/PermissionsResponseListener;


# instance fields
.field public final synthetic a:Lexpo/modules/core/Promise;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/core/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/adapters/react/permissions/d;->a:Lexpo/modules/core/Promise;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onResult(Ljava/util/Map;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/permissions/d;->a:Lexpo/modules/core/Promise;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/adapters/react/permissions/PermissionsService;->a(Lexpo/modules/core/Promise;Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
