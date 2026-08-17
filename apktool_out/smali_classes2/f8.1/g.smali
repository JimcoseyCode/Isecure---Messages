.class public final Lf8/g;
.super Lm8/i$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/g$b;
    }
.end annotation


# static fields
.field private static final n:Lf8/g;

.field public static o:Lm8/r;


# instance fields
.field private final i:Lm8/d;

.field private j:I

.field private k:I

.field private l:B

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/g$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/g$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/g;->o:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/g;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/g;->n:Lf8/g;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/g;->G()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 6

    .line 11
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Lf8/g;->l:B

    .line 13
    iput v0, p0, Lf8/g;->m:I

    .line 14
    invoke-direct {p0}, Lf8/g;->G()V

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
    if-nez v3, :cond_3

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

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

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 19
    :cond_2
    iget v4, p0, Lf8/g;->j:I

    or-int/2addr v4, v1

    iput v4, p0, Lf8/g;->j:I

    .line 20
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Lf8/g;->k:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 21
    :goto_1
    :try_start_1
    new-instance p2, Lm8/k;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 23
    :goto_2
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/g;->i:Lm8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/g;->i:Lm8/d;

    .line 26
    throw p1

    .line 27
    :goto_4
    invoke-virtual {p0}, Lm8/i$d;->l()V

    .line 28
    throw p1

    .line 29
    :cond_3
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 30
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/g;->i:Lm8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/g;->i:Lm8/d;

    .line 31
    throw p1

    .line 32
    :goto_5
    invoke-virtual {p0}, Lm8/i$d;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/g;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i$d;-><init>(Lm8/i$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/g;->l:B

    .line 5
    iput v0, p0, Lf8/g;->m:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/g;->i:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$c;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/g;-><init>(Lm8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/g;->l:B

    .line 9
    iput p1, p0, Lf8/g;->m:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/g;->i:Lm8/d;

    return-void
.end method

.method static synthetic A(Lf8/g;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/g;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic B(Lf8/g;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/g;->i:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static C()Lf8/g;
    .locals 1

    .line 1
    sget-object v0, Lf8/g;->n:Lf8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method private G()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lf8/g;->k:I

    .line 3
    .line 4
    return-void
.end method

.method public static H()Lf8/g$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/g$b;->p()Lf8/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static I(Lf8/g;)Lf8/g$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/g;->H()Lf8/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/g$b;->w(Lf8/g;)Lf8/g$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic z(Lf8/g;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/g;->k:I

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public D()Lf8/g;
    .locals 1

    .line 1
    sget-object v0, Lf8/g;->n:Lf8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public E()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/g;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public F()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/g;->j:I

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

.method public J()Lf8/g$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/g;->H()Lf8/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public K()Lf8/g$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/g;->I(Lf8/g;)Lf8/g$b;

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
    invoke-virtual {p0}, Lf8/g;->D()Lf8/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()I
    .locals 2

    .line 1
    iget v0, p0, Lf8/g;->m:I

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
    iget v0, p0, Lf8/g;->j:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lf8/g;->k:I

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
    invoke-virtual {p0}, Lm8/i$d;->s()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v0, v1

    .line 26
    iget-object v1, p0, Lf8/g;->i:Lm8/d;

    .line 27
    .line 28
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    iput v0, p0, Lf8/g;->m:I

    .line 34
    .line 35
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/g;->J()Lf8/g$b;

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
    iget-byte v0, p0, Lf8/g;->l:B

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
    invoke-virtual {p0}, Lm8/i$d;->r()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lf8/g;->l:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iput-byte v1, p0, Lf8/g;->l:B

    .line 21
    .line 22
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/g;->K()Lf8/g$b;

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
    invoke-virtual {p0}, Lf8/g;->b()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm8/i$d;->x()Lm8/i$d$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lf8/g;->j:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lf8/g;->k:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lm8/f;->Z(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/16 v1, 0xc8

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, Lm8/i$d$a;->a(ILm8/f;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lf8/g;->i:Lm8/d;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
