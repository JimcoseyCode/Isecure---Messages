.class public final Lf8/i;
.super Lm8/i$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/i$b;
    }
.end annotation


# static fields
.field private static final B:Lf8/i;

.field public static C:Lm8/r;


# instance fields
.field private A:I

.field private final i:Lm8/d;

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Lf8/q;

.field private o:I

.field private p:Ljava/util/List;

.field private q:Lf8/q;

.field private r:I

.field private s:Ljava/util/List;

.field private t:Ljava/util/List;

.field private u:I

.field private v:Ljava/util/List;

.field private w:Lf8/t;

.field private x:Ljava/util/List;

.field private y:Lf8/e;

.field private z:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/i$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/i$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/i;->C:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/i;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/i;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/i;->B:Lf8/i;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/i;->A0()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 13

    .line 13
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lf8/i;->u:I

    .line 15
    iput-byte v0, p0, Lf8/i;->z:B

    .line 16
    iput v0, p0, Lf8/i;->A:I

    .line 17
    invoke-direct {p0}, Lf8/i;->A0()V

    .line 18
    invoke-static {}, Lm8/d;->y()Lm8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 19
    invoke-static {v0, v1}, Lm8/f;->I(Ljava/io/OutputStream;I)Lm8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x400

    const/16 v6, 0x20

    const/16 v7, 0x200

    const/16 v8, 0x1000

    const/16 v9, 0x100

    if-nez v3, :cond_17

    .line 20
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v10

    const/4 v11, 0x0

    sparse-switch v10, :sswitch_data_0

    .line 21
    invoke-virtual {p0, p1, v2, p2, v10}, Lm8/i$d;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
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

    .line 22
    :sswitch_1
    iget v10, p0, Lf8/i;->j:I

    and-int/2addr v10, v9

    if-ne v10, v9, :cond_1

    .line 23
    iget-object v10, p0, Lf8/i;->y:Lf8/e;

    invoke-virtual {v10}, Lf8/e;->A()Lf8/e$b;

    move-result-object v11

    .line 24
    :cond_1
    sget-object v10, Lf8/e;->m:Lm8/r;

    invoke-virtual {p1, v10, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v10

    check-cast v10, Lf8/e;

    iput-object v10, p0, Lf8/i;->y:Lf8/e;

    if-eqz v11, :cond_2

    .line 25
    invoke-virtual {v11, v10}, Lf8/e$b;->t(Lf8/e;)Lf8/e$b;

    .line 26
    invoke-virtual {v11}, Lf8/e$b;->n()Lf8/e;

    move-result-object v10

    iput-object v10, p0, Lf8/i;->y:Lf8/e;

    .line 27
    :cond_2
    iget v10, p0, Lf8/i;->j:I

    or-int/2addr v10, v9

    iput v10, p0, Lf8/i;->j:I

    goto :goto_0

    .line 28
    :sswitch_2
    invoke-virtual {p1}, Lm8/e;->z()I

    move-result v10

    .line 29
    invoke-virtual {p1, v10}, Lm8/e;->i(I)I

    move-result v10

    and-int/lit16 v11, v4, 0x1000

    if-eq v11, v8, :cond_3

    .line 30
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v11

    if-lez v11, :cond_3

    .line 31
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, p0, Lf8/i;->x:Ljava/util/List;

    or-int/lit16 v4, v4, 0x1000

    .line 32
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v11

    if-lez v11, :cond_4

    .line 33
    iget-object v11, p0, Lf8/i;->x:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 34
    :cond_4
    invoke-virtual {p1, v10}, Lm8/e;->h(I)V

    goto :goto_0

    :sswitch_3
    and-int/lit16 v10, v4, 0x1000

    if-eq v10, v8, :cond_5

    .line 35
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lf8/i;->x:Ljava/util/List;

    or-int/lit16 v4, v4, 0x1000

    .line 36
    :cond_5
    iget-object v10, p0, Lf8/i;->x:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 37
    :sswitch_4
    iget v10, p0, Lf8/i;->j:I

    const/16 v12, 0x80

    and-int/2addr v10, v12

    if-ne v10, v12, :cond_6

    .line 38
    iget-object v10, p0, Lf8/i;->w:Lf8/t;

    invoke-virtual {v10}, Lf8/t;->F()Lf8/t$b;

    move-result-object v11

    .line 39
    :cond_6
    sget-object v10, Lf8/t;->o:Lm8/r;

    invoke-virtual {p1, v10, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v10

    check-cast v10, Lf8/t;

    iput-object v10, p0, Lf8/i;->w:Lf8/t;

    if-eqz v11, :cond_7

    .line 40
    invoke-virtual {v11, v10}, Lf8/t$b;->t(Lf8/t;)Lf8/t$b;

    .line 41
    invoke-virtual {v11}, Lf8/t$b;->n()Lf8/t;

    move-result-object v10

    iput-object v10, p0, Lf8/i;->w:Lf8/t;

    .line 42
    :cond_7
    iget v10, p0, Lf8/i;->j:I

    or-int/2addr v10, v12

    iput v10, p0, Lf8/i;->j:I

    goto/16 :goto_0

    .line 43
    :sswitch_5
    invoke-virtual {p1}, Lm8/e;->z()I

    move-result v10

    .line 44
    invoke-virtual {p1, v10}, Lm8/e;->i(I)I

    move-result v10

    and-int/lit16 v11, v4, 0x200

    if-eq v11, v7, :cond_8

    .line 45
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v11

    if-lez v11, :cond_8

    .line 46
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, p0, Lf8/i;->t:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    .line 47
    :cond_8
    :goto_2
    invoke-virtual {p1}, Lm8/e;->e()I

    move-result v11

    if-lez v11, :cond_9

    .line 48
    iget-object v11, p0, Lf8/i;->t:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 49
    :cond_9
    invoke-virtual {p1, v10}, Lm8/e;->h(I)V

    goto/16 :goto_0

    :sswitch_6
    and-int/lit16 v10, v4, 0x200

    if-eq v10, v7, :cond_a

    .line 50
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lf8/i;->t:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    .line 51
    :cond_a
    iget-object v10, p0, Lf8/i;->t:Ljava/util/List;

    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :sswitch_7
    and-int/lit16 v10, v4, 0x100

    if-eq v10, v9, :cond_b

    .line 52
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lf8/i;->s:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 53
    :cond_b
    iget-object v10, p0, Lf8/i;->s:Ljava/util/List;

    sget-object v11, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v11, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 54
    :sswitch_8
    iget v10, p0, Lf8/i;->j:I

    or-int/2addr v10, v1

    iput v10, p0, Lf8/i;->j:I

    .line 55
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v10

    iput v10, p0, Lf8/i;->k:I

    goto/16 :goto_0

    .line 56
    :sswitch_9
    iget v10, p0, Lf8/i;->j:I

    or-int/lit8 v10, v10, 0x40

    iput v10, p0, Lf8/i;->j:I

    .line 57
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v10

    iput v10, p0, Lf8/i;->r:I

    goto/16 :goto_0

    .line 58
    :sswitch_a
    iget v10, p0, Lf8/i;->j:I

    or-int/lit8 v10, v10, 0x10

    iput v10, p0, Lf8/i;->j:I

    .line 59
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v10

    iput v10, p0, Lf8/i;->o:I

    goto/16 :goto_0

    :sswitch_b
    and-int/lit16 v10, v4, 0x400

    if-eq v10, v5, :cond_c

    .line 60
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lf8/i;->v:Ljava/util/List;

    or-int/lit16 v4, v4, 0x400

    .line 61
    :cond_c
    iget-object v10, p0, Lf8/i;->v:Ljava/util/List;

    sget-object v11, Lf8/u;->t:Lm8/r;

    invoke-virtual {p1, v11, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 62
    :sswitch_c
    iget v10, p0, Lf8/i;->j:I

    and-int/2addr v10, v6

    if-ne v10, v6, :cond_d

    .line 63
    iget-object v10, p0, Lf8/i;->q:Lf8/q;

    invoke-virtual {v10}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v11

    .line 64
    :cond_d
    sget-object v10, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v10, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v10

    check-cast v10, Lf8/q;

    iput-object v10, p0, Lf8/i;->q:Lf8/q;

    if-eqz v11, :cond_e

    .line 65
    invoke-virtual {v11, v10}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 66
    invoke-virtual {v11}, Lf8/q$c;->r()Lf8/q;

    move-result-object v10

    iput-object v10, p0, Lf8/i;->q:Lf8/q;

    .line 67
    :cond_e
    iget v10, p0, Lf8/i;->j:I

    or-int/2addr v10, v6

    iput v10, p0, Lf8/i;->j:I

    goto/16 :goto_0

    :sswitch_d
    and-int/lit8 v10, v4, 0x20

    if-eq v10, v6, :cond_f

    .line 68
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lf8/i;->p:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 69
    :cond_f
    iget-object v10, p0, Lf8/i;->p:Ljava/util/List;

    sget-object v11, Lf8/s;->u:Lm8/r;

    invoke-virtual {p1, v11, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 70
    :sswitch_e
    iget v10, p0, Lf8/i;->j:I

    const/16 v12, 0x8

    and-int/2addr v10, v12

    if-ne v10, v12, :cond_10

    .line 71
    iget-object v10, p0, Lf8/i;->n:Lf8/q;

    invoke-virtual {v10}, Lf8/q;->A0()Lf8/q$c;

    move-result-object v11

    .line 72
    :cond_10
    sget-object v10, Lf8/q;->B:Lm8/r;

    invoke-virtual {p1, v10, p2}, Lm8/e;->t(Lm8/r;Lm8/g;)Lm8/p;

    move-result-object v10

    check-cast v10, Lf8/q;

    iput-object v10, p0, Lf8/i;->n:Lf8/q;

    if-eqz v11, :cond_11

    .line 73
    invoke-virtual {v11, v10}, Lf8/q$c;->z(Lf8/q;)Lf8/q$c;

    .line 74
    invoke-virtual {v11}, Lf8/q$c;->r()Lf8/q;

    move-result-object v10

    iput-object v10, p0, Lf8/i;->n:Lf8/q;

    .line 75
    :cond_11
    iget v10, p0, Lf8/i;->j:I

    or-int/2addr v10, v12

    iput v10, p0, Lf8/i;->j:I

    goto/16 :goto_0

    .line 76
    :sswitch_f
    iget v10, p0, Lf8/i;->j:I

    or-int/lit8 v10, v10, 0x4

    iput v10, p0, Lf8/i;->j:I

    .line 77
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v10

    iput v10, p0, Lf8/i;->m:I

    goto/16 :goto_0

    .line 78
    :sswitch_10
    iget v10, p0, Lf8/i;->j:I

    or-int/lit8 v10, v10, 0x2

    iput v10, p0, Lf8/i;->j:I

    .line 79
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v10

    iput v10, p0, Lf8/i;->l:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 80
    :goto_3
    :try_start_1
    new-instance p2, Lm8/k;

    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 82
    :goto_4
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v6, :cond_12

    .line 83
    iget-object p2, p0, Lf8/i;->p:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/i;->p:Ljava/util/List;

    :cond_12
    and-int/lit16 p2, v4, 0x400

    if-ne p2, v5, :cond_13

    .line 84
    iget-object p2, p0, Lf8/i;->v:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/i;->v:Ljava/util/List;

    :cond_13
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v9, :cond_14

    .line 85
    iget-object p2, p0, Lf8/i;->s:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/i;->s:Ljava/util/List;

    :cond_14
    and-int/lit16 p2, v4, 0x200

    if-ne p2, v7, :cond_15

    .line 86
    iget-object p2, p0, Lf8/i;->t:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/i;->t:Ljava/util/List;

    :cond_15
    and-int/lit16 p2, v4, 0x1000

    if-ne p2, v8, :cond_16

    .line 87
    iget-object p2, p0, Lf8/i;->x:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lf8/i;->x:Ljava/util/List;

    .line 88
    :cond_16
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/i;->i:Lm8/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/i;->i:Lm8/d;

    .line 90
    throw p1

    .line 91
    :goto_6
    invoke-virtual {p0}, Lm8/i$d;->l()V

    .line 92
    throw p1

    :cond_17
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v6, :cond_18

    .line 93
    iget-object p1, p0, Lf8/i;->p:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/i;->p:Ljava/util/List;

    :cond_18
    and-int/lit16 p1, v4, 0x400

    if-ne p1, v5, :cond_19

    .line 94
    iget-object p1, p0, Lf8/i;->v:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/i;->v:Ljava/util/List;

    :cond_19
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v9, :cond_1a

    .line 95
    iget-object p1, p0, Lf8/i;->s:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/i;->s:Ljava/util/List;

    :cond_1a
    and-int/lit16 p1, v4, 0x200

    if-ne p1, v7, :cond_1b

    .line 96
    iget-object p1, p0, Lf8/i;->t:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/i;->t:Ljava/util/List;

    :cond_1b
    and-int/lit16 p1, v4, 0x1000

    if-ne p1, v8, :cond_1c

    .line 97
    iget-object p1, p0, Lf8/i;->x:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf8/i;->x:Ljava/util/List;

    .line 98
    :cond_1c
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 99
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/i;->i:Lm8/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/i;->i:Lm8/d;

    .line 100
    throw p1

    .line 101
    :goto_7
    invoke-virtual {p0}, Lm8/i$d;->l()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_10
        0x10 -> :sswitch_f
        0x1a -> :sswitch_e
        0x22 -> :sswitch_d
        0x2a -> :sswitch_c
        0x32 -> :sswitch_b
        0x38 -> :sswitch_a
        0x40 -> :sswitch_9
        0x48 -> :sswitch_8
        0x52 -> :sswitch_7
        0x58 -> :sswitch_6
        0x5a -> :sswitch_5
        0xf2 -> :sswitch_4
        0xf8 -> :sswitch_3
        0xfa -> :sswitch_2
        0x102 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/i;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i$d;-><init>(Lm8/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lf8/i;->u:I

    .line 5
    iput-byte v0, p0, Lf8/i;->z:B

    .line 6
    iput v0, p0, Lf8/i;->A:I

    .line 7
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/i;->i:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$c;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/i;-><init>(Lm8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lf8/i;->u:I

    .line 10
    iput-byte p1, p0, Lf8/i;->z:B

    .line 11
    iput p1, p0, Lf8/i;->A:I

    .line 12
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/i;->i:Lm8/d;

    return-void
.end method

.method static synthetic A(Lf8/i;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/i;->l:I

    .line 2
    .line 3
    return p1
.end method

.method private A0()V
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lf8/i;->k:I

    .line 3
    .line 4
    iput v0, p0, Lf8/i;->l:I

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lf8/i;->m:I

    .line 8
    .line 9
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lf8/i;->n:Lf8/q;

    .line 14
    .line 15
    iput v0, p0, Lf8/i;->o:I

    .line 16
    .line 17
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    iput-object v1, p0, Lf8/i;->p:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {}, Lf8/q;->W()Lf8/q;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iput-object v2, p0, Lf8/i;->q:Lf8/q;

    .line 26
    .line 27
    iput v0, p0, Lf8/i;->r:I

    .line 28
    .line 29
    iput-object v1, p0, Lf8/i;->s:Ljava/util/List;

    .line 30
    .line 31
    iput-object v1, p0, Lf8/i;->t:Ljava/util/List;

    .line 32
    .line 33
    iput-object v1, p0, Lf8/i;->v:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {}, Lf8/t;->v()Lf8/t;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lf8/i;->w:Lf8/t;

    .line 40
    .line 41
    iput-object v1, p0, Lf8/i;->x:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {}, Lf8/e;->t()Lf8/e;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lf8/i;->y:Lf8/e;

    .line 48
    .line 49
    return-void
.end method

.method static synthetic B(Lf8/i;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/i;->m:I

    .line 2
    .line 3
    return p1
.end method

.method public static B0()Lf8/i$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/i$b;->p()Lf8/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method static synthetic C(Lf8/i;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->n:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method public static C0(Lf8/i;)Lf8/i$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/i;->B0()Lf8/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/i$b;->C(Lf8/i;)Lf8/i$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic D(Lf8/i;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/i;->o:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic E(Lf8/i;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/i;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static E0(Ljava/io/InputStream;Lm8/g;)Lf8/i;
    .locals 1

    .line 1
    sget-object v0, Lf8/i;->C:Lm8/r;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Lm8/r;->c(Ljava/io/InputStream;Lm8/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf8/i;

    .line 8
    .line 9
    return-object p0
.end method

.method static synthetic F(Lf8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic G(Lf8/i;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->q:Lf8/q;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic H(Lf8/i;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/i;->r:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic I(Lf8/i;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/i;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic J(Lf8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic K(Lf8/i;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/i;->t:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic L(Lf8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->t:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic M(Lf8/i;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/i;->v:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic N(Lf8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->v:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic O(Lf8/i;Lf8/t;)Lf8/t;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->w:Lf8/t;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic P(Lf8/i;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/i;->x:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic Q(Lf8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->x:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic R(Lf8/i;Lf8/e;)Lf8/e;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/i;->y:Lf8/e;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic S(Lf8/i;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/i;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic T(Lf8/i;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/i;->i:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static Z()Lf8/i;
    .locals 1

    .line 1
    sget-object v0, Lf8/i;->B:Lf8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic z(Lf8/i;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/i;->k:I

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public D0()Lf8/i$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/i;->B0()Lf8/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public F0()Lf8/i$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/i;->C0(Lf8/i;)Lf8/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public U(I)Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->s:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf8/q;

    .line 8
    .line 9
    return-object p1
.end method

.method public V()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->s:Ljava/util/List;

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

.method public W()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->t:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public X()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y()Lf8/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->y:Lf8/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic a()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/i;->a0()Lf8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public a0()Lf8/i;
    .locals 1

    .line 1
    sget-object v0, Lf8/i;->B:Lf8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 9

    .line 1
    iget v0, p0, Lf8/i;->A:I

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
    iget v0, p0, Lf8/i;->j:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lf8/i;->l:I

    .line 16
    .line 17
    invoke-static {v3, v0}, Lm8/f;->o(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v0, v2

    .line 23
    :goto_0
    iget v4, p0, Lf8/i;->j:I

    .line 24
    .line 25
    const/4 v5, 0x4

    .line 26
    and-int/2addr v4, v5

    .line 27
    if-ne v4, v5, :cond_2

    .line 28
    .line 29
    iget v4, p0, Lf8/i;->m:I

    .line 30
    .line 31
    invoke-static {v1, v4}, Lm8/f;->o(II)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    add-int/2addr v0, v4

    .line 36
    :cond_2
    iget v4, p0, Lf8/i;->j:I

    .line 37
    .line 38
    const/16 v6, 0x8

    .line 39
    .line 40
    and-int/2addr v4, v6

    .line 41
    if-ne v4, v6, :cond_3

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    iget-object v7, p0, Lf8/i;->n:Lf8/q;

    .line 45
    .line 46
    invoke-static {v4, v7}, Lm8/f;->r(ILm8/p;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    add-int/2addr v0, v4

    .line 51
    :cond_3
    move v4, v2

    .line 52
    :goto_1
    iget-object v7, p0, Lf8/i;->p:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-ge v4, v7, :cond_4

    .line 59
    .line 60
    iget-object v7, p0, Lf8/i;->p:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Lm8/p;

    .line 67
    .line 68
    invoke-static {v5, v7}, Lm8/f;->r(ILm8/p;)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    add-int/2addr v0, v7

    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    iget v4, p0, Lf8/i;->j:I

    .line 77
    .line 78
    const/16 v5, 0x20

    .line 79
    .line 80
    and-int/2addr v4, v5

    .line 81
    if-ne v4, v5, :cond_5

    .line 82
    .line 83
    const/4 v4, 0x5

    .line 84
    iget-object v7, p0, Lf8/i;->q:Lf8/q;

    .line 85
    .line 86
    invoke-static {v4, v7}, Lm8/f;->r(ILm8/p;)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    add-int/2addr v0, v4

    .line 91
    :cond_5
    move v4, v2

    .line 92
    :goto_2
    iget-object v7, p0, Lf8/i;->v:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-ge v4, v7, :cond_6

    .line 99
    .line 100
    iget-object v7, p0, Lf8/i;->v:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    check-cast v7, Lm8/p;

    .line 107
    .line 108
    const/4 v8, 0x6

    .line 109
    invoke-static {v8, v7}, Lm8/f;->r(ILm8/p;)I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    add-int/2addr v0, v7

    .line 114
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    iget v4, p0, Lf8/i;->j:I

    .line 118
    .line 119
    const/16 v7, 0x10

    .line 120
    .line 121
    and-int/2addr v4, v7

    .line 122
    if-ne v4, v7, :cond_7

    .line 123
    .line 124
    const/4 v4, 0x7

    .line 125
    iget v7, p0, Lf8/i;->o:I

    .line 126
    .line 127
    invoke-static {v4, v7}, Lm8/f;->o(II)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    add-int/2addr v0, v4

    .line 132
    :cond_7
    iget v4, p0, Lf8/i;->j:I

    .line 133
    .line 134
    const/16 v7, 0x40

    .line 135
    .line 136
    and-int/2addr v4, v7

    .line 137
    if-ne v4, v7, :cond_8

    .line 138
    .line 139
    iget v4, p0, Lf8/i;->r:I

    .line 140
    .line 141
    invoke-static {v6, v4}, Lm8/f;->o(II)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    add-int/2addr v0, v4

    .line 146
    :cond_8
    iget v4, p0, Lf8/i;->j:I

    .line 147
    .line 148
    and-int/2addr v4, v3

    .line 149
    if-ne v4, v3, :cond_9

    .line 150
    .line 151
    const/16 v3, 0x9

    .line 152
    .line 153
    iget v4, p0, Lf8/i;->k:I

    .line 154
    .line 155
    invoke-static {v3, v4}, Lm8/f;->o(II)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    add-int/2addr v0, v3

    .line 160
    :cond_9
    move v3, v2

    .line 161
    :goto_3
    iget-object v4, p0, Lf8/i;->s:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-ge v3, v4, :cond_a

    .line 168
    .line 169
    iget-object v4, p0, Lf8/i;->s:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    check-cast v4, Lm8/p;

    .line 176
    .line 177
    const/16 v6, 0xa

    .line 178
    .line 179
    invoke-static {v6, v4}, Lm8/f;->r(ILm8/p;)I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    add-int/2addr v0, v4

    .line 184
    add-int/lit8 v3, v3, 0x1

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_a
    move v3, v2

    .line 188
    move v4, v3

    .line 189
    :goto_4
    iget-object v6, p0, Lf8/i;->t:Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-ge v3, v6, :cond_b

    .line 196
    .line 197
    iget-object v6, p0, Lf8/i;->t:Ljava/util/List;

    .line 198
    .line 199
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    check-cast v6, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    invoke-static {v6}, Lm8/f;->p(I)I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    add-int/2addr v4, v6

    .line 214
    add-int/lit8 v3, v3, 0x1

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_b
    add-int/2addr v0, v4

    .line 218
    invoke-virtual {p0}, Lf8/i;->W()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_c

    .line 227
    .line 228
    add-int/lit8 v0, v0, 0x1

    .line 229
    .line 230
    invoke-static {v4}, Lm8/f;->p(I)I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    add-int/2addr v0, v3

    .line 235
    :cond_c
    iput v4, p0, Lf8/i;->u:I

    .line 236
    .line 237
    iget v3, p0, Lf8/i;->j:I

    .line 238
    .line 239
    const/16 v4, 0x80

    .line 240
    .line 241
    and-int/2addr v3, v4

    .line 242
    if-ne v3, v4, :cond_d

    .line 243
    .line 244
    const/16 v3, 0x1e

    .line 245
    .line 246
    iget-object v4, p0, Lf8/i;->w:Lf8/t;

    .line 247
    .line 248
    invoke-static {v3, v4}, Lm8/f;->r(ILm8/p;)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    add-int/2addr v0, v3

    .line 253
    :cond_d
    move v3, v2

    .line 254
    :goto_5
    iget-object v4, p0, Lf8/i;->x:Ljava/util/List;

    .line 255
    .line 256
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    if-ge v2, v4, :cond_e

    .line 261
    .line 262
    iget-object v4, p0, Lf8/i;->x:Ljava/util/List;

    .line 263
    .line 264
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    check-cast v4, Ljava/lang/Integer;

    .line 269
    .line 270
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    invoke-static {v4}, Lm8/f;->p(I)I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    add-int/2addr v3, v4

    .line 279
    add-int/lit8 v2, v2, 0x1

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_e
    add-int/2addr v0, v3

    .line 283
    invoke-virtual {p0}, Lf8/i;->q0()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    mul-int/2addr v2, v1

    .line 292
    add-int/2addr v0, v2

    .line 293
    iget v1, p0, Lf8/i;->j:I

    .line 294
    .line 295
    const/16 v2, 0x100

    .line 296
    .line 297
    and-int/2addr v1, v2

    .line 298
    if-ne v1, v2, :cond_f

    .line 299
    .line 300
    iget-object v1, p0, Lf8/i;->y:Lf8/e;

    .line 301
    .line 302
    invoke-static {v5, v1}, Lm8/f;->r(ILm8/p;)I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    add-int/2addr v0, v1

    .line 307
    :cond_f
    invoke-virtual {p0}, Lm8/i$d;->s()I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    add-int/2addr v0, v1

    .line 312
    iget-object v1, p0, Lf8/i;->i:Lm8/d;

    .line 313
    .line 314
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    add-int/2addr v0, v1

    .line 319
    iput v0, p0, Lf8/i;->A:I

    .line 320
    .line 321
    return v0
.end method

.method public b0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/i;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/i;->D0()Lf8/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/i;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public d0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/i;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lf8/i;->z:B

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
    invoke-virtual {p0}, Lf8/i;->t0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lf8/i;->z:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    invoke-virtual {p0}, Lf8/i;->x0()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Lf8/i;->g0()Lf8/q;

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
    iput-byte v2, p0, Lf8/i;->z:B

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    move v0, v2

    .line 40
    :goto_0
    invoke-virtual {p0}, Lf8/i;->j0()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-ge v0, v3, :cond_5

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lf8/i;->i0(I)Lf8/s;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Lf8/s;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_4

    .line 55
    .line 56
    iput-byte v2, p0, Lf8/i;->z:B

    .line 57
    .line 58
    return v2

    .line 59
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    invoke-virtual {p0}, Lf8/i;->v0()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0}, Lf8/i;->e0()Lf8/q;

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
    iput-byte v2, p0, Lf8/i;->z:B

    .line 79
    .line 80
    return v2

    .line 81
    :cond_6
    move v0, v2

    .line 82
    :goto_1
    invoke-virtual {p0}, Lf8/i;->V()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-ge v0, v3, :cond_8

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lf8/i;->U(I)Lf8/q;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Lf8/q;->e()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_7

    .line 97
    .line 98
    iput-byte v2, p0, Lf8/i;->z:B

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
    move v0, v2

    .line 105
    :goto_2
    invoke-virtual {p0}, Lf8/i;->o0()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-ge v0, v3, :cond_a

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lf8/i;->n0(I)Lf8/u;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Lf8/u;->e()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_9

    .line 120
    .line 121
    iput-byte v2, p0, Lf8/i;->z:B

    .line 122
    .line 123
    return v2

    .line 124
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_a
    invoke-virtual {p0}, Lf8/i;->z0()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_b

    .line 132
    .line 133
    invoke-virtual {p0}, Lf8/i;->m0()Lf8/t;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Lf8/t;->e()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_b

    .line 142
    .line 143
    iput-byte v2, p0, Lf8/i;->z:B

    .line 144
    .line 145
    return v2

    .line 146
    :cond_b
    invoke-virtual {p0}, Lf8/i;->r0()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_c

    .line 151
    .line 152
    invoke-virtual {p0}, Lf8/i;->Y()Lf8/e;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Lf8/e;->e()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_c

    .line 161
    .line 162
    iput-byte v2, p0, Lf8/i;->z:B

    .line 163
    .line 164
    return v2

    .line 165
    :cond_c
    invoke-virtual {p0}, Lm8/i$d;->r()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-nez v0, :cond_d

    .line 170
    .line 171
    iput-byte v2, p0, Lf8/i;->z:B

    .line 172
    .line 173
    return v2

    .line 174
    :cond_d
    iput-byte v1, p0, Lf8/i;->z:B

    .line 175
    .line 176
    return v1
.end method

.method public e0()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->q:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/i;->F0()Lf8/i$b;

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
    iget v0, p0, Lf8/i;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public g(Lm8/f;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lf8/i;->b()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm8/i$d;->x()Lm8/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lf8/i;->j:I

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    and-int/2addr v1, v2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lf8/i;->l:I

    .line 16
    .line 17
    invoke-virtual {p1, v3, v1}, Lm8/f;->Z(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lf8/i;->j:I

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    and-int/2addr v1, v4

    .line 24
    if-ne v1, v4, :cond_1

    .line 25
    .line 26
    iget v1, p0, Lf8/i;->m:I

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Lm8/f;->Z(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v1, p0, Lf8/i;->j:I

    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    and-int/2addr v1, v2

    .line 36
    if-ne v1, v2, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    iget-object v5, p0, Lf8/i;->n:Lf8/q;

    .line 40
    .line 41
    invoke-virtual {p1, v1, v5}, Lm8/f;->c0(ILm8/p;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    move v5, v1

    .line 46
    :goto_0
    iget-object v6, p0, Lf8/i;->p:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-ge v5, v6, :cond_3

    .line 53
    .line 54
    iget-object v6, p0, Lf8/i;->p:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Lm8/p;

    .line 61
    .line 62
    invoke-virtual {p1, v4, v6}, Lm8/f;->c0(ILm8/p;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    iget v4, p0, Lf8/i;->j:I

    .line 69
    .line 70
    const/16 v5, 0x20

    .line 71
    .line 72
    and-int/2addr v4, v5

    .line 73
    if-ne v4, v5, :cond_4

    .line 74
    .line 75
    const/4 v4, 0x5

    .line 76
    iget-object v6, p0, Lf8/i;->q:Lf8/q;

    .line 77
    .line 78
    invoke-virtual {p1, v4, v6}, Lm8/f;->c0(ILm8/p;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    move v4, v1

    .line 82
    :goto_1
    iget-object v6, p0, Lf8/i;->v:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-ge v4, v6, :cond_5

    .line 89
    .line 90
    iget-object v6, p0, Lf8/i;->v:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    check-cast v6, Lm8/p;

    .line 97
    .line 98
    const/4 v7, 0x6

    .line 99
    invoke-virtual {p1, v7, v6}, Lm8/f;->c0(ILm8/p;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    iget v4, p0, Lf8/i;->j:I

    .line 106
    .line 107
    const/16 v6, 0x10

    .line 108
    .line 109
    and-int/2addr v4, v6

    .line 110
    if-ne v4, v6, :cond_6

    .line 111
    .line 112
    const/4 v4, 0x7

    .line 113
    iget v6, p0, Lf8/i;->o:I

    .line 114
    .line 115
    invoke-virtual {p1, v4, v6}, Lm8/f;->Z(II)V

    .line 116
    .line 117
    .line 118
    :cond_6
    iget v4, p0, Lf8/i;->j:I

    .line 119
    .line 120
    const/16 v6, 0x40

    .line 121
    .line 122
    and-int/2addr v4, v6

    .line 123
    if-ne v4, v6, :cond_7

    .line 124
    .line 125
    iget v4, p0, Lf8/i;->r:I

    .line 126
    .line 127
    invoke-virtual {p1, v2, v4}, Lm8/f;->Z(II)V

    .line 128
    .line 129
    .line 130
    :cond_7
    iget v2, p0, Lf8/i;->j:I

    .line 131
    .line 132
    and-int/2addr v2, v3

    .line 133
    if-ne v2, v3, :cond_8

    .line 134
    .line 135
    const/16 v2, 0x9

    .line 136
    .line 137
    iget v3, p0, Lf8/i;->k:I

    .line 138
    .line 139
    invoke-virtual {p1, v2, v3}, Lm8/f;->Z(II)V

    .line 140
    .line 141
    .line 142
    :cond_8
    move v2, v1

    .line 143
    :goto_2
    iget-object v3, p0, Lf8/i;->s:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-ge v2, v3, :cond_9

    .line 150
    .line 151
    iget-object v3, p0, Lf8/i;->s:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Lm8/p;

    .line 158
    .line 159
    const/16 v4, 0xa

    .line 160
    .line 161
    invoke-virtual {p1, v4, v3}, Lm8/f;->c0(ILm8/p;)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_9
    invoke-virtual {p0}, Lf8/i;->W()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-lez v2, :cond_a

    .line 176
    .line 177
    const/16 v2, 0x5a

    .line 178
    .line 179
    invoke-virtual {p1, v2}, Lm8/f;->n0(I)V

    .line 180
    .line 181
    .line 182
    iget v2, p0, Lf8/i;->u:I

    .line 183
    .line 184
    invoke-virtual {p1, v2}, Lm8/f;->n0(I)V

    .line 185
    .line 186
    .line 187
    :cond_a
    move v2, v1

    .line 188
    :goto_3
    iget-object v3, p0, Lf8/i;->t:Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-ge v2, v3, :cond_b

    .line 195
    .line 196
    iget-object v3, p0, Lf8/i;->t:Ljava/util/List;

    .line 197
    .line 198
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    invoke-virtual {p1, v3}, Lm8/f;->a0(I)V

    .line 209
    .line 210
    .line 211
    add-int/lit8 v2, v2, 0x1

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_b
    iget v2, p0, Lf8/i;->j:I

    .line 215
    .line 216
    const/16 v3, 0x80

    .line 217
    .line 218
    and-int/2addr v2, v3

    .line 219
    if-ne v2, v3, :cond_c

    .line 220
    .line 221
    const/16 v2, 0x1e

    .line 222
    .line 223
    iget-object v3, p0, Lf8/i;->w:Lf8/t;

    .line 224
    .line 225
    invoke-virtual {p1, v2, v3}, Lm8/f;->c0(ILm8/p;)V

    .line 226
    .line 227
    .line 228
    :cond_c
    :goto_4
    iget-object v2, p0, Lf8/i;->x:Ljava/util/List;

    .line 229
    .line 230
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-ge v1, v2, :cond_d

    .line 235
    .line 236
    iget-object v2, p0, Lf8/i;->x:Ljava/util/List;

    .line 237
    .line 238
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, Ljava/lang/Integer;

    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    const/16 v3, 0x1f

    .line 249
    .line 250
    invoke-virtual {p1, v3, v2}, Lm8/f;->Z(II)V

    .line 251
    .line 252
    .line 253
    add-int/lit8 v1, v1, 0x1

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_d
    iget v1, p0, Lf8/i;->j:I

    .line 257
    .line 258
    const/16 v2, 0x100

    .line 259
    .line 260
    and-int/2addr v1, v2

    .line 261
    if-ne v1, v2, :cond_e

    .line 262
    .line 263
    iget-object v1, p0, Lf8/i;->y:Lf8/e;

    .line 264
    .line 265
    invoke-virtual {p1, v5, v1}, Lm8/f;->c0(ILm8/p;)V

    .line 266
    .line 267
    .line 268
    :cond_e
    const/16 v1, 0x4a38

    .line 269
    .line 270
    invoke-virtual {v0, v1, p1}, Lm8/i$d$a;->a(ILm8/f;)V

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lf8/i;->i:Lm8/d;

    .line 274
    .line 275
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method public g0()Lf8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->n:Lf8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public h0()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/i;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public i0(I)Lf8/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->p:Ljava/util/List;

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

.method public j0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->p:Ljava/util/List;

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

.method public k0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public m0()Lf8/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->w:Lf8/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public n0(I)Lf8/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->v:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf8/u;

    .line 8
    .line 9
    return-object p1
.end method

.method public o0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->v:Ljava/util/List;

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

.method public p0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->v:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public q0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/i;->x:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public r0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/i;->j:I

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
    iget v0, p0, Lf8/i;->j:I

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

.method public t0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/i;->j:I

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

.method public u0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/i;->j:I

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

.method public v0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/i;->j:I

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

.method public w0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/i;->j:I

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

.method public x0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/i;->j:I

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

.method public y0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/i;->j:I

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

.method public z0()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/i;->j:I

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
