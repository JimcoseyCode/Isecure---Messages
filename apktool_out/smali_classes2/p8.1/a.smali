.class public final Lp8/a;
.super LC8/d0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LG8/d;


# instance fields
.field private final h:LC8/B0;

.field private final i:Lp8/b;

.field private final j:Z

.field private final k:LC8/r0;


# direct methods
.method public constructor <init>(LC8/B0;Lp8/b;ZLC8/r0;)V
    .locals 1

    const-string v0, "typeProjection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, LC8/d0;-><init>()V

    .line 5
    iput-object p1, p0, Lp8/a;->h:LC8/B0;

    .line 6
    iput-object p2, p0, Lp8/a;->i:Lp8/b;

    .line 7
    iput-boolean p3, p0, Lp8/a;->j:Z

    .line 8
    iput-object p4, p0, Lp8/a;->k:LC8/r0;

    return-void
.end method

.method public synthetic constructor <init>(LC8/B0;Lp8/b;ZLC8/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    new-instance p2, Lp8/c;

    invoke-direct {p2, p1}, Lp8/c;-><init>(LC8/B0;)V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LC8/r0;->h:LC8/r0$a;

    invoke-virtual {p4}, LC8/r0$a;->j()LC8/r0;

    move-result-object p4

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lp8/a;-><init>(LC8/B0;Lp8/b;ZLC8/r0;)V

    return-void
.end method


# virtual methods
.method public I0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public J0()LC8/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/a;->k:LC8/r0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic K0()LC8/v0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp8/a;->T0()Lp8/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public L0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp8/a;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic M0(LD8/g;)LC8/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp8/a;->V0(LD8/g;)Lp8/a;

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
    invoke-virtual {p0, p1}, Lp8/a;->U0(Z)Lp8/a;

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
    invoke-virtual {p0, p1}, Lp8/a;->V0(LD8/g;)Lp8/a;

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
    invoke-virtual {p0, p1}, Lp8/a;->S0(LC8/r0;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic R0(Z)LC8/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp8/a;->U0(Z)Lp8/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public S0(LC8/r0;)LC8/d0;
    .locals 4

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp8/a;

    .line 7
    .line 8
    iget-object v1, p0, Lp8/a;->h:LC8/B0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lp8/a;->T0()Lp8/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0}, Lp8/a;->L0()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-direct {v0, v1, v2, v3, p1}, Lp8/a;-><init>(LC8/B0;Lp8/b;ZLC8/r0;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public T0()Lp8/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/a;->i:Lp8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public U0(Z)Lp8/a;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lp8/a;->L0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lp8/a;

    .line 9
    .line 10
    iget-object v1, p0, Lp8/a;->h:LC8/B0;

    .line 11
    .line 12
    invoke-virtual {p0}, Lp8/a;->T0()Lp8/b;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Lp8/a;->J0()LC8/r0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v0, v1, v2, p1, v3}, Lp8/a;-><init>(LC8/B0;Lp8/b;ZLC8/r0;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public V0(LD8/g;)Lp8/a;
    .locals 4

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp8/a;

    .line 7
    .line 8
    iget-object v1, p0, Lp8/a;->h:LC8/B0;

    .line 9
    .line 10
    invoke-interface {v1, p1}, LC8/B0;->o(LD8/g;)LC8/B0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v1, "refine(...)"

    .line 15
    .line 16
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lp8/a;->T0()Lp8/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0}, Lp8/a;->L0()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p0}, Lp8/a;->J0()LC8/r0;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {v0, p1, v1, v2, v3}, Lp8/a;-><init>(LC8/B0;Lp8/b;ZLC8/r0;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public o()Lv8/k;
    .locals 3

    .line 1
    sget-object v0, LE8/h;->h:LE8/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/String;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v2, v1}, LE8/l;->a(LE8/h;Z[Ljava/lang/String;)LE8/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Captured("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lp8/a;->h:LC8/B0;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x29

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lp8/a;->L0()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const-string v1, "?"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v1, ""

    .line 31
    .line 32
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method
