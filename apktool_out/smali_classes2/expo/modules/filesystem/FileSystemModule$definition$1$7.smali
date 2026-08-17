.class final Lexpo/modules/filesystem/FileSystemModule$definition$1$7;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/FileSystemModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
    c = "expo.modules.filesystem.FileSystemModule$definition$1$7"
    f = "FileSystemModule.kt"
    l = {
        0x5e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $filePickerLauncher:Lkotlin/jvm/internal/C;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/C;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/filesystem/FileSystemModule;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/C;Lexpo/modules/filesystem/FileSystemModule;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/C;",
            "Lexpo/modules/filesystem/FileSystemModule;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->$filePickerLauncher:Lkotlin/jvm/internal/C;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->this$0:Lexpo/modules/filesystem/FileSystemModule;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 7
    .line 8
    .line 9
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
    new-instance v0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->$filePickerLauncher:Lkotlin/jvm/internal/C;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->this$0:Lexpo/modules/filesystem/FileSystemModule;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;-><init>(Lkotlin/jvm/internal/C;Lexpo/modules/filesystem/FileSystemModule;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->invoke(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->label:I

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
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/internal/C;

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

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
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v3, p1

    .line 34
    check-cast v3, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 35
    .line 36
    iget-object p1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->$filePickerLauncher:Lkotlin/jvm/internal/C;

    .line 37
    .line 38
    new-instance v4, Lexpo/modules/filesystem/FilePickerContract;

    .line 39
    .line 40
    iget-object v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->this$0:Lexpo/modules/filesystem/FileSystemModule;

    .line 41
    .line 42
    invoke-direct {v4, v1}, Lexpo/modules/filesystem/FilePickerContract;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    iput v2, p0, Lexpo/modules/filesystem/FileSystemModule$definition$1$7;->label:I

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v7, 0x2

    .line 51
    const/4 v8, 0x0

    .line 52
    move-object v6, p0

    .line 53
    invoke-static/range {v3 .. v8}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller$DefaultImpls;->registerForActivityResult$default(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-ne v1, v0, :cond_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    move-object v0, p1

    .line 61
    move-object p1, v1

    .line 62
    :goto_0
    iput-object p1, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 63
    .line 64
    sget-object p1, Li7/B;->a:Li7/B;

    .line 65
    .line 66
    return-object p1
.end method
