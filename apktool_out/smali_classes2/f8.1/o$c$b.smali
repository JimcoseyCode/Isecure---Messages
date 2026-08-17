.class public final Lf8/o$c$b;
.super Lm8/i$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/o$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private h:I

.field private i:I

.field private j:I

.field private k:Lf8/o$c$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm8/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lf8/o$c$b;->i:I

    .line 6
    .line 7
    sget-object v0, Lf8/o$c$c;->i:Lf8/o$c$c;

    .line 8
    .line 9
    iput-object v0, p0, Lf8/o$c$b;->k:Lf8/o$c$c;

    .line 10
    .line 11
    invoke-direct {p0}, Lf8/o$c$b;->q()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method static synthetic l()Lf8/o$c$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/o$c$b;->p()Lf8/o$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static p()Lf8/o$c$b;
    .locals 1

    .line 1
    new-instance v0, Lf8/o$c$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/o$c$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private q()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/o$c$b;->m()Lf8/o$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/o$c$b;->o()Lf8/o$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic j(Lm8/i;)Lm8/i$b;
    .locals 0

    .line 1
    check-cast p1, Lf8/o$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lf8/o$c$b;->r(Lf8/o$c;)Lf8/o$c$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic l0(Lm8/e;Lm8/g;)Lm8/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lf8/o$c$b;->t(Lm8/e;Lm8/g;)Lf8/o$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public m()Lf8/o$c;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf8/o$c$b;->n()Lf8/o$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lf8/o$c;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, Lm8/a$a;->h(Lm8/p;)Lm8/v;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
.end method

.method public n()Lf8/o$c;
    .locals 5

    .line 1
    new-instance v0, Lf8/o$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lf8/o$c;-><init>(Lm8/i$b;Lf8/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lf8/o$c$b;->h:I

    .line 8
    .line 9
    and-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    iget v2, p0, Lf8/o$c$b;->i:I

    .line 17
    .line 18
    invoke-static {v0, v2}, Lf8/o$c;->u(Lf8/o$c;I)I

    .line 19
    .line 20
    .line 21
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v2, v4, :cond_1

    .line 25
    .line 26
    or-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    :cond_1
    iget v2, p0, Lf8/o$c$b;->j:I

    .line 29
    .line 30
    invoke-static {v0, v2}, Lf8/o$c;->q(Lf8/o$c;I)I

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    and-int/2addr v1, v2

    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    or-int/lit8 v3, v3, 0x4

    .line 38
    .line 39
    :cond_2
    iget-object v1, p0, Lf8/o$c$b;->k:Lf8/o$c$c;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lf8/o$c;->r(Lf8/o$c;Lf8/o$c$c;)Lf8/o$c$c;

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v3}, Lf8/o$c;->s(Lf8/o$c;I)I

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public o()Lf8/o$c$b;
    .locals 2

    .line 1
    invoke-static {}, Lf8/o$c$b;->p()Lf8/o$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lf8/o$c$b;->n()Lf8/o$c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lf8/o$c$b;->r(Lf8/o$c;)Lf8/o$c$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public r(Lf8/o$c;)Lf8/o$c$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/o$c;->v()Lf8/o$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lf8/o$c;->A()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lf8/o$c;->x()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lf8/o$c$b;->v(I)Lf8/o$c$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lf8/o$c;->B()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lf8/o$c;->y()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Lf8/o$c$b;->w(I)Lf8/o$c$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Lf8/o$c;->z()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lf8/o$c;->w()Lf8/o$c$c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Lf8/o$c$b;->u(Lf8/o$c$c;)Lf8/o$c$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p0}, Lm8/i$b;->i()Lm8/d;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {p1}, Lf8/o$c;->t(Lf8/o$c;)Lm8/d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Lm8/d;->o(Lm8/d;)Lm8/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Lm8/i$b;->k(Lm8/d;)Lm8/i$b;

    .line 60
    .line 61
    .line 62
    return-object p0
.end method

.method public t(Lm8/e;Lm8/g;)Lf8/o$c$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lf8/o$c;->p:Lm8/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lm8/r;->a(Lm8/e;Lm8/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lf8/o$c;
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lf8/o$c$b;->r(Lf8/o$c;)Lf8/o$c$b;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    invoke-virtual {p1}, Lm8/k;->a()Lm8/p;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lf8/o$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    :catchall_1
    move-exception p1

    .line 27
    move-object v0, p2

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lf8/o$c$b;->r(Lf8/o$c;)Lf8/o$c$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public u(Lf8/o$c$c;)Lf8/o$c$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lf8/o$c$b;->h:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, Lf8/o$c$b;->h:I

    .line 9
    .line 10
    iput-object p1, p0, Lf8/o$c$b;->k:Lf8/o$c$c;

    .line 11
    .line 12
    return-object p0
.end method

.method public v(I)Lf8/o$c$b;
    .locals 1

    .line 1
    iget v0, p0, Lf8/o$c$b;->h:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lf8/o$c$b;->h:I

    .line 6
    .line 7
    iput p1, p0, Lf8/o$c$b;->i:I

    .line 8
    .line 9
    return-object p0
.end method

.method public w(I)Lf8/o$c$b;
    .locals 1

    .line 1
    iget v0, p0, Lf8/o$c$b;->h:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lf8/o$c$b;->h:I

    .line 6
    .line 7
    iput p1, p0, Lf8/o$c$b;->j:I

    .line 8
    .line 9
    return-object p0
.end method
