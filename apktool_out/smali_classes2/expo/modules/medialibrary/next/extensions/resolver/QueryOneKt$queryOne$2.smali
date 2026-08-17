.class final Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
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
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\n"
    }
    d2 = {
        "T",
        "LR8/N;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.extensions.resolver.QueryOneKt$queryOne$2"
    f = "QueryOne.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $column:Ljava/lang/String;

.field final synthetic $contentUri:Landroid/net/Uri;

.field final synthetic $extractor:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field final synthetic $selection:Ljava/lang/String;

.field final synthetic $selectionArgs:[Ljava/lang/String;

.field final synthetic $sortOrder:Ljava/lang/String;

.field final synthetic $this_queryOne:Landroid/content/ContentResolver;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$column:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$this_queryOne:Landroid/content/ContentResolver;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$contentUri:Landroid/net/Uri;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$selection:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$selectionArgs:[Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$sortOrder:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$extractor:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 9
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
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$column:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$this_queryOne:Landroid/content/ContentResolver;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$contentUri:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$selection:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$selectionArgs:[Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$sortOrder:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$extractor:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;-><init>(Ljava/lang/String;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LR8/N;

    .line 14
    .line 15
    iget-object v0, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$column:Ljava/lang/String;

    .line 16
    .line 17
    filled-new-array {v0}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$this_queryOne:Landroid/content/ContentResolver;

    .line 22
    .line 23
    iget-object v2, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$contentUri:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object v4, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$selection:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$selectionArgs:[Ljava/lang/String;

    .line 28
    .line 29
    iget-object v6, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$sortOrder:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static/range {v1 .. v6}, Lexpo/modules/medialibrary/next/extensions/resolver/SafeQueryKt;->safeQuery(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v0, 0x0

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$column:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt$queryOne$2;->$extractor:Lkotlin/jvm/functions/Function2;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, LR8/O;->d(LR8/N;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {v3, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    move-object p1, v0

    .line 68
    :goto_0
    invoke-static {v1, v0}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    invoke-static {v1, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_1
    return-object v0

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method
