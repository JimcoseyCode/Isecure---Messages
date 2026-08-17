.class final LC8/p$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC8/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC8/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:LD8/g;

.field private final b:Lkotlin/Lazy;

.field final synthetic c:LC8/p;


# direct methods
.method public constructor <init>(LC8/p;LD8/g;)V
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LC8/p$a;->c:LC8/p;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, LC8/p$a;->a:LD8/g;

    .line 12
    .line 13
    sget-object p2, Li7/l;->h:Li7/l;

    .line 14
    .line 15
    new-instance v0, LC8/o;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, LC8/o;-><init>(LC8/p$a;LC8/p;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2, v0}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, LC8/p$a;->b:Lkotlin/Lazy;

    .line 25
    .line 26
    return-void
.end method

.method static synthetic a(LC8/p$a;LC8/p;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LC8/p$a;->d(LC8/p$a;LC8/p;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/p$a;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final d(LC8/p$a;LC8/p;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LC8/p$a;->a:LD8/g;

    .line 2
    .line 3
    invoke-virtual {p1}, LC8/p;->v()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, LD8/h;->b(LD8/g;Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public c()Ljava/util/List;
    .locals 1

    .line 1
    invoke-direct {p0}, LC8/p$a;->b()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LC8/p$a;->c:LC8/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LC8/v;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic g()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/p$a;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LC8/p$a;->c:LC8/p;

    .line 2
    .line 3
    invoke-interface {v0}, LC8/v0;->getParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getParameters(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LC8/p$a;->c:LC8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, LC8/v;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n()LI7/i;
    .locals 2

    .line 1
    iget-object v0, p0, LC8/p$a;->c:LC8/p;

    .line 2
    .line 3
    invoke-interface {v0}, LC8/v0;->n()LI7/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getBuiltIns(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public o(LD8/g;)LC8/v0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC8/p$a;->c:LC8/p;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LC8/p;->o(LD8/g;)LC8/v0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public p()LL7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/p$a;->c:LC8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, LC8/v;->p()LL7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC8/p$a;->c:LC8/p;

    .line 2
    .line 3
    invoke-interface {v0}, LC8/v0;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/p$a;->c:LC8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
