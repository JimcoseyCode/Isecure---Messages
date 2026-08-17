.class public final Lf8/b$b$c;
.super Lm8/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/b$b$c$b;,
        Lf8/b$b$c$c;
    }
.end annotation


# static fields
.field private static final w:Lf8/b$b$c;

.field public static x:Lm8/r;


# instance fields
.field private final h:Lm8/d;

.field private i:I

.field private j:Lf8/b$b$c$c;

.field private k:J

.field private l:F

.field private m:D

.field private n:I

.field private o:I

.field private p:I

.field private q:Lf8/b;

.field private r:Ljava/util/List;

.field private s:I

.field private t:I

.field private u:B

.field private v:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/b$b$c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/b$b$c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/b$b$c;->x:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/b$b$c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/b$b$c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/b$b$c;->w:Lf8/b$b$c;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/b$b$c;->c0()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 9

    .line 11
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lf8/b$b$c;->u:B

    .line 13
    iput v0, p0, Lf8/b$b$c;->v:I

    .line 14
    invoke-direct {p0}, Lf8/b$b$c;->c0()V

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
    const/16 v5, 0x100

    if-nez v3, :cond_6

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    .line 18
    invoke-virtual {p0, p1, v2, p2, v6}, Lm8/i;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

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
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/2addr v6, v5

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 20
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v6

    iput v6, p0, Lf8/b$b$c;->s:I

    goto :goto_0

    .line 21
    :sswitch_2
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/lit16 v6, v6, 0x200

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 22
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v6

    iput v6, p0, Lf8/b$b$c;->t:I

    goto :goto_0

    :sswitch_3
    and-int/lit16 v6, v4, 0x100

    if-eq v6, v5, :cond_1

    .line 23
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lf8/b$b$c;->r:Ljava/util/List;

    move v4, v5

    .line 24
    :cond_1
    iget-object v6, p0, Lf8/b$b$c;->r:Ljava/util/List;

    sget-object v7, Lf8/b$b$c;->x:Lm8/r;

    invoke-virtual {p1, v7, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 25
    :sswitch_4
    iget v6, p0, Lf8/b$b$c;->i:I

    const/16 v7, 0x80

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_2

    .line 26
    iget-object v6, p0, Lf8/b$b$c;->q:Lf8/b;

    invoke-virtual {v6}, Lf8/b;->F()Lf8/b$c;

    move-result-object v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 27
    :goto_1
    sget-object v8, Lf8/b;->o:Lm8/r;

    invoke-virtual {p1, v8, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v8

    check-cast v8, Lf8/b;

    iput-object v8, p0, Lf8/b$b$c;->q:Lf8/b;

    if-eqz v6, :cond_3

    .line 28
    invoke-virtual {v6, v8}, Lf8/b$c;->t(Lf8/b;)Lf8/b$c;

    .line 29
    invoke-virtual {v6}, Lf8/b$c;->n()Lf8/b;

    move-result-object v6

    iput-object v6, p0, Lf8/b$b$c;->q:Lf8/b;

    .line 30
    :cond_3
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/2addr v6, v7

    iput v6, p0, Lf8/b$b$c;->i:I

    goto :goto_0

    .line 31
    :sswitch_5
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/lit8 v6, v6, 0x40

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 32
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v6

    iput v6, p0, Lf8/b$b$c;->p:I

    goto/16 :goto_0

    .line 33
    :sswitch_6
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/lit8 v6, v6, 0x20

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 34
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v6

    iput v6, p0, Lf8/b$b$c;->o:I

    goto/16 :goto_0

    .line 35
    :sswitch_7
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/lit8 v6, v6, 0x10

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 36
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v6

    iput v6, p0, Lf8/b$b$c;->n:I

    goto/16 :goto_0

    .line 37
    :sswitch_8
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/lit8 v6, v6, 0x8

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 38
    invoke-virtual {p1}, Lm8/e;->l()D

    move-result-wide v6

    iput-wide v6, p0, Lf8/b$b$c;->m:D

    goto/16 :goto_0

    .line 39
    :sswitch_9
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/lit8 v6, v6, 0x4

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 40
    invoke-virtual {p1}, Lm8/e;->p()F

    move-result v6

    iput v6, p0, Lf8/b$b$c;->l:F

    goto/16 :goto_0

    .line 41
    :sswitch_a
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/lit8 v6, v6, 0x2

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 42
    invoke-virtual {p1}, Lm8/e;->G()J

    move-result-wide v6

    iput-wide v6, p0, Lf8/b$b$c;->k:J

    goto/16 :goto_0

    .line 43
    :sswitch_b
    invoke-virtual {p1}, Lm8/e;->m()I

    move-result v7

    .line 44
    invoke-static {v7}, Lf8/b$b$c$c;->h(I)Lf8/b$b$c$c;

    move-result-object v8

    if-nez v8, :cond_4

    .line 45
    invoke-virtual {v2, v6}, Lm8/f;->n0(I)V

    .line 46
    invoke-virtual {v2, v7}, Lm8/f;->n0(I)V

    goto/16 :goto_0

    .line 47
    :cond_4
    iget v6, p0, Lf8/b$b$c;->i:I

    or-int/2addr v6, v1

    iput v6, p0, Lf8/b$b$c;->i:I

    .line 48
    iput-object v8, p0, Lf8/b$b$c;->j:Lf8/b$b$c$c;
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 49
    :goto_2
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
    :goto_3
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v5, :cond_5

    .line 52
    iget-object p2, p0, Lf8/b$b$c;->r:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 53
    :cond_5
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/b$b$c;->h:Lm8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/b$b$c;->h:Lm8/d;

    .line 55
    throw p1

    .line 56
    :goto_5
    invoke-virtual {p0}, Lm8/i;->l()V

    .line 57
    throw p1

    :cond_6
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v5, :cond_7

    .line 58
    iget-object p1, p0, Lf8/b$b$c;->r:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 59
    :cond_7
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 60
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/b$b$c;->h:Lm8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/b$b$c;->h:Lm8/d;

    .line 61
    throw p1

    .line 62
    :goto_6
    invoke-virtual {p0}, Lm8/i;->l()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_b
        0x10 -> :sswitch_a
        0x1d -> :sswitch_9
        0x21 -> :sswitch_8
        0x28 -> :sswitch_7
        0x30 -> :sswitch_6
        0x38 -> :sswitch_5
        0x42 -> :sswitch_4
        0x4a -> :sswitch_3
        0x50 -> :sswitch_2
        0x58 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/b$b$c;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i;-><init>(Lm8/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/b$b$c;->u:B

    .line 5
    iput v0, p0, Lf8/b$b$c;->v:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/b$b$c;->h:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$b;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/b$b$c;-><init>(Lm8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/b$b$c;->u:B

    .line 9
    iput p1, p0, Lf8/b$b$c;->v:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/b$b$c;->h:Lm8/d;

    return-void
.end method

.method static synthetic A(Lf8/b$b$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/b$b$c;->s:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic B(Lf8/b$b$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/b$b$c;->t:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic C(Lf8/b$b$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/b$b$c;->i:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic D(Lf8/b$b$c;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/b$b$c;->h:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static K()Lf8/b$b$c;
    .locals 1

    .line 1
    sget-object v0, Lf8/b$b$c;->w:Lf8/b$b$c;

    .line 2
    .line 3
    return-object v0
.end method

.method private c0()V
    .locals 2

    .line 1
    sget-object v0, Lf8/b$b$c$c;->h:Lf8/b$b$c$c;

    .line 2
    .line 3
    iput-object v0, p0, Lf8/b$b$c;->j:Lf8/b$b$c$c;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lf8/b$b$c;->k:J

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lf8/b$b$c;->l:F

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, Lf8/b$b$c;->m:D

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lf8/b$b$c;->n:I

    .line 18
    .line 19
    iput v0, p0, Lf8/b$b$c;->o:I

    .line 20
    .line 21
    iput v0, p0, Lf8/b$b$c;->p:I

    .line 22
    .line 23
    invoke-static {}, Lf8/b;->y()Lf8/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lf8/b$b$c;->q:Lf8/b;

    .line 28
    .line 29
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 30
    .line 31
    iput-object v1, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 32
    .line 33
    iput v0, p0, Lf8/b$b$c;->s:I

    .line 34
    .line 35
    iput v0, p0, Lf8/b$b$c;->t:I

    .line 36
    .line 37
    return-void
.end method

.method public static d0()Lf8/b$b$c$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/b$b$c$b;->l()Lf8/b$b$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static e0(Lf8/b$b$c;)Lf8/b$b$c$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/b$b$c;->d0()Lf8/b$b$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/b$b$c$b;->u(Lf8/b$b$c;)Lf8/b$b$c$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic q(Lf8/b$b$c;Lf8/b$b$c$c;)Lf8/b$b$c$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/b$b$c;->j:Lf8/b$b$c$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic r(Lf8/b$b$c;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lf8/b$b$c;->k:J

    .line 2
    .line 3
    return-wide p1
.end method

.method static synthetic s(Lf8/b$b$c;F)F
    .locals 0

    .line 1
    iput p1, p0, Lf8/b$b$c;->l:F

    .line 2
    .line 3
    return p1
.end method

.method static synthetic t(Lf8/b$b$c;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lf8/b$b$c;->m:D

    .line 2
    .line 3
    return-wide p1
.end method

.method static synthetic u(Lf8/b$b$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/b$b$c;->n:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic v(Lf8/b$b$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/b$b$c;->o:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic w(Lf8/b$b$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/b$b$c;->p:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic x(Lf8/b$b$c;Lf8/b;)Lf8/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/b$b$c;->q:Lf8/b;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic y(Lf8/b$b$c;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic z(Lf8/b$b$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public E()Lf8/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/b$b$c;->q:Lf8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public F()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/b$b$c;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public G(I)Lf8/b$b$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf8/b$b$c;

    .line 8
    .line 9
    return-object p1
.end method

.method public H()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/b$b$c;->r:Ljava/util/List;

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
    iget-object v0, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public J()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/b$b$c;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public L()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lf8/b$b$c;->m:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public M()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/b$b$c;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public N()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/b$b$c;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public O()F
    .locals 1

    .line 1
    iget v0, p0, Lf8/b$b$c;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public P()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lf8/b$b$c;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public Q()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/b$b$c;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public R()Lf8/b$b$c$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/b$b$c;->j:Lf8/b$b$c$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public S()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public T()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public U()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public V()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public W()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public X()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public Y()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public Z()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public a0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public b()I
    .locals 7

    .line 1
    iget v0, p0, Lf8/b$b$c;->v:I

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
    iget v0, p0, Lf8/b$b$c;->i:I

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
    iget-object v0, p0, Lf8/b$b$c;->j:Lf8/b$b$c$c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lf8/b$b$c$c;->a()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v1, v0}, Lm8/f;->h(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v0, v2

    .line 26
    :goto_0
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    and-int/2addr v1, v3

    .line 30
    if-ne v1, v3, :cond_2

    .line 31
    .line 32
    iget-wide v4, p0, Lf8/b$b$c;->k:J

    .line 33
    .line 34
    invoke-static {v3, v4, v5}, Lm8/f;->z(IJ)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/2addr v0, v1

    .line 39
    :cond_2
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    and-int/2addr v1, v3

    .line 43
    if-ne v1, v3, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    iget v4, p0, Lf8/b$b$c;->l:F

    .line 47
    .line 48
    invoke-static {v1, v4}, Lm8/f;->l(IF)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v0, v1

    .line 53
    :cond_3
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 54
    .line 55
    const/16 v4, 0x8

    .line 56
    .line 57
    and-int/2addr v1, v4

    .line 58
    if-ne v1, v4, :cond_4

    .line 59
    .line 60
    iget-wide v5, p0, Lf8/b$b$c;->m:D

    .line 61
    .line 62
    invoke-static {v3, v5, v6}, Lm8/f;->f(ID)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    add-int/2addr v0, v1

    .line 67
    :cond_4
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 68
    .line 69
    const/16 v3, 0x10

    .line 70
    .line 71
    and-int/2addr v1, v3

    .line 72
    if-ne v1, v3, :cond_5

    .line 73
    .line 74
    const/4 v1, 0x5

    .line 75
    iget v3, p0, Lf8/b$b$c;->n:I

    .line 76
    .line 77
    invoke-static {v1, v3}, Lm8/f;->o(II)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    add-int/2addr v0, v1

    .line 82
    :cond_5
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 83
    .line 84
    const/16 v3, 0x20

    .line 85
    .line 86
    and-int/2addr v1, v3

    .line 87
    if-ne v1, v3, :cond_6

    .line 88
    .line 89
    const/4 v1, 0x6

    .line 90
    iget v3, p0, Lf8/b$b$c;->o:I

    .line 91
    .line 92
    invoke-static {v1, v3}, Lm8/f;->o(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v0, v1

    .line 97
    :cond_6
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 98
    .line 99
    const/16 v3, 0x40

    .line 100
    .line 101
    and-int/2addr v1, v3

    .line 102
    if-ne v1, v3, :cond_7

    .line 103
    .line 104
    const/4 v1, 0x7

    .line 105
    iget v3, p0, Lf8/b$b$c;->p:I

    .line 106
    .line 107
    invoke-static {v1, v3}, Lm8/f;->o(II)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v0, v1

    .line 112
    :cond_7
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 113
    .line 114
    const/16 v3, 0x80

    .line 115
    .line 116
    and-int/2addr v1, v3

    .line 117
    if-ne v1, v3, :cond_8

    .line 118
    .line 119
    iget-object v1, p0, Lf8/b$b$c;->q:Lf8/b;

    .line 120
    .line 121
    invoke-static {v4, v1}, Lm8/f;->r(ILm8/p;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    add-int/2addr v0, v1

    .line 126
    :cond_8
    :goto_1
    iget-object v1, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-ge v2, v1, :cond_9

    .line 133
    .line 134
    iget-object v1, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Lm8/p;

    .line 141
    .line 142
    const/16 v3, 0x9

    .line 143
    .line 144
    invoke-static {v3, v1}, Lm8/f;->r(ILm8/p;)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    add-int/2addr v0, v1

    .line 149
    add-int/lit8 v2, v2, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_9
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 153
    .line 154
    const/16 v2, 0x200

    .line 155
    .line 156
    and-int/2addr v1, v2

    .line 157
    if-ne v1, v2, :cond_a

    .line 158
    .line 159
    const/16 v1, 0xa

    .line 160
    .line 161
    iget v2, p0, Lf8/b$b$c;->t:I

    .line 162
    .line 163
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    add-int/2addr v0, v1

    .line 168
    :cond_a
    iget v1, p0, Lf8/b$b$c;->i:I

    .line 169
    .line 170
    const/16 v2, 0x100

    .line 171
    .line 172
    and-int/2addr v1, v2

    .line 173
    if-ne v1, v2, :cond_b

    .line 174
    .line 175
    const/16 v1, 0xb

    .line 176
    .line 177
    iget v2, p0, Lf8/b$b$c;->s:I

    .line 178
    .line 179
    invoke-static {v1, v2}, Lm8/f;->o(II)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    add-int/2addr v0, v1

    .line 184
    :cond_b
    iget-object v1, p0, Lf8/b$b$c;->h:Lm8/d;

    .line 185
    .line 186
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    add-int/2addr v0, v1

    .line 191
    iput v0, p0, Lf8/b$b$c;->v:I

    .line 192
    .line 193
    return v0
.end method

.method public b0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/b$b$c;->i:I

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

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/b$b$c;->f0()Lf8/b$b$c$b;

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
    iget-byte v0, p0, Lf8/b$b$c;->u:B

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
    invoke-virtual {p0}, Lf8/b$b$c;->S()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lf8/b$b$c;->E()Lf8/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lf8/b;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iput-byte v2, p0, Lf8/b$b$c;->u:B

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    move v0, v2

    .line 31
    :goto_0
    invoke-virtual {p0}, Lf8/b$b$c;->H()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v0, v3, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lf8/b$b$c;->G(I)Lf8/b$b$c;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lf8/b$b$c;->e()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    iput-byte v2, p0, Lf8/b$b$c;->u:B

    .line 48
    .line 49
    return v2

    .line 50
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    iput-byte v1, p0, Lf8/b$b$c;->u:B

    .line 54
    .line 55
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/b$b$c;->g0()Lf8/b$b$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f0()Lf8/b$b$c$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/b$b$c;->d0()Lf8/b$b$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(Lm8/f;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lf8/b$b$c;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lf8/b$b$c;->j:Lf8/b$b$c$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lf8/b$b$c$c;->a()I

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
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    and-int/2addr v0, v1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-wide v2, p0, Lf8/b$b$c;->k:J

    .line 26
    .line 27
    invoke-virtual {p1, v1, v2, v3}, Lm8/f;->s0(IJ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v0, p0, Lf8/b$b$c;->i:I

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
    iget v2, p0, Lf8/b$b$c;->l:F

    .line 38
    .line 39
    invoke-virtual {p1, v0, v2}, Lm8/f;->V(IF)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 43
    .line 44
    const/16 v2, 0x8

    .line 45
    .line 46
    and-int/2addr v0, v2

    .line 47
    if-ne v0, v2, :cond_3

    .line 48
    .line 49
    iget-wide v3, p0, Lf8/b$b$c;->m:D

    .line 50
    .line 51
    invoke-virtual {p1, v1, v3, v4}, Lm8/f;->P(ID)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 55
    .line 56
    const/16 v1, 0x10

    .line 57
    .line 58
    and-int/2addr v0, v1

    .line 59
    if-ne v0, v1, :cond_4

    .line 60
    .line 61
    const/4 v0, 0x5

    .line 62
    iget v1, p0, Lf8/b$b$c;->n:I

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Lm8/f;->Z(II)V

    .line 65
    .line 66
    .line 67
    :cond_4
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 68
    .line 69
    const/16 v1, 0x20

    .line 70
    .line 71
    and-int/2addr v0, v1

    .line 72
    if-ne v0, v1, :cond_5

    .line 73
    .line 74
    const/4 v0, 0x6

    .line 75
    iget v1, p0, Lf8/b$b$c;->o:I

    .line 76
    .line 77
    invoke-virtual {p1, v0, v1}, Lm8/f;->Z(II)V

    .line 78
    .line 79
    .line 80
    :cond_5
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 81
    .line 82
    const/16 v1, 0x40

    .line 83
    .line 84
    and-int/2addr v0, v1

    .line 85
    if-ne v0, v1, :cond_6

    .line 86
    .line 87
    const/4 v0, 0x7

    .line 88
    iget v1, p0, Lf8/b$b$c;->p:I

    .line 89
    .line 90
    invoke-virtual {p1, v0, v1}, Lm8/f;->Z(II)V

    .line 91
    .line 92
    .line 93
    :cond_6
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 94
    .line 95
    const/16 v1, 0x80

    .line 96
    .line 97
    and-int/2addr v0, v1

    .line 98
    if-ne v0, v1, :cond_7

    .line 99
    .line 100
    iget-object v0, p0, Lf8/b$b$c;->q:Lf8/b;

    .line 101
    .line 102
    invoke-virtual {p1, v2, v0}, Lm8/f;->c0(ILm8/p;)V

    .line 103
    .line 104
    .line 105
    :cond_7
    const/4 v0, 0x0

    .line 106
    :goto_0
    iget-object v1, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-ge v0, v1, :cond_8

    .line 113
    .line 114
    iget-object v1, p0, Lf8/b$b$c;->r:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lm8/p;

    .line 121
    .line 122
    const/16 v2, 0x9

    .line 123
    .line 124
    invoke-virtual {p1, v2, v1}, Lm8/f;->c0(ILm8/p;)V

    .line 125
    .line 126
    .line 127
    add-int/lit8 v0, v0, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_8
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 131
    .line 132
    const/16 v1, 0x200

    .line 133
    .line 134
    and-int/2addr v0, v1

    .line 135
    if-ne v0, v1, :cond_9

    .line 136
    .line 137
    const/16 v0, 0xa

    .line 138
    .line 139
    iget v1, p0, Lf8/b$b$c;->t:I

    .line 140
    .line 141
    invoke-virtual {p1, v0, v1}, Lm8/f;->Z(II)V

    .line 142
    .line 143
    .line 144
    :cond_9
    iget v0, p0, Lf8/b$b$c;->i:I

    .line 145
    .line 146
    const/16 v1, 0x100

    .line 147
    .line 148
    and-int/2addr v0, v1

    .line 149
    if-ne v0, v1, :cond_a

    .line 150
    .line 151
    const/16 v0, 0xb

    .line 152
    .line 153
    iget v1, p0, Lf8/b$b$c;->s:I

    .line 154
    .line 155
    invoke-virtual {p1, v0, v1}, Lm8/f;->Z(II)V

    .line 156
    .line 157
    .line 158
    :cond_a
    iget-object v0, p0, Lf8/b$b$c;->h:Lm8/d;

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public g0()Lf8/b$b$c$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/b$b$c;->e0(Lf8/b$b$c;)Lf8/b$b$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
