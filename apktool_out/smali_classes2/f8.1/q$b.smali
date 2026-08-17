.class public final Lf8/q$b;
.super Lm8/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/q$b$b;,
        Lf8/q$b$c;
    }
.end annotation


# static fields
.field private static final o:Lf8/q$b;

.field public static p:Lm8/r;


# instance fields
.field private final h:Lm8/d;

.field private i:I

.field private j:Lf8/q$b$c;

.field private k:Lf8/q;

.field private l:I

.field private m:B

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/q$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/q$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/q$b;->p:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/q$b;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/q$b;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/q$b;->o:Lf8/q$b;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/q$b;->C()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 7

    .line 11
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lf8/q$b;->m:B

    .line 13
    iput v0, p0, Lf8/q$b;->n:I

    .line 14
    invoke-direct {p0}, Lf8/q$b;->C()V

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
    if-nez v3, :cond_8

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_6

    const/16 v5, 0x12

    if-eq v4, v5, :cond_3

    const/16 v5, 0x18

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lm8/i;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    .line 19
    :cond_2
    iget v4, p0, Lf8/q$b;->i:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Lf8/q$b;->i:I

    .line 20
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Lf8/q$b;->l:I

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, Lf8/q$b;->i:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    .line 22
    iget-object v4, p0, Lf8/q$b;->k:Lf8/q;

    invoke-virtual {v4}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    .line 23
    :goto_1
    sget-object v6, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v6, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v6

    check-cast v6, Lf8/q;

    iput-object v6, p0, Lf8/q$b;->k:Lf8/q;

    if-eqz v4, :cond_5

    .line 24
    invoke-virtual {v4, v6}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 25
    invoke-virtual {v4}, Lf8/q$c;->r()Lf8/q;

    move-result-object v4

    iput-object v4, p0, Lf8/q$b;->k:Lf8/q;

    .line 26
    :cond_5
    iget v4, p0, Lf8/q$b;->i:I

    or-int/2addr v4, v5

    iput v4, p0, Lf8/q$b;->i:I

    goto :goto_0

    .line 27
    :cond_6
    invoke-virtual {p1}, Lm8/e;->m()I

    move-result v5

    .line 28
    invoke-static {v5}, Lf8/q$b$c;->h(I)Lf8/q$b$c;

    move-result-object v6

    if-nez v6, :cond_7

    .line 29
    invoke-virtual {v2, v4}, Lm8/f;->n0(I)V

    .line 30
    invoke-virtual {v2, v5}, Lm8/f;->n0(I)V

    goto :goto_0

    .line 31
    :cond_7
    iget v4, p0, Lf8/q$b;->i:I

    or-int/2addr v4, v1

    iput v4, p0, Lf8/q$b;->i:I

    .line 32
    iput-object v6, p0, Lf8/q$b;->j:Lf8/q$b$c;
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 33
    :goto_2
    :try_start_1
    new-instance p2, Lm8/k;

    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 35
    :goto_3
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_4
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/q$b;->h:Lm8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/q$b;->h:Lm8/d;

    .line 38
    throw p1

    .line 39
    :goto_5
    invoke-virtual {p0}, Lm8/i;->l()V

    .line 40
    throw p1

    .line 41
    :cond_8
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 42
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/q$b;->h:Lm8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/q$b;->h:Lm8/d;

    .line 43
    throw p1

    .line 44
    :goto_6
    invoke-virtual {p0}, Lm8/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/q$b;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i;-><init>(Lm8/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/q$b;->m:B

    .line 5
    iput v0, p0, Lf8/q$b;->n:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/q$b;->h:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$b;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/q$b;-><init>(Lm8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/q$b;->m:B

    .line 9
    iput p1, p0, Lf8/q$b;->n:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/q$b;->h:Lm8/d;

    return-void
.end method

.method private C()V
    .locals 1

    .line 1
    sget-object v0, Lf8/q$b$c;->j:Lf8/q$b$c;

    .line 2
    .line 3
    iput-object v0, p0, Lf8/q$b;->j:Lf8/q$b$c;

    .line 4
    .line 5
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lf8/q$b;->k:Lf8/q;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lf8/q$b;->l:I

    .line 13
    .line 14
    return-void
.end method

.method public static D()Lf8/q$b$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/q$b$b;->l()Lf8/q$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static E(Lf8/q$b;)Lf8/q$b$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/q$b;->D()Lf8/q$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/q$b$b;->r(Lf8/q$b;)Lf8/q$b$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic q(Lf8/q$b;Lf8/q$b$c;)Lf8/q$b$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/q$b;->j:Lf8/q$b$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic r(Lf8/q$b;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/q$b;->k:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic s(Lf8/q$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q$b;->l:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic t(Lf8/q$b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q$b;->i:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic u(Lf8/q$b;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/q$b;->h:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static v()Lf8/q$b;
    .locals 1

    .line 1
    sget-object v0, Lf8/q$b;->o:Lf8/q$b;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q$b;->i:I

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

.method public B()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q$b;->i:I

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

.method public F()Lf8/q$b$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/q$b;->D()Lf8/q$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public G()Lf8/q$b$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/q$b;->E(Lf8/q$b;)Lf8/q$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()I
    .locals 3

    .line 1
    iget v0, p0, Lf8/q$b;->n:I

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
    iget v0, p0, Lf8/q$b;->i:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lf8/q$b;->j:Lf8/q$b$c;

    .line 14
    .line 15
    invoke-virtual {v0}, Lf8/q$b$c;->a()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v1, v0}, Lm8/f;->h(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget v1, p0, Lf8/q$b;->i:I

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    and-int/2addr v1, v2

    .line 29
    if-ne v1, v2, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Lf8/q$b;->k:Lf8/q;

    .line 32
    .line 33
    invoke-static {v2, v1}, Lm8/f;->r(ILm8/p;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    :cond_2
    iget v1, p0, Lf8/q$b;->i:I

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    and-int/2addr v1, v2

    .line 42
    if-ne v1, v2, :cond_3

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    iget v2, p0, Lf8/q$b;->l:I

    .line 46
    .line 47
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    :cond_3
    iget-object v1, p0, Lf8/q$b;->h:Lm8/d;

    .line 53
    .line 54
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/2addr v0, v1

    .line 59
    iput v0, p0, Lf8/q$b;->n:I

    .line 60
    .line 61
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/q$b;->F()Lf8/q$b$b;

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
    iget-byte v0, p0, Lf8/q$b;->m:B

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
    invoke-virtual {p0}, Lf8/q$b;->A()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lf8/q$b;->x()Lf8/q;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lf8/q;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, Lf8/q$b;->m:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    iput-byte v1, p0, Lf8/q$b;->m:B

    .line 31
    .line 32
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/q$b;->G()Lf8/q$b$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(Lm8/f;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf8/q$b;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lf8/q$b;->i:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lf8/q$b;->j:Lf8/q$b$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lf8/q$b$c;->a()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v1, v0}, Lm8/f;->R(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v0, p0, Lf8/q$b;->i:I

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    and-int/2addr v0, v1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lf8/q$b;->k:Lf8/q;

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Lm8/f;->c0(ILm8/p;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v0, p0, Lf8/q$b;->i:I

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    and-int/2addr v0, v1

    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    iget v1, p0, Lf8/q$b;->l:I

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lm8/f;->Z(II)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lf8/q$b;->h:Lm8/d;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public w()Lf8/q$b$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/q$b;->j:Lf8/q$b$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/q$b;->k:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q$b;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public z()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q$b;->i:I

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
