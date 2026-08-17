.class public final Lf8/u$b;
.super Lm8/i$c;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private j:I

.field private k:I

.field private l:I

.field private m:Lf8/q;

.field private n:I

.field private o:Lf8/q;

.field private p:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm8/i$c;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lf8/u$b;->m:Lf8/q;

    .line 9
    .line 10
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lf8/u$b;->o:Lf8/q;

    .line 15
    .line 16
    invoke-direct {p0}, Lf8/u$b;->v()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method static synthetic p()Lf8/u$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/u$b;->u()Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static u()Lf8/u$b;
    .locals 1

    .line 1
    new-instance v0, Lf8/u$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/u$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private v()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public A(I)Lf8/u$b;
    .locals 1

    .line 1
    iget v0, p0, Lf8/u$b;->j:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lf8/u$b;->j:I

    .line 6
    .line 7
    iput p1, p0, Lf8/u$b;->k:I

    .line 8
    .line 9
    return-object p0
.end method

.method public B(I)Lf8/u$b;
    .locals 1

    .line 1
    iget v0, p0, Lf8/u$b;->j:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lf8/u$b;->j:I

    .line 6
    .line 7
    iput p1, p0, Lf8/u$b;->l:I

    .line 8
    .line 9
    return-object p0
.end method

.method public C(I)Lf8/u$b;
    .locals 1

    .line 1
    iget v0, p0, Lf8/u$b;->j:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, Lf8/u$b;->j:I

    .line 6
    .line 7
    iput p1, p0, Lf8/u$b;->n:I

    .line 8
    .line 9
    return-object p0
.end method

.method public D(I)Lf8/u$b;
    .locals 1

    .line 1
    iget v0, p0, Lf8/u$b;->j:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    iput v0, p0, Lf8/u$b;->j:I

    .line 6
    .line 7
    iput p1, p0, Lf8/u$b;->p:I

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic build()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/u$b;->q()Lf8/u;

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
    invoke-virtual {p0}, Lf8/u$b;->t()Lf8/u$b;

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
    check-cast p1, Lf8/u;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lf8/u$b;->w(Lf8/u;)Lf8/u$b;

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
    invoke-virtual {p0, p1, p2}, Lf8/u$b;->x(Lm8/e;Lm8/g;)Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public q()Lf8/u;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf8/u$b;->r()Lf8/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lf8/u;->e()Z

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

