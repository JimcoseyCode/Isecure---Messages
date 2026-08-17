.class public final LN0/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LN0/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN0/k$a;,
        LN0/k$b;
    }
.end annotation


# static fields
.field public static final m:LN0/k$a;


# instance fields
.field private final a:LN0/E;

.field private final b:LN0/e;

.field private final c:LR8/N;

.field private final d:LU8/b;

.field private final e:La9/a;

.field private f:I

.field private g:LR8/A0;

.field private final h:LN0/l;

.field private final i:LN0/k$b;

.field private final j:Lkotlin/Lazy;

.field private final k:Lkotlin/Lazy;

.field private final l:LN0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN0/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LN0/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LN0/k;->m:LN0/k$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LN0/E;Ljava/util/List;LN0/e;LR8/N;)V
    .locals 2

    .line 1
    const-string v0, "storage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "initTasksList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "corruptionHandler"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "scope"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LN0/k;->a:LN0/E;

    .line 25
    .line 26
    iput-object p3, p0, LN0/k;->b:LN0/e;

    .line 27
    .line 28
    iput-object p4, p0, LN0/k;->c:LR8/N;

    .line 29
    .line 30
    new-instance p1, LN0/k$d;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    invoke-direct {p1, p0, p3}, LN0/k$d;-><init>(LN0/k;Ln7/f;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, LU8/d;->i(Lkotlin/jvm/functions/Function2;)LU8/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, LN0/k;->d:LU8/b;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-static {p1, v0, p3}, La9/g;->b(ZILjava/lang/Object;)La9/a;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, LN0/k;->e:La9/a;

    .line 49
    .line 50
    new-instance p1, LN0/l;

    .line 51
    .line 52
    invoke-direct {p1}, LN0/l;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, LN0/k;->h:LN0/l;

    .line 56
    .line 57
    new-instance p1, LN0/k$b;

    .line 58
    .line 59
    invoke-direct {p1, p0, p2}, LN0/k$b;-><init>(LN0/k;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, LN0/k;->i:LN0/k$b;

    .line 63
    .line 64
    new-instance p1, LN0/k$r;

    .line 65
    .line 66
    invoke-direct {p1, p0}, LN0/k$r;-><init>(LN0/k;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, LN0/k;->j:Lkotlin/Lazy;

    .line 74
    .line 75
    new-instance p1, LN0/k$c;

    .line 76
    .line 77
    invoke-direct {p1, p0}, LN0/k$c;-><init>(LN0/k;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, LN0/k;->k:Lkotlin/Lazy;

    .line 85
    .line 86
    new-instance p1, LN0/B;

    .line 87
    .line 88
    new-instance p2, LN0/k$u;

    .line 89
    .line 90
    invoke-direct {p2, p0}, LN0/k$u;-><init>(LN0/k;)V

    .line 91
    .line 92
    .line 93
    sget-object v0, LN0/k$v;->h:LN0/k$v;

    .line 94
    .line 95
    new-instance v1, LN0/k$w;

    .line 96
    .line 97
    invoke-direct {v1, p0, p3}, LN0/k$w;-><init>(LN0/k;Ln7/f;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, p4, p2, v0, v1}, LN0/B;-><init>(LR8/N;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    iput-object p1, p0, LN0/k;->l:LN0/B;

    .line 104
    .line 105
    return-void
.end method

.method private final A(ZLn7/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LN0/k;->c:LR8/N;

    .line 2
    .line 3
    invoke-interface {v0}, LR8/N;->i()Ln7/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LN0/k$q;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2}, LN0/k$q;-><init>(LN0/k;ZLn7/f;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method private final B(Lkotlin/jvm/functions/Function2;Ln7/j;Ln7/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0}, LN0/k;->s()LN0/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LN0/k$s;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p2, p1, v2}, LN0/k$s;-><init>(LN0/k;Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, p3}, LN0/t;->a(Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public static final synthetic a(LN0/k;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN0/k;->q(Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(LN0/k;)LN0/t;
    .locals 0

    .line 1
    invoke-direct {p0}, LN0/k;->s()LN0/t;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(LN0/k;)LN0/l;
    .locals 0

    .line 1
    iget-object p0, p0, LN0/k;->h:LN0/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(LN0/k;)LN0/k$b;
    .locals 0

    .line 1
    iget-object p0, p0, LN0/k;->i:LN0/k$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(LN0/k;)LN0/E;
    .locals 0

    .line 1
    iget-object p0, p0, LN0/k;->a:LN0/E;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(LN0/k;)Lkotlin/Lazy;
    .locals 0

    .line 1
    iget-object p0, p0, LN0/k;->j:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(LN0/k;)LN0/B;
    .locals 0

    .line 1
    iget-object p0, p0, LN0/k;->l:LN0/B;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(LN0/k;LN0/w$a;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LN0/k;->u(LN0/w$a;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(LN0/k;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN0/k;->v(Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic l(LN0/k;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN0/k;->w(Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(LN0/k;ZLn7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LN0/k;->x(ZLn7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(LN0/k;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN0/k;->y(Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(LN0/k;ZLn7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LN0/k;->z(ZLn7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic p(LN0/k;ZLn7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LN0/k;->A(ZLn7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final q(Ln7/f;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, LN0/k$e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LN0/k$e;

    .line 7
    .line 8
    iget v1, v0, LN0/k$e;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN0/k$e;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN0/k$e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LN0/k$e;-><init>(LN0/k;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LN0/k$e;->i:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LN0/k$e;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, LN0/k$e;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La9/a;

    .line 42
    .line 43
    iget-object v0, v0, LN0/k$e;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LN0/k;

    .line 46
    .line 47
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, LN0/k;->e:La9/a;

    .line 63
    .line 64
    iput-object p0, v0, LN0/k$e;->g:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p1, v0, LN0/k$e;->h:Ljava/lang/Object;

    .line 67
    .line 68
    iput v3, v0, LN0/k$e;->k:I

    .line 69
    .line 70
    invoke-interface {p1, v4, v0}, La9/a;->a(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-ne v0, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object v0, p0

    .line 78
    move-object v1, p1

    .line 79
    :goto_1
    :try_start_0
    iget p1, v0, LN0/k;->f:I

    .line 80
    .line 81
    add-int/lit8 p1, p1, -0x1

    .line 82
    .line 83
    iput p1, v0, LN0/k;->f:I

    .line 84
    .line 85
    if-nez p1, :cond_5

    .line 86
    .line 87
    iget-object p1, v0, LN0/k;->g:LR8/A0;

    .line 88
    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    invoke-static {p1, v4, v3, v4}, LR8/A0$a;->a(LR8/A0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    :goto_2
    iput-object v4, v0, LN0/k;->g:LR8/A0;

    .line 98
    .line 99
    :cond_5
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    invoke-interface {v1, v4}, La9/a;->c(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object p1, Li7/B;->a:Li7/B;

    .line 105
    .line 106
    return-object p1

    .line 107
    :goto_3
    invoke-interface {v1, v4}, La9/a;->c(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    throw p1
.end method

.method private final r(ZLkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-direct {p0}, LN0/k;->s()LN0/t;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, LN0/k$f;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p2, v1}, LN0/k$f;-><init>(Lkotlin/jvm/functions/Function1;Ln7/f;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0, p3}, LN0/t;->a(Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method private final s()LN0/t;
    .locals 1

    .line 1
    iget-object v0, p0, LN0/k;->k:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN0/t;

    .line 8
    .line 9
    return-object v0
.end method

.method private final u(LN0/w$a;Ln7/f;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, LN0/k$g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LN0/k$g;

    .line 7
    .line 8
    iget v1, v0, LN0/k$g;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN0/k$g;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN0/k$g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LN0/k$g;-><init>(LN0/k;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LN0/k$g;->j:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LN0/k$g;->l:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_1

    .line 39
    .line 40
    if-eq v2, v4, :cond_3

    .line 41
    .line 42
    if-ne v2, v3, :cond_2

    .line 43
    .line 44
    :cond_1
    iget-object p1, v0, LN0/k$g;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, LR8/w;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :catchall_0
    move-exception p2

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_3
    iget-object p1, v0, LN0/k$g;->i:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, LR8/w;

    .line 67
    .line 68
    iget-object v2, v0, LN0/k$g;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, LN0/k;

    .line 71
    .line 72
    iget-object v4, v0, LN0/k$g;->g:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, LN0/w$a;

    .line 75
    .line 76
    :try_start_1
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    move-object p2, p1

    .line 80
    move-object p1, v4

    .line 81
    goto :goto_2

    .line 82
    :cond_4
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, LN0/w$a;->a()LR8/w;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    :try_start_2
    sget-object v2, Li7/o;->h:Li7/o$a;

    .line 90
    .line 91
    iget-object v2, p0, LN0/k;->h:LN0/l;

    .line 92
    .line 93
    invoke-virtual {v2}, LN0/l;->a()LN0/D;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    instance-of v6, v2, LN0/f;

    .line 98
    .line 99
    if-eqz v6, :cond_6

    .line 100
    .line 101
    invoke-virtual {p1}, LN0/w$a;->d()Lkotlin/jvm/functions/Function2;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {p1}, LN0/w$a;->b()Ln7/j;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p2, v0, LN0/k$g;->g:Ljava/lang/Object;

    .line 110
    .line 111
    iput v5, v0, LN0/k$g;->l:I

    .line 112
    .line 113
    invoke-direct {p0, v2, p1, v0}, LN0/k;->B(Lkotlin/jvm/functions/Function2;Ln7/j;Ln7/f;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v1, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    move-object v7, p2

    .line 121
    move-object p2, p1

    .line 122
    move-object p1, v7

    .line 123
    goto :goto_4

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    move-object v7, p2

    .line 126
    move-object p2, p1

    .line 127
    move-object p1, v7

    .line 128
    goto :goto_5

    .line 129
    :cond_6
    instance-of v6, v2, LN0/x;

    .line 130
    .line 131
    if-eqz v6, :cond_7

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_7
    instance-of v5, v2, LN0/H;

    .line 135
    .line 136
    :goto_1
    if-eqz v5, :cond_a

    .line 137
    .line 138
    invoke-virtual {p1}, LN0/w$a;->c()LN0/D;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    if-ne v2, v5, :cond_9

    .line 143
    .line 144
    iput-object p1, v0, LN0/k$g;->g:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object p0, v0, LN0/k$g;->h:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object p2, v0, LN0/k$g;->i:Ljava/lang/Object;

    .line 149
    .line 150
    iput v4, v0, LN0/k$g;->l:I

    .line 151
    .line 152
    invoke-direct {p0, v0}, LN0/k;->w(Ln7/f;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-ne v2, v1, :cond_8

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_8
    move-object v2, p0

    .line 160
    :goto_2
    invoke-virtual {p1}, LN0/w$a;->d()Lkotlin/jvm/functions/Function2;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual {p1}, LN0/w$a;->b()Ln7/j;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iput-object p2, v0, LN0/k$g;->g:Ljava/lang/Object;

    .line 169
    .line 170
    const/4 v5, 0x0

    .line 171
    iput-object v5, v0, LN0/k$g;->h:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v5, v0, LN0/k$g;->i:Ljava/lang/Object;

    .line 174
    .line 175
    iput v3, v0, LN0/k$g;->l:I

    .line 176
    .line 177
    invoke-direct {v2, v4, p1, v0}, LN0/k;->B(Lkotlin/jvm/functions/Function2;Ln7/j;Ln7/f;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 181
    if-ne p1, v1, :cond_5

    .line 182
    .line 183
    :goto_3
    return-object v1

    .line 184
    :goto_4
    :try_start_3
    invoke-static {p2}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 188
    goto :goto_6

    .line 189
    :cond_9
    :try_start_4
    const-string p1, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>"

    .line 190
    .line 191
    invoke-static {v2, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    check-cast v2, LN0/x;

    .line 195
    .line 196
    invoke-virtual {v2}, LN0/x;->b()Ljava/lang/Throwable;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    throw p1

    .line 201
    :cond_a
    instance-of p1, v2, LN0/r;

    .line 202
    .line 203
    if-eqz p1, :cond_b

    .line 204
    .line 205
    check-cast v2, LN0/r;

    .line 206
    .line 207
    invoke-virtual {v2}, LN0/r;->b()Ljava/lang/Throwable;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    throw p1

    .line 212
    :cond_b
    new-instance p1, Li7/m;

    .line 213
    .line 214
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 215
    .line 216
    .line 217
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 218
    :goto_5
    sget-object v0, Li7/o;->h:Li7/o$a;

    .line 219
    .line 220
    invoke-static {p2}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-static {p2}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    :goto_6
    invoke-static {p1, p2}, LR8/y;->c(LR8/w;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    sget-object p1, Li7/B;->a:Li7/B;

    .line 232
    .line 233
    return-object p1
.end method

.method private final v(Ln7/f;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, LN0/k$h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LN0/k$h;

    .line 7
    .line 8
    iget v1, v0, LN0/k$h;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN0/k$h;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN0/k$h;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LN0/k$h;-><init>(LN0/k;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LN0/k$h;->i:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LN0/k$h;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, LN0/k$h;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La9/a;

    .line 42
    .line 43
    iget-object v0, v0, LN0/k$h;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LN0/k;

    .line 46
    .line 47
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, LN0/k;->e:La9/a;

    .line 63
    .line 64
    iput-object p0, v0, LN0/k$h;->g:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p1, v0, LN0/k$h;->h:Ljava/lang/Object;

    .line 67
    .line 68
    iput v3, v0, LN0/k$h;->k:I

    .line 69
    .line 70
    invoke-interface {p1, v4, v0}, La9/a;->a(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-ne v0, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object v0, p0

    .line 78
    move-object v1, p1

    .line 79
    :goto_1
    :try_start_0
    iget p1, v0, LN0/k;->f:I

    .line 80
    .line 81
    add-int/2addr p1, v3

    .line 82
    iput p1, v0, LN0/k;->f:I

    .line 83
    .line 84
    if-ne p1, v3, :cond_4

    .line 85
    .line 86
    iget-object v5, v0, LN0/k;->c:LR8/N;

    .line 87
    .line 88
    new-instance v8, LN0/k$i;

    .line 89
    .line 90
    invoke-direct {v8, v0, v4}, LN0/k$i;-><init>(LN0/k;Ln7/f;)V

    .line 91
    .line 92
    .line 93
    const/4 v9, 0x3

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    invoke-static/range {v5 .. v10}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, v0, LN0/k;->g:LR8/A0;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object p1, v0

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    :goto_2
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    invoke-interface {v1, v4}, La9/a;->c(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object p1, Li7/B;->a:Li7/B;

    .line 113
    .line 114
    return-object p1

    .line 115
    :goto_3
    invoke-interface {v1, v4}, La9/a;->c(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    throw p1
.end method

.method private final w(Ln7/f;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, LN0/k$j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LN0/k$j;

    .line 7
    .line 8
    iget v1, v0, LN0/k$j;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN0/k$j;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN0/k$j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LN0/k$j;-><init>(LN0/k;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LN0/k$j;->i:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LN0/k$j;->k:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget v1, v0, LN0/k$j;->h:I

    .line 42
    .line 43
    iget-object v0, v0, LN0/k$j;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LN0/k;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_4

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    iget-object v2, v0, LN0/k$j;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, LN0/k;

    .line 64
    .line 65
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, LN0/k;->s()LN0/t;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p0, v0, LN0/k$j;->g:Ljava/lang/Object;

    .line 77
    .line 78
    iput v4, v0, LN0/k$j;->k:I

    .line 79
    .line 80
    invoke-interface {p1, v0}, LN0/t;->d(Ln7/f;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v1, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v2, p0

    .line 88
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    :try_start_1
    iget-object v4, v2, LN0/k;->i:LN0/k$b;

    .line 95
    .line 96
    iput-object v2, v0, LN0/k$j;->g:Ljava/lang/Object;

    .line 97
    .line 98
    iput p1, v0, LN0/k$j;->h:I

    .line 99
    .line 100
    iput v3, v0, LN0/k$j;->k:I

    .line 101
    .line 102
    invoke-virtual {v4, v0}, LN0/z;->c(Ln7/f;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    if-ne p1, v1, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_5
    :goto_3
    sget-object p1, Li7/B;->a:Li7/B;

    .line 110
    .line 111
    return-object p1

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    move v1, p1

    .line 114
    move-object p1, v0

    .line 115
    move-object v0, v2

    .line 116
    :goto_4
    iget-object v0, v0, LN0/k;->h:LN0/l;

    .line 117
    .line 118
    new-instance v2, LN0/x;

    .line 119
    .line 120
    invoke-direct {v2, p1, v1}, LN0/x;-><init>(Ljava/lang/Throwable;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2}, LN0/l;->c(LN0/D;)LN0/D;

    .line 124
    .line 125
    .line 126
    throw p1
.end method

.method private final x(ZLn7/f;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, LN0/k$k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LN0/k$k;

    .line 7
    .line 8
    iget v1, v0, LN0/k$k;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN0/k$k;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN0/k$k;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LN0/k$k;-><init>(LN0/k;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LN0/k$k;->j:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LN0/k$k;->l:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, LN0/k$k;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, LN0/k;

    .line 47
    .line 48
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    iget-object p1, v0, LN0/k$k;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, LN0/k;

    .line 64
    .line 65
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_3
    iget-boolean p1, v0, LN0/k$k;->i:Z

    .line 71
    .line 72
    iget-object v2, v0, LN0/k$k;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, LN0/D;

    .line 75
    .line 76
    iget-object v5, v0, LN0/k$k;->g:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, LN0/k;

    .line 79
    .line 80
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v8, p2

    .line 84
    move p2, p1

    .line 85
    move-object p1, v5

    .line 86
    move-object v5, v2

    .line 87
    move-object v2, v8

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p2, p0, LN0/k;->h:LN0/l;

    .line 93
    .line 94
    invoke-virtual {p2}, LN0/l;->a()LN0/D;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    instance-of p2, v2, LN0/H;

    .line 99
    .line 100
    if-nez p2, :cond_c

    .line 101
    .line 102
    invoke-direct {p0}, LN0/k;->s()LN0/t;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iput-object p0, v0, LN0/k$k;->g:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v2, v0, LN0/k$k;->h:Ljava/lang/Object;

    .line 109
    .line 110
    iput-boolean p1, v0, LN0/k$k;->i:Z

    .line 111
    .line 112
    iput v5, v0, LN0/k$k;->l:I

    .line 113
    .line 114
    invoke-interface {p2, v0}, LN0/t;->d(Ln7/f;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    if-ne p2, v1, :cond_5

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    move-object v5, v2

    .line 122
    move-object v2, p2

    .line 123
    move p2, p1

    .line 124
    move-object p1, p0

    .line 125
    :goto_1
    check-cast v2, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    instance-of v6, v5, LN0/f;

    .line 132
    .line 133
    if-eqz v6, :cond_6

    .line 134
    .line 135
    invoke-virtual {v5}, LN0/D;->a()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    goto :goto_2

    .line 140
    :cond_6
    const/4 v7, -0x1

    .line 141
    :goto_2
    if-eqz v6, :cond_7

    .line 142
    .line 143
    if-ne v2, v7, :cond_7

    .line 144
    .line 145
    return-object v5

    .line 146
    :cond_7
    const/4 v2, 0x0

    .line 147
    if-eqz p2, :cond_9

    .line 148
    .line 149
    invoke-direct {p1}, LN0/k;->s()LN0/t;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    new-instance v3, LN0/k$l;

    .line 154
    .line 155
    invoke-direct {v3, p1, v2}, LN0/k$l;-><init>(LN0/k;Ln7/f;)V

    .line 156
    .line 157
    .line 158
    iput-object p1, v0, LN0/k$k;->g:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v2, v0, LN0/k$k;->h:Ljava/lang/Object;

    .line 161
    .line 162
    iput v4, v0, LN0/k$k;->l:I

    .line 163
    .line 164
    invoke-interface {p2, v3, v0}, LN0/t;->a(Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    if-ne p2, v1, :cond_8

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_8
    :goto_3
    check-cast p2, Lkotlin/Pair;

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_9
    invoke-direct {p1}, LN0/k;->s()LN0/t;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    new-instance v4, LN0/k$m;

    .line 179
    .line 180
    invoke-direct {v4, p1, v7, v2}, LN0/k$m;-><init>(LN0/k;ILn7/f;)V

    .line 181
    .line 182
    .line 183
    iput-object p1, v0, LN0/k$k;->g:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v2, v0, LN0/k$k;->h:Ljava/lang/Object;

    .line 186
    .line 187
    iput v3, v0, LN0/k$k;->l:I

    .line 188
    .line 189
    invoke-interface {p2, v4, v0}, LN0/t;->b(Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    if-ne p2, v1, :cond_a

    .line 194
    .line 195
    :goto_4
    return-object v1

    .line 196
    :cond_a
    :goto_5
    check-cast p2, Lkotlin/Pair;

    .line 197
    .line 198
    :goto_6
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, LN0/D;

    .line 203
    .line 204
    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    check-cast p2, Ljava/lang/Boolean;

    .line 209
    .line 210
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    if-eqz p2, :cond_b

    .line 215
    .line 216
    iget-object p1, p1, LN0/k;->h:LN0/l;

    .line 217
    .line 218
    invoke-virtual {p1, v0}, LN0/l;->c(LN0/D;)LN0/D;

    .line 219
    .line 220
    .line 221
    :cond_b
    return-object v0

    .line 222
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 223
    .line 224
    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 225
    .line 226
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw p1
.end method

.method private final y(Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LN0/k;->t()LN0/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LN0/G;->a(LN0/F;Ln7/f;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final z(ZLn7/f;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, LN0/k$n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LN0/k$n;

    .line 7
    .line 8
    iget v1, v0, LN0/k$n;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN0/k$n;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN0/k$n;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LN0/k$n;-><init>(LN0/k;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LN0/k$n;->m:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LN0/k$n;->o:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    packed-switch v2, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :pswitch_0
    iget-object p1, v0, LN0/k$n;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lkotlin/jvm/internal/A;

    .line 49
    .line 50
    iget-object v1, v0, LN0/k$n;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lkotlin/jvm/internal/C;

    .line 53
    .line 54
    iget-object v0, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LN0/d;

    .line 57
    .line 58
    :try_start_0
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_a

    .line 62
    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto/16 :goto_b

    .line 65
    .line 66
    :pswitch_1
    iget-boolean p1, v0, LN0/k$n;->k:Z

    .line 67
    .line 68
    iget-object v2, v0, LN0/k$n;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lkotlin/jvm/internal/C;

    .line 71
    .line 72
    iget-object v5, v0, LN0/k$n;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v5, Lkotlin/jvm/internal/C;

    .line 75
    .line 76
    iget-object v6, v0, LN0/k$n;->h:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, LN0/d;

    .line 79
    .line 80
    iget-object v7, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v7, LN0/k;

    .line 83
    .line 84
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v8, v5

    .line 88
    move-object v5, v2

    .line 89
    move-object v2, v8

    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :pswitch_2
    iget-boolean p1, v0, LN0/k$n;->k:Z

    .line 93
    .line 94
    iget-object v2, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, LN0/k;

    .line 97
    .line 98
    :try_start_1
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch LN0/d; {:try_start_1 .. :try_end_1} :catch_0

    .line 99
    .line 100
    .line 101
    goto/16 :goto_6

    .line 102
    .line 103
    :catch_0
    move-exception p2

    .line 104
    move-object v7, v2

    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :pswitch_3
    iget-boolean p1, v0, LN0/k$n;->k:Z

    .line 108
    .line 109
    iget-object v2, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, LN0/k;

    .line 112
    .line 113
    :try_start_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch LN0/d; {:try_start_2 .. :try_end_2} :catch_0

    .line 114
    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :pswitch_4
    iget p1, v0, LN0/k$n;->l:I

    .line 119
    .line 120
    iget-boolean v2, v0, LN0/k$n;->k:Z

    .line 121
    .line 122
    iget-object v5, v0, LN0/k$n;->h:Ljava/lang/Object;

    .line 123
    .line 124
    iget-object v6, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v6, LN0/k;

    .line 127
    .line 128
    :try_start_3
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch LN0/d; {:try_start_3 .. :try_end_3} :catch_1

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :catch_1
    move-exception p2

    .line 133
    move p1, v2

    .line 134
    :goto_1
    move-object v7, v6

    .line 135
    goto/16 :goto_7

    .line 136
    .line 137
    :pswitch_5
    iget-boolean p1, v0, LN0/k$n;->k:Z

    .line 138
    .line 139
    iget-object v2, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, LN0/k;

    .line 142
    .line 143
    :try_start_4
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch LN0/d; {:try_start_4 .. :try_end_4} :catch_0

    .line 144
    .line 145
    .line 146
    move-object v6, v2

    .line 147
    goto :goto_2

    .line 148
    :pswitch_6
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    if-eqz p1, :cond_4

    .line 152
    .line 153
    :try_start_5
    iput-object p0, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 154
    .line 155
    iput-boolean p1, v0, LN0/k$n;->k:Z

    .line 156
    .line 157
    const/4 p2, 0x1

    .line 158
    iput p2, v0, LN0/k$n;->o:I

    .line 159
    .line 160
    invoke-direct {p0, v0}, LN0/k;->y(Ln7/f;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p2
    :try_end_5
    .catch LN0/d; {:try_start_5 .. :try_end_5} :catch_3

    .line 164
    if-ne p2, v1, :cond_1

    .line 165
    .line 166
    goto/16 :goto_9

    .line 167
    .line 168
    :cond_1
    move-object v6, p0

    .line 169
    :goto_2
    if-eqz p2, :cond_2

    .line 170
    .line 171
    :try_start_6
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    goto :goto_3

    .line 176
    :catch_2
    move-exception p2

    .line 177
    goto :goto_1

    .line 178
    :cond_2
    move v2, v3

    .line 179
    :goto_3
    invoke-direct {v6}, LN0/k;->s()LN0/t;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iput-object v6, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object p2, v0, LN0/k$n;->h:Ljava/lang/Object;

    .line 186
    .line 187
    iput-boolean p1, v0, LN0/k$n;->k:Z

    .line 188
    .line 189
    iput v2, v0, LN0/k$n;->l:I

    .line 190
    .line 191
    const/4 v7, 0x2

    .line 192
    iput v7, v0, LN0/k$n;->o:I

    .line 193
    .line 194
    invoke-interface {v5, v0}, LN0/t;->d(Ln7/f;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5
    :try_end_6
    .catch LN0/d; {:try_start_6 .. :try_end_6} :catch_2

    .line 198
    if-ne v5, v1, :cond_3

    .line 199
    .line 200
    goto/16 :goto_9

    .line 201
    .line 202
    :cond_3
    move v8, v2

    .line 203
    move v2, p1

    .line 204
    move p1, v8

    .line 205
    move-object v8, v5

    .line 206
    move-object v5, p2

    .line 207
    move-object p2, v8

    .line 208
    :goto_4
    :try_start_7
    check-cast p2, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    new-instance v7, LN0/f;

    .line 215
    .line 216
    invoke-direct {v7, v5, p1, p2}, LN0/f;-><init>(Ljava/lang/Object;II)V
    :try_end_7
    .catch LN0/d; {:try_start_7 .. :try_end_7} :catch_1

    .line 217
    .line 218
    .line 219
    return-object v7

    .line 220
    :catch_3
    move-exception p2

    .line 221
    move-object v7, p0

    .line 222
    goto :goto_7

    .line 223
    :cond_4
    :try_start_8
    invoke-direct {p0}, LN0/k;->s()LN0/t;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iput-object p0, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 228
    .line 229
    iput-boolean p1, v0, LN0/k$n;->k:Z

    .line 230
    .line 231
    const/4 v2, 0x3

    .line 232
    iput v2, v0, LN0/k$n;->o:I

    .line 233
    .line 234
    invoke-interface {p2, v0}, LN0/t;->d(Ln7/f;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p2
    :try_end_8
    .catch LN0/d; {:try_start_8 .. :try_end_8} :catch_3

    .line 238
    if-ne p2, v1, :cond_5

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_5
    move-object v2, p0

    .line 242
    :goto_5
    :try_start_9
    check-cast p2, Ljava/lang/Number;

    .line 243
    .line 244
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    invoke-direct {v2}, LN0/k;->s()LN0/t;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    new-instance v6, LN0/k$o;

    .line 253
    .line 254
    invoke-direct {v6, v2, p2, v4}, LN0/k$o;-><init>(LN0/k;ILn7/f;)V

    .line 255
    .line 256
    .line 257
    iput-object v2, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 258
    .line 259
    iput-boolean p1, v0, LN0/k$n;->k:Z

    .line 260
    .line 261
    const/4 p2, 0x4

    .line 262
    iput p2, v0, LN0/k$n;->o:I

    .line 263
    .line 264
    invoke-interface {v5, v6, v0}, LN0/t;->b(Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    if-ne p2, v1, :cond_6

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_6
    :goto_6
    check-cast p2, LN0/f;
    :try_end_9
    .catch LN0/d; {:try_start_9 .. :try_end_9} :catch_0

    .line 272
    .line 273
    return-object p2

    .line 274
    :goto_7
    new-instance v2, Lkotlin/jvm/internal/C;

    .line 275
    .line 276
    invoke-direct {v2}, Lkotlin/jvm/internal/C;-><init>()V

    .line 277
    .line 278
    .line 279
    iget-object v5, v7, LN0/k;->b:LN0/e;

    .line 280
    .line 281
    iput-object v7, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 282
    .line 283
    iput-object p2, v0, LN0/k$n;->h:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v2, v0, LN0/k$n;->i:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v2, v0, LN0/k$n;->j:Ljava/lang/Object;

    .line 288
    .line 289
    iput-boolean p1, v0, LN0/k$n;->k:Z

    .line 290
    .line 291
    const/4 v6, 0x5

    .line 292
    iput v6, v0, LN0/k$n;->o:I

    .line 293
    .line 294
    invoke-interface {v5, p2, v0}, LN0/e;->a(LN0/d;Ln7/f;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    if-ne v5, v1, :cond_7

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_7
    move-object v6, p2

    .line 302
    move-object p2, v5

    .line 303
    move-object v5, v2

    .line 304
    :goto_8
    iput-object p2, v5, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 305
    .line 306
    new-instance p2, Lkotlin/jvm/internal/A;

    .line 307
    .line 308
    invoke-direct {p2}, Lkotlin/jvm/internal/A;-><init>()V

    .line 309
    .line 310
    .line 311
    :try_start_a
    new-instance v5, LN0/k$p;

    .line 312
    .line 313
    invoke-direct {v5, v2, v7, p2, v4}, LN0/k$p;-><init>(Lkotlin/jvm/internal/C;LN0/k;Lkotlin/jvm/internal/A;Ln7/f;)V

    .line 314
    .line 315
    .line 316
    iput-object v6, v0, LN0/k$n;->g:Ljava/lang/Object;

    .line 317
    .line 318
    iput-object v2, v0, LN0/k$n;->h:Ljava/lang/Object;

    .line 319
    .line 320
    iput-object p2, v0, LN0/k$n;->i:Ljava/lang/Object;

    .line 321
    .line 322
    iput-object v4, v0, LN0/k$n;->j:Ljava/lang/Object;

    .line 323
    .line 324
    const/4 v4, 0x6

    .line 325
    iput v4, v0, LN0/k$n;->o:I

    .line 326
    .line 327
    invoke-direct {v7, p1, v5, v0}, LN0/k;->r(ZLkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 331
    if-ne p1, v1, :cond_8

    .line 332
    .line 333
    :goto_9
    return-object v1

    .line 334
    :cond_8
    move-object p1, p2

    .line 335
    move-object v1, v2

    .line 336
    :goto_a
    new-instance p2, LN0/f;

    .line 337
    .line 338
    iget-object v0, v1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 339
    .line 340
    if-eqz v0, :cond_9

    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    :cond_9
    iget p1, p1, Lkotlin/jvm/internal/A;->g:I

    .line 347
    .line 348
    invoke-direct {p2, v0, v3, p1}, LN0/f;-><init>(Ljava/lang/Object;II)V

    .line 349
    .line 350
    .line 351
    return-object p2

    .line 352
    :catchall_1
    move-exception p1

    .line 353
    move-object v0, v6

    .line 354
    :goto_b
    invoke-static {v0, p1}, Li7/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    throw v0

    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final C(Ljava/lang/Object;ZLn7/f;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, LN0/k$x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LN0/k$x;

    .line 7
    .line 8
    iget v1, v0, LN0/k$x;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LN0/k$x;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN0/k$x;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LN0/k$x;-><init>(LN0/k;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LN0/k$x;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LN0/k$x;->j:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, LN0/k$x;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lkotlin/jvm/internal/A;

    .line 41
    .line 42
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lkotlin/jvm/internal/A;

    .line 58
    .line 59
    invoke-direct {v5}, Lkotlin/jvm/internal/A;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, LN0/k;->t()LN0/F;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    new-instance v4, LN0/k$y;

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    move-object v6, p0

    .line 70
    move-object v7, p1

    .line 71
    move v8, p2

    .line 72
    invoke-direct/range {v4 .. v9}, LN0/k$y;-><init>(Lkotlin/jvm/internal/A;LN0/k;Ljava/lang/Object;ZLn7/f;)V

    .line 73
    .line 74
    .line 75
    iput-object v5, v0, LN0/k$x;->g:Ljava/lang/Object;

    .line 76
    .line 77
    iput v3, v0, LN0/k$x;->j:I

    .line 78
    .line 79
    invoke-interface {p3, v4, v0}, LN0/F;->c(Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v1, :cond_3

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_3
    move-object p1, v5

    .line 87
    :goto_1
    iget p1, p1, Lkotlin/jvm/internal/A;->g:I

    .line 88
    .line 89
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
.end method

.method public b()LU8/b;
    .locals 1

    .line 1
    iget-object v0, p0, LN0/k;->d:LU8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p2}, Ln7/f;->getContext()Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LN0/J$a$a;->g:LN0/J$a$a;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LN0/J;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p0}, LN0/J;->a(LN0/i;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v1, LN0/J;

    .line 19
    .line 20
    invoke-direct {v1, v0, p0}, LN0/J;-><init>(LN0/J;LN0/k;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, LN0/k$t;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v0, p0, p1, v2}, LN0/k$t;-><init>(LN0/k;Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final t()LN0/F;
    .locals 1

    .line 1
    iget-object v0, p0, LN0/k;->j:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN0/F;

    .line 8
    .line 9
    return-object v0
.end method
