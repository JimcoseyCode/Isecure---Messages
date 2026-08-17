.class public final Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0087@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00080\u001b8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00080\u001b8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001eR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;",
        "",
        "Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "<init>",
        "(Lexpo/modules/kotlin/AppContext;)V",
        "Landroid/net/Uri;",
        "uri",
        "",
        "hasWritePermissionForUri",
        "(Landroid/net/Uri;)Z",
        "",
        "uris",
        "Li7/B;",
        "launchMediaStoreDeleteRequest",
        "(Ljava/util/List;Ln7/f;)Ljava/lang/Object;",
        "",
        "requestMediaLibraryWritePermission",
        "(Ljava/lang/Iterable;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;",
        "Lexpo/modules/kotlin/providers/AppContextProvider;",
        "appContextProvider",
        "registerMediaStoreContracts",
        "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/providers/AppContextProvider;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/kotlin/AppContext;",
        "getAppContext",
        "()Lexpo/modules/kotlin/AppContext;",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;",
        "Lexpo/modules/medialibrary/next/permissions/contracts/DeleteContractInput;",
        "deleteLauncher",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;",
        "Lexpo/modules/medialibrary/next/permissions/contracts/WriteContractInput;",
        "writeLauncher",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "context",
        "expo-media-library_release"
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
.field private final appContext:Lexpo/modules/kotlin/AppContext;

.field private deleteLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher<",
            "Lexpo/modules/medialibrary/next/permissions/contracts/DeleteContractInput;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private writeLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher<",
            "Lexpo/modules/medialibrary/next/permissions/contracts/WriteContractInput;",
            "Ljava/lang/Boolean;",
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
    iput-object p1, p0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->appContext:Lexpo/modules/kotlin/AppContext;

    .line 10
    .line 11
    return-void
.end method

