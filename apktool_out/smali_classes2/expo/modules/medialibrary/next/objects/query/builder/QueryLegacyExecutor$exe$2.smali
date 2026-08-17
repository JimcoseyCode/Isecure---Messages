.class final Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;->exe([Ljava/lang/String;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Landroid/database/Cursor;",
        "<anonymous>",
        "(LR8/N;)Landroid/database/Cursor;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.objects.query.builder.QueryLegacyExecutor$exe$2"
    f = "QueryLegacyExecutor.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $contentResolver:Landroid/content/ContentResolver;

.field final synthetic $projection:[Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;Landroid/content/ContentResolver;[Ljava/lang/String;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;",
            "Landroid/content/ContentResolver;",
            "[",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->$contentResolver:Landroid/content/ContentResolver;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->$projection:[Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 9
    .line 10
    .line 11
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
    new-instance p1, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->$contentResolver:Landroid/content/ContentResolver;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->$projection:[Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;-><init>(Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;Landroid/content/ContentResolver;[Ljava/lang/String;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;

    .line 12
    .line 13
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;->access$buildSelection(Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;

    .line 18
    .line 19
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;->access$buildSortOrder(Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;

    .line 24
    .line 25
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;->access$getArgs$p(Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    new-array v0, v0, [Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    move-object v4, p1

    .line 37
    check-cast v4, [Ljava/lang/String;

    .line 38
    .line 39
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->$contentResolver:Landroid/content/ContentResolver;

    .line 40
    .line 41
    invoke-static {}, Lexpo/modules/medialibrary/next/extensions/resolver/AlbumExtensionsKt;->getEXTERNAL_CONTENT_URI()Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor$exe$2;->$projection:[Ljava/lang/String;

    .line 46
    .line 47
    invoke-static/range {v0 .. v5}, Lexpo/modules/medialibrary/next/extensions/resolver/SafeQueryKt;->safeQuery(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_0
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/QueryCouldNotBeExecuted;

    .line 55
    .line 56
    const-string v0, "Cursor is null"

    .line 57
    .line 58
    const/4 v1, 0x2

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-direct {p1, v0, v2, v1, v2}, Lexpo/modules/medialibrary/next/exceptions/QueryCouldNotBeExecuted;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method
