.class final Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/ReactActivityDelegateWrapper;->requestPermissions([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V
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
    c = "expo.modules.ReactActivityDelegateWrapper$requestPermissions$1"
    f = "ReactActivityDelegateWrapper.kt"
    l = {
        0x146
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $listener:Lcom/facebook/react/modules/core/PermissionListener;

.field final synthetic $permissions:[Ljava/lang/String;

.field final synthetic $requestCode:I

.field label:I

.field final synthetic this$0:Lexpo/modules/ReactActivityDelegateWrapper;


# direct methods
.method constructor <init>(Lexpo/modules/ReactActivityDelegateWrapper;[Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/ReactActivityDelegateWrapper;",
            "[",
            "Ljava/lang/String;",
            "I",
            "Lcom/facebook/react/modules/core/PermissionListener;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$permissions:[Ljava/lang/String;

    .line 4
    .line 5
    iput p3, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$requestCode:I

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$listener:Lcom/facebook/react/modules/core/PermissionListener;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 6
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
    new-instance v0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$permissions:[Ljava/lang/String;

    .line 6
    .line 7
    iget v3, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$requestCode:I

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$listener:Lcom/facebook/react/modules/core/PermissionListener;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;-><init>(Lexpo/modules/ReactActivityDelegateWrapper;[Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;Ln7/f;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->label:I

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
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 28
    .line 29
    invoke-static {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->access$getLoadAppReady$p(Lexpo/modules/ReactActivityDelegateWrapper;)LR8/w;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput v2, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->label:I

    .line 34
    .line 35
    invoke-interface {p1, p0}, LR8/V;->I(Ln7/f;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    iget-object p1, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->this$0:Lexpo/modules/ReactActivityDelegateWrapper;

    .line 43
    .line 44
    invoke-virtual {p1}, Lexpo/modules/ReactActivityDelegateWrapper;->getDelegate$expo_release()Lcom/facebook/react/ReactActivityDelegate;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$permissions:[Ljava/lang/String;

    .line 49
    .line 50
    iget v1, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$requestCode:I

    .line 51
    .line 52
    iget-object v2, p0, Lexpo/modules/ReactActivityDelegateWrapper$requestPermissions$1;->$listener:Lcom/facebook/react/modules/core/PermissionListener;

    .line 53
    .line 54
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/ReactActivityDelegate;->requestPermissions([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V

    .line 55
    .line 56
    .line 57
    sget-object p1, Li7/B;->a:Li7/B;

    .line 58
    .line 59
    return-object p1
.end method
