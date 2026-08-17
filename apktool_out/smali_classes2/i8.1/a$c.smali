.class public final Li8/a$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/a$c$b;
    }
.end annotation


# static fields
.field private static final n:Li8/a$c;

.field public static o:Lm8/r;


# instance fields
.field private final h:Lm8/d;

.field private i:I

.field private j:I

.field private k:I

.field private l:B

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li8/a$c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Li8/a$c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li8/a$c;->o:Lm8/r;

    .line 7
    .line 8
    new-instance v0, Li8/a$c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Li8/a$c;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Li8/a$c;->n:Li8/a$c;

    .line 15
    .line 16
    invoke-direct {v0}, Li8/a$c;->z()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lm8/e;Lm8/g;)V
    .locals 6

    .line 11
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, Li8/a$c;->l:B

    .line 13
    iput v0, p0, Li8/a$c;->m:I

    .line 14
    invoke-direct {p0}, Li8/a$c;->z()V

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
    if-nez v3, :cond_4

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lm8/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_3

    const/16 v5, 0x10

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
    iget v4, p0, Li8/a$c;->i:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Li8/a$c;->i:I

    .line 20
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Li8/a$c;->k:I

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, Li8/a$c;->i:I

    or-int/2addr v4, v1

    iput v4, p0, Li8/a$c;->i:I

    .line 22
    invoke-virtual {p1}, Lm8/e;->r()I

    move-result v4

    iput v4, p0, Li8/a$c;->j:I
    :try_end_0
    .catch Lm8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 23
    :goto_1
    :try_start_1
    new-instance p2, Lm8/k;

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lm8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1

    .line 25
    :goto_2
    invoke-virtual {p1, p0}, Lm8/k;->i(Lm8/p;)Lm8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    :catch_2
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$c;->h:Lm8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$c;->h:Lm8/d;

    .line 28
    throw p1

    .line 29
    :goto_4
    invoke-virtual {p0}, Lm8/i;->l()V

    .line 30
    throw p1

    .line 31
    :cond_4
    :try_start_3
    invoke-virtual {v2}, Lm8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 32
    :catch_3
    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Li8/a$c;->h:Lm8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lm8/d$b;->m()Lm8/d;

    move-result-object p2

    iput-object p2, p0, Li8/a$c;->h:Lm8/d;

    .line 33
    throw p1

    .line 34
    :goto_5
    invoke-virtual {p0}, Lm8/i;->l()V

    return-void
.end method

.method synthetic constructor <init>(Lm8/e;Lm8/g;Li8/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li8/a$c;-><init>(Lm8/e;Lm8/g;)V

    return-void
.end method

.method private constructor <init>(Lm8/i$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lm8/i;-><init>(Lm8/i$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, Li8/a$c;->l:B

    .line 5
    iput v0, p0, Li8/a$c;->m:I

    .line 6
    invoke-virtual {p1}, Lm8/i$b;->i()Lm8/d;

    move-result-object p1

    iput-object p1, p0, Li8/a$c;->h:Lm8/d;

    return-void
.end method

.method synthetic constructor <init>(Lm8/i$b;Li8/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Li8/a$c;-><init>(Lm8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm8/i;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Li8/a$c;->l:B

    .line 9
    iput p1, p0, Li8/a$c;->m:I

    .line 10
    sget-object p1, Lm8/d;->g:Lm8/d;

    iput-object p1, p0, Li8/a$c;->h:Lm8/d;

    return-void
.end method

.method public static A()Li8/a$c$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$c$b;->l()Li8/a$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static B(Li8/a$c;)Li8/a$c$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$c;->A()Li8/a$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Li8/a$c$b;->r(Li8/a$c;)Li8/a$c$b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method static synthetic q(Li8/a$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Li8/a$c;->j:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic r(Li8/a$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Li8/a$c;->k:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic s(Li8/a$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Li8/a$c;->i:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic t(Li8/a$c;)Lm8/d;
    .locals 0

    .line 1
    iget-object p0, p0, Li8/a$c;->h:Lm8/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static u()Li8/a$c;
    .locals 1

    .line 1
    sget-object v0, Li8/a$c;->n:Li8/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method private z()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Li8/a$c;->j:I

    .line 3
    .line 4
    iput v0, p0, Li8/a$c;->k:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public C()Li8/a$c$b;
    .locals 1

    .line 1
    invoke-static {}, Li8/a$c;->A()Li8/a$c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public D()Li8/a$c$b;
    .locals 1

    .line 1
    invoke-static {p0}, Li8/a$c;->B(Li8/a$c;)Li8/a$c$b;

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
    iget v0, p0, Li8/a$c;->m:I

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
    iget v0, p0, Li8/a$c;->i:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Li8/a$c;->j:I

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
    iget v1, p0, Li8/a$c;->i:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, Li8/a$c;->k:I

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
    iget-object v1, p0, Li8/a$c;->h:Lm8/d;

    .line 35
    .line 36
    invoke-virtual {v1}, Lm8/d;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v0, v1

    .line 41
    iput v0, p0, Li8/a$c;->m:I

    .line 42
    .line 43
    return v0
.end method

.method public bridge synthetic c()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/a$c;->C()Li8/a$c$b;

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
    iget-byte v0, p0, Li8/a$c;->l:B

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
    iput-byte v1, p0, Li8/a$c;->l:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic f()Lm8/p$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/a$c;->D()Li8/a$c$b;

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
    invoke-virtual {p0}, Li8/a$c;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Li8/a$c;->i:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Li8/a$c;->j:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lm8/f;->Z(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Li8/a$c;->i:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Li8/a$c;->k:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lm8/f;->Z(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Li8/a$c;->h:Lm8/d;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lm8/f;->h0(Lm8/d;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public v()I
    .locals 1

    .line 1
    iget v0, p0, Li8/a$c;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public w()I
    .locals 1

    .line 1
    iget v0, p0, Li8/a$c;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public x()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$c;->i:I

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

.method public y()Z
    .locals 2

    .line 1
    iget v0, p0, Li8/a$c;->i:I

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
