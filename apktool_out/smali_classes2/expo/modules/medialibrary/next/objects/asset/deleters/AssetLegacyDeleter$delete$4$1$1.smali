.class final Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LR8/N;",
        "Li7/o;",
        "Li7/B;",
        "<anonymous>",
        "(LR8/N;)Li7/o;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.objects.asset.deleters.AssetLegacyDeleter$delete$4$1$1"
    f = "AssetLegacyDeleter.kt"
    l = {
        0x2e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $uri:Landroid/net/Uri;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;Landroid/net/Uri;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->this$0:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->$uri:Landroid/net/Uri;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->this$0:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->$uri:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;Landroid/net/Uri;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->L$0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LR8/N;

    .line 32
    .line 33
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->this$0:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;

    .line 34
    .line 35
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->$uri:Landroid/net/Uri;

    .line 36
    .line 37
    :try_start_1
    sget-object v3, Li7/o;->h:Li7/o$a;

    .line 38
    .line 39
    iput v2, p0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter$delete$4$1$1;->label:I

    .line 40
    .line 41
    invoke-virtual {p1, v1, p0}, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;->delete(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 49
    .line 50
    invoke-static {p1}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    goto :goto_2

    .line 55
    :goto_1
    sget-object v0, Li7/o;->h:Li7/o$a;

    .line 56
    .line 57
    invoke-static {p1}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_2
    invoke-static {p1}, Li7/o;->a(Ljava/lang/Object;)Li7/o;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method
