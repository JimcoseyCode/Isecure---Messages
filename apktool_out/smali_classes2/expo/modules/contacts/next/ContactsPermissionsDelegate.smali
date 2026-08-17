.class public final Lexpo/modules/contacts/next/ContactsPermissionsDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\r\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\rR\"\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00020\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/contacts/next/ContactsPermissionsDelegate;",
        "",
        "Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "<init>",
        "(Lexpo/modules/kotlin/AppContext;)V",
        "Lexpo/modules/kotlin/Promise;",
        "promise",
        "Li7/B;",
        "requestPermissions",
        "(Lexpo/modules/kotlin/Promise;)V",
        "getPermissions",
        "ensureReadPermission",
        "()V",
        "ensureWritePermission",
        "ensurePermissions",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "weakAppContextRef",
        "Ljava/lang/ref/WeakReference;",
        "Lexpo/modules/interfaces/permissions/Permissions;",
        "getPermissionsManager",
        "()Lexpo/modules/interfaces/permissions/Permissions;",
        "permissionsManager",
        "expo-contacts_release"
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
.field private final weakAppContextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/kotlin/AppContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/AppContext;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->weakAppContextRef:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    return-void
.end method

.method private final getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->weakAppContextRef:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/kotlin/AppContext;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getPermissions()Lexpo/modules/interfaces/permissions/Permissions;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$PermissionsModuleNotFound;

    .line 19
    .line 20
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$PermissionsModuleNotFound;-><init>()V

    .line 21
    .line 22
    .line 23
    throw v0
.end method


# virtual methods
.method public final ensurePermissions()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->ensureReadPermission()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->ensureWritePermission()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final ensureReadPermission()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "android.permission.READ_CONTACTS"

    .line 6
    .line 7
    filled-new-array {v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v0, v2}, Lexpo/modules/interfaces/permissions/Permissions;->hasGrantedPermissions([Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Lexpo/modules/contacts/MissingPermissionException;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lexpo/modules/contacts/MissingPermissionException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public final ensureWritePermission()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "android.permission.WRITE_CONTACTS"

    .line 6
    .line 7
    filled-new-array {v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v0, v2}, Lexpo/modules/interfaces/permissions/Permissions;->hasGrantedPermissions([Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Lexpo/modules/contacts/MissingPermissionException;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lexpo/modules/contacts/MissingPermissionException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public final getPermissions(Lexpo/modules/kotlin/Promise;)V
    .locals 5

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "android.permission.WRITE_CONTACTS"

    .line 11
    .line 12
    invoke-interface {v0, v1}, Lexpo/modules/interfaces/permissions/Permissions;->isPermissionPresentInManifest(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    const-string v3, "android.permission.READ_CONTACTS"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    new-array v0, v0, [Ljava/lang/String;

    .line 24
    .line 25
    aput-object v3, v0, v4

    .line 26
    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-array v0, v2, [Ljava/lang/String;

    .line 31
    .line 32
    aput-object v3, v0, v4

    .line 33
    .line 34
    :goto_0
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    array-length v2, v0

    .line 39
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, [Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v1, p1, v0}, Lexpo/modules/interfaces/permissions/Permissions;->getPermissionsWithPermissionsManager(Lexpo/modules/interfaces/permissions/Permissions;Lexpo/modules/kotlin/Promise;[Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final requestPermissions(Lexpo/modules/kotlin/Promise;)V
    .locals 5

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "android.permission.WRITE_CONTACTS"

    .line 11
    .line 12
    invoke-interface {v0, v1}, Lexpo/modules/interfaces/permissions/Permissions;->isPermissionPresentInManifest(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    const-string v3, "android.permission.READ_CONTACTS"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    new-array v0, v0, [Ljava/lang/String;

    .line 24
    .line 25
    aput-object v3, v0, v4

    .line 26
    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-array v0, v2, [Ljava/lang/String;

    .line 31
    .line 32
    aput-object v3, v0, v4

    .line 33
    .line 34
    :goto_0
    invoke-direct {p0}, Lexpo/modules/contacts/next/ContactsPermissionsDelegate;->getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    array-length v2, v0

    .line 39
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, [Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v1, p1, v0}, Lexpo/modules/interfaces/permissions/Permissions;->askForPermissionsWithPermissionsManager(Lexpo/modules/interfaces/permissions/Permissions;Lexpo/modules/kotlin/Promise;[Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
