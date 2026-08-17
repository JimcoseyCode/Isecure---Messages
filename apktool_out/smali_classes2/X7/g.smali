.class public final LX7/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LM7/h;


# instance fields
.field private final g:LX7/k;

.field private final h:Lb8/d;

.field private final i:Z

.field private final j:LB8/h;


# direct methods
.method public constructor <init>(LX7/k;Lb8/d;Z)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LX7/g;->g:LX7/k;

    .line 3
    iput-object p2, p0, LX7/g;->h:Lb8/d;

    .line 4
    iput-boolean p3, p0, LX7/g;->i:Z

    .line 5
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    move-result-object p1

    invoke-virtual {p1}, LX7/d;->u()LB8/n;

    move-result-object p1

    new-instance p2, LX7/f;

    invoke-direct {p2, p0}, LX7/f;-><init>(LX7/g;)V

    invoke-interface {p1, p2}, LB8/n;->i(Lkotlin/jvm/functions/Function1;)LB8/h;

    move-result-object p1

    iput-object p1, p0, LX7/g;->j:LB8/h;

    return-void
.end method

.method public synthetic constructor <init>(LX7/k;Lb8/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LX7/g;-><init>(LX7/k;Lb8/d;Z)V

    return-void
.end method

.method static synthetic d(LX7/g;Lb8/a;)LM7/c;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LX7/g;->o(LX7/g;Lb8/a;)LM7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final o(LX7/g;Lb8/a;)LM7/c;
    .locals 2

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LV7/d;->a:LV7/d;

    .line 7
    .line 8
    iget-object v1, p0, LX7/g;->g:LX7/k;

    .line 9
    .line 10
    iget-boolean p0, p0, LX7/g;->i:Z

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1, p0}, LV7/d;->e(Lb8/a;LX7/k;Z)LM7/c;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public b(Lk8/c;)LM7/c;
    .locals 3

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX7/g;->h:Lb8/d;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lb8/d;->b(Lk8/c;)Lb8/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, LX7/g;->j:LB8/h;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, LM7/c;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v0

    .line 26
    :cond_1
    :goto_0
    sget-object v0, LV7/d;->a:LV7/d;

    .line 27
    .line 28
    iget-object v1, p0, LX7/g;->h:Lb8/d;

    .line 29
    .line 30
    iget-object v2, p0, LX7/g;->g:LX7/k;

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1, v2}, LV7/d;->a(Lk8/c;Lb8/d;LX7/k;)LM7/c;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
.end method

.method public h(Lk8/c;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LM7/h$b;->b(LM7/h;Lk8/c;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LX7/g;->h:Lb8/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lb8/d;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LX7/g;->h:Lb8/d;

    .line 14
    .line 15
    invoke-interface {v0}, Lb8/d;->k()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5

    .line 1
    iget-object v0, p0, LX7/g;->h:Lb8/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lb8/d;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lj7/q;->V(Ljava/lang/Iterable;)LO8/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LX7/g;->j:LB8/h;

    .line 12
    .line 13
    invoke-static {v0, v1}, LO8/l;->J(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, LV7/d;->a:LV7/d;

    .line 18
    .line 19
    sget-object v2, LI7/o$a;->y:Lk8/c;

    .line 20
    .line 21
    iget-object v3, p0, LX7/g;->h:Lb8/d;

    .line 22
    .line 23
    iget-object v4, p0, LX7/g;->g:LX7/k;

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3, v4}, LV7/d;->a(Lk8/c;Lb8/d;LX7/k;)LM7/c;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v1}, LO8/l;->N(LO8/i;Ljava/lang/Object;)LO8/i;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, LO8/l;->A(LO8/i;)LO8/i;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method
