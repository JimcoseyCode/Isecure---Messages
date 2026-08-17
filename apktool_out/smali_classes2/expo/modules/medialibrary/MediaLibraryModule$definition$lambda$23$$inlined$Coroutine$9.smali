.class public final Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;
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
    c = "expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9"
    f = "MediaLibraryModule.kt"
    l = {
        0x110,
        0x111
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/MediaLibraryModule;


# direct methods
.method public constructor <init>(Ln7/f;Lexpo/modules/medialibrary/MediaLibraryModule;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

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
    new-instance p1, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;

    iget-object v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    invoke-direct {p1, p3, v0}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;-><init>(Ln7/f;Lexpo/modules/medialibrary/MediaLibraryModule;)V

    iput-object p2, p1, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

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
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

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
    iget-boolean v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->Z$0:Z

    .line 29
    .line 30
    iget-object v4, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->L$1:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, [Ljava/lang/String;

    .line 33
    .line 34
    iget-object v5, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v11, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, [Ljava/lang/Object;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    aget-object v5, p1, v1

    .line 52
    .line 53
    aget-object v6, p1, v4

    .line 54
    .line 55
    aget-object p1, p1, v3

    .line 56
    .line 57
    check-cast p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    check-cast v6, Ljava/lang/String;

    .line 64
    .line 65
    check-cast v5, [Ljava/lang/String;

    .line 66
    .line 67
    iget-object v7, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 68
    .line 69
    invoke-static {v7, v1, v4, v2}, Lexpo/modules/medialibrary/MediaLibraryModule;->requireSystemPermissions$default(Lexpo/modules/medialibrary/MediaLibraryModule;ZILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v8, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-array v1, v1, [Ljava/lang/String;

    .line 77
    .line 78
    move-object v9, v1

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move-object v9, v5

    .line 81
    :goto_0
    iput-object v6, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v5, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    iput-boolean p1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->Z$0:Z

    .line 86
    .line 87
    iput v4, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->label:I

    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v12, 0x2

    .line 91
    const/4 v13, 0x0

    .line 92
    move-object v11, p0

    .line 93
    invoke-static/range {v8 .. v13}, Lexpo/modules/medialibrary/MediaLibraryModule;->requestMediaLibraryActionPermission$default(Lexpo/modules/medialibrary/MediaLibraryModule;[Ljava/lang/String;ZLn7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-ne v1, v0, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    move v1, p1

    .line 101
    move-object v4, v5

    .line 102
    move-object v5, v6

    .line 103
    :goto_1
    iget-object p1, v11, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 104
    .line 105
    invoke-static {p1}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$getContext(Lexpo/modules/medialibrary/MediaLibraryModule;)Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object v2, v11, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v2, v11, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->L$1:Ljava/lang/Object;

    .line 112
    .line 113
    iput v3, v11, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$9;->label:I

    .line 114
    .line 115
    invoke-static {p1, v4, v5, v1, p0}, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt;->addAssetsToAlbum(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v0, :cond_5

    .line 120
    .line 121
    :goto_2
    return-object v0

    .line 122
    :cond_5
    return-object p1
.end method
