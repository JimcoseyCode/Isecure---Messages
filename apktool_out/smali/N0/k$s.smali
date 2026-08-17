.class final LN0/k$s;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/k;->B(Lkotlin/jvm/functions/Function2;Ln7/j;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:Ljava/lang/Object;

.field h:I

.field final synthetic i:LN0/k;

.field final synthetic j:Ln7/j;

.field final synthetic k:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(LN0/k;Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/k$s;->i:LN0/k;

    .line 2
    .line 3
    iput-object p2, p0, LN0/k$s;->j:Ln7/j;

    .line 4
    .line 5
    iput-object p3, p0, LN0/k$s;->k:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ln7/f;)Ln7/f;
    .locals 4

    .line 1
    new-instance v0, LN0/k$s;

    .line 2
    .line 3
    iget-object v1, p0, LN0/k$s;->i:LN0/k;

    .line 4
    .line 5
    iget-object v2, p0, LN0/k$s;->j:Ln7/j;

    .line 6
    .line 7
    iget-object v3, p0, LN0/k$s;->k:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p1}, LN0/k$s;-><init>(LN0/k;Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln7/f;

    invoke-virtual {p0, p1}, LN0/k$s;->invoke(Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, LN0/k$s;->create(Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, LN0/k$s;

    sget-object v0, Li7/B;->a:Li7/B;

    invoke-virtual {p1, v0}, LN0/k$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LN0/k$s;->h:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, LN0/k$s;->g:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0

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
    iget-object v1, p0, LN0/k$s;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, LN0/f;

    .line 35
    .line 36
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, LN0/k$s;->i:LN0/k;

    .line 48
    .line 49
    iput v4, p0, LN0/k$s;->h:I

    .line 50
    .line 51
    invoke-static {p1, v4, p0}, LN0/k;->o(LN0/k;ZLn7/f;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    :goto_0
    move-object v1, p1

    .line 59
    check-cast v1, LN0/f;

    .line 60
    .line 61
    iget-object p1, p0, LN0/k$s;->j:Ln7/j;

    .line 62
    .line 63
    new-instance v5, LN0/k$s$a;

    .line 64
    .line 65
    iget-object v6, p0, LN0/k$s;->k:Lkotlin/jvm/functions/Function2;

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-direct {v5, v6, v1, v7}, LN0/k$s$a;-><init>(Lkotlin/jvm/functions/Function2;LN0/f;Ln7/f;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, LN0/k$s;->g:Ljava/lang/Object;

    .line 72
    .line 73
    iput v3, p0, LN0/k$s;->h:I

    .line 74
    .line 75
    invoke-static {p1, v5, p0}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v0, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    :goto_1
    invoke-virtual {v1}, LN0/f;->b()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, LN0/f;->c()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    iget-object v1, p0, LN0/k$s;->i:LN0/k;

    .line 96
    .line 97
    iput-object p1, p0, LN0/k$s;->g:Ljava/lang/Object;

    .line 98
    .line 99
    iput v2, p0, LN0/k$s;->h:I

    .line 100
    .line 101
    invoke-virtual {v1, p1, v4, p0}, LN0/k;->C(Ljava/lang/Object;ZLn7/f;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-ne v1, v0, :cond_6

    .line 106
    .line 107
    :goto_2
    return-object v0

    .line 108
    :cond_6
    return-object p1
.end method
