.class final Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/MediaLibraryModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;",
        "Li7/B;",
        "<anonymous>",
        "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.MediaLibraryModule$definition$1$21"
    f = "MediaLibraryModule.kt"
    l = {
        0x113,
        0x115
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/MediaLibraryModule;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/MediaLibraryModule;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/MediaLibraryModule;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

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
    new-instance v0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;-><init>(Lexpo/modules/medialibrary/MediaLibraryModule;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->invoke(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->label:I

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
    iget-object v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 18
    .line 19
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 34
    .line 35
    iget-object v3, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 38
    .line 39
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v7, p0

    .line 43
    move-object v5, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v4, p1

    .line 51
    check-cast v4, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 52
    .line 53
    iget-object v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 54
    .line 55
    new-instance v5, Lexpo/modules/medialibrary/contracts/DeleteContract;

    .line 56
    .line 57
    invoke-direct {v5, v1}, Lexpo/modules/medialibrary/contracts/DeleteContract;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V

    .line 58
    .line 59
    .line 60
    iput-object v4, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->label:I

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v8, 0x2

    .line 68
    const/4 v9, 0x0

    .line 69
    move-object v7, p0

    .line 70
    invoke-static/range {v4 .. v9}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller$DefaultImpls;->registerForActivityResult$default(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v5, v4

    .line 78
    :goto_0
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 79
    .line 80
    invoke-static {v1, p1}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$setDeleteLauncher$p(Lexpo/modules/medialibrary/MediaLibraryModule;Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, v7, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 84
    .line 85
    new-instance v6, Lexpo/modules/medialibrary/contracts/WriteContract;

    .line 86
    .line 87
    invoke-direct {v6, p1}, Lexpo/modules/medialibrary/contracts/WriteContract;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V

    .line 88
    .line 89
    .line 90
    iput-object p1, v7, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    iput-object v1, v7, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput v2, v7, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$21;->label:I

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    const/4 v9, 0x2

    .line 99
    const/4 v10, 0x0

    .line 100
    move-object v8, p0

    .line 101
    invoke-static/range {v5 .. v10}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller$DefaultImpls;->registerForActivityResult$default(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-ne v1, v0, :cond_4

    .line 106
    .line 107
    :goto_1
    return-object v0

    .line 108
    :cond_4
    move-object v0, p1

    .line 109
    move-object p1, v1

    .line 110
    :goto_2
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 111
    .line 112
    invoke-static {v0, p1}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$setWriteLauncher$p(Lexpo/modules/medialibrary/MediaLibraryModule;Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;)V

    .line 113
    .line 114
    .line 115
    sget-object p1, Li7/B;->a:Li7/B;

    .line 116
    .line 117
    return-object p1
.end method