.method private final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->appContext:Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;

    .line 11
    .line 12
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;-><init>()V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method private final hasWritePermissionForUri(Landroid/net/Uri;)Z
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Li7/o;->h:Li7/o$a;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "rw"

    .line 12
    .line 13
    invoke-virtual {v0, p1, v1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :goto_1
    sget-object v0, Li7/o;->h:Li7/o$a;

    .line 28
    .line 29
    invoke-static {p1}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-static {p1}, Li7/o;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    move-object p1, v0

    .line 46
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1
.end method


# virtual methods
.method public final getAppContext()Lexpo/modules/kotlin/AppContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->appContext:Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final launchMediaStoreDeleteRequest(Ljava/util/List;Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;-><init>(Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->deleteLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 54
    .line 55
    if-nez p2, :cond_3

    .line 56
    .line 57
    const-string p2, "deleteLauncher"

    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p2, 0x0

    .line 63
    :cond_3
    new-instance v2, Lexpo/modules/medialibrary/next/permissions/contracts/DeleteContractInput;

    .line 64
    .line 65
    invoke-static {p1}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {v2, p1}, Lexpo/modules/medialibrary/next/permissions/contracts/DeleteContractInput;-><init>(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    iput v3, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$launchMediaStoreDeleteRequest$1;->label:I

    .line 73
    .line 74
    invoke-virtual {p2, v2, v0}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;->launch(Ljava/io/Serializable;Ln7/f;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-ne p2, v1, :cond_4

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    sget-object p1, Li7/B;->a:Li7/B;

    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_5
    new-instance p1, Lexpo/modules/medialibrary/PermissionsException;

    .line 93
    .line 94
    const-string p2, "User didn\'t grant write permission to requested files."

    .line 95
    .line 96
    invoke-direct {p1, p2}, Lexpo/modules/medialibrary/PermissionsException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public final registerMediaStoreContracts(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/providers/AppContextProvider;Ln7/f;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;",
            "Lexpo/modules/kotlin/providers/AppContextProvider;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->label:I

    .line 18
    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;-><init>(Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Ln7/f;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->label:I

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    const/4 v2, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    if-ne v1, v7, :cond_1

    .line 42
    .line 43
    iget-object p1, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 46
    .line 47
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    iget-object p1, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$2:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 62
    .line 63
    iget-object p2, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p2, Lexpo/modules/kotlin/providers/AppContextProvider;

    .line 66
    .line 67
    iget-object v1, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 70
    .line 71
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move p3, v2

    .line 79
    new-instance v2, Lexpo/modules/medialibrary/next/permissions/contracts/DeleteContract;

    .line 80
    .line 81
    invoke-direct {v2, p2}, Lexpo/modules/medialibrary/next/permissions/contracts/DeleteContract;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V

    .line 82
    .line 83
    .line 84
    iput-object p1, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object p2, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object p0, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$2:Ljava/lang/Object;

    .line 89
    .line 90
    iput p3, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->label:I

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v5, 0x2

    .line 94
    const/4 v6, 0x0

    .line 95
    move-object v1, p1

    .line 96
    invoke-static/range {v1 .. v6}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller$DefaultImpls;->registerForActivityResult$default(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    if-ne p3, v0, :cond_4

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    move-object p1, p0

    .line 104
    :goto_2
    check-cast p3, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 105
    .line 106
    iput-object p3, p1, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->deleteLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 107
    .line 108
    new-instance v2, Lexpo/modules/medialibrary/next/permissions/contracts/WriteContract;

    .line 109
    .line 110
    invoke-direct {v2, p2}, Lexpo/modules/medialibrary/next/permissions/contracts/WriteContract;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V

    .line 111
    .line 112
    .line 113
    iput-object p0, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    iput-object p1, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object p1, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->L$2:Ljava/lang/Object;

    .line 119
    .line 120
    iput v7, v4, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$registerMediaStoreContracts$1;->label:I

    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v5, 0x2

    .line 124
    const/4 v6, 0x0

    .line 125
    invoke-static/range {v1 .. v6}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller$DefaultImpls;->registerForActivityResult$default(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    if-ne p3, v0, :cond_5

    .line 130
    .line 131
    :goto_3
    return-object v0

    .line 132
    :cond_5
    move-object p1, p0

    .line 133
    :goto_4
    check-cast p3, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 134
    .line 135
    iput-object p3, p1, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->writeLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 136
    .line 137
    sget-object p1, Li7/B;->a:Li7/B;

    .line 138
    .line 139
    return-object p1
.end method

.method public final requestMediaLibraryWritePermission(Ljava/lang/Iterable;Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;-><init>(Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v2, 0x1e

    .line 56
    .line 57
    if-ge p2, v2, :cond_3

    .line 58
    .line 59
    sget-object p1, Li7/B;->a:Li7/B;

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_3
    new-instance p2, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_5

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    move-object v4, v2

    .line 82
    check-cast v4, Landroid/net/Uri;

    .line 83
    .line 84
    invoke-direct {p0, v4}, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->hasWritePermissionForUri(Landroid/net/Uri;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-nez v4, :cond_4

    .line 89
    .line 90
    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    sget-object p1, Li7/B;->a:Li7/B;

    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_6
    iget-object p1, p0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->writeLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 104
    .line 105
    if-nez p1, :cond_7

    .line 106
    .line 107
    const-string p1, "writeLauncher"

    .line 108
    .line 109
    invoke-static {p1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 p1, 0x0

    .line 113
    :cond_7
    new-instance v2, Lexpo/modules/medialibrary/next/permissions/contracts/WriteContractInput;

    .line 114
    .line 115
    invoke-direct {v2, p2}, Lexpo/modules/medialibrary/next/permissions/contracts/WriteContractInput;-><init>(Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    iput v3, v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate$requestMediaLibraryWritePermission$1;->label:I

    .line 119
    .line 120
    invoke-virtual {p1, v2, v0}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;->launch(Ljava/io/Serializable;Ln7/f;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    if-ne p2, v1, :cond_8

    .line 125
    .line 126
    return-object v1

    .line 127
    :cond_8
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_9

    .line 134
    .line 135
    sget-object p1, Li7/B;->a:Li7/B;

    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_9
    new-instance p1, Lexpo/modules/medialibrary/PermissionsException;

    .line 139
    .line 140
    const-string p2, "User didn\'t grant write permission to requested files."

    .line 141
    .line 142
    invoke-direct {p1, p2}, Lexpo/modules/medialibrary/PermissionsException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1
.end method
