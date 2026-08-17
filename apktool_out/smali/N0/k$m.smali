.class final LN0/k$m;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/k;->x(ZLn7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:Ljava/lang/Object;

.field h:I

.field synthetic i:Z

.field final synthetic j:LN0/k;

.field final synthetic k:I


# direct methods
.method constructor <init>(LN0/k;ILn7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/k$m;->j:LN0/k;

    .line 2
    .line 3
    iput p2, p0, LN0/k$m;->k:I

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
.method public final c(ZLn7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, LN0/k$m;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LN0/k$m;

    .line 10
    .line 11
    sget-object p2, Li7/B;->a:Li7/B;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LN0/k$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3

    .line 1
    new-instance v0, LN0/k$m;

    .line 2
    .line 3
    iget-object v1, p0, LN0/k$m;->j:LN0/k;

    .line 4
    .line 5
    iget v2, p0, LN0/k$m;->k:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LN0/k$m;-><init>(LN0/k;ILn7/f;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput-boolean p1, v0, LN0/k$m;->i:Z

    .line 17
    .line 18
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ln7/f;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, LN0/k$m;->c(ZLn7/f;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LN0/k$m;->h:I

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
    iget-boolean v0, p0, LN0/k$m;->i:Z

    .line 16
    .line 17
    iget-object v1, p0, LN0/k$m;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Throwable;

    .line 20
    .line 21
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-boolean v1, p0, LN0/k$m;->i:Z

    .line 34
    .line 35
    :try_start_0
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-boolean v1, p0, LN0/k$m;->i:Z

    .line 45
    .line 46
    :try_start_1
    iget-object p1, p0, LN0/k$m;->j:LN0/k;

    .line 47
    .line 48
    iput-boolean v1, p0, LN0/k$m;->i:Z

    .line 49
    .line 50
    iput v3, p0, LN0/k$m;->h:I

    .line 51
    .line 52
    invoke-static {p1, v1, p0}, LN0/k;->o(LN0/k;ZLn7/f;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    :goto_0
    check-cast p1, LN0/D;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    goto :goto_5

    .line 62
    :goto_1
    if-eqz v1, :cond_5

    .line 63
    .line 64
    iget-object v3, p0, LN0/k$m;->j:LN0/k;

    .line 65
    .line 66
    invoke-static {v3}, LN0/k;->d(LN0/k;)LN0/t;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iput-object p1, p0, LN0/k$m;->g:Ljava/lang/Object;

    .line 71
    .line 72
    iput-boolean v1, p0, LN0/k$m;->i:Z

    .line 73
    .line 74
    iput v2, p0, LN0/k$m;->h:I

    .line 75
    .line 76
    invoke-interface {v3, p0}, LN0/t;->d(Ln7/f;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-ne v2, v0, :cond_4

    .line 81
    .line 82
    :goto_2
    return-object v0

    .line 83
    :cond_4
    move v0, v1

    .line 84
    move-object v1, p1

    .line 85
    move-object p1, v2

    .line 86
    :goto_3
    check-cast p1, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    goto :goto_4

    .line 93
    :cond_5
    iget v0, p0, LN0/k$m;->k:I

    .line 94
    .line 95
    move v4, v1

    .line 96
    move-object v1, p1

    .line 97
    move p1, v0

    .line 98
    move v0, v4

    .line 99
    :goto_4
    new-instance v2, LN0/x;

    .line 100
    .line 101
    invoke-direct {v2, v1, p1}, LN0/x;-><init>(Ljava/lang/Throwable;I)V

    .line 102
    .line 103
    .line 104
    move v1, v0

    .line 105
    move-object p1, v2

    .line 106
    :goto_5
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {p1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method
