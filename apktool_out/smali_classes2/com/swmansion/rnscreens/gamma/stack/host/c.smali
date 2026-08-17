.class public final Lcom/swmansion/rnscreens/gamma/stack/host/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a(Landroidx/fragment/app/I;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/I;->i()I

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/I;->h()I

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final b(Landroidx/fragment/app/I;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/I;->k()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/I;->j()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final c(Landroidx/fragment/app/I;ZZ)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->b(Landroidx/fragment/app/I;Z)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->a(Landroidx/fragment/app/I;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method static synthetic d(Lcom/swmansion/rnscreens/gamma/stack/host/c;Landroidx/fragment/app/I;ZZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->c(Landroidx/fragment/app/I;ZZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic g(Lcom/swmansion/rnscreens/gamma/stack/host/c;Landroidx/fragment/app/FragmentManager;Ljava/util/List;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->f(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Landroidx/fragment/app/FragmentManager;Lcom/swmansion/rnscreens/gamma/stack/host/a;)V
    .locals 7

    .line 1
    const-string v0, "fragmentManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "op"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LQ6/c;->a(Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/I;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/host/a;->d()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/host/a;->e()Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v2, p1, v0}, Landroidx/fragment/app/I;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/I;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/host/a;->b()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/host/a;->e()Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->w()Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/stack/screen/a;->getScreenKey()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v2, p1}, Landroidx/fragment/app/I;->g(Ljava/lang/String;)Landroidx/fragment/app/I;

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/host/a;->c()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v5, 0x4

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    move-object v1, p0

    .line 55
    invoke-static/range {v1 .. v6}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->d(Lcom/swmansion/rnscreens/gamma/stack/host/c;Landroidx/fragment/app/I;ZZILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final f(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Z)V
    .locals 1

    .line 1
    const-string v0, "fragmentManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ops"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/swmansion/rnscreens/gamma/stack/host/b;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p0}, Lcom/swmansion/rnscreens/gamma/stack/host/b;->a(Landroidx/fragment/app/FragmentManager;Lcom/swmansion/rnscreens/gamma/stack/host/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-eqz p3, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->e0()Z

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final h(Landroidx/fragment/app/FragmentManager;Lcom/swmansion/rnscreens/gamma/stack/host/d;)V
    .locals 1

    .line 1
    const-string v0, "fragmentManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "op"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/host/d;->b()Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->w()Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/screen/a;->getScreenKey()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/FragmentManager;->Z0(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final i(Landroidx/fragment/app/FragmentManager;Lcom/swmansion/rnscreens/gamma/stack/host/g;)V
    .locals 1

    .line 1
    const-string v0, "fragmentManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "op"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LQ6/c;->a(Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/I;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/stack/host/g;->b()Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1, p2}, Landroidx/fragment/app/I;->t(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/I;

    .line 20
    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, p2, v0}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->c(Landroidx/fragment/app/I;ZZ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
