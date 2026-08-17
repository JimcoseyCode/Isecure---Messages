.class public final Lf8/u;
.super Lm8/i$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/u$b;
    }
.end annotation


# static fields
.field private static final s:Lf8/u;

.field public static t:Lm8/r;


# instance fields
.field private final i:Lm8/d;

.field private j:I

.field private k:I

.field private l:I

.field private m:Lf8/q;

.field private n:I

.field private o:Lf8/q;

.field private p:I

.field private q:B

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/u$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/u$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/u;->t:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/u;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/u;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/u;->s:Lf8/u;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/u;->V()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 9

    .line 11
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lf8/u;->q:B

    .line 13
    iput v0, p0, Lf8/u;->r:I

    .line 14
    invoke-direct {p0}, Lf8/u;->V()V

    .line 15
    invoke-static {}, Lm8/d;->y()Lm8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lm8/f;->I(Ljava/io/OutputStream;I)Lm8/f;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_c

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_b

    const/16 v6, 0x10

    if-eq v4, v6, :cond_a

    const/16 v7, 0x1a

    const/4 v8, 0x0

    if-eq v4, v7, :cond_7

    const/16 v7, 0x22

    if-eq v4, v7, :cond_4

    const/16 v6, 0x28

    if-eq v4, v6, :cond_3

    const/16 v5, 0x30

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lm8/i$d;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    .line 19
    :cond_2
    iget v4, p0, Lf8/u;->j:I

    or-int/lit8 v4, v4, 0x20

    iput v4, p0, Lf8/u;->j:I

    .line 20
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Lf8/u;->p:I

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, Lf8/u;->j:I

    or-int/2addr v4, v5

    iput v4, p0, Lf8/u;->j:I

    .line 22
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Lf8/u;->n:I

    goto :goto_0

    .line 23
    :cond_4
    iget v4, p0, Lf8/u;->j:I

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_5

    .line 24
    iget-object v4, p0, Lf8/u;->o:Lf8/q;

    invoke-virtual {v4}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v8

    .line 25
    :cond_5
    sget-object v4, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v4, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v4

    check-cast v4, Lf8/q;

    iput-object v4, p0, Lf8/u;->o:Lf8/q;

    if-eqz v8, :cond_6

    .line 26
    invoke-virtual {v8, v4}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 27
    invoke-virtual {v8}, Lf8/q$c;->r()Lf8/q;

    move-result-object v4

    iput-object v4, p0, Lf8/u;->o:Lf8/q;

    .line 28
    :cond_6
    iget v4, p0, Lf8/u;->j:I

    or-int/2addr v4, v6

    iput v4, p0, Lf8/u;->j:I

    goto :goto_0

    .line 29
    :cond_7
    iget v4, p0, Lf8/u;->j:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_8

    .line 30
    iget-object v4, p0, Lf8/u;->m:Lf8/q;

    invoke-virtual {v4}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v8

    .line 31
    :cond_8
    sget-object v4, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v4, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v4

    check-cast v4, Lf8/q;

    iput-object v4, p0, Lf8/u;->m:Lf8/q;

    if-eqz v8, :cond_9

    .line 32
    invoke-virtual {v8, v4}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 33
    invoke-virtual {v8}, Lf8/q$c;->r()Lf8/q;

    move-result-object v4

    iput-object v4, p0, Lf8/u;->m:Lf8/q;

    .line 34
    :cond_9
    iget v4, p0, Lf8/u;->j:I

    or-int/2addr v4, v5

    iput v4, p0, Lf8/u;->j:I

    goto/16 :goto_0

    .line 35
    :cond_a
    iget v4, p0, Lf8/u;->j:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lf8/u;->j:I

    .line 36
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Lf8/u;->l:I

    goto/16 :goto_0

    .line 37
    :cond_b
    iget v4, p0, Lf8/u;->j:I

    or-int/2addr v4, v1

    iput v4, p0, Lf8/u;->j:I

    .line 38
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Lf8/u;->k:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 39
    :goto_1
    :try_start_1
    new-instance p2, Lm8/k;

    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 41
    :goto_2
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/u;->i:Lm8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/u;->i:Lm8/d;

    .line 44
    throw p1

    .line 45
    :goto_4
    invoke-virtual {p0}, Lm8/i$d;->l()V

    .line 46
    throw p1

    .line 47
    :cond_c
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 48
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/u;->i:Lm8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/u;->i:Lm8/d;

    .line 49
    throw p1

    .line 50
    :goto_5
    invoke-virtual {p0}, Lm8/i$d;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/u;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i$d;-><init>(Lm8/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/u;->q:B

    .line 5
    iput v0, p0, Lf8/u;->r:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/u;->i:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$c;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/u;-><init>(Lm8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/u;->q:B

    .line 9
    iput p1, p0, Lf8/u;->r:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/u;->i:Lm8/d;

    return-void
.end method

.method static synthetic A(Lf8/u;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/u;->l:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic B(Lf8/u;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/u;->m:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic C(Lf8/u;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/u;->n:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic D(Lf8/u;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/u;->o:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic E(Lf8/u;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/u;->p:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic F(Lf8/u;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/u;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic G(Lf8/u;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/u;->i:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static H()Lf8/u;
    .locals 1

    .line 1
    sget-object v0, Lf8/u;->s:Lf8/u;

    .line 2
    .line 3
    return-object v0
.end method

.method private V()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lf8/u;->k:I

    .line 3
    .line 4
    iput v0, p0, Lf8/u;->l:I

    .line 5
    .line 6
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Lf8/u;->m:Lf8/q;

    .line 11
    .line 12
    iput v0, p0, Lf8/u;->n:I

    .line 13
    .line 14
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lf8/u;->o:Lf8/q;

    .line 19
    .line 20
    iput v0, p0, Lf8/u;->p:I

    .line 21
    .line 22
    return-void
.end method

.method public static W()Lf8/u$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/u$b;->p()Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static X(Lf8/u;)Lf8/u$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/u;->W()Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/u$b;->w(Lf8/u;)Lf8/u$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic z(Lf8/u;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/u;->k:I

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public I()Lf8/u;
    .locals 1

    .line 1
    sget-object v0, Lf8/u;->s:Lf8/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public J()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/u;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public K()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/u;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public L()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/u;->m:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public M()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/u;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public N()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/u;->o:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public O()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/u;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public P()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/u;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public Q()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/u;->j:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public R()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/u;->j:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public S()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/u;->j:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public T()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/u;->j:I

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
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public U()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/u;->j:I

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public Y()Lf8/u$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/u;->W()Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public Z()Lf8/u$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/u;->X(Lf8/u;)Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic a()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/u;->I()Lf8/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()I
    .locals 4

    .line 1
    iget v0, p0, Lf8/u;->r:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lf8/u;->j:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lf8/u;->k:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lm8/f;->o(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, Lf8/u;->j:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, Lf8/u;->l:I

    .line 28
    .line 29
    invoke-static {v2, v1}, Lm8/f;->o(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lf8/u;->j:I

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    and-int/2addr v1, v2

    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iget-object v3, p0, Lf8/u;->m:Lf8/q;

    .line 42
    .line 43
    invoke-static {v1, v3}, Lm8/f;->r(ILm8/p;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_3
    iget v1, p0, Lf8/u;->j:I

    .line 49
    .line 50
    const/16 v3, 0x10

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-ne v1, v3, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Lf8/u;->o:Lf8/q;

    .line 56
    .line 57
    invoke-static {v2, v1}, Lm8/f;->r(ILm8/p;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    :cond_4
    iget v1, p0, Lf8/u;->j:I

    .line 63
    .line 64
    const/16 v2, 0x8

    .line 65
    .line 66
    and-int/2addr v1, v2

    .line 67
    if-ne v1, v2, :cond_5

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    iget v2, p0, Lf8/u;->n:I

    .line 71
    .line 72
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v0, v1

    .line 77
    :cond_5
    iget v1, p0, Lf8/u;->j:I

    .line 78
    .line 79
    const/16 v2, 0x20

    .line 80
    .line 81
    and-int/2addr v1, v2

    .line 82
    if-ne v1, v2, :cond_6

    .line 83
    .line 84
    const/4 v1, 0x6

    .line 85
    iget v2, p0, Lf8/u;->p:I

    .line 86
    .line 87
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/2addr v0, v1

    .line 92
    :cond_6
    invoke-virtual {p0}, Lm8/i$d;->s()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v0, v1

    .line 97
    iget-object v1, p0, Lf8/u;->i:Lm8/d;

    .line 98
    .line 99
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 104
    iput v0, p0, Lf8/u;->r:I

    .line 105
    .line 106
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/u;->Y()Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Lf8/u;->q:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, Lf8/u;->Q()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lf8/u;->q:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    invoke-virtual {p0}, Lf8/u;->R()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Lf8/u;->L()Lf8/q;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lf8/q;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    iput-byte v2, p0, Lf8/u;->q:B

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    invoke-virtual {p0}, Lf8/u;->T()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Lf8/u;->N()Lf8/q;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lf8/q;->e()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    iput-byte v2, p0, Lf8/u;->q:B

    .line 56
    .line 57
    return v2

    .line 58
    :cond_4
    invoke-virtual {p0}, Lm8/i$d;->r()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_5

    .line 63
    .line 64
    iput-byte v2, p0, Lf8/u;->q:B

    .line 65
    .line 66
    return v2

    .line 67
    :cond_5
    iput-byte v1, p0, Lf8/u;->q:B

    .line 68
    .line 69
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/u;->Z()Lf8/u$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(Lm8/f;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lf8/u;->b()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm8/i$d;->x()Lm8/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lf8/u;->j:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lf8/u;->k:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lm8/f;->Z(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lf8/u;->j:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget v1, p0, Lf8/u;->l:I

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, Lm8/f;->Z(II)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v1, p0, Lf8/u;->j:I

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    and-int/2addr v1, v2

    .line 34
    if-ne v1, v2, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iget-object v3, p0, Lf8/u;->m:Lf8/q;

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3}, Lm8/f;->c0(ILm8/p;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget v1, p0, Lf8/u;->j:I

    .line 43
    .line 44
    const/16 v3, 0x10

    .line 45
    .line 46
    and-int/2addr v1, v3

    .line 47
    if-ne v1, v3, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, Lf8/u;->o:Lf8/q;

    .line 50
    .line 51
    invoke-virtual {p1, v2, v1}, Lm8/f;->c0(ILm8/p;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget v1, p0, Lf8/u;->j:I

    .line 55
    .line 56
    const/16 v2, 0x8

    .line 57
    .line 58
    and-int/2addr v1, v2

    .line 59
    if-ne v1, v2, :cond_4

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    iget v2, p0, Lf8/u;->n:I

    .line 63
    .line 64
    invoke-virtual {p1, v1, v2}, Lm8/f;->Z(II)V

    .line 65
    .line 66
    .line 67
    :cond_4
    iget v1, p0, Lf8/u;->j:I

    .line 68
    .line 69
    const/16 v2, 0x20

    .line 70
    .line 71
    and-int/2addr v1, v2

    .line 72
    if-ne v1, v2, :cond_5

    .line 73
    .line 74
    const/4 v1, 0x6

    .line 75
    iget v2, p0, Lf8/u;->p:I

    .line 76
    .line 77
    invoke-virtual {p1, v1, v2}, Lm8/f;->Z(II)V

    .line 78
    .line 79
    .line 80
    :cond_5
    const/16 v1, 0xc8

    .line 81
    .line 82
    invoke-virtual {v0, v1, p1}, Lm8/i$d$a;->a(ILm8/f;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lf8/u;->i:Lm8/d;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method
