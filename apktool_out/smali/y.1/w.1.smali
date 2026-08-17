.class public final Ly/w;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/v;


# instance fields
.field private final a:LF/Z;

.field private final b:Lz/a;

.field private final c:LF/E1;

.field private final d:LK/m;


# direct methods
.method public constructor <init>(LF/Z;Lz/a;LF/E1;LK/m;)V
    .locals 1

    .line 1
    const-string v0, "cameraRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraCoordinator"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "useCaseConfigFactory"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "streamSpecsCalculator"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ly/w;->a:LF/Z;

    .line 25
    .line 26
    iput-object p2, p0, Ly/w;->b:Lz/a;

    .line 27
    .line 28
    iput-object p3, p0, Ly/w;->c:LF/E1;

    .line 29
    .line 30
    iput-object p4, p0, Ly/w;->d:LK/m;

    .line 31
    .line 32
    return-void
.end method

.method private final c(LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;)LK/f;
    .locals 10

    .line 1
    new-instance v0, LK/f;

    .line 2
    .line 3
    iget-object v7, p0, Ly/w;->b:Lz/a;

    .line 4
    .line 5
    iget-object v8, p0, Ly/w;->d:LK/m;

    .line 6
    .line 7
    iget-object v9, p0, Ly/w;->c:LF/E1;

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    move-object v5, p5

    .line 14
    move-object/from16 v6, p6

    .line 15
    .line 16
    invoke-direct/range {v0 .. v9}, LK/f;-><init>(LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;Lz/a;LK/m;LF/E1;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method static synthetic d(Ly/w;LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;ILjava/lang/Object;)LK/f;
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x8

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p4, v0

    .line 12
    :cond_1
    and-int/lit8 p8, p7, 0x10

    .line 13
    .line 14
    if-eqz p8, :cond_2

    .line 15
    .line 16
    sget-object p5, Ly/F;->d:Ly/F;

    .line 17
    .line 18
    :cond_2
    and-int/lit8 p7, p7, 0x20

    .line 19
    .line 20
    if-eqz p7, :cond_3

    .line 21
    .line 22
    sget-object p6, Ly/F;->d:Ly/F;

    .line 23
    .line 24
    :cond_3
    invoke-direct/range {p0 .. p6}, Ly/w;->c(LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;)LK/f;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method


# virtual methods
.method public a(LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;)LK/f;
    .locals 1

    .line 1
    const-string v0, "camera"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "adapterCameraInfo"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "compositionSettings"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "secondaryCompositionSettings"

    .line 17
    .line 18
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct/range {p0 .. p6}, Ly/w;->c(LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;)LK/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public b(Ljava/lang/String;)LK/f;
    .locals 10

    .line 1
    const-string v0, "cameraId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly/w;->a:LF/Z;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LF/Z;->l(Ljava/lang/String;)LF/M;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string p1, "getCamera(...)"

    .line 13
    .line 14
    invoke-static {v2, p1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v4, LF/d;

    .line 18
    .line 19
    invoke-interface {v2}, LF/M;->r()LF/L;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {}, LF/H;->a()LF/E;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {v4, p1, v0}, LF/d;-><init>(LF/L;LF/E;)V

    .line 28
    .line 29
    .line 30
    const/16 v8, 0x3a

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    move-object v1, p0

    .line 38
    invoke-static/range {v1 .. v9}, Ly/w;->d(Ly/w;LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;ILjava/lang/Object;)LK/f;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method
