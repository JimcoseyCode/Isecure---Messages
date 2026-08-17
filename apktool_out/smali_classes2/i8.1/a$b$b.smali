.class public final Li8/a$b$b;
.super Lm8/i$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private h:I

.field private i:I

.field private j:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm8/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Li8/a$b$b;->q()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method static synthetic l()Li8/a$b$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$b$b;->p()Li8/a$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static p()Li8/a$b$b;
    .locals 1

    .line 1
    new-instance v0, Li8/a$b$b;

    .line 2
    .line 3
    invoke-direct {v0}, Li8/a$b$b;-><init>()V

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
    invoke-virtual {p0}, Li8/a$b$b;->m()Li8/a$b;

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
    invoke-virtual {p0}, Li8/a$b$b;->o()Li8/a$b$b;

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
    check-cast p1, Li8/a$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Li8/a$b$b;->r(Li8/a$b;)Li8/a$b$b;

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
    invoke-virtual {p0, p1, p2}, Li8/a$b$b;->t(Lm8/e;Lm8/g;)Li8/a$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public m()Li8/a$b;
    .locals 2

    .line 1
    invoke-virtual {p0}, Li8/a$b$b;->n()Li8/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li8/a$b;->e()Z

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

.method public n()Li8/a$b;
    .locals 4

    .line 1
    new-instance v0, Li8/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Li8/a$b;-><init>(Lm8/i$b;Li8/a$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Li8/a$b$b;->h:I

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
    iget v2, p0, Li8/a$b$b;->i:I

    .line 17
    .line 18
    invoke-static {v0, v2}, Li8/a$b;->q(Li8/a$b;I)I

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    or-int/lit8 v3, v3, 0x2

    .line 26
    .line 27
    :cond_1
    iget v1, p0, Li8/a$b$b;->j:I

    .line 28
    .line 29
    invoke-static {v0, v1}, Li8/a$b;->r(Li8/a$b;I)I

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3}, Li8/a$b;->s(Li8/a$b;I)I

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public o()Li8/a$b$b;
    .locals 2

    .line 1
    invoke-static {}, Li8/a$b$b;->p()Li8/a$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Li8/a$b$b;->n()Li8/a$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Li8/a$b$b;->r(Li8/a$b;)Li8/a$b$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public r(Li8/a$b;)Li8/a$b$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$b;->u()Li8/a$b;

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
    invoke-virtual {p1}, Li8/a$b;->y()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Li8/a$b;->w()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Li8/a$b$b;->v(I)Li8/a$b$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Li8/a$b;->x()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Li8/a$b;->v()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Li8/a$b$b;->u(I)Li8/a$b$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0}, Lm8/i$b;->i()Lm8/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p1}, Li8/a$b;->t(Li8/a$b;)Lm8/d;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Lm8/d;->o(Lm8/d;)Lm8/d;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lm8/i$b;->k(Lm8/d;)Lm8/i$b;

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public t(Lm8/e;Lm8/g;)Li8/a$b$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Li8/a$b;->o:Lm8/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lm8/r;->a(Lm8/e;Lm8/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Li8/a$b;
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Li8/a$b$b;->r(Li8/a$b;)Li8/a$b$b;

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
    check-cast p2, Li8/a$b;
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
    invoke-virtual {p0, v0}, Li8/a$b$b;->r(Li8/a$b;)Li8/a$b$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public u(I)Li8/a$b$b;
    .locals 1

    .line 1
    iget v0, p0, Li8/a$b$b;->h:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Li8/a$b$b;->h:I

    .line 6
    .line 7
    iput p1, p0, Li8/a$b$b;->j:I

    .line 8
    .line 9
    return-object p0
.end method

.method public v(I)Li8/a$b$b;
    .locals 1

    .line 1
    iget v0, p0, Li8/a$b$b;->h:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Li8/a$b$b;->h:I

    .line 6
    .line 7
    iput p1, p0, Li8/a$b$b;->i:I

    .line 8
    .line 9
    return-object p0
.end method
