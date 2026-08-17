.class public final Lcom/swmansion/rnscreens/S$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/S;
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
    invoke-direct {p0}, Lcom/swmansion/rnscreens/S$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/swmansion/rnscreens/S$a;Lcom/swmansion/rnscreens/G;Lcom/swmansion/rnscreens/y$d;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/S$a;->b(Lcom/swmansion/rnscreens/G;Lcom/swmansion/rnscreens/y$d;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final b(Lcom/swmansion/rnscreens/G;Lcom/swmansion/rnscreens/y$d;)Z
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getStackAnimation()Lcom/swmansion/rnscreens/y$d;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v0, 0x21

    .line 14
    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    sget-object p1, Lcom/swmansion/rnscreens/y$d;->j:Lcom/swmansion/rnscreens/y$d;

    .line 18
    .line 19
    if-eq p2, p1, :cond_1

    .line 20
    .line 21
    sget-object p1, Lcom/swmansion/rnscreens/y$d;->m:Lcom/swmansion/rnscreens/y$d;

    .line 22
    .line 23
    if-eq p2, p1, :cond_1

    .line 24
    .line 25
    sget-object p1, Lcom/swmansion/rnscreens/y$d;->n:Lcom/swmansion/rnscreens/y$d;

    .line 26
    .line 27
    if-eq p2, p1, :cond_1

    .line 28
    .line 29
    sget-object p1, Lcom/swmansion/rnscreens/y$d;->o:Lcom/swmansion/rnscreens/y$d;

    .line 30
    .line 31
    if-ne p2, p1, :cond_2

    .line 32
    .line 33
    :cond_1
    sget-object p1, Lcom/swmansion/rnscreens/y$d;->h:Lcom/swmansion/rnscreens/y$d;

    .line 34
    .line 35
    if-eq p2, p1, :cond_2

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_2
    const/4 p1, 0x0

    .line 40
    return p1
.end method
