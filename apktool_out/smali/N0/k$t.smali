.class final LN0/k$t;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/k;->c(Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:I

.field private synthetic h:Ljava/lang/Object;

.field final synthetic i:LN0/k;

.field final synthetic j:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(LN0/k;Lkotlin/jvm/functions/Function2;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/k$t;->i:LN0/k;

    .line 2
    .line 3
    iput-object p2, p0, LN0/k$t;->j:Lkotlin/jvm/functions/Function2;

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

    .line 1
    new-instance v0, LN0/k$t;

    .line 2
    .line 3
    iget-object v1, p0, LN0/k$t;->i:LN0/k;

    .line 4
    .line 5
    iget-object v2, p0, LN0/k$t;->j:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LN0/k$t;-><init>(LN0/k;Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LN0/k$t;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN0/k$t;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, LN0/k$t;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, LN0/k$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, LN0/k$t;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

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
    iget v1, p0, LN0/k$t;->g:I

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
    return-object p1

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
    iget-object p1, p0, LN0/k$t;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LR8/N;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {v1, v2, v1}, LR8/y;->b(LR8/A0;ILjava/lang/Object;)LR8/w;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v3, p0, LN0/k$t;->i:LN0/k;

    .line 37
    .line 38
    invoke-static {v3}, LN0/k;->e(LN0/k;)LN0/l;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, LN0/l;->a()LN0/D;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    new-instance v4, LN0/w$a;

    .line 47
    .line 48
    iget-object v5, p0, LN0/k$t;->j:Lkotlin/jvm/functions/Function2;

    .line 49
    .line 50
    invoke-interface {p1}, LR8/N;->i()Ln7/j;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {v4, v5, v1, v3, p1}, LN0/w$a;-><init>(Lkotlin/jvm/functions/Function2;LR8/w;LN0/D;Ln7/j;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, LN0/k$t;->i:LN0/k;

    .line 58
    .line 59
    invoke-static {p1}, LN0/k;->i(LN0/k;)LN0/B;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1, v4}, LN0/B;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput v2, p0, LN0/k$t;->g:I

    .line 67
    .line 68
    invoke-interface {v1, p0}, LR8/V;->I(Ln7/f;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_2

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    return-object p1
.end method
