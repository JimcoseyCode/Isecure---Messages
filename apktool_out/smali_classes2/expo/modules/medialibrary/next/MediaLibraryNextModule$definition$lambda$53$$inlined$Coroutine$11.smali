.class public final Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;
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
        "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11"
    f = "MediaLibraryNextModule.kt"
    l = {
        0x110,
        0x11b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;


# direct methods
.method public constructor <init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

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
    new-instance p1, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;

    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    invoke-direct {p1, p3, v0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;-><init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    iput-object p2, p1, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->label:I

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    iget-object v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$2:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/util/Collection;

    .line 33
    .line 34
    iget-object v5, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$1:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Ljava/util/Iterator;

    .line 37
    .line 38
    iget-object v6, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v6, Ljava/util/Collection;

    .line 41
    .line 42
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    aget-object p1, p1, v1

    .line 55
    .line 56
    check-cast p1, Ljava/util/List;

    .line 57
    .line 58
    new-instance v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static {p1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    move-object v5, p1

    .line 72
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lexpo/modules/medialibrary/next/objects/album/Album;

    .line 83
    .line 84
    iput-object v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v5, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$2:Ljava/lang/Object;

    .line 89
    .line 90
    iput v4, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->label:I

    .line 91
    .line 92
    invoke-virtual {p1, p0}, Lexpo/modules/medialibrary/next/objects/album/Album;->getAssets(Ln7/f;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, v0, :cond_3

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    move-object v6, v1

    .line 100
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-object v1, v6

    .line 106
    goto :goto_0

    .line 107
    :cond_4
    check-cast v1, Ljava/util/List;

    .line 108
    .line 109
    invoke-static {v1}, Lj7/q;->w(Ljava/lang/Iterable;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v1, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-static {p1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_5

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 137
    .line 138
    invoke-virtual {v2}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->getContentUri()Landroid/net/Uri;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    iget-object p1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    .line 147
    .line 148
    invoke-static {p1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getAssetDeleter(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const/4 v2, 0x0

    .line 153
    iput-object v2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$0:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$1:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->L$2:Ljava/lang/Object;

    .line 158
    .line 159
    iput v3, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;->label:I

    .line 160
    .line 161
    invoke-interface {p1, v1, p0}, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;->delete(Ljava/util/List;Ln7/f;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-ne p1, v0, :cond_6

    .line 166
    .line 167
    :goto_3
    return-object v0

    .line 168
    :cond_6
    :goto_4
    sget-object p1, Li7/B;->a:Li7/B;

    .line 169
    .line 170
    return-object p1
.end method
