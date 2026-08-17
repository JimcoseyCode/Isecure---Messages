.class public final Lf8/m;
.super Lm8/i$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/m$b;
    }
.end annotation


# static fields
.field private static final q:Lf8/m;

.field public static r:Lm8/r;


# instance fields
.field private final i:Lm8/d;

.field private j:I

.field private k:Lf8/p;

.field private l:Lf8/o;

.field private m:Lf8/l;

.field private n:Ljava/util/List;

.field private o:B

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/m$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/m$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/m;->r:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/m;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/m;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/m;->q:Lf8/m;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/m;->R()V

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
    iput-byte v0, p0, Lf8/m;->o:B

    .line 13
    iput v0, p0, Lf8/m;->p:I

    .line 14
    invoke-direct {p0}, Lf8/m;->R()V

    .line 15
    invoke-static {}, Lm8/d;->y()Lm8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lm8/f;->I(Ljava/io/OutputStream;I)Lm8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x8

    if-nez v3, :cond_e

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0xa

    const/4 v8, 0x0

    if-eq v6, v7, :cond_a

    const/16 v7, 0x12

    if-eq v6, v7, :cond_7

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_4

    const/16 v7, 0x22

    if-eq v6, v7, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v6}, Lm8/i$d;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

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

    :cond_2
    and-int/lit8 v6, v4, 0x8

    if-eq v6, v5, :cond_3

    .line 19
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lf8/m;->n:Ljava/util/List;

    move v4, v5

    .line 20
    :cond_3
    iget-object v6, p0, Lf8/m;->n:Ljava/util/List;

    sget-object v7, Lf8/c;->R:Lm8/r;

    invoke-virtual {p1, v7, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_4
    iget v6, p0, Lf8/m;->j:I

    const/4 v7, 0x4

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_5

    .line 22
    iget-object v6, p0, Lf8/m;->m:Lf8/l;

    invoke-virtual {v6}, Lf8/l;->d0()Lf8/l$b;

    move-result-object v8

    .line 23
    :cond_5
    sget-object v6, Lf8/l;->s:Lm8/r;

    invoke-virtual {p1, v6, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v6

    check-cast v6, Lf8/l;

    iput-object v6, p0, Lf8/m;->m:Lf8/l;

    if-eqz v8, :cond_6

    .line 24
    invoke-virtual {v8, v6}, Lf8/l$b;->z(Lf8/l;)Lf8/l$b;

    .line 25
    invoke-virtual {v8}, Lf8/l$b;->r()Lf8/l;

    move-result-object v6

    iput-object v6, p0, Lf8/m;->m:Lf8/l;

    .line 26
    :cond_6
    iget v6, p0, Lf8/m;->j:I

    or-int/2addr v6, v7

    iput v6, p0, Lf8/m;->j:I

    goto :goto_0

    .line 27
    :cond_7
    iget v6, p0, Lf8/m;->j:I

    const/4 v7, 0x2

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_8

    .line 28
    iget-object v6, p0, Lf8/m;->l:Lf8/o;

    invoke-virtual {v6}, Lf8/o;->A()Lf8/o$b;

    move-result-object v8

    .line 29
    :cond_8
    sget-object v6, Lf8/o;->m:Lm8/r;

    invoke-virtual {p1, v6, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v6

    check-cast v6, Lf8/o;

    iput-object v6, p0, Lf8/m;->l:Lf8/o;

    if-eqz v8, :cond_9

    .line 30
    invoke-virtual {v8, v6}, Lf8/o$b;->t(Lf8/o;)Lf8/o$b;

    .line 31
    invoke-virtual {v8}, Lf8/o$b;->n()Lf8/o;

    move-result-object v6

    iput-object v6, p0, Lf8/m;->l:Lf8/o;

    .line 32
    :cond_9
    iget v6, p0, Lf8/m;->j:I

    or-int/2addr v6, v7

    iput v6, p0, Lf8/m;->j:I

    goto/16 :goto_0

    .line 33
    :cond_a
    iget v6, p0, Lf8/m;->j:I

    and-int/2addr v6, v1

    if-ne v6, v1, :cond_b

    .line 34
    iget-object v6, p0, Lf8/m;->k:Lf8/p;

    invoke-virtual {v6}, Lf8/p;->A()Lf8/p$b;

    move-result-object v8

    .line 35
    :cond_b
    sget-object v6, Lf8/p;->m:Lm8/r;

    invoke-virtual {p1, v6, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v6

    check-cast v6, Lf8/p;

    iput-object v6, p0, Lf8/m;->k:Lf8/p;

    if-eqz v8, :cond_c

    .line 36
    invoke-virtual {v8, v6}, Lf8/p$b;->t(Lf8/p;)Lf8/p$b;

    .line 37
    invoke-virtual {v8}, Lf8/p$b;->n()Lf8/p;

    move-result-object v6

    iput-object v6, p0, Lf8/m;->k:Lf8/p;

    .line 38
    :cond_c
    iget v6, p0, Lf8/m;->j:I

    or-int/2addr v6, v1

    iput v6, p0, Lf8/m;->j:I
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

    :goto_3
    and-int/lit8 p2, v4, 0x8

    if-ne p2, v5, :cond_d

    .line 42
    iget-object p2, p0, Lf8/m;->n:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/m;->n:Ljava/util/List;

    .line 43
    :cond_d
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/m;->i:Lm8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/m;->i:Lm8/d;

    .line 45
    throw p1

    .line 46
    :goto_4
    invoke-virtual {p0}, Lm8/i$d;->l()V

    .line 47
    throw p1

    :cond_e
    and-int/lit8 p1, v4, 0x8

    if-ne p1, v5, :cond_f

    .line 48
    iget-object p1, p0, Lf8/m;->n:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/m;->n:Ljava/util/List;

    .line 49
    :cond_f
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 50
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/m;->i:Lm8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/m;->i:Lm8/d;

    .line 51
    throw p1

    .line 52
    :goto_5
    invoke-virtual {p0}, Lm8/i$d;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/m;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i$d;-><init>(Lm8/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/m;->o:B

    .line 5
    iput v0, p0, Lf8/m;->p:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/m;->i:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$c;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/m;-><init>(Lm8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/m;->o:B

    .line 9
    iput p1, p0, Lf8/m;->p:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/m;->i:Lm8/d;

    return-void
.end method

.method static synthetic A(Lf8/m;Lf8/o;)Lf8/o;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/m;->l:Lf8/o;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic B(Lf8/m;Lf8/l;)Lf8/l;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/m;->m:Lf8/l;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic C(Lf8/m;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/m;->n:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic D(Lf8/m;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/m;->n:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic E(Lf8/m;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/m;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic F(Lf8/m;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/m;->i:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static J()Lf8/m;
    .locals 1

    .line 1
    sget-object v0, Lf8/m;->q:Lf8/m;

    .line 2
    .line 3
    return-object v0
.end method

.method private R()V
    .locals 1

    .line 1
    invoke-static {}, Lf8/p;->t()Lf8/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lf8/m;->k:Lf8/p;

    .line 6
    .line 7
    invoke-static {}, Lf8/o;->t()Lf8/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lf8/m;->l:Lf8/o;

    .line 12
    .line 13
    invoke-static {}, Lf8/l;->J()Lf8/l;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lf8/m;->m:Lf8/l;

    .line 18
    .line 19
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 20
    .line 21
    iput-object v0, p0, Lf8/m;->n:Ljava/util/List;

    .line 22
    .line 23
    return-void
.end method

.method public static S()Lf8/m$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/m$b;->p()Lf8/m$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static T(Lf8/m;)Lf8/m$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/m;->S()Lf8/m$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/m$b;->x(Lf8/m;)Lf8/m$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static V(Ljava/io/InputStream;Lm8/g;)Lf8/m;
    .locals 1

    .line 1
    sget-object v0, Lf8/m;->r:Lm8/r;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Lm8/r;->c(Ljava/io/InputStream;Lm8/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf8/m;

    .line 8
    .line 9
    return-object p0
.end method

.method static synthetic z(Lf8/m;Lf8/p;)Lf8/p;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/m;->k:Lf8/p;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public G(I)Lf8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/m;->n:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf8/c;

    .line 8
    .line 9
    return-object p1
.end method

.method public H()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/m;->n:Ljava/util/List;

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

.method public I()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/m;->n:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public K()Lf8/m;
    .locals 1

    .line 1
    sget-object v0, Lf8/m;->q:Lf8/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public L()Lf8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/m;->m:Lf8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public M()Lf8/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/m;->l:Lf8/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public N()Lf8/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/m;->k:Lf8/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public O()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/m;->j:I

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

.method public P()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/m;->j:I

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

.method public Q()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/m;->j:I

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

.method public U()Lf8/m$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/m;->S()Lf8/m$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public W()Lf8/m$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/m;->T(Lf8/m;)Lf8/m$b;

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
    invoke-virtual {p0}, Lf8/m;->K()Lf8/m;

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
    iget v0, p0, Lf8/m;->p:I

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
    iget v0, p0, Lf8/m;->j:I

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
    iget-object v0, p0, Lf8/m;->k:Lf8/p;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lm8/f;->r(ILm8/p;)I

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
    iget v1, p0, Lf8/m;->j:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Lf8/m;->l:Lf8/o;

    .line 29
    .line 30
    invoke-static {v3, v1}, Lm8/f;->r(ILm8/p;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    iget v1, p0, Lf8/m;->j:I

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    and-int/2addr v1, v3

    .line 39
    if-ne v1, v3, :cond_3

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    iget-object v4, p0, Lf8/m;->m:Lf8/l;

    .line 43
    .line 44
    invoke-static {v1, v4}, Lm8/f;->r(ILm8/p;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    :cond_3
    :goto_1
    iget-object v1, p0, Lf8/m;->n:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ge v2, v1, :cond_4

    .line 56
    .line 57
    iget-object v1, p0, Lf8/m;->n:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lm8/p;

    .line 64
    .line 65
    invoke-static {v3, v1}, Lm8/f;->r(ILm8/p;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v0, v1

    .line 70
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-virtual {p0}, Lm8/i$d;->s()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    iget-object v1, p0, Lf8/m;->i:Lm8/d;

    .line 79
    .line 80
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    add-int/2addr v0, v1

    .line 85
    iput v0, p0, Lf8/m;->p:I

    .line 86
    .line 87
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/m;->U()Lf8/m$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lf8/m;->o:B

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
    invoke-virtual {p0}, Lf8/m;->P()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lf8/m;->M()Lf8/o;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lf8/o;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, Lf8/m;->o:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    invoke-virtual {p0}, Lf8/m;->O()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Lf8/m;->L()Lf8/l;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lf8/l;->e()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    iput-byte v2, p0, Lf8/m;->o:B

    .line 47
    .line 48
    return v2

    .line 49
    :cond_3
    move v0, v2

    .line 50
    :goto_0
    invoke-virtual {p0}, Lf8/m;->H()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-ge v0, v3, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lf8/m;->G(I)Lf8/c;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Lf8/c;->e()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    iput-byte v2, p0, Lf8/m;->o:B

    .line 67
    .line 68
    return v2

    .line 69
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    invoke-virtual {p0}, Lm8/i$d;->r()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    iput-byte v2, p0, Lf8/m;->o:B

    .line 79
    .line 80
    return v2

    .line 81
    :cond_6
    iput-byte v1, p0, Lf8/m;->o:B

    .line 82
    .line 83
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/m;->W()Lf8/m$b;

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
    invoke-virtual {p0}, Lf8/m;->b()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm8/i$d;->x()Lm8/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lf8/m;->j:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lf8/m;->k:Lf8/p;

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lm8/f;->c0(ILm8/p;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lf8/m;->j:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lf8/m;->l:Lf8/o;

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, Lm8/f;->c0(ILm8/p;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v1, p0, Lf8/m;->j:I

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
    iget-object v3, p0, Lf8/m;->m:Lf8/l;

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3}, Lm8/f;->c0(ILm8/p;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    const/4 v1, 0x0

    .line 43
    :goto_0
    iget-object v3, p0, Lf8/m;->n:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-ge v1, v3, :cond_3

    .line 50
    .line 51
    iget-object v3, p0, Lf8/m;->n:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lm8/p;

    .line 58
    .line 59
    invoke-virtual {p1, v2, v3}, Lm8/f;->c0(ILm8/p;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/16 v1, 0xc8

    .line 66
    .line 67
    invoke-virtual {v0, v1, p1}, Lm8/i$d$a;->a(ILm8/f;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lf8/m;->i:Lm8/d;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
