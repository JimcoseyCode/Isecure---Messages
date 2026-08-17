.class public abstract LO7/H;
.super LO7/n;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LL7/N;


# instance fields
.field private final k:Lk8/c;

.field private final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(LL7/H;Lk8/c;)V
    .locals 3

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fqName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 12
    .line 13
    invoke-virtual {v0}, LM7/h$a;->b()LM7/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p2}, Lk8/c;->h()Lk8/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, LL7/h0;->a:LL7/h0;

    .line 22
    .line 23
    invoke-direct {p0, p1, v0, v1, v2}, LO7/n;-><init>(LL7/m;LM7/h;Lk8/f;LL7/h0;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, LO7/H;->k:Lk8/c;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "package "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p2, " of "

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, LO7/H;->l:Ljava/lang/String;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public E0(LL7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "visitor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0, p2}, LL7/o;->l(LL7/N;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public b()LL7/H;
    .locals 2

    .line 2
    invoke-super {p0}, LO7/n;->b()LL7/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LL7/H;

    return-object v0
.end method

.method public bridge synthetic b()LL7/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/H;->b()LL7/H;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lk8/c;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/H;->k:Lk8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()LL7/h0;
    .locals 2

    .line 1
    sget-object v0, LL7/h0;->a:LL7/h0;

    .line 2
    .line 3
    const-string v1, "NO_SOURCE"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/H;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
