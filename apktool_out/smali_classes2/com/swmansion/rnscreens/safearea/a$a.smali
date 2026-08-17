.class public final Lcom/swmansion/rnscreens/safearea/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/safearea/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/safearea/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx0/e;)Lcom/swmansion/rnscreens/safearea/a;
    .locals 4

    .line 1
    const-string v0, "insets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/swmansion/rnscreens/safearea/a;

    .line 7
    .line 8
    iget v1, p1, Lx0/e;->a:I

    .line 9
    .line 10
    int-to-float v1, v1

    .line 11
    iget v2, p1, Lx0/e;->b:I

    .line 12
    .line 13
    int-to-float v2, v2

    .line 14
    iget v3, p1, Lx0/e;->c:I

    .line 15
    .line 16
    int-to-float v3, v3

    .line 17
    iget p1, p1, Lx0/e;->d:I

    .line 18
    .line 19
    int-to-float p1, p1

    .line 20
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/swmansion/rnscreens/safearea/a;-><init>(FFFF)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final b()Lcom/swmansion/rnscreens/safearea/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/swmansion/rnscreens/safearea/a;->a()Lcom/swmansion/rnscreens/safearea/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final c(Lcom/swmansion/rnscreens/safearea/a;Lcom/swmansion/rnscreens/safearea/a;)Lcom/swmansion/rnscreens/safearea/a;
    .locals 5

    .line 1
    const-string v0, "i1"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "i2"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/swmansion/rnscreens/safearea/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/safearea/a;->c()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/safearea/a;->c()F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/safearea/a;->e()F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/safearea/a;->e()F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/safearea/a;->d()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/safearea/a;->d()F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/safearea/a;->b()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/safearea/a;->b()F

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/swmansion/rnscreens/safearea/a;-><init>(FFFF)V

    .line 62
    .line 63
    .line 64
    return-object v0
.end method
