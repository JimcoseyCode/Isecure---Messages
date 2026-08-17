.class public final Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;
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
        "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3"
    f = "MediaLibraryNextModule.kt"
    l = {
        0x10f,
        0x10f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;


# direct methods
.method public constructor <init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

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
    new-instance p1, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;

    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    invoke-direct {p1, p3, v0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;-><init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    iput-object p2, p1, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

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
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    iget-object v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->L$1:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 31
    .line 32
    iget-object v4, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Landroid/net/Uri;

    .line 35
    .line 36
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p1, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;

    .line 40
    .line 41
    invoke-virtual {p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->unbox-impl()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    aget-object v1, p1, v1

    .line 55
    .line 56
    aget-object p1, p1, v4

    .line 57
    .line 58
    check-cast p1, Lexpo/modules/medialibrary/next/objects/album/Album;

    .line 59
    .line 60
    check-cast v1, Landroid/net/Uri;

    .line 61
    .line 62
    iget-object v5, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    .line 63
    .line 64
    invoke-static {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getAssetFactory(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    iput-object v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v5, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    iput v4, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->label:I

    .line 75
    .line 76
    invoke-virtual {p1, p0}, Lexpo/modules/medialibrary/next/objects/album/Album;->getRelativePath-MwbCjzw(Ln7/f;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    move-object v4, v1

    .line 84
    move-object v1, v5

    .line 85
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 86
    .line 87
    move-object v5, v1

    .line 88
    move-object v1, v4

    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object p1, v3

    .line 91
    :goto_1
    iput-object v3, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v3, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput v2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;->label:I

    .line 96
    .line 97
    invoke-interface {v5, v1, p1, p0}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;->create-BuevYFM(Landroid/net/Uri;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v0, :cond_5

    .line 102
    .line 103
    :goto_2
    return-object v0

    .line 104
    :cond_5
    return-object p1
.end method
