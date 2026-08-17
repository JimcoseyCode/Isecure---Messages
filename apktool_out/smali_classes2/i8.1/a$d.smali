.class public final Li8/a$d;
.super Lm8/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/a$d$b;
    }
.end annotation


# static fields
.field private static final q:Li8/a$d;

.field public static r:Lm8/r;


# instance fields
.field private final h:Lm8/d;

.field private i:I

.field private j:Li8/a$b;

.field private k:Li8/a$c;

.field private l:Li8/a$c;

.field private m:Li8/a$c;

.field private n:Li8/a$c;

.field private o:B

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li8/a$d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Li8/a$d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li8/a$d;->r:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Li8/a$d;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Li8/a$d;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Li8/a$d;->q:Li8/a$d;

    .line 15
    .line 16
    invoke-direct {v0}, Li8/a$d;->I()V

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
    iput-byte v0, p0, Li8/a$d;->o:B

    .line 13
    iput v0, p0, Li8/a$d;->p:I

    .line 14
    invoke-direct {p0}, Li8/a$d;->I()V

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
    if-nez v3, :cond_11

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eq v4, v5, :cond_e

    const/16 v5, 0x12

    if-eq v4, v5, :cond_b

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_8

    const/16 v5, 0x22

    if-eq v4, v5, :cond_5

    const/16 v5, 0x2a

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

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    .line 19
    :cond_2
    iget v4, p0, Li8/a$d;->i:I

    const/16 v5, 0x10

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    .line 20
    iget-object v4, p0, Li8/a$d;->n:Li8/a$c;

    invoke-virtual {v4}, Li8/a$c;->D()Li8/a$c$b;

    move-result-object v6

    .line 21
    :cond_3
    sget-object v4, Li8/a$c;->o:Lm8/r;

    invoke-virtual {p1, v4, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v4

    check-cast v4, Li8/a$c;

    iput-object v4, p0, Li8/a$d;->n:Li8/a$c;

    if-eqz v6, :cond_4

    .line 22
    invoke-virtual {v6, v4}, Li8/a$c$b;->r(Li8/a$c;)Li8/a$c$b;

    .line 23
    invoke-virtual {v6}, Li8/a$c$b;->n()Li8/a$c;

    move-result-object v4

    iput-object v4, p0, Li8/a$d;->n:Li8/a$c;

    .line 24
    :cond_4
    iget v4, p0, Li8/a$d;->i:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/a$d;->i:I

    goto :goto_0

    .line 25
    :cond_5
    iget v4, p0, Li8/a$d;->i:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_6

    .line 26
    iget-object v4, p0, Li8/a$d;->m:Li8/a$c;

    invoke-virtual {v4}, Li8/a$c;->D()Li8/a$c$b;

    move-result-object v6

    .line 27
    :cond_6
    sget-object v4, Li8/a$c;->o:Lm8/r;

    invoke-virtual {p1, v4, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v4

    check-cast v4, Li8/a$c;

    iput-object v4, p0, Li8/a$d;->m:Li8/a$c;

    if-eqz v6, :cond_7

    .line 28
    invoke-virtual {v6, v4}, Li8/a$c$b;->r(Li8/a$c;)Li8/a$c$b;

    .line 29
    invoke-virtual {v6}, Li8/a$c$b;->n()Li8/a$c;

    move-result-object v4

    iput-object v4, p0, Li8/a$d;->m:Li8/a$c;

    .line 30
    :cond_7
    iget v4, p0, Li8/a$d;->i:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/a$d;->i:I

    goto :goto_0

    .line 31
    :cond_8
    iget v4, p0, Li8/a$d;->i:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_9

    .line 32
    iget-object v4, p0, Li8/a$d;->l:Li8/a$c;

    invoke-virtual {v4}, Li8/a$c;->D()Li8/a$c$b;

    move-result-object v6

    .line 33
    :cond_9
    sget-object v4, Li8/a$c;->o:Lm8/r;

    invoke-virtual {p1, v4, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v4

    check-cast v4, Li8/a$c;

    iput-object v4, p0, Li8/a$d;->l:Li8/a$c;

    if-eqz v6, :cond_a

    .line 34
    invoke-virtual {v6, v4}, Li8/a$c$b;->r(Li8/a$c;)Li8/a$c$b;

    .line 35
    invoke-virtual {v6}, Li8/a$c$b;->n()Li8/a$c;

    move-result-object v4

    iput-object v4, p0, Li8/a$d;->l:Li8/a$c;

    .line 36
    :cond_a
    iget v4, p0, Li8/a$d;->i:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/a$d;->i:I

    goto/16 :goto_0

    .line 37
    :cond_b
    iget v4, p0, Li8/a$d;->i:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_c

    .line 38
    iget-object v4, p0, Li8/a$d;->k:Li8/a$c;

    invoke-virtual {v4}, Li8/a$c;->D()Li8/a$c$b;

    move-result-object v6

    .line 39
    :cond_c
    sget-object v4, Li8/a$c;->o:Lm8/r;

    invoke-virtual {p1, v4, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v4

    check-cast v4, Li8/a$c;

    iput-object v4, p0, Li8/a$d;->k:Li8/a$c;

    if-eqz v6, :cond_d

    .line 40
    invoke-virtual {v6, v4}, Li8/a$c$b;->r(Li8/a$c;)Li8/a$c$b;

    .line 41
    invoke-virtual {v6}, Li8/a$c$b;->n()Li8/a$c;

    move-result-object v4

    iput-object v4, p0, Li8/a$d;->k:Li8/a$c;

    .line 42
    :cond_d
    iget v4, p0, Li8/a$d;->i:I

    or-int/2addr v4, v5

    iput v4, p0, Li8/a$d;->i:I

    goto/16 :goto_0

    .line 43
    :cond_e
    iget v4, p0, Li8/a$d;->i:I

    and-int/2addr v4, v1

    if-ne v4, v1, :cond_f

    .line 44
    iget-object v4, p0, Li8/a$d;->j:Li8/a$b;

    invoke-virtual {v4}, Li8/a$b;->D()Li8/a$b$b;

    move-result-object v6

    .line 45
    :cond_f
    sget-object v4, Li8/a$b;->o:Lm8/r;

    invoke-virtual {p1, v4, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v4

    check-cast v4, Li8/a$b;

    iput-object v4, p0, Li8/a$d;->j:Li8/a$b;

    if-eqz v6, :cond_10

    .line 46
    invoke-virtual {v6, v4}, Li8/a$b$b;->r(Li8/a$b;)Li8/a$b$b;

    .line 47
    invoke-virtual {v6}, Li8/a$b$b;->n()Li8/a$b;

    move-result-object v4

    iput-object v4, p0, Li8/a$d;->j:Li8/a$b;

    .line 48
    :cond_10
    iget v4, p0, Li8/a$d;->i:I

    or-int/2addr v4, v1

    iput v4, p0, Li8/a$d;->i:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 49
    :goto_1
    :try_start_1
    new-instance p2, Lm8/k;

    .line 50
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 51
    :goto_2
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$d;->h:Lm8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$d;->h:Lm8/d;

    .line 54
    throw p1

    .line 55
    :goto_4
    invoke-virtual {p0}, Lm8/i;->l()V

    .line 56
    throw p1

    .line 57
    :cond_11
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 58
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Li8/a$d;->h:Lm8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$d;->h:Lm8/d;

    .line 59
    throw p1

    .line 60
    :goto_5
    invoke-virtual {p0}, Lm8/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Li8/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li8/a$d;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i;-><init>(Lm8/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Li8/a$d;->o:B

    .line 5
    iput v0, p0, Li8/a$d;->p:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Li8/a$d;->h:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$b;Li8/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Li8/a$d;-><init>(Lm8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Li8/a$d;->o:B

    .line 9
    iput p1, p0, Li8/a$d;->p:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Li8/a$d;->h:Lm8/d;

    return-void
.end method

.method private I()V
    .locals 1

    .line 1
    invoke-static {}, Li8/a$b;->u()Li8/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Li8/a$d;->j:Li8/a$b;

    .line 6
    .line 7
    invoke-static {}, Li8/a$c;->u()Li8/a$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Li8/a$d;->k:Li8/a$c;

    .line 12
    .line 13
    invoke-static {}, Li8/a$c;->u()Li8/a$c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Li8/a$d;->l:Li8/a$c;

    .line 18
    .line 19
    invoke-static {}, Li8/a$c;->u()Li8/a$c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Li8/a$d;->m:Li8/a$c;

    .line 24
    .line 25
    invoke-static {}, Li8/a$c;->u()Li8/a$c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Li8/a$d;->n:Li8/a$c;

    .line 30
    .line 31
    return-void
.end method

.method public static J()Li8/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$d$b;->l()Li8/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static K(Li8/a$d;)Li8/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$d;->J()Li8/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Li8/a$d$b;->u(Li8/a$d;)Li8/a$d$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic q(Li8/a$d;Li8/a$b;)Li8/a$b;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$d;->j:Li8/a$b;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic r(Li8/a$d;Li8/a$c;)Li8/a$c;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$d;->k:Li8/a$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic s(Li8/a$d;Li8/a$c;)Li8/a$c;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$d;->l:Li8/a$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic t(Li8/a$d;Li8/a$c;)Li8/a$c;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$d;->m:Li8/a$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic u(Li8/a$d;Li8/a$c;)Li8/a$c;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$d;->n:Li8/a$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic v(Li8/a$d;I)I
    .locals 0

    .line 1
    iput p1, p0, Li8/a$d;->i:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic w(Li8/a$d;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Li8/a$d;->h:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static x()Li8/a$d;
    .locals 1

    .line 1
    sget-object v0, Li8/a$d;->q:Li8/a$d;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()Li8/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$d;->l:Li8/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()Li8/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$d;->m:Li8/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public C()Li8/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$d;->k:Li8/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public D()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$d;->i:I

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

.method public E()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$d;->i:I

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

.method public F()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$d;->i:I

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

.method public G()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$d;->i:I

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

.method public H()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$d;->i:I

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

.method public L()Li8/a$d$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$d;->J()Li8/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public M()Li8/a$d$b;
    .locals 1

    .line 1
    invoke-static {p0}, Li8/a$d;->K(Li8/a$d;)Li8/a$d$b;

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
    iget v0, p0, Li8/a$d;->p:I

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
    iget v0, p0, Li8/a$d;->i:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Li8/a$d;->j:Li8/a$b;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lm8/f;->r(ILm8/p;)I

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
    iget v1, p0, Li8/a$d;->i:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Li8/a$d;->k:Li8/a$c;

    .line 28
    .line 29
    invoke-static {v2, v1}, Lm8/f;->r(ILm8/p;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Li8/a$d;->i:I

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
    iget-object v3, p0, Li8/a$d;->l:Li8/a$c;

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
    iget v1, p0, Li8/a$d;->i:I

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-ne v1, v3, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Li8/a$d;->m:Li8/a$c;

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
    iget v1, p0, Li8/a$d;->i:I

    .line 63
    .line 64
    const/16 v2, 0x10

    .line 65
    .line 66
    and-int/2addr v1, v2

    .line 67
    if-ne v1, v2, :cond_5

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    iget-object v2, p0, Li8/a$d;->n:Li8/a$c;

    .line 71
    .line 72
    invoke-static {v1, v2}, Lm8/f;->r(ILm8/p;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v0, v1

    .line 77
    :cond_5
    iget-object v1, p0, Li8/a$d;->h:Lm8/d;

    .line 78
    .line 79
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    add-int/2addr v0, v1

    .line 84
    iput v0, p0, Li8/a$d;->p:I

    .line 85
    .line 86
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/a$d;->L()Li8/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Li8/a$d;->o:B

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
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    iput-byte v1, p0, Li8/a$d;->o:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/a$d;->M()Li8/a$d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(Lm8/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Li8/a$d;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Li8/a$d;->i:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Li8/a$d;->j:Li8/a$b;

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lm8/f;->c0(ILm8/p;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Li8/a$d;->i:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Li8/a$d;->k:Li8/a$c;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lm8/f;->c0(ILm8/p;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Li8/a$d;->i:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    iget-object v2, p0, Li8/a$d;->l:Li8/a$c;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v2}, Lm8/f;->c0(ILm8/p;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget v0, p0, Li8/a$d;->i:I

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    and-int/2addr v0, v2

    .line 43
    if-ne v0, v2, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, Li8/a$d;->m:Li8/a$c;

    .line 46
    .line 47
    invoke-virtual {p1, v1, v0}, Lm8/f;->c0(ILm8/p;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    iget v0, p0, Li8/a$d;->i:I

    .line 51
    .line 52
    const/16 v1, 0x10

    .line 53
    .line 54
    and-int/2addr v0, v1

    .line 55
    if-ne v0, v1, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x5

    .line 58
    iget-object v1, p0, Li8/a$d;->n:Li8/a$c;

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Lm8/f;->c0(ILm8/p;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-object v0, p0, Li8/a$d;->h:Lm8/d;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public y()Li8/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$d;->n:Li8/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public z()Li8/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$d;->j:Li8/a$b;

    .line 2
    .line 3
    return-object v0
.end method
