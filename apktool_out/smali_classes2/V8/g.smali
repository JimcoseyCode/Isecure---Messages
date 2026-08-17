.class public abstract LV8/g;
.super LV8/e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field protected final j:LU8/b;


# direct methods
.method public constructor <init>(LU8/b;Ln7/j;ILT8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, LV8/e;-><init>(Ln7/j;ILT8/a;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV8/g;->j:LU8/b;

    .line 5
    .line 6
    return-void
.end method

.method static synthetic k(LV8/g;LU8/c;Ln7/f;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LV8/e;->h:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    if-ne v0, v1, :cond_3

    .line 5
    .line 6
    invoke-interface {p2}, Ln7/f;->getContext()Ln7/j;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, LV8/e;->g:Ln7/j;

    .line 11
    .line 12
    invoke-static {v0, v1}, LR8/H;->k(Ln7/j;Ln7/j;)Ln7/j;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, LV8/g;->n(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-ne p0, p1, :cond_0

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    sget-object p0, Li7/B;->a:Li7/B;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    sget-object v2, Ln7/g;->e:Ln7/g$b;

    .line 37
    .line 38
    invoke-interface {v1, v2}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v0, v2}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-direct {p0, p1, v1, p2}, LV8/g;->m(LU8/c;Ln7/j;Ln7/f;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p0, p1, :cond_2

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_2
    sget-object p0, Li7/B;->a:Li7/B;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    invoke-super {p0, p1, p2}, LV8/e;->b(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p0, p1, :cond_4

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_4
    sget-object p0, Li7/B;->a:Li7/B;

    .line 78
    .line 79
    return-object p0
.end method

.method static synthetic l(LV8/g;LT8/u;Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, LV8/s;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LV8/s;-><init>(LT8/w;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, LV8/g;->n(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-ne p0, p1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Li7/B;->a:Li7/B;

    .line 18
    .line 19
    return-object p0
.end method

.method private final m(LU8/c;Ln7/j;Ln7/f;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-interface {p3}, Ln7/f;->getContext()Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, LV8/f;->a(LU8/c;Ln7/j;)LU8/c;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v4, LV8/g$a;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {v4, p0, p1}, LV8/g$a;-><init>(LV8/g;Ln7/f;)V

    .line 13
    .line 14
    .line 15
    const/4 v6, 0x4

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v1, p2

    .line 19
    move-object v5, p3

    .line 20
    invoke-static/range {v1 .. v7}, LV8/f;->c(Ln7/j;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method


# virtual methods
.method public b(LU8/c;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LV8/g;->k(LV8/g;LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected f(LT8/u;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LV8/g;->l(LV8/g;LT8/u;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected abstract n(LU8/c;Ln7/f;)Ljava/lang/Object;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LV8/g;->j:LU8/b;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, LV8/e;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