.method public r()Lf8/u;
    .locals 5

    .line 1
    new-instance v0, Lf8/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lf8/u;-><init>(Lm8/i$c;Lf8/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lf8/u$b;->j:I

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
    iget v2, p0, Lf8/u$b;->k:I

    .line 17
    .line 18
    invoke-static {v0, v2}, Lf8/u;->z(Lf8/u;I)I

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
    iget v2, p0, Lf8/u$b;->l:I

    .line 29
    .line 30
    invoke-static {v0, v2}, Lf8/u;->A(Lf8/u;I)I

    .line 31
    .line 32
    .line 33
    and-int/lit8 v2, v1, 0x4

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    if-ne v2, v4, :cond_2

    .line 37
    .line 38
    or-int/lit8 v3, v3, 0x4

    .line 39
    .line 40
    :cond_2
    iget-object v2, p0, Lf8/u$b;->m:Lf8/q;

    .line 41
    .line 42
    invoke-static {v0, v2}, Lf8/u;->B(Lf8/u;Lf8/q;)Lf8/q;

    .line 43
    .line 44
    .line 45
    and-int/lit8 v2, v1, 0x8

    .line 46
    .line 47
    const/16 v4, 0x8

    .line 48
    .line 49
    if-ne v2, v4, :cond_3

    .line 50
    .line 51
    or-int/lit8 v3, v3, 0x8

    .line 52
    .line 53
    :cond_3
    iget v2, p0, Lf8/u$b;->n:I

    .line 54
    .line 55
    invoke-static {v0, v2}, Lf8/u;->C(Lf8/u;I)I

    .line 56
    .line 57
    .line 58
    and-int/lit8 v2, v1, 0x10

    .line 59
    .line 60
    const/16 v4, 0x10

    .line 61
    .line 62
    if-ne v2, v4, :cond_4

    .line 63
    .line 64
    or-int/lit8 v3, v3, 0x10

    .line 65
    .line 66
    :cond_4
    iget-object v2, p0, Lf8/u$b;->o:Lf8/q;

    .line 67
    .line 68
    invoke-static {v0, v2}, Lf8/u;->D(Lf8/u;Lf8/q;)Lf8/q;

    .line 69
    .line 70
    .line 71
    const/16 v2, 0x20

    .line 72
    .line 73
    and-int/2addr v1, v2

    .line 74
    if-ne v1, v2, :cond_5

    .line 75
    .line 76
    or-int/lit8 v3, v3, 0x20

    .line 77
    .line 78
    :cond_5
    iget v1, p0, Lf8/u$b;->p:I

    .line 79
    .line 80
    invoke-static {v0, v1}, Lf8/u;->E(Lf8/u;I)I

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v3}, Lf8/u;->F(Lf8/u;I)I

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public t()Lf8/u$b;
    .locals 2

    .line 1
    invoke-static {}, Lf8/u$b;->u()Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lf8/u$b;->r()Lf8/u;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lf8/u$b;->w(Lf8/u;)Lf8/u$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public w(Lf8/u;)Lf8/u$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/u;->H()Lf8/u;

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
    invoke-virtual {p1}, Lf8/u;->P()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lf8/u;->J()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lf8/u$b;->A(I)Lf8/u$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lf8/u;->Q()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lf8/u;->K()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Lf8/u$b;->B(I)Lf8/u$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Lf8/u;->R()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lf8/u;->L()Lf8/q;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Lf8/u$b;->y(Lf8/q;)Lf8/u$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Lf8/u;->S()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, Lf8/u;->M()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v0}, Lf8/u$b;->C(I)Lf8/u$b;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, Lf8/u;->T()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Lf8/u;->N()Lf8/q;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0, v0}, Lf8/u$b;->z(Lf8/q;)Lf8/u$b;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p1}, Lf8/u;->U()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p1}, Lf8/u;->O()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p0, v0}, Lf8/u$b;->D(I)Lf8/u$b;

    .line 84
    .line 85
    .line 86
    :cond_6
    invoke-virtual {p0, p1}, Lm8/i$c;->o(Lm8/i$d;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lm8/i$b;->i()Lm8/d;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1}, Lf8/u;->G(Lf8/u;)Lm8/d;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v0, p1}, Lm8/d;->o(Lm8/d;)Lm8/d;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p0, p1}, Lm8/i$b;->k(Lm8/d;)Lm8/i$b;

    .line 102
    .line 103
    .line 104
    return-object p0
.end method

.method public x(Lm8/e;Lm8/g;)Lf8/u$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lf8/u;->t:Lm8/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lm8/r;->a(Lm8/e;Lm8/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lf8/u;
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lf8/u$b;->w(Lf8/u;)Lf8/u$b;

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
    check-cast p2, Lf8/u;
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
    invoke-virtual {p0, v0}, Lf8/u$b;->w(Lf8/u;)Lf8/u$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public y(Lf8/q;)Lf8/u$b;
    .locals 3

    .line 1
    iget v0, p0, Lf8/u$b;->j:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lf8/u$b;->m:Lf8/q;

    .line 8
    .line 9
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lf8/u$b;->m:Lf8/q;

    .line 16
    .line 17
    invoke-static {v0}, Lf8/q;->y0(Lf8/q;)Lf8/q$c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lf8/q$c;->r()Lf8/q;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lf8/u$b;->m:Lf8/q;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, Lf8/u$b;->m:Lf8/q;

    .line 33
    .line 34
    :goto_0
    iget p1, p0, Lf8/u$b;->j:I

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    iput p1, p0, Lf8/u$b;->j:I

    .line 38
    .line 39
    return-object p0
.end method

.method public z(Lf8/q;)Lf8/u$b;
    .locals 3

    .line 1
    iget v0, p0, Lf8/u$b;->j:I

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lf8/u$b;->o:Lf8/q;

    .line 9
    .line 10
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lf8/u$b;->o:Lf8/q;

    .line 17
    .line 18
    invoke-static {v0}, Lf8/q;->y0(Lf8/q;)Lf8/q$c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lf8/q$c;->r()Lf8/q;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lf8/u$b;->o:Lf8/q;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object p1, p0, Lf8/u$b;->o:Lf8/q;

    .line 34
    .line 35
    :goto_0
    iget p1, p0, Lf8/u$b;->j:I

    .line 36
    .line 37
    or-int/2addr p1, v1

    .line 38
    iput p1, p0, Lf8/u$b;->j:I

    .line 39
    .line 40
    return-object p0
.end method
