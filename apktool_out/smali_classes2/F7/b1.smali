.class public LF7/b1;
.super Lkotlin/jvm/internal/E;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/E;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static k(Lkotlin/jvm/internal/c;)LF7/d0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getOwner()LC7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, LF7/d0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, LF7/d0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, LF7/k;->j:LF7/k;

    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public a(Lkotlin/jvm/internal/i;)LC7/g;
    .locals 4

    .line 1
    new-instance v0, LF7/i0;

    .line 2
    .line 3
    invoke-static {p1}, LF7/b1;->k(Lkotlin/jvm/internal/c;)LF7/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v0, v1, v2, v3, p1}, LF7/i0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public b(Ljava/lang/Class;)LC7/d;
    .locals 0

    .line 1
    invoke-static {p1}, LF7/h;->m(Ljava/lang/Class;)LF7/X;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)LC7/f;
    .locals 0

    .line 1
    invoke-static {p1}, LF7/h;->n(Ljava/lang/Class;)LC7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public d(Lkotlin/jvm/internal/o;)LC7/i;
    .locals 4

    .line 1
    new-instance v0, LF7/m0;

    .line 2
    .line 3
    invoke-static {p1}, LF7/b1;->k(Lkotlin/jvm/internal/c;)LF7/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v0, v1, v2, v3, p1}, LF7/m0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public e(Lkotlin/jvm/internal/s;)LC7/l;
    .locals 4

    .line 1
    new-instance v0, LF7/B0;

    .line 2
    .line 3
    invoke-static {p1}, LF7/b1;->k(Lkotlin/jvm/internal/c;)LF7/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v0, v1, v2, v3, p1}, LF7/B0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public f(Lkotlin/jvm/internal/u;)LC7/m;
    .locals 4

    .line 1
    new-instance v0, LF7/E0;

    .line 2
    .line 3
    invoke-static {p1}, LF7/b1;->k(Lkotlin/jvm/internal/c;)LF7/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v0, v1, v2, v3, p1}, LF7/E0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public g(Lkotlin/jvm/internal/w;)LC7/n;
    .locals 3

    .line 1
    new-instance v0, LF7/H0;

    .line 2
    .line 3
    invoke-static {p1}, LF7/b1;->k(Lkotlin/jvm/internal/c;)LF7/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, v1, v2, p1}, LF7/H0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public h(Lkotlin/jvm/internal/h;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, LE7/d;->a(Li7/c;)LC7/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, LF7/j1;->c(Ljava/lang/Object;)LF7/i0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object p1, LF7/e1;->a:LF7/e1;

    .line 14
    .line 15
    invoke-virtual {v0}, LF7/i0;->k0()LL7/z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, LF7/e1;->h(LL7/z;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-super {p0, p1}, Lkotlin/jvm/internal/E;->h(Lkotlin/jvm/internal/h;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public i(Lkotlin/jvm/internal/n;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LF7/b1;->h(Lkotlin/jvm/internal/h;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public j(LC7/e;Ljava/util/List;Z)LC7/o;
    .locals 1

    .line 1
    instance-of v0, p1, Lkotlin/jvm/internal/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lkotlin/jvm/internal/d;

    .line 6
    .line 7
    invoke-interface {p1}, Lkotlin/jvm/internal/d;->b()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, p2, p3}, LF7/h;->k(Ljava/lang/Class;Ljava/util/List;Z)LC7/o;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p1, p2, p3, v0}, LD7/d;->b(LC7/e;Ljava/util/List;ZLjava/util/List;)LC7/o;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
