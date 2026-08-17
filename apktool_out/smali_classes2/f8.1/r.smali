.class public final Lf8/r;
.super Lm8/i$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/r$b;
    }
.end annotation


# static fields
.field private static final v:Lf8/r;

.field public static w:Lm8/r;


# instance fields
.field private final i:Lm8/d;

.field private j:I

.field private k:I

.field private l:I

.field private m:Ljava/util/List;

.field private n:Lf8/q;

.field private o:I

.field private p:Lf8/q;

.field private q:I

.field private r:Ljava/util/List;

.field private s:Ljava/util/List;

.field private t:B

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/r$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/r$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/r;->w:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/r;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/r;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/r;->v:Lf8/r;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/r;->i0()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 11

    .line 11
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lf8/r;->t:B

    .line 13
    iput v0, p0, Lf8/r;->u:I

    .line 14
    invoke-direct {p0}, Lf8/r;->i0()V

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
    const/16 v5, 0x80

    const/4 v6, 0x4

    const/16 v7, 0x100

    if-nez v3, :cond_d

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v8

    const/4 v9, 0x0

    sparse-switch v8, :sswitch_data_0

    .line 18
    invoke-virtual {p0, p1, v2, p2, v8}, Lm8/i$d;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    .line 19
    :sswitch_1
    invoke-virtual {p1}, Lm8/e;->z()I

    move-result v8

    .line 20
    invoke-virtual {p1, v8}, Lm8/e;->i(I)I

    move-result v8

    and-int/lit16 v9, v4, 0x100

    if-eq v9, v7, :cond_1

    .line 21
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v9

    if-lez v9, :cond_1

    .line 22
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lf8/r;->s:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 23
    :cond_1
    :goto_1
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v9

    if-lez v9, :cond_2

    .line 24
    iget-object v9, p0, Lf8/r;->s:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 25
    :cond_2
    invoke-virtual {p1, v8}, Lm8/e;->h(I)V

    goto :goto_0

    :sswitch_2
    and-int/lit16 v8, v4, 0x100

    if-eq v8, v7, :cond_3

    .line 26
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Lf8/r;->s:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 27
    :cond_3
    iget-object v8, p0, Lf8/r;->s:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :sswitch_3
    and-int/lit16 v8, v4, 0x80

    if-eq v8, v5, :cond_4

    .line 28
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Lf8/r;->r:Ljava/util/List;

    or-int/lit16 v4, v4, 0x80

    .line 29
    :cond_4
    iget-object v8, p0, Lf8/r;->r:Ljava/util/List;

    sget-object v9, Lf8/b;->o:Lm8/r;

    invoke-virtual {p1, v9, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 30
    :sswitch_4
    iget v8, p0, Lf8/r;->j:I

    or-int/lit8 v8, v8, 0x20

    iput v8, p0, Lf8/r;->j:I

    .line 31
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v8

    iput v8, p0, Lf8/r;->q:I

    goto/16 :goto_0

    .line 32
    :sswitch_5
    iget v8, p0, Lf8/r;->j:I

    const/16 v10, 0x10

    and-int/2addr v8, v10

    if-ne v8, v10, :cond_5

    .line 33
    iget-object v8, p0, Lf8/r;->p:Lf8/q;

    invoke-virtual {v8}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v9

    .line 34
    :cond_5
    sget-object v8, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v8, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v8

    check-cast v8, Lf8/q;

    iput-object v8, p0, Lf8/r;->p:Lf8/q;

    if-eqz v9, :cond_6

    .line 35
    invoke-virtual {v9, v8}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 36
    invoke-virtual {v9}, Lf8/q$c;->r()Lf8/q;

    move-result-object v8

    iput-object v8, p0, Lf8/r;->p:Lf8/q;

    .line 37
    :cond_6
    iget v8, p0, Lf8/r;->j:I

    or-int/2addr v8, v10

    iput v8, p0, Lf8/r;->j:I

    goto/16 :goto_0

    .line 38
    :sswitch_6
    iget v8, p0, Lf8/r;->j:I

    or-int/lit8 v8, v8, 0x8

    iput v8, p0, Lf8/r;->j:I

    .line 39
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v8

    iput v8, p0, Lf8/r;->o:I

    goto/16 :goto_0

    .line 40
    :sswitch_7
    iget v8, p0, Lf8/r;->j:I

    and-int/2addr v8, v6

    if-ne v8, v6, :cond_7

    .line 41
    iget-object v8, p0, Lf8/r;->n:Lf8/q;

    invoke-virtual {v8}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v9

    .line 42
    :cond_7
    sget-object v8, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v8, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v8

    check-cast v8, Lf8/q;

    iput-object v8, p0, Lf8/r;->n:Lf8/q;

    if-eqz v9, :cond_8

    .line 43
    invoke-virtual {v9, v8}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 44
    invoke-virtual {v9}, Lf8/q$c;->r()Lf8/q;

    move-result-object v8

    iput-object v8, p0, Lf8/r;->n:Lf8/q;

    .line 45
    :cond_8
    iget v8, p0, Lf8/r;->j:I

    or-int/2addr v8, v6

    iput v8, p0, Lf8/r;->j:I

    goto/16 :goto_0

    :sswitch_8
    and-int/lit8 v8, v4, 0x4

    if-eq v8, v6, :cond_9

    .line 46
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Lf8/r;->m:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    .line 47
    :cond_9
    iget-object v8, p0, Lf8/r;->m:Ljava/util/List;

    sget-object v9, Lf8/s;->u:Lm8/r;

    invoke-virtual {p1, v9, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 48
    :sswitch_9
    iget v8, p0, Lf8/r;->j:I

    or-int/lit8 v8, v8, 0x2

    iput v8, p0, Lf8/r;->j:I

    .line 49
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v8

    iput v8, p0, Lf8/r;->l:I

    goto/16 :goto_0

    .line 50
    :sswitch_a
    iget v8, p0, Lf8/r;->j:I

    or-int/2addr v8, v1

    iput v8, p0, Lf8/r;->j:I

    .line 51
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v8

    iput v8, p0, Lf8/r;->k:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 52
    :goto_2
    :try_start_1
    new-instance p2, Lm8/k;

    .line 53
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 54
    :goto_3
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v6, :cond_a

    .line 55
    iget-object p2, p0, Lf8/r;->m:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/r;->m:Ljava/util/List;

    :cond_a
    and-int/lit16 p2, v4, 0x80

    if-ne p2, v5, :cond_b

    .line 56
    iget-object p2, p0, Lf8/r;->r:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/r;->r:Ljava/util/List;

    :cond_b
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v7, :cond_c

    .line 57
    iget-object p2, p0, Lf8/r;->s:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/r;->s:Ljava/util/List;

    .line 58
    :cond_c
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/r;->i:Lm8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/r;->i:Lm8/d;

    .line 60
    throw p1

    .line 61
    :goto_5
    invoke-virtual {p0}, Lm8/i$d;->l()V

    .line 62
    throw p1

    :cond_d
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v6, :cond_e

    .line 63
    iget-object p1, p0, Lf8/r;->m:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/r;->m:Ljava/util/List;

    :cond_e
    and-int/lit16 p1, v4, 0x80

    if-ne p1, v5, :cond_f

    .line 64
    iget-object p1, p0, Lf8/r;->r:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/r;->r:Ljava/util/List;

    :cond_f
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v7, :cond_10

    .line 65
    iget-object p1, p0, Lf8/r;->s:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/r;->s:Ljava/util/List;

    .line 66
    :cond_10
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 67
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/r;->i:Lm8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/r;->i:Lm8/d;

    .line 68
    throw p1

    .line 69
    :goto_6
    invoke-virtual {p0}, Lm8/i$d;->l()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_a
        0x10 -> :sswitch_9
        0x1a -> :sswitch_8
        0x22 -> :sswitch_7
        0x28 -> :sswitch_6
        0x32 -> :sswitch_5
        0x38 -> :sswitch_4
        0x42 -> :sswitch_3
        0xf8 -> :sswitch_2
        0xfa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/r;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i$d;-><init>(Lm8/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/r;->t:B

    .line 5
    iput v0, p0, Lf8/r;->u:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/r;->i:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$c;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/r;-><init>(Lm8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/r;->t:B

    .line 9
    iput p1, p0, Lf8/r;->u:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/r;->i:Lm8/d;

    return-void
.end method

.method static synthetic A(Lf8/r;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/r;->l:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic B(Lf8/r;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/r;->m:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic C(Lf8/r;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/r;->m:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic D(Lf8/r;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/r;->n:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic E(Lf8/r;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/r;->o:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic F(Lf8/r;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/r;->p:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic G(Lf8/r;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/r;->q:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic H(Lf8/r;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/r;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic I(Lf8/r;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/r;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic J(Lf8/r;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/r;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic K(Lf8/r;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/r;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic L(Lf8/r;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/r;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic M(Lf8/r;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/r;->i:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static Q()Lf8/r;
    .locals 1

    .line 1
    sget-object v0, Lf8/r;->v:Lf8/r;

    .line 2
    .line 3
    return-object v0
.end method

.method private i0()V
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lf8/r;->k:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lf8/r;->l:I

    .line 6
    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    iput-object v1, p0, Lf8/r;->m:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iput-object v2, p0, Lf8/r;->n:Lf8/q;

    .line 16
    .line 17
    iput v0, p0, Lf8/r;->o:I

    .line 18
    .line 19
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iput-object v2, p0, Lf8/r;->p:Lf8/q;

    .line 24
    .line 25
    iput v0, p0, Lf8/r;->q:I

    .line 26
    .line 27
    iput-object v1, p0, Lf8/r;->r:Ljava/util/List;

    .line 28
    .line 29
    iput-object v1, p0, Lf8/r;->s:Ljava/util/List;

    .line 30
    .line 31
    return-void
.end method

.method public static j0()Lf8/r$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/r$b;->p()Lf8/r$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static k0(Lf8/r;)Lf8/r$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/r;->j0()Lf8/r$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/r$b;->A(Lf8/r;)Lf8/r$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static n0(Ljava/io/InputStream;Lm8/g;)Lf8/r;
    .locals 1

    .line 1
    sget-object v0, Lf8/r;->w:Lm8/r;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Lm8/r;->b(Ljava/io/InputStream;Lm8/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf8/r;

    .line 8
    .line 9
    return-object p0
.end method

.method static synthetic z(Lf8/r;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/r;->k:I

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public N(I)Lf8/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->r:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf8/b;

    .line 8
    .line 9
    return-object p1
.end method

.method public O()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->r:Ljava/util/List;

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

.method public P()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public R()Lf8/r;
    .locals 1

    .line 1
    sget-object v0, Lf8/r;->v:Lf8/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public S()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->p:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public T()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/r;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public U()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/r;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public V()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/r;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public W(I)Lf8/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf8/s;

    .line 8
    .line 9
    return-object p1
.end method

.method public X()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->m:Ljava/util/List;

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

.method public Y()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->m:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public Z()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->n:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic a()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/r;->R()Lf8/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public a0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/r;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 6

    .line 1
    iget v0, p0, Lf8/r;->u:I

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
    iget v0, p0, Lf8/r;->j:I

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
    iget v0, p0, Lf8/r;->k:I

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
    iget v1, p0, Lf8/r;->j:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget v1, p0, Lf8/r;->l:I

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
    move v1, v2

    .line 36
    :goto_1
    iget-object v4, p0, Lf8/r;->m:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-ge v1, v4, :cond_3

    .line 43
    .line 44
    iget-object v4, p0, Lf8/r;->m:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lm8/p;

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    invoke-static {v5, v4}, Lm8/f;->r(ILm8/p;)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    add-int/2addr v0, v4

    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget v1, p0, Lf8/r;->j:I

    .line 62
    .line 63
    const/4 v4, 0x4

    .line 64
    and-int/2addr v1, v4

    .line 65
    if-ne v1, v4, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Lf8/r;->n:Lf8/q;

    .line 68
    .line 69
    invoke-static {v4, v1}, Lm8/f;->r(ILm8/p;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    add-int/2addr v0, v1

    .line 74
    :cond_4
    iget v1, p0, Lf8/r;->j:I

    .line 75
    .line 76
    const/16 v4, 0x8

    .line 77
    .line 78
    and-int/2addr v1, v4

    .line 79
    if-ne v1, v4, :cond_5

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    iget v5, p0, Lf8/r;->o:I

    .line 83
    .line 84
    invoke-static {v1, v5}, Lm8/f;->o(II)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/2addr v0, v1

    .line 89
    :cond_5
    iget v1, p0, Lf8/r;->j:I

    .line 90
    .line 91
    const/16 v5, 0x10

    .line 92
    .line 93
    and-int/2addr v1, v5

    .line 94
    if-ne v1, v5, :cond_6

    .line 95
    .line 96
    const/4 v1, 0x6

    .line 97
    iget-object v5, p0, Lf8/r;->p:Lf8/q;

    .line 98
    .line 99
    invoke-static {v1, v5}, Lm8/f;->r(ILm8/p;)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 104
    :cond_6
    iget v1, p0, Lf8/r;->j:I

    .line 105
    .line 106
    const/16 v5, 0x20

    .line 107
    .line 108
    and-int/2addr v1, v5

    .line 109
    if-ne v1, v5, :cond_7

    .line 110
    .line 111
    const/4 v1, 0x7

    .line 112
    iget v5, p0, Lf8/r;->q:I

    .line 113
    .line 114
    invoke-static {v1, v5}, Lm8/f;->o(II)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    add-int/2addr v0, v1

    .line 119
    :cond_7
    move v1, v2

    .line 120
    :goto_2
    iget-object v5, p0, Lf8/r;->r:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-ge v1, v5, :cond_8

    .line 127
    .line 128
    iget-object v5, p0, Lf8/r;->r:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, Lm8/p;

    .line 135
    .line 136
    invoke-static {v4, v5}, Lm8/f;->r(ILm8/p;)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    add-int/2addr v0, v5

    .line 141
    add-int/lit8 v1, v1, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    move v1, v2

    .line 145
    :goto_3
    iget-object v4, p0, Lf8/r;->s:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-ge v2, v4, :cond_9

    .line 152
    .line 153
    iget-object v4, p0, Lf8/r;->s:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    invoke-static {v4}, Lm8/f;->p(I)I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    add-int/2addr v1, v4

    .line 170
    add-int/lit8 v2, v2, 0x1

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_9
    add-int/2addr v0, v1

    .line 174
    invoke-virtual {p0}, Lf8/r;->b0()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    mul-int/2addr v1, v3

    .line 183
    add-int/2addr v0, v1

    .line 184
    invoke-virtual {p0}, Lm8/i$d;->s()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    add-int/2addr v0, v1

    .line 189
    iget-object v1, p0, Lf8/r;->i:Lm8/d;

    .line 190
    .line 191
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    add-int/2addr v0, v1

    .line 196
    iput v0, p0, Lf8/r;->u:I

    .line 197
    .line 198
    return v0
.end method

.method public b0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/r;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/r;->m0()Lf8/r$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/r;->j:I

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

.method public d0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/r;->j:I

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

.method public final e()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lf8/r;->t:B

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
    invoke-virtual {p0}, Lf8/r;->f0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lf8/r;->t:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    move v0, v2

    .line 21
    :goto_0
    invoke-virtual {p0}, Lf8/r;->X()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-ge v0, v3, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lf8/r;->W(I)Lf8/s;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lf8/s;->e()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    iput-byte v2, p0, Lf8/r;->t:B

    .line 38
    .line 39
    return v2

    .line 40
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    invoke-virtual {p0}, Lf8/r;->g0()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    invoke-virtual {p0}, Lf8/r;->Z()Lf8/q;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lf8/q;->e()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    iput-byte v2, p0, Lf8/r;->t:B

    .line 60
    .line 61
    return v2

    .line 62
    :cond_5
    invoke-virtual {p0}, Lf8/r;->c0()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0}, Lf8/r;->S()Lf8/q;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lf8/q;->e()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    iput-byte v2, p0, Lf8/r;->t:B

    .line 79
    .line 80
    return v2

    .line 81
    :cond_6
    move v0, v2

    .line 82
    :goto_1
    invoke-virtual {p0}, Lf8/r;->O()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-ge v0, v3, :cond_8

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lf8/r;->N(I)Lf8/b;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Lf8/b;->e()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_7

    .line 97
    .line 98
    iput-byte v2, p0, Lf8/r;->t:B

    .line 99
    .line 100
    return v2

    .line 101
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_8
    invoke-virtual {p0}, Lm8/i$d;->r()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_9

    .line 109
    .line 110
    iput-byte v2, p0, Lf8/r;->t:B

    .line 111
    .line 112
    return v2

    .line 113
    :cond_9
    iput-byte v1, p0, Lf8/r;->t:B

    .line 114
    .line 115
    return v1
.end method

.method public e0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/r;->j:I

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

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/r;->o0()Lf8/r$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/r;->j:I

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

.method public g(Lm8/f;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lf8/r;->b()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm8/i$d;->x()Lm8/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lf8/r;->j:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lf8/r;->k:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lm8/f;->Z(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lf8/r;->j:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget v1, p0, Lf8/r;->l:I

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, Lm8/f;->Z(II)V

    .line 28
    .line 29
    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    move v2, v1

    .line 32
    :goto_0
    iget-object v3, p0, Lf8/r;->m:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-ge v2, v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lf8/r;->m:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lm8/p;

    .line 47
    .line 48
    const/4 v4, 0x3

    .line 49
    invoke-virtual {p1, v4, v3}, Lm8/f;->c0(ILm8/p;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget v2, p0, Lf8/r;->j:I

    .line 56
    .line 57
    const/4 v3, 0x4

    .line 58
    and-int/2addr v2, v3

    .line 59
    if-ne v2, v3, :cond_3

    .line 60
    .line 61
    iget-object v2, p0, Lf8/r;->n:Lf8/q;

    .line 62
    .line 63
    invoke-virtual {p1, v3, v2}, Lm8/f;->c0(ILm8/p;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    iget v2, p0, Lf8/r;->j:I

    .line 67
    .line 68
    const/16 v3, 0x8

    .line 69
    .line 70
    and-int/2addr v2, v3

    .line 71
    if-ne v2, v3, :cond_4

    .line 72
    .line 73
    const/4 v2, 0x5

    .line 74
    iget v4, p0, Lf8/r;->o:I

    .line 75
    .line 76
    invoke-virtual {p1, v2, v4}, Lm8/f;->Z(II)V

    .line 77
    .line 78
    .line 79
    :cond_4
    iget v2, p0, Lf8/r;->j:I

    .line 80
    .line 81
    const/16 v4, 0x10

    .line 82
    .line 83
    and-int/2addr v2, v4

    .line 84
    if-ne v2, v4, :cond_5

    .line 85
    .line 86
    const/4 v2, 0x6

    .line 87
    iget-object v4, p0, Lf8/r;->p:Lf8/q;

    .line 88
    .line 89
    invoke-virtual {p1, v2, v4}, Lm8/f;->c0(ILm8/p;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    iget v2, p0, Lf8/r;->j:I

    .line 93
    .line 94
    const/16 v4, 0x20

    .line 95
    .line 96
    and-int/2addr v2, v4

    .line 97
    if-ne v2, v4, :cond_6

    .line 98
    .line 99
    const/4 v2, 0x7

    .line 100
    iget v4, p0, Lf8/r;->q:I

    .line 101
    .line 102
    invoke-virtual {p1, v2, v4}, Lm8/f;->Z(II)V

    .line 103
    .line 104
    .line 105
    :cond_6
    move v2, v1

    .line 106
    :goto_1
    iget-object v4, p0, Lf8/r;->r:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-ge v2, v4, :cond_7

    .line 113
    .line 114
    iget-object v4, p0, Lf8/r;->r:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Lm8/p;

    .line 121
    .line 122
    invoke-virtual {p1, v3, v4}, Lm8/f;->c0(ILm8/p;)V

    .line 123
    .line 124
    .line 125
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_7
    :goto_2
    iget-object v2, p0, Lf8/r;->s:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-ge v1, v2, :cond_8

    .line 135
    .line 136
    iget-object v2, p0, Lf8/r;->s:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Ljava/lang/Integer;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    const/16 v3, 0x1f

    .line 149
    .line 150
    invoke-virtual {p1, v3, v2}, Lm8/f;->Z(II)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v1, v1, 0x1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_8
    const/16 v1, 0xc8

    .line 157
    .line 158
    invoke-virtual {v0, v1, p1}, Lm8/i$d$a;->a(ILm8/f;)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lf8/r;->i:Lm8/d;

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public g0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/r;->j:I

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

.method public h0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/r;->j:I

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

.method public m0()Lf8/r$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/r;->j0()Lf8/r$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public o0()Lf8/r$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/r;->k0(Lf8/r;)Lf8/r$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
