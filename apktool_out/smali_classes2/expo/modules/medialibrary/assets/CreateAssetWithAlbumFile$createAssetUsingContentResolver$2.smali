.class final Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->createAssetUsingContentResolver(Ln7/f;)Ljava/lang/Object;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LR8/N;",
        "Ljava/util/ArrayList;",
        "Landroid/os/Bundle;",
        "Lkotlin/collections/ArrayList;",
        "<anonymous>",
        "(LR8/N;)Ljava/util/ArrayList;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.assets.CreateAssetWithAlbumFile$createAssetUsingContentResolver$2"
    f = "CreateAsset.kt"
    l = {
        0x6e,
        0x74
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->this$0:Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 2
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
    new-instance v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->this$0:Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;-><init>(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

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
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->label:I

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
    iget-object v1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->L$1:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Landroid/net/Uri;

    .line 30
    .line 31
    iget-object v3, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, LR8/N;

    .line 34
    .line 35
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, LR8/N;

    .line 45
    .line 46
    iget-object v1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->this$0:Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 47
    .line 48
    invoke-static {v1}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->access$createContentResolverAssetEntry(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;)Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v1, :cond_6

    .line 53
    .line 54
    iget-object v4, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->this$0:Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 55
    .line 56
    new-instance v5, Ljava/io/File;

    .line 57
    .line 58
    iget-object v6, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->this$0:Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 59
    .line 60
    invoke-static {v6}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->access$getMUri$p(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;)Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-static {v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    iput v3, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->label:I

    .line 79
    .line 80
    invoke-static {v4, v5, v1, p0}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->access$writeFileContentsToAsset(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ljava/io/File;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-ne v3, v0, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v3, p1

    .line 88
    :goto_0
    invoke-interface {v3}, LR8/N;->i()Ln7/j;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, LR8/D0;->g(Ln7/j;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->this$0:Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 96
    .line 97
    invoke-static {p1}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->access$getResolveWithAdditionalData$p(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    const/4 v3, 0x0

    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    invoke-static {v1}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    filled-new-array {p1}, [Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object v1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->this$0:Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 117
    .line 118
    invoke-static {v1}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->access$getContext$p(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;)Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iput-object v3, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v3, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->L$1:Ljava/lang/Object;

    .line 125
    .line 126
    iput v2, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;->label:I

    .line 127
    .line 128
    const-string v2, "_id=?"

    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    invoke-static {v1, v2, p1, v3, p0}, Lexpo/modules/medialibrary/assets/AssetUtilsKt;->queryAssetInfo(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ne p1, v0, :cond_4

    .line 136
    .line 137
    :goto_1
    return-object v0

    .line 138
    :cond_4
    return-object p1

    .line 139
    :cond_5
    return-object v3

    .line 140
    :cond_6
    new-instance p1, Lexpo/modules/medialibrary/ContentEntryException;

    .line 141
    .line 142
    invoke-direct {p1}, Lexpo/modules/medialibrary/ContentEntryException;-><init>()V

    .line 143
    .line 144
    .line 145
    throw p1
.end method
