.class public final Lf8/q;
.super Lm8/i$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/q$c;,
        Lf8/q$b;
    }
.end annotation


# static fields
.field private static final A:Lf8/q;

.field public static B:Lm8/r;


# instance fields
.field private final i:Lm8/d;

.field private j:I

.field private k:Ljava/util/List;

.field private l:Z

.field private m:I

.field private n:Lf8/q;

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:Lf8/q;

.field private u:I

.field private v:Lf8/q;

.field private w:I

.field private x:I

.field private y:B

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/q$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/q$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/q;->B:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/q;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/q;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/q;->A:Lf8/q;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/q;->w0()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 8

    .line 11
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lf8/q;->y:B

    .line 13
    iput v0, p0, Lf8/q;->z:I

    .line 14
    invoke-direct {p0}, Lf8/q;->w0()V

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
    if-nez v3, :cond_9

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v5

    const/4 v6, 0x0

    sparse-switch v5, :sswitch_data_0

    .line 18
    invoke-virtual {p0, p1, v2, p2, v5}, Lm8/i$d;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
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
    :sswitch_1
    iget v5, p0, Lf8/q;->j:I

    or-int/lit16 v5, v5, 0x800

    iput v5, p0, Lf8/q;->j:I

    .line 20
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->w:I

    goto :goto_0

    .line 21
    :sswitch_2
    iget v5, p0, Lf8/q;->j:I

    const/16 v7, 0x400

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_1

    .line 22
    iget-object v5, p0, Lf8/q;->v:Lf8/q;

    invoke-virtual {v5}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v6

    .line 23
    :cond_1
    sget-object v5, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v5, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v5

    check-cast v5, Lf8/q;

    iput-object v5, p0, Lf8/q;->v:Lf8/q;

    if-eqz v6, :cond_2

    .line 24
    invoke-virtual {v6, v5}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 25
    invoke-virtual {v6}, Lf8/q$c;->r()Lf8/q;

    move-result-object v5

    iput-object v5, p0, Lf8/q;->v:Lf8/q;

    .line 26
    :cond_2
    iget v5, p0, Lf8/q;->j:I

    or-int/2addr v5, v7

    iput v5, p0, Lf8/q;->j:I

    goto :goto_0

    .line 27
    :sswitch_3
    iget v5, p0, Lf8/q;->j:I

    or-int/lit16 v5, v5, 0x80

    iput v5, p0, Lf8/q;->j:I

    .line 28
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->s:I

    goto :goto_0

    .line 29
    :sswitch_4
    iget v5, p0, Lf8/q;->j:I

    or-int/lit16 v5, v5, 0x200

    iput v5, p0, Lf8/q;->j:I

    .line 30
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->u:I

    goto :goto_0

    .line 31
    :sswitch_5
    iget v5, p0, Lf8/q;->j:I

    const/16 v7, 0x100

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_3

    .line 32
    iget-object v5, p0, Lf8/q;->t:Lf8/q;

    invoke-virtual {v5}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v6

    .line 33
    :cond_3
    sget-object v5, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v5, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v5

    check-cast v5, Lf8/q;

    iput-object v5, p0, Lf8/q;->t:Lf8/q;

    if-eqz v6, :cond_4

    .line 34
    invoke-virtual {v6, v5}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 35
    invoke-virtual {v6}, Lf8/q$c;->r()Lf8/q;

    move-result-object v5

    iput-object v5, p0, Lf8/q;->t:Lf8/q;

    .line 36
    :cond_4
    iget v5, p0, Lf8/q;->j:I

    or-int/2addr v5, v7

    iput v5, p0, Lf8/q;->j:I

    goto/16 :goto_0

    .line 37
    :sswitch_6
    iget v5, p0, Lf8/q;->j:I

    or-int/lit8 v5, v5, 0x40

    iput v5, p0, Lf8/q;->j:I

    .line 38
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->r:I

    goto/16 :goto_0

    .line 39
    :sswitch_7
    iget v5, p0, Lf8/q;->j:I

    or-int/lit8 v5, v5, 0x8

    iput v5, p0, Lf8/q;->j:I

    .line 40
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->o:I

    goto/16 :goto_0

    .line 41
    :sswitch_8
    iget v5, p0, Lf8/q;->j:I

    or-int/lit8 v5, v5, 0x20

    iput v5, p0, Lf8/q;->j:I

    .line 42
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->q:I

    goto/16 :goto_0

    .line 43
    :sswitch_9
    iget v5, p0, Lf8/q;->j:I

    or-int/lit8 v5, v5, 0x10

    iput v5, p0, Lf8/q;->j:I

    .line 44
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->p:I

    goto/16 :goto_0

    .line 45
    :sswitch_a
    iget v5, p0, Lf8/q;->j:I

    const/4 v7, 0x4

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_5

    .line 46
    iget-object v5, p0, Lf8/q;->n:Lf8/q;

    invoke-virtual {v5}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v6

    .line 47
    :cond_5
    sget-object v5, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v5, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v5

    check-cast v5, Lf8/q;

    iput-object v5, p0, Lf8/q;->n:Lf8/q;

    if-eqz v6, :cond_6

    .line 48
    invoke-virtual {v6, v5}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 49
    invoke-virtual {v6}, Lf8/q$c;->r()Lf8/q;

    move-result-object v5

    iput-object v5, p0, Lf8/q;->n:Lf8/q;

    .line 50
    :cond_6
    iget v5, p0, Lf8/q;->j:I

    or-int/2addr v5, v7

    iput v5, p0, Lf8/q;->j:I

    goto/16 :goto_0

    .line 51
    :sswitch_b
    iget v5, p0, Lf8/q;->j:I

    or-int/lit8 v5, v5, 0x2

    iput v5, p0, Lf8/q;->j:I

    .line 52
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->m:I

    goto/16 :goto_0

    .line 53
    :sswitch_c
    iget v5, p0, Lf8/q;->j:I

    or-int/2addr v5, v1

    iput v5, p0, Lf8/q;->j:I

    .line 54
    invoke-virtual {p1}, Lm8/e;->j()Z

    move-result v5

    iput-boolean v5, p0, Lf8/q;->l:Z

    goto/16 :goto_0

    :sswitch_d
    if-eq v4, v1, :cond_7

    .line 55
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lf8/q;->k:Ljava/util/List;

    move v4, v1

    .line 56
    :cond_7
    iget-object v5, p0, Lf8/q;->k:Ljava/util/List;

    sget-object v6, Lf8/q$b;->p:Lm8/r;

    invoke-virtual {p1, v6, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 57
    :sswitch_e
    iget v5, p0, Lf8/q;->j:I

    or-int/lit16 v5, v5, 0x1000

    iput v5, p0, Lf8/q;->j:I

    .line 58
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v5

    iput v5, p0, Lf8/q;->x:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 59
    :goto_1
    :try_start_1
    new-instance p2, Lm8/k;

    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 61
    :goto_2
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    if-ne v4, v1, :cond_8

    .line 62
    iget-object p2, p0, Lf8/q;->k:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/q;->k:Ljava/util/List;

    .line 63
    :cond_8
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/q;->i:Lm8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/q;->i:Lm8/d;

    .line 65
    throw p1

    .line 66
    :goto_4
    invoke-virtual {p0}, Lm8/i$d;->l()V

    .line 67
    throw p1

    :cond_9
    if-ne v4, v1, :cond_a

    .line 68
    iget-object p1, p0, Lf8/q;->k:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/q;->k:Ljava/util/List;

    .line 69
    :cond_a
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 70
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/q;->i:Lm8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/q;->i:Lm8/d;

    .line 71
    throw p1

    .line 72
    :goto_5
    invoke-virtual {p0}, Lm8/i$d;->l()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_e
        0x12 -> :sswitch_d
        0x18 -> :sswitch_c
        0x20 -> :sswitch_b
        0x2a -> :sswitch_a
        0x30 -> :sswitch_9
        0x38 -> :sswitch_8
        0x40 -> :sswitch_7
        0x48 -> :sswitch_6
        0x52 -> :sswitch_5
        0x58 -> :sswitch_4
        0x60 -> :sswitch_3
        0x6a -> :sswitch_2
        0x70 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/q;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i$d;-><init>(Lm8/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/q;->y:B

    .line 5
    iput v0, p0, Lf8/q;->z:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/q;->i:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$c;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/q;-><init>(Lm8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/q;->y:B

    .line 9
    iput p1, p0, Lf8/q;->z:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/q;->i:Lm8/d;

    return-void
.end method

.method static synthetic A(Lf8/q;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/q;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic B(Lf8/q;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lf8/q;->l:Z

    .line 2
    .line 3
    return p1
.end method

.method static synthetic C(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->m:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic D(Lf8/q;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/q;->n:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic E(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->o:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic F(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->p:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic G(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->q:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic H(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->r:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic I(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->s:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic J(Lf8/q;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/q;->t:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic K(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->u:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic L(Lf8/q;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/q;->v:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic M(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->w:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic N(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->x:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic O(Lf8/q;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/q;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic P(Lf8/q;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/q;->i:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static W()Lf8/q;
    .locals 1

    .line 1
    sget-object v0, Lf8/q;->A:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method private w0()V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    iput-object v0, p0, Lf8/q;->k:Ljava/util/List;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lf8/q;->l:Z

    .line 7
    .line 8
    iput v0, p0, Lf8/q;->m:I

    .line 9
    .line 10
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lf8/q;->n:Lf8/q;

    .line 15
    .line 16
    iput v0, p0, Lf8/q;->o:I

    .line 17
    .line 18
    iput v0, p0, Lf8/q;->p:I

    .line 19
    .line 20
    iput v0, p0, Lf8/q;->q:I

    .line 21
    .line 22
    iput v0, p0, Lf8/q;->r:I

    .line 23
    .line 24
    iput v0, p0, Lf8/q;->s:I

    .line 25
    .line 26
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, Lf8/q;->t:Lf8/q;

    .line 31
    .line 32
    iput v0, p0, Lf8/q;->u:I

    .line 33
    .line 34
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lf8/q;->v:Lf8/q;

    .line 39
    .line 40
    iput v0, p0, Lf8/q;->w:I

    .line 41
    .line 42
    iput v0, p0, Lf8/q;->x:I

    .line 43
    .line 44
    return-void
.end method

.method public static x0()Lf8/q$c;
    .locals 1

    .line 1
    invoke-static {}, Lf8/q$c;->p()Lf8/q$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static y0(Lf8/q;)Lf8/q$c;
    .locals 1

    .line 1
    invoke-static {}, Lf8/q;->x0()Lf8/q$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic z(Lf8/q;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/q;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A0()Lf8/q$c;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/q;->y0(Lf8/q;)Lf8/q$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public Q()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/q;->v:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public R()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public S(I)Lf8/q$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/q;->k:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf8/q$b;

    .line 8
    .line 9
    return-object p1
.end method

.method public T()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/q;->k:Ljava/util/List;

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

.method public U()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/q;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public V()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public X()Lf8/q;
    .locals 1

    .line 1
    sget-object v0, Lf8/q;->A:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public Z()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic a()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/q;->X()Lf8/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public a0()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/q;->n:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 5

    .line 1
    iget v0, p0, Lf8/q;->z:I

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
    iget v0, p0, Lf8/q;->j:I

    .line 8
    .line 9
    const/16 v1, 0x1000

    .line 10
    .line 11
    and-int/2addr v0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lf8/q;->x:I

    .line 17
    .line 18
    invoke-static {v3, v0}, Lm8/f;->o(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v2

    .line 24
    :goto_0
    iget-object v1, p0, Lf8/q;->k:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v4, 0x2

    .line 31
    if-ge v2, v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lf8/q;->k:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lm8/p;

    .line 40
    .line 41
    invoke-static {v4, v1}, Lm8/f;->r(ILm8/p;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/2addr v0, v1

    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget v1, p0, Lf8/q;->j:I

    .line 50
    .line 51
    and-int/2addr v1, v3

    .line 52
    if-ne v1, v3, :cond_3

    .line 53
    .line 54
    const/4 v1, 0x3

    .line 55
    iget-boolean v2, p0, Lf8/q;->l:Z

    .line 56
    .line 57
    invoke-static {v1, v2}, Lm8/f;->a(IZ)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    :cond_3
    iget v1, p0, Lf8/q;->j:I

    .line 63
    .line 64
    and-int/2addr v1, v4

    .line 65
    const/4 v2, 0x4

    .line 66
    if-ne v1, v4, :cond_4

    .line 67
    .line 68
    iget v1, p0, Lf8/q;->m:I

    .line 69
    .line 70
    invoke-static {v2, v1}, Lm8/f;->o(II)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/2addr v0, v1

    .line 75
    :cond_4
    iget v1, p0, Lf8/q;->j:I

    .line 76
    .line 77
    and-int/2addr v1, v2

    .line 78
    if-ne v1, v2, :cond_5

    .line 79
    .line 80
    const/4 v1, 0x5

    .line 81
    iget-object v2, p0, Lf8/q;->n:Lf8/q;

    .line 82
    .line 83
    invoke-static {v1, v2}, Lm8/f;->r(ILm8/p;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v0, v1

    .line 88
    :cond_5
    iget v1, p0, Lf8/q;->j:I

    .line 89
    .line 90
    const/16 v2, 0x10

    .line 91
    .line 92
    and-int/2addr v1, v2

    .line 93
    if-ne v1, v2, :cond_6

    .line 94
    .line 95
    const/4 v1, 0x6

    .line 96
    iget v2, p0, Lf8/q;->p:I

    .line 97
    .line 98
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    add-int/2addr v0, v1

    .line 103
    :cond_6
    iget v1, p0, Lf8/q;->j:I

    .line 104
    .line 105
    const/16 v2, 0x20

    .line 106
    .line 107
    and-int/2addr v1, v2

    .line 108
    if-ne v1, v2, :cond_7

    .line 109
    .line 110
    const/4 v1, 0x7

    .line 111
    iget v2, p0, Lf8/q;->q:I

    .line 112
    .line 113
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    add-int/2addr v0, v1

    .line 118
    :cond_7
    iget v1, p0, Lf8/q;->j:I

    .line 119
    .line 120
    const/16 v2, 0x8

    .line 121
    .line 122
    and-int/2addr v1, v2

    .line 123
    if-ne v1, v2, :cond_8

    .line 124
    .line 125
    iget v1, p0, Lf8/q;->o:I

    .line 126
    .line 127
    invoke-static {v2, v1}, Lm8/f;->o(II)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    add-int/2addr v0, v1

    .line 132
    :cond_8
    iget v1, p0, Lf8/q;->j:I

    .line 133
    .line 134
    const/16 v2, 0x40

    .line 135
    .line 136
    and-int/2addr v1, v2

    .line 137
    if-ne v1, v2, :cond_9

    .line 138
    .line 139
    const/16 v1, 0x9

    .line 140
    .line 141
    iget v2, p0, Lf8/q;->r:I

    .line 142
    .line 143
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    add-int/2addr v0, v1

    .line 148
    :cond_9
    iget v1, p0, Lf8/q;->j:I

    .line 149
    .line 150
    const/16 v2, 0x100

    .line 151
    .line 152
    and-int/2addr v1, v2

    .line 153
    if-ne v1, v2, :cond_a

    .line 154
    .line 155
    const/16 v1, 0xa

    .line 156
    .line 157
    iget-object v2, p0, Lf8/q;->t:Lf8/q;

    .line 158
    .line 159
    invoke-static {v1, v2}, Lm8/f;->r(ILm8/p;)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    add-int/2addr v0, v1

    .line 164
    :cond_a
    iget v1, p0, Lf8/q;->j:I

    .line 165
    .line 166
    const/16 v2, 0x200

    .line 167
    .line 168
    and-int/2addr v1, v2

    .line 169
    if-ne v1, v2, :cond_b

    .line 170
    .line 171
    const/16 v1, 0xb

    .line 172
    .line 173
    iget v2, p0, Lf8/q;->u:I

    .line 174
    .line 175
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    add-int/2addr v0, v1

    .line 180
    :cond_b
    iget v1, p0, Lf8/q;->j:I

    .line 181
    .line 182
    const/16 v2, 0x80

    .line 183
    .line 184
    and-int/2addr v1, v2

    .line 185
    if-ne v1, v2, :cond_c

    .line 186
    .line 187
    const/16 v1, 0xc

    .line 188
    .line 189
    iget v2, p0, Lf8/q;->s:I

    .line 190
    .line 191
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    add-int/2addr v0, v1

    .line 196
    :cond_c
    iget v1, p0, Lf8/q;->j:I

    .line 197
    .line 198
    const/16 v2, 0x400

    .line 199
    .line 200
    and-int/2addr v1, v2

    .line 201
    if-ne v1, v2, :cond_d

    .line 202
    .line 203
    const/16 v1, 0xd

    .line 204
    .line 205
    iget-object v2, p0, Lf8/q;->v:Lf8/q;

    .line 206
    .line 207
    invoke-static {v1, v2}, Lm8/f;->r(ILm8/p;)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    add-int/2addr v0, v1

    .line 212
    :cond_d
    iget v1, p0, Lf8/q;->j:I

    .line 213
    .line 214
    const/16 v2, 0x800

    .line 215
    .line 216
    and-int/2addr v1, v2

    .line 217
    if-ne v1, v2, :cond_e

    .line 218
    .line 219
    const/16 v1, 0xe

    .line 220
    .line 221
    iget v2, p0, Lf8/q;->w:I

    .line 222
    .line 223
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    add-int/2addr v0, v1

    .line 228
    :cond_e
    invoke-virtual {p0}, Lm8/i$d;->s()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    add-int/2addr v0, v1

    .line 233
    iget-object v1, p0, Lf8/q;->i:Lm8/d;

    .line 234
    .line 235
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    add-int/2addr v0, v1

    .line 240
    iput v0, p0, Lf8/q;->z:I

    .line 241
    .line 242
    return v0
.end method

.method public b0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/q;->z0()Lf8/q$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf8/q;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public d0()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/q;->t:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lf8/q;->y:B

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
    move v0, v2

    .line 12
    :goto_0
    invoke-virtual {p0}, Lf8/q;->T()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lf8/q;->S(I)Lf8/q$b;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lf8/q$b;->e()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-byte v2, p0, Lf8/q;->y:B

    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    invoke-virtual {p0}, Lf8/q;->o0()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0}, Lf8/q;->a0()Lf8/q;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lf8/q;->e()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    iput-byte v2, p0, Lf8/q;->y:B

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    invoke-virtual {p0}, Lf8/q;->r0()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0}, Lf8/q;->d0()Lf8/q;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lf8/q;->e()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    iput-byte v2, p0, Lf8/q;->y:B

    .line 70
    .line 71
    return v2

    .line 72
    :cond_5
    invoke-virtual {p0}, Lf8/q;->i0()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    invoke-virtual {p0}, Lf8/q;->Q()Lf8/q;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lf8/q;->e()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    iput-byte v2, p0, Lf8/q;->y:B

    .line 89
    .line 90
    return v2

    .line 91
    :cond_6
    invoke-virtual {p0}, Lm8/i$d;->r()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_7

    .line 96
    .line 97
    iput-byte v2, p0, Lf8/q;->y:B

    .line 98
    .line 99
    return v2

    .line 100
    :cond_7
    iput-byte v1, p0, Lf8/q;->y:B

    .line 101
    .line 102
    return v1
.end method

.method public e0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/q;->A0()Lf8/q$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public g(Lm8/f;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lf8/q;->b()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm8/i$d;->x()Lm8/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lf8/q;->j:I

    .line 9
    .line 10
    const/16 v2, 0x1000

    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget v1, p0, Lf8/q;->x:I

    .line 17
    .line 18
    invoke-virtual {p1, v3, v1}, Lm8/f;->Z(II)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    iget-object v2, p0, Lf8/q;->k:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v4, 0x2

    .line 29
    if-ge v1, v2, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Lf8/q;->k:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lm8/p;

    .line 38
    .line 39
    invoke-virtual {p1, v4, v2}, Lm8/f;->c0(ILm8/p;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget v1, p0, Lf8/q;->j:I

    .line 46
    .line 47
    and-int/2addr v1, v3

    .line 48
    if-ne v1, v3, :cond_2

    .line 49
    .line 50
    const/4 v1, 0x3

    .line 51
    iget-boolean v2, p0, Lf8/q;->l:Z

    .line 52
    .line 53
    invoke-virtual {p1, v1, v2}, Lm8/f;->K(IZ)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget v1, p0, Lf8/q;->j:I

    .line 57
    .line 58
    and-int/2addr v1, v4

    .line 59
    const/4 v2, 0x4

    .line 60
    if-ne v1, v4, :cond_3

    .line 61
    .line 62
    iget v1, p0, Lf8/q;->m:I

    .line 63
    .line 64
    invoke-virtual {p1, v2, v1}, Lm8/f;->Z(II)V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget v1, p0, Lf8/q;->j:I

    .line 68
    .line 69
    and-int/2addr v1, v2

    .line 70
    if-ne v1, v2, :cond_4

    .line 71
    .line 72
    const/4 v1, 0x5

    .line 73
    iget-object v2, p0, Lf8/q;->n:Lf8/q;

    .line 74
    .line 75
    invoke-virtual {p1, v1, v2}, Lm8/f;->c0(ILm8/p;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    iget v1, p0, Lf8/q;->j:I

    .line 79
    .line 80
    const/16 v2, 0x10

    .line 81
    .line 82
    and-int/2addr v1, v2

    .line 83
    if-ne v1, v2, :cond_5

    .line 84
    .line 85
    const/4 v1, 0x6

    .line 86
    iget v2, p0, Lf8/q;->p:I

    .line 87
    .line 88
    invoke-virtual {p1, v1, v2}, Lm8/f;->Z(II)V

    .line 89
    .line 90
    .line 91
    :cond_5
    iget v1, p0, Lf8/q;->j:I

    .line 92
    .line 93
    const/16 v2, 0x20

    .line 94
    .line 95
    and-int/2addr v1, v2

    .line 96
    if-ne v1, v2, :cond_6

    .line 97
    .line 98
    const/4 v1, 0x7

    .line 99
    iget v2, p0, Lf8/q;->q:I

    .line 100
    .line 101
    invoke-virtual {p1, v1, v2}, Lm8/f;->Z(II)V

    .line 102
    .line 103
    .line 104
    :cond_6
    iget v1, p0, Lf8/q;->j:I

    .line 105
    .line 106
    const/16 v2, 0x8

    .line 107
    .line 108
    and-int/2addr v1, v2

    .line 109
    if-ne v1, v2, :cond_7

    .line 110
    .line 111
    iget v1, p0, Lf8/q;->o:I

    .line 112
    .line 113
    invoke-virtual {p1, v2, v1}, Lm8/f;->Z(II)V

    .line 114
    .line 115
    .line 116
    :cond_7
    iget v1, p0, Lf8/q;->j:I

    .line 117
    .line 118
    const/16 v2, 0x40

    .line 119
    .line 120
    and-int/2addr v1, v2

    .line 121
    if-ne v1, v2, :cond_8

    .line 122
    .line 123
    const/16 v1, 0x9

    .line 124
    .line 125
    iget v2, p0, Lf8/q;->r:I

    .line 126
    .line 127
    invoke-virtual {p1, v1, v2}, Lm8/f;->Z(II)V

    .line 128
    .line 129
    .line 130
    :cond_8
    iget v1, p0, Lf8/q;->j:I

    .line 131
    .line 132
    const/16 v2, 0x100

    .line 133
    .line 134
    and-int/2addr v1, v2

    .line 135
    if-ne v1, v2, :cond_9

    .line 136
    .line 137
    const/16 v1, 0xa

    .line 138
    .line 139
    iget-object v2, p0, Lf8/q;->t:Lf8/q;

    .line 140
    .line 141
    invoke-virtual {p1, v1, v2}, Lm8/f;->c0(ILm8/p;)V

    .line 142
    .line 143
    .line 144
    :cond_9
    iget v1, p0, Lf8/q;->j:I

    .line 145
    .line 146
    const/16 v2, 0x200

    .line 147
    .line 148
    and-int/2addr v1, v2

    .line 149
    if-ne v1, v2, :cond_a

    .line 150
    .line 151
    const/16 v1, 0xb

    .line 152
    .line 153
    iget v2, p0, Lf8/q;->u:I

    .line 154
    .line 155
    invoke-virtual {p1, v1, v2}, Lm8/f;->Z(II)V

    .line 156
    .line 157
    .line 158
    :cond_a
    iget v1, p0, Lf8/q;->j:I

    .line 159
    .line 160
    const/16 v2, 0x80

    .line 161
    .line 162
    and-int/2addr v1, v2

    .line 163
    if-ne v1, v2, :cond_b

    .line 164
    .line 165
    const/16 v1, 0xc

    .line 166
    .line 167
    iget v2, p0, Lf8/q;->s:I

    .line 168
    .line 169
    invoke-virtual {p1, v1, v2}, Lm8/f;->Z(II)V

    .line 170
    .line 171
    .line 172
    :cond_b
    iget v1, p0, Lf8/q;->j:I

    .line 173
    .line 174
    const/16 v2, 0x400

    .line 175
    .line 176
    and-int/2addr v1, v2

    .line 177
    if-ne v1, v2, :cond_c

    .line 178
    .line 179
    const/16 v1, 0xd

    .line 180
    .line 181
    iget-object v2, p0, Lf8/q;->v:Lf8/q;

    .line 182
    .line 183
    invoke-virtual {p1, v1, v2}, Lm8/f;->c0(ILm8/p;)V

    .line 184
    .line 185
    .line 186
    :cond_c
    iget v1, p0, Lf8/q;->j:I

    .line 187
    .line 188
    const/16 v2, 0x800

    .line 189
    .line 190
    and-int/2addr v1, v2

    .line 191
    if-ne v1, v2, :cond_d

    .line 192
    .line 193
    const/16 v1, 0xe

    .line 194
    .line 195
    iget v2, p0, Lf8/q;->w:I

    .line 196
    .line 197
    invoke-virtual {p1, v1, v2}, Lm8/f;->Z(II)V

    .line 198
    .line 199
    .line 200
    :cond_d
    const/16 v1, 0xc8

    .line 201
    .line 202
    invoke-virtual {v0, v1, p1}, Lm8/i$d$a;->a(ILm8/f;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, Lf8/q;->i:Lm8/d;

    .line 206
    .line 207
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 208
    .line 209
    .line 210
    return-void
.end method

.method public g0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public h0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/q;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public i0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

    .line 2
    .line 3
    const/16 v1, 0x400

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

.method public j0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

    .line 2
    .line 3
    const/16 v1, 0x800

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

.method public k0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

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

.method public m0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

    .line 2
    .line 3
    const/16 v1, 0x1000

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

.method public n0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

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

.method public o0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

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

.method public p0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

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

.method public q0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

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

.method public r0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

    .line 2
    .line 3
    const/16 v1, 0x100

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

.method public s0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

    .line 2
    .line 3
    const/16 v1, 0x200

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

.method public t0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

    .line 2
    .line 3
    const/16 v1, 0x80

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

.method public u0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

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

.method public v0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/q;->j:I

    .line 2
    .line 3
    const/16 v1, 0x40

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

.method public z0()Lf8/q$c;
    .locals 1

    .line 1
    invoke-static {}, Lf8/q;->x0()Lf8/q$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
