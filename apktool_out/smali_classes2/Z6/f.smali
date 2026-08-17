.class public final LZ6/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LZ6/f;

.field private static final b:Ljava/util/Map;

.field private static c:Z

.field private static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZ6/f;

    .line 2
    .line 3
    invoke-direct {v0}, LZ6/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ6/f;->a:LZ6/f;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LZ6/f;->b:Ljava/util/Map;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p0}, LZ6/f;->g(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LZ6/f;->o(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LZ6/f;->s(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p0}, LZ6/f;->m(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p0}, LZ6/f;->q(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final g(Landroid/app/Activity;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LZ6/f;->a:LZ6/f;

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, LZ6/f;->h(Landroid/view/Window;)Landroidx/core/view/l1;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v0, v3}, Landroidx/core/view/p0;->c(Landroid/view/Window;Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 19
    .line 20
    .line 21
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    const/16 v6, 0x1d

    .line 25
    .line 26
    const/16 v7, 0x1b

    .line 27
    .line 28
    if-lt v4, v7, :cond_0

    .line 29
    .line 30
    invoke-direct {v1, p0}, LZ6/f;->j(Landroid/app/Activity;)Z

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    if-eqz v8, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 37
    .line 38
    .line 39
    if-lt v4, v6, :cond_4

    .line 40
    .line 41
    invoke-static {v0, v3}, Landroidx/activity/C;->a(Landroid/view/Window;Z)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v3}, Landroidx/activity/D;->a(Landroid/view/Window;Z)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_0
    invoke-direct {v1, p0}, LZ6/f;->i(Landroid/app/Activity;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-lt v4, v6, :cond_1

    .line 53
    .line 54
    move v1, v3

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    if-lt v4, v7, :cond_2

    .line 57
    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    invoke-static {}, LZ6/g;->b()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static {}, LZ6/g;->a()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 70
    .line 71
    .line 72
    if-lt v4, v7, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move p0, v3

    .line 76
    :goto_1
    invoke-virtual {v2, p0}, Landroidx/core/view/l1;->d(Z)V

    .line 77
    .line 78
    .line 79
    if-lt v4, v6, :cond_4

    .line 80
    .line 81
    invoke-static {v0, v3}, Landroidx/activity/C;->a(Landroid/view/Window;Z)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v5}, Landroidx/activity/D;->a(Landroid/view/Window;Z)V

    .line 85
    .line 86
    .line 87
    :cond_4
    :goto_2
    const/16 p0, 0x1c

    .line 88
    .line 89
    if-lt v4, p0, :cond_6

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const/16 v0, 0x1e

    .line 96
    .line 97
    if-lt v4, v0, :cond_5

    .line 98
    .line 99
    const/4 v5, 0x3

    .line 100
    :cond_5
    invoke-static {p0, v5}, Landroidx/activity/A;->a(Landroid/view/WindowManager$LayoutParams;I)V

    .line 101
    .line 102
    .line 103
    :cond_6
    return-void
.end method

.method private final h(Landroid/view/Window;)Landroidx/core/view/l1;
    .locals 2

    .line 1
    new-instance v0, Landroidx/core/view/l1;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p1, v1}, Landroidx/core/view/l1;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-virtual {v0, p1}, Landroidx/core/view/l1;->f(I)V

    .line 12
    .line 13
    .line 14
    sget-boolean p1, LZ6/f;->c:Z

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Landroidx/core/view/L0$p;->f()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {v0, p1}, Landroidx/core/view/l1;->b(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Landroidx/core/view/L0$p;->f()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {v0, p1}, Landroidx/core/view/l1;->g(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-boolean p1, LZ6/f;->d:Z

    .line 35
    .line 36
    if-ne p1, v1, :cond_1

    .line 37
    .line 38
    invoke-static {}, Landroidx/core/view/L0$p;->e()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v0, p1}, Landroidx/core/view/l1;->b(I)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    invoke-static {}, Landroidx/core/view/L0$p;->e()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v0, p1}, Landroidx/core/view/l1;->g(I)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method private final i(Landroid/app/Activity;)Z
    .locals 1

    .line 1
    sget v0, LZ6/j;->b:I

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, LZ6/f;->k(Landroid/app/Activity;I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 26
    .line 27
    and-int/lit8 p1, p1, 0x30

    .line 28
    .line 29
    const/16 v0, 0x20

    .line 30
    .line 31
    if-eq p1, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 37
    return p1
.end method

.method private final j(Landroid/app/Activity;)Z
    .locals 1

    .line 1
    sget v0, LZ6/j;->a:I

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, LZ6/f;->k(Landroid/app/Activity;I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    return p1
.end method

.method private final k(Landroid/app/Activity;I)Z
    .locals 4

    .line 1
    sget-object v0, LZ6/f;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    new-instance v2, Landroid/util/TypedValue;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-virtual {p1, p2, v2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget p1, v2, Landroid/util/TypedValue;->data:I

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x0

    .line 35
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    check-cast v2, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1
.end method

.method private static final m(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget-object v0, LZ6/f;->a:LZ6/f;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v1, "getWindow(...)"

    .line 8
    .line 9
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, LZ6/f;->h(Landroid/view/Window;)Landroidx/core/view/l1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final o(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, LZ6/f;->a:LZ6/f;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getWindow(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, LZ6/f;->h(Landroid/view/Window;)Landroidx/core/view/l1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "light-content"

    .line 17
    .line 18
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v2, "dark-content"

    .line 27
    .line 28
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-direct {v0, p0}, LZ6/f;->i(Landroid/app/Activity;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    :goto_0
    invoke-virtual {v1, p0}, Landroidx/core/view/l1;->d(Z)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private static final q(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget-object v0, LZ6/f;->a:LZ6/f;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v1, "getWindow(...)"

    .line 8
    .line 9
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, LZ6/f;->h(Landroid/view/Window;)Landroidx/core/view/l1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final s(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, LZ6/f;->a:LZ6/f;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getWindow(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, LZ6/f;->h(Landroid/view/Window;)Landroidx/core/view/l1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "light-content"

    .line 17
    .line 18
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v2, "dark-content"

    .line 27
    .line 28
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-direct {v0, p0}, LZ6/f;->i(Landroid/app/Activity;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    :goto_0
    invoke-virtual {v1, p0}, Landroidx/core/view/l1;->e(Z)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final f(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LZ6/e;

    .line 11
    .line 12
    invoke-direct {v0, p1}, LZ6/e;-><init>(Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    :goto_0
    const-string p1, "ReactNative"

    .line 20
    .line 21
    const-string v0, "RNEdgeToEdge: Ignored, current activity is null."

    .line 22
    .line 23
    invoke-static {p1, v0}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final l(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sput-boolean p2, LZ6/f;->d:Z

    .line 11
    .line 12
    new-instance p2, LZ6/a;

    .line 13
    .line 14
    invoke-direct {p2, p1}, LZ6/a;-><init>(Landroid/app/Activity;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    :goto_0
    const-string p1, "ReactNative"

    .line 22
    .line 23
    const-string p2, "RNEdgeToEdge: Ignored system bars change, current activity is null."

    .line 24
    .line 25
    invoke-static {p1, p2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final n(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v1, 0x1b

    .line 18
    .line 19
    if-lt v0, v1, :cond_1

    .line 20
    .line 21
    invoke-direct {p0, p1}, LZ6/f;->j(Landroid/app/Activity;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    new-instance v0, LZ6/c;

    .line 28
    .line 29
    invoke-direct {v0, p1, p2}, LZ6/c;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :cond_2
    :goto_0
    const-string p1, "ReactNative"

    .line 37
    .line 38
    const-string p2, "RNEdgeToEdge: Ignored system bars change, current activity is null."

    .line 39
    .line 40
    invoke-static {p1, p2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final p(Lcom/facebook/react/bridge/ReactApplicationContext;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sput-boolean p2, LZ6/f;->c:Z

    .line 11
    .line 12
    new-instance p2, LZ6/d;

    .line 13
    .line 14
    invoke-direct {p2, p1}, LZ6/d;-><init>(Landroid/app/Activity;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    :goto_0
    const-string p1, "ReactNative"

    .line 22
    .line 23
    const-string p2, "RNEdgeToEdge: Ignored system bars change, current activity is null."

    .line 24
    .line 25
    invoke-static {p1, p2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final r(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, LZ6/b;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, LZ6/b;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :goto_0
    const-string p1, "ReactNative"

    .line 25
    .line 26
    const-string p2, "RNEdgeToEdge: Ignored system bars change, current activity is null."

    .line 27
    .line 28
    invoke-static {p1, p2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
