.class final Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->queryOne(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
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
    c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$queryOne$2"
    f = "ContentResolverExtensions.kt"
    l = {
        0x47
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $column:Ljava/lang/String;

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

.field final synthetic $uri:Landroid/net/Uri;

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
    iput-object p1, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$column:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$this_queryOne:Landroid/content/ContentResolver;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$uri:Landroid/net/Uri;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$selection:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$selectionArgs:[Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$sortOrder:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$extractor:Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$column:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$this_queryOne:Landroid/content/ContentResolver;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$uri:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$selection:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$selectionArgs:[Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$sortOrder:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$extractor:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;-><init>(Ljava/lang/String;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->label:I

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
    iget-object v0, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LR8/N;

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object v9, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, LR8/N;

    .line 35
    .line 36
    iget-object v1, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$column:Ljava/lang/String;

    .line 37
    .line 38
    filled-new-array {v1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-object v3, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$this_queryOne:Landroid/content/ContentResolver;

    .line 43
    .line 44
    iget-object v4, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$uri:Landroid/net/Uri;

    .line 45
    .line 46
    iget-object v6, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$selection:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v7, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$selectionArgs:[Ljava/lang/String;

    .line 49
    .line 50
    iget-object v8, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$sortOrder:Ljava/lang/String;

    .line 51
    .line 52
    iput-object p1, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    iput v2, p0, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->label:I

    .line 55
    .line 56
    move-object v9, p0

    .line 57
    invoke-static/range {v3 .. v9}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeQuery(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-ne v1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    move-object v0, p1

    .line 65
    move-object p1, v1

    .line 66
    :goto_0
    check-cast p1, Ljava/io/Closeable;

    .line 67
    .line 68
    iget-object v1, v9, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$column:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v2, v9, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt$queryOne$2;->$extractor:Lkotlin/jvm/functions/Function2;

    .line 71
    .line 72
    :try_start_0
    move-object v3, p1

    .line 73
    check-cast v3, Landroid/database/Cursor;

    .line 74
    .line 75
    invoke-static {v0}, LR8/O;->d(LR8/N;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/4 v4, 0x0

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {v2, v3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    move-object v1, v0

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move-object v0, v4

    .line 102
    :goto_1
    invoke-static {p1, v4}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :goto_2
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    invoke-static {p1, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw v0
.end method
