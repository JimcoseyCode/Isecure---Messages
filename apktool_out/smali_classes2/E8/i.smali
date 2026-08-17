.class public final LE8/i;
.super LC8/d0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final h:LC8/v0;

.field private final i:Lv8/k;

.field private final j:LE8/k;

.field private final k:Ljava/util/List;

.field private final l:Z

.field private final m:[Ljava/lang/String;

.field private final n:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(LC8/v0;Lv8/k;LE8/k;Ljava/util/List;Z[Ljava/lang/String;)V
    .locals 1

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, LC8/d0;-><init>()V

    .line 4
    iput-object p1, p0, LE8/i;->h:LC8/v0;

    .line 5
    iput-object p2, p0, LE8/i;->i:Lv8/k;

    .line 6
    iput-object p3, p0, LE8/i;->j:LE8/k;

    .line 7
    iput-object p4, p0, LE8/i;->k:Ljava/util/List;

    .line 8
    iput-boolean p5, p0, LE8/i;->l:Z

    .line 9
    iput-object p6, p0, LE8/i;->m:[Ljava/lang/String;

    .line 10
    sget-object p1, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    invoke-virtual {p3}, LE8/k;->j()Ljava/lang/String;

    move-result-object p1

    array-length p2, p6

    invoke-static {p6, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length p3, p2

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/i;->n:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LC8/v0;Lv8/k;LE8/k;Ljava/util/List;Z[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 1
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p5

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v6}, LE8/i;-><init>(LC8/v0;Lv8/k;LE8/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public I0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LE8/i;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public J0()LC8/r0;
    .locals 1

    .line 1
    sget-object v0, LC8/r0;->h:LC8/r0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC8/r0$a;->j()LC8/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public K0()LC8/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LE8/i;->h:LC8/v0;

    .line 2
    .line 3
    return-object v0
.end method

.method public L0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE8/i;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic M0(LD8/g;)LC8/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE8/i;->V0(LD8/g;)LE8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic O0(Z)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE8/i;->R0(Z)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic P0(LD8/g;)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE8/i;->V0(LD8/g;)LE8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic Q0(LC8/r0;)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE8/i;->S0(LC8/r0;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public R0(Z)LC8/d0;
    .locals 7

    .line 1
    new-instance v0, LE8/i;

    .line 2
    .line 3
    invoke-virtual {p0}, LE8/i;->K0()LC8/v0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, LE8/i;->o()Lv8/k;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, LE8/i;->j:LE8/k;

    .line 12
    .line 13
    invoke-virtual {p0}, LE8/i;->I0()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-object v5, p0, LE8/i;->m:[Ljava/lang/String;

    .line 18
    .line 19
    array-length v6, v5

    .line 20
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    move-object v6, v5

    .line 25
    check-cast v6, [Ljava/lang/String;

    .line 26
    .line 27
    move v5, p1

    .line 28
    invoke-direct/range {v0 .. v6}, LE8/i;-><init>(LC8/v0;Lv8/k;LE8/k;Ljava/util/List;Z[Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public S0(LC8/r0;)LC8/d0;
    .locals 1

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final T0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE8/i;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final U0()LE8/k;
    .locals 1

    .line 1
    iget-object v0, p0, LE8/i;->j:LE8/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public V0(LD8/g;)LE8/i;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final W0(Ljava/util/List;)LE8/i;
    .locals 8

    .line 1
    const-string v0, "newArguments"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE8/i;

    .line 7
    .line 8
    invoke-virtual {p0}, LE8/i;->K0()LC8/v0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, LE8/i;->o()Lv8/k;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v4, p0, LE8/i;->j:LE8/k;

    .line 17
    .line 18
    invoke-virtual {p0}, LE8/i;->L0()Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-object v0, p0, LE8/i;->m:[Ljava/lang/String;

    .line 23
    .line 24
    array-length v5, v0

    .line 25
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    move-object v7, v0

    .line 30
    check-cast v7, [Ljava/lang/String;

    .line 31
    .line 32
    move-object v5, p1

    .line 33
    invoke-direct/range {v1 .. v7}, LE8/i;-><init>(LC8/v0;Lv8/k;LE8/k;Ljava/util/List;Z[Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method

.method public o()Lv8/k;
    .locals 1

    .line 1
    iget-object v0, p0, LE8/i;->i:Lv8/k;

    .line 2
    .line 3
    return-object v0
.end method
