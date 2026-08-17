.class public final Lf8/p;
.super Lm8/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/p$b;
    }
.end annotation


# static fields
.field private static final l:Lf8/p;

.field public static m:Lm8/r;


# instance fields
.field private final h:Lm8/d;

.field private i:Lm8/n;

.field private j:B

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/p$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/p$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/p;->m:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/p;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/p;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/p;->l:Lf8/p;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/p;->w()V

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
    iput-byte v0, p0, Lf8/p;->j:B

    .line 13
    iput v0, p0, Lf8/p;->k:I

    .line 14
    invoke-direct {p0}, Lf8/p;->w()V

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
    if-nez v3, :cond_5

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v5

    if-eqz v5, :cond_1

    const/16 v6, 0xa

    if-eq v5, v6, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v5}, Lm8/i;->o(Lm8/e;Lm8/f;Lm8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

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
    invoke-virtual {p1}, Lm8/e;->k()Lm8/d;

    move-result-object v5

    if-eq v4, v1, :cond_3

    .line 20
    new-instance v6, Lm8/m;

    invoke-direct {v6}, Lm8/m;-><init>()V

    iput-object v6, p0, Lf8/p;->i:Lm8/n;

    move v4, v1

    .line 21
    :cond_3
    iget-object v6, p0, Lf8/p;->i:Lm8/n;

    invoke-interface {v6, v5}, Lm8/n;->i(Lm8/d;)V
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 22
    :goto_1
    :try_start_1
    new-instance p2, Lm8/k;

    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 24
    :goto_2
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    if-ne v4, v1, :cond_4

    .line 25
    iget-object p2, p0, Lf8/p;->i:Lm8/n;

    invoke-interface {p2}, Lm8/n;->k()Lm8/n;

    move-result-object p2

    iput-object p2, p0, Lf8/p;->i:Lm8/n;

    .line 26
    :cond_4
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/p;->h:Lm8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/p;->h:Lm8/d;

    .line 28
    throw p1

    .line 29
    :goto_4
    invoke-virtual {p0}, Lm8/i;->l()V

    .line 30
    throw p1

    :cond_5
    if-ne v4, v1, :cond_6

    .line 31
    iget-object p1, p0, Lf8/p;->i:Lm8/n;

    invoke-interface {p1}, Lm8/n;->k()Lm8/n;

    move-result-object p1

    iput-object p1, p0, Lf8/p;->i:Lm8/n;

    .line 32
    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 33
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/p;->h:Lm8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/p;->h:Lm8/d;

    .line 34
    throw p1

    .line 35
    :goto_5
    invoke-virtual {p0}, Lm8/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/p;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i;-><init>(Lm8/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/p;->j:B

    .line 5
    iput v0, p0, Lf8/p;->k:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/p;->h:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$b;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/p;-><init>(Lm8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/p;->j:B

    .line 9
    iput p1, p0, Lf8/p;->k:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/p;->h:Lm8/d;

    return-void
.end method

.method static synthetic q(Lf8/p;)Lm8/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/p;->i:Lm8/n;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic r(Lf8/p;Lm8/n;)Lm8/n;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/p;->i:Lm8/n;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic s(Lf8/p;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/p;->h:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static t()Lf8/p;
    .locals 1

    .line 1
    sget-object v0, Lf8/p;->l:Lf8/p;

    .line 2
    .line 3
    return-object v0
.end method

.method private w()V
    .locals 1

    .line 1
    sget-object v0, Lm8/m;->h:Lm8/n;

    .line 2
    .line 3
    iput-object v0, p0, Lf8/p;->i:Lm8/n;

    .line 4
    .line 5
    return-void
.end method

.method public static x()Lf8/p$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/p$b;->l()Lf8/p$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static y(Lf8/p;)Lf8/p$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/p;->x()Lf8/p$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/p$b;->t(Lf8/p;)Lf8/p$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public A()Lf8/p$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/p;->y(Lf8/p;)Lf8/p$b;

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
    iget v0, p0, Lf8/p;->k:I

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
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    iget-object v2, p0, Lf8/p;->i:Lm8/n;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v0, v2, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Lf8/p;->i:Lm8/n;

    .line 18
    .line 19
    invoke-interface {v2, v0}, Lm8/n;->j(I)Lm8/d;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lm8/f;->e(Lm8/d;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-int/2addr v1, v2

    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, Lf8/p;->v()Lm8/s;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/2addr v1, v0

    .line 40
    iget-object v0, p0, Lf8/p;->h:Lm8/d;

    .line 41
    .line 42
    invoke-virtual {v0}, Lm8/d;->size()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v1, v0

    .line 47
    iput v1, p0, Lf8/p;->k:I

    .line 48
    .line 49
    return v1
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/p;->z()Lf8/p$b;

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
    iget-byte v0, p0, Lf8/p;->j:B

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
    iput-byte v1, p0, Lf8/p;->j:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/p;->A()Lf8/p$b;

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
    invoke-virtual {p0}, Lf8/p;->b()I

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Lf8/p;->i:Lm8/n;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lf8/p;->i:Lm8/n;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Lm8/n;->j(I)Lm8/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {p1, v2, v1}, Lm8/f;->N(ILm8/d;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lf8/p;->h:Lm8/d;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public u(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/p;->i:Lm8/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
.end method

.method public v()Lm8/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/p;->i:Lm8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public z()Lf8/p$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/p;->x()Lf8/p$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
