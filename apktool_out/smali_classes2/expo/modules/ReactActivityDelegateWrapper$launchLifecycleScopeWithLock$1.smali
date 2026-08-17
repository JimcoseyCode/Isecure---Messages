.class final Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/ReactActivityDelegateWrapper;->launchLifecycleScopeWithLock(LR8/P;Lkotlin/jvm/functions/Function2;)V
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
    c = "expo.modules.ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1"
    f = "ReactActivityDelegateWrapper.kt"
    l = {
        0x1de,
        0x1c4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $block:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/ReactActivityDelegateWrapper;


# direct methods
.method constructor <init>(Lexpo/modules/ReactActivityDelegateWrapper;Lkotlin/jvm/functions/Function2;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/ReactActivityDelegateWrapper;",
            "Lkotlin/jvm/functions/Function2;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->$block:Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->$block:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;-><init>(Lexpo/modules/ReactActivityDelegateWrapper;Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La9/a;

    .line 19
    .line 20
    :try_start_0
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_3

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$2:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 37
    .line 38
    iget-object v3, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, La9/a;

    .line 41
    .line 42
    iget-object v5, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, LR8/N;

    .line 45
    .line 46
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object p1, v3

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v5, p1

    .line 57
    check-cast v5, LR8/N;

    .line 58
    .line 59
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 60
    .line 61
    invoke-static {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->access$getMutex$p(Lexpo/modules/ReactActivityDelegateWrapper;)La9/a;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->$block:Lkotlin/jvm/functions/Function2;

    .line 66
    .line 67
    iput-object v5, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$2:Ljava/lang/Object;

    .line 72
    .line 73
    iput v3, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->label:I

    .line 74
    .line 75
    invoke-interface {p1, v4, p0}, La9/a;->a(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-ne v3, v0, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    :goto_0
    :try_start_1
    iput-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v4, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$1:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v4, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->L$2:Ljava/lang/Object;

    .line 87
    .line 88
    iput v2, p0, Lexpo/modules/ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;->label:I

    .line 89
    .line 90
    invoke-interface {v1, v5, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    if-ne v1, v0, :cond_4

    .line 95
    .line 96
    :goto_1
    return-object v0

    .line 97
    :cond_4
    move-object v0, p1

    .line 98
    :goto_2
    :try_start_2
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    .line 100
    invoke-interface {v0, v4}, La9/a;->c(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object p1, Li7/B;->a:Li7/B;

    .line 104
    .line 105
    return-object p1

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    move-object v6, v0

    .line 108
    move-object v0, p1

    .line 109
    move-object p1, v6

    .line 110
    :goto_3
    invoke-interface {v0, v4}, La9/a;->c(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method
