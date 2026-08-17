.class final Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/activityresult/ActivityResultsManager;-><init>(Lexpo/modules/kotlin/providers/CurrentActivityProvider;)V
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
        "LR8/N;",
        "Li7/B;",
        "<anonymous>",
        "(LR8/N;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.kotlin.activityresult.ActivityResultsManager$1"
    f = "ActivityResultsManager.kt"
    l = {
        0x65
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/kotlin/activityresult/ActivityResultsManager;


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/activityresult/ActivityResultsManager;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/activityresult/ActivityResultsManager;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->this$0:Lexpo/modules/kotlin/activityresult/ActivityResultsManager;

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
    .locals 1
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
    new-instance p1, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->this$0:Lexpo/modules/kotlin/activityresult/ActivityResultsManager;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;-><init>(Lexpo/modules/kotlin/activityresult/ActivityResultsManager;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->label:I

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
    iget-object v0, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->L$1:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager;

    .line 15
    .line 16
    iget-object v0, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;

    .line 19
    .line 20
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->this$0:Lexpo/modules/kotlin/activityresult/ActivityResultsManager;

    .line 36
    .line 37
    iput-object p1, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p1, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    iput v2, p0, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1;->label:I

    .line 42
    .line 43
    new-instance v1, LR8/o;

    .line 44
    .line 45
    invoke-static {p0}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-direct {v1, v3, v2}, LR8/o;-><init>(Ln7/f;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, LR8/o;->F()V

    .line 53
    .line 54
    .line 55
    new-instance v2, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$1;

    .line 56
    .line 57
    invoke-direct {v2, v1, p1, p1}, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$1;-><init>(LR8/m;Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;Lexpo/modules/kotlin/activityresult/ActivityResultsManager;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v2}, Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;->addOnActivityAvailableListener(Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$2;

    .line 64
    .line 65
    invoke-direct {v3, p1, v2}, Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$2;-><init>(Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;Lexpo/modules/kotlin/activityresult/ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$1;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v1, v3}, LR8/m;->g(Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, LR8/o;->z()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne p1, v1, :cond_2

    .line 80
    .line 81
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    if-ne p1, v0, :cond_3

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    :goto_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 88
    .line 89
    return-object p1
.end method
