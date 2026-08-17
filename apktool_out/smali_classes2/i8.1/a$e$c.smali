.class public final Li8/a$e$c;
.super Lm8/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/a$e$c$b;,
        Li8/a$e$c$c;
    }
.end annotation


# static fields
.field private static final t:Li8/a$e$c;

.field public static u:Lm8/r;


# instance fields
.field private final h:Lm8/d;

.field private i:I

.field private j:I

.field private k:I

.field private l:Ljava/lang/Object;

.field private m:Li8/a$e$c$c;

.field private n:Ljava/util/List;

.field private o:I

.field private p:Ljava/util/List;

.field private q:I

.field private r:B

.field private s:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li8/a$e$c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Li8/a$e$c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li8/a$e$c;->u:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Li8/a$e$c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Li8/a$e$c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Li8/a$e$c;->t:Li8/a$e$c;

    .line 15
    .line 16
    invoke-direct {v0}, Li8/a$e$c;->P()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 11

    .line 15
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Li8/a$e$c;->o:I

    .line 17
    iput v0, p0, Li8/a$e$c;->q:I

    .line 18
    iput-byte v0, p0, Li8/a$e$c;->r:B

    .line 19
    iput v0, p0, Li8/a$e$c;->s:I

    .line 20
    invoke-direct {p0}, Li8/a$e$c;->P()V

    .line 21
    invoke-static {}, Lm8/d;->y()Lm8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 22
    invoke-static {v0, v1}, Lm8/f;->I(Ljava/io/OutputStream;I)Lm8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x20

    const/16 v6, 0x10

    if-nez v3, :cond_13

    .line 23
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v7

    if-eqz v7, :cond_1

    const/16 v8, 0x8

    if-eq v7, v8, :cond_10

    if-eq v7, v6, :cond_f

    const/16 v9, 0x18

    if-eq v7, v9, :cond_d

    if-eq v7, v5, :cond_b

    const/16 v8, 0x22

    if-eq v7, v8, :cond_8

    const/16 v8, 0x28

    if-eq v7, v8, :cond_6

    const/16 v8, 0x2a

    if-eq v7, v8, :cond_3

    const/16 v8, 0x32

    if-eq v7, v8, :cond_2

    .line 24
    invoke-virtual {p0, p1, v2, p2, v7}, Lm8/i;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    .line 25
    :cond_2
    invoke-virtual {p1}, Lm8/e;->k()Lm8/d;

    move-result-object v7

    .line 26
    iget v8, p0, Li8/a$e$c;->i:I

    or-int/lit8 v8, v8, 0x4

    iput v8, p0, Li8/a$e$c;->i:I

    .line 27
    iput-object v7, p0, Li8/a$e$c;->l:Ljava/lang/Object;

    goto :goto_0

    .line 28
    :cond_3
    invoke-virtual {p1}, Lm8/e;->z()I

    move-result v7

    .line 29
    invoke-virtual {p1, v7}, Lm8/e;->i(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x20

    if-eq v8, v5, :cond_4

    .line 30
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v8

    if-lez v8, :cond_4

    .line 31
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Li8/a$e$c;->p:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 32
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v8

    if-lez v8, :cond_5

    .line 33
    iget-object v8, p0, Li8/a$e$c;->p:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 34
    :cond_5
    invoke-virtual {p1, v7}, Lm8/e;->h(I)V

    goto :goto_0

    :cond_6
    and-int/lit8 v7, v4, 0x20

    if-eq v7, v5, :cond_7

    .line 35
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/a$e$c;->p:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 36
    :cond_7
    iget-object v7, p0, Li8/a$e$c;->p:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 37
    :cond_8
    invoke-virtual {p1}, Lm8/e;->z()I

    move-result v7

    .line 38
    invoke-virtual {p1, v7}, Lm8/e;->i(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x10

    if-eq v8, v6, :cond_9

    .line 39
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v8

    if-lez v8, :cond_9

    .line 40
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Li8/a$e$c;->n:Ljava/util/List;

    or-int/lit8 v4, v4, 0x10

    .line 41
    :cond_9
    :goto_2
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v8

    if-lez v8, :cond_a

    .line 42
    iget-object v8, p0, Li8/a$e$c;->n:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 43
    :cond_a
    invoke-virtual {p1, v7}, Lm8/e;->h(I)V

    goto/16 :goto_0

    :cond_b
    and-int/lit8 v7, v4, 0x10

    if-eq v7, v6, :cond_c

    .line 44
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/a$e$c;->n:Ljava/util/List;

    or-int/lit8 v4, v4, 0x10

    .line 45
    :cond_c
    iget-object v7, p0, Li8/a$e$c;->n:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 46
    :cond_d
    invoke-virtual {p1}, Lm8/e;->m()I

    move-result v9

    .line 47
    invoke-static {v9}, Li8/a$e$c$c;->h(I)Li8/a$e$c$c;

    move-result-object v10

    if-nez v10, :cond_e

    .line 48
    invoke-virtual {v2, v7}, Lm8/f;->n0(I)V

    .line 49
    invoke-virtual {v2, v9}, Lm8/f;->n0(I)V

    goto/16 :goto_0

    .line 50
    :cond_e
    iget v7, p0, Li8/a$e$c;->i:I

    or-int/2addr v7, v8

    iput v7, p0, Li8/a$e$c;->i:I

    .line 51
    iput-object v10, p0, Li8/a$e$c;->m:Li8/a$e$c$c;

    goto/16 :goto_0

    .line 52
    :cond_f
    iget v7, p0, Li8/a$e$c;->i:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, Li8/a$e$c;->i:I

    .line 53
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v7

    iput v7, p0, Li8/a$e$c;->k:I

    goto/16 :goto_0

    .line 54
    :cond_10
    iget v7, p0, Li8/a$e$c;->i:I

    or-int/2addr v7, v1

    iput v7, p0, Li8/a$e$c;->i:I

    .line 55
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v7

    iput v7, p0, Li8/a$e$c;->j:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 56
    :goto_3
    :try_start_1
    new-instance p2, Lm8/k;

    .line 57
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 58
    :goto_4
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    and-int/lit8 p2, v4, 0x10

    if-ne p2, v6, :cond_11

    .line 59
    iget-object p2, p0, Li8/a$e$c;->n:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/a$e$c;->n:Ljava/util/List;

    :cond_11
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v5, :cond_12

    .line 60
    iget-object p2, p0, Li8/a$e$c;->p:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 61
    :cond_12
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$e$c;->h:Lm8/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$e$c;->h:Lm8/d;

    .line 63
    throw p1

    .line 64
    :goto_6
    invoke-virtual {p0}, Lm8/i;->l()V

    .line 65
    throw p1

    :cond_13
    and-int/lit8 p1, v4, 0x10

    if-ne p1, v6, :cond_14

    .line 66
    iget-object p1, p0, Li8/a$e$c;->n:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/a$e$c;->n:Ljava/util/List;

    :cond_14
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v5, :cond_15

    .line 67
    iget-object p1, p0, Li8/a$e$c;->p:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 68
    :cond_15
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 69
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Li8/a$e$c;->h:Lm8/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$e$c;->h:Lm8/d;

    .line 70
    throw p1

    .line 71
    :goto_7
    invoke-virtual {p0}, Lm8/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Li8/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li8/a$e$c;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i;-><init>(Lm8/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Li8/a$e$c;->o:I

    .line 5
    iput v0, p0, Li8/a$e$c;->q:I

    .line 6
    iput-byte v0, p0, Li8/a$e$c;->r:B

    .line 7
    iput v0, p0, Li8/a$e$c;->s:I

    .line 8
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Li8/a$e$c;->h:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$b;Li8/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Li8/a$e$c;-><init>(Lm8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 9
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 p1, -0x1

    .line 10
    iput p1, p0, Li8/a$e$c;->o:I

    .line 11
    iput p1, p0, Li8/a$e$c;->q:I

    .line 12
    iput-byte p1, p0, Li8/a$e$c;->r:B

    .line 13
    iput p1, p0, Li8/a$e$c;->s:I

    .line 14
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Li8/a$e$c;->h:Lm8/d;

    return-void
.end method

.method static synthetic A(Li8/a$e$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static B()Li8/a$e$c;
    .locals 1

    .line 1
    sget-object v0, Li8/a$e$c;->t:Li8/a$e$c;

    .line 2
    .line 3
    return-object v0
.end method

.method private P()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Li8/a$e$c;->j:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Li8/a$e$c;->k:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Li8/a$e$c;->l:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v0, Li8/a$e$c$c;->h:Li8/a$e$c$c;

    .line 12
    .line 13
    iput-object v0, p0, Li8/a$e$c;->m:Li8/a$e$c$c;

    .line 14
    .line 15
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    iput-object v0, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 18
    .line 19
    iput-object v0, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public static Q()Li8/a$e$c$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$e$c$b;->l()Li8/a$e$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static R(Li8/a$e$c;)Li8/a$e$c$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$e$c;->Q()Li8/a$e$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Li8/a$e$c$b;->u(Li8/a$e$c;)Li8/a$e$c$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic q(Li8/a$e$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Li8/a$e$c;->i:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic r(Li8/a$e$c;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Li8/a$e$c;->h:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic s(Li8/a$e$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Li8/a$e$c;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic t(Li8/a$e$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Li8/a$e$c;->k:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic u(Li8/a$e$c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Li8/a$e$c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic v(Li8/a$e$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$e$c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic w(Li8/a$e$c;Li8/a$e$c$c;)Li8/a$e$c$c;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$e$c;->m:Li8/a$e$c$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic x(Li8/a$e$c;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic y(Li8/a$e$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic z(Li8/a$e$c;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public C()Li8/a$e$c$c;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$e$c;->m:Li8/a$e$c$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public D()I
    .locals 1

    .line 1
    iget v0, p0, Li8/a$e$c;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public E()I
    .locals 1

    .line 1
    iget v0, p0, Li8/a$e$c;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public F()I
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public G()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public H()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Li8/a$e$c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lm8/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lm8/d;->E()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lm8/d;->x()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v1, p0, Li8/a$e$c;->l:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public I()Lm8/d;
    .locals 2

    .line 1
    iget-object v0, p0, Li8/a$e$c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lm8/d;->s(Ljava/lang/String;)Lm8/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Li8/a$e$c;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lm8/d;

    .line 17
    .line 18
    return-object v0
.end method

.method public J()I
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public K()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public L()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$e$c;->i:I

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

.method public M()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$e$c;->i:I

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

.method public N()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$e$c;->i:I

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

.method public O()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$e$c;->i:I

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

.method public S()Li8/a$e$c$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$e$c;->Q()Li8/a$e$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public T()Li8/a$e$c$b;
    .locals 1

    .line 1
    invoke-static {p0}, Li8/a$e$c;->R(Li8/a$e$c;)Li8/a$e$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()I
    .locals 5

    .line 1
    iget v0, p0, Li8/a$e$c;->s:I

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
    iget v0, p0, Li8/a$e$c;->i:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Li8/a$e$c;->j:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lm8/f;->o(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    iget v1, p0, Li8/a$e$c;->i:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget v1, p0, Li8/a$e$c;->k:I

    .line 29
    .line 30
    invoke-static {v3, v1}, Lm8/f;->o(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    iget v1, p0, Li8/a$e$c;->i:I

    .line 36
    .line 37
    const/16 v3, 0x8

    .line 38
    .line 39
    and-int/2addr v1, v3

    .line 40
    if-ne v1, v3, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Li8/a$e$c;->m:Li8/a$e$c$c;

    .line 43
    .line 44
    invoke-virtual {v1}, Li8/a$e$c$c;->a()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v3, 0x3

    .line 49
    invoke-static {v3, v1}, Lm8/f;->h(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_3
    move v1, v2

    .line 55
    move v3, v1

    .line 56
    :goto_1
    iget-object v4, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ge v1, v4, :cond_4

    .line 63
    .line 64
    iget-object v4, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v4}, Lm8/f;->p(I)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    add-int/2addr v3, v4

    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    add-int/2addr v0, v3

    .line 85
    invoke-virtual {p0}, Li8/a$e$c;->K()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    invoke-static {v3}, Lm8/f;->p(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    add-int/2addr v0, v1

    .line 102
    :cond_5
    iput v3, p0, Li8/a$e$c;->o:I

    .line 103
    .line 104
    move v1, v2

    .line 105
    :goto_2
    iget-object v3, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-ge v2, v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-static {v3}, Lm8/f;->p(I)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    add-int/2addr v1, v3

    .line 130
    add-int/lit8 v2, v2, 0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    add-int/2addr v0, v1

    .line 134
    invoke-virtual {p0}, Li8/a$e$c;->G()Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_7

    .line 143
    .line 144
    add-int/lit8 v0, v0, 0x1

    .line 145
    .line 146
    invoke-static {v1}, Lm8/f;->p(I)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    add-int/2addr v0, v2

    .line 151
    :cond_7
    iput v1, p0, Li8/a$e$c;->q:I

    .line 152
    .line 153
    iget v1, p0, Li8/a$e$c;->i:I

    .line 154
    .line 155
    const/4 v2, 0x4

    .line 156
    and-int/2addr v1, v2

    .line 157
    if-ne v1, v2, :cond_8

    .line 158
    .line 159
    const/4 v1, 0x6

    .line 160
    invoke-virtual {p0}, Li8/a$e$c;->I()Lm8/d;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v1, v2}, Lm8/f;->d(ILm8/d;)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    add-int/2addr v0, v1

    .line 169
    :cond_8
    iget-object v1, p0, Li8/a$e$c;->h:Lm8/d;

    .line 170
    .line 171
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    add-int/2addr v0, v1

    .line 176
    iput v0, p0, Li8/a$e$c;->s:I

    .line 177
    .line 178
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/a$e$c;->S()Li8/a$e$c$b;

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
    iget-byte v0, p0, Li8/a$e$c;->r:B

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
    iput-byte v1, p0, Li8/a$e$c;->r:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/a$e$c;->T()Li8/a$e$c$b;

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
    invoke-virtual {p0}, Li8/a$e$c;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Li8/a$e$c;->i:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Li8/a$e$c;->j:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lm8/f;->Z(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Li8/a$e$c;->i:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Li8/a$e$c;->k:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lm8/f;->Z(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Li8/a$e$c;->i:I

    .line 27
    .line 28
    const/16 v1, 0x8

    .line 29
    .line 30
    and-int/2addr v0, v1

    .line 31
    if-ne v0, v1, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Li8/a$e$c;->m:Li8/a$e$c$c;

    .line 34
    .line 35
    invoke-virtual {v0}, Li8/a$e$c$c;->a()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x3

    .line 40
    invoke-virtual {p1, v1, v0}, Lm8/f;->R(II)V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Li8/a$e$c;->K()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-lez v0, :cond_3

    .line 52
    .line 53
    const/16 v0, 0x22

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lm8/f;->n0(I)V

    .line 56
    .line 57
    .line 58
    iget v0, p0, Li8/a$e$c;->o:I

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lm8/f;->n0(I)V

    .line 61
    .line 62
    .line 63
    :cond_3
    const/4 v0, 0x0

    .line 64
    move v1, v0

    .line 65
    :goto_0
    iget-object v2, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ge v1, v2, :cond_4

    .line 72
    .line 73
    iget-object v2, p0, Li8/a$e$c;->n:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {p1, v2}, Lm8/f;->a0(I)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-virtual {p0}, Li8/a$e$c;->G()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-lez v1, :cond_5

    .line 100
    .line 101
    const/16 v1, 0x2a

    .line 102
    .line 103
    invoke-virtual {p1, v1}, Lm8/f;->n0(I)V

    .line 104
    .line 105
    .line 106
    iget v1, p0, Li8/a$e$c;->q:I

    .line 107
    .line 108
    invoke-virtual {p1, v1}, Lm8/f;->n0(I)V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_1
    iget-object v1, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-ge v0, v1, :cond_6

    .line 118
    .line 119
    iget-object v1, p0, Li8/a$e$c;->p:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-virtual {p1, v1}, Lm8/f;->a0(I)V

    .line 132
    .line 133
    .line 134
    add-int/lit8 v0, v0, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_6
    iget v0, p0, Li8/a$e$c;->i:I

    .line 138
    .line 139
    const/4 v1, 0x4

    .line 140
    and-int/2addr v0, v1

    .line 141
    if-ne v0, v1, :cond_7

    .line 142
    .line 143
    const/4 v0, 0x6

    .line 144
    invoke-virtual {p0}, Li8/a$e$c;->I()Lm8/d;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {p1, v0, v1}, Lm8/f;->N(ILm8/d;)V

    .line 149
    .line 150
    .line 151
    :cond_7
    iget-object v0, p0, Li8/a$e$c;->h:Lm8/d;

    .line 152
    .line 153
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method
