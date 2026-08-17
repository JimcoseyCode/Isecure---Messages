.class public final LX7/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LX7/d;

.field private final b:LX7/p;

.field private final c:Lkotlin/Lazy;

.field private final d:Lkotlin/Lazy;

.field private final e:LZ7/e;


# direct methods
.method public constructor <init>(LX7/d;LX7/p;Lkotlin/Lazy;)V
    .locals 1

    .line 1
    const-string v0, "components"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameterResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "delegateForDefaultTypeQualifiers"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LX7/k;->a:LX7/d;

    .line 20
    .line 21
    iput-object p2, p0, LX7/k;->b:LX7/p;

    .line 22
    .line 23
    iput-object p3, p0, LX7/k;->c:Lkotlin/Lazy;

    .line 24
    .line 25
    iput-object p3, p0, LX7/k;->d:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance p1, LZ7/e;

    .line 28
    .line 29
    invoke-direct {p1, p0, p2}, LZ7/e;-><init>(LX7/k;LX7/p;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, LX7/k;->e:LZ7/e;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()LX7/d;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/k;->a:LX7/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LU7/E;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/k;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU7/E;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c()Lkotlin/Lazy;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/k;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LL7/H;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/k;->a:LX7/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/d;->m()LL7/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()LB8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/k;->a:LX7/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/d;->u()LB8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f()LX7/p;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/k;->b:LX7/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()LZ7/e;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/k;->e:LZ7/e;

    .line 2
    .line 3
    return-object v0
.end method
