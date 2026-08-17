.class public final Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/MediaLibraryModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
        "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$9"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26"
    f = "MediaLibraryModule.kt"
    l = {
        0x117,
        0x11a,
        0x11c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/MediaLibraryModule;


# direct methods
.method public constructor <init>(Ln7/f;Lexpo/modules/medialibrary/MediaLibraryModule;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

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
    new-instance p1, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;

    iget-object v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    invoke-direct {p1, p3, v0}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;-><init>(Ln7/f;Lexpo/modules/medialibrary/MediaLibraryModule;)V

    iput-object p2, p1, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    iget v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->label:I

    .line 6
    .line 7
    const/4 v7, 0x3

    .line 8
    const/4 v8, 0x2

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v9, 0x0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    if-eq v0, v8, :cond_1

    .line 16
    .line 17
    if-ne v0, v7, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_2
    iget-boolean v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->Z$0:Z

    .line 36
    .line 37
    iget-object v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$2:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Landroid/net/Uri;

    .line 48
    .line 49
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, [Ljava/lang/Object;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    aget-object v4, v0, v2

    .line 62
    .line 63
    aget-object v5, v0, v1

    .line 64
    .line 65
    aget-object v10, v0, v8

    .line 66
    .line 67
    aget-object v0, v0, v7

    .line 68
    .line 69
    move-object v11, v0

    .line 70
    check-cast v11, Landroid/net/Uri;

    .line 71
    .line 72
    check-cast v10, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    move-object v12, v5

    .line 79
    check-cast v12, Ljava/lang/String;

    .line 80
    .line 81
    move-object v13, v4

    .line 82
    check-cast v13, Ljava/lang/String;

    .line 83
    .line 84
    iget-object v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 85
    .line 86
    invoke-static {v0, v2, v1, v9}, Lexpo/modules/medialibrary/MediaLibraryModule;->requireSystemPermissions$default(Lexpo/modules/medialibrary/MediaLibraryModule;ZILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    if-nez v10, :cond_4

    .line 90
    .line 91
    if-eqz v12, :cond_4

    .line 92
    .line 93
    new-array v0, v1, [Ljava/lang/String;

    .line 94
    .line 95
    aput-object v12, v0, v2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    new-array v0, v2, [Ljava/lang/String;

    .line 99
    .line 100
    :goto_0
    iget-object v2, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 101
    .line 102
    iput-object v11, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v12, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$1:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v13, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$2:Ljava/lang/Object;

    .line 107
    .line 108
    iput-boolean v10, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->Z$0:Z

    .line 109
    .line 110
    iput v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->label:I

    .line 111
    .line 112
    move-object v1, v0

    .line 113
    move-object v0, v2

    .line 114
    const/4 v2, 0x0

    .line 115
    const/4 v4, 0x2

    .line 116
    const/4 v5, 0x0

    .line 117
    move-object v3, p0

    .line 118
    invoke-static/range {v0 .. v5}, Lexpo/modules/medialibrary/MediaLibraryModule;->requestMediaLibraryActionPermission$default(Lexpo/modules/medialibrary/MediaLibraryModule;[Ljava/lang/String;ZLn7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-ne v0, v6, :cond_5

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    move v0, v10

    .line 126
    move-object v4, v11

    .line 127
    move-object v2, v12

    .line 128
    move-object v1, v13

    .line 129
    :goto_1
    if-eqz v2, :cond_7

    .line 130
    .line 131
    iget-object v4, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 132
    .line 133
    invoke-static {v4}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$getContext(Lexpo/modules/medialibrary/MediaLibraryModule;)Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    iput-object v9, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v9, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v9, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$2:Ljava/lang/Object;

    .line 142
    .line 143
    iput v8, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->label:I

    .line 144
    .line 145
    invoke-static {v4, v1, v2, v0, p0}, Lexpo/modules/medialibrary/albums/CreateAlbumKt;->createAlbum(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-ne v0, v6, :cond_6

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_6
    return-object v0

    .line 153
    :cond_7
    if-eqz v4, :cond_9

    .line 154
    .line 155
    iget-object v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 156
    .line 157
    invoke-static {v0}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$getContext(Lexpo/modules/medialibrary/MediaLibraryModule;)Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iput-object v9, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$0:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v9, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$1:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v9, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->L$2:Ljava/lang/Object;

    .line 166
    .line 167
    iput v7, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$26;->label:I

    .line 168
    .line 169
    invoke-static {v0, v1, v4, p0}, Lexpo/modules/medialibrary/albums/CreateAlbumKt;->createAlbumWithInitialFileUri(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-ne v0, v6, :cond_8

    .line 174
    .line 175
    :goto_2
    return-object v6

    .line 176
    :cond_8
    return-object v0

    .line 177
    :cond_9
    new-instance v0, Lexpo/modules/medialibrary/AlbumException;

    .line 178
    .line 179
    const-string v1, "Could not create the album"

    .line 180
    .line 181
    invoke-direct {v0, v1}, Lexpo/modules/medialibrary/AlbumException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0
.end method
