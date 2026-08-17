.class public LV7/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW7/g;


# static fields
.field static final synthetic f:[LC7/k;


# instance fields
.field private final a:Lk8/c;

.field private final b:LL7/h0;

.field private final c:LB8/i;

.field private final d:Lb8/b;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LV7/c;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "type"

    .line 10
    .line 11
    const-string v3, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/v;-><init>(LC7/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x1

    .line 21
    new-array v1, v1, [LC7/k;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    sput-object v1, LV7/c;->f:[LC7/k;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(LX7/k;Lb8/a;Lk8/c;)V
    .locals 1

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fqName"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, LV7/c;->a:Lk8/c;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p3}, LX7/d;->t()La8/b;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-interface {p3, p2}, La8/b;->a(Lb8/l;)La8/a;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object p3, LL7/h0;->a:LL7/h0;

    .line 34
    .line 35
    const-string v0, "NO_SOURCE"

    .line 36
    .line 37
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iput-object p3, p0, LV7/c;->b:LL7/h0;

    .line 41
    .line 42
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    new-instance v0, LV7/b;

    .line 47
    .line 48
    invoke-direct {v0, p1, p0}, LV7/b;-><init>(LX7/k;LV7/c;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p3, v0}, LB8/n;->e(Lw7/a;)LB8/i;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, LV7/c;->c:LB8/i;

    .line 56
    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    invoke-interface {p2}, Lb8/a;->getArguments()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-static {p1}, Lj7/q;->f0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lb8/b;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const/4 p1, 0x0

    .line 73
    :goto_1
    iput-object p1, p0, LV7/c;->d:Lb8/b;

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    invoke-interface {p2}, Lb8/a;->e()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const/4 p3, 0x1

    .line 83
    if-ne p2, p3, :cond_2

    .line 84
    .line 85
    move p1, p3

    .line 86
    :cond_2
    iput-boolean p1, p0, LV7/c;->e:Z

    .line 87
    .line 88
    return-void
.end method

.method static synthetic b(LX7/k;LV7/c;)LC8/d0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LV7/c;->h(LX7/k;LV7/c;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h(LX7/k;LV7/c;)LC8/d0;
    .locals 0

    .line 1
    invoke-virtual {p0}, LX7/k;->d()LL7/H;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, LL7/H;->n()LI7/i;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, LV7/c;->d()Lk8/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, LI7/i;->o(Lk8/c;)LL7/e;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, LL7/e;->r()LC8/d0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "getDefaultType(...)"

    .line 22
    .line 23
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Lj7/K;->i()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected final c()Lb8/b;
    .locals 1

    .line 1
    iget-object v0, p0, LV7/c;->d:Lb8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lk8/c;
    .locals 1

    .line 1
    iget-object v0, p0, LV7/c;->a:Lk8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LV7/c;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public f()LC8/d0;
    .locals 3

    .line 1
    iget-object v0, p0, LV7/c;->c:LB8/i;

    .line 2
    .line 3
    sget-object v1, LV7/c;->f:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, LB8/m;->a(LB8/i;Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LC8/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public g()LL7/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LV7/c;->b:LL7/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getType()LC8/S;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV7/c;->f()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
