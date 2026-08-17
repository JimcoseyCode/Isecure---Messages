.class public LT/p;
.super LF/y0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final c:LT/g$a;


# direct methods
.method constructor <init>(LF/I;LT/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LF/y0;-><init>(LF/I;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LT/p;->c:LT/g$a;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic p(LT/p;Ljava/util/List;Ljava/lang/Void;)Lm5/a;
    .locals 2

    .line 1
    iget-object p2, p0, LT/p;->c:LT/g$a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, LF/h0;

    .line 9
    .line 10
    invoke-direct {p0, v1}, LT/p;->s(LF/h0;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, LF/h0;

    .line 19
    .line 20
    invoke-direct {p0, p1}, LT/p;->t(LF/h0;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-interface {p2, v1, p0}, LT/g$a;->a(II)Lm5/a;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static synthetic q(Lm5/a;Ljava/lang/Void;)Lm5/a;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, LE/j;

    .line 6
    .line 7
    invoke-interface {p0}, LE/j;->b()Lm5/a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic r(Lm5/a;LE/j;)Lm5/a;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, LE/j;

    .line 6
    .line 7
    invoke-interface {p0}, LE/j;->a()Lm5/a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private s(LF/h0;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, LF/h0;->g()LF/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, LF/h0;->j:LF/j0$a;

    .line 6
    .line 7
    const/16 v1, 0x64

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p1, v0, v1}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method private t(LF/h0;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, LF/h0;->g()LF/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, LF/h0;->i:LF/j0$a;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {p1, v0, v1}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method


# virtual methods
.method public e(Ljava/util/List;II)Lm5/a;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p3, v0, :cond_0

    .line 7
    .line 8
    move p3, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p3, 0x0

    .line 11
    :goto_0
    const-string v1, "Only support one capture config."

    .line 12
    .line 13
    invoke-static {p3, v1}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2, v0}, LF/y0;->l(II)Lm5/a;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, LJ/d;->a(Lm5/a;)LJ/d;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    new-instance v0, LT/m;

    .line 25
    .line 26
    invoke-direct {v0, p2}, LT/m;-><init>(Lm5/a;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p3, v0, v1}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    new-instance v0, LT/n;

    .line 38
    .line 39
    invoke-direct {v0, p0, p1}, LT/n;-><init>(LT/p;Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p3, v0, p1}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance p3, LT/o;

    .line 51
    .line 52
    invoke-direct {p3, p2}, LT/o;-><init>(Lm5/a;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1, p3, p2}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, LJ/n;->k(Ljava/util/Collection;)Lm5/a;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method
