.class public final Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lw7/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "LR8/N;",
        "",
        "",
        "<destruct>",
        "<anonymous>",
        "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;",
        "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7"
    f = "MediaLibraryNextModule.kt"
    l = {
        0x113,
        0x117
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;


# direct methods
.method public constructor <init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "[",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;

    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    invoke-direct {p1, p3, v0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;-><init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    iput-object p2, p1, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, [Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    aget-object v1, p1, v1

    .line 40
    .line 41
    aget-object v4, p1, v3

    .line 42
    .line 43
    aget-object p1, p1, v2

    .line 44
    .line 45
    check-cast p1, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    check-cast v4, Lexpo/modules/kotlin/types/Either;

    .line 52
    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    const-class v5, Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v4, v6}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_4

    .line 66
    .line 67
    invoke-virtual {v4, v6}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/util/List;

    .line 72
    .line 73
    iget-object v4, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    .line 74
    .line 75
    invoke-static {v4}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getAlbumFactory(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iput v3, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->label:I

    .line 80
    .line 81
    invoke-interface {v4, v1, v2, p1, p0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;->createFromAssets(Ljava/lang/String;Ljava/util/List;ZLn7/f;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v0, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    return-object p1

    .line 89
    :cond_4
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v4, p1}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Ljava/util/List;

    .line 98
    .line 99
    iget-object v3, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    .line 100
    .line 101
    invoke-static {v3}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getAlbumFactory(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iput v2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;->label:I

    .line 106
    .line 107
    invoke-interface {v3, v1, p1, p0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;->createFromFilePaths(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v0, :cond_5

    .line 112
    .line 113
    :goto_0
    return-object v0

    .line 114
    :cond_5
    return-object p1
.end method
