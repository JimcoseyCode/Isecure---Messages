.class public final LC8/a;
.super LC8/A;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final h:LC8/d0;

.field private final i:LC8/d0;


# direct methods
.method public constructor <init>(LC8/d0;LC8/d0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "abbreviation"

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
    iput-object p1, p0, LC8/a;->h:LC8/d0;

    .line 15
    .line 16
    iput-object p2, p0, LC8/a;->i:LC8/d0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public bridge synthetic M0(LD8/g;)LC8/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/a;->Y0(LD8/g;)LC8/a;

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
    invoke-virtual {p0, p1}, LC8/a;->X0(Z)LC8/a;

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
    invoke-virtual {p0, p1}, LC8/a;->Y0(LD8/g;)LC8/a;

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
    invoke-virtual {p0, p1}, LC8/a;->S0(LC8/r0;)LC8/d0;

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
    invoke-virtual {p0, p1}, LC8/a;->X0(Z)LC8/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public S0(LC8/r0;)LC8/d0;
    .locals 2

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/a;

    .line 7
    .line 8
    invoke-virtual {p0}, LC8/a;->T0()LC8/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1}, LC8/d0;->S0(LC8/r0;)LC8/d0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v1, p0, LC8/a;->i:LC8/d0;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, LC8/a;-><init>(LC8/d0;LC8/d0;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final T()LC8/d0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/a;->T0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected T0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/a;->h:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic U0(LD8/g;)LC8/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/a;->Y0(LD8/g;)LC8/a;

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
    invoke-virtual {p0, p1}, LC8/a;->Z0(LC8/d0;)LC8/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final W0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/a;->i:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public X0(Z)LC8/a;
    .locals 3

    .line 1
    new-instance v0, LC8/a;

    .line 2
    .line 3
    invoke-virtual {p0}, LC8/a;->T0()LC8/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, LC8/d0;->R0(Z)LC8/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LC8/a;->i:LC8/d0;

    .line 12
    .line 13
    invoke-virtual {v2, p1}, LC8/d0;->R0(Z)LC8/d0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, v1, p1}, LC8/a;-><init>(LC8/d0;LC8/d0;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public Y0(LD8/g;)LC8/a;
    .locals 4

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/a;

    .line 7
    .line 8
    invoke-virtual {p0}, LC8/a;->T0()LC8/d0;

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
    iget-object v3, p0, LC8/a;->i:LC8/d0;

    .line 24
    .line 25
    invoke-virtual {p1, v3}, LD8/g;->h(LG8/i;)LC8/S;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, LC8/d0;

    .line 33
    .line 34
    invoke-direct {v0, v1, p1}, LC8/a;-><init>(LC8/d0;LC8/d0;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public Z0(LC8/d0;)LC8/a;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/a;

    .line 7
    .line 8
    iget-object v1, p0, LC8/a;->i:LC8/d0;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, LC8/a;-><init>(LC8/d0;LC8/d0;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
