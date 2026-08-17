.class public final Lq8/s$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/s;
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
    invoke-direct {p0}, Lq8/s$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LC8/S;)Lq8/g;
    .locals 5

    .line 1
    const-string v0, "argumentType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LC8/W;->a(LC8/S;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    move-object v2, p1

    .line 16
    move v3, v0

    .line 17
    :goto_0
    invoke-static {v2}, LI7/i;->c0(LC8/S;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, LC8/S;->I0()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Lj7/q;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, LC8/B0;

    .line 32
    .line 33
    invoke-interface {v2}, LC8/B0;->getType()LC8/S;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v2}, LC8/S;->K0()LC8/v0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2}, LC8/v0;->p()LL7/h;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    instance-of v4, v2, LL7/e;

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    invoke-static {v2}, Ls8/e;->n(LL7/h;)Lk8/b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    new-instance v0, Lq8/s;

    .line 59
    .line 60
    new-instance v1, Lq8/s$b$a;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Lq8/s$b$a;-><init>(LC8/S;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v1}, Lq8/s;-><init>(Lq8/s$b;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_2
    new-instance p1, Lq8/s;

    .line 70
    .line 71
    invoke-direct {p1, v0, v3}, Lq8/s;-><init>(Lk8/b;I)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_3
    instance-of p1, v2, LL7/m0;

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    new-instance p1, Lq8/s;

    .line 80
    .line 81
    sget-object v1, Lk8/b;->d:Lk8/b$a;

    .line 82
    .line 83
    sget-object v2, LI7/o$a;->b:Lk8/d;

    .line 84
    .line 85
    invoke-virtual {v2}, Lk8/d;->l()Lk8/c;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const-string v3, "toSafe(...)"

    .line 90
    .line 91
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-direct {p1, v1, v0}, Lq8/s;-><init>(Lk8/b;I)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_4
    return-object v1
.end method
