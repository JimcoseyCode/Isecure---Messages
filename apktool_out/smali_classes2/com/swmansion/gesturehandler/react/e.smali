.class public final Lcom/swmansion/gesturehandler/react/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:Lcom/swmansion/gesturehandler/react/e;

.field private static final b:[LJ6/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/swmansion/gesturehandler/react/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/swmansion/gesturehandler/react/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/swmansion/gesturehandler/react/e;->a:Lcom/swmansion/gesturehandler/react/e;

    .line 7
    .line 8
    new-instance v0, LJ6/q$d;

    .line 9
    .line 10
    invoke-direct {v0}, LJ6/q$d;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, LJ6/B$b;

    .line 14
    .line 15
    invoke-direct {v1}, LJ6/B$b;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v2, LJ6/o$b;

    .line 19
    .line 20
    invoke-direct {v2}, LJ6/o$b;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v3, LJ6/t$b;

    .line 24
    .line 25
    invoke-direct {v3}, LJ6/t$b;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v4, LJ6/u$a;

    .line 29
    .line 30
    invoke-direct {v4}, LJ6/u$a;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v5, LJ6/x$b;

    .line 34
    .line 35
    invoke-direct {v5}, LJ6/x$b;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v6, LJ6/b$b;

    .line 39
    .line 40
    invoke-direct {v6}, LJ6/b$b;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v7, LJ6/p$a;

    .line 44
    .line 45
    invoke-direct {v7}, LJ6/p$a;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v8, LJ6/m$b;

    .line 49
    .line 50
    invoke-direct {v8}, LJ6/m$b;-><init>()V

    .line 51
    .line 52
    .line 53
    const/16 v9, 0x9

    .line 54
    .line 55
    new-array v9, v9, [LJ6/d$c;

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    aput-object v0, v9, v10

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    aput-object v1, v9, v0

    .line 62
    .line 63
    const/4 v0, 0x2

    .line 64
    aput-object v2, v9, v0

    .line 65
    .line 66
    const/4 v0, 0x3

    .line 67
    aput-object v3, v9, v0

    .line 68
    .line 69
    const/4 v0, 0x4

    .line 70
    aput-object v4, v9, v0

    .line 71
    .line 72
    const/4 v0, 0x5

    .line 73
    aput-object v5, v9, v0

    .line 74
    .line 75
    const/4 v0, 0x6

    .line 76
    aput-object v6, v9, v0

    .line 77
    .line 78
    const/4 v0, 0x7

    .line 79
    aput-object v7, v9, v0

    .line 80
    .line 81
    const/16 v0, 0x8

    .line 82
    .line 83
    aput-object v8, v9, v0

    .line 84
    .line 85
    sput-object v9, Lcom/swmansion/gesturehandler/react/e;->b:[LJ6/d$c;

    .line 86
    .line 87
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


# virtual methods
.method public final a(LJ6/d;)LJ6/d$c;
    .locals 6

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/swmansion/gesturehandler/react/e;->b:[LJ6/d$c;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, LJ6/d$c;->e()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public final b(Ljava/lang/String;)LJ6/d$c;
    .locals 5

    .line 1
    const-string v0, "handlerName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/swmansion/gesturehandler/react/e;->b:[LJ6/d$c;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, LJ6/d$c;->d()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v4, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method
