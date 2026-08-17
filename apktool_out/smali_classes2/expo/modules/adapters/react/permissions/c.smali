.class public final synthetic Lexpo/modules/adapters/react/permissions/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/modules/core/PermissionListener;


# instance fields
.field public final synthetic g:Lexpo/modules/adapters/react/permissions/PermissionsService;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/adapters/react/permissions/PermissionsService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/adapters/react/permissions/c;->g:Lexpo/modules/adapters/react/permissions/PermissionsService;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/permissions/c;->g:Lexpo/modules/adapters/react/permissions/PermissionsService;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3}, Lexpo/modules/adapters/react/permissions/PermissionsService;->d(Lexpo/modules/adapters/react/permissions/PermissionsService;I[Ljava/lang/String;[I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
