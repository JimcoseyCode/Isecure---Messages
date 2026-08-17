.class public final Lf8/o$c;
.super Lm8/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/o$c$b;,
        Lf8/o$c$c;
    }
.end annotation


# static fields
.field private static final o:Lf8/o$c;

.field public static p:Lm8/r;


# instance fields
.field private final h:Lm8/d;

.field private i:I

.field private j:I

.field private k:I

.field private l:Lf8/o$c$c;

.field private m:B

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf8/o$c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/o$c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/o$c;->p:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Lf8/o$c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lf8/o$c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lf8/o$c;->o:Lf8/o$c;

    .line 15
    .line 16
    invoke-direct {v0}, Lf8/o$c;->C()V

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
    iput-byte v0, p0, Lf8/o$c;->m:B

    .line 13
    iput v0, p0, Lf8/o$c;->n:I

    .line 14
    invoke-direct {p0}, Lf8/o$c;->C()V

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
    if-nez v3, :cond_6

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_5

    const/16 v5, 0x10

    if-eq v4, v5, :cond_4

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

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 19
    :cond_2
    invoke-virtual {p1}, Lm8/e;->m()I

    move-result v5

    .line 20
    invoke-static {v5}, Lf8/o$c$c;->h(I)Lf8/o$c$c;

    move-result-object v6

    if-nez v6, :cond_3

    .line 21
    invoke-virtual {v2, v4}, Lm8/f;->n0(I)V

    .line 22
    invoke-virtual {v2, v5}, Lm8/f;->n0(I)V

    goto :goto_0

    .line 23
    :cond_3
    iget v4, p0, Lf8/o$c;->i:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Lf8/o$c;->i:I

    .line 24
    iput-object v6, p0, Lf8/o$c;->l:Lf8/o$c$c;

    goto :goto_0

    .line 25
    :cond_4
    iget v4, p0, Lf8/o$c;->i:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lf8/o$c;->i:I

    .line 26
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Lf8/o$c;->k:I

    goto :goto_0

    .line 27
    :cond_5
    iget v4, p0, Lf8/o$c;->i:I

    or-int/2addr v4, v1

    iput v4, p0, Lf8/o$c;->i:I

    .line 28
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Lf8/o$c;->j:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 29
    :goto_1
    :try_start_1
    new-instance p2, Lm8/k;

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 31
    :goto_2
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 33
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/o$c;->h:Lm8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/o$c;->h:Lm8/d;

    .line 34
    throw p1

    .line 35
    :goto_4
    invoke-virtual {p0}, Lm8/i;->l()V

    .line 36
    throw p1

    .line 37
    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 38
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/o$c;->h:Lm8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Lf8/o$c;->h:Lm8/d;

    .line 39
    throw p1

    .line 40
    :goto_5
    invoke-virtual {p0}, Lm8/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf8/o$c;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i;-><init>(Lm8/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Lf8/o$c;->m:B

    .line 5
    iput v0, p0, Lf8/o$c;->n:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Lf8/o$c;->h:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$b;Lf8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf8/o$c;-><init>(Lm8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lf8/o$c;->m:B

    .line 9
    iput p1, p0, Lf8/o$c;->n:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Lf8/o$c;->h:Lm8/d;

    return-void
.end method

.method private C()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lf8/o$c;->j:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lf8/o$c;->k:I

    .line 6
    .line 7
    sget-object v0, Lf8/o$c$c;->i:Lf8/o$c$c;

    .line 8
    .line 9
    iput-object v0, p0, Lf8/o$c;->l:Lf8/o$c$c;

    .line 10
    .line 11
    return-void
.end method

.method public static D()Lf8/o$c$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/o$c$b;->l()Lf8/o$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static E(Lf8/o$c;)Lf8/o$c$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/o$c;->D()Lf8/o$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lf8/o$c$b;->r(Lf8/o$c;)Lf8/o$c$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic q(Lf8/o$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/o$c;->k:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic r(Lf8/o$c;Lf8/o$c$c;)Lf8/o$c$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lf8/o$c;->l:Lf8/o$c$c;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic s(Lf8/o$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/o$c;->i:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic t(Lf8/o$c;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lf8/o$c;->h:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic u(Lf8/o$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lf8/o$c;->j:I

    .line 2
    .line 3
    return p1
.end method

.method public static v()Lf8/o$c;
    .locals 1

    .line 1
    sget-object v0, Lf8/o$c;->o:Lf8/o$c;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/o$c;->i:I

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

.method public B()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/o$c;->i:I

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

.method public F()Lf8/o$c$b;
    .locals 1

    .line 1
    invoke-static {}, Lf8/o$c;->D()Lf8/o$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public G()Lf8/o$c$b;
    .locals 1

    .line 1
    invoke-static {p0}, Lf8/o$c;->E(Lf8/o$c;)Lf8/o$c$b;

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
    iget v0, p0, Lf8/o$c;->n:I

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
    iget v0, p0, Lf8/o$c;->i:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lf8/o$c;->j:I

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
    iget v1, p0, Lf8/o$c;->i:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, Lf8/o$c;->k:I

    .line 28
    .line 29
    invoke-static {v2, v1}, Lm8/f;->o(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lf8/o$c;->i:I

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    and-int/2addr v1, v2

    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    iget-object v1, p0, Lf8/o$c;->l:Lf8/o$c$c;

    .line 41
    .line 42
    invoke-virtual {v1}, Lf8/o$c$c;->a()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-static {v2, v1}, Lm8/f;->h(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    :cond_3
    iget-object v1, p0, Lf8/o$c;->h:Lm8/d;

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
    iput v0, p0, Lf8/o$c;->n:I

    .line 60
    .line 61
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/o$c;->F()Lf8/o$c$b;

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
    iget-byte v0, p0, Lf8/o$c;->m:B

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
    invoke-virtual {p0}, Lf8/o$c;->B()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lf8/o$c;->m:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iput-byte v1, p0, Lf8/o$c;->m:B

    .line 21
    .line 22
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf8/o$c;->G()Lf8/o$c$b;

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
    invoke-virtual {p0}, Lf8/o$c;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lf8/o$c;->i:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lf8/o$c;->j:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lm8/f;->Z(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lf8/o$c;->i:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lf8/o$c;->k:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lm8/f;->Z(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lf8/o$c;->i:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lf8/o$c;->l:Lf8/o$c$c;

    .line 33
    .line 34
    invoke-virtual {v0}, Lf8/o$c$c;->a()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x3

    .line 39
    invoke-virtual {p1, v1, v0}, Lm8/f;->R(II)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lf8/o$c;->h:Lm8/d;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public w()Lf8/o$c$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/o$c;->l:Lf8/o$c$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/o$c;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public y()I
    .locals 1

    .line 1
    iget v0, p0, Lf8/o$c;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public z()Z
    .locals 2

    .line 1
    iget v0, p0, Lf8/o$c;->i:I

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
