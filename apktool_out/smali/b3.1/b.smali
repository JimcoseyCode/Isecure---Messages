.class public Lb3/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lb3/c;


# instance fields
.field private final a:Lb3/c;

.field private final b:Lb3/c;

.field private final c:Lb3/c;

.field private final d:Lh3/d;

.field private final e:Lc2/n;

.field private final f:Lb3/c;

.field private final g:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lb3/c;Lb3/c;Lb3/c;Lh3/d;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lb3/b;-><init>(Lb3/c;Lb3/c;Lb3/c;Lh3/d;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lb3/c;Lb3/c;Lb3/c;Lh3/d;Ljava/util/Map;)V
    .locals 7

    .line 2
    sget-object v6, Lc2/o;->b:Lc2/n;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lb3/b;-><init>(Lb3/c;Lb3/c;Lb3/c;Lh3/d;Ljava/util/Map;Lc2/n;)V

    return-void
.end method

.method public constructor <init>(Lb3/c;Lb3/c;Lb3/c;Lh3/d;Ljava/util/Map;Lc2/n;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lb3/b$a;

    invoke-direct {v0, p0}, Lb3/b$a;-><init>(Lb3/b;)V

    iput-object v0, p0, Lb3/b;->f:Lb3/c;

    .line 5
    iput-object p1, p0, Lb3/b;->a:Lb3/c;

    .line 6
    iput-object p2, p0, Lb3/b;->b:Lb3/c;

    .line 7
    iput-object p3, p0, Lb3/b;->c:Lb3/c;

    .line 8
    iput-object p4, p0, Lb3/b;->d:Lh3/d;

    .line 9
    iput-object p5, p0, Lb3/b;->g:Ljava/util/Map;

    .line 10
    iput-object p6, p0, Lb3/b;->e:Lc2/n;

    return-void
.end method

.method static bridge synthetic b(Lb3/b;)Lc2/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lb3/b;->e:Lc2/n;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic c(Lb3/b;Ld3/k;ILd3/p;LX2/d;)Ld3/e;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lb3/b;->h(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private h(Ld3/k;ILd3/p;LX2/d;)Ld3/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lb3/b;->c:Lb3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3, p4}, Lb3/c;->a(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
.end method


# virtual methods
.method public a(Ld3/k;ILd3/p;LX2/d;)Ld3/e;
    .locals 2

    .line 1
    iget-object v0, p4, LX2/d;->j:Lb3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3, p4}, Lb3/c;->a(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1}, Ld3/k;->I()LQ2/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v1, LQ2/c;->d:LQ2/c;

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    :cond_1
    invoke-virtual {p1}, Ld3/k;->J()Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-static {v1}, LQ2/e;->d(Ljava/io/InputStream;)LQ2/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Ld3/k;->M0(LQ2/c;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    iget-object v1, p0, Lb3/b;->g:Ljava/util/Map;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lb3/c;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-interface {v0, p1, p2, p3, p4}, Lb3/c;->a(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_3
    iget-object v0, p0, Lb3/b;->f:Lb3/c;

    .line 51
    .line 52
    invoke-interface {v0, p1, p2, p3, p4}, Lb3/c;->a(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method

.method public d(Ld3/k;ILd3/p;LX2/d;)Ld3/e;
    .locals 1

    .line 1
    iget-boolean v0, p4, LX2/d;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lb3/b;->b:Lb3/c;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, Lb3/c;->a(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0, p1, p4}, Lb3/b;->g(Ld3/k;LX2/d;)Ld3/f;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public e(Ld3/k;ILd3/p;LX2/d;)Ld3/e;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ld3/k;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Ld3/k;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p4, LX2/d;->g:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lb3/b;->a:Lb3/c;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v0, p1, p2, p3, p4}, Lb3/c;->a(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {p0, p1, p4}, Lb3/b;->g(Ld3/k;LX2/d;)Ld3/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    new-instance p2, Lb3/a;

    .line 33
    .line 34
    const-string p3, "image width or height is incorrect"

    .line 35
    .line 36
    invoke-direct {p2, p3, p1}, Lb3/a;-><init>(Ljava/lang/String;Ld3/k;)V

    .line 37
    .line 38
    .line 39
    throw p2
.end method

.method public f(Ld3/k;ILd3/p;LX2/d;Landroid/graphics/ColorSpace;)Ld3/f;
    .locals 6

    .line 1
    iget-object v0, p0, Lb3/b;->d:Lh3/d;

    .line 2
    .line 3
    iget-object v2, p4, LX2/d;->h:Landroid/graphics/Bitmap$Config;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v1, p1

    .line 7
    move v4, p2

    .line 8
    move-object v5, p5

    .line 9
    invoke-interface/range {v0 .. v5}, Lh3/d;->a(Ld3/k;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;ILandroid/graphics/ColorSpace;)Lg2/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    :try_start_0
    invoke-static {p2, p1}, Ll3/b;->a(Ll3/a;Lg2/a;)Z

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ld3/k;->F()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-virtual {v1}, Ld3/k;->I0()I

    .line 25
    .line 26
    .line 27
    move-result p4

    .line 28
    invoke-static {p1, p3, p2, p4}, Ld3/f;->u(Lg2/a;Ld3/p;II)Ld3/f;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string p3, "is_rounded"

    .line 33
    .line 34
    const/4 p4, 0x0

    .line 35
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    invoke-interface {p2, p3, p4}, LM2/a;->J(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lg2/a;->B(Lg2/a;)V

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p2, v0

    .line 48
    invoke-static {p1}, Lg2/a;->B(Lg2/a;)V

    .line 49
    .line 50
    .line 51
    throw p2
.end method

.method public g(Ld3/k;LX2/d;)Ld3/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lb3/b;->d:Lh3/d;

    .line 2
    .line 3
    iget-object v1, p2, LX2/d;->h:Landroid/graphics/Bitmap$Config;

    .line 4
    .line 5
    iget-object p2, p2, LX2/d;->k:Landroid/graphics/ColorSpace;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, p1, v1, v2, p2}, Lh3/d;->b(Ld3/k;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;Landroid/graphics/ColorSpace;)Lg2/a;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :try_start_0
    invoke-static {v2, p2}, Ll3/b;->a(Ll3/a;Lg2/a;)Z

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object v0, Ld3/o;->d:Ld3/p;

    .line 19
    .line 20
    invoke-virtual {p1}, Ld3/k;->F()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p1}, Ld3/k;->I0()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p2, v0, v1, p1}, Ld3/f;->u(Lg2/a;Ld3/p;II)Ld3/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "is_rounded"

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {p1, v0, v1}, LM2/a;->J(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, Lg2/a;->B(Lg2/a;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    invoke-static {p2}, Lg2/a;->B(Lg2/a;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method
