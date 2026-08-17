.class public final LL7/M;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL7/M$a;,
        LL7/M$b;
    }
.end annotation


# instance fields
.field private final a:LB8/n;

.field private final b:LL7/H;

.field private final c:LB8/g;

.field private final d:LB8/g;


# direct methods
.method public constructor <init>(LB8/n;LL7/H;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "module"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LL7/M;->a:LB8/n;

    .line 15
    .line 16
    iput-object p2, p0, LL7/M;->b:LL7/H;

    .line 17
    .line 18
    new-instance p2, LL7/K;

    .line 19
    .line 20
    invoke-direct {p2, p0}, LL7/K;-><init>(LL7/M;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, p2}, LB8/n;->h(Lkotlin/jvm/functions/Function1;)LB8/g;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p0, LL7/M;->c:LB8/g;

    .line 28
    .line 29
    new-instance p2, LL7/L;

    .line 30
    .line 31
    invoke-direct {p2, p0}, LL7/L;-><init>(LL7/M;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, LB8/n;->h(Lkotlin/jvm/functions/Function1;)LB8/g;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, LL7/M;->d:LB8/g;

    .line 39
    .line 40
    return-void
.end method

.method static synthetic a(LL7/M;Lk8/c;)LL7/N;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LL7/M;->e(LL7/M;Lk8/c;)LL7/N;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(LL7/M;LL7/M$a;)LL7/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LL7/M;->c(LL7/M;LL7/M$a;)LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(LL7/M;LL7/M$a;)LL7/e;
    .locals 8

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LL7/M$a;->a()Lk8/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, LL7/M$a;->b()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0}, Lk8/b;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Lk8/b;->e()Lk8/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-static {p1, v2}, Lj7/q;->Z(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0, v1, v2}, LL7/M;->d(Lk8/b;Ljava/util/List;)LL7/e;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    :goto_0
    move-object v4, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v1, p0, LL7/M;->c:LB8/g;

    .line 40
    .line 41
    invoke-virtual {v0}, Lk8/b;->f()Lk8/c;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, LL7/g;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_1
    invoke-virtual {v0}, Lk8/b;->j()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    new-instance v2, LL7/M$b;

    .line 57
    .line 58
    iget-object v3, p0, LL7/M;->a:LB8/n;

    .line 59
    .line 60
    invoke-virtual {v0}, Lk8/b;->h()Lk8/f;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-static {p1}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz p0, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    :goto_2
    move v7, p0

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    const/4 p0, 0x0

    .line 79
    goto :goto_2

    .line 80
    :goto_3
    invoke-direct/range {v2 .. v7}, LL7/M$b;-><init>(LB8/n;LL7/m;Lk8/f;ZI)V

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 85
    .line 86
    new-instance p1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v1, "Unresolved local class: "

    .line 92
    .line 93
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p0
.end method

.method private static final e(LL7/M;Lk8/c;)LL7/N;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LO7/p;

    .line 7
    .line 8
    iget-object p0, p0, LL7/M;->b:LL7/H;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, LO7/p;-><init>(LL7/H;Lk8/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public final d(Lk8/b;Ljava/util/List;)LL7/e;
    .locals 2

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParametersCount"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LL7/M;->d:LB8/g;

    .line 12
    .line 13
    new-instance v1, LL7/M$a;

    .line 14
    .line 15
    invoke-direct {v1, p1, p2}, LL7/M$a;-><init>(Lk8/b;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, LL7/e;

    .line 23
    .line 24
    return-object p1
.end method
