.class public final LC8/g0;
.super LC8/A;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC8/K0;


# instance fields
.field private final h:LC8/d0;

.field private final i:LC8/S;


# direct methods
.method public constructor <init>(LC8/d0;LC8/S;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enhancement"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, LC8/A;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LC8/g0;->h:LC8/d0;

    .line 15
    .line 16
    iput-object p2, p0, LC8/g0;->i:LC8/S;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public bridge synthetic C0()LC8/M0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/g0;->W0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public G()LC8/S;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/g0;->i:LC8/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic M0(LD8/g;)LC8/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/g0;->X0(LD8/g;)LC8/g0;

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
    invoke-virtual {p0, p1}, LC8/g0;->R0(Z)LC8/d0;

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
    invoke-virtual {p0, p1}, LC8/g0;->X0(LD8/g;)LC8/g0;

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
    invoke-virtual {p0, p1}, LC8/g0;->S0(LC8/r0;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public R0(Z)LC8/d0;
    .locals 2

    .line 1
    invoke-virtual {p0}, LC8/g0;->W0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LC8/d0;->R0(Z)LC8/d0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LC8/g0;->G()LC8/S;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, LC8/S;->N0()LC8/M0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p1}, LC8/M0;->O0(Z)LC8/M0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {v0, p1}, LC8/L0;->d(LC8/M0;LC8/S;)LC8/M0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, LC8/d0;

    .line 31
    .line 32
    return-object p1
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
    invoke-virtual {p0}, LC8/g0;->W0()LC8/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, LC8/d0;->S0(LC8/r0;)LC8/d0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, LC8/g0;->G()LC8/S;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1, v0}, LC8/L0;->d(LC8/M0;LC8/S;)LC8/M0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, LC8/d0;

    .line 28
    .line 29
    return-object p1
.end method

.method protected T0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/g0;->h:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic U0(LD8/g;)LC8/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/g0;->X0(LD8/g;)LC8/g0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic V0(LC8/d0;)LC8/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/g0;->Y0(LC8/d0;)LC8/g0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public W0()LC8/d0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/g0;->T0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public X0(LD8/g;)LC8/g0;
    .locals 3

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/g0;

    .line 7
    .line 8
    invoke-virtual {p0}, LC8/g0;->T0()LC8/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1, v1}, LD8/g;->h(LG8/i;)LC8/S;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v1, LC8/d0;

    .line 22
    .line 23
    invoke-virtual {p0}, LC8/g0;->G()LC8/S;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1, v2}, LD8/g;->h(LG8/i;)LC8/S;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, v1, p1}, LC8/g0;-><init>(LC8/d0;LC8/S;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public Y0(LC8/d0;)LC8/g0;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/g0;

    .line 7
    .line 8
    invoke-virtual {p0}, LC8/g0;->G()LC8/S;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, p1, v1}, LC8/g0;-><init>(LC8/d0;LC8/S;)V

    .line 13
    .line 14
    .line 15
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
    const-string v1, "[@EnhancedForWarnings("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LC8/g0;->G()LC8/S;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ")] "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LC8/g0;->W0()LC8/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method
